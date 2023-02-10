package net.unethicalite.api.packets;

import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.Widget;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;

public class WidgetPackets
{
	public static void widgetFirstOption(Widget widget)
	{
		queueWidgetAction1Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetSecondOption(Widget widget)
	{
		queueWidgetAction2Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetThirdOption(Widget widget)
	{
		queueWidgetAction3Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetFourthOption(Widget widget)
	{
		queueWidgetAction4Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetFifthOption(Widget widget)
	{
		queueWidgetAction5Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetSixthOption(Widget widget)
	{
		queueWidgetAction6Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetSeventhOption(Widget widget)
	{
		queueWidgetAction7Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetEighthOption(Widget widget)
	{
		queueWidgetAction8Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetNinthOption(Widget widget)
	{
		queueWidgetAction9Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetTenthOption(Widget widget)
	{
		queueWidgetAction10Packet(widget.getId(), widget.getItemId(), widget.getIndex());
	}

	public static void widgetItemAction(net.runelite.api.widgets.WidgetInfo container, net.runelite.api.Item item, String action)
	{
		var index = item.getActionIndex(action);
		widgetItemAction(container, item, index);
	}

	public static void widgetItemAction(net.runelite.api.widgets.WidgetInfo container, net.runelite.api.Item item, int index)
	{
		var widgetPackedId = container.getPackedId();
		var itemId = item.getId();
		var itemSlot = item.getSlot();
		switch (index)
		{
			case 0:
				queueWidgetAction1Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 1:
				queueWidgetAction2Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 2:
				queueWidgetAction3Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 3:
				queueWidgetAction4Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 4:
				queueWidgetAction5Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 5:
				queueWidgetAction6Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 6:
				queueWidgetAction7Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 7:
				queueWidgetAction8Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 8:
				queueWidgetAction9Packet(widgetPackedId, itemId, itemSlot);
				break;
			case 9:
				queueWidgetAction10Packet(widgetPackedId, itemId, itemSlot);
				break;
		}
	}

	public static void widgetAction(Widget widget, String action)
	{
		var index = widget.getActionIndex(action);
		switch (index)
		{
			case 0:
				widgetFirstOption(widget);
				break;
			case 1:
				widgetSecondOption(widget);
				break;
			case 2:
				widgetThirdOption(widget);
				break;
			case 3:
				widgetFourthOption(widget);
				break;
			case 4:
				widgetFifthOption(widget);
				break;
			case 5:
				widgetSixthOption(widget);
				break;
			case 6:
				widgetSeventhOption(widget);
				break;
			case 7:
				widgetEighthOption(widget);
				break;
			case 8:
				widgetNinthOption(widget);
				break;
			case 9:
				widgetTenthOption(widget);
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

	public static void queueWidgetOnWidgetPacket(int sourceWidgetId, int sourceSlot, int sourceItemId, int destinationWidgetId, int destinationSlot, int destinationItemId)
	{
		createWidgetOnWidget(sourceWidgetId, sourceSlot, sourceItemId, destinationWidgetId, destinationSlot, destinationItemId).send();
	}

	public static void queueResumeObjectPacket(int itemId)
	{
		createContinueObjectPacket(itemId).send();
	}

	public static void queueWidgetTypePacket(int widgetId)
	{
		createWidgetTypePacket(widgetId).send();
	}

	public static PacketBufferNode createType1Action(int widgetId)
	{
		var client = Static.getClient();
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

	public static PacketBufferNode createFirstAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON1(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSecondAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON2(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createThirdAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON3(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createFourthAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON4(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createFifthAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON5(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSixthAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON6(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createSeventhAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON7(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createEighthAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON8(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createNinthAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON9(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createTenthAction(int widgetId, int itemId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTON10(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	public static PacketBufferNode createWidgetOnWidget(int sourceWidgetId, int sourceSlot, int sourceItemId, int itemId, int destinationSlot, int widgetId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.IF_BUTTONT(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShortLE(destinationSlot);
		packetBufferNode.getPacketBuffer().writeShortAddLE(sourceItemId);
		packetBufferNode.getPacketBuffer().writeIntIME(sourceWidgetId);
		packetBufferNode.getPacketBuffer().writeShortLE(itemId);
		packetBufferNode.getPacketBuffer().writeShortAdd(sourceSlot);
		packetBufferNode.getPacketBuffer().writeIntIME(widgetId);
		return packetBufferNode;
	}

	public static PacketBufferNode createContinuePacket(int widgetId, int childId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.RESUME_PAUSEBUTTON(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(childId);
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		return packetBufferNode;
	}

	public static PacketBufferNode createContinueObjectPacket(int itemId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.RESUME_OBJDIALOG(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(itemId);
		return packetBufferNode;
	}

	/*
	Not entirely sure what the correct naming for this packet would be.
	But here's an example of how it's used.
	Example is at the tannery.
	Each menu option appears to have it's own widget and Widget ID.
	https://i.imgur.com/OTmM4yQ.png
	 */
	public static PacketBufferNode createWidgetTypePacket(int widgetId)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.WIDGET_TYPE(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(widgetId);
		return packetBufferNode;
	}
}