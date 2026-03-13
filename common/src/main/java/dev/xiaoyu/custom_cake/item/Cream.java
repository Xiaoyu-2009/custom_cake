package dev.xiaoyu.custom_cake.item;

import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.block.entity.cake.BaseCakeBlockEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.CakeBlock;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Cream extends Item {
    private static final Map<Block, Block> CAKE_UPGRADE_MAP = new LinkedHashMap<>();
    
    static {
        CAKE_UPGRADE_MAP.put(CustomCake.BREAD_DOUGH_BLOCK.get(), CustomCake.BASE_CAKE_BLOCK.get());
        CAKE_UPGRADE_MAP.put(CustomCake.BASE_CAKE_BLOCK.get(), CustomCake.BASE_CAKE_CREAM_BLOCK.get());
        CAKE_UPGRADE_MAP.put(CustomCake.BASE_CAKE_CREAM_BLOCK.get(), CustomCake.BASE_CAKE_CREAM_B_BLOCK.get());
        CAKE_UPGRADE_MAP.put(CustomCake.BASE_CAKE_CREAM_B_BLOCK.get(), CustomCake.BASE_CAKE_CREAM_C_BLOCK.get());
        CAKE_UPGRADE_MAP.put(CustomCake.BASE_CAKE_CREAM_C_BLOCK.get(), CustomCake.BASE_CAKE_CREAM_D_BLOCK.get());
        CAKE_UPGRADE_MAP.put(CustomCake.BASE_CAKE_CREAM_D_BLOCK.get(), CustomCake.BASE_CAKE_CREAM_E_BLOCK.get());
        CAKE_UPGRADE_MAP.put(CustomCake.PUFFERFISH_CAKE_BLOCK.get(), CustomCake.PUFFERFISH_CREAM_CAKE_BLOCK.get());
    }
    
    public Cream() {
        super(new Properties().food(new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(3)
            .build()));
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        if (context.getLevel().isClientSide()) return InteractionResult.SUCCESS;
        var level = context.getLevel();
        var pos = context.getClickedPos();
        var blockState = level.getBlockState(pos);
        var currentBlock = blockState.getBlock();

        if (blockState.hasProperty(CakeBlock.BITES) && blockState.getValue(CakeBlock.BITES) != 0)
            return InteractionResult.SUCCESS;

        var nextBlock = CAKE_UPGRADE_MAP.get(currentBlock);
        if (nextBlock != null) {
            level.setBlockAndUpdate(pos, nextBlock.defaultBlockState());
            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity cakeEntity)
                cakeEntity.getPersistentData().putBoolean("from_" + currentBlock.getDescriptionId().replace("block.", ""), true);
            if (!context.getItemInHand().isEmpty()) context.getItemInHand().shrink(1);
        }
        
        return InteractionResult.SUCCESS;
    }
}