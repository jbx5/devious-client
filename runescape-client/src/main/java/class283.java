import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jk")
public class class283 {
	@ObfuscatedName("up")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ljn;"
	)
	@Export("huffman")
	public static Huffman huffman;
	@ObfuscatedName("en")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	static Archive field3325;

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Llb;II)V",
		garbageValue = "1702364125"
	)
	static void method5651(Archive var0, int var1) {
		if (var0.field4028) { // L: 112
			if (var1 <= NetCache.field4072) { // L: 113
				throw new RuntimeException(""); // L: 114
			}

			if (var1 < NetCache.field4073) { // L: 116
				NetCache.field4073 = var1; // L: 117
			}
		} else {
			if (var1 >= NetCache.field4073) { // L: 121
				throw new RuntimeException(""); // L: 122
			}

			if (var1 > NetCache.field4072) { // L: 124
				NetCache.field4072 = var1; // L: 125
			}
		}

		if (MilliClock.field1810 != null) { // L: 128
			WorldMapID.method5123(var0, var1); // L: 129
		} else {
			PacketBufferNode.requestNetFile((Archive)null, 255, 255, 0, (byte)0, true); // L: 132
			NetCache.NetCache_archives[var1] = var0; // L: 133
		}
	} // L: 130 134
}
