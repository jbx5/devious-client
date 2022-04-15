package dev.unethicalite.api.packets;

import dev.unethicalite.api.game.Game;
import dev.unethicalite.api.game.GameThread;
import net.runelite.api.packets.PacketBufferNode;

public class MousePackets
{
	public static void queueClickPacket(int x, int y)
	{
		Game.getClient().setMouseLastPressedMillis(System.currentTimeMillis());
		int mousePressedTime = ((int) (Game.getClient().getMouseLastPressedMillis() - Game.getClient().getClientMouseLastPressedMillis()));
		if (mousePressedTime < 0)
		{
			mousePressedTime = 0;
		}
		if (mousePressedTime > 32767)
		{
			mousePressedTime = 32767;
		}
		Game.getClient().setClientMouseLastPressedMillis(Game.getClient().getMouseLastPressedMillis());
		int mouseInfo = (mousePressedTime << 1) + 1;
		MousePackets.queueClickPacket(mouseInfo, x, y);
	}

	public static void queueClickPacket(int mouseInfo, int x, int y)
	{
		GameThread.invoke(() -> createClickPacket(mouseInfo, x, y).send());
	}

	public static void queueClickPacket()
	{
		queueClickPacket(0, 0);
	}

	public static PacketBufferNode createClickPacket(int mouseInfo, int x, int y)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.EVENT_MOUSE_CLICK(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeShort(mouseInfo);
		packetBufferNode.getPacketBuffer().writeShort(x);
		packetBufferNode.getPacketBuffer().writeShort(y);
		return packetBufferNode;
	}
}