import java.net.URL;
import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.io.DataInputStream;
import java.net.URLConnection;
import java.util.Queue;
import net.runelite.mapping.Export;
@ObfuscatedName("cd")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("vw")
	@ObfuscatedSignature(descriptor = "Lll;")
	public static class325 field1362;

	@ObfuscatedName("c")
	final Thread field1363;

	@ObfuscatedName("v")
	@Export("isClosed")
	volatile boolean isClosed;

	@ObfuscatedName("q")
	@Export("requests")
	Queue requests;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = -1046925001)
	int field1360;

	UrlRequester(int var1) {
		this.requests = new LinkedList();
		this.field1363 = new Thread(this);
		this.field1363.setPriority(1);
		this.field1363.start();
		this.field1360 = var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lct;I)V", garbageValue = "1538294108")
	abstract void vmethod2537(UrlRequest var1) throws IOException;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;I)V", garbageValue = "123786888")
	void method2520(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1360);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Lct;I)V", garbageValue = "2137871662")
	void method2522(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = class292.ByteArrayPool_getArray(5000);
				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
					var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
				}
				class93.ByteArrayPool_release(var6);
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
	@ObfuscatedSignature(descriptor = "(Ljava/net/URL;I)Lct;", garbageValue = "-682839730")
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "90163766")
	@Export("close")
	public void close() {
		this.isClosed = true;
		try {
			synchronized(this) {
				this.notify();
			}
			this.field1363.join();
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
				this.vmethod2537(var1);
			} catch (Exception var7) {
				class249.RunException_sendStackTrace(((String) (null)), var7);
			}
		} 
	}

	@ObfuscatedName("gr")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "64")
	static final void method2536() {
		int[] var0 = Players.Players_indices;
		int var1;
		for (var1 = 0; var1 < Players.Players_count; ++var1) {
			Player var4 = Client.players[var0[var1]];
			if (var4 != null && var4.overheadTextCyclesRemaining > 0) {
				--var4.overheadTextCyclesRemaining;
				if (var4.overheadTextCyclesRemaining == 0) {
					var4.overheadText = null;
				}
			}
		}
		for (var1 = 0; var1 < Client.npcCount; ++var1) {
			int var2 = Client.npcIndices[var1];
			NPC var3 = Client.npcs[var2];
			if (var3 != null && var3.overheadTextCyclesRemaining > 0) {
				--var3.overheadTextCyclesRemaining;
				if (var3.overheadTextCyclesRemaining == 0) {
					var3.overheadText = null;
				}
			}
		}
	}
}