import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public enum class370 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4032(0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4038(1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4033(2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4034(3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4035(4);

	@ObfuscatedName("il")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static Fonts field4031;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1179091917
	)
	final int field4036;

	class370(int var3) {
		this.field4036 = var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4036;
	}
}
