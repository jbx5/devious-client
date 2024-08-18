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
	@ObfuscatedName("ox")
	@ObfuscatedGetter(
		intValue = 1656515977
	)
	static int field1463;
	@ObfuscatedName("ab")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("ay")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("an")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1560107605
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lee;I)V",
		garbageValue = "-1836234627"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)I",
		garbageValue = "-30"
	)
	int method2986(URLConnection var1) {
		int var2 = UrlRequest.field1472;
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;B)V",
		garbageValue = "-15"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lee;I)V",
		garbageValue = "1214448253"
	)
	void method2982(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = GrandExchangeOfferNameComparator.ByteArrayPool_getArrayBool(5000, false);
				byte[] var7 = var6;

				for (int var8 = var3.read(var6); var8 > -1; var8 = var3.read(var7)) {
					byte[] var9 = new byte[var4.length + var8];
					System.arraycopy(var4, 0, var9, 0, var4.length);
					System.arraycopy(var7, 0, var9, var4.length, var8);
					var4 = var9;
				}

				Canvas.ByteArrayPool_release(var7);
			}

			var2.response0 = var4;
		} catch (IOException var15) {
			var2.response0 = null;
		} finally {
			var2.field1470 = this.method2986(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var14) {
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lee;",
		garbageValue = "269465597"
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-377170796"
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
				Script.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(CB)C",
		garbageValue = "-114"
	)
	public static char method3004(char var0) {
		switch(var0) {
		case ' ':
		case '-':
		case '_':
		case ' ':
			return '_';
		case '#':
		case '[':
		case ']':
			return var0;
		case 'À':
		case 'Á':
		case 'Â':
		case 'Ã':
		case 'Ä':
		case 'à':
		case 'á':
		case 'â':
		case 'ã':
		case 'ä':
			return 'a';
		case 'Ç':
		case 'ç':
			return 'c';
		case 'È':
		case 'É':
		case 'Ê':
		case 'Ë':
		case 'è':
		case 'é':
		case 'ê':
		case 'ë':
			return 'e';
		case 'Í':
		case 'Î':
		case 'Ï':
		case 'í':
		case 'î':
		case 'ï':
			return 'i';
		case 'Ñ':
		case 'ñ':
			return 'n';
		case 'Ò':
		case 'Ó':
		case 'Ô':
		case 'Õ':
		case 'Ö':
		case 'ò':
		case 'ó':
		case 'ô':
		case 'õ':
		case 'ö':
			return 'o';
		case 'Ù':
		case 'Ú':
		case 'Û':
		case 'Ü':
		case 'ù':
		case 'ú':
		case 'û':
		case 'ü':
			return 'u';
		case 'ß':
			return 'b';
		case 'ÿ':
		case 'Ÿ':
			return 'y';
		default:
			return Character.toLowerCase(var0);
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1377672590"
	)
	public static void method2983() {
		HealthBarDefinition.HealthBarDefinition_cached.clear();
		HealthBarDefinition.HealthBarDefinition_cachedSprites.clear();
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-962340945"
	)
	static void method3003() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (FloorUnderlayDefinition.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = FloorUnderlayDefinition.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = FloorUnderlayDefinition.widgetDefinition.method6544(var4);
					if (var5 != null) {
						class416.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
