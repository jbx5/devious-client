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
@ObfuscatedName("y")
class class17 implements SSLSession {
	@ObfuscatedName("l")
	static int[][][] field92;

	@ObfuscatedName("cx")
	@ObfuscatedSignature(descriptor = "Lqe;")
	@Export("worldSelectLeftSprite")
	static IndexedSprite worldSelectLeftSprite;

	@ObfuscatedName("eg")
	@ObfuscatedSignature(descriptor = "Lln;")
	static Archive field89;

	@ObfuscatedName("fx")
	@ObfuscatedGetter(intValue = -1132082091)
	static int field91;

	@ObfuscatedSignature(descriptor = "Lm;")
	final class12 this$1;

	@ObfuscatedSignature(descriptor = "(Lm;)V")
	class17(class12 var1) {
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

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field70;
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public int getPeerPort() {
		return 0;
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
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

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(II)Lfv;", garbageValue = "2008817465")
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = ((KitDefinition) (KitDefinition.KitDefinition_cached.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}
			KitDefinition.KitDefinition_cached.put(var1, ((long) (var0)));
			return var1;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "53")
	@Export("hslToRgb")
	static final int hslToRgb(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}
		if (var2 > 192) {
			var1 /= 2;
		}
		if (var2 > 217) {
			var1 /= 2;
		}
		if (var2 > 243) {
			var1 /= 2;
		}
		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}
}