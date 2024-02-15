import java.text.DecimalFormat;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cf")
@Implements("Login")
public class Login {
	@ObfuscatedName("aw")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -391415083
	)
	@Export("xPadding")
	static int xPadding;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("runesSprite")
	static IndexedSprite[] runesSprite;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("titlebuttonSprite")
	static IndexedSprite titlebuttonSprite;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	static IndexedSprite field944;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("logoSprite")
	static IndexedSprite logoSprite;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 233350583
	)
	@Export("loginBoxX")
	static int loginBoxX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 447660439
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 184651103
	)
	@Export("Login_loadingPercent")
	static int Login_loadingPercent;
	@ObfuscatedName("av")
	@Export("Login_loadingText")
	static String Login_loadingText;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 1159528191
	)
	@Export("Login_banType")
	static int Login_banType;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -55208961
	)
	static int field977;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -944531309
	)
	@Export("loginIndex")
	static int loginIndex;
	@ObfuscatedName("ch")
	@Export("Login_response0")
	static String Login_response0;
	@ObfuscatedName("co")
	@Export("Login_response1")
	static String Login_response1;
	@ObfuscatedName("cd")
	@Export("Login_response2")
	static String Login_response2;
	@ObfuscatedName("cg")
	@Export("Login_response3")
	static String Login_response3;
	@ObfuscatedName("cn")
	@Export("Login_username")
	static String Login_username;
	@ObfuscatedName("cz")
	@Export("Login_password")
	static String Login_password;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 2098794601
	)
	static int field961;
	@ObfuscatedName("cm")
	static String[] field962;
	@ObfuscatedName("ce")
	@Export("displayName")
	static String displayName;
	@ObfuscatedName("cc")
	static boolean field979;
	@ObfuscatedName("cb")
	static boolean field965;
	@ObfuscatedName("cr")
	@Export("rememberUsername")
	static boolean rememberUsername;
	@ObfuscatedName("dg")
	@ObfuscatedGetter(
		intValue = 533840019
	)
	@Export("currentLoginField")
	static int currentLoginField;
	@ObfuscatedName("dl")
	@Export("worldSelectOpen")
	static boolean worldSelectOpen;
	@ObfuscatedName("dd")
	@ObfuscatedGetter(
		intValue = -580995681
	)
	@Export("hoveredWorldIndex")
	static int hoveredWorldIndex;
	@ObfuscatedName("dh")
	@ObfuscatedGetter(
		intValue = -1532341797
	)
	@Export("worldSelectPage")
	static int worldSelectPage;
	@ObfuscatedName("dj")
	@ObfuscatedGetter(
		intValue = 158374319
	)
	@Export("worldSelectPagesCount")
	static int worldSelectPagesCount;
	@ObfuscatedName("ds")
	@ObfuscatedGetter(
		longValue = 4637828618921795853L
	)
	static long field974;
	@ObfuscatedName("dy")
	@ObfuscatedGetter(
		longValue = 644186663484815623L
	)
	static long field975;
	@ObfuscatedName("dz")
	static String[] field949;
	@ObfuscatedName("dp")
	static String[] field945;
	@ObfuscatedName("de")
	static String[] field946;

	static {
		xPadding = 0;
		loginBoxX = xPadding + 202;
		Login_loadingPercent = 10;
		Login_loadingText = "";
		Login_banType = -1;
		field977 = 1;
		loginIndex = 0;
		Login_response0 = "";
		Login_response1 = "";
		Login_response2 = "";
		Login_response3 = "";
		Login_username = "";
		Login_password = "";
		field961 = 0;
		field962 = new String[8];
		displayName = "";
		field979 = false;
		field965 = false;
		rememberUsername = true;
		currentLoginField = 0;
		worldSelectOpen = false;
		hoveredWorldIndex = -1;
		worldSelectPage = 0;
		worldSelectPagesCount = 0;
		new DecimalFormat("##0.00");
		new class136();
		field974 = -1L;
		field975 = -1L;
		field949 = new String[]{"title.jpg"};
		field945 = new String[]{"logo", "logo_deadman_mode", "logo_seasonal_mode", "titlebox", "titlebutton", "titlebutton_large", "play_now_text", "titlebutton_wide42,1", "runes", "title_mute", "options_radio_buttons,0", "options_radio_buttons,2", "options_radio_buttons,4", "options_radio_buttons,6", "sl_back", "sl_flags", "sl_arrows", "sl_stars", "sl_button"};
		field946 = new String[]{"logo_speedrunning"};
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;I)V",
		garbageValue = "-276917317"
	)
	public static void method2192(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		VarpDefinition.field1855 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1394204204"
	)
	public static int method2197(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "2"
	)
	static final void method2200(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					class151.Tiles_underlays2[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if (var5 == var0 + var2 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (var4 == var3 + var1 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lpb;Lpb;Lpb;I)V",
		garbageValue = "1368542470"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		xPadding = (GameEngine.canvasWidth - 765) / 2;
		loginBoxX = xPadding + 202;
		loginBoxCenter = loginBoxX + 180;
		byte var3;
		int var4;
		int var7;
		int var9;
		int var25;
		int var30;
		int var38;
		if (worldSelectOpen) {
			if (Timer.worldSelectBackSprites == null) {
				Timer.worldSelectBackSprites = StructComposition.method3877(class311.archive8, "sl_back", "");
			}

			if (class162.worldSelectFlagSprites == null) {
				class162.worldSelectFlagSprites = FloorOverlayDefinition.getFont(class311.archive8, "sl_flags", "");
			}

			if (World.worldSelectArrows == null) {
				World.worldSelectArrows = FloorOverlayDefinition.getFont(class311.archive8, "sl_arrows", "");
			}

			if (Frames.worldSelectStars == null) {
				Frames.worldSelectStars = FloorOverlayDefinition.getFont(class311.archive8, "sl_stars", "");
			}

			if (WorldMapSectionType.worldSelectLeftSprite == null) {
				WorldMapSectionType.worldSelectLeftSprite = class173.SpriteBuffer_getIndexedSpriteByName(class311.archive8, "leftarrow", "");
			}

			if (class516.worldSelectRightSprite == null) {
				class516.worldSelectRightSprite = class173.SpriteBuffer_getIndexedSpriteByName(class311.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", xPadding + 62, 15, 0, -1);
			if (Frames.worldSelectStars != null) {
				Frames.worldSelectStars[1].drawAt(xPadding + 140, 1);
				var1.draw("Members only world", xPadding + 152, 10, 16777215, -1);
				Frames.worldSelectStars[0].drawAt(xPadding + 140, 12);
				var1.draw("Free world", xPadding + 152, 21, 16777215, -1);
			}

			if (World.worldSelectArrows != null) {
				var30 = xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					World.worldSelectArrows[2].drawAt(var30, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var30, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					World.worldSelectArrows[3].drawAt(var30 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var30 + 15, 4);
				}

				var0.draw("World", var30 + 32, 17, 16777215, -1);
				var4 = xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					World.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					World.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var38 = xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					World.worldSelectArrows[2].drawAt(var38, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var38, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					World.worldSelectArrows[3].drawAt(var38 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var38 + 15, 4);
				}

				var0.draw("Location", var38 + 32, 17, 16777215, -1);
				var25 = xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					World.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					World.worldSelectArrows[0].drawAt(var25, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					World.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					World.worldSelectArrows[1].drawAt(var25 + 15, 4);
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", xPadding + 708 + 25, 16, 16777215, -1);
			hoveredWorldIndex = -1;
			if (Timer.worldSelectBackSprites != null) {
				var3 = 88;
				byte var36 = 19;
				var38 = 765 / (var3 + 1) - 1;
				var25 = 480 / (var36 + 1);

				int var33;
				do {
					var7 = var25;
					var33 = var38;
					if (var25 * (var38 - 1) >= World.World_count) {
						--var38;
					}

					if (var38 * (var25 - 1) >= World.World_count) {
						--var25;
					}

					if (var38 * (var25 - 1) >= World.World_count) {
						--var25;
					}
				} while(var7 != var25 || var33 != var38);

				var7 = (765 - var3 * var38) / (var38 + 1);
				if (var7 > 5) {
					var7 = 5;
				}

				var33 = (480 - var36 * var25) / (var25 + 1);
				if (var33 > 5) {
					var33 = 5;
				}

				var9 = (765 - var3 * var38 - var7 * (var38 - 1)) / 2;
				int var35 = (480 - var25 * var36 - var33 * (var25 - 1)) / 2;
				int var11 = (var25 + World.World_count - 1) / var25;
				worldSelectPagesCount = var11 - var38;
				if (WorldMapSectionType.worldSelectLeftSprite != null && worldSelectPage > 0) {
					WorldMapSectionType.worldSelectLeftSprite.drawAt(8, WorldMapArea.canvasHeight / 2 - WorldMapSectionType.worldSelectLeftSprite.subHeight / 2);
				}

				if (class516.worldSelectRightSprite != null && worldSelectPage < worldSelectPagesCount) {
					class516.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class516.worldSelectRightSprite.subWidth - 8, WorldMapArea.canvasHeight / 2 - class516.worldSelectRightSprite.subHeight / 2);
				}

				int var12 = var35 + 23;
				int var13 = var9 + xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = worldSelectPage;

				int var17;
				for (var17 = var25 * var16; var17 < World.World_count && var16 - worldSelectPage < var38; ++var17) {
					World var18 = WorldMapID.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					class109 var21 = null;
					int var22 = 0;
					if (var18.isBeta()) {
						var21 = var18.isMembersOnly() ? class109.field1404 : class109.field1397;
					} else if (var18.isDeadman()) {
						var21 = var18.isMembersOnly() ? class109.field1406 : class109.field1405;
					} else if (var18.method1829()) {
						var22 = 16711680;
						var21 = var18.isMembersOnly() ? class109.field1396 : class109.field1395;
					} else if (var18.method1819()) {
						var21 = var18.isMembersOnly() ? class109.field1401 : class109.field1399;
					} else if (var18.isPvp()) {
						var21 = var18.isMembersOnly() ? class109.field1394 : class109.field1393;
					} else if (var18.method1820()) {
						var21 = var18.isMembersOnly() ? class109.field1400 : class109.field1402;
					} else if (var18.method1838()) {
						var21 = var18.isMembersOnly() ? class109.field1390 : class109.field1403;
					}

					if (var21 == null || var21.field1407 >= Timer.worldSelectBackSprites.length) {
						var21 = var18.isMembersOnly() ? class109.field1392 : class109.field1391;
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var13 + var3 && MouseHandler.MouseHandler_y < var36 + var12 && var19) {
						hoveredWorldIndex = var17;
						Timer.worldSelectBackSprites[var21.field1407].drawTransOverlayAt(var13, var12, 128, 16777215);
						var15 = true;
					} else {
						Timer.worldSelectBackSprites[var21.field1407].drawAt(var13, var12);
					}

					if (class162.worldSelectFlagSprites != null) {
						class162.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var36 / 2 + var12 + 5, var22, -1);
					var1.drawCentered(var20, var13 + 60, var36 / 2 + var12 + 5, 268435455, -1);
					var12 = var12 + var33 + var36;
					++var14;
					if (var14 >= var25) {
						var12 = var35 + 23;
						var13 = var13 + var7 + var3;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(WorldMapID.World_worlds[hoveredWorldIndex].activity) + 6;
					int var28 = var1.ascent + 8;
					int var37 = MouseHandler.MouseHandler_y + 25;
					if (var37 + var28 > 480) {
						var37 = MouseHandler.MouseHandler_y - 25 - var28;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var28, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var28, 0);
					var1.drawCentered(WorldMapID.World_worlds[hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			leftTitleSprite.drawAt(xPadding, 0);
			WorldMapLabelSize.rightTitleSprite.drawAt(xPadding + 382, 0);
			logoSprite.drawAt(xPadding + 382 - logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(loginBoxX + 180 - 150, var4 + 2, Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login_loadingPercent * 3 + (loginBoxX + 180 - 150), var4 + 2, 300 - Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login_loadingText, loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			short var29;
			short var31;
			if (Client.gameState == 20) {
				class155.titleboxSprite.drawAt(loginBoxX + 180 - class155.titleboxSprite.subWidth / 2, 271 - class155.titleboxSprite.subHeight / 2);
				var29 = 201;
				var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0);
				var30 = var29 + 15;
				var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0);
				var30 += 15;
				var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0);
				var30 += 15;
				var30 += 7;
				if (loginIndex != 4 && loginIndex != 10) {
					var0.draw("Login: ", loginBoxX + 180 - 110, var30, 16777215, 0);
					var31 = 200;

					for (var5 = class207.method4107(); var0.stringWidth(var5) > var31; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), loginBoxX + 180 - 70, var30, 16777215, 0);
					var30 += 15;

					for (var6 = class368.method7012(Login_password); var0.stringWidth(var6) > var31; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6, loginBoxX + 180 - 108, var30, 16777215, 0);
					var30 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				class155.titleboxSprite.drawAt(loginBoxX, 171);
				short var23;
				if (loginIndex == 0) {
					var29 = 251;
					var0.drawCentered("Welcome to RuneScape", loginBoxX + 180, var29, 16776960, 0);
					var30 = var29 + 30;
					var4 = loginBoxX + 180 - 80;
					var23 = 291;
					titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = loginBoxX + 180 + 80;
					titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (loginIndex == 1) {
					var0.drawCentered(Login_response0, loginBoxX + 180, 201, 16776960, 0);
					var29 = 236;
					var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16777215, 0);
					var30 = var29 + 15;
					var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16777215, 0);
					var30 += 15;
					var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16777215, 0);
					var30 += 15;
					var4 = loginBoxX + 180 - 80;
					var23 = 321;
					titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = loginBoxX + 180 + 80;
					titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (loginIndex == 2) {
					var29 = 201;
					var0.drawCentered(Login_response1, loginBoxCenter, var29, 16776960, 0);
					var30 = var29 + 15;
					var0.drawCentered(Login_response2, loginBoxCenter, var30, 16776960, 0);
					var30 += 15;
					var0.drawCentered(Login_response3, loginBoxCenter, var30, 16776960, 0);
					var30 += 15;
					var30 += 7;
					var0.draw("Login: ", loginBoxCenter - 110, var30, 16777215, 0);
					var31 = 200;

					for (var5 = class207.method4107(); var0.stringWidth(var5) > var31; var5 = var5.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (currentLoginField == 0 & Client.cycle % 40 < 20 ? class370.colorStartTag(16776960) + "|" : ""), loginBoxCenter - 70, var30, 16777215, 0);
					var30 += 15;

					for (var6 = class368.method7012(Login_password); var0.stringWidth(var6) > var31; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6 + (currentLoginField == 1 & Client.cycle % 40 < 20 ? class370.colorStartTag(16776960) + "|" : ""), loginBoxCenter - 108, var30, 16777215, 0);
					var30 += 15;
					var29 = 277;
					var7 = loginBoxCenter + -117;
					IndexedSprite var26 = Players.method2785(Client.Login_isUsernameRemembered, field979);
					var26.drawAt(var7, var29);
					var7 = var7 + var26.subWidth + 5;
					var1.draw("Remember username", var7, var29 + 13, 16776960, 0);
					var7 = loginBoxCenter + 24;
					var26 = Players.method2785(class30.clientPreferences.isUsernameHidden(), field965);
					var26.drawAt(var7, var29);
					var7 = var7 + var26.subWidth + 5;
					var1.draw("Hide username", var7, var29 + 13, 16776960, 0);
					var30 = var29 + 15;
					var9 = loginBoxCenter - 80;
					short var10 = 321;
					titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
					var0.drawCentered("Login", var9, var10 + 5, 16777215, 0);
					var9 = loginBoxCenter + 80;
					titlebuttonSprite.drawAt(var9 - 73, var10 - 20);
					var0.drawCentered("Cancel", var9, var10 + 5, 16777215, 0);
					var29 = 357;
					switch(field977) {
					case 2:
						GameEngine.field217 = "Having trouble logging in?";
						break;
					default:
						GameEngine.field217 = "Can't login? Click here.";
					}

					HttpMethod.field35 = new Bounds(loginBoxCenter, var29, var1.stringWidth(GameEngine.field217), 11);
					SpriteMask.field3613 = new Bounds(loginBoxCenter, var29, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(GameEngine.field217, loginBoxCenter, var29, 16777215, 0);
				} else if (loginIndex == 3) {
					var29 = 201;
					var0.drawCentered("Incorrect username or password.", loginBoxX + 180, var29, 16776960, 0);
					var30 = var29 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", loginBoxX + 180, var30, 16776960, 0);
					var30 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", loginBoxX + 180, var30, 16776960, 0);
					var30 += 15;
					var4 = loginBoxX + 180;
					var23 = 276;
					titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = loginBoxX + 180;
					var23 = 326;
					titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var8;
					if (loginIndex == 4) {
						var0.drawCentered("Authenticator", loginBoxX + 180, 201, 16776960, 0);
						var29 = 236;
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16777215, 0);
						var30 = var29 + 15;
						var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16777215, 0);
						var30 += 15;
						var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16777215, 0);
						var30 += 15;
						var0.draw("PIN: " + class368.method7012(MenuAction.otp) + (Client.cycle % 40 < 20 ? class370.colorStartTag(16776960) + "|" : ""), loginBoxX + 180 - 108, var30, 16777215, 0);
						var30 -= 8;
						var0.draw("Trust this computer", loginBoxX + 180 - 9, var30, 16776960, 0);
						var30 += 15;
						var0.draw("for 30 days: ", loginBoxX + 180 - 9, var30, 16776960, 0);
						var4 = 180 + loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var38 = var30 - var0.ascent;
						IndexedSprite var32;
						if (rememberUsername) {
							var32 = class472.options_buttons_2Sprite;
						} else {
							var32 = class128.options_buttons_0Sprite;
						}

						var32.drawAt(var4, var38);
						var30 += 15;
						var7 = loginBoxX + 180 - 80;
						var8 = 321;
						titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
						var7 = loginBoxX + 180 + 80;
						titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", loginBoxX + 180, var8 + 36, 16777215, 0);
					} else if (loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", loginBoxX + 180, 201, 16776960, 0);
						var29 = 221;
						var2.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0);
						var30 = var29 + 15;
						var2.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0);
						var30 += 15;
						var2.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0);
						var30 += 15;
						var30 += 14;
						var0.draw("Username/email: ", loginBoxX + 180 - 145, var30, 16777215, 0);
						var31 = 174;

						for (var5 = class207.method4107(); var0.stringWidth(var5) > var31; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class370.colorStartTag(16776960) + "|" : ""), loginBoxX + 180 - 34, var30, 16777215, 0);
						var30 += 15;
						var25 = loginBoxX + 180 - 80;
						short var34 = 321;
						titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Recover", var25, var34 + 5, 16777215, 0);
						var25 = loginBoxX + 180 + 80;
						titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0);
						var34 = 356;
						var1.drawCentered("Still having trouble logging in?", loginBoxCenter, var34, 268435455, 0);
					} else if (loginIndex == 6) {
						var29 = 201;
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0);
						var30 = var29 + 15;
						var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0);
						var30 += 15;
						var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0);
						var30 += 15;
						var4 = loginBoxX + 180;
						var23 = 321;
						titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (loginIndex == 7) {
						if (GameObject.field3131 && !Client.onMobile) {
							var29 = 201;
							var0.drawCentered(Login_response1, loginBoxCenter, var29, 16776960, 0);
							var30 = var29 + 15;
							var0.drawCentered(Login_response2, loginBoxCenter, var30, 16776960, 0);
							var30 += 15;
							var0.drawCentered(Login_response3, loginBoxCenter, var30, 16776960, 0);
							var4 = loginBoxCenter - 150;
							var30 += 10;

							for (var38 = 0; var38 < 8; ++var38) {
								titlebuttonSprite.method9884(var4, var30, 30, 40);
								boolean var39 = var38 == field961 & Client.cycle % 40 < 20;
								var0.draw((field962[var38] == null ? "" : field962[var38]) + (var39 ? class370.colorStartTag(16776960) + "|" : ""), var4 + 10, var30 + 27, 16777215, 0);
								if (var38 != 1 && var38 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var30 + 27, 16777215, 0);
								}
							}

							var38 = loginBoxCenter - 80;
							short var40 = 321;
							titlebuttonSprite.drawAt(var38 - 73, var40 - 20);
							var0.drawCentered("Submit", var38, var40 + 5, 16777215, 0);
							var38 = loginBoxCenter + 80;
							titlebuttonSprite.drawAt(var38 - 73, var40 - 20);
							var0.drawCentered("Cancel", var38, var40 + 5, 16777215, 0);
						} else {
							var29 = 216;
							var0.drawCentered("Your date of birth isn't set.", loginBoxX + 180, var29, 16776960, 0);
							var30 = var29 + 15;
							var2.drawCentered("Please verify your account status by", loginBoxX + 180, var30, 16776960, 0);
							var30 += 15;
							var2.drawCentered("setting your date of birth.", loginBoxX + 180, var30, 16776960, 0);
							var30 += 15;
							var4 = loginBoxX + 180 - 80;
							var23 = 321;
							titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = loginBoxX + 180 + 80;
							titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (loginIndex == 8) {
						var29 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", loginBoxX + 180, var29, 16776960, 0);
						var30 = var29 + 15;
						var2.drawCentered("For more information, please take a look at", loginBoxX + 180, var30, 16776960, 0);
						var30 += 15;
						var2.drawCentered("our privacy policy.", loginBoxX + 180, var30, 16776960, 0);
						var30 += 15;
						var4 = loginBoxX + 180 - 80;
						var23 = 321;
						titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = loginBoxX + 180 + 80;
						titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (loginIndex == 9) {
						var29 = 221;
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0);
						var30 = var29 + 25;
						var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0);
						var30 += 25;
						var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0);
						var4 = loginBoxX + 180;
						var23 = 311;
						titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (loginIndex == 10) {
						var30 = loginBoxX + 180;
						var31 = 209;
						var0.drawCentered("Welcome to RuneScape", loginBoxX + 180, var31, 16776960, 0);
						var4 = var31 + 20;
						field944.drawAt(var30 - 109, var4);
						if (displayName.isEmpty()) {
							class90.field1121.drawAt(var30 - 48, var4 + 18);
						} else {
							class90.field1121.drawAt(var30 - 48, var4 + 5);
							var0.drawCentered(displayName, var30, var4 + 68 - 15, 16776960, 0);
						}
					} else if (loginIndex == 12) {
						var30 = loginBoxCenter;
						var31 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var30, var31, 16777215, 0);
						var4 = var31 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var30, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var30, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var30, var4, 16777215, 0);
						var30 = loginBoxCenter - 80;
						var31 = 311;
						titlebuttonSprite.drawAt(var30 - 73, var31 - 20);
						var0.drawCentered("Accept", var30, var31 + 5, 16777215, 0);
						var30 = loginBoxCenter + 80;
						titlebuttonSprite.drawAt(var30 - 73, var31 - 20);
						var0.drawCentered("Decline", var30, var31 + 5, 16777215, 0);
					} else if (loginIndex == 13) {
						var29 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", loginBoxX + 180, var29, 16777215, 0);
						var30 = var29 + 20;
						var2.drawCentered("and end user licence agreement to continue.", loginBoxX + 180, var30, 16777215, 0);
						var4 = loginBoxX + 180;
						var29 = 311;
						titlebuttonSprite.drawAt(var4 - 73, var29 - 20);
						var0.drawCentered("Back", var4, var29 + 5, 16777215, 0);
					} else if (loginIndex == 14) {
						var29 = 201;
						String var24 = "";
						var5 = "";
						var6 = "";
						switch(Login_banType) {
						case 0:
							var24 = "Your account has been involved";
							var5 = "in serious rule breaking.";
							var6 = "";
							break;
						case 1:
							var24 = "Your account has been locked due to";
							var5 = "suspicious activity.";
							var6 = "Please recover your account.";
							break;
						case 2:
							var24 = "The unpaid balance on your account needs";
							var5 = "to be resolved before you can play.";
							var6 = Strings.field4010;
							break;
						default:
							class148.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, loginBoxX + 180, var29, 16776960, 0);
						var30 = var29 + 20;
						var0.drawCentered(var5, loginBoxX + 180, var30, 16776960, 0);
						var30 += 20;
						var0.drawCentered(var6, loginBoxX + 180, var30, 16776960, 0);
						var7 = loginBoxX + 180;
						var8 = 276;
						titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						if (Login_banType == 1) {
							var0.drawCentered("Recover Account", var7, var8 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var7, var8 + 5, 16777215, 0);
						}

						var7 = loginBoxX + 180;
						var8 = 326;
						titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
					} else if (loginIndex == 24) {
						var29 = 221;
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16777215, 0);
						var30 = var29 + 15;
						var0.drawCentered(Login_response2, loginBoxX + 180, var30, 16777215, 0);
						var30 += 15;
						var0.drawCentered(Login_response3, loginBoxX + 180, var30, 16777215, 0);
						var30 += 15;
						var4 = loginBoxX + 180;
						var23 = 301;
						titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (loginIndex == 32) {
						var29 = 216;
						var0.drawCentered("Your date of birth isn't set.", loginBoxX + 180, var29, 16776960, 0);
						var30 = var29 + 15;
						var2.drawCentered("Please verify your account status by", loginBoxX + 180, var30, 16776960, 0);
						var30 += 15;
						var2.drawCentered("setting your date of birth.", loginBoxX + 180, var30, 16776960, 0);
						var30 += 15;
						var4 = loginBoxX + 180 - 80;
						var23 = 321;
						titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = loginBoxX + 180 + 80;
						titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (loginIndex == 33) {
						var29 = 201;
						var0.drawCentered(Login_response1, loginBoxX + 180, var29, 16776960, 0);
						var30 = var29 + 20;
						var1.drawCentered(Login_response2, loginBoxX + 180, var30, 16776960, 0);
						var30 += 20;
						var1.drawCentered(Login_response3, loginBoxX + 180, var30, 16776960, 0);
						var30 += 15;
						var4 = loginBoxX + 180;
						var23 = 276;
						titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
						var4 = loginBoxX + 180;
						var23 = 326;
						titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var27 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var27);
				Rasterizer2D.Rasterizer2D_setClip(xPadding, 0, xPadding + 765, WorldMapArea.canvasHeight);
				class325.loginScreenRunesAnimation.draw(xPadding - 22, Client.cycle);
				class325.loginScreenRunesAnimation.draw(xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var27);
			}

			class169.title_muteSprite[class30.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == WorldMapCacheName.clientLanguage) {
				if (ModeWhere.field4514 != null) {
					var30 = xPadding + 5;
					var31 = 463;
					byte var42 = 100;
					byte var41 = 35;
					ModeWhere.field4514.drawAt(var30, var31);
					var0.drawCentered("World" + " " + Client.worldId, var42 / 2 + var30, var41 / 2 + var31 - 2, 16777215, 0);
					if (PacketBufferNode.World_request != null) {
						var1.drawCentered("Loading...", var42 / 2 + var30, var41 / 2 + var31 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var42 / 2 + var30, var41 / 2 + var31 + 12, 16777215, 0);
					}
				} else {
					ModeWhere.field4514 = class173.SpriteBuffer_getIndexedSpriteByName(class311.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-771978879"
	)
	static int method2199(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			NPCComposition var6 = VarcInt.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = VarcInt.getNpcDefinition(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3703(var4);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.method3712(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = VarcInt.getNpcDefinition(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Lom;Ljava/lang/String;I)V",
		garbageValue = "825713592"
	)
	static void method2168(Archive var0, String var1) {
		ArchiveLoader var2 = new ArchiveLoader(var0, var1);
		Client.archiveLoaders.add(var2);
		Client.field786 += var2.groupCount;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1626097121"
	)
	static final void method2178() {
		for (int var0 = 0; var0 < Client.npcCount; ++var0) {
			int var1 = Client.npcIndices[var0];
			NPC var2 = Client.npcs[var1];
			if (var2 != null) {
				ScriptEvent.updateActorSequence(var2, var2.definition.size);
			}
		}

	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIIIIII)V",
		garbageValue = "301311770"
	)
	static final void method2201(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field717) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}

		Client.field717 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				UserComparator5.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				UserComparator5.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}

				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				UserComparator5.invalidateWidget(var0);
				Client.field717 = true;
			}
		}

		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				UserComparator5.invalidateWidget(var0);
			}
		}

	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "-70"
	)
	static boolean method2193(int var0) {
		for (int var1 = 0; var1 < Client.field706; ++var1) {
			if (Client.field768[var1] == var0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-47"
	)
	public static void method2195(int var0, int var1, int var2, boolean var3) {
		PacketBufferNode var4 = ViewportMouse.getPacketBufferNode(ClientPacket.field3257, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeShort(var1);
		var4.packetBuffer.writeShort(var0);
		var4.packetBuffer.writeIntLE(var3 ? Client.revision : 0);
		var4.packetBuffer.writeByte(var2);
		Client.packetWriter.addNode(var4);
	}
}
