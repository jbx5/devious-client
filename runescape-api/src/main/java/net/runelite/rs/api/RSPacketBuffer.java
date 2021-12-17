package net.runelite.rs.api;

import net.runelite.api.packets.PacketBuffer;
import net.runelite.mapping.Import;

public interface RSPacketBuffer extends RSBuffer, PacketBuffer
{
	@Import("isaacCipher")
	@Override
	RSIsaacCipher getIsaacCipher();
}
