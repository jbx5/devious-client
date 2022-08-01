import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import org.json.JSONException;
import net.runelite.mapping.Implements;
import java.io.IOException;
import org.json.JSONArray;
import java.io.DataInputStream;
import java.net.URLConnection;
import java.net.URL;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import org.json.JSONObject;
import java.util.Queue;
import net.runelite.mapping.Export;
@ObfuscatedName("cc")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("o")
	final Thread field1345 = new Thread(this);

	@ObfuscatedName("q")
	@Export("isClosed")
	volatile boolean isClosed;

	@ObfuscatedName("f")
	@Export("requests")
	Queue requests = new LinkedList();

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 877694689)
	int field1342;

	UrlRequester(int var1) {
		this.field1345.setPriority(1);
		this.field1345.start();
		this.field1342 = var1;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lcb;B)V", garbageValue = "35")
	abstract void vmethod2629(UrlRequest var1) throws IOException;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;I)V", garbageValue = "1250753273")
	void method2602(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1342);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Lcb;B)V", garbageValue = "65")
	void method2603(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = class17.ByteArrayPool_getArray(5000);
				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
					var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
				}
				StudioGame.ByteArrayPool_release(var6);
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Ljava/net/URL;I)Lcb;", garbageValue = "-1581137343")
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1359380152")
	@Export("close")
	public void close() {
		this.isClosed = true;
		try {
			synchronized(this) {
				this.notify();
			}
			this.field1345.join();
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
				this.vmethod2629(var1);
			} catch (Exception var7) {
				class359.RunException_sendStackTrace(((String) (null)), var7);
			}
		} 
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)Ljava/lang/String;", garbageValue = "-1859481438")
	static String method2619(int var0) {
		return "<img=" + var0 + ">";
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lorg/json/JSONObject;Ljava/lang/String;I)[F", garbageValue = "-2042908579")
	static float[] method2614(JSONObject var0, String var1) throws JSONException {
		float[] var2 = new float[4];
		try {
			JSONArray var3 = var0.getJSONArray(var1);
			var2[0] = ((float) (var3.optDouble(0, 0.0)));
			var2[1] = ((float) (var3.optDouble(1, 0.0)));
			var2[2] = ((float) (var3.optDouble(2, 1.0)));
			var2[3] = ((float) (var3.optDouble(3, 1.0)));
		} catch (JSONException var4) {
			var2[0] = 0.0F;
			var2[1] = 0.0F;
			var2[2] = 1.0F;
			var2[3] = 1.0F;
		}
		return var2;
	}

	@ObfuscatedName("iy")
	@ObfuscatedSignature(descriptor = "(Lck;I)V", garbageValue = "1694192029")
	static final void method2621(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = Decimator.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}
		if (var0.type == 1) {
			var1 = Decimator.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}
		if (var0.type == 2) {
			var1 = Decimator.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}
		if (var0.type == 3) {
			var1 = Decimator.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}
		if (var1 != 0L) {
			int var6 = Decimator.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = class141.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = var6 >> 6 & 3;
		}
		var0.objectId = var3;
		var0.field1120 = var4;
		var0.field1122 = var5;
	}
}