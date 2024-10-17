import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class132 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1247746503
	)
	int field1538;
	@ObfuscatedName("aw")
	float field1541;
	@ObfuscatedName("ak")
	float field1542;
	@ObfuscatedName("aj")
	float field1540;
	@ObfuscatedName("ai")
	float field1543;
	@ObfuscatedName("ay")
	float field1537;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfa;"
	)
	class132 field1539;

	class132() {
		this.field1542 = Float.MAX_VALUE;
		this.field1540 = Float.MAX_VALUE;
		this.field1543 = Float.MAX_VALUE;
		this.field1537 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;II)V",
		garbageValue = "1701688479"
	)
	void method3358(Buffer var1, int var2) {
		this.field1538 = var1.readShort();
		this.field1541 = var1.method10096();
		this.field1542 = var1.method10096();
		this.field1540 = var1.method10096();
		this.field1543 = var1.method10096();
		this.field1537 = var1.method10096();
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1650000045"
	)
	static int method3366(int var0, int var1) {
		FloorOverlayDefinition var3 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var0);
		FloorOverlayDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			byte[] var4 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var0);
			var3 = new FloorOverlayDefinition();
			if (var4 != null) {
				var3.decode(new Buffer(var4), var0);
			}

			var3.postDecode();
			FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var3, (long)var0);
			var2 = var3;
		}

		if (var2 == null) {
			return var1;
		} else {
			int var5;
			int var6;
			int var7;
			int var8;
			int var9;
			if (var2.secondaryRgb >= 0) {
				var5 = var2.secondaryHue;
				var6 = var2.secondarySaturation;
				var7 = var2.secondaryLightness;
				if (var7 > 179) {
					var6 /= 2;
				}

				if (var7 > 192) {
					var6 /= 2;
				}

				if (var7 > 217) {
					var6 /= 2;
				}

				if (var7 > 243) {
					var6 /= 2;
				}

				var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10);
				var9 = class289.method6204(var8, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216;
			} else if (var2.texture >= 0) {
				int var10 = class289.method6204(Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var2.texture), 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
			} else if (var2.primaryRgb == 16711935) {
				return var1;
			} else {
				var5 = var2.hue;
				var6 = var2.saturation;
				var7 = var2.lightness;
				if (var7 > 179) {
					var6 /= 2;
				}

				if (var7 > 192) {
					var6 /= 2;
				}

				if (var7 > 217) {
					var6 /= 2;
				}

				if (var7 > 243) {
					var6 /= 2;
				}

				var8 = (var6 / 32 << 7) + var7 / 2 + (var5 / 4 << 10);
				var9 = class289.method6204(var8, 96);
				return Rasterizer3D.Rasterizer3D_colorPalette[var9] | -16777216;
			}
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([Lct;II[I[II)V",
		garbageValue = "2033471635"
	)
	@Export("sortWorlds")
	static void sortWorlds(World[] var0, int var1, int var2, int[] var3, int[] var4) {
		if (var1 < var2) {
			int var5 = var1 - 1;
			int var6 = var2 + 1;
			int var7 = (var2 + var1) / 2;
			World var8 = var0[var7];
			var0[var7] = var0[var1];
			var0[var1] = var8;

			while (var5 < var6) {
				boolean var9 = true;

				int var10;
				int var11;
				int var12;
				do {
					--var6;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var6].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var6].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var6].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var6].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 <= var12) && (var4[var10] != 0 || var11 >= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				var9 = true;

				do {
					++var5;

					for (var10 = 0; var10 < 4; ++var10) {
						if (var3[var10] == 2) {
							var11 = var0[var5].index;
							var12 = var8.index;
						} else if (var3[var10] == 1) {
							var11 = var0[var5].population;
							var12 = var8.population;
							if (var11 == -1 && var4[var10] == 1) {
								var11 = 2001;
							}

							if (var12 == -1 && var4[var10] == 1) {
								var12 = 2001;
							}
						} else if (var3[var10] == 3) {
							var11 = var0[var5].isMembersOnly() ? 1 : 0;
							var12 = var8.isMembersOnly() ? 1 : 0;
						} else {
							var11 = var0[var5].id;
							var12 = var8.id;
						}

						if (var11 != var12) {
							if ((var4[var10] != 1 || var11 >= var12) && (var4[var10] != 0 || var11 <= var12)) {
								var9 = false;
							}
							break;
						}

						if (var10 == 3) {
							var9 = false;
						}
					}
				} while(var9);

				if (var5 < var6) {
					World var13 = var0[var5];
					var0[var5] = var0[var6];
					var0[var6] = var13;
				}
			}

			sortWorlds(var0, var1, var6, var3, var4);
			sortWorlds(var0, var6 + 1, var2, var3, var4);
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lng;I[B[BI)V",
		garbageValue = "995187128"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3958 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3958 = new byte[11][];
			var0.field3959 = new byte[11][];
			var0.field3995 = new int[11];
			var0.field3961 = new int[11];
		}

		var0.field3958[var1] = var2;
		if (var2 != null) {
			var0.field3957 = true;
		} else {
			var0.field3957 = false;

			for (int var4 = 0; var4 < var0.field3958.length; ++var4) {
				if (var0.field3958[var4] != null) {
					var0.field3957 = true;
					break;
				}
			}
		}

		var0.field3959[var1] = var3;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "-1059127340"
	)
	@Export("setLoginResponseString")
	static void setLoginResponseString(String var0, String var1, String var2) {
		Login.Login_response1 = var0;
		Login.Login_response2 = var1;
		Login.Login_response3 = var2;
	}
}
