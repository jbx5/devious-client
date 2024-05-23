import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("au")
	static String[] field1016;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 246565167
	)
	static int field1026;
	@ObfuscatedName("al")
	String field1019;
	@ObfuscatedName("aj")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("az")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("af")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 54182531
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -972598111
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 296809297
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1223292047
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[Ltu;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)[Ltu;",
		garbageValue = "70"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/String;[II)V",
		garbageValue = "958054688"
	)
	public static void method2209(String[] var0, int[] var1) {
		class195.quicksortStringsWithCorrespondingIntegers(var0, var1, 0, var0.length - 1);
	}

	@ObfuscatedName("pd")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "-915995285"
	)
	static void method2220(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class446.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		UrlRequest.method2944(var0, var1);
	}
}
