package net.unethicalite.api.packets;

import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.runelite.api.Client;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;
import net.unethicalite.client.Static;

public class DialogPackets
{
	public static void sendNumberInput(int number, boolean closeDialog)
	{
		Client client = Static.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode var14 = Static.getClient().preparePacket(clientPacket.RESUME_P_COUNTDIALOG(), client.getPacketWriter().getIsaacCipher());
		var14.getPacketBuffer().writeInt(number);
		client.getPacketWriter().queuePacket(var14);
		if (closeDialog)
		{
			GameThread.invoke(() -> Static.getClient().runScript(138));
		}

		// closes the input dialog
	}

	public static void sendNumberInput(int number)
	{
		Client client = Static.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.RESUME_P_COUNTDIALOG(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeInt(number);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void sendNameInput(String name)
	{
		Client client = Static.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.RESUME_P_NAMEDIALOG(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByte(name.length() + 1);
		packetBufferNode.getPacketBuffer().writeStringCp1252NullTerminated(name);
		client.getPacketWriter().queuePacket(packetBufferNode);
	}

	public static void sendTextInput(String text)
	{
		Client client = Static.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode packetBufferNode = Static.getClient().preparePacket(clientPacket.RESUME_P_STRINGDIALOG(), client.getPacketWriter().getIsaacCipher());
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