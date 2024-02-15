import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ke")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -103174417
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1006037985
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -2135927327
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 514582153
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1945820401
	)
	@Export("type")
	int type;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = -1573918785
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -266623797
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 373914063
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -632899747
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1480224713
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -242515549
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -225533837
	)
	int field2942;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1155392615
	)
	int field2937;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -910623109
	)
	int field2946;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 2123943263
	)
	int field2941;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1524963301
	)
	int field2945;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1245318489
	)
	int field2947;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -84973589
	)
	int field2943;

	Occluder() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1558434695"
	)
	static int method5636(int var0, Script var1, boolean var2) {
		Widget var3 = ArchiveLoader.widgetDefinition.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("jr")
	@ObfuscatedSignature(
		descriptor = "(Ldz;IIIIII)V",
		garbageValue = "613641165"
	)
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC)var0).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}

				if (var6 == null) {
					return;
				}
			}

			int var75 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			boolean var8 = var1 < var75;
			int var9 = -2;
			if (var0.overheadText != null && (!var8 || !var0.field1205 && (Client.publicChatMode == 4 || !var0.field1228 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				ClientPreferences.method2639(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class166.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class166.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9;
					Client.overheadTextColors[Client.overheadTextCount] = var0.field1208;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field1231;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.field637[Client.overheadTextCount] = var0.field1226;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
					var9 += 12;
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7456()) {
				ClientPreferences.method2639(var0, var0.defaultHeight + 15);

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var11 = var10.get(Client.cycle);
					if (var11 == null) {
						if (var10.isEmpty()) {
							var10.remove();
						}
					} else {
						HealthBarDefinition var12 = var10.definition;
						SpritePixels var79 = var12.getBackSprite();
						SpritePixels var83 = var12.getFrontSprite();
						int var84 = 0;
						if (var79 != null && var83 != null) {
							if (var12.widthPadding * 2 < var83.subWidth) {
								var84 = var12.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2;
						} else {
							var15 = var12.width;
						}

						int var81 = 255;
						boolean var85 = true;
						int var86 = Client.cycle - var11.cycle;
						int var87 = var15 * var11.health2 / var12.width;
						int var88;
						int var98;
						if (var11.cycleOffset > var86) {
							var88 = var12.field1916 == 0 ? 0 : var12.field1916 * (var86 / var12.field1916);
							var22 = var15 * var11.health / var12.width;
							var98 = var88 * (var87 - var22) / var11.cycleOffset + var22;
						} else {
							var98 = var87;
							var88 = var12.int5 + var11.cycleOffset - var86;
							if (var12.int3 >= 0) {
								var81 = (var88 << 8) / (var12.int5 - var12.int3);
							}
						}

						if (var11.health2 > 0 && var98 < 1) {
							var98 = 1;
						}

						if (var79 != null && var83 != null) {
							if (var98 == var15) {
								var98 += var84 * 2;
							} else {
								var98 += var84;
							}

							var88 = var79.subHeight;
							var9 += var88;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var23 = var3 + Client.viewportTempY - var9;
							var22 -= var84;
							if (var81 >= 0 && var81 < 255) {
								var79.drawTransAt(var22, var23, var81);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var88);
								var83.drawTransAt(var22, var23, var81);
							} else {
								var79.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var98 + var22, var23 + var88);
								var83.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var9 += 2;
						} else {
							var9 += 5;
							if (Client.viewportTempX > -1) {
								var88 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var9;
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var98, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var98 + var88, var22, var15 - var98, 5, 16711680);
							}

							var9 += 2;
						}
					}
				}
			}

			if (var9 == -2) {
				var9 += 7;
			}

			Player var89;
			if (var8 && var0.playerCycle == Client.cycle && SpotAnimationDefinition.method3798((Player)var0)) {
				var89 = (Player)var0;
				if (var8) {
					ClientPreferences.method2639(var0, var0.defaultHeight + 15);
					AbstractFont var90 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					var9 += 4;
					var90.drawCentered(var89.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0);
					var9 += 18;
				}
			}

			if (var8) {
				var89 = (Player)var0;
				if (var89.isHidden) {
					return;
				}

				if (var89.headIconPk != -1 || var89.headIconPrayer != -1) {
					ClientPreferences.method2639(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var89.headIconPk != -1) {
							var9 += 25;
							class13.headIconPkSprites[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}

						if (var89.headIconPrayer != -1) {
							var9 += 25;
							class168.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					ClientPreferences.method2639(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var9 += ChatChannel.headIconHintSprites[1].subHeight;
						ChatChannel.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
					}
				}
			} else {
				NPC var91 = (NPC)var0;
				int[] var92 = var91.method2715();
				short[] var93 = var91.method2722();
				if (var93 != null && var92 != null) {
					for (int var13 = 0; var13 < var93.length; ++var13) {
						if (var93[var13] >= 0 && var92[var13] >= 0) {
							long var14 = (long)var92[var13] << 8 | (long)var93[var13];
							SpritePixels var16 = (SpritePixels)Client.field821.method8198(var14);
							if (var16 == null) {
								SpritePixels[] var17 = class138.method3146(class311.archive8, var92[var13], 0);
								if (var17 != null && var93[var13] < var17.length) {
									var16 = var17[var93[var13]];
									Client.field821.method8201(var14, var16);
								}
							}

							if (var16 != null) {
								ClientPreferences.method2639(var0, var0.defaultHeight + 15);
								if (Client.viewportTempX > -1) {
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					ClientPreferences.method2639(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						ChatChannel.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var76 = 0; var76 < 4; ++var76) {
				int var77 = var0.hitSplatCycles[var76];
				int var78 = var0.hitSplatTypes[var76];
				HitSplatDefinition var96 = null;
				int var80 = 0;
				if (var78 >= 0) {
					if (var77 <= Client.cycle) {
						continue;
					}

					var96 = Language.method7357(var0.hitSplatTypes[var76]);
					var80 = var96.field2092;
					if (var96 != null && var96.transforms != null) {
						var96 = var96.transform();
						if (var96 == null) {
							var0.hitSplatCycles[var76] = -1;
							continue;
						}
					}
				} else if (var77 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var76];
				HitSplatDefinition var94 = null;
				if (var15 >= 0) {
					var94 = Language.method7357(var15);
					if (var94 != null && var94.transforms != null) {
						var94 = var94.transform();
					}
				}

				if (var77 - var80 <= Client.cycle) {
					if (var96 == null) {
						var0.hitSplatCycles[var76] = -1;
					} else {
						ClientPreferences.method2639(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > -1) {
							boolean var97 = true;
							if (var76 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var76 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var76 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var18 = null;
							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							var22 = 0;
							var23 = 0;
							int var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							SpritePixels var30 = null;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							int var34 = 0;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							var18 = var96.method3914();
							int var43;
							if (var18 != null) {
								var22 = var18.subWidth;
								var43 = var18.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var18.xOffset;
							}

							var19 = var96.method3884();
							if (var19 != null) {
								var23 = var19.subWidth;
								var43 = var19.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var19.xOffset;
							}

							var20 = var96.method3904();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var96.method3886();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var94 != null) {
								var30 = var94.method3914();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var94.method3884();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var94.method3904();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var94.method3886();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var82 = var96.getFont();
							if (var82 == null) {
								var82 = class60.fontPlain11;
							}

							Font var44;
							if (var94 != null) {
								var44 = var94.getFont();
								if (var44 == null) {
									var44 = class60.fontPlain11;
								}
							} else {
								var44 = class60.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var96.getString(var0.hitSplatValues[var76]);
							int var95 = var82.stringWidth(var45);
							if (var94 != null) {
								var46 = var94.getString(var0.hitSplatValues2[var76]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var20 == null && var21 == null) {
									var49 = 1;
								} else {
									var49 = var95 / var23 + 1;
								}
							}

							if (var94 != null && var35 > 0) {
								if (var32 == null && var33 == null) {
									var50 = 1;
								} else {
									var50 = var48 / var35 + 1;
								}
							}

							int var51 = 0;
							int var52 = var51;
							if (var22 > 0) {
								var51 += var22;
							}

							var51 += 2;
							int var53 = var51;
							if (var24 > 0) {
								var51 += var24;
							}

							int var54 = var51;
							int var55 = var51;
							int var56;
							if (var23 > 0) {
								var56 = var49 * var23;
								var51 += var56;
								var55 += (var56 - var95) / 2;
							} else {
								var51 += var95;
							}

							var56 = var51;
							if (var25 > 0) {
								var51 += var25;
							}

							int var57 = 0;
							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62;
							if (var94 != null) {
								var51 += 2;
								var57 = var51;
								if (var34 > 0) {
									var51 += var34;
								}

								var51 += 2;
								var58 = var51;
								if (var36 > 0) {
									var51 += var36;
								}

								var59 = var51;
								var61 = var51;
								if (var35 > 0) {
									var62 = var35 * var50;
									var51 += var62;
									var61 += (var62 - var48) / 2;
								} else {
									var51 += var48;
								}

								var60 = var51;
								if (var37 > 0) {
									var51 += var37;
								}
							}

							var62 = var0.hitSplatCycles[var76] - Client.cycle;
							int var63 = var96.field2100 - var62 * var96.field2100 / var96.field2092;
							int var64 = var62 * var96.field2098 / var96.field2092 + -var96.field2098;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var3 + Client.viewportTempY - 12 + var64;
							int var67 = var66;
							int var68 = var66 + var42;
							int var69 = var66 + var96.field2090 + 15;
							int var70 = var69 - var82.maxAscent;
							int var71 = var69 + var82.maxDescent;
							if (var70 < var66) {
								var67 = var70;
							}

							if (var71 > var68) {
								var68 = var71;
							}

							int var72 = 0;
							int var73;
							int var74;
							if (var94 != null) {
								var72 = var66 + var94.field2090 + 15;
								var73 = var72 - var44.maxAscent;
								var74 = var72 + var44.maxDescent;
								if (var73 < var67) {
									;
								}

								if (var74 > var68) {
									;
								}
							}

							var73 = 255;
							if (var96.field2099 >= 0) {
								var73 = (var62 << 8) / (var96.field2092 - var96.field2099);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var18 != null) {
									var18.drawTransAt(var65 + var52 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var53 + var65 - var28, var66, var73);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransAt(var23 * var74 + (var54 + var65 - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var65 + var55, var69, var96.textColor, 0, var73);
								if (var94 != null) {
									if (var30 != null) {
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var35 * var74 + (var59 + var65 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var65 + var61, var72, var94.textColor, 0, var73);
								}
							} else {
								if (var18 != null) {
									var18.drawTransBgAt(var65 + var52 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransBgAt(var74 * var23 + (var65 + var54 - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt(var65 + var56 - var29, var66);
								}

								var82.draw(var45, var65 + var55, var69, var96.textColor | -16777216, 0);
								if (var94 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var65 + var58 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var35 * var74 + (var65 + var59 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var60 + var65 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var94.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
