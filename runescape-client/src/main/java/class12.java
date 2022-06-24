import java.security.cert.Certificate;
import javax.net.ssl.HandshakeCompletedListener;
import net.runelite.mapping.ObfuscatedName;
import java.io.OutputStream;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import java.io.InputStream;
import java.io.IOException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSession;
import net.runelite.mapping.Export;
@ObfuscatedName("z")
class class12 extends SSLSocket {
	@ObfuscatedName("sw")
	@ObfuscatedGetter(intValue = 731084091)
	static int field65;

	@ObfuscatedName("lm")
	@ObfuscatedSignature(descriptor = "Lhk;")
	@Export("textureProvider")
	static TextureProvider textureProvider;

	@ObfuscatedName("pw")
	@ObfuscatedSignature(descriptor = "[Lkb;")
	static Widget[] field62;

	@ObfuscatedName("c")
	Certificate[] field63;

	@ObfuscatedSignature(descriptor = "Lk;")
	final class15 this$0;

	final TlsClientProtocol val$tlsClientProtocol;

	final String val$host;

	@ObfuscatedSignature(descriptor = "(Lk;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V")
	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	public void setWantClientAuth(boolean var1) {
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public String[] getEnabledCipherSuites() {
		return null;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public SSLSession getSession() {
		return new class17(this);
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public boolean getUseClientMode() {
		return false;
	}

	public void removeHandshakeCompletedListener(HandshakeCompletedListener var1) {
	}

	public void setEnableSessionCreation(boolean var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public void setUseClientMode(boolean var1) {
	}

	public String[] getEnabledProtocols() {
		return null;
	}

	public String[] getSupportedProtocols() {
		return null;
	}

	public boolean getWantClientAuth() {
		return false;
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public void setEnabledProtocols(String[] var1) {
	}
}