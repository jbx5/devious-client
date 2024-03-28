import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("le")
public class class306 {
	@ObfuscatedName("ad")
	static int[][] field3195;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;ZII)V",
		garbageValue = "1373698387"
	)
	static void method5907(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				class210.method3930(4);
			}

		} else {
			if (var3 == 0) {
				class172.method3497(var2);
			} else {
				class210.method3930(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class430.leftTitleSprite = GrandExchangeOfferUnitPriceComparator.readSpritePixelsFromBytes(var4);
			Login.rightTitleSprite = class430.leftTitleSprite.mirrorHorizontally();
			GrandExchangeEvents.method7082(var1, Client.worldProperties);
			Login.titleboxSprite = class153.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = class153.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			class86.field1065 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class179.field1901 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class153.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class416.getFont(var1, "runes", "");
			ApproximateRouteStrategy.title_muteSprite = class416.getFont(var1, "title_mute", "");
			class27.options_buttons_0Sprite = class153.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			TriBool.field4811 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			AuthenticationScheme.options_buttons_2Sprite = class153.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class443.field4751 = class153.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			MouseHandler.field228 = class27.options_buttons_0Sprite.subWidth;
			class227.field2427 = class27.options_buttons_0Sprite.subHeight;
			class59.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field931 = new String[8];
				Login.field946 = 0;
			}

			SpriteMask.otpMedium = 0;
			class27.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!NPC.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var5 = new ArrayList();
				var5.add(new MusicSong(UserComparator6.archive6, "scape main", "", 255, false));
				Renderable.method4881(var5, 0, 0, 0, 100, false);
			} else {
				class11.method108(0, 0);
			}

			UserComparator5.method2897();
			class341.method6299().method7052(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (class148.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			ReflectionCheck.loginBoxCenter = Login.loginBoxX + 180;
			class430.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class390.logoSprite.drawAt(Login.xPadding + 382 - class390.logoSprite.subWidth / 2, 18);
		}
	}
}
