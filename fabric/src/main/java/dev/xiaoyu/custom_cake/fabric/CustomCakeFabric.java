package dev.xiaoyu.custom_cake.fabric;

import dev.xiaoyu.custom_cake.CustomCake;
import net.fabricmc.api.ModInitializer;

public final class CustomCakeFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        CustomCake.init();
        CreativeTab.init();
    }
}