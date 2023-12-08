import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ak")
@Implements("SecureRandomSSLSocketFactory")
public class SecureRandomSSLSocketFactory extends SSLSocketFactory {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lak;"
	)
	@Export("INSTANCE")
	public static SecureRandomSSLSocketFactory INSTANCE;
	@ObfuscatedName("at")
	SecureRandom field68;

	static {
		if (Security.getProvider("BC") == null) {
			Security.addProvider(new BouncyCastleProvider());
		}

	}

	public SecureRandomSSLSocketFactory() {
		this.field68 = new SecureRandom();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;B)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "-15"
	)
	@Export("createSocket")
	SSLSocket createSocket(String var1, TlsClientProtocol var2) {
		return new SecureRandomSSLSocket(this, var2, var1);
	}

	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null;
	}

	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null;
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) {
			var1 = new Socket();
		}

		if (!var1.isConnected()) {
			var1.connect(new InetSocketAddress(var2, var3));
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field68);
		return this.createSocket(var2, var5);
	}

	public String[] getDefaultCipherSuites() {
		return null;
	}
}
