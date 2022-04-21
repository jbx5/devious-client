package dev.unethicalite.api.packets;

import dev.unethicalite.api.game.Game;
import dev.unethicalite.api.widgets.Widgets;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
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
				ItemPackets.itemFirstOption(item);
				break;
			case 1:
				ItemPackets.itemSecondOption(item);
				break;
			case 2:
				ItemPackets.itemThirdOption(item);
				break;
			case 3:
				ItemPackets.itemFourthOption(item);
				break;
			case 4:
				ItemPackets.itemFifthOption(item);
				break;
			default:
				WidgetPackets.widgetAction(Widgets.fromId(item.getWidgetId()), action);
				break;
		}
	}

	public static void itemFirstOption(Item item)
	{
		ItemPackets.queueItemAction1Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemSecondOption(Item item)
	{
		ItemPackets.queueItemAction2Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemThirdOption(Item item)
	{
		ItemPackets.queueItemAction3Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemFourthOption(Item item)
	{
		ItemPackets.queueItemAction4Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemFifthOption(Item item)
	{
		ItemPackets.queueItemAction5Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void useItemOnItem(Item item, Item item2)
	{
		if ((item.getType().getInventoryID() != InventoryID.INVENTORY) || (item2.getType().getInventoryID() != InventoryID.INVENTORY))
		{
			return;
		}
		ItemPackets.queueItemOnItemPacket(item.getId(), item.getSlot(), item2.getId(), item2.getSlot());
	}

	public static void queueItemOnItemPacket(int sourceItemId, int sourceItemSlot, int itemId, int itemSlot)
	{
		ItemPackets.createItemOnItem(sourceItemId, sourceItemSlot, itemId, itemSlot).send();
	}

	public static void queueSpellOnItemPacket(int itemId, int itemSlot, int spellWidgetId)
	{
		ItemPackets.createSpellOnItem(itemId, itemSlot, spellWidgetId).send();
	}

	public static void queueItemAction1Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createFirstAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static void queueItemAction2Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createSecondAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static void queueItemAction3Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createThirdAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static void queueItemAction4Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createFourthAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static void queueItemAction5Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createFifthAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static PacketBufferNode createItemOnItem(int sourceItemId, int sourceItemSlot, int itemId, int itemSlot)
	{
		return WidgetPackets.createWidgetOnWidget(WidgetInfo.INVENTORY.getId(),sourceItemSlot,sourceItemId,WidgetInfo.INVENTORY.getId(),itemSlot,itemId);
	}

	public static PacketBufferNode createSpellOnItem(int itemId, int itemSlot, int spellWidgetId)
	{
		return WidgetPackets.createWidgetOnWidget(spellWidgetId,-1,-1,WidgetInfo.INVENTORY.getId(), itemSlot,itemId);
//		var client = Game.getClient();
//		var clientPacket = Game.getClientPacket();
//		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELDT(), client.getPacketWriter().getIsaacCipher());
//		packetBufferNode.getPacketBuffer().writeShortAdd(itemId);
//		packetBufferNode.getPacketBuffer().writeIntIME(spellWidgetId);
//		packetBufferNode.getPacketBuffer().writeShortAdd(itemSlot);
//		packetBufferNode.getPacketBuffer().writeShort(-1);
//		packetBufferNode.getPacketBuffer().writeInt(WidgetInfo.INVENTORY.getId());
//		return packetBufferNode;
	}

	public static PacketBufferNode createFirstAction(int itemWidgetId, int itemId, int itemSlot)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD1(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		packetBufferNode.getPacketBuffer().writeShort(itemSlot);
		packetBufferNode.getPacketBuffer().writeIntLE(itemWidgetId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSecondAction(int itemWidgetId, int itemId, int itemSlot)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD2(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeIntLE(itemWidgetId);
		packetBufferNode.getPacketBuffer().writeShort(itemSlot);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createThirdAction(int itemWidgetId, int itemId, int itemSlot)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD3(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		packetBufferNode.getPacketBuffer().writeShort(itemSlot);
		packetBufferNode.getPacketBuffer().writeIntLE(itemWidgetId);
		return packetBufferNode;
	}

	public static PacketBufferNode createFourthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD4(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(itemId);
		packetBufferNode.getPacketBuffer().writeIntLE(itemWidgetId);
		packetBufferNode.getPacketBuffer().writeShortAddLE(itemSlot);
		return packetBufferNode;
	}

	public static PacketBufferNode createFifthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.OPHELD5(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeIntIME(itemWidgetId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		packetBufferNode.getPacketBuffer().writeShortAddLE(itemSlot);
		return packetBufferNode;
	}
}