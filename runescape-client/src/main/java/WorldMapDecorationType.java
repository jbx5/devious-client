import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4010(0, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3994(1, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3995(2, 0),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4008(3, 0),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3997(9, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4004(4, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4002(5, 1),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4000(6, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3998(7, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3996(8, 1),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3993(12, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4003(13, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4001(14, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4006(15, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4007(16, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field3999(17, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4009(18, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4005(19, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4011(20, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4012(21, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4013(10, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4014(11, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Loi;"
	)
	field4015(22, 3);

	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1516079251
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
