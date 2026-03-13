package dev.xiaoyu.custom_cake.item.cake;

import dev.xiaoyu.custom_cake.register.BlockRegister;
import net.minecraft.world.item.*;

public class EnchantedGoldenAppleCake extends BlockItem {
    public EnchantedGoldenAppleCake() {
        super(BlockRegister.ENCHANTED_GOLDEN_APPLE_CAKE_BLOCK.get(), new Properties().fireResistant());
    }
    
    @Override
    public boolean isFoil(ItemStack stack) {
        return true;
    }
}