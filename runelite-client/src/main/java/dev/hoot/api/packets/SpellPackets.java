package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import dev.hoot.api.magic.Spell;
import dev.hoot.api.widgets.Widgets;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.api.widgets.Widget;

public class SpellPackets {

	public static void spellOnItem(Spell spell, Item item) {
		Widget spellWidget = Widgets.get(spell.getWidget());
		if (spellWidget == null) {
			return;
		}

		queueSpellOnItemPacket(spellWidget.getId(), spellWidget.getIndex(),
						item.getWidgetId(), item.getId(), item.getSlot());
	}

	public static void queueSpellOnItemPacket(int spellWidgetID, int spellWidgetIndex, int inventoryID, int itemID, int itemIndex) {
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode var8 = Game.getClient().preparePacket(clientPacket.OPHELDT(), client.getPacketWriter().getIsaacCipher());
		var8.getPacketBuffer().writeByteC(itemIndex);
		var8.getPacketBuffer().writeInt(spellWidgetID);
		var8.getPacketBuffer().writeShort(spellWidgetIndex);
		var8.getPacketBuffer().writeIntME2(inventoryID);
		var8.getPacketBuffer().writeShortLE(itemID);
		client.getPacketWriter().queuePacket(var8);
	}
	public static void spellOnNpc(int spellWidgetID, net.runelite.api.NPC npc){
		Widget spellWidget = Game.getClient().getWidget(spellWidgetID);
		queueSpellOnNpcPacket(spellWidget.getId(), -1,0,npc.getIndex(),-1);
	}
	public static void spellOnNpcIndex(int spellWidgetID, int index){
		Widget spellWidget = Game.getClient().getWidget(spellWidgetID);
		queueSpellOnNpcPacket(spellWidget.getId(), -1,0,index,-1);
	}
	public static void queueSpellOnNpcPacket(int spellWidgetID,int spellWidgetIndex,int ctrlDown,int npcIndex,int idk){
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode var9 = Game.getClient().preparePacket(clientPacket.OPNPCT(), client.getPacketWriter().getIsaacCipher());
		var9.getPacketBuffer().writeIntME(spellWidgetID);
		var9.getPacketBuffer().writeShortLE(spellWidgetIndex);
		var9.getPacketBuffer().writeByteB(ctrlDown);
		var9.getPacketBuffer().writeShortLE(npcIndex);
		var9.getPacketBuffer().writeShort(idk);
		client.getPacketWriter().queuePacket(var9);
	}
}
