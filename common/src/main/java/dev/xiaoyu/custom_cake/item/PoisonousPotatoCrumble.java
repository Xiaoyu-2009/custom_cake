package dev.xiaoyu.custom_cake.item;

import net.minecraft.world.effect.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class PoisonousPotatoCrumble extends Item {
    public PoisonousPotatoCrumble() {
        super(new Properties()
            .food(new FoodProperties.Builder()
                .nutrition(1)
                .build()));
    }
    
    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (entity instanceof Player player && !world.isClientSide) {
            // 中毒
            player.addEffect(new MobEffectInstance(
                MobEffects.POISON,
                20,
                0
            ));
        }
        
        return stack;
    }
}