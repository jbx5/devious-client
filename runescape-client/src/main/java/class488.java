import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sv")
public enum class488 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	field5071(0, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	field5072(1, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	field5074(3, 3),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lsv;"
	)
	field5077(2, 10);

	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1354248917
	)
	final int field5075;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -21513731
	)
	final int field5076;

	class488(int var3, int var4) {
		this.field5075 = var3;
		this.field5076 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5076;
	}
}
