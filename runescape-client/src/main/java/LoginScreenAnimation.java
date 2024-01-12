import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lut;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ag")
	int[] field1259;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1893283719
	)
	int field1255;
	@ObfuscatedName("ae")
	int[] field1261;
	@ObfuscatedName("aa")
	int[] field1262;
	@ObfuscatedName("au")
	int[] field1263;
	@ObfuscatedName("an")
	int[] field1264;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1920516857
	)
	int field1269;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -570726311
	)
	int field1266;
	@ObfuscatedName("aw")
	int[] field1267;
	@ObfuscatedName("az")
	int[] field1268;
	@ObfuscatedName("av")
	int[] field1271;
	@ObfuscatedName("ak")
	int[] field1258;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 170101203
	)
	int field1265;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -84806288
	)
	int field1256;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -999232789
	)
	int field1273;

	@ObfuscatedSignature(
		descriptor = "([Lut;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1259 = new int[256];
		this.field1255 = 0;
		this.field1269 = 0;
		this.field1266 = 0;
		this.field1265 = 0;
		this.field1256 = 0;
		this.field1273 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2144749053"
	)
	@Export("initColors")
	void initColors() {
		this.field1262 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1262[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1262[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1262[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1262[var1 + 192] = 16777215;
		}

		this.field1263 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1263[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1263[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1263[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1263[var1 + 192] = 16777215;
		}

		this.field1264 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1264[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1264[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1264[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1264[var1 + 192] = 16777215;
		}

		this.field1261 = new int[256];
		this.field1265 = 0;
		this.field1271 = new int[32768];
		this.field1258 = new int[32768];
		this.method2517((IndexedSprite)null);
		this.field1267 = new int[32768];
		this.field1268 = new int[32768];
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2013516897"
	)
	void method2509() {
		this.field1262 = null;
		this.field1263 = null;
		this.field1264 = null;
		this.field1261 = null;
		this.field1271 = null;
		this.field1258 = null;
		this.field1267 = null;
		this.field1268 = null;
		this.field1265 = 0;
		this.field1256 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-532887178"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1267 == null) {
			this.initColors();
		}

		if (this.field1273 == 0) {
			this.field1273 = var2;
		}

		int var3 = var2 - this.field1273;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1273 = var2;
		if (var3 > 0) {
			this.method2502(var3);
		}

		this.method2504(var1);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "93279662"
	)
	final void method2502(int var1) {
		this.field1265 += var1 * 128;
		int var2;
		if (this.field1265 > this.field1271.length) {
			this.field1265 -= this.field1271.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2517(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1267[var3 + var2] - this.field1271[var2 + this.field1265 & this.field1271.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1267[var2++] = var6;
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
					this.field1267[var9 + var8] = 255;
				} else {
					this.field1267[var9 + var8] = 0;
				}
			}
		}

		if (this.field1269 * 16 > 0) {
			this.field1269 = this.field1269 * 16 - var1 * 4;
		}

		if (this.field1266 * 16 > 0) {
			this.field1266 = this.field1266 * 16 - var1 * 4;
		}

		if (this.field1269 * 16 == 0 && this.field1266 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1269 = 1024;
			}

			if (var7 == 1) {
				this.field1266 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1259[var7] = this.field1259[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1259[var7] = (int)(Math.sin((double)this.field1255 / 14.0D) * 16.0D + Math.sin((double)this.field1255 / 15.0D) * 14.0D + Math.sin((double)this.field1255 / 16.0D) * 12.0D);
			++this.field1255;
		}

		this.field1256 = this.field1256 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1256 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1267[var12 + (var13 << 7)] = 192;
			}

			this.field1256 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var7 + var14 < 128) {
						var12 += this.field1267[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1267[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1268[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var13 + var7 < 256) {
						var12 += this.field1268[var7 * 128 + var14 + var11];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1268[var11 + var14 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1267[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1619403608"
	)
	final int method2527(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var4 * (var1 & 65280) + var3 * (var2 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-56"
	)
	final void method2504(int var1) {
		int var2 = this.field1261.length;
		if (this.field1269 * 16 > 0) {
			this.method2505(this.field1269 * 16, this.field1263);
		} else if (this.field1266 * 16 > 0) {
			this.method2505(this.field1266 * 16, this.field1264);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1261[var3] = this.field1262[var3];
			}
		}

		this.method2506(var1);
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1714337478"
	)
	final void method2505(int var1, int[] var2) {
		int var3 = this.field1261.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1261[var4] = this.method2527(this.field1262[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1261[var4] = var2[var4];
			} else {
				this.field1261[var4] = this.method2527(var2[var4], this.field1262[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-826706835"
	)
	final void method2506(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1259[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= WorldMapData_1.rasterProvider.width) {
				var7 = WorldMapData_1.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * WorldMapData_1.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1267[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1261[var10];
					int var14 = WorldMapData_1.rasterProvider.pixels[var8];
					WorldMapData_1.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lut;I)V",
		garbageValue = "-781415280"
	)
	final void method2517(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1271.length; ++var2) {
			this.field1271[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1271[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1258[var5] = (this.field1271[var5 + 1] + this.field1271[var5 + 128] + this.field1271[var5 - 128] + this.field1271[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1271;
			this.field1271 = this.field1258;
			this.field1258 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1271[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "593423002"
	)
	static float method2530(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var2 * var3 + var0[var4];
		}

		return var3;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/ArrayList;IIIIZI)V",
		garbageValue = "1844567134"
	)
	public static void method2528(ArrayList var0, int var1, int var2, int var3, int var4, boolean var5) {
		if (!var0.isEmpty()) {
			class319.field3461.clear();
			class319.field3462.clear();
			if (var5) {
				class150.method3304();
			} else {
				for (int var6 = 0; var6 < class319.musicSongs.size(); ++var6) {
					MusicSong var7 = (MusicSong)class319.musicSongs.get(var6);
					if (var7 == null) {
						class319.musicSongs.remove(var6);
						--var6;
					} else if (var7.field3581) {
						if (var7.midiPcmStream.field3499 > 0) {
							--var7.midiPcmStream.field3499;
						}

						var7.midiPcmStream.clear();
						var7.midiPcmStream.method6075();
						var7.midiPcmStream.setPcmStreamVolume(0);
						class319.musicSongs.remove(var6);
						--var6;
					} else {
						var7.field3581 = true;
					}
				}
			}

			ByteArrayPool.method8035(var0, var5);
			if (!class319.field3461.isEmpty()) {
				WorldMapRectangle.method5019(var1, var2, var3, var4);
				class319.field3462.add(new AddRequestTask((SongTask)null));
				class319.field3462.add(new class424((SongTask)null, class319.field3458, class319.field3455, class319.field3456));
				ArrayList var12 = new ArrayList();
				var12.add(new class419(new FadeInTask((SongTask)null, 0, true, class319.field3454)));
				if (!class319.musicSongs.isEmpty()) {
					ArrayList var13 = new ArrayList();
					var13.add(new DelayFadeTask(new ConcurrentMidiTask((SongTask)null, var12), class319.field3465));
					ArrayList var9 = new ArrayList();
					Iterator var10 = class319.musicSongs.iterator();

					while (var10.hasNext()) {
						MusicSong var11 = (MusicSong)var10.next();
						var9.add(var11);
					}

					var13.add(new DelayFadeTask(new FadeOutTask(new class417((SongTask)null, var9), 0, false, class319.field3464), class319.musicPlayerStatus));
					class319.field3462.add(new ConcurrentMidiTask((SongTask)null, var13));
				} else {
					class319.field3462.add(new DelayFadeTask((SongTask)null, class319.field3465));
					class319.field3462.add(new ConcurrentMidiTask((SongTask)null, var12));
				}

			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-137066881"
	)
	public static void method2529() {
		PlayerComposition.PlayerAppearance_cachedModels.clear();
		PlayerComposition.field3651.clearFiles();
		PlayerComposition.field3652 = 0;
	}
}
