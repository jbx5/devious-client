import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ds")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ag")
	int[] field1273;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 672511713
	)
	int field1276;
	@ObfuscatedName("av")
	int[] field1286;
	@ObfuscatedName("ap")
	int[] field1282;
	@ObfuscatedName("aq")
	int[] field1277;
	@ObfuscatedName("at")
	int[] field1278;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1138607883
	)
	int field1279;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1208447611
	)
	int field1280;
	@ObfuscatedName("aa")
	int[] field1281;
	@ObfuscatedName("au")
	int[] field1283;
	@ObfuscatedName("ae")
	int[] field1268;
	@ObfuscatedName("ab")
	int[] field1274;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1851485799
	)
	int field1285;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -938294628
	)
	int field1271;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1659001705
	)
	int field1287;

	@ObfuscatedSignature(
		descriptor = "([Luu;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1273 = new int[256];
		this.field1276 = 0;
		this.field1279 = 0;
		this.field1280 = 0;
		this.field1285 = 0;
		this.field1271 = 0;
		this.field1287 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1971878867"
	)
	@Export("initColors")
	void initColors() {
		this.field1282 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1282[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1282[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1282[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1282[var1 + 192] = 16777215;
		}

		this.field1277 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1277[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1277[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1277[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1277[var1 + 192] = 16777215;
		}

		this.field1278 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1 + 192] = 16777215;
		}

		this.field1286 = new int[256];
		this.field1285 = 0;
		this.field1268 = new int[32768];
		this.field1274 = new int[32768];
		this.method2437((IndexedSprite)null);
		this.field1281 = new int[32768];
		this.field1283 = new int[32768];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-14"
	)
	void method2459() {
		this.field1282 = null;
		this.field1277 = null;
		this.field1278 = null;
		this.field1286 = null;
		this.field1268 = null;
		this.field1274 = null;
		this.field1281 = null;
		this.field1283 = null;
		this.field1285 = 0;
		this.field1271 = 0;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2005060089"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1281 == null) {
			this.initColors();
		}

		if (this.field1287 == 0) {
			this.field1287 = var2;
		}

		int var3 = var2 - this.field1287;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1287 = var2;
		if (var3 > 0) {
			this.method2432(var3);
		}

		this.method2428(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "16626"
	)
	final void method2432(int var1) {
		this.field1285 += var1 * 128;
		int var2;
		if (this.field1285 > this.field1268.length) {
			this.field1285 -= this.field1268.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2437(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1281[var2 + var3] - this.field1268[var2 + this.field1285 & this.field1268.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1281[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = (int)(Math.random() * 100.0D);
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1281[var9 + var8] = 255;
				} else {
					this.field1281[var8 + var9] = 0;
				}
			}
		}

		if (this.field1279 * 16 > 0) {
			this.field1279 = this.field1279 * 16 - var1 * 4;
		}

		if (this.field1280 * 16 > 0) {
			this.field1280 = this.field1280 * 16 - var1 * 4;
		}

		if (this.field1279 * 16 == 0 && this.field1280 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1279 = 1024;
			}

			if (var7 == 1) {
				this.field1280 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1273[var7] = this.field1273[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1273[var7] = (int)(Math.sin((double)this.field1276 / 14.0D) * 16.0D + Math.sin((double)this.field1276 / 15.0D) * 14.0D + Math.sin((double)this.field1276 / 16.0D) * 12.0D);
			++this.field1276;
		}

		this.field1271 = this.field1271 * 10000 + var1 * 100;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1271 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1281[var12 + (var13 << 7)] = 192;
			}

			this.field1271 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1281[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1281[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1283[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1283[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1283[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1281[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "24"
	)
	final int method2434(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2121548101"
	)
	final void method2428(int var1) {
		int var2 = this.field1286.length;
		if (this.field1279 * 16 > 0) {
			this.method2435(this.field1279 * 16, this.field1277);
		} else if (this.field1280 * 16 > 0) {
			this.method2435(this.field1280 * 16, this.field1278);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1286[var3] = this.field1282[var3];
			}
		}

		this.method2436(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "2"
	)
	final void method2435(int var1, int[] var2) {
		int var3 = this.field1286.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1286[var4] = this.method2434(this.field1282[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1286[var4] = var2[var4];
			} else {
				this.field1286[var4] = this.method2434(var2[var4], this.field1282[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2130924481"
	)
	final void method2436(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1273[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class156.rasterProvider.width) {
				var7 = class156.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class156.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1281[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1286[var10];
					int var14 = class156.rasterProvider.pixels[var8];
					class156.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Luu;B)V",
		garbageValue = "38"
	)
	final void method2437(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1268.length; ++var2) {
			this.field1268[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1268[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1274[var5] = (this.field1268[var5 - 128] + this.field1268[var5 + 1] + this.field1268[var5 + 128] + this.field1268[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1268;
			this.field1268 = this.field1274;
			this.field1274 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1268[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "-66"
	)
	static final int method2460(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lhb;I)Z",
		garbageValue = "1149776403"
	)
	static boolean method2431(ObjectComposition var0) {
		if (var0.transforms != null) {
			int[] var1 = var0.transforms;

			for (int var2 = 0; var2 < var1.length; ++var2) {
				int var3 = var1[var2];
				ObjectComposition var4 = class90.getObjectDefinition(var3);
				if (var4.mapIconId != -1) {
					return true;
				}
			}
		} else if (var0.mapIconId != -1) {
			return true;
		}

		return false;
	}
}
