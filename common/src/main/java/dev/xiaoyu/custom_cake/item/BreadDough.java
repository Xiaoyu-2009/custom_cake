package dev.xiaoyu.custom_cake.item;

import dev.xiaoyu.custom_cake.register.BlockRegister;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

public class BreadDough extends BlockItem {
    public BreadDough() {
        super(BlockRegister.BREAD_DOUGH_BLOCK.get(), new Properties().food(new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(3)
            .build()));
    }
}