package dev.xiaoyu.custom_cake.item.cake;

import dev.xiaoyu.custom_cake.register.BlockRegister;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class SweetBerriesCake extends BlockItem {
    public SweetBerriesCake() {
        super(BlockRegister.SWEET_BERRIES_CAKE_BLOCK.get(), new Properties());
    }
}