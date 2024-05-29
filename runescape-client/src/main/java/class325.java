import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public final class class325 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		longValue = -2105784994464855103L
	)
	static long field3553;

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lor;Lor;ZII)V",
		garbageValue = "1844423499"
	)
	static void method6191(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				ParamComposition.updateLoginIndex(4);
			}

		} else {
			if (var3 == 0) {
				PendingSpawn.method2411(var2);
			} else {
				ParamComposition.updateLoginIndex(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			InvDefinition.leftTitleSprite = class452.readSpritePixelsFromBytes(var4);
			Login.rightTitleSprite = InvDefinition.leftTitleSprite.mirrorHorizontally();
			UrlRequester.method2917(var1, Client.worldProperties);
			Login.titleboxSprite = ClanMate.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = ClanMate.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			class435.field4776 = ClanMate.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			StructComposition.field2240 = ClanMate.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			ClanMate.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class182.getFont(var1, "runes", "");
			class433.title_muteSprite = class182.getFont(var1, "title_mute", "");
			class397.options_buttons_0Sprite = ClanMate.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Login.field946 = ClanMate.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class206.options_buttons_2Sprite = ClanMate.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			Varps.field3710 = ClanMate.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			FontName.field5196 = class397.options_buttons_0Sprite.subWidth;
			ObjectSound.field866 = class397.options_buttons_0Sprite.subHeight * -1758859088;
			class239.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field960 = new String[8];
				Login.field973 = 0;
			}

			class414.otpMedium = 0;
			class285.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!class459.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var5 = new ArrayList();
				var5.add(new MusicSong(GameObject.archive6, "scape main", "", 255, false));
				ScriptFrame.method1169(var5, 0, 0, 0, 100, false);
			} else {
				Skills.method7123(0, 0);
			}

			SoundSystem.method851();
			JagNetThread var6 = HttpMethod.field32;
			var6.method7335(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			KeyHandler.loginBoxCenter = Login.loginBoxX + 180;
			InvDefinition.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			class91.logoSprite.drawAt(Login.xPadding + 382 - class91.logoSprite.subWidth / 2, 18);
		}
	}
}
