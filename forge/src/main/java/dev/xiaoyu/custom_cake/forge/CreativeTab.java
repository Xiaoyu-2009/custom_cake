package dev.xiaoyu.custom_cake.forge;

import dev.xiaoyu.custom_cake.CustomCake;
import net.minecraft.world.item.*;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public final class CreativeTab {
    public static final CreativeModeTab CUSTOM_CAKE_TAB = CustomCake.CUSTOM_CAKE_TAB.get();
    
    public static void init(FMLJavaModLoadingContext context) {
        context.getModEventBus().addListener((BuildCreativeModeTabContentsEvent event) -> {
            if (event.getTab() == CUSTOM_CAKE_TAB) {
                event.accept(Items.CAKE);
                event.accept(Items.DIAMOND);
                event.accept(Items.GOLD_INGOT);
                event.accept(Items.IRON_INGOT);
                event.accept(Items.COAL);
            }
        });
    }
}