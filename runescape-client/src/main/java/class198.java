import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class198 {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("archive9")
	static Archive archive9;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2044605112"
	)
	public static void method3737() {
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear();
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear();
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "64"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			AbstractWorldMapIcon.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			AbstractWorldMapIcon.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			AbstractWorldMapIcon.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			GameEngine.setLoginIndex(3);
			Login.field938 = 1;
		} else if (var0 == 4) {
			class27.method393(0);
		} else if (var0 == 5) {
			Login.field938 = 2;
			AbstractWorldMapIcon.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field615) {
				Client.field615 = true;
				class140.method3120();
				return;
			}

			AbstractWorldMapIcon.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			AbstractWorldMapIcon.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			AbstractWorldMapIcon.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			AbstractWorldMapIcon.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			AbstractWorldMapIcon.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			AbstractWorldMapIcon.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			AbstractWorldMapIcon.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			AbstractWorldMapIcon.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			AbstractWorldMapIcon.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			AbstractWorldMapIcon.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			AbstractWorldMapIcon.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			GameEngine.setLoginIndex(33);
		} else if (var0 == 17) {
			AbstractWorldMapIcon.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class27.method393(1);
		} else if (var0 == 19) {
			AbstractWorldMapIcon.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			AbstractWorldMapIcon.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			AbstractWorldMapIcon.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			AbstractWorldMapIcon.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			AbstractWorldMapIcon.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			AbstractWorldMapIcon.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			AbstractWorldMapIcon.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			AbstractWorldMapIcon.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			AbstractWorldMapIcon.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class27.method393(2);
		} else if (var0 == 37) {
			AbstractWorldMapIcon.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			AbstractWorldMapIcon.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			GameEngine.setLoginIndex(8);
		} else {
			if (var0 == 56) {
				AbstractWorldMapIcon.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				DefaultsGroup.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				AbstractWorldMapIcon.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				DefaultsGroup.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				AbstractWorldMapIcon.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				GameEngine.setLoginIndex(7);
			} else {
				if (var0 == 62) {
					DefaultsGroup.updateGameState(10);
					GameEngine.setLoginIndex(9);
					AbstractWorldMapIcon.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					DefaultsGroup.updateGameState(10);
					GameEngine.setLoginIndex(9);
					AbstractWorldMapIcon.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					DefaultsGroup.updateGameState(10);
					GameEngine.setLoginIndex(9);
					AbstractWorldMapIcon.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					DefaultsGroup.updateGameState(10);
					GameEngine.setLoginIndex(7);
					AbstractWorldMapIcon.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					DefaultsGroup.updateGameState(10);
					GameEngine.setLoginIndex(6);
					AbstractWorldMapIcon.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					DefaultsGroup.updateGameState(10);
					GameEngine.setLoginIndex(32);
				} else {
					AbstractWorldMapIcon.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		DefaultsGroup.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field559.method9506()) {
			GameEngine.setLoginIndex(9);
		}

	}

	@ObfuscatedName("nv")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1161000418"
	)
	static final void method3736(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class91.clientPreferences.method2518(var0);
	}
}
