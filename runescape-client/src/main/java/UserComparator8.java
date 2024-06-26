import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("er")
@Implements("UserComparator8")
public class UserComparator8 extends AbstractUserComparator {
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator8(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lsh;Lsh;I)I",
		garbageValue = "1919618517"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world) {
			if (var2.world != Client.worldId) {
				return this.reversed ? -1 : 1;
			}
		} else if (var2.world == Client.worldId) {
			return this.reversed ? 1 : -1;
		}

		return this.compareUser(var1, var2);
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "11"
	)
	@Export("updateLoginStatusUsernameRemembered")
	static void updateLoginStatusUsernameRemembered(boolean var0) {
		byte var1 = 0;
		boolean var2 = class105.clientPreferences.getEULA() >= Client.field637;
		if (!var2) {
			var1 = 12;
		} else if (class415.client.containsAccessAndRefreshToken() || class415.client.otlTokenRequesterInitialized() || class415.client.containsSessionAndCharacterId()) {
			var1 = 10;
		}

		class163.updateLoginIndex(var1);
		if (var0) {
			Login.Login_username = "";
			Login.Login_password = "";
			class6.otpMedium = 0;
			class146.otp = "";
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) {
			if (class105.clientPreferences.getRememberedUsername() != null) {
				Login.Login_username = class105.clientPreferences.getRememberedUsername();
				Client.Login_isUsernameRemembered = true;
			} else {
				Client.Login_isUsernameRemembered = false;
			}
		}

		UserComparator4.focusPasswordWhenUsernameFilled();
	}
}
