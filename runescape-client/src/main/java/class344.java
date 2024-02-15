import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nm")
public class class344 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Leb;"
	)
	UrlRequest field3651;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lvd;"
	)
	SpritePixels field3650;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lel;)V"
	)
	class344(String var1, UrlRequester var2) {
		try {
			this.field3651 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3651 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Leb;)V"
	)
	class344(UrlRequest var1) {
		this.field3651 = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lvd;",
		garbageValue = "-750205083"
	)
	SpritePixels method6459() {
		if (this.field3650 == null && this.field3651 != null && this.field3651.isDone()) {
			if (this.field3651.getResponse() != null) {
				this.field3650 = class202.method3920(this.field3651.getResponse());
			}

			this.field3651 = null;
		}

		return this.field3650;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-283741013"
	)
	public static boolean method6465(char var0) {
		if (var0 >= ' ' && var0 < 127 || var0 > 127 && var0 < 160 || var0 > 160 && var0 <= 255) {
			return true;
		} else {
			if (var0 != 0) {
				char[] var1 = class403.cp1252AsciiExtension;

				for (int var2 = 0; var2 < var1.length; ++var2) {
					char var3 = var1[var2];
					if (var0 == var3) {
						return true;
					}
				}
			}

			return false;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;ZII)V",
		garbageValue = "2137737759"
	)
	static void method6458(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				JagexCache.method4224(4);
			}

		} else {
			if (var3 == 0) {
				PacketBufferNode.method6050(var2);
			} else {
				JagexCache.method4224(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = class202.method3920(var4);
			WorldMapLabelSize.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			class213.method4205(var1, Client.worldProperties);
			class155.titleboxSprite = class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field944 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class90.field1121 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class173.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = FloorOverlayDefinition.getFont(var1, "runes", "");
			class169.title_muteSprite = FloorOverlayDefinition.getFont(var1, "title_mute", "");
			class128.options_buttons_0Sprite = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			UserComparator2.field5265 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class472.options_buttons_2Sprite = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class557.field5358 = class173.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			FriendSystem.field859 = class128.options_buttons_0Sprite.subWidth;
			class316.field3448 = class128.options_buttons_0Sprite.subHeight;
			class325.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field962 = new String[8];
				Login.field961 = 0;
			}

			class36.otpMedium = 0;
			MenuAction.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!class30.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var5 = new ArrayList();
				var5.add(new MusicSong(Renderable.archive6, "scape main", "", 255, false));
				PacketWriter.method2891(var5, 0, 0, 0, 100, false);
			} else {
				class169.method3521(0, 0);
			}

			GrandExchangeOfferOwnWorldComparator.method1192();
			Fonts.method9109().method7212(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (GameEngine.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			Login.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			WorldMapLabelSize.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
		}
	}
}
