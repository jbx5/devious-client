import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("GraphicsDefaults")
public class GraphicsDefaults {
	@ObfuscatedName("ip")
	@ObfuscatedSignature(descriptor = 
	"[Lqq;")

	@Export("mapSceneSprites")
	static IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1328751771)

	@Export("compass")
	public int compass;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	741115861)

	public int field4314;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	-104742867)

	@Export("mapScenes")
	public int mapScenes;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1903880711)

	@Export("headIconsPk")
	public int headIconsPk;
	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 
	1153445431)

	public int field4322;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	693600925)

	public int field4318;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	2085695885)

	public int field4319;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	-1059199103)

	public int field4320;
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	218263637)

	public int field4321;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	1626482123)

	public int field4315;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	922588741)

	public int field4323;

	public GraphicsDefaults() {
		this.compass = -1;
		this.field4314 = -1;
		this.mapScenes = -1;
		this.headIconsPk = -1;
		this.field4322 = -1;
		this.field4318 = -1;
		this.field4319 = -1;
		this.field4320 = -1;
		this.field4321 = -1;
		this.field4315 = -1;
		this.field4323 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lln;I)V", garbageValue = 
	"-689748439")

	@Export("decode")
	public void decode(AbstractArchive var1) {
		byte[] var2 = var1.takeFileFlat(DefaultsGroup.field4311.group);
		Buffer var3 = new Buffer(var2);

		while (true) {
			int var4 = var3.readUnsignedByte();
			if (var4 == 0) {
				return;
			}

			switch (var4) {
				case 1 :
					var3.readMedium();
					break;
				case 2 :
					this.compass = var3.readNullableLargeSmart();
					this.field4314 = var3.readNullableLargeSmart();
					this.mapScenes = var3.readNullableLargeSmart();
					this.headIconsPk = var3.readNullableLargeSmart();
					this.field4322 = var3.readNullableLargeSmart();
					this.field4318 = var3.readNullableLargeSmart();
					this.field4319 = var3.readNullableLargeSmart();
					this.field4320 = var3.readNullableLargeSmart();
					this.field4321 = var3.readNullableLargeSmart();
					this.field4315 = var3.readNullableLargeSmart();
					this.field4323 = var3.readNullableLargeSmart();}

		} 
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Lhv;[Lgv;I)V", garbageValue = 
	"200441934")

	static final void method6939(Scene var0, CollisionMap[] var1) {
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

		Tiles.rndHue += ((int) (Math.random() * 5.0)) - 2;
		if (Tiles.rndHue < (-8)) {
			Tiles.rndHue = -8;
		}

		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}

		Tiles.rndLightness += ((int) (Math.random() * 5.0)) - 2;
		if (Tiles.rndLightness < (-16)) {
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
			byte[][] var42 = class392.field4374[var2];
			var9 = ((int) (Math.sqrt(5100.0)));
			var10 = (var9 * 768) >> 8;

			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = ((int) (Math.sqrt(((double) (((var13 * var13) + (var14 * var14)) + 65536)))));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = ((((var16 * (-50)) + (var18 * (-50))) + (var17 * (-10))) / var10) + 96;
					var20 = ((((var42[var12][var11 + 1] >> 3) + (var42[var12 - 1][var11] >> 2)) + (var42[var12][var11 - 1] >> 2)) + (var42[var12 + 1][var11] >> 3)) + (var42[var12][var11] >> 1);
					Tiles.field998[var12][var11] = var19 - var20;
				}
			}

			for (var11 = 0; var11 < 104; ++var11) {
				BufferedNetSocket.Tiles_hue[var11] = 0;
				class116.Tiles_saturation[var11] = 0;
				Tiles.Tiles_lightness[var11] = 0;
				class357.Tiles_hueMultiplier[var11] = 0;
				class361.field4213[var11] = 0;
			}

			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if ((var13 >= 0) && (var13 < 104)) {
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255;
						if (var14 > 0) {
							FloorUnderlayDefinition var44 = class123.method2806(var14 - 1);
							var10000 = BufferedNetSocket.Tiles_hue;
							var10000[var12] += var44.hue;
							var10000 = class116.Tiles_saturation;
							var10000[var12] += var44.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] += var44.lightness;
							var10000 = class357.Tiles_hueMultiplier;
							var10000[var12] += var44.hueMultiplier;
							var10002 = class361.field4213[var12]++;
						}
					}

					var14 = var11 - 5;
					if ((var14 >= 0) && (var14 < 104)) {
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255;
						if (var15 > 0) {
							FloorUnderlayDefinition var45 = class123.method2806(var15 - 1);
							var10000 = BufferedNetSocket.Tiles_hue;
							var10000[var12] -= var45.hue;
							var10000 = class116.Tiles_saturation;
							var10000[var12] -= var45.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var12] -= var45.lightness;
							var10000 = class357.Tiles_hueMultiplier;
							var10000[var12] -= var45.hueMultiplier;
							var10002 = class361.field4213[var12]--;
						}
					}
				}

				if ((var11 >= 1) && (var11 < 103)) {
					var12 = 0;
					var13 = 0;
					var14 = 0;
					var15 = 0;
					var16 = 0;

					for (var17 = -5; var17 < 109; ++var17) {
						var18 = var17 + 5;
						if ((var18 >= 0) && (var18 < 104)) {
							var12 += BufferedNetSocket.Tiles_hue[var18];
							var13 += class116.Tiles_saturation[var18];
							var14 += Tiles.Tiles_lightness[var18];
							var15 += class357.Tiles_hueMultiplier[var18];
							var16 += class361.field4213[var18];
						}

						var19 = var17 - 5;
						if ((var19 >= 0) && (var19 < 104)) {
							var12 -= BufferedNetSocket.Tiles_hue[var19];
							var13 -= class116.Tiles_saturation[var19];
							var14 -= Tiles.Tiles_lightness[var19];
							var15 -= class357.Tiles_hueMultiplier[var19];
							var16 -= class361.field4213[var19];
						}

						if (((var17 >= 1) && (var17 < 103)) && (((!Client.isLowDetail) || ((Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0)) || ((Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0))) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}

							var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255;
							int var21 = class14.Tiles_overlays[var2][var11][var17] & 255;
							if ((var20 > 0) || (var21 > 0)) {
								int var22 = Tiles.Tiles_heights[var2][var11][var17];
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var26 = Tiles.field998[var11][var17];
								int var27 = Tiles.field998[var11 + 1][var17];
								int var28 = Tiles.field998[var11 + 1][var17 + 1];
								int var29 = Tiles.field998[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								if (var20 > 0) {
									var32 = (var12 * 256) / var15;
									var33 = var13 / var16;
									int var34 = var14 / var16;
									var30 = class162.hslToRgb(var32, var33, var34);
									var32 = (var32 + Tiles.rndHue) & 255;
									var34 += Tiles.rndLightness;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}

									var31 = class162.hslToRgb(var32, var33, var34);
								}

								if (var2 > 0) {
									boolean var47 = true;
									if ((var20 == 0) && (class147.Tiles_shapes[var2][var11][var17] != 0)) {
										var47 = false;
									}

									if ((var21 > 0) && (!Clock.method3349(var21 - 1).hideUnderlay)) {
										var47 = false;
									}

									if (((var47 && (var22 == var23)) && (var24 == var22)) && (var25 == var22)) {
										var10000 = class420.field4545[var2][var11];
										var10000[var17] |= 2340;
									}
								}

								var32 = 0;
								if (var31 != (-1)) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[SoundCache.method772(var31, 96)];
								}

								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, SoundCache.method772(var30, var26), SoundCache.method772(var30, var27), SoundCache.method772(var30, var28), SoundCache.method772(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = class147.Tiles_shapes[var2][var11][var17] + 1;
									byte var48 = Tiles.field983[var2][var11][var17];
									FloorOverlayDefinition var35 = Clock.method3349(var21 - 1);
									int var36 = var35.texture;
									int var37;
									int var38;
									int var39;
									int var40;
									if (var36 >= 0) {
										var38 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var36);
										var37 = -1;
									} else if (var35.primaryRgb == 16711935) {
										var37 = -2;
										var36 = -1;
										var38 = -2;
									} else {
										var37 = class162.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var39 = (var35.hue + Tiles.rndHue) & 255;
										var40 = var35.lightness + Tiles.rndLightness;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}

										var38 = class162.hslToRgb(var39, var35.saturation, var40);
									}

									var39 = 0;
									if (var38 != (-2)) {
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ClanSettings.method3028(var38, 96)];
									}

									if (var35.secondaryRgb != (-1)) {
										var40 = (var35.secondaryHue + Tiles.rndHue) & 255;
										int var41 = var35.secondaryLightness + Tiles.rndLightness;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}

										var38 = class162.hslToRgb(var40, var35.secondarySaturation, var41);
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ClanSettings.method3028(var38, 96)];
									}

									var0.addTile(var2, var11, var17, var33, var48, var36, var22, var23, var24, var25, SoundCache.method772(var30, var26), SoundCache.method772(var30, var27), SoundCache.method772(var30, var28), SoundCache.method772(var30, var29), ClanSettings.method3028(var37, var26), ClanSettings.method3028(var37, var27), ClanSettings.method3028(var37, var28), ClanSettings.method3028(var37, var29), var32, var39);
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
					} else if ((var2 > 0) && ((Tiles.Tiles_renderFlags[1][var12][var11] & 2) != 0)) {
						var17 = var2 - 1;
					} else {
						var17 = var2;
					}

					var0.setTileMinPlane(var2, var12, var11, var17);
				}
			}

			Tiles.Tiles_underlays[var2] = null;
			class14.Tiles_overlays[var2] = null;
			class147.Tiles_shapes[var2] = null;
			Tiles.field983[var2] = null;
			class392.field4374[var2] = null;
		}

		var0.method4762(-50, -10, -50);

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

			for (int var6 = 0; var6 <= var5; ++var6) {
				for (int var7 = 0; var7 <= 104; ++var7) {
					for (int var8 = 0; var8 <= 104; ++var8) {
						short var46;
						if ((class420.field4545[var6][var8][var7] & var2) != 0) {
							var9 = var7;
							var10 = var7;
							var11 = var6;

							for (var12 = var6; (var9 > 0) && ((class420.field4545[var6][var8][var9 - 1] & var2) != 0); --var9) {
							}

							while ((var10 < 104) && ((class420.field4545[var6][var8][var10 + 1] & var2) != 0)) {
								++var10;
							} 

							label432 : while (
							var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class420.field4545[var11 - 1][var8][var13] & var2) == 0) {
										break label432;
									}
								}

								--var11;
							} 

							label421 : while (
							var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class420.field4545[var12 + 1][var8][var13] & var2) == 0) {
										break label421;
									}
								}

								++var12;
							} 

							var13 = ((var10 - var9) + 1) * ((var12 + 1) - var11);
							if (var13 >= 8) {
								var46 = 240;
								var15 = Tiles.Tiles_heights[var12][var8][var9] - var46;
								var16 = Tiles.Tiles_heights[var11][var8][var9];
								Scene.Scene_addOccluder(var5, 1, var8 * 128, var8 * 128, var9 * 128, (var10 * 128) + 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = class420.field4545[var17][var8];
										var10000[var18] &= ~var2;
									}
								}
							}
						}

						if ((class420.field4545[var6][var8][var7] & var3) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var6;

							for (var12 = var6; (var9 > 0) && ((class420.field4545[var6][var9 - 1][var7] & var3) != 0); --var9) {
							}

							while ((var10 < 104) && ((class420.field4545[var6][var10 + 1][var7] & var3) != 0)) {
								++var10;
							} 

							label485 : while (
							var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class420.field4545[var11 - 1][var13][var7] & var3) == 0) {
										break label485;
									}
								}

								--var11;
							} 

							label474 : while (
							var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class420.field4545[var12 + 1][var13][var7] & var3) == 0) {
										break label474;
									}
								}

								++var12;
							} 

							var13 = ((var10 - var9) + 1) * ((var12 + 1) - var11);
							if (var13 >= 8) {
								var46 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var7] - var46;
								var16 = Tiles.Tiles_heights[var11][var9][var7];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, (var10 * 128) + 128, var7 * 128, var7 * 128, var15, var16);

								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = class420.field4545[var17][var18];
										var10000[var7] &= ~var3;
									}
								}
							}
						}

						if ((class420.field4545[var6][var8][var7] & var4) != 0) {
							var9 = var8;
							var10 = var8;
							var11 = var7;

							for (var12 = var7; (var11 > 0) && ((class420.field4545[var6][var8][var11 - 1] & var4) != 0); --var11) {
							}

							while ((var12 < 104) && ((class420.field4545[var6][var8][var12 + 1] & var4) != 0)) {
								++var12;
							} 

							label538 : while (
							var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class420.field4545[var6][var9 - 1][var13] & var4) == 0) {
										break label538;
									}
								}

								--var9;
							} 

							label527 : while (
							var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class420.field4545[var6][var10 + 1][var13] & var4) == 0) {
										break label527;
									}
								}

								++var10;
							} 

							if ((((var10 - var9) + 1) * ((var12 - var11) + 1)) >= 4) {
								var13 = Tiles.Tiles_heights[var6][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, (var10 * 128) + 128, var11 * 128, (var12 * 128) + 128, var13, var13);

								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = class420.field4545[var6][var14];
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