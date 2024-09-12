import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class33 {
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("fontBold12")
	public static Font fontBold12;
	@ObfuscatedName("ke")
	@ObfuscatedGetter(
		intValue = -53431137
	)
	@Export("cameraZ")
	static int cameraZ;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1239392991
	)
	int field158;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1787000807
	)
	int field153;

	class33(int var1, int var2) {
		this.field158 = var1;
		this.field153 = var2;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lbx;I)Z",
		garbageValue = "-1917026980"
	)
	boolean method474(class29 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field158) {
			case 1:
				return var1.vmethod5567(this.field153);
			case 2:
				return var1.vmethod5568(this.field153);
			case 3:
				return var1.vmethod5569((char)this.field153);
			case 4:
				return var1.vmethod5588(this.field153 == 1);
			default:
				return false;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "105"
	)
	static final int method475(int var0, int var1, int var2, int var3) {
		return var0 * var2 + var3 * var1 >> 16;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "-861514468"
	)
	static final void method479(WorldView var0) {
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
			byte[][] var50 = TriBool.Tiles_underlays2[var7];
			boolean var60 = true;
			boolean var61 = true;
			boolean var11 = true;
			boolean var12 = true;
			boolean var13 = true;
			var14 = (int)Math.sqrt(5100.0D);
			var15 = var14 * 768 >> 8;

			int var24;
			int var25;
			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var18 = var3[var7][var17 + 1][var16] - var3[var7][var17 - 1][var16];
					var19 = var3[var7][var17][var16 + 1] - var3[var7][var17][var16 - 1];
					var20 = (int)Math.sqrt((double)(var18 * var18 + var19 * var19 + 65536));
					var21 = (var18 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var23 * -50 + var21 * -50 + var22 * -10) / var15 + 96;
					var25 = (var50[var17][var16 + 1] >> 3) + (var50[var17 - 1][var16] >> 2) + (var50[var17][var16 - 1] >> 2) + (var50[var17 + 1][var16] >> 3) + (var50[var17][var16] >> 1);
					class512.field5171[var17][var16] = var24 - var25;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				class328.Tiles_hue[var16] = 0;
				HealthBarConfig.Tiles_saturation[var16] = 0;
				Tiles.Tiles_lightness[var16] = 0;
				class77.Tiles_hueMultiplier[var16] = 0;
				Tiles.field1056[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				for (var17 = 0; var17 < var2; ++var17) {
					var18 = var16 + 5;
					int var10002;
					if (var18 >= 0 && var18 < var1) {
						var19 = (int)class178.method3794(15);
						var20 = class442.Tiles_underlays[var7][var18][var17] & var19;
						if (var20 > 0) {
							var22 = var20 - 1;
							FloorUnderlayDefinition var55 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var22);
							FloorUnderlayDefinition var57;
							if (var55 != null) {
								var57 = var55;
							} else {
								byte[] var56 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var22);
								var55 = new FloorUnderlayDefinition();
								if (var56 != null) {
									var55.decode(new Buffer(var56), var22);
								}

								var55.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var55, (long)var22);
								var57 = var55;
							}

							var10000 = class328.Tiles_hue;
							var10000[var17] += var57.hue;
							var10000 = HealthBarConfig.Tiles_saturation;
							var10000[var17] += var57.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] += var57.lightness;
							var10000 = class77.Tiles_hueMultiplier;
							var10000[var17] += var57.hueMultiplier;
							var10002 = Tiles.field1056[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)class178.method3794(15);
						var21 = class442.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							var23 = var21 - 1;
							FloorUnderlayDefinition var68 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var23);
							FloorUnderlayDefinition var59;
							if (var68 != null) {
								var59 = var68;
							} else {
								byte[] var58 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var23);
								var68 = new FloorUnderlayDefinition();
								if (var58 != null) {
									var68.decode(new Buffer(var58), var23);
								}

								var68.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var68, (long)var23);
								var59 = var68;
							}

							var10000 = class328.Tiles_hue;
							var10000[var17] -= var59.hue;
							var10000 = HealthBarConfig.Tiles_saturation;
							var10000[var17] -= var59.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] -= var59.lightness;
							var10000 = class77.Tiles_hueMultiplier;
							var10000[var17] -= var59.hueMultiplier;
							var10002 = Tiles.field1056[var17]--;
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
							var17 += class328.Tiles_hue[var23];
							var18 += HealthBarConfig.Tiles_saturation[var23];
							var19 += Tiles.Tiles_lightness[var23];
							var20 += class77.Tiles_hueMultiplier[var23];
							var21 += Tiles.field1056[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= class328.Tiles_hue[var24];
							var18 -= HealthBarConfig.Tiles_saturation[var24];
							var19 -= Tiles.Tiles_lightness[var24];
							var20 -= class77.Tiles_hueMultiplier[var24];
							var21 -= Tiles.field1056[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							var25 = (int)class178.method3794(15);
							int var26 = class442.Tiles_underlays[var7][var16][var22] & var25;
							int var27 = AbstractByteArrayCopier.Tiles_overlays[var7][var16][var22] & var25;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var7][var16][var22];
								int var29 = var3[var7][var16 + 1][var22];
								int var30 = var3[var7][var16 + 1][var22 + 1];
								int var31 = var3[var7][var16][var22 + 1];
								int var32 = class512.field5171[var16][var22];
								int var33 = class512.field5171[var16 + 1][var22];
								int var34 = class512.field5171[var16 + 1][var22 + 1];
								int var35 = class512.field5171[var16][var22 + 1];
								int var36 = -1;
								int var37 = -1;
								int var38;
								int var39;
								int var40;
								if (var26 > 0) {
									var38 = var17 * 256 / var20;
									var39 = var18 / var21;
									var40 = var19 / var21;
									var36 = BoundaryObject.method5517(var38, var39, var40);
									var38 = var38 + Tiles.rndHue & 255;
									var40 += Tiles.rndLightness;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = BoundaryObject.method5517(var38, var39, var40);
								}

								FloorOverlayDefinition var41;
								if (var7 > 0) {
									boolean var66 = true;
									if (var26 == 0 && UserComparator2.Tiles_shapes[var7][var16][var22] != 0) {
										var66 = false;
									}

									if (var27 > 0) {
										var40 = var27 - 1;
										var41 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var40);
										FloorOverlayDefinition var52;
										if (var41 != null) {
											var52 = var41;
										} else {
											byte[] var42 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var40);
											var41 = new FloorOverlayDefinition();
											if (var42 != null) {
												var41.decode(new Buffer(var42), var40);
											}

											var41.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var41, (long)var40);
											var52 = var41;
										}

										if (!var52.hideUnderlay) {
											var66 = false;
										}
									}

									if (var66 && var28 == var29 && var30 == var28 && var28 == var31) {
										var10000 = SoundSystem.field294[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var38 = 0;
								if (var37 != -1) {
									var38 = Rasterizer3D.Rasterizer3D_colorPalette[Widget.method7368(var37, 96)];
								}

								if (var27 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, Widget.method7368(var36, var32), Widget.method7368(var36, var33), Widget.method7368(var36, var34), Widget.method7368(var36, var35), 0, 0, 0, 0, var38, 0);
								} else {
									var39 = UserComparator2.Tiles_shapes[var7][var16][var22] + 1;
									byte var67 = Tiles.field1065[var7][var16][var22];
									int var53 = var27 - 1;
									FloorOverlayDefinition var43 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var53);
									if (var43 != null) {
										var41 = var43;
									} else {
										byte[] var44 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var53);
										var43 = new FloorOverlayDefinition();
										if (var44 != null) {
											var43.decode(new Buffer(var44), var53);
										}

										var43.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var43, (long)var53);
										var41 = var43;
									}

									int var54 = var41.texture;
									int var45;
									int var46;
									int var47;
									int var48;
									if (var54 >= 0) {
										var46 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var54);
										var45 = -1;
									} else if (var41.primaryRgb == 16711935) {
										var45 = -2;
										var54 = -1;
										var46 = -2;
									} else {
										var45 = BoundaryObject.method5517(var41.hue, var41.saturation, var41.lightness);
										var47 = var41.hue + Tiles.rndHue & 255;
										var48 = var41.lightness + Tiles.rndLightness;
										if (var48 < 0) {
											var48 = 0;
										} else if (var48 > 255) {
											var48 = 255;
										}

										var46 = BoundaryObject.method5517(var47, var41.saturation, var48);
									}

									var47 = 0;
									if (var46 != -2) {
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[class182.method3822(var46, 96)];
									}

									if (var41.secondaryRgb != -1) {
										var48 = var41.secondaryHue + Tiles.rndHue & 255;
										int var49 = var41.secondaryLightness + Tiles.rndLightness;
										if (var49 < 0) {
											var49 = 0;
										} else if (var49 > 255) {
											var49 = 255;
										}

										var46 = BoundaryObject.method5517(var48, var41.secondarySaturation, var49);
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[class182.method3822(var46, 96)];
									}

									var5.addTile(var7, var16, var22, var39, var67, var54, var28, var29, var30, var31, Widget.method7368(var36, var32), Widget.method7368(var36, var33), Widget.method7368(var36, var34), Widget.method7368(var36, var35), class182.method3822(var45, var32), class182.method3822(var45, var33), class182.method3822(var45, var34), class182.method3822(var45, var35), var38, var47);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					if ((var0.tileSettings[var7][var17][var16] & 8) != 0) {
						var22 = 0;
					} else if (var7 > 0 && (var0.tileSettings[1][var17][var16] & 2) != 0) {
						var22 = var7 - 1;
					} else {
						var22 = var7;
					}

					var5.setTileMinPlane(var7, var17, var16, var22);
				}
			}

			class442.Tiles_underlays[var7] = null;
			AbstractByteArrayCopier.Tiles_overlays[var7] = null;
			UserComparator2.Tiles_shapes[var7] = null;
			Tiles.field1065[var7] = null;
			TriBool.Tiles_underlays2[var7] = null;
		}

		var5.method4924(-50, -10, -50);

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

			for (int var62 = 0; var62 <= var10; ++var62) {
				for (int var63 = 0; var63 <= var2; ++var63) {
					for (int var64 = 0; var64 <= var1; ++var64) {
						short var65;
						if ((SoundSystem.field294[var62][var64][var63] & var7) != 0) {
							var14 = var63;
							var15 = var63;
							var16 = var62;

							for (var17 = var62; var14 > 0 && (SoundSystem.field294[var62][var64][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (SoundSystem.field294[var62][var64][var15 + 1] & var7) != 0) {
								++var15;
							}

							label473:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((SoundSystem.field294[var16 - 1][var64][var18] & var7) == 0) {
										break label473;
									}
								}

								--var16;
							}

							label462:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((SoundSystem.field294[var17 + 1][var64][var18] & var7) == 0) {
										break label462;
									}
								}

								++var17;
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16);
							if (var18 >= 8) {
								var65 = 240;
								var20 = var3[var17][var64][var14] - var65;
								var21 = var3[var16][var64][var14];
								var5.Scene_addOccluder(var10, 1, var64 * 128, var64 * 128, var14 * 128, var15 * 128 + 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = SoundSystem.field294[var22][var64];
										var10000[var23] &= ~var7;
									}
								}
							}
						}

						if ((SoundSystem.field294[var62][var64][var63] & var8) != 0) {
							var14 = var64;
							var15 = var64;
							var16 = var62;

							for (var17 = var62; var14 > 0 && (SoundSystem.field294[var62][var14 - 1][var63] & var8) != 0; --var14) {
							}

							while (var15 < var1 && (SoundSystem.field294[var62][var15 + 1][var63] & var8) != 0) {
								++var15;
							}

							label526:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((SoundSystem.field294[var16 - 1][var18][var63] & var8) == 0) {
										break label526;
									}
								}

								--var16;
							}

							label515:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((SoundSystem.field294[var17 + 1][var18][var63] & var8) == 0) {
										break label515;
									}
								}

								++var17;
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16);
							if (var18 >= 8) {
								var65 = 240;
								var20 = var3[var17][var14][var63] - var65;
								var21 = var3[var16][var14][var63];
								var5.Scene_addOccluder(var10, 2, var14 * 128, var15 * 128 + 128, var63 * 128, var63 * 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = SoundSystem.field294[var22][var23];
										var10000[var63] &= ~var8;
									}
								}
							}
						}

						if ((SoundSystem.field294[var62][var64][var63] & var9) != 0) {
							var14 = var64;
							var15 = var64;
							var16 = var63;

							for (var17 = var63; var16 > 0 && (SoundSystem.field294[var62][var64][var16 - 1] & var9) != 0; --var16) {
							}

							while (var17 < var2 && (SoundSystem.field294[var62][var64][var17 + 1] & var9) != 0) {
								++var17;
							}

							label579:
							while (var14 > 0) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((SoundSystem.field294[var62][var14 - 1][var18] & var9) == 0) {
										break label579;
									}
								}

								--var14;
							}

							label568:
							while (var15 < var1) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((SoundSystem.field294[var62][var15 + 1][var18] & var9) == 0) {
										break label568;
									}
								}

								++var15;
							}

							if ((var17 - var16 + 1) * (var15 - var14 + 1) >= 4) {
								var18 = var3[var62][var14][var16];
								var5.Scene_addOccluder(var10, 4, var14 * 128, var15 * 128 + 128, var16 * 128, var17 * 128 + 128, var18, var18);

								for (var19 = var14; var19 <= var15; ++var19) {
									for (var20 = var16; var20 <= var17; ++var20) {
										var10000 = SoundSystem.field294[var62][var19];
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
