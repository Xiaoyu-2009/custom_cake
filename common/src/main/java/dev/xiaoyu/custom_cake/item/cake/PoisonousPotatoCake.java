package dev.xiaoyu.custom_cake.item.cake;

import dev.xiaoyu.custom_cake.register.BlockRegister;
import net.minecraft.world.item.*;

public class PoisonousPotatoCake extends BlockItem {
    public PoisonousPotatoCake() {
        super(BlockRegister.POISONOUS_POTATO_CAKE_BLOCK.get(), new Properties());
    }
}