package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.registries.*;
import dev.xiaoyu.custom_cake.block.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

public final class BlockRegister {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create("custom_cake", Registries.BLOCK);
    
    // 自定义蛋糕
    public static final RegistrySupplier<Block> CUSTOM_CAKE_BLOCK = BLOCK.register("custom_cake", CustomCakeBlock::new);
    
    public static void init() {
        BLOCK.register();
    }
}