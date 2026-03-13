package dev.xiaoyu.custom_cake.item.cake;

import dev.xiaoyu.custom_cake.register.BlockRegister;
import net.minecraft.world.item.*;

public class AppleCake extends BlockItem {
    public AppleCake() {
        super(BlockRegister.APPLE_CAKE_BLOCK.get(), new Properties());
    }
}