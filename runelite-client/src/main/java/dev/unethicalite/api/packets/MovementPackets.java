package dev.unethicalite.api.packets;

import dev.unethicalite.api.game.Game;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.packets.PacketBufferNode;

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
		var client = Game.getClient();
		createMovement(worldPointX, worldPointY, ctrlDown).send();
	}

	public static PacketBufferNode createMovement(int worldPointX, int worldPointY, boolean ctrlDown)
	{
		var client = Game.getClient();
		var clientPacket = Game.getClientPacket();
		var packetBufferNode = Game.getClient().preparePacket(clientPacket.MOVE_GAMECLICK(), client.getPacketWriter().getIsaacCipher());
		packetBufferNode.getPacketBuffer().writeByte(5);
		packetBufferNode.getPacketBuffer().writeByteSub(ctrlDown ? 2 : 0);
		packetBufferNode.getPacketBuffer().writeShortAddLE(worldPointY);
		packetBufferNode.getPacketBuffer().writeShort(worldPointX);
		return packetBufferNode;
	}
}