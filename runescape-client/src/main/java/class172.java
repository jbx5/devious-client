import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gc")
public class class172 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("field1913")
	public static EvictingDualNodeHashTable field1913;
	@ObfuscatedName("ud")
	@ObfuscatedGetter(
		intValue = 266444160
	)
	static int field1817;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "70"
	)
	public static int method3570(int var0) {
		return class480.field4859[var0 & 16383];
	}
}
