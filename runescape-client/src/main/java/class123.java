import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("db")
public enum class123 implements MouseWheel {

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Ldb;")
	field1508(0, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Ldb;")
	field1515(1, 1),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Ldb;")
	field1507(2, 2),
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Ldb;")
	field1512(3, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldb;")
	field1509(4, 4),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldb;")
	field1518(5, 5),
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Ldb;")
	field1511(6, 6),
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Ldb;")
	field1510(7, 7),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ldb;")
	field1513(8, 8);
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 373388961)
	static int field1517;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -467457373)
	final int field1514;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 1623865199)
	final int field1506;

	class123(int var3, int var4) {
		this.field1514 = var3;
		this.field1506 = var4;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "104")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1506;
	}
}