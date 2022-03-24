import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapDecorationType")
public enum WorldMapDecorationType implements MouseWheel {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3519(0, 0),
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3516(1, 0),
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3512(2, 0),
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3511(3, 0),
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3514(9, 2),
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3515(4, 1),
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3517(5, 1),
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3510(6, 1),
	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3518(7, 1),
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3531(8, 1),
	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3530(12, 2),
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3521(13, 2),
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3522(14, 2),
	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3523(15, 2),
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3524(16, 2),
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3525(17, 2),
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3526(18, 2),
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3527(19, 2),
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3528(20, 2),
	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3529(21, 2),
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3513(10, 2),
	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3532(11, 2),
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"Lkl;")

	field3520(22, 3);

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 
	-541001393)

	@Export("id")
	public final int id;

	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"0")

	WorldMapDecorationType(int var3, int var4) {
		this.id = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"15")

	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"([Lbr;II[I[II)V", garbageValue = 
	"-2080663785")

	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if ((var11 == (-1)) && (var4[var10] == 1)) {
								var11 = 2001;
							}

							if ((var12 == (-1)) && (var4[var10] == 1)) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var6].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if (((var4[var10] != 1) || (var11 <= var12)) && ((var4[var10] != 0) || (var11 >= var12))) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if ((var11 == (-1)) && (var4[var10] == 1)) {
								var11 = 2001;
							}

							if ((var12 == (-1)) && (var4[var10] == 1)) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = (var0[var5].isMembersOnly()) ? 1 : 0;
							var12 = (var8.isMembersOnly()) ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var12 != var11) {
							if (((var4[var10] != 1) || (var11 >= var12)) && ((var4[var10] != 0) || (var11 <= var12))) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while (var9 );

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			} 

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}}