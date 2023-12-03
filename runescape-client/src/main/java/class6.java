import java.awt.FontMetrics;
import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public enum class6 implements Enum
{
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	field16(0, 0);

	@ObfuscatedName("wa")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("bl")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;
	@ObfuscatedName("km")
	@ObfuscatedGetter(
		intValue = 223509121
	)
	static int field14;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1498234591
	)
	final int field11;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1418543363
	)
	final int field12;

	class6(int var3, int var4) {
		this.field11 = var3;
		this.field12 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-11"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field12;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;ZII)V",
		garbageValue = "-1391050872"
	)
	static void method44(AbstractArchive var0, AbstractArchive var1, boolean var2, int var3) {
		if (class384.clearLoginScreen) {
			if (var3 == 4) {
				UserComparator7.method2966(4);
			}

		} else {
			if (var3 == 0) {
				ClientPreferences.method2645(var2);
			} else {
				UserComparator7.method2966(var3);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var4 = var0.takeFileByNames("title.jpg", "");
			class250.leftTitleSprite = WorldMapArchiveLoader.method8710(var4);
			Login.rightTitleSprite = class250.leftTitleSprite.mirrorHorizontally();
			MenuAction.method2140(var1, Client.worldProperties);
			Login.titleboxSprite = class313.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = class313.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field898 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			class11.field47 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			class313.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			class134.runesSprite = Skills.method6857(var1, "runes", "");
			Login.title_muteSprite = Skills.method6857(var1, "title_mute", "");
			class310.options_buttons_0Sprite = class313.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			Login.field902 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			FriendsList.options_buttons_2Sprite = class313.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			GrandExchangeEvents.field4344 = class313.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			NPCComposition.field1966 = class310.options_buttons_0Sprite.subWidth;
			class113.field1426 = class310.options_buttons_0Sprite.subHeight;
			EnumComposition.loginScreenRunesAnimation = new LoginScreenAnimation(class134.runesSprite);
			if (var2) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field907 = new String[8];
				Login.field915 = 0;
			}

			class53.otpMedium = 0;
			NpcOverrides.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!WorldMapIcon_1.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var5 = new ArrayList();
				var5.add(new MusicSong(class514.archive6, "scape main", "", 255, false));
				PendingSpawn.method2459(var5, 0, 0, 0, 100, false);
			} else {
				WorldMapRenderer.method4769(0, 0);
			}

			HttpContentType.method8564();
			class157.method3396().method7045(false);
			class384.clearLoginScreen = true;
			Login.xPadding = (Language.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			class157.loginBoxCenter = Login.loginBoxX + 180;
			class250.leftTitleSprite.drawAt(Login.xPadding, 0);
			Login.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			Login.logoSprite.drawAt(Login.xPadding + 382 - Login.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIIIZI)Luz;",
		garbageValue = "-328465387"
	)
	@Export("getItemSprite")
	public static final SpritePixels getItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (var1 == -1) {
			var4 = 0;
		} else if (var4 == 2 && var1 != 1) {
			var4 = 1;
		}

		long var6 = ((long)var4 << 40) + (long)var0 + ((long)var1 << 16) + ((long)var2 << 38) + ((long)var3 << 42);
		SpritePixels var8;
		if (!var5) {
			var8 = (SpritePixels)ItemComposition.ItemDefinition_cachedSprites.get(var6);
			if (var8 != null) {
				return var8;
			}
		}

		ItemComposition var9 = class214.ItemDefinition_get(var0);
		if (var1 > 1 && var9.countobj != null) {
			int var10 = -1;

			for (int var11 = 0; var11 < 10; ++var11) {
				if (var1 >= var9.countco[var11] && var9.countco[var11] != 0) {
					var10 = var9.countobj[var11];
				}
			}

			if (var10 != -1) {
				var9 = class214.ItemDefinition_get(var10);
			}
		}

		Model var22 = var9.getModel(1);
		if (var22 == null) {
			return null;
		} else {
			SpritePixels var23 = null;
			if (var9.noteTemplate != -1) {
				var23 = getItemSprite(var9.note, 10, 1, 0, 0, true);
				if (var23 == null) {
					return null;
				}
			} else if (var9.notedId != -1) {
				var23 = getItemSprite(var9.unnotedId, var1, var2, var3, 0, false);
				if (var23 == null) {
					return null;
				}
			} else if (var9.placeholderTemplate != -1) {
				var23 = getItemSprite(var9.placeholder, var1, 0, 0, 0, false);
				if (var23 == null) {
					return null;
				}
			}

			int[] var12 = Rasterizer2D.Rasterizer2D_pixels;
			int var13 = Rasterizer2D.Rasterizer2D_width;
			int var14 = Rasterizer2D.Rasterizer2D_height;
			float[] var15 = Rasterizer2D.field5209;
			int[] var16 = new int[4];
			Rasterizer2D.Rasterizer2D_getClipArray(var16);
			var8 = new SpritePixels(36, 32);
			Rasterizer3D.method5263(var8.pixels, 36, 32, (float[])null);
			Rasterizer2D.Rasterizer2D_clear();
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.method5206(16, 16);
			Rasterizer3D.clips.rasterGouraudLowRes = false;
			if (var9.placeholderTemplate != -1) {
				var23.drawTransBgAt(0, 0);
			}

			int var17 = var9.zoom2d;
			if (var5) {
				var17 = (int)(1.5D * (double)var17);
			} else if (var2 == 2) {
				var17 = (int)((double)var17 * 1.04D);
			}

			int var18 = var17 * Rasterizer3D.Rasterizer3D_sine[var9.xan2d] >> 16;
			int var19 = var17 * Rasterizer3D.Rasterizer3D_cosine[var9.xan2d] >> 16;
			var22.calculateBoundsCylinder();
			var22.drawFrustum(0, var9.yan2d, var9.zan2d, var9.xan2d, var9.offsetX2d, var22.height / 2 + var18 + var9.offsetY2d, var19 + var9.offsetY2d);
			if (var9.notedId != -1) {
				var23.drawTransBgAt(0, 0);
			}

			if (var2 >= 1) {
				var8.outline(1);
			}

			if (var2 >= 2) {
				var8.outline(16777215);
			}

			if (var3 != 0) {
				var8.shadow(var3);
			}

			Rasterizer3D.method5263(var8.pixels, 36, 32, (float[])null);
			if (var9.noteTemplate != -1) {
				var23.drawTransBgAt(0, 0);
			}

			if (var4 == 1 || var4 == 2 && var9.isStackable == 1) {
				Font var20 = TaskHandler.ItemDefinition_fontPlain11;
				String var21;
				if (var1 < 100000) {
					var21 = "<col=ffff00>" + var1 + "</col>";
				} else if (var1 < 10000000) {
					var21 = "<col=ffffff>" + var1 / 1000 + "K" + "</col>";
				} else {
					var21 = "<col=00ff80>" + var1 / 1000000 + "M" + "</col>";
				}

				var20.draw(var21, 0, 9, 16776960, 1);
			}

			if (!var5) {
				ItemComposition.ItemDefinition_cachedSprites.put(var8, var6);
			}

			Rasterizer3D.method5263(var12, var13, var14, var15);
			Rasterizer2D.Rasterizer2D_setClipArray(var16);
			Rasterizer3D.resetRasterClipping();
			Rasterizer3D.clips.rasterGouraudLowRes = true;
			return var8;
		}
	}
}
