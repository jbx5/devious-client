import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ct")
@Implements("Message")
public class Message extends DualNode {
	@ObfuscatedName("ih")
	@ObfuscatedGetter(
		intValue = -937355973
	)
	static int field473;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1313413877
	)
	@Export("count")
	int count;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1094423695
	)
	@Export("cycle")
	int cycle;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 864676807
	)
	@Export("type")
	int type;
	@ObfuscatedName("am")
	@Export("sender")
	String sender;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lwf;"
	)
	@Export("senderUsername")
	Username senderUsername;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("isFromFriend0")
	TriBool isFromFriend0;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("isFromIgnored0")
	TriBool isFromIgnored0;
	@ObfuscatedName("at")
	@Export("prefix")
	String prefix;
	@ObfuscatedName("au")
	@Export("text")
	String text;

	Message(int var1, String var2, String var3, String var4) {
		this.isFromFriend0 = TriBool.TriBool_unknown;
		this.isFromIgnored0 = TriBool.TriBool_unknown;
		this.set(var1, var2, var3, var4);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V",
		garbageValue = "-82"
	)
	@Export("set")
	void set(int var1, String var2, String var3, String var4) {
		this.count = GameBuild.method7429();
		this.cycle = Client.cycle;
		this.type = var1;
		this.sender = var2;
		this.fillSenderUsername();
		this.prefix = var3;
		this.text = var4;
		this.clearIsFromFriend();
		this.clearIsFromIgnored();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1372683928"
	)
	@Export("clearIsFromFriend")
	void clearIsFromFriend() {
		this.isFromFriend0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-382112490"
	)
	@Export("isFromFriend")
	final boolean isFromFriend() {
		if (this.isFromFriend0 == TriBool.TriBool_unknown) {
			this.fillIsFromFriend();
		}

		return this.isFromFriend0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1710686805"
	)
	@Export("fillIsFromFriend")
	void fillIsFromFriend() {
		this.isFromFriend0 = class425.friendSystem.friendsList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	@Export("clearIsFromIgnored")
	void clearIsFromIgnored() {
		this.isFromIgnored0 = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-589484696"
	)
	@Export("isFromIgnored")
	final boolean isFromIgnored() {
		if (this.isFromIgnored0 == TriBool.TriBool_unknown) {
			this.fillIsFromIgnored();
		}

		return this.isFromIgnored0 == TriBool.TriBool_true;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	@Export("fillIsFromIgnored")
	void fillIsFromIgnored() {
		this.isFromIgnored0 = class425.friendSystem.ignoreList.contains(this.senderUsername) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-762474917"
	)
	@Export("fillSenderUsername")
	final void fillSenderUsername() {
		if (this.sender != null) {
			this.senderUsername = new Username(class158.method3553(this.sender), class28.loginType);
		} else {
			this.senderUsername = null;
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	static int method1223(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
		if (var2 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var3 = 0;

			for (int var4 = 0; var4 < var2.quantities.length; ++var4) {
				if (var2.ids[var4] == var1) {
					var3 += var2.quantities[var4];
				}
			}

			return var3;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqu;Lqu;Lqu;S)V",
		garbageValue = "27827"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class154.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		AbstractByteArrayCopier.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var11;
		int var18;
		int var25;
		int var26;
		int var28;
		int var29;
		int var36;
		int var46;
		if (Login.worldSelectOpen) {
			if (class6.worldSelectBackSprites == null) {
				class6.worldSelectBackSprites = class271.method5642(ApproximateRouteStrategy.archive8, "sl_back", "");
			}

			if (HttpRequestTask.worldSelectFlagSprites == null) {
				HttpRequestTask.worldSelectFlagSprites = class219.getFont(ApproximateRouteStrategy.archive8, "sl_flags", "");
			}

			if (WorldMapIcon_0.worldSelectArrows == null) {
				WorldMapIcon_0.worldSelectArrows = class219.getFont(ApproximateRouteStrategy.archive8, "sl_arrows", "");
			}

			if (class113.worldSelectStars == null) {
				class113.worldSelectStars = class219.getFont(ApproximateRouteStrategy.archive8, "sl_stars", "");
			}

			if (class178.worldSelectLeftSprite == null) {
				class178.worldSelectLeftSprite = Buddy.SpriteBuffer_getIndexedSpriteByName(ApproximateRouteStrategy.archive8, "leftarrow", "");
			}

			if (HorizontalAlignment.worldSelectRightSprite == null) {
				HorizontalAlignment.worldSelectRightSprite = Buddy.SpriteBuffer_getIndexedSpriteByName(ApproximateRouteStrategy.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class113.worldSelectStars != null) {
				class113.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class113.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			int var50;
			if (WorldMapIcon_0.worldSelectArrows != null) {
				var36 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					WorldMapIcon_0.worldSelectArrows[2].drawAt(var36, 4);
				} else {
					WorldMapIcon_0.worldSelectArrows[0].drawAt(var36, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					WorldMapIcon_0.worldSelectArrows[3].drawAt(var36 + 15, 4);
				} else {
					WorldMapIcon_0.worldSelectArrows[1].drawAt(var36 + 15, 4);
				}

				var0.draw("World", var36 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					WorldMapIcon_0.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					WorldMapIcon_0.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					WorldMapIcon_0.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					WorldMapIcon_0.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var46 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					WorldMapIcon_0.worldSelectArrows[2].drawAt(var46, 4);
				} else {
					WorldMapIcon_0.worldSelectArrows[0].drawAt(var46, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					WorldMapIcon_0.worldSelectArrows[3].drawAt(var46 + 15, 4);
				} else {
					WorldMapIcon_0.worldSelectArrows[1].drawAt(var46 + 15, 4);
				}

				var0.draw("Location", var46 + 32, 17, 16777215, -1);
				var50 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					WorldMapIcon_0.worldSelectArrows[2].drawAt(var50, 4);
				} else {
					WorldMapIcon_0.worldSelectArrows[0].drawAt(var50, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					WorldMapIcon_0.worldSelectArrows[3].drawAt(var50 + 15, 4);
				} else {
					WorldMapIcon_0.worldSelectArrows[1].drawAt(var50 + 15, 4);
				}

				var0.draw("Type", var50 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class6.worldSelectBackSprites != null) {
				var3 = 88;
				byte var41 = 19;
				var46 = 765 / (var3 + 1) - 1;
				var50 = 480 / (var41 + 1);

				do {
					var25 = var50;
					var26 = var46;
					if (var50 * (var46 - 1) >= World.World_count) {
						--var46;
					}

					if (var46 * (var50 - 1) >= World.World_count) {
						--var50;
					}

					if (var46 * (var50 - 1) >= World.World_count) {
						--var50;
					}
				} while(var25 != var50 || var26 != var46);

				var25 = (765 - var3 * var46) / (var46 + 1);
				if (var25 > 5) {
					var25 = 5;
				}

				var26 = (480 - var50 * var41) / (var50 + 1);
				if (var26 > 5) {
					var26 = 5;
				}

				var28 = (765 - var46 * var3 - var25 * (var46 - 1)) / 2;
				var29 = (480 - var50 * var41 - var26 * (var50 - 1)) / 2;
				var11 = (var50 + World.World_count - 1) / var50;
				Login.worldSelectPagesCount = var11 - var46;
				if (class178.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					class178.worldSelectLeftSprite.drawAt(8, UrlRequester.canvasHeight / 2 - class178.worldSelectLeftSprite.subHeight * -117168624 / 2);
				}

				if (HorizontalAlignment.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					HorizontalAlignment.worldSelectRightSprite.drawAt(class154.canvasWidth - HorizontalAlignment.worldSelectRightSprite.subWidth - 8, UrlRequester.canvasHeight / 2 - HorizontalAlignment.worldSelectRightSprite.subHeight * -117168624 / 2);
				}

				int var39 = var29 + 23;
				int var40 = var28 + Login.xPadding;
				int var32 = 0;
				boolean var33 = false;
				int var42 = Login.worldSelectPage;

				int var43;
				for (var43 = var50 * var42; var43 < World.World_count && var42 - Login.worldSelectPage < var46; ++var43) {
					World var34 = SoundSystem.World_worlds[var43];
					boolean var44 = true;
					String var20 = Integer.toString(var34.population);
					if (var34.population == -1) {
						var20 = "OFF";
						var44 = false;
					} else if (var34.population > 1980) {
						var20 = "FULL";
						var44 = false;
					}

					class113 var21 = null;
					int var22 = 0;
					if (var34.isBeta()) {
						var21 = var34.isMembersOnly() ? class113.field1449 : class113.field1448;
					} else if (var34.isDeadman()) {
						var21 = var34.isMembersOnly() ? class113.field1457 : class113.field1456;
					} else if (var34.method1931()) {
						var22 = 16711680;
						var21 = var34.isMembersOnly() ? class113.field1443 : class113.field1446;
					} else if (var34.method1950()) {
						var21 = var34.isMembersOnly() ? class113.field1455 : class113.field1442;
					} else if (var34.isPvp()) {
						var21 = var34.isMembersOnly() ? class113.field1447 : class113.field1444;
					} else if (var34.method1934()) {
						var21 = var34.isMembersOnly() ? class113.field1453 : class113.field1452;
					} else if (var34.method1935()) {
						var21 = var34.isMembersOnly() ? class113.field1390 : class113.field1451;
					}

					if (var21 == null || var21.field1458 >= class6.worldSelectBackSprites.length) {
						var21 = var34.isMembersOnly() ? class113.field1450 : class113.field1454;
					}

					if (MouseHandler.MouseHandler_x >= var40 && MouseHandler.MouseHandler_y >= var39 && MouseHandler.MouseHandler_x < var40 + var3 && MouseHandler.MouseHandler_y < var41 + var39 && var44) {
						Login.hoveredWorldIndex = var43;
						class6.worldSelectBackSprites[var21.field1458].drawTransOverlayAt(var40, var39, 128, 16777215);
						var33 = true;
					} else {
						class6.worldSelectBackSprites[var21.field1458].drawAt(var40, var39);
					}

					if (HttpRequestTask.worldSelectFlagSprites != null) {
						HttpRequestTask.worldSelectFlagSprites[(var34.isMembersOnly() ? 8 : 0) + var34.location].drawAt(var40 + 29, var39);
					}

					var0.drawCentered(Integer.toString(var34.id), var40 + 15, var41 / 2 + var39 + 5, var22, -1);
					var1.drawCentered(var20, var40 + 60, var41 / 2 + var39 + 5, 268435455, -1);
					var39 = var39 + var41 + var26;
					++var32;
					if (var32 >= var50) {
						var39 = var29 + 23;
						var40 = var40 + var25 + var3;
						var32 = 0;
						++var42;
					}
				}

				if (var33) {
					var43 = var1.stringWidth(SoundSystem.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					var18 = var1.ascent + 8;
					int var45 = MouseHandler.MouseHandler_y + 25;
					if (var18 + var45 > 480) {
						var45 = MouseHandler.MouseHandler_y - 25 - var18;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var43 / 2, var45, var43, var18, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var43 / 2, var45, var43, var18, 0);
					var1.drawCentered(SoundSystem.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var45 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			class331.leftTitleSprite.drawAt(Login.xPadding, 0);
			WorldMapCacheName.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			UserComparator8.logoSprite.drawAt(Login.xPadding + 382 - UserComparator8.logoSprite.subWidth / 2, 18);
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
			String var8;
			String var9;
			short var35;
			short var37;
			if (Client.gameState == 20) {
				class158.titleboxSprite.drawAt(Login.loginBoxX + 180 - class158.titleboxSprite.subWidth / 2, 271 - class158.titleboxSprite.subHeight * -117168624 / 2);
				var35 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16776960, 0);
				var36 = var35 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16776960, 0);
				var36 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16776960, 0);
				var36 += 15;
				var36 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var36, 16777215, 0);
					var37 = 200;
					if (class461.clientPreferences.isUsernameHidden()) {
						var8 = Login.Login_username;
						var7 = class172.method3745('*', var8.length());
						var6 = var7;
					} else {
						var6 = Login.Login_username;
					}

					for (var6 = var6; var0.stringWidth(var6) > var37; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var36, 16777215, 0);
					var36 += 15;
					var8 = Login.Login_password;
					var7 = class172.method3745('*', var8.length());

					for (var9 = var7; var0.stringWidth(var9) > var37; var9 = var9.substring(1)) {
					}

					var0.draw("Password: " + var9, Login.loginBoxX + 180 - 108, var36, 16777215, 0);
					var36 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				class158.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var35 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0);
					var36 = var35 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var35 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16777215, 0);
					var36 = var35 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16777215, 0);
					var36 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16777215, 0);
					var36 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var35 = 201;
					var0.drawCentered(Login.Login_response1, AbstractByteArrayCopier.loginBoxCenter, var35, 16776960, 0);
					var36 = var35 + 15;
					var0.drawCentered(Login.Login_response2, AbstractByteArrayCopier.loginBoxCenter, var36, 16776960, 0);
					var36 += 15;
					var0.drawCentered(Login.Login_response3, AbstractByteArrayCopier.loginBoxCenter, var36, 16776960, 0);
					var36 += 15;
					var36 += 7;
					var0.draw("Login: ", AbstractByteArrayCopier.loginBoxCenter - 110, var36, 16777215, 0);
					var37 = 200;
					if (class461.clientPreferences.isUsernameHidden()) {
						var8 = Login.Login_username;
						var7 = class172.method3745('*', var8.length());
						var6 = var7;
					} else {
						var6 = Login.Login_username;
					}

					for (var6 = var6; var0.stringWidth(var6) > var37; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? HttpMethod.colorStartTag(16776960) + "|" : ""), AbstractByteArrayCopier.loginBoxCenter - 70, var36, 16777215, 0);
					var36 += 15;
					var8 = Login.Login_password;
					var7 = class172.method3745('*', var8.length());

					for (var9 = var7; var0.stringWidth(var9) > var37; var9 = var9.substring(1)) {
					}

					var0.draw("Password: " + var9 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? HttpMethod.colorStartTag(16776960) + "|" : ""), AbstractByteArrayCopier.loginBoxCenter - 108, var36, 16777215, 0);
					var36 += 15;
					var35 = 277;
					var29 = AbstractByteArrayCopier.loginBoxCenter + -117;
					boolean var12 = Client.Login_isUsernameRemembered;
					boolean var13 = Login.field971;
					IndexedSprite var30 = var12 ? (var13 ? class7.field20 : TransformationMatrix.options_buttons_2Sprite) : (var13 ? GrandExchangeOfferOwnWorldComparator.field486 : class174.options_buttons_0Sprite);
					var30.drawAt(var29, var35);
					var29 = var29 + var30.subWidth + 5;
					var1.draw("Remember username", var29, var35 + 13, 16776960, 0);
					var29 = AbstractByteArrayCopier.loginBoxCenter + 24;
					boolean var16 = class461.clientPreferences.isUsernameHidden();
					boolean var17 = Login.field972;
					IndexedSprite var15 = var16 ? (var17 ? class7.field20 : TransformationMatrix.options_buttons_2Sprite) : (var17 ? GrandExchangeOfferOwnWorldComparator.field486 : class174.options_buttons_0Sprite);
					var15.drawAt(var29, var35);
					var29 = var29 + var15.subWidth + 5;
					var1.draw("Hide username", var29, var35 + 13, 16776960, 0);
					var36 = var35 + 15;
					var18 = AbstractByteArrayCopier.loginBoxCenter - 80;
					short var19 = 321;
					Login.titlebuttonSprite.drawAt(var18 - 73, var19 - 20);
					var0.drawCentered("Login", var18, var19 + 5, 16777215, 0);
					var18 = AbstractByteArrayCopier.loginBoxCenter + 80;
					Login.titlebuttonSprite.drawAt(var18 - 73, var19 - 20);
					var0.drawCentered("Cancel", var18, var19 + 5, 16777215, 0);
					var35 = 357;
					switch(Login.field960) {
					case 2:
						JagexCache.field2381 = "Having trouble logging in?";
						break;
					default:
						JagexCache.field2381 = "Can't login? Click here.";
					}

					class53.field349 = new Bounds(AbstractByteArrayCopier.loginBoxCenter, var35, var1.stringWidth(JagexCache.field2381), 11);
					World.field824 = new Bounds(AbstractByteArrayCopier.loginBoxCenter, var35, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(JagexCache.field2381, AbstractByteArrayCopier.loginBoxCenter, var35, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var35 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var35, 16776960, 0);
					var36 = var35 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var36, 16776960, 0);
					var36 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var36, 16776960, 0);
					var36 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					String var5;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var35 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16777215, 0);
						var36 = var35 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16777215, 0);
						var36 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16777215, 0);
						var36 += 15;
						var5 = "PIN: ";
						var7 = Language.otp;
						var6 = class172.method3745('*', var7.length());
						var0.draw(var5 + var6 + (Client.cycle % 40 < 20 ? HttpMethod.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var36, 16777215, 0);
						var36 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var36, 16776960, 0);
						var36 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var36, 16776960, 0);
						var26 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var28 = var36 - var0.ascent;
						IndexedSprite var10;
						if (Login.rememberUsername) {
							var10 = TransformationMatrix.options_buttons_2Sprite;
						} else {
							var10 = class174.options_buttons_0Sprite;
						}

						var10.drawAt(var26, var28);
						var36 += 15;
						var11 = Login.loginBoxX + 180 - 80;
						short var38 = 321;
						Login.titlebuttonSprite.drawAt(var11 - 73, var38 - 20);
						var0.drawCentered("Continue", var11, var38 + 5, 16777215, 0);
						var11 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var11 - 73, var38 - 20);
						var0.drawCentered("Cancel", var11, var38 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var38 + 36, 16777215, 0);
					} else {
						short var47;
						if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var35 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16776960, 0);
							var36 = var35 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 15;
							var36 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var36, 16777215, 0);
							var37 = 174;
							if (class461.clientPreferences.isUsernameHidden()) {
								var8 = Login.Login_username;
								var7 = class172.method3745('*', var8.length());
								var6 = var7;
							} else {
								var6 = Login.Login_username;
							}

							for (var6 = var6; var0.stringWidth(var6) > var37; var6 = var6.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? HttpMethod.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var36, 16777215, 0);
							var36 += 15;
							var25 = Login.loginBoxX + 180 - 80;
							var47 = 321;
							Login.titlebuttonSprite.drawAt(var25 - 73, var47 - 20);
							var0.drawCentered("Recover", var25, var47 + 5, 16777215, 0);
							var25 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var25 - 73, var47 - 20);
							var0.drawCentered("Back", var25, var47 + 5, 16777215, 0);
							var47 = 356;
							var1.drawCentered("Still having trouble logging in?", AbstractByteArrayCopier.loginBoxCenter, var47, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var35 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16776960, 0);
							var36 = var35 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 15;
							var4 = Login.loginBoxX + 180;
							var23 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							if (KeyHandler.field109 && !Client.onMobile) {
								var35 = 201;
								var0.drawCentered(Login.Login_response1, AbstractByteArrayCopier.loginBoxCenter, var35, 16776960, 0);
								var36 = var35 + 15;
								var0.drawCentered(Login.Login_response2, AbstractByteArrayCopier.loginBoxCenter, var36, 16776960, 0);
								var36 += 15;
								var0.drawCentered(Login.Login_response3, AbstractByteArrayCopier.loginBoxCenter, var36, 16776960, 0);
								var4 = AbstractByteArrayCopier.loginBoxCenter - 150;
								var36 += 10;

								for (var46 = 0; var46 < 8; ++var46) {
									Login.titlebuttonSprite.method10359(var4, var36, 30, 40);
									boolean var27 = var46 == Login.field982 & Client.cycle % 40 < 20;
									var0.draw((Login.field970[var46] == null ? "" : Login.field970[var46]) + (var27 ? HttpMethod.colorStartTag(16776960) + "|" : ""), var4 + 10, var36 + 27, 16777215, 0);
									if (var46 != 1 && var46 != 3) {
										var4 += 35;
									} else {
										var4 += 50;
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var36 + 27, 16777215, 0);
									}
								}

								var46 = AbstractByteArrayCopier.loginBoxCenter - 80;
								short var48 = 321;
								Login.titlebuttonSprite.drawAt(var46 - 73, var48 - 20);
								var0.drawCentered("Submit", var46, var48 + 5, 16777215, 0);
								var46 = AbstractByteArrayCopier.loginBoxCenter + 80;
								Login.titlebuttonSprite.drawAt(var46 - 73, var48 - 20);
								var0.drawCentered("Cancel", var46, var48 + 5, 16777215, 0);
							} else {
								var35 = 216;
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var35, 16776960, 0);
								var36 = var35 + 15;
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var36, 16776960, 0);
								var36 += 15;
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var36, 16776960, 0);
								var36 += 15;
								var4 = Login.loginBoxX + 180 - 80;
								var23 = 321;
								Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
								var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
								var4 = Login.loginBoxX + 180 + 80;
								Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
								var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
							}
						} else if (Login.loginIndex == 8) {
							var35 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var35, 16776960, 0);
							var36 = var35 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 9) {
							var35 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16776960, 0);
							var36 = var35 + 25;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 25;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16776960, 0);
							var4 = Login.loginBoxX + 180;
							var23 = 311;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 10) {
							var36 = Login.loginBoxX + 180;
							var37 = 209;
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var37, 16776960, 0);
							var4 = var37 + 20;
							Login.field980.drawAt(var36 - 109, var4);
							if (Login.displayName.isEmpty()) {
								Login.field948.drawAt(var36 - 48, var4 + 18);
							} else {
								Login.field948.drawAt(var36 - 48, var4 + 5);
								var0.drawCentered(Login.displayName, var36, var4 + 68 - 15, 16776960, 0);
							}
						} else if (Login.loginIndex == 12) {
							var36 = AbstractByteArrayCopier.loginBoxCenter;
							var37 = 216;
							var2.drawCentered("Before using this app, please read and accept our", var36, var37, 16777215, 0);
							var4 = var37 + 17;
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var36, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var36, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("By accepting, you agree to these documents.", var36, var4, 16777215, 0);
							var36 = AbstractByteArrayCopier.loginBoxCenter - 80;
							var37 = 311;
							Login.titlebuttonSprite.drawAt(var36 - 73, var37 - 20);
							var0.drawCentered("Accept", var36, var37 + 5, 16777215, 0);
							var36 = AbstractByteArrayCopier.loginBoxCenter + 80;
							Login.titlebuttonSprite.drawAt(var36 - 73, var37 - 20);
							var0.drawCentered("Decline", var36, var37 + 5, 16777215, 0);
						} else if (Login.loginIndex == 13) {
							var35 = 231;
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var35, 16777215, 0);
							var36 = var35 + 20;
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var36, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var35 = 311;
							Login.titlebuttonSprite.drawAt(var4 - 73, var35 - 20);
							var0.drawCentered("Back", var4, var35 + 5, 16777215, 0);
						} else if (Login.loginIndex == 14) {
							var35 = 201;
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
								var6 = Strings.field4267;
								break;
							default:
								RouteStrategy.Login_promptCredentials(false);
							}

							var0.drawCentered(var24, Login.loginBoxX + 180, var35, 16776960, 0);
							var36 = var35 + 20;
							var0.drawCentered(var5, Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 20;
							var0.drawCentered(var6, Login.loginBoxX + 180, var36, 16776960, 0);
							var25 = Login.loginBoxX + 180;
							var47 = 276;
							Login.titlebuttonSprite.drawAt(var25 - 73, var47 - 20);
							if (Login.Login_banType == 1) {
								var0.drawCentered("Recover Account", var25, var47 + 5, 16777215, 0);
							} else {
								var0.drawCentered("View Appeal Options", var25, var47 + 5, 16777215, 0);
							}

							var25 = Login.loginBoxX + 180;
							var47 = 326;
							Login.titlebuttonSprite.drawAt(var25 - 73, var47 - 20);
							var0.drawCentered("Back", var25, var47 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var35 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16777215, 0);
							var36 = var35 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16777215, 0);
							var36 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16777215, 0);
							var36 += 15;
							var4 = Login.loginBoxX + 180;
							var23 = 301;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 32) {
							var35 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var35, 16776960, 0);
							var36 = var35 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 33) {
							var35 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var35, 16776960, 0);
							var36 = var35 + 20;
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 20;
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var36, 16776960, 0);
							var36 += 15;
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
			}

			if (Client.gameState >= 10) {
				int[] var31 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var31);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, UrlRequester.canvasHeight);
				class268.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class268.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var31);
			}

			AuthenticationScheme.title_muteSprite[class461.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && LoginScreenAnimation.clientLanguage == Language.Language_EN) {
				if (class138.field1636 != null) {
					var36 = Login.xPadding + 5;
					var37 = 463;
					byte var51 = 100;
					byte var49 = 35;
					class138.field1636.drawAt(var36, var37);
					var0.drawCentered("World" + " " + Client.worldId, var51 / 2 + var36, var49 / 2 + var37 - 2, 16777215, 0);
					if (VarbitComposition.World_request != null) {
						var1.drawCentered("Loading...", var51 / 2 + var36, var49 / 2 + var37 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var51 / 2 + var36, var49 / 2 + var37 + 12, 16777215, 0);
					}
				} else {
					class138.field1636 = Buddy.SpriteBuffer_getIndexedSpriteByName(ApproximateRouteStrategy.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "(ZLva;I)V",
		garbageValue = "989872278"
	)
	@Export("loadRegions")
	static final void loadRegions(boolean var0, PacketBuffer var1) {
		Client.isInInstance = var0;
		int var2;
		int var3;
		int var5;
		int var6;
		int var7;
		if (!Client.isInInstance) {
			var2 = var1.readUnsignedShort();
			var1.readSignedShort();
			var3 = var1.readUnsignedShortLE();
			int var4 = var1.readUnsignedShort();
			class360.xteaKeys = new int[var4][4];

			for (var5 = 0; var5 < var4; ++var5) {
				for (var6 = 0; var6 < 4; ++var6) {
					class360.xteaKeys[var5][var6] = var1.readInt();
				}
			}

			Occluder.regions = new int[var4];
			class7.regionMapArchiveIds = new int[var4];
			class528.regionLandArchiveIds = new int[var4];
			SecureRandomCallable.regionLandArchives = new byte[var4][];
			FloorOverlayDefinition.regionMapArchives = new byte[var4][];
			var4 = 0;

			for (var5 = (var2 - 6) / 8; var5 <= (var2 + 6) / 8; ++var5) {
				for (var6 = (var3 - 6) / 8; var6 <= (var3 + 6) / 8; ++var6) {
					var7 = var6 + (var5 << 8);
					Occluder.regions[var4] = var7;
					class7.regionMapArchiveIds[var4] = Bounds.archive9.getGroupId("m" + var5 + "_" + var6);
					class528.regionLandArchiveIds[var4] = Bounds.archive9.getGroupId("l" + var5 + "_" + var6);
					++var4;
				}
			}

			ClanSettings.method3585(var2, var3, true);
		} else {
			var2 = var1.readUnsignedShort();
			var3 = var1.readUnsignedShort();
			boolean var15 = var1.readUnsignedByteNeg() == 1;
			var5 = var1.readUnsignedShort();
			var1.importIndex();

			int var8;
			int var9;
			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = var1.readBits(1);
						if (var9 == 1) {
							Client.instanceChunkTemplates[var6][var7][var8] = var1.readBits(26);
						} else {
							Client.instanceChunkTemplates[var6][var7][var8] = -1;
						}
					}
				}
			}

			var1.exportIndex();
			class360.xteaKeys = new int[var5][4];

			for (var6 = 0; var6 < var5; ++var6) {
				for (var7 = 0; var7 < 4; ++var7) {
					class360.xteaKeys[var6][var7] = var1.readInt();
				}
			}

			Occluder.regions = new int[var5];
			class7.regionMapArchiveIds = new int[var5];
			class528.regionLandArchiveIds = new int[var5];
			SecureRandomCallable.regionLandArchives = new byte[var5][];
			FloorOverlayDefinition.regionMapArchives = new byte[var5][];
			var5 = 0;

			for (var6 = 0; var6 < 4; ++var6) {
				for (var7 = 0; var7 < 13; ++var7) {
					for (var8 = 0; var8 < 13; ++var8) {
						var9 = Client.instanceChunkTemplates[var6][var7][var8];
						if (var9 != -1) {
							int var10 = var9 >> 14 & 1023;
							int var11 = var9 >> 3 & 2047;
							int var12 = (var10 / 8 << 8) + var11 / 8;

							int var13;
							for (var13 = 0; var13 < var5; ++var13) {
								if (Occluder.regions[var13] == var12) {
									var12 = -1;
									break;
								}
							}

							if (var12 != -1) {
								Occluder.regions[var5] = var12;
								var13 = var12 >> 8 & 255;
								int var14 = var12 & 255;
								class7.regionMapArchiveIds[var5] = Bounds.archive9.getGroupId("m" + var13 + "_" + var14);
								class528.regionLandArchiveIds[var5] = Bounds.archive9.getGroupId("l" + var13 + "_" + var14);
								++var5;
							}
						}
					}
				}
			}

			ClanSettings.method3585(var3, var2, !var15);
		}

	}
}
