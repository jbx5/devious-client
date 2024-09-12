import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("om")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4050(0, 0),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4040(1, 0),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4061(2, 0),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4042(3, 0),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4043(9, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4044(4, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4045(5, 1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4055(6, 1),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4047(7, 1),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4053(8, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4049(12, 2),
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4048(13, 2),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4051(14, 2),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4046(15, 2),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4039(16, 2),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4054(17, 2),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4057(18, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4056(19, 2),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4041(20, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4058(21, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4059(10, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4060(11, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lom;"
	)
	field4052(22, 3);

	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1959052989
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "49"
	)
	static final int method7425(int var0, int var1, int var2, int var3) {
		int var4 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var2 * 1024 / var3] >> 1;
		return ((65536 - var4) * var0 >> 16) + (var4 * var1 >> 16);
	}
}
