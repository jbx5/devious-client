package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.TileItem;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;

import java.util.List;

public class GroundItemPackets
{
	public static void groundItemFirstOption(TileItem item, boolean ctrlDown)
	{
		queueGroundItemAction1Packet(item.getId(), item.getWorldLocation().getX(), item.getWorldLocation().getY(), ctrlDown);
	}

	public static void groundItemSecondOption(TileItem item, boolean ctrlDown)
	{
		queueGroundItemAction2Packet(item.getId(), item.getWorldLocation().getX(), item.getWorldLocation().getY(), ctrlDown);
	}

	public static void groundItemThirdOption(TileItem item, boolean ctrlDown)
	{
		queueGroundItemAction3Packet(item.getId(), item.getWorldLocation().getX(), item.getWorldLocation().getY(), ctrlDown);
	}

	public static void groundItemFourthOption(TileItem item, boolean ctrlDown)
	{
		queueGroundItemAction4Packet(item.getId(), item.getWorldLocation().getX(), item.getWorldLocation().getY(), ctrlDown);
	}

	public static void groundItemFifthOption(TileItem item, boolean ctrlDown)
	{
		queueGroundItemAction5Packet(item.getId(), item.getWorldLocation().getX(), item.getWorldLocation().getY(), ctrlDown);
	}

	public static void groundItemAction(TileItem item, String action, boolean ctrlDown)
	{
		List<String> actions = item.getActions();
		int index = actions.indexOf(action);
		switch (index)
		{
			case 0:
				groundItemFirstOption(item, ctrlDown);
				break;
			case 1:
				groundItemSecondOption(item, ctrlDown);
				break;
			case 2:
				groundItemThirdOption(item, ctrlDown);
				break;
			case 3:
				groundItemFourthOption(item, ctrlDown);
				break;
			case 4:
				groundItemFifthOption(item, ctrlDown);
				break;
		}
	}

	public static void queueItemUseOnGroundObjectPacket(int groundItemId, int worldPointX, int worldPointY, int itemSlot, int itemId, int itemWidgetId, boolean ctrlDown)
	{
		createItemOnGroundItem(groundItemId, worldPointX, worldPointY, itemSlot, itemId, itemWidgetId, ctrlDown).send();
	}

	public static void queueSpellOnGroundObjectPacket(int groundItemId, int worldPointX, int worldPointY, int spellWidgetId, boolean ctrlDown)
	{
		createSpellOnGroundItem(groundItemId, worldPointX, worldPointY, spellWidgetId, ctrlDown).send();
	}

	public static void queueGroundItemAction1Packet(int groundItemId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createFirstAction(groundItemId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static void queueGroundItemAction2Packet(int groundItemId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createSecondAction(groundItemId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static void queueGroundItemAction3Packet(int groundItemId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createThirdAction(groundItemId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static void queueGroundItemAction4Packet(int groundItemId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createFourthAction(groundItemId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static void queueGroundItemAction5Packet(int groundItemId, int worldPointX, int worldPointY, boolean ctrlDown)
	{
		createFifthAction(groundItemId, worldPointX, worldPointY, ctrlDown).send();
	}

	public static PacketBufferNode createItemOnGroundItem(int groundItemId, int worldPointX, int worldPointY,
														 int itemSlot, int itemId, int itemWidgetId, boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPOBJU(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		packetBufferNode.getPacketBuffer().writeShortAddLE(itemSlot);
		packetBufferNode.getPacketBuffer().writeShortAddLE(groundItemId);
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeIntLE(itemWidgetId);
		packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShortAddLE(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSpellOnGroundItem(int groundItemId, int worldPointX, int worldPointY,
												   int spellWidgetId, boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPOBJT(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(spellWidgetId);
		packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShortAddLE(-1);
		packetBufferNode.getPacketBuffer().writeShortAddLE(groundItemId);
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortAdd(-1);
		return packetBufferNode;
	}

	public static PacketBufferNode createFirstAction(int groundItemId, int worldPointX, int worldPointY,
													boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPOBJ1(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		packetBufferNode.getPacketBuffer().writeShortLE(groundItemId);
		packetBufferNode.getPacketBuffer().writeShort(worldPointX);
		return packetBufferNode;
	}

	public static PacketBufferNode createSecondAction(int groundItemId, int worldPointX, int worldPointY,
													boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPOBJ2(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 1 : 0);
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortAdd(groundItemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createThirdAction(int groundItemId, int worldPointX, int worldPointY,
													boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPOBJ3(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		packetBufferNode.getPacketBuffer().writeShort(groundItemId);
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointX);
		packetBufferNode.getPacketBuffer().writeByte(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}

	public static PacketBufferNode createFourthAction(int groundItemId, int worldPointX, int worldPointY,
													boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPOBJ4(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAddLE(groundItemId);
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}

	public static PacketBufferNode createFifthAction(int groundItemId, int worldPointX, int worldPointY,
													boolean ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPOBJ5(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAdd(worldPointX);
		packetBufferNode.getPacketBuffer().writeShort(worldPointY);
		packetBufferNode.getPacketBuffer().writeShortLE(groundItemId);
		packetBufferNode.getPacketBuffer().writeByteNeg(ctrlDown ? 1 : 0);
		return packetBufferNode;
	}
}