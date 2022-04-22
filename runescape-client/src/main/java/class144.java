import java.io.IOException;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ew")
public abstract class class144 extends Node {
	@ObfuscatedName("o")
	public static short[][] field1629;

	class144() {
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"23")

	abstract void vmethod3152(Buffer var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lea;I)V", garbageValue = 
	"1764669808")

	abstract void vmethod3153(ClanChannel var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;ZIB)V", garbageValue = 
	"64")

	static void method3080(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (Login.clearLoginScreen) {
			if (var3 == 4) {
				Ignored.method6828(4);
			}

		} else {
			if (var3 == 0) {
				class348.method6505(var2);
			} else {
				Ignored.method6828(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class17.leftTitleSprite = Interpreter.method1889(var4);
			ViewportMouse.rightTitleSprite = class17.leftTitleSprite.mirrorHorizontally();
			class260.method5174(var1, Client.worldProperties);
			Login.titleboxSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			class296.field3496 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class259.field2887 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class93.method2386(var1, "runes", "");
			class92.title_muteSprite = class93.method2386(var1, "title_mute", "");
			WorldMapSection2.options_buttons_0Sprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			class93.field1254 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			class54.options_buttons_2Sprite = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			ParamComposition.field1983 = AbstractSocket.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			AbstractSocket.field4275 = WorldMapSection2.options_buttons_0Sprite.subWidth;
			Occluder.field2687 = WorldMapSection2.options_buttons_0Sprite.subHeight;
			class341.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field904 = new String[8];
				Login.field903 = 0;
			}

			WorldMapID.field2386 = 0;
			HealthBar.otp = "";
			Login.field907 = true;
			Login.worldSelectOpen = false;
			if (!class131.clientPreferences.method2279()) {
				Archive var5 = class16.archive6;
				int var6 = var5.getGroupId("scape main");
				int var7 = var5.getFileId(var6, "");
				NPCComposition.method3530(2, var5, var6, var7, 255, false);
			} else {
				Actor.method2183(2);
			}

			if (NetCache.NetCache_socket != null) {
				try {
					Buffer var11 = new Buffer(4);
					var11.writeByte(3);
					var11.writeMedium(0);
					NetCache.NetCache_socket.write(var11.array, 0, 4);
				} catch (IOException var10) {
					try {
						NetCache.NetCache_socket.close();
					} catch (Exception var9) {
					}

					++NetCache.NetCache_ioExceptions;
					NetCache.NetCache_socket = null;
				}
			}

			Login.clearLoginScreen = true;
			Login.xPadding = (InvDefinition.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			HealthBarDefinition.loginBoxCenter = Login.loginBoxX + 180;
			class17.leftTitleSprite.drawAt(Login.xPadding, 0);
			ViewportMouse.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Decimator.logoSprite.drawAt((Login.xPadding + 382) - (Decimator.logoSprite.subWidth / 2), 18);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IB)I", garbageValue = 
	"-9")

	public static int method3081(int var0) {
		return class400.field4391[var0 & 16383];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = 
	"([BIIB)I", garbageValue = 
	"18")

	public static int method3082(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = (var3 >>> 8) ^ Buffer.crc32Table[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}