import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dh")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("nf")
	@ObfuscatedGetter(
		intValue = -549479619
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("ab")
	int[] field1288;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -911474439
	)
	int field1289;
	@ObfuscatedName("ad")
	int[] field1290;
	@ObfuscatedName("al")
	int[] field1291;
	@ObfuscatedName("as")
	int[] field1292;
	@ObfuscatedName("ag")
	int[] field1286;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 74901507
	)
	int field1301;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 115615185
	)
	int field1283;
	@ObfuscatedName("ar")
	int[] field1294;
	@ObfuscatedName("aj")
	int[] field1300;
	@ObfuscatedName("au")
	int[] field1298;
	@ObfuscatedName("ay")
	int[] field1299;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1820880793
	)
	int field1293;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -2085532876
	)
	int field1295;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -85121957
	)
	int field1302;

	@ObfuscatedSignature(
		descriptor = "([Lvl;)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1) {
		this.field1288 = new int[256];
		this.field1289 = 0;
		this.field1301 = 0;
		this.field1283 = 0;
		this.field1293 = 0;
		this.field1295 = 0;
		this.field1302 = 0;
		this.sprites = var1;
		this.initColors();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1665687449"
	)
	@Export("initColors")
	void initColors() {
		this.field1291 = new int[256];

		int var1;
		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1] = var1 * 262144;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1 + 64] = var1 * 1024 + 16711680;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1 + 128] = var1 * 4 + 16776960;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1291[var1 + 192] = 16777215;
		}

		this.field1292 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1292[var1] = var1 * 1024;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1292[var1 + 64] = var1 * 4 + 65280;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1292[var1 + 128] = var1 * 262144 + 65535;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1292[var1 + 192] = 16777215;
		}

		this.field1286 = new int[256];

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1286[var1] = var1 * 4;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1286[var1 + 64] = var1 * 262144 + 255;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1286[var1 + 128] = var1 * 1024 + 16711935;
		}

		for (var1 = 0; var1 < 64; ++var1) {
			this.field1286[var1 + 192] = 16777215;
		}

		this.field1290 = new int[256];
		this.field1293 = 0;
		this.field1298 = new int[32768];
		this.field1299 = new int[32768];
		this.method2440((IndexedSprite)null);
		this.field1294 = new int[32768];
		this.field1300 = new int[32768];
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "31515"
	)
	void method2433() {
		this.field1291 = null;
		this.field1292 = null;
		this.field1286 = null;
		this.field1290 = null;
		this.field1298 = null;
		this.field1299 = null;
		this.field1294 = null;
		this.field1300 = null;
		this.field1293 = 0;
		this.field1295 = 0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-826629596"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1294 == null) {
			this.initColors();
		}

		if (this.field1302 == 0) {
			this.field1302 = var2;
		}

		int var3 = var2 - this.field1302;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1302 = var2;
		if (var3 > 0) {
			this.method2434(var3);
		}

		this.method2437(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "114"
	)
	final void method2434(int var1) {
		this.field1293 += 128 * var1;
		int var2;
		if (this.field1293 > this.field1298.length) {
			this.field1293 -= this.field1298.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2440(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1294[var2 + var3] - this.field1298[var2 + this.field1293 & this.field1298.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1294[var2++] = var6;
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
					this.field1294[var9 + var8] = 255;
				} else {
					this.field1294[var9 + var8] = 0;
				}
			}
		}

		if (this.field1301 * 16 > 0) {
			this.field1301 = this.field1301 * 16 - var1 * 4;
		}

		if (this.field1283 * 16 > 0) {
			this.field1283 = this.field1283 * 16 - var1 * 4;
		}

		if (this.field1301 * 16 == 0 && this.field1283 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1301 = 1024;
			}

			if (var7 == 1) {
				this.field1283 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1288[var7] = this.field1288[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1288[var7] = (int)(Math.sin((double)this.field1289 / 14.0D) * 16.0D + Math.sin((double)this.field1289 / 15.0D) * 14.0D + Math.sin((double)this.field1289 / 16.0D) * 12.0D);
			++this.field1289;
		}

		this.field1295 = this.field1295 * 10000 + var1 * 100;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1295 * 10000; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1294[var12 + (var13 << 7)] = 192;
			}

			this.field1295 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1294[var7 + var14 + var13];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1294[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1300[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1300[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1300[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1294[var14 + var11] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "1749331098"
	)
	final int method2436(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 16711935) + var4 * (var1 & 16711935) & -16711936) + (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) >> 8;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "124"
	)
	final void method2437(int var1) {
		int var2 = this.field1290.length;
		if (this.field1301 * 16 > 0) {
			this.method2432(this.field1301 * 16, this.field1292);
		} else if (this.field1283 * 16 > 0) {
			this.method2432(this.field1283 * 16, this.field1286);
		} else {
			for (int var3 = 0; var3 < var2; ++var3) {
				this.field1290[var3] = this.field1291[var3];
			}
		}

		this.method2438(var1);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "-1361327655"
	)
	final void method2432(int var1, int[] var2) {
		int var3 = this.field1290.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1290[var4] = this.method2436(this.field1291[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1290[var4] = var2[var4];
			} else {
				this.field1290[var4] = this.method2436(var2[var4], this.field1291[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1162704482"
	)
	final void method2438(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1288[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= UserComparator9.rasterProvider.width) {
				var7 = UserComparator9.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * UserComparator9.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1294[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1290[var10];
					int var14 = UserComparator9.rasterProvider.pixels[var8];
					UserComparator9.rasterProvider.pixels[var8++] = -16777216 | ((var14 & 16711935) * var13 + (var10 & 16711935) * var12 & -16711936) + (var13 * (var14 & 65280) + var12 * (var10 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lvl;S)V",
		garbageValue = "8073"
	)
	final void method2440(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1298.length; ++var2) {
			this.field1298[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1298[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1299[var5] = (this.field1298[var5 + 128] + this.field1298[var5 - 128] + this.field1298[var5 + 1] + this.field1298[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1298;
			this.field1298 = this.field1299;
			this.field1299 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1298[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lun;IB)V",
		garbageValue = "103"
	)
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}

		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1147 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (DevicePcmPlayerProvider.baseY * 64 + var4.pathY[0] >> 13) + (GrandExchangeOfferOwnWorldComparator.baseX * 64 + var4.pathX[0] >> 13 << 14);
				if (var4.field1272 != -1) {
					Players.Players_orientations[var1] = var4.field1272;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}

				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					class362.updateExternalPlayer(var0, var1);
				}

			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1147 = false;
				} else if (var2) {
					var4.field1147 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1147 = false;
					var4.method2342(var6, var7, Players.field1383[var1]);
				}

			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}

				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1147 = false;
				} else if (var2) {
					var4.field1147 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1147 = false;
					var4.method2342(var6, var7, Players.field1383[var1]);
				}

			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}

					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}

					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1147 = false;
					} else if (var2) {
						var4.field1147 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1147 = false;
						var4.method2342(var10, var11, Players.field1383[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						class172.Client_plane = var4.plane;
					}

				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (GrandExchangeOfferOwnWorldComparator.baseX * 64 + var8 + var4.pathX[0] & 16383) - GrandExchangeOfferOwnWorldComparator.baseX * 64;
					var11 = (DevicePcmPlayerProvider.baseY * 64 + var9 + var4.pathY[0] & 16383) - DevicePcmPlayerProvider.baseY * 64;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1147 = false;
					} else if (var2) {
						var4.field1147 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1147 = false;
						var4.method2342(var10, var11, Players.field1383[var1]);
					}

					var4.plane = (byte)(var7 + var4.plane & 3);
					if (Client.localPlayerIndex == var1) {
						class172.Client_plane = var4.plane;
					}

				}
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lnt;II)V",
		garbageValue = "-113724725"
	)
	@Export("Widget_setKeyIgnoreHeld")
	static final void Widget_setKeyIgnoreHeld(Widget var0, int var1) {
		if (var0.field3836 == null) {
			throw new RuntimeException();
		} else {
			if (var0.field3766 == null) {
				var0.field3766 = new int[var0.field3836.length];
			}

			var0.field3766[var1] = Integer.MAX_VALUE;
		}
	}
}
