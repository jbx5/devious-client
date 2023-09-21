import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class115 extends UrlRequester {
	@ObfuscatedName("ao")
	final boolean field1441;

	public class115(boolean var1, int var2) {
		super(var2);
		this.field1441 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)V",
		garbageValue = "1796222901"
	)
	void vmethod2859(UrlRequest var1) throws IOException {
		URLConnection var2 = null;
		boolean var9 = false;

		label129: {
			HttpURLConnection var12;
			label130: {
				try {
					var9 = true;
					String var3 = var1.field1444.getProtocol();
					if (var3.equals("http")) {
						var2 = this.method2850(var1);
					} else {
						if (!var3.equals("https")) {
							var1.field1445 = UrlRequest.field1446;
							var9 = false;
							break label129;
						}

						var2 = this.method2849(var1);
					}

					this.method2840(var2, var1);
					var9 = false;
					break label130;
				} catch (IOException var10) {
					var1.field1445 = UrlRequest.field1446;
					var9 = false;
				} finally {
					if (var9) {
						if (var2 != null && var2 instanceof HttpURLConnection) {
							HttpURLConnection var6 = (HttpURLConnection)var2;
							var6.disconnect();
						}

					}
				}

				if (var2 != null && var2 instanceof HttpURLConnection) {
					var12 = (HttpURLConnection)var2;
					var12.disconnect();
				}

				return;
			}

			if (var2 != null && var2 instanceof HttpURLConnection) {
				var12 = (HttpURLConnection)var2;
				var12.disconnect();
			}

			return;
		}

		if (var2 != null && var2 instanceof HttpURLConnection) {
			HttpURLConnection var4 = (HttpURLConnection)var2;
			var4.disconnect();
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)Ljava/net/URLConnection;",
		garbageValue = "-188799571"
	)
	URLConnection method2850(UrlRequest var1) throws IOException {
		URLConnection var2 = var1.field1444.openConnection();
		this.method2847(var2);
		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Leq;I)Ljava/net/URLConnection;",
		garbageValue = "-1796104931"
	)
	URLConnection method2849(UrlRequest var1) throws IOException {
		HttpsURLConnection var2 = (HttpsURLConnection)var1.field1444.openConnection();
		if (!this.field1441) {
			if (class15.field82 == null) {
				class15.field82 = new class15();
			}

			class15 var4 = class15.field82;
			var2.setSSLSocketFactory(var4);
		}

		this.method2847(var2);
		return var2;
	}

	@ObfuscatedName("js")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-57"
	)
	@Export("getTileHeight")
	static final int getTileHeight(int var0, int var1, int var2) {
		int var3 = var0 >> 7;
		int var4 = var1 >> 7;
		if (var3 >= 0 && var4 >= 0 && var3 <= 103 && var4 <= 103) {
			int var5 = var2;
			if (var2 < 3 && (Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
				var5 = var2 + 1;
			}

			int var6 = var0 & 127;
			int var7 = var1 & 127;
			int var8 = Tiles.Tiles_heights[var5][var3 + 1][var4] * var6 + (128 - var6) * Tiles.Tiles_heights[var5][var3][var4] >> 7;
			int var9 = Tiles.Tiles_heights[var5][var3 + 1][var4 + 1] * var6 + Tiles.Tiles_heights[var5][var3][var4 + 1] * (128 - var6) >> 7;
			return var7 * var9 + var8 * (128 - var7) >> 7;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIB)V",
		garbageValue = "-12"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != class87.Client_plane) {
				return;
			}

			long var8 = 0L;
			boolean var10 = true;
			boolean var11 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var8 = class10.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var8 = class10.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var8 = class10.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var8 = class10.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var13;
			if (var8 != 0L) {
				var13 = class10.scene.getObjectFlags(var0, var2, var3, var8);
				int var15 = SecureRandomFuture.Entity_unpackID(var8);
				int var16 = var13 & 31;
				int var17 = var13 >> 6 & 3;
				ObjectComposition var14;
				if (var1 == 0) {
					class10.scene.removeBoundaryObject(var0, var2, var3);
					var14 = class91.getObjectDefinition(var15);
					if (var14.interactType != 0) {
						Client.collisionMaps[var0].method4334(var2, var3, var16, var17, var14.boolean1);
					}
				}

				if (var1 == 1) {
					class10.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					class10.scene.removeGameObject(var0, var2, var3);
					var14 = class91.getObjectDefinition(var15);
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) {
						return;
					}

					if (var14.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var17, var14.boolean1);
					}
				}

				if (var1 == 3) {
					class10.scene.removeFloorDecoration(var0, var2, var3);
					var14 = class91.getObjectDefinition(var15);
					if (var14.interactType == 1) {
						Client.collisionMaps[var0].method4315(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var13 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var13 = var0 + 1;
				}

				MouseRecorder.method2332(var0, var13, var2, var3, var4, var5, var6, var7, class10.scene, Client.collisionMaps[var0]);
			}
		}

	}
}
