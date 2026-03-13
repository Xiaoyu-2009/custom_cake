package dev.xiaoyu.custom_cake;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.xiaoyu.custom_cake.register.*;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;

public final class CustomCake {
    public static final String MOD_ID = "custom_cake";
    public static final String MODID = MOD_ID;
    
    public static final RegistrySupplier<CreativeModeTab> CUSTOM_CAKE_TAB = CreativeTabRegister.CUSTOM_CAKE_TAB;

    public static final RegistrySupplier<Block> BREAD_DOUGH_BLOCK = BlockRegister.BREAD_DOUGH_BLOCK;
    public static final RegistrySupplier<Block> BASE_CAKE_BLOCK = BlockRegister.BASE_CAKE_BLOCK;
    public static final RegistrySupplier<Block> POISONOUS_POTATO_CAKE_BLOCK = BlockRegister.POISONOUS_POTATO_CAKE_BLOCK;
    
    public static final RegistrySupplier<Item> BREAD_DOUGH = ItemRegister.BREAD_DOUGH;
    public static final RegistrySupplier<Item> WATERMELON_CRUMBLE = ItemRegister.WATERMELON_CRUMBLE;
    public static final RegistrySupplier<Item> BEETROOT_CRUMBLE = ItemRegister.BEETROOT_CRUMBLE;
    public static final RegistrySupplier<Item> POTATO_CRUMBLE = ItemRegister.POTATO_CRUMBLE;
    public static final RegistrySupplier<Item> APPLE_CRUMBLE = ItemRegister.APPLE_CRUMBLE;
    public static final RegistrySupplier<Item> CARROT_CRUMBLE = ItemRegister.CARROT_CRUMBLE;
    public static final RegistrySupplier<Item> GOLDEN_CARROT_CRUMBLE = ItemRegister.GOLDEN_CARROT_CRUMBLE;
    public static final RegistrySupplier<Item> ENCHANTED_GOLDEN_APPLE_CRUMBLE = ItemRegister.ENCHANTED_GOLDEN_APPLE_CRUMBLE;
    public static final RegistrySupplier<Item> PUFFERFISH_CRUMBLE = ItemRegister.PUFFERFISH_CRUMBLE;
    public static final RegistrySupplier<Item> GOLDEN_APPLE_CRUMBLE = ItemRegister.GOLDEN_APPLE_CRUMBLE;
    public static final RegistrySupplier<Item> POISONOUS_POTATO_CRUMBLE = ItemRegister.POISONOUS_POTATO_CRUMBLE;
    public static final RegistrySupplier<Item> ROTTEN_FLESH_CRUMBLE = ItemRegister.ROTTEN_FLESH_CRUMBLE;
    public static final RegistrySupplier<Item> CHORUS_FRUIT_CRUMBLE = ItemRegister.CHORUS_FRUIT_CRUMBLE;
    public static final RegistrySupplier<Item> BASE_CAKE = ItemRegister.BASE_CAKE;
    public static final RegistrySupplier<Item> POISONOUS_POTATO_CAKE = ItemRegister.POISONOUS_POTATO_CAKE;
    public static final RegistrySupplier<Item> CREAM = ItemRegister.CREAM;

    public static void init() {
        BlockRegister.init();
        CreativeTabRegister.init();
        ItemRegister.init();
        BlockEntityRegister.init();
    }
}