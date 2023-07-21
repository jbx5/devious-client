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

@ObfuscatedName("ej")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("aw")
	final Thread field1424;
	@ObfuscatedName("ay")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ar")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 639596187
	)
	int field1427;

	UrlRequester(int var1) {
		this.requests = new LinkedList();
		this.field1424 = new Thread(this);
		this.field1424.setPriority(1);
		this.field1424.start();
		this.field1427 = var1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lei;I)V",
		garbageValue = "-1617729938"
	)
	abstract void vmethod2826(UrlRequest var1) throws IOException;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "956100868"
	)
	int method2805(URLConnection var1) {
		int var2 = UrlRequest.field1441;
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "396426494"
	)
	void method2806(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1427);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lei;I)V",
		garbageValue = "-1316938585"
	)
	void method2807(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = SpriteMask.ByteArrayPool_getArray(5000);

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
					var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
				}

				GrandExchangeOfferUnitPriceComparator.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var14) {
			var2.response0 = null;
		} finally {
			var2.field1437 = this.method2805(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var13) {
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lei;",
		garbageValue = "1908448074"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "29176"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.field1424.join();
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

				this.vmethod2826(var1);
			} catch (Exception var7) {
				class317.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)[Lrr;",
		garbageValue = "55"
	)
	static class454[] method2824() {
		return new class454[]{class454.field4766, class454.field4761, class454.field4763, class454.field4762};
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "975652572"
	)
	static final void method2823(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0);
		var0 = 100 - var0;
		float var1 = 0.5F + (float)var0 / 200.0F;
		Rasterizer3D.method4405((double)var1);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness((double)var1);
		HealthBar.method2579();
		class150.clientPreferences.method2475((double)var1);
	}
}
