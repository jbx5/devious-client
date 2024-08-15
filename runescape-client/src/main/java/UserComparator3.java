import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ey")
@Implements("UserComparator3")
public class UserComparator3 extends AbstractUserComparator {
	@ObfuscatedName("oz")
	@ObfuscatedGetter(
		intValue = 336241031
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("ab")
	@Export("reversed")
	final boolean reversed;

	public UserComparator3(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lsc;Lsc;B)I",
		garbageValue = "1"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.world != var1.world) {
			return this.reversed ? var1.world - var2.world : var2.world - var1.world;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-92"
	)
	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 30) {
				Client.field735.method5345();
			}

			if (Client.gameState == 0) {
				DynamicObject.client.method487();
			}

			if (var0 == 20 || var0 == 40 || var0 == 45 || var0 == 50) {
				SoundSystem.updateLoginState(LoginState.SHUTDOWN_PREVIOUS_CONNECTION);
				Client.field543 = 0;
				Client.field542 = 0;
				Client.timer.method8424(var0);
				if (var0 != 20) {
					Client.authenticationScheme = TileItem.clientPreferences.containsKey(Login.Login_username) ? AuthenticationScheme.USERNAME_PASSWORD_REMEMBER : AuthenticationScheme.USERNAME_PASSWORD;
				}
			}

			if (var0 != 20 && var0 != 40 && class91.field1091 != null) {
				class91.field1091.close();
				class91.field1091 = null;
			}

			if (Client.gameState == 25) {
				Client.field704 = 0;
				Client.field573 = 0;
				Client.field574 = 1;
				Client.field575 = 0;
				Client.field785 = 1;
			}

			int var1;
			if (var0 != 5 && var0 != 10) {
				if (var0 == 20) {
					var1 = Client.gameState == 11 ? 4 : 0;
					class161.method3518(ReflectionCheck.archive10, class59.archive8, false, var1);
				} else if (var0 == 11) {
					class161.method3518(ReflectionCheck.archive10, class59.archive8, false, 4);
				} else if (var0 == 50) {
					class130.setLoginResponseString("", "Updating date of birth...", "");
					class161.method3518(ReflectionCheck.archive10, class59.archive8, false, 7);
				} else if (var0 != 0) {
					SecureUrlRequester.method3018();
				}
			} else {
				var1 = ArchiveLoader.method2376() ? 0 : 12;
				class161.method3518(ReflectionCheck.archive10, class59.archive8, true, var1);
			}

			Client.gameState = var0;
		}
	}
}
