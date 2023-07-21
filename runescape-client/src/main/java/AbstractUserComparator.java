import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
@Implements("AbstractUserComparator")
public abstract class AbstractUserComparator implements Comparator {
	@ObfuscatedName("ay")
	@Export("nextComparator")
	Comparator nextComparator;

	protected AbstractUserComparator() {
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;I)V",
		garbageValue = "2023236765"
	)
	@Export("addComparator")
	final void addComparator(Comparator var1) {
		if (this.nextComparator == null) {
			this.nextComparator = var1;
		} else if (this.nextComparator instanceof AbstractUserComparator) {
			((AbstractUserComparator)this.nextComparator).addComparator(var1);
		}

	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lqe;Lqe;I)I",
		garbageValue = "1411068838"
	)
	@Export("compareUser")
	protected final int compareUser(User var1, User var2) {
		return this.nextComparator == null ? 0 : this.nextComparator.compare(var1, var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Liz;[Lij;I)V",
		garbageValue = "875823996"
	)
	static final void method7982(Scene var0, CollisionMap[] var1) {
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
			byte[][] var45 = InvDefinition.Tiles_underlays2[var2];
			boolean var52 = true;
			boolean var53 = true;
			boolean var6 = true;
			boolean var7 = true;
			boolean var8 = true;
			var9 = (int)Math.sqrt(5100.0D);
			var10 = var9 * 768 >> 8;

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = (int)Math.sqrt((double)(var14 * var14 + var13 * var13 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
					var20 = (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11 + 1] >> 3) + (var45[var12][var11] >> 1);
					class135.field1601[var12][var11] = var19 - var20;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				class172.Tiles_hue[var11] = 0;
				GameBuild.Tiles_saturation[var11] = 0;
				Tiles.Tiles_lightness[var11] = 0;
				Language.Tiles_hueMultiplier[var11] = 0;
				class159.field1755[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = (int)Client.method1805(15);
						var15 = Tiles.Tiles_underlays[var2][var13][var12] & var14;
						if (var15 > 0) {
							var17 = var15 - 1;
							FloorUnderlayDefinition var47 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var17);
							FloorUnderlayDefinition var49;
							if (var47 != null) {
								var49 = var47;
							} else {
								byte[] var48 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17);
								var47 = new FloorUnderlayDefinition();
								if (var48 != null) {
									var47.decode(new Buffer(var48), var17);
								}

								var47.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var47, (long)var17);
								var49 = var47;
							}

							var10000 = class172.Tiles_hue;
							var10000[var12] += var49.hue;
							var10000 = GameBuild.Tiles_saturation;
							var10000[var12] += var49.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] += var49.lightness;
							var10000 = Language.Tiles_hueMultiplier;
							var10000[var12] += var49.hueMultiplier;
							var10002 = class159.field1755[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = (int)Client.method1805(15);
						var16 = Tiles.Tiles_underlays[var2][var14][var12] & var15;
						if (var16 > 0) {
							var18 = var16 - 1;
							FloorUnderlayDefinition var60 = (FloorUnderlayDefinition)FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get((long)var18);
							FloorUnderlayDefinition var51;
							if (var60 != null) {
								var51 = var60;
							} else {
								byte[] var50 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var18);
								var60 = new FloorUnderlayDefinition();
								if (var50 != null) {
									var60.decode(new Buffer(var50), var18);
								}

								var60.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var60, (long)var18);
								var51 = var60;
							}

							var10000 = class172.Tiles_hue;
							var10000[var12] -= var51.hue;
							var10000 = GameBuild.Tiles_saturation;
							var10000[var12] -= var51.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] -= var51.lightness;
							var10000 = Language.Tiles_hueMultiplier;
							var10000[var12] -= var51.hueMultiplier;
							var10002 = class159.field1755[var12]--;
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
							var12 += class172.Tiles_hue[var18];
							var13 += GameBuild.Tiles_saturation[var18];
							var14 += Tiles.Tiles_lightness[var18];
							var15 += Language.Tiles_hueMultiplier[var18];
							var16 += class159.field1755[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= class172.Tiles_hue[var19];
							var13 -= GameBuild.Tiles_saturation[var19];
							var14 -= Tiles.Tiles_lightness[var19];
							var15 -= Language.Tiles_hueMultiplier[var19];
							var16 -= class159.field1755[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							var20 = (int)Client.method1805(15);
							int var21 = Tiles.Tiles_underlays[var2][var11][var17] & var20;
							int var22 = Tiles.Tiles_overlays[var2][var11][var17] & var20;
							if (var21 > 0 || var22 > 0) {
								int var23 = Tiles.Tiles_heights[var2][var11][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var27 = class135.field1601[var11][var17];
								int var28 = class135.field1601[var11 + 1][var17];
								int var29 = class135.field1601[var11 + 1][var17 + 1];
								int var30 = class135.field1601[var11][var17 + 1];
								int var31 = -1;
								int var32 = -1;
								int var33;
								int var34;
								if (var21 > 0) {
									var33 = var12 * 256 / var15;
									var34 = var13 / var16;
									int var35 = var14 / var16;
									var31 = class36.method694(var33, var34, var35);
									var33 = var33 + Tiles.rndHue & 255;
									var35 += Tiles.rndLightness;
									if (var35 < 0) {
										var35 = 0;
									} else if (var35 > 255) {
										var35 = 255;
									}

									var32 = class36.method694(var33, var34, var35);
								}

								if (var2 > 0) {
									boolean var58 = true;
									if (var21 == 0 && class19.Tiles_shapes[var2][var11][var17] != 0) {
										var58 = false;
									}

									if (var22 > 0 && !class131.method3024(var22 - 1).hideUnderlay) {
										var58 = false;
									}

									if (var58 && var23 == var24 && var23 == var25 && var23 == var26) {
										var10000 = BufferedNetSocket.field4681[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var33 = 0;
								if (var32 != -1) {
									var33 = Rasterizer3D.Rasterizer3D_colorPalette[class421.method7817(var32, 96)];
								}

								if (var22 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, class421.method7817(var31, var27), class421.method7817(var31, var28), class421.method7817(var31, var29), class421.method7817(var31, var30), 0, 0, 0, 0, var33, 0);
								} else {
									var34 = class19.Tiles_shapes[var2][var11][var17] + 1;
									byte var59 = UserComparator10.field1474[var2][var11][var17];
									int var37 = var22 - 1;
									FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var37);
									FloorOverlayDefinition var36;
									if (var38 != null) {
										var36 = var38;
									} else {
										byte[] var39 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var37);
										var38 = new FloorOverlayDefinition();
										if (var39 != null) {
											var38.decode(new Buffer(var39), var37);
										}

										var38.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var37);
										var36 = var38;
									}

									int var46 = var36.texture;
									int var40;
									int var41;
									int var42;
									int var43;
									if (var46 >= 0) {
										var41 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var46);
										var40 = -1;
									} else if (var36.primaryRgb == 16711935) {
										var40 = -2;
										var46 = -1;
										var41 = -2;
									} else {
										var40 = class36.method694(var36.hue, var36.saturation, var36.lightness);
										var42 = var36.hue + Tiles.rndHue & 255;
										var43 = var36.lightness + Tiles.rndLightness;
										if (var43 < 0) {
											var43 = 0;
										} else if (var43 > 255) {
											var43 = 255;
										}

										var41 = class36.method694(var42, var36.saturation, var43);
									}

									var42 = 0;
									if (var41 != -2) {
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class271.method5517(var41, 96)];
									}

									if (var36.secondaryRgb != -1) {
										var43 = var36.secondaryHue + Tiles.rndHue & 255;
										int var44 = var36.secondaryLightness + Tiles.rndLightness;
										if (var44 < 0) {
											var44 = 0;
										} else if (var44 > 255) {
											var44 = 255;
										}

										var41 = class36.method694(var43, var36.secondarySaturation, var44);
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class271.method5517(var41, 96)];
									}

									var0.addTile(var2, var11, var17, var34, var59, var46, var23, var24, var25, var26, class421.method7817(var31, var27), class421.method7817(var31, var28), class421.method7817(var31, var29), class421.method7817(var31, var30), class271.method5517(var40, var27), class271.method5517(var40, var28), class271.method5517(var40, var29), class271.method5517(var40, var30), var33, var42);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var0.setTileMinPlane(var2, var12, var11, class399.method7610(var2, var12, var11));
				}
			}

			Tiles.Tiles_underlays[var2] = null;
			Tiles.Tiles_overlays[var2] = null;
			class19.Tiles_shapes[var2] = null;
			UserComparator10.field1474[var2] = null;
			InvDefinition.Tiles_underlays2[var2] = null;
		}

		var0.method4590(-50, -10, -50);

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

			for (int var54 = 0; var54 <= var5; ++var54) {
				for (int var55 = 0; var55 <= 104; ++var55) {
					for (int var56 = 0; var56 <= 104; ++var56) {
						short var57;
						if ((BufferedNetSocket.field4681[var54][var56][var55] & var2) != 0) {
							var9 = var55;
							var10 = var55;
							var11 = var54;

							for (var12 = var54; var9 > 0 && (BufferedNetSocket.field4681[var54][var56][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (BufferedNetSocket.field4681[var54][var56][var10 + 1] & var2) != 0) {
								++var10;
							}

							label455:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((BufferedNetSocket.field4681[var11 - 1][var56][var13] & var2) == 0) {
										break label455;
									}
								}

								--var11;
							}

							label444:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((BufferedNetSocket.field4681[var12 + 1][var56][var13] & var2) == 0) {
										break label444;
									}
								}

								++var12;
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1);
							if (var13 >= 8) {
								var57 = 240;
								var15 = Tiles.Tiles_heights[var12][var56][var9] - var57;
								var16 = Tiles.Tiles_heights[var11][var56][var9];
								Scene.Scene_addOccluder(var5, 1, var56 * 128, var56 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = BufferedNetSocket.field4681[var17][var56];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((BufferedNetSocket.field4681[var54][var56][var55] & var3) != 0) {
							var9 = var56;
							var10 = var56;
							var11 = var54;

							for (var12 = var54; var9 > 0 && (BufferedNetSocket.field4681[var54][var9 - 1][var55] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (BufferedNetSocket.field4681[var54][var10 + 1][var55] & var3) != 0) {
								++var10;
							}

							label508:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((BufferedNetSocket.field4681[var11 - 1][var13][var55] & var3) == 0) {
										break label508;
									}
								}

								--var11;
							}

							label497:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((BufferedNetSocket.field4681[var12 + 1][var13][var55] & var3) == 0) {
										break label497;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var57 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var55] - var57;
								var16 = Tiles.Tiles_heights[var11][var9][var55];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var55 * 128, var55 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = BufferedNetSocket.field4681[var17][var18];
										var10000[var55] &= ~var3;
									}
								}
							}
						}

						if ((BufferedNetSocket.field4681[var54][var56][var55] & var4) != 0) {
							var9 = var56;
							var10 = var56;
							var11 = var55;

							for (var12 = var55; var11 > 0 && (BufferedNetSocket.field4681[var54][var56][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (BufferedNetSocket.field4681[var54][var56][var12 + 1] & var4) != 0) {
								++var12;
							}

							label561:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((BufferedNetSocket.field4681[var54][var9 - 1][var13] & var4) == 0) {
										break label561;
									}
								}

								--var9;
							}

							label550:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((BufferedNetSocket.field4681[var54][var10 + 1][var13] & var4) == 0) {
										break label550;
									}
								}

								++var10;
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var54][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = BufferedNetSocket.field4681[var54][var14];
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
