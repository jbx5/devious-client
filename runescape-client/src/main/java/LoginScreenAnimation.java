import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cl")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("sh")
	@ObfuscatedSignature(descriptor = 
	"Lbk;")

	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"[Lqx;")

	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("d")
	int[] field1222;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-265907793)

	int field1218;
	@ObfuscatedName("u")
	int[] field1223;
	@ObfuscatedName("r")
	int[] field1214;
	@ObfuscatedName("k")
	int[] field1215;
	@ObfuscatedName("x")
	int[] field1216;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-1041028247)

	int field1217;
	@ObfuscatedName("j")
	@ObfuscatedGetter(intValue = 
	1552540857)

	int field1213;
	@ObfuscatedName("p")
	int[] field1230;
	@ObfuscatedName("s")
	int[] field1220;
	@ObfuscatedName("b")
	int[] field1206;
	@ObfuscatedName("w")
	int[] field1224;
	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 
	-1000266587)

	int field1219;
	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = 
	-1531939327)

	int field1212;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-1469411093)

	int field1225;

	@ObfuscatedSignature(descriptor = 
	"([Lqx;)V")

	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1222 = new int[256];
		this.field1218 = 0;
		this.field1217 = 0;
		this.field1213 = 0;
		this.field1219 = 0;
		this.field1212 = 0;
		this.field1225 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-373411342")

	@Export("initColors")
	void initColors() {
		this.field1214 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1214[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1214[var1 + 64] = (var1 * 1024) + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1214[var1 + 128] = (var1 * 4) + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1214[var1 + 192] = 16777215;
		}

		this.field1215 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1215[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1215[var1 + 64] = (var1 * 4) + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1215[var1 + 128] = (var1 * 262144) + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1215[var1 + 192] = 16777215;
		}

		this.field1216 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1216[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1216[var1 + 64] = (var1 * 262144) + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1216[var1 + 128] = (var1 * 1024) + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1216[var1 + 192] = 16777215;
		}

		this.field1223 = new int[256];
		this.field1219 = 0;
		this.field1206 = new int[32768];
		this.field1224 = new int[32768];
		this.method2227(((IndexedSprite) (null)));
		this.field1230 = new int[32768];
		this.field1220 = new int[32768];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-374608466")

	void method2230() {
		this.field1214 = null;
		this.field1215 = null;
		this.field1216 = null;
		this.field1223 = null;
		this.field1206 = null;
		this.field1224 = null;
		this.field1230 = null;
		this.field1220 = null;
		this.field1219 = 0;
		this.field1212 = 0;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(III)V", garbageValue = 
	"1146036758")

	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1230 == null) {
			this.initColors();
		}

		if (this.field1225 == 0) {
			this.field1225 = var2;
		}

		int var3 = var2 - this.field1225;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1225 = var2;
		if (var3 > 0) {
			this.method2222(var3);
		}

		this.method2248(var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"2036498006")

	final void method2222(int var1) {
		this.field1219 += var1 * 128;
		int var2;
		if (this.field1219 > this.field1206.length) {
			this.field1219 -= this.field1206.length;
			var2 = ((int) (Math.random() * 12.0));
			this.method2227(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1230[var3 + var2] - ((this.field1206[(var2 + this.field1219) & (this.field1206.length - 1)] * var1) / 6);
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1230[var2++] = var6;
		}

		byte var15 = 10;
		var6 = 128 - var15;

		int var7;
		int var10;
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			int var8 = var7 * 128;

			for (int var9 = 0; var9 < 128; ++var9) {
				var10 = ((int) (Math.random() * 100.0));
				if (((var10 < 50) && (var9 > var15)) && (var9 < var6)) {
					this.field1230[var9 + var8] = 255;
				} else {
					this.field1230[var8 + var9] = 0;
				}
			}
		}

		if (this.field1217 > 0) {
			this.field1217 -= var1 * 4;
		}

		if (this.field1213 > 0) {
			this.field1213 -= var1 * 4;
		}

		if ((this.field1217 == 0) && (this.field1213 == 0)) {
			var7 = ((int) (Math.random() * ((double) (2000 / var1))));
			if (var7 == 0) {
				this.field1217 = 1024;
			}

			if (var7 == 1) {
				this.field1213 = 1024;
			}
		}

		for (var7 = 0; var7 < (256 - var1); ++var7) {
			this.field1222[var7] = this.field1222[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1222[var7] = ((int) (((Math.sin(((double) (this.field1218)) / 14.0) * 16.0) + (Math.sin(((double) (this.field1218)) / 15.0) * 14.0)) + (Math.sin(((double) (this.field1218)) / 16.0) * 12.0)));
			++this.field1218;
		}

		this.field1212 += var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = (128 - var17) - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < (this.field1212 * 100); ++var11) {
				var12 = ((int) (Math.random() * ((double) (var10)))) + var17;
				var13 = ((int) (Math.random() * ((double) (var16)))) + var16;
				this.field1230[var12 + (var13 << 7)] = 192;
			}

			this.field1212 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if ((var14 + var7) < 128) {
						var12 += this.field1230[(var14 + var13) + var7];
					}

					if ((var14 - (var7 + 1)) >= 0) {
						var12 -= this.field1230[(var14 + var13) - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1220[var14 + var13] = var12 / ((var7 * 2) + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if ((var13 + var7) < 256) {
						var12 += this.field1220[((var7 * 128) + var14) + var11];
					}

					if ((var13 - (var7 + 1)) >= 0) {
						var12 -= this.field1220[(var11 + var14) - ((var7 + 1) * 128)];
					}

					if (var13 >= 0) {
						this.field1230[var14 + var11] = var12 / ((var7 * 2) + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(IIIB)I", garbageValue = 
	"19")

	final int method2223(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return ((((var3 * (var2 & 65280)) + (var4 * (var1 & 65280))) & 16711680) + (((var3 * (var2 & 16711935)) + (var4 * (var1 & 16711935))) & (-16711936))) >> 8;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-2138282769")

	final void method2248(int var1) {
		int var2 = this.field1223.length;
		if (this.field1217 > 0) {
			this.method2225(this.field1217, this.field1215);
		} else if (this.field1213 > 0) {
			this.method2225(this.field1213, this.field1216);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1223[var3] = this.field1214[var3];
			}
		}

		this.method2249(var1);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(I[II)V", garbageValue = 
	"1674657579")

	final void method2225(int var1, int[] var2) {
		int var3 = this.field1223.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1223[var4] = this.method2223(this.field1214[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1223[var4] = var2[var4];
			} else {
				this.field1223[var4] = this.method2223(var2[var4], this.field1214[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"-1340384043")

	final void method2249(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = ((256 - var3) * this.field1222[var3]) / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if ((var5 + 128) >= SpotAnimationDefinition.rasterProvider.width) {
				var7 = SpotAnimationDefinition.rasterProvider.width - var5;
			}

			int var8 = var5 + ((var3 + 8) * SpotAnimationDefinition.rasterProvider.width);
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1230[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (((var10 != 0) && (var11 >= Rasterizer2D.Rasterizer2D_xClipStart)) && (var11 < Rasterizer2D.Rasterizer2D_xClipEnd)) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1223[var10];
					int var14 = SpotAnimationDefinition.rasterProvider.pixels[var8];
					SpotAnimationDefinition.rasterProvider.pixels[var8++] = (-16777216) | (((((var13 * (var14 & 65280)) + (var12 * (var10 & 65280))) & 16711680) + ((((var14 & 16711935) * var13) + ((var10 & 16711935) * var12)) & (-16711936))) >> 8);
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(Lqx;I)V", garbageValue = 
	"-2128522591")

	final void method2227(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1206.length; ++var2) {
			this.field1206[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = ((int) ((Math.random() * 128.0) * 256.0));
			this.field1206[var3] = ((int) (Math.random() * 256.0));
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1224[var5] = (((this.field1206[var5 - 128] + this.field1206[var5 + 1]) + this.field1206[var5 + 128]) + this.field1206[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1206;
			this.field1206 = this.field1224;
			this.field1224 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = (var4 + var1.xOffset) + 16;
						int var6 = (var3 + var1.yOffset) + 16;
						int var7 = var5 + (var6 << 7);
						this.field1206[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)[Lfg;", garbageValue = 
	"8")

	static HorizontalAlignment[] method2235() {
		return new HorizontalAlignment[]{ HorizontalAlignment.field1900, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1904 };
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;IB)Z", garbageValue = 
	"119")

	static boolean method2247(String var0, int var1) {
		return class154.method3128(var0, var1, "openjs");
	}

	@ObfuscatedName("iw")
	@ObfuscatedSignature(descriptor = 
	"(IIIIS)V", garbageValue = 
	"-26460")

	static final void method2240(int var0, int var1, int var2, int var3) {
		for (int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
			if (((((Client.rootWidgetWidths[var4] + Client.rootWidgetXs[var4]) > var0) && (Client.rootWidgetXs[var4] < (var0 + var2))) && ((Client.rootWidgetYs[var4] + Client.rootWidgetHeights[var4]) > var1)) && (Client.rootWidgetYs[var4] < (var3 + var1))) {
				Client.field651[var4] = true;
			}
		}

	}
}