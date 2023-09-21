import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("aa")
class class11 implements TlsAuthentication {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lre;"
	)
	static AbstractSocket field59;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lay;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lay;)V"
	)
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

			this.this$2.this$1.field63 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CLoa;I)I",
		garbageValue = "832566677"
	)
	@Export("lowercaseChar")
	static int lowercaseChar(char var0, Language var1) {
		int var2 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var2 = (var0 << 4) + 1;
		}

		if (var0 == 241 && var1 == Language.Language_ES) {
			var2 = 1762;
		}

		return var2;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "610139414"
	)
	static void method112() {
		Players.Players_count = 0;

		for (int var0 = 0; var0 < 2048; ++var0) {
			Players.field1373[var0] = null;
			Players.field1370[var0] = class231.field2428;
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljn;IIIII)Z",
		garbageValue = "-916093529"
	)
	static final boolean method111(Model var0, int var1, int var2, int var3, int var4) {
		if (!GrandExchangeOfferTotalQuantityComparator.method7050()) {
			return false;
		} else {
			TextureProvider.method4886();
			AABB var5 = (AABB)var0.aabb.get(var1);
			int var6 = var2 + var5.xMid;
			int var7 = var3 + var5.yMid;
			int var8 = var4 + var5.zMid;
			int var9 = var5.xMidOffset;
			int var10 = var5.yMidOffset;
			int var11 = var5.zMidOffset;
			int var12 = ViewportMouse.field2808 - var6;
			int var13 = ViewportMouse.field2807 - var7;
			int var14 = class286.field3074 - var8;
			if (Math.abs(var12) > var9 + class190.field1914) {
				return false;
			} else if (Math.abs(var13) > var10 + GraphicsObject.field890) {
				return false;
			} else if (Math.abs(var14) > var11 + HealthBar.field1312) {
				return false;
			} else if (Math.abs(var14 * ViewportMouse.field2802 - var13 * ViewportMouse.field2809) > var11 * GraphicsObject.field890 + var10 * HealthBar.field1312) {
				return false;
			} else if (Math.abs(var12 * ViewportMouse.field2809 - var14 * class180.field1865) > var11 * class190.field1914 + var9 * HealthBar.field1312) {
				return false;
			} else {
				return Math.abs(var13 * class180.field1865 - var12 * ViewportMouse.field2802) <= var9 * GraphicsObject.field890 + var10 * class190.field1914;
			}
		}
	}
}
