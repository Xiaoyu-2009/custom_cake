package dev.xiaoyu.custom_cake.block.cake;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;

public class BaseCakeBlock extends CakeBlock {
    public BaseCakeBlock() {
        super(Properties.of()
            .sound(SoundType.WOOL)
            .noOcclusion());
    }

    /*@Override
    public @NotNull InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        return InteractionResult.PASS;
    }*/

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return true;
    }
}