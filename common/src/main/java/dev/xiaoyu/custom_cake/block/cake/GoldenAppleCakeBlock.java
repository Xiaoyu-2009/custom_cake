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

public class GoldenAppleCakeBlock extends CakeBlock implements EntityBlock {
    public GoldenAppleCakeBlock() {
        super(Properties.of()
            .sound(SoundType.WOOL)
            .noOcclusion());
    }

    @Override
    public @NotNull InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (player.isShiftKeyDown() && !level.isClientSide()) {
            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity cakeEntity) {
                if (cakeEntity.getPersistentData().getBoolean("created_by_golden_apple_crumble") && state.getValue(BITES) == 0) {
                    level.setBlockAndUpdate(pos, CustomCake.BASE_CAKE_BLOCK.get().defaultBlockState());
                    popResource(level, pos, CustomCake.GOLDEN_APPLE_CRUMBLE.get().getDefaultInstance());
                    return InteractionResult.SUCCESS;
                }
            }
        }

        InteractionResult result = super.use(state, level, pos, player, hand, hit);
        if (!level.isClientSide() && result.consumesAction()) 
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 40, 1)); // 生命恢复

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