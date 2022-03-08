package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.Client;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.WidgetInfo;

import java.util.List;

public class ItemPackets
{
	public static void itemAction(Item item, String action)
	{
		List<String> actions = item.getActions();
		int index = actions.indexOf(action);
		switch (index)
		{
			case 0:
				itemFirstOption(item);
				break;
			case 1:
				itemSecondOption(item);
				break;
			case 2:
				itemThirdOption(item);
				break;
			case 3:
				itemFourthOption(item);
				break;
			case 4:
				itemFifthOption(item);
				break;
			default:
				WidgetPackets.widgetAction(Widgets.fromId(item.getWidgetId()), action);
				break;
		}
	}

	public static void itemFirstOption(Item item)
	{
		queueItemAction1Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemSecondOption(Item item)
	{
		queueItemAction2Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemThirdOption(Item item)
	{
		queueItemAction3Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemFourthOption(Item item)
	{
		queueItemAction4Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemFifthOption(Item item)
	{
		queueItemAction5Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void useItemOnItem(Item item, Item item2)
	{
		if ((item.getType().getInventoryID() != InventoryID.INVENTORY) || (item2.getType().getInventoryID() != InventoryID.INVENTORY))
		{
			return;
		}

		queueItemOnItemPacket(item.getId(), item.getSlot(), item2.getId(), item2.getSlot());
	}

	public static void queueItemOnItemPacket(int sourceItemId, int sourceItemSlot, int itemId, int itemSlot)
	{
		createItemOnItem(sourceItemId, sourceItemSlot, itemId, itemSlot).send();
	}

	public static void queueSpellOnItemPacket(int itemId, int itemSlot, int spellWidgetId)
	{
		createSpellOnItem(itemId, itemSlot, spellWidgetId).send();
	}

	public static void queueItemAction1Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		createFirstAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static void queueItemAction2Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		createSecondAction(itemWidgetId, itemId, itemSlot).send();;
	}

	public static void queueItemAction3Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		createThirdAction(itemWidgetId, itemId, itemSlot).send();;
	}

	public static void queueItemAction4Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		createFourthAction(itemWidgetId, itemId, itemSlot).send();;
	}

	public static void queueItemAction5Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		createFifthAction(itemWidgetId, itemId, itemSlot).send();;
	}

	public static PacketBufferNode createFirstAction(int itemWidgetId, int itemId, int itemSlot)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD1(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(itemSlot);
		packetBufferNode.getPacketBuffer().writeShortLE(itemId);
		packetBufferNode.getPacketBuffer().writeInt(itemWidgetId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSecondAction(int itemWidgetId, int itemId, int itemSlot)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD2(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(itemSlot);
		packetBufferNode.getPacketBuffer().writeIntME(itemWidgetId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createThirdAction(int itemWidgetId, int itemId, int itemSlot)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD3(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeIntIME(itemWidgetId);
		packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
		packetBufferNode.getPacketBuffer().writeShortAddLE(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createFourthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD4(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(itemWidgetId);
		packetBufferNode.getPacketBuffer().writeShortLE(itemId);
		packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
		return packetBufferNode;
	}

	public static PacketBufferNode createFifthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD5(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
		packetBufferNode.getPacketBuffer().writeShortLE(itemId);
		packetBufferNode.getPacketBuffer().writeInt(itemWidgetId);
		return packetBufferNode;
	}

	public static PacketBufferNode createItemOnItem(int sourceItemId, int sourceItemSlot, int itemId, int itemSlot)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELDU(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeIntLE(WidgetInfo.INVENTORY.getId());
		packetBufferNode.getPacketBuffer().writeInt(WidgetInfo.INVENTORY.getId());
		packetBufferNode.getPacketBuffer().writeShortLE(sourceItemSlot);
		packetBufferNode.getPacketBuffer().writeShortLE(sourceItemId);
		packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
		packetBufferNode.getPacketBuffer().writeShortAddLE(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSpellOnItem(int itemId, int itemSlot, int spellWidgetId)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELDT(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortAdd(itemId);
		packetBufferNode.getPacketBuffer().writeShort(-1);
		packetBufferNode.getPacketBuffer().writeInt(spellWidgetId);
		packetBufferNode.getPacketBuffer().writeIntIME(WidgetInfo.INVENTORY.getId());
		packetBufferNode.getPacketBuffer().writeShortLE(itemSlot);
		return packetBufferNode;
	}
}