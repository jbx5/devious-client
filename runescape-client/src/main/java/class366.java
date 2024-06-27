import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public enum class366 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4004(0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field3999(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4001(2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4000(3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	field4008(4);

	@ObfuscatedName("jo")
	static byte[][] field4005;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -386739827
	)
	final int field4002;

	class366(int var3) {
		this.field4002 = var3;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4002;
	}
}
