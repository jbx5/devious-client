import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("az")
	int[] field1286;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1978520895
	)
	int field1287;
	@ObfuscatedName("aa")
	int[] field1298;
	@ObfuscatedName("af")
	int[] field1289;
	@ObfuscatedName("ad")
	int[] field1290;
	@ObfuscatedName("aq")
	int[] field1291;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 721543991
	)
	int field1293;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1366541383
	)
	int field1288;
	@ObfuscatedName("ar")
	int[] field1292;
	@ObfuscatedName("ab")
	int[] field1295;
	@ObfuscatedName("ag")
	int[] field1296;
	@ObfuscatedName("am")
	int[] field1297;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1357457163
	)
	int field1281;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1131364368
	)
	int field1299;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -837944935
	)
	int field1300;

	@ObfuscatedSignature(
		descriptor = "([Luk;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1286 = new int[256];
		this.field1287 = 0;
		this.field1293 = 0;
		this.field1288 = 0;
		this.field1281 = 0;
		this.field1299 = 0;
		this.field1300 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-111"
	)
	@Export("initColors")
	void initColors() {
		this.field1289 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1289[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1289[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1289[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1289[var1 + 192] = 16777215;
		}

		this.field1290 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1290[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1290[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1290[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1290[var1 + 192] = 16777215;
		}

		this.field1291 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1 + 192] = 16777215;
		}

		this.field1298 = new int[256];
		this.field1281 = 0;
		this.field1296 = new int[32768];
		this.field1297 = new int[32768];
		this.method2424((IndexedSprite)null);
		this.field1292 = new int[32768];
		this.field1295 = new int[32768];
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1799116765"
	)
	void method2415() {
		this.field1289 = null;
		this.field1290 = null;
		this.field1291 = null;
		this.field1298 = null;
		this.field1296 = null;
		this.field1297 = null;
		this.field1292 = null;
		this.field1295 = null;
		this.field1281 = 0;
		this.field1299 = 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-48"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1292 == null) {
			this.initColors();
		}

		if (this.field1300 == 0) {
			this.field1300 = var2;
		}

		int var3 = var2 - this.field1300;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1300 = var2;
		if (var3 > 0) {
			this.method2417(var3);
		}

		this.method2419(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	final void method2417(int var1) {
		this.field1281 += var1 * 128;
		int var2;
		if (this.field1281 > this.field1296.length) {
			this.field1281 -= this.field1296.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2424(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1292[var3 + var2] - this.field1296[var2 + this.field1281 & this.field1296.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1292[var2++] = var6;
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
					this.field1292[var9 + var8] = 255;
				} else {
					this.field1292[var9 + var8] = 0;
				}
			}
		}

		if (this.field1293 * 16 > 0) {
			this.field1293 = this.field1293 * 16 - var1 * 4;
		}

		if (this.field1288 * 16 > 0) {
			this.field1288 = this.field1288 * 16 - var1 * 4;
		}

		if (this.field1293 * 16 == 0 && this.field1288 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1293 = 1024;
			}

			if (var7 == 1) {
				this.field1288 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1286[var7] = this.field1286[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1286[var7] = (int)(Math.sin((double)this.field1287 / 14.0D) * 16.0D + Math.sin((double)this.field1287 / 15.0D) * 14.0D + Math.sin((double)this.field1287 / 16.0D) * 12.0D);
			++this.field1287;
		}

		this.field1299 = this.field1299 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1299 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1292[var12 + (var13 << 7)] = 192;
			}

			this.field1299 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1292[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1292[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1295[var14 + var13] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1295[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1295[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1292[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIS)I",
		garbageValue = "1630"
	)
	final int method2418(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1503103603"
	)
	final void method2419(int var1) {
		int var2 = this.field1298.length;
		if (this.field1293 * 16 > 0) {
			this.method2420(this.field1293 * 16, this.field1290);
		} else if (this.field1288 * 16 > 0) {
			this.method2420(this.field1288 * 16, this.field1291);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1298[var3] = this.field1289[var3];
			}
		}

		this.method2421(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I[IB)V",
		garbageValue = "106"
	)
	final void method2420(int var1, int[] var2) {
		int var3 = this.field1298.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1298[var4] = this.method2418(this.field1289[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1298[var4] = var2[var4];
			} else {
				this.field1298[var4] = this.method2418(var2[var4], this.field1289[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1021290032"
	)
	final void method2421(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1286[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= AttackOption.rasterProvider.width) {
				var7 = AttackOption.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * AttackOption.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1292[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1298[var10];
					int var14 = AttackOption.rasterProvider.pixels[var8];
					AttackOption.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1981831992"
	)
	final void method2424(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1296.length; ++var2) {
			this.field1296[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1296[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1297[var5] = (this.field1296[var5 + 128] + this.field1296[var5 - 128] + this.field1296[var5 + 1] + this.field1296[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1296;
			this.field1296 = this.field1297;
			this.field1297 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1296[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("mf")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)V",
		garbageValue = "1528651927"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (ModeWhere.loadInterface(var0)) {
			class9.updateInterface(PacketBufferNode.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
