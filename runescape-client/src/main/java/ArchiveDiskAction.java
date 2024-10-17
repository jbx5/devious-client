import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("op")
@Implements("ArchiveDiskAction")
public class ArchiveDiskAction extends Node {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -29242609
	)
	@Export("type")
	int type;
	@ObfuscatedName("aw")
	@Export("data")
	public byte[] data;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("archiveDisk")
	public ArchiveDisk archiveDisk;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	@Export("archive")
	public Archive archive;

	ArchiveDiskAction() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1084716332"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4901) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4906) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4911) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4913) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4905 < ByteArrayPool.field4907) {
				ByteArrayPool.field4909[++ByteArrayPool.field4905 - 1] = var0;
			} else {
				if (ByteArrayPool.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < DbTableType.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == DbTableType.ByteArrayPool_alternativeSizes[var2] && HttpResponse.ByteArrayPool_altSizeArrayCounts[var2] < ByteArrayPool.ByteArrayPool_arrays[var2].length) {
							ByteArrayPool.ByteArrayPool_arrays[var2][HttpResponse.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}
}
