import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("di")
public class class93 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1171;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1165;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1166;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1167;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1168;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1177;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1170;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1173;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1172;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1175;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1178;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1164;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1176;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1174;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1180;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1179;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1169;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldi;"
	)
	static final class93 field1181;

	static {
		field1171 = new class93();
		field1165 = new class93();
		field1166 = new class93();
		field1167 = new class93();
		field1168 = new class93();
		field1177 = new class93();
		field1170 = new class93();
		field1173 = new class93();
		field1172 = new class93();
		field1175 = new class93();
		field1178 = new class93();
		field1164 = new class93();
		field1176 = new class93();
		field1174 = new class93();
		field1180 = new class93();
		field1179 = new class93();
		field1169 = new class93();
		field1181 = new class93();
	}

	class93() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;IZI)Lfc;",
		garbageValue = "-1532755804"
	)
	public static class140 method2440(AbstractArchive var0, AbstractArchive var1, int var2, boolean var3) {
		boolean var4 = true;
		byte[] var5 = var0.getFile(var2 >> 16 & 65535, var2 & 65535);
		if (var5 == null) {
			var4 = false;
			return null;
		} else {
			int var6 = (var5[1] & 255) << 8 | var5[2] & 255;
			byte[] var7;
			if (var3) {
				var7 = var1.getFile(0, var6);
			} else {
				var7 = var1.getFile(var6, 0);
			}

			if (var7 == null) {
				var4 = false;
			}

			if (!var4) {
				return null;
			} else {
				if (GrandExchangeOfferUnitPriceComparator.field4467 == null) {
					class520.field5121 = Runtime.getRuntime().availableProcessors();
					GrandExchangeOfferUnitPriceComparator.field4467 = new ThreadPoolExecutor(0, class520.field5121, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(class520.field5121 * 100 + 100), new class137());
				}

				try {
					return new class140(var0, var1, var2, var3);
				} catch (Exception var9) {
					return null;
				}
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(FFFFLfr;B)V",
		garbageValue = "5"
	)
	static void method2443(float var0, float var1, float var2, float var3, class132 var4) {
		float var5 = var1 - var0;
		float var6 = var2 - var1;
		float var7 = var3 - var2;
		float var8 = var6 - var5;
		var4.field1570 = var7 - var6 - var8;
		var4.field1573 = var8 + var8 + var8;
		var4.field1569 = var5 + var5 + var5;
		var4.field1567 = var0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-33"
	)
	static final int method2438() {
		return ViewportMouse.ViewportMouse_y;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "534540991"
	)
	static int method2441(int var0, int var1) {
		for (int var2 = 0; var2 < 8; ++var2) {
			if (var1 <= var0 + 30) {
				return var2;
			}

			var0 += 30;
			var0 += var2 != 1 && var2 != 3 ? 5 : 20;
		}

		return 0;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-884462320"
	)
	static int method2439(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.field724 = (short)Skeleton.method5416(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]);
			if (Client.field724 <= 0) {
				Client.field724 = 256;
			}

			Client.field803 = (short)Skeleton.method5416(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]);
			if (Client.field803 <= 0) {
				Client.field803 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			Interpreter.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			Interpreter.Interpreter_intStackSize -= 4;
			Client.field806 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			if (Client.field806 <= 0) {
				Client.field806 = 1;
			}

			Client.field807 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			if (Client.field807 <= 0) {
				Client.field807 = 32767;
			} else if (Client.field807 < Client.field806) {
				Client.field807 = Client.field806;
			}

			Client.field722 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (Client.field722 <= 0) {
				Client.field722 = 1;
			}

			Client.field809 = (short)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
			if (Client.field809 <= 0) {
				Client.field809 = 32767;
			} else if (Client.field809 < Client.field722) {
				Client.field809 = Client.field722;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class148.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = JagNetThread.method7241(Client.field724);
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = JagNetThread.method7241(Client.field803);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = GameEngine.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = WorldMapArea.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1517887348"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = SoundSystem.method808();
		if (var0 == -3) {
			SecureUrlRequester.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			SecureUrlRequester.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			SecureUrlRequester.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			JagexCache.method4224(3);
			Login.field977 = 1;
		} else if (var0 == 4) {
			class150.method3272(0);
		} else if (var0 == 5) {
			Login.field977 = 2;
			SecureUrlRequester.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later.");
		} else if (var0 == 68) {
			if (!Client.field532) {
				Client.field532 = true;
				class371.method7026();
				return;
			}

			SecureUrlRequester.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (!Client.onMobile && var0 == 6) {
			SecureUrlRequester.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		} else if (var0 == 7) {
			SecureUrlRequester.setLoginResponseString("This world is full.", "Please use a different world.", "");
		} else if (var0 == 8) {
			SecureUrlRequester.setLoginResponseString("Unable to connect.", "Login server offline.", "");
		} else if (var0 == 9) {
			SecureUrlRequester.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
		} else if (var0 == 10) {
			SecureUrlRequester.setLoginResponseString("Unable to connect.", "Bad session id.", "");
		} else if (var0 == 11) {
			SecureUrlRequester.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
		} else if (var0 == 12) {
			SecureUrlRequester.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
		} else if (var0 == 13) {
			SecureUrlRequester.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
		} else if (var0 == 14) {
			SecureUrlRequester.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 16) {
			SecureUrlRequester.setLoginResponseString("Too many login attempts.", "You can use the Jagex Launcher to continue playing.", "Press the button below to download it now.");
			JagexCache.method4224(33);
		} else if (var0 == 17) {
			SecureUrlRequester.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
		} else if (var0 == 18) {
			class150.method3272(1);
		} else if (var0 == 19) {
			SecureUrlRequester.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
		} else if (var0 == 20) {
			SecureUrlRequester.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
		} else if (var0 == 22) {
			SecureUrlRequester.setLoginResponseString("Malformed login packet.", "Please try again.", "");
		} else if (var0 == 23) {
			SecureUrlRequester.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
		} else if (var0 == 24) {
			SecureUrlRequester.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
		} else if (var0 == 25) {
			SecureUrlRequester.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
		} else if (var0 == 26) {
			SecureUrlRequester.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
		} else if (var0 == 27) {
			SecureUrlRequester.setLoginResponseString("", "Service unavailable.", "");
		} else if (var0 == 31) {
			SecureUrlRequester.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
		} else if (var0 == 32) {
			class150.method3272(2);
		} else if (var0 == 37) {
			SecureUrlRequester.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
		} else if (var0 == 38) {
			SecureUrlRequester.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
		} else if (var0 == 74) {
			SecureUrlRequester.setLoginResponseString("This world is running a", "closed beta. Please", "use a different world.");
		} else if (var0 == 55) {
			JagexCache.method4224(8);
		} else {
			if (var0 == 56) {
				SecureUrlRequester.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
				Interpreter.updateGameState(11);
				return;
			}

			if (var0 == 57) {
				SecureUrlRequester.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
				Interpreter.updateGameState(11);
				return;
			}

			if (var0 == 61) {
				SecureUrlRequester.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
				JagexCache.method4224(7);
			} else {
				if (var0 == 62) {
					Interpreter.updateGameState(10);
					JagexCache.method4224(9);
					SecureUrlRequester.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
					return;
				}

				if (var0 == 63) {
					Interpreter.updateGameState(10);
					JagexCache.method4224(9);
					SecureUrlRequester.setLoginResponseString("You were signed out.", "Please sign in again.", "");
					return;
				}

				if (var0 == 65 || var0 == 67) {
					Interpreter.updateGameState(10);
					JagexCache.method4224(9);
					SecureUrlRequester.setLoginResponseString("Failed to login.", "Please try again.", "");
					return;
				}

				if (var0 == 71) {
					Interpreter.updateGameState(10);
					JagexCache.method4224(7);
					SecureUrlRequester.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
				} else if (var0 == 73) {
					Interpreter.updateGameState(10);
					JagexCache.method4224(6);
					SecureUrlRequester.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
				} else if (var0 == 72) {
					Interpreter.updateGameState(10);
					JagexCache.method4224(32);
				} else {
					SecureUrlRequester.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
				}
			}
		}

		Interpreter.updateGameState(10);
		boolean var2 = var1 != SoundSystem.method808();
		if (!var2 && Client.field563.method9755()) {
			JagexCache.method4224(9);
		}

	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "25"
	)
	@Export("setTapToDrop")
	static void setTapToDrop(boolean var0) {
		Client.tapToDrop = var0;
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1456462183"
	)
	static final void method2442(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class316.guestClanChannel;
		if (var2 != null && var1 >= 0 && var1 < var2.method3481()) {
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1);
			if (var3.rank == -1) {
				String var4 = var3.username.getName();
				PacketBufferNode var5 = ViewportMouse.getPacketBufferNode(ClientPacket.field3198, Client.packetWriter.isaacCipher);
				var5.packetBuffer.writeByte(3 + class145.stringCp1252NullTerminatedByteSize(var4));
				var5.packetBuffer.writeByte(var0);
				var5.packetBuffer.writeShort(var1);
				var5.packetBuffer.writeStringCp1252NullTerminated(var4);
				Client.packetWriter.addNode(var5);
			}
		}
	}
}
