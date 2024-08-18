import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public class class430 implements Iterator {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lqc;"
	)
	class431 field4713;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -2094353117
	)
	int field4715;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -258673749
	)
	int field4714;

	@ObfuscatedSignature(
		descriptor = "(Lqc;)V"
	)
	class430(class431 var1) {
		this.field4715 = 0;
		this.field4714 = this.field4713.field4719;
		this.field4713 = var1;
	}

	public boolean hasNext() {
		return this.field4715 < this.field4713.field4718;
	}

	public Object next() {
		if (this.field4713.field4719 != this.field4714) {
			throw new ConcurrentModificationException();
		} else if (this.field4715 < this.field4713.field4718) {
			Object var1 = this.field4713.field4720[this.field4715].field4710;
			++this.field4715;
			return var1;
		} else {
			throw new NoSuchElementException();
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ldy;B)V",
		garbageValue = "-6"
	)
	static final void method7978(WorldView var0) {
		int var1 = var0.sizeX;
		int var2 = var0.sizeY;
		int[][][] var3 = var0.tileHeights;
		byte[][][] var4 = var0.tileSettings;
		Scene var5 = var0.scene;
		CollisionMap[] var6 = var0.collisionMaps;

		int var7;
		int var8;
		int var9;
		int var10;
		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < var1; ++var8) {
				for (var9 = 0; var9 < var2; ++var9) {
					if ((var0.tileSettings[var7][var8][var9] & 1) == 1) {
						var10 = var7;
						if ((var0.tileSettings[1][var8][var9] & 2) == 2) {
							var10 = var7 - 1;
						}

						if (var10 >= 0 && var6 != null) {
							var6[var10].setBlockedByFloor(var8, var9);
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

		int var14;
		int var15;
		int var16;
		int[] var10000;
		int var17;
		int var18;
		int var19;
		int var20;
		int var21;
		int var22;
		int var23;
		for (var7 = 0; var7 < 4; ++var7) {
			byte[][] var50 = class431.Tiles_underlays2[var7];
			boolean var58 = true;
			boolean var59 = true;
			boolean var11 = true;
			boolean var12 = true;
			boolean var13 = true;
			var14 = (int)Math.sqrt(5100.0D);
			var15 = var14 * 768 >> 8;

			int var24;
			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var18 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
					var20 = (int)Math.sqrt((double)(var18 * var18 + var19 * var19 + 65536));
					var21 = (var18 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var23 * -50 + var21 * -50 + var22 * -10) / var15 + 96;
					int var57 = (var50[var17 - 1][var16] >> 2) + (var50[var17][var16 - 1] >> 2) + (var50[var17 + 1][var16] >> 3) + (var50[var17][var16 + 1] >> 3) + (var50[var17][var16] >> 1);
					Tiles.field1032[var17][var16] = var24 - var57;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				Tiles.Tiles_hue[var16] = 0;
				Huffman.Tiles_saturation[var16] = 0;
				Tiles.Tiles_lightness[var16] = 0;
				class361.Tiles_hueMultiplier[var16] = 0;
				class36.field218[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				for (var17 = 0; var17 < var2; ++var17) {
					var18 = var16 + 5;
					int var10002;
					if (var18 >= 0 && var18 < var1) {
						long var53 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var21 = (int)var53;
						var22 = Tiles.Tiles_underlays[var7][var18][var17] & var21;
						if (var22 > 0) {
							FloorUnderlayDefinition var55 = class160.method3505(var22 - 1);
							var10000 = Tiles.Tiles_hue;
							var10000[var17] += var55.hue;
							var10000 = Huffman.Tiles_saturation;
							var10000[var17] += var55.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] += var55.lightness;
							var10000 = class361.Tiles_hueMultiplier;
							var10000[var17] += var55.hueMultiplier;
							var10002 = class36.field218[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)class276.method5504(15);
						var21 = Tiles.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							FloorUnderlayDefinition var56 = class160.method3505(var21 - 1);
							var10000 = Tiles.Tiles_hue;
							var10000[var17] -= var56.hue;
							var10000 = Huffman.Tiles_saturation;
							var10000[var17] -= var56.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] -= var56.lightness;
							var10000 = class361.Tiles_hueMultiplier;
							var10000[var17] -= var56.hueMultiplier;
							var10002 = class36.field218[var17]--;
						}
					}
				}

				if (var16 >= 1 && var16 < var1 - 1) {
					var17 = 0;
					var18 = 0;
					var19 = 0;
					var20 = 0;
					var21 = 0;

					for (var22 = -5; var22 < var2 + 5; ++var22) {
						var23 = var22 + 5;
						if (var23 >= 0 && var23 < var2) {
							var17 += Tiles.Tiles_hue[var23];
							var18 += Huffman.Tiles_saturation[var23];
							var19 += Tiles.Tiles_lightness[var23];
							var20 += class361.Tiles_hueMultiplier[var23];
							var21 += class36.field218[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= Tiles.Tiles_hue[var24];
							var18 -= Huffman.Tiles_saturation[var24];
							var19 -= Tiles.Tiles_lightness[var24];
							var20 -= class361.Tiles_hueMultiplier[var24];
							var21 -= class36.field218[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							long var25 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var27 = (int)var25;
							int var28 = Tiles.Tiles_underlays[var7][var16][var22] & var27;
							int var29 = Tiles.Tiles_overlays[var7][var16][var22] & var27;
							if (var28 > 0 || var29 > 0) {
								int var30 = var3[var7][var16][var22];
								int var31 = var3[var7][var16 + 1][var22];
								int var32 = var3[var7][var16 + 1][var22 + 1];
								int var33 = var3[var7][var16][var22 + 1];
								int var34 = Tiles.field1032[var16][var22];
								int var35 = Tiles.field1032[var16 + 1][var22];
								int var36 = Tiles.field1032[var16 + 1][var22 + 1];
								int var37 = Tiles.field1032[var16][var22 + 1];
								int var38 = -1;
								int var39 = -1;
								int var40;
								int var41;
								int var42;
								if (var28 > 0) {
									var40 = var17 * 256 / var20;
									var41 = var18 / var21;
									var42 = var19 / var21;
									var38 = Decimator.method1084(var40, var41, var42);
									var40 = var40 + Tiles.rndHue & 255;
									var42 += Tiles.rndLightness;
									if (var42 < 0) {
										var42 = 0;
									} else if (var42 > 255) {
										var42 = 255;
									}

									var39 = Decimator.method1084(var40, var41, var42);
								}

								FloorOverlayDefinition var43;
								if (var7 > 0) {
									boolean var64 = true;
									if (var28 == 0 && class213.Tiles_shapes[var7][var16][var22] != 0) {
										var64 = false;
									}

									if (var29 > 0) {
										var42 = var29 - 1;
										var43 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var42);
										FloorOverlayDefinition var51;
										if (var43 != null) {
											var51 = var43;
										} else {
											byte[] var44 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var42);
											var43 = new FloorOverlayDefinition();
											if (var44 != null) {
												var43.decode(new Buffer(var44), var42);
											}

											var43.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var43, (long)var42);
											var51 = var43;
										}

										if (!var51.hideUnderlay) {
											var64 = false;
										}
									}

									if (var64 && var30 == var31 && var30 == var32 && var30 == var33) {
										var10000 = WorldMapDecoration.field3177[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var40 = 0;
								if (var39 != -1) {
									var40 = Rasterizer3D.Rasterizer3D_colorPalette[class238.method4871(var39, 96)];
								}

								if (var29 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var30, var31, var32, var33, class238.method4871(var38, var34), class238.method4871(var38, var35), class238.method4871(var38, var36), class238.method4871(var38, var37), 0, 0, 0, 0, var40, 0);
								} else {
									var41 = class213.Tiles_shapes[var7][var16][var22] + 1;
									byte var65 = class4.field6[var7][var16][var22];
									var43 = HealthBarDefinition.method4870(var29 - 1);
									int var52 = var43.texture;
									int var45;
									int var46;
									int var47;
									int var48;
									if (var52 >= 0) {
										var46 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var52);
										var45 = -1;
									} else if (var43.primaryRgb == 16711935) {
										var45 = -2;
										var52 = -1;
										var46 = -2;
									} else {
										var45 = Decimator.method1084(var43.hue, var43.saturation, var43.lightness);
										var47 = var43.hue + Tiles.rndHue & 255;
										var48 = var43.lightness + Tiles.rndLightness;
										if (var48 < 0) {
											var48 = 0;
										} else if (var48 > 255) {
											var48 = 255;
										}

										var46 = Decimator.method1084(var47, var43.saturation, var48);
									}

									var47 = 0;
									if (var46 != -2) {
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[class74.method2178(var46, 96)];
									}

									if (var43.secondaryRgb != -1) {
										var48 = var43.secondaryHue + Tiles.rndHue & 255;
										int var49 = var43.secondaryLightness + Tiles.rndLightness;
										if (var49 < 0) {
											var49 = 0;
										} else if (var49 > 255) {
											var49 = 255;
										}

										var46 = Decimator.method1084(var48, var43.secondarySaturation, var49);
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[class74.method2178(var46, 96)];
									}

									var5.addTile(var7, var16, var22, var41, var65, var52, var30, var31, var32, var33, class238.method4871(var38, var34), class238.method4871(var38, var35), class238.method4871(var38, var36), class238.method4871(var38, var37), class74.method2178(var45, var34), class74.method2178(var45, var35), class74.method2178(var45, var36), class74.method2178(var45, var37), var40, var47);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var5.setTileMinPlane(var7, var17, var16, class387.method7244(var0, var7, var17, var16));
				}
			}

			Tiles.Tiles_underlays[var7] = null;
			Tiles.Tiles_overlays[var7] = null;
			class213.Tiles_shapes[var7] = null;
			class4.field6[var7] = null;
			class431.Tiles_underlays2[var7] = null;
		}

		var5.method3902(-50, -10, -50);

		for (var7 = 0; var7 < var1; ++var7) {
			for (var8 = 0; var8 < var2; ++var8) {
				if ((var4[1][var7][var8] & 2) == 2) {
					var5.setLinkBelow(var7, var8);
				}
			}
		}

		var7 = 1;
		var8 = 2;
		var9 = 4;

		for (var10 = 0; var10 < 4; ++var10) {
			if (var10 > 0) {
				var7 <<= 3;
				var8 <<= 3;
				var9 <<= 3;
			}

			for (int var60 = 0; var60 <= var10; ++var60) {
				for (int var61 = 0; var61 <= var2; ++var61) {
					for (int var62 = 0; var62 <= var1; ++var62) {
						short var63;
						if ((WorldMapDecoration.field3177[var60][var62][var61] & var7) != 0) {
							var14 = var61;
							var15 = var61;
							var16 = var60;

							for (var17 = var60; var14 > 0 && (WorldMapDecoration.field3177[var60][var62][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (WorldMapDecoration.field3177[var60][var62][var15 + 1] & var7) != 0) {
								++var15;
							}

							label442:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((WorldMapDecoration.field3177[var16 - 1][var62][var18] & var7) == 0) {
										break label442;
									}
								}

								--var16;
							}

							label431:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((WorldMapDecoration.field3177[var17 + 1][var62][var18] & var7) == 0) {
										break label431;
									}
								}

								++var17;
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16);
							if (var18 >= 8) {
								var63 = 240;
								var20 = var3[var17][var62][var14] - var63;
								var21 = var3[var16][var62][var14];
								var5.Scene_addOccluder(var10, 1, var62 * 128, var62 * 128, var14 * 128, var15 * 128 + 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = WorldMapDecoration.field3177[var22][var62];
										var10000[var23] &= ~var7;
									}
								}
							}
						}

						if ((WorldMapDecoration.field3177[var60][var62][var61] & var8) != 0) {
							var14 = var62;
							var15 = var62;
							var16 = var60;

							for (var17 = var60; var14 > 0 && (WorldMapDecoration.field3177[var60][var14 - 1][var61] & var8) != 0; --var14) {
							}

							while (var15 < var1 && (WorldMapDecoration.field3177[var60][var15 + 1][var61] & var8) != 0) {
								++var15;
							}

							label495:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((WorldMapDecoration.field3177[var16 - 1][var18][var61] & var8) == 0) {
										break label495;
									}
								}

								--var16;
							}

							label484:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((WorldMapDecoration.field3177[var17 + 1][var18][var61] & var8) == 0) {
										break label484;
									}
								}

								++var17;
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16);
							if (var18 >= 8) {
								var63 = 240;
								var20 = var3[var17][var14][var61] - var63;
								var21 = var3[var16][var14][var61];
								var5.Scene_addOccluder(var10, 2, var14 * 128, var15 * 128 + 128, var61 * 128, var61 * 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = WorldMapDecoration.field3177[var22][var23];
										var10000[var61] &= ~var8;
									}
								}
							}
						}

						if ((WorldMapDecoration.field3177[var60][var62][var61] & var9) != 0) {
							var14 = var62;
							var15 = var62;
							var16 = var61;

							for (var17 = var61; var16 > 0 && (WorldMapDecoration.field3177[var60][var62][var16 - 1] & var9) != 0; --var16) {
							}

							while (var17 < var2 && (WorldMapDecoration.field3177[var60][var62][var17 + 1] & var9) != 0) {
								++var17;
							}

							label548:
							while (var14 > 0) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((WorldMapDecoration.field3177[var60][var14 - 1][var18] & var9) == 0) {
										break label548;
									}
								}

								--var14;
							}

							label537:
							while (var15 < var1) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((WorldMapDecoration.field3177[var60][var15 + 1][var18] & var9) == 0) {
										break label537;
									}
								}

								++var15;
							}

							if ((var15 - var14 + 1) * (var17 - var16 + 1) >= 4) {
								var18 = var3[var60][var14][var16];
								var5.Scene_addOccluder(var10, 4, var14 * 128, var15 * 128 + 128, var16 * 128, var17 * 128 + 128, var18, var18);

								for (var19 = var14; var19 <= var15; ++var19) {
									for (var20 = var16; var20 <= var17; ++var20) {
										var10000 = WorldMapDecoration.field3177[var60][var19];
										var10000[var20] &= ~var9;
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
