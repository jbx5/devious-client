import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
final class class105 implements class323 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lmi;)V"
	)
	class105(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "17"
	)
	public void vmethod6045() {
		if (this.val$cc != null && this.val$cc.method6418().field3565 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2283(this.val$cc);
			var1.setArgs(this.val$cc.method6418().field3565);
			class30.method446().addFirst(var1);
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lpi;Lpi;Lpi;B)V",
		garbageValue = "-46"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class113.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class452.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var9;
		boolean var15;
		int var17;
		int var26;
		int var27;
		int var34;
		int var36;
		int var43;
		int var44;
		if (Login.worldSelectOpen) {
			if (class74.worldSelectBackSprites == null) {
				class74.worldSelectBackSprites = class20.method303(PcmPlayer.archive8, "sl_back", "");
			}

			if (SoundCache.worldSelectFlagSprites == null) {
				SoundCache.worldSelectFlagSprites = class219.method4261(PcmPlayer.archive8, "sl_flags", "");
			}

			if (MusicPatchPcmStream.worldSelectArrows == null) {
				MusicPatchPcmStream.worldSelectArrows = class219.method4261(PcmPlayer.archive8, "sl_arrows", "");
			}

			if (SecureRandomCallable.worldSelectStars == null) {
				SecureRandomCallable.worldSelectStars = class219.method4261(PcmPlayer.archive8, "sl_stars", "");
			}

			if (class85.worldSelectLeftSprite == null) {
				class85.worldSelectLeftSprite = class172.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.archive8, "leftarrow", "");
			}

			if (Skeleton.worldSelectRightSprite == null) {
				Skeleton.worldSelectRightSprite = class172.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (SecureRandomCallable.worldSelectStars != null) {
				SecureRandomCallable.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				SecureRandomCallable.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (MusicPatchPcmStream.worldSelectArrows != null) {
				var34 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					MusicPatchPcmStream.worldSelectArrows[2].drawAt(var34, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[0].drawAt(var34, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					MusicPatchPcmStream.worldSelectArrows[3].drawAt(var34 + 15, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[1].drawAt(var34 + 15, 4);
				}

				var0.draw("World", var34 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					MusicPatchPcmStream.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					MusicPatchPcmStream.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var43 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					MusicPatchPcmStream.worldSelectArrows[2].drawAt(var43, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[0].drawAt(var43, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					MusicPatchPcmStream.worldSelectArrows[3].drawAt(var43 + 15, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[1].drawAt(var43 + 15, 4);
				}

				var0.draw("Location", var43 + 32, 17, 16777215, -1);
				var27 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					MusicPatchPcmStream.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[0].drawAt(var27, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					MusicPatchPcmStream.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					MusicPatchPcmStream.worldSelectArrows[1].drawAt(var27 + 15, 4);
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class74.worldSelectBackSprites != null) {
				var3 = 88;
				byte var39 = 19;
				var43 = 765 / (var3 + 1) - 1;
				var27 = 480 / (var39 + 1);

				do {
					var44 = var27;
					var26 = var43;
					if (var27 * (var43 - 1) >= World.World_count) {
						--var43;
					}

					if (var43 * (var27 - 1) >= World.World_count) {
						--var27;
					}

					if (var43 * (var27 - 1) >= World.World_count) {
						--var27;
					}
				} while(var44 != var27 || var26 != var43);

				var44 = (765 - var3 * var43) / (var43 + 1);
				if (var44 > 5) {
					var44 = 5;
				}

				var26 = (480 - var39 * var27) / (var27 + 1);
				if (var26 > 5) {
					var26 = 5;
				}

				var9 = (765 - var43 * var3 - var44 * (var43 - 1)) / 2;
				int var29 = (480 - var27 * var39 - var26 * (var27 - 1)) / 2;
				var36 = (var27 + World.World_count - 1) / var27;
				Login.worldSelectPagesCount = var36 - var43;
				if (class85.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class85.worldSelectLeftSprite.drawAt(8, class177.canvasHeight / 2 - class85.worldSelectLeftSprite.subHeight / 2);
				}

				if (Skeleton.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					Skeleton.worldSelectRightSprite.drawAt(class113.canvasWidth - Skeleton.worldSelectRightSprite.subWidth - 8, class177.canvasHeight / 2 - Skeleton.worldSelectRightSprite.subHeight / 2);
				}

				int var38 = var29 + 23;
				int var30 = var9 + Login.xPadding;
				int var31 = 0;
				var15 = false;
				int var40 = Login.worldSelectPage;

				for (var17 = var27 * var40; var17 < World.World_count && var40 - Login.worldSelectPage < var43; ++var17) {
					World var32 = class176.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var32.population);
					if (var32.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var32.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					class108 var21 = null;
					int var22 = 0;
					if (var32.isBeta()) {
						var21 = var32.isMembersOnly() ? class108.field1397 : class108.field1407;
					} else if (var32.isDeadman()) {
						var21 = var32.isMembersOnly() ? class108.field1406 : class108.field1399;
					} else if (var32.method1808()) {
						var22 = 16711680;
						var21 = var32.isMembersOnly() ? class108.field1396 : class108.field1391;
					} else if (var32.method1809()) {
						var21 = var32.isMembersOnly() ? class108.field1395 : class108.field1400;
					} else if (var32.isPvp()) {
						var21 = var32.isMembersOnly() ? class108.field1394 : class108.field1398;
					} else if (var32.method1843()) {
						var21 = var32.isMembersOnly() ? class108.field1402 : class108.field1401;
					} else if (var32.method1811()) {
						var21 = var32.isMembersOnly() ? class108.field1390 : class108.field1403;
					}

					if (var21 == null || var21.field1405 >= class74.worldSelectBackSprites.length) {
						var21 = var32.isMembersOnly() ? class108.field1392 : class108.field1393;
					}

					if (MouseHandler.MouseHandler_x >= var30 && MouseHandler.MouseHandler_y >= var38 && MouseHandler.MouseHandler_x < var30 + var3 && MouseHandler.MouseHandler_y < var38 + var39 && var19) {
						Login.hoveredWorldIndex = var17;
						class74.worldSelectBackSprites[var21.field1405].drawTransOverlayAt(var30, var38, 128, 16777215);
						var15 = true;
					} else {
						class74.worldSelectBackSprites[var21.field1405].drawAt(var30, var38);
					}

					if (SoundCache.worldSelectFlagSprites != null) {
						SoundCache.worldSelectFlagSprites[(var32.isMembersOnly() ? 8 : 0) + var32.location].drawAt(var30 + 29, var38);
					}

					var0.drawCentered(Integer.toString(var32.id), var30 + 15, var39 / 2 + var38 + 5, var22, -1);
					var1.drawCentered(var20, var30 + 60, var39 / 2 + var38 + 5, 268435455, -1);
					var38 = var38 + var39 + var26;
					++var31;
					if (var31 >= var27) {
						var38 = var29 + 23;
						var30 = var30 + var3 + var44;
						var31 = 0;
						++var40;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(class176.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var41 = var1.ascent + 8;
					int var42 = MouseHandler.MouseHandler_y + 25;
					if (var41 + var42 > 480) {
						var42 = MouseHandler.MouseHandler_y - 25 - var41;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var42, var17, var41, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var42, var17, var41, 0);
					var1.drawCentered(class176.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var42 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			Bounds.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			SoundSystem.logoSprite.drawAt(Login.xPadding + 382 - SoundSystem.logoSprite.subWidth / 2, 18);
			if (Client.gameState == 0 || Client.gameState == 5) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150 + Login.Login_loadingPercent * 3, var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var6;
			String var7;
			String var8;
			short var33;
			short var35;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
				var33 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
				var34 = var33 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
				var34 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
				var34 += 15;
				var34 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var34, 16777215, 0);
					var35 = 200;

					for (var5 = class238.method4767(); var0.stringWidth(var5) > var35; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var34, 16777215, 0);
					var34 += 15;
					var7 = Login.Login_password;
					var6 = class270.method5493('*', var7.length());

					for (var8 = var6; var0.stringWidth(var8) > var35; var8 = var8.substring(1)) {
					}

					var0.draw("Password: " + var8, Login.loginBoxX + 180 - 108, var34, 16777215, 0);
					var34 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var33 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0);
					var34 = var33 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var33 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
					var34 = var33 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
					var34 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
					var34 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else {
					IndexedSprite var10;
					if (Login.loginIndex == 2) {
						var33 = 201;
						var0.drawCentered(Login.Login_response1, class452.loginBoxCenter, var33, 16776960, 0);
						var34 = var33 + 15;
						var0.drawCentered(Login.Login_response2, class452.loginBoxCenter, var34, 16776960, 0);
						var34 += 15;
						var0.drawCentered(Login.Login_response3, class452.loginBoxCenter, var34, 16776960, 0);
						var34 += 15;
						var34 += 7;
						var0.draw("Login: ", class452.loginBoxCenter - 110, var34, 16777215, 0);
						var35 = 200;

						for (var5 = class238.method4767(); var0.stringWidth(var5) > var35; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class217.colorStartTag(16776960) + "|" : ""), class452.loginBoxCenter - 70, var34, 16777215, 0);
						var34 += 15;
						var7 = Login.Login_password;
						var6 = class270.method5493('*', var7.length());

						for (var8 = var6; var0.stringWidth(var8) > var35; var8 = var8.substring(1)) {
						}

						var0.draw("Password: " + var8 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class217.colorStartTag(16776960) + "|" : ""), class452.loginBoxCenter - 108, var34, 16777215, 0);
						var34 += 15;
						var33 = 277;
						var9 = class452.loginBoxCenter + -117;
						boolean var11 = Client.Login_isUsernameRemembered;
						boolean var12 = Login.field935;
						var10 = var11 ? (var12 ? VerticalAlignment.field2083 : UserComparator6.options_buttons_2Sprite) : (var12 ? Skills.field3850 : Login.options_buttons_0Sprite);
						var10.drawAt(var9, var33);
						var9 = var9 + var10.subWidth + 5;
						var1.draw("Remember username", var9, var33 + 13, 16776960, 0);
						var9 = class452.loginBoxCenter + 24;
						var15 = class449.clientPreferences.method2454();
						boolean var16 = Login.field963;
						IndexedSprite var14 = var15 ? (var16 ? VerticalAlignment.field2083 : UserComparator6.options_buttons_2Sprite) : (var16 ? Skills.field3850 : Login.options_buttons_0Sprite);
						var14.drawAt(var9, var33);
						var9 = var9 + var14.subWidth + 5;
						var1.draw("Hide username", var9, var33 + 13, 16776960, 0);
						var34 = var33 + 15;
						var17 = class452.loginBoxCenter - 80;
						short var18 = 321;
						class219.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
						var0.drawCentered("Login", var17, var18 + 5, 16777215, 0);
						var17 = class452.loginBoxCenter + 80;
						class219.titlebuttonSprite.drawAt(var17 - 73, var18 - 20);
						var0.drawCentered("Cancel", var17, var18 + 5, 16777215, 0);
						var33 = 357;
						switch(Login.field943) {
						case 2:
							class151.field1714 = "Having trouble logging in?";
							break;
						default:
							class151.field1714 = "Can't login? Click here.";
						}

						class102.field1343 = new Bounds(class452.loginBoxCenter, var33, var1.stringWidth(class151.field1714), 11);
						class90.field1117 = new Bounds(class452.loginBoxCenter, var33, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(class151.field1714, class452.loginBoxCenter, var33, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var33 = 201;
						var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 20;
						var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 20;
						var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var33 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
						var34 = var33 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var5 = "PIN: ";
						var7 = class369.otp;
						var6 = class270.method5493('*', var7.length());
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? class217.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var34, 16777215, 0);
						var34 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var34, 16776960, 0);
						var34 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var34, 16776960, 0);
						var26 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var9 = var34 - var0.ascent;
						if (Login.field956) {
							var10 = UserComparator6.options_buttons_2Sprite;
						} else {
							var10 = Login.options_buttons_0Sprite;
						}

						var10.drawAt(var26, var9);
						var34 += 15;
						var36 = Login.loginBoxX + 180 - 80;
						short var37 = 321;
						class219.titlebuttonSprite.drawAt(var36 - 73, var37 - 20);
						var0.drawCentered("Continue", var36, var37 + 5, 16777215, 0);
						var36 = Login.loginBoxX + 180 + 80;
						class219.titlebuttonSprite.drawAt(var36 - 73, var37 - 20);
						var0.drawCentered("Cancel", var36, var37 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var37 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var33 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var34 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var34, 16777215, 0);
						var35 = 174;

						for (var5 = class238.method4767(); var0.stringWidth(var5) > var35; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? class217.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var34, 16777215, 0);
						var34 += 15;
						var27 = Login.loginBoxX + 180 - 80;
						short var25 = 321;
						class219.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0);
						var27 = Login.loginBoxX + 180 + 80;
						class219.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0);
						var25 = 356;
						var1.drawCentered("Still having trouble logging in?", class452.loginBoxCenter, var25, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var33 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (ModeWhere.field4404 && !Client.onMobile) {
							var33 = 201;
							var0.drawCentered(Login.Login_response1, class452.loginBoxCenter, var33, 16776960, 0);
							var34 = var33 + 15;
							var0.drawCentered(Login.Login_response2, class452.loginBoxCenter, var34, 16776960, 0);
							var34 += 15;
							var0.drawCentered(Login.Login_response3, class452.loginBoxCenter, var34, 16776960, 0);
							var4 = class452.loginBoxCenter - 150;
							var34 += 10;

							for (var43 = 0; var43 < 8; ++var43) {
								class219.titlebuttonSprite.method9480(var4, var34, 30, 40);
								boolean var46 = var43 == Login.field951 & Client.cycle % 40 < 20;
								var0.draw((Login.field954[var43] == null ? "" : Login.field954[var43]) + (var46 ? class217.colorStartTag(16776960) + "|" : ""), var4 + 10, var34 + 27, 16777215, 0);
								if (var43 != 1 && var43 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var34 + 27, 16777215, 0);
								}
							}

							var43 = class452.loginBoxCenter - 80;
							short var47 = 321;
							class219.titlebuttonSprite.drawAt(var43 - 73, var47 - 20);
							var0.drawCentered("Submit", var43, var47 + 5, 16777215, 0);
							var43 = class452.loginBoxCenter + 80;
							class219.titlebuttonSprite.drawAt(var43 - 73, var47 - 20);
							var0.drawCentered("Cancel", var43, var47 + 5, 16777215, 0);
						} else {
							var33 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var33 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var33 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var34 = Login.loginBoxX + 180;
						var35 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0);
						var4 = var35 + 20;
						Login.field933.drawAt(var34 - 109, var4);
						if (Login.field953.isEmpty()) {
							ItemContainer.field1068.drawAt(var34 - 48, var4 + 18);
						} else {
							ItemContainer.field1068.drawAt(var34 - 48, var4 + 5);
							var0.drawCentered(Login.field953, var34, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var34 = class452.loginBoxCenter;
						var35 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var34, var35, 16777215, 0);
						var4 = var35 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var34, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var34, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var34, var4, 16777215, 0);
						var34 = class452.loginBoxCenter - 80;
						var35 = 311;
						class219.titlebuttonSprite.drawAt(var34 - 73, var35 - 20);
						var0.drawCentered("Accept", var34, var35 + 5, 16777215, 0);
						var34 = class452.loginBoxCenter + 80;
						class219.titlebuttonSprite.drawAt(var34 - 73, var35 - 20);
						var0.drawCentered("Decline", var34, var35 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var33 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var33, 16777215, 0);
						var34 = var33 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var34, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var33 = 311;
						class219.titlebuttonSprite.drawAt(var4 - 73, var33 - 20);
						var0.drawCentered("Back", var4, var33 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var33 = 201;
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
							var6 = Strings.field4044;
							break;
						default:
							WorldMapAreaData.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var34, 16776960, 0);
						var44 = Login.loginBoxX + 180;
						short var45 = 276;
						class219.titlebuttonSprite.drawAt(var44 - 73, var45 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var44, var45 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var44, var45 + 5, 16777215, 0);
						}

						var44 = Login.loginBoxX + 180;
						var45 = 326;
						class219.titlebuttonSprite.drawAt(var44 - 73, var45 - 20);
						var0.drawCentered("Back", var44, var45 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var33 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
						var34 = var33 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var33 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var33 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
						var34 = var33 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
						var34 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						class219.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var28 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var28);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class177.canvasHeight);
				class139.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class139.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var28);
			}

			class13.title_muteSprite[class449.clientPreferences.method2484() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == ClanChannelMember.clientLanguage) {
				if (VarcInt.field1966 != null) {
					var34 = Login.xPadding + 5;
					var35 = 463;
					byte var48 = 100;
					byte var49 = 35;
					VarcInt.field1966.drawAt(var34, var35);
					var0.drawCentered("World" + " " + Client.worldId, var48 / 2 + var34, var49 / 2 + var35 - 2, 16777215, 0);
					if (WorldMapLabelSize.World_request != null) {
						var1.drawCentered("Loading...", var48 / 2 + var34, var49 / 2 + var35 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var48 / 2 + var34, var49 / 2 + var35 + 12, 16777215, 0);
					}
				} else {
					VarcInt.field1966 = class172.SpriteBuffer_getIndexedSpriteByName(PcmPlayer.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("hp")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "163402086"
	)
	static void method2689() {
		Client.packetWriter.clearBuffer();
		Client.packetWriter.packetBuffer.offset = 0;
		Client.packetWriter.serverPacket = null;
		Client.packetWriter.field1430 = null;
		Client.packetWriter.field1436 = null;
		Client.packetWriter.field1437 = null;
		Client.packetWriter.serverPacketLength = 0;
		Client.packetWriter.field1435 = 0;
		Client.rebootTimer = 0;
		Frames.method4718();
		Client.minimapState = 0;
		Client.destinationX = 0;

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) {
			Client.players[var0] = null;
		}

		VarbitComposition.localPlayer = null;

		for (var0 = 0; var0 < Client.npcs.length; ++var0) {
			NPC var1 = Client.npcs[var0];
			if (var1 != null) {
				var1.targetIndex = -1;
				var1.false0 = false;
			}
		}

		LoginPacket.method5710();
		MusicSong.updateGameState(30);

		for (var0 = 0; var0 < 100; ++var0) {
			Client.validRootWidgets[var0] = true;
		}

		Message.method1217();
	}
}
