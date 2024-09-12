import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mq")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lmq;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	public static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2143578739
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	public static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1837050101
	)
	static int field3426;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmz;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 2020497499
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lva;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1398990059
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1282578056"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}
}
