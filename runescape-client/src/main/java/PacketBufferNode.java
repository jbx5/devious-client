import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "[Lmd;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1720291611
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = -871116551
	)
	static int field3390;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 674199947
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luk;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1414122657
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "27705"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}
}
