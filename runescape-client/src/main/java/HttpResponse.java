import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("HttpResponse")
public class HttpResponse {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -675538159
	)
	@Export("responseCode")
	final int responseCode;
	@ObfuscatedName("aw")
	@Export("headerFields")
	final Map headerFields;
	@ObfuscatedName("al")
	@Export("responseBody")
	final String responseBody;

	HttpResponse(String var1) {
		this.responseCode = 400;
		this.headerFields = null;
		this.responseBody = "";
	}

	HttpResponse(HttpURLConnection var1) throws IOException {
		this.responseCode = var1.getResponseCode();
		var1.getResponseMessage();
		this.headerFields = var1.getHeaderFields();
		StringBuilder var2 = new StringBuilder();
		InputStream var3 = this.responseCode >= 300 ? var1.getErrorStream() : var1.getInputStream();
		if (var3 != null) {
			InputStreamReader var4 = new InputStreamReader(var3);
			BufferedReader var5 = new BufferedReader(var4);

			String var6;
			while ((var6 = var5.readLine()) != null) {
				var2.append(var6);
			}

			var3.close();
		}

		this.responseBody = var2.toString();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-119"
	)
	@Export("getResponseCode")
	public int getResponseCode() {
		return this.responseCode;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/Map;",
		garbageValue = "1667816156"
	)
	@Export("getHeaderFields")
	public Map getHeaderFields() {
		return this.headerFields;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "61"
	)
	@Export("getResponseBody")
	public String getResponseBody() {
		return this.responseBody;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIIIIIIIII[Liz;I)V",
		garbageValue = "-1054610532"
	)
	static final void method269(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, CollisionMap[] var10) {
		int var12;
		for (int var11 = 0; var11 < 8; ++var11) {
			for (var12 = 0; var12 < 8; ++var12) {
				if (var11 + var2 > 0 && var11 + var2 < 103 && var3 + var12 > 0 && var3 + var12 < 103) {
					int[] var10000 = var10[var1].flags[var11 + var2];
					var10000[var12 + var3] &= -16777217;
				}
			}
		}

		Buffer var24 = new Buffer(var0);

		for (var12 = 0; var12 < 4; ++var12) {
			for (int var13 = 0; var13 < 64; ++var13) {
				for (int var14 = 0; var14 < 64; ++var14) {
					if (var12 == var4 && var13 >= var5 && var13 < var5 + 8 && var14 >= var6 && var14 < var6 + 8) {
						int var15 = var2 + Login.method2197(var13 & 7, var14 & 7, var7);
						int var18 = var13 & 7;
						int var19 = var14 & 7;
						int var20 = var7 & 3;
						int var17;
						if (var20 == 0) {
							var17 = var19;
						} else if (var20 == 1) {
							var17 = 7 - var18;
						} else if (var20 == 2) {
							var17 = 7 - var19;
						} else {
							var17 = var18;
						}

						int var21 = var3 + var17;
						int var22 = (var13 & 7) + var8 + var2;
						int var23 = var3 + (var14 & 7) + var9;
						class182.loadTerrain(var24, var1, var15, var21, var22, var23, var7);
					} else {
						class182.loadTerrain(var24, 0, -1, -1, 0, 0, 0);
					}
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "543294315"
	)
	static final int method270(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = Decimator.method1104(var3, var5);
		int var8 = Decimator.method1104(var3 + 1, var5);
		int var9 = Decimator.method1104(var3, var5 + 1);
		int var10 = Decimator.method1104(var3 + 1, var5 + 1);
		int var11 = class128.method3011(var7, var8, var4, var2);
		int var12 = class128.method3011(var9, var10, var4, var2);
		return class128.method3011(var11, var12, var6, var2);
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(IIIILvd;Lmc;I)V",
		garbageValue = "-2094972164"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			ItemComposition.redHintArrowSprite.method9928(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			class11.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
