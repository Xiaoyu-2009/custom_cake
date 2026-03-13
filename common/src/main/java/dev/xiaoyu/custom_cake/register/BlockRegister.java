package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.registries.*;
import dev.xiaoyu.custom_cake.block.*;
import dev.xiaoyu.custom_cake.block.cake.*;
import dev.xiaoyu.custom_cake.block.cake.cream.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

public final class BlockRegister {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create("custom_cake", Registries.BLOCK);
    
    // 面包胚
    public static final RegistrySupplier<Block> BREAD_DOUGH_BLOCK = BLOCK.register("bread_dough", BreadDoughBlock::new);
    
    // 基础蛋糕
    public static final RegistrySupplier<Block> BASE_CAKE_BLOCK = BLOCK.register("base_cake", BaseCakeBlock::new);

    // 奶油蛋糕
    public static final RegistrySupplier<Block> BASE_CAKE_CREAM_BLOCK = BLOCK.register("base_cake_cream", BaseCakeCreamBlock::new);
    
    // 毒马铃薯蛋糕
    public static final RegistrySupplier<Block> POISONOUS_POTATO_CAKE_BLOCK = BLOCK.register("poisonous_potato_cake", PoisonousPotatoCakeBlock::new);
    
    // 苹果蛋糕
    public static final RegistrySupplier<Block> APPLE_CAKE_BLOCK = BLOCK.register("apple_cake", AppleCakeBlock::new);
    
    // 甜菜根蛋糕
    public static final RegistrySupplier<Block> BEETROOT_CAKE_BLOCK = BLOCK.register("beetroot_cake", BeetrootCakeBlock::new);
    
    // 紫颂果蛋糕
    public static final RegistrySupplier<Block> CHORUS_FRUIT_CAKE_BLOCK = BLOCK.register("chorus_fruit_cake", ChorusFruitCakeBlock::new);
    
    // 金苹果蛋糕
    public static final RegistrySupplier<Block> GOLDEN_APPLE_CAKE_BLOCK = BLOCK.register("golden_apple_cake", GoldenAppleCakeBlock::new);
    
    // 附魔金苹果蛋糕
    public static final RegistrySupplier<Block> ENCHANTED_GOLDEN_APPLE_CAKE_BLOCK = BLOCK.register("enchanted_golden_apple_cake", EnchantedGoldenAppleCakeBlock::new);
    
    // 西瓜蛋糕
    public static final RegistrySupplier<Block> WATERMELON_CAKE_BLOCK = BLOCK.register("watermelon_cake", WatermelonCakeBlock::new);
    
    // 腐肉蛋糕
    public static final RegistrySupplier<Block> ROTTEN_FLESH_CAKE_BLOCK = BLOCK.register("rotten_flesh_cake", RottenFleshCakeBlock::new);
    
    // 河豚蛋糕
    public static final RegistrySupplier<Block> PUFFERFISH_CAKE_BLOCK = BLOCK.register("pufferfish_cake", PufferfishCakeBlock::new);
    
    // 胡萝卜蛋糕
    public static final RegistrySupplier<Block> CARROT_CAKE_BLOCK = BLOCK.register("carrot_cake", CarrotCakeBlock::new);
    
    // 金胡萝卜蛋糕
    public static final RegistrySupplier<Block> GOLDEN_CARROT_CAKE_BLOCK = BLOCK.register("golden_carrot_cake", GoldenCarrotCakeBlock::new);
    
    // 马铃薯蛋糕
    public static final RegistrySupplier<Block> POTATO_CAKE_BLOCK = BLOCK.register("potato_cake", PotatoCakeBlock::new);
    
    // 甜浆果蛋糕
    public static final RegistrySupplier<Block> SWEET_BERRIES_CAKE_BLOCK = BLOCK.register("sweet_berries_cake", SweetBerriesCakeBlock::new);

    public static void init() {
        BLOCK.register();
    }
}