import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("de")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("aa")
	int[] field1293;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1142814665
	)
	int field1294;
	@ObfuscatedName("ao")
	int[] field1291;
	@ObfuscatedName("au")
	int[] field1296;
	@ObfuscatedName("ak")
	int[] field1301;
	@ObfuscatedName("ah")
	int[] field1290;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 872802407
	)
	int field1297;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -353602795
	)
	int field1300;
	@ObfuscatedName("ax")
	int[] field1299;
	@ObfuscatedName("an")
	int[] field1292;
	@ObfuscatedName("ag")
	int[] field1303;
	@ObfuscatedName("am")
	int[] field1304;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1255306129
	)
	int field1305;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1691745044
	)
	int field1306;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1488952941
	)
	int field1298;

	@ObfuscatedSignature(
		descriptor = "([Lvg;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1293 = new int[256];
		this.field1294 = 0;
		this.field1297 = 0;
		this.field1300 = 0;
		this.field1305 = 0;
		this.field1306 = 0;
		this.field1298 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-661569380"
	)
	@Export("initColors")
	void initColors() {
		this.field1296 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1296[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1296[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1296[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1296[var1 + 192] = 16777215;
		}

		this.field1301 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1301[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1301[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1301[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1301[var1 + 192] = 16777215;
		}

		this.field1290 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1290[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1290[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1290[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1290[var1 + 192] = 16777215;
		}

		this.field1291 = new int[256];
		this.field1305 = 0;
		this.field1303 = new int[32768];
		this.field1304 = new int[32768];
		this.method2505((IndexedSprite)null);
		this.field1299 = new int[32768];
		this.field1292 = new int[32768];
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2514() {
		this.field1296 = null;
		this.field1301 = null;
		this.field1290 = null;
		this.field1291 = null;
		this.field1303 = null;
		this.field1304 = null;
		this.field1299 = null;
		this.field1292 = null;
		this.field1305 = 0;
		this.field1306 = 0;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "2079246213"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1299 == null) {
			this.initColors();
		}

		if (this.field1298 == 0) {
			this.field1298 = var2;
		}

		int var3 = var2 - this.field1298;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1298 = var2;
		if (var3 > 0) {
			this.method2499(var3);
		}

		this.method2502(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-9"
	)
	final void method2499(int var1) {
		this.field1305 += var1 * 128;
		int var2;
		if (this.field1305 > this.field1303.length) {
			this.field1305 -= this.field1303.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2505(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1299[var2 + var3] - this.field1303[var2 + this.field1305 & this.field1303.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1299[var2++] = var6;
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
					this.field1299[var9 + var8] = 255;
				} else {
					this.field1299[var8 + var9] = 0;
				}
			}
		}

		if (this.field1297 * 16 > 0) {
			this.field1297 = this.field1297 * 16 - var1 * 4;
		}

		if (this.field1300 * 16 > 0) {
			this.field1300 = this.field1300 * 16 - var1 * 4;
		}

		if (this.field1297 * 16 == 0 && this.field1300 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1297 = 1024;
			}

			if (var7 == 1) {
				this.field1300 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1293[var7] = this.field1293[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1293[var7] = (int)(Math.sin((double)this.field1294 / 14.0D) * 16.0D + Math.sin((double)this.field1294 / 15.0D) * 14.0D + Math.sin((double)this.field1294 / 16.0D) * 12.0D);
			++this.field1294;
		}

		this.field1306 = this.field1306 * 10000 + 100 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1306 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1299[var12 + (var13 << 7)] = 192;
			}

			this.field1306 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1299[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1299[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1292[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1292[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1292[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1299[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-17"
	)
	final int method2518(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) + (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1902831360"
	)
	final void method2502(int var1) {
		int var2 = this.field1291.length;
		if (this.field1297 * 16 > 0) {
			this.method2503(this.field1297 * 16, this.field1301);
		} else if (this.field1300 * 16 > 0) {
			this.method2503(this.field1300 * 16, this.field1290);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1291[var3] = this.field1296[var3];
			}
		}

		this.method2504(var1);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "1872617322"
	)
	final void method2503(int var1, int[] var2) {
		int var3 = this.field1291.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1291[var4] = this.method2518(this.field1296[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1291[var4] = var2[var4];
			} else {
				this.field1291[var4] = this.method2518(var2[var4], this.field1296[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-889960889"
	)
	final void method2504(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1293[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= UserComparator8.rasterProvider.width) {
				var7 = UserComparator8.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * UserComparator8.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1299[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1291[var10];
					int var14 = UserComparator8.rasterProvider.pixels[var8];
					UserComparator8.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "1546430874"
	)
	final void method2505(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1303.length; ++var2) {
			this.field1303[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1303[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1304[var5] = (this.field1303[var5 + 1] + this.field1303[var5 + 128] + this.field1303[var5 - 128] + this.field1303[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1303;
			this.field1303 = this.field1304;
			this.field1304 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1303[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("aq")
	public static int method2525(int var0, double var1) {
		double var3 = (double)(var0 >> 16 & 255) / 256.0D;
		double var5 = (double)(var0 >> 8 & 255) / 256.0D;
		double var7 = (double)(var0 & 255) / 256.0D;
		var3 = Math.pow(var3, var1);
		var5 = Math.pow(var5, var1);
		var7 = Math.pow(var7, var1);
		int var9 = (int)(var3 * 256.0D);
		int var10 = (int)(256.0D * var5);
		int var11 = (int)(256.0D * var7);
		return var11 + (var10 << 8) + (var9 << 16) + -16777216;
	}

	@ObfuscatedName("ni")
	@ObfuscatedSignature(
		descriptor = "(Luq;II)V",
		garbageValue = "-682940445"
	)
	static void method2524(Buffer var0, int var1) {
		byte[] var2 = var0.array;
		if (Client.randomDatData == null) {
			Client.randomDatData = new byte[24];
		}

		class428.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
		class406.method7637(var0, var1);
	}
}
