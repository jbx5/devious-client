import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3894(0, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3885(1, 0),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3886(2, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3887(3, 0),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3884(9, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3889(4, 1),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3900(5, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3891(6, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3892(7, 1),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3898(8, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3908(12, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3895(13, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3893(14, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3897(15, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3903(16, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3899(17, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3896(18, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3901(19, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3902(20, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3907(21, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3904(10, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3905(11, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3906(22, 3);

	@ObfuscatedName("fa")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive12")
	static Archive archive12;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1372693611
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
