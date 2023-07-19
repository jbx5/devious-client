import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ne")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 498103363
	)
	@Export("canvasWidth")
	public static int canvasWidth;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;I)I",
		garbageValue = "-1467178768"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1454802245"
	)
	public static int method6890(int var0) {
		if (var0 > 0) {
			return 1;
		} else {
			return var0 < 0 ? -1 : 0;
		}
	}

	@ObfuscatedName("hl")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2107301035"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			Actor.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			Actor.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			Actor.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class328.method6115(3);
			Login.field930 = 1;
		} else if (var0 == 4) {
			class328.method6115(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field930 = 2;
			Actor.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field527) {
				Client.field527 = true;
				InterfaceParent.method2277();
				return;
			}

			Actor.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			Actor.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			Actor.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			Actor.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			Actor.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			Actor.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			Actor.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			Actor.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			Actor.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			Actor.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			Actor.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			class328.method6115(33);
		} else if (var0 == 17) {
			Actor.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class328.method6115(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			Actor.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			Actor.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			Actor.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			Actor.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			Actor.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			Actor.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			Actor.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			Actor.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			Actor.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class328.method6115(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			Actor.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			Actor.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			class328.method6115(8);
		} else {
			if (var0 == 56) {
				Actor.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class129.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				Actor.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class129.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				Actor.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class328.method6115(7);
			} else {
				if (var0 == 62) {
					class129.updateGameState(10);
					class328.method6115(9);
					Actor.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					class129.updateGameState(10);
					class328.method6115(9);
					Actor.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class129.updateGameState(10);
					class328.method6115(9);
					Actor.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					class129.updateGameState(10);
					class328.method6115(7);
					Actor.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class129.updateGameState(10);
					class328.method6115(6);
					Actor.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class129.updateGameState(10);
					class328.method6115(32);
				} else {
					Actor.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		class129.updateGameState(10);
		boolean var3 = var1 != class93.method2370();
		if (!var3 && Client.field556.method9394()) {
			class328.method6115(9);
		}

	}

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "8"
	)
	static final void method6892(boolean var0) {
		if (var0) {
			Client.field555 = Login.field943 ? class139.field1628 : class139.field1630;
		} else {
			Client.field555 = class150.clientPreferences.method2540(Login.Login_username) ? class139.field1634 : class139.field1629;
		}

	}
}
