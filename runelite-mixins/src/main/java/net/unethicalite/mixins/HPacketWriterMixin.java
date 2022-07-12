package net.unethicalite.mixins;

import net.runelite.api.mixins.Copy;
import net.runelite.api.mixins.Inject;
import net.runelite.api.mixins.Mixin;
import net.runelite.api.mixins.Replace;
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

	@Copy("addNode")
	@Replace("addNode")
	public void copy$addNode(RSPacketBufferNode packetBufferNode)
	{
		PacketSent event = new PacketSent(packetBufferNode);
		client.getCallbacks().post(event);

		if (event.isConsumed())
		{
			packetBufferNode.getPacketBuffer().consume();
		}

		copy$addNode(packetBufferNode);
	}

	@Replace("flush")
	public void replace$flush()
	{
		if (getSocket() != null && getBufferSize() > 0)
		{
			getBuffer().setOffset(0);

			while (true)
			{
				RSPacketBufferNode last = (RSPacketBufferNode) getQueuedPackets().getLast();
				if (last == null || last.getIndex() > getBuffer().getPayload().length - getBuffer().getOffset())
				{
					getSocket().write(getBuffer().getPayload(), 0, getBuffer().getOffset());
					setPendingWrites(0);
					break;
				}

				getBuffer().writeBytes(last.getPacketBuffer().getPayload(), 0, last.getIndex());
				setBufferSize(getBufferSize() - last.getIndex());
				last.unlink();
				last.getPacketBuffer().releaseArray();
				last.release();
			}
		}
	}
}
