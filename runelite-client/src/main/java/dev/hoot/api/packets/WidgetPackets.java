package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;

public class WidgetPackets {

    public static void widgetFirstOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction1Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetSecondOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction2Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetThirdOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction3Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetFourthOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction4Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetFifthOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction5Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetSixthOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction6Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetSeventhOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction7Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetEighthOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction8Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetNinthOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction9Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetTenthOption(net.runelite.api.widgets.Widget widget) {
        dev.hoot.api.packets.WidgetPackets.queueWidgetAction10Packet(widget.getId(), widget.getItemId(), widget.getIndex());
    }

    public static void widgetAction(net.runelite.api.widgets.Widget widget, java.lang.String action) {
        java.util.List<java.lang.String> actions = widget.getActions();
        if (actions == null) {
            return;
        }
        int index = actions.indexOf(action);
        switch (index) {
            case 0 :
                dev.hoot.api.packets.WidgetPackets.widgetFirstOption(widget);
                break;
            case 1 :
                dev.hoot.api.packets.WidgetPackets.widgetSecondOption(widget);
                break;
            case 2 :
                dev.hoot.api.packets.WidgetPackets.widgetThirdOption(widget);
                break;
            case 3 :
                dev.hoot.api.packets.WidgetPackets.widgetFourthOption(widget);
                break;
            case 4 :
                dev.hoot.api.packets.WidgetPackets.widgetFifthOption(widget);
                break;
            case 5 :
                dev.hoot.api.packets.WidgetPackets.widgetSixthOption(widget);
                break;
            case 6 :
                dev.hoot.api.packets.WidgetPackets.widgetSeventhOption(widget);
                break;
            case 7 :
                dev.hoot.api.packets.WidgetPackets.widgetEighthOption(widget);
                break;
            case 8 :
                dev.hoot.api.packets.WidgetPackets.widgetNinthOption(widget);
                break;
            case 9 :
                dev.hoot.api.packets.WidgetPackets.widgetTenthOption(widget);
                break;
        }
    }

    public static void queueWidgetAction1Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON1(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueWidgetAction2Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON2(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueWidgetAction3Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON3(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueWidgetAction4Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON4(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueWidgetAction5Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON5(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueWidgetAction6Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON5(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueWidgetAction7Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON7(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueWidgetAction8Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON8(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueWidgetAction9Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON9(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueWidgetAction10Packet(int widgetId, int itemId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON10(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(widgetId);
        packetBufferNode.getPacketBuffer().writeShort(childId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueResumePauseWidgetPacket(int widgetId, int childId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.RESUME_PAUSEBUTTON(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAdd(childId);
        packetBufferNode.getPacketBuffer().writeIntLE(widgetId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }
}