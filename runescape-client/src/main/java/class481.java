import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sa")
public class class481 {
	@ObfuscatedName("wb")
	static Iterator field4836;
	@ObfuscatedName("ah")
	static int[] field4846;
	@ObfuscatedName("ar")
	public static int[] field4838;
	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "Lrx;"
	)
	static Bounds field4845;

	static {
		field4846 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field4846[var0] = method8531(var0);
		}

		if (field4838 == null) {
			field4838 = new int[65536];
			double var25 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (var5 != 0.0D) {
					double var15;
					if (var7 < 0.5D) {
						var15 = (1.0D + var5) * var7;
					} else {
						var15 = var5 + var7 - var7 * var5;
					}

					double var17 = var7 * 2.0D - var15;
					double var19 = var3 + 0.3333333333333333D;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (6.0D * var19 < 1.0D) {
						var9 = var17 + (var15 - var17) * 6.0D * var19;
					} else if (var19 * 2.0D < 1.0D) {
						var9 = var15;
					} else if (var19 * 3.0D < 2.0D) {
						var9 = var17 + (var15 - var17) * (0.6666666666666666D - var19) * 6.0D;
					} else {
						var9 = var17;
					}

					if (var3 * 6.0D < 1.0D) {
						var11 = 6.0D * (var15 - var17) * var3 + var17;
					} else if (var3 * 2.0D < 1.0D) {
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) {
						var11 = (0.6666666666666666D - var3) * (var15 - var17) * 6.0D + var17;
					} else {
						var11 = var17;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var17 + 6.0D * (var15 - var17) * var23;
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (var23 * 3.0D < 2.0D) {
						var13 = var17 + 6.0D * (0.6666666666666666D - var23) * (var15 - var17);
					} else {
						var13 = var17;
					}
				}

				var9 = Math.pow(var9, var25);
				var11 = Math.pow(var11, var25);
				var13 = Math.pow(var13, var25);
				int var27 = (int)(var9 * 256.0D);
				int var16 = (int)(var11 * 256.0D);
				int var28 = (int)(256.0D * var13);
				int var18 = var28 + (var16 << 8) + (var27 << 16);
				field4838[var2] = var18 & 16777215;
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "68"
	)
	static final int method8531(int var0) {
		double var1 = (double)(var0 >> 10 & 31) / 31.0D;
		double var3 = (double)(var0 >> 5 & 31) / 31.0D;
		double var5 = (double)(var0 & 31) / 31.0D;
		double var7 = var1;
		if (var3 < var1) {
			var7 = var3;
		}

		if (var5 < var7) {
			var7 = var5;
		}

		double var9 = var1;
		if (var3 > var1) {
			var9 = var3;
		}

		if (var5 > var9) {
			var9 = var5;
		}

		double var11 = 0.0D;
		double var13 = 0.0D;
		double var15 = (var9 + var7) / 2.0D;
		if (var9 != var7) {
			if (var15 < 0.5D) {
				var13 = (var9 - var7) / (var9 + var7);
			}

			if (var15 >= 0.5D) {
				var13 = (var9 - var7) / (2.0D - var9 - var7);
			}

			if (var1 == var9) {
				var11 = (var3 - var5) / (var9 - var7);
			} else if (var3 == var9) {
				var11 = 2.0D + (var5 - var1) / (var9 - var7);
			} else if (var9 == var5) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D);
		var17 &= 255;
		double var18 = var13 * 256.0D;
		if (var18 < 0.0D) {
			var18 = 0.0D;
		} else if (var18 > 255.0D) {
			var18 = 255.0D;
		}

		if (var15 > 0.7D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.75D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.85D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.95D) {
			var18 /= 2.0D;
			var18 = Math.floor(var18);
		}

		if (var15 > 0.995D) {
			var15 = 0.995D;
		}

		int var20 = (int)(var18 / 32.0D + (double)(var17 / 4 * 8));
		return (var20 << 7) + (int)(var15 * 128.0D);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "2"
	)
	public static int method8532(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Ljt;[Lih;B)V",
		garbageValue = "-54"
	)
	static final void method8542(Scene var0, CollisionMap[] var1) {
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
			byte[][] var45 = Tiles.Tiles_underlays2[var2];
			boolean var53 = true;
			boolean var54 = true;
			boolean var6 = true;
			boolean var7 = true;
			boolean var8 = true;
			var9 = (int)Math.sqrt(5100.0D);
			var10 = var9 * 768 >> 8;

			int var19;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var18 * -50 + var16 * -50 + var17 * -10) / var10 + 96;
					int var52 = (var45[var12][var11 + 1] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11] >> 1);
					class158.field1739[var12][var11] = var19 - var52;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				SecureRandomFuture.Tiles_hue[var11] = 0;
				class135.Tiles_saturation[var11] = 0;
				Tiles.Tiles_lightness[var11] = 0;
				WorldMapSection2.Tiles_hueMultiplier[var11] = 0;
				Script.field1008[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						long var46 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var16 = (int)var46;
						var17 = World.Tiles_underlays[var2][var13][var12] & var16;
						if (var17 > 0) {
							FloorUnderlayDefinition var48 = KitDefinition.method3706(var17 - 1);
							var10000 = SecureRandomFuture.Tiles_hue;
							var10000[var12] += var48.hue;
							var10000 = class135.Tiles_saturation;
							var10000[var12] += var48.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] += var48.lightness;
							var10000 = WorldMapSection2.Tiles_hueMultiplier;
							var10000[var12] += var48.hueMultiplier;
							var10002 = Script.field1008[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						long var49 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var17 = (int)var49;
						var18 = World.Tiles_underlays[var2][var14][var12] & var17;
						if (var18 > 0) {
							FloorUnderlayDefinition var51 = KitDefinition.method3706(var18 - 1);
							var10000 = SecureRandomFuture.Tiles_hue;
							var10000[var12] -= var51.hue;
							var10000 = class135.Tiles_saturation;
							var10000[var12] -= var51.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] -= var51.lightness;
							var10000 = WorldMapSection2.Tiles_hueMultiplier;
							var10000[var12] -= var51.hueMultiplier;
							var10002 = Script.field1008[var12]--;
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
							var12 += SecureRandomFuture.Tiles_hue[var18];
							var13 += class135.Tiles_saturation[var18];
							var14 += Tiles.Tiles_lightness[var18];
							var15 += WorldMapSection2.Tiles_hueMultiplier[var18];
							var16 += Script.field1008[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= SecureRandomFuture.Tiles_hue[var19];
							var13 -= class135.Tiles_saturation[var19];
							var14 -= Tiles.Tiles_lightness[var19];
							var15 -= WorldMapSection2.Tiles_hueMultiplier[var19];
							var16 -= Script.field1008[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var22 = (int)var20;
							int var23 = World.Tiles_underlays[var2][var11][var17] & var22;
							int var24 = VertexNormal.Tiles_overlays[var2][var11][var17] & var22;
							if (var23 > 0 || var24 > 0) {
								int var25 = Tiles.Tiles_heights[var2][var11][var17];
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var29 = class158.field1739[var11][var17];
								int var30 = class158.field1739[var11 + 1][var17];
								int var31 = class158.field1739[var11 + 1][var17 + 1];
								int var32 = class158.field1739[var11][var17 + 1];
								int var33 = -1;
								int var34 = -1;
								int var35;
								int var36;
								if (var23 > 0) {
									var35 = var12 * 256 / var15;
									var36 = var13 / var16;
									int var37 = var14 / var16;
									var33 = EnumComposition.method3750(var35, var36, var37);
									var35 = var35 + Tiles.rndHue & 255;
									var37 += Tiles.rndLightness;
									if (var37 < 0) {
										var37 = 0;
									} else if (var37 > 255) {
										var37 = 255;
									}

									var34 = EnumComposition.method3750(var35, var36, var37);
								}

								if (var2 > 0) {
									boolean var59 = true;
									if (var23 == 0 && SecureRandomFuture.Tiles_shapes[var2][var11][var17] != 0) {
										var59 = false;
									}

									if (var24 > 0 && !class4.method15(var24 - 1).hideUnderlay) {
										var59 = false;
									}

									if (var59 && var25 == var26 && var25 == var27 && var25 == var28) {
										var10000 = UserComparator6.field1486[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0;
								if (var34 != -1) {
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[ScriptEvent.method2330(var34, 96)];
								}

								if (var24 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, ScriptEvent.method2330(var33, var29), ScriptEvent.method2330(var33, var30), ScriptEvent.method2330(var33, var31), ScriptEvent.method2330(var33, var32), 0, 0, 0, 0, var35, 0);
								} else {
									var36 = SecureRandomFuture.Tiles_shapes[var2][var11][var17] + 1;
									byte var60 = class199.field2004[var2][var11][var17];
									FloorOverlayDefinition var38 = class4.method15(var24 - 1);
									int var39 = var38.texture;
									int var40;
									int var41;
									int var42;
									int var43;
									if (var39 >= 0) {
										var41 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var39);
										var40 = -1;
									} else if (var38.primaryRgb == 16711935) {
										var40 = -2;
										var39 = -1;
										var41 = -2;
									} else {
										var40 = EnumComposition.method3750(var38.hue, var38.saturation, var38.lightness);
										var42 = var38.hue + Tiles.rndHue & 255;
										var43 = var38.lightness + Tiles.rndLightness;
										if (var43 < 0) {
											var43 = 0;
										} else if (var43 > 255) {
											var43 = 255;
										}

										var41 = EnumComposition.method3750(var42, var38.saturation, var43);
									}

									var42 = 0;
									if (var41 != -2) {
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[FloorUnderlayDefinition.method3881(var41, 96)];
									}

									if (var38.secondaryRgb != -1) {
										var43 = var38.secondaryHue + Tiles.rndHue & 255;
										int var44 = var38.secondaryLightness + Tiles.rndLightness;
										if (var44 < 0) {
											var44 = 0;
										} else if (var44 > 255) {
											var44 = 255;
										}

										var41 = EnumComposition.method3750(var43, var38.secondarySaturation, var44);
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[FloorUnderlayDefinition.method3881(var41, 96)];
									}

									var0.addTile(var2, var11, var17, var36, var60, var39, var25, var26, var27, var28, ScriptEvent.method2330(var33, var29), ScriptEvent.method2330(var33, var30), ScriptEvent.method2330(var33, var31), ScriptEvent.method2330(var33, var32), FloorUnderlayDefinition.method3881(var40, var29), FloorUnderlayDefinition.method3881(var40, var30), FloorUnderlayDefinition.method3881(var40, var31), FloorUnderlayDefinition.method3881(var40, var32), var35, var42);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var0.setTileMinPlane(var2, var12, var11, WorldMapLabel.method5654(var2, var12, var11));
				}
			}

			World.Tiles_underlays[var2] = null;
			VertexNormal.Tiles_overlays[var2] = null;
			SecureRandomFuture.Tiles_shapes[var2] = null;
			class199.field2004[var2] = null;
			Tiles.Tiles_underlays2[var2] = null;
		}

		var0.method4690(-50, -10, -50);

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

			for (int var55 = 0; var55 <= var5; ++var55) {
				for (int var56 = 0; var56 <= 104; ++var56) {
					for (int var57 = 0; var57 <= 104; ++var57) {
						short var58;
						if ((UserComparator6.field1486[var55][var57][var56] & var2) != 0) {
							var9 = var56;
							var10 = var56;
							var11 = var55;

							for (var12 = var55; var9 > 0 && (UserComparator6.field1486[var55][var57][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (UserComparator6.field1486[var55][var57][var10 + 1] & var2) != 0) {
								++var10;
							}

							label415:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((UserComparator6.field1486[var11 - 1][var57][var13] & var2) == 0) {
										break label415;
									}
								}

								--var11;
							}

							label404:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((UserComparator6.field1486[var12 + 1][var57][var13] & var2) == 0) {
										break label404;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var58 = 240;
								var15 = Tiles.Tiles_heights[var12][var57][var9] - var58;
								var16 = Tiles.Tiles_heights[var11][var57][var9];
								Scene.Scene_addOccluder(var5, 1, var57 * 128, var57 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = UserComparator6.field1486[var17][var57];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((UserComparator6.field1486[var55][var57][var56] & var3) != 0) {
							var9 = var57;
							var10 = var57;
							var11 = var55;

							for (var12 = var55; var9 > 0 && (UserComparator6.field1486[var55][var9 - 1][var56] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (UserComparator6.field1486[var55][var10 + 1][var56] & var3) != 0) {
								++var10;
							}

							label468:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((UserComparator6.field1486[var11 - 1][var13][var56] & var3) == 0) {
										break label468;
									}
								}

								--var11;
							}

							label457:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((UserComparator6.field1486[var12 + 1][var13][var56] & var3) == 0) {
										break label457;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var58 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var56] - var58;
								var16 = Tiles.Tiles_heights[var11][var9][var56];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var56 * 128, var56 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = UserComparator6.field1486[var17][var18];
										var10000[var56] &= ~var3;
									}
								}
							}
						}

						if ((UserComparator6.field1486[var55][var57][var56] & var4) != 0) {
							var9 = var57;
							var10 = var57;
							var11 = var56;

							for (var12 = var56; var11 > 0 && (UserComparator6.field1486[var55][var57][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (UserComparator6.field1486[var55][var57][var12 + 1] & var4) != 0) {
								++var12;
							}

							label521:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((UserComparator6.field1486[var55][var9 - 1][var13] & var4) == 0) {
										break label521;
									}
								}

								--var9;
							}

							label510:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((UserComparator6.field1486[var55][var10 + 1][var13] & var4) == 0) {
										break label510;
									}
								}

								++var10;
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var55][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = UserComparator6.field1486[var55][var14];
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "1686145446"
	)
	static final String method8541(int var0) {
		if (var0 < 100000) {
			return "<col=ffff00>" + var0 + "</col>";
		} else {
			return var0 < 10000000 ? "<col=ffffff>" + var0 / 1000 + "K" + "</col>" : "<col=00ff80>" + var0 / 1000000 + "M" + "</col>";
		}
	}

	@ObfuscatedName("ku")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1569421925"
	)
	static void method8540(int var0, int var1) {
		int var2 = SoundCache.fontBold12.stringWidth("Choose Option");

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			var4 = SoundCache.fontBold12.stringWidth(class169.method3418(var3));
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		var4 = var0 - var2 / 2;
		if (var2 + var4 > class340.canvasWidth) {
			var4 = class340.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var3 + var1 > class491.canvasHeight) {
			var5 = class491.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		class28.menuX = var4;
		class463.menuY = var5;
		class341.menuWidth = var2;
		Language.menuHeight = Client.menuOptionsCount * 15 + 22;
	}
}
