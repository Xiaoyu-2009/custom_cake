package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.registries.*;
import dev.xiaoyu.custom_cake.item.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public final class ItemRegister {
    public static final DeferredRegister<Item> ITEM = DeferredRegister.create("custom_cake", Registries.ITEM);
    
    // 西瓜碎块
    public static final RegistrySupplier<Item> WATERMELON_CRUMBLE = ITEM.register("watermelon_crumble", WatermelonCrumble::new);
    
    // 甜菜碎块
    public static final RegistrySupplier<Item> BEETROOT_CRUMBLE = ITEM.register("beetroot_crumble", BeetrootCrumble::new);
    
    // 马铃薯碎块
    public static final RegistrySupplier<Item> POTATO_CRUMBLE = ITEM.register("potato_crumble", PotatoCrumble::new);
    
    // 苹果碎块
    public static final RegistrySupplier<Item> APPLE_CRUMBLE = ITEM.register("apple_crumble", AppleCrumble::new);
    
    // 胡萝卜碎块
    public static final RegistrySupplier<Item> CARROT_CRUMBLE = ITEM.register("carrot_crumble", CarrotCrumble::new);
    
    // 金胡萝卜碎块
    public static final RegistrySupplier<Item> GOLDEN_CARROT_CRUMBLE = ITEM.register("golden_carrot_crumble", GoldenCarrotCrumble::new);

    // 附魔金苹果碎块
    public static final RegistrySupplier<Item> ENCHANTED_GOLDEN_APPLE_CRUMBLE = ITEM.register("enchanted_golden_apple_crumble", EnchantedGoldenAppleCrumble::new);
    
    // 河豚碎块
    public static final RegistrySupplier<Item> PUFFERFISH_CRUMBLE = ITEM.register("pufferfish_crumble", PufferfishCrumble::new);
    
    // 金苹果碎块
    public static final RegistrySupplier<Item> GOLDEN_APPLE_CRUMBLE = ITEM.register("golden_apple_crumble", GoldenAppleCrumble::new);
    
    // 毒马铃薯碎块
    public static final RegistrySupplier<Item> POISONOUS_POTATO_CRUMBLE = ITEM.register("poisonous_potato_crumble", PoisonousPotatoCrumble::new);
    
    // 腐肉碎块
    public static final RegistrySupplier<Item> ROTTEN_FLESH_CRUMBLE = ITEM.register("rotten_flesh_crumble", RottenFleshCrumble::new);
    
    // 紫颂果碎块
    public static final RegistrySupplier<Item> CHORUS_FRUIT_CRUMBLE = ITEM.register("chorus_fruit_crumble", ChorusFruitCrumble::new);

    // 面包胚
    public static final RegistrySupplier<Item> BREAD_DOUGH = ITEM.register("bread_dough", BreadDough::new);
    
    // 基础蛋糕
    public static final RegistrySupplier<Item> BASE_CAKE = ITEM.register("base_cake", BaseCake::new);

    public static void init() {
        ITEM.register();
    }
}