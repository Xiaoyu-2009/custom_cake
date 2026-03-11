package dev.xiaoyu.custom_cake.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

public class CarrotCrumble extends Item {
    public CarrotCrumble() {
        super(new Properties().food(new FoodProperties.Builder()
            .nutrition(1)
            .build()));
    }
    
    @Override
    public int getUseDuration(ItemStack stack) {
        return 12;
    }
}