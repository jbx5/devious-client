package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;

public class PlayerPackets {
    public static void queueItemUseOnPlayerPacket(int playerIndex, int itemId, int itemSlot, int itemWidgetId, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYERU(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortLE(itemId);
        packetBufferNode.getPacketBuffer().writeIntIME(itemWidgetId);
        packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortAddLE(itemSlot);
        packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueSpellOnPlayerPacket(int playerIndex, int spellWidgetId, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYERT(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeIntLE(spellWidgetId);
        packetBufferNode.getPacketBuffer().writeShort(-1);
        packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortAdd(playerIndex);
        packetBufferNode.getPacketBuffer().writeShortLE(-1);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction1Packet(int playerIndex, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER1(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction2Packet(int playerIndex, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER2(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortAddLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction3Packet(int playerIndex, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER3(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
        packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction4Packet(int playerIndex, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER4(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAdd(playerIndex);
        packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction5Packet(int playerIndex, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER5(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShort(playerIndex);
        packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 1 : 0);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }
    public static void queuePlayerAction6Packet(int playerIndex, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER7(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteNeg(ctrlDown ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }
    public static void queuePlayerAction7Packet(int playerIndex, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER7(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortAddLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction8Packet(int playerIndex, boolean ctrlDown) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER8(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }
}