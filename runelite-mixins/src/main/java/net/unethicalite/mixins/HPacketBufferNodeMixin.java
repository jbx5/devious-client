package net.unethicalite.mixins;

import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Shadow;
import net.runelite.rs.api.RSClient;
import net.runelite.rs.api.RSPacketBufferNode;

@Mixin(RSPacketBufferNode.class)
public abstract class HPacketBufferNodeMixin implements RSPacketBufferNode
{
	@Shadow("client")
	private static RSClient client;

	@Override
	@Inject
	public void send()
	{
		assert client.isClientThread();

		client.getPacketWriter().queuePacket(this);
	}
}
