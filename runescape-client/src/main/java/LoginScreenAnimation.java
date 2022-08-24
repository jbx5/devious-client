import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cm")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "[Lqe;")
	@Export("sprites")
	IndexedSprite[] sprites;

	@ObfuscatedName("i")
	int[] field1214 = new int[256];

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 1084869833)
	int field1215 = 0;

	@ObfuscatedName("o")
	int[] field1219;

	@ObfuscatedName("n")
	int[] field1217;

	@ObfuscatedName("d")
	int[] field1218;

	@ObfuscatedName("a")
	int[] field1223;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -1187374665)
	int field1220 = 0;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 323764779)
	int field1221 = 0;

	@ObfuscatedName("l")
	int[] field1222;

	@ObfuscatedName("z")
	int[] field1229;

	@ObfuscatedName("r")
	int[] field1224;

	@ObfuscatedName("y")
	int[] field1225;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = -286314967)
	int field1226 = 0;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -62915376)
	int field1227 = 0;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 93383679)
	int field1228 = 0;

	@ObfuscatedSignature(descriptor = "([Lqe;)V")
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-115")
	@Export("initColors")
	void initColors() {
		this.field1217 = new int[256];
		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1217[var1] = var1 * 262144;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1217[var1 + 64] = var1 * 1024 + 16711680;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1217[var1 + 128] = var1 * 4 + 16776960;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1217[var1 + 192] = 16777215;
		}
		this.field1218 = new int[256];
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1218[var1] = var1 * 1024;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1218[var1 + 64] = var1 * 4 + '＀';
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1218[var1 + 128] = var1 * 262144 + '￿';
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1218[var1 + 192] = 16777215;
		}
		this.field1223 = new int[256];
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1223[var1] = var1 * 4;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1223[var1 + 64] = var1 * 262144 + 255;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1223[var1 + 128] = var1 * 1024 + 16711935;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1223[var1 + 192] = 16777215;
		}
		this.field1219 = new int[256];
		this.field1226 = 0;
		this.field1224 = new int['耀'];
		this.field1225 = new int['耀'];
		this.method2180(((IndexedSprite) (null)));
		this.field1222 = new int['耀'];
		this.field1229 = new int['耀'];
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2070119291")
	void method2173() {
		this.field1217 = null;
		this.field1218 = null;
		this.field1223 = null;
		this.field1219 = null;
		this.field1224 = null;
		this.field1225 = null;
		this.field1222 = null;
		this.field1229 = null;
		this.field1226 = 0;
		this.field1227 = 0;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1318609363")
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1222 == null) {
			this.initColors();
		}
		if (this.field1228 == 0) {
			this.field1228 = var2;
		}
		int var3 = var2 - this.field1228;
		if (var3 >= 256) {
			var3 = 0;
		}
		this.field1228 = var2;
		if (var3 > 0) {
			this.method2175(var3);
		}
		this.method2186(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1567498231")
	final void method2175(int var1) {
		this.field1226 += 128 * var1;
		int var2;
		if (this.field1226 > this.field1224.length) {
			this.field1226 -= this.field1224.length;
			var2 = ((int) (Math.random() * 12.0));
			this.method2180(this.sprites[var2]);
		}
		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;
		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1222[var3 + var2] - this.field1224[var2 + this.field1226 & this.field1224.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}
			this.field1222[var2++] = var6;
		}
		byte var15 = 10;
		var6 = 128 - var15;
		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;
			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = ((int) (Math.random() * 100.0));
				if (var10 < 50 && var9 > var15 && var9 < var6) {
					this.field1222[var8 + var9] = 255;
				} else {
					this.field1222[var8 + var9] = 0;
				}
			}
		}
		if (this.field1220 * 16 > 0) {
			this.field1220 = this.field1220 * 16 - var1 * 4;
		}
		if (this.field1221 * 16 > 0) {
			this.field1221 = this.field1221 * 16 - var1 * 4;
		}
		if (this.field1220 * 16 == 0 && this.field1221 * 16 == 0) {
			var7 = ((int) (Math.random() * ((double) (2000 / var1))));
			if (var7 == 0) {
				this.field1220 = 1024;
			}
			if (var7 == 1) {
				this.field1221 = 1024;
			}
		}
		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1214[var7] = this.field1214[var7 + var1];
		}
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1214[var7] = ((int) (Math.sin(((double) (this.field1215)) / 14.0) * 16.0 + Math.sin(((double) (this.field1215)) / 15.0) * 14.0 + Math.sin(((double) (this.field1215)) / 16.0) * 12.0));
			++this.field1215;
		}
		this.field1227 = this.field1227 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;
			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1227 * 100; ++var11) {
				var12 = ((int) (Math.random() * ((double) (var10)))) + var17;
				var13 = ((int) (Math.random() * ((double) (var16)))) + var16;
				this.field1222[var12 + (var13 << 7)] = 192;
			}
			this.field1227 = 0;
			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;
				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1222[var7 + var14 + var13];
					}
					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1222[var13 + var14 - (var7 + 1)];
					}
					if (var14 >= 0) {
						this.field1229[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;
				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1229[var7 * 128 + var14 + var11];
					}
					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1229[var14 + var11 - (var7 + 1) * 128];
					}
					if (var13 >= 0) {
						this.field1222[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-2040835934")
	final int method2187(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) + (var3 * (var2 & '＀') + var4 * (var1 & '＀') & 16711680) >> 8;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "2016109180")
	final void method2186(int var1) {
		int var2 = this.field1219.length;
		if (this.field1220 * 16 > 0) {
			this.method2178(this.field1220 * 16, this.field1218);
		} else if (this.field1221 * 16 > 0) {
			this.method2178(this.field1221 * 16, this.field1223);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1219[var3] = this.field1217[var3];
			}
		}
		this.method2202(var1);
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I[II)V", garbageValue = "-1736154993")
	final void method2178(int var1, int[] var2) {
		int var3 = this.field1219.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1219[var4] = this.method2187(this.field1217[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1219[var4] = var2[var4];
			} else {
				this.field1219[var4] = this.method2187(var2[var4], this.field1217[var4], 256 - var1);
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "127")
	final void method2202(int var1) {
		int var2 = 0;
		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1214[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}
			if (var5 + 128 >= class119.rasterProvider.width) {
				var7 = class119.rasterProvider.width - var5;
			}
			int var8 = var5 + (var3 + 8) * class119.rasterProvider.width;
			var2 += var6;
			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1222[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1219[var10];
					int var14 = class119.rasterProvider.pixels[var8];
					class119.rasterProvider.pixels[var8++] = -16777216 | (var13 * (var14 & '＀') + var12 * (var10 & '＀') & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
				} else {
					++var8;
				}
			}
			var2 += 128 - var7;
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lqe;S)V", garbageValue = "15816")
	final void method2180(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1224.length; ++var2) {
			this.field1224[var2] = 0;
		}
		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = ((int) (Math.random() * 128.0 * 256.0));
			this.field1224[var3] = ((int) (Math.random() * 256.0));
		}
		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1225[var5] = (this.field1224[var5 - 128] + this.field1224[var5 + 1] + this.field1224[var5 + 128] + this.field1224[var5 - 1]) / 4;
				}
			}
			int[] var8 = this.field1224;
			this.field1224 = this.field1225;
			this.field1225 = var8;
		}
		if (var1 != null) {
			var2 = 0;
			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1224[var7] = 0;
					}
				}
			}
		}
	}
}