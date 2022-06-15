package net.runelite.rs.api;

import net.runelite.api.packets.PacketWriter;
import net.runelite.mapping.Import;

public interface RSPacketWriter extends PacketWriter
{
	@Import("addNode")
	void sendPacket(RSPacketBufferNode packet);

	@Import("isaacCipher")
	@Override
	RSIsaacCipher getIsaacCipher();

	@Import("serverPacket")
	RSServerPacket getServerPacket();

	@Import("serverPacket")
	void setServerPacket(RSServerPacket serverPacket);

	@Import("serverPacketLength")
	int getServerPacketLength();

	@Import("serverPacketLength")
	void setServerPacketLength(int length);

	@Import("socket")
	RSAbstractSocket getSocket();

	@Import("packetBuffer")
	RSPacketBuffer getPacketBuffer();
}
