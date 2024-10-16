import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ea")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("ap")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lsv;Lsv;I)I",
		garbageValue = "-1670941777"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Lmj;",
		garbageValue = "7"
	)
	public static class323[] method3337() {
		return new class323[]{class323.field3422, class323.field3415, class323.field3417, class323.field3424, class323.field3418, class323.field3419, class323.field3427, class323.field3421, class323.field3416, class323.field3423, class323.field3420, class323.field3425, class323.field3426};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "77"
	)
	public static int method3340(int var0) {
		return (var0 & class550.field5408) - 1;
	}

	@ObfuscatedName("gv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2027013533"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field754.method5617();
			}

			if (Client.gameState == 0) {
				Projectile.client.method526();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				class153.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field540 = 0;
				Client.field541 = 0;
				Client.timer.method8792(var0);
				if (var0 != 20) {
					Client.authenticationScheme = TaskHandler.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
				}
			}

			if (var0 != 20 && var0 != 40 && class197.field2063 != null) {
				class197.field2063.close();
				class197.field2063 = null;
			}

			if (Client.gameState == 25) {
				Client.field514 = 0;
				Client.field653 = 0;
				Client.field572 = 1;
				Client.field571 = 0;
				Client.field574 = 1;
			}

			int var2;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var2 = Client.gameState == 11 ? 4 : 0;
					WorldMapElement.method3902(class1.archive10, class450.archive8, class164.field1806, false, var2);
				} else if (var0 == 11) {
					WorldMapElement.method3902(class1.archive10, class450.archive8, class164.field1806, false, 4);
				} else if (var0 == 50) {
					class132.setLoginResponseString("", "Updating date of birth...", "");
					WorldMapElement.method3902(class1.archive10, class450.archive8, class164.field1806, false, 7);
				} else if (var0 != 0 && Login.clearLoginScreen) {
					class230.titleboxSprite = null;
					SoundSystem.titlebuttonSprite = null;
					Login.runesSprite = null;
					IntHashTable.leftTitleSprite = null;
					class544.rightTitleSprite = null;
					TriBool.logoSprite = null;
					DbTableType.title_muteSprite = null;
					class33.options_buttons_0Sprite = null;
					UserList.options_buttons_2Sprite = null;
					TriBool.worldSelectBackSprites = null;
					Login.worldSelectFlagSprites = null;
					class163.worldSelectArrows = null;
					Message.worldSelectStars = null;
					class180.field1897 = null;
					Timer.loginScreenRunesAnimation.method2789();
					class167.method3766(0, 100);
					JagNetThread var1 = class376.field4123;
					var1.method7706(true);
					Login.clearLoginScreen = false;
				}
			} else {
				var2 = PlayerComposition.method6959() ? 0 : 12;
				WorldMapElement.method3902(class1.archive10, class450.archive8, class164.field1806, true, var2);
			}

			Client.gameState = var0;
		}
	}
}
