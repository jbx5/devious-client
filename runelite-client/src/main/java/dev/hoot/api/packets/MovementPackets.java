package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;

public class MovementPackets {
    public static void sendMovement(int worldX, int worldY) {
        dev.hoot.api.packets.MovementPackets.sendMovement(worldX, worldY, false);
    }

    public static void sendMovement(net.runelite.api.coords.WorldPoint worldPoint, boolean run) {
        dev.hoot.api.packets.MovementPackets.sendMovement(worldPoint.getX(), worldPoint.getY(), run);
    }

    public static void sendMovement(net.runelite.api.coords.WorldPoint worldPoint) {
        dev.hoot.api.packets.MovementPackets.sendMovement(worldPoint, false);
    }

    public static void sendMovement(int worldPointX, int worldPointY, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.MOVE_GAMECLICK(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByte(5);
        packetBufferNode.getPacketBuffer().writeByte(run ? 2 : 0);
        packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointY);
        packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }
}