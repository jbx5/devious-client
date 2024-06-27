import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public enum class92 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	field1116(0, -1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	field1109(1, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	field1110(2, 3),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	field1117(3, 4),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	field1112(4, 5),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	field1113(5, 6);

	@ObfuscatedName("oe")
	@ObfuscatedGetter(
		intValue = 1157769719
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1580717867
	)
	final int field1108;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2123916961
	)
	final int field1115;

	class92(int var3, int var4) {
		this.field1108 = var3;
		this.field1115 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1115;
	}
}
