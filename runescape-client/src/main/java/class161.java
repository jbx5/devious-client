import java.util.ArrayList;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gw")
public class class161 extends class164 {
	@ObfuscatedName("pu")
	@ObfuscatedGetter(
		intValue = 937568505
	)
	static int field1769;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 580870161
	)
	int field1765;
	@ObfuscatedName("ay")
	byte field1764;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -100987095
	)
	int field1767;
	@ObfuscatedName("au")
	String field1766;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgl;"
	)
	final class165 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgl;)V"
	)
	class161(class165 var1) {
		this.this$0 = var1;
		this.field1765 = -1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lvg;B)V",
		garbageValue = "-40"
	)
	void vmethod3611(Buffer var1) {
		var1.readUnsignedByte();
		this.field1765 = var1.readUnsignedShort();
		this.field1764 = var1.readByte();
		this.field1767 = var1.readUnsignedShort();
		var1.readLong();
		this.field1766 = var1.readStringCp1252NullTerminated();
		var1.readUnsignedByte();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lgx;I)V",
		garbageValue = "-357446960"
	)
	void vmethod3612(ClanChannel var1) {
		ClanChannelMember var2 = (ClanChannelMember)var1.members.get(this.field1765);
		var2.rank = this.field1764;
		var2.world = this.field1767;
		var2.username = new Username(this.field1766);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	public static boolean method3517() {
		ReflectionCheck var0 = (ReflectionCheck)class36.reflectionChecks.last();
		return var0 != null;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;ZII)V",
		garbageValue = "45322394"
	)
	static void method3518(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				class532.updateLoginIndex(4);
			}

		} else {
			if (var3 == 0) {
				Client.updateLoginStatusUsernameRemembered(var2);
			} else {
				class532.updateLoginIndex(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class368.leftTitleSprite = class224.readSpritePixelsFromBytes(var4);
			AttackOption.rightTitleSprite = class368.leftTitleSprite.mirrorHorizontally();
			class380.method7175(var1, Client.worldProperties);
			Login.titleboxSprite = class109.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			WorldMapEvent.titlebuttonSprite = class109.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field930 = class109.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			UserComparator10.field1494 = class109.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class109.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			class328.runesSprite = class543.getFont(var1, "runes", "");
			Login.title_muteSprite = class543.getFont(var1, "title_mute", "");
			class423.options_buttons_0Sprite = class109.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Login.field907 = class109.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class421.options_buttons_2Sprite = class109.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			Login.field902 = class109.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			MouseHandler.field214 = class423.options_buttons_0Sprite.subWidth;
			class223.field2423 = class423.options_buttons_0Sprite.subHeight * -1220193712;
			class27.loginScreenRunesAnimation = new LoginScreenAnimation(class328.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field925 = new String[8];
				Login.field915 = 0;
			}

			FadeOutTask.otpMedium = 0;
			class135.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!TileItem.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var5 = new ArrayList();
				var5.add(new MusicSong(class33.archive6, "scape main", "", 255, false));
				class53.method1051(var5, 0, 0, 0, 100, false);
			} else {
				class92.method2440(0, 0);
			}

			class147.method3342();
			class1.method8().method7360(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (NPC.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class248.loginBoxCenter = Login.loginBoxX + 180;
			class368.leftTitleSprite.drawAt(Login.xPadding, 0);
			AttackOption.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			FillMode.logoSprite.drawAt(Login.xPadding + 382 - FillMode.logoSprite.subWidth / 2, 18);
		}
	}
}
