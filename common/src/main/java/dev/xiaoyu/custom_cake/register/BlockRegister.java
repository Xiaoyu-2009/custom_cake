package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.registries.*;
import dev.xiaoyu.custom_cake.block.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;

public final class BlockRegister {
    public static final DeferredRegister<Block> BLOCK = DeferredRegister.create("custom_cake", Registries.BLOCK);
    
    // 面包胚
    public static final RegistrySupplier<Block> BREAD_DOUGH_BLOCK = BLOCK.register("bread_dough", BreadDoughBlock::new);

    public static void init() {
        BLOCK.register();
    }
}