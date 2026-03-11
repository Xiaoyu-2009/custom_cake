package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.registries.*;
import dev.xiaoyu.custom_cake.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

public final class ItemRegister {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create("custom_cake", Registries.ITEM);
    
    // 西瓜碎块
    public static final RegistrySupplier<Item> WATERMELON_CRUMBLE = ITEMS.register("watermelon_crumble",
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(1).build())));
    
    // 甜菜碎块
    public static final RegistrySupplier<Item> BEETROOT_CRUMBLE = ITEMS.register("beetroot_crumble",
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(1).build())));
    
    // 马铃薯碎块
    public static final RegistrySupplier<Item> POTATO_CRUMBLE = ITEMS.register("potato_crumble",
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(1).build())));
    
    // 苹果碎块
    public static final RegistrySupplier<Item> APPLE_CRUMBLE = ITEMS.register("apple_crumble",
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(1).saturationMod(1).build())));
    
    // 胡萝卜碎块
    public static final RegistrySupplier<Item> CARROT_CRUMBLE = ITEMS.register("carrot_crumble",
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(1).build())));
    
    // 金胡萝卜碎块
    public static final RegistrySupplier<Item> GOLDEN_CARROT_CRUMBLE = ITEMS.register("golden_carrot_crumble",
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(1).saturationMod(3).build())));
    
    // 附魔金苹果碎块
    public static final RegistrySupplier<Item> ENCHANTED_GOLDEN_APPLE_CRUMBLE = ITEMS.register("enchanted_golden_apple_crumble",
        EnchantedGoldenAppleCrumble::new);
    
    // 河豚碎块
    public static final RegistrySupplier<Item> PUFFERFISH_CRUMBLE = ITEMS.register("pufferfish_crumble",
        PufferfishCrumble::new);
    
    // 金苹果碎块
    public static final RegistrySupplier<Item> GOLDEN_APPLE_CRUMBLE = ITEMS.register("golden_apple_crumble",
        GoldenAppleCrumble::new);
    
    // 毒马铃薯碎块
    public static final RegistrySupplier<Item> POISONOUS_POTATO_CRUMBLE = ITEMS.register("poisonous_potato_crumble",
        PoisonousPotatoCrumble::new);
    
    // 腐肉碎块
    public static final RegistrySupplier<Item> ROTTEN_FLESH_CRUMBLE = ITEMS.register("rotten_flesh_crumble",
        () -> new Item(new Item.Properties().food(new FoodProperties.Builder()
            .nutrition(1).build())));
    
    // 紫颂果碎块
    public static final RegistrySupplier<Item> CHORUS_FRUIT_CRUMBLE = ITEMS.register("chorus_fruit_crumble",
        ChorusFruitCrumble::new);
    
    public static void init() {
        ITEMS.register();
    }
}