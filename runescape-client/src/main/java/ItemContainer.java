import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("ItemContainer")
public class ItemContainer extends Node {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("itemContainers")
	static NodeHashTable itemContainers;
	@ObfuscatedName("ae")
	@Export("ids")
	int[] ids;
	@ObfuscatedName("ag")
	@Export("quantities")
	int[] quantities;

	static {
		itemContainers = new NodeHashTable(32);
	}

	ItemContainer() {
		this.ids = new int[]{-1};
		this.quantities = new int[]{0};
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "90"
	)
	static int method2497(int var0, int var1) {
		ItemContainer var2 = (ItemContainer)itemContainers.get((long)var0);
		if (var2 == null) {
			return -1;
		} else {
			return var1 >= 0 && var1 < var2.ids.length ? var2.ids[var1] : -1;
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;Lsn;ZIB)V",
		garbageValue = "-20"
	)
	static void method2499(AbstractArchive var0, AbstractArchive var1, GraphicsDefaults var2, boolean var3, int var4) {
		if (Login.clearLoginScreen) {
			if (var4 == 4) {
				LoginState.updateLoginIndex(4);
			}

		} else {
			if (var4 == 0) {
				class150.updateLoginStatusUsernameRemembered(var3);
			} else {
				LoginState.updateLoginIndex(var4);
			}

			Rasterizer2D.Rasterizer2D_clear();
			byte[] var5 = var0.takeFileByNames("title.jpg", "");
			class331.leftTitleSprite = class106.readSpritePixelsFromBytes(var5);
			WorldMapCacheName.rightTitleSprite = class331.leftTitleSprite.mirrorHorizontally();
			HorizontalAlignment.method3960(var1, Client.worldProperties);
			class158.titleboxSprite = Buddy.SpriteBuffer_getIndexedSpriteByName(var1, "titlebox", "");
			Login.titlebuttonSprite = Buddy.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton", "");
			Login.field980 = Buddy.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_large", "");
			Login.field948 = Buddy.SpriteBuffer_getIndexedSpriteByName(var1, "play_now_text", "");
			Buddy.SpriteBuffer_getIndexedSpriteByName(var1, "titlebutton_wide42,1", "");
			Login.runesSprite = class219.getFont(var1, "runes", "");
			AuthenticationScheme.title_muteSprite = class219.getFont(var1, "title_mute", "");
			class174.options_buttons_0Sprite = Buddy.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,0", "");
			GrandExchangeOfferOwnWorldComparator.field486 = Buddy.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,4", "");
			TransformationMatrix.options_buttons_2Sprite = Buddy.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,2", "");
			class7.field20 = Buddy.SpriteBuffer_getIndexedSpriteByName(var1, "options_radio_buttons,6", "");
			class59.field418 = class174.options_buttons_0Sprite.subWidth;
			PacketBufferNode.field3426 = class174.options_buttons_0Sprite.subHeight * -117168624;
			class268.loginScreenRunesAnimation = new LoginScreenAnimation(Login.runesSprite, var2.field5070);
			if (var3) {
				Login.Login_username = "";
				Login.Login_password = "";
				Login.field970 = new String[8];
				Login.field982 = 0;
			}

			class53.otpMedium = 0;
			Language.otp = "";
			Login.rememberUsername = true;
			Login.worldSelectOpen = false;
			if (!class461.clientPreferences.isTitleMusicDisabled()) {
				ArrayList var6 = new ArrayList();
				var6.add(new MusicSong(HorizontalAlignment.archive6, "scape main", "", 255, false));
				class180.method3804(var6, 0, 0, 0, 100, false);
			} else {
				AbstractWorldMapIcon.method6257(0, 0);
			}

			SoundCache.method889();
			JagNetThread var7 = FontName.field5260;
			var7.method7641(false);
			Login.clearLoginScreen = true;
			Login.xPadding = (class154.canvasWidth - 765) / 2;
			Login.loginBoxX = Login.xPadding + 202;
			AbstractByteArrayCopier.loginBoxCenter = Login.loginBoxX + 180;
			class331.leftTitleSprite.drawAt(Login.xPadding, 0);
			WorldMapCacheName.rightTitleSprite.drawAt(Login.xPadding + 382, 0);
			UserComparator8.logoSprite.drawAt(Login.xPadding + 382 - UserComparator8.logoSprite.subWidth / 2, 18);
		}
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIII)V",
		garbageValue = "2004560632"
	)
	static void method2498(ArrayList var0, int var1, int var2, int var3, int var4) {
		if (!var0.isEmpty()) {
			int var5 = (Integer)var0.get(0);
			if (var5 == -1 && !Client.playingJingle) {
				AbstractWorldMapIcon.method6257(0, 0);
			} else if (var5 != -1 && !FloorUnderlayDefinition.method4054(var5) && class461.clientPreferences.getMusicVolume() != 0) {
				ArrayList var6 = new ArrayList();

				for (int var7 = 0; var7 < var0.size(); ++var7) {
					var6.add(new MusicSong(HorizontalAlignment.archive6, (Integer)var0.get(var7), 0, class461.clientPreferences.getMusicVolume(), false));
				}

				if (Client.playingJingle) {
					WorldMapIcon_1.method5778(var6, var1, var2, var3, var4);
				} else {
					class180.method3804(var6, var1, var2, var3, var4, false);
				}
			}

		}
	}
}
