import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gm")
public class class156 extends class160 {
	@ObfuscatedName("at")
	String field1726;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 162234009
	)
	int field1724;
	@ObfuscatedName("ar")
	byte field1725;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class156(class161 var1) {
		this.this$0 = var1;
		this.field1726 = null;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1810249387"
	)
	void vmethod3497(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1726 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1724 = var1.readUnsignedShort();
		this.field1725 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-75"
	)
	void vmethod3501(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember();
		var2.username = new Username(this.field1726);
		var2.world = this.field1724;
		var2.rank = this.field1725;
		var1.addMember(var2);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lkf;[Liw;I)V",
		garbageValue = "277248330"
	)
	static final void method3394(Scene var0, CollisionMap[] var1) {
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
			byte[][] var45 = class93.Tiles_underlays2[var2];
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
					var15 = (int)Math.sqrt((double)(var13 * var13 + var14 * var14 + 65536));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
					int var52 = (var45[var12][var11 + 1] >> 3) + (var45[var12 - 1][var11] >> 2) + (var45[var12][var11 - 1] >> 2) + (var45[var12 + 1][var11] >> 3) + (var45[var12][var11] >> 1);
					Tiles.field999[var12][var11] = var19 - var52;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				class337.Tiles_hue[var11] = 0;
				Tiles.Tiles_saturation[var11] = 0;
				class185.Tiles_lightness[var11] = 0;
				MenuAction.Tiles_hueMultiplier[var11] = 0;
				WorldMapLabelSize.field2441[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						long var46 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var16 = (int)var46;
						var17 = class74.Tiles_underlays[var2][var13][var12] & var16;
						if (var17 > 0) {
							FloorUnderlayDefinition var48 = class101.method2723(var17 - 1);
							var10000 = class337.Tiles_hue;
							var10000[var12] += var48.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] += var48.saturation;
							var10000 = class185.Tiles_lightness;
							var10000[var12] += var48.lightness;
							var10000 = MenuAction.Tiles_hueMultiplier;
							var10000[var12] += var48.hueMultiplier;
							var10002 = WorldMapLabelSize.field2441[var12]++;
						}
					}

					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						long var49 = (long)Math.pow(2.0D, 15.0D) - 1L;
						var17 = (int)var49;
						var18 = class74.Tiles_underlays[var2][var14][var12] & var17;
						if (var18 > 0) {
							FloorUnderlayDefinition var51 = class101.method2723(var18 - 1);
							var10000 = class337.Tiles_hue;
							var10000[var12] -= var51.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] -= var51.saturation;
							var10000 = class185.Tiles_lightness;
							var10000[var12] -= var51.lightness;
							var10000 = MenuAction.Tiles_hueMultiplier;
							var10000[var12] -= var51.hueMultiplier;
							var10002 = WorldMapLabelSize.field2441[var12]--;
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
							var12 += class337.Tiles_hue[var18];
							var13 += Tiles.Tiles_saturation[var18];
							var14 += class185.Tiles_lightness[var18];
							var15 += MenuAction.Tiles_hueMultiplier[var18];
							var16 += WorldMapLabelSize.field2441[var18];
						}

						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= class337.Tiles_hue[var19];
							var13 -= Tiles.Tiles_saturation[var19];
							var14 -= class185.Tiles_lightness[var19];
							var15 -= MenuAction.Tiles_hueMultiplier[var19];
							var16 -= WorldMapLabelSize.field2441[var19];
						}

						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							long var20 = (long)Math.pow(2.0D, 15.0D) - 1L;
							int var22 = (int)var20;
							int var23 = class74.Tiles_underlays[var2][var11][var17] & var22;
							int var24 = Interpreter.Tiles_overlays[var2][var11][var17] & var22;
							if (var23 > 0 || var24 > 0) {
								int var25 = Tiles.Tiles_heights[var2][var11][var17];
								int var26 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var27 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var28 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var29 = Tiles.field999[var11][var17];
								int var30 = Tiles.field999[var11 + 1][var17];
								int var31 = Tiles.field999[var11 + 1][var17 + 1];
								int var32 = Tiles.field999[var11][var17 + 1];
								int var33 = -1;
								int var34 = -1;
								int var35;
								int var36;
								if (var23 > 0) {
									var35 = var12 * 256 / var15;
									var36 = var13 / var16;
									int var37 = var14 / var16;
									var33 = Messages.method2851(var35, var36, var37);
									var35 = var35 + Tiles.rndHue & 255;
									var37 += Tiles.rndLightness;
									if (var37 < 0) {
										var37 = 0;
									} else if (var37 > 255) {
										var37 = 255;
									}

									var34 = Messages.method2851(var35, var36, var37);
								}

								if (var2 > 0) {
									boolean var59 = true;
									if (var23 == 0 && ViewportMouse.Tiles_shapes[var2][var11][var17] != 0) {
										var59 = false;
									}

									if (var24 > 0 && !Canvas.method333(var24 - 1).hideUnderlay) {
										var59 = false;
									}

									if (var59 && var26 == var25 && var25 == var27 && var25 == var28) {
										var10000 = class344.field3814[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var35 = 0;
								if (var34 != -1) {
									var35 = Rasterizer3D.Rasterizer3D_colorPalette[ClanChannel.method3482(var34, 96)];
								}

								if (var24 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var25, var26, var27, var28, ClanChannel.method3482(var33, var29), ClanChannel.method3482(var33, var30), ClanChannel.method3482(var33, var31), ClanChannel.method3482(var33, var32), 0, 0, 0, 0, var35, 0);
								} else {
									var36 = ViewportMouse.Tiles_shapes[var2][var11][var17] + 1;
									byte var60 = class369.field4297[var2][var11][var17];
									FloorOverlayDefinition var38 = Canvas.method333(var24 - 1);
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
										var40 = Messages.method2851(var38.hue, var38.saturation, var38.lightness);
										var42 = var38.hue + Tiles.rndHue & 255;
										var43 = var38.lightness + Tiles.rndLightness;
										if (var43 < 0) {
											var43 = 0;
										} else if (var43 > 255) {
											var43 = 255;
										}

										var41 = Messages.method2851(var42, var38.saturation, var43);
									}

									var42 = 0;
									if (var41 != -2) {
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class403.method7480(var41, 96)];
									}

									if (var38.secondaryRgb != -1) {
										var43 = var38.secondaryHue + Tiles.rndHue & 255;
										int var44 = var38.secondaryLightness + Tiles.rndLightness;
										if (var44 < 0) {
											var44 = 0;
										} else if (var44 > 255) {
											var44 = 255;
										}

										var41 = Messages.method2851(var43, var38.secondarySaturation, var44);
										var42 = Rasterizer3D.Rasterizer3D_colorPalette[class403.method7480(var41, 96)];
									}

									var0.addTile(var2, var11, var17, var36, var60, var39, var25, var26, var27, var28, ClanChannel.method3482(var33, var29), ClanChannel.method3482(var33, var30), ClanChannel.method3482(var33, var31), ClanChannel.method3482(var33, var32), class403.method7480(var40, var29), class403.method7480(var40, var30), class403.method7480(var40, var31), class403.method7480(var40, var32), var35, var42);
								}
							}
						}
					}
				}
			}

			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var0.setTileMinPlane(var2, var12, var11, class185.method3681(var2, var12, var11));
				}
			}

			class74.Tiles_underlays[var2] = null;
			Interpreter.Tiles_overlays[var2] = null;
			ViewportMouse.Tiles_shapes[var2] = null;
			class369.field4297[var2] = null;
			class93.Tiles_underlays2[var2] = null;
		}

		var0.method5329(-50, -10, -50);

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
						if ((class344.field3814[var55][var57][var56] & var2) != 0) {
							var9 = var56;
							var10 = var56;
							var11 = var55;

							for (var12 = var55; var9 > 0 && (class344.field3814[var55][var57][var9 - 1] & var2) != 0; --var9) {
							}

							while (var10 < 104 && (class344.field3814[var55][var57][var10 + 1] & var2) != 0) {
								++var10;
							}

							label418:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class344.field3814[var11 - 1][var57][var13] & var2) == 0) {
										break label418;
									}
								}

								--var11;
							}

							label407:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class344.field3814[var12 + 1][var57][var13] & var2) == 0) {
										break label407;
									}
								}

								++var12;
							}

							var13 = (var12 + 1 - var11) * (var10 - var9 + 1);
							if (var13 >= 8) {
								var58 = 240;
								var15 = Tiles.Tiles_heights[var12][var57][var9] - var58;
								var16 = Tiles.Tiles_heights[var11][var57][var9];
								Scene.Scene_addOccluder(var5, 1, var57 * 128, var57 * 128, var9 * 128, var10 * 128 + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = class344.field3814[var17][var57];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class344.field3814[var55][var57][var56] & var3) != 0) {
							var9 = var57;
							var10 = var57;
							var11 = var55;

							for (var12 = var55; var9 > 0 && (class344.field3814[var55][var9 - 1][var56] & var3) != 0; --var9) {
							}

							while (var10 < 104 && (class344.field3814[var55][var10 + 1][var56] & var3) != 0) {
								++var10;
							}

							label471:
							while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class344.field3814[var11 - 1][var13][var56] & var3) == 0) {
										break label471;
									}
								}

								--var11;
							}

							label460:
							while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class344.field3814[var12 + 1][var13][var56] & var3) == 0) {
										break label460;
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
										var10000 = class344.field3814[var17][var18];
										var10000[var56] &= ~var3;
									}
								}
							}
						}

						if ((class344.field3814[var55][var57][var56] & var4) != 0) {
							var9 = var57;
							var10 = var57;
							var11 = var56;

							for (var12 = var56; var11 > 0 && (class344.field3814[var55][var57][var11 - 1] & var4) != 0; --var11) {
							}

							while (var12 < 104 && (class344.field3814[var55][var57][var12 + 1] & var4) != 0) {
								++var12;
							}

							label524:
							while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class344.field3814[var55][var9 - 1][var13] & var4) == 0) {
										break label524;
									}
								}

								--var9;
							}

							label513:
							while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class344.field3814[var55][var10 + 1][var13] & var4) == 0) {
										break label513;
									}
								}

								++var10;
							}

							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var55][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = class344.field3814[var55][var14];
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
