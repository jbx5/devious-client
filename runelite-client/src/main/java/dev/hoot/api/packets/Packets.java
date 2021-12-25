package dev.hoot.api.packets;
public class Packets {
    public static void queuePacket(net.runelite.api.packets.ClientPacket clientPacket, java.lang.Object... data) {
        net.runelite.api.packets.PacketWriter writer = dev.hoot.api.game.Game.getClient().getPacketWriter();
        net.runelite.api.packets.PacketBufferNode packet = dev.hoot.api.game.Game.getClient().preparePacket(clientPacket, writer.getIsaacCipher());
        for (java.lang.Object o : data) {
            if (o instanceof java.lang.Byte) {
                packet.getPacketBuffer().writeByte(((int) (o)));
                continue;
            }
            if (o instanceof java.lang.Short) {
                packet.getPacketBuffer().writeShort(((int) (o)));
                continue;
            }
            if (o instanceof java.lang.Integer) {
                packet.getPacketBuffer().writeInt(((int) (o)));
                continue;
            }
            if (o instanceof java.lang.Long) {
                packet.getPacketBuffer().writeLong(((long) (o)));
                continue;
            }
            if (o instanceof java.lang.String) {
                packet.getPacketBuffer().writeStringCp1252NullTerminated(((java.lang.String) (o)));
                continue;
            }
            // invalid data
            return;
        }
        writer.queuePacket(packet);
    }
}