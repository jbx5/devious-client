import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tm")
public class class508 {
	@ObfuscatedName("ay")
	static int[] field5158;
	@ObfuscatedName("as")
	public static int[] field5157;
	@ObfuscatedName("qz")
	@ObfuscatedSignature(
		descriptor = "Lem;"
	)
	@Export("varcs")
	static Varcs varcs;

	static {
		field5158 = new int[32768];

		for (int var0 = 0; var0 < 32768; ++var0) {
			field5158[var0] = method9432(var0);
		}

		if (field5157 == null) {
			field5157 = new int[65536];
			double var25 = 0.949999988079071D;

			for (int var2 = 0; var2 < 65536; ++var2) {
				double var3 = 0.0078125D + (double)(var2 >> 10 & 63) / 64.0D;
				double var5 = 0.0625D + (double)(var2 >> 7 & 7) / 8.0D;
				double var7 = (double)(var2 & 127) / 128.0D;
				double var9 = var7;
				double var11 = var7;
				double var13 = var7;
				if (0.0D != var5) {
					double var15;
					if (var7 < 0.5D) {
						var15 = var7 * (var5 + 1.0D);
					} else {
						var15 = var5 + var7 - var7 * var5;
					}

					double var17 = 2.0D * var7 - var15;
					double var19 = 0.3333333333333333D + var3;
					if (var19 > 1.0D) {
						--var19;
					}

					double var23 = var3 - 0.3333333333333333D;
					if (var23 < 0.0D) {
						++var23;
					}

					if (var19 * 6.0D < 1.0D) {
						var9 = var19 * (var15 - var17) * 6.0D + var17;
					} else if (var19 * 2.0D < 1.0D) {
						var9 = var15;
					} else if (3.0D * var19 < 2.0D) {
						var9 = 6.0D * (var15 - var17) * (0.6666666666666666D - var19) + var17;
					} else {
						var9 = var17;
					}

					if (6.0D * var3 < 1.0D) {
						var11 = var3 * (var15 - var17) * 6.0D + var17;
					} else if (2.0D * var3 < 1.0D) {
						var11 = var15;
					} else if (var3 * 3.0D < 2.0D) {
						var11 = 6.0D * (0.6666666666666666D - var3) * (var15 - var17) + var17;
					} else {
						var11 = var17;
					}

					if (6.0D * var23 < 1.0D) {
						var13 = var17 + var23 * 6.0D * (var15 - var17);
					} else if (2.0D * var23 < 1.0D) {
						var13 = var15;
					} else if (3.0D * var23 < 2.0D) {
						var13 = var17 + (var15 - var17) * (0.6666666666666666D - var23) * 6.0D;
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
				field5157[var2] = var18 & 16777215;
			}
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-117"
	)
	static final int method9432(int var0) {
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
		double var15 = (var7 + var9) / 2.0D;
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
			} else if (var5 == var9) {
				var11 = (var1 - var3) / (var9 - var7) + 4.0D;
			}
		}

		int var17 = (int)(var11 * 256.0D / 6.0D);
		var17 &= 255;
		double var18 = 256.0D * var13;
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

		int var20 = (int)((double)(var17 / 4 * 8) + var18 / 32.0D);
		return (var20 << 7) + (int)(var15 * 128.0D);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfl;",
		garbageValue = "324075856"
	)
	static class138[] method9433() {
		return new class138[]{class138.field1625, class138.field1616, class138.field1620, class138.field1618, class138.field1619, class138.field1617};
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1355164206"
	)
	public static int method9434() {
		return ViewportMouse.ViewportMouse_entityCount;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lwa;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "55"
	)
	public static int method9428(int var0) {
		return 255 - (var0 & 255);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ldn;B)V",
		garbageValue = "1"
	)
	static final void method9435(WorldView var0) {
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
			byte[][] var52 = Tiles.Tiles_underlays2[var7];
			boolean var63 = true;
			boolean var64 = true;
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
					var20 = (int)Math.sqrt((double)(var19 * var19 + var18 * var18 + 65536));
					var21 = (var18 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var21 * -50 + var23 * -50 + var22 * -10) / var15 + 96;
					int var62 = (var52[var17][var16 + 1] >> 3) + (var52[var17 - 1][var16] >> 2) + (var52[var17][var16 - 1] >> 2) + (var52[var17 + 1][var16] >> 3) + (var52[var17][var16] >> 1);
					Tiles.field1039[var17][var16] = var24 - var62;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				Tiles.Tiles_hue[var16] = 0;
				Tiles.Tiles_saturation[var16] = 0;
				SpriteBufferProperties.Tiles_lightness[var16] = 0;
				MenuAction.Tiles_hueMultiplier[var16] = 0;
				Tiles.field1042[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				for (var17 = 0; var17 < var2; ++var17) {
					var18 = var16 + 5;
					int var10002;
					if (var18 >= 0 && var18 < var1) {
						long var56 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var21 = (int)var56;
						var22 = Tiles.Tiles_underlays[var7][var18][var17] & var21;
						if (var22 > 0) {
							FloorUnderlayDefinition var58 = SecureRandomFuture.method2433(var22 - 1);
							var10000 = Tiles.Tiles_hue;
							var10000[var17] += var58.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var17] += var58.saturation;
							var10000 = SpriteBufferProperties.Tiles_lightness;
							var10000[var17] += var58.lightness;
							var10000 = MenuAction.Tiles_hueMultiplier;
							var10000[var17] += var58.hueMultiplier;
							var10002 = Tiles.field1042[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						long var59 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var22 = (int)var59;
						var23 = Tiles.Tiles_underlays[var7][var19][var17] & var22;
						if (var23 > 0) {
							FloorUnderlayDefinition var61 = SecureRandomFuture.method2433(var23 - 1);
							var10000 = Tiles.Tiles_hue;
							var10000[var17] -= var61.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var17] -= var61.saturation;
							var10000 = SpriteBufferProperties.Tiles_lightness;
							var10000[var17] -= var61.lightness;
							var10000 = MenuAction.Tiles_hueMultiplier;
							var10000[var17] -= var61.hueMultiplier;
							var10002 = Tiles.field1042[var17]--;
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
							var18 += Tiles.Tiles_saturation[var23];
							var19 += SpriteBufferProperties.Tiles_lightness[var23];
							var20 += MenuAction.Tiles_hueMultiplier[var23];
							var21 += Tiles.field1042[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= Tiles.Tiles_hue[var24];
							var18 -= Tiles.Tiles_saturation[var24];
							var19 -= SpriteBufferProperties.Tiles_lightness[var24];
							var20 -= MenuAction.Tiles_hueMultiplier[var24];
							var21 -= Tiles.field1042[var24];
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
								int var34 = Tiles.field1039[var16][var22];
								int var35 = Tiles.field1039[var16 + 1][var22];
								int var36 = Tiles.field1039[var16 + 1][var22 + 1];
								int var37 = Tiles.field1039[var16][var22 + 1];
								int var38 = -1;
								int var39 = -1;
								int var40;
								int var41;
								int var42;
								if (var28 > 0) {
									var40 = var17 * 256 / var20;
									var41 = var18 / var21;
									var42 = var19 / var21;
									var38 = StudioGame.method7524(var40, var41, var42);
									var40 = var40 + Tiles.rndHue & 255;
									var42 += Tiles.rndLightness;
									if (var42 < 0) {
										var42 = 0;
									} else if (var42 > 255) {
										var42 = 255;
									}

									var39 = StudioGame.method7524(var40, var41, var42);
								}

								FloorOverlayDefinition var43;
								if (var7 > 0) {
									boolean var69 = true;
									if (var28 == 0 && Tiles.Tiles_shapes[var7][var16][var22] != 0) {
										var69 = false;
									}

									if (var29 > 0) {
										var42 = var29 - 1;
										var43 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var42);
										FloorOverlayDefinition var53;
										if (var43 != null) {
											var53 = var43;
										} else {
											byte[] var44 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var42);
											var43 = new FloorOverlayDefinition();
											if (var44 != null) {
												var43.decode(new Buffer(var44), var42);
											}

											var43.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var43, (long)var42);
											var53 = var43;
										}

										if (!var53.hideUnderlay) {
											var69 = false;
										}
									}

									if (var69 && var31 == var30 && var32 == var30 && var33 == var30) {
										var10000 = class543.field5378[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var40 = 0;
								if (var39 != -1) {
									var40 = Rasterizer3D.Rasterizer3D_colorPalette[ItemContainer.method2555(var39, 96)];
								}

								if (var29 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var30, var31, var32, var33, ItemContainer.method2555(var38, var34), ItemContainer.method2555(var38, var35), ItemContainer.method2555(var38, var36), ItemContainer.method2555(var38, var37), 0, 0, 0, 0, var40, 0);
								} else {
									var41 = Tiles.Tiles_shapes[var7][var16][var22] + 1;
									byte var70 = Tiles.field1037[var7][var16][var22];
									int var54 = var29 - 1;
									FloorOverlayDefinition var45 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var54);
									if (var45 != null) {
										var43 = var45;
									} else {
										byte[] var46 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var54);
										var45 = new FloorOverlayDefinition();
										if (var46 != null) {
											var45.decode(new Buffer(var46), var54);
										}

										var45.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var45, (long)var54);
										var43 = var45;
									}

									int var55 = var43.texture;
									int var47;
									int var48;
									int var49;
									int var50;
									if (var55 >= 0) {
										var48 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var55);
										var47 = -1;
									} else if (var43.primaryRgb == 16711935) {
										var47 = -2;
										var55 = -1;
										var48 = -2;
									} else {
										var47 = StudioGame.method7524(var43.hue, var43.saturation, var43.lightness);
										var49 = var43.hue + Tiles.rndHue & 255;
										var50 = var43.lightness + Tiles.rndLightness;
										if (var50 < 0) {
											var50 = 0;
										} else if (var50 > 255) {
											var50 = 255;
										}

										var48 = StudioGame.method7524(var49, var43.saturation, var50);
									}

									var49 = 0;
									if (var48 != -2) {
										var49 = Rasterizer3D.Rasterizer3D_colorPalette[class202.method4111(var48, 96)];
									}

									if (var43.secondaryRgb != -1) {
										var50 = var43.secondaryHue + Tiles.rndHue & 255;
										int var51 = var43.secondaryLightness + Tiles.rndLightness;
										if (var51 < 0) {
											var51 = 0;
										} else if (var51 > 255) {
											var51 = 255;
										}

										var48 = StudioGame.method7524(var50, var43.secondarySaturation, var51);
										var49 = Rasterizer3D.Rasterizer3D_colorPalette[class202.method4111(var48, 96)];
									}

									var5.addTile(var7, var16, var22, var41, var70, var55, var30, var31, var32, var33, ItemContainer.method2555(var38, var34), ItemContainer.method2555(var38, var35), ItemContainer.method2555(var38, var36), ItemContainer.method2555(var38, var37), class202.method4111(var47, var34), class202.method4111(var47, var35), class202.method4111(var47, var36), class202.method4111(var47, var37), var40, var49);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var5.setTileMinPlane(var7, var17, var16, ObjectSound.method2081(var0, var7, var17, var16));
				}
			}

