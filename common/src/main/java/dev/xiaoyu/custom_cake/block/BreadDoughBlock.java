package dev.xiaoyu.custom_cake.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.*;
import org.jetbrains.annotations.NotNull;

public class BreadDoughBlock extends Block {
    public BreadDoughBlock() {
        super(Properties.of().noOcclusion());
    }
    
    @SuppressWarnings("deprecation")
    @Override
    public @NotNull VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return Block.box(1, 0, 1, 15, 5, 15);
    }
}