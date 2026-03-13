package dev.xiaoyu.custom_cake.mixin.client;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    /*private static long ClickTime = 0;

    @Inject(method = "startAttack", at = @At("HEAD"), cancellable = true)
    private void onLeftClick(CallbackInfoReturnable<Boolean> cir) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - ClickTime < 1000) cir.cancel();
        else ClickTime = currentTime;
    }

    @Inject(method = "startUseItem", at = @At("HEAD"), cancellable = true)
    private void onRightClick(CallbackInfo cir) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - ClickTime < 1000) cir.cancel();
        else ClickTime = currentTime;
    }*/
}