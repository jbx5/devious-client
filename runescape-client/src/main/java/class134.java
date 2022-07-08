import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("eg")
public class class134 extends class144 {
	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "Llb;")
	@Export("clientLanguage")
	static Language clientLanguage;

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 1975185263)
	int field1602;

	@ObfuscatedName("v")
	byte field1599;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = -984007901)
	int field1600;

	@ObfuscatedName("f")
	String field1598;

	@ObfuscatedSignature(descriptor = "Leu;")
	final class145 this$0;

	@ObfuscatedSignature(descriptor = "(Leu;)V")
	class134(class145 var1) {
		this.this$0 = var1;
		this.field1602 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lqt;I)V", garbageValue = "355261812")
	void vmethod3137(Buffer var1) {
		this.field1602 = var1.readUnsignedShort();
		this.field1599 = var1.readByte();
		this.field1600 = var1.readUnsignedShort();
		var1.readLong();
		this.field1598 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lex;I)V", garbageValue = "1368590037")
	void vmethod3138(ClanChannel var1) {
		ClanChannelMember var2 = ((ClanChannelMember) (var1.members.get(this.field1602)));
		var2.rank = this.field1599;
		var2.world = this.field1600;
		var2.username = new Username(this.field1598);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lqt;I)Ljava/lang/String;", garbageValue = "499606325")
	public static String method2904(Buffer var0) {
		String var1;
		try {
			int var2 = var0.readUShortSmart();
			if (var2 > 32767) {
				var2 = 32767;
			}
			byte[] var3 = new byte[var2];
			var0.offset += class281.huffman.decompress(var0.array, var0.offset, var3, 0, var2);
			String var4 = SceneTilePaint.decodeStringCp1252(var3, 0, var2);
			var1 = var4;
		} catch (Exception var6) {
			var1 = "Cabbage";
		}
		return var1;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "128188876")
	public static int method2906(int var0) {
		return var0 >> 17 & 7;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(Lgg;[Lgv;I)V", garbageValue = "1741307207")
	static final void method2905(Scene var0, CollisionMap[] var1) {
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
			byte[][] var42 = UserComparator6.field1415[var2];
			boolean var48 = true;
			boolean var49 = true;
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
					var15 = ((int) (Math.sqrt(((double) (var14 * var14 + var13 * var13 + 65536)))));
					var16 = (var13 << 8) / var15;
					var17 = 65536 / var15;
					var18 = (var14 << 8) / var15;
					var19 = (var16 * -50 + var18 * -50 + var17 * -10) / var10 + 96;
					var20 = (var42[var12 - 1][var11] >> 2) + (var42[var12][var11 - 1] >> 2) + (var42[var12 + 1][var11] >> 3) + (var42[var12][var11 + 1] >> 3) + (var42[var12][var11] >> 1);
					class430.field4651[var12][var11] = var19 - var20;
				}
			}
			for (var11 = 0; var11 < 104; ++var11) {
				MusicPatchNode2.Tiles_hue[var11] = 0;
				Tiles.Tiles_saturation[var11] = 0;
				Varcs.Tiles_lightness[var11] = 0;
				class465.Tiles_hueMultiplier[var11] = 0;
				WorldMapScaleHandler.field2877[var11] = 0;
			}
			for (var11 = -5; var11 < 109; ++var11) {
				for (var12 = 0; var12 < 104; ++var12) {
					var13 = var11 + 5;
					int var10002;
					if (var13 >= 0 && var13 < 104) {
						var14 = Tiles.Tiles_underlays[var2][var13][var12] & 255;
						if (var14 > 0) {
							var16 = var14 - 1;
							FloorUnderlayDefinition var43 = ((FloorUnderlayDefinition) (FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get(((long) (var16)))));
							FloorUnderlayDefinition var45;
							if (var43 != null) {
								var45 = var43;
							} else {
								byte[] var44 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var16);
								var43 = new FloorUnderlayDefinition();
								if (var44 != null) {
									var43.decode(new Buffer(var44), var16);
								}
								var43.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var43, ((long) (var16)));
								var45 = var43;
							}
							var10000 = MusicPatchNode2.Tiles_hue;
							var10000[var12] += var45.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] += var45.saturation;
							var10000 = Varcs.Tiles_lightness;
							var10000[var12] += var45.lightness;
							var10000 = class465.Tiles_hueMultiplier;
							var10000[var12] += var45.hueMultiplier;
							var10002 = WorldMapScaleHandler.field2877[var12]++;
						}
					}
					var14 = var11 - 5;
					if (var14 >= 0 && var14 < 104) {
						var15 = Tiles.Tiles_underlays[var2][var14][var12] & 255;
						if (var15 > 0) {
							var17 = var15 - 1;
							FloorUnderlayDefinition var56 = ((FloorUnderlayDefinition) (FloorUnderlayDefinition.FloorUnderlayDefinition_cached.get(((long) (var17)))));
							FloorUnderlayDefinition var47;
							if (var56 != null) {
								var47 = var56;
							} else {
								byte[] var46 = FloorUnderlayDefinition.FloorUnderlayDefinition_archive.takeFile(1, var17);
								var56 = new FloorUnderlayDefinition();
								if (var46 != null) {
									var56.decode(new Buffer(var46), var17);
								}
								var56.postDecode();
								FloorUnderlayDefinition.FloorUnderlayDefinition_cached.put(var56, ((long) (var17)));
								var47 = var56;
							}
							var10000 = MusicPatchNode2.Tiles_hue;
							var10000[var12] -= var47.hue;
							var10000 = Tiles.Tiles_saturation;
							var10000[var12] -= var47.saturation;
							var10000 = Varcs.Tiles_lightness;
							var10000[var12] -= var47.lightness;
							var10000 = class465.Tiles_hueMultiplier;
							var10000[var12] -= var47.hueMultiplier;
							var10002 = WorldMapScaleHandler.field2877[var12]--;
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
							var12 += MusicPatchNode2.Tiles_hue[var18];
							var13 += Tiles.Tiles_saturation[var18];
							var14 += Varcs.Tiles_lightness[var18];
							var15 += class465.Tiles_hueMultiplier[var18];
							var16 += WorldMapScaleHandler.field2877[var18];
						}
						var19 = var17 - 5;
						if (var19 >= 0 && var19 < 104) {
							var12 -= MusicPatchNode2.Tiles_hue[var19];
							var13 -= Tiles.Tiles_saturation[var19];
							var14 -= Varcs.Tiles_lightness[var19];
							var15 -= class465.Tiles_hueMultiplier[var19];
							var16 -= WorldMapScaleHandler.field2877[var19];
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
								int var26 = class430.field4651[var11][var17];
								int var27 = class430.field4651[var11 + 1][var17];
								int var28 = class430.field4651[var11 + 1][var17 + 1];
								int var29 = class430.field4651[var11][var17 + 1];
								int var30 = -1;
								int var31 = -1;
								int var32;
								int var33;
								if (var20 > 0) {
									var32 = var12 * 256 / var15;
									var33 = var13 / var16;
									int var34 = var14 / var16;
									var30 = class21.hslToRgb(var32, var33, var34);
									var32 = var32 + Tiles.rndHue & 255;
									var34 += Tiles.rndLightness;
									if (var34 < 0) {
										var34 = 0;
									} else if (var34 > 255) {
										var34 = 255;
									}
									var31 = class21.hslToRgb(var32, var33, var34);
								}
								if (var2 > 0) {
									boolean var54 = true;
									if (var20 == 0 && Tiles.Tiles_shapes[var2][var11][var17] != 0) {
										var54 = false;
									}
									if (var21 > 0 && !class124.method2814(var21 - 1).hideUnderlay) {
										var54 = false;
									}
									if (var54 && var22 == var23 && var22 == var24 && var25 == var22) {
										var10000 = class1.field2[var2][var11];
										var10000[var17] |= 2340;
									}
								}
								var32 = 0;
								if (var31 != -1) {
									var32 = Rasterizer3D.Rasterizer3D_colorPalette[class129.method2864(var31, 96)];
								}
								if (var21 == 0) {
									var0.addTile(var2, var11, var17, 0, 0, -1, var22, var23, var24, var25, class129.method2864(var30, var26), class129.method2864(var30, var27), class129.method2864(var30, var28), class129.method2864(var30, var29), 0, 0, 0, 0, var32, 0);
								} else {
									var33 = Tiles.Tiles_shapes[var2][var11][var17] + 1;
									byte var55 = Tiles.field996[var2][var11][var17];
									FloorOverlayDefinition var35 = class124.method2814(var21 - 1);
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
										var37 = class21.hslToRgb(var35.hue, var35.saturation, var35.lightness);
										var39 = var35.hue + Tiles.rndHue & 255;
										var40 = var35.lightness + Tiles.rndLightness;
										if (var40 < 0) {
											var40 = 0;
										} else if (var40 > 255) {
											var40 = 255;
										}
										var38 = class21.hslToRgb(var39, var35.saturation, var40);
									}
									var39 = 0;
									if (var38 != -2) {
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ModeWhere.method6079(var38, 96)];
									}
									if (var35.secondaryRgb != -1) {
										var40 = var35.secondaryHue + Tiles.rndHue & 255;
										int var41 = var35.secondaryLightness + Tiles.rndLightness;
										if (var41 < 0) {
											var41 = 0;
										} else if (var41 > 255) {
											var41 = 255;
										}
										var38 = class21.hslToRgb(var40, var35.secondarySaturation, var41);
										var39 = Rasterizer3D.Rasterizer3D_colorPalette[ModeWhere.method6079(var38, 96)];
									}
									var0.addTile(var2, var11, var17, var33, var55, var36, var22, var23, var24, var25, class129.method2864(var30, var26), class129.method2864(var30, var27), class129.method2864(var30, var28), class129.method2864(var30, var29), ModeWhere.method6079(var37, var26), ModeWhere.method6079(var37, var27), ModeWhere.method6079(var37, var28), ModeWhere.method6079(var37, var29), var32, var39);
								}
							}
						}
					}
				}
			}
			for (var11 = 1; var11 < 103; ++var11) {
				for (var12 = 1; var12 < 103; ++var12) {
					var0.setTileMinPlane(var2, var12, var11, Huffman.method5474(var2, var12, var11));
				}
			}
			Tiles.Tiles_underlays[var2] = null;
			Tiles.Tiles_overlays[var2] = null;
			Tiles.Tiles_shapes[var2] = null;
			Tiles.field996[var2] = null;
			UserComparator6.field1415[var2] = null;
		}
		var0.method4186(-50, -10, -50);
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
			for (int var50 = 0; var50 <= var5; ++var50) {
				for (int var51 = 0; var51 <= 104; ++var51) {
					for (int var52 = 0; var52 <= 104; ++var52) {
						short var53;
						if ((class1.field2[var50][var52][var51] & var2) != 0) {
							var9 = var51;
							var10 = var51;
							var11 = var50;
							for (var12 = var50; var9 > 0 && (class1.field2[var50][var52][var9 - 1] & var2) != 0; --var9) {
							}
							while (var10 < 104 && (class1.field2[var50][var52][var10 + 1] & var2) != 0) {
								++var10;
							} 
							label441 : while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class1.field2[var11 - 1][var52][var13] & var2) == 0) {
										break label441;
									}
								}
								--var11;
							} 
							label430 : while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class1.field2[var12 + 1][var52][var13] & var2) == 0) {
										break label430;
									}
								}
								++var12;
							} 
							var13 = (var12 + 1 - var11) * (var10 - var9 + 1);
							if (var13 >= 8) {
								var53 = 240;
								var15 = Tiles.Tiles_heights[var12][var52][var9] - var53;
								var16 = Tiles.Tiles_heights[var11][var52][var9];
								Scene.Scene_addOccluder(var5, 1, var52 * 128, var52 * 128, var9 * 128, var10 * 128 + 128, var15, var16);
								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = class1.field2[var17][var52];
										var10000[var18] &= ~var2;
									}
								}
							}
						}
						if ((class1.field2[var50][var52][var51] & var3) != 0) {
							var9 = var52;
							var10 = var52;
							var11 = var50;
							for (var12 = var50; var9 > 0 && (class1.field2[var50][var9 - 1][var51] & var3) != 0; --var9) {
							}
							while (var10 < 104 && (class1.field2[var50][var10 + 1][var51] & var3) != 0) {
								++var10;
							} 
							label494 : while (var11 > 0) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class1.field2[var11 - 1][var13][var51] & var3) == 0) {
										break label494;
									}
								}
								--var11;
							} 
							label483 : while (var12 < var5) {
								for (var13 = var9; var13 <= var10; ++var13) {
									if ((class1.field2[var12 + 1][var13][var51] & var3) == 0) {
										break label483;
									}
								}
								++var12;
							} 
							var13 = (var10 - var9 + 1) * (var12 + 1 - var11);
							if (var13 >= 8) {
								var53 = 240;
								var15 = Tiles.Tiles_heights[var12][var9][var51] - var53;
								var16 = Tiles.Tiles_heights[var11][var9][var51];
								Scene.Scene_addOccluder(var5, 2, var9 * 128, var10 * 128 + 128, var51 * 128, var51 * 128, var15, var16);
								for (var17 = var11; var17 <= var12; ++var17) {
									for (var18 = var9; var18 <= var10; ++var18) {
										var10000 = class1.field2[var17][var18];
										var10000[var51] &= ~var3;
									}
								}
							}
						}
						if ((class1.field2[var50][var52][var51] & var4) != 0) {
							var9 = var52;
							var10 = var52;
							var11 = var51;
							for (var12 = var51; var11 > 0 && (class1.field2[var50][var52][var11 - 1] & var4) != 0; --var11) {
							}
							while (var12 < 104 && (class1.field2[var50][var52][var12 + 1] & var4) != 0) {
								++var12;
							} 
							label547 : while (var9 > 0) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class1.field2[var50][var9 - 1][var13] & var4) == 0) {
										break label547;
									}
								}
								--var9;
							} 
							label536 : while (var10 < 104) {
								for (var13 = var11; var13 <= var12; ++var13) {
									if ((class1.field2[var50][var10 + 1][var13] & var4) == 0) {
										break label536;
									}
								}
								++var10;
							} 
							if ((var12 - var11 + 1) * (var10 - var9 + 1) >= 4) {
								var13 = Tiles.Tiles_heights[var50][var9][var11];
								Scene.Scene_addOccluder(var5, 4, var9 * 128, var10 * 128 + 128, var11 * 128, var12 * 128 + 128, var13, var13);
								for (var14 = var9; var14 <= var10; ++var14) {
									for (var15 = var11; var15 <= var12; ++var15) {
										var10000 = class1.field2[var50][var14];
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