package net.unethicalite.api.packets;

import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Item;
import net.runelite.api.Point;
import net.runelite.api.TileObject;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.packets.PacketBufferNode;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;

@Slf4j
public class ObjectPackets
{
	public static void tileObjectFirstOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Static.getClient(), lp.getX(), lp.getY(), object.getPlane());
		queueTileObjectAction1Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectSecondOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Static.getClient(), lp.getX(), lp.getY(), object.getPlane());
		queueTileObjectAction2Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectThirdOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Static.getClient(), lp.getX(), lp.getY(), object.getPlane());
		queueTileObjectAction3Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectFourthOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Static.getClient(), lp.getX(), lp.getY(), object.getPlane());
		queueTileObjectAction4Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectFifthOption(TileObject object, boolean ctrlDown)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Static.getClient(), lp.getX(), lp.getY(), object.getPlane());
		queueTileObjectAction5Packet(object.getId(), wp.getX(), wp.getY(), ctrlDown);
	}

	public static void tileObjectAction(TileObject object, String action, boolean ctrlDown)
	{
		int index = object.getActionIndex(action);
		switch (index)
		{
			case 0:
				tileObjectFirstOption(object, ctrlDown);
				break;
			case 1:
				tileObjectSecondOption(object, ctrlDown);
				break;
			case 2:
				tileObjectThirdOption(object, ctrlDown);
				break;
			case 3:
				tileObjectFourthOption(object, ctrlDown);
				break;
			case 4:
				tileObjectFifthOption(object, ctrlDown);
				break;
		}
	}

	public static void useItemOnTileObject(Item item, TileObject object)
	{
		Point p = object.menuPoint();
		LocalPoint lp = new LocalPoint(p.getX(), p.getY());
		WorldPoint wp = WorldPoint.fromScene(Static.getClient(), lp.getX(), lp.getY(), object.getPlane());
		queueItemUseOnTileObjectPacket(object.getId(), wp.getX(), wp.getY(), item.getSlot(), item.getId(), item.getWidgetId(), false);
	}

	public static void queueItemUseOnTileObjectPacket(int objectId, int worldPointX, int worldPointY, int itemSlot, int itemId, int itemWidgetId, boolean ctrlDown)
	{
		createItemOnObjectPacket(objectId, worldPointX, worldPointY, itemSlot, itemId, itemWidgetId, ctrlDown).send();
	}

	public static void queueSpellOnTileObjectPacket(int objectId, int worldPointX, int worldPointY, int spellWidgetId, boolean ctrlDown)
	{
		createSpellOnObjectPacket(objectId, worldPointX, worldPointY, spellWidgetId, ctrlDown).send();
	}

	public static void queueTileObjectAction1Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createObjectFirstActionPacket(objectId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static void queueTileObjectAction2Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createObjectSecondActionPacket(objectId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static void queueTileObjectAction3Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createObjectThirdActionPacket(objectId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static void queueTileObjectAction4Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createObjectFourthActionPacket(objectId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static void queueTileObjectAction5Packet(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createObjectFifthActionPacket(objectId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static PacketBufferNode createItemOnObjectPacket(int objectId, int worldPointX, int worldPointY, int itemSlot, int itemId, int itemWidgetId, boolean ctrlDown)
	{
		return createWidgetOnObjectPacket(objectId, worldPointX, worldPointY, itemSlot, itemId, itemWidgetId, ctrlDown);
	}

	public static PacketBufferNode createWidgetOnObjectPacket(int objectId, int worldPointX, int worldPointY, int sourceSlot, int sourceItemId, int sourceWidgetId, boolean ctrlDown)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.OPLOCT(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeShortAddLE(sourceItemId);
		packetBufferNode.getPacketBuffer().writeIntIME(sourceWidgetId);
		packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShort(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortLE(objectId);
		packetBufferNode.getPacketBuffer().writeShort(sourceSlot);
		return packetBufferNode;
	}

	public static PacketBufferNode createSpellOnObjectPacket(int objectId, int worldPointX, int worldPointY, int spellWidgetId, boolean ctrlDown)
	{
		return createWidgetOnObjectPacket(objectId, worldPointX, worldPointY, -1, -1, spellWidgetId, ctrlDown);
	}

	public static PacketBufferNode createObjectFirstActionPacket(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.OPLOC1(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortLE(objectId);
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		return packetBufferNode;
	}

	public static PacketBufferNode createObjectSecondActionPacket(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.OPLOC2(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAdd(objectId);
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		packetBufferNode.getPacketBuffer().writeByteNeg(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}

	public static PacketBufferNode createObjectThirdActionPacket(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.OPLOC3(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortLE(objectId);
		return packetBufferNode;
	}

	public static PacketBufferNode createObjectFourthActionPacket(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.OPLOC4(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		packetBufferNode.getPacketBuffer().writeShort(objectId);
		packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}

	public static PacketBufferNode createObjectFifthActionPacket(int objectId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.OPLOC5(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortAdd(objectId);
		packetBufferNode.getPacketBuffer().writeByteNeg(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}
}