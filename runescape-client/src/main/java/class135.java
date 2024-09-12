import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public enum class135 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1590(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1587(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1588(2, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1594(3, 3),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1591(4, 4);

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "[Lvv;"
	)
	static SpritePixels[] field1593;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1684168881
	)
	final int field1589;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1844905165
	)
	final int field1592;

	class135(int var3, int var4) {
		this.field1589 = var3;
		this.field1592 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1592;
	}
}
