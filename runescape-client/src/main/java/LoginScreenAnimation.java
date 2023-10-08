import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dd")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("gu")
	@Export("sessionId")
	static String sessionId;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lun;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ar")
	int[] field1275;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 638715043
	)
	int field1276;
	@ObfuscatedName("am")
	int[] field1284;
	@ObfuscatedName("av")
	int[] field1278;
	@ObfuscatedName("ag")
	int[] field1279;
	@ObfuscatedName("aa")
	int[] field1274;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1067729497
	)
	int field1281;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -1344257651
	)
	int field1290;
	@ObfuscatedName("as")
	int[] field1280;
	@ObfuscatedName("aj")
	int[] field1286;
	@ObfuscatedName("an")
	int[] field1277;
	@ObfuscatedName("au")
	int[] field1288;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1261819587
	)
	int field1287;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -884007788
	)
	int field1285;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1443393815
	)
	int field1289;

	@ObfuscatedSignature(
		descriptor = "([Lun;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1275 = new int[256];
		this.field1276 = 0;
		this.field1281 = 0;
		this.field1290 = 0;
		this.field1287 = 0;
		this.field1285 = 0;
		this.field1289 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("initColors")
	void initColors() {
		this.field1278 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1278[var1 + 192] = 16777215;
		}

		this.field1279 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1279[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1279[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1279[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1279[var1 + 192] = 16777215;
		}

		this.field1274 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1274[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1274[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1274[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1274[var1 + 192] = 16777215;
		}

		this.field1284 = new int[256];
		this.field1287 = 0;
		this.field1277 = new int[32768];
		this.field1288 = new int[32768];
		this.method2471((IndexedSprite)null);
		this.field1280 = new int[32768];
		this.field1286 = new int[32768];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-6404822"
	)
	void method2464() {
		this.field1278 = null;
		this.field1279 = null;
		this.field1274 = null;
		this.field1284 = null;
		this.field1277 = null;
		this.field1288 = null;
		this.field1280 = null;
		this.field1286 = null;
		this.field1287 = 0;
		this.field1285 = 0;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1382576663"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1280 == null) {
			this.initColors();
		}

		if (this.field1289 == 0) {
			this.field1289 = var2;
		}

		int var3 = var2 - this.field1289;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1289 = var2;
		if (var3 > 0) {
			this.method2465(var3);
		}

		this.method2468(var1);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1766870241"
	)
	final void method2465(int var1) {
		this.field1287 += 128 * var1;
		int var2;
		if (this.field1287 > this.field1277.length) {
			this.field1287 -= this.field1277.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2471(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1280[var2 + var3] - this.field1277[var2 + this.field1287 & this.field1277.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1280[var2++] = var6;
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
					this.field1280[var8 + var9] = 255;
				} else {
					this.field1280[var8 + var9] = 0;
				}
			}
		}

		if (this.field1281 * 16 > 0) {
			this.field1281 = this.field1281 * 16 - var1 * 4;
		}

		if (this.field1290 * 16 > 0) {
			this.field1290 = this.field1290 * 16 - var1 * 4;
		}

		if (this.field1281 * 16 == 0 && this.field1290 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1281 = 1024;
			}

			if (var7 == 1) {
				this.field1290 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1275[var7] = this.field1275[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1275[var7] = (int)(Math.sin((double)this.field1276 / 14.0D) * 16.0D + Math.sin((double)this.field1276 / 15.0D) * 14.0D + Math.sin((double)this.field1276 / 16.0D) * 12.0D);
			++this.field1276;
		}

		this.field1285 = this.field1285 * 10000 + 100 * var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1285 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1280[var12 + (var13 << 7)] = 192;
			}

			this.field1285 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1280[var13 + var14 + var7];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1280[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1286[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1286[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1286[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1280[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "92"
	)
	final int method2466(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-527981427"
	)
	final void method2468(int var1) {
		int var2 = this.field1284.length;
		if (this.field1281 * 16 > 0) {
			this.method2485(this.field1281 * 16, this.field1279);
		} else if (this.field1290 * 16 > 0) {
			this.method2485(this.field1290 * 16, this.field1274);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1284[var3] = this.field1278[var3];
			}
		}

		this.method2470(var1);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1793969695"
	)
	final void method2485(int var1, int[] var2) {
		int var3 = this.field1284.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1284[var4] = this.method2466(this.field1278[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1284[var4] = var2[var4];
			} else {
				this.field1284[var4] = this.method2466(var2[var4], this.field1278[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1816590027"
	)
	final void method2470(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1275[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class223.rasterProvider.width) {
				var7 = class223.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class223.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1280[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1284[var10];
					int var14 = class223.rasterProvider.pixels[var8];
					class223.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lun;I)V",
		garbageValue = "129400298"
	)
	final void method2471(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1277.length; ++var2) {
			this.field1277[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1277[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1288[var5] = (this.field1277[var5 + 128] + this.field1277[var5 - 128] + this.field1277[var5 + 1] + this.field1277[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1277;
			this.field1277 = this.field1288;
			this.field1288 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1277[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIILiz;IB)V",
		garbageValue = "-106"
	)
	static void method2497(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		ObjectSound var5 = new ObjectSound();
		var5.plane = var0;
		var5.x = var1 * 128;
		var5.y = var2 * 128;
		int var6 = var3.sizeX;
		int var7 = var3.sizeY;
		if (var4 == 1 || var4 == 3) {
			var6 = var3.sizeY;
			var7 = var3.sizeX;
		}

		var5.maxX = (var6 + var1) * 16384;
		var5.maxY = (var7 + var2) * 128;
		var5.soundEffectId = var3.ambientSoundId;
		var5.field853 = var3.int7 * 128;
		var5.field860 = var3.int5;
		var5.field862 = var3.int6;
		var5.soundEffectIds = var3.soundEffectIds;
		if (var3.transforms != null) {
			var5.obj = var3;
			var5.set();
		}

		ObjectSound.objectSounds.addFirst(var5);
		if (var5.soundEffectIds != null) {
			var5.field864 = var5.field860 + (int)(Math.random() * (double)(var5.field862 - var5.field860));
		}

	}
}
