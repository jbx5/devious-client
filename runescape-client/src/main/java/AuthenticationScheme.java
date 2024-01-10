import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("AuthenticationScheme")
public enum AuthenticationScheme implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("USERNAME_PASSWORD_REMEMBER")
	USERNAME_PASSWORD_REMEMBER(1, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("TOKEN_REMEMBER")
	TOKEN_REMEMBER(0, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("USERNAME_PASSWORD")
	USERNAME_PASSWORD(3, 2),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	@Export("TOKEN")
	TOKEN(4, 3),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lea;"
	)
	field1473(2, 4);

	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1046332187
	)
	@Export("schemeId")
	public final int schemeId;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1180048497
	)
	@Export("packetId")
	final int packetId;

	AuthenticationScheme(int var3, int var4) {
		this.schemeId = var3;
		this.packetId = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.packetId;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Low;Low;ZII)V",
		garbageValue = "734075679"
	)
	static void method3004(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				Actor.method2489(4);
			}

		} else {
			if (var3 == 0) {
				class408.method7592(var2);
			} else {
				Actor.method2489(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Buddy.leftTitleSprite = class181.method3691(var4);
			SecureRandomCallable.rightTitleSprite = Buddy.leftTitleSprite.mirrorHorizontally();
			SecureRandomFuture.method2235(var1, Client.worldProperties);
			Login.titleboxSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class182.titlebuttonSprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field925 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class473.field4839 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class412.method7748(var1, "runes", "");
			Clock.title_muteSprite = class412.method7748(var1, "title_mute", "");
			class182.options_buttons_0Sprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class465.field4805 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class402.options_buttons_2Sprite = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			Decimator.field410 = VarcInt.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class31.field168 = class182.options_buttons_0Sprite.subWidth;
			Skills.field3911 = class182.options_buttons_0Sprite.subHeight;
			SpriteMask.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field934 = new String[8];
				Login.field924 = 0;
			}

			class130.otpMedium = 0;
			class148.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!class93.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var5 = new ArrayList();
				var5.add(new MusicSong(WorldMapSection0.archive6, "scape main", "", 255, false));
				LoginScreenAnimation.method2528(var5, 0, 0, 0, 100, false);
			} else {
				Actor.method2488(0, 0);
			}

			FontName.method9049();
			class220.method4348().method7126(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (class524.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class433.loginBoxCenter = Login.loginBoxX + 180;
			Buddy.leftTitleSprite.drawAt(Login.xPadding, 0);
			SecureRandomCallable.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			GrandExchangeEvents.logoSprite.drawAt(Login.xPadding + 382 - GrandExchangeEvents.logoSprite.subWidth / 2, 18);
		}
	}
}
