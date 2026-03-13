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
    public static final RegistrySupplier<Block> APPLE_CAKE_BLOCK = BlockRegister.APPLE_CAKE_BLOCK;
    public static final RegistrySupplier<Block> BEETROOT_CAKE_BLOCK = BlockRegister.BEETROOT_CAKE_BLOCK;
    public static final RegistrySupplier<Block> CHORUS_FRUIT_CAKE_BLOCK = BlockRegister.CHORUS_FRUIT_CAKE_BLOCK;
    public static final RegistrySupplier<Block> GOLDEN_APPLE_CAKE_BLOCK = BlockRegister.GOLDEN_APPLE_CAKE_BLOCK;
    public static final RegistrySupplier<Block> ENCHANTED_GOLDEN_APPLE_CAKE_BLOCK = BlockRegister.ENCHANTED_GOLDEN_APPLE_CAKE_BLOCK;
    public static final RegistrySupplier<Block> WATERMELON_CAKE_BLOCK = BlockRegister.WATERMELON_CAKE_BLOCK;
    public static final RegistrySupplier<Block> BASE_CAKE_CREAM_BLOCK = BlockRegister.BASE_CAKE_CREAM_BLOCK;
    public static final RegistrySupplier<Block> BASE_CAKE_CREAM_B_BLOCK = BlockRegister.BASE_CAKE_CREAM_B_BLOCK;
    public static final RegistrySupplier<Block> BASE_CAKE_CREAM_C_BLOCK = BlockRegister.BASE_CAKE_CREAM_C_BLOCK;
    public static final RegistrySupplier<Block> BASE_CAKE_CREAM_D_BLOCK = BlockRegister.BASE_CAKE_CREAM_D_BLOCK;
    public static final RegistrySupplier<Block> BASE_CAKE_CREAM_E_BLOCK = BlockRegister.BASE_CAKE_CREAM_E_BLOCK;
    public static final RegistrySupplier<Block> ROTTEN_FLESH_CAKE_BLOCK = BlockRegister.ROTTEN_FLESH_CAKE_BLOCK;
    public static final RegistrySupplier<Block> PUFFERFISH_CAKE_BLOCK = BlockRegister.PUFFERFISH_CAKE_BLOCK;
    public static final RegistrySupplier<Block> CARROT_CAKE_BLOCK = BlockRegister.CARROT_CAKE_BLOCK;
    public static final RegistrySupplier<Block> GOLDEN_CARROT_CAKE_BLOCK = BlockRegister.GOLDEN_CARROT_CAKE_BLOCK;
    public static final RegistrySupplier<Block> POTATO_CAKE_BLOCK = BlockRegister.POTATO_CAKE_BLOCK;
    public static final RegistrySupplier<Block> SWEET_BERRIES_CAKE_BLOCK = BlockRegister.SWEET_BERRIES_CAKE_BLOCK;
    
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
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM = ItemRegister.BASE_CAKE_CREAM;
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM_B = ItemRegister.BASE_CAKE_CREAM_B;
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM_C = ItemRegister.BASE_CAKE_CREAM_C;
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM_D = ItemRegister.BASE_CAKE_CREAM_D;
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM_E = ItemRegister.BASE_CAKE_CREAM_E;
    public static final RegistrySupplier<Item> POISONOUS_POTATO_CAKE = ItemRegister.POISONOUS_POTATO_CAKE;
    public static final RegistrySupplier<Item> APPLE_CAKE = ItemRegister.APPLE_CAKE;
    public static final RegistrySupplier<Item> BEETROOT_CAKE = ItemRegister.BEETROOT_CAKE;
    public static final RegistrySupplier<Item> CHORUS_FRUIT_CAKE = ItemRegister.CHORUS_FRUIT_CAKE;
    public static final RegistrySupplier<Item> GOLDEN_APPLE_CAKE = ItemRegister.GOLDEN_APPLE_CAKE;
    public static final RegistrySupplier<Item> ENCHANTED_GOLDEN_APPLE_CAKE = ItemRegister.ENCHANTED_GOLDEN_APPLE_CAKE;
    public static final RegistrySupplier<Item> WATERMELON_CAKE = ItemRegister.WATERMELON_CAKE;
    public static final RegistrySupplier<Item> CREAM = ItemRegister.CREAM;
    public static final RegistrySupplier<Item> ROTTEN_FLESH_CAKE = ItemRegister.ROTTEN_FLESH_CAKE;
    public static final RegistrySupplier<Item> PUFFERFISH_CAKE = ItemRegister.PUFFERFISH_CAKE;
    public static final RegistrySupplier<Item> CARROT_CAKE = ItemRegister.CARROT_CAKE;
    public static final RegistrySupplier<Item> GOLDEN_CARROT_CAKE = ItemRegister.GOLDEN_CARROT_CAKE;
    public static final RegistrySupplier<Item> POTATO_CAKE = ItemRegister.POTATO_CAKE;
    public static final RegistrySupplier<Item> SWEET_BERRIES_CAKE = ItemRegister.SWEET_BERRIES_CAKE;

    public static void init() {
        BlockRegister.init();
        CreativeTabRegister.init();
        ItemRegister.init();
        BlockEntityRegister.init();
    }
}