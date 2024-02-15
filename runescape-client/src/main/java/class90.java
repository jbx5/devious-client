import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
public enum class90 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1116(0, -1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1115(1, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1122(2, 7),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1117(3, 8),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldd;"
	)
	field1118(4, 9);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static IndexedSprite field1121;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -623626351
	)
	final int field1120;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = 1891986127
	)
	final int field1114;

	class90(int var3, int var4) {
		this.field1120 = var3;
		this.field1114 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1114;
	}
}
