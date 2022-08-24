import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("jg")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Ljg;")
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 230152311)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount = 0;

	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = "Lnc;")
	static AbstractSocket field3045;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Ljb;")
	@Export("clientPacket")
	public ClientPacket clientPacket;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 1911786961)
	@Export("clientPacketLength")
	public int clientPacketLength;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lqz;")
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1990774047)
	@Export("index")
	public int index;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1882304710")
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode.PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1762838535")
	static final void method5137() {
		class4.method20("You can't add yourself to your own ignore list");
	}
}