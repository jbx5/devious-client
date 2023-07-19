import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
public enum class128 implements MouseWheel {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	field1524(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	field1516(1, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	field1517(2, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	field1518(3, 3),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Leu;"
	)
	field1521(4, 4);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 903907795
	)
	final int field1520;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -190361949
	)
	final int field1523;

	class128(int var3, int var4) {
		this.field1520 = var3;
		this.field1523 = var4;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1644350448"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1523;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-25"
	)
	static final int method2982(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}
}
