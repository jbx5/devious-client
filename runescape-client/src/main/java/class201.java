import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
public class class201 extends DualNode {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("field1909")
	public static EvictingDualNodeHashTable field1909;

	static {
		field1909 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IZS)Ljava/lang/String;",
		garbageValue = "8489"
	)
	@Export("intToString")
	public static String intToString(int var0, boolean var1) {
		if (var1 && var0 >= 0) {
			int var3 = var0;
			String var2;
			if (var1 && var0 >= 0) {
				int var4 = 2;

				for (int var5 = var0 / 10; var5 != 0; ++var4) {
					var5 /= 10;
				}

				char[] var6 = new char[var4];
				var6[0] = '+';

				for (int var7 = var4 - 1; var7 > 0; --var7) {
					int var8 = var3;
					var3 /= 10;
					int var9 = var8 - var3 * 10;
					if (var9 >= 10) {
						var6[var7] = (char)(var9 + 87);
					} else {
						var6[var7] = (char)(var9 + 48);
					}
				}

				var2 = new String(var6);
			} else {
				var2 = Integer.toString(var0, 10);
			}

			return var2;
		} else {
			return Integer.toString(var0);
		}
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "-1721987072"
	)
	static void method3827(WorldView var0) {
		int var1 = var0.sizeX / 8;
		int var2 = var0.sizeY / 8;
		boolean var3 = false;
		class7.method55(false);
		var3 = true;

		int var4;
		for (var4 = 0; var4 < HttpContentType.field5041.length; ++var4) {
			if (class30.field147[var4] != -1 && HttpContentType.field5041[var4] == null) {
				HttpContentType.field5041[var4] = class157.archive9.takeFile(class30.field147[var4], 0);
				if (HttpContentType.field5041[var4] == null) {
					var3 = false;
				}
			}

			if (class147.field1696[var4] != -1 && class366.field4005[var4] == null) {
				class366.field4005[var4] = class157.archive9.takeFileEncrypted(class147.field1696[var4], 0, ApproximateRouteStrategy.field460[var4]);
				if (class366.field4005[var4] == null) {
					var3 = false;
				}
			}
		}

		if (var3) {
			class7.method55(false);
			var3 = true;

			for (var4 = 0; var4 < HttpContentType.field5041.length; ++var4) {
				byte[] var17 = class366.field4005[var4];
				if (var17 != null) {
					byte var6 = 10;
					byte var7 = 10;
					var3 &= class4.method16(var17, var6, var7);
				}
			}

			if (var3) {
				int var5;
				for (var4 = 0; var4 < 4; ++var4) {
					for (var5 = 0; var5 < var0.tileSettings[var4].length; ++var5) {
						Arrays.fill(var0.tileSettings[var4][var5], (byte)0);
					}
				}

				class157.method3347();
				class224.method4301();
				class60.method1172();
				class7.method55(true);

				int var8;
				int var9;
				int var10;
				int var11;
				int var12;
				int var13;
				int var18;
				for (var4 = 0; var4 < 4; ++var4) {
					class157.method3347();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							boolean var19 = false;
							var8 = Client.field683[var4][var5][var18];
							if (var8 != -1) {
								var9 = var8 >> 24 & 3;
								var10 = var8 >> 1 & 3;
								var11 = var8 >> 14 & 1023;
								var12 = var8 >> 3 & 2047;
								var13 = (var11 / 8 << 8) + var12 / 8;

								for (int var14 = 0; var14 < AABB.field3014.length; ++var14) {
									if (AABB.field3014[var14] == var13 && HttpContentType.field5041[var14] != null) {
										int var15 = (var11 - var5) * 8;
										int var16 = (var12 - var18) * 8;
										FileSystem.method4224(var0, HttpContentType.field5041[var14], var4, var5 * 8, var18 * 8, var9, (var11 & 7) * 8, (var12 & 7) * 8, var10, var15, var16);
										var19 = true;
										break;
									}
								}
							}

							if (!var19) {
								ScriptFrame.method1193(var0.tileHeights, var4, var5 * 8, var18 * 8);
							}
						}
					}
				}

				for (var4 = 0; var4 < 13; ++var4) {
					for (var5 = 0; var5 < 13; ++var5) {
						var18 = Client.field683[0][var4][var5];
						if (var18 == -1) {
							TextureProvider.method5720(var0, var4 * 8, var5 * 8, 8, 8);
						}
					}
				}

				class7.method55(true);

				for (var4 = 0; var4 < 4; ++var4) {
					class157.method3347();

					for (var5 = 0; var5 < var1; ++var5) {
						for (var18 = 0; var18 < var2; ++var18) {
							int var20 = Client.field683[var4][var5][var18];
							if (var20 != -1) {
								var8 = var20 >> 24 & 3;
								var9 = var20 >> 1 & 3;
								var10 = var20 >> 14 & 1023;
								var11 = var20 >> 3 & 2047;
								var12 = (var10 / 8 << 8) + var11 / 8;

								for (var13 = 0; var13 < AABB.field3014.length; ++var13) {
									if (AABB.field3014[var13] == var12 && class366.field4005[var13] != null) {
										Tiles.method2287(var0, class366.field4005[var13], var4, var5 * 8, var18 * 8, var8, (var10 & 7) * 8, (var11 & 7) * 8, var9);
										break;
									}
								}
							}
						}
					}
				}

				class7.method55(true);
				class157.method3347();
				class36.method709(var0);
				class7.method55(true);
				ObjectComposition.ObjectDefinition_cachedModelData.clear();
				class157.method3347();
				class328.method6151();
				Client.field510 = false;
			}
		}
	}
}
