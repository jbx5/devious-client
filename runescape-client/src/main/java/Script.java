import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dt")
@Implements("Script")
public class Script extends DualNode {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	@Export("Script_cached")
	static EvictingDualNodeHashTable Script_cached;
	@ObfuscatedName("ci")
	@ObfuscatedGetter(
		intValue = -79793905
	)
	static int field1037;
	@ObfuscatedName("ae")
	String field1026;
	@ObfuscatedName("ag")
	@Export("opcodes")
	int[] opcodes;
	@ObfuscatedName("am")
	@Export("intOperands")
	int[] intOperands;
	@ObfuscatedName("ax")
	@Export("stringOperands")
	String[] stringOperands;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 220676683
	)
	@Export("localIntCount")
	int localIntCount;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 354370245
	)
	@Export("localStringCount")
	int localStringCount;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 250127111
	)
	@Export("intArgumentCount")
	int intArgumentCount;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -177872443
	)
	@Export("stringArgumentCount")
	int stringArgumentCount;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lui;"
	)
	@Export("switches")
	IterableNodeHashTable[] switches;

	static {
		Script_cached = new EvictingDualNodeHashTable(128);
	}

	Script() {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)[Lui;",
		garbageValue = "-862236728"
	)
	@Export("newIterableNodeHashTable")
	IterableNodeHashTable[] newIterableNodeHashTable(int var1) {
		return new IterableNodeHashTable[var1];
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "11"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	static void method2395() {
		for (class268 var0 = (class268)Client.field726.last(); var0 != null; var0 = (class268)Client.field726.previous()) {
			var0.remove();
		}

	}
}
