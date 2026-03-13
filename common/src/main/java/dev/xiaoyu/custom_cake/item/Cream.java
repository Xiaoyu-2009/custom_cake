package dev.xiaoyu.custom_cake.item;

import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.block.entity.cake.BaseCakeBlockEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import org.jetbrains.annotations.NotNull;

public class Cream extends Item {
    public Cream() {
        super(new Properties());
    }
    
    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        if (context.getLevel().isClientSide()) return InteractionResult.SUCCESS;
        var level = context.getLevel();
        var pos = context.getClickedPos();
        var blockState = level.getBlockState(pos);

        if (blockState.getBlock() == CustomCake.BREAD_DOUGH_BLOCK.get()) {
            level.setBlockAndUpdate(pos, CustomCake.BASE_CAKE_BLOCK.get().defaultBlockState());
            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity cakeEntity)
                cakeEntity.getPersistentData().putBoolean("from_bread_dough", true);
            if (!context.getItemInHand().isEmpty()) context.getItemInHand().shrink(1);
        } else if (blockState.getBlock() == CustomCake.BASE_CAKE_BLOCK.get()) {
            level.setBlockAndUpdate(pos, CustomCake.BASE_CAKE_CREAM_BLOCK.get().defaultBlockState());
            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity cakeEntity)
                cakeEntity.getPersistentData().putBoolean("from_base_cake", true);
            if (!context.getItemInHand().isEmpty()) context.getItemInHand().shrink(1);
        }
        return InteractionResult.SUCCESS;
    }
}