package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.registries.*;
import dev.xiaoyu.custom_cake.block.*;
import dev.xiaoyu.custom_cake.block.cake.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

public final class BlockRegister {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create("custom_cake", Registries.BLOCK);
    
    // 面包胚
    public static final RegistrySupplier<Block> BREAD_DOUGH_BLOCK = BLOCK.register("bread_dough", BreadDoughBlock::new);
    
    // 基础蛋糕
    public static final RegistrySupplier<Block> BASE_CAKE_BLOCK = BLOCK.register("base_cake", BaseCakeBlock::new);
    
    // 毒马铃薯蛋糕
    public static final RegistrySupplier<Block> POISONOUS_POTATO_CAKE_BLOCK = BLOCK.register("poisonous_potato_cake", PoisonousPotatoCakeBlock::new);

    public static void init() {
        BLOCK.register();
    }
}