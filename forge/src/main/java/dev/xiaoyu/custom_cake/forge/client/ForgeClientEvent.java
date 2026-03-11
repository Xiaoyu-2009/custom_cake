package dev.xiaoyu.custom_cake.forge.client;

import dev.xiaoyu.custom_cake.forge.network.SqueezePacket;
import dev.xiaoyu.custom_cake.register.KeybindingRegister;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public class ForgeClientEvent {

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        if (Minecraft.getInstance().getConnection() == null) return;
        SqueezePacket.sendToServer(KeybindingRegister.CRUSH_KEY.isDown());
    }
}