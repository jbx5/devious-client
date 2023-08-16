import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("py")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 6454939314304867917L
	)
	long field4564;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = -7356339213300068871L
	)
	long field4563;
	@ObfuscatedName("ao")
	public boolean field4568;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		longValue = 8401720768134439495L
	)
	long field4565;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		longValue = -287005139873916205L
	)
	long field4566;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		longValue = 1145719069338779159L
	)
	long field4572;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -264016203
	)
	int field4567;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 436925731
	)
	int field4569;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1568859201
	)
	int field4570;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 140876143
	)
	int field4571;

	public Timer() {
		this.field4564 = -1L;
		this.field4563 = -1L;
		this.field4568 = false;
		this.field4565 = 0L;
		this.field4566 = 0L;
		this.field4572 = 0L;
		this.field4567 = 0;
		this.field4569 = 0;
		this.field4570 = 0;
		this.field4571 = 0;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "8457"
	)
	public void method7683() {
		this.field4564 = GameEngine.method661();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1934849344"
	)
	public void method7702() {
		if (-1L != this.field4564) {
			this.field4566 = GameEngine.method661() - this.field4564;
			this.field4564 = -1L;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-350362388"
	)
	public void method7685(int var1) {
		this.field4563 = GameEngine.method661();
		this.field4567 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1654604746"
	)
	public void method7686() {
		if (-1L != this.field4563) {
			this.field4565 = GameEngine.method661() - this.field4563;
			this.field4563 = -1L;
		}

		++this.field4570;
		this.field4568 = true;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1332700570"
	)
	public void method7687() {
		this.field4568 = false;
		this.field4569 = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1203645178"
	)
	public void method7682() {
		this.method7686();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ltm;I)V",
		garbageValue = "-1131300040"
	)
	@Export("write")
	public void write(Buffer var1) {
		ClientPreferences.method2464(var1, this.field4566);
		ClientPreferences.method2464(var1, this.field4565);
		ClientPreferences.method2464(var1, this.field4572);
		var1.writeShort(this.field4567);
		var1.writeShort(this.field4569);
		var1.writeShort(this.field4570);
		var1.writeShort(this.field4571);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;ZII)V",
		garbageValue = "-487590023"
	)
	static void method7688(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (class403.clearLoginScreen) {
			if (var3 == 4) {
				PcmPlayer.method838(4);
			}

		} else {
			if (var3 == 0) {
				WorldMapAreaData.method5584(var2);
			} else {
				PcmPlayer.method838(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			Login.leftTitleSprite = WorldMapData_1.method5347(var4);
			Bounds.rightTitleSprite = Login.leftTitleSprite.mirrorHorizontally();
			int var5 = Client.worldProperties;
			if ((var5 & class510.field5090.rsOrdinal()) != 0) {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "logo_deadman_mode", "");
			} else if ((var5 & class510.field5091.rsOrdinal()) != 0) {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "logo_seasonal_mode", "");
			} else if ((var5 & class510.field5069.rsOrdinal()) != 0) {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "logo_speedrunning", "");
			} else {
				SoundSystem.logoSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "logo", "");
			}

			Login.titleboxSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class219.titlebuttonSprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field933 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			ItemContainer.field1068 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class172.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class219.method4261(var1, "runes", "");
			class13.title_muteSprite = class219.method4261(var1, "title_mute", "");
			Login.options_buttons_0Sprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Skills.field3850 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			UserComparator6.options_buttons_2Sprite = class172.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			VerticalAlignment.field2083 = class172.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class136.field1615 = Login.options_buttons_0Sprite.subWidth;
			User.field4657 = Login.options_buttons_0Sprite.subHeight;
			class139.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field954 = new String[8];
				Login.field951 = 0;
			}

			class503.field5039 = 0;
			class369.otp = "";
			Login.field956 = true;
			Login.worldSelectOpen = false;
			if (!class449.clientPreferences.method2484()) {
				ArrayList var6 = new ArrayList();
				var6.add(new MusicSong(class385.archive6, "scape main", "", 255, false));
				class53.method1097(var6, 0, 0, 0, 100, false);
			} else {
				Script.method2180(0, 0);
			}

			UrlRequester.method2829();
			CollisionMap.method4177().method6793(false);
			class403.clearLoginScreen = true;
			Login.xPadding = (class113.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class452.loginBoxCenter = Login.loginBoxX + 180;
			Login.leftTitleSprite.drawAt(Login.xPadding, 0);
			Bounds.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			SoundSystem.logoSprite.drawAt(Login.xPadding + 382 - SoundSystem.logoSprite.subWidth / 2, 18);
		}
	}
}
