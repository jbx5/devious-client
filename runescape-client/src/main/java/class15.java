import net.runelite.mapping.ObfuscatedName;
import java.net.InetSocketAddress;
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import java.net.UnknownHostException;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import net.runelite.mapping.ObfuscatedSignature;
import javax.net.ssl.SSLSocket;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;
import java.net.InetAddress;
@ObfuscatedName("b")
public class class15 extends SSLSocketFactory {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lb;")
	static class15 field90;

	@ObfuscatedName("o")
	SecureRandom field89 = new SecureRandom();

	static {
		if (Security.getProvider("BC") == null) {
			Security.addProvider(new BouncyCastleProvider());
		}
	}

	class15() {
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;I)Ljavax/net/ssl/SSLSocket;", garbageValue = "-1927250052")
	SSLSocket method189(String var1, TlsClientProtocol var2) {
		return new class12(this, var2, var1);
	}

	public String[] getDefaultCipherSuites() {
		return null;
	}

	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}

	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null;
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) {
			var1 = new Socket();
		}
		if (!var1.isConnected()) {
			var1.connect(new InetSocketAddress(var2, var3));
		}
		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field89);
		return this.method189(var2, var5);
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)Lb;", garbageValue = "923664487")
	public static class15 method190() {
		if (field90 == null) {
			field90 = new class15();
		}
		return field90;
	}
}