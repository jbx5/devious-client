import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("al")
class class12 extends SSLSocket {
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 301817627
	)
	static int field58;
	@ObfuscatedName("no")
	@ObfuscatedGetter(
		intValue = 457066205
	)
	@Export("menuX")
	static int menuX;
	@ObfuscatedName("ro")
	@ObfuscatedSignature(
		descriptor = "Lgk;"
	)
	@Export("mouseWheel")
	static class174 mouseWheel;
	@ObfuscatedName("au")
	Certificate[] field63;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	final class15 this$0;
	// $FF: synthetic field
	final TlsClientProtocol val$tlsClientProtocol;
	// $FF: synthetic field
	final String val$host;

	@ObfuscatedSignature(
		descriptor = "(Lab;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V"
	)
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public boolean getUseClientMode() {
		return false;
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public void setWantClientAuth(boolean var1) {
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public boolean getWantClientAuth() {
		return false;
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public void setUseClientMode(boolean var1) {
	}

	public SSLSession getSession() {
		return new class17(this);
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "1596734724"
	)
	static int method151(int var0, Script var1, boolean var2) {
		boolean var3 = true;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var4 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
			var3 = false;
		} else {
			var4 = var2 ? GameObject.scriptDotWidget : SceneTilePaint.scriptActiveWidget;
		}

		int var11;
		if (var0 == ScriptOpcodes.CC_SETOP) {
			var11 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] - 1;
			if (var11 >= 0 && var11 <= 9) {
				var4.setAction(var11, Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize]);
				return 1;
			} else {
				--class137.Interpreter_stringStackSize;
				return 1;
			}
		} else {
			int var6;
			if (var0 == ScriptOpcodes.CC_SETDRAGGABLE) {
				SoundCache.Interpreter_intStackSize -= 2;
				var11 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				var4.parent = SoundCache.getWidgetChild(var11, var6);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGGABLEBEHAVIOR) {
				var4.isScrollBar = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADZONE) {
				var4.dragZoneSize = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETDRAGDEADTIME) {
				var4.dragThreshold = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETOPBASE) {
				var4.dataText = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETTARGETVERB) {
				var4.spellActionName = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_CLEAROPS) {
				var4.actions = null;
				return 1;
			} else if (var0 == 1308) {
				var4.prioritizeMenuEntry = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
				return 1;
			} else if (var0 == 1309) {
				--SoundCache.Interpreter_intStackSize;
				return 1;
			} else {
				int var7;
				byte[] var8;
				if (var0 != ScriptOpcodes.CC_SETOPKEY) {
					byte var5;
					if (var0 == ScriptOpcodes.CC_SETOPTKEY) {
						SoundCache.Interpreter_intStackSize -= 2;
						var5 = 10;
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]};
						byte[] var9 = new byte[]{(byte)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]};
						WorldMap.Widget_setKey(var4, var5, var8, var9);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYRATE) {
						SoundCache.Interpreter_intStackSize -= 3;
						var11 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] - 1;
						var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
						var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
						if (var11 >= 0 && var11 <= 9) {
							class126.Widget_setKeyRate(var4, var11, var6, var7);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYRATE) {
						var5 = 10;
						var6 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						class126.Widget_setKeyRate(var4, var5, var6, var7);
						return 1;
					} else if (var0 == ScriptOpcodes.CC_SETOPKEYIGNOREHELD) {
						--SoundCache.Interpreter_intStackSize;
						var11 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize] - 1;
						if (var11 >= 0 && var11 <= 9) {
							ArchiveLoader.Widget_setKeyIgnoreHeld(var4, var11);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == ScriptOpcodes.CC_SETOPTKEYIGNOREHELD) {
						var5 = 10;
						ArchiveLoader.Widget_setKeyIgnoreHeld(var4, var5);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var10 = null;
					var8 = null;
					if (var3) {
						SoundCache.Interpreter_intStackSize -= 10;

						for (var7 = 0; var7 < 10 && Interpreter.Interpreter_intStack[var7 + SoundCache.Interpreter_intStackSize] >= 0; var7 += 2) {
						}

						if (var7 > 0) {
							var10 = new byte[var7 / 2];
							var8 = new byte[var7 / 2];

							for (var7 -= 2; var7 >= 0; var7 -= 2) {
								var10[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + SoundCache.Interpreter_intStackSize];
								var8[var7 / 2] = (byte)Interpreter.Interpreter_intStack[var7 + SoundCache.Interpreter_intStackSize + 1];
							}
						}
					} else {
						SoundCache.Interpreter_intStackSize -= 2;
						var10 = new byte[]{(byte)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]};
						var8 = new byte[]{(byte)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]};
					}

					var7 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize] - 1;
					if (var7 >= 0 && var7 <= 9) {
						WorldMap.Widget_setKey(var4, var7, var10, var8);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
