package dev.xiaoyu.custom_cake.fabric;

import dev.xiaoyu.custom_cake.CustomCake;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.*;

public final class CreativeTab {
    public static final CreativeModeTab CUSTOM_CAKE_TAB = CustomCake.CUSTOM_CAKE_TAB.get();
    
    public static void init() {
        ItemGroupEvents.modifyEntriesEvent(CustomCake.CUSTOM_CAKE_TAB.getKey()).register(entries -> {
            entries.accept(Items.CAKE);
            entries.accept(Items.DIAMOND);
            entries.accept(Items.GOLD_INGOT);
            entries.accept(Items.IRON_INGOT);
            entries.accept(Items.COAL);
        });
    }
}