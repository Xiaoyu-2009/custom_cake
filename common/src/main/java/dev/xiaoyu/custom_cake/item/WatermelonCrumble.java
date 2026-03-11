package dev.xiaoyu.custom_cake.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;

public class WatermelonCrumble extends Item {
    public WatermelonCrumble() {
        super(new Properties().food(new FoodProperties.Builder()
            .build()));
    }
    
    @Override
    public int getUseDuration(ItemStack stack) {
        return 12;
    }
}