package dev.xiaoyu.custom_cake.util;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;

public class TeleportUtil {
    public static void teleportEntity(Level level, LivingEntity entity) {
        double d0 = entity.getX();
        double d1 = entity.getY();
        double d2 = entity.getZ();

        for (int i = 0; i < 16; ++i) {
            double d3 = entity.getX() + (entity.getRandom().nextDouble() - 0.5d) * 16d;
            double d4 = Mth.clamp(
                entity.getY() + (double)(entity.getRandom().nextInt(16) - 8),
                level.getMinBuildHeight(),
                level.getMinBuildHeight() + ((ServerLevel)level).getLogicalHeight() - 1
            );
            double d5 = entity.getZ() + (entity.getRandom().nextDouble() - 0.5d) * 16d;

            if (entity.isPassenger()) entity.stopRiding();

            level.gameEvent(GameEvent.TELEPORT, entity.position(), GameEvent.Context.of(entity));

            if (entity.randomTeleport(d3, d4, d5, true)) {
                SoundEvent soundevent = entity instanceof Fox ? SoundEvents.FOX_TELEPORT : SoundEvents.CHORUS_FRUIT_TELEPORT;
                level.playSound(null, d0, d1, d2, soundevent, SoundSource.PLAYERS, 1f, 1f);
                entity.playSound(soundevent, 1f, 1f);
                break;
            }
        }
    }
}