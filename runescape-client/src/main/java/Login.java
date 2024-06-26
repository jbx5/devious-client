import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
@Implements("Login")
public class Login {
	@ObfuscatedName("ad")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 48347693
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field922;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	static IndexedSprite field945;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 769603281
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 3332333
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1109948055
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("am")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -782608359
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = 920051483
	)
	static int field932;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = -59444677
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("cv")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("cl")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cm")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cg")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cu")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cn")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = 1139372411
	)
	static int field950;
	@ObfuscatedName("ch")
	static String[] field941;
	@ObfuscatedName("cs")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("cb")
	static boolean field943;
	@ObfuscatedName("cz")
	static boolean field959;
	@ObfuscatedName("ca")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("df")
	@ObfuscatedGetter(
		intValue = 1276208829
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dn")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("di")
	@ObfuscatedGetter(
		intValue = 1391907999
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dt")
	@ObfuscatedGetter(
		intValue = -2077730609
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("da")
	@ObfuscatedGetter(
		intValue = -1867410509
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("dz")
	@ObfuscatedGetter(
		longValue = 5231889937501240551L
	)
	static long field953;
	@ObfuscatedName("dc")
	@ObfuscatedGetter(
		longValue = 7259940804597753815L
	)
	static long field954;
	@ObfuscatedName("dy")
	static String[] field955;
	@ObfuscatedName("dw")
	static String[] field940;
	@ObfuscatedName("dh")
	static String[] field942;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field932 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field950 = 0;
		field941 = new String[8];
		displayName = "";
		field943 = false;
		field959 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class138();
		field953 = -1L;
		field954 = -1L;
		field955 = new String[]{"title.jpg"};
		field940 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field942 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lde;[BIIIII)V",
		garbageValue = "-383129273"
	)
	static final void method2220(WorldView var0, byte[] var1, int var2, int var3, int var4, int var5) {
		int var7;
		int var8;
		if (var0.collisionMaps != null) {
			for (int var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 64; ++var7) {
					for (var8 = 0; var8 < 64; ++var8) {
						if (var7 + var2 > 0 && var7 + var2 < var0.collisionMaps[var6].flags.length && var3 + var8 > 0 && var3 + var8 < var0.collisionMaps[var6].flags[var7 + var2].length) {
							int[] var10000 = var0.collisionMaps[var6].flags[var7 + var2];
							var10000[var8 + var3] &= -1073741825;
						}
					}
				}
			}
		}

		Buffer var12 = new Buffer(var1);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					int var10 = var8 + var2;
					int var11 = var3 + var9;
					WorldMapSection1.loadTerrain(var0, var12, var7, var10, var11, var10 + var4, var5 + var11, 0);
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1190216591"
	)
	static final int method2201(int var0, int var1) {
		int var2 = class176.method3563(var0 - 1, var1 - 1) + class176.method3563(1 + var0, var1 - 1) + class176.method3563(var0 - 1, var1 + 1) + class176.method3563(1 + var0, 1 + var1);
		int var3 = class176.method3563(var0 - 1, var1) + class176.method3563(var0 + 1, var1) + class176.method3563(var0, var1 - 1) + class176.method3563(var0, 1 + var1);
		int var4 = class176.method3563(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lde;IIIIIIIILip;S)V",
		garbageValue = "339"
	)
	static final void method2206(WorldView var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, CollisionMap var9) {
		ObjectComposition var10 = HttpRequest.getObjectDefinition(var5);
		int var11 = var8 >= 0 ? var8 : var10.animationId;
		int var12;
		int var13;
		if (var6 != 1 && var6 != 3) {
			var12 = var10.sizeX;
			var13 = var10.sizeY;
		} else {
			var12 = var10.sizeY;
			var13 = var10.sizeX;
		}

		int var14;
		int var15;
		if (var3 + var12 <= var0.sizeX) {
			var14 = var3 + (var12 >> 1);
			var15 = var3 + (var12 + 1 >> 1);
		} else {
			var14 = var3;
			var15 = var3 + 1;
		}

		int var16;
		int var17;
		if (var13 + var4 <= var0.sizeY) {
			var16 = (var13 >> 1) + var4;
			var17 = (var13 + 1 >> 1) + var4;
		} else {
			var16 = var4;
			var17 = var4 + 1;
		}

		int[][] var18 = var0.tileHeights[var2];
		int var19 = var18[var15][var16] + var18[var14][var16] + var18[var14][var17] + var18[var15][var17] >> 2;
		int var20 = (var3 << 7) + (var12 << 6);
		int var21 = (var4 << 7) + (var13 << 6);
		Scene var22 = var0.scene;
		long var23 = FileSystem.calculateTag(var3, var4, 2, var10.int1 == 0, var5, var0.id);
		int var25 = (var6 << 6) + var7;
		if (var10.int3 == 1) {
			var25 += 256;
		}

		Object var33;
		if (var7 == 22) {
			if (var11 == -1 && var10.transforms == null) {
				var33 = var10.getModel(22, var6, var18, var20, var19, var21);
			} else {
				var33 = new DynamicObject(var0, var5, 22, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
			}

			var22.newFloorDecoration(var1, var3, var4, var19, (Renderable)var33, var23, var25);
			if (var10.interactType == 1 && var9 != null) {
				var9.setBlockedByFloorDec(var3, var4);
			}

		} else if (var7 != 10 && var7 != 11) {
			if (var7 >= 12) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.method5424(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
				}

			} else if (var7 == 0) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(0, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, 0, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1040[var6], 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.method4412(var3, var4, var7, var6, var10.boolean1);
				}

			} else if (var7 == 1) {
				if (var11 == -1 && var10.transforms == null) {
					var33 = var10.getModel(1, var6, var18, var20, var19, var21);
				} else {
					var33 = new DynamicObject(var0, var5, 1, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
				}

				var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1041[var6], 0, var23, var25);
				if (var10.interactType != 0 && var9 != null) {
					var9.method4412(var3, var4, var7, var6, var10.boolean1);
				}

			} else {
				int var26;
				if (var7 == 2) {
					var26 = var6 + 1 & 3;
					Object var28;
					Object var34;
					if (var11 == -1 && var10.transforms == null) {
						var34 = var10.getModel(2, var6 + 4, var18, var20, var19, var21);
						var28 = var10.getModel(2, var26, var18, var20, var19, var21);
					} else {
						var34 = new DynamicObject(var0, var5, 2, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						var28 = new DynamicObject(var0, var5, 2, var26, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var34, (Renderable)var28, Tiles.field1040[var6], Tiles.field1040[var26], var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.method4412(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 3) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(3, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, 3, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newBoundaryObject(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1041[var6], 0, var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.method4412(var3, var4, var7, var6, var10.boolean1);
					}

				} else if (var7 == 9) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(var7, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, var7, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.method5424(var1, var3, var4, var19, 1, 1, (Renderable)var33, 0, var23, var25);
					if (var10.interactType != 0 && var9 != null) {
						var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
					}

				} else if (var7 == 4) {
					if (var11 == -1 && var10.transforms == null) {
						var33 = var10.getModel(4, var6, var18, var20, var19, var21);
					} else {
						var33 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
					}

					var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, Tiles.field1040[var6], 0, 0, 0, var23, var25);
				} else {
					long var27;
					Object var29;
					if (var7 == 5) {
						var26 = 16;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var27) {
							var26 = HttpRequest.getObjectDefinition(class229.Entity_unpackID(var27)).int2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, Tiles.field1040[var6], 0, Tiles.field1042[var6] * var26, Tiles.field1043[var6] * var26, var23, var25);
					} else if (var7 == 6) {
						var26 = 8;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (var27 != 0L) {
							var26 = HttpRequest.getObjectDefinition(class229.Entity_unpackID(var27)).int2 / 2;
						}

						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)null, 256, var6, Tiles.field1032[var6] * var26, Tiles.field1045[var6] * var26, var23, var25);
					} else if (var7 == 7) {
						int var32 = var6 + 2 & 3;
						if (var11 == -1 && var10.transforms == null) {
							var33 = var10.getModel(4, var32 + 4, var18, var20, var19, var21);
						} else {
							var33 = new DynamicObject(var0, var5, 4, var32 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var33, (Renderable)null, 256, var32, 0, 0, var23, var25);
					} else if (var7 == 8) {
						var26 = 8;
						var27 = var22.getBoundaryObjectTag(var1, var3, var4);
						if (0L != var27) {
							var26 = HttpRequest.getObjectDefinition(class229.Entity_unpackID(var27)).int2 / 2;
						}

						int var31 = var6 + 2 & 3;
						Object var30;
						if (var11 == -1 && var10.transforms == null) {
							var29 = var10.getModel(4, var6 + 4, var18, var20, var19, var21);
							var30 = var10.getModel(4, var31 + 4, var18, var20, var19, var21);
						} else {
							var29 = new DynamicObject(var0, var5, 4, var6 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
							var30 = new DynamicObject(var0, var5, 4, var31 + 4, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
						}

						var22.newWallDecoration(var1, var3, var4, var19, (Renderable)var29, (Renderable)var30, 256, var6, Tiles.field1032[var6] * var26, Tiles.field1045[var6] * var26, var23, var25);
					}
				}
			}
		} else {
			if (var11 == -1 && var10.transforms == null) {
				var33 = var10.getModel(10, var6, var18, var20, var19, var21);
			} else {
				var33 = new DynamicObject(var0, var5, 10, var6, var2, var3, var4, var11, var10.boolean3, (Renderable)null);
			}

			if (var33 != null) {
				var22.method5424(var1, var3, var4, var19, var12, var13, (Renderable)var33, var7 == 11 ? 256 : 0, var23, var25);
			}

			if (var10.interactType != 0 && var9 != null) {
				var9.addGameObject(var3, var4, var12, var13, var10.boolean1);
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-2104138455"
	)
	static void method2185(int var0, String var1) {
		Login_loadingText = var1;
		Login_loadingPercent = var0;
	}
}
