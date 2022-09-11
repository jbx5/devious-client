import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bt")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lif;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("p")
	String field967;
	@ObfuscatedName("f")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("n")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("k")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 855315925
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -821812551
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -2132486697
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 1089787721
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "[Lpq;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128); // L: 12
	}

	Script() {
	} // L: 23

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(II)[Lpq;",
		garbageValue = "45996152"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1]; // L: 123
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1350464717"
	)
	static final int method2129(int var0, int var1) {
		int var2 = BufferedSource.method7052(var0 - 1, var1 - 1) + BufferedSource.method7052(var0 + 1, var1 - 1) + BufferedSource.method7052(var0 - 1, var1 + 1) + BufferedSource.method7052(1 + var0, 1 + var1); // L: 964
		int var3 = BufferedSource.method7052(var0 - 1, var1) + BufferedSource.method7052(1 + var0, var1) + BufferedSource.method7052(var0, var1 - 1) + BufferedSource.method7052(var0, 1 + var1); // L: 965
		int var4 = BufferedSource.method7052(var0, var1); // L: 966
		return var2 / 16 + var3 / 8 + var4 / 4; // L: 967
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Law;I)V",
		garbageValue = "-662986798"
	)
	public static final void method2118(class47 var0) {
		WorldMapLabel.pcmPlayerProvider = var0; // L: 45
	} // L: 46
}
