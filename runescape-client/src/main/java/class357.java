import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class357 {
	@ObfuscatedName("gs")
	@ObfuscatedGetter(
		intValue = 1526428303
	)
	static int field3782;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	UrlRequest field3779;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	SpritePixels field3780;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Len;)V"
	)
	class357(String var1, UrlRequester var2) {
		try {
			this.field3779 = var2.request(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3779 = null;
		}

	}

	@ObfuscatedSignature(
		descriptor = "(Lek;)V"
	)
	class357(UrlRequest var1) {
		this.field3779 = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lvv;",
		garbageValue = "-1398609474"
	)
	SpritePixels method6871() {
		if (this.field3780 == null && this.field3779 != null && this.field3779.isDone()) {
			if (this.field3779.getResponse() != null) {
				this.field3780 = class106.readSpritePixelsFromBytes(this.field3779.getResponse());
			}

			this.field3779 = null;
		}

		return this.field3780;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([BIIB)Ljava/lang/String;",
		garbageValue = "38"
	)
	public static String method6872(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;
		int var5 = var1;

		int var8;
		for (int var6 = var2 + var1; var5 < var6; var3[var4++] = (char)var8) {
			int var7 = var0[var5++] & 255;
			if (var7 < 128) {
				if (var7 == 0) {
					var8 = 65533;
				} else {
					var8 = var7;
				}
			} else if (var7 < 192) {
				var8 = 65533;
			} else if (var7 < 224) {
				if (var5 < var6 && (var0[var5] & 192) == 128) {
					var8 = (var7 & 31) << 6 | var0[var5++] & 63;
					if (var8 < 128) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 240) {
				if (var5 + 1 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128) {
					var8 = (var7 & 15) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 < 2048) {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else if (var7 < 248) {
				if (var5 + 2 < var6 && (var0[var5] & 192) == 128 && (var0[var5 + 1] & 192) == 128 && (var0[var5 + 2] & 192) == 128) {
					var8 = (var7 & 7) << 18 | (var0[var5++] & 63) << 12 | (var0[var5++] & 63) << 6 | var0[var5++] & 63;
					if (var8 >= 65536 && var8 <= 1114111) {
						var8 = 65533;
					} else {
						var8 = 65533;
					}
				} else {
					var8 = 65533;
				}
			} else {
				var8 = 65533;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfr;FB)F",
		garbageValue = "-32"
	)
	static float method6875(class137 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2;
			if (var0.field1609 == var1) {
				var2 = 0.0F;
			} else if (var0.field1610 == var1) {
				var2 = 1.0F;
			} else {
				var2 = (var1 - var0.field1609) / (var0.field1610 - var0.field1609);
			}

			float var3;
			if (var0.field1603) {
				var3 = var2;
			} else {
				float[] var4 = new float[]{var0.field1623 - var2, var0.field1612, var0.field1613, var0.field1614};
				float[] var5 = new float[5];
				int var6 = Archive.method7520(var4, 3, 0.0F, true, 1.0F, true, var5);
				if (var6 == 1) {
					var3 = var5[0];
				} else {
					var3 = 0.0F;
				}
			}

			return var0.field1615 + var3 * ((var0.field1624 * var3 + var0.field1608) * var3 + var0.field1616);
		}
	}
}
