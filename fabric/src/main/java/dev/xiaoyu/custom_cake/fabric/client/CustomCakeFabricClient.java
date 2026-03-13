package dev.xiaoyu.custom_cake.fabric.client;

import dev.xiaoyu.custom_cake.fabric.client.renderer.RendererRegistry;
import dev.xiaoyu.custom_cake.fabric.network.SqueezePacket;
import dev.xiaoyu.custom_cake.register.KeybindingRegister;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.Minecraft;

public final class CustomCakeFabricClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        KeybindingRegister.register();
        RendererRegistry.register();
        
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (Minecraft.getInstance().player == null) return;
            SqueezePacket.sendToServer(KeybindingRegister.CRUSH_KEY.isDown());
        });
    }
}