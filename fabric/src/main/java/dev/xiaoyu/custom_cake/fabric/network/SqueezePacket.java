package dev.xiaoyu.custom_cake.fabric.network;

import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.util.event.SqueezeTransform;
import io.netty.buffer.Unpooled;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;

public class SqueezePacket {
    public static final ResourceLocation ID = new ResourceLocation(CustomCake.MOD_ID, "squeeze");
    
    public static void initServer() {
        ServerPlayNetworking.registerGlobalReceiver(ID, (server, player, handler, buf, responseSender) -> {
            boolean isKeyDown = buf.readBoolean();
            server.execute(() -> SqueezeTransform.tick(player, isKeyDown));
        });
    }
    
    public static void sendToServer(boolean isKeyDown) {
        FriendlyByteBuf buf = new FriendlyByteBuf(Unpooled.buffer());
        buf.writeBoolean(isKeyDown);
        ClientPlayNetworking.send(ID, buf);
    }
}