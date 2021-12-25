package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;

public class TileObjectPackets {

    public static void tileObjectFirstOption(net.runelite.api.TileObject object, boolean run) {
        net.runelite.api.Point p = object.menuPoint();
        net.runelite.api.coords.LocalPoint lp = new net.runelite.api.coords.LocalPoint(p.getX(), p.getY());
        net.runelite.api.coords.WorldPoint wp = net.runelite.api.coords.WorldPoint.fromScene(dev.hoot.api.game.Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
        dev.hoot.api.packets.TileObjectPackets.queueTileObjectAction1Packet(object.getId(), wp.getX(), wp.getY(), run);
    }

    public static void tileObjectSecondOption(net.runelite.api.TileObject object, boolean run) {
        net.runelite.api.Point p = object.menuPoint();
        net.runelite.api.coords.LocalPoint lp = new net.runelite.api.coords.LocalPoint(p.getX(), p.getY());
        net.runelite.api.coords.WorldPoint wp = net.runelite.api.coords.WorldPoint.fromScene(dev.hoot.api.game.Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
        dev.hoot.api.packets.TileObjectPackets.queueTileObjectAction2Packet(object.getId(), wp.getX(), wp.getY(), run);
    }

    public static void tileObjectThirdOption(net.runelite.api.TileObject object, boolean run) {
        net.runelite.api.Point p = object.menuPoint();
        net.runelite.api.coords.LocalPoint lp = new net.runelite.api.coords.LocalPoint(p.getX(), p.getY());
        net.runelite.api.coords.WorldPoint wp = net.runelite.api.coords.WorldPoint.fromScene(dev.hoot.api.game.Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
        dev.hoot.api.packets.TileObjectPackets.queueTileObjectAction3Packet(object.getId(), wp.getX(), wp.getY(), run);
    }

    public static void tileObjectFourthOption(net.runelite.api.TileObject object, boolean run) {
        net.runelite.api.Point p = object.menuPoint();
        net.runelite.api.coords.LocalPoint lp = new net.runelite.api.coords.LocalPoint(p.getX(), p.getY());
        net.runelite.api.coords.WorldPoint wp = net.runelite.api.coords.WorldPoint.fromScene(dev.hoot.api.game.Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
        dev.hoot.api.packets.TileObjectPackets.queueTileObjectAction4Packet(object.getId(), wp.getX(), wp.getY(), run);
    }

    public static void tileObjectFifthOption(net.runelite.api.TileObject object, boolean run) {
        net.runelite.api.Point p = object.menuPoint();
        net.runelite.api.coords.LocalPoint lp = new net.runelite.api.coords.LocalPoint(p.getX(), p.getY());
        net.runelite.api.coords.WorldPoint wp = net.runelite.api.coords.WorldPoint.fromScene(dev.hoot.api.game.Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
        dev.hoot.api.packets.TileObjectPackets.queueTileObjectAction5Packet(object.getId(), wp.getX(), wp.getY(), run);
    }

    public static void tileObjectAction(net.runelite.api.TileObject object, java.lang.String action, boolean run) {
        java.util.List<java.lang.String> actions = object.getActions();
        int index = actions.indexOf(action);
        switch (index) {
            case 0 :
                dev.hoot.api.packets.TileObjectPackets.tileObjectFirstOption(object, run);
                break;
            case 1 :
                dev.hoot.api.packets.TileObjectPackets.tileObjectSecondOption(object, run);
                break;
            case 2 :
                dev.hoot.api.packets.TileObjectPackets.tileObjectThirdOption(object, run);
                break;
            case 3 :
                dev.hoot.api.packets.TileObjectPackets.tileObjectFourthOption(object, run);
                break;
            case 4 :
                dev.hoot.api.packets.TileObjectPackets.tileObjectFifthOption(object, run);
                break;
        }
    }

    public static void useItemOnTileObject(net.runelite.api.Item item, net.runelite.api.TileObject object) {
        Point p = object.menuPoint();
        LocalPoint lp = new net.runelite.api.coords.LocalPoint(p.getX(), p.getY());
        WorldPoint wp = net.runelite.api.coords.WorldPoint.fromScene(dev.hoot.api.game.Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
        queueItemUseOnTileObjectPacket(object.getId(), wp.getX(), wp.getY(), item.getSlot(), item.getId(), item.getWidgetId(),false);
    }

    public static void queueItemUseOnTileObjectPacket(int objectId, int worldPointX, int worldPointY, int itemSlot, int itemId, int itemWidgetId, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOCU(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShort(objectId);
        packetBufferNode.getPacketBuffer().writeShort(itemId);
        packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
        packetBufferNode.getPacketBuffer().writeIntLE(itemWidgetId);
        packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
        packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueSpellOnTileObjectPacket(int objectId, int worldPointX, int worldPointY, int spellWidgetId, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOCT(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAddLE(-1);
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeIntIME(spellWidgetId);
        packetBufferNode.getPacketBuffer().writeShortLE(-1);
        packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointX);
        packetBufferNode.getPacketBuffer().writeShortAddLE(objectId);
        packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointY);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueTileObjectAction1Packet(int objectId, int worldPointX, int worldPointY, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC1(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortLE(worldPointX);
        packetBufferNode.getPacketBuffer().writeShort(objectId);
        packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointY);
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueTileObjectAction2Packet(int objectId, int worldPointX, int worldPointY, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC2(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
        packetBufferNode.getPacketBuffer().writeByte(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
        packetBufferNode.getPacketBuffer().writeShortLE(objectId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueTileObjectAction3Packet(int objectId, int worldPointX, int worldPointY, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC3(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAddLE(objectId);
        packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointY);
        packetBufferNode.getPacketBuffer().writeShort(worldPointX);
        packetBufferNode.getPacketBuffer().writeByteAdd(run ? 1 : 0);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueTileObjectAction4Packet(int objectId, int worldPointX, int worldPointY, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC4(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortAddLE(objectId);
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointY);
        packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointX);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }

    public static void queueTileObjectAction5Packet(int objectId, int worldPointX, int worldPointY, boolean run) {
        Client client = Game.getClient();
        ClientPacket clientPacket = Game.getClientPacket();
        PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC5(), client.getPacketWriter().getIsaacCipher());
        packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
        packetBufferNode.getPacketBuffer().writeByteNeg(run ? 1 : 0);
        packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointX);
        packetBufferNode.getPacketBuffer().writeShortAdd(objectId);
        client.getPacketWriter().queuePacket(packetBufferNode);
    }
}