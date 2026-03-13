package dev.xiaoyu.custom_cake.item;

import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.block.entity.cake.BaseCakeBlockEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CakeBlock;
import org.jetbrains.annotations.NotNull;

public class PoisonousPotatoCrumble extends Item {
    public PoisonousPotatoCrumble() {
        super(new Properties().food(new FoodProperties.Builder()
            .nutrition(1)
            .build()));
    }
    
    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        if (context.getLevel().isClientSide()) return InteractionResult.SUCCESS;
        var level = context.getLevel();
        var pos = context.getClickedPos();
        var blockState = level.getBlockState(pos);

        if (blockState.getBlock() == CustomCake.BASE_CAKE_BLOCK.get() && blockState.getValue(CakeBlock.BITES) == 0) {
            level.setBlockAndUpdate(pos, CustomCake.POISONOUS_POTATO_CAKE_BLOCK.get().defaultBlockState());

            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity cakeEntity)
                cakeEntity.getPersistentData().putBoolean("created_by_poisonous_crumble", true);
            
            if (!context.getItemInHand().isEmpty()) context.getItemInHand().shrink(1);
        }
        return InteractionResult.SUCCESS;
    }
    
    @Override
    public int getUseDuration(ItemStack stack) {
        return 12;
    }
    
    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (entity instanceof Player player && !world.isClientSide) {
            player.addEffect(new MobEffectInstance(MobEffects.POISON, 2*20, 0)); // 中毒
        }

        return super.finishUsingItem(stack, world, entity);
    }
}