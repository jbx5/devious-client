package net.unethicalite.api.packets;

import net.runelite.api.coords.WorldPoint;
import net.runelite.api.packets.PacketBufferNode;
import net.unethicalite.api.game.Game;
import net.unethicalite.client.Static;

public class MovementPackets
{
	public static void sendMovement(int worldX, int worldY)
	{
		sendMovement(worldX, worldY, false);
	}

	public static void sendMovement(WorldPoint worldPoint, boolean ctrlDown)
	{
		sendMovement(worldPoint.getX(), worldPoint.getY(), ctrlDown);
	}

	public static void sendMovement(WorldPoint worldPoint)
	{
		sendMovement(worldPoint, false);
	}

	public static void sendMovement(int worldPointX, int worldPointY, boolean ctrlDown)
	{
		var client = Static.getClient();
		createMovement(worldPointX, worldPointY, ctrlDown).send();
	}

	public static PacketBufferNode createMovement(int worldPointX, int worldPointY, boolean ctrlDown)
	{
		var client = Static.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Static.getClient().preparePacket(clientPacket.MOVE_GAMECLICK(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByte(5);
		packetBufferNode.getPacketBuffer().writeShort(worldPointX);
		packetBufferNode.getPacketBuffer().writeByteAdd(ctrlDown ? 2 : 0);
		packetBufferNode.getPacketBuffer().writeShortLE(worldPointY);
		return packetBufferNode;
	}
}