package net.unethicalite.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.runelite.api.packets.ServerPacket;

@Data
@AllArgsConstructor
public class ServerPacketReceived
{
	private ServerPacket serverPacket;
}
