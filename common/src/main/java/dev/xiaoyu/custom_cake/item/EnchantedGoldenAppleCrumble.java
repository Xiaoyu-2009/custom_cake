package dev.xiaoyu.custom_cake.item;

import net.minecraft.world.effect.*;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class EnchantedGoldenAppleCrumble extends Item {
    public EnchantedGoldenAppleCrumble() {
        super(new Properties()
            .food(new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(2)
                .alwaysEat()
                .build()));
    }
    
    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
    
    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entity) {
        if (entity instanceof Player player && !world.isClientSide) {
            // 生命恢复
            player.addEffect(new MobEffectInstance(
                MobEffects.REGENERATION,
                80,
                1
            ));
            
            // 伤害吸收
            player.addEffect(new MobEffectInstance(
                MobEffects.ABSORPTION,
                1200,
                1
            ));
            
            // 抗性提升
            player.addEffect(new MobEffectInstance(
                MobEffects.DAMAGE_RESISTANCE,
                1200,
                0
            ));
            
            // 抗火
            player.addEffect(new MobEffectInstance(
                MobEffects.FIRE_RESISTANCE,
                1200,
                0
            ));
        }

        return stack;
    }
}