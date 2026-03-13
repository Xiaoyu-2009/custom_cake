package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.registries.*;
import dev.xiaoyu.custom_cake.item.*;
import dev.xiaoyu.custom_cake.item.cake.*;
import dev.xiaoyu.custom_cake.item.cake.cream.*;
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

    // 奶油
    public static final RegistrySupplier<Item> CREAM = ITEM.register("cream", Cream::new);
    
    // 基础蛋糕
    public static final RegistrySupplier<Item> BASE_CAKE = ITEM.register("base_cake", BaseCake::new);

    // 奶油蛋糕
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM = ITEM.register("base_cake_cream", BaseCreamCake::new);
    
    // 奶油蛋糕+
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM_B = ITEM.register("base_cake_cream_b", BaseCreamBCake::new);
    
    // 奶油蛋糕++
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM_C = ITEM.register("base_cake_cream_c", BaseCreamCCake::new);
    
    // 奶油蛋糕+++
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM_D = ITEM.register("base_cake_cream_d", BaseCreamDCake::new);
    
    // 奶油蛋糕++++
    public static final RegistrySupplier<Item> BASE_CAKE_CREAM_E = ITEM.register("base_cake_cream_e", BaseCreamECake::new);
    
    // 毒马铃薯蛋糕
    public static final RegistrySupplier<Item> POISONOUS_POTATO_CAKE = ITEM.register("poisonous_potato_cake", PoisonousPotatoCake::new);
    
    // 苹果蛋糕
    public static final RegistrySupplier<Item> APPLE_CAKE = ITEM.register("apple_cake", AppleCake::new);
    
    // 甜菜根蛋糕
    public static final RegistrySupplier<Item> BEETROOT_CAKE = ITEM.register("beetroot_cake", BeetrootCake::new);
    
    // 紫颂果蛋糕
    public static final RegistrySupplier<Item> CHORUS_FRUIT_CAKE = ITEM.register("chorus_fruit_cake", ChorusFruitCake::new);
    
    // 金苹果蛋糕
    public static final RegistrySupplier<Item> GOLDEN_APPLE_CAKE = ITEM.register("golden_apple_cake", GoldenAppleCake::new);
    
    // 附魔金苹果蛋糕
    public static final RegistrySupplier<Item> ENCHANTED_GOLDEN_APPLE_CAKE = ITEM.register("enchanted_golden_apple_cake", EnchantedGoldenAppleCake::new);
    
    // 西瓜蛋糕
    public static final RegistrySupplier<Item> WATERMELON_CAKE = ITEM.register("watermelon_cake", WatermelonCake::new);
    
    // 腐肉蛋糕
    public static final RegistrySupplier<Item> ROTTEN_FLESH_CAKE = ITEM.register("rotten_flesh_cake", RottenFleshCake::new);
    
    // 河豚蛋糕
    public static final RegistrySupplier<Item> PUFFERFISH_CAKE = ITEM.register("pufferfish_cake", PufferfishCake::new);
    
    // 胡萝卜蛋糕
    public static final RegistrySupplier<Item> CARROT_CAKE = ITEM.register("carrot_cake", CarrotCake::new);
    
    // 金胡萝卜蛋糕
    public static final RegistrySupplier<Item> GOLDEN_CARROT_CAKE = ITEM.register("golden_carrot_cake", GoldenCarrotCake::new);
    
    // 马铃薯蛋糕
    public static final RegistrySupplier<Item> POTATO_CAKE = ITEM.register("potato_cake", PotatoCake::new);
    
    // 甜浆果蛋糕
    public static final RegistrySupplier<Item> SWEET_BERRIES_CAKE = ITEM.register("sweet_berries_cake", SweetBerriesCake::new);
    
    // 河豚奶油蛋糕
    public static final RegistrySupplier<Item> PUFFERFISH_CREAM_CAKE = ITEM.register("pufferfish_cream_cake", PufferfishCreamCake::new);
    
    // 河豚奶油金苹果蛋糕
    public static final RegistrySupplier<Item> PUFFERFISH_CREAM_GOLDEN_APPLE_CAKE = ITEM.register("pufferfish_cream_golden_apple_cake", PufferfishCreamGoldenAppleCake::new);

    public static void init() {
        ITEM.register();
    }
}