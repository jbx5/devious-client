import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ex")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field1491;
	@ObfuscatedName("ap")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("aw")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ak")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1512141121
	)
	@Export("clientRevision")
	int clientRevision;

	UrlRequester(int var1) {
		this.requests = new LinkedList();
		this.requestThread = new Thread(this);
		this.requestThread.setPriority(1);
		this.requestThread.start();
		this.clientRevision = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)V",
		garbageValue = "1770877701"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "-18096714"
	)
	int method3225(URLConnection var1) {
		int var2 = UrlRequest.field1497;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}

		return var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "65"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lei;B)V",
		garbageValue = "-98"
	)
	void method3210(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null;

		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4);
			} else {
				var4 = new byte[0];
				byte[] var6 = FadeOutTask.ByteArrayPool_getArrayBool(5000, false);
				byte[] var7 = var6;

				for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
					byte[] var9 = new byte[var4.length + var8];
					System.arraycopy(var4, 0, var9, 0, var4.length);
					System.arraycopy(var7, 0, var9, var4.length, var8);
					var4 = var9;
				}

				ArchiveDiskAction.ByteArrayPool_release(var7);
			}

			var2.response0 = var4;
		} catch (IOException var15) {
			var2.response0 = null;
		} finally {
			var2.field1496 = this.method3225(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var14) {
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;S)Lei;",
		garbageValue = "326"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.requestThread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.openConnection(var1);
			} catch (Exception var7) {
				HttpHeaders.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;III)[Lvv;",
		garbageValue = "806885260"
	)
	public static SpritePixels[] method3231(AbstractArchive var0, int var1, int var2) {
		if (!class53.method1110(var0, var1, var2)) {
			return null;
		} else {
			SpritePixels[] var4 = new SpritePixels[SpriteBufferProperties.SpriteBuffer_spriteCount];

			for (int var5 = 0; var5 < SpriteBufferProperties.SpriteBuffer_spriteCount; ++var5) {
				SpritePixels var6 = var4[var5] = new SpritePixels();
				var6.width = SpriteBufferProperties.SpriteBuffer_spriteWidth;
				var6.height = SpriteBufferProperties.SpriteBuffer_spriteHeight;
				var6.xOffset = SpriteBufferProperties.SpriteBuffer_xOffsets[var5];
				var6.yOffset = class497.SpriteBuffer_yOffsets[var5];
				var6.subWidth = class7.SpriteBuffer_spriteWidths[var5];
				var6.subHeight = SpriteBufferProperties.SpriteBuffer_spriteHeights[var5];
				int var7 = var6.subHeight * var6.subWidth;
				byte[] var8 = class280.SpriteBuffer_pixels[var5];
				var6.pixels = new int[var7];

				for (int var9 = 0; var9 < var7; ++var9) {
					var6.pixels[var9] = SpriteBufferProperties.SpriteBuffer_spritePalette[var8[var9] & 255];
				}
			}

			SpriteBufferProperties.SpriteBuffer_xOffsets = null;
			class497.SpriteBuffer_yOffsets = null;
			class7.SpriteBuffer_spriteWidths = null;
			SpriteBufferProperties.SpriteBuffer_spriteHeights = null;
			SpriteBufferProperties.SpriteBuffer_spritePalette = null;
			class280.SpriteBuffer_pixels = null;
			return var4;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Las;",
		garbageValue = "1"
	)
	public static class6[] method3230() {
		return new class6[]{class6.field11};
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1839611801"
	)
	public static int method3229(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-55"
	)
	static final void method3224(int var0, int var1, int var2, int var3) {
		if (!ViewportMouse.ViewportMouse_false0) {
			byte var8 = 50;
			int var9 = AbstractRasterizer.method4952();
			int var10 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var8 / Rasterizer3D.get3dZoom();
			int var11 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var8 / Rasterizer3D.get3dZoom();
			int var12 = (ViewportMouse.ViewportMouse_x - Rasterizer3D.getClipMidX()) * var9 / Rasterizer3D.get3dZoom();
			int var13 = (ViewportMouse.ViewportMouse_y - Rasterizer3D.getClipMidY()) * var9 / Rasterizer3D.get3dZoom();
			int var14 = class166.method3759(var11, var8, var1, var0);
			int var15 = var1 * var8 - var0 * var11 >> 16;
			var11 = var14;
			var14 = class166.method3759(var13, var9, var1, var0);
			int var16 = var1 * var9 - var13 * var0 >> 16;
			int var17 = var3 * var10 - var2 * var15 >> 16;
			int var18 = var10 * var2 + var3 * var15 >> 16;
			int var19 = var12 * var3 - var16 * var2 >> 16;
			int var20 = var16 * var3 + var12 * var2 >> 16;
			ViewportMouse.field2892 = (var19 + var17) / 2;
			ViewportMouse.field2898 = (var14 + var11) / 2;
			ViewportMouse.field2890 = (var20 + var18) / 2;
			ViewportMouse.field2894 = (var19 - var17) / 2;
			FaceNormal.field2750 = (var14 - var11) / 2;
			class425.field4765 = (var20 - var18) / 2;
			ViewportMouse.field2896 = Math.abs(ViewportMouse.field2894);
			class177.field1883 = Math.abs(FaceNormal.field2750);
			FontName.field5315 = Math.abs(class425.field4765);
			ViewportMouse.field2897.method8200((float)(var19 - var17), (float)(var14 - var11), (float)(var20 - var18));
			ViewportMouse.field2897.method8172();
			ViewportMouse.ViewportMouse_false0 = true;
		}
	}
}
