package dev.xiaoyu.custom_cake.block.cake;

import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.block.entity.cake.BaseCakeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.*;
import net.minecraft.world.effect.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class PufferfishCakeBlock extends CakeBlock implements EntityBlock {
    public PufferfishCakeBlock() {
        super(Properties.of()
            .sound(SoundType.WOOL)
            .noOcclusion());
    }

    @Override
    public @NotNull InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (player.isShiftKeyDown() && !level.isClientSide()) {
            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity) {
                if (state.getValue(BITES) == 0) {
                    level.setBlockAndUpdate(pos, CustomCake.BASE_CAKE_BLOCK.get().defaultBlockState());
                    popResource(level, pos, CustomCake.PUFFERFISH_CRUMBLE.get().getDefaultInstance());
                    return InteractionResult.SUCCESS;
                }
            }
        }

        InteractionResult result = super.use(state, level, pos, player, hand, hit);
        if (!level.isClientSide() && result.consumesAction()) {
            if (state.getValue(BITES) == 0 && level.getBlockState(pos).getValue(BITES) == 1) {
                player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 60, 2)); // 饥饿
                player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1)); // 反胃
                player.addEffect(new MobEffectInstance(MobEffects.POISON, 300, 1)); // 中毒
            }
        }

        return result;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return true;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new BaseCakeBlockEntity(pos, state);
    }
}