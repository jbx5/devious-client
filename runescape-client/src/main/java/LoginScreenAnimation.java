import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dz")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("as")
	int[] field1303;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1148724201
	)
	int field1312;
	@ObfuscatedName("am")
	int[] field1320;
	@ObfuscatedName("at")
	int[] field1300;
	@ObfuscatedName("au")
	int[] field1304;
	@ObfuscatedName("an")
	int[] field1308;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1956970143
	)
	int field1309;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1011364635
	)
	int field1310;
	@ObfuscatedName("ar")
	int[] field1311;
	@ObfuscatedName("ab")
	int[] field1315;
	@ObfuscatedName("az")
	int[] field1313;
	@ObfuscatedName("ag")
	int[] field1314;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -239594793
	)
	int field1301;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1988481328
	)
	int field1316;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2135427059
	)
	int field1317;
	@ObfuscatedName("ax")
	final int[][] field1318;

	@ObfuscatedSignature(
		descriptor = "([Lvc;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1303 = new int[256];
		this.field1312 = 0;
		this.field1309 = 0;
		this.field1310 = 0;
		this.field1301 = 0;
		this.field1316 = 0;
		this.field1317 = 0;
		this.sprites = var1;
		this.field1318 = var2;
		this.initColors();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2114068162"
	)
	@Export("initColors")
	void initColors() {
		this.field1300 = class416.method8059(this.field1318[0][0], this.field1318[0][1], this.field1318[0][2], this.field1318[0][3], this.field1318[0][4]);
		this.field1304 = class416.method8059(this.field1318[1][0], this.field1318[1][1], this.field1318[1][2], this.field1318[1][3], this.field1318[1][4]);
		this.field1308 = class416.method8059(this.field1318[2][0], this.field1318[2][1], this.field1318[2][2], this.field1318[2][3], this.field1318[2][4]);
		this.field1320 = new int[256];
		this.field1301 = 0;
		this.field1313 = new int[32768];
		this.field1314 = new int[32768];
		this.method2788((IndexedSprite)null);
		this.field1311 = new int[32768];
		this.field1315 = new int[32768];
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	void method2789() {
		this.field1300 = null;
		this.field1304 = null;
		this.field1308 = null;
		this.field1320 = null;
		this.field1313 = null;
		this.field1314 = null;
		this.field1311 = null;
		this.field1315 = null;
		this.field1301 = 0;
		this.field1316 = 0;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-23"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1311 == null) {
			this.initColors();
		}

		if (this.field1317 == 0) {
			this.field1317 = var2;
		}

		int var3 = var2 - this.field1317;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1317 = var2;
		if (var3 > 0) {
			this.method2782(var3);
		}

		this.method2779(var1);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-312149479"
	)
	final void method2782(int var1) {
		this.field1301 += 128 * var1;
		int var2;
		if (this.field1301 > this.field1313.length) {
			this.field1301 -= this.field1313.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2788(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1311[var3 + var2] - this.field1313[var2 + this.field1301 & this.field1313.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1311[var2++] = var6;
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
					this.field1311[var8 + var9] = 255;
				} else {
					this.field1311[var8 + var9] = 0;
				}
			}
		}

		if (this.field1309 * 16 > 0) {
			this.field1309 = this.field1309 * 16 - var1 * 4;
		}

		if (this.field1310 * 16 > 0) {
			this.field1310 = this.field1310 * 16 - var1 * 4;
		}

		if (this.field1309 * 16 == 0 && this.field1310 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1309 = 1024;
			}

			if (var7 == 1) {
				this.field1310 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1303[var7] = this.field1303[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1303[var7] = (int)(Math.sin((double)this.field1312 / 14.0D) * 16.0D + Math.sin((double)this.field1312 / 15.0D) * 14.0D + Math.sin((double)this.field1312 / 16.0D) * 12.0D);
			++this.field1312;
		}

		this.field1316 = this.field1316 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1316 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1311[var12 + (var13 << 7)] = 192;
			}

			this.field1316 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1311[var14 + var13 + var7];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1311[var13 + var14 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1315[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1315[var7 * 128 + var11 + var14];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1315[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1311[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "1"
	)
	final int method2787(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "11596005"
	)
	final void method2779(int var1) {
		int var2 = this.field1320.length;
		if (this.field1309 * 16 > 0) {
			this.method2785(this.field1309 * 16, this.field1304);
		} else if (this.field1310 * 16 > 0) {
			this.method2785(this.field1310 * 16, this.field1308);
		} else {
			System.arraycopy(this.field1300, 0, this.field1320, 0, var2);
		}

		this.method2809(var1);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I[IS)V",
		garbageValue = "-28556"
	)
	final void method2785(int var1, int[] var2) {
		int var3 = this.field1320.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1320[var4] = this.method2787(this.field1300[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1320[var4] = var2[var4];
			} else {
				this.field1320[var4] = this.method2787(var2[var4], this.field1300[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "2133605212"
	)
	final void method2809(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1303[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class213.rasterProvider.width) {
				var7 = class213.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class213.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1311[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1320[var10];
					int var14 = class213.rasterProvider.pixels[var8];
					class213.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lvc;I)V",
		garbageValue = "-456973757"
	)
	final void method2788(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1313.length; ++var2) {
			this.field1313[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1313[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1314[var5] = (this.field1313[var5 + 1] + this.field1313[var5 - 128] + this.field1313[var5 + 128] + this.field1313[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1313;
			this.field1313 = this.field1314;
			this.field1314 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1313[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1196195373"
	)
	static long method2817() {
		try {
			URL var0 = new URL(Messages.method3176("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}
}
