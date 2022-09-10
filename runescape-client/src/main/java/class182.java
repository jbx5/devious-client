import java.io.IOException;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gq")
public class class182 extends DualNode {
	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;B)V",
		garbageValue = "68"
	)
	public static void method3702(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0; // L: 17
	} // L: 18

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Lnl;ZI)V",
		garbageValue = "514630955"
	)
	public static void method3703(AbstractSocket var0, boolean var1) {
		if (NetCache.NetCache_socket != null) { // L: 62
			try {
				NetCache.NetCache_socket.close(); // L: 64
			} catch (Exception var6) { // L: 66
			}

			NetCache.NetCache_socket = null; // L: 67
		}

		NetCache.NetCache_socket = var0; // L: 69
		class117.method2859(var1); // L: 70
		NetCache.NetCache_responseHeaderBuffer.offset = 0; // L: 71
		class135.NetCache_currentResponse = null; // L: 72
		class20.NetCache_responseArchiveBuffer = null; // L: 73
		NetCache.field4075 = 0; // L: 74

		while (true) {
			NetFileRequest var2 = (NetFileRequest)NetCache.NetCache_pendingPriorityResponses.first(); // L: 76
			if (var2 == null) { // L: 77
				while (true) {
					var2 = (NetFileRequest)NetCache.NetCache_pendingResponses.first(); // L: 83
					if (var2 == null) { // L: 84
						if (NetCache.field4068 != 0) { // L: 90
							try {
								Buffer var7 = new Buffer(4); // L: 92
								var7.writeByte(4); // L: 93
								var7.writeByte(NetCache.field4068); // L: 94
								var7.writeShort(0); // L: 95
								NetCache.NetCache_socket.write(var7.array, 0, 4); // L: 96
							} catch (IOException var5) {
								try {
									NetCache.NetCache_socket.close(); // L: 100
								} catch (Exception var4) { // L: 102
								}

								++NetCache.NetCache_ioExceptions; // L: 103
								NetCache.NetCache_socket = null; // L: 104
							}
						}

						NetCache.NetCache_loadTime = 0; // L: 107
						NetCache.field4058 = Language.method6232(); // L: 108
						return; // L: 109
					}

					NetCache.NetCache_pendingWritesQueue.addLast(var2); // L: 85
					NetCache.NetCache_pendingWrites.put(var2, var2.key); // L: 86
					++NetCache.NetCache_pendingWritesCount; // L: 87
					--NetCache.NetCache_pendingResponsesCount; // L: 88
				}
			}

			NetCache.NetCache_pendingPriorityWrites.put(var2, var2.key); // L: 78
			++NetCache.NetCache_pendingPriorityWritesCount; // L: 79
			--NetCache.NetCache_pendingPriorityResponsesCount; // L: 80
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IB)Lgl;",
		garbageValue = "53"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0); // L: 23
		if (var1 != null) { // L: 24
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0); // L: 25
			var1 = new StructComposition(); // L: 26
			if (var2 != null) { // L: 27
				var1.decode(new Buffer(var2));
			}

			var1.postDecode(); // L: 28
			StructComposition.StructDefinition_cached.put(var1, (long)var0); // L: 29
			return var1; // L: 30
		}
	}
}
