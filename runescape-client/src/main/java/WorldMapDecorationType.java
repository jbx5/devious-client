import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("of")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4066(0, 0),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4063(1, 0),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4064(2, 0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4065(3, 0),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4080(9, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4067(4, 1),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4068(5, 1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4069(6, 1),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4070(7, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4084(8, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4072(12, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4076(13, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4074(14, 2),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4078(15, 2),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4079(16, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4077(17, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4082(18, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4075(19, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4073(20, 2),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4081(21, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4062(10, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4083(11, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	field4071(22, 3);

	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 938087275
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1837624059"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}
}
