package dev.hoot.api.packets;
import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
public class PlayerPackets {
    public static void queueItemUseOnPlayerPacket(int playerIndex, int itemId, int itemSlot, int itemWidgetId, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYERU(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteAdd(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeIntLE(itemWidgetId);
        packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
        packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
        packetBufferNode.getPacketBuffer().writeShortLE(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueSpellOnPlayerPacket(int playerIndex, int spellWidgetId, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYERT(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteAdd(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeIntLE(spellWidgetId);
        packetBufferNode.getPacketBuffer().writeShort(-1);
        packetBufferNode.getPacketBuffer().writeShortAddLE(-1);
        packetBufferNode.getPacketBuffer().writeShortAddLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction1Packet(int playerIndex, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER1(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortAddLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction2Packet(int playerIndex, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER2(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortAddLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction3Packet(int playerIndex, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER3(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAdd(playerIndex);
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction4Packet(int playerIndex, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER4(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAdd(playerIndex);
        packetBufferNode.getPacketBuffer().writeByteAdd(run ? 1 : 0);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction5Packet(int playerIndex, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER5(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShort(playerIndex);
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction6Packet(int playerIndex, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER6(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByte(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction7Packet(int playerIndex, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER7(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShort(playerIndex);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queuePlayerAction8Packet(int playerIndex, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPPLAYER8(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortLE(playerIndex);
        packetBufferNode.getPacketBuffer().writeByte(run ? 1 : 0);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }
}