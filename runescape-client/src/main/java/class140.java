import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
public class class140 {
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 796681421
	)
	static int field1643;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lqh;Lqh;Lqh;B)V",
		garbageValue = "50"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class74.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		Login.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			class7.method58(var0, var1);
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			class189.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			ArchiveDiskActionHandler.logoSprite.drawAt(Login.xPadding + 382 - ArchiveDiskActionHandler.logoSprite.subWidth / 2, 18);
			int var4;
			if (Client.gameState == 0 || Client.gameState == 5) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle(Login.loginBoxX + 180 - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.loginBoxX + 180 - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle(Login.Login_loadingPercent * 3 + (Login.loginBoxX + 180 - 150), var4 + 2, 300 - Login.Login_loadingPercent * 3, 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var6;
			String var8;
			String var9;
			int var10;
			char[] var11;
			int var12;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) {
				class486.titleboxSprite.drawAt(Login.loginBoxX + 180 - class486.titleboxSprite.subWidth / 2, 271 - class486.titleboxSprite.subHeight / 2);
				var23 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
				var24 = var23 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
				var24 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
				var24 += 15;
				var24 += 7;
				if (Login.loginIndex != 4 && Login.loginIndex != 10) {
					var0.draw("Login: ", Login.loginBoxX + 180 - 110, var24, 16777215, 0);
					var25 = 200;
					if (!class105.clientPreferences.isUsernameHidden()) {
						var6 = Login.Login_username;
					} else {
						var8 = Login.Login_username;
						var10 = var8.length();
						var11 = new char[var10];

						for (var12 = 0; var12 < var10; ++var12) {
							var11[var12] = '*';
						}

						var9 = new String(var11);
						var6 = var9;
					}

					for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0);
					var24 += 15;
					var8 = Login.Login_password;
					var10 = var8.length();
					var11 = new char[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var11[var12] = '*';
					}

					var9 = new String(var11);

					for (var9 = var9; var0.stringWidth(var9) > var25; var9 = var9.substring(1)) {
					}

					var0.draw("Password: " + var9, Login.loginBoxX + 180 - 108, var24, 16777215, 0);
					var24 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				class486.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var14;
				if (Login.loginIndex == 0) {
					var23 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var14 = 291;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var0.drawLines("New User", var4 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var0.drawLines("Existing User", var4 - 73, var14 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var23 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
					var24 = var23 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
					var24 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
					var24 += 15;
					var4 = Login.loginBoxX + 180 - 80;
					var14 = 321;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var0.drawCentered("Continue", var4, var14 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var0.drawCentered("Cancel", var4, var14 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var23 = 201;
					var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var23, 16776960, 0);
					var24 = var23 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var24 += 7;
					var0.draw("Login: ", Login.loginBoxCenter - 110, var24, 16777215, 0);
					var25 = 200;
					if (!class105.clientPreferences.isUsernameHidden()) {
						var6 = Login.Login_username;
					} else {
						var8 = Login.Login_username;
						var10 = var8.length();
						var11 = new char[var10];

						for (var12 = 0; var12 < var10; ++var12) {
							var11[var12] = '*';
						}

						var9 = new String(var11);
						var6 = var9;
					}

					for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? NpcOverrides.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 70, var24, 16777215, 0);
					var24 += 15;
					var8 = Login.Login_password;
					var10 = var8.length();
					var11 = new char[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var11[var12] = '*';
					}

					var9 = new String(var11);

					for (var9 = var9; var0.stringWidth(var9) > var25; var9 = var9.substring(1)) {
					}

					var0.draw("Password: " + var9 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? NpcOverrides.colorStartTag(16776960) + "|" : ""), Login.loginBoxCenter - 108, var24, 16777215, 0);
					var24 += 15;
					var23 = 277;
					var10 = Login.loginBoxCenter + -117;
					IndexedSprite var26 = Message.method1194(Client.Login_isUsernameRemembered, Login.field943);
					var26.drawAt(var10, var23);
					var10 = var10 + var26.subWidth + 5;
					var1.draw("Remember username", var10, var23 + 13, 16776960, 0);
					var10 = Login.loginBoxCenter + 24;
					var26 = Message.method1194(class105.clientPreferences.isUsernameHidden(), Login.field959);
					var26.drawAt(var10, var23);
					var10 = var10 + var26.subWidth + 5;
					var1.draw("Hide username", var10, var23 + 13, 16776960, 0);
					var24 = var23 + 15;
					var12 = Login.loginBoxCenter - 80;
					short var13 = 321;
					Fonts.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Login", var12, var13 + 5, 16777215, 0);
					var12 = Login.loginBoxCenter + 80;
					Fonts.titlebuttonSprite.drawAt(var12 - 73, var13 - 20);
					var0.drawCentered("Cancel", var12, var13 + 5, 16777215, 0);
					var23 = 357;
					switch(Login.field932) {
					case 2:
						WorldMapSection0.field2656 = "Having trouble logging in?";
						break;
					default:
						WorldMapSection0.field2656 = "Can't login? Click here.";
					}

					class193.field2035 = new Bounds(Login.loginBoxCenter, var23, var1.stringWidth(WorldMapSection0.field2656), 11);
					WorldMapSection0.field2657 = new Bounds(Login.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(WorldMapSection0.field2656, Login.loginBoxCenter, var23, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var23 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 15;
					var4 = Login.loginBoxX + 180;
					var14 = 276;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var2.drawCentered("Try again", var4, var14 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var14 = 326;
					Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
					var2.drawCentered("Forgotten password?", var4, var14 + 5, 16777215, 0);
				} else {
					String var5;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var23 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var5 = "PIN: ";
						String var7 = class146.otp;
						int var19 = var7.length();
						char[] var20 = new char[var19];

						int var21;
						for (var21 = 0; var21 < var19; ++var21) {
							var20[var21] = '*';
						}

						var8 = new String(var20);
						var0.draw(var5 + var8 + (Client.cycle % 40 < 20 ? NpcOverrides.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0);
						var24 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						var24 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						int var17 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var19 = var24 - var0.ascent;
						IndexedSprite var33;
						if (Login.rememberUsername) {
							var33 = Login.options_buttons_2Sprite;
						} else {
							var33 = class141.options_buttons_0Sprite;
						}

						var33.drawAt(var17, var19);
						var24 += 15;
						var21 = Login.loginBoxX + 180 - 80;
						short var27 = 321;
						Fonts.titlebuttonSprite.drawAt(var21 - 73, var27 - 20);
						var0.drawCentered("Continue", var21, var27 + 5, 16777215, 0);
						var21 = Login.loginBoxX + 180 + 80;
						Fonts.titlebuttonSprite.drawAt(var21 - 73, var27 - 20);
						var0.drawCentered("Cancel", var21, var27 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var27 + 36, 16777215, 0);
					} else {
						int var16;
						short var29;
						if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var23 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var24 += 14;
							var0.draw("Username/email: ", Login.loginBoxX + 180 - 145, var24, 16777215, 0);
							var25 = 174;
							if (!class105.clientPreferences.isUsernameHidden()) {
								var6 = Login.Login_username;
							} else {
								var8 = Login.Login_username;
								var10 = var8.length();
								var11 = new char[var10];

								for (var12 = 0; var12 < var10; ++var12) {
									var11[var12] = '*';
								}

								var9 = new String(var11);
								var6 = var9;
							}

							for (var6 = var6; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? NpcOverrides.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0);
							var24 += 15;
							var16 = Login.loginBoxX + 180 - 80;
							var29 = 321;
							Fonts.titlebuttonSprite.drawAt(var16 - 73, var29 - 20);
							var0.drawCentered("Recover", var16, var29 + 5, 16777215, 0);
							var16 = Login.loginBoxX + 180 + 80;
							Fonts.titlebuttonSprite.drawAt(var16 - 73, var29 - 20);
							var0.drawCentered("Back", var16, var29 + 5, 16777215, 0);
							var29 = 356;
							var1.drawCentered("Still having trouble logging in?", Login.loginBoxCenter, var29, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var23 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180;
							var14 = 321;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							if (UserComparator3.field1501 && !Client.onMobile) {
								var23 = 201;
								var0.drawCentered(Login.Login_response1, Login.loginBoxCenter, var23, 16776960, 0);
								var24 = var23 + 15;
								var0.drawCentered(Login.Login_response2, Login.loginBoxCenter, var24, 16776960, 0);
								var24 += 15;
								var0.drawCentered(Login.Login_response3, Login.loginBoxCenter, var24, 16776960, 0);
								var4 = Login.loginBoxCenter - 150;
								var24 += 10;

								int var28;
								for (var28 = 0; var28 < 8; ++var28) {
									Fonts.titlebuttonSprite.method9987(var4, var24, 30, 40);
									boolean var18 = var28 == Login.field950 & Client.cycle % 40 < 20;
									var0.draw((Login.field941[var28] == null ? "" : Login.field941[var28]) + (var18 ? NpcOverrides.colorStartTag(16776960) + "|" : ""), var4 + 10, var24 + 27, 16777215, 0);
									if (var28 != 1 && var28 != 3) {
										var4 += 35;
									} else {
										var4 += 50;
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var24 + 27, 16777215, 0);
									}
								}

								var28 = Login.loginBoxCenter - 80;
								short var30 = 321;
								Fonts.titlebuttonSprite.drawAt(var28 - 73, var30 - 20);
								var0.drawCentered("Submit", var28, var30 + 5, 16777215, 0);
								var28 = Login.loginBoxCenter + 80;
								Fonts.titlebuttonSprite.drawAt(var28 - 73, var30 - 20);
								var0.drawCentered("Cancel", var28, var30 + 5, 16777215, 0);
							} else {
								var23 = 216;
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
								var24 = var23 + 15;
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0);
								var24 += 15;
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0);
								var24 += 15;
								var4 = Login.loginBoxX + 180 - 80;
								var14 = 321;
								Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
								var0.drawCentered("Set Date of Birth", var4, var14 + 5, 16777215, 0);
								var4 = Login.loginBoxX + 180 + 80;
								Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
								var0.drawCentered("Back", var4, var14 + 5, 16777215, 0);
							}
						} else if (Login.loginIndex == 8) {
							var23 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var14 = 321;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Privacy Policy", var4, var14 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 9) {
							var23 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 25;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 25;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
							var4 = Login.loginBoxX + 180;
							var14 = 311;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Try again", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 10) {
							var24 = Login.loginBoxX + 180;
							var25 = 209;
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0);
							var4 = var25 + 20;
							UserComparator9.field1506.drawAt(var24 - 109, var4);
							if (Login.displayName.isEmpty()) {
								Login.field922.drawAt(var24 - 48, var4 + 18);
							} else {
								Login.field922.drawAt(var24 - 48, var4 + 5);
								var0.drawCentered(Login.displayName, var24, var4 + 68 - 15, 16776960, 0);
							}
						} else if (Login.loginIndex == 12) {
							var24 = Login.loginBoxCenter;
							var25 = 216;
							var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0);
							var4 = var25 + 17;
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0);
							var24 = Login.loginBoxCenter - 80;
							var25 = 311;
							Fonts.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
							var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0);
							var24 = Login.loginBoxCenter + 80;
							Fonts.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
							var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0);
						} else if (Login.loginIndex == 13) {
							var23 = 231;
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0);
							var24 = var23 + 20;
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var23 = 311;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
							var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
						} else if (Login.loginIndex == 14) {
							var23 = 201;
							String var15 = "";
							var5 = "";
							var6 = "";
							switch(Login.Login_banType) {
							case 0:
								var15 = "Your account has been involved";
								var5 = "in serious rule breaking.";
								var6 = "";
								break;
							case 1:
								var15 = "Your account has been locked due to";
								var5 = "suspicious activity.";
								var6 = "Please recover your account.";
								break;
							case 2:
								var15 = "The unpaid balance on your account needs";
								var5 = "to be resolved before you can play.";
								var6 = Strings.field4247;
								break;
							default:
								class155.Login_promptCredentials(false);
							}

							var0.drawCentered(var15, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 20;
							var0.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 20;
							var0.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0);
							var16 = Login.loginBoxX + 180;
							var29 = 276;
							Fonts.titlebuttonSprite.drawAt(var16 - 73, var29 - 20);
							if (Login.Login_banType == 1) {
								var0.drawCentered("Recover Account", var16, var29 + 5, 16777215, 0);
							} else {
								var0.drawCentered("View Appeal Options", var16, var29 + 5, 16777215, 0);
							}

							var16 = Login.loginBoxX + 180;
							var29 = 326;
							Fonts.titlebuttonSprite.drawAt(var16 - 73, var29 - 20);
							var0.drawCentered("Back", var16, var29 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var23 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
							var24 = var23 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
							var24 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180;
							var14 = 301;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Ok", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 32) {
							var23 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var14 = 321;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Set Date of Birth", var4, var14 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var0.drawCentered("Back", var4, var14 + 5, 16777215, 0);
						} else if (Login.loginIndex == 33) {
							var23 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 20;
							var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 20;
							var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180;
							var14 = 276;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var2.drawCentered("Download Launcher", var4, var14 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var14 = 326;
							Fonts.titlebuttonSprite.drawAt(var4 - 73, var14 - 20);
							var2.drawCentered("Back", var4, var14 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var22 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var22);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class1.canvasHeight);
				class91.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				class91.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var22);
			}

			class428.title_muteSprite[class105.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && BuddyRankComparator.clientLanguage == Language.Language_EN) {
				if (Messages.field1449 != null) {
					var24 = Login.xPadding + 5;
					var25 = 463;
					byte var32 = 100;
					byte var31 = 35;
					Messages.field1449.drawAt(var24, var25);
					var0.drawCentered("World" + " " + Client.worldId, var32 / 2 + var24, var31 / 2 + var25 - 2, 16777215, 0);
					if (PlayerCompositionColorTextureOverride.World_request != null) {
						var1.drawCentered("Loading...", var32 / 2 + var24, var31 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var32 / 2 + var24, var31 / 2 + var25 + 12, 16777215, 0);
					}
				} else {
					Messages.field1449 = ModeWhere.SpriteBuffer_getIndexedSpriteByName(class7.archive8, "sl_button", "");
				}
			}

		}
	}
}
