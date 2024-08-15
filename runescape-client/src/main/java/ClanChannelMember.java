import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fl")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = 1389733547
	)
	static int field1685;
	@ObfuscatedName("ab")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1845021349
	)
	@Export("world")
	public int world;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lvf;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("hd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2109061131"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = class255.method5032();
		if (var0 == -3) {
			class130.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class130.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class130.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class532.updateLoginIndex(3);
			Login.field941 = 1;
		} else if (var0 == 4) {
			MouseRecorder.method2427(0);
		} else if (var0 == 5) {
			Login.field941 = 2;
			class130.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field515) {
				Client.field515 = true;
				class273.method5468();
				return;
			}

			class130.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			class130.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			class130.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class130.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class130.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class130.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class130.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class130.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			class130.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class130.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			class130.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			class532.updateLoginIndex(33);
		} else if (var0 == 17) {
			class130.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			MouseRecorder.method2427(1);
		} else if (var0 == 19) {
			class130.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			class130.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class130.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class130.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class130.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class130.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class130.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class130.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class130.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			MouseRecorder.method2427(2);
		} else if (var0 == 37) {
			class130.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class130.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			class130.setLoginResponseString("This world is running a", "closed beta. Please", "use a different world.");
		} else if (var0 == 55) {
			class532.updateLoginIndex(8);
		} else {
			if (var0 == 56) {
				class130.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				UserComparator3.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class130.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				UserComparator3.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class130.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				class532.updateLoginIndex(7);
			} else {
				if (var0 == 62) {
					UserComparator3.updateGameState(10);
					class532.updateLoginIndex(9);
					class130.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					UserComparator3.updateGameState(10);
					class532.updateLoginIndex(9);
					class130.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					UserComparator3.updateGameState(10);
					class532.updateLoginIndex(9);
					class130.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					UserComparator3.updateGameState(10);
					class532.updateLoginIndex(7);
					class130.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					UserComparator3.updateGameState(10);
					class532.updateLoginIndex(6);
					class130.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					UserComparator3.updateGameState(10);
					class532.updateLoginIndex(32);
				} else {
					class130.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		UserComparator3.updateGameState(10);
		boolean var2 = var1 != class255.method5032();
		if (!var2 && Client.field545.method9903()) {
			class532.updateLoginIndex(9);
		}

	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1982015454"
	)
	static final void method3363() {
		if (class132.pcmPlayer1 != null) {
			class132.pcmPlayer1.run();
		}

	}

	@ObfuscatedName("lu")
	@ObfuscatedSignature(
		descriptor = "(Ldy;IIB)V",
		garbageValue = "50"
	)
	static final void method3364(WorldView var0, int var1, int var2) {
		WorldMapSectionType.updateItemPile2(var0, var0.plane, var1, var2);
	}
}
