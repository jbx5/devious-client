import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public enum class131 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1570(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1566(1, 1),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1573(2, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1568(3, 3),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lfk;"
	)
	field1569(4, 4);

	@ObfuscatedName("ah")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -840155439
	)
	final int field1567;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -163051881
	)
	final int field1571;

	class131(int var3, int var4) {
		this.field1567 = var3;
		this.field1571 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1571;
	}
}
