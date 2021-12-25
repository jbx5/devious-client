package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;

public class DialogPackets {
    public static void sendNumberInput(int number, boolean closeDialog) {
        net.runelite.api.Client client = dev.hoot.api.game.Game.getClient();
        net.runelite.api.packets.ClientPacket clientPacket = dev.hoot.api.game.Game.getClientPacket();
        net.runelite.api.packets.PacketBufferNode var14 = dev.hoot.api.game.Game.getClient().preparePacket(clientPacket.RESUME_P_COUNTDIALOG(), client.getPacketWriter().getIsaacCipher());
        var14.getPacketBuffer().writeInt(number);
        client.getPacketWriter().queuePacket(var14);
        if (closeDialog)
            dev.hoot.api.game.GameThread.invoke(() -> dev.hoot.api.game.Game.getClient().runScript(138));

        // closes the input dialog
    }

    public static void sendNameInput(java.lang.String name) {
        net.runelite.api.Client client = dev.hoot.api.game.Game.getClient();
        net.runelite.api.packets.ClientPacket clientPacket = dev.hoot.api.game.Game.getClientPacket();
        net.runelite.api.packets.PacketBufferNode var12 = dev.hoot.api.game.Game.getClient().preparePacket(clientPacket.RESUME_P_NAMEDIALOG(), client.getPacketWriter().getIsaacCipher());
        var12.getPacketBuffer().writeByte(name.length() + 1);
        var12.getPacketBuffer().writeStringCp1252NullTerminated(name);
        client.getPacketWriter().queuePacket(var12);
        dev.hoot.api.game.GameThread.invoke(() -> dev.hoot.api.game.Game.getClient().runScript(138));
    }

    public static void sendNumberInput(int number) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.RESUME_P_COUNTDIALOG(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(number);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void sendTextInput(java.lang.String text) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.RESUME_P_STRINGDIALOG(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByte(text.length() + 1);
        packetBufferNode.getPacketBuffer().writeStringCp1252NullTerminated(text);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void closeInterface() {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.CLOSE_MODAL(), client.getPacketWriter().getIsaacCipher());
        client.getPacketWriter().queuePacket(packetBufferNode);
    }
}