import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.Collections;
@ObfuscatedName("de")
public class class120 implements class112 {
	@ObfuscatedName("pn")
	@ObfuscatedSignature(descriptor = "[Lku;")
	static Widget[] field1486;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([I[IS)V", garbageValue = "11506")
	public static void method2823(int[] var0, int[] var1) {
		if (var0 != null && var1 != null) {
			WorldMapSectionType.ByteArrayPool_alternativeSizes = var0;
			Frames.ByteArrayPool_altSizeArrayCounts = new int[var0.length];
			ModeWhere.ByteArrayPool_arrays = new byte[var0.length][][];
			for (int var2 = 0; var2 < WorldMapSectionType.ByteArrayPool_alternativeSizes.length; ++var2) {
				ModeWhere.ByteArrayPool_arrays[var2] = new byte[var1[var2]][];
				ByteArrayPool.field4239.add(var0[var2]);
			}
			Collections.sort(ByteArrayPool.field4239);
		} else {
			WorldMapSectionType.ByteArrayPool_alternativeSizes = null;
			Frames.ByteArrayPool_altSizeArrayCounts = null;
			ModeWhere.ByteArrayPool_arrays = null;
			ByteArrayPool.field4239.clear();
			ByteArrayPool.field4239.add(100);
			ByteArrayPool.field4239.add(5000);
			ByteArrayPool.field4239.add(10000);
			ByteArrayPool.field4239.add(30000);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;B)V", garbageValue = "119")
	public static void method2822(AbstractArchive var0) {
		EnumComposition.EnumDefinition_archive = var0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "1519818324")
	public static boolean method2821(char var0) {
		if ((var0 <= 0 || var0 >= 128) && (var0 < 160 || var0 > 255)) {
			if (var0 != 0) {
				char[] var1 = class341.cp1252AsciiExtension;
				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}
			return false;
		} else {
			return true;
		}
	}
}