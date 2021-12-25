package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.WidgetInfo;

public class ItemPackets {
    public static void itemAction(net.runelite.api.Item item, java.lang.String action) {
        java.util.List<java.lang.String> actions = item.getActions();
        int index = actions.indexOf(action);
        switch (index) {
            case 0 :
                dev.hoot.api.packets.ItemPackets.itemFirstOption(item);
                break;
            case 1 :
                dev.hoot.api.packets.ItemPackets.itemSecondOption(item);
                break;
            case 2 :
                dev.hoot.api.packets.ItemPackets.itemThirdOption(item);
                break;
            case 3 :
                dev.hoot.api.packets.ItemPackets.itemFourthOption(item);
                break;
            case 4 :
                dev.hoot.api.packets.ItemPackets.itemFifthOption(item);
                break;
            default :
                dev.hoot.api.packets.WidgetPackets.widgetAction(dev.hoot.api.widgets.Widgets.fromId(item.getWidgetId()), action);
                break;
        }
    }

    public static void itemFirstOption(net.runelite.api.Item item) {
        dev.hoot.api.packets.ItemPackets.queueItemAction1Packet(item.getWidgetId(), item.getId(), item.getSlot());
    }

    public static void itemSecondOption(net.runelite.api.Item item) {
        dev.hoot.api.packets.ItemPackets.queueItemAction2Packet(item.getWidgetId(), item.getId(), item.getSlot());
    }

    public static void itemThirdOption(net.runelite.api.Item item) {
        dev.hoot.api.packets.ItemPackets.queueItemAction3Packet(item.getWidgetId(), item.getId(), item.getSlot());
    }

    public static void itemFourthOption(net.runelite.api.Item item) {
        dev.hoot.api.packets.ItemPackets.queueItemAction4Packet(item.getWidgetId(), item.getId(), item.getSlot());
    }

    public static void itemFifthOption(net.runelite.api.Item item) {
        dev.hoot.api.packets.ItemPackets.queueItemAction5Packet(item.getWidgetId(), item.getId(), item.getSlot());
    }

    public static void useItemOnItem(net.runelite.api.Item item, net.runelite.api.Item item2) {
        if ((item.getType().getInventoryID() != net.runelite.api.InventoryID.INVENTORY) || (item2.getType().getInventoryID() != net.runelite.api.InventoryID.INVENTORY)) {
            return;
        }
        dev.hoot.api.packets.ItemPackets.queueItemOnItemPacket(item.getId(), item.getSlot(), item2.getId(), item2.getSlot());
    }

    public static void queueItemOnItemPacket(int sourceItemId, int sourceItemSlot, int itemId, int itemSlot) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELDU(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAdd(sourceItemSlot);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        packetBufferNode.getPacketBuffer().writeShortAdd(sourceItemId);
        packetBufferNode.getPacketBuffer().writeInt(WidgetInfo.INVENTORY.getId());
        packetBufferNode.getPacketBuffer().writeIntME(WidgetInfo.INVENTORY.getId());
        packetBufferNode.getPacketBuffer().writeShortLE(itemSlot);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueSpellOnItemPacket(int itemId, int itemSlot, int spellWidgetId) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELDT(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShort(itemSlot);
        packetBufferNode.getPacketBuffer().writeIntME(WidgetInfo.INVENTORY.getId());
        packetBufferNode.getPacketBuffer().writeShortAddLE(-1);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        packetBufferNode.getPacketBuffer().writeInt(spellWidgetId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueItemAction1Packet(int itemWidgetId, int itemId, int itemSlot) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD1(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeInt(itemWidgetId);
        packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
        packetBufferNode.getPacketBuffer().writeShortAdd(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueItemAction2Packet(int itemWidgetId, int itemId, int itemSlot) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD2(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortLE(itemId);
        packetBufferNode.getPacketBuffer().writeShortLE(itemSlot);
        packetBufferNode.getPacketBuffer().writeIntLE(itemWidgetId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueItemAction3Packet(int itemWidgetId, int itemId, int itemSlot) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD3(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
        packetBufferNode.getPacketBuffer().writeShortAdd(itemId);
        packetBufferNode.getPacketBuffer().writeInt(itemWidgetId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueItemAction4Packet(int itemWidgetId, int itemId, int itemSlot) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD4(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeIntIME(itemWidgetId);
        packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
        packetBufferNode.getPacketBuffer().writeShortLE(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueItemAction5Packet(int itemWidgetId, int itemId, int itemSlot) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD5(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeIntME(itemWidgetId);
        packetBufferNode.getPacketBuffer().writeShortAddLE(itemSlot);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }
}