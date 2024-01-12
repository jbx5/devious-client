import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eb")
@Implements("UserComparator9")
public class UserComparator9 extends AbstractUserComparator {
	@ObfuscatedName("aq")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("am")
	@Export("reversed")
	final boolean reversed;

	public UserComparator9(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Lrj;Lrj;B)I",
		garbageValue = "-28"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (Client.worldId == var1.world && var2.world == Client.worldId) {
			return this.reversed ? var1.getUsername().compareToTyped(var2.getUsername()) : var2.getUsername().compareToTyped(var1.getUsername());
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "1648505061"
	)
	public static final synchronized long method2973() {
		long var0 = System.currentTimeMillis();
		if (var0 < class169.field1801) {
			class315.field3434 += class169.field1801 - var0;
		}

		class169.field1801 = var0;
		return var0 + class315.field3434;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lkn;[Lii;B)V",
		garbageValue = "28"
	)
	static final void method2979(Scene var0, CollisionMap[] var1) {
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
			byte[][] var45 = AbstractRasterProvider.Tiles_underlays2[var2];
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
					var20 = (var45[var12][var11 + 1] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11] >> 1);
					FadeOutTask.field4590[var12][var11] = var19 - var20;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				GrandExchangeOfferWorldComparator.Tiles_hue[var11] = 0;
				class341.Tiles_saturation[var11] = 0;
				class515.Tiles_lightness[var11] = 0;
				class309.Tiles_hueMultiplier[var11] = 0;
				class228.field2427[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = (int)NPC.method2718(15);
						var15 = Tiles.Tiles_underlays[var2][var13][var12] & var14;
						if (var15 > 0) {
							FloorUnderlayDefinition var50 = class141.method3213(var15 - 1);
							var10000 = GrandExchangeOfferWorldComparator.Tiles_hue;
							var10000[var12] += var50.hue;
							var10000 = class341.Tiles_saturation;
							var10000[var12] += var50.saturation;
							var10000 = class515.Tiles_lightness;
							var10000[var12] += var50.lightness;
							var10000 = class309.Tiles_hueMultiplier;
							var10000[var12] += var50.hueMultiplier;
							var10002 = class228.field2427[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = (int)NPC.method2718(15);
						var16 = Tiles.Tiles_underlays[var2][var14][var12] & var15;
						if (var16 > 0) {
							FloorUnderlayDefinition var51 = class141.method3213(var16 - 1);
							var10000 = GrandExchangeOfferWorldComparator.Tiles_hue;
							var10000[var12] -= var51.hue;
							var10000 = class341.Tiles_saturation;
							var10000[var12] -= var51.saturation;
							var10000 = class515.Tiles_lightness;
							var10000[var12] -= var51.lightness;
							var10000 = class309.Tiles_hueMultiplier;
							var10000[var12] -= var51.hueMultiplier;
							var10002 = class228.field2427[var12]--;
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
							var12 += GrandExchangeOfferWorldComparator.Tiles_hue[var18];
							var13 += class341.Tiles_saturation[var18];
							var14 += class515.Tiles_lightness[var18];
							var15 += class309.Tiles_hueMultiplier[var18];
							var16 += class228.field2427[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= GrandExchangeOfferWorldComparator.Tiles_hue[var19];
							var13 -= class341.Tiles_saturation[var19];
							var14 -= class515.Tiles_lightness[var19];
							var15 -= class309.Tiles_hueMultiplier[var19];
							var16 -= class228.field2427[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							var20 = (int)NPC.method2718(15);
							int var21 = Tiles.Tiles_underlays[var2][var11][var17] & var20;
							int var22 = Tiles.Tiles_overlays[var2][var11][var17] & var20;
							if (var21 > 0 || var22 > 0) {
								int var23 = Tiles.Tiles_heights[var2][var11][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var25 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var26 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var27 = FadeOutTask.field4590[var11][var17];
								int var28 = FadeOutTask.field4590[var11 + 1][var17];
								int var29 = FadeOutTask.field4590[var11 + 1][var17 + 1];
								int var30 = FadeOutTask.field4590[var11][var17 + 1];
								int var31 = -1;
								int var32 = -1;
								int var33;
								int var34;
								int var35;
								if (var21 > 0) {
									var33 = var12 * 256 / var15;
									var34 = var13 / var16;
									var35 = var14 / var16;
									var31 = class28.method438(var33, var34, var35);
									var33 = var33 + Tiles.rndHue & 255;
									var35 += Tiles.rndLightness;
									if (var35 < 0) {
										var35 = 0;
									} else if (var35 > 255) {
										var35 = 255;
									}

									var32 = class28.method438(var33, var34, var35);
								}

								FloorOverlayDefinition var36;
								if (var2 > 0) {
									boolean var58 = true;
									if (var21 == 0 && class141.Tiles_shapes[var2][var11][var17] != 0) {
										var58 = false;
									}

									if (var22 > 0) {
										var35 = var22 - 1;
										var36 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var35);
										FloorOverlayDefinition var47;
										if (var36 != null) {
											var47 = var36;
										} else {
											byte[] var37 = class419.FloorOverlayDefinition_archive.takeFile(4, var35);
											var36 = new FloorOverlayDefinition();
											if (var37 != null) {
												var36.decode(new Buffer(var37), var35);
											}

											var36.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var36, (long)var35);
											var47 = var36;
										}

										if (!var47.hideUnderlay) {
											var58 = false;
										}
									}

									if (var58 && var23 == var24 && var25 == var23 && var23 == var26) {
										var10000 = Tiles.field1012[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var33 = 0;
								if (var32 != -1) {
									var33 = Rasterizer3D.Rasterizer3D_colorPalette[MouseHandler.method719(var32, 96)];
								}

								if (var22 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var23, var24, var25, var26, MouseHandler.method719(var31, var27), MouseHandler.method719(var31, var28), MouseHandler.method719(var31, var29), MouseHandler.method719(var31, var30), 0, 0, 0, 0, var33, 0);
								} else {
									var34 = class141.Tiles_shapes[var2][var11][var17] + 1;
									byte var59 = class208.field2278[var2][var11][var17];
									int var48 = var22 - 1;
									FloorOverlayDefinition var38 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var48);
									if (var38 != null) {
										var36 = var38;
									} else {
										byte[] var39 = class419.FloorOverlayDefinition_archive.takeFile(4, var48);
										var38 = new FloorOverlayDefinition();
										if (var39 != null) {
											var38.decode(new Buffer(var39), var48);
										}

										var38.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var38, (long)var48);
										var36 = var38;
									}

									int var49 = var36.texture;
									int var40;
									int var41;
									int var42;
									int var43;
									if (var49 >= 0) {
										var41 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var49);
										var40 = -1;
									} else if (var36.primaryRgb == 16711935) {
										var40 = -2;
										var49 = -1;
										var41 = -2;
									} else {
										var40 = class28.method438(var36.hue, var36.saturation, var36.lightness);
										var42 = var36.hue + Tiles.rndHue & 255;
										var43 = var36.lightness + Tiles.rndLightness;
										if (var43 < 0) {
											var43 = 0;
										} else if (var43 > 255) {
											var43 = 255;
										}

										var41 = class28.method438(var42, var36.saturation, var43);
									}

									var42 = 0;
									if (var41 != -2) {
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[GameEngine.method678(var41, 96)];
									}

									if (var36.secondaryRgb != -1) {
										var43 = var36.secondaryHue + Tiles.rndHue & 255;
										int var44 = var36.secondaryLightness + Tiles.rndLightness;
										if (var44 < 0) {
											var44 = 0;
										} else if (var44 > 255) {
											var44 = 255;
										}

										var41 = class28.method438(var43, var36.secondarySaturation, var44);
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[GameEngine.method678(var41, 96)];
									}

									var0.addTile(var2, var11, var17, var34, var59, var49, var23, var24, var25, var26, MouseHandler.method719(var31, var27), MouseHandler.method719(var31, var28), MouseHandler.method719(var31, var29), MouseHandler.method719(var31, var30), GameEngine.method678(var40, var27), GameEngine.method678(var40, var28), GameEngine.method678(var40, var29), GameEngine.method678(var40, var30), var33, var42);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					if ((Tiles.Tiles_renderFlags[var2][var12][var11] & 8) != 0) {
						var17 = 0;
					} else if (var2 > 0 && (Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0) {
						var17 = var2 - 1;
					} else {
						var17 = var2;
					}

					var0.setTileMinPlane(var2, var12, var11, var17);
				}
			}

			Tiles.Tiles_underlays[var2] = null;
			Tiles.Tiles_overlays[var2] = null;
			class141.Tiles_shapes[var2] = null;
			class208.field2278[var2] = null;
			AbstractRasterProvider.Tiles_underlays2[var2] = null;
		}

		var0.method5413(-50, -10, -50);

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
						if ((Tiles.field1012[var54][var56][var55] & var2) != 0) {
							var9 = var55;
							var10 = var55;
							var11 = var54;

							for (var12 = var54; var9 > 0 && (Tiles.field1012[var54][var56][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (Tiles.field1012[var54][var56][var10 + 1] & var2) != 0) {
								++var10;
							}

							label455:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1012[var11 - 1][var56][var13] & var2) == 0) {
										break label455;
									}
								}

								--var11;
							}

							label444:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1012[var12 + 1][var56][var13] & var2) == 0) {
										break label444;
									}
								}

