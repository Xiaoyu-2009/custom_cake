package dev.xiaoyu.custom_cake.block.cake.cream;

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
import net.minecraft.world.phys.shapes.*;
import org.jetbrains.annotations.NotNull;

public class PufferfishCreamGoldenAppleCakeBlock extends CakeBlock implements EntityBlock {
    public PufferfishCreamGoldenAppleCakeBlock() {
        super(Properties.of()
            .sound(SoundType.WOOL)
            .noOcclusion());
    }
    
    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Block.box(1d + state.getValue(BITES) * 2d, 0d, 1d, 15d, 11f, 15d);
    }

    @Override
    public @NotNull InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (player.isShiftKeyDown() && !level.isClientSide()) {
            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity) {
                if (state.getValue(BITES) == 0) {
                    level.setBlockAndUpdate(pos, CustomCake.PUFFERFISH_CREAM_CAKE_BLOCK.get().defaultBlockState());
                    popResource(level, pos, CustomCake.ENCHANTED_GOLDEN_APPLE_CRUMBLE.get().getDefaultInstance());
                    return InteractionResult.SUCCESS;
                }
            }
        }
        
        InteractionResult result = super.use(state, level, pos, player, hand, hit);
        if (!level.isClientSide() && result.consumesAction()) {
            player.addEffect(new MobEffectInstance(MobEffects.HUNGER, 60, 2)); // 饥饿
            player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 60, 1)); // 反胃
            player.addEffect(new MobEffectInstance(MobEffects.POISON, 300, 1)); // 中毒
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 80, 1)); // 生命恢复
            player.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 1200, 1)); // 伤害吸收
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1200, 0)); // 抗性提升
            player.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0)); // 抗火
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