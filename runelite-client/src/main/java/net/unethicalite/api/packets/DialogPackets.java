package net.unethicalite.api.packets;

import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;

public class DialogPackets
{
	public static void sendNumberInput(int number)
	{
		Client client = Static.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.RESUME_COUNTDIALOG(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(number);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void sendNameInput(String name)
	{
		Client client = Static.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.RESUME_NAMEDIALOG(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByte(name.length() + 1);
		packetBufferNode.getPacketBuffer().writeStringCp1252NullTerminated(name);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void sendTextInput(String text)
	{
		Client client = Static.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.RESUME_STRINGDIALOG(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByte(text.length() + 1);
		packetBufferNode.getPacketBuffer().writeStringCp1252NullTerminated(text);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void closeInterface()
	{
		Client client = Static.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.CLOSE_MODAL(), client.getPacketWriter().getIsaacCipher());
		client.getPacketWriter().queuePacket(packetBufferNode);
	}
}