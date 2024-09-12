import java.awt.datatransfer.Clipboard;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dn")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("dq")
	@ObfuscatedSignature(
		descriptor = "Ldh;"
	)
	@Export("mouseRecorder")
	static MouseRecorder mouseRecorder;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	@Export("sprites")
	IndexedSprite[] sprites;
	@ObfuscatedName("af")
	int[] field1316;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -864181171
	)
	int field1312;
	@ObfuscatedName("au")
	int[] field1313;
	@ObfuscatedName("ar")
	int[] field1320;
	@ObfuscatedName("al")
	int[] field1315;
	@ObfuscatedName("ad")
	int[] field1325;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1729133059
	)
	int field1317;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -2142085503
	)
	int field1327;
	@ObfuscatedName("ab")
	int[] field1319;
	@ObfuscatedName("az")
	int[] field1318;
	@ObfuscatedName("aa")
	int[] field1321;
	@ObfuscatedName("ai")
	int[] field1322;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1301718289
	)
	int field1323;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1106093264
	)
	int field1324;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1540874513
	)
	int field1314;
	@ObfuscatedName("aj")
	final int[][] field1326;

	@ObfuscatedSignature(
		descriptor = "([Lvt;[[I)V"
	)
	LoginScreenAnimation(IndexedSprite[] var1, int[][] var2) {
		this.field1316 = new int[256];
		this.field1312 = 0;
		this.field1317 = 0;
		this.field1327 = 0;
		this.field1323 = 0;
		this.field1324 = 0;
		this.field1314 = 0;
		this.sprites = var1;
		this.field1326 = var2;
		this.initColors();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "350055362"
	)
	@Export("initColors")
	void initColors() {
		this.field1320 = class138.method3359(this.field1326[0][0], this.field1326[0][1], this.field1326[0][2], this.field1326[0][3], this.field1326[0][4]);
		this.field1315 = class138.method3359(this.field1326[1][0], this.field1326[1][1], this.field1326[1][2], this.field1326[1][3], this.field1326[1][4]);
		this.field1325 = class138.method3359(this.field1326[2][0], this.field1326[2][1], this.field1326[2][2], this.field1326[2][3], this.field1326[2][4]);
		this.field1313 = new int[256];
		this.field1323 = 0;
		this.field1321 = new int[32768];
		this.field1322 = new int[32768];
		this.method2712((IndexedSprite)null);
		this.field1319 = new int[32768];
		this.field1318 = new int[32768];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-43"
	)
	void method2732() {
		this.field1320 = null;
		this.field1315 = null;
		this.field1325 = null;
		this.field1313 = null;
		this.field1321 = null;
		this.field1322 = null;
		this.field1319 = null;
		this.field1318 = null;
		this.field1323 = 0;
		this.field1324 = 0;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "56"
	)
	@Export("draw")
	void draw(int var1, int var2) {
		if (this.field1319 == null) {
			this.initColors();
		}

		if (this.field1314 == 0) {
			this.field1314 = var2;
		}

		int var3 = var2 - this.field1314;
		if (var3 >= 256) {
			var3 = 0;
		}

		this.field1314 = var2;
		if (var3 > 0) {
			this.method2699(var3);
		}

		this.method2696(var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1349579036"
	)
	final void method2699(int var1) {
		this.field1323 += var1 * 128;
		int var2;
		if (this.field1323 > this.field1321.length) {
			this.field1323 -= this.field1321.length;
			var2 = (int)(Math.random() * 12.0D);
			this.method2712(this.sprites[var2]);
		}

		var2 = 0;
		int var3 = var1 * 128;
		int var4 = (256 - var1) * 128;

		int var6;
		for (int var5 = 0; var5 < var4; ++var5) {
			var6 = this.field1319[var3 + var2] - this.field1321[var2 + this.field1323 & this.field1321.length - 1] * var1 / 6;
			if (var6 < 0) {
				var6 = 0;
			}

			this.field1319[var2++] = var6;
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
					this.field1319[var9 + var8] = 255;
				} else {
					this.field1319[var8 + var9] = 0;
				}
			}
		}

		if (this.field1317 * 16 > 0) {
			this.field1317 = this.field1317 * 16 - var1 * 4;
		}

		if (this.field1327 * 16 > 0) {
			this.field1327 = this.field1327 * 16 - var1 * 4;
		}

		if (this.field1317 * 16 == 0 && this.field1327 * 16 == 0) {
			var7 = (int)(Math.random() * (double)(2000 / var1));
			if (var7 == 0) {
				this.field1317 = 1024;
			}

			if (var7 == 1) {
				this.field1327 = 1024;
			}
		}

		for (var7 = 0; var7 < 256 - var1; ++var7) {
			this.field1316[var7] = this.field1316[var7 + var1];
		}

		for (var7 = 256 - var1; var7 < 256; ++var7) {
			this.field1316[var7] = (int)(Math.sin((double)this.field1312 / 14.0D) * 16.0D + Math.sin((double)this.field1312 / 15.0D) * 14.0D + Math.sin((double)this.field1312 / 16.0D) * 12.0D);
			++this.field1312;
		}

		this.field1324 = this.field1324 * 10000 + var1 * 10000;
		var7 = ((Client.cycle & 1) + var1) / 2;
		if (var7 > 0) {
			short var16 = 128;
			byte var17 = 2;
			var10 = 128 - var17 - var17;

			int var11;
			int var12;
			int var13;
			for (var11 = 0; var11 < this.field1324 * 100; ++var11) {
				var12 = (int)(Math.random() * (double)var10) + var17;
				var13 = (int)(Math.random() * (double)var16) + var16;
				this.field1319[var12 + (var13 << 7)] = 192;
			}

			this.field1324 = 0;

			int var14;
			for (var11 = 0; var11 < 256; ++var11) {
				var12 = 0;
				var13 = var11 * 128;

				for (var14 = -var7; var14 < 128; ++var14) {
					if (var14 + var7 < 128) {
						var12 += this.field1319[var7 + var13 + var14];
					}

					if (var14 - (var7 + 1) >= 0) {
						var12 -= this.field1319[var14 + var13 - (var7 + 1)];
					}

					if (var14 >= 0) {
						this.field1318[var13 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}

			for (var11 = 0; var11 < 128; ++var11) {
				var12 = 0;

				for (var13 = -var7; var13 < 256; ++var13) {
					var14 = var13 * 128;
					if (var7 + var13 < 256) {
						var12 += this.field1318[var11 + var14 + var7 * 128];
					}

					if (var13 - (var7 + 1) >= 0) {
						var12 -= this.field1318[var14 + var11 - (var7 + 1) * 128];
					}

					if (var13 >= 0) {
						this.field1319[var11 + var14] = var12 / (var7 * 2 + 1);
					}
				}
			}
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-68"
	)
	final int method2716(int var1, int var2, int var3) {
		int var4 = 256 - var3;
		return (var3 * (var2 & 65280) + var4 * (var1 & 65280) & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1034275004"
	)
	final void method2696(int var1) {
		int var2 = this.field1313.length;
		if (this.field1317 * 16 > 0) {
			this.method2702(this.field1317 * 16, this.field1315);
		} else if (this.field1327 * 16 > 0) {
			this.method2702(this.field1327 * 16, this.field1325);
		} else {
			System.arraycopy(this.field1320, 0, this.field1313, 0, var2);
		}

		this.method2729(var1);
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I[II)V",
		garbageValue = "2070790181"
	)
	final void method2702(int var1, int[] var2) {
		int var3 = this.field1313.length;

		for (int var4 = 0; var4 < var3; ++var4) {
			if (var1 > 768) {
				this.field1313[var4] = this.method2716(this.field1320[var4], var2[var4], 1024 - var1);
			} else if (var1 > 256) {
				this.field1313[var4] = var2[var4];
			} else {
				this.field1313[var4] = this.method2716(var2[var4], this.field1320[var4], 256 - var1);
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-739353093"
	)
	final void method2729(int var1) {
		int var2 = 0;

		for (int var3 = 1; var3 < 255; ++var3) {
			int var4 = (256 - var3) * this.field1316[var3] / 256;
			int var5 = var4 + var1;
			int var6 = 0;
			int var7 = 128;
			if (var5 < 0) {
				var6 = -var5;
				var5 = 0;
			}

			if (var5 + 128 >= class310.rasterProvider.width) {
				var7 = class310.rasterProvider.width - var5;
			}

			int var8 = var5 + (var3 + 8) * class310.rasterProvider.width;
			var2 += var6;

			for (int var9 = var6; var9 < var7; ++var9) {
				int var10 = this.field1319[var2++];
				int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
				if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
					int var12 = var10;
					int var13 = 256 - var10;
					var10 = this.field1313[var10];
					int var14 = class310.rasterProvider.pixels[var8];
					class310.rasterProvider.pixels[var8++] = -16777216 | ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) + (var12 * (var10 & 65280) + var13 * (var14 & 65280) & 16711680) >> 8;
				} else {
					++var8;
				}
			}

			var2 += 128 - var7;
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Lvt;I)V",
		garbageValue = "-2092129529"
	)
	final void method2712(IndexedSprite var1) {
		int var2;
		for (var2 = 0; var2 < this.field1321.length; ++var2) {
			this.field1321[var2] = 0;
		}

		int var3;
		for (var2 = 0; var2 < 5000; ++var2) {
			var3 = (int)(Math.random() * 128.0D * 256.0D);
			this.field1321[var3] = (int)(Math.random() * 256.0D);
		}

		int var4;
		int var5;
		for (var2 = 0; var2 < 20; ++var2) {
			for (var3 = 1; var3 < 255; ++var3) {
				for (var4 = 1; var4 < 127; ++var4) {
					var5 = var4 + (var3 << 7);
					this.field1322[var5] = (this.field1321[var5 + 1] + this.field1321[var5 - 128] + this.field1321[var5 + 128] + this.field1321[var5 - 1]) / 4;
				}
			}

			int[] var8 = this.field1321;
			this.field1321 = this.field1322;
			this.field1322 = var8;
		}

		if (var1 != null) {
			var2 = 0;

			for (var3 = 0; var3 < var1.subHeight * -117168624; ++var3) {
				for (var4 = 0; var4 < var1.subWidth; ++var4) {
					if (var1.pixels[var2++] != 0) {
						var5 = var4 + var1.xOffset + 16;
						int var6 = var3 + var1.yOffset + 16;
						int var7 = var5 + (var6 << 7);
						this.field1321[var7] = 0;
					}
				}
			}
		}

	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)Lux;",
		garbageValue = "-4"
	)
	public static class537 method2733(int var0) {
		int var1 = class535.field5326[var0];
		if (var1 == 1) {
			return class537.field5332;
		} else if (var1 == 2) {
			return class537.field5331;
		} else {
			return var1 == 3 ? class537.field5333 : null;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1676603046"
	)
	public static boolean method2727(int var0) {
		return var0 >= WorldMapDecorationType.field4050.id && var0 <= WorldMapDecorationType.field4042.id || var0 == WorldMapDecorationType.field4043.id;
	}

	@ObfuscatedName("ot")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	static final void method2731() {
		PacketBufferNode var0 = class141.getPacketBufferNode(ClientPacket.CLOSE_MODAL, Client.packetWriter.isaacCipher);
		Client.packetWriter.addNode(var0);
		Interpreter.field886 = true;

		for (InterfaceParent var1 = (InterfaceParent)Client.interfaceParents.first(); var1 != null; var1 = (InterfaceParent)Client.interfaceParents.next()) {
			if (var1.type == 0 || var1.type == 3) {
				class145.closeInterface(var1, true);
			}
		}

		if (Client.meslayerContinueWidget != null) {
			SecureRandomCallable.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		Interpreter.field886 = false;
	}

	@ObfuscatedName("pi")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "2084956744"
	)
	public static Clipboard method2730() {
		return class1.client.method487();
	}
}
