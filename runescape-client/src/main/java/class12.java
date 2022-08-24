import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import net.runelite.mapping.ObfuscatedName;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import java.io.InputStream;
import java.io.IOException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSession;
import net.runelite.mapping.Export;
@ObfuscatedName("m")
class class12 extends SSLSocket {
	@ObfuscatedName("fp")
	@Export("worldHost")
	static String worldHost;

	@ObfuscatedName("iv")
	@ObfuscatedSignature(descriptor = "Lgy;")
	@Export("scene")
	static Scene scene;

	@ObfuscatedName("s")
	Certificate[] field70;

	@ObfuscatedSignature(descriptor = "Lz;")
	final class15 this$0;

	final TlsClientProtocol val$tlsClientProtocol;

	final String val$host;

	@ObfuscatedSignature(descriptor = "(Lz;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V")
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public boolean getWantClientAuth() {
		return false;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public SSLSession getSession() {
		return new class17(this);
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public boolean getUseClientMode() {
		return false;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public void setUseClientMode(boolean var1) {
	}

	public void setWantClientAuth(boolean var1) {
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "([BIILgy;[Lgl;B)V", garbageValue = "-68")
	static final void method157(byte[] var0, int var1, int var2, Scene var3, CollisionMap[] var4) {
		Buffer var5 = new Buffer(var0);
		int var6 = -1;
		while (true) {
			int var7 = var5.readIncrSmallSmart();
			if (var7 == 0) {
				return;
			}
			var6 += var7;
			int var8 = 0;
			while (true) {
				int var9 = var5.readUShortSmart();
				if (var9 == 0) {
					break;
				}
				var8 += var9 - 1;
				int var10 = var8 & 63;
				int var11 = var8 >> 6 & 63;
				int var12 = var8 >> 12;
				int var13 = var5.readUnsignedByte();
				int var14 = var13 >> 2;
				int var15 = var13 & 3;
				int var16 = var11 + var1;
				int var17 = var10 + var2;
				if (var16 > 0 && var17 > 0 && var16 < 103 && var17 < 103) {
					int var18 = var12;
					if ((Tiles.Tiles_renderFlags[1][var16][var17] & 2) == 2) {
						var18 = var12 - 1;
					}
					CollisionMap var19 = null;
					if (var18 >= 0) {
						var19 = var4[var18];
					}
					class347.addObjects(var12, var16, var17, var6, var15, var14, var3, var19);
				}
			} 
		} 
	}

	@ObfuscatedName("eh")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1182686074")
	@Export("getLoginError")
	static void getLoginError(int var0) {
		int var1 = Login.loginIndex;
		if (var0 == -3) {
			ItemComposition.setLoginResponseString("Connection timed out.", "Please try using a different world.", "");
		} else if (var0 == -2) {
			ItemComposition.setLoginResponseString("Error connecting to server.", "Please try using a different world.", "");
		} else if (var0 == -1) {
			ItemComposition.setLoginResponseString("No response from server.", "Please try using a different world.", "");
		} else if (var0 == 3) {
			class116.method2683(3);
			Login.field875 = 1;
		} else if (var0 == 4) {
			class116.method2683(14);
			Login.Login_banType = 0;
		} else if (var0 == 5) {
			Login.field875 = 2;
			ItemComposition.setLoginResponseString("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
		} else if (var0 != 68 && (Client.onMobile || var0 != 6)) {
			if (var0 == 7) {
				ItemComposition.setLoginResponseString("This world is full.", "Please use a different world.", "");
			} else if (var0 == 8) {
				ItemComposition.setLoginResponseString("Unable to connect.", "Login server offline.", "");
			} else if (var0 == 9) {
				ItemComposition.setLoginResponseString("Login limit exceeded.", "Too many connections from your address.", "");
			} else if (var0 == 10) {
				ItemComposition.setLoginResponseString("Unable to connect.", "Bad session id.", "");
			} else if (var0 == 11) {
				ItemComposition.setLoginResponseString("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
			} else if (var0 == 12) {
				ItemComposition.setLoginResponseString("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
			} else if (var0 == 13) {
				ItemComposition.setLoginResponseString("Could not complete login.", "Please try using a different world.", "");
			} else if (var0 == 14) {
				ItemComposition.setLoginResponseString("The server is being updated.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 16) {
				ItemComposition.setLoginResponseString("Too many login attempts.", "Please wait a few minutes before trying again.", "");
			} else if (var0 == 17) {
				ItemComposition.setLoginResponseString("To access this free world, log into a", "members world and move your character", "to a non-members area.");
			} else if (var0 == 18) {
				class116.method2683(14);
				Login.Login_banType = 1;
			} else if (var0 == 19) {
				ItemComposition.setLoginResponseString("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
			} else if (var0 == 20) {
				ItemComposition.setLoginResponseString("Invalid loginserver requested.", "Please try using a different world.", "");
			} else if (var0 == 22) {
				ItemComposition.setLoginResponseString("Malformed login packet.", "Please try again.", "");
			} else if (var0 == 23) {
				ItemComposition.setLoginResponseString("No reply from loginserver.", "Please wait 1 minute and try again.", "");
			} else if (var0 == 24) {
				ItemComposition.setLoginResponseString("Error loading your profile.", "Please contact customer support.", "");
			} else if (var0 == 25) {
				ItemComposition.setLoginResponseString("Unexpected loginserver response.", "Please try using a different world.", "");
			} else if (var0 == 26) {
				ItemComposition.setLoginResponseString("This computers address has been blocked", "as it was used to break our rules.", "");
			} else if (var0 == 27) {
				ItemComposition.setLoginResponseString("", "Service unavailable.", "");
			} else if (var0 == 31) {
				ItemComposition.setLoginResponseString("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
			} else if (var0 == 32) {
				class116.method2683(14);
				Login.Login_banType = 2;
			} else if (var0 == 37) {
				ItemComposition.setLoginResponseString("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
			} else if (var0 == 38) {
				ItemComposition.setLoginResponseString("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
			} else if (var0 == 55) {
				class116.method2683(8);
			} else {
				if (var0 == 56) {
					ItemComposition.setLoginResponseString("Enter the 6-digit code generated by your", "authenticator app.", "");
					class4.updateGameState(11);
					return;
				}
				if (var0 == 57) {
					ItemComposition.setLoginResponseString("The code you entered was incorrect.", "Please try again.", "");
					class4.updateGameState(11);
					return;
				}
				if (var0 == 61) {
					ItemComposition.setLoginResponseString("", "Please enter your date of birth (DD/MM/YYYY)", "");
					class116.method2683(7);
				} else {
					if (var0 == 62) {
						class4.updateGameState(10);
						class116.method2683(9);
						ItemComposition.setLoginResponseString("Login attempt timed out.", "Please try again.", "");
						return;
					}
					if (var0 == 63) {
						class4.updateGameState(10);
						class116.method2683(9);
						ItemComposition.setLoginResponseString("You were signed out.", "Please sign in again.", "");
						return;
					}
					if (var0 == 65 || var0 == 67) {
						class4.updateGameState(10);
						class116.method2683(9);
						ItemComposition.setLoginResponseString("Failed to login.", "Please try again.", "");
						return;
					}
					if (var0 == 71) {
						class4.updateGameState(10);
						class116.method2683(7);
						ItemComposition.setLoginResponseString("There was a problem updating your DOB.", "Please try again later. If the problem ", "persists, please contact Jagex Support.");
					} else if (var0 == 73) {
						class4.updateGameState(10);
						class116.method2683(6);
						ItemComposition.setLoginResponseString("Your date of birth information is waiting", "to be reviewed by our staff.", "It will be processed shortly.");
					} else if (var0 == 72) {
						class4.updateGameState(10);
						class116.method2683(26);
					} else {
						ItemComposition.setLoginResponseString("Unexpected server response", "Please try using a different world.", "");
					}
				}
			}
		} else {
			ItemComposition.setLoginResponseString("RuneScape has been updated!", "Please reload this page.", "");
		}
		class4.updateGameState(10);
		int var4 = Login.loginIndex;
		boolean var5 = var4 != var1;
		if (!var5 && Client.field512.method7914()) {
			class116.method2683(9);
		}
	}
}