package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;

import java.util.List;

public class NPCPackets
{
	public static void queueNPCActionPacket(int NPCIndex, int ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode var9 = Game.getClient().preparePacket(clientPacket.OPNPC1(), client.getPacketWriter().getIsaacCipher());
		var9.getPacketBuffer().write2(ctrlDown);
		var9.getPacketBuffer().writeByteB0(NPCIndex);
		client.getPacketWriter().queuePacket(var9);
	}

	public static void queueNPCAction2Packet(int NPCIndex, int ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode var9 = Game.getClient().preparePacket(clientPacket.OPNPC2(), client.getPacketWriter().getIsaacCipher());
		var9.getPacketBuffer().writeByteB0(NPCIndex);
		var9.getPacketBuffer().writeByte(ctrlDown);
		client.getPacketWriter().queuePacket(var9);
	}

	public static void queueNPCAction3Packet(int NPCIndex, int ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode var9 = Game.getClient().preparePacket(clientPacket.OPNPC3(), client.getPacketWriter().getIsaacCipher());
		var9.getPacketBuffer().write2(ctrlDown);
		var9.getPacketBuffer().writeShortLE(NPCIndex);
		client.getPacketWriter().queuePacket(var9);
	}

	public static void queueNPCAction4Packet(int NPCIndex, int ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode var9 = Game.getClient().preparePacket(clientPacket.OPNPC4(), client.getPacketWriter().getIsaacCipher());
		var9.getPacketBuffer().writeByteB0(NPCIndex);
		var9.getPacketBuffer().writeByteB(ctrlDown);
		client.getPacketWriter().queuePacket(var9);
	}

	public static void queueNPCAction5Packet(int NPCIndex, int ctrlDown)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode var9 = Game.getClient().preparePacket(clientPacket.OPNPC5(), client.getPacketWriter().getIsaacCipher());
		var9.getPacketBuffer().write1(ctrlDown);
		var9.getPacketBuffer().writeShort(NPCIndex);
		client.getPacketWriter().queuePacket(var9);
	}

	public static void npcFirstOption(NPC npc, int ctrlDown)
	{
		queueNPCActionPacket(npc.getIndex(), ctrlDown);
	}

	public static void npcSecondOption(NPC npc, int ctrlDown)
	{
		queueNPCAction2Packet(npc.getIndex(), ctrlDown);
	}

	public static void npcThirdOption(NPC npc, int ctrlDown)
	{
		queueNPCAction3Packet(npc.getIndex(), ctrlDown);
	}

	public static void npcFourthOption(NPC npc, int ctrlDown)
	{
		queueNPCAction4Packet(npc.getIndex(), ctrlDown);
	}

	public static void npcFifthOption(NPC npc, int ctrlDown)
	{
		queueNPCAction5Packet(npc.getIndex(), ctrlDown);
	}

	public static void npcAction(NPC npc, String action, int ctrlDown)
	{
		List<String> actions = npc.getActions();
		int index = actions.indexOf(action);
		switch (index)
		{
			case 0:
				npcFirstOption(npc, ctrlDown);
				break;
			case 1:
				npcSecondOption(npc, ctrlDown);
				break;
			case 2:
				npcThirdOption(npc, ctrlDown);
				break;
			case 3:
				npcFourthOption(npc, ctrlDown);
				break;
			case 4:
				npcFifthOption(npc, ctrlDown);
				break;
		}
	}
}
