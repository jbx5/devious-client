package net.runelite.rs.api;

import net.runelite.api.packets.ServerPacket;
import net.runelite.mapping.Import;

public interface RSServerPacket extends ServerPacket
{
	@Import("id")
	@Override
	int getId();

	@Import("length")
	@Override
	int getLength();
}
