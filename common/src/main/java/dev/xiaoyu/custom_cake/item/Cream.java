package dev.xiaoyu.custom_cake.item;

import dev.xiaoyu.custom_cake.CustomCake;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import org.jetbrains.annotations.NotNull;

public class Cream extends Item {
    public Cream() {
        super(new Properties());
    }
    
    @Override
    public @NotNull InteractionResult useOn(UseOnContext context) {
        if (context.getLevel().isClientSide()) return InteractionResult.SUCCESS; context.getClickedFace();
        if (context.getLevel().getBlockState(context.getClickedPos()).getBlock() == CustomCake.BREAD_DOUGH_BLOCK.get()) {
            context.getLevel().setBlockAndUpdate(context.getClickedPos(), CustomCake.BASE_CAKE_BLOCK.get().defaultBlockState());
            if (!context.getItemInHand().isEmpty()) context.getItemInHand().shrink(1);
        }
        return InteractionResult.SUCCESS;
    }
}