import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("uj")
	@ObfuscatedGetter(
		intValue = -1778066565
	)
	static int field1296;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lph;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lgd;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque();
		this.definition = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-600017305"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null;
		int var6 = 0;

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) {
			++var6;
			if (var7.cycle == var1) {
				var7.set(var1, var2, var3, var4);
				return;
			}

			if (var7.cycle <= var1) {
				var5 = var7;
			}
		}

		if (var5 == null) {
			if (var6 < 4) {
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5);
			if (var6 >= 4) {
				this.updates.last().remove();
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ldo;",
		garbageValue = "1806626844"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last();
		if (var2 != null && var2.cycle <= var1) {
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) {
				var2.remove();
				var2 = var3;
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) {
				return var2;
			} else {
				var2.remove();
				return null;
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1638250969"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7364();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-51"
	)
	static char method2654(char var0) {
		if (var0 == 198) {
			return 'E';
		} else if (var0 == 230) {
			return 'e';
		} else if (var0 == 223) {
			return 's';
		} else if (var0 == 338) {
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000');
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-835116985"
	)
	public static int method2644(CharSequence var0) {
		return KitDefinition.method3666(var0, 10, true);
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "559859122"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			class142.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class142.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class142.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			Actor.method2489(3);
			Login.field916 = 1;
		} else if (var0 == 4) {
			Actor.method2489(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field916 = 2;
			class142.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field544) {
				Client.field544 = true;
				class281.reinitializeClient();
				return;
			}

			class142.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			class142.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			class142.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class142.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class142.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class142.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class142.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class142.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			class142.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class142.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			class142.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			Actor.method2489(33);
		} else if (var0 == 17) {
			class142.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			Actor.method2489(14);
			Login.Login_banType = 1;
		} else if (var0 == 19) {
			class142.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			class142.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class142.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class142.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class142.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class142.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class142.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class142.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class142.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			Actor.method2489(14);
			Login.Login_banType = 2;
		} else if (var0 == 37) {
			class142.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class142.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			Actor.method2489(8);
		} else {
			if (var0 == 56) {
				class142.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				class131.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class142.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				class131.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class142.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				Actor.method2489(7);
			} else {
				if (var0 == 62) {
					class131.updateGameState(10);
					Actor.method2489(9);
					class142.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					class131.updateGameState(10);
					Actor.method2489(9);
					class142.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					class131.updateGameState(10);
					Actor.method2489(9);
					class142.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					class131.updateGameState(10);
					Actor.method2489(7);
					class142.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					class131.updateGameState(10);
					Actor.method2489(6);
					class142.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					class131.updateGameState(10);
					Actor.method2489(32);
				} else {
					class142.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		class131.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var1 != var4;
		if (!var5 && Client.field626.method9672()) {
			Actor.method2489(9);
		}

	}
}
