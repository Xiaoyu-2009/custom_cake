package dev.xiaoyu.custom_cake.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.xiaoyu.custom_cake.CustomCake;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CustomCake.MOD_ID)
public final class CustomCakeForge {

    @SuppressWarnings("removal")
    public CustomCakeForge() {
        var modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.register(this);
        EventBuses.registerModEventBus(CustomCake.MOD_ID, modEventBus);
        CustomCake.init();
        CreativeTab.init(FMLJavaModLoadingContext.get());
    }
}