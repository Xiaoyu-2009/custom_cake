package dev.xiaoyu.custom_cake.item;

import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.block.entity.cake.BaseCakeBlockEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.CakeBlock;
import org.jetbrains.annotations.NotNull;

public class WatermelonCrumble extends Item {
    public WatermelonCrumble() {
        super(new Properties().food(new FoodProperties.Builder()
            .build()));
    }
    
    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        if (context.getLevel().isClientSide()) return InteractionResult.SUCCESS;
        var level = context.getLevel();
        var pos = context.getClickedPos();
        var blockState = level.getBlockState(pos);

        if (blockState.getBlock() == CustomCake.BASE_CAKE_BLOCK.get() && blockState.getValue(CakeBlock.BITES) == 0) {
            level.setBlockAndUpdate(pos, CustomCake.WATERMELON_CAKE_BLOCK.get().defaultBlockState());

            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity cakeEntity)
                cakeEntity.getPersistentData().putBoolean("created_by_watermelon_crumble", true);
            
            if (!context.getItemInHand().isEmpty()) context.getItemInHand().shrink(1);
        }
        return InteractionResult.SUCCESS;
    }
    
    @Override
    public int getUseDuration(ItemStack stack) {
        return 12;
    }
}