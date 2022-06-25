import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("cf")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("es")
	@ObfuscatedSignature(descriptor = "Lnz;")
	@Export("spriteIds")
	static GraphicsDefaults spriteIds;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Lqu;")
	@Export("sprites")
	IndexedSprite[] sprites;

	@ObfuscatedName("g")
	int[] field1234;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -1222340025)
	int field1218;

	@ObfuscatedName("y")
	int[] field1219;

	@ObfuscatedName("i")
	int[] field1220;

	@ObfuscatedName("s")
	int[] field1217;

	@ObfuscatedName("t")
	int[] field1222;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = -592239065)
	int field1235;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -320519367)
	int field1224;

	@ObfuscatedName("u")
	int[] field1225;

	@ObfuscatedName("k")
	int[] field1214;

	@ObfuscatedName("h")
	int[] field1233;

	@ObfuscatedName("x")
	int[] field1230;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -508956667)
	int field1229;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1845848383)
	int field1226;

	@ObfuscatedName("p")
	@ObfuscatedGetter(intValue = -744231703)
	int field1231;

	@ObfuscatedSignature(descriptor = "([Lqu;)V")
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1234 = new int[256];
		this.field1218 = 0;
		this.field1235 = 0;
		this.field1224 = 0;
		this.field1229 = 0;
		this.field1226 = 0;
		this.field1231 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "28")
	@Export("initColors")
	void initColors() {
		this.field1220 = new int[256];
		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1220[var1] = var1 * 262144;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1220[var1 + 64] = var1 * 1024 + 16711680;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1220[var1 + 128] = var1 * 4 + 16776960;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1220[var1 + 192] = 16777215;
		}
		this.field1217 = new int[256];
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1217[var1] = var1 * 1024;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1217[var1 + 64] = var1 * 4 + 65280;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1217[var1 + 128] = var1 * 262144 + 65535;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1217[var1 + 192] = 16777215;
		}
		this.field1222 = new int[256];
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1222[var1] = var1 * 4;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1222[var1 + 64] = var1 * 262144 + 255;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1222[var1 + 128] = var1 * 1024 + 16711935;
		}
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1222[var1 + 192] = 16777215;
		}
		this.field1219 = new int[256];
		this.field1229 = 0;
		this.field1233 = new int[32768];
		this.field1230 = new int[32768];
		this.method2215(((IndexedSprite) (null)));
		this.field1225 = new int[32768];
		this.field1214 = new int[32768];
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1457219443")
	void method2209() {
		this.field1220 = null;
		this.field1217 = null;
		this.field1222 = null;
		this.field1219 = null;
		this.field1233 = null;
		this.field1230 = null;
		this.field1225 = null;
		this.field1214 = null;
		this.field1229 = 0;
		this.field1226 = 0;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "155264407")
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1225 == null) {
			this.initColors();
		}
		if (this.field1231 == 0) {
			this.field1231 = var2;
		}
		int var3 = var2 - this.field1231;
		if (var3 >= 256) {
			var3 = 0;
		}
		this.field1231 = var2;
		if (var3 > 0) {
			this.method2207(var3);
		}
		this.method2213(var1);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "25")
	final void method2207(int var1) {
		this.field1229 += var1 * 128;
		int var2;
		if (this.field1229 > this.field1233.length) {
			this.field1229 -= this.field1233.length;
			var2 = ((int) (Math.random() * 12.0));
			this.method2215(this.sprites[var2]);
		}
		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;
		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1225[var3 + var2] - this.field1233[var2 + this.field1229 & this.field1233.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}
			this.field1225[var2++] = var6;
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
					this.field1225[var9 + var8] = 255;
				} else {
					this.field1225[var8 + var9] = 0;
				}
			}
		}
		if (this.field1235 > 0) {
			this.field1235 -= var1 * 4;
		}
		if (this.field1224 > 0) {
			this.field1224 -= var1 * 4;
		}
		if (this.field1235 == 0 && this.field1224 == 0) {
			var7 = ((int) (Math.random() * ((double) (2000 / var1))));
			if (var7 == 0) {
				this.field1235 = 1024;
			}
			if (var7 == 1) {
				this.field1224 = 1024;
			}
		}
		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1234[var7] = this.field1234[var7 + var1];
		}
		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1234[var7] = ((int) (Math.sin(((double) (this.field1218)) / 14.0) * 16.0 + Math.sin(((double) (this.field1218)) / 15.0) * 14.0 + Math.sin(((double) (this.field1218)) / 16.0) * 12.0));
			++this.field1218;
		}
		this.field1226 += var1;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;
			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1226 * 100; ++var11) {
				var12 = ((int) (Math.random() * ((double) (var10)))) + var17;
				var13 = ((int) (Math.random() * ((double) (var16)))) + var16;
				this.field1225[var12 + (var13 << 7)] = 192;
			}
			this.field1226 = 0;
			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;
				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1225[var7 + var13 + var14];
					}
					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1225[var13 + var14 - (var7 + 1)];
					}
					if (var14 >= 0) {
						this.field1214[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;
				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1214[var11 + var14 + var7 * 128];
					}
					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1214[var14 + var11 - (var7 + 1) * 128];
					}
					if (var13 >= 0) {
						this.field1225[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "80511097")
	final int method2212(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-53")
	final void method2213(int var1) {
		int var2 = this.field1219.length;
		if (this.field1235 > 0) {
			this.method2224(this.field1235, this.field1217);
		} else if (this.field1224 > 0) {
			this.method2224(this.field1224, this.field1222);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1219[var3] = this.field1220[var3];
			}
		}
		this.method2214(var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I[II)V", garbageValue = "-1744378164")
	final void method2224(int var1, int[] var2) {
		int var3 = this.field1219.length;
		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1219[var4] = this.method2212(this.field1220[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1219[var4] = var2[var4];
			} else {
				this.field1219[var4] = this.method2212(var2[var4], this.field1220[var4], 256 - var1);
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-72")
	final void method2214(int var1) {
		int var2 = 0;
		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1234[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}
			if (var5 + 128 >= Message.rasterProvider.width) {
				var7 = Message.rasterProvider.width - var5;
			}
			int var8 = var5 + (var3 + 8) * Message.rasterProvider.width;
			var2 += var6;
			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1225[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1219[var10];
					int var14 = Message.rasterProvider.pixels[var8];
					Message.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
				} else {
					++var8;
				}
			}
			var2 += 128 - var7;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lqu;I)V", garbageValue = "1412465779")
	final void method2215(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1233.length; ++var2) {
			this.field1233[var2] = 0;
		}
		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = ((int) (Math.random() * 128.0 * 256.0));
			this.field1233[var3] = ((int) (Math.random() * 256.0));
		}
		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1230[var5] = (this.field1233[var5 + 128] + this.field1233[var5 - 128] + this.field1233[var5 + 1] + this.field1233[var5 - 1]) / 4;
				}
			}
			int[] var8 = this.field1233;
			this.field1233 = this.field1230;
			this.field1230 = var8;
		}
		if (var1 != null) {
			var2 = 0;
			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1233[var7] = 0;
					}
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;Lpb;I)Lpb;", garbageValue = "-633051511")
	@Export("readStringIntParameters")
	static final IterableNodeHashTable readStringIntParameters(Buffer var0, IterableNodeHashTable var1) {
		int var2 = var0.readUnsignedByte();
		int var3;
		if (var1 == null) {
			var3 = class135.method2910(var2);
			var1 = new IterableNodeHashTable(var3);
		}
		for (var3 = 0; var3 < var2; ++var3) {
			boolean var4 = var0.readUnsignedByte() == 1;
			int var5 = var0.readMedium();
			Object var6;
			if (var4) {
				var6 = new ObjectNode(var0.readStringCp1252NullTerminated());
			} else {
				var6 = new IntegerNode(var0.readInt());
			}
			var1.put(((Node) (var6)), ((long) (var5)));
		}
		return var1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;I)V", garbageValue = "281700141")
	public static void method2233(AbstractArchive var0) {
		InvDefinition.InvDefinition_archive = var0;
	}
}