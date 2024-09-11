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

@ObfuscatedName("en")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 608173899
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("ac")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("ae")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("ag")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 570697283
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lek;I)V",
		garbageValue = "2145007281"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "-1837690890"
	)
	int method3132(URLConnection var1) {
		int var2 = UrlRequest.field1503;
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "1861818621"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lek;I)V",
		garbageValue = "-108104768"
	)
	void method3134(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = GrandExchangeOfferWorldComparator.method7690(5000);

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
					var4 = var8;
				}

				class93.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var14) {
			var2.response0 = null;
		} finally {
			var2.field1504 = this.method3132(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var13) {
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lek;",
		garbageValue = "-1377908475"
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "31"
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
				class171.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("kp")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1110995275"
	)
	static int method3141(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}
}
