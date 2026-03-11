package dev.xiaoyu.custom_cake.forge.client;

import dev.xiaoyu.custom_cake.register.KeybindingRegister;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)
public final class CustomCakeForgeClient {
    
    public static void init() {
        KeybindingRegister.register();
    }
}