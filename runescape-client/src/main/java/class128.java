import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public abstract class class128 extends Node {
	@ObfuscatedName("t")
	@Export("ByteArrayPool_altSizeArrayCounts")
	static int[] ByteArrayPool_altSizeArrayCounts;
	@ObfuscatedName("a")
	@Export("formattedOperatingSystemName")
	public static String formattedOperatingSystemName;

	class128() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"-413979452")

	abstract void vmethod3168(Buffer var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lex;S)V", garbageValue = 
	"-10316")

	abstract void vmethod3162(ClanSettings var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/io/File;B)V", garbageValue = 
	"63")

	static void method2856(File var0) {
		class120.FileSystem_cacheDir = var0;
		if (!class120.FileSystem_cacheDir.exists()) {
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/Throwable;I)Ljava/lang/String;", garbageValue = 
	"-1938819519")

	static String method2853(Throwable var0) throws IOException {
		String var1;
		if (var0 instanceof RunException) {
			RunException var2 = ((RunException) (var0));
			var1 = var2.message + " | ";
			var0 = var2.throwable;
		} else {
			var1 = "";
		}

		StringWriter var12 = new StringWriter();
		PrintWriter var3 = new PrintWriter(var12);
		var0.printStackTrace(var3);
		var3.close();
		String var4 = var12.toString();
		BufferedReader var5 = new BufferedReader(new StringReader(var4));
		String var6 = var5.readLine();

		while (true) {
			while (true) {
				String var7 = var5.readLine();
				if (var7 == null) {
					var1 = (var1 + "| ") + var6;
					return var1;
				}

				int var8 = var7.indexOf(40);
				int var9 = var7.indexOf(41, var8 + 1);
				if ((var8 >= 0) && (var9 >= 0)) {
					String var10 = var7.substring(var8 + 1, var9);
					int var11 = var10.indexOf(".java:");
					if (var11 >= 0) {
						var10 = var10.substring(0, var11) + var10.substring(var11 + 5);
						var1 = (var1 + var10) + ' ';
						continue;
					}

					var7 = var7.substring(0, var8);
				}

				var7 = var7.trim();
				var7 = var7.substring(var7.lastIndexOf(32) + 1);
				var7 = var7.substring(var7.lastIndexOf(9) + 1);
				var1 = (var1 + var7) + ' ';
			} 
		} 
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Lmd;Lmd;Lmd;I)V", garbageValue = 
	"-461855642")

	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (InvDefinition.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		HealthBarDefinition.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var11;
		int var12;
		int var25;
		int var26;
		int var28;
		int var29;
		int var34;
		int var40;
		if (Login.worldSelectOpen) {
			int var46;
			if (class393.worldSelectBackSprites == null) {
				Archive var41 = class145.archive8;
				var40 = var41.getGroupId("sl_back");
				var46 = var41.getFileId(var40, "");
				SpritePixels[] var47 = class429.method7568(var41, var40, var46);
				class393.worldSelectBackSprites = var47;
			}

			if (class400.worldSelectFlagSprites == null) {
				class400.worldSelectFlagSprites = class93.method2386(class145.archive8, "sl_flags", "");
			}

			if (class126.worldSelectArrows == null) {
				class126.worldSelectArrows = class93.method2386(class145.archive8, "sl_arrows", "");
			}

			if (TileItem.worldSelectStars == null) {
				TileItem.worldSelectStars = class93.method2386(class145.archive8, "sl_stars", "");
			}

			if (class54.worldSelectLeftSprite == null) {
				class54.worldSelectLeftSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(class145.archive8, "leftarrow", "");
			}

			if (AttackOption.worldSelectRightSprite == null) {
				AttackOption.worldSelectRightSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(class145.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (TileItem.worldSelectStars != null) {
				TileItem.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				TileItem.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			if (class126.worldSelectArrows != null) {
				var34 = Login.xPadding + 280;
				if ((World.World_sortOption1[0] == 0) && (World.World_sortOption2[0] == 0)) {
					class126.worldSelectArrows[2].drawAt(var34, 4);
				} else {
					class126.worldSelectArrows[0].drawAt(var34, 4);
				}

				if ((World.World_sortOption1[0] == 0) && (World.World_sortOption2[0] == 1)) {
					class126.worldSelectArrows[3].drawAt(var34 + 15, 4);
				} else {
					class126.worldSelectArrows[1].drawAt(var34 + 15, 4);
				}

				var0.draw("World", var34 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if ((World.World_sortOption1[0] == 1) && (World.World_sortOption2[0] == 0)) {
					class126.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class126.worldSelectArrows[0].drawAt(var4, 4);
				}

				if ((World.World_sortOption1[0] == 1) && (World.World_sortOption2[0] == 1)) {
					class126.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class126.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var40 = Login.xPadding + 500;
				if ((World.World_sortOption1[0] == 2) && (World.World_sortOption2[0] == 0)) {
					class126.worldSelectArrows[2].drawAt(var40, 4);
				} else {
					class126.worldSelectArrows[0].drawAt(var40, 4);
				}

				if ((World.World_sortOption1[0] == 2) && (World.World_sortOption2[0] == 1)) {
					class126.worldSelectArrows[3].drawAt(var40 + 15, 4);
				} else {
					class126.worldSelectArrows[1].drawAt(var40 + 15, 4);
				}

				var0.draw("Location", var40 + 32, 17, 16777215, -1);
				var46 = Login.xPadding + 610;
				if ((World.World_sortOption1[0] == 3) && (World.World_sortOption2[0] == 0)) {
					class126.worldSelectArrows[2].drawAt(var46, 4);
				} else {
					class126.worldSelectArrows[0].drawAt(var46, 4);
				}

				if ((World.World_sortOption1[0] == 3) && (World.World_sortOption2[0] == 1)) {
					class126.worldSelectArrows[3].drawAt(var46 + 15, 4);
				} else {
					class126.worldSelectArrows[1].drawAt(var46 + 15, 4);
				}

				var0.draw("Type", var46 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", (Login.xPadding + 708) + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class393.worldSelectBackSprites != null) {
				var3 = 88;
				byte var38 = 19;
				var40 = (765 / (var3 + 1)) - 1;
				var46 = 480 / (var38 + 1);

				do {
					var25 = var46;
					var26 = var40;
					if ((var46 * (var40 - 1)) >= World.World_count) {
						--var40;
					}

					if ((var40 * (var46 - 1)) >= World.World_count) {
						--var46;
					}

					if ((var40 * (var46 - 1)) >= World.World_count) {
						--var46;
					}
				} while ((var25 != var46) || (var26 != var40) );

				var25 = (765 - (var3 * var40)) / (var40 + 1);
				if (var25 > 5) {
					var25 = 5;
				}

				var26 = (480 - (var46 * var38)) / (var46 + 1);
				if (var26 > 5) {
					var26 = 5;
				}

				var28 = ((765 - (var3 * var40)) - (var25 * (var40 - 1))) / 2;
				var29 = ((480 - (var46 * var38)) - (var26 * (var46 - 1))) / 2;
				var11 = ((var46 + World.World_count) - 1) / var46;
				Login.worldSelectPagesCount = var11 - var40;
				if ((class54.worldSelectLeftSprite != null) && (Login.worldSelectPage > 0)) {
					class54.worldSelectLeftSprite.drawAt(8, (class321.canvasHeight / 2) - (class54.worldSelectLeftSprite.subHeight / 2));
				}

				if ((AttackOption.worldSelectRightSprite != null) && (Login.worldSelectPage < Login.worldSelectPagesCount)) {
					AttackOption.worldSelectRightSprite.drawAt((InvDefinition.canvasWidth - AttackOption.worldSelectRightSprite.subWidth) - 8, (class321.canvasHeight / 2) - (AttackOption.worldSelectRightSprite.subHeight / 2));
				}

				var12 = var29 + 23;
				int var37 = var28 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var46 * var16; (var17 < World.World_count) && ((var16 - Login.worldSelectPage) < var40); ++var17) {
					World var18 = DevicePcmPlayerProvider.World_worlds[var17];
					boolean var19 = true;
					String var20 = Integer.toString(var18.population);
					if (var18.population == (-1)) {
						var20 = "OFF";
						var19 = false;
					} else if (var18.population > 1980) {
						var20 = "FULL";
						var19 = false;
					}

					int var22 = 0;
					byte var21;
					if (var18.isBeta()) {
						if (var18.isMembersOnly()) {
							var21 = 7;
						} else {
							var21 = 6;
						}
					} else if (var18.isDeadman()) {
						var22 = 16711680;
						if (var18.isMembersOnly()) {
							var21 = 5;
						} else {
							var21 = 4;
						}
					} else if (var18.method1642()) {
						if (var18.isMembersOnly()) {
							var21 = 9;
						} else {
							var21 = 8;
						}
					} else if (var18.isPvp()) {
						if (var18.isMembersOnly()) {
							var21 = 3;
						} else {
							var21 = 2;
						}
					} else if (var18.isMembersOnly()) {
						var21 = 1;
					} else {
						var21 = 0;
					}

					if (((((MouseHandler.MouseHandler_x >= var37) && (MouseHandler.MouseHandler_y >= var12)) && (MouseHandler.MouseHandler_x < (var37 + var3))) && (MouseHandler.MouseHandler_y < (var12 + var38))) && var19) {
						Login.hoveredWorldIndex = var17;
						class393.worldSelectBackSprites[var21].drawTransOverlayAt(var37, var12, 128, 16777215);
						var15 = true;
					} else {
						class393.worldSelectBackSprites[var21].drawAt(var37, var12);
					}

					if (class400.worldSelectFlagSprites != null) {
						class400.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var37 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var37 + 15, ((var38 / 2) + var12) + 5, var22, -1);
					var1.drawCentered(var20, var37 + 60, ((var38 / 2) + var12) + 5, 268435455, -1);
					var12 = (var12 + var38) + var26;
					++var14;
					if (var14 >= var46) {
						var12 = var29 + 23;
						var37 = (var37 + var3) + var25;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(DevicePcmPlayerProvider.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var32 = var1.ascent + 8;
					int var39 = MouseHandler.MouseHandler_y + 25;
					if ((var39 + var32) > 480) {
						var39 = (MouseHandler.MouseHandler_y - 25) - var32;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - (var17 / 2), var39, var17, var32, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - (var17 / 2), var39, var17, var32, 0);
					var1.drawCentered(DevicePcmPlayerProvider.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, (var39 + var1.ascent) + 4, 0, -1);
				}
			}

			FontName.rasterProvider.drawFull(0, 0);
		} else {
			class17.leftTitleSprite.drawAt(Login.xPadding, 0);
			ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Decimator.logoSprite.drawAt((Login.xPadding + 382) - (Decimator.logoSprite.subWidth / 2), 18);
			if ((Client.gameState == 0) || (Client.gameState == 5)) {
				var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle((Login.loginBoxX + 180) - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle((Login.loginBoxX + 180) - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle((Login.loginBoxX + 180) - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(((Login.loginBoxX + 180) - 150) + (Login.Login_loadingPercent * 3), var4 + 2, 300 - (Login.Login_loadingPercent * 3), 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var6;
			String var7;
			String var8;
			String var9;
			short var33;
			short var35;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt((Login.loginBoxX + 180) - (Login.titleboxSprite.subWidth / 2), 271 - (Login.titleboxSprite.subHeight / 2));
				var33 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
				var34 = var33 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
				var34 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
				var34 += 15;
				var34 += 7;
				if ((Login.loginIndex != 4) && (Login.loginIndex != 10)) {
					var0.draw("Login: ", (Login.loginBoxX + 180) - 110, var34, 16777215, 0);
					var35 = 200;
					if (class131.clientPreferences.method2317()) {
						var8 = Login.Login_username;
						var7 = class140.method3040('*', var8.length());
						var6 = var7;
					} else {
						var6 = Login.Login_username;
					}

					for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), (Login.loginBoxX + 180) - 70, var34, 16777215, 0);
					var34 += 15;
					var8 = Login.Login_password;
					var7 = class140.method3040('*', var8.length());

					for (var9 = var7; var0.stringWidth(var9) > var35; var9 = var9.substring(1)) {
					}

					var0.draw("Password: " + var9, (Login.loginBoxX + 180) - 108, var34, 16777215, 0);
					var34 += 15;
				}
			}

			if (((Client.gameState == 10) || (Client.gameState == 11)) || (Client.gameState == 50)) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var33 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var33, 16776960, 0);
					var34 = var33 + 30;
					var4 = (Login.loginBoxX + 180) - 80;
					var23 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = (Login.loginBoxX + 180) + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
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
					var4 = (Login.loginBoxX + 180) - 80;
					var23 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = (Login.loginBoxX + 180) + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var33 = 201;
					var0.drawCentered(Login.Login_response1, HealthBarDefinition.loginBoxCenter, var33, 16776960, 0);
					var34 = var33 + 15;
					var0.drawCentered(Login.Login_response2, HealthBarDefinition.loginBoxCenter, var34, 16776960, 0);
					var34 += 15;
					var0.drawCentered(Login.Login_response3, HealthBarDefinition.loginBoxCenter, var34, 16776960, 0);
					var34 += 15;
					var34 += 7;
					var0.draw("Login: ", HealthBarDefinition.loginBoxCenter - 110, var34, 16777215, 0);
					var35 = 200;
					if (class131.clientPreferences.method2317()) {
						var8 = Login.Login_username;
						var7 = class140.method3040('*', var8.length());
						var6 = var7;
					} else {
						var6 = Login.Login_username;
					}

					for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + ((Login.currentLoginField == 0) & ((Client.cycle % 40) < 20) ? UserComparator9.colorStartTag(16776960) + "|" : ""), HealthBarDefinition.loginBoxCenter - 70, var34, 16777215, 0);
					var34 += 15;
					var8 = Login.Login_password;
					var7 = class140.method3040('*', var8.length());

					for (var9 = var7; var0.stringWidth(var9) > var35; var9 = var9.substring(1)) {
					}

					var0.draw(("Password: " + var9) + ((Login.currentLoginField == 1) & ((Client.cycle % 40) < 20) ? UserComparator9.colorStartTag(16776960) + "|" : ""), HealthBarDefinition.loginBoxCenter - 108, var34, 16777215, 0);
					var34 += 15;
					var33 = 277;
					var29 = HealthBarDefinition.loginBoxCenter + (-117);
					IndexedSprite var30 = class9.method73(Client.Login_isUsernameRemembered, Login.field909);
					var30.drawAt(var29, var33);
					var29 = (var29 + var30.subWidth) + 5;
					var1.draw("Remember username", var29, var33 + 13, 16776960, 0);
					var29 = HealthBarDefinition.loginBoxCenter + 24;
					var30 = class9.method73(class131.clientPreferences.method2317(), Login.field906);
					var30.drawAt(var29, var33);
					var29 = (var29 + var30.subWidth) + 5;
					var1.draw("Hide username", var29, var33 + 13, 16776960, 0);
					var34 = var33 + 15;
					var12 = HealthBarDefinition.loginBoxCenter - 80;
					short var13 = 321;
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0);
					var12 = HealthBarDefinition.loginBoxCenter + 80;
					Login.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0);
					var33 = 357;
					switch (Login.field895) {
						case 2 :
							class137.field1573 = "Having trouble logging in?";
							break;
						default :
							class137.field1573 = "Can't login? Click here.";}


					class113.field1378 = new Bounds(HealthBarDefinition.loginBoxCenter, var33, var1.stringWidth(class137.field1573), 11);
					class260.field2892 = new Bounds(HealthBarDefinition.loginBoxCenter, var33, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(class137.field1573, HealthBarDefinition.loginBoxCenter, var33, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var33 = 201;
					var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var33, 16776960, 0);
					var34 = var33 + 20;
					var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var34, 16776960, 0);
					var34 += 15;
					var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var34, 16776960, 0);
					var34 += 15;
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
						var33 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16777215, 0);
						var34 = var33 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16777215, 0);
						var34 += 15;
						var5 = "PIN: ";
						var7 = HealthBar.otp;
						var6 = class140.method3040('*', var7.length());
						var0.draw((var5 + var6) + ((Client.cycle % 40) < 20 ? UserComparator9.colorStartTag(16776960) + "|" : ""), (Login.loginBoxX + 180) - 108, var34, 16777215, 0);
						var34 -= 8;
						var0.draw("Trust this computer", (Login.loginBoxX + 180) - 9, var34, 16776960, 0);
						var34 += 15;
						var0.draw("for 30 days: ", (Login.loginBoxX + 180) - 9, var34, 16776960, 0);
						var26 = (((Login.loginBoxX + 180) - 9) + var0.stringWidth("for 30 days: ")) + 15;
						var28 = var34 - var0.ascent;
						IndexedSprite var10;
						if (Login.field907) {
							var10 = class54.options_buttons_2Sprite;
						} else {
							var10 = WorldMapSection2.options_buttons_0Sprite;
						}

						var10.drawAt(var26, var28);
						var34 += 15;
						var11 = (Login.loginBoxX + 180) - 80;
						short var36 = 321;
						Login.titlebuttonSprite.drawAt(var11 - 73, var36 - 20);
						var0.drawCentered("Continue", var11, var36 + 5, 16777215, 0);
						var11 = (Login.loginBoxX + 180) + 80;
						Login.titlebuttonSprite.drawAt(var11 - 73, var36 - 20);
						var0.drawCentered("Cancel", var11, var36 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var36 + 36, 255, 0);
					} else {
						short var42;
						if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var33 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var34 += 14;
							var0.draw("Username/email: ", (Login.loginBoxX + 180) - 145, var34, 16777215, 0);
							var35 = 174;
							if (class131.clientPreferences.method2317()) {
								var8 = Login.Login_username;
								var7 = class140.method3040('*', var8.length());
								var6 = var7;
							} else {
								var6 = Login.Login_username;
							}

							for (var6 = var6; var0.stringWidth(var6) > var35; var6 = var6.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + ((Client.cycle % 40) < 20 ? UserComparator9.colorStartTag(16776960) + "|" : ""), (Login.loginBoxX + 180) - 34, var34, 16777215, 0);
							var34 += 15;
							var25 = (Login.loginBoxX + 180) - 80;
							var42 = 321;
							Login.titlebuttonSprite.drawAt(var25 - 73, var42 - 20);
							var0.drawCentered("Recover", var25, var42 + 5, 16777215, 0);
							var25 = (Login.loginBoxX + 180) + 80;
							Login.titlebuttonSprite.drawAt(var25 - 73, var42 - 20);
							var0.drawCentered("Back", var25, var42 + 5, 16777215, 0);
							var42 = 356;
							var1.drawCentered("Still having trouble logging in?", HealthBarDefinition.loginBoxCenter, var42, 268435455, 0);
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
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							if (Client.field504 && (!Client.onMobile)) {
								var33 = 201;
								var0.drawCentered(Login.Login_response1, HealthBarDefinition.loginBoxCenter, var33, 16776960, 0);
								var34 = var33 + 15;
								var0.drawCentered(Login.Login_response2, HealthBarDefinition.loginBoxCenter, var34, 16776960, 0);
								var34 += 15;
								var0.drawCentered(Login.Login_response3, HealthBarDefinition.loginBoxCenter, var34, 16776960, 0);
								var4 = HealthBarDefinition.loginBoxCenter - 150;
								var34 += 10;

								for (var40 = 0; var40 < 8; ++var40) {
									Login.titlebuttonSprite.method8054(var4, var34, 30, 40);
									boolean var27 = (var40 == Login.field903) & ((Client.cycle % 40) < 20);
									var0.draw((Login.field904[var40] == null ? "" : Login.field904[var40]) + (var27 ? UserComparator9.colorStartTag(16776960) + "|" : ""), var4 + 10, var34 + 27, 16777215, 0);
									if ((var40 != 1) && (var40 != 3)) {
										var4 += 35;
									} else {
										var4 += 50;
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var34 + 27, 16777215, 0);
									}
								}

								var40 = HealthBarDefinition.loginBoxCenter - 80;
								short var44 = 321;
								Login.titlebuttonSprite.drawAt(var40 - 73, var44 - 20);
								var0.drawCentered("Submit", var40, var44 + 5, 16777215, 0);
								var40 = HealthBarDefinition.loginBoxCenter + 80;
								Login.titlebuttonSprite.drawAt(var40 - 73, var44 - 20);
								var0.drawCentered("Cancel", var40, var44 + 5, 16777215, 0);
							} else {
								var33 = 216;
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var33, 16776960, 0);
								var34 = var33 + 15;
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var34, 16776960, 0);
								var34 += 15;
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var34, 16776960, 0);
								var34 += 15;
								var4 = (Login.loginBoxX + 180) - 80;
								var23 = 321;
								Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
								var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
								var4 = (Login.loginBoxX + 180) + 80;
								Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
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
							var4 = (Login.loginBoxX + 180) - 80;
							var23 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
							var4 = (Login.loginBoxX + 180) + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
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
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 10) {
							var34 = Login.loginBoxX + 180;
							var35 = 209;
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var35, 16776960, 0);
							var4 = var35 + 20;
							class296.field3496.drawAt(var34 - 109, var4);
							class259.field2887.drawAt(var34 - 48, var4 + 18);
						} else if (Login.loginIndex == 12) {
							var34 = HealthBarDefinition.loginBoxCenter;
							var35 = 216;
							var2.drawCentered("Before using this app, please read and accept our", var34, var35, 16777215, 0);
							var4 = var35 + 17;
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var34, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var34, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("By accepting, you agree to these documents.", var34, var4, 16777215, 0);
							var34 = HealthBarDefinition.loginBoxCenter - 80;
							var35 = 311;
							Login.titlebuttonSprite.drawAt(var34 - 73, var35 - 20);
							var0.drawCentered("Accept", var34, var35 + 5, 16777215, 0);
							var34 = HealthBarDefinition.loginBoxCenter + 80;
							Login.titlebuttonSprite.drawAt(var34 - 73, var35 - 20);
							var0.drawCentered("Decline", var34, var35 + 5, 16777215, 0);
						} else if (Login.loginIndex == 13) {
							var33 = 231;
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var33, 16777215, 0);
							var34 = var33 + 20;
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var34, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var33 = 311;
							Login.titlebuttonSprite.drawAt(var4 - 73, var33 - 20);
							var0.drawCentered("Back", var4, var33 + 5, 16777215, 0);
						} else if (Login.loginIndex == 14) {
							var33 = 201;
							String var24 = "";
							var5 = "";
							var6 = "";
							switch (Login.Login_banType) {
								case 0 :
									var24 = "Your account has been disabled.";
									var5 = Strings.field3645;
									var6 = "";
									break;
								case 1 :
									var24 = "Account locked as we suspect it has been stolen.";
									var5 = Strings.field3684;
									var6 = "";
									break;
								default :
									Messages.Login_promptCredentials(false);}


							var0.drawCentered(var24, Login.loginBoxX + 180, var33, 16776960, 0);
							var34 = var33 + 15;
							var2.drawCentered(var5, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var2.drawCentered(var6, Login.loginBoxX + 180, var34, 16776960, 0);
							var34 += 15;
							var25 = Login.loginBoxX + 180;
							var42 = 276;
							Login.titlebuttonSprite.drawAt(var25 - 73, var42 - 20);
							var0.drawCentered("Support Page", var25, var42 + 5, 16777215, 0);
							var25 = Login.loginBoxX + 180;
							var42 = 326;
							Login.titlebuttonSprite.drawAt(var25 - 73, var42 - 20);
							var0.drawCentered("Back", var25, var42 + 5, 16777215, 0);
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
							Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var31 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var31);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class321.canvasHeight);
				class341.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class341.loginScreenRunesAnimation.draw(((Login.xPadding + 22) + 765) - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var31);
			}

			class92.title_muteSprite[class131.clientPreferences.method2279() ? 1 : 0].drawAt((Login.xPadding + 765) - 40, 463);
			if ((Client.gameState > 5) && (Language.Language_EN == Skills.clientLanguage)) {
				if (class135.field1569 != null) {
					var34 = Login.xPadding + 5;
					var35 = 463;
					byte var43 = 100;
					byte var45 = 35;
					class135.field1569.drawAt(var34, var35);
					var0.drawCentered(("World" + " ") + Client.worldId, (var43 / 2) + var34, ((var45 / 2) + var35) - 2, 16777215, 0);
					if (class293.World_request != null) {
						var1.drawCentered("Loading...", (var43 / 2) + var34, ((var45 / 2) + var35) + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", (var43 / 2) + var34, ((var45 / 2) + var35) + 12, 16777215, 0);
					}
				} else {
					class135.field1569 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(class145.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1863745488")

	static final void method2854() {
		for (GraphicsObject var0 = ((GraphicsObject) (Client.graphicsObjects.last())); var0 != null; var0 = ((GraphicsObject) (Client.graphicsObjects.previous()))) {
			if ((var0.plane == class18.Client_plane) && (!var0.isFinished)) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.field556);
					if (var0.isFinished) {
						var0.remove();
					} else {
						ArchiveLoader.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}

	}
}