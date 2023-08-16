import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class129 implements Callable {
	@ObfuscatedName("gf")
	@ObfuscatedGetter(
		intValue = -1026582299
	)
	@Export("js5Port")
	static int js5Port;
	@ObfuscatedName("kz")
	@ObfuscatedGetter(
		intValue = 1065394883
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "Ljk;"
	)
	@Export("textureProvider")
	static TextureProvider textureProvider;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class130 field1543;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lft;"
	)
	final class131 field1540;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfs;"
	)
	final class132 field1541;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1155375763
	)
	final int field1542;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfv;"
	)
	final class137 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfv;Lfh;Lft;Lfs;I)V"
	)
	class129(class137 var1, class130 var2, class131 var3, class132 var4, int var5) {
		this.this$0 = var1;
		this.field1543 = var2;
		this.field1540 = var3;
		this.field1541 = var4;
		this.field1542 = var5;
	}

	public Object call() {
		this.field1543.method2993();
		class130[][] var1;
		if (this.field1540 == class131.field1581) {
			var1 = this.this$0.field1621;
		} else {
			var1 = this.this$0.field1627;
		}

		var1[this.field1542][this.field1541.method3036()] = this.field1543;
		return null;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Liv;[Lis;I)V",
		garbageValue = "2010483961"
	)
	static final void method2989(Scene var0, CollisionMap[] var1) {
		int var2;
		int var3;
		int var4;
		int var5;
		for (var2 = 0; var2 < 4; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				for (var4 = 0; var4 < 104; ++var4) {
					if ((Tiles.Tiles_renderFlags[var2][var3][var4] & 1) == 1) {
						var5 = var2;
						if ((Tiles.Tiles_renderFlags[1][var3][var4] & 2) == 2) {
							var5 = var2 - 1;
						}

						if (var5 >= 0) {
							var1[var5].setBlockedByFloor(var3, var4);
						}
					}
				}
			}
		}

		Tiles.rndHue += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndHue < -8) {
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += (int)(Math.random() * 5.0D) - 2;
		if (Tiles.rndLightness < -16) {
			Tiles.rndLightness = -16;
		}

		if (Tiles.rndLightness > 16) {
			Tiles.rndLightness = 16;
		}

		int var9;
		int var10;
		int var11;
		int var12;
		int var13;
		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		for (var2 = 0; var2 < 4; ++var2) {
			byte[][] var47 = class217.Tiles_underlays2[var2];
			boolean var60 = true;
			boolean var61 = true;
			boolean var6 = true;
			boolean var7 = true;
			boolean var8 = true;
			var9 = (int)Math.sqrt(5100.0D);
			var10 = var9 * 768 >> 8;

			int var19;
			int var57;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96;
					var57 = (var47[var12 - 1][var11] >> 2) + (var47[var12][var11 - 1] >> 2) + (var47[var12 + 1][var11] >> 3) + (var47[var12][var11 + 1] >> 3) + (var47[var12][var11] >> 1);
					class162.field1794[var12][var11] = var19 - var57;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				Fonts.Tiles_hue[var11] = 0;
				class466.Tiles_saturation[var11] = 0;
				Tiles.Tiles_lightness[var11] = 0;
				class128.Tiles_hueMultiplier[var11] = 0;
				Interpreter.field888[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						long var51 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var16 = (int)var51;
						var17 = Tiles.Tiles_underlays[var2][var13][var12] & var16;
						if (var17 > 0) {
							var19 = var17 - 1;
							FloorUnderlayDefinition var53 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var19);
							FloorUnderlayDefinition var54;
							if (var53 != null) {
								var54 = var53;
							} else {
								byte[] var21 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var19);
								var53 = new FloorUnderlayDefinition();
								if (var21 != null) {
									var53.decode(new Buffer(var21), var19);
								}

								var53.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var53, (long)var19);
								var54 = var53;
							}

							var10000 = Fonts.Tiles_hue;
							var10000[var12] += var54.hue;
							var10000 = class466.Tiles_saturation;
							var10000[var12] += var54.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] += var54.lightness;
							var10000 = class128.Tiles_hueMultiplier;
							var10000[var12] += var54.hueMultiplier;
							var10002 = Interpreter.field888[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						long var55 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var17 = (int)var55;
						var18 = Tiles.Tiles_underlays[var2][var14][var12] & var17;
						if (var18 > 0) {
							var57 = var18 - 1;
							FloorUnderlayDefinition var66 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var57);
							FloorUnderlayDefinition var59;
							if (var66 != null) {
								var59 = var66;
							} else {
								byte[] var58 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var57);
								var66 = new FloorUnderlayDefinition();
								if (var58 != null) {
									var66.decode(new Buffer(var58), var57);
								}

								var66.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var66, (long)var57);
								var59 = var66;
							}

							var10000 = Fonts.Tiles_hue;
							var10000[var12] -= var59.hue;
							var10000 = class466.Tiles_saturation;
							var10000[var12] -= var59.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] -= var59.lightness;
							var10000 = class128.Tiles_hueMultiplier;
							var10000[var12] -= var59.hueMultiplier;
							var10002 = Interpreter.field888[var12]--;
						}
					}
				}

				if (var11 >= 1 && var11 < 103) {
					var12 = 0;
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;

					for (var17 = -5; var17 < 109; ++var17) {
						var18 = var17 + 5;
						if (var18 >= 0 && var18 < 104) {
							var12 += Fonts.Tiles_hue[var18];
							var13 += class466.Tiles_saturation[var18];
							var14 += Tiles.Tiles_lightness[var18];
							var15 += class128.Tiles_hueMultiplier[var18];
							var16 += Interpreter.field888[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= Fonts.Tiles_hue[var19];
							var13 -= class466.Tiles_saturation[var19];
							var14 -= Tiles.Tiles_lightness[var19];
							var15 -= class128.Tiles_hueMultiplier[var19];
							var16 -= Interpreter.field888[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var22 = (int)var20;
							int var23 = Tiles.Tiles_underlays[var2][var11][var17] & var22;
							int var24 = class227.Tiles_overlays[var2][var11][var17] & var22;
							if (var23 > 0 || var24 > 0) {
								int var25 = Tiles.Tiles_heights[var2][var11][var17];
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var29 = class162.field1794[var11][var17];
								int var30 = class162.field1794[var11 + 1][var17];
								int var31 = class162.field1794[var11 + 1][var17 + 1];
								int var32 = class162.field1794[var11][var17 + 1];
								int var33 = -1;
								int var34 = -1;
								int var35;
								int var36;
								int var37;
								if (var23 > 0) {
									var35 = var12 * 256 / var15;
									var36 = var13 / var16;
									var37 = var14 / var16;
									var33 = class106.method2692(var35, var36, var37);
									var35 = var35 + Tiles.rndHue & 255;
									var37 += Tiles.rndLightness;
									if (var37 < 0) {
										var37 = 0;
									} else if (var37 > 255) {
										var37 = 255;
									}

									var34 = class106.method2692(var35, var36, var37);
								}

								FloorOverlayDefinition var38;
								if (var2 > 0) {
									boolean var67 = true;
									if (var23 == 0 && class172.Tiles_shapes[var2][var11][var17] != 0) {
										var67 = false;
									}

									if (var24 > 0) {
										var37 = var24 - 1;
										var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37);
										FloorOverlayDefinition var48;
										if (var38 != null) {
											var48 = var38;
										} else {
											byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37);
											var38 = new FloorOverlayDefinition();
											if (var39 != null) {
												var38.decode(new Buffer(var39), var37);
											}

											var38.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37);
											var48 = var38;
										}

										if (!var48.hideUnderlay) {
											var67 = false;
										}
									}

									if (var67 && var26 == var25 && var27 == var25 && var25 == var28) {
										var10000 = BufferedNetSocket.field4679[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0;
								if (var34 != -1) {
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[UserComparator7.method2878(var34, 96)];
								}

								if (var24 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, UserComparator7.method2878(var33, var29), UserComparator7.method2878(var33, var30), UserComparator7.method2878(var33, var31), UserComparator7.method2878(var33, var32), 0, 0, 0, 0, var35, 0);
								} else {
									var36 = class172.Tiles_shapes[var2][var11][var17] + 1;
									byte var68 = ModelData0.field2833[var2][var11][var17];
									int var49 = var24 - 1;
									FloorOverlayDefinition var40 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var49);
									if (var40 != null) {
										var38 = var40;
									} else {
										byte[] var41 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var49);
										var40 = new FloorOverlayDefinition();
										if (var41 != null) {
											var40.decode(new Buffer(var41), var49);
										}

										var40.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var40, (long)var49);
										var38 = var40;
									}

									int var50 = var38.texture;
									int var42;
									int var43;
									int var44;
									int var45;
									if (var50 >= 0) {
										var43 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var50);
										var42 = -1;
									} else if (var38.primaryRgb == 16711935) {
										var42 = -2;
										var50 = -1;
										var43 = -2;
									} else {
										var42 = class106.method2692(var38.hue, var38.saturation, var38.lightness);
										var44 = var38.hue + Tiles.rndHue & 255;
										var45 = var38.lightness + Tiles.rndLightness;
										if (var45 < 0) {
											var45 = 0;
										} else if (var45 > 255) {
											var45 = 255;
										}

										var43 = class106.method2692(var44, var38.saturation, var45);
									}

									var44 = 0;
									if (var43 != -2) {
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[Client.method1800(var43, 96)];
									}

									if (var38.secondaryRgb != -1) {
										var45 = var38.secondaryHue + Tiles.rndHue & 255;
										int var46 = var38.secondaryLightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var43 = class106.method2692(var45, var38.secondarySaturation, var46);
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[Client.method1800(var43, 96)];
									}

									var0.addTile(var2, var11, var17, var36, var68, var50, var25, var26, var27, var28, UserComparator7.method2878(var33, var29), UserComparator7.method2878(var33, var30), UserComparator7.method2878(var33, var31), UserComparator7.method2878(var33, var32), Client.method1800(var42, var29), Client.method1800(var42, var30), Client.method1800(var42, var31), Client.method1800(var42, var32), var35, var44);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var0.setTileMinPlane(var2, var12, var11, ViewportMouse.method4919(var2, var12, var11));
				}
			}

			Tiles.Tiles_underlays[var2] = null;
			class227.Tiles_overlays[var2] = null;
			class172.Tiles_shapes[var2] = null;
			ModelData0.field2833[var2] = null;
			class217.Tiles_underlays2[var2] = null;
		}

		var0.method4556(-50, -10, -50);

		for (var2 = 0; var2 < 104; ++var2) {
			for (var3 = 0; var3 < 104; ++var3) {
				if ((Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var0.setLinkBelow(var2, var3);
				}
			}
		}

		var2 = 1;
		var3 = 2;
		var4 = 4;

		for (var5 = 0; var5 < 4; ++var5) {
			if (var5 > 0) {
				var2 <<= 3;
				var3 <<= 3;
				var4 <<= 3;
			}

			for (int var62 = 0; var62 <= var5; ++var62) {
				for (int var63 = 0; var63 <= 104; ++var63) {
					for (int var64 = 0; var64 <= 104; ++var64) {
						short var65;
						if ((BufferedNetSocket.field4679[var62][var64][var63] & var2) != 0) {
							var9 = var63;
							var10 = var63;
							var11 = var62;

							for (var12 = var62; var9 > 0 && (BufferedNetSocket.field4679[var62][var64][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (BufferedNetSocket.field4679[var62][var64][var10 + 1] & var2) != 0) {
								++var10;
							}

							label464:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((BufferedNetSocket.field4679[var11 - 1][var64][var13] & var2) == 0) {
										break label464;
									}
								}

								--var11;
							}

							label453:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((BufferedNetSocket.field4679[var12 + 1][var64][var13] & var2) == 0) {
										break label453;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var65 = 240;
								var15 = Tiles.Tiles_heights[var12][var64][var9] - var65;
								var16 = Tiles.Tiles_heights[var11][var64][var9];
								Scene.Scene_addOccluder(var5, 1, var64 * 128, var64 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = BufferedNetSocket.field4679[var17][var64];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((BufferedNetSocket.field4679[var62][var64][var63] & var3) != 0) {
							var9 = var64;
							var10 = var64;
							var11 = var62;

							for (var12 = var62; var9 > 0 && (BufferedNetSocket.field4679[var62][var9 - 1][var63] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (BufferedNetSocket.field4679[var62][var10 + 1][var63] & var3) != 0) {
								++var10;
							}

							label517:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((BufferedNetSocket.field4679[var11 - 1][var13][var63] & var3) == 0) {
										break label517;
									}
								}

								--var11;
							}

							label506:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((BufferedNetSocket.field4679[var12 + 1][var13][var63] & var3) == 0) {
										break label506;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var65 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var63] - var65;
								var16 = Tiles.Tiles_heights[var11][var9][var63];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var63 * 128, var63 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = BufferedNetSocket.field4679[var17][var18];
										var10000[var63] &= ~var3;
									}
								}
							}
						}

						if ((BufferedNetSocket.field4679[var62][var64][var63] & var4) != 0) {
							var9 = var64;
							var10 = var64;
							var11 = var63;

							for (var12 = var63; var11 > 0 && (BufferedNetSocket.field4679[var62][var64][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (BufferedNetSocket.field4679[var62][var64][var12 + 1] & var4) != 0) {
								++var12;
							}

							label570:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((BufferedNetSocket.field4679[var62][var9 - 1][var13] & var4) == 0) {
										break label570;
									}
								}

								--var9;
							}

							label559:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((BufferedNetSocket.field4679[var62][var10 + 1][var13] & var4) == 0) {
										break label559;
									}
								}

								++var10;
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var62][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = BufferedNetSocket.field4679[var62][var14];
										var10000[var15] &= ~var4;
									}
								}
							}
						}
					}
				}
			}
		}

	}
}
