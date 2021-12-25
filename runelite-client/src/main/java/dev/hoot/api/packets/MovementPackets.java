package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;


public class MovementPackets
{
	public static void sendMovement(int worldX, int worldY, boolean run)
	{
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode movement = Game.getClient().preparePacket(clientPacket.MOVE_GAMECLICK(), client.getPacketWriter().getIsaacCipher());
		movement.getPacketBuffer().writeByte(5);
		movement.getPacketBuffer().writeByte(run ? 2 : 0);
		movement.getPacketBuffer().writeByteC(worldY);
		movement.getPacketBuffer().writeShortLE(worldX);
		client.getPacketWriter().queuePacket(movement);
	}

	public static void sendMovement(int worldX, int worldY)
	{
		sendMovement(worldX, worldY, false);
	}

	public static void sendMovement(WorldPoint worldPoint, boolean run)
	{
		sendMovement(worldPoint.getX(), worldPoint.getY(), run);
	}

	public static void sendMovement(WorldPoint worldPoint)
	{
		sendMovement(worldPoint, false);
	}
}
