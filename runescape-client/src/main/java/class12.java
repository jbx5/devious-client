import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("h")
class class12 extends SSLSocket {
	@ObfuscatedName("c")
	Certificate[] field62;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ld;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Ld;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1; // L: 91
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public void setEnabledCipherSuites(String[] var1) {
	} // L: 269

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream(); // L: 96
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream(); // L: 101
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close(); // L: 106
	} // L: 107

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 110

	public boolean getEnableSessionCreation() {
		return false; // L: 114
	}

	public String[] getEnabledCipherSuites() {
		return null; // L: 119
	}

	public String[] getEnabledProtocols() {
		return null; // L: 124
	}

	public boolean getNeedClientAuth() {
		return false; // L: 129
	}

	public SSLSession getSession() {
		return new class17(this); // L: 134
	}

	public boolean getWantClientAuth() {
		return false; // L: 259
	}

	public void setUseClientMode(boolean var1) {
	} // L: 278

	public void setEnabledProtocols(String[] var1) {
	} // L: 272

	public void setNeedClientAuth(boolean var1) {
	} // L: 275

	public void setWantClientAuth(boolean var1) {
	} // L: 281

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this)); // L: 285
	} // L: 335

	public void setEnableSessionCreation(boolean var1) {
	} // L: 266

	public String[] getSupportedProtocols() {
		return null; // L: 244
	}

	public String[] getSupportedCipherSuites() {
		return null; // L: 249
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	} // L: 263

	public boolean getUseClientMode() {
		return false; // L: 254
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;I)V",
		garbageValue = "1963307877"
	)
	public static void method178(AbstractArchive var0) {
		FloorOverlayDefinition.FloorOverlayDefinition_archive = var0; // L: 24
	} // L: 25

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2145461636"
	)
	static void method176() {
		class152.Tiles_underlays = null; // L: 64
		class294.Tiles_overlays = null; // L: 65
		Tiles.Tiles_shapes = null; // L: 66
		Tiles.field1001 = null; // L: 67
		ChatChannel.field996 = null; // L: 68
		SoundCache.field328 = null; // L: 69
		Tiles.field1002 = null; // L: 70
		TextureProvider.Tiles_hue = null; // L: 71
		FontName.Tiles_saturation = null; // L: 72
		class436.Tiles_lightness = null; // L: 73
		class434.Tiles_hueMultiplier = null; // L: 74
		Tiles.field1008 = null; // L: 75
	} // L: 76

	@ObfuscatedName("fd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1208132518"
	)
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = WorldMapIcon_0.method5034(); // L: 2681
		if (var0 == -3) { // L: 2682
			SecureRandomCallable.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) { // L: 2683
			SecureRandomCallable.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) { // L: 2684
			SecureRandomCallable.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) { // L: 2685
			class139.method3101(3); // L: 2686
			Login.field903 = 1; // L: 2687
		} else if (var0 == 4) { // L: 2689
			class139.method3101(14); // L: 2691
			Login.Login_banType = 0; // L: 2692
		} else if (var0 == 5) { // L: 2695
			Login.field903 = 2; // L: 2696
			SecureRandomCallable.setLoginResponseString("Either your account is still logged in, or the last", "world you were using has become unavailable.", "Please try again later."); // L: 2697
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) { // L: 2699
			if (var0 == 7) { // L: 2702
				SecureRandomCallable.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) { // L: 2703
				SecureRandomCallable.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) { // L: 2704
				SecureRandomCallable.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) { // L: 2705
				SecureRandomCallable.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) { // L: 2706
				SecureRandomCallable.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) { // L: 2707
				SecureRandomCallable.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) { // L: 2708
				SecureRandomCallable.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) { // L: 2709
				SecureRandomCallable.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) { // L: 2710
				SecureRandomCallable.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) { // L: 2711
				SecureRandomCallable.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
			} else if (var0 == 18) { // L: 2712
				class139.method3101(14); // L: 2714
				Login.Login_banType = 1; // L: 2715
			} else if (var0 == 19) { // L: 2718
				SecureRandomCallable.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) { // L: 2719
				SecureRandomCallable.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) { // L: 2720
				SecureRandomCallable.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) { // L: 2721
				SecureRandomCallable.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) { // L: 2722
				SecureRandomCallable.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) { // L: 2723
				SecureRandomCallable.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) { // L: 2724
				SecureRandomCallable.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) { // L: 2725
				SecureRandomCallable.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) { // L: 2726
				SecureRandomCallable.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) { // L: 2727
				class139.method3101(14); // L: 2729
				Login.Login_banType = 2; // L: 2730
			} else if (var0 == 37) { // L: 2733
				SecureRandomCallable.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) { // L: 2734
				SecureRandomCallable.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) { // L: 2735
				class139.method3101(8); // L: 2736
			} else {
				if (var0 == 56) { // L: 2738
					SecureRandomCallable.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", ""); // L: 2739
					Coord.updateGameState(11); // L: 2740
					return; // L: 2741
				}

				if (var0 == 57) { // L: 2743
					SecureRandomCallable.setLoginResponseString("The code you entered was incorrect.", "Please try again.", ""); // L: 2744
					Coord.updateGameState(11); // L: 2745
					return; // L: 2746
				}

				if (var0 == 61) { // L: 2748
					SecureRandomCallable.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", ""); // L: 2749
					class139.method3101(7); // L: 2750
				} else {
					if (var0 == 62) { // L: 2752
						Coord.updateGameState(10); // L: 2753
						class139.method3101(9); // L: 2754
						SecureRandomCallable.setLoginResponseString("Login attempt timed out.", "Please try again.", ""); // L: 2755
						return; // L: 2756
					}

					if (var0 == 63) { // L: 2758
						Coord.updateGameState(10); // L: 2759
						class139.method3101(9); // L: 2760
						SecureRandomCallable.setLoginResponseString("You were signed out.", "Please sign in again.", ""); // L: 2761
						return; // L: 2762
					}

					if (var0 == 65 || var0 == 67) { // L: 2764
						Coord.updateGameState(10); // L: 2765
						class139.method3101(9); // L: 2766
						SecureRandomCallable.setLoginResponseString("Failed to login.", "Please try again.", ""); // L: 2767
						return; // L: 2768
					}

					if (var0 == 71) { // L: 2770
						Coord.updateGameState(10); // L: 2771
						class139.method3101(7); // L: 2772
						SecureRandomCallable.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support."); // L: 2773
					} else if (var0 == 73) { // L: 2775
						Coord.updateGameState(10); // L: 2776
						class139.method3101(6); // L: 2777
						SecureRandomCallable.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly."); // L: 2778
					} else if (var0 == 72) { // L: 2780
						Coord.updateGameState(10); // L: 2781
						class139.method3101(26); // L: 2782
					} else {
						SecureRandomCallable.setLoginResponseString("Unexpected server response", "Please try using a different world.", ""); // L: 2784
					}
				}
			}
		} else {
			SecureRandomCallable.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", ""); // L: 2700
		}

		Coord.updateGameState(10); // L: 2785
		boolean var2 = var1 != WorldMapIcon_0.method5034(); // L: 2786
		if (!var2 && Client.field639.method8184()) { // L: 2787
			class139.method3101(9); // L: 2788
		}

	} // L: 2790

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "243834325"
	)
	static void method164(boolean var0) {
		Client.leftClickOpensMenu = var0; // L: 12197
	} // L: 12198
}