								++var12;
							}

							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var57 = 240;
								var15 = Tiles.Tiles_heights[var12][var56][var9] - var57;
								var16 = Tiles.Tiles_heights[var11][var56][var9];
								Scene.Scene_addOccluder(var5, 1, var56 * 128, var56 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = Tiles.field1012[var17][var56];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((Tiles.field1012[var54][var56][var55] & var3) != 0) {
							var9 = var56;
							var10 = var56;
							var11 = var54;

							for (var12 = var54; var9 > 0 && (Tiles.field1012[var54][var9 - 1][var55] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (Tiles.field1012[var54][var10 + 1][var55] & var3) != 0) {
								++var10;
							}

							label508:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1012[var11 - 1][var13][var55] & var3) == 0) {
										break label508;
									}
								}

								--var11;
							}

							label497:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((Tiles.field1012[var12 + 1][var13][var55] & var3) == 0) {
										break label497;
									}
								}

								++var12;
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1);
							if (var13 >= 8) {
								var57 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var55] - var57;
								var16 = Tiles.Tiles_heights[var11][var9][var55];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var55 * 128, var55 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = Tiles.field1012[var17][var18];
										var10000[var55] &= ~var3;
									}
								}
							}
						}

						if ((Tiles.field1012[var54][var56][var55] & var4) != 0) {
							var9 = var56;
							var10 = var56;
							var11 = var55;

							for (var12 = var55; var11 > 0 && (Tiles.field1012[var54][var56][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (Tiles.field1012[var54][var56][var12 + 1] & var4) != 0) {
								++var12;
							}

							label561:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((Tiles.field1012[var54][var9 - 1][var13] & var4) == 0) {
										break label561;
									}
								}

								--var9;
							}

							label550:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((Tiles.field1012[var54][var10 + 1][var13] & var4) == 0) {
										break label550;
									}
								}

								++var10;
							}

							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var54][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = Tiles.field1012[var54][var14];
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

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1850902540"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class359.scrollBarSprites[0].drawAt(var0, var1);
		class359.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field577);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field578);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0, var6 + var1 + 16, var5, Client.field580);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 1, var6 + var1 + 16, var5, Client.field580);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 16, 16, Client.field580);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var6 + var1 + 17, 16, Client.field580);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 15, var6 + var1 + 16, var5, Client.field541);
		Rasterizer2D.Rasterizer2D_drawVerticalLine(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field541);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0, var5 + var6 + var1 + 15, 16, Client.field541);
		Rasterizer2D.Rasterizer2D_drawHorizontalLine(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field541);
	}
}
