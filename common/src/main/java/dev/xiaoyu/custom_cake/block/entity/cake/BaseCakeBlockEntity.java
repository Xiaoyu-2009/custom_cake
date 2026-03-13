package dev.xiaoyu.custom_cake.block.entity.cake;

import dev.xiaoyu.custom_cake.register.BlockEntityRegister;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class BaseCakeBlockEntity extends BlockEntity {
    private final CompoundTag persistentData = new CompoundTag();
    
    public BaseCakeBlockEntity(BlockPos pos, BlockState state) {
        super(BlockEntityRegister.BASE_CAKE_BLOCK_ENTITY.get(), pos, state);
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        tag.put("PersistentData", persistentData);
        super.saveAdditional(tag);
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        if (tag.contains("PersistentData"))
            persistentData.merge(tag.getCompound("PersistentData"));
    }

    public CompoundTag getPersistentData() {
        return persistentData;
    }

    @Override
    public @NotNull CompoundTag getUpdateTag() {
        return saveWithoutMetadata();
    }

    @Override
    public ClientboundBlockEntityDataPacket getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }
}