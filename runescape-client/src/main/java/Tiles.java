import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dm")
@Implements("Tiles")
public final class Tiles {
	@ObfuscatedName("az")
	@Export("Tiles_heights")
	static int[][][] Tiles_heights;
	@ObfuscatedName("ah")
	@Export("Tiles_renderFlags")
	static byte[][][] Tiles_renderFlags;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1803998331
	)
	@Export("Tiles_minPlane")
	static int Tiles_minPlane;
	@ObfuscatedName("at")
	@Export("Tiles_underlays")
	static short[][][] Tiles_underlays;
	@ObfuscatedName("ao")
	@Export("Tiles_shapes")
	static byte[][][] Tiles_shapes;
	@ObfuscatedName("ab")
	static byte[][][] field1028;
	@ObfuscatedName("ai")
	@Export("Tiles_hueMultiplier")
	static int[] Tiles_hueMultiplier;
	@ObfuscatedName("ap")
	static final int[] field1035;
	@ObfuscatedName("av")
	static final int[] field1044;
	@ObfuscatedName("aa")
	static final int[] field1037;
	@ObfuscatedName("aq")
	static final int[] field1038;
	@ObfuscatedName("am")
	static final int[] field1039;
	@ObfuscatedName("ac")
	static final int[] field1040;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -163634451
	)
	@Export("rndHue")
	static int rndHue;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 487670345
	)
	@Export("rndLightness")
	static int rndLightness;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		descriptor = "Ldw;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("qm")
	@ObfuscatedSignature(
		descriptor = "Ltc;"
	)
	static class517 field1043;

	static {
		Tiles_heights = new int[4][105][105];
		Tiles_renderFlags = new byte[4][104][104];
		Tiles_minPlane = 99;
		field1035 = new int[]{1, 2, 4, 8};
		field1044 = new int[]{16, 32, 64, 128};
		field1037 = new int[]{1, 0, -1, 0};
		field1038 = new int[]{0, -1, 0, 1};
		field1039 = new int[]{1, -1, -1, 1};
		field1040 = new int[]{-1, -1, 1, 1};
		rndHue = (int)(Math.random() * 17.0D) - 8;
		rndLightness = (int)(Math.random() * 33.0D) - 16;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "-1678266160"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class404.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIILjp;[Lix;)V"
	)
	static final void method2260(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Scene var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.readIncrSmallSmart();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectComposition var21 = MouseRecorder.getObjectDefinition(var11);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.sizeX;
					int var28 = var21.sizeY;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var23 + var2;
					int var30 = var3 + class307.method5908(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
						int var31 = var1;
						if ((Tiles_renderFlags[1][var29][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						CollisionMap var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						DesktopPlatformInfoProvider.addObjects(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-904736388"
	)
	static boolean method2219() {
		return (Client.drawPlayerNames & 2) != 0;
	}

	@ObfuscatedName("jt")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-13"
	)
	static boolean method2268() {
		return (Client.drawPlayerNames & 8) != 0;
	}
}
