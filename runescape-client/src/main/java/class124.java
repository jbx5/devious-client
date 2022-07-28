import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("df")
public enum class124 implements MouseWheel {

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1517(3, 0),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1515(1, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1516(2, 2),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1518(4, 3),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Ldf;")
	field1519(0, 4);
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 738141803)
	static int field1522;

	@ObfuscatedName("pl")
	@ObfuscatedGetter(intValue = 455359575)
	static int field1525;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1892548193)
	public final int field1520;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 819854531)
	@Export("id")
	final int id;

	class124(int var3, int var4) {
		this.field1520 = var3;
		this.id = var4;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1790946346")
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}