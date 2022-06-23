import java.security.cert.Certificate;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import javax.net.ssl.SSLPeerUnverifiedException;
import net.runelite.mapping.ObfuscatedGetter;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;
import java.security.Principal;
import net.runelite.mapping.Export;
@ObfuscatedName("x")
class class17 implements SSLSession {
	@ObfuscatedName("x")
	@Export("ByteArrayPool_altSizeArrayCounts")
	public static int[] ByteArrayPool_altSizeArrayCounts;

	@ObfuscatedName("bt")
	@ObfuscatedGetter(intValue = 1069442965)
	static int field99;

	@ObfuscatedSignature(descriptor = "Lz;")
	final class12 this$1;

	@ObfuscatedSignature(descriptor = "(Lz;)V")
	class17(class12 var1) {
		this.this$1 = var1;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field63;
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public int getPeerPort() {
		return 0;
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "1793849187")
	public static int method232(int var0, int var1, int var2) {
		int var3 = VarpDefinition.method3374(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "113")
	@Export("Widget_resetModelFrames")
	static final void Widget_resetModelFrames(int var0) {
		if (WorldMapSection2.loadInterface(var0)) {
			Widget[] var1 = SoundCache.Widget_interfaceComponents[var0];
			for (int var2 = 0; var2 < var1.length; ++var2) {
				Widget var3 = var1[var2];
				if (var3 != null) {
					var3.modelFrame = 0;
					var3.modelFrameCycle = 0;
				}
			}
		}
	}
}