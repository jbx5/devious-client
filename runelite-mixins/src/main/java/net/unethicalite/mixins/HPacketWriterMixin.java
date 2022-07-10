package net.unethicalite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.MethodHook;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.api.packets.PacketBufferNode;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPacketBufferNode;
import net.runelite.rs.api.RSPacketWriter;
import net.unethicalite.api.events.PacketSent;

@Mixin(RSPacketWriter.class)
public abstract class HPacketWriterMixin implements RSPacketWriter
{
	@Shadow("client")
	private static RSClient client;

	@Inject
	@Override
	public void queuePacket(PacketBufferNode packetBufferNode)
	{
		packetBufferNode.getPacketBuffer().setAutomated(true);
		sendPacket((RSPacketBufferNode) packetBufferNode);
	}

	@Inject
	@MethodHook("addNode")
	public void addNode(RSPacketBufferNode packet)
	{
		client.getCallbacks().post(new PacketSent(packet));
	}
}
