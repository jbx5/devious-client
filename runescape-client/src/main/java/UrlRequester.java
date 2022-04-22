import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ck")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("v")
	@Export("thread")
	final Thread thread;
	@ObfuscatedName("c")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("i")
	@Export("requests")
	Queue requests;

	UrlRequester() {
		this.requests = new LinkedList();
		this.thread = new Thread(this);
		this.thread.setPriority(1);
		this.thread.start();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lcw;I)V", garbageValue = 
	"1977687936")

	abstract void vmethod2546(UrlRequest var1) throws IOException;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/net/URLConnection;B)V", garbageValue = 
	"28")

	void method2517(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/net/URLConnection;Lcw;B)V", garbageValue = 
	"4")

	void method2518(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = ArchiveDiskActionHandler.ByteArrayPool_getArray(5000);

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > (-1); var4 = var8) {
					var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
				}

				UserComparator10.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var10) {
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var9) {
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/net/URL;B)Lcw;", garbageValue = 
	"30")

	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"73")

	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.thread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = ((UrlRequest) (this.requests.poll()));
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.vmethod2546(var1);
			} catch (Exception var7) {
				Widget.RunException_sendStackTrace(((String) (null)), var7);
			}
		} 

	}

	@ObfuscatedName("ik")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"-1814729991")

	static final void method2537(int var0, int var1) {
		if (((Client.menuOptionsCount >= 2) || (Client.isItemSelected != 0)) || Client.isSpellSelected) {
			if (Client.showMouseOverText) {
				int var2 = GameBuild.method5773();
				String var3;
				if ((Client.isItemSelected == 1) && (Client.menuOptionsCount < 2)) {
					var3 = ((("Use" + " ") + Client.selectedItemName) + " ") + "->";
				} else if (Client.isSpellSelected && (Client.menuOptionsCount < 2)) {
					var3 = (((Client.selectedSpellActionName + " ") + Client.selectedSpellName) + " ") + "->";
				} else {
					var3 = AbstractUserComparator.method6736(var2);
				}

				if (Client.menuOptionsCount > 2) {
					var3 = (((((var3 + UserComparator9.colorStartTag(16777215)) + " ") + '/') + " ") + (Client.menuOptionsCount - 2)) + " more options";
				}

				RouteStrategy.fontBold12.drawRandomAlphaAndSpacing(var3, var0 + 4, var1 + 15, 16777215, 0, Client.cycle / 1000);
			}
		}
	}
}