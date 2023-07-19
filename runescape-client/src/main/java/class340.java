import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nb")
public enum class340 implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3800(0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3799(1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3804(2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3801(3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	field3802(4);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1101402369
	)
	final int field3803;

	class340(int var3) {
		this.field3803 = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3803;
	}
}
