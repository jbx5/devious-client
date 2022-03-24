import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class150 extends class128 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(longValue = 
	-7750632583538685477L)

	long field1680;
	@ObfuscatedName("o")
	String field1679;

	@ObfuscatedSignature(descriptor = 
	"Lee;")

	final class131 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Lee;)V")

	class150(class131 var1) {
		this.this$0 = var1;
		this.field1680 = -1L;
		this.field1679 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;B)V", garbageValue = 
	"-73")

	void vmethod3107(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1680 = var1.readLong();
		}

		this.field1679 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Leh;I)V", garbageValue = 
	"-1228032820")

	void vmethod3104(ClanSettings var1) {
		var1.method2912(this.field1680, this.field1679);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"1682779053")

	public static int method3091(int var0) {
		return PcmPlayer.method771(ViewportMouse.ViewportMouse_entityTags[var0]);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = 
	"1443556885")

	static void method3092(String var0, String var1, String var2) {
		method3089(7);
		GrandExchangeEvent.setLoginResponseString(var0, var1, var2);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(IS)V", garbageValue = 
	"16213")

	static void method3089(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}

	@ObfuscatedName("fo")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"-101")

	@Export("getLoginError")
	static void getLoginError(int var0) {
		if (var0 == (-3)) {
			GrandExchangeEvent.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == (-2)) {
			GrandExchangeEvent.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == (-1)) {
			GrandExchangeEvent.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			method3089(3);
			Login.field897 = 1;
		} else if (var0 == 4) {
			class128.method2841(0);
		} else if (var0 == 5) {
			Login.field897 = 2;
			GrandExchangeEvent.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if ((var0 != 68) && (Client.onMobile || (var0 != 6))) {
			if (var0 == 7) {
				GrandExchangeEvent.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) {
				GrandExchangeEvent.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) {
				GrandExchangeEvent.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) {
				GrandExchangeEvent.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) {
				GrandExchangeEvent.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) {
				GrandExchangeEvent.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) {
				GrandExchangeEvent.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) {
				GrandExchangeEvent.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) {
				GrandExchangeEvent.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) {
				GrandExchangeEvent.setLoginResponseString("You are standing in a members-only area.", "To play on this world move to a free area first", "");
			} else if (var0 == 18) {
				class128.method2841(1);
			} else if (var0 == 19) {
				GrandExchangeEvent.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) {
				GrandExchangeEvent.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) {
				GrandExchangeEvent.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) {
				GrandExchangeEvent.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) {
				GrandExchangeEvent.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) {
				GrandExchangeEvent.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				GrandExchangeEvent.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				GrandExchangeEvent.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				GrandExchangeEvent.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				GrandExchangeEvent.setLoginResponseString("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
			} else if (var0 == 37) {
				GrandExchangeEvent.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) {
				GrandExchangeEvent.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) {
				method3089(8);
			} else {
				if (var0 == 56) {
					GrandExchangeEvent.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
					InterfaceParent.updateGameState(11);
					return;
				}

				if (var0 == 57) {
					GrandExchangeEvent.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
					InterfaceParent.updateGameState(11);
					return;
				}

				if (var0 == 61) {
					GrandExchangeEvent.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
					method3089(7);
				} else {
					if (var0 == 62) {
						InterfaceParent.updateGameState(10);
						method3089(9);
						GrandExchangeEvent.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
						return;
					}

					if (var0 == 63) {
						InterfaceParent.updateGameState(10);
						method3089(9);
						GrandExchangeEvent.setLoginResponseString("You were signed out.", "Please sign in again.", "");
						return;
					}

					if ((var0 == 65) || (var0 == 67)) {
						InterfaceParent.updateGameState(10);
						method3089(9);
						GrandExchangeEvent.setLoginResponseString("Failed to login.", "Please try again.", "");
						return;
					}

					if (var0 == 71) {
						InterfaceParent.updateGameState(10);
						method3089(7);
						GrandExchangeEvent.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
					} else {
						GrandExchangeEvent.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
					}
				}
			}
		} else {
			GrandExchangeEvent.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		}

		InterfaceParent.updateGameState(10);
		if (Client.field517.method8013()) {
			method3089(9);
		}

	}
}