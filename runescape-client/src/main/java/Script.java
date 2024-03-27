import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ah")
	String field1008;
	@ObfuscatedName("af")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("at")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("an")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -604534135
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1078243665
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1779528905
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1199096097
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lto;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)[Lto;",
		garbageValue = "52"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}
}
