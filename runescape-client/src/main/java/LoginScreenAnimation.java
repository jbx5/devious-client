import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dk")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("dm")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	static IndexedSprite field1282;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	static Archive field1281;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lvb;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("am")
	int[] field1274;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1298611011
	)
	int field1266;
	@ObfuscatedName("ae")
	int[] field1267;
	@ObfuscatedName("ad")
	int[] field1268;
	@ObfuscatedName("aq")
	int[] field1271;
	@ObfuscatedName("al")
	int[] field1270;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 777080585
	)
	int field1280;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1982625439
	)
	int field1272;
	@ObfuscatedName("aw")
	int[] field1265;
	@ObfuscatedName("af")
	int[] field1276;
	@ObfuscatedName("aa")
	int[] field1275;
	@ObfuscatedName("ah")
	int[] field1269;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 712051009
	)
	int field1277;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 50349552
	)
	int field1278;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -289025307
	)
	int field1279;

	@ObfuscatedSignature(
		descriptor = "([Lvb;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1274 = new int[256];
		this.field1266 = 0;
		this.field1280 = 0;
		this.field1272 = 0;
		this.field1277 = 0;
		this.field1278 = 0;
		this.field1279 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-6"
	)
	@Export("initColors")
	void initColors() {
		this.field1268 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1268[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1268[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1268[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1268[var1 + 192] = 16777215;
		}

		this.field1271 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1271[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1271[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1271[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1271[var1 + 192] = 16777215;
		}

		this.field1270 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1270[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1270[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1270[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1270[var1 + 192] = 16777215;
		}

		this.field1267 = new int[256];
		this.field1277 = 0;
		this.field1275 = new int[32768];
		this.field1269 = new int[32768];
		this.method2590((IndexedSprite)null);
		this.field1265 = new int[32768];
		this.field1276 = new int[32768];
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	void method2584() {
		this.field1268 = null;
		this.field1271 = null;
		this.field1270 = null;
		this.field1267 = null;
		this.field1275 = null;
		this.field1269 = null;
		this.field1265 = null;
		this.field1276 = null;
		this.field1277 = 0;
		this.field1278 = 0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-532716554"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1265 == null) {
			this.initColors();
		}

		if (this.field1279 == 0) {
			this.field1279 = var2;
		}

		int var3 = var2 - this.field1279;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1279 = var2;
		if (var3 > 0) {
			this.method2596(var3);
		}

		this.method2593(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "58"
	)
	final void method2596(int var1) {
		this.field1277 += 128 * var1;
		int var2;
		if (this.field1277 > this.field1275.length) {
			this.field1277 -= this.field1275.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2590(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1265[var3 + var2] - this.field1275[var2 + this.field1277 & this.field1275.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1265[var2++] = var6;
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
					this.field1265[var8 + var9] = 255;
				} else {
					this.field1265[var9 + var8] = 0;
				}
			}
		}

		if (this.field1280 * 16 > 0) {
			this.field1280 = this.field1280 * 16 - var1 * 4;
		}

		if (this.field1272 * 16 > 0) {
			this.field1272 = this.field1272 * 16 - var1 * 4;
		}

		if (this.field1280 * 16 == 0 && this.field1272 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1280 = 1024;
			}

			if (var7 == 1) {
				this.field1272 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1274[var7] = this.field1274[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1274[var7] = (int)(Math.sin((double)this.field1266 / 14.0D) * 16.0D + Math.sin((double)this.field1266 / 15.0D) * 14.0D + Math.sin((double)this.field1266 / 16.0D) * 12.0D);
			++this.field1266;
		}

		this.field1278 = this.field1278 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1278 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1265[var12 + (var13 << 7)] = 192;
			}

			this.field1278 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1265[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1265[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1276[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1276[var14 + var11 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1276[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1265[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-84"
	)
	final int method2605(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-10"
	)
	final void method2593(int var1) {
		int var2 = this.field1267.length;
		if (this.field1280 * 16 > 0) {
			this.method2588(this.field1280 * 16, this.field1271);
		} else if (this.field1272 * 16 > 0) {
			this.method2588(this.field1272 * 16, this.field1270);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1267[var3] = this.field1268[var3];
			}
		}

		this.method2587(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I[IS)V",
		garbageValue = "-10510"
	)
	final void method2588(int var1, int[] var2) {
		int var3 = this.field1267.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1267[var4] = this.method2605(this.field1268[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1267[var4] = var2[var4];
			} else {
				this.field1267[var4] = this.method2605(var2[var4], this.field1268[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "105"
	)
	final void method2587(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1274[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class299.rasterProvider.width) {
				var7 = class299.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class299.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1265[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1267[var10];
					int var14 = class299.rasterProvider.pixels[var8];
					class299.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lvb;I)V",
		garbageValue = "-2080427534"
	)
	final void method2590(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1275.length; ++var2) {
			this.field1275[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1275[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1269[var5] = (this.field1275[var5 + 1] + this.field1275[var5 + 128] + this.field1275[var5 - 128] + this.field1275[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1275;
			this.field1275 = this.field1269;
			this.field1269 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight * -1220193712; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1275[var7] = 0;
					}
				}
			}
		}

	}
}
