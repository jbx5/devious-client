import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ch")
public class class53 extends Node {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lgt;"
	)
	static ClanSettings field363;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lbh;"
	)
	class47 field364;

	public class53() {
		this.field364 = null;
	}

	@ObfuscatedSignature(
		descriptor = "(Lco;)V"
	)
	class53(VorbisSample var1) {
		if (var1 != null) {
			this.field364 = new class47(var1, (RawSound)null);
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Lbr;)V"
	)
	public class53(RawSound var1) {
		this.field364 = new class47((VorbisSample)null, var1);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1084806884"
	)
	public boolean method1066() {
		return this.field364 == null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Lbr;",
		garbageValue = "64"
	)
	public RawSound method1060() {
		if (this.field364 != null && this.field364.field330.tryLock()) {
			RawSound var1;
			try {
				var1 = this.method1057();
			} finally {
				this.field364.field330.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lbr;",
		garbageValue = "-2117300742"
	)
	public RawSound method1067() {
		if (this.field364 != null) {
			this.field364.field330.lock();

			RawSound var1;
			try {
				var1 = this.method1057();
			} finally {
				this.field364.field330.unlock();
			}

			return var1;
		} else {
			return null;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(B)Lbr;",
		garbageValue = "15"
	)
	RawSound method1057() {
		if (this.field364.field329 == null) {
			this.field364.field329 = this.field364.field328.toRawSound((int[])null);
			this.field364.field328 = null;
		}

		return this.field364.field329;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;IZB)Z",
		garbageValue = "7"
	)
	static boolean method1068(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var3 = false;
			boolean var4 = false;
			int var5 = 0;
			int var6 = var0.length();

			for (int var7 = 0; var7 < var6; ++var7) {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						continue;
					}

					if (var8 == '+') {
						continue;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						return false;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= var1) {
					return false;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var5 * var1 + var10;
				if (var9 / var1 != var5) {
					return false;
				}

				var5 = var9;
				var4 = true;
			}

			return var4;
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lkq;[Liz;I)V",
		garbageValue = "-248181376"
	)
	static final void method1069(Scene var0, CollisionMap[] var1) {
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
			byte[][] var47 = class151.Tiles_underlays2[var2];
			boolean var58 = true;
			boolean var59 = true;
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
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
					int var57 = (var47[var12][var11 + 1] >> 3) + (var47[var12 - 1][var11] >> 2) + (var47[var12][var11 - 1] >> 2) + (var47[var12 + 1][var11] >> 3) + (var47[var12][var11] >> 1);
					Tiles.field1049[var12][var11] = var19 - var57;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				Huffman.Tiles_hue[var11] = 0;
				MilliClock.Tiles_saturation[var11] = 0;
				ApproximateRouteStrategy.Tiles_lightness[var11] = 0;
				class182.Tiles_hueMultiplier[var11] = 0;
				class324.field3538[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						long var51 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var16 = (int)var51;
						var17 = GrandExchangeOfferAgeComparator.Tiles_underlays[var2][var13][var12] & var16;
						if (var17 > 0) {
							FloorUnderlayDefinition var53 = GrandExchangeOfferOwnWorldComparator.method1203(var17 - 1);
							var10000 = Huffman.Tiles_hue;
							var10000[var12] += var53.hue;
							var10000 = MilliClock.Tiles_saturation;
							var10000[var12] += var53.saturation;
							var10000 = ApproximateRouteStrategy.Tiles_lightness;
							var10000[var12] += var53.lightness;
							var10000 = class182.Tiles_hueMultiplier;
							var10000[var12] += var53.hueMultiplier;
							var10002 = class324.field3538[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						long var54 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var17 = (int)var54;
						var18 = GrandExchangeOfferAgeComparator.Tiles_underlays[var2][var14][var12] & var17;
						if (var18 > 0) {
							FloorUnderlayDefinition var56 = GrandExchangeOfferOwnWorldComparator.method1203(var18 - 1);
							var10000 = Huffman.Tiles_hue;
							var10000[var12] -= var56.hue;
							var10000 = MilliClock.Tiles_saturation;
							var10000[var12] -= var56.saturation;
							var10000 = ApproximateRouteStrategy.Tiles_lightness;
							var10000[var12] -= var56.lightness;
							var10000 = class182.Tiles_hueMultiplier;
							var10000[var12] -= var56.hueMultiplier;
							var10002 = class324.field3538[var12]--;
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
							var12 += Huffman.Tiles_hue[var18];
							var13 += MilliClock.Tiles_saturation[var18];
							var14 += ApproximateRouteStrategy.Tiles_lightness[var18];
							var15 += class182.Tiles_hueMultiplier[var18];
							var16 += class324.field3538[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= Huffman.Tiles_hue[var19];
							var13 -= MilliClock.Tiles_saturation[var19];
							var14 -= ApproximateRouteStrategy.Tiles_lightness[var19];
							var15 -= class182.Tiles_hueMultiplier[var19];
							var16 -= class324.field3538[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var22 = (int)var20;
							int var23 = GrandExchangeOfferAgeComparator.Tiles_underlays[var2][var11][var17] & var22;
							int var24 = TriBool.Tiles_overlays[var2][var11][var17] & var22;
							if (var23 > 0 || var24 > 0) {
								int var25 = Tiles.Tiles_heights[var2][var11][var17];
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var29 = Tiles.field1049[var11][var17];
								int var30 = Tiles.field1049[var11 + 1][var17];
								int var31 = Tiles.field1049[var11 + 1][var17 + 1];
								int var32 = Tiles.field1049[var11][var17 + 1];
								int var33 = -1;
								int var34 = -1;
								int var35;
								int var36;
								int var37;
								if (var23 > 0) {
									var35 = var12 * 256 / var15;
									var36 = var13 / var16;
									var37 = var14 / var16;
									var33 = class31.method425(var35, var36, var37);
									var35 = var35 + Tiles.rndHue & 255;
									var37 += Tiles.rndLightness;
									if (var37 < 0) {
										var37 = 0;
									} else if (var37 > 255) {
										var37 = 255;
									}

									var34 = class31.method425(var35, var36, var37);
								}

								FloorOverlayDefinition var38;
								if (var2 > 0) {
									boolean var64 = true;
									if (var23 == 0 && class173.Tiles_shapes[var2][var11][var17] != 0) {
										var64 = false;
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
											var64 = false;
										}
									}

									if (var64 && var26 == var25 && var25 == var27 && var25 == var28) {
										var10000 = Tiles.field1050[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0;
								if (var34 != -1) {
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[Canvas.method295(var34, 96)];
								}

								if (var24 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, Canvas.method295(var33, var29), Canvas.method295(var33, var30), Canvas.method295(var33, var31), Canvas.method295(var33, var32), 0, 0, 0, 0, var35, 0);
								} else {
									var36 = class173.Tiles_shapes[var2][var11][var17] + 1;
									byte var65 = class350.field3876[var2][var11][var17];
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
										var42 = class31.method425(var38.hue, var38.saturation, var38.lightness);
										var44 = var38.hue + Tiles.rndHue & 255;
										var45 = var38.lightness + Tiles.rndLightness;
										if (var45 < 0) {
											var45 = 0;
										} else if (var45 > 255) {
											var45 = 255;
										}

										var43 = class31.method425(var44, var38.saturation, var45);
									}

									var44 = 0;
									if (var43 != -2) {
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[class485.method8808(var43, 96)];
									}

									if (var38.secondaryRgb != -1) {
										var45 = var38.secondaryHue + Tiles.rndHue & 255;
										int var46 = var38.secondaryLightness + Tiles.rndLightness;
										if (var46 < 0) {
											var46 = 0;
										} else if (var46 > 255) {
											var46 = 255;
										}

										var43 = class31.method425(var45, var38.secondarySaturation, var46);
										var44 = Rasterizer3D.Rasterizer3D_colorPalette[class485.method8808(var43, 96)];
									}

									var0.addTile(var2, var11, var17, var36, var65, var50, var25, var26, var27, var28, Canvas.method295(var33, var29), Canvas.method295(var33, var30), Canvas.method295(var33, var31), Canvas.method295(var33, var32), class485.method8808(var42, var29), class485.method8808(var42, var30), class485.method8808(var42, var31), class485.method8808(var42, var32), var35, var44);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var0.setTileMinPlane(var2, var12, var11, RouteStrategy.method4510(var2, var12, var11));
				}
			}

			GrandExchangeOfferAgeComparator.Tiles_underlays[var2] = null;
			TriBool.Tiles_overlays[var2] = null;
			class173.Tiles_shapes[var2] = null;
			class350.field3876[var2] = null;
			class151.Tiles_underlays2[var2] = null;
		}

		var0.method5451(-50, -10, -50);

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

			for (int var60 = 0; var60 <= var5; ++var60) {
				for (int var61 = 0; var61 <= 104; ++var61) {
					for (int var62 = 0; var62 <= 104; ++var62) {
						short var63;
						if ((Tiles.field1050[var60][var62][var61] & var2) != 0) {
							var9 = var61;
							var10 = var61;
							var11 = var60;

							for (var12 = var60; var9 > 0 && (Tiles.field1050[var60][var62][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (Tiles.field1050[var60][var62][var10 + 1] & var2) != 0) {
								++var10;
							}

							label443:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1050[var11 - 1][var62][var13] & var2) == 0) {
										break label443;
									}
								}

								--var11;
							}

							label432:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1050[var12 + 1][var62][var13] & var2) == 0) {
										break label432;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var63 = 240;
								var15 = Tiles.Tiles_heights[var12][var62][var9] - var63;
								var16 = Tiles.Tiles_heights[var11][var62][var9];
								Scene.Scene_addOccluder(var5, 1, var62 * 128, var62 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = Tiles.field1050[var17][var62];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((Tiles.field1050[var60][var62][var61] & var3) != 0) {
							var9 = var62;
							var10 = var62;
							var11 = var60;

							for (var12 = var60; var9 > 0 && (Tiles.field1050[var60][var9 - 1][var61] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (Tiles.field1050[var60][var10 + 1][var61] & var3) != 0) {
								++var10;
							}

							label496:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1050[var11 - 1][var13][var61] & var3) == 0) {
										break label496;
									}
								}

								--var11;
							}

							label485:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1050[var12 + 1][var13][var61] & var3) == 0) {
										break label485;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var63 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var61] - var63;
								var16 = Tiles.Tiles_heights[var11][var9][var61];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var61 * 128, var61 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = Tiles.field1050[var17][var18];
										var10000[var61] &= ~var3;
									}
								}
							}
						}

						if ((Tiles.field1050[var60][var62][var61] & var4) != 0) {
							var9 = var62;
							var10 = var62;
							var11 = var61;

							for (var12 = var61; var11 > 0 && (Tiles.field1050[var60][var62][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (Tiles.field1050[var60][var62][var12 + 1] & var4) != 0) {
								++var12;
							}

							label549:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((Tiles.field1050[var60][var9 - 1][var13] & var4) == 0) {
										break label549;
									}
								}

								--var9;
							}

							label538:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((Tiles.field1050[var60][var10 + 1][var13] & var4) == 0) {
										break label538;
									}
								}

								++var10;
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var60][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = Tiles.field1050[var60][var14];
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-846967718"
	)
	static final void method1064(String var0) {
		SecureRandomCallable.method2319("Please remove " + var0 + " from your friend list first");
	}

	@ObfuscatedName("gn")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-30"
	)
	@Export("initCredentials")
	static void initCredentials() {
		KeyHandler.accessToken = System.getenv("JX_ACCESS_TOKEN");
		class521.refreshToken = System.getenv("JX_REFRESH_TOKEN");
		class357.sessionId = System.getenv("JX_SESSION_ID");
		Renderable.characterId = System.getenv("JX_CHARACTER_ID");
		WorldMapDecorationType.method6986(System.getenv("JX_DISPLAY_NAME"));
	}
}
