import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("cu")
public class class93 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 337729441)
	@Export("cacheGamebuild")
	static int cacheGamebuild;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 722950439)
	int field1280;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1232104347)
	int field1283;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 375330431)
	int field1279;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -2011383933)
	int field1281;

	class93(int var1, int var2, int var3, int var4) {
		this.field1280 = var1;
		this.field1283 = var2;
		this.field1279 = var3;
		this.field1281 = var4;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-376919384")
	int method2391() {
		return this.field1280;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1976546197")
	int method2392() {
		return this.field1283;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "1")
	int method2400() {
		return this.field1279;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-936836113")
	int method2393() {
		return this.field1281;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Llc;II)V", garbageValue = "-222305285")
	static void method2403(Archive var0, int var1) {
		if (var0.field3990) {
			if (var1 <= NetCache.field4031) {
				throw new RuntimeException("");
			}
			if (var1 < NetCache.field4032) {
				NetCache.field4032 = var1;
			}
		} else {
			if (var1 >= NetCache.field4032) {
				throw new RuntimeException("");
			}
			if (var1 > NetCache.field4031) {
				NetCache.field4031 = var1;
			}
		}
		if (KitDefinition.field1862 != null) {
			DirectByteArrayCopier.method5512(var0, var1);
		} else {
			ClanChannel.requestNetFile(((Archive) (null)), 255, 255, 0, ((byte) (0)), true);
			NetCache.NetCache_archives[var1] = var0;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "([BB)V", garbageValue = "100")
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4207) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4208) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4209) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.field4216 < ByteArrayPool.field4210) {
			ByteArrayPool.field4214[++ByteArrayPool.field4216 - 1] = var0;
		} else if (class464.ByteArrayPool_arrays != null) {
			for (int var1 = 0; var1 < Canvas.ByteArrayPool_alternativeSizes.length; ++var1) {
				if (var0.length == Canvas.ByteArrayPool_alternativeSizes[var1] && class17.ByteArrayPool_altSizeArrayCounts[var1] < class464.ByteArrayPool_arrays[var1].length) {
					class464.ByteArrayPool_arrays[var1][class17.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
					return;
				}
			}
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "([BIII)I", garbageValue = "-769795107")
	public static int method2404(byte[] var0, int var1, int var2) {
		int var3 = -1;
		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}
		var3 = ~var3;
		return var3;
	}
}