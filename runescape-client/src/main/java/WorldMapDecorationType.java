import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field3999(0, 0),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4009(1, 0),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4000(2, 0),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4007(3, 0),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field3995(9, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field3996(4, 1),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field3997(5, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4006(6, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field3992(7, 1),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4002(8, 1),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4014(12, 2),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field3993(13, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4003(14, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4004(15, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4005(16, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field3991(17, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4001(18, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4008(19, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field3994(20, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4010(21, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4011(10, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4012(11, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lox;"
	)
	field4013(22, 3);

	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1134257479
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
