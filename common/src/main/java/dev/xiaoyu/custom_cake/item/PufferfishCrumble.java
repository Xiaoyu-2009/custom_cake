package dev.xiaoyu.custom_cake.item;

import net.minecraft.world.effect.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class PufferfishCrumble extends Item {
    public PufferfishCrumble() {
        super(new Properties().food(new FoodProperties.Builder()
            .nutrition(1)
            .build()));
    }
    
    @Override
    public int getUseDuration(ItemStack stack) {
        return 12;
    }
    
    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (entity instanceof Player player && !world.isClientSide) {
            player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 60, 2)); // 饥饿
            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1)); // 反胃
            player.addEffect(new MobEffectInstance(MobEffects.POISON, 300, 1)); // 中毒
        }
        
        return super.finishUsingItem(stack, world, entity);
    }
}