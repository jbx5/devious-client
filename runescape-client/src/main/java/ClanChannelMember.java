import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("aq")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1991639177
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lvo;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "34"
	)
	public static void method3280() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "113"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field740.method4349();
			}

			if (Client.gameState == 0) {
				class415.client.method595();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class28.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field539 = 0;
				Client.field560 = 0;
				Client.timer.method8334(var0);
				if (var0 != 20) {
					class213.setAuthenticationScheme(false);
				}
			}

			if (var0 != 20 && var0 != 40 && class386.field4521 != null) {
				class386.field4521.close();
				class386.field4521 = null;
			}

			if (Client.gameState == 25) {
				Client.field575 = 0;
				Client.field778 = 0;
				Client.field755 = 1;
				Client.field573 = 0;
				Client.field534 = 1;
			}

			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					int var3 = Client.gameState == 11 ? 4 : 0;
					LoginScreenAnimation.method2563(WorldMapSection1.archive10, class7.archive8, false, var3);
				} else if (var0 == 11) {
					LoginScreenAnimation.method2563(WorldMapSection1.archive10, class7.archive8, false, 4);
				} else if (var0 == 50) {
					VerticalAlignment.setLoginResponseString("", "Updating date of birth...", "");
					LoginScreenAnimation.method2563(WorldMapSection1.archive10, class7.archive8, false, 7);
				} else if (var0 != 0 && Login.clearLoginScreen) {
					class486.titleboxSprite = null;
					Fonts.titlebuttonSprite = null;
					class261.runesSprite = null;
					Login.leftTitleSprite = null;
					class189.rightTitleSprite = null;
					ArchiveDiskActionHandler.logoSprite = null;
					class428.title_muteSprite = null;
					class141.options_buttons_0Sprite = null;
					Login.options_buttons_2Sprite = null;
					class562.worldSelectBackSprites = null;
					class105.worldSelectFlagSprites = null;
					class76.worldSelectArrows = null;
					GrandExchangeOfferUnitPriceComparator.worldSelectStars = null;
					Messages.field1449 = null;
					class91.loginScreenRunesAnimation.method2566();
					class137.method3187(0, 100);
					class147.method3269().method7271(true);
					Login.clearLoginScreen = false;
				}
			} else {
				boolean var1 = class105.clientPreferences.getEULA() >= Client.field637;
				int var2 = var1 ? 0 : 12;
				LoginScreenAnimation.method2563(WorldMapSection1.archive10, class7.archive8, true, var2);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
	)
	static void method3281() {
		for (class230 var0 = (class230)Client.field717.last(); var0 != null; var0 = (class230)Client.field717.previous()) {
			var0.remove();
		}

	}
}
