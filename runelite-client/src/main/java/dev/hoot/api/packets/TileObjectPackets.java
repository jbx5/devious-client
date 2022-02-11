package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;

import java.util.List;

public class TileObjectPackets
{
	public static void tileObjectFirstOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
		TileObjectPackets.queueTileObjectAction1Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectSecondOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
		TileObjectPackets.queueTileObjectAction2Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectThirdOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
		TileObjectPackets.queueTileObjectAction3Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectFourthOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
		TileObjectPackets.queueTileObjectAction4Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectFifthOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
		TileObjectPackets.queueTileObjectAction5Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectAction(TileObject object, String action, boolean ctrlDown)
	{
		List<String> actions = object.getActions();
		int index = actions.indexOf(action);
		switch (index)
		{
			case 0:
				TileObjectPackets.tileObjectFirstOption(object, ctrlDown);
				break;
			case 1:
				TileObjectPackets.tileObjectSecondOption(object, ctrlDown);
				break;
			case 2:
				TileObjectPackets.tileObjectThirdOption(object, ctrlDown);
				break;
			case 3:
				TileObjectPackets.tileObjectFourthOption(object, ctrlDown);
				break;
			case 4:
				TileObjectPackets.tileObjectFifthOption(object, ctrlDown);
				break;
		}
	}

	public static void useItemOnTileObject(Item item, TileObject object)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Game.getClient(), lp.getX(), lp.getY(), object.getPlane());
		TileObjectPackets.queueItemUseOnTileObjectPacket(object.getId(), wp.getX(), wp.getY(), item.getSlot(), item.getId(), item.getWidgetId(), false);
	}

	public static void queueItemUseOnTileObjectPacket(int objectId, int worldPointX, int worldPointY, int itemSlot, int itemId, int itemWidgetId, boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOCU(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAdd(objectId);
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortLE(itemSlot);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointY);
		packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeIntME(itemWidgetId);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void queueSpellOnTileObjectPacket(int objectId, int worldPointX, int worldPointY, int spellWidgetId, boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOCT(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		packetBufferNode.getPacketBuffer().writeInt(spellWidgetId);
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortLE(-1);
		packetBufferNode.getPacketBuffer().writeShortAddLE(-1);
		packetBufferNode.getPacketBuffer().writeShort(objectId);
		packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void queueTileObjectAction1Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC1(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeShort(objectId);
		packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void queueTileObjectAction2Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC2(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortAdd(objectId);
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 1 : 0);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void queueTileObjectAction3Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC3(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShortLE(objectId);
		packetBufferNode.getPacketBuffer().writeShort(worldPointX);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void queueTileObjectAction4Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC4(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		packetBufferNode.getPacketBuffer().writeShortLE(objectId);
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void queueTileObjectAction5Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPLOC5(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointX);
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		packetBufferNode.getPacketBuffer().writeShort(objectId);
		packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}
}