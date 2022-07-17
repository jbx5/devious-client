package net.unethicalite.mixins;

import net.runelite.api.Buffer;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSBuffer;
import net.runelite.rs.api.RSBufferedNetSocket;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPacketWriter;
import net.runelite.rs.api.RSServerPacket;
import net.unethicalite.api.events.ServerPacketProcessed;

import java.util.Arrays;

@Mixin(RSBufferedNetSocket.class)
public abstract class HBufferedNetSocketMixin implements RSBufferedNetSocket
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@MethodHook(value = "read", end = true)
	public void onSocketRead(byte[] payload, int offset, int length)
	{
		RSPacketWriter packetWriter = client.getPacketWriter();
		ServerPacketProcessed received = null;
		if (packetWriter != null)
		{
			RSServerPacket serverPacket = packetWriter.getServerPacket();
			if (serverPacket != null)
			{
				RSBuffer buffer = packetWriter.getPacketBuffer();

				if (Arrays.equals(payload, buffer.getPayload()))
				{
					byte[] copy = Arrays.copyOf(buffer.getPayload(), length);
					Buffer bufferCopy = client.createBuffer(copy);

					received = new ServerPacketProcessed(
							serverPacket,
							length,
							bufferCopy
					);
				}
			}
		}

		if (received != null)
		{
			client.getCallbacks().post(received);
		}
	}
}
