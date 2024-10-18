import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class197 extends DualNode {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("field2022")
	static EvictingDualNodeHashTable field2022;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1954269699
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 1649577851
	)
	static int field2064;
	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "Lsw;"
	)
	static AbstractSocket field2063;

	static {
		field2022 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1261288518"
	)
	static final float method4057(int var0) {
		float var1 = 10075.0F - (float)var0;
		return (var1 * 1.0075567F - 75.56675F) / var1;
	}

	@ObfuscatedName("as")
	static boolean method4056(long var0) {
		return (int)(var0 >>> 16 & 1L) == 1;
	}
}
