package net.runelite.rs.api;

import net.runelite.api.packets.PacketBufferNode;
import net.runelite.mapping.Import;

public interface RSPacketBufferNode extends PacketBufferNode, RSNode
{
	@Import("packetBuffer")
	@Override
	RSPacketBuffer getPacketBuffer();

	@Import("clientPacket")
	@Override
	RSClientPacket getClientPacket();

	@Import("index")
	int getIndex();

	@Import("index")
	void setIndex(int index);

	@Import("release")
	void release();
}
