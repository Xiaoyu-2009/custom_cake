package dev.xiaoyu.custom_cake.item.cake;

import dev.xiaoyu.custom_cake.register.BlockRegister;
import net.minecraft.world.item.*;

public class PotatoCake extends BlockItem {
    public PotatoCake() {
        super(BlockRegister.POTATO_CAKE_BLOCK.get(), new Properties());
    }
}