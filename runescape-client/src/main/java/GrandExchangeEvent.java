import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("og")
@Implements("GrandExchangeEvent")
public class GrandExchangeEvent {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -955085505
	)
	@Export("world")
	public final int world;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		longValue = -3722789001910041869L
	)
	@Export("age")
	public final long age;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("grandExchangeOffer")
	public final GrandExchangeOffer grandExchangeOffer;
	@ObfuscatedName("at")
	@Export("offerName")
	String offerName;
	@ObfuscatedName("an")
	@Export("previousOfferName")
	String previousOfferName;

	@ObfuscatedSignature(
		descriptor = "(Lur;BI)V"
	)
	GrandExchangeEvent(Buffer var1, byte var2, int var3) {
		this.offerName = var1.readStringCp1252NullTerminated();
		this.previousOfferName = var1.readStringCp1252NullTerminated();
		this.world = var1.readUnsignedShort();
		this.age = var1.readLong();
		int var4 = var1.readInt();
		int var5 = var1.readInt();
		this.grandExchangeOffer = new GrandExchangeOffer();
		this.grandExchangeOffer.method7146(2);
		this.grandExchangeOffer.method7133(var2);
		this.grandExchangeOffer.unitPrice = var4;
		this.grandExchangeOffer.totalQuantity = var5;
		this.grandExchangeOffer.currentQuantity = 0;
		this.grandExchangeOffer.currentPrice = 0;
		this.grandExchangeOffer.id = var3;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-2117239986"
	)
	@Export("getOfferName")
	public String getOfferName() {
		return this.offerName;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-42"
	)
	@Export("getPreviousOfferName")
	public String getPreviousOfferName() {
		return this.previousOfferName;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpx;Lpx;Lpx;B)V",
		garbageValue = "1"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class148.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		ReflectionCheck.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var7;
		int var25;
		int var32;
		int var45;
		if (Login.worldSelectOpen) {
			if (class325.worldSelectBackSprites == null) {
				Archive var46 = GameEngine.archive8;
				SpritePixels[] var50;
				if (!var46.isValidFileName("sl_back", "")) {
					var50 = null;
				} else {
					var45 = var46.getGroupId("sl_back");
					var25 = var46.getFileId(var45, "");
					var50 = Player.method2379(var46, var45, var25);
				}

				class325.worldSelectBackSprites = var50;
			}

			if (class4.worldSelectFlagSprites == null) {
				class4.worldSelectFlagSprites = class416.getFont(GameEngine.archive8, "sl_flags", "");
			}

			if (class136.worldSelectArrows == null) {
				class136.worldSelectArrows = class416.getFont(GameEngine.archive8, "sl_arrows", "");
			}

			if (class7.worldSelectStars == null) {
				class7.worldSelectStars = class416.getFont(GameEngine.archive8, "sl_stars", "");
			}

			if (UserComparator2.worldSelectLeftSprite == null) {
				UserComparator2.worldSelectLeftSprite = class153.SpriteBuffer_getIndexedSpriteByName(GameEngine.archive8, "leftarrow", "");
			}

			if (DirectByteArrayCopier.worldSelectRightSprite == null) {
				DirectByteArrayCopier.worldSelectRightSprite = class153.SpriteBuffer_getIndexedSpriteByName(GameEngine.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class7.worldSelectStars != null) {
				class7.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class7.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (class136.worldSelectArrows != null) {
				var32 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					class136.worldSelectArrows[2].drawAt(var32, 4);
				} else {
					class136.worldSelectArrows[0].drawAt(var32, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					class136.worldSelectArrows[3].drawAt(var32 + 15, 4);
				} else {
					class136.worldSelectArrows[1].drawAt(var32 + 15, 4);
				}

				var0.draw("World", var32 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					class136.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class136.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					class136.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class136.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var45 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					class136.worldSelectArrows[2].drawAt(var45, 4);
				} else {
					class136.worldSelectArrows[0].drawAt(var45, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					class136.worldSelectArrows[3].drawAt(var45 + 15, 4);
				} else {
					class136.worldSelectArrows[1].drawAt(var45 + 15, 4);
				}

				var0.draw("Location", var45 + 32, 17, 16777215, -1);
				var25 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					class136.worldSelectArrows[2].drawAt(var25, 4);
				} else {
					class136.worldSelectArrows[0].drawAt(var25, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					class136.worldSelectArrows[3].drawAt(var25 + 15, 4);
				} else {
					class136.worldSelectArrows[1].drawAt(var25 + 15, 4);
				}

				var0.draw("Type", var25 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class325.worldSelectBackSprites != null) {
				var3 = 88;
				byte var41 = 19;
				var45 = 765 / (var3 + 1) - 1;
				var25 = 480 / (var41 + 1);

				int var35;
				do {
					var7 = var25;
					var35 = var45;
					if (var25 * (var45 - 1) >= World.World_count) {
						--var45;
					}

					if (var45 * (var25 - 1) >= World.World_count) {
						--var25;
					}

					if (var45 * (var25 - 1) >= World.World_count) {
						--var25;
					}
				} while(var7 != var25 || var45 != var35);

				var7 = (765 - var3 * var45) / (var45 + 1);
				if (var7 > 5) {
					var7 = 5;
				}

				var35 = (480 - var25 * var41) / (var25 + 1);
				if (var35 > 5) {
					var35 = 5;
				}

				int var37 = (765 - var45 * var3 - var7 * (var45 - 1)) / 2;
				int var38 = (480 - var41 * var25 - var35 * (var25 - 1)) / 2;
				int var28 = (var25 + World.World_count - 1) / var25;
				Login.worldSelectPagesCount = var28 - var45;
				if (UserComparator2.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					UserComparator2.worldSelectLeftSprite.drawAt(8, class342.canvasHeight / 2 - UserComparator2.worldSelectLeftSprite.subHeight / 2);
				}

				if (DirectByteArrayCopier.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					DirectByteArrayCopier.worldSelectRightSprite.drawAt(class148.canvasWidth - DirectByteArrayCopier.worldSelectRightSprite.subWidth - 8, class342.canvasHeight / 2 - DirectByteArrayCopier.worldSelectRightSprite.subHeight / 2);
				}

				int var29 = var38 + 23;
				int var39 = var37 + Login.xPadding;
				int var40 = 0;
				boolean var42 = false;
				int var43 = Login.worldSelectPage;

				int var17;
				for (var17 = var25 * var43; var17 < World.World_count && var43 - Login.worldSelectPage < var45; ++var17) {
					World var18 = World.World_worlds[var17];
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
						var21 = var18.isMembersOnly() ? class109.field1405 : class109.field1416;
					} else if (var18.isDeadman()) {
						var21 = var18.isMembersOnly() ? class109.field1413 : class109.field1398;
					} else if (var18.method1821()) {
						var22 = 16711680;
						var21 = var18.isMembersOnly() ? class109.field1403 : class109.field1412;
					} else if (var18.method1799()) {
						var21 = var18.isMembersOnly() ? class109.field1407 : class109.field1404;
					} else if (var18.isPvp()) {
						var21 = var18.isMembersOnly() ? class109.field1401 : class109.field1400;
					} else if (var18.method1804()) {
						var21 = var18.isMembersOnly() ? class109.field1409 : class109.field1408;
					} else if (var18.method1798()) {
						var21 = var18.isMembersOnly() ? class109.field1390 : class109.field1406;
					}

					if (var21 == null || var21.field1414 >= class325.worldSelectBackSprites.length) {
						var21 = var18.isMembersOnly() ? class109.field1417 : class109.field1410;
					}

					if (MouseHandler.MouseHandler_x >= var39 && MouseHandler.MouseHandler_y >= var29 && MouseHandler.MouseHandler_x < var3 + var39 && MouseHandler.MouseHandler_y < var29 + var41 && var19) {
						Login.hoveredWorldIndex = var17;
						class325.worldSelectBackSprites[var21.field1414].drawTransOverlayAt(var39, var29, 128, 16777215);
						var42 = true;
					} else {
						class325.worldSelectBackSprites[var21.field1414].drawAt(var39, var29);
					}

					if (class4.worldSelectFlagSprites != null) {
						class4.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var39 + 29, var29);
					}

					var0.drawCentered(Integer.toString(var18.id), var39 + 15, var41 / 2 + var29 + 5, var22, -1);
					var1.drawCentered(var20, var39 + 60, var41 / 2 + var29 + 5, 268435455, -1);
					var29 = var29 + var41 + var35;
					++var40;
					if (var40 >= var25) {
						var29 = var38 + 23;
						var39 = var39 + var7 + var3;
						var40 = 0;
						++var43;
					}
				}

				if (var42) {
					var17 = var1.stringWidth(World.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var30 = var1.ascent + 8;
					int var44 = MouseHandler.MouseHandler_y + 25;
					if (var30 + var44 > 480) {
						var44 = MouseHandler.MouseHandler_y - 25 - var30;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var44, var17, var30, 0);
					var1.drawCentered(World.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var44 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			class430.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class390.logoSprite.drawAt(Login.xPadding + 382 - class390.logoSprite.subWidth / 2, 18);
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
			short var31;
			short var33;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
				var31 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
				var32 = var31 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
				var32 += 15;
				var32 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var32, 16777215, 0);
					var33 = 200;

					for (var5 = UserComparator10.method2926(); var0.stringWidth(var5) > var33; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), Login.loginBoxX + 180 - 70, var32, 16777215, 0);
					var32 += 15;

					for (var6 = class132.method3057(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6, Login.loginBoxX + 180 - 108, var32, 16777215, 0);
					var32 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var31 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var31 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var31 = 201;
					var0.drawCentered(Login.Login_response1, ReflectionCheck.loginBoxCenter, var31, 16776960, 0);
					var32 = var31 + 15;
					var0.drawCentered(Login.Login_response2, ReflectionCheck.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var0.drawCentered(Login.Login_response3, ReflectionCheck.loginBoxCenter, var32, 16776960, 0);
					var32 += 15;
					var32 += 7;
					var0.draw("Login: ", ReflectionCheck.loginBoxCenter - 110, var32, 16777215, 0);
					var33 = 200;

					for (var5 = UserComparator10.method2926(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), ReflectionCheck.loginBoxCenter - 70, var32, 16777215, 0);
					var32 += 15;

					for (var6 = class132.method3057(Login.Login_password); var0.stringWidth(var6) > var33; var6 = var6.substring(1)) {
					}

					var0.draw("Password: " + var6 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), ReflectionCheck.loginBoxCenter - 108, var32, 16777215, 0);
					var32 += 15;
					var31 = 277;
					var7 = ReflectionCheck.loginBoxCenter + -117;
					boolean var9 = Client.Login_isUsernameRemembered;
					boolean var10 = Login.field949;
					IndexedSprite var26 = var9 ? (var10 ? class443.field4751 : AuthenticationScheme.options_buttons_2Sprite) : (var10 ? TriBool.field4811 : class27.options_buttons_0Sprite);
					var26.drawAt(var7, var31);
					var7 = var7 + var26.subWidth + 5;
					var1.draw("Remember username", var7, var31 + 13, 16776960, 0);
					var7 = ReflectionCheck.loginBoxCenter + 24;
					boolean var13 = NPC.clientPreferences.isUsernameHidden();
					boolean var14 = Login.field950;
					IndexedSprite var12 = var13 ? (var14 ? class443.field4751 : AuthenticationScheme.options_buttons_2Sprite) : (var14 ? TriBool.field4811 : class27.options_buttons_0Sprite);
					var12.drawAt(var7, var31);
					var7 = var7 + var12.subWidth + 5;
					var1.draw("Hide username", var7, var31 + 13, 16776960, 0);
					var32 = var31 + 15;
					int var15 = ReflectionCheck.loginBoxCenter - 80;
					short var16 = 321;
					Login.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
					var0.drawCentered("Login", var15, var16 + 5, 16777215, 0);
					var15 = ReflectionCheck.loginBoxCenter + 80;
					Login.titlebuttonSprite.drawAt(var15 - 73, var16 - 20);
					var0.drawCentered("Cancel", var15, var16 + 5, 16777215, 0);
					var31 = 357;
					switch(Login.field938) {
					case 2:
						class93.field1171 = "Having trouble logging in?";
						break;
					default:
						class93.field1171 = "Can't login? Click here.";
					}

					Players.field1381 = new Bounds(ReflectionCheck.loginBoxCenter, var31, var1.stringWidth(class93.field1171), 11);
					class136.field1626 = new Bounds(ReflectionCheck.loginBoxCenter, var31, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(class93.field1171, ReflectionCheck.loginBoxCenter, var31, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var31 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var31, 16776960, 0);
					var32 = var31 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var32, 16776960, 0);
					var32 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var32, 16776960, 0);
					var32 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var8;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.draw("PIN: " + class132.method3057(class27.otp) + (Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var32, 16777215, 0);
						var32 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var32 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var32, 16776960, 0);
						var4 = 180 + Login.loginBoxX - 9 + var0.stringWidth("for 30 days: ") + 15;
						var45 = var32 - var0.ascent;
						IndexedSprite var34;
						if (Login.rememberUsername) {
							var34 = AuthenticationScheme.options_buttons_2Sprite;
						} else {
							var34 = class27.options_buttons_0Sprite;
						}

						var34.drawAt(var4, var45);
						var32 += 15;
						var7 = Login.loginBoxX + 180 - 80;
						var8 = 321;
						Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Continue", var7, var8 + 5, 16777215, 0);
						var7 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Cancel", var7, var8 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var8 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var31 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var32 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var32, 16777215, 0);
						var33 = 174;

						for (var5 = UserComparator10.method2926(); var0.stringWidth(var5) > var33; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + (Client.cycle % 40 < 20 ? Decimator.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var32, 16777215, 0);
						var32 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						short var36 = 321;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Recover", var25, var36 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var25 - 73, var36 - 20);
						var0.drawCentered("Back", var25, var36 + 5, 16777215, 0);
						var36 = 356;
						var1.drawCentered("Still having trouble logging in?", ReflectionCheck.loginBoxCenter, var36, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (WorldMapRectangle.field3108 && !Client.onMobile) {
							var31 = 201;
							var0.drawCentered(Login.Login_response1, ReflectionCheck.loginBoxCenter, var31, 16776960, 0);
							var32 = var31 + 15;
							var0.drawCentered(Login.Login_response2, ReflectionCheck.loginBoxCenter, var32, 16776960, 0);
							var32 += 15;
							var0.drawCentered(Login.Login_response3, ReflectionCheck.loginBoxCenter, var32, 16776960, 0);
							var4 = ReflectionCheck.loginBoxCenter - 150;
							var32 += 10;

							for (var45 = 0; var45 < 8; ++var45) {
								Login.titlebuttonSprite.method9686(var4, var32, 30, 40);
								boolean var47 = var45 == Login.field946 & Client.cycle % 40 < 20;
								var0.draw((Login.field931[var45] == null ? "" : Login.field931[var45]) + (var47 ? Decimator.colorStartTag(16776960) + "|" : ""), var4 + 10, var32 + 27, 16777215, 0);
								if (var45 != 1 && var45 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var32 + 27, 16777215, 0);
								}
							}

							var45 = ReflectionCheck.loginBoxCenter - 80;
							short var48 = 321;
							Login.titlebuttonSprite.drawAt(var45 - 73, var48 - 20);
							var0.drawCentered("Submit", var45, var48 + 5, 16777215, 0);
							var45 = ReflectionCheck.loginBoxCenter + 80;
							Login.titlebuttonSprite.drawAt(var45 - 73, var48 - 20);
							var0.drawCentered("Cancel", var45, var48 + 5, 16777215, 0);
						} else {
							var31 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
							var32 = var31 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0);
							var32 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0);
							var32 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var31 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var32 = Login.loginBoxX + 180;
						var33 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0);
						var4 = var33 + 20;
						class86.field1065.drawAt(var32 - 109, var4);
						if (Login.displayName.isEmpty()) {
							class179.field1901.drawAt(var32 - 48, var4 + 18);
						} else {
							class179.field1901.drawAt(var32 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var32, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var32 = ReflectionCheck.loginBoxCenter;
						var33 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var32, var33, 16777215, 0);
						var4 = var33 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var32, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var32, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var32, var4, 16777215, 0);
						var32 = ReflectionCheck.loginBoxCenter - 80;
						var33 = 311;
						Login.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Accept", var32, var33 + 5, 16777215, 0);
						var32 = ReflectionCheck.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var32 - 73, var33 - 20);
						var0.drawCentered("Decline", var32, var33 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var31 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var32, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var31 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var31 - 20);
						var0.drawCentered("Back", var4, var31 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var31 = 201;
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
							var6 = Strings.field4137;
							break;
						default:
							class130.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var32, 16776960, 0);
						var7 = Login.loginBoxX + 180;
						var8 = 276;
						Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var7, var8 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var7, var8 + 5, 16777215, 0);
						}

						var7 = Login.loginBoxX + 180;
						var8 = 326;
						Login.titlebuttonSprite.drawAt(var7 - 73, var8 - 20);
						var0.drawCentered("Back", var7, var8 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var31 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16777215, 0);
						var32 = var31 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16777215, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var31 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var31 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var31, 16776960, 0);
						var32 = var31 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var32, 16776960, 0);
						var32 += 15;
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
				int[] var27 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var27);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class342.canvasHeight);
				class59.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class59.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var27);
			}

			ApproximateRouteStrategy.title_muteSprite[NPC.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == GraphicsObject.clientLanguage) {
				if (class1.field3 != null) {
					var32 = Login.xPadding + 5;
					var33 = 463;
					byte var51 = 100;
					byte var49 = 35;
					class1.field3.drawAt(var32, var33);
					var0.drawCentered("World" + " " + Client.worldId, var51 / 2 + var32, var49 / 2 + var33 - 2, 16777215, 0);
					if (class529.World_request != null) {
						var1.drawCentered("Loading...", var51 / 2 + var32, var49 / 2 + var33 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var51 / 2 + var32, var49 / 2 + var33 + 12, 16777215, 0);
					}
				} else {
					class1.field3 = class153.SpriteBuffer_getIndexedSpriteByName(GameEngine.archive8, "sl_button", "");
				}
			}

		}
	}
}
