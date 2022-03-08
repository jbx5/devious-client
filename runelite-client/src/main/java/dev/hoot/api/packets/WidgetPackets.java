package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Item;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;

public class WidgetPackets
{
	public static void widgetFirstOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction1Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetSecondOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction2Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetThirdOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction3Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetFourthOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction4Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetFifthOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction5Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetSixthOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction6Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetSeventhOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction7Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetEighthOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction8Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetNinthOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction9Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetTenthOption(Widget widget)
	{
		WidgetPackets.queueWidgetAction10Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetItemAction(WidgetInfo container, Item item, String action)
	{
		var actions = item.getActions();
		if (actions == null)
		{
			return;
		}
		var index = actions.indexOf(action);
		WidgetPackets.widgetItemAction(container, item, index);
	}

	public static void widgetItemAction(WidgetInfo container, Item item, int index)
	{
		var widgetPackedId = container.getPackedId();
		var itemId = item.getId();
		var itemSlot = item.getSlot();
		switch (index)
		{
			case 0:
				WidgetPackets.queueWidgetAction1Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 1:
				WidgetPackets.queueWidgetAction2Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 2:
				WidgetPackets.queueWidgetAction3Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 3:
				WidgetPackets.queueWidgetAction4Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 4:
				WidgetPackets.queueWidgetAction5Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 5:
				WidgetPackets.queueWidgetAction6Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 6:
				WidgetPackets.queueWidgetAction7Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 7:
				WidgetPackets.queueWidgetAction8Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 8:
				WidgetPackets.queueWidgetAction9Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 9:
				WidgetPackets.queueWidgetAction10Packet(widgetPackedId, itemId, itemSlot);
				break;
		}
	}

	public static void widgetAction(Widget widget, String action)
	{
		var actions = widget.getActions();
		if (actions == null)
		{
			return;
		}
		var index = actions.indexOf(action);
		switch (index)
		{
			case 0:
				WidgetPackets.widgetFirstOption(widget);
				break;
			case 1:
				WidgetPackets.widgetSecondOption(widget);
				break;
			case 2:
				WidgetPackets.widgetThirdOption(widget);
				break;
			case 3:
				WidgetPackets.widgetFourthOption(widget);
				break;
			case 4:
				WidgetPackets.widgetFifthOption(widget);
				break;
			case 5:
				WidgetPackets.widgetSixthOption(widget);
				break;
			case 6:
				WidgetPackets.widgetSeventhOption(widget);
				break;
			case 7:
				WidgetPackets.widgetEighthOption(widget);
				break;
			case 8:
				WidgetPackets.widgetNinthOption(widget);
				break;
			case 9:
				WidgetPackets.widgetTenthOption(widget);
				break;
		}
	}

	public static void queueWidgetAction1Packet(int widgetId, int itemId, int childId)
	{
		createFirstAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction2Packet(int widgetId, int itemId, int childId)
	{
		createSecondAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction3Packet(int widgetId, int itemId, int childId)
	{
		createThirdAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction4Packet(int widgetId, int itemId, int childId)
	{
		createFourthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction5Packet(int widgetId, int itemId, int childId)
	{
		createFifthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction6Packet(int widgetId, int itemId, int childId)
	{
		createSixthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction7Packet(int widgetId, int itemId, int childId)
	{
		createSeventhAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction8Packet(int widgetId, int itemId, int childId)
	{
		createEighthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction9Packet(int widgetId, int itemId, int childId)
	{
		createNinthAction(widgetId, itemId, childId).send();
	}

	public static void queueWidgetAction10Packet(int widgetId, int itemId, int childId)
	{
		createTenthAction(widgetId, itemId, childId).send();
	}

	public static void queueResumePauseWidgetPacket(int widgetId, int childId)
	{
		createContinuePacket(widgetId, childId).send();
	}

	public static PacketBufferNode createContinuePacket(int widgetId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.RESUME_PAUSEBUTTON(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		return packetBufferNode;
	}

	public static PacketBufferNode createFirstAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON1(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSecondAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON2(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createThirdAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON3(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createFourthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON4(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createFifthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON5(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSixthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON6(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSeventhAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON7(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createEighthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON8(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createNinthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON9(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createTenthAction(int widgetId, int itemId, int childId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.IF_BUTTON10(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createType1Action(int widgetId)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packet = client.preparePacket(clientPacket.IF_BUTTON10(), client.getPacketWriter().getIsaacCipher());
		packet.getPacketBuffer().writeInt(widgetId);
		return packet;
	}

	public static PacketBufferNode createDefaultAction(int type, int widgetPackedId, int itemId, int itemSlot)
	{
		switch (type)
		{
			case 1:
				return createFirstAction(widgetPackedId, itemId, itemSlot);
			case 2:
				return createSecondAction(widgetPackedId, itemId, itemSlot);
			case 3:
				return createThirdAction(widgetPackedId, itemId, itemSlot);
			case 4:
				return createFourthAction(widgetPackedId, itemId, itemSlot);
			case 5:
				return createFifthAction(widgetPackedId, itemId, itemSlot);
			case 6:
				return createSixthAction(widgetPackedId, itemId, itemSlot);
			case 7:
				return createSeventhAction(widgetPackedId, itemId, itemSlot);
			case 8:
				return createEighthAction(widgetPackedId, itemId, itemSlot);
			case 9:
				return createNinthAction(widgetPackedId, itemId, itemSlot);
			case 10:
				return createTenthAction(widgetPackedId, itemId, itemSlot);
		}

		throw new IllegalArgumentException("Invalid widget action type: " + type);
	}
}