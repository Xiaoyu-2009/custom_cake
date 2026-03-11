package dev.xiaoyu.custom_cake.item;

import net.minecraft.world.effect.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class RottenFleshCrumble extends Item {
    public RottenFleshCrumble() {
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
            player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 140, 0)); // 饥饿
        }
        
        return super.finishUsingItem(stack, world, entity);
    }
}