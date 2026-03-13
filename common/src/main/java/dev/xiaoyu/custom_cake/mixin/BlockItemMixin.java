package dev.xiaoyu.custom_cake.mixin;

import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.block.entity.cake.BaseCakeBlockEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockItem.class)
public class BlockItemMixin {
    
    @Inject(method = "useOn", at = @At("HEAD"), cancellable = true)
    private void customCake$useOnSweetBerries(UseOnContext context, CallbackInfoReturnable<InteractionResult> cir) {
        if (context.getLevel().isClientSide() && !context.getItemInHand().is(Items.SWEET_BERRIES)) return;
        var level = context.getLevel();
        var pos = context.getClickedPos();
        var player = context.getPlayer();

        if (level.getBlockState(pos).getBlock() == CustomCake.BASE_CAKE_BLOCK.get()) {
            level.setBlockAndUpdate(pos, CustomCake.SWEET_BERRIES_CAKE_BLOCK.get().defaultBlockState());
            
            if (level.getBlockEntity(pos) instanceof BaseCakeBlockEntity cakeEntity)
                cakeEntity.getPersistentData().putBoolean("created_by_sweet_berries", true);

            if (player != null && !player.isCreative()) context.getItemInHand().shrink(1);
            cir.setReturnValue(InteractionResult.SUCCESS);
        }
    }
}