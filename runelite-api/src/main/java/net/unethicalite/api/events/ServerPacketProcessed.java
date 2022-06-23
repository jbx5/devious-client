package net.unethicalite.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import net.runelite.api.Buffer;
import net.runelite.api.packets.ServerPacket;

import java.util.Arrays;

@Data
@AllArgsConstructor
public class ServerPacketProcessed
{
	private ServerPacket serverPacket;
	private int length;
	private Buffer buffer;

	public String hexDump()
	{
		byte[] payload = Arrays.copyOfRange(buffer.getPayload(), 0, buffer.getPayload().length);

		return "\n" + PacketSent.hexDump(
						payload,
						0,
						buffer.getPayload().length
				);
	}
}
