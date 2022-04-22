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

@ObfuscatedName("t")
class class17 implements SSLSession {
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"Lqi;")

	@Export("leftTitleSprite")
	static SpritePixels leftTitleSprite;
	@ObfuscatedName("r")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;
	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("Widget_fontsArchive")
	static AbstractArchive Widget_fontsArchive;
	@ObfuscatedName("fu")
	@Export("worldHost")
	static String worldHost;
	@ObfuscatedName("no")
	@ObfuscatedGetter(intValue = 
	-2098489797)

	@Export("selectedSpellFlags")
	static int selectedSpellFlags;

	@ObfuscatedSignature(descriptor = 
	"Lw;")

	final class12 this$1;

	@ObfuscatedSignature(descriptor = 
	"(Lw;)V")

	class17(class12 var1) {
		this.this$1 = var1;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public long getCreationTime() {
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

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field62;
	}

	public int getPeerPort() {
		return 0;
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(ILnw;Llx;I)V", garbageValue = 
	"-71140418")

	static void method256(int var0, ArchiveDisk var1, Archive var2) {
		byte[] var3 = null;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			for (ArchiveDiskAction var5 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.last())); var5 != null; var5 = ((ArchiveDiskAction) (ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.previous()))) {
				if (((((long) (var0)) == var5.key) && (var1 == var5.archiveDisk)) && (var5.type == 0)) {
					var3 = var5.data;
					break;
				}
			}
		}

		if (var3 != null) {
			var2.load(var1, var0, var3, true);
		} else {
			byte[] var4 = var1.read(var0);
			var2.load(var1, var0, var4, true);
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(IS)Z", garbageValue = 
	"-20872")

	@Export("isWorldMapEvent")
	public static boolean isWorldMapEvent(int var0) {
		return (((((((var0 == 10) || (var0 == 11)) || (var0 == 12)) || (var0 == 13)) || (var0 == 14)) || (var0 == 15)) || (var0 == 16)) || (var0 == 17);
	}

	@ObfuscatedName("gg")
	@ObfuscatedSignature(descriptor = 
	"(IIIIZI)V", garbageValue = 
	"1219931698")

	@Export("setViewportShape")
	static final void setViewportShape(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var5 = var3 - 334;
		int var6;
		if (var5 < 0) {
			var6 = Client.field760;
		} else if (var5 >= 100) {
			var6 = Client.field761;
		} else {
			var6 = (((Client.field761 - Client.field760) * var5) / 100) + Client.field760;
		}

		int var7 = ((var3 * var6) * 512) / (var2 * 334);
		int var8;
		int var9;
		short var15;
		if (var7 < Client.field766) {
			var15 = Client.field766;
			var6 = ((var15 * var2) * 334) / (var3 * 512);
			if (var6 > Client.field765) {
				var6 = Client.field765;
				var8 = ((var3 * var6) * 512) / (var15 * 334);
				var9 = (var2 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var9, var3, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle((var0 + var2) - var9, var1, var9, var3, -16777216);
				}

				var0 += var9;
				var2 -= var9 * 2;
			}
		} else if (var7 > Client.field666) {
			var15 = Client.field666;
			var6 = ((var15 * var2) * 334) / (var3 * 512);
			if (var6 < Client.field764) {
				var6 = Client.field764;
				var8 = ((var15 * var2) * 334) / (var6 * 512);
				var9 = (var3 - var8) / 2;
				if (var4) {
					Rasterizer2D.Rasterizer2D_resetClip();
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1, var2, var9, -16777216);
					Rasterizer2D.Rasterizer2D_fillRectangle(var0, (var3 + var1) - var9, var2, var9, -16777216);
				}

				var1 += var9;
				var3 -= var9 * 2;
			}
		}

		Client.viewportZoom = (var3 * var6) / 334;
		if ((var2 != Client.viewportWidth) || (var3 != Client.viewportHeight)) {
			int[] var14 = new int[9];

			for (var9 = 0; var9 < var14.length; ++var9) {
				int var10 = ((var9 * 32) + 15) + 128;
				int var11 = (var10 * 3) + 600;
				int var13 = Rasterizer3D.Rasterizer3D_sine[var10];
				int var12 = class13.method164(var11, var3);
				var14[var9] = (var13 * var12) >> 16;
			}

			Scene.Scene_buildVisiblityMap(var14, 500, 800, (var2 * 334) / var3, 334);
		}

		Client.viewportOffsetX = var0;
		Client.viewportOffsetY = var1;
		Client.viewportWidth = var2;
		Client.viewportHeight = var3;
	}
}