import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("av")
class class11 implements TlsAuthentication {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1673014015
	)
	static int field55;
	@ObfuscatedName("fw")
	@Export("worldHost")
	static String worldHost;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lap;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1;
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

			this.this$2.this$1.field61 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1939036674"
	)
	public static boolean method105(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "984354917"
	)
	static final void method106(int var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var8 = 50;
			int var9 = AbstractRasterizer.method4842();
			int var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var8 / Rasterizer3D.get3dZoom();
			int var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var8 / Rasterizer3D.get3dZoom();
			int var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var9 / Rasterizer3D.get3dZoom();
			int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var9 / Rasterizer3D.get3dZoom();
			int var14 = class139.method3136(var11, var8, var1, var0);
			int var15 = var8 * var1 - var0 * var11 >> 16;
			var11 = var14;
			var14 = class139.method3136(var13, var9, var1, var0);
			int var16 = var9 * var1 - var0 * var13 >> 16;
			int var17 = var3 * var10 - var2 * var15 >> 16;
			int var18 = var10 * var2 + var3 * var15 >> 16;
			int var19 = var3 * var12 - var2 * var16 >> 16;
			int var20 = var2 * var12 + var3 * var16 >> 16;
			ViewportMouse.field2947 = (var19 + var17) / 2;
			class349.field3735 = (var11 + var14) / 2;
			UserComparator6.field1529 = (var20 + var18) / 2;
			ViewportMouse.field2944 = (var19 - var17) / 2;
			SpriteMask.field3705 = (var14 - var11) / 2;
			ViewportMouse.field2950 = (var20 - var18) / 2;
			ViewportMouse.field2951 = Math.abs(ViewportMouse.field2944);
			ViewportMouse.field2952 = Math.abs(SpriteMask.field3705);
			ViewportMouse.field2953 = Math.abs(ViewportMouse.field2950);
		}
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1778852185"
	)
	static void method100() {
		if (Client.field627 && class17.localPlayer != null) {
			int var0 = class17.localPlayer.field1229[0];
			int var1 = class17.localPlayer.field1276[0];
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) {
				return;
			}

			class33.field178 = class17.localPlayer.x;
			int var2 = SoundSystem.method856(class358.scene, class17.localPlayer.x, class17.localPlayer.y, class358.scene.field1348) - Client.camFollowHeight;
			if (var2 < TextureProvider.field2830) {
				TextureProvider.field2830 = var2;
			}

			class76.field931 = class17.localPlayer.y;
			Client.field627 = false;
		}

	}
}
