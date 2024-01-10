import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
public enum class354 implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	field3880(0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	field3877(1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	field3878(2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	field3879(3),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	field3876(4);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -366924757
	)
	final int field3883;

	class354(int var3) {
		this.field3883 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field3883;
	}
}
