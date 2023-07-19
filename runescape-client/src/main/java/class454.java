import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rr")
public enum class454 implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	field4763(3, 1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	field4762(0, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	field4761(1, 3),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lrr;"
	)
	field4766(2, 10);

	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1570765295
	)
	final int field4765;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1167143993
	)
	final int field4764;

	class454(int var3, int var4) {
		this.field4765 = var3;
		this.field4764 = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4764;
	}
}
