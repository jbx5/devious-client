package net.unethicalite.api.packets;

import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.WidgetInfo;

public class ItemPackets
{
	public static void itemAction(Item item, String action)
	{
		int index = item.getActionIndex(action);
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
			case 5:
				ItemPackets.itemSixthOption(item);
				break;
			case 6:
				ItemPackets.itemSeventhOption(item);
				break;
			case 7:
				ItemPackets.itemEighthOption(item);
				break;
			case 8:
				ItemPackets.itemNinthOption(item);
				break;
			case 9:
				ItemPackets.itemTenthOption(item);
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

	public static void itemSixthOption(Item item)
	{
		ItemPackets.queueItemAction6Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemSeventhOption(Item item)
	{
		ItemPackets.queueItemAction7Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemEighthOption(Item item)
	{
		ItemPackets.queueItemAction8Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemNinthOption(Item item)
	{
		ItemPackets.queueItemAction9Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void itemTenthOption(Item item)
	{
		ItemPackets.queueItemAction10Packet(item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void useItemOnItem(Item item, Item item2)
	{
		if (item.getType().getInventoryID() != InventoryID.INVENTORY || item2.getType().getInventoryID() != InventoryID.INVENTORY)
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

	public static void queueItemAction6Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createSixthAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static void queueItemAction7Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createSeventhAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static void queueItemAction8Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createEighthAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static void queueItemAction9Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createNinthAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static void queueItemAction10Packet(int itemWidgetId, int itemId, int itemSlot)
	{
		ItemPackets.createTenthAction(itemWidgetId, itemId, itemSlot).send();
	}

	public static PacketBufferNode createItemOnItem(int sourceItemId, int sourceItemSlot, int itemId, int itemSlot)
	{
		return WidgetPackets.createWidgetOnWidget(WidgetInfo.INVENTORY.getId(), sourceItemSlot, sourceItemId, WidgetInfo.INVENTORY.getId(), itemSlot, itemId);
	}

	public static PacketBufferNode createSpellOnItem(int itemId, int itemSlot, int spellWidgetId)
	{
		return WidgetPackets.createWidgetOnWidget(spellWidgetId, -1, -1, WidgetInfo.INVENTORY.getId(), itemSlot, itemId);
	}

	public static PacketBufferNode createFirstAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createFirstAction(itemWidgetId, itemId, itemSlot);
	}

	public static PacketBufferNode createSecondAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createSecondAction(itemWidgetId, itemId, itemSlot);
	}

	public static PacketBufferNode createThirdAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createThirdAction(itemWidgetId, itemId, itemSlot);
	}

	public static PacketBufferNode createFourthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createFourthAction(itemWidgetId, itemId, itemSlot);
	}

	public static PacketBufferNode createFifthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createFifthAction(itemWidgetId, itemId, itemSlot);
	}

	public static PacketBufferNode createSixthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createSixthAction(itemWidgetId, itemId, itemSlot);
	}

	public static PacketBufferNode createSeventhAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createSeventhAction(itemWidgetId, itemId, itemSlot);
	}

	public static PacketBufferNode createEighthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createEighthAction(itemWidgetId, itemId, itemSlot);
	}

	public static PacketBufferNode createNinthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createNinthAction(itemWidgetId, itemId, itemSlot);
	}

	public static PacketBufferNode createTenthAction(int itemWidgetId, int itemId, int itemSlot)
	{
		return WidgetPackets.createTenthAction(itemWidgetId, itemId, itemSlot);
	}
}