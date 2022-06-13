package net.unethicalite.api.events;

import lombok.Value;
import net.runelite.api.packets.ServerPacket;

@Value
public class ServerPacketReceived
{
	ServerPacket serverPacket;
}
