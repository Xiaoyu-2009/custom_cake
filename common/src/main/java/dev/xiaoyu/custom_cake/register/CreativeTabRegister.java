package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

public final class CreativeTabRegister {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create("custom_cake", Registries.CREATIVE_MODE_TAB);
    
    public static final RegistrySupplier<CreativeModeTab> CUSTOM_CAKE_TAB = TABS.register("custom_cake", () ->
        CreativeTabRegistry.create(Component.translatable("itemGroup.custom_cake.custom_cake"),
            () -> new ItemStack(Items.CAKE)));
    
    public static void init() {
        TABS.register();
    }
}