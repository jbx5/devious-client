import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hj")
public class class186 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("field2007")
	public static EvictingDualNodeHashTable field2007;

	static {
		field2007 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1150260738"
	)
	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return var0 == 10 || var0 == 11 || var0 == 12 || var0 == 13 || var0 == 14 || var0 == 15 || var0 == 16 || var0 == 17;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-2138443279"
	)
	static char method3667(char var0) {
		return var0 != 181 && var0 != 402 ? Character.toTitleCase(var0) : var0;
	}
}
