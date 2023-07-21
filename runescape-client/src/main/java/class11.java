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

@ObfuscatedName("at")
class class11 implements TlsAuthentication {
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Luu;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("gq")
	@ObfuscatedGetter(
		intValue = 2026827067
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("gb")
	static String field65;
	@ObfuscatedName("sj")
	@ObfuscatedSignature(
		descriptor = "Lfx;"
	)
	@Export("guestClanSettings")
	static ClanSettings guestClanSettings;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
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

			this.this$2.this$1.field67 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1328974540"
	)
	static final void method105() {
		if (!ViewportMouse.ViewportMouse_false0) {
			int var0 = Scene.Scene_cameraPitchSine;
			int var1 = Scene.Scene_cameraPitchCosine;
			int var2 = Scene.Scene_cameraYawSine;
			int var3 = Scene.Scene_cameraYawCosine;
			byte var4 = 50;
			short var5 = 3500;
			int var6 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var4 / Rasterizer3D.get3dZoom();
			int var7 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var4 / Rasterizer3D.get3dZoom();
			int var8 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var5 / Rasterizer3D.get3dZoom();
			int var9 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var5 / Rasterizer3D.get3dZoom();
			int var11 = var7 * var1 + var0 * var4 >> 16;
			int var12 = var4 * var1 - var7 * var0 >> 16;
			int var13 = var1 * var9 + var5 * var0 >> 16;
			int var14 = var5 * var1 - var9 * var0 >> 16;
			int var15 = var6 * var3 - var2 * var12 >> 16;
			int var16 = var2 * var6 + var3 * var12 >> 16;
			int var17 = var8 * var3 - var14 * var2 >> 16;
			int var18 = var14 * var3 + var8 * var2 >> 16;
			ViewportMouse.field2754 = (var15 + var17) / 2;
			ViewportMouse.field2755 = (var13 + var11) / 2;
			class151.field1693 = (var18 + var16) / 2;
			class538.field5228 = (var17 - var15) / 2;
			ViewportMouse.field2756 = (var13 - var11) / 2;
			class133.field1593 = (var18 - var16) / 2;
			class90.field1109 = Math.abs(class538.field5228);
			class136.field1606 = Math.abs(ViewportMouse.field2756);
			class387.field4437 = Math.abs(class133.field1593);
		}
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldz;I)V",
		garbageValue = "-423842521"
	)
	static final void method112(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = UserComparator5.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = UserComparator5.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = UserComparator5.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = UserComparator5.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var1 != 0L) {
			int var6 = UserComparator5.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = class458.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}

		var0.objectId = var3;
		var0.field1169 = var4;
		var0.field1168 = var5;
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "47"
	)
	static void method113(int var0) {
		SequenceDefinition var1 = class135.SequenceDefinition_get(var0);
		if (var1.isCachedModelIdSet()) {
			if (class273.method5525(var1.SequenceDefinition_cachedModelId) == 2) {
				Client.field654.add(var1.SequenceDefinition_cachedModelId);
			}

		}
	}
}
