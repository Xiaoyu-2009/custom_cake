package dev.xiaoyu.custom_cake.fabric;

import dev.xiaoyu.custom_cake.CustomCake;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public final class CreativeTab {
    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(CustomCake.CUSTOM_CAKE_TAB.getKey()).register(entries -> {
            entries.accept(CustomCake.WATERMELON_CRUMBLE.get());
            entries.accept(CustomCake.BEETROOT_CRUMBLE.get());
            entries.accept(CustomCake.POTATO_CRUMBLE.get());
            entries.accept(CustomCake.APPLE_CRUMBLE.get());
            entries.accept(CustomCake.CARROT_CRUMBLE.get());
            entries.accept(CustomCake.GOLDEN_CARROT_CRUMBLE.get());
            entries.accept(CustomCake.ENCHANTED_GOLDEN_APPLE_CRUMBLE.get());
            entries.accept(CustomCake.PUFFERFISH_CRUMBLE.get());
            entries.accept(CustomCake.GOLDEN_APPLE_CRUMBLE.get());
            entries.accept(CustomCake.POISONOUS_POTATO_CRUMBLE.get());
            entries.accept(CustomCake.ROTTEN_FLESH_CRUMBLE.get());
            entries.accept(CustomCake.CHORUS_FRUIT_CRUMBLE.get());
            entries.accept(CustomCake.BREAD_DOUGH.get());
            entries.accept(CustomCake.BASE_CAKE.get());
            entries.accept(CustomCake.CREAM.get());
            entries.accept(CustomCake.POISONOUS_POTATO_CAKE.get());
            entries.accept(CustomCake.BASE_CAKE_CREAM.get());
            entries.accept(CustomCake.BASE_CAKE_CREAM_B.get());
            entries.accept(CustomCake.BASE_CAKE_CREAM_C.get());
            entries.accept(CustomCake.BASE_CAKE_CREAM_D.get());
            entries.accept(CustomCake.BASE_CAKE_CREAM_E.get());
            entries.accept(CustomCake.APPLE_CAKE.get());
            entries.accept(CustomCake.BEETROOT_CAKE.get());
            entries.accept(CustomCake.CHORUS_FRUIT_CAKE.get());
            entries.accept(CustomCake.GOLDEN_APPLE_CAKE.get());
            entries.accept(CustomCake.ENCHANTED_GOLDEN_APPLE_CAKE.get());
            entries.accept(CustomCake.WATERMELON_CAKE.get());
            entries.accept(CustomCake.ROTTEN_FLESH_CAKE.get());
            entries.accept(CustomCake.PUFFERFISH_CAKE.get());
            entries.accept(CustomCake.CARROT_CAKE.get());
            entries.accept(CustomCake.GOLDEN_CARROT_CAKE.get());
            entries.accept(CustomCake.POTATO_CAKE.get());
            entries.accept(CustomCake.SWEET_BERRIES_CAKE.get());
            entries.accept(CustomCake.PUFFERFISH_CREAM_CAKE.get());
            entries.accept(CustomCake.PUFFERFISH_CREAM_GOLDEN_APPLE_CAKE.get());
        });
    }
}