package dev.xiaoyu.custom_cake.item;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

public class ChorusFruitCrumble extends Item {
    public ChorusFruitCrumble() {
        super(new Properties()
            .food(new FoodProperties.Builder()
                .nutrition(1)
                .saturationMod(1)
                .build()));
    }
    
    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entityLiving) {
        if (!level.isClientSide) {
            double d0 = entityLiving.getX();
            double d1 = entityLiving.getY();
            double d2 = entityLiving.getZ();

            for (int i = 0; i < 16; ++i) {
                double d3 = entityLiving.getX() + (entityLiving.getRandom().nextDouble() - 0.5d) * 16d;
                double d4 = Mth.clamp(
                    entityLiving.getY() + (double)(entityLiving.getRandom().nextInt(16) - 8),
                    level.getMinBuildHeight(),
                    level.getMinBuildHeight() + ((ServerLevel)level).getLogicalHeight() - 1
                );
                double d5 = entityLiving.getZ() + (entityLiving.getRandom().nextDouble() - 0.5d) * 16d;

                if (entityLiving.isPassenger()) entityLiving.stopRiding();

                level.gameEvent(GameEvent.TELEPORT, entityLiving.position(), GameEvent.Context.of(entityLiving));

                if (entityLiving.randomTeleport(d3, d4, d5, true)) {
                    SoundEvent soundevent = entityLiving instanceof Fox ? SoundEvents.FOX_TELEPORT : SoundEvents.CHORUS_FRUIT_TELEPORT;
                    level.playSound(null, d0, d1, d2, soundevent, SoundSource.PLAYERS, 1f, 1f);
                    entityLiving.playSound(soundevent, 1f, 1f);
                    break;
                }
            }

            if (entityLiving instanceof Player) ((Player)entityLiving).getCooldowns().addCooldown(this, 20);
        }

        return super.finishUsingItem(stack, level, entityLiving);
    }
}