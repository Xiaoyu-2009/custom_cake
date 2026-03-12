package dev.xiaoyu.custom_cake.forge;

import dev.xiaoyu.custom_cake.CustomCake;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public final class CreativeTab {
    public static void init(FMLJavaModLoadingContext context) {
        context.getModEventBus().addListener((BuildCreativeModeTabContentsEvent event) -> {
            if (event.getTabKey() == CustomCake.CUSTOM_CAKE_TAB.getKey()) {
                event.accept(CustomCake.WATERMELON_CRUMBLE.get());
                event.accept(CustomCake.BEETROOT_CRUMBLE.get());
                event.accept(CustomCake.POTATO_CRUMBLE.get());
                event.accept(CustomCake.APPLE_CRUMBLE.get());
                event.accept(CustomCake.CARROT_CRUMBLE.get());
                event.accept(CustomCake.GOLDEN_CARROT_CRUMBLE.get());
                event.accept(CustomCake.ENCHANTED_GOLDEN_APPLE_CRUMBLE.get());
                event.accept(CustomCake.PUFFERFISH_CRUMBLE.get());
                event.accept(CustomCake.GOLDEN_APPLE_CRUMBLE.get());
                event.accept(CustomCake.POISONOUS_POTATO_CRUMBLE.get());
                event.accept(CustomCake.ROTTEN_FLESH_CRUMBLE.get());
                event.accept(CustomCake.CHORUS_FRUIT_CRUMBLE.get());
                event.accept(CustomCake.BREAD_DOUGH.get());
                event.accept(CustomCake.BASE_CAKE.get());
            }
        });
    }
}