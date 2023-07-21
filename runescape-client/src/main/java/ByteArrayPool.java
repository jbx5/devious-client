import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pk")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 385405919
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1075020039
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -375623447
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 729966117
	)
	static int field4547;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 737636207
	)
	static int field4548;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1729288341
	)
	static int field4549;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1203889383
	)
	static int field4544;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1909177715
	)
	static int field4555;
	@ObfuscatedName("ah")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ax")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("aa")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("au")
	static byte[][] field4551;
	@ObfuscatedName("ae")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ab")
	static String[] field4541;
	@ObfuscatedName("ao")
	public static ArrayList field4557;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4547 = 0;
		field4548 = 1000;
		field4549 = 250;
		field4544 = 100;
		field4555 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4551 = new byte[50][];
		field4557 = new ArrayList();
		field4557.clear();
		field4557.add(100);
		field4557.add(5000);
		field4557.add(10000);
		field4557.add(30000);
		new HashMap();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "-1680084006"
	)
	@Export("ByteArrayPool_getArrayBool")
	public static synchronized byte[] ByteArrayPool_getArrayBool(int var0, boolean var1) {
		byte[] var4;
		if ((var0 == 100 || var0 < 100 && var1) && ByteArrayPool_smallCount > 0) {
			var4 = ByteArrayPool_small[--ByteArrayPool_smallCount];
			ByteArrayPool_small[ByteArrayPool_smallCount] = null;
			return var4;
		} else if ((var0 == 5000 || var0 < 5000 && var1) && ByteArrayPool_mediumCount > 0) {
			var4 = ByteArrayPool_medium[--ByteArrayPool_mediumCount];
			ByteArrayPool_medium[ByteArrayPool_mediumCount] = null;
			return var4;
		} else if ((var0 == 10000 || var0 < 10000 && var1) && ByteArrayPool_largeCount > 0) {
			var4 = ByteArrayPool_large[--ByteArrayPool_largeCount];
			ByteArrayPool_large[ByteArrayPool_largeCount] = null;
			return var4;
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4547 > 0) {
			var4 = field4551[--field4547];
			field4551[field4547] = null;
			return var4;
		} else {
			int var2;
			if (class152.ByteArrayPool_arrays != null) {
				for (var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) {
					if ((ByteArrayPool_alternativeSizes[var2] == var0 || var0 < ByteArrayPool_alternativeSizes[var2] && var1) && class125.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
						byte[] var3 = class152.ByteArrayPool_arrays[var2][--class125.ByteArrayPool_altSizeArrayCounts[var2]];
						class152.ByteArrayPool_arrays[var2][class125.ByteArrayPool_altSizeArrayCounts[var2]] = null;
						return var3;
					}
				}
			}

			if (var1 && ByteArrayPool_alternativeSizes != null) {
				for (var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) {
					if (var0 <= ByteArrayPool_alternativeSizes[var2] && class125.ByteArrayPool_altSizeArrayCounts[var2] < class152.ByteArrayPool_arrays[var2].length) {
						return new byte[ByteArrayPool_alternativeSizes[var2]];
					}
				}
			}

			return new byte[var0];
		}
	}
}
