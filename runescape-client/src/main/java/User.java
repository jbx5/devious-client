import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("nb")
@Implements("User")
public class User implements Comparable {
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -313022235)
	@Export("Interpreter_intStackSize")
	static int Interpreter_intStackSize;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lqy;")
	@Export("username")
	Username username;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lqy;")
	@Export("previousUsername")
	Username previousUsername;

	User() {
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lnb;I)I", garbageValue = "1550816169")
	@Export("compareTo_user")
	public int compareTo_user(User var1) {
		return this.username.compareToTyped(var1.username);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(S)Lqy;", garbageValue = "1102")
	@Export("getUsername")
	public Username getUsername() {
		return this.username;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(S)Ljava/lang/String;", garbageValue = "187")
	@Export("getName")
	public String getName() {
		return this.username == null ? "" : this.username.getName();
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(I)Ljava/lang/String;", garbageValue = "1901319216")
	@Export("getPreviousName")
	public String getPreviousName() {
		return this.previousUsername == null ? "" : this.previousUsername.getName();
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lqy;Lqy;B)V", garbageValue = "1")
	@Export("set")
	void set(Username var1, Username var2) {
		if (var1 == null) {
			throw new NullPointerException();
		} else {
			this.username = var1;
			this.previousUsername = var2;
		}
	}

	public int compareTo(Object var1) {
		return this.compareTo_user(((User) (var1)));
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(Lgy;[Lgl;B)V", garbageValue = "2")
	static final void method6633(Scene var0, CollisionMap[] var1) {
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
		if (Tiles.rndHue < -8) {
			Tiles.rndHue = -8;
		}
		if (Tiles.rndHue > 8) {
			Tiles.rndHue = 8;
		}
		Tiles.rndLightness += ((int) (Math.random() * 5.0)) - 2;
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
			byte[][] var44 = Tiles.field975[var2];
			boolean var50 = true;
			boolean var51 = true;
			boolean var6 = true;
			boolean var7 = true;
			boolean var8 = true;
			var9 = ((int) (Math.sqrt(5100.0)));
			var10 = var9 * 768 >> 8;
			int var19;
			int var20;
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var13 = Tiles.Tiles_heights[var2][var12 + 1][var11] - Tiles.Tiles_heights[var2][var12 - 1][var11];
					var14 = Tiles.Tiles_heights[var2][var12][var11 + 1] - Tiles.Tiles_heights[var2][var12][var11 - 1];
					var15 = ((int) (Math.sqrt(((double) (var13 * var13 + var14 * var14 + 65536)))));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
					var20 = (var44[var12][var11 + 1] >> 3) + (var44[var12 - 1][var11] >> 2) + (var44[var12][var11 - 1] >> 2) + (var44[var12 + 1][var11] >> 3) + (var44[var12][var11] >> 1);
					class135.field1587[var12][var11] = var19 - var20;
				}
			}
			for (var11 = 0; var11 < 104; ++var11) {
				class121.Tiles_hue[var11] = 0;
				Login.Tiles_saturation[var11] = 0;
				GrandExchangeEvents.Tiles_lightness[var11] = 0;
				PcmPlayer.Tiles_hueMultiplier[var11] = 0;
				FaceNormal.field2453[var11] = 0;
			}
			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255;
						if (var14 > 0) {
							FloorUnderlayDefinition var48 = KeyHandler.method328(var14 - 1);
							var10000 = class121.Tiles_hue;
							var10000[var12] += var48.hue;
							var10000 = Login.Tiles_saturation;
							var10000[var12] += var48.saturation;
							var10000 = GrandExchangeEvents.Tiles_lightness;
							var10000[var12] += var48.lightness;
							var10000 = PcmPlayer.Tiles_hueMultiplier;
							var10000[var12] += var48.hueMultiplier;
							var10002 = FaceNormal.field2453[var12]++;
						}
					}
					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255;
						if (var15 > 0) {
							FloorUnderlayDefinition var49 = KeyHandler.method328(var15 - 1);
							var10000 = class121.Tiles_hue;
							var10000[var12] -= var49.hue;
							var10000 = Login.Tiles_saturation;
							var10000[var12] -= var49.saturation;
							var10000 = GrandExchangeEvents.Tiles_lightness;
							var10000[var12] -= var49.lightness;
							var10000 = PcmPlayer.Tiles_hueMultiplier;
							var10000[var12] -= var49.hueMultiplier;
							var10002 = FaceNormal.field2453[var12]--;
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
							var12 += class121.Tiles_hue[var18];
							var13 += Login.Tiles_saturation[var18];
							var14 += GrandExchangeEvents.Tiles_lightness[var18];
							var15 += PcmPlayer.Tiles_hueMultiplier[var18];
							var16 += FaceNormal.field2453[var18];
						}
						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= class121.Tiles_hue[var19];
							var13 -= Login.Tiles_saturation[var19];
							var14 -= GrandExchangeEvents.Tiles_lightness[var19];
							var15 -= PcmPlayer.Tiles_hueMultiplier[var19];
							var16 -= FaceNormal.field2453[var19];
						}
						if (var17 >= 1 && var17 < 103 && (!Client.isLowDetail || (Tiles.Tiles_renderFlags[0][var11][var17] & 2) != 0 || (Tiles.Tiles_renderFlags[var2][var11][var17] & 16) == 0)) {
							if (var2 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var2;
							}
							var20 = Tiles.Tiles_underlays[var2][var11][var17] & 255;
							int var21 = Tiles.Tiles_overlays[var2][var11][var17] & 255;
							if (var20 > 0 || var21 > 0) {
								int var22 = Tiles.Tiles_heights[var2][var11][var17];
								int var23 = Tiles.Tiles_heights[var2][var11 + 1][var17];
								int var24 = Tiles.Tiles_heights[var2][var11 + 1][var17 + 1];
								int var25 = Tiles.Tiles_heights[var2][var11][var17 + 1];
								int var26 = class135.field1587[var11][var17];
								int var27 = class135.field1587[var11 + 1][var17];
								int var28 = class135.field1587[var11 + 1][var17 + 1];
								int var29 = class135.field1587[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								int var34;
								if (var20 > 0) {
									var32 = var12 * 256 / var15;
									var33 = var13 / var16;
									var34 = var14 / var16;
									var30 = class17.hslToRgb(var32, var33, var34);
									var32 = var32 + Tiles.rndHue & 255;
									var34 += Tiles.rndLightness;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}
									var31 = class17.hslToRgb(var32, var33, var34);
								}
								FloorOverlayDefinition var35;
								if (var2 > 0) {
									boolean var56 = true;
									if (var20 == 0 && AbstractUserComparator.Tiles_shapes[var2][var11][var17] != 0) {
										var56 = false;
									}
									if (var21 > 0) {
										var34 = var21 - 1;
										var35 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var34)))));
										FloorOverlayDefinition var45;
										if (var35 != null) {
											var45 = var35;
										} else {
											byte[] var36 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var34);
											var35 = new FloorOverlayDefinition();
											if (var36 != null) {
												var35.decode(new Buffer(var36), var34);
											}
											var35.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var35, ((long) (var34)));
											var45 = var35;
										}
										if (!var45.hideUnderlay) {
											var56 = false;
										}
									}
									if (var56 && var23 == var22 && var22 == var24 && var25 == var22) {
										var10000 = class17.field92[var2][var11];
										var10000[var17] |= 2340;
									}
								}
								var32 = 0;
								if (var31 != -1) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[StructComposition.method3531(var31, 96)];
								}
								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, StructComposition.method3531(var30, var26), StructComposition.method3531(var30, var27), StructComposition.method3531(var30, var28), StructComposition.method3531(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = AbstractUserComparator.Tiles_shapes[var2][var11][var17] + 1;
									byte var57 = GrandExchangeOfferOwnWorldComparator.field473[var2][var11][var17];
									int var46 = var21 - 1;
									FloorOverlayDefinition var37 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var46)))));
									if (var37 != null) {
										var35 = var37;
									} else {
										byte[] var38 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var46);
										var37 = new FloorOverlayDefinition();
										if (var38 != null) {
											var37.decode(new Buffer(var38), var46);
										}
										var37.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var37, ((long) (var46)));
										var35 = var37;
									}
									int var47 = var35.texture;
									int var39;
									int var40;
									int var41;
									int var42;
									if (var47 >= 0) {
										var40 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var47);
										var39 = -1;
									} else if (var35.primaryRgb == 16711935) {
										var39 = -2;
										var47 = -1;
										var40 = -2;
									} else {
										var39 = class17.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var41 = var35.hue + Tiles.rndHue & 255;
										var42 = var35.lightness + Tiles.rndLightness;
										if (var42 < 0) {
											var42 = 0;
										} else if (var42 > 255) {
											var42 = 255;
										}
										var40 = class17.hslToRgb(var41, var35.saturation, var42);
									}
									var41 = 0;
									if (var40 != -2) {
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[GameEngine.method430(var40, 96)];
									}
									if (var35.secondaryRgb != -1) {
										var42 = var35.secondaryHue + Tiles.rndHue & 255;
										int var43 = var35.secondaryLightness + Tiles.rndLightness;
										if (var43 < 0) {
											var43 = 0;
										} else if (var43 > 255) {
											var43 = 255;
										}
										var40 = class17.hslToRgb(var42, var35.secondarySaturation, var43);
										var41 = Rasterizer3D.Rasterizer3D_colorPalette[GameEngine.method430(var40, 96)];
									}
									var0.addTile(var2, var11, var17, var33, var57, var47, var22, var23, var24, var25, StructComposition.method3531(var30, var26), StructComposition.method3531(var30, var27), StructComposition.method3531(var30, var28), StructComposition.method3531(var30, var29), GameEngine.method430(var39, var26), GameEngine.method430(var39, var27), GameEngine.method430(var39, var28), GameEngine.method430(var39, var29), var32, var41);
								}
							}
						}
					}
				}
			}
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var0.setTileMinPlane(var2, var12, var11, WorldMapSection1.method4951(var2, var12, var11));
				}
			}
			Tiles.Tiles_underlays[var2] = null;
			Tiles.Tiles_overlays[var2] = null;
			AbstractUserComparator.Tiles_shapes[var2] = null;
			GrandExchangeOfferOwnWorldComparator.field473[var2] = null;
			Tiles.field975[var2] = null;
		}
		var0.method4082(-50, -10, -50);
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
			for (int var52 = 0; var52 <= var5; ++var52) {
				for (int var53 = 0; var53 <= 104; ++var53) {
					for (int var54 = 0; var54 <= 104; ++var54) {
						short var55;
						if ((class17.field92[var52][var54][var53] & var2) != 0) {
							var9 = var53;
							var10 = var53;
							var11 = var52;
							for (var12 = var52; var9 > 0 && (class17.field92[var52][var54][var9 - 1] & var2) != 0; --var9) {
							}
							while (var10 < 104 && (class17.field92[var52][var54][var10 + 1] & var2) != 0) {
								++var10;
							} 
							label445 : while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class17.field92[var11 - 1][var54][var13] & var2) == 0) {
										break label445;
									}
								}
								--var11;
							} 
							label434 : while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class17.field92[var12 + 1][var54][var13] & var2) == 0) {
										break label434;
									}
								}
								++var12;
							} 
							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var55 = 240;
								var15 = Tiles.Tiles_heights[var12][var54][var9] - var55;
								var16 = Tiles.Tiles_heights[var11][var54][var9];
								Scene.Scene_addOccluder(var5, 1, var54 * 128, var54 * 128, var9 * 128, var10 * 128 + 128, var15, var16);
								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = class17.field92[var17][var54];
										var10000[var18] &= ~var2;
									}
								}
							}
						}
						if ((class17.field92[var52][var54][var53] & var3) != 0) {
							var9 = var54;
							var10 = var54;
							var11 = var52;
							for (var12 = var52; var9 > 0 && (class17.field92[var52][var9 - 1][var53] & var3) != 0; --var9) {
							}
							while (var10 < 104 && (class17.field92[var52][var10 + 1][var53] & var3) != 0) {
								++var10;
							} 
							label498 : while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class17.field92[var11 - 1][var13][var53] & var3) == 0) {
										break label498;
									}
								}
								--var11;
							} 
							label487 : while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class17.field92[var12 + 1][var13][var53] & var3) == 0) {
										break label487;
									}
								}
								++var12;
							} 
							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var55 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var53] - var55;
								var16 = Tiles.Tiles_heights[var11][var9][var53];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var53 * 128, var53 * 128, var15, var16);
								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = class17.field92[var17][var18];
										var10000[var53] &= ~var3;
									}
								}
							}
						}
						if ((class17.field92[var52][var54][var53] & var4) != 0) {
							var9 = var54;
							var10 = var54;
							var11 = var53;
							for (var12 = var53; var11 > 0 && (class17.field92[var52][var54][var11 - 1] & var4) != 0; --var11) {
							}
							while (var12 < 104 && (class17.field92[var52][var54][var12 + 1] & var4) != 0) {
								++var12;
							} 
							label551 : while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class17.field92[var52][var9 - 1][var13] & var4) == 0) {
										break label551;
									}
								}
								--var9;
							} 
							label540 : while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class17.field92[var52][var10 + 1][var13] & var4) == 0) {
										break label540;
									}
								}
								++var10;
							} 
							if ((var10 - var9 + 1) * (var12 - var11 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var52][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);
								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = class17.field92[var52][var14];
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