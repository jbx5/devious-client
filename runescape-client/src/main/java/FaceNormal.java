import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("FaceNormal")
public class FaceNormal {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -622446617
	)
	@Export("x")
	int x;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -845648025
	)
	@Export("y")
	int y;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 830185709
	)
	@Export("z")
	int z;

	FaceNormal() {
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Lld;",
		garbageValue = "1253542503"
	)
	static PacketBufferNode method5512() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount];
	}
}
