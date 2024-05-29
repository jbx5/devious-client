import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eu")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("ak")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lso;Lso;I)I",
		garbageValue = "-1338189892"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lqb;Lqb;Lqb;S)V",
		garbageValue = "19101"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		KeyHandler.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var26;
		int var27;
		int var28;
		int var29;
		int var33;
		int var36;
		int var40;
		int var42;
		if (Login.worldSelectOpen) {
			if (class47.worldSelectBackSprites == null) {
				Archive var41 = class177.archive8;
				SpritePixels[] var48;
				if (!var41.isValidFileName("sl_back", "")) {
					var48 = null;
				} else {
					var40 = var41.getGroupId("sl_back");
					var27 = var41.getFileId(var40, "");
					var48 = WorldMapSection1.method5980(var41, var40, var27);
				}

				class47.worldSelectBackSprites = var48;
			}

			if (class428.worldSelectFlagSprites == null) {
				class428.worldSelectFlagSprites = class182.getFont(class177.archive8, "sl_flags", "");
			}

			if (ClanChannelMember.worldSelectArrows == null) {
				ClanChannelMember.worldSelectArrows = class182.getFont(class177.archive8, "sl_arrows", "");
			}

			if (Skills.worldSelectStars == null) {
				Skills.worldSelectStars = class182.getFont(class177.archive8, "sl_stars", "");
			}

			if (class342.worldSelectLeftSprite == null) {
				class342.worldSelectLeftSprite = ClanMate.SpriteBuffer_getIndexedSpriteByName(class177.archive8, "leftarrow", "");
			}

			if (class166.worldSelectRightSprite == null) {
				class166.worldSelectRightSprite = ClanMate.SpriteBuffer_getIndexedSpriteByName(class177.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (Skills.worldSelectStars != null) {
				Skills.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				Skills.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (ClanChannelMember.worldSelectArrows != null) {
				var33 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					ClanChannelMember.worldSelectArrows[2].drawAt(var33, 4);
				} else {
					ClanChannelMember.worldSelectArrows[0].drawAt(var33, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					ClanChannelMember.worldSelectArrows[3].drawAt(var33 + 15, 4);
				} else {
					ClanChannelMember.worldSelectArrows[1].drawAt(var33 + 15, 4);
				}

				var0.draw("World", var33 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					ClanChannelMember.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					ClanChannelMember.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					ClanChannelMember.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					ClanChannelMember.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var40 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					ClanChannelMember.worldSelectArrows[2].drawAt(var40, 4);
				} else {
					ClanChannelMember.worldSelectArrows[0].drawAt(var40, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					ClanChannelMember.worldSelectArrows[3].drawAt(var40 + 15, 4);
				} else {
					ClanChannelMember.worldSelectArrows[1].drawAt(var40 + 15, 4);
				}

				var0.draw("Location", var40 + 32, 17, 16777215, -1);
				var27 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					ClanChannelMember.worldSelectArrows[2].drawAt(var27, 4);
				} else {
					ClanChannelMember.worldSelectArrows[0].drawAt(var27, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					ClanChannelMember.worldSelectArrows[3].drawAt(var27 + 15, 4);
				} else {
					ClanChannelMember.worldSelectArrows[1].drawAt(var27 + 15, 4);
				}

				var0.draw("Type", var27 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class47.worldSelectBackSprites != null) {
				var3 = 88;
				byte var38 = 19;
				var40 = 765 / (var3 + 1) - 1;
				var27 = 480 / (var38 + 1);

				do {
					var42 = var27;
					var26 = var40;
					if (var27 * (var40 - 1) >= World.World_count) {
						--var40;
					}

					if (var40 * (var27 - 1) >= World.World_count) {
						--var27;
					}

					if (var40 * (var27 - 1) >= World.World_count) {
						--var27;
					}
				} while(var27 != var42 || var26 != var40);

				var42 = (765 - var3 * var40) / (var40 + 1);
				if (var42 > 5) {
					var42 = 5;
				}

				var26 = (480 - var27 * var38) / (var27 + 1);
				if (var26 > 5) {
					var26 = 5;
				}

				var28 = (765 - var3 * var40 - var42 * (var40 - 1)) / 2;
				var29 = (480 - var27 * var38 - var26 * (var27 - 1)) / 2;
				var36 = (var27 + World.World_count - 1) / var27;
				Login.worldSelectPagesCount = var36 - var40;
				if (class342.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class342.worldSelectLeftSprite.drawAt(8, DbTable.canvasHeight / 2 - class342.worldSelectLeftSprite.subHeight * -1758859088 / 2);
				}

				if (class166.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					class166.worldSelectRightSprite.drawAt(GameEngine.canvasWidth - class166.worldSelectRightSprite.subWidth - 8, DbTable.canvasHeight / 2 - class166.worldSelectRightSprite.subHeight * -1758859088 / 2);
				}

				int var37 = var29 + 23;
				int var13 = var28 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var27 * var16; var17 < World.World_count && var16 - Login.worldSelectPage < var40; ++var17) {
					World var18 = class415.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == -1) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					class111 var21 = null;
					int var22 = 0;
					if (var18.isBeta()) {
						var21 = var18.isMembersOnly() ? class111.field1430 : class111.field1433;
					} else if (var18.isDeadman()) {
						var21 = var18.isMembersOnly() ? class111.field1442 : class111.field1441;
					} else if (var18.method1837()) {
						var22 = 16711680;
						var21 = var18.isMembersOnly() ? class111.field1432 : class111.field1443;
					} else if (var18.method1883()) {
						var21 = var18.isMembersOnly() ? class111.field1436 : class111.field1434;
					} else if (var18.isPvp()) {
						var21 = var18.isMembersOnly() ? class111.field1438 : class111.field1429;
					} else if (var18.method1840()) {
						var21 = var18.isMembersOnly() ? class111.field1435 : class111.field1437;
					} else if (var18.method1881()) {
						var21 = var18.isMembersOnly() ? class111.field1390 : class111.field1439;
					}

					if (var21 == null || var21.field1427 >= class47.worldSelectBackSprites.length) {
						var21 = var18.isMembersOnly() ? class111.field1445 : class111.field1428;
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var37 && MouseHandler.MouseHandler_x < var3 + var13 && MouseHandler.MouseHandler_y < var38 + var37 && var19) {
						Login.hoveredWorldIndex = var17;
						class47.worldSelectBackSprites[var21.field1427].drawTransOverlayAt(var13, var37, 128, 16777215);
						var15 = true;
					} else {
						class47.worldSelectBackSprites[var21.field1427].drawAt(var13, var37);
					}

					if (class428.worldSelectFlagSprites != null) {
						class428.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var37);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var38 / 2 + var37 + 5, var22, -1);
					var1.drawCentered(var20, var13 + 60, var38 / 2 + var37 + 5, 268435455, -1);
					var37 = var37 + var26 + var38;
					++var14;
					if (var14 >= var27) {
						var37 = var29 + 23;
						var13 = var13 + var42 + var3;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(class415.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var31 = var1.ascent + 8;
					int var39 = MouseHandler.MouseHandler_y + 25;
					if (var31 + var39 > 480) {
						var39 = MouseHandler.MouseHandler_y - 25 - var31;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var39, var17, var31, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var39, var17, var31, 0);
					var1.drawCentered(class415.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var39 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			InvDefinition.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class91.logoSprite.drawAt(Login.xPadding + 382 - class91.logoSprite.subWidth / 2, 18);
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

			String var6;
			String var7;
			short var32;
			short var34;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight * -1758859088 / 2);
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
					String var8;
					if (class459.clientPreferences.isUsernameHidden()) {
						var8 = Login.Login_username;
						var7 = ItemLayer.method4585('*', var8.length());
						var6 = var7;
					} else {
						var6 = Login.Login_username;
					}

					for (var6 = var6; var0.stringWidth(var6) > var34; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var33, 16777215, 0);
					var33 += 15;
					var8 = Login.Login_password;
					var7 = ItemLayer.method4585('*', var8.length());

					String var9;
					for (var9 = var7; var0.stringWidth(var9) > var34; var9 = var9.substring(1)) {
					}

					var0.draw("Password: " + var9, Login.loginBoxX + 180 - 108, var33, 16777215, 0);
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
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
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
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else {
					String var5;
					if (Login.loginIndex == 2) {
						var32 = 201;
						var0.drawCentered(Login.Login_response1, KeyHandler.loginBoxCenter, var32, 16776960, 0);
						var33 = var32 + 15;
						var0.drawCentered(Login.Login_response2, KeyHandler.loginBoxCenter, var33, 16776960, 0);
						var33 += 15;
						var0.drawCentered(Login.Login_response3, KeyHandler.loginBoxCenter, var33, 16776960, 0);
						var33 += 15;
						var33 += 7;
						var0.draw("Login: ", KeyHandler.loginBoxCenter - 110, var33, 16777215, 0);
						var34 = 200;
						var5 = class459.clientPreferences.isUsernameHidden() ? ClanChannelMember.method3249(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var34; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? HttpAuthenticationHeader.colorStartTag(16776960) + "|" : ""), KeyHandler.loginBoxCenter - 70, var33, 16777215, 0);
						var33 += 15;

						for (var7 = ClanChannelMember.method3249(Login.Login_password); var0.stringWidth(var7) > var34; var7 = var7.substring(1)) {
						}

						var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? HttpAuthenticationHeader.colorStartTag(16776960) + "|" : ""), KeyHandler.loginBoxCenter - 108, var33, 16777215, 0);
						var33 += 15;
						var32 = 277;
						var26 = KeyHandler.loginBoxCenter + -117;
						IndexedSprite var35 = class141.method3182(Client.Login_isUsernameRemembered, Login.field967);
						var35.drawAt(var26, var32);
						var26 = var26 + var35.subWidth + 5;
						var1.draw("Remember username", var26, var32 + 13, 16776960, 0);
						var26 = KeyHandler.loginBoxCenter + 24;
						var35 = class141.method3182(class459.clientPreferences.isUsernameHidden(), Login.field963);
						var35.drawAt(var26, var32);
						var26 = var26 + var35.subWidth + 5;
						var1.draw("Hide username", var26, var32 + 13, 16776960, 0);
						var33 = var32 + 15;
						var29 = KeyHandler.loginBoxCenter - 80;
						short var11 = 321;
						Login.titlebuttonSprite.drawAt(var29 - 73, var11 - 20);
						var0.drawCentered("Login", var29, var11 + 5, 16777215, 0);
						var29 = KeyHandler.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var29 - 73, var11 - 20);
						var0.drawCentered("Cancel", var29, var11 + 5, 16777215, 0);
						var32 = 357;
						switch(Login.field949) {
						case 2:
							ClanChannelMember.field1701 = "Having trouble logging in?";
							break;
						default:
							ClanChannelMember.field1701 = "Can't login? Click here.";
						}

						Calendar.field3982 = new Bounds(KeyHandler.loginBoxCenter, var32, var1.stringWidth(ClanChannelMember.field1701), 11);
						class413.field4655 = new Bounds(KeyHandler.loginBoxCenter, var32, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(ClanChannelMember.field1701, KeyHandler.loginBoxCenter, var32, 16777215, 0);
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
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var32 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var32, 16777215, 0);
						var33 = var32 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var33, 16777215, 0);
						var33 += 15;
						var5 = "PIN: ";
						var7 = class285.otp;
						var6 = ItemLayer.method4585('*', var7.length());
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? HttpAuthenticationHeader.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var33, 16777215, 0);
						var33 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var33, 16776960, 0);
						var33 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var33, 16776960, 0);
						var26 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var28 = var33 - var0.ascent;
						IndexedSprite var10;
						if (Login.rememberUsername) {
							var10 = class206.options_buttons_2Sprite;
						} else {
							var10 = class397.options_buttons_0Sprite;
						}

						var10.drawAt(var26, var28);
						var33 += 15;
						var36 = Login.loginBoxX + 180 - 80;
						short var12 = 321;
						Login.titlebuttonSprite.drawAt(var36 - 73, var12 - 20);
						var0.drawCentered("Continue", var36, var12 + 5, 16777215, 0);
						var36 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var36 - 73, var12 - 20);
						var0.drawCentered("Cancel", var36, var12 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var12 + 36, 16777215, 0);
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

						for (var5 = class153.method3282(); var0.stringWidth(var5) > var34; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? HttpAuthenticationHeader.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var33, 16777215, 0);
						var33 += 15;
						var27 = Login.loginBoxX + 180 - 80;
						short var25 = 321;
						Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Recover", var27, var25 + 5, 16777215, 0);
						var27 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var27 - 73, var25 - 20);
						var0.drawCentered("Back", var27, var25 + 5, 16777215, 0);
						var25 = 356;
						var1.drawCentered("Still having trouble logging in?", KeyHandler.loginBoxCenter, var25, 268435455, 0);
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
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (AbstractByteArrayCopier.field3976 && !Client.onMobile) {
							var32 = 201;
							var0.drawCentered(Login.Login_response1, KeyHandler.loginBoxCenter, var32, 16776960, 0);
							var33 = var32 + 15;
							var0.drawCentered(Login.Login_response2, KeyHandler.loginBoxCenter, var33, 16776960, 0);
							var33 += 15;
							var0.drawCentered(Login.Login_response3, KeyHandler.loginBoxCenter, var33, 16776960, 0);
							var4 = KeyHandler.loginBoxCenter - 150;
							var33 += 10;

							for (var40 = 0; var40 < 8; ++var40) {
								Login.titlebuttonSprite.method10077(var4, var33, 30, 40);
								boolean var43 = var40 == Login.field973 & Client.cycle % 40 < 20;
								var0.draw((Login.field960[var40] == null ? "" : Login.field960[var40]) + (var43 ? HttpAuthenticationHeader.colorStartTag(16776960) + "|" : ""), var4 + 10, var33 + 27, 16777215, 0);
								if (var40 != 1 && var40 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var33 + 27, 16777215, 0);
								}
							}

							var40 = KeyHandler.loginBoxCenter - 80;
							short var45 = 321;
							Login.titlebuttonSprite.drawAt(var40 - 73, var45 - 20);
							var0.drawCentered("Submit", var40, var45 + 5, 16777215, 0);
							var40 = KeyHandler.loginBoxCenter + 80;
							Login.titlebuttonSprite.drawAt(var40 - 73, var45 - 20);
							var0.drawCentered("Cancel", var40, var45 + 5, 16777215, 0);
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
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
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
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
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
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var33 = Login.loginBoxX + 180;
						var34 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var34, 16776960, 0);
						var4 = var34 + 20;
						class435.field4776.drawAt(var33 - 109, var4);
						if (Login.displayName.isEmpty()) {
							StructComposition.field2240.drawAt(var33 - 48, var4 + 18);
						} else {
							StructComposition.field2240.drawAt(var33 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var33, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var33 = KeyHandler.loginBoxCenter;
						var34 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var33, var34, 16777215, 0);
						var4 = var34 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var33, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var33, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var33, var4, 16777215, 0);
						var33 = KeyHandler.loginBoxCenter - 80;
						var34 = 311;
						Login.titlebuttonSprite.drawAt(var33 - 73, var34 - 20);
						var0.drawCentered("Accept", var33, var34 + 5, 16777215, 0);
						var33 = KeyHandler.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var33 - 73, var34 - 20);
						var0.drawCentered("Decline", var33, var34 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var32 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var32, 16777215, 0);
						var33 = var32 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var33, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var32 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var32 - 20);
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
							var6 = Strings.field4219;
							break;
						default:
							WorldMapSectionType.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var32, 16776960, 0);
						var33 = var32 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var33, 16776960, 0);
						var33 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var33, 16776960, 0);
						var42 = Login.loginBoxX + 180;
						short var44 = 276;
						Login.titlebuttonSprite.drawAt(var42 - 73, var44 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var42, var44 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var42, var44 + 5, 16777215, 0);
						}

						var42 = Login.loginBoxX + 180;
						var44 = 326;
						Login.titlebuttonSprite.drawAt(var42 - 73, var44 - 20);
						var0.drawCentered("Back", var42, var44 + 5, 16777215, 0);
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
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
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
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
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
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var30 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var30);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, DbTable.canvasHeight);
				class239.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class239.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var30);
			}

			class433.title_muteSprite[class459.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class188.clientLanguage == Language.Language_EN) {
				if (FloorUnderlayDefinition.field2215 != null) {
					var33 = Login.xPadding + 5;
					var34 = 463;
					byte var46 = 100;
					byte var47 = 35;
					FloorUnderlayDefinition.field2215.drawAt(var33, var34);
					var0.drawCentered("World" + " " + Client.worldId, var46 / 2 + var33, var47 / 2 + var34 - 2, 16777215, 0);
					if (Canvas.World_request != null) {
						var1.drawCentered("Loading...", var46 / 2 + var33, var47 / 2 + var34 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var46 / 2 + var33, var47 / 2 + var34 + 12, 16777215, 0);
					}
				} else {
					FloorUnderlayDefinition.field2215 = ClanMate.SpriteBuffer_getIndexedSpriteByName(class177.archive8, "sl_button", "");
				}
			}

		}
	}
}
