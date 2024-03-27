import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3927(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3924(1, 0),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3925(2, 0),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3939(3, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3942(9, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3936(4, 1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3935(5, 1),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3930(6, 1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3945(7, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3932(8, 1),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3933(12, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3934(13, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3926(14, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3931(15, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3937(16, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3938(17, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3928(18, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3940(19, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3941(20, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3944(21, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3943(10, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3929(11, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	field3923(22, 3);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 911586461
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "800883718"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
