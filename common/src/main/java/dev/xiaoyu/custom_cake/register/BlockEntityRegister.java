package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.registries.*;
import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.block.entity.cake.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;

public final class BlockEntityRegister {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(CustomCake.MOD_ID, Registries.BLOCK_ENTITY_TYPE);

    public static final RegistrySupplier<BlockEntityType<BaseCakeBlockEntity>> BASE_CAKE_BLOCK_ENTITY = BLOCK_ENTITIES.register(
        "base_cake_block_entity", () -> BlockEntityType.Builder.of(BaseCakeBlockEntity::new, Blocks.CAKE).build(null)
    );
    
    public static final RegistrySupplier<BlockEntityType<EnchantedCakeBlockEntity>> ENCHANTED_CAKE_BLOCK_ENTITY = BLOCK_ENTITIES.register(
        "enchanted_cake_block_entity", () -> BlockEntityType.Builder.of(EnchantedCakeBlockEntity::new, CustomCake.ENCHANTED_GOLDEN_APPLE_CAKE_BLOCK.get()).build(null)
    );

    public static void init() {
        BLOCK_ENTITIES.register();
    }
}