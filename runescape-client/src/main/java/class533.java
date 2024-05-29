import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("uy")
public class class533 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static final class533 field5263;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static final class533 field5266;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Luy;"
	)
	public static final class533 field5267;
	@ObfuscatedName("bk")
	protected static String field5270;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -147741281
	)
	public final int field5265;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1239690253
	)
	public final int field5271;
	@ObfuscatedName("aa")
	public final Class field5268;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	public final class529 field5269;

	static {
		field5263 = new class533(2, 0, Integer.class, new class530());
		field5266 = new class533(1, 1, Long.class, new class532());
		field5267 = new class533(0, 2, String.class, new class534());
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/Class;Lui;)V"
	)
	class533(int var1, int var2, Class var3, class529 var4) {
		this.field5265 = var1;
		this.field5271 = var2;
		this.field5268 = var3;
		this.field5269 = var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field5271;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)Ljava/lang/Object;",
		garbageValue = "-100"
	)
	public Object method9508(Buffer var1) {
		return this.field5269.vmethod9520(var1);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)[Luy;",
		garbageValue = "-22"
	)
	public static class533[] method9515() {
		return new class533[]{field5266, field5263, field5267};
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Ldt;I)V",
		garbageValue = "2134611847"
	)
	static final void method9517(WorldView var0) {
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
			byte[][] var50 = class202.Tiles_underlays2[var7];
			boolean var56 = true;
			boolean var57 = true;
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
					var20 = (int)Math.sqrt((double)(var19 * var19 + var18 * var18 + 65536));
					var21 = (var18 << 8) / var20;
					var22 = 65536 / var20;
					var23 = (var19 << 8) / var20;
					var24 = (var21 * -50 + var23 * -50 + var22 * -10) / var15 + 96;
					var25 = (var50[var17][var16 + 1] >> 3) + (var50[var17 - 1][var16] >> 2) + (var50[var17][var16 - 1] >> 2) + (var50[var17 + 1][var16] >> 3) + (var50[var17][var16] >> 1);
					class17.field84[var17][var16] = var24 - var25;
				}
			}

			for (var16 = 0; var16 < var2; ++var16) {
				ParamComposition.Tiles_hue[var16] = 0;
				class194.Tiles_saturation[var16] = 0;
				Tiles.Tiles_lightness[var16] = 0;
				class131.Tiles_hueMultiplier[var16] = 0;
				Tiles.field1050[var16] = 0;
			}

			for (var16 = -5; var16 < var1 + 5; ++var16) {
				for (var17 = 0; var17 < var2; ++var17) {
					var18 = var16 + 5;
					int var10002;
					if (var18 >= 0 && var18 < var1) {
						var19 = (int)WidgetDefinition.method6548(15);
						var20 = class197.Tiles_underlays[var7][var18][var17] & var19;
						if (var20 > 0) {
							FloorUnderlayDefinition var54 = Sound.method4179(var20 - 1);
							var10000 = ParamComposition.Tiles_hue;
							var10000[var17] += var54.hue;
							var10000 = class194.Tiles_saturation;
							var10000[var17] += var54.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] += var54.lightness;
							var10000 = class131.Tiles_hueMultiplier;
							var10000[var17] += var54.hueMultiplier;
							var10002 = Tiles.field1050[var17]++;
						}
					}

					var19 = var16 - 5;
					if (var19 >= 0 && var19 < var1) {
						var20 = (int)WidgetDefinition.method6548(15);
						var21 = class197.Tiles_underlays[var7][var19][var17] & var20;
						if (var21 > 0) {
							FloorUnderlayDefinition var55 = Sound.method4179(var21 - 1);
							var10000 = ParamComposition.Tiles_hue;
							var10000[var17] -= var55.hue;
							var10000 = class194.Tiles_saturation;
							var10000[var17] -= var55.saturation;
							var10000 = Tiles.Tiles_lightness;
							var10000[var17] -= var55.lightness;
							var10000 = class131.Tiles_hueMultiplier;
							var10000[var17] -= var55.hueMultiplier;
							var10002 = Tiles.field1050[var17]--;
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
							var17 += ParamComposition.Tiles_hue[var23];
							var18 += class194.Tiles_saturation[var23];
							var19 += Tiles.Tiles_lightness[var23];
							var20 += class131.Tiles_hueMultiplier[var23];
							var21 += Tiles.field1050[var23];
						}

						var24 = var22 - 5;
						if (var24 >= 0 && var24 < var2) {
							var17 -= ParamComposition.Tiles_hue[var24];
							var18 -= class194.Tiles_saturation[var24];
							var19 -= Tiles.Tiles_lightness[var24];
							var20 -= class131.Tiles_hueMultiplier[var24];
							var21 -= Tiles.field1050[var24];
						}

						if (var22 >= 1 && var22 < var2 - 1 && (!Client.isLowDetail || (var4[0][var16][var22] & 2) != 0 || (var4[var7][var16][var22] & 16) == 0)) {
							if (var7 < Tiles.Tiles_minPlane) {
								Tiles.Tiles_minPlane = var7;
							}

							var25 = (int)WidgetDefinition.method6548(15);
							int var26 = class197.Tiles_underlays[var7][var16][var22] & var25;
							int var27 = Tiles.Tiles_overlays[var7][var16][var22] & var25;
							if (var26 > 0 || var27 > 0) {
								int var28 = var3[var7][var16][var22];
								int var29 = var3[var7][var16 + 1][var22];
								int var30 = var3[var7][var16 + 1][var22 + 1];
								int var31 = var3[var7][var16][var22 + 1];
								int var32 = class17.field84[var16][var22];
								int var33 = class17.field84[var16 + 1][var22];
								int var34 = class17.field84[var16 + 1][var22 + 1];
								int var35 = class17.field84[var16][var22 + 1];
								int var36 = -1;
								int var37 = -1;
								int var38;
								int var39;
								int var40;
								if (var26 > 0) {
									var38 = var17 * 256 / var20;
									var39 = var18 / var21;
									var40 = var19 / var21;
									var36 = class429.method7981(var38, var39, var40);
									var38 = var38 + Tiles.rndHue & 255;
									var40 += Tiles.rndLightness;
									if (var40 < 0) {
										var40 = 0;
									} else if (var40 > 255) {
										var40 = 255;
									}

									var37 = class429.method7981(var38, var39, var40);
								}

								FloorOverlayDefinition var41;
								if (var7 > 0) {
									boolean var62 = true;
									if (var26 == 0 && TilesProjection.Tiles_shapes[var7][var16][var22] != 0) {
										var62 = false;
									}

									if (var27 > 0) {
										var40 = var27 - 1;
										var41 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var40);
										FloorOverlayDefinition var51;
										if (var41 != null) {
											var51 = var41;
										} else {
											byte[] var42 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var40);
											var41 = new FloorOverlayDefinition();
											if (var42 != null) {
												var41.decode(new Buffer(var42), var40);
											}

											var41.postDecode();
											FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var41, (long)var40);
											var51 = var41;
										}

										if (!var51.hideUnderlay) {
											var62 = false;
										}
									}

									if (var62 && var29 == var28 && var30 == var28 && var31 == var28) {
										var10000 = SongTask.field4795[var7][var16];
										var10000[var22] |= 2340;
									}
								}

								var38 = 0;
								if (var37 != -1) {
									var38 = Rasterizer3D.Rasterizer3D_colorPalette[class414.method7717(var37, 96)];
								}

								if (var27 == 0) {
									var5.addTile(var7, var16, var22, 0, 0, -1, var28, var29, var30, var31, class414.method7717(var36, var32), class414.method7717(var36, var33), class414.method7717(var36, var34), class414.method7717(var36, var35), 0, 0, 0, 0, var38, 0);
								} else {
									var39 = TilesProjection.Tiles_shapes[var7][var16][var22] + 1;
									byte var63 = AbstractByteArrayCopier.field3975[var7][var16][var22];
									int var52 = var27 - 1;
									FloorOverlayDefinition var43 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var52);
									if (var43 != null) {
										var41 = var43;
									} else {
										byte[] var44 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var52);
										var43 = new FloorOverlayDefinition();
										if (var44 != null) {
											var43.decode(new Buffer(var44), var52);
										}

										var43.postDecode();
										FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var43, (long)var52);
										var41 = var43;
									}

									int var53 = var41.texture;
									int var45;
									int var46;
									int var47;
									int var48;
									if (var53 >= 0) {
										var46 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var53);
										var45 = -1;
									} else if (var41.primaryRgb == 16711935) {
										var45 = -2;
										var53 = -1;
										var46 = -2;
									} else {
										var45 = class429.method7981(var41.hue, var41.saturation, var41.lightness);
										var47 = var41.hue + Tiles.rndHue & 255;
										var48 = var41.lightness + Tiles.rndLightness;
										if (var48 < 0) {
											var48 = 0;
										} else if (var48 > 255) {
											var48 = 255;
										}

										var46 = class429.method7981(var47, var41.saturation, var48);
									}

									var47 = 0;
									if (var46 != -2) {
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[HttpRequest.method84(var46, 96)];
									}

									if (var41.secondaryRgb != -1) {
										var48 = var41.secondaryHue + Tiles.rndHue & 255;
										int var49 = var41.secondaryLightness + Tiles.rndLightness;
										if (var49 < 0) {
											var49 = 0;
										} else if (var49 > 255) {
											var49 = 255;
										}

										var46 = class429.method7981(var48, var41.secondarySaturation, var49);
										var47 = Rasterizer3D.Rasterizer3D_colorPalette[HttpRequest.method84(var46, 96)];
									}

									var5.addTile(var7, var16, var22, var39, var63, var53, var28, var29, var30, var31, class414.method7717(var36, var32), class414.method7717(var36, var33), class414.method7717(var36, var34), class414.method7717(var36, var35), HttpRequest.method84(var45, var32), HttpRequest.method84(var45, var33), HttpRequest.method84(var45, var34), HttpRequest.method84(var45, var35), var38, var47);
								}
							}
						}
					}
				}
			}

			for (var16 = 1; var16 < var2 - 1; ++var16) {
				for (var17 = 1; var17 < var1 - 1; ++var17) {
					var5.setTileMinPlane(var7, var17, var16, WidgetDefinition.method6546(var0, var7, var17, var16));
				}
			}

			class197.Tiles_underlays[var7] = null;
			Tiles.Tiles_overlays[var7] = null;
			TilesProjection.Tiles_shapes[var7] = null;
			AbstractByteArrayCopier.field3975[var7] = null;
			class202.Tiles_underlays2[var7] = null;
		}

		var5.method4882(-50, -10, -50);

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

			for (int var58 = 0; var58 <= var10; ++var58) {
				for (int var59 = 0; var59 <= var2; ++var59) {
					for (int var60 = 0; var60 <= var1; ++var60) {
						short var61;
						if ((SongTask.field4795[var58][var60][var59] & var7) != 0) {
							var14 = var59;
							var15 = var59;
							var16 = var58;

							for (var17 = var58; var14 > 0 && (SongTask.field4795[var58][var60][var14 - 1] & var7) != 0; --var14) {
							}

							while (var15 < var2 && (SongTask.field4795[var58][var60][var15 + 1] & var7) != 0) {
								++var15;
							}

							label446:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((SongTask.field4795[var16 - 1][var60][var18] & var7) == 0) {
										break label446;
									}
								}

								--var16;
							}

							label435:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((SongTask.field4795[var17 + 1][var60][var18] & var7) == 0) {
										break label435;
									}
								}

								++var17;
							}

							var18 = (var15 - var14 + 1) * (var17 + 1 - var16);
							if (var18 >= 8) {
								var61 = 240;
								var20 = var3[var17][var60][var14] - var61;
								var21 = var3[var16][var60][var14];
								var5.Scene_addOccluder(var10, 1, var60 * 128, var60 * 128, var14 * 128, var15 * 128 + 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = SongTask.field4795[var22][var60];
										var10000[var23] &= ~var7;
									}
								}
							}
						}

						if ((SongTask.field4795[var58][var60][var59] & var8) != 0) {
							var14 = var60;
							var15 = var60;
							var16 = var58;

							for (var17 = var58; var14 > 0 && (SongTask.field4795[var58][var14 - 1][var59] & var8) != 0; --var14) {
							}

							while (var15 < var1 && (SongTask.field4795[var58][var15 + 1][var59] & var8) != 0) {
								++var15;
							}

							label499:
							while (var16 > 0) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((SongTask.field4795[var16 - 1][var18][var59] & var8) == 0) {
										break label499;
									}
								}

								--var16;
							}

							label488:
							while (var17 < var10) {
								for (var18 = var14; var18 <= var15; ++var18) {
									if ((SongTask.field4795[var17 + 1][var18][var59] & var8) == 0) {
										break label488;
									}
								}

								++var17;
							}

							var18 = (var17 + 1 - var16) * (var15 - var14 + 1);
							if (var18 >= 8) {
								var61 = 240;
								var20 = var3[var17][var14][var59] - var61;
								var21 = var3[var16][var14][var59];
								var5.Scene_addOccluder(var10, 2, var14 * 128, var15 * 128 + 128, var59 * 128, var59 * 128, var20, var21);

								for (var22 = var16; var22 <= var17; ++var22) {
									for (var23 = var14; var23 <= var15; ++var23) {
										var10000 = SongTask.field4795[var22][var23];
										var10000[var59] &= ~var8;
									}
								}
							}
						}

						if ((SongTask.field4795[var58][var60][var59] & var9) != 0) {
							var14 = var60;
							var15 = var60;
							var16 = var59;

							for (var17 = var59; var16 > 0 && (SongTask.field4795[var58][var60][var16 - 1] & var9) != 0; --var16) {
							}

							while (var17 < var2 && (SongTask.field4795[var58][var60][var17 + 1] & var9) != 0) {
								++var17;
							}

							label552:
							while (var14 > 0) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((SongTask.field4795[var58][var14 - 1][var18] & var9) == 0) {
										break label552;
									}
								}

								--var14;
							}

							label541:
							while (var15 < var1) {
								for (var18 = var16; var18 <= var17; ++var18) {
									if ((SongTask.field4795[var58][var15 + 1][var18] & var9) == 0) {
										break label541;
									}
								}

								++var15;
							}

							if ((var17 - var16 + 1) * (var15 - var14 + 1) >= 4) {
								var18 = var3[var58][var14][var16];
								var5.Scene_addOccluder(var10, 4, var14 * 128, var15 * 128 + 128, var16 * 128, var17 * 128 + 128, var18, var18);

								for (var19 = var14; var19 <= var15; ++var19) {
									for (var20 = var16; var20 <= var17; ++var20) {
										var10000 = SongTask.field4795[var58][var19];
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

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(Liw;I)V",
		garbageValue = "-469828581"
	)
	static void method9516(class229 var0) {
		if (var0 != null && var0.field2459 != null) {
			if (var0.field2459.childIndex >= 0) {
				Widget var1 = AsyncRestClient.widgetDefinition.method6536(var0.field2459.parentId);
				if (var1 == null || var1.children == null || var1.children.length == 0 || var0.field2459.childIndex >= var1.children.length || var0.field2459 != var1.children[var0.field2459.childIndex]) {
					return;
				}
			}

			if (var0.field2459.type == 11 && var0.field2458 == 0) {
				if (var0.field2459.method6930(var0.field2457, var0.field2460, 0, 0)) {
					var0.field2459.method6938().method3508().method3657(1, var0.field2459.method6938().method3520());
					switch(var0.field2459.method6934()) {
					case 0:
						class379.openURL(var0.field2459.method6936(), true, false);
						break;
					case 1:
						int var2 = class160.getWidgetFlags(var0.field2459);
						boolean var5 = (var2 >> 22 & 1) != 0;
						if (var5) {
							int[] var3 = var0.field2459.method6937();
							if (var3 != null) {
								PacketBufferNode var4 = WorldMapElement.getPacketBufferNode(ClientPacket.field3342, Client.packetWriter.isaacCipher);
								var4.packetBuffer.writeIntME(var0.field2459.method7052());
								var4.packetBuffer.writeIntME(var3[1]);
								var4.packetBuffer.writeIntIME(var3[2]);
								var4.packetBuffer.writeShortAddLE(var0.field2459.childIndex);
								var4.packetBuffer.writeIntIME(var0.field2459.id);
								var4.packetBuffer.writeIntLE(var3[0]);
								Client.packetWriter.addNode(var4);
							}
						}
					}
				}
			} else if (var0.field2459.type == 12) {
				class355 var6 = var0.field2459.method6942();
				if (var6 != null && var6.method6731()) {
					switch(var0.field2458) {
					case 0:
						Client.field552.method4377(var0.field2459);
						var6.method6617(true);
						var6.method6668(var0.field2457, var0.field2460, Client.indexCheck.isValidIndexInRange(82), Client.indexCheck.isValidIndexInRange(81));
						break;
					case 1:
						var6.method6703(var0.field2457, var0.field2460);
					}
				}
			}

		}
	}
}
