package dev.unethicalite.mixins;

import dev.unethicalite.api.events.PacketSent;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPacketBufferNode;
import net.runelite.rs.api.RSPacketWriter;

@Mixin(RSPacketWriter.class)
public abstract class HPacketWriterMixin implements RSPacketWriter
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public void queuePacket(PacketBufferNode packetBufferNode)
	{
		sendPacket((RSPacketBufferNode) packetBufferNode);
	}

	@Inject
	@MethodHook("addNode")
	public void addNode(RSPacketBufferNode packet)
	{
		client.getCallbacks().post(new PacketSent(packet));
	}
}
