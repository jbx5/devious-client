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
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("x")
class class12 extends SSLSocket {
	@ObfuscatedName("cp")
	@ObfuscatedSignature(descriptor = "[Lqj;")
	@Export("worldSelectBackSprites")
	static SpritePixels[] worldSelectBackSprites;

	@ObfuscatedName("cz")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;

	@ObfuscatedName("o")
	Certificate[] field64;

	@ObfuscatedSignature(descriptor = "Lb;")
	final class15 this$0;

	final TlsClientProtocol val$tlsClientProtocol;

	final String val$host;

	@ObfuscatedSignature(descriptor = "(Lb;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V")
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public boolean getNeedClientAuth() {
		return false;
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

	public boolean getWantClientAuth() {
		return false;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public void setUseClientMode(boolean var1) {
	}

	public void setWantClientAuth(boolean var1) {
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public SSLSession getSession() {
		return new class17(this);
	}

	public void setEnabledProtocols(String[] var1) {
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "110")
	static int method141(int var0, Script var1, boolean var2) {
		Widget var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = BoundaryObject.Widget_unpackTargetMask(class67.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.dataText;
				}
				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
			}
			return 1;
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2091367691")
	@Export("playPcmPlayers")
	static final void playPcmPlayers() {
		if (SequenceDefinition.pcmPlayer1 != null) {
			SequenceDefinition.pcmPlayer1.run();
		}
		if (class192.pcmPlayer0 != null) {
			class192.pcmPlayer0.run();
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1124248487")
	public static boolean method161() {
		return Client.clickedWidget != null;
	}
}