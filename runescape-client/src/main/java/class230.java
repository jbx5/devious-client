import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ia")
public class class230 extends DualNode {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lms;"
	)
	@Export("field1915")
	public static EvictingDualNodeHashTable field1915;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -777303227
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;

	static {
		field1915 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("gt")
	@ObfuscatedSignature(
		descriptor = "(I)Lkk;",
		garbageValue = "1135228663"
	)
	public static IndexCheck method4774() {
		return Client.indexCheck;
	}
}
