package dev.hoot.api.packets;

import dev.hoot.api.game.Game;
import net.runelite.api.Client;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.packets.ClientPacket;
import net.runelite.api.packets.PacketBufferNode;


public class MovementPackets {
	public static void sendMovement(int worldX, int worldY, boolean run) {
		Client client = Game.getClient();
		ClientPacket clientPacket = Game.getClientPacket();
		PacketBufferNode var18 = Game.getClient().preparePacket(clientPacket.MOVE_GAMECLICK(), client.getPacketWriter().getIsaacCipher());
		var18.getPacketBuffer().writeByte(5);
		var18.getPacketBuffer().writeByte(run ? 2 : 0);
		var18.getPacketBuffer().writeShortLE(worldY);
		var18.getPacketBuffer().writeByteC(worldX);
		client.getPacketWriter().queuePacket(var18);
	}

	public static void sendMovement(int worldX, int worldY) {
		sendMovement(worldX, worldY, false);
	}

	public static void sendMovement(WorldPoint worldPoint, boolean run) {
		sendMovement(worldPoint.getX(), worldPoint.getY(), run);
	}

	public static void sendMovement(WorldPoint worldPoint) {
		sendMovement(worldPoint, false);
	}
}
