import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ai")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lex;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("je")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("ab")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1533855661"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4822) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4817) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4824) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4825) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4830 < ByteArrayPool.field4823) {
				ByteArrayPool.field4814[++ByteArrayPool.field4830 - 1] = var0;
			} else {
				if (MoveSpeed.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < KitDefinition.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == KitDefinition.ByteArrayPool_alternativeSizes[var2] && ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var2] < MoveSpeed.ByteArrayPool_arrays[var2].length) {
							MoveSpeed.ByteArrayPool_arrays[var2][ByteArrayPool.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Lif;",
		garbageValue = "1543056667"
	)
	public static Clock method299() {
		try {
			return new NanoClock();
		} catch (Throwable var1) {
			return new MilliClock();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;B)[F",
		garbageValue = "0"
	)
	static float[] method300(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];

		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = (float)var3.optDouble(0, 0.0D);
			var2[1] = (float)var3.optDouble(1, 0.0D);
			var2[2] = (float)var3.optDouble(2, 1.0D);
			var2[3] = (float)var3.optDouble(3, 1.0D);
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqe;Lqe;Lqe;B)V",
		garbageValue = "-10"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (NPC.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class248.loginBoxCenter = Login.loginBoxX + 180;
		byte var3;
		int var4;
		int var8;
		int var10;
		int var25;
		int var31;
		int var38;
		if (Login.worldSelectOpen) {
			if (class163.worldSelectBackSprites == null) {
				class163.worldSelectBackSprites = class246.method4966(class59.archive8, "sl_back", "");
			}

			if (Interpreter.worldSelectFlagSprites == null) {
				Interpreter.worldSelectFlagSprites = class543.getFont(class59.archive8, "sl_flags", "");
			}

			if (class151.worldSelectArrows == null) {
				class151.worldSelectArrows = class543.getFont(class59.archive8, "sl_arrows", "");
			}

			if (class414.worldSelectStars == null) {
				class414.worldSelectStars = class543.getFont(class59.archive8, "sl_stars", "");
			}

			if (NpcOverrides.worldSelectLeftSprite == null) {
				NpcOverrides.worldSelectLeftSprite = class109.SpriteBuffer_getIndexedSpriteByName(class59.archive8, "leftarrow", "");
			}

			if (class264.worldSelectRightSprite == null) {
				class264.worldSelectRightSprite = class109.SpriteBuffer_getIndexedSpriteByName(class59.archive8, "rightarrow", "");
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding, 23, 765, 480, 0);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding, 0, 125, 23, 12425273, 9135624);
			Rasterizer2D.Rasterizer2D_fillRectangleGradient(Login.xPadding + 125, 0, 640, 23, 5197647, 2697513);
			var0.drawCentered("Select a world", Login.xPadding + 62, 15, 0, -1);
			if (class414.worldSelectStars != null) {
				class414.worldSelectStars[1].drawAt(Login.xPadding + 140, 1);
				var1.draw("Members only world", Login.xPadding + 152, 10, 16777215, -1);
				class414.worldSelectStars[0].drawAt(Login.xPadding + 140, 12);
				var1.draw("Free world", Login.xPadding + 152, 21, 16777215, -1);
			}

			int var41;
			if (class151.worldSelectArrows != null) {
				var31 = Login.xPadding + 280;
				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 0) {
					class151.worldSelectArrows[2].drawAt(var31, 4);
				} else {
					class151.worldSelectArrows[0].drawAt(var31, 4);
				}

				if (World.World_sortOption1[0] == 0 && World.World_sortOption2[0] == 1) {
					class151.worldSelectArrows[3].drawAt(var31 + 15, 4);
				} else {
					class151.worldSelectArrows[1].drawAt(var31 + 15, 4);
				}

				var0.draw("World", var31 + 32, 17, 16777215, -1);
				var4 = Login.xPadding + 390;
				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 0) {
					class151.worldSelectArrows[2].drawAt(var4, 4);
				} else {
					class151.worldSelectArrows[0].drawAt(var4, 4);
				}

				if (World.World_sortOption1[0] == 1 && World.World_sortOption2[0] == 1) {
					class151.worldSelectArrows[3].drawAt(var4 + 15, 4);
				} else {
					class151.worldSelectArrows[1].drawAt(var4 + 15, 4);
				}

				var0.draw("Players", var4 + 32, 17, 16777215, -1);
				var38 = Login.xPadding + 500;
				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 0) {
					class151.worldSelectArrows[2].drawAt(var38, 4);
				} else {
					class151.worldSelectArrows[0].drawAt(var38, 4);
				}

				if (World.World_sortOption1[0] == 2 && World.World_sortOption2[0] == 1) {
					class151.worldSelectArrows[3].drawAt(var38 + 15, 4);
				} else {
					class151.worldSelectArrows[1].drawAt(var38 + 15, 4);
				}

				var0.draw("Location", var38 + 32, 17, 16777215, -1);
				var41 = Login.xPadding + 610;
				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 0) {
					class151.worldSelectArrows[2].drawAt(var41, 4);
				} else {
					class151.worldSelectArrows[0].drawAt(var41, 4);
				}

				if (World.World_sortOption1[0] == 3 && World.World_sortOption2[0] == 1) {
					class151.worldSelectArrows[3].drawAt(var41 + 15, 4);
				} else {
					class151.worldSelectArrows[1].drawAt(var41 + 15, 4);
				}

				var0.draw("Type", var41 + 32, 17, 16777215, -1);
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(Login.xPadding + 708, 4, 50, 16, 0);
			var1.drawCentered("Cancel", Login.xPadding + 708 + 25, 16, 16777215, -1);
			Login.hoveredWorldIndex = -1;
			if (class163.worldSelectBackSprites != null) {
				var3 = 88;
				byte var36 = 19;
				var38 = 765 / (var3 + 1) - 1;
				var41 = 480 / (var36 + 1);

				do {
					var25 = var41;
					var8 = var38;
					if (var41 * (var38 - 1) >= World.World_count) {
						--var38;
					}

					if (var38 * (var41 - 1) >= World.World_count) {
						--var41;
					}

					if (var38 * (var41 - 1) >= World.World_count) {
						--var41;
					}
				} while(var25 != var41 || var38 != var8);

				var25 = (765 - var3 * var38) / (var38 + 1);
				if (var25 > 5) {
					var25 = 5;
				}

				var8 = (480 - var41 * var36) / (var41 + 1);
				if (var8 > 5) {
					var8 = 5;
				}

				int var28 = (765 - var3 * var38 - var25 * (var38 - 1)) / 2;
				var10 = (480 - var36 * var41 - var8 * (var41 - 1)) / 2;
				int var35 = (var41 + World.World_count - 1) / var41;
				Login.worldSelectPagesCount = var35 - var38;
				if (NpcOverrides.worldSelectLeftSprite != null && Login.worldSelectPage > 0) {
					NpcOverrides.worldSelectLeftSprite.drawAt(8, ApproximateRouteStrategy.canvasHeight / 2 - NpcOverrides.worldSelectLeftSprite.subHeight * -1220193712 / 2);
				}

				if (class264.worldSelectRightSprite != null && Login.worldSelectPage < Login.worldSelectPagesCount) {
					class264.worldSelectRightSprite.drawAt(NPC.canvasWidth - class264.worldSelectRightSprite.subWidth - 8, ApproximateRouteStrategy.canvasHeight / 2 - class264.worldSelectRightSprite.subHeight * -1220193712 / 2);
				}

				int var12 = var10 + 23;
				int var13 = var28 + Login.xPadding;
				int var14 = 0;
				boolean var15 = false;
				int var16 = Login.worldSelectPage;

				int var17;
				for (var17 = var16 * var41; var17 < World.World_count && var16 - Login.worldSelectPage < var38; ++var17) {
					World var18 = class319.World_worlds[var17];
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
						var21 = var18.isMembersOnly() ? class111.field1412 : class111.field1418;
					} else if (var18.isDeadman()) {
						var21 = var18.isMembersOnly() ? class111.field1420 : class111.field1426;
					} else if (var18.method1911()) {
						var22 = 16711680;
						var21 = var18.isMembersOnly() ? class111.field1417 : class111.field1416;
					} else if (var18.method1881()) {
						var21 = var18.isMembersOnly() ? class111.field1429 : class111.field1425;
					} else if (var18.isPvp()) {
						var21 = var18.isMembersOnly() ? class111.field1415 : class111.field1428;
					} else if (var18.method1909()) {
						var21 = var18.isMembersOnly() ? class111.field1414 : class111.field1422;
					} else if (var18.method1905()) {
						var21 = var18.isMembersOnly() ? class111.field1390 : class111.field1424;
					}

					if (var21 == null || var21.field1423 >= class163.worldSelectBackSprites.length) {
						var21 = var18.isMembersOnly() ? class111.field1413 : class111.field1427;
					}

					if (MouseHandler.MouseHandler_x >= var13 && MouseHandler.MouseHandler_y >= var12 && MouseHandler.MouseHandler_x < var3 + var13 && MouseHandler.MouseHandler_y < var36 + var12 && var19) {
						Login.hoveredWorldIndex = var17;
						class163.worldSelectBackSprites[var21.field1423].drawTransOverlayAt(var13, var12, 128, 16777215);
						var15 = true;
					} else {
						class163.worldSelectBackSprites[var21.field1423].drawAt(var13, var12);
					}

					if (Interpreter.worldSelectFlagSprites != null) {
						Interpreter.worldSelectFlagSprites[(var18.isMembersOnly() ? 8 : 0) + var18.location].drawAt(var13 + 29, var12);
					}

					var0.drawCentered(Integer.toString(var18.id), var13 + 15, var36 / 2 + var12 + 5, var22, -1);
					var1.drawCentered(var20, var13 + 60, var36 / 2 + var12 + 5, 268435455, -1);
					var12 = var12 + var8 + var36;
					++var14;
					if (var14 >= var41) {
						var12 = var10 + 23;
						var13 = var13 + var3 + var25;
						var14 = 0;
						++var16;
					}
				}

				if (var15) {
					var17 = var1.stringWidth(class319.World_worlds[Login.hoveredWorldIndex].activity) + 6;
					int var29 = var1.ascent + 8;
					int var37 = MouseHandler.MouseHandler_y + 25;
					if (var37 + var29 > 480) {
						var37 = MouseHandler.MouseHandler_y - 25 - var29;
					}

					Rasterizer2D.Rasterizer2D_fillRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 16777120);
					Rasterizer2D.Rasterizer2D_drawRectangle(MouseHandler.MouseHandler_x - var17 / 2, var37, var17, var29, 0);
					var1.drawCentered(class319.World_worlds[Login.hoveredWorldIndex].activity, MouseHandler.MouseHandler_x, var37 + var1.ascent + 4, 0, -1);
				}
			}

		} else {
			class368.leftTitleSprite.drawAt(Login.xPadding, 0);
			AttackOption.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			FillMode.logoSprite.drawAt(Login.xPadding + 382 - FillMode.logoSprite.subWidth / 2, 18);
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
			short var30;
			short var32;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight * -1220193712 / 2);
				var30 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
				var31 = var30 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
				var31 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
				var31 += 15;
				var31 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var31, 16777215, 0);
					var32 = 200;
					var5 = TileItem.clientPreferences.isUsernameHidden() ? class264.method5316(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var31, 16777215, 0);
					var31 += 15;

					for (var7 = class264.method5316(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var31, 16777215, 0);
					var31 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var23;
				if (Login.loginIndex == 0) {
					var30 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var30, 16776960, 0);
					var31 = var30 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 291;
					WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("New User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawLines("Existing User", var4 - 73, var23 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var30 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0);
					var31 = var30 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0);
					var31 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0);
					var31 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var23 = 321;
					WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Continue", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var0.drawCentered("Cancel", var4, var23 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var30 = 201;
					var0.drawCentered(Login.Login_response1, class248.loginBoxCenter, var30, 16776960, 0);
					var31 = var30 + 15;
					var0.drawCentered(Login.Login_response2, class248.loginBoxCenter, var31, 16776960, 0);
					var31 += 15;
					var0.drawCentered(Login.Login_response3, class248.loginBoxCenter, var31, 16776960, 0);
					var31 += 15;
					var31 += 7;
					var0.draw("Login: ", class248.loginBoxCenter - 110, var31, 16777215, 0);
					var32 = 200;
					var5 = TileItem.clientPreferences.isUsernameHidden() ? class264.method5316(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? TransformationMatrix.colorStartTag(16776960) + "|" : ""), class248.loginBoxCenter - 70, var31, 16777215, 0);
					var31 += 15;

					for (var7 = class264.method5316(Login.Login_password); var0.stringWidth(var7) > var32; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? TransformationMatrix.colorStartTag(16776960) + "|" : ""), class248.loginBoxCenter - 108, var31, 16777215, 0);
					var31 += 15;
					var30 = 277;
					var8 = class248.loginBoxCenter + -117;
					IndexedSprite var9 = class130.method3116(Client.Login_isUsernameRemembered, Login.field927);
					var9.drawAt(var8, var30);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Remember username", var8, var30 + 13, 16776960, 0);
					var8 = class248.loginBoxCenter + 24;
					var9 = class130.method3116(TileItem.clientPreferences.isUsernameHidden(), Login.field914);
					var9.drawAt(var8, var30);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Hide username", var8, var30 + 13, 16776960, 0);
					var31 = var30 + 15;
					var10 = class248.loginBoxCenter - 80;
					short var11 = 321;
					WorldMapEvent.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Login", var10, var11 + 5, 16777215, 0);
					var10 = class248.loginBoxCenter + 80;
					WorldMapEvent.titlebuttonSprite.drawAt(var10 - 73, var11 - 20);
					var0.drawCentered("Cancel", var10, var11 + 5, 16777215, 0);
					var30 = 357;
					switch(Login.field941) {
					case 2:
						class111.field1419 = "Having trouble logging in?";
						break;
					default:
						class111.field1419 = "Can't login? Click here.";
					}

					GrandExchangeOfferAgeComparator.field4548 = new Bounds(class248.loginBoxCenter, var30, var1.stringWidth(class111.field1419), 11);
					LoginPacket.field1671 = new Bounds(class248.loginBoxCenter, var30, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(class111.field1419, class248.loginBoxCenter, var30, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var30 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var30, 16776960, 0);
					var31 = var30 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var31, 16776960, 0);
					var31 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var31, 16776960, 0);
					var31 += 15;
					var4 = Login.loginBoxX + 180;
					var23 = 276;
					WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var23 = 326;
					WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
					var2.drawCentered("Forgotten password?", var4, var23 + 5, 16777215, 0);
				} else {
					short var34;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var30 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0);
						var31 = var30 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var0.draw("PIN: " + class264.method5316(class135.otp) + (Client.cycle % 40 < 20 ? TransformationMatrix.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var31, 16777215, 0);
						var31 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var31, 16776960, 0);
						var31 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var31, 16776960, 0);
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var38 = var31 - var0.ascent;
						IndexedSprite var33;
						if (Login.rememberUsername) {
							var33 = class421.options_buttons_2Sprite;
						} else {
							var33 = class423.options_buttons_0Sprite;
						}

						var33.drawAt(var4, var38);
						var31 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var34 = 321;
						WorldMapEvent.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Continue", var25, var34 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						WorldMapEvent.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Cancel", var25, var34 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var34 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
						var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
						var30 = 221;
						var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var31 += 14;
						var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var31, 16777215, 0);
						var32 = 174;
						var5 = TileItem.clientPreferences.isUsernameHidden() ? class264.method5316(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var32; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? TransformationMatrix.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var31, 16777215, 0);
						var31 += 15;
						var25 = Login.loginBoxX + 180 - 80;
						var34 = 321;
						WorldMapEvent.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Recover", var25, var34 + 5, 16777215, 0);
						var25 = Login.loginBoxX + 180 + 80;
						WorldMapEvent.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0);
						var34 = 356;
						var1.drawCentered("Still having trouble logging in?", class248.loginBoxCenter, var34, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var30 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 321;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (class288.field3118 && !Client.onMobile) {
							var30 = 201;
							var0.drawCentered(Login.Login_response1, class248.loginBoxCenter, var30, 16776960, 0);
							var31 = var30 + 15;
							var0.drawCentered(Login.Login_response2, class248.loginBoxCenter, var31, 16776960, 0);
							var31 += 15;
							var0.drawCentered(Login.Login_response3, class248.loginBoxCenter, var31, 16776960, 0);
							var4 = class248.loginBoxCenter - 150;
							var31 += 10;

							for (var38 = 0; var38 < 8; ++var38) {
								WorldMapEvent.titlebuttonSprite.method10049(var4, var31, 30, 40);
								boolean var26 = var38 == Login.field915 & Client.cycle % 40 < 20;
								var0.draw((Login.field925[var38] == null ? "" : Login.field925[var38]) + (var26 ? TransformationMatrix.colorStartTag(16776960) + "|" : ""), var4 + 10, var31 + 27, 16777215, 0);
								if (var38 != 1 && var38 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var31 + 27, 16777215, 0);
								}
							}

							var38 = class248.loginBoxCenter - 80;
							short var39 = 321;
							WorldMapEvent.titlebuttonSprite.drawAt(var38 - 73, var39 - 20);
							var0.drawCentered("Submit", var38, var39 + 5, 16777215, 0);
							var38 = class248.loginBoxCenter + 80;
							WorldMapEvent.titlebuttonSprite.drawAt(var38 - 73, var39 - 20);
							var0.drawCentered("Cancel", var38, var39 + 5, 16777215, 0);
						} else {
							var30 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var30, 16776960, 0);
							var31 = var30 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var31, 16776960, 0);
							var31 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var31, 16776960, 0);
							var31 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var23 = 321;
							WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						}
					} else if (Login.loginIndex == 8) {
						var30 = 216;
						var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Privacy Policy", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var30 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Try again", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var31 = Login.loginBoxX + 180;
						var32 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var32, 16776960, 0);
						var4 = var32 + 20;
						Login.field930.drawAt(var31 - 109, var4);
						if (Login.displayName.isEmpty()) {
							UserComparator10.field1494.drawAt(var31 - 48, var4 + 18);
						} else {
							UserComparator10.field1494.drawAt(var31 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var31, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var31 = class248.loginBoxCenter;
						var32 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var31, var32, 16777215, 0);
						var4 = var32 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var31, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var31, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var31, var4, 16777215, 0);
						var31 = class248.loginBoxCenter - 80;
						var32 = 311;
						WorldMapEvent.titlebuttonSprite.drawAt(var31 - 73, var32 - 20);
						var0.drawCentered("Accept", var31, var32 + 5, 16777215, 0);
						var31 = class248.loginBoxCenter + 80;
						WorldMapEvent.titlebuttonSprite.drawAt(var31 - 73, var32 - 20);
						var0.drawCentered("Decline", var31, var32 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var30 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var30, 16777215, 0);
						var31 = var30 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var31, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var30 = 311;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var30 - 20);
						var0.drawCentered("Back", var4, var30 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var30 = 201;
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
							HttpRequest.Login_promptCredentials(false);
						}

						var0.drawCentered(var24, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var31, 16776960, 0);
						var25 = Login.loginBoxX + 180;
						var34 = 276;
						WorldMapEvent.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var25, var34 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var25, var34 + 5, 16777215, 0);
						}

						var25 = Login.loginBoxX + 180;
						var34 = 326;
						WorldMapEvent.titlebuttonSprite.drawAt(var25 - 73, var34 - 20);
						var0.drawCentered("Back", var25, var34 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var30 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16777215, 0);
						var31 = var30 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16777215, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 301;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Ok", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var30 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var23 = 321;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Set Date of Birth", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var30 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var30, 16776960, 0);
						var31 = var30 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var31, 16776960, 0);
						var31 += 15;
						var4 = Login.loginBoxX + 180;
						var23 = 276;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Download Launcher", var4, var23 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 326;
						WorldMapEvent.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var2.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var27 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var27);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, ApproximateRouteStrategy.canvasHeight);
				class27.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class27.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var27);
			}

			Login.title_muteSprite[TileItem.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && Language.Language_EN == RestClientThreadFactory.clientLanguage) {
				if (LoginScreenAnimation.field1282 != null) {
					var31 = Login.xPadding + 5;
					var32 = 463;
					byte var42 = 100;
					byte var40 = 35;
					LoginScreenAnimation.field1282.drawAt(var31, var32);
					var0.drawCentered("World" + " " + Client.worldId, var42 / 2 + var31, var40 / 2 + var32 - 2, 16777215, 0);
					if (SoundCache.World_request != null) {
						var1.drawCentered("Loading...", var42 / 2 + var31, var40 / 2 + var32 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var42 / 2 + var31, var40 / 2 + var32 + 12, 16777215, 0);
					}
				} else {
					LoginScreenAnimation.field1282 = class109.SpriteBuffer_getIndexedSpriteByName(class59.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("ki")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-34"
	)
	static final void method294(int var0, int var1, boolean var2) {
		if (!var2 || var0 != HttpMethod.field33 || class30.field136 != var1) {
			HttpMethod.field33 = var0;
			class30.field136 = var1;
			UserComparator3.updateGameState(25);
			Client.field512 = true;
			HorizontalAlignment.drawLoadingMessage("Loading - please wait.", true);
			int var3 = ConcurrentMidiTask.topLevelWorldView.baseX;
			int var4 = ConcurrentMidiTask.topLevelWorldView.baseY;
			ConcurrentMidiTask.topLevelWorldView.baseX = (var0 - 6) * 8;
			ConcurrentMidiTask.topLevelWorldView.baseY = (var1 - 6) * 8;
			int var5 = ConcurrentMidiTask.topLevelWorldView.baseX - var3;
			int var6 = ConcurrentMidiTask.topLevelWorldView.baseY - var4;
			var3 = ConcurrentMidiTask.topLevelWorldView.baseX;
			var4 = ConcurrentMidiTask.topLevelWorldView.baseY;

			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 65536; ++var7) {
				NPC var19 = ConcurrentMidiTask.topLevelWorldView.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}

					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = ConcurrentMidiTask.topLevelWorldView.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}

					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}

			for (var7 = 0; var7 < 2048; ++var7) {
				WorldEntity var23 = ConcurrentMidiTask.topLevelWorldView.worldEntities[var7];
				if (var23 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var23.directionsX;
						var10000[var9] -= var5;
						var10000 = var23.directionsY;
						var10000[var9] -= var6;
					}

					var23.x -= var5 * 128;
					var23.y -= var6 * 128;
				}
			}

			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}

			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}

			int var14;
			for (int var13 = var20; var13 != var8; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var5 + var13;
					int var16 = var6 + var14;

					for (int var17 = 0; var17 < 4; ++var17) {
						if (0 <= var15 && var15 < 104 && 0 <= var16 && var16 < 104) {
							ConcurrentMidiTask.topLevelWorldView.groundItems[var17][var13][var14] = ConcurrentMidiTask.topLevelWorldView.groundItems[var17][var15][var16];
						} else {
							ConcurrentMidiTask.topLevelWorldView.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}

			for (PendingSpawn var18 = (PendingSpawn)ConcurrentMidiTask.topLevelWorldView.pendingSpawns.last(); var18 != null; var18 = (PendingSpawn)ConcurrentMidiTask.topLevelWorldView.pendingSpawns.previous()) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || 104 <= var18.x || var18.y < 0 || 104 <= var18.y) {
					var18.remove();
				}
			}

			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}

			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			class433.cameraX -= var5 << 7;
			WorldMapSection0.cameraZ -= var6 << 7;
			class130.oculusOrbFocalPointX -= var5 << 7;
			class499.oculusOrbFocalPointY -= var6 << 7;
			Client.field742 = -1;
			ConcurrentMidiTask.topLevelWorldView.graphicsObjects.clear();
			ConcurrentMidiTask.topLevelWorldView.projectiles.clear();

			for (var14 = 0; var14 < 4; ++var14) {
				ConcurrentMidiTask.topLevelWorldView.collisionMaps[var14].clear();
			}

		}
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "26"
	)
	static void method298() {
		TileItem.clientPreferences.updateEULA(Client.field570);
	}
}
