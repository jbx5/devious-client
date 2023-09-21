import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class306 {
	@ObfuscatedName("ah")
	@Export("PcmPlayer_stereo")
	public static boolean PcmPlayer_stereo;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)Llx;",
		garbageValue = "28"
	)
	static PacketBufferNode method5863() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}
}
