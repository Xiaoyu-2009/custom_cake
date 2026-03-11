package dev.xiaoyu.custom_cake.item;

import dev.xiaoyu.custom_cake.register.BlockRegister;
import net.minecraft.world.item.*;

public class CustomCake extends BlockItem {
    public CustomCake() {
        super(BlockRegister.CUSTOM_CAKE_BLOCK.get(), new Item.Properties());
    }
}