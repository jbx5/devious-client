import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3828(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3824(1, 0),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3825(2, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3826(3, 0),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3844(9, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3840(4, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3829(5, 1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3830(6, 1),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3834(7, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3827(8, 1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3833(12, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3835(13, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3842(14, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3836(15, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3837(16, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3838(17, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3823(18, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3839(19, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3841(20, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3832(21, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3843(10, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3846(11, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	field3845(22, 3);

	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 480633771
	)
	@Export("id")
	public final int id;

	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "0"
	)
	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