			Tiles.Tiles_underlays[var7] = null;
			Tiles.Tiles_overlays[var7] = null;
			Tiles.Tiles_shapes[var7] = null;
			Tiles.field1037[var7] = null;
			Tiles.Tiles_underlays2[var7] = null;
		}

		var5.method5010(-50, -10, -50);

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

			for (int var65 = 0; var65 <= var10; ++var65) {
				for (int var66 = 0; var66 <= var2; ++var66) {
					for (int var67 = 0; var67 <= var1; ++var67) {
						short var68;
						if ((class543.field5378[var65][var67][var66] & var7) != 0) {
							var14 = var66;
							var15 = var66;
							var16 = var65;

							for (var17 = var65; var14 > 0 && (class543.field5378[var65][var67][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (class543.field5378[var65][var67][var15 + 1] & var7) != 0) {
								++var15;
							}

							label446:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((class543.field5378[var16 - 1][var67][var18] & var7) == 0) {
										break label446;
									}
								}

								--var16;
							}

							label435:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((class543.field5378[var17 + 1][var67][var18] & var7) == 0) {
										break label435;
									}
								}

								++var17;
							}

							var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
							if (var18 >= 8) {
								var68 = 240;
								var20 = var3[var17][var67][var14] - var68;
								var21 = var3[var16][var67][var14];
								var5.Scene_addOccluder(var10, 1, var67 * 128, var67 * 128, var14 * 128, var15 * 128 + 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = class543.field5378[var22][var67];
										var10000[var23] &= ~var7;
									}
								}
							}
						}

						if ((class543.field5378[var65][var67][var66] & var8) != 0) {
							var14 = var67;
							var15 = var67;
							var16 = var65;

							for (var17 = var65; var14 > 0 && (class543.field5378[var65][var14 - 1][var66] & var8) != 0; --var14) {
							}

							while (var15 < var1 && (class543.field5378[var65][var15 + 1][var66] & var8) != 0) {
								++var15;
							}

							label499:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((class543.field5378[var16 - 1][var18][var66] & var8) == 0) {
										break label499;
									}
								}

								--var16;
							}

							label488:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((class543.field5378[var17 + 1][var18][var66] & var8) == 0) {
										break label488;
									}
								}

								++var17;
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16);
							if (var18 >= 8) {
								var68 = 240;
								var20 = var3[var17][var14][var66] - var68;
								var21 = var3[var16][var14][var66];
								var5.Scene_addOccluder(var10, 2, var14 * 128, var15 * 128 + 128, var66 * 128, var66 * 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = class543.field5378[var22][var23];
										var10000[var66] &= ~var8;
									}
								}
							}
						}

						if ((class543.field5378[var65][var67][var66] & var9) != 0) {
							var14 = var67;
							var15 = var67;
							var16 = var66;

							for (var17 = var66; var16 > 0 && (class543.field5378[var65][var67][var16 - 1] & var9) != 0; --var16) {
							}

							while (var17 < var2 && (class543.field5378[var65][var67][var17 + 1] & var9) != 0) {
								++var17;
							}

							label552:
							while (var14 > 0) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((class543.field5378[var65][var14 - 1][var18] & var9) == 0) {
										break label552;
									}
								}

								--var14;
							}

							label541:
							while (var15 < var1) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((class543.field5378[var65][var15 + 1][var18] & var9) == 0) {
										break label541;
									}
								}

								++var15;
							}

							if ((var15 - var14 + 1) * (var17 - var16 + 1) >= 4) {
								var18 = var3[var65][var14][var16];
								var5.Scene_addOccluder(var10, 4, var14 * 128, var15 * 128 + 128, var16 * 128, var17 * 128 + 128, var18, var18);

								for (var19 = var14; var19 <= var15; ++var19) {
									for (var20 = var16; var20 <= var17; ++var20) {
										var10000 = class543.field5378[var65][var19];
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
