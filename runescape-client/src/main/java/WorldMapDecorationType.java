import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nr")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3917(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3914(1, 0),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3931(2, 0),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3911(3, 0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3913(9, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3932(4, 1),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3915(5, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3927(6, 1),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3930(7, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3918(8, 1),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3919(12, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3920(13, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3921(14, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3922(15, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3923(16, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3924(17, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3909(18, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3926(19, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3910(20, 2),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3928(21, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3929(10, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3912(11, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnr;"
	)
	field3916(22, 3);

	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -633213699
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "691209479"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "420595556"
	)
	static void method6986(String var0) {
		Login.displayName = class361.method6994(var0);
	}
}
