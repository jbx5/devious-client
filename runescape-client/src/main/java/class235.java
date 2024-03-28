import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
public class class235 implements Comparator {
	class235() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lir;Lir;I)I",
		garbageValue = "214790371"
	)
	int method4467(class230 var1, class230 var2) {
		return var1.method4388() - var2.method4388();
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.method4467((class230)var1, (class230)var2);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "1232076305"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		synchronized(ByteArrayPool.field4673) {
			byte[] var3;
			if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool.ByteArrayPool_smallCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_small[--ByteArrayPool.ByteArrayPool_smallCount];
				ByteArrayPool.ByteArrayPool_small[ByteArrayPool.ByteArrayPool_smallCount] = null;
				return var3;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool.ByteArrayPool_mediumCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_medium[--ByteArrayPool.ByteArrayPool_mediumCount];
				ByteArrayPool.ByteArrayPool_medium[ByteArrayPool.ByteArrayPool_mediumCount] = null;
				return var3;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool.ByteArrayPool_largeCount > 0) {
				var3 = ByteArrayPool.ByteArrayPool_large[--ByteArrayPool.ByteArrayPool_largeCount];
				ByteArrayPool.ByteArrayPool_large[ByteArrayPool.ByteArrayPool_largeCount] = null;
				return var3;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && ByteArrayPool.field4677 > 0) {
				var3 = ByteArrayPool.field4685[--ByteArrayPool.field4677];
				ByteArrayPool.field4685[ByteArrayPool.field4677] = null;
				return var3;
			}

			int var6;
			if (HttpJsonRequestBody.ByteArrayPool_arrays != null) {
				for (var6 = 0; var6 < class318.ByteArrayPool_alternativeSizes.length; ++var6) {
					if ((class318.ByteArrayPool_alternativeSizes[var6] == var0 || var0 < class318.ByteArrayPool_alternativeSizes[var6] && var1) && WorldMapID.ByteArrayPool_altSizeArrayCounts[var6] > 0) {
						byte[] var4 = HttpJsonRequestBody.ByteArrayPool_arrays[var6][--WorldMapID.ByteArrayPool_altSizeArrayCounts[var6]];
						HttpJsonRequestBody.ByteArrayPool_arrays[var6][WorldMapID.ByteArrayPool_altSizeArrayCounts[var6]] = null;
						return var4;
					}
				}
			}

			if (var1 && class318.ByteArrayPool_alternativeSizes != null) {
				for (var6 = 0; var6 < class318.ByteArrayPool_alternativeSizes.length; ++var6) {
					if (var0 <= class318.ByteArrayPool_alternativeSizes[var6] && WorldMapID.ByteArrayPool_altSizeArrayCounts[var6] < HttpJsonRequestBody.ByteArrayPool_arrays[var6].length) {
						return new byte[class318.ByteArrayPool_alternativeSizes[var6]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Lhi;",
		garbageValue = "2118831996"
	)
	public static VarcInt method4468(int var0) {
		VarcInt var1 = (VarcInt)VarcInt.VarcInt_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = VarcInt.VarcInt_archive.takeFile(19, var0);
			var1 = new VarcInt();
			if (var2 != null) {
				var1.method3770(new Buffer(var2));
			}

			VarcInt.VarcInt_cached.put(var1, (long)var0);
			return var1;
		}
	}
}
