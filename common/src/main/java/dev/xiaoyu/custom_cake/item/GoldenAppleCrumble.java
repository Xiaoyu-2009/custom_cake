package dev.xiaoyu.custom_cake.item;

import net.minecraft.world.effect.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class GoldenAppleCrumble extends Item {
    public GoldenAppleCrumble() {
        super(new Properties()
            .food(new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(2)
                .alwaysEat()
                .build()));
    }
    
    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (entity instanceof Player player && !world.isClientSide) {
            // 生命恢复
            player.addEffect(new MobEffectInstance(
                MobEffects.REGENERATION,
                40,
                1
            ));
        }
        
        return stack;
    }
}