import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fm")
public enum class141 implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1642(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1653(1, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1641(2, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1652(3, 3),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1645(4, 4),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1646(5, 5),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1647(6, 6),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1648(7, 7),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	field1649(8, 8);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	@Export("scriptActiveWidget")
	static Widget scriptActiveWidget;
	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "Lpb;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -614422849
	)
	final int field1643;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 2028799887
	)
	final int field1651;

	class141(int var3, int var4) {
		this.field1643 = var3;
		this.field1651 = var4;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1651;
	}
}
