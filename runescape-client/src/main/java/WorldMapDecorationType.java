import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nx")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3864(0, 0),
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3861(1, 0),
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3851(2, 0),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3846(3, 0),
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3847(9, 2),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3848(4, 1),
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3849(5, 1),
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3850(6, 1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3857(7, 1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3852(8, 1),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3845(12, 2),
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3854(13, 2),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3855(14, 2),
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3860(15, 2),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3843(16, 2),
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3858(17, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3859(18, 2),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3853(19, 2),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3865(20, 2),
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3862(21, 2),
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3863(10, 2),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3856(11, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lnx;"
	)
	field3844(22, 3);

	@ObfuscatedName("fz")
	@ObfuscatedSignature(
		descriptor = "Loh;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1959642215
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

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("jk")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1041005781"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] + Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 >> 7;
			int var9 = var6 * Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
			return var8 * (128 - var7) + var7 * var9 >> 7;
		} else {
			return 0;
		}
	}
}
