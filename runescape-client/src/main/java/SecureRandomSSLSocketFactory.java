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
import org.bouncycastle.crypto.tls.TlsClientProtocol;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

@ObfuscatedName("an")
@Implements("SecureRandomSSLSocketFactory")
public class SecureRandomSSLSocketFactory extends SSLSocketFactory {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lan;"
	)
	@Export("INSTANCE")
	static SecureRandomSSLSocketFactory INSTANCE;
	@ObfuscatedName("aq")
	SecureRandom field73;

	static {
		if (Security.getProvider("BC") == null) {
			Security.addProvider(new BouncyCastleProvider());
		}

	}

	SecureRandomSSLSocketFactory() {
		this.field73 = new SecureRandom();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Lorg/bouncycastle/crypto/tls/TlsClientProtocol;B)Ljavax/net/ssl/SSLSocket;",
		garbageValue = "-76"
	)
	@Export("createSocket")
	SSLSocket createSocket(String var1, TlsClientProtocol var2) {
		return new SecureRandomSSLSocket(this, var2, var1);
	}

	public String[] getDefaultCipherSuites() {
		return null;
	}

	public Socket createSocket(String var1, int var2) throws IOException, UnknownHostException {
		return null;
	}

	public Socket createSocket(InetAddress var1, int var2) throws IOException {
		return null;
	}

	public Socket createSocket(String var1, int var2, InetAddress var3, int var4) throws IOException, UnknownHostException {
		return null;
	}

	public String[] getSupportedCipherSuites() {
		return null;
	}

	public Socket createSocket(Socket var1, String var2, int var3, boolean var4) throws IOException {
		if (var1 == null) {
			var1 = new Socket();
		}

		if (!var1.isConnected()) {
			var1.connect(new InetSocketAddress(var2, var3));
		}

		TlsClientProtocol var5 = new TlsClientProtocol(var1.getInputStream(), var1.getOutputStream(), this.field73);
		return this.createSocket(var2, var5);
	}

	public Socket createSocket(InetAddress var1, int var2, InetAddress var3, int var4) throws IOException {
		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Lan;",
		garbageValue = "-26245534"
	)
	public static SecureRandomSSLSocketFactory method167() {
		if (INSTANCE == null) {
			INSTANCE = new SecureRandomSSLSocketFactory();
		}

		return INSTANCE;
	}
}
