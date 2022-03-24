package dev.hoot.api.packets;

import dev.hoot.api.events.AutomatedMenu;
import dev.hoot.api.game.Game;
import dev.hoot.api.game.GameThread;
import dev.hoot.api.widgets.Widgets;
import dev.hoot.bot.managers.interaction.InteractionException;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.packets.PacketWriter;

public class Packets
{
	public static void queuePacket(ClientPacket clientPacket, Object... data)
	{
		PacketWriter writer = Game.getClient().getPacketWriter();
		PacketBufferNode packet = Game.getClient().preparePacket(clientPacket, writer.getIsaacCipher());

		for (Object o : data)
		{
			if (o instanceof Byte)
			{
				packet.getPacketBuffer().writeByte(((int) (o)));
				continue;
			}
			if (o instanceof Short)
			{
				packet.getPacketBuffer().writeShort(((int) (o)));
				continue;
			}
			if (o instanceof Integer)
			{
				packet.getPacketBuffer().writeInt(((int) (o)));
				continue;
			}
			if (o instanceof Long)
			{
				packet.getPacketBuffer().writeLong(((long) (o)));
				continue;
			}
			if (o instanceof String)
			{
				packet.getPacketBuffer().writeStringCp1252NullTerminated(((String) (o)));
				continue;
			}
			// invalid data
			return;
		}

		packet.send();

		writer.queuePacket(packet);
	}

	public static void queuePacket(PacketBufferNode packet)
	{
		GameThread.invoke(() -> Game.getClient().getPacketWriter().queuePacket(packet));
	}

