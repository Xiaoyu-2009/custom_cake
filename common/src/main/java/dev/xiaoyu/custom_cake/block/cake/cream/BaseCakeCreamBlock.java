package dev.xiaoyu.custom_cake.block.cake.cream;

import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.block.entity.cake.BaseCakeBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.*;
import org.jetbrains.annotations.NotNull;

public class BaseCakeCreamBlock extends CakeBlock implements EntityBlock {
    public BaseCakeCreamBlock() {
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
            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity cakeEntity) {
                if (cakeEntity.getPersistentData().getBoolean("from_base_cake") && state.getValue(BITES) == 0) {
                    level.setBlockAndUpdate(pos, CustomCake.BASE_CAKE_BLOCK.get().defaultBlockState());
                    popResource(level, pos, CustomCake.CREAM.get().getDefaultInstance());
                    return InteractionResult.SUCCESS;
                }
            }
        }
        return super.use(state, level, pos, player, hand, hit);
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