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
import org.bouncycastle.crypto.tls.TlsClientProtocol;

@ObfuscatedName("c")
class class12 extends SSLSocket {
	@ObfuscatedName("sz")
	@ObfuscatedGetter(intValue = 
	596645521)

	static int field62;
	@ObfuscatedName("kz")
	@ObfuscatedSignature(descriptor = 
	"Lkn;")

	static Widget field64;
	@ObfuscatedName("v")
	Certificate[] field65;

	@ObfuscatedSignature(descriptor = 
	"Ls;")

	final class15 this$0;

	final TlsClientProtocol val$tlsClientProtocol;

	final String val$host;

	@ObfuscatedSignature(descriptor = 
	"(Ls;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;Ljava/lang/String;)V")

	class12(class15 var1, TlsClientProtocol var2, String var3) {
		this.this$0 = var1;
		this.val$tlsClientProtocol = var2;
		this.val$host = var3;
	}

	public OutputStream getOutputStream() throws IOException {
		return this.val$tlsClientProtocol.getOutputStream();
	}

	public void addHandshakeCompletedListener(HandshakeCompletedListener var1) {
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

	public void setWantClientAuth(boolean var1) {
	}

	public boolean getEnableSessionCreation() {
		return false;
	}

	public void setUseClientMode(boolean var1) {
	}

	public void setEnabledProtocols(String[] var1) {
	}

	public void startHandshake() throws IOException {
		this.val$tlsClientProtocol.connect(new class13(this));
	}

	public synchronized void close() throws IOException {
		this.val$tlsClientProtocol.close();
	}

	public void setNeedClientAuth(boolean var1) {
	}

	public void setEnabledCipherSuites(String[] var1) {
	}

	public boolean getNeedClientAuth() {
		return false;
	}

	public InputStream getInputStream() throws IOException {
		return this.val$tlsClientProtocol.getInputStream();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lfd;", garbageValue = 
	"50")

	@Export("getInvDefinition")
	public static InvDefinition getInvDefinition(int var0) {
		InvDefinition var1 = ((InvDefinition) (InvDefinition.InvDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = InvDefinition.InvDefinition_archive.takeFile(5, var0);
			var1 = new InvDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			InvDefinition.InvDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}
}