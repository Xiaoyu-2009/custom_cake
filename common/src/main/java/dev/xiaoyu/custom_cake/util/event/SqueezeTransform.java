package dev.xiaoyu.custom_cake.util.event;

import dev.architectury.registry.registries.RegistrySupplier;
import dev.xiaoyu.custom_cake.CustomCake;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;

public class SqueezeTransform {
    public static int pressTime = 0;

    public static class TransformRule {
        public Item input;
        public int inputCount;
        public RegistrySupplier<Item> output;
        public int outputCount;
        public int requiredTime; 
        
        public TransformRule(Item input, int inputCount, RegistrySupplier<Item> output, int outputCount, int seconds) {
            this.input = input;
            this.inputCount = inputCount;
            this.output = output;
            this.outputCount = outputCount;
            this.requiredTime = seconds * 20;
        }
    }

    public static final TransformRule[] RULES = {
        new TransformRule(Items.MELON_SLICE, 1, CustomCake.WATERMELON_CRUMBLE, 4, 3),
        new TransformRule(Items.BEETROOT, 1, CustomCake.BEETROOT_CRUMBLE, 4, 3),
        new TransformRule(Items.POTATO, 1, CustomCake.POTATO_CRUMBLE, 4, 3),
        new TransformRule(Items.APPLE, 1, CustomCake.APPLE_CRUMBLE, 4, 3),
        new TransformRule(Items.CARROT, 1, CustomCake.CARROT_CRUMBLE, 4, 3),
        new TransformRule(Items.GOLDEN_CARROT, 1, CustomCake.GOLDEN_CARROT_CRUMBLE, 4, 5),
        new TransformRule(Items.ENCHANTED_GOLDEN_APPLE, 1, CustomCake.ENCHANTED_GOLDEN_APPLE_CRUMBLE, 4, 5),
        new TransformRule(Items.PUFFERFISH, 1, CustomCake.PUFFERFISH_CRUMBLE, 4, 3),
        new TransformRule(Items.GOLDEN_APPLE, 1, CustomCake.GOLDEN_APPLE_CRUMBLE, 4, 5),
        new TransformRule(Items.POISONOUS_POTATO, 1, CustomCake.POISONOUS_POTATO_CRUMBLE, 4, 3),
        new TransformRule(Items.ROTTEN_FLESH, 1, CustomCake.ROTTEN_FLESH_CRUMBLE, 4, 3),
        new TransformRule(Items.CHORUS_FRUIT, 1, CustomCake.CHORUS_FRUIT_CRUMBLE, 4, 3)
    };
    
    public static void tick(Player player, boolean isKeyDown) {
        if (player == null) return;
        
        ItemStack stack = player.getMainHandItem();
        TransformRule currentRule = null;
        for (TransformRule rule : RULES) {
            if (stack.getItem() == rule.input) {
                currentRule = rule;
                break;
            }
        }
        
        if (currentRule == null || !isKeyDown) {
            pressTime = 0;
            return;
        }
        
        if (stack.getCount() < currentRule.inputCount) return;
        
        pressTime++;
        if (pressTime >= currentRule.requiredTime) {
            stack.shrink(currentRule.inputCount);
            ItemStack outputStack = new ItemStack(currentRule.output.get(), currentRule.outputCount);
            player.spawnAtLocation(outputStack, 1f);
            pressTime = 0;
        }
    }
}