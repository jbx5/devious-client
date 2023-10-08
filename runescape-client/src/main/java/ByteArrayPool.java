import java.util.ArrayList;
import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
@Implements("ByteArrayPool")
public class ByteArrayPool {
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -544674551
	)
	@Export("ByteArrayPool_smallCount")
	static int ByteArrayPool_smallCount;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1347345197
	)
	@Export("ByteArrayPool_mediumCount")
	static int ByteArrayPool_mediumCount;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -268575627
	)
	@Export("ByteArrayPool_largeCount")
	static int ByteArrayPool_largeCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1770796283
	)
	static int field4595;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 2101074183
	)
	static int field4606;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1137775327
	)
	static int field4599;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 97865893
	)
	static int field4600;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -374552823
	)
	static int field4603;
	@ObfuscatedName("ap")
	@Export("ByteArrayPool_small")
	static byte[][] ByteArrayPool_small;
	@ObfuscatedName("ay")
	@Export("ByteArrayPool_medium")
	static byte[][] ByteArrayPool_medium;
	@ObfuscatedName("as")
	@Export("ByteArrayPool_large")
	static byte[][] ByteArrayPool_large;
	@ObfuscatedName("aj")
	static byte[][] field4605;
	@ObfuscatedName("an")
	@Export("ByteArrayPool_alternativeSizes")
	public static int[] ByteArrayPool_alternativeSizes;
	@ObfuscatedName("ae")
	public static ArrayList field4591;

	static {
		ByteArrayPool_smallCount = 0;
		ByteArrayPool_mediumCount = 0;
		ByteArrayPool_largeCount = 0;
		field4595 = 0;
		field4606 = 1000;
		field4599 = 250;
		field4600 = 100;
		field4603 = 50;
		ByteArrayPool_small = new byte[1000][];
		ByteArrayPool_medium = new byte[250][];
		ByteArrayPool_large = new byte[100][];
		field4605 = new byte[50][];
		field4591 = new ArrayList();
		field4591.clear();
		field4591.add(100);
		field4591.add(5000);
		field4591.add(10000);
		field4591.add(30000);
		new HashMap();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IZI)[B",
		garbageValue = "664601398"
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
		} else if ((var0 == 30000 || var0 < 30000 && var1) && field4595 > 0) {
			var4 = field4605[--field4595];
			field4605[field4595] = null;
			return var4;
		} else {
			int var2;
			if (class28.ByteArrayPool_arrays != null) {
				for (var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) {
					if ((ByteArrayPool_alternativeSizes[var2] == var0 || var0 < ByteArrayPool_alternativeSizes[var2] && var1) && class425.ByteArrayPool_altSizeArrayCounts[var2] > 0) {
						byte[] var3 = class28.ByteArrayPool_arrays[var2][--class425.ByteArrayPool_altSizeArrayCounts[var2]];
						class28.ByteArrayPool_arrays[var2][class425.ByteArrayPool_altSizeArrayCounts[var2]] = null;
						return var3;
					}
				}
			}

			if (var1 && ByteArrayPool_alternativeSizes != null) {
				for (var2 = 0; var2 < ByteArrayPool_alternativeSizes.length; ++var2) {
					if (var0 <= ByteArrayPool_alternativeSizes[var2] && class425.ByteArrayPool_altSizeArrayCounts[var2] < class28.ByteArrayPool_arrays[var2].length) {
						return new byte[ByteArrayPool_alternativeSizes[var2]];
					}
				}
			}

			return new byte[var0];
		}
	}
}
