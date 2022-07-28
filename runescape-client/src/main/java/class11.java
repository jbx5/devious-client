import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
@ObfuscatedName("n")
class class11 implements TlsAuthentication {
	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Lql;")
	@Export("options_buttons_0Sprite")
	static IndexedSprite options_buttons_0Sprite;

	@ObfuscatedName("ii")
	@ObfuscatedSignature(descriptor = "[Lqj;")
	@Export("headIconPkSprites")
	static SpritePixels[] headIconPkSprites;

	@ObfuscatedSignature(descriptor = "Lg;")
	final class13 this$2;

	@ObfuscatedSignature(descriptor = "(Lg;)V")
	class11(class13 var1) {
		this.this$2 = var1;
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();
			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}
			this.this$2.this$1.field64 = ((java.security.cert.Certificate[]) ((java.security.cert.Certificate[]) (var3.toArray(new java.security.cert.Certificate[0]))));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@ObfuscatedName("q")
	static boolean method105(long var0) {
		return Language.method6087(var0) == 2;
	}
}