	public static PacketBufferNode fromAutomatedMenu(AutomatedMenu menu)
	{
		var opcode = menu.getOpcode();
		var client = Game.getClient();

		var id = menu.getIdentifier();
		var param0 = menu.getParam0();
		var param1 = menu.getParam1();
		var selectedItemId = client.getSelectedItemID();
		var selectedItemSlot = client.getSelectedItemSlot();
		var selectedItemWidget = client.getSelectedItemWidget();
		var selectedSpellWidget = client.getSelectedSpellWidget();

		switch (opcode)
		{
			case ITEM_USE_ON_GAME_OBJECT:
				return ObjectPackets.createItemOnObjectPacket(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						selectedItemSlot,
						selectedItemId,
						selectedItemWidget,
						false
				);
			case SPELL_CAST_ON_GAME_OBJECT:
				return ObjectPackets.createSpellOnObjectPacket(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						selectedSpellWidget,
						false
				);
			case GAME_OBJECT_FIRST_OPTION:
				return ObjectPackets.createObjectFirstActionPacket(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case GAME_OBJECT_SECOND_OPTION:
				return ObjectPackets.createObjectSecondActionPacket(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case GAME_OBJECT_THIRD_OPTION:
				return ObjectPackets.createObjectThirdActionPacket(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case GAME_OBJECT_FOURTH_OPTION:
				return ObjectPackets.createObjectFourthActionPacket(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case GAME_OBJECT_FIFTH_OPTION:
				return ObjectPackets.createObjectFifthActionPacket(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case ITEM_USE_ON_NPC:
				return NPCPackets.createItemOnNpcPacket(
						id,
						selectedItemWidget,
						selectedItemId,
						selectedItemSlot,
						false
				);
			case SPELL_CAST_ON_NPC:
				return NPCPackets.createSpellOnNpcPacket(
						id,
						selectedSpellWidget,
						false
				);
			case NPC_FIRST_OPTION:
				return NPCPackets.createNpcFirstActionPacket(id, false);
			case NPC_SECOND_OPTION:
				return NPCPackets.createNpcSecondActionPacket(id, false);
			case NPC_THIRD_OPTION:
				return NPCPackets.createNpcThirdActionPacket(id, false);
			case NPC_FOURTH_OPTION:
				return NPCPackets.createNpcFourthActionPacket(id, false);
			case NPC_FIFTH_OPTION:
				return NPCPackets.createNpcFifthActionPacket(id, false);
			case ITEM_USE_ON_PLAYER:
				return PlayerPackets.createItemOnPlayerPacket(
						id,
						selectedItemId,
						selectedItemSlot,
						selectedItemWidget,
						false
				);
			case SPELL_CAST_ON_PLAYER:
				return PlayerPackets.createSpellOnPlayer(id, selectedSpellWidget, false);
			case PLAYER_FIRST_OPTION:
				return PlayerPackets.createFirstAction(id, false);
			case PLAYER_SECOND_OPTION:
				return PlayerPackets.createSecondAction(id, false);
			case PLAYER_THIRD_OPTION:
				return PlayerPackets.createThirdAction(id, false);
			case PLAYER_FOURTH_OPTION:
				return PlayerPackets.createFourthAction(id, false);
			case PLAYER_FIFTH_OPTION:
				return PlayerPackets.createFifthAction(id, false);
			case PLAYER_SIXTH_OPTION:
				return PlayerPackets.createSixthAction(id, false);
			case PLAYER_SEVENTH_OPTION:
				return PlayerPackets.createSeventhAction(id, false);
			case PLAYER_EIGTH_OPTION:
				return PlayerPackets.createEighthAction(id, false);
			case ITEM_USE_ON_GROUND_ITEM:
				return GroundItemPackets.createItemOnGroundItem(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						selectedItemSlot,
						selectedItemId,
						selectedItemWidget,
						false
				);
			case SPELL_CAST_ON_GROUND_ITEM:
				return GroundItemPackets.createSpellOnGroundItem(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						selectedSpellWidget,
						false
				);
			case GROUND_ITEM_FIRST_OPTION:
				return GroundItemPackets.createFirstAction(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case GROUND_ITEM_SECOND_OPTION:
				return GroundItemPackets.createSecondAction(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case GROUND_ITEM_THIRD_OPTION:
				return GroundItemPackets.createThirdAction(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case GROUND_ITEM_FOURTH_OPTION:
				return GroundItemPackets.createFourthAction(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case GROUND_ITEM_FIFTH_OPTION:
				return GroundItemPackets.createFifthAction(
						id,
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case ITEM_USE_ON_WIDGET_ITEM:
				return ItemPackets.createItemOnItem(
						id,
						param0,
						selectedItemId,
						selectedItemSlot
				);
			case ITEM_FIRST_OPTION:
				return ItemPackets.createFirstAction(
						param1,
						id,
						param0
				);
			case ITEM_SECOND_OPTION:
				return ItemPackets.createSecondAction(
						param1,
						id,
						param0
				);
			case ITEM_THIRD_OPTION:
				return ItemPackets.createThirdAction(
						param1,
						id,
						param0
				);
			case ITEM_FOURTH_OPTION:
				return ItemPackets.createFourthAction(
						param1,
						id,
						param0
				);
			case ITEM_FIFTH_OPTION:
				return ItemPackets.createFifthAction(
						param1,
						id,
						param0
				);
			case WIDGET_FIRST_OPTION:
				return WidgetPackets.createFirstAction(
						param1,
						-1,
						param0
				);
			case WIDGET_SECOND_OPTION:
				return WidgetPackets.createSecondAction(
						param1,
						-1,
						param0
				);
			case WIDGET_THIRD_OPTION:
				return WidgetPackets.createThirdAction(
						param1,
						-1,
						param0
				);
			case WIDGET_FOURTH_OPTION:
				return WidgetPackets.createFourthAction(
						param1,
						-1,
						param0
				);
			case WIDGET_FIFTH_OPTION:
				return WidgetPackets.createFifthAction(
						param1,
						-1,
						param0
				);
			case WIDGET_TYPE_1:
				return WidgetPackets.createType1Action(param1);
			case WIDGET_TYPE_6:
				return WidgetPackets.createContinuePacket(param1, param0);
			case WALK:
				client.setDestinationX(param0);
				client.setDestinationY(param1);
				return MovementPackets.createMovement(
						param0 + client.getBaseX(),
						param1 + client.getBaseY(),
						false
				);
			case CC_OP:
				var widget = Widgets.fromId(param1);
				if (widget == null)
				{
					break;
				}

				var child = param0 == -1 ? null : widget.getChild(param0);
				if (child == null)
				{
					return WidgetPackets.createDefaultAction(id, param1, -1, param0);
				}

				return WidgetPackets.createDefaultAction(id, param1, child.getItemId(), param0);
			case CC_OP_LOW_PRIORITY:
				break;
		}

		throw new InteractionException("Couldn't parse packet from opcode: " + opcode);
	}
}