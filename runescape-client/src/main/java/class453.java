import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rq")
public enum class453 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	field4764(0, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	field4762(2, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	field4765(3, 3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lrq;"
	)
	field4763(1, 10);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1675057501
	)
	final int field4761;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -726522981
	)
	final int field4766;

	class453(int var3, int var4) {
		this.field4761 = var3;
		this.field4766 = var4;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4766;
	}
}
