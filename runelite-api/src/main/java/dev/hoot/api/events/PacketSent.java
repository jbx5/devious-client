package dev.hoot.api.events;

import lombok.Value;
import net.runelite.api.packets.PacketBufferNode;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

@Value
public class PacketSent
{
	PacketBufferNode packetBufferNode;

	public String hexDump()
	{
		int opcode = packetBufferNode.getClientPacket() != null ? packetBufferNode.getClientPacket().getId() : -1;
		String opcodeText = String.valueOf(opcode);

		byte[] payload = Arrays.copyOfRange(
				packetBufferNode.getPacketBuffer().getPayload(),
				1, packetBufferNode.getPacketBuffer().getOffset());

		//		for (PacketOpcode op : PacketOpcode.values()) {
		//			if (opcode == op.getOpcode()) {
		//				opcodeText = op.toString();
		//				break;
		//			}
		//		}

		return "[" + opcodeText + "]\n" +
				hexDump(
						payload,
						0,
						getPacketBufferNode().getPacketBuffer().getOffset()
				);
	}

	public static String hexDump(byte[] array, int offset, int length)
	{
		final int width = 16;

		StringBuilder builder = new StringBuilder();

		for (int rowOffset = offset; rowOffset < offset + length; rowOffset += width)
		{
			builder.append(String.format("%06d     ", rowOffset));

			for (int index = 0; index < width; index++)
			{
				if (rowOffset + index < array.length)
				{
					builder.append(String.format("%02X ", array[rowOffset + index]));
				}
				else
				{
					builder.append("   ");
				}
			}

			if (rowOffset < array.length)
			{
				int asciiWidth = Math.min(width, array.length - rowOffset);
				builder.append("     ");
				builder.append(new String(array, rowOffset, asciiWidth, StandardCharsets.UTF_8)
						.replaceAll("\r\n", " ")
						.replaceAll("\n", " ")
				);
			}

			builder.append(String.format("%n"));
		}

		return builder.toString();
	}
}
