import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("em")
public class class132 extends class128 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 
	-1243159201)

	@Export("WorldMapElement_count")
	public static int WorldMapElement_count;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(descriptor = 
	"Llu;")

	@Export("archive9")
	static Archive archive9;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	822748601)

	int field1552;
	@ObfuscatedName("o")
	byte field1553;

	@ObfuscatedSignature(descriptor = 
	"Lee;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lee;)V")

	class132(class131 var1) {
		this.this$0 = var1;
		this.field1552 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"-73")

	void vmethod3107(Buffer var1) {
		this.field1552 = var1.readUnsignedShort();
		this.field1553 = var1.readByte();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leh;I)V", garbageValue = 
	"-1228032820")

	void vmethod3104(ClanSettings var1) {
		var1.method2940(this.field1552, this.field1553);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lmr;Lmr;Lmr;B)V", garbageValue = 
	"32")

	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (class4.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class134.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			class346.method6482(var0, var1);
		} else {
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			class162.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			HorizontalAlignment.logoSprite.drawAt((Login.xPadding + 382) - (HorizontalAlignment.logoSprite.subWidth / 2), 18);
			int var4;
			if ((Client.gameState == 0) || (Client.gameState == 5)) {
				byte var3 = 20;
				var0.drawCentered("RuneScape is loading - please wait...", Login.loginBoxX + 180, 245 - var3, 16777215, -1);
				var4 = 253 - var3;
				Rasterizer2D.Rasterizer2D_drawRectangle((Login.loginBoxX + 180) - 152, var4, 304, 34, 9179409);
				Rasterizer2D.Rasterizer2D_drawRectangle((Login.loginBoxX + 180) - 151, var4 + 1, 302, 32, 0);
				Rasterizer2D.Rasterizer2D_fillRectangle((Login.loginBoxX + 180) - 150, var4 + 2, Login.Login_loadingPercent * 3, 30, 9179409);
				Rasterizer2D.Rasterizer2D_fillRectangle((Login.Login_loadingPercent * 3) + ((Login.loginBoxX + 180) - 150), var4 + 2, 300 - (Login.Login_loadingPercent * 3), 30, 0);
				var0.drawCentered(Login.Login_loadingText, Login.loginBoxX + 180, 276 - var3, 16777215, -1);
			}

			String var5;
			String var7;
			String var8;
			int var9;
			char[] var10;
			int var11;
			short var22;
			int var23;
			short var24;
			if (Client.gameState == 20) {
				AbstractByteArrayCopier.titleboxSprite.drawAt((Login.loginBoxX + 180) - (AbstractByteArrayCopier.titleboxSprite.subWidth / 2), 271 - (AbstractByteArrayCopier.titleboxSprite.subHeight / 2));
				var22 = 201;
				var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
				var23 = var22 + 15;
				var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
				var23 += 15;
				var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
				var23 += 15;
				var23 += 7;
				if ((Login.loginIndex != 4) && (Login.loginIndex != 10)) {
					var0.draw("Login: ", (Login.loginBoxX + 180) - 110, var23, 16777215, 0);
					var24 = 200;

					for (var5 = class360.method6636(); var0.stringWidth(var5) > var24; var5 = var5.substring(0, var5.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var5), (Login.loginBoxX + 180) - 70, var23, 16777215, 0);
					var23 += 15;
					var7 = Login.Login_password;
					var9 = var7.length();
					var10 = new char[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						var10[var11] = '*';
					}

					var8 = new String(var10);

					for (var8 = var8; var0.stringWidth(var8) > var24; var8 = var8.substring(1)) {
					}

					var0.draw("Password: " + var8, (Login.loginBoxX + 180) - 108, var23, 16777215, 0);
					var23 += 15;
				}
			}

			if (((Client.gameState == 10) || (Client.gameState == 11)) || (Client.gameState == 50)) {
				AbstractByteArrayCopier.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var13;
				if (Login.loginIndex == 0) {
					var22 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var22, 16776960, 0);
					var23 = var22 + 30;
					var4 = (Login.loginBoxX + 180) - 80;
					var13 = 291;
					class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
					var0.drawLines("New User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = (Login.loginBoxX + 180) + 80;
					class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
					var0.drawLines("Existing User", var4 - 73, var13 - 20, 144, 40, 16777215, 0, 1, 1, 0);
				} else if (Login.loginIndex == 1) {
					var0.drawCentered(Login.Login_response0, Login.loginBoxX + 180, 201, 16776960, 0);
					var22 = 236;
					var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0);
					var23 = var22 + 15;
					var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0);
					var23 += 15;
					var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0);
					var23 += 15;
					var4 = (Login.loginBoxX + 180) - 80;
					var13 = 321;
					class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
					var0.drawCentered("Continue", var4, var13 + 5, 16777215, 0);
					var4 = (Login.loginBoxX + 180) + 80;
					class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
					var0.drawCentered("Cancel", var4, var13 + 5, 16777215, 0);
				} else {
					short var12;
					IndexedSprite var25;
					if (Login.loginIndex == 2) {
						var22 = 201;
						var0.drawCentered(Login.Login_response1, class134.loginBoxCenter, var22, 16776960, 0);
						var23 = var22 + 15;
						var0.drawCentered(Login.Login_response2, class134.loginBoxCenter, var23, 16776960, 0);
						var23 += 15;
						var0.drawCentered(Login.Login_response3, class134.loginBoxCenter, var23, 16776960, 0);
						var23 += 15;
						var23 += 7;
						var0.draw("Login: ", class134.loginBoxCenter - 110, var23, 16777215, 0);
						var24 = 200;

						for (var5 = class360.method6636(); var0.stringWidth(var5) > var24; var5 = var5.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var5) + ((Login.currentLoginField == 0) & ((Client.cycle % 40) < 20) ? ChatChannel.colorStartTag(16776960) + "|" : ""), class134.loginBoxCenter - 70, var23, 16777215, 0);
						var23 += 15;
						var7 = Login.Login_password;
						var9 = var7.length();
						var10 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var10[var11] = '*';
						}

						var8 = new String(var10);

						for (var8 = var8; var0.stringWidth(var8) > var24; var8 = var8.substring(1)) {
						}

						var0.draw(("Password: " + var8) + ((Login.currentLoginField == 1) & ((Client.cycle % 40) < 20) ? ChatChannel.colorStartTag(16776960) + "|" : ""), class134.loginBoxCenter - 108, var23, 16777215, 0);
						var23 += 15;
						var22 = 277;
						var9 = class134.loginBoxCenter + (-117);
						var25 = MouseHandler.method622(Client.Login_isUsernameRemembered, Login.field901);
						var25.drawAt(var9, var22);
						var9 = (var9 + var25.subWidth) + 5;
						var1.draw("Remember username", var9, var22 + 13, 16776960, 0);
						var9 = class134.loginBoxCenter + 24;
						var25 = MouseHandler.method622(Interpreter.clientPreferences.method2257(), Login.field902);
						var25.drawAt(var9, var22);
						var9 = (var9 + var25.subWidth) + 5;
						var1.draw("Hide username", var9, var22 + 13, 16776960, 0);
						var23 = var22 + 15;
						var11 = class134.loginBoxCenter - 80;
						var12 = 321;
						class137.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Login", var11, var12 + 5, 16777215, 0);
						var11 = class134.loginBoxCenter + 80;
						class137.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0);
						var22 = 357;
						switch (Login.field897) {
							case 2 :
								class286.field3281 = "Having trouble logging in?";
								break;
							default :
								class286.field3281 = "Can't login? Click here.";}


						DynamicObject.field973 = new Bounds(class134.loginBoxCenter, var22, var1.stringWidth(class286.field3281), 11);
						Projectile.field946 = new Bounds(class134.loginBoxCenter, var22, var1.stringWidth("Still having trouble logging in?"), 11);
						var1.drawCentered(class286.field3281, class134.loginBoxCenter, var22, 16777215, 0);
					} else if (Login.loginIndex == 3) {
						var22 = 201;
						var0.drawCentered("Invalid credentials.", Login.loginBoxX + 180, var22, 16776960, 0);
						var23 = var22 + 20;
						var1.drawCentered("For accounts created after 24th November 2010, please use your", Login.loginBoxX + 180, var23, 16776960, 0);
						var23 += 15;
						var1.drawCentered("email address to login. Otherwise please login with your username.", Login.loginBoxX + 180, var23, 16776960, 0);
						var23 += 15;
						var4 = Login.loginBoxX + 180;
						var13 = 276;
						class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
						var2.drawCentered("Try again", var4, var13 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var13 = 326;
						class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
						var2.drawCentered("Forgotten password?", var4, var13 + 5, 16777215, 0);
					} else if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var22 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0);
						var23 = var22 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0);
						var23 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0);
						var23 += 15;
						var5 = "PIN: ";
						var7 = class452.otp;
						var9 = var7.length();
						var10 = new char[var9];

						for (var11 = 0; var11 < var9; ++var11) {
							var10[var11] = '*';
						}

						var8 = new String(var10);
						var0.draw((var5 + var8) + ((Client.cycle % 40) < 20 ? ChatChannel.colorStartTag(16776960) + "|" : ""), (Login.loginBoxX + 180) - 108, var23, 16777215, 0);
						var23 -= 8;
						var0.draw("Trust this computer", (Login.loginBoxX + 180) - 9, var23, 16776960, 0);
						var23 += 15;
						var0.draw("for 30 days: ", (Login.loginBoxX + 180) - 9, var23, 16776960, 0);
						int var16 = (((180 + Login.loginBoxX) - 9) + var0.stringWidth("for 30 days: ")) + 15;
						var9 = var23 - var0.ascent;
						if (Login.field903) {
							var25 = Skeleton.options_buttons_2Sprite;
						} else {
							var25 = class160.options_buttons_0Sprite;
						}

						var25.drawAt(var16, var9);
						var23 += 15;
						var11 = (Login.loginBoxX + 180) - 80;
						var12 = 321;
						class137.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Continue", var11, var12 + 5, 16777215, 0);
						var11 = (Login.loginBoxX + 180) + 80;
						class137.titlebuttonSprite.drawAt(var11 - 73, var12 - 20);
						var0.drawCentered("Cancel", var11, var12 + 5, 16777215, 0);
						var1.drawCentered("<u=ff>Can't Log In?</u>", Login.loginBoxX + 180, var12 + 36, 255, 0);
					} else {
						String var6;
						int var15;
						short var28;
						if (Login.loginIndex == 5) {
							var0.drawCentered("Forgotten your password?", Login.loginBoxX + 180, 201, 16776960, 0);
							var22 = 221;
							var2.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var23 += 14;
							var0.draw("Username/email: ", (Login.loginBoxX + 180) - 145, var23, 16777215, 0);
							var24 = 174;
							if (!Interpreter.clientPreferences.method2257()) {
								var6 = Login.Login_username;
							} else {
								var8 = Login.Login_username;
								int var18 = var8.length();
								char[] var19 = new char[var18];

								for (int var26 = 0; var26 < var18; ++var26) {
									var19[var26] = '*';
								}

								String var20 = new String(var19);
								var6 = var20;
							}

							for (var6 = var6; var0.stringWidth(var6) > var24; var6 = var6.substring(1)) {
							}

							var0.draw(AbstractFont.escapeBrackets(var6) + ((Client.cycle % 40) < 20 ? ChatChannel.colorStartTag(16776960) + "|" : ""), (Login.loginBoxX + 180) - 34, var23, 16777215, 0);
							var23 += 15;
							var15 = (Login.loginBoxX + 180) - 80;
							var28 = 321;
							class137.titlebuttonSprite.drawAt(var15 - 73, var28 - 20);
							var0.drawCentered("Recover", var15, var28 + 5, 16777215, 0);
							var15 = (Login.loginBoxX + 180) + 80;
							class137.titlebuttonSprite.drawAt(var15 - 73, var28 - 20);
							var0.drawCentered("Back", var15, var28 + 5, 16777215, 0);
							var28 = 356;
							var1.drawCentered("Still having trouble logging in?", class134.loginBoxCenter, var28, 268435455, 0);
						} else if (Login.loginIndex == 6) {
							var22 = 201;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180;
							var13 = 321;
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
							var0.drawCentered("Back", var4, var13 + 5, 16777215, 0);
						} else if (Login.loginIndex == 7) {
							if (class260.field2888 && (!Client.onMobile)) {
								var22 = 201;
								var0.drawCentered(Login.Login_response1, class134.loginBoxCenter, var22, 16776960, 0);
								var23 = var22 + 15;
								var0.drawCentered(Login.Login_response2, class134.loginBoxCenter, var23, 16776960, 0);
								var23 += 15;
								var0.drawCentered(Login.Login_response3, class134.loginBoxCenter, var23, 16776960, 0);
								var4 = class134.loginBoxCenter - 150;
								var23 += 10;

								int var27;
								for (var27 = 0; var27 < 8; ++var27) {
									class137.titlebuttonSprite.method8161(var4, var23, 30, 40);
									boolean var17 = (var27 == Login.field899) & ((Client.cycle % 40) < 20);
									var0.draw((Login.field900[var27] == null ? "" : Login.field900[var27]) + (var17 ? ChatChannel.colorStartTag(16776960) + "|" : ""), var4 + 10, var23 + 27, 16777215, 0);
									if ((var27 != 1) && (var27 != 3)) {
										var4 += 35;
									} else {
										var4 += 50;
										var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var23 + 27, 16777215, 0);
									}
								}

								var27 = class134.loginBoxCenter - 80;
								short var30 = 321;
								class137.titlebuttonSprite.drawAt(var27 - 73, var30 - 20);
								var0.drawCentered("Submit", var27, var30 + 5, 16777215, 0);
								var27 = class134.loginBoxCenter + 80;
								class137.titlebuttonSprite.drawAt(var27 - 73, var30 - 20);
								var0.drawCentered("Cancel", var27, var30 + 5, 16777215, 0);
							} else {
								var22 = 216;
								var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var22, 16776960, 0);
								var23 = var22 + 15;
								var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var23, 16776960, 0);
								var23 += 15;
								var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var23, 16776960, 0);
								var23 += 15;
								var4 = (Login.loginBoxX + 180) - 80;
								var13 = 321;
								class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
								var0.drawCentered("Set Date of Birth", var4, var13 + 5, 16777215, 0);
								var4 = (Login.loginBoxX + 180) + 80;
								class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
								var0.drawCentered("Back", var4, var13 + 5, 16777215, 0);
							}
						} else if (Login.loginIndex == 8) {
							var22 = 216;
							var0.drawCentered("Sorry, but your account is not eligible to play.", Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered("For more information, please take a look at", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered("our privacy policy.", Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var4 = (Login.loginBoxX + 180) - 80;
							var13 = 321;
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
							var0.drawCentered("Privacy Policy", var4, var13 + 5, 16777215, 0);
							var4 = (Login.loginBoxX + 180) + 80;
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
							var0.drawCentered("Back", var4, var13 + 5, 16777215, 0);
						} else if (Login.loginIndex == 9) {
							var22 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 25;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 25;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16776960, 0);
							var4 = Login.loginBoxX + 180;
							var13 = 311;
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
							var0.drawCentered("Try again", var4, var13 + 5, 16777215, 0);
						} else if (Login.loginIndex == 10) {
							var23 = Login.loginBoxX + 180;
							var24 = 209;
							var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var24, 16776960, 0);
							var4 = var24 + 20;
							Login.field882.drawAt(var23 - 109, var4);
							Login.field913.drawAt(var23 - 48, var4 + 18);
						} else if (Login.loginIndex == 12) {
							var23 = class134.loginBoxCenter;
							var24 = 216;
							var2.drawCentered("Before using this app, please read and accept our", var23, var24, 16777215, 0);
							var4 = var24 + 17;
							var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var23, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var23, var4, 16777215, 0);
							var4 += 17;
							var2.drawCentered("By accepting, you agree to these documents.", var23, var4, 16777215, 0);
							var23 = class134.loginBoxCenter - 80;
							var24 = 311;
							class137.titlebuttonSprite.drawAt(var23 - 73, var24 - 20);
							var0.drawCentered("Accept", var23, var24 + 5, 16777215, 0);
							var23 = class134.loginBoxCenter + 80;
							class137.titlebuttonSprite.drawAt(var23 - 73, var24 - 20);
							var0.drawCentered("Decline", var23, var24 + 5, 16777215, 0);
						} else if (Login.loginIndex == 13) {
							var22 = 231;
							var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var22, 16777215, 0);
							var23 = var22 + 20;
							var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var23, 16777215, 0);
							var4 = Login.loginBoxX + 180;
							var22 = 311;
							class137.titlebuttonSprite.drawAt(var4 - 73, var22 - 20);
							var0.drawCentered("Back", var4, var22 + 5, 16777215, 0);
						} else if (Login.loginIndex == 14) {
							var22 = 201;
							String var14 = "";
							var5 = "";
							var6 = "";
							switch (Login.Login_banType) {
								case 0 :
									var14 = "Your account has been disabled.";
									var5 = Strings.field3731;
									var6 = "";
									break;
								case 1 :
									var14 = "Account locked as we suspect it has been stolen.";
									var5 = Strings.field3684;
									var6 = "";
									break;
								default :
									class127.Login_promptCredentials(false);}


							var0.drawCentered(var14, Login.loginBoxX + 180, var22, 16776960, 0);
							var23 = var22 + 15;
							var2.drawCentered(var5, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var2.drawCentered(var6, Login.loginBoxX + 180, var23, 16776960, 0);
							var23 += 15;
							var15 = Login.loginBoxX + 180;
							var28 = 276;
							class137.titlebuttonSprite.drawAt(var15 - 73, var28 - 20);
							var0.drawCentered("Support Page", var15, var28 + 5, 16777215, 0);
							var15 = Login.loginBoxX + 180;
							var28 = 326;
							class137.titlebuttonSprite.drawAt(var15 - 73, var28 - 20);
							var0.drawCentered("Back", var15, var28 + 5, 16777215, 0);
						} else if (Login.loginIndex == 24) {
							var22 = 221;
							var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var22, 16777215, 0);
							var23 = var22 + 15;
							var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var23, 16777215, 0);
							var23 += 15;
							var4 = Login.loginBoxX + 180;
							var13 = 301;
							class137.titlebuttonSprite.drawAt(var4 - 73, var13 - 20);
							var0.drawCentered("Ok", var4, var13 + 5, 16777215, 0);
						}
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var21 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var21);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class309.canvasHeight);
				Login.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				Login.loginScreenRunesAnimation.draw(((Login.xPadding + 22) + 765) - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var21);
			}

			class114.title_muteSprite[Interpreter.clientPreferences.method2259() ? 1 : 0].drawAt((Login.xPadding + 765) - 40, 463);
			if ((Client.gameState > 5) && (Language.Language_EN == FriendSystem.clientLanguage)) {
				if (class19.field96 != null) {
					var23 = Login.xPadding + 5;
					var24 = 463;
					byte var29 = 100;
					byte var31 = 35;
					class19.field96.drawAt(var23, var24);
					var0.drawCentered(("World" + " ") + Client.worldId, (var29 / 2) + var23, ((var31 / 2) + var24) - 2, 16777215, 0);
					if (class345.World_request != null) {
						var1.drawCentered("Loading...", (var29 / 2) + var23, ((var31 / 2) + var24) + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", (var29 / 2) + var23, ((var31 / 2) + var24) + 12, 16777215, 0);
					}
				} else {
					class19.field96 = NPCComposition.SpriteBuffer_getIndexedSpriteByName(WorldMapData_1.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZB)I", garbageValue = 
	"-110")

	static int method2861(int var0, Script var1, boolean var2) {
		if ((var0 != 3700) && (var0 != 3701)) {
			if (var0 == 3702) {
				++class295.Interpreter_intStackSize;
				return 1;
			} else {
				return 2;
			}
		} else {
			--class295.Interpreter_intStackSize;
			--ChatChannel.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(descriptor = 
	"(IIB)V", garbageValue = 
	"48")

	static final void method2864(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		}

		if (var0 > 383) {
			var0 = 383;
		}

		if (Language.cameraPitch < var0) {
			Language.cameraPitch = ((((var0 - Language.cameraPitch) * JagexCache.field1737) / 1000) + Language.cameraPitch) + ClanChannel.field1660;
			if (Language.cameraPitch > var0) {
				Language.cameraPitch = var0;
			}
		}

		if (Language.cameraPitch > var0) {
			Language.cameraPitch -= (((Language.cameraPitch - var0) * JagexCache.field1737) / 1000) + ClanChannel.field1660;
			if (Language.cameraPitch < var0) {
				Language.cameraPitch = var0;
			}
		}

		int var2 = var1 - MusicPatchNode2.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		}

		if (var2 < (-1024)) {
			var2 += 2048;
		}

		if (var2 > 0) {
			MusicPatchNode2.cameraYaw = (MusicPatchNode2.cameraYaw + ClanChannel.field1660) + ((var2 * JagexCache.field1737) / 1000);
			MusicPatchNode2.cameraYaw &= 2047;
		}

		if (var2 < 0) {
			MusicPatchNode2.cameraYaw -= (((-var2) * JagexCache.field1737) / 1000) + ClanChannel.field1660;
			MusicPatchNode2.cameraYaw &= 2047;
		}

		int var3 = var1 - MusicPatchNode2.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		}

		if (var3 < (-1024)) {
			var3 += 2048;
		}

		if (((var3 < 0) && (var2 > 0)) || ((var3 > 0) && (var2 < 0))) {
			MusicPatchNode2.cameraYaw = var1;
		}

	}

	@ObfuscatedName("iv")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"-1895605377")

	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if ((Client.isItemSelected == 0) && (!Client.isSpellSelected)) {
			SecureRandomFuture.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;

		int var8;
		for (var8 = 0; var8 < SpotAnimationDefinition.method3515(); ++var8) {
			long var22 = WorldMapLabel.method4997(var8);
			if (var22 != var6) {
				var6 = var22;
				int var24 = DynamicObject.method1987(var8);
				int var12 = class150.method3091(var8);
				long var15 = ViewportMouse.ViewportMouse_entityTags[var8];
				int var14 = ((int) ((var15 >>> 14) & 3L));
				int var25 = UserComparator10.method2615(var8);
				if ((var14 == 2) && (FriendSystem.scene.getObjectFlags(class160.Client_plane, var24, var12, var22) >= 0)) {
					ObjectComposition var16 = class116.getObjectDefinition(var25);
					if (var16.transforms != null) {
						var16 = var16.transform();
					}

					if (var16 == null) {
						continue;
					}

					if (Client.isItemSelected == 1) {
						SecureRandomFuture.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + ChatChannel.colorStartTag(65535)) + var16.name, 1, var25, var24, var12);
					} else if (Client.isSpellSelected) {
						if ((class154.selectedSpellFlags & 4) == 4) {
							SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + ChatChannel.colorStartTag(65535)) + var16.name, 2, var25, var24, var12);
						}
					} else {
						String[] var17 = var16.actions;
						if (var17 != null) {
							for (int var18 = 4; var18 >= 0; --var18) {
								if (var17[var18] != null) {
									short var19 = 0;
									if (var18 == 0) {
										var19 = 3;
									}

									if (var18 == 1) {
										var19 = 4;
									}

									if (var18 == 2) {
										var19 = 5;
									}

									if (var18 == 3) {
										var19 = 6;
									}

									if (var18 == 4) {
										var19 = 1001;
									}

									SecureRandomFuture.insertMenuItemNoShift(var17[var18], ChatChannel.colorStartTag(65535) + var16.name, var19, var25, var24, var12);
								}
							}
						}

						SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(65535) + var16.name, 1002, var16.id, var24, var12);
					}
				}

				Player var20;
				int var26;
				NPC var27;
				int var34;
				int[] var35;
				if (var14 == 1) {
					NPC var30 = Client.npcs[var25];
					if (var30 == null) {
						continue;
					}

					if (((var30.definition.size == 1) && ((var30.x & 127) == 64)) && ((var30.y & 127) == 64)) {
						for (var26 = 0; var26 < Client.npcCount; ++var26) {
							var27 = Client.npcs[Client.npcIndices[var26]];
							if (((((var27 != null) && (var30 != var27)) && (var27.definition.size == 1)) && (var27.x == var30.x)) && (var27.y == var30.y)) {
								NPCComposition.addNpcToMenu(var27, Client.npcIndices[var26], var24, var12);
							}
						}

						var26 = Players.Players_count;
						var35 = Players.Players_indices;

						for (var34 = 0; var34 < var26; ++var34) {
							var20 = Client.players[var35[var34]];
							if (((var20 != null) && (var30.x == var20.x)) && (var20.y == var30.y)) {
								WorldMapSprite.addPlayerToMenu(var20, var35[var34], var24, var12);
							}
						}
					}

					NPCComposition.addNpcToMenu(var30, var25, var24, var12);
				}

				if (var14 == 0) {
					Player var31 = Client.players[var25];
					if (var31 == null) {
						continue;
					}

					if (((var31.x & 127) == 64) && ((var31.y & 127) == 64)) {
						for (var26 = 0; var26 < Client.npcCount; ++var26) {
							var27 = Client.npcs[Client.npcIndices[var26]];
							if ((((var27 != null) && (var27.definition.size == 1)) && (var27.x == var31.x)) && (var31.y == var27.y)) {
								NPCComposition.addNpcToMenu(var27, Client.npcIndices[var26], var24, var12);
							}
						}

						var26 = Players.Players_count;
						var35 = Players.Players_indices;

						for (var34 = 0; var34 < var26; ++var34) {
							var20 = Client.players[var35[var34]];
							if ((((var20 != null) && (var20 != var31)) && (var20.x == var31.x)) && (var20.y == var31.y)) {
								WorldMapSprite.addPlayerToMenu(var20, var35[var34], var24, var12);
							}
						}
					}

					if (var25 != Client.combatTargetPlayerIndex) {
						WorldMapSprite.addPlayerToMenu(var31, var25, var24, var12);
					} else {
						var4 = var22;
					}
				}

				if (var14 == 3) {
					NodeDeque var33 = Client.groundItems[class160.Client_plane][var24][var12];
					if (var33 != null) {
						for (TileItem var32 = ((TileItem) (var33.first())); var32 != null; var32 = ((TileItem) (var33.next()))) {
							ItemComposition var36 = class67.ItemDefinition_get(var32.id);
							if (Client.isItemSelected == 1) {
								SecureRandomFuture.insertMenuItemNoShift("Use", ((((Client.selectedItemName + " ") + "->") + " ") + ChatChannel.colorStartTag(16748608)) + var36.name, 16, var32.id, var24, var12);
							} else if (Client.isSpellSelected) {
								if ((class154.selectedSpellFlags & 1) == 1) {
									SecureRandomFuture.insertMenuItemNoShift(Client.selectedSpellActionName, ((((Client.selectedSpellName + " ") + "->") + " ") + ChatChannel.colorStartTag(16748608)) + var36.name, 17, var32.id, var24, var12);
								}
							} else {
								String[] var28 = var36.groundActions;

								for (int var29 = 4; var29 >= 0; --var29) {
									if ((var28 != null) && (var28[var29] != null)) {
										byte var21 = 0;
										if (var29 == 0) {
											var21 = 18;
										}

										if (var29 == 1) {
											var21 = 19;
										}

										if (var29 == 2) {
											var21 = 20;
										}

										if (var29 == 3) {
											var21 = 21;
										}

										if (var29 == 4) {
											var21 = 22;
										}

										SecureRandomFuture.insertMenuItemNoShift(var28[var29], ChatChannel.colorStartTag(16748608) + var36.name, var21, var32.id, var24, var12);
									} else if (var29 == 2) {
										SecureRandomFuture.insertMenuItemNoShift("Take", ChatChannel.colorStartTag(16748608) + var36.name, 20, var32.id, var24, var12);
									}
								}

								SecureRandomFuture.insertMenuItemNoShift("Examine", ChatChannel.colorStartTag(16748608) + var36.name, 1004, var32.id, var24, var12);
							}
						}
					}
				}
			}
		}

		if ((-1L) != var4) {
			var8 = ((int) ((var4 >>> 0) & 127L));
			int var10 = PcmPlayer.method771(var4);
			Player var11 = Client.players[Client.combatTargetPlayerIndex];
			WorldMapSprite.addPlayerToMenu(var11, Client.combatTargetPlayerIndex, var8, var10);
		}

	}
}