import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class210 extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("field2100")
	public static EvictingDualNodeHashTable field2100;
	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "Lnb;"
	)
	static Widget field2162;

	static {
		field2100 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1512426424"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			WorldMapSection2.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			WorldMapSection2.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			WorldMapSection2.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			ParamComposition.updateLoginIndex(3);
			Login.field949 = 1;
		} else if (var0 == 4) {
			ParamComposition.updateLoginIndex(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field949 = 2;
			WorldMapSection2.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field539) {
				Client.field539 = true;
				HttpResponse.method277();
				return;
			}

			WorldMapSection2.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			WorldMapSection2.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			WorldMapSection2.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			WorldMapSection2.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			WorldMapSection2.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			WorldMapSection2.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			WorldMapSection2.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			WorldMapSection2.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			WorldMapSection2.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			WorldMapSection2.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			WorldMapSection2.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			ParamComposition.updateLoginIndex(33);
		} else if (var0 == 17) {
			WorldMapSection2.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			ParamComposition.updateLoginIndex(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			WorldMapSection2.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			WorldMapSection2.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			WorldMapSection2.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			WorldMapSection2.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			WorldMapSection2.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			WorldMapSection2.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			WorldMapSection2.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			WorldMapSection2.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			WorldMapSection2.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			ParamComposition.updateLoginIndex(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			WorldMapSection2.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			WorldMapSection2.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			WorldMapSection2.setLoginResponseString("This world is running a", "closed beta. Please", "use a different world.");
		} else if (var0 == 55) {
			ParamComposition.updateLoginIndex(8);
		} else {
			if (var0 == 56) {
				WorldMapSection2.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class105.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				WorldMapSection2.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class105.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				WorldMapSection2.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				ParamComposition.updateLoginIndex(7);
			} else {
				if (var0 == 62) {
					class105.updateGameState(10);
					ParamComposition.updateLoginIndex(9);
					WorldMapSection2.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					class105.updateGameState(10);
					ParamComposition.updateLoginIndex(9);
					WorldMapSection2.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class105.updateGameState(10);
					ParamComposition.updateLoginIndex(9);
					WorldMapSection2.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					class105.updateGameState(10);
					ParamComposition.updateLoginIndex(7);
					WorldMapSection2.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class105.updateGameState(10);
					ParamComposition.updateLoginIndex(6);
					WorldMapSection2.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class105.updateGameState(10);
					ParamComposition.updateLoginIndex(32);
				} else {
					WorldMapSection2.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		class105.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var1 != var4;
		if (!var5 && Client.field569.method9939()) {
			ParamComposition.updateLoginIndex(9);
		}

	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "-1339166352"
	)
	static void method4021(WorldView var0) {
		if (Client.combatTargetPlayerIndex >= 0 && var0.players[Client.combatTargetPlayerIndex] != null) {
			class425.addPlayerToScene(var0, Client.combatTargetPlayerIndex, false);
		}

	}
}
