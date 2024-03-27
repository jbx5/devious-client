import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
class class17 implements SSLSession {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("EnumDefinition_archive")
	static AbstractArchive EnumDefinition_archive;
	@ObfuscatedName("ec")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field75;
	@ObfuscatedName("kj")
	@ObfuscatedGetter(
		intValue = 1993161155
	)
	@Export("cameraYaw")
	static int cameraYaw;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lai;"
	)
	final SecureRandomSSLSocket this$1;

	@ObfuscatedSignature(
		descriptor = "(Lai;)V"
	)
	class17(SecureRandomSSLSocket var1) {
		this.this$1 = var1;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public int getPeerPort() {
		return 0;
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field57;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;I)I",
		garbageValue = "-831676334"
	)
	static int method254(AbstractArchive var0, AbstractArchive var1) {
		int var2 = 0;
		String[] var3 = Login.field961;

		int var4;
		String var5;
		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var0.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field962;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		var3 = Login.field963;

		for (var4 = 0; var4 < var3.length; ++var4) {
			var5 = var3[var4];
			if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) {
				++var2;
			}
		}

		return var2;
	}
}
