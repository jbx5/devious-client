import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("by")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("gx")
	@Export("accessToken")
	static String accessToken;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -995482501
	)
	@Export("id")
	int id;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -188310631
	)
	@Export("size")
	int size;
	@ObfuscatedName("ag")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("am")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ax")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("aq")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("af")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("at")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1662510551"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			Login.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			Login.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			Login.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			LoginState.updateLoginIndex(3);
			Login.field960 = 1;
		} else if (var0 == 4) {
			LoginState.updateLoginIndex(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field960 = 2;
			Login.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field528) {
				Client.field528 = true;
				class337.method6698();
				return;
			}

			Login.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			Login.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			Login.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			Login.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			Login.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			Login.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			Login.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			Login.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			Login.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			Login.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			Login.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			LoginState.updateLoginIndex(33);
		} else if (var0 == 17) {
			Login.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			LoginState.updateLoginIndex(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			Login.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			Login.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			Login.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			Login.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			Login.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			Login.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			Login.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			Login.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			Login.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			LoginState.updateLoginIndex(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			Login.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			Login.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			Login.setLoginResponseString("This world is running a", "closed beta. Please", "use a different world.");
		} else if (var0 == 55) {
			LoginState.updateLoginIndex(8);
		} else {
			if (var0 == 56) {
				Login.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class464.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				Login.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class464.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				Login.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				LoginState.updateLoginIndex(7);
			} else {
				if (var0 == 62) {
					class464.updateGameState(10);
					LoginState.updateLoginIndex(9);
					Login.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					class464.updateGameState(10);
					LoginState.updateLoginIndex(9);
					Login.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class464.updateGameState(10);
					LoginState.updateLoginIndex(9);
					Login.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					class464.updateGameState(10);
					LoginState.updateLoginIndex(7);
					Login.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class464.updateGameState(10);
					LoginState.updateLoginIndex(6);
					Login.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class464.updateGameState(10);
					LoginState.updateLoginIndex(32);
				} else {
					Login.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		class464.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field558.method10223()) {
			LoginState.updateLoginIndex(9);
		}

	}
}
