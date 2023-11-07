import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class149 extends class144 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1032151659
	)
	int field1668;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -872808131
	)
	int field1670;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1260682791
	)
	int field1669;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 601087697
	)
	int field1671;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;)V"
	)
	class149(class147 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "-734756620"
	)
	void vmethod3510(Buffer var1) {
		this.field1668 = var1.readInt();
		this.field1671 = var1.readInt();
		this.field1670 = var1.readUnsignedByte();
		this.field1669 = var1.readUnsignedByte();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfc;I)V",
		garbageValue = "-2111347169"
	)
	void vmethod3506(ClanSettings var1) {
		var1.method3337(this.field1668, this.field1671, this.field1670, this.field1669);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "1206229207"
	)
	public static HitSplatDefinition method3275(int var0) {
		HitSplatDefinition var1 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var0);
			var1 = new HitSplatDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			HitSplatDefinition.HitSplatDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1559513020"
	)
	static int method3270(int var0, Script var1, boolean var2) {
		if (var0 < 1000) {
			return class47.method898(var0, var1, var2);
		} else if (var0 < 1100) {
			return WidgetDefinition.method6300(var0, var1, var2);
		} else if (var0 < 1200) {
			return class357.method6861(var0, var1, var2);
		} else if (var0 < 1300) {
			return class426.method7946(var0, var1, var2);
		} else if (var0 < 1400) {
			return WorldMapRectangle.method4925(var0, var1, var2);
		} else if (var0 < 1500) {
			return class1.method11(var0, var1, var2);
		} else if (var0 < 1600) {
			return ClanChannelMember.method3248(var0, var1, var2);
		} else if (var0 < 1700) {
			return ReflectionCheck.method710(var0, var1, var2);
		} else if (var0 < 1800) {
			return class30.method462(var0, var1, var2);
		} else if (var0 < 1900) {
			return ItemComposition.method4015(var0, var1, var2);
		} else if (var0 < 2000) {
			return UserComparator6.method3019(var0, var1, var2);
		} else if (var0 < 2100) {
			return WidgetDefinition.method6300(var0, var1, var2);
		} else if (var0 < 2200) {
			return class357.method6861(var0, var1, var2);
		} else if (var0 < 2300) {
			return class426.method7946(var0, var1, var2);
		} else if (var0 < 2400) {
			return WorldMapRectangle.method4925(var0, var1, var2);
		} else if (var0 < 2500) {
			return class1.method11(var0, var1, var2);
		} else if (var0 < 2600) {
			return class168.method3514(var0, var1, var2);
		} else if (var0 < 2700) {
			return class60.method1190(var0, var1, var2);
		} else if (var0 < 2800) {
			return FloorOverlayDefinition.method4035(var0, var1, var2);
		} else if (var0 < 2900) {
			return UrlRequester.method2901(var0, var1, var2);
		} else if (var0 < 3000) {
			return UserComparator6.method3019(var0, var1, var2);
		} else if (var0 < 3200) {
			return World.method1899(var0, var1, var2);
		} else if (var0 < 3300) {
			return class159.method3416(var0, var1, var2);
		} else if (var0 < 3400) {
			return class463.method8506(var0, var1, var2);
		} else if (var0 < 3500) {
			return ApproximateRouteStrategy.method1251(var0, var1, var2);
		} else if (var0 < 3600) {
			return RouteStrategy.method4393(var0, var1, var2);
		} else if (var0 < 3700) {
			return class350.method6850(var0, var1, var2);
		} else if (var0 < 3800) {
			return SequenceDefinition.method4096(var0, var1, var2);
		} else if (var0 < 3900) {
			return WorldMapRectangle.method4926(var0, var1, var2);
		} else if (var0 < 4000) {
			return Actor.method2495(var0, var1, var2);
		} else if (var0 < 4100) {
			return class422.method7905(var0, var1, var2);
		} else if (var0 < 4200) {
			return ArchiveDiskAction.method6884(var0, var1, var2);
		} else if (var0 < 4300) {
			return ObjectSound.method1973(var0, var1, var2);
		} else if (var0 < 5100) {
			return class12.method131(var0, var1, var2);
		} else if (var0 < 5400) {
			return class72.method2138(var0, var1, var2);
		} else if (var0 < 5600) {
			return SoundSystem.method869(var0, var1, var2);
		} else if (var0 < 5700) {
			return UserComparator9.method2987(var0, var1, var2);
		} else if (var0 < 6300) {
			return class134.method3148(var0, var1, var2);
		} else if (var0 < 6600) {
			return class138.method3161(var0, var1, var2);
		} else if (var0 < 6700) {
			return SecureRandomCallable.method2324(var0, var1, var2);
		} else if (var0 < 6800) {
			return class344.method6808(var0, var1, var2);
		} else if (var0 < 6900) {
			return class17.method248(var0, var1, var2);
		} else if (var0 < 7000) {
			return VerticalAlignment.method3753(var0, var1, var2);
		} else if (var0 < 7100) {
			return class148.method3265(var0, var1, var2);
		} else if (var0 < 7200) {
			return class158.method3412(var0, var1, var2);
		} else if (var0 < 7300) {
			return ScriptEvent.method2367(var0, var1, var2);
		} else if (var0 < 7500) {
			return class147.method3256(var0, var1, var2);
		} else if (var0 < 7600) {
			return class59.method1184(var0, var1, var2);
		} else if (var0 < 7700) {
			return class12.method142(var0, var1, var2);
		} else {
			return var0 < 8100 ? ModelData0.method5818(var0, var1, var2) : 2;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "379656715"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			class139.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			class139.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			class139.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			UserComparator7.method2966(3);
			Login.field931 = 1;
		} else if (var0 == 4) {
			class129.method3086(0);
		} else if (var0 == 5) {
			Login.field931 = 2;
			class139.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field494) {
				Client.field494 = true;
				ByteArrayPool.method7920();
				return;
			}

			class139.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			class139.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			class139.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			class139.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			class139.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			class139.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			class139.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			class139.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			class139.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			class139.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			class139.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			UserComparator7.method2966(33);
		} else if (var0 == 17) {
			class139.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class129.method3086(1);
		} else if (var0 == 19) {
			class139.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			class139.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			class139.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			class139.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			class139.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			class139.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			class139.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			class139.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			class139.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class129.method3086(2);
		} else if (var0 == 37) {
			class139.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			class139.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 55) {
			UserComparator7.method2966(8);
		} else {
			if (var0 == 56) {
				class139.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				WorldMapSection2.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				class139.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				WorldMapSection2.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				class139.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				UserComparator7.method2966(7);
			} else {
				if (var0 == 62) {
					WorldMapSection2.updateGameState(10);
					UserComparator7.method2966(9);
					class139.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					WorldMapSection2.updateGameState(10);
					UserComparator7.method2966(9);
					class139.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					WorldMapSection2.updateGameState(10);
					UserComparator7.method2966(9);
					class139.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					WorldMapSection2.updateGameState(10);
					UserComparator7.method2966(7);
					class139.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					WorldMapSection2.updateGameState(10);
					UserComparator7.method2966(6);
					class139.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					WorldMapSection2.updateGameState(10);
					UserComparator7.method2966(32);
				} else {
					class139.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		WorldMapSection2.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var1 != var4;
		if (!var5 && Client.field526.method9577()) {
			UserComparator7.method2966(9);
		}

	}
}
