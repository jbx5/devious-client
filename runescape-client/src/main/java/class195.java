import java.util.Collections;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hy")
public class class195 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("field1864")
	static EvictingDualNodeHashTable field1864;

	static {
		field1864 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lhj;",
		garbageValue = "-2083811545"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else if (KitDefinition.KitDefinition_archive == null) {
			return null;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "([I[IB)V",
		garbageValue = "-81"
	)
	public static void method3737(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			class318.ByteArrayPool_alternativeSizes = var0;
			WorldMapID.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			HttpJsonRequestBody.ByteArrayPool_arrays = new byte[var0.length][][];

			for (int var2 = 0; var2 < class318.ByteArrayPool_alternativeSizes.length; ++var2) {
				HttpJsonRequestBody.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4686.add(var0[var2]);
			}

			Collections.sort(ByteArrayPool.field4686);
		} else {
			class318.ByteArrayPool_alternativeSizes = null;
			WorldMapID.ByteArrayPool_altSizeArrayCounts = null;
			HttpJsonRequestBody.ByteArrayPool_arrays = null;
			ByteArrayPool.field4686.clear();
			ByteArrayPool.field4686.add(100);
			ByteArrayPool.field4686.add(5000);
			ByteArrayPool.field4686.add(10000);
			ByteArrayPool.field4686.add(30000);
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[B",
		garbageValue = "1152254680"
	)
	@Export("ByteArrayPool_getArray")
	public static byte[] ByteArrayPool_getArray(int var0) {
		return class235.ByteArrayPool_getArrayBool(var0, false);
	}
}
