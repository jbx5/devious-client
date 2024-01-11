import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ha")
public class class207 extends class222 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -401581131
	)
	int field2264;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lih;"
	)
	final class219 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lih;Ljava/lang/String;I)V"
	)
	class207(class219 var1, String var2, int var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field2264 = var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "945435280"
	)
	public int vmethod4368() {
		return 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1115253500"
	)
	public int vmethod4370() {
		return this.field2264;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpv;Lpv;I)V",
		garbageValue = "413956403"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class524.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class433.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var8;
		boolean var15;
		int var16;
		int var25;
		int var33;
		int var43;
		if (Login.worldSelectOpen) {
			int var47;
			if (class167.worldSelectBackSprites == null) {
				Archive var44 = HttpRequestTask.archive8;
				SpritePixels[] var48;
				if (!var44.isValidFileName("sl_back", "")) {
					var48 = null;
				} else {
					var43 = var44.getGroupId("sl_back");
					var47 = var44.getFileId(var43, "");
					var48 = class217.method4289(var44, var43, var47);
				}

				class167.worldSelectBackSprites = var48;
			}

			if (class131.worldSelectFlagSprites == null) {
				class131.worldSelectFlagSprites = class412.method7748(HttpRequestTask.archive8, "sl_flags", "");
			}

			if (Client.worldSelectArrows == null) {
				Client.worldSelectArrows = class412.method7748(HttpRequestTask.archive8, "sl_arrows", "");
			}

			if (class326.worldSelectStars == null) {
				class326.worldSelectStars = class412.method7748(HttpRequestTask.archive8, "sl_stars", "");
			}

			if (class174.worldSelectLeftSprite == null) {
				class174.worldSelectLeftSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(HttpRequestTask.archive8, "leftarrow", "");
			}

			if (Login.worldSelectRightSprite == null) {
				Login.worldSelectRightSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(HttpRequestTask.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class326.worldSelectStars != null) {
				class326.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class326.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (Client.worldSelectArrows != null) {
				var33 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					Client.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					Client.worldSelectArrows[0].drawAt(var33, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					Client.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					Client.worldSelectArrows[1].drawAt(var33 + 15, 4);
				}

				var0.draw("World", var33 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					Client.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					Client.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					Client.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					Client.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var43 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					Client.worldSelectArrows[2].drawAt(var43, 4);
				} else {
					Client.worldSelectArrows[0].drawAt(var43, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					Client.worldSelectArrows[3].drawAt(var43 + 15, 4);
				} else {
					Client.worldSelectArrows[1].drawAt(var43 + 15, 4);
				}

				var0.draw("Location", var43 + 32, 17, 16777215, -1);
				var47 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					Client.worldSelectArrows[2].drawAt(var47, 4);
				} else {
					Client.worldSelectArrows[0].drawAt(var47, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					Client.worldSelectArrows[3].drawAt(var47 + 15, 4);
				} else {
					Client.worldSelectArrows[1].drawAt(var47 + 15, 4);
				}

				var0.draw("Type", var47 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class167.worldSelectBackSprites != null) {
				var3 = 88;
				byte var40 = 19;
				var43 = 765 / (var3 + 1) - 1;
				var47 = 480 / (var40 + 1);

				do {
					var25 = var47;
					var8 = var43;
					if (var47 * (var43 - 1) >= World.World_count) {
						--var43;
					}

					if (var43 * (var47 - 1) >= World.World_count) {
						--var47;
					}

					if (var43 * (var47 - 1) >= World.World_count) {
						--var47;
					}
				} while(var25 != var47 || var8 != var43);

				var25 = (765 - var3 * var43) / (var43 + 1);
				if (var25 > 5) {
					var25 = 5;
				}

				var8 = (480 - var40 * var47) / (var47 + 1);
				if (var8 > 5) {
					var8 = 5;
				}

				int var28 = (765 - var3 * var43 - var25 * (var43 - 1)) / 2;
				int var37 = (480 - var47 * var40 - var8 * (var47 - 1)) / 2;
				int var38 = (var47 + World.World_count - 1) / var47;
				Login.worldSelectPagesCount = var38 - var43;
				if (class174.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class174.worldSelectLeftSprite.drawAt(8, GameEngine.canvasHeight / 2 - class174.worldSelectLeftSprite.subHeight / 2);
				}

				if (Login.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					Login.worldSelectRightSprite.drawAt(class524.canvasWidth - Login.worldSelectRightSprite.subWidth - 8, GameEngine.canvasHeight / 2 - Login.worldSelectRightSprite.subHeight / 2);
				}

				int var29 = var37 + 23;
				int var30 = var28 + Login.xPadding;
				int var39 = 0;
				var15 = false;
				var16 = Login.worldSelectPage;

				int var41;
				for (var41 = var16 * var47; var41 < World.World_count && var16 - Login.worldSelectPage < var43; ++var41) {
					World var18 = World.World_worlds[var41];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					class108 var21 = null;
					int var22 = 0;
					if (var18.isBeta()) {
						var21 = var18.isMembersOnly() ? class108.field1369 : class108.field1362;
					} else if (var18.isDeadman()) {
						var21 = var18.isMembersOnly() ? class108.field1364 : class108.field1375;
					} else if (var18.method1842()) {
						var22 = 16711680;
						var21 = var18.isMembersOnly() ? class108.field1365 : class108.field1376;
					} else if (var18.method1844()) {
						var21 = var18.isMembersOnly() ? class108.field1371 : class108.field1370;
					} else if (var18.isPvp()) {
						var21 = var18.isMembersOnly() ? class108.field1382 : class108.field1368;
					} else if (var18.method1893()) {
						var21 = var18.isMembersOnly() ? class108.field1373 : class108.field1372;
					} else if (var18.method1858()) {
						var21 = var18.isMembersOnly() ? class108.field1390 : class108.field1374;
					}

					if (var21 == null || var21.field1378 >= class167.worldSelectBackSprites.length) {
						var21 = var18.isMembersOnly() ? class108.field1363 : class108.field1377;
					}

					if (MouseHandler.MouseHandler_x >= var30 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var30 + var3 && MouseHandler.MouseHandler_y < var29 + var40 && var19) {
						Login.hoveredWorldIndex = var41;
						class167.worldSelectBackSprites[var21.field1378].drawTransOverlayAt(var30, var29, 128, 16777215);
						var15 = true;
					} else {
						class167.worldSelectBackSprites[var21.field1378].drawAt(var30, var29);
					}

					if (class131.worldSelectFlagSprites != null) {
						class131.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var30 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var30 + 15, var40 / 2 + var29 + 5, var22, -1);
					var1.drawCentered(var20, var30 + 60, var40 / 2 + var29 + 5, 268435455, -1);
					var29 = var29 + var40 + var8;
					++var39;
					if (var39 >= var47) {
						var29 = var37 + 23;
						var30 = var30 + var25 + var3;
						var39 = 0;
						++var16;
					}
				}

				if (var15) {
					var41 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var31 = var1.ascent + 8;
					int var42 = MouseHandler.MouseHandler_y + 25;
					if (var31 + var42 > 480) {
						var42 = MouseHandler.MouseHandler_y - 25 - var31;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var41 / 2, var42, var41, var31, 0);
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var42 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			Buddy.leftTitleSprite.drawAt(Login.xPadding, 0);
			SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			String var7;
			short var32;
			short var34;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
				var32 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
				var33 = var32 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
				var33 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
				var33 += 15;
				var33 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var33, 16777215, 0);
					var34 = 200;
					var5 = class93.clientPreferences.isUsernameHidden() ? class313.method5999(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var33, 16777215, 0);
					var33 += 15;

					for (var7 = class313.method5999(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var33, 16777215, 0);
					var33 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var32 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var32 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
					var33 = var32 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var32 = 201;
					var0.drawCentered(Login.Login_response1, class433.loginBoxCenter, var32, 16776960, 0);
					var33 = var32 + 15;
					var0.drawCentered(Login.Login_response2, class433.loginBoxCenter, var33, 16776960, 0);
					var33 += 15;
					var0.drawCentered(Login.Login_response3, class433.loginBoxCenter, var33, 16776960, 0);
					var33 += 15;
					var33 += 7;
					var0.draw("Login: ", class433.loginBoxCenter - 110, var33, 16777215, 0);
					var34 = 200;
					var5 = class93.clientPreferences.isUsernameHidden() ? class313.method5999(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class208.colorStartTag(16776960) + "|" : ""), class433.loginBoxCenter - 70, var33, 16777215, 0);
					var33 += 15;

					for (var7 = class313.method5999(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class208.colorStartTag(16776960) + "|" : ""), class433.loginBoxCenter - 108, var33, 16777215, 0);
					var33 += 15;
					var32 = 277;
					var8 = class433.loginBoxCenter + -117;
					boolean var10 = Client.Login_isUsernameRemembered;
					boolean var11 = Login.field928;
					IndexedSprite var9 = var10 ? (var11 ? Decimator.field410 : class402.options_buttons_2Sprite) : (var11 ? class465.field4805 : class182.options_buttons_0Sprite);
					var9.drawAt(var8, var32);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Remember username", var8, var32 + 13, 16776960, 0);
					var8 = class433.loginBoxCenter + 24;
					boolean var14 = class93.clientPreferences.isUsernameHidden();
					var15 = Login.field929;
					IndexedSprite var13 = var14 ? (var15 ? Decimator.field410 : class402.options_buttons_2Sprite) : (var15 ? class465.field4805 : class182.options_buttons_0Sprite);
					var13.drawAt(var8, var32);
					var8 = var8 + var13.subWidth + 5;
					var1.draw("Hide username", var8, var32 + 13, 16776960, 0);
					var33 = var32 + 15;
					var16 = class433.loginBoxCenter - 80;
					short var17 = 321;
					class182.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0);
					var16 = class433.loginBoxCenter + 80;
					class182.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0);
					var32 = 357;
					switch(Login.field916) {
					case 2:
						class143.field1635 = "Having trouble logging in?";
						break;
					default:
						class143.field1635 = "Can't login? Click here.";
					}

					WorldMapSection0.field2593 = new Bounds(class433.loginBoxCenter, var32, var1.stringWidth(class143.field1635), 11);
					class126.field1486 = new Bounds(class433.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(class143.field1635, class433.loginBoxCenter, var32, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var32 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var32, 16776960, 0);
					var33 = var32 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var33, 16776960, 0);
					var33 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var36;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var32 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
						var33 = var32 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var0.draw("PIN: " + class313.method5999(class148.otp) + (Client.cycle % 40 < 20 ? class208.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var33, 16777215, 0);
						var33 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var33, 16776960, 0);
						var33 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var33, 16776960, 0);
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var43 = var33 - var0.ascent;
						IndexedSprite var35;
						if (Login.rememberUsername) {
							var35 = class402.options_buttons_2Sprite;
						} else {
							var35 = class182.options_buttons_0Sprite;
						}

						var35.drawAt(var4, var43);
						var33 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var36 = 321;
						class182.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Continue", var25, var36 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						class182.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Cancel", var25, var36 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var36 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var32 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var33 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var33, 16777215, 0);
						var34 = 174;
						var5 = class93.clientPreferences.isUsernameHidden() ? class313.method5999(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? class208.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var33, 16777215, 0);
						var33 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var36 = 321;
						class182.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						class182.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0);
						var36 = 356;
						var1.drawCentered("Still having trouble logging in?", class433.loginBoxCenter, var36, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var32 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (class373.field4355 && !Client.onMobile) {
							var32 = 201;
							var0.drawCentered(Login.Login_response1, class433.loginBoxCenter, var32, 16776960, 0);
							var33 = var32 + 15;
							var0.drawCentered(Login.Login_response2, class433.loginBoxCenter, var33, 16776960, 0);
							var33 += 15;
							var0.drawCentered(Login.Login_response3, class433.loginBoxCenter, var33, 16776960, 0);
							var4 = class433.loginBoxCenter - 150;
							var33 += 10;

							for (var43 = 0; var43 < 8; ++var43) {
								class182.titlebuttonSprite.method9811(var4, var33, 30, 40);
								boolean var26 = var43 == Login.field924 & Client.cycle % 40 < 20;
								var0.draw((Login.field934[var43] == null ? "" : Login.field934[var43]) + (var26 ? class208.colorStartTag(16776960) + "|" : ""), var4 + 10, var33 + 27, 16777215, 0);
								if (var43 != 1 && var43 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var33 + 27, 16777215, 0);
								}
							}

							var43 = class433.loginBoxCenter - 80;
							short var45 = 321;
							class182.titlebuttonSprite.drawAt(var43 - 73, var45 - 20);
							var0.drawCentered("Submit", var43, var45 + 5, 16777215, 0);
							var43 = class433.loginBoxCenter + 80;
							class182.titlebuttonSprite.drawAt(var43 - 73, var45 - 20);
							var0.drawCentered("Cancel", var43, var45 + 5, 16777215, 0);
						} else {
							var32 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0);
							var33 = var32 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0);
							var33 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0);
							var33 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var32 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var32 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var33 = Login.loginBoxX + 180;
						var34 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var34, 16776960, 0);
						var4 = var34 + 20;
						Login.field925.drawAt(var33 - 109, var4);
						if (Login.displayName.isEmpty()) {
							class473.field4839.drawAt(var33 - 48, var4 + 18);
						} else {
							class473.field4839.drawAt(var33 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var33, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var33 = class433.loginBoxCenter;
						var34 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var33, var34, 16777215, 0);
						var4 = var34 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var33, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var33, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var33, var4, 16777215, 0);
						var33 = class433.loginBoxCenter - 80;
						var34 = 311;
						class182.titlebuttonSprite.drawAt(var33 - 73, var34 - 20);
						var0.drawCentered("Accept", var33, var34 + 5, 16777215, 0);
						var33 = class433.loginBoxCenter + 80;
						class182.titlebuttonSprite.drawAt(var33 - 73, var34 - 20);
						var0.drawCentered("Decline", var33, var34 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var32 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var32, 16777215, 0);
						var33 = var32 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var33, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var32 = 311;
						class182.titlebuttonSprite.drawAt(var4 - 73, var32 - 20);
						var0.drawCentered("Back", var4, var32 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var32 = 201;
						String var24 = "";
						var5 = "";
						var6 = "";
						switch(Login.Login_banType) {
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
							var6 = Strings.field4107;
							break;
						default:
							GrandExchangeOfferUnitPriceComparator.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0);
						var25 = Login.loginBoxX + 180;
						var36 = 276;
						class182.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var25, var36 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var25, var36 + 5, 16777215, 0);
						}

						var25 = Login.loginBoxX + 180;
						var36 = 326;
						class182.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var32 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
						var33 = var32 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var32 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var32 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						class182.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var27 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var27);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, GameEngine.canvasHeight);
				SpriteMask.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				SpriteMask.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var27);
			}

			Clock.title_muteSprite[class93.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class92.clientLanguage == Language.Language_EN) {
				if (class155.field1725 != null) {
					var33 = Login.xPadding + 5;
					var34 = 463;
					byte var49 = 100;
					byte var46 = 35;
					class155.field1725.drawAt(var33, var34);
					var0.drawCentered("World" + " " + Client.worldId, var49 / 2 + var33, var46 / 2 + var34 - 2, 16777215, 0);
					if (class101.World_request != null) {
						var1.drawCentered("Loading...", var49 / 2 + var33, var46 / 2 + var34 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var49 / 2 + var33, var46 / 2 + var34 + 12, 16777215, 0);
					}
				} else {
					class155.field1725 = VarcInt.SpriteBuffer_getIndexedSpriteByName(HttpRequestTask.archive8, "sl_button", "");
				}
			}

		}
	}
}
