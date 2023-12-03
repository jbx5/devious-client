import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -512679661
	)
	static int field1428;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1004408775
	)
	static int field1432;
	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 1252033691
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("at")
	final URL field1429;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -404858941
	)
	volatile int field1427;
	@ObfuscatedName("ab")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1428 = -1;
		field1432 = -2;
	}

	UrlRequest(URL var1) {
		this.field1427 = field1428;
		this.field1429 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "143275860"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1427 != field1428;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "1"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1515971347"
	)
	public String method2928() {
		return this.field1429.toString();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lpf;Lpf;Lpf;I)V",
		garbageValue = "-1245628340"
	)
	@Export("drawTitle")
	static void drawTitle(Font var0, Font var1, Font var2) {
		Login.xPadding = (Language.canvasWidth - 765) / 2;
		Login.loginBoxX = Login.xPadding + 202;
		class157.loginBoxCenter = Login.loginBoxX + 180;
		if (Login.worldSelectOpen) {
			ParamComposition.method3830(var0, var1);
		} else {
			class250.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
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

			String var5;
			String var6;
			String var7;
			short var23;
			int var24;
			short var25;
			if (Client.gameState == 20) {
				Login.titleboxSprite.drawAt(Login.loginBoxX + 180 - Login.titleboxSprite.subWidth / 2, 271 - Login.titleboxSprite.subHeight / 2);
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
					var5 = WorldMapIcon_1.clientPreferences.isUsernameHidden() ? MusicPatch.method6201(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(0, var6.length() - 1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6), Login.loginBoxX + 180 - 70, var24, 16777215, 0);
					var24 += 15;

					for (var7 = MusicPatch.method6201(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7, Login.loginBoxX + 180 - 108, var24, 16777215, 0);
					var24 += 15;
				}
			}

			if (Client.gameState == 10 || Client.gameState == 11 || Client.gameState == 50) {
				Login.titleboxSprite.drawAt(Login.loginBoxX, 171);
				short var18;
				if (Login.loginIndex == 0) {
					var23 = 251;
					var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 30;
					var4 = Login.loginBoxX + 180 - 80;
					var18 = 291;
					Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawLines("New User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawLines("Existing User", var4 - 73, var18 - 20, 144, 40, 16777215, 0, 1, 1, 0);
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
					var18 = 321;
					Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawCentered("Continue", var4, var18 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180 + 80;
					Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var0.drawCentered("Cancel", var4, var18 + 5, 16777215, 0);
				} else if (Login.loginIndex == 2) {
					var23 = 201;
					var0.drawCentered(Login.Login_response1, class157.loginBoxCenter, var23, 16776960, 0);
					var24 = var23 + 15;
					var0.drawCentered(Login.Login_response2, class157.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var0.drawCentered(Login.Login_response3, class157.loginBoxCenter, var24, 16776960, 0);
					var24 += 15;
					var24 += 7;
					var0.draw("Login: ", class157.loginBoxCenter - 110, var24, 16777215, 0);
					var25 = 200;
					var5 = WorldMapIcon_1.clientPreferences.isUsernameHidden() ? MusicPatch.method6201(Login.Login_username) : Login.Login_username;

					for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
					}

					var0.draw(AbstractFont.escapeBrackets(var6) + (Login.currentLoginField == 0 & Client.cycle % 40 < 20 ? class167.colorStartTag(16776960) + "|" : ""), class157.loginBoxCenter - 70, var24, 16777215, 0);
					var24 += 15;

					for (var7 = MusicPatch.method6201(Login.Login_password); var0.stringWidth(var7) > var25; var7 = var7.substring(1)) {
					}

					var0.draw("Password: " + var7 + (Login.currentLoginField == 1 & Client.cycle % 40 < 20 ? class167.colorStartTag(16776960) + "|" : ""), class157.loginBoxCenter - 108, var24, 16777215, 0);
					var24 += 15;
					var23 = 277;
					int var8 = class157.loginBoxCenter + -117;
					boolean var10 = Client.Login_isUsernameRemembered;
					boolean var11 = Login.field916;
					IndexedSprite var9 = var10 ? (var11 ? GrandExchangeEvents.field4344 : FriendsList.options_buttons_2Sprite) : (var11 ? Login.field902 : class310.options_buttons_0Sprite);
					var9.drawAt(var8, var23);
					var8 = var8 + var9.subWidth + 5;
					var1.draw("Remember username", var8, var23 + 13, 16776960, 0);
					var8 = class157.loginBoxCenter + 24;
					boolean var14 = WorldMapIcon_1.clientPreferences.isUsernameHidden();
					boolean var15 = Login.field919;
					IndexedSprite var13 = var14 ? (var15 ? GrandExchangeEvents.field4344 : FriendsList.options_buttons_2Sprite) : (var15 ? Login.field902 : class310.options_buttons_0Sprite);
					var13.drawAt(var8, var23);
					var8 = var8 + var13.subWidth + 5;
					var1.draw("Hide username", var8, var23 + 13, 16776960, 0);
					var24 = var23 + 15;
					int var16 = class157.loginBoxCenter - 80;
					short var17 = 321;
					Login.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Login", var16, var17 + 5, 16777215, 0);
					var16 = class157.loginBoxCenter + 80;
					Login.titlebuttonSprite.drawAt(var16 - 73, var17 - 20);
					var0.drawCentered("Cancel", var16, var17 + 5, 16777215, 0);
					var23 = 357;
					switch(Login.field931) {
					case 2:
						ModeWhere.field4426 = "Having trouble logging in?";
						break;
					default:
						ModeWhere.field4426 = "Can't login? Click here.";
					}

					Login.field918 = new Bounds(class157.loginBoxCenter, var23, var1.stringWidth(ModeWhere.field4426), 11);
					class7.field21 = new Bounds(class157.loginBoxCenter, var23, var1.stringWidth("Still having trouble logging in?"), 11);
					var1.drawCentered(ModeWhere.field4426, class157.loginBoxCenter, var23, 16777215, 0);
				} else if (Login.loginIndex == 3) {
					var23 = 201;
					var0.drawCentered("Incorrect username or password.", Login.loginBoxX + 180, var23, 16776960, 0);
					var24 = var23 + 20;
					var1.drawCentered("If you have upgraded to a Jagex Account, you", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 20;
					var1.drawCentered("need to log in using the <u=ffd200><col=ffd200>Jagex Launcher</col></u> instead.", Login.loginBoxX + 180, var24, 16776960, 0);
					var24 += 15;
					var4 = Login.loginBoxX + 180;
					var18 = 276;
					Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var2.drawCentered("Try again", var4, var18 + 5, 16777215, 0);
					var4 = Login.loginBoxX + 180;
					var18 = 326;
					Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
					var2.drawCentered("Forgotten password?", var4, var18 + 5, 16777215, 0);
				} else {
					int var20;
					short var27;
					int var28;
					if (Login.loginIndex == 4) {
						var0.drawCentered("Authenticator", Login.loginBoxX + 180, 201, 16776960, 0);
						var23 = 236;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.draw("PIN: " + MusicPatch.method6201(NpcOverrides.otp) + (Client.cycle % 40 < 20 ? class167.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 108, var24, 16777215, 0);
						var24 -= 8;
						var0.draw("Trust this computer", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						var24 += 15;
						var0.draw("for 30 days: ", Login.loginBoxX + 180 - 9, var24, 16776960, 0);
						var4 = Login.loginBoxX + 180 - 9 + var0.stringWidth("for 30 days: ") + 15;
						var28 = var24 - var0.ascent;
						IndexedSprite var26;
						if (Login.rememberUsername) {
							var26 = FriendsList.options_buttons_2Sprite;
						} else {
							var26 = class310.options_buttons_0Sprite;
						}

						var26.drawAt(var4, var28);
						var24 += 15;
						var20 = Login.loginBoxX + 180 - 80;
						var27 = 321;
						Login.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Continue", var20, var27 + 5, 16777215, 0);
						var20 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Cancel", var20, var27 + 5, 16777215, 0);
						var1.drawCentered("Can't login? Click here.", Login.loginBoxX + 180, var27 + 36, 16777215, 0);
					} else if (Login.loginIndex == 5) {
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
						var5 = WorldMapIcon_1.clientPreferences.isUsernameHidden() ? MusicPatch.method6201(Login.Login_username) : Login.Login_username;

						for (var6 = var5; var0.stringWidth(var6) > var25; var6 = var6.substring(1)) {
						}

						var0.draw(AbstractFont.escapeBrackets(var6) + (Client.cycle % 40 < 20 ? class167.colorStartTag(16776960) + "|" : ""), Login.loginBoxX + 180 - 34, var24, 16777215, 0);
						var24 += 15;
						var20 = Login.loginBoxX + 180 - 80;
						var27 = 321;
						Login.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Recover", var20, var27 + 5, 16777215, 0);
						var20 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0);
						var27 = 356;
						var1.drawCentered("Still having trouble logging in?", class157.loginBoxCenter, var27, 268435455, 0);
					} else if (Login.loginIndex == 6) {
						var23 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180;
						var18 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 7) {
						if (PendingSpawn.field1169 && !Client.onMobile) {
							var23 = 201;
							var0.drawCentered(Login.Login_response1, class157.loginBoxCenter, var23, 16776960, 0);
							var24 = var23 + 15;
							var0.drawCentered(Login.Login_response2, class157.loginBoxCenter, var24, 16776960, 0);
							var24 += 15;
							var0.drawCentered(Login.Login_response3, class157.loginBoxCenter, var24, 16776960, 0);
							var4 = class157.loginBoxCenter - 150;
							var24 += 10;

							for (var28 = 0; var28 < 8; ++var28) {
								Login.titlebuttonSprite.method9718(var4, var24, 30, 40);
								boolean var21 = var28 == Login.field915 & Client.cycle % 40 < 20;
								var0.draw((Login.field907[var28] == null ? "" : Login.field907[var28]) + (var21 ? class167.colorStartTag(16776960) + "|" : ""), var4 + 10, var24 + 27, 16777215, 0);
								if (var28 != 1 && var28 != 3) {
									var4 += 35;
								} else {
									var4 += 50;
									var0.draw(AbstractFont.escapeBrackets("/"), var4 - 13, var24 + 27, 16777215, 0);
								}
							}

							var28 = class157.loginBoxCenter - 80;
							short var29 = 321;
							Login.titlebuttonSprite.drawAt(var28 - 73, var29 - 20);
							var0.drawCentered("Submit", var28, var29 + 5, 16777215, 0);
							var28 = class157.loginBoxCenter + 80;
							Login.titlebuttonSprite.drawAt(var28 - 73, var29 - 20);
							var0.drawCentered("Cancel", var28, var29 + 5, 16777215, 0);
						} else {
							var23 = 216;
							var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
							var24 = var23 + 15;
							var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0);
							var24 += 15;
							var4 = Login.loginBoxX + 180 - 80;
							var18 = 321;
							Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
							var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0);
							var4 = Login.loginBoxX + 180 + 80;
							Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
							var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
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
						var18 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Privacy Policy", var4, var18 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 9) {
						var23 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 25;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 25;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var4 = Login.loginBoxX + 180;
						var18 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Try again", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 10) {
						var24 = Login.loginBoxX + 180;
						var25 = 209;
						var0.drawCentered("Welcome to RuneScape", Login.loginBoxX + 180, var25, 16776960, 0);
						var4 = var25 + 20;
						Login.field898.drawAt(var24 - 109, var4);
						if (Login.displayName.isEmpty()) {
							class11.field47.drawAt(var24 - 48, var4 + 18);
						} else {
							class11.field47.drawAt(var24 - 48, var4 + 5);
							var0.drawCentered(Login.displayName, var24, var4 + 68 - 15, 16776960, 0);
						}
					} else if (Login.loginIndex == 12) {
						var24 = class157.loginBoxCenter;
						var25 = 216;
						var2.drawCentered("Before using this app, please read and accept our", var24, var25, 16777215, 0);
						var4 = var25 + 17;
						var2.drawCentered("<col=ffd200>terms of use</col>, <col=ffd200>privacy policy</col>, and <col=ffd200>end user licence</col>", var24, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("<col=ffd200>agreement (EULA)</col>.", var24, var4, 16777215, 0);
						var4 += 17;
						var2.drawCentered("By accepting, you agree to these documents.", var24, var4, 16777215, 0);
						var24 = class157.loginBoxCenter - 80;
						var25 = 311;
						Login.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
						var0.drawCentered("Accept", var24, var25 + 5, 16777215, 0);
						var24 = class157.loginBoxCenter + 80;
						Login.titlebuttonSprite.drawAt(var24 - 73, var25 - 20);
						var0.drawCentered("Decline", var24, var25 + 5, 16777215, 0);
					} else if (Login.loginIndex == 13) {
						var23 = 231;
						var2.drawCentered("You must accept our terms of use, privacy policy,", Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 20;
						var2.drawCentered("and end user licence agreement to continue.", Login.loginBoxX + 180, var24, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var23 = 311;
						Login.titlebuttonSprite.drawAt(var4 - 73, var23 - 20);
						var0.drawCentered("Back", var4, var23 + 5, 16777215, 0);
					} else if (Login.loginIndex == 14) {
						var23 = 201;
						String var19 = "";
						var5 = "";
						var6 = "";
						switch(Login.Login_banType) {
						case 0:
							var19 = "Your account has been involved";
							var5 = "in serious rule breaking.";
							var6 = "";
							break;
						case 1:
							var19 = "Your account has been locked due to";
							var5 = "suspicious activity.";
							var6 = "Please recover your account.";
							break;
						case 2:
							var19 = "The unpaid balance on your account needs";
							var5 = "to be resolved before you can play.";
							var6 = Strings.field4057;
							break;
						default:
							SoundSystem.Login_promptCredentials(false);
						}

						var0.drawCentered(var19, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 20;
						var0.drawCentered(var5, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 20;
						var0.drawCentered(var6, Login.loginBoxX + 180, var24, 16776960, 0);
						var20 = Login.loginBoxX + 180;
						var27 = 276;
						Login.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						if (Login.Login_banType == 1) {
							var0.drawCentered("Recover Account", var20, var27 + 5, 16777215, 0);
						} else {
							var0.drawCentered("View Appeal Options", var20, var27 + 5, 16777215, 0);
						}

						var20 = Login.loginBoxX + 180;
						var27 = 326;
						Login.titlebuttonSprite.drawAt(var20 - 73, var27 - 20);
						var0.drawCentered("Back", var20, var27 + 5, 16777215, 0);
					} else if (Login.loginIndex == 24) {
						var23 = 221;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16777215, 0);
						var24 = var23 + 15;
						var0.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var0.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16777215, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180;
						var18 = 301;
						Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Ok", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 32) {
						var23 = 216;
						var0.drawCentered("Your date of birth isn't set.", Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 15;
						var2.drawCentered("Please verify your account status by", Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var2.drawCentered("setting your date of birth.", Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180 - 80;
						var18 = 321;
						Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Set Date of Birth", var4, var18 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180 + 80;
						Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var0.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					} else if (Login.loginIndex == 33) {
						var23 = 201;
						var0.drawCentered(Login.Login_response1, Login.loginBoxX + 180, var23, 16776960, 0);
						var24 = var23 + 20;
						var1.drawCentered(Login.Login_response2, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 20;
						var1.drawCentered(Login.Login_response3, Login.loginBoxX + 180, var24, 16776960, 0);
						var24 += 15;
						var4 = Login.loginBoxX + 180;
						var18 = 276;
						Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var2.drawCentered("Download Launcher", var4, var18 + 5, 16777215, 0);
						var4 = Login.loginBoxX + 180;
						var18 = 326;
						Login.titlebuttonSprite.drawAt(var4 - 73, var18 - 20);
						var2.drawCentered("Back", var4, var18 + 5, 16777215, 0);
					}
				}
			}

			if (Client.gameState >= 10) {
				int[] var22 = new int[4];
				Rasterizer2D.Rasterizer2D_getClipArray(var22);
				Rasterizer2D.Rasterizer2D_setClip(Login.xPadding, 0, Login.xPadding + 765, class47.canvasHeight);
				EnumComposition.loginScreenRunesAnimation.draw(Login.xPadding - 22, Client.cycle);
				EnumComposition.loginScreenRunesAnimation.draw(Login.xPadding + 22 + 765 - 128, Client.cycle);
				Rasterizer2D.Rasterizer2D_setClipArray(var22);
			}

			Login.title_muteSprite[WorldMapIcon_1.clientPreferences.isTitleMusicDisabled() ? 1 : 0].drawAt(Login.xPadding + 765 - 40, 463);
			if (Client.gameState > 5 && class85.clientLanguage == Language.Language_EN) {
				if (FadeOutTask.field4547 != null) {
					var24 = Login.xPadding + 5;
					var25 = 463;
					byte var31 = 100;
					byte var30 = 35;
					FadeOutTask.field4547.drawAt(var24, var25);
					var0.drawCentered("World" + " " + Client.worldId, var31 / 2 + var24, var30 / 2 + var25 - 2, 16777215, 0);
					if (class542.World_request != null) {
						var1.drawCentered("Loading...", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0);
					} else {
						var1.drawCentered("Click to switch", var31 / 2 + var24, var30 / 2 + var25 + 12, 16777215, 0);
					}
				} else {
					FadeOutTask.field4547 = class313.SpriteBuffer_getIndexedSpriteByName(GrandExchangeOfferOwnWorldComparator.archive8, "sl_button", "");
				}
			}

		}
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "-1"
	)
	static final void method2922(int var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var2 - var0;
		int var7 = var3 - var1;
		int var8 = var6 >= 0 ? var6 : -var6;
		int var9 = var7 >= 0 ? var7 : -var7;
		int var10 = var8;
		if (var8 < var9) {
			var10 = var9;
		}

		if (var10 != 0) {
			int var11 = (var6 << 16) / var10;
			int var12 = (var7 << 16) / var10;
			if (var12 <= var11) {
				var11 = -var11;
			} else {
				var12 = -var12;
			}

			int var13 = var5 * var12 >> 17;
			int var14 = var5 * var12 + 1 >> 17;
			int var15 = var5 * var11 >> 17;
			int var16 = var5 * var11 + 1 >> 17;
			var0 -= Rasterizer2D.Rasterizer2D_xClipStart;
			var1 -= Rasterizer2D.Rasterizer2D_yClipStart;
			int var17 = var0 + var13;
			int var18 = var0 - var14;
			int var19 = var0 + var6 - var14;
			int var20 = var0 + var6 + var13;
			int var21 = var15 + var1;
			int var22 = var1 - var16;
			int var23 = var7 + var1 - var16;
			int var24 = var7 + var15 + var1;
			Rasterizer3D.method5207(var17, var18, var19);
			Rasterizer3D.rasterFlat(var21, var22, var23, var17, var18, var19, 0.0F, 0.0F, 0.0F, var4);
			Rasterizer3D.method5207(var17, var19, var20);
			Rasterizer3D.rasterFlat(var21, var23, var24, var17, var19, var20, 0.0F, 0.0F, 0.0F, var4);
		}
	}

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IIIZB)V",
		garbageValue = "2"
	)
	@Export("resizeInterface")
	static void resizeInterface(Widget[] var0, int var1, int var2, int var3, boolean var4) {
		for (int var5 = 0; var5 < var0.length; ++var5) {
			Widget var6 = var0[var5];
			if (var6 != null && var6.parentId == var1) {
				Renderable.alignWidgetSize(var6, var2, var3, var4);
				JagexCache.alignWidgetPosition(var6, var2, var3);
				if (var6.scrollX > var6.scrollWidth - var6.width) {
					var6.scrollX = var6.scrollWidth - var6.width;
				}

				if (var6.scrollX < 0) {
					var6.scrollX = 0;
				}

				if (var6.scrollY > var6.scrollHeight - var6.height) {
					var6.scrollY = var6.scrollHeight - var6.height;
				}

				if (var6.scrollY < 0) {
					var6.scrollY = 0;
				}

				if (var6.type == 0) {
					class132.revalidateWidgetScroll(var0, var6, var4);
				}
			}
		}

	}

	@ObfuscatedName("nl")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZB)V",
		garbageValue = "99"
	)
	@Export("findItemDefinitions")
	static void findItemDefinitions(String var0, boolean var1) {
		var0 = var0.toLowerCase();
		short[] var2 = new short[16];
		int var3 = 0;

		for (int var4 = 0; var4 < ItemComposition.ItemDefinition_fileCount; ++var4) {
			ItemComposition var9 = class214.ItemDefinition_get(var4);
			if ((!var1 || var9.isTradable) && var9.noteTemplate == -1 && var9.name.toLowerCase().indexOf(var0) != -1) {
				if (var3 >= 250) {
					BuddyRankComparator.foundItemIdCount = -1;
					MusicPatchNode.foundItemIds = null;
					return;
				}

				if (var3 >= var2.length) {
					short[] var6 = new short[var2.length * 2];

					for (int var7 = 0; var7 < var3; ++var7) {
						var6[var7] = var2[var7];
					}

					var2 = var6;
				}

				var2[var3++] = (short)var4;
			}
		}

		MusicPatchNode.foundItemIds = var2;
		ApproximateRouteStrategy.foundItemIndex = 0;
		BuddyRankComparator.foundItemIdCount = var3;
		String[] var8 = new String[BuddyRankComparator.foundItemIdCount];

		for (int var5 = 0; var5 < BuddyRankComparator.foundItemIdCount; ++var5) {
			var8[var5] = class214.ItemDefinition_get(var2[var5]).name;
		}

		class215.method4229(var8, MusicPatchNode.foundItemIds);
	}
}
