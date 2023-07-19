import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
public enum class218 implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	field2381((byte)-1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	field2378((byte)0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	field2384((byte)1),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lio;"
	)
	field2377((byte)2);

	@ObfuscatedName("dn")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("as")
	public byte field2379;

	class218(byte var3) {
		this.field2379 = var3;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field2379;
	}
}
