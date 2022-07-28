import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("ip")
public class class240 {
	@ObfuscatedName("gm")
	@ObfuscatedSignature(descriptor = "Lnj;")
	static AbstractSocket field2847;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)[Lkf;", garbageValue = "736917026")
	static GameBuild[] method4992() {
		return new GameBuild[]{ GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.LIVE, GameBuild.WIP };
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Llc;Llc;ZII)V", garbageValue = "945865856")
	static void method4988(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				UserComparator6.method2701(4);
			}
		} else {
			if (var3 == 0) {
				WorldMapID.method4981(var2);
			} else {
				UserComparator6.method2701(var3);
			}
			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			SpriteMask.leftTitleSprite = class147.method3105(var4);
			class356.rightTitleSprite = SpriteMask.leftTitleSprite.mirrorHorizontally();
			MilliClock.method3293(var1, Client.worldProperties);
			class7.titleboxSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			class229.titlebuttonSprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			class342.field4165 = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			Login.field896 = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class342.method6304(var1, "runes", "");
			Login.title_muteSprite = class342.method6304(var1, "title_mute", "");
			class11.options_buttons_0Sprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class329.field4111 = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			Login.options_buttons_2Sprite = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			SoundSystem.field321 = BufferedNetSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			WorldMapCacheName.field2862 = class11.options_buttons_0Sprite.subWidth;
			HealthBarDefinition.field1864 = class11.options_buttons_0Sprite.subHeight;
			RouteStrategy.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field901 = new String[8];
				Login.field912 = 0;
			}
			class260.field2908 = 0;
			Login.otp = "";
			Login.field893 = true;
			Login.worldSelectOpen = false;
			if (!class260.clientPreferences.method2316()) {
				Archive var5 = MouseHandler.archive6;
				int var6 = var5.getGroupId("scape main");
				int var7 = var5.getFileId(var6, "");
				class273.musicPlayerStatus = 1;
				class149.musicTrackArchive = var5;
				class273.musicTrackGroupId = var6;
				UserComparator6.musicTrackFileId = var7;
				class273.musicTrackVolume = 255;
				class347.musicTrackBoolean = false;
				FaceNormal.pcmSampleLength = 2;
			} else {
				class273.musicPlayerStatus = 1;
				class149.musicTrackArchive = null;
				class273.musicTrackGroupId = -1;
				UserComparator6.musicTrackFileId = -1;
				class273.musicTrackVolume = 0;
				class347.musicTrackBoolean = false;
				FaceNormal.pcmSampleLength = 2;
			}
			StructComposition.method3597(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (class352.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			Login.loginBoxCenter = Login.loginBoxX + 180;
			SpriteMask.leftTitleSprite.drawAt(Login.xPadding, 0);
			class356.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Canvas.logoSprite.drawAt(Login.xPadding + 382 - Canvas.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)V", garbageValue = "1983581438")
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (class13.friendsChat != null) {
			PacketBufferNode var1 = class433.getPacketBufferNode(ClientPacket.CLAN_KICKUSER, Client.packetWriter.isaacCipher);
			var1.packetBuffer.writeByte(class92.stringCp1252NullTerminatedByteSize(var0));
			var1.packetBuffer.writeStringCp1252NullTerminated(var0);
			Client.packetWriter.addNode(var1);
		}
	}

	@ObfuscatedName("ld")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "98")
	static void method4994(int var0) {
		Client.oculusOrbState = var0;
	}
}