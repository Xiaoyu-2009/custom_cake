package dev.xiaoyu.custom_cake.forge.network;

import dev.xiaoyu.custom_cake.CustomCake;
import dev.xiaoyu.custom_cake.util.event.SqueezeTransform;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.*;
import net.minecraftforge.network.simple.SimpleChannel;

import java.util.function.Supplier;

public class SqueezePacket {
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel INSTANCE = NetworkRegistry.ChannelBuilder
            .named(ResourceLocation.tryBuild(CustomCake.MOD_ID, "squeeze"))
            .clientAcceptedVersions(s -> s.equals(PROTOCOL_VERSION))
            .serverAcceptedVersions(s -> s.equals(PROTOCOL_VERSION))
            .networkProtocolVersion(() -> PROTOCOL_VERSION)
            .simpleChannel();

    public static void init() {
        int id = 0;
        INSTANCE.messageBuilder(SqueezePacket.class, id++)
                .encoder(SqueezePacket::encode)
                .decoder(SqueezePacket::decode)
                .consumerMainThread(SqueezePacket::handle)
                .add();
    }

    private boolean isKeyDown;

    public SqueezePacket(boolean isKeyDown) {
        this.isKeyDown = isKeyDown;
    }

    public SqueezePacket() {
    }

    private void encode(FriendlyByteBuf buf) {
        buf.writeBoolean(isKeyDown);
    }

    private static SqueezePacket decode(FriendlyByteBuf buf) {
        SqueezePacket packet = new SqueezePacket();
        packet.isKeyDown = buf.readBoolean();
        return packet;
    }

    private void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer player = ctx.get().getSender();
            if (player != null) SqueezeTransform.tick(player, isKeyDown);
        });
        ctx.get().setPacketHandled(true);
    }

    public static void sendToServer(boolean isKeyDown) {
        INSTANCE.send(PacketDistributor.SERVER.noArg(), new SqueezePacket(isKeyDown));
    }
}