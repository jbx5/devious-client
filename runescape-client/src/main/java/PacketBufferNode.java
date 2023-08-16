import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ly")
@Implements("PacketBufferNode")
public class PacketBufferNode extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lly;"
	)
	@Export("PacketBufferNode_packetBufferNodes")
	static PacketBufferNode[] PacketBufferNode_packetBufferNodes;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 612768397
	)
	@Export("PacketBufferNode_packetBufferNodeCount")
	static int PacketBufferNode_packetBufferNodeCount;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[[Lmi;"
	)
	@Export("Widget_interfaceComponents")
	public static Widget[][] Widget_interfaceComponents;
	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	static Fonts field3230;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Llw;"
	)
	@Export("clientPacket")
	public ClientPacket clientPacket;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -491908089
	)
	@Export("clientPacketLength")
	public int clientPacketLength;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lto;"
	)
	@Export("packetBuffer")
	public PacketBuffer packetBuffer;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1067890615
	)
	@Export("index")
	public int index;

	static {
		PacketBufferNode_packetBufferNodes = new PacketBufferNode[300];
		PacketBufferNode_packetBufferNodeCount = 0;
	}

	PacketBufferNode() {
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1268899261"
	)
	@Export("release")
	public void release() {
		if (PacketBufferNode_packetBufferNodeCount < PacketBufferNode_packetBufferNodes.length) {
			PacketBufferNode_packetBufferNodes[++PacketBufferNode_packetBufferNodeCount - 1] = this;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "([I[II)V",
		garbageValue = "-469977275"
	)
	public static void method5707(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class416.ByteArrayPool_alternativeSizes = var0;
			StructComposition.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			class410.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class416.ByteArrayPool_alternativeSizes.length; ++var2) {
				class410.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4550.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4550);
		} else {
			class416.ByteArrayPool_alternativeSizes = null;
			StructComposition.ByteArrayPool_altSizeArrayCounts = null;
			class410.ByteArrayPool_arrays = null;
			class101.method2641();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1208755601"
	)
	public static int method5706(int var0) {
		var0 = (var0 & 1431655765) + (var0 >>> 1 & 1431655765);
		var0 = (var0 >>> 2 & 858993459) + (var0 & 858993459);
		var0 = var0 + (var0 >>> 4) & 252645135;
		var0 += var0 >>> 8;
		var0 += var0 >>> 16;
		return var0 & 255;
	}
}
