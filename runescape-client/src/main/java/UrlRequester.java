import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("ss")
	@ObfuscatedGetter(
		intValue = 393762944
	)
	static int field1355;
	@ObfuscatedName("c")
	final Thread field1353;
	@ObfuscatedName("p")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("f")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 842284203
	)
	int field1354;

	UrlRequester(int var1) {
		this.requests = new LinkedList(); // L: 16
		this.field1353 = new Thread(this); // L: 20
		this.field1353.setPriority(1); // L: 21
		this.field1353.start(); // L: 22
		this.field1354 = var1; // L: 23
	} // L: 24

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lcm;B)V",
		garbageValue = "-112"
	)
	abstract void vmethod2697(UrlRequest var1) throws IOException;

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "1514770635"
	)
	void method2677(URLConnection var1) {
		var1.setConnectTimeout(5000); // L: 52
		var1.setReadTimeout(5000); // L: 53
		var1.setUseCaches(false); // L: 54
		var1.setRequestProperty("Connection", "close"); // L: 55
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1354); // L: 56
	} // L: 57

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lcm;B)V",
		garbageValue = "54"
	)
	void method2678(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null; // L: 60

		try {
			int var5 = var1.getContentLength(); // L: 63
			var3 = new DataInputStream(var1.getInputStream()); // L: 64
			byte[] var4;
			if (var5 >= 0) { // L: 65
				var4 = new byte[var5]; // L: 66
				var3.readFully(var4); // L: 67
			} else {
				var4 = new byte[0]; // L: 70
				byte[] var6 = TaskHandler.ByteArrayPool_getArray(5000); // L: 71

				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) { // L: 72 73 77
					var8 = new byte[var4.length + var7]; // L: 74
					System.arraycopy(var4, 0, var8, 0, var4.length); // L: 75
					System.arraycopy(var6, 0, var8, var4.length, var7); // L: 76
				}

				class221.ByteArrayPool_release(var6); // L: 79
			}

			var2.response0 = var4; // L: 81
		} catch (IOException var10) { // L: 83
		}

		if (var3 != null) { // L: 84
			try {
				var3.close(); // L: 86
			} catch (IOException var9) { // L: 88
			}
		}

	} // L: 90

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;I)Lcm;",
		garbageValue = "2072850161"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1); // L: 93
		synchronized(this) { // L: 94
			this.requests.add(var2); // L: 95
			this.notify(); // L: 96
			return var2; // L: 98
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "100485034"
	)
	@Export("close")
	public void close() {
		this.isClosed = true; // L: 102

		try {
			synchronized(this) { // L: 104
				this.notify(); // L: 105
			} // L: 106

			this.field1353.join(); // L: 107
		} catch (InterruptedException var4) { // L: 109
		}

	} // L: 110

	public void run() {
		while (!this.isClosed) { // L: 28
			try {
				UrlRequest var1;
				synchronized(this) { // L: 31
					var1 = (UrlRequest)this.requests.poll(); // L: 32
					if (var1 == null) { // L: 33
						try {
							this.wait(); // L: 35
						} catch (InterruptedException var5) { // L: 37
						}
						continue;
					}
				}

				this.vmethod2697(var1); // L: 41
			} catch (Exception var7) { // L: 43
				Clock.RunException_sendStackTrace((String)null, var7); // L: 44
			}
		}

	} // L: 47

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ldi;[F[FB)V",
		garbageValue = "16"
	)
	static void method2679(class118 var0, float[] var1, float[] var2) {
		if (var0 != null) { // L: 223
			float var3 = var1[3] - var1[0]; // L: 226
			if ((double)var3 != 0.0D) { // L: 227
				float var4 = var1[1] - var1[0]; // L: 230
				float var5 = var1[2] - var1[0]; // L: 231
				Float var6 = var4 / var3; // L: 232
				Float var7 = var5 / var3; // L: 233
				var0.field1457 = var6 == 0.33333334F && var7 == 0.6666667F; // L: 234
				float var8 = var6; // L: 235
				float var9 = var7; // L: 236
				if ((double)var6 < 0.0D) { // L: 237
					var6 = 0.0F;
				}

				if ((double)var7 > 1.0D) { // L: 238
					var7 = 1.0F;
				}

				float var15;
				float var16;
				float var18;
				if ((double)var6 > 1.0D || var7 < -1.0F) { // L: 239
					Float var10 = var6; // L: 240
					Float var11 = 1.0F - var7; // L: 243
					if (var6 < 0.0F) { // L: 244
						var10 = 0.0F;
					}

					if (var11 < 0.0F) { // L: 245
						var11 = 0.0F;
					}

					if (var10 > 1.0F || var11 > 1.0F) { // L: 246
						float var12 = (float)((double)(var10 * (var10 - 2.0F + var11)) + (double)var11 * ((double)var11 - 2.0D) + 1.0D); // L: 247
						if (class115.field1423 + var12 > 0.0F) { // L: 248
							Float var14;
							if (var10 + class115.field1423 < 1.3333334F) { // L: 252
								var15 = var10 - 2.0F; // L: 253
								var16 = var10 - 1.0F; // L: 254
								float var17 = (float)Math.sqrt((double)(var15 * var15 - var16 * 4.0F * var16)); // L: 255
								var18 = 0.5F * (var17 + -var15); // L: 256
								if (var11 + class115.field1423 > var18) { // L: 257
									var14 = var18 - class115.field1423; // L: 258
								} else {
									var18 = 0.5F * (-var15 - var17); // L: 261
									if (var11 < var18 + class115.field1423) { // L: 262
										var14 = var18 + class115.field1423; // L: 263
									}
								}
							} else {
								Float var13 = 1.3333334F - class115.field1423; // L: 268
								var14 = 0.33333334F - class115.field1423; // L: 269
							}
						}
					}

					var11 = 1.0F - var11; // L: 274
				}

				if (var6 != var8) { // L: 277
					var1[1] = var1[0] + var6 * var3; // L: 278
					if ((double)var8 != 0.0D) { // L: 279
						var2[1] = var2[0] + (var2[1] - var2[0]) * var6 / var8; // L: 280
					}
				}

				if (var7 != var9) { // L: 283
					var1[2] = var1[0] + var7 * var3; // L: 284
					if ((double)var9 != 1.0D) { // L: 285
						var2[2] = (float)((double)var2[3] - (double)(var2[3] - var2[2]) * (1.0D - (double)var7) / (1.0D - (double)var9)); // L: 286
					}
				}

				var0.field1458 = var1[0]; // L: 289
				var0.field1459 = var1[3]; // L: 290
				float var22 = var6; // L: 291
				float var23 = var7; // L: 292
				float[] var24 = var0.field1460; // L: 293
				float var25 = var22 - 0.0F; // L: 295
				float var26 = var23 - var22; // L: 296
				var15 = 1.0F - var23; // L: 297
				var16 = var26 - var25; // L: 298
				var24[3] = var15 - var26 - var16; // L: 299
				var24[2] = var16 + var16 + var16; // L: 300
				var24[1] = var25 + var25 + var25; // L: 301
				var24[0] = 0.0F; // L: 302
				var25 = var2[0]; // L: 304
				var26 = var2[1]; // L: 305
				var15 = var2[2]; // L: 306
				var16 = var2[3]; // L: 307
				float[] var27 = var0.field1462; // L: 308
				var18 = var26 - var25; // L: 310
				float var19 = var15 - var26; // L: 311
				float var20 = var16 - var15; // L: 312
				float var21 = var19 - var18; // L: 313
				var27[3] = var20 - var19 - var21; // L: 314
				var27[2] = var21 + var21 + var21; // L: 315
				var27[1] = var18 + var18 + var18; // L: 316
				var27[0] = var25; // L: 317
			}
		}
	} // L: 224 228 319
}
