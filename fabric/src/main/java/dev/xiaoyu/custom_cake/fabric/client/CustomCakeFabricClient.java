package dev.xiaoyu.custom_cake.fabric.client;

import dev.xiaoyu.custom_cake.register.KeybindingRegister;
import net.fabricmc.api.ClientModInitializer;

public final class CustomCakeFabricClient implements ClientModInitializer {
    
    @Override
    public void onInitializeClient() {
        KeybindingRegister.register();
    }
}