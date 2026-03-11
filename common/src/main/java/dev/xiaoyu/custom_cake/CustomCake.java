package dev.xiaoyu.custom_cake;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

public final class CustomCake {
    public static final String MOD_ID = "custom_cake";
    public static final String MODID = MOD_ID;
    
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> CUSTOM_CAKE_TAB = TABS.register("custom_cake", () ->
        CreativeTabRegistry.create(Component.translatable("itemGroup." + MOD_ID + ".custom_cake"),
            () -> new ItemStack(Items.CAKE)));

    public static void init() {
        TABS.register();
    }
}