package dev.xiaoyu.custom_cake.register;

import dev.architectury.registry.client.keymappings.KeyMappingRegistry;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class KeybindingRegister {
    public static KeyMapping CRUSH_KEY;
    
    public static void register() {
        CRUSH_KEY = new KeyMapping(
            "key.custom_cake.crush",
            GLFW.GLFW_MOUSE_BUTTON_LEFT,
            "key.categories.custom_cake"
        );
        KeyMappingRegistry.register(CRUSH_KEY);
    }
}