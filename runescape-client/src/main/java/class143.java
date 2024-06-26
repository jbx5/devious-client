import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fr")
public enum class143 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1663(0, 0),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1666(1, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1662(2, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1667(3, 3),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1671(4, 4),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1670(5, 5),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1668(6, 6),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1664(7, 7),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	field1669(8, 8);

	@ObfuscatedName("qo")
	@ObfuscatedGetter(
		intValue = 1820594211
	)
	static int field1673;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 273837669
	)
	final int field1665;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1831211699
	)
	final int field1672;

	class143(int var3, int var4) {
		this.field1665 = var3;
		this.field1672 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2071992588"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1672;
	}
}
