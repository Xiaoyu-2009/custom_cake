package dev.xiaoyu.custom_cake.item;

import dev.xiaoyu.custom_cake.register.BlockRegister;
import net.minecraft.world.item.*;

public class BaseCake extends BlockItem {
    public BaseCake() {
        super(BlockRegister.BASE_CAKE_BLOCK.get(), new Properties());
    }
}