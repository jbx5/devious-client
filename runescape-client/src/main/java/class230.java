import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
public class class230 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lli;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("dl")
	@ObfuscatedSignature(
		descriptor = "Lun;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("ac")
	final int[][] field2420;
	@ObfuscatedName("al")
	final int[][] field2418;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -992174991
	)
	int field2419;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2040661997
	)
	int field2423;
	@ObfuscatedName("ao")
	final int[] field2421;
	@ObfuscatedName("ah")
	final int[] field2424;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -124856799
	)
	final int field2417;

	class230(int var1, int var2) {
		this.field2420 = new int[var1][var2];
		this.field2418 = new int[var1][var2];
		int var3 = var2 * var1;
		int var4 = EnumComposition.method3749(var3 / 4);
		this.field2421 = new int[var4];
		this.field2424 = new int[var4];
		this.field2417 = var4 - 1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "79"
	)
	void method4343() {
		for (int var1 = 0; var1 < this.field2420.length; ++var1) {
			for (int var2 = 0; var2 < this.field2420[var1].length; ++var2) {
				this.field2420[var1][var2] = 0;
				this.field2418[var1][var2] = 99999999;
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-19"
	)
	void method4344(int var1, int var2) {
		this.field2419 = var1;
		this.field2423 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-9624"
	)
	int method4345() {
		return this.field2419;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-3816"
	)
	int method4346() {
		return this.field2423;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-796520814"
	)
	int method4380() {
		return this.field2420.length;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1493129305"
	)
	int method4348() {
		return this.field2420[0].length;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[[I",
		garbageValue = "-1798810715"
	)
	int[][] method4349() {
		return this.field2420;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)[[I",
		garbageValue = "19"
	)
	int[][] method4350() {
		return this.field2418;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "40"
	)
	int[] method4351() {
		return this.field2421;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "-1267204855"
	)
	int[] method4352() {
		return this.field2424;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2043277042"
	)
	int method4353() {
		return this.field2417;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "-575404360"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (UserComparator3.World_worlds != null) {
			FloorDecoration.doWorldSorting(0, UserComparator3.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZI)I",
		garbageValue = "-527981427"
	)
	public static int method4347(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						throw new NumberFormatException();
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					throw new NumberFormatException();
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * var1;
				if (var9 / var1 != var5) {
					throw new NumberFormatException();
				}

				var5 = var9;
				var4 = true;
			}

			if (!var4) {
				throw new NumberFormatException();
			} else {
				return var5;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
