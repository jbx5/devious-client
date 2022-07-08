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

	@Import("field1341")
	void setUnknown1(boolean value);

	@Import("field1341")
	boolean getUnknown1();

	@Import("field1342")
	void setUnknown2(int value);

	@Import("field1342")
	int getUnknown2();
}
