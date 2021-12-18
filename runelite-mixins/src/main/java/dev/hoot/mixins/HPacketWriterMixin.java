package dev.hoot.mixins;

import dev.hoot.api.events.PacketSent;
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

		// Once the mouserecorder packet is sent, the click packet is sent directly afterwards.
		// However, if the button is 1337 (automated) the click packet is not sent.
		// So we queue the packet directly after the mouserecorder packet is sent.
		// Normally we'd have the client handle this by doing an extra check in the if condition (lastbutton == 1337)
		// but we cannot currently modify the asm instructions, so this is a temporary workaround.
		if (packet.getClientPacket() != client.getClientPacket().MOUSERECORDER_DATA()
				|| client.getMouseHandler().getLastButton() != 1337)
		{
			return;
		}

//		MouseHandler mouseHandler = client.getMouseHandler();
//		PacketBufferNode click = client.preparePacket(
//				client.getClientPacket().EVENT_MOUSE_CLICK(),
//				client.getPacketWriter().getIsaacCipher()
//		);
//		long pressedTime = mouseHandler.getLastPressedMillis() - client.getClientMouseLastPressedMillis();
//		if (pressedTime > Short.MAX_VALUE)
//		{
//			pressedTime = Short.MAX_VALUE;
//		}
//
//		click.getPacketBuffer().writeShort(1 + (int) (pressedTime << 1));
//		click.getPacketBuffer().writeShort(mouseHandler.getLastPressedX());
//		click.getPacketBuffer().writeShort(mouseHandler.getLastPressedY());
//		queuePacket(click);
	}
}
