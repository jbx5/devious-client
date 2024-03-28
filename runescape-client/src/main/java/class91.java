import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
public enum class91 implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1120(0, -1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1110(1, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1115(2, 3),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1109(3, 4),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1112(4, 5),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	field1114(5, 6);

	@ObfuscatedName("jd")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = 145564544
	)
	static int field1119;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1651537883
	)
	final int field1111;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1892234531
	)
	final int field1116;

	class91(int var3, int var4) {
		this.field1111 = var3;
		this.field1116 = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1116;
	}
}
