import java.util.ArrayList;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("do")
public enum class92 implements Enum {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1105(0, -1),
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1099(1, 2),
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1104(2, 3),
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1101(3, 4),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1102(4, 5),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldo;"
	)
	field1103(5, 6);

	@ObfuscatedName("ja")
	@Export("regions")
	static int[] regions;
	@ObfuscatedName("vq")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("masterDisk")
	static ArchiveDisk masterDisk;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 16352719
	)
	final int field1106;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1905876341
	)
	final int field1107;

	class92(int var3, int var4) {
		this.field1106 = var3;
		this.field1107 = var4;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "111"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1107;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "3"
	)
	public static void method2440(int var0, int var1) {
		UserComparator6.method3100(var0, var1, 0, 0);
		class332.field3565.clear();
		class332.field3566.clear();
		if (class332.musicSongs.isEmpty() || var0 == 0 && var1 == 0) {
			WorldMapLabelSize.method5532();
		} else {
			class332.field3566.add(new DelayFadeTask((SongTask)null, class332.musicPlayerStatus));
			class332.field3566.add(new FadeOutTask((SongTask)null, 0, false, class332.field3568));
			ArrayList var2 = class523.method9342();
			class332.field3566.add(new class440((SongTask)null, var2));
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)Lcf;",
		garbageValue = "308589284"
	)
	@Export("getNextWorldListWorld")
	static World getNextWorldListWorld() {
		return World.World_listCount < World.World_count ? class319.World_worlds[++World.World_listCount - 1] : null;
	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ldy;Ldt;IIIIII)V",
		garbageValue = "-338953861"
	)
	@Export("drawActor2d")
	static final void drawActor2d(WorldView var0, Actor var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null && var1.isVisible()) {
			if (var1 instanceof NPC) {
				NPCComposition var7 = ((NPC)var1).definition;
				if (var7.transforms != null) {
					var7 = var7.transform();
				}

				if (var7 == null) {
					return;
				}
			}

			int var76 = var0.playerUpdateManager.playerCount;
			int[] var8 = var0.playerUpdateManager.playerIndices;
			boolean var9 = var2 < var76;
			int var10 = -2;
			if (var1.overheadText != null && (!var9 || !var1.field1208 && (Client.publicChatMode == 4 || !var1.field1201 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var1).isFriend())))) {
				class414.method7695(var0, var1, var1.vmethod2812());
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = WorldMapLabelSize.fontBold12.stringWidth(var1.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = WorldMapLabelSize.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var10;
					Client.overheadTextColors[Client.overheadTextCount] = var1.field1204;
					Client.overheadTextEffects[Client.overheadTextCount] = var1.field1205;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var1.overheadTextCyclesRemaining;
					Client.field616[Client.overheadTextCount] = var1.field1206;
					Client.overheadText[Client.overheadTextCount] = var1.overheadText;
					++Client.overheadTextCount;
					var10 += 12;
				}
			}

			int var16;
			int var23;
			int var24;
			if (!var1.healthBars.method7575()) {
				class414.method7695(var0, var1, var1.vmethod2812() + 15);

				for (HealthBarConfig var11 = (HealthBarConfig)var1.healthBars.last(); var11 != null; var11 = (HealthBarConfig)var1.healthBars.previous()) {
					HealthBarUpdate var12 = var11.get(Client.cycle);
					if (var12 == null) {
						if (var11.isEmpty()) {
							var11.remove();
						}
					} else {
						HealthBarDefinition var78 = var11.definition;
						SpritePixels var79 = var78.getBackSprite();
						SpritePixels var85 = var78.getFrontSprite();
						int var86 = 0;
						if (var79 != null && var85 != null) {
							if (var78.widthPadding * 2 < var85.subWidth) {
								var86 = var78.widthPadding;
							}

							var16 = var85.subWidth - var86 * 2;
						} else {
							var16 = var78.width;
						}

						int var83 = 255;
						boolean var87 = true;
						int var88 = Client.cycle - var12.cycle;
						int var89 = var16 * var12.health2 / var78.width;
						int var90;
						int var106;
						if (var12.cycleOffset > var88) {
							var90 = var78.field2509 == 0 ? 0 : var78.field2509 * (var88 / var78.field2509);
							var23 = var16 * var12.health / var78.width;
							var106 = var90 * (var89 - var23) / var12.cycleOffset + var23;
						} else {
							var106 = var89;
							var90 = var78.int5 + var12.cycleOffset - var88;
							if (var78.int3 >= 0) {
								var83 = (var90 << 8) / (var78.int5 - var78.int3);
							}
						}

						if (var12.health2 > 0 && var106 < 1) {
							var106 = 1;
						}

						if (var79 != null && var85 != null) {
							if (var106 == var16) {
								var106 += var86 * 2;
							} else {
								var106 += var86;
							}

							var90 = var79.subHeight;
							var10 += var90;
							var23 = var3 + Client.viewportTempX - (var16 >> 1);
							var24 = var4 + Client.viewportTempY - var10;
							var23 -= var86;
							if (var83 >= 0 && var83 < 255) {
								var79.drawTransAt(var23, var24, var83);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var106, var90 + var24);
								var85.drawTransAt(var23, var24, var83);
							} else {
								var79.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var106 + var23, var24 + var90);
								var85.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var3, var4, var3 + var5, var4 + var6);
							var10 += 2;
						} else {
							var10 += 5;
							if (Client.viewportTempX > -1) {
								var90 = var3 + Client.viewportTempX - (var16 >> 1);
								var23 = var4 + Client.viewportTempY - var10;
								Rasterizer2D.Rasterizer2D_fillRectangle(var90, var23, var106, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var90 + var106, var23, var16 - var106, 5, 16711680);
							}

							var10 += 2;
						}
					}
				}
			}

			if (var10 == -2) {
				var10 += 7;
			}

			if (var9 && Client.cycle == var1.playerCycle) {
				Player var93 = (Player)var1;
				boolean var77;
				if (Client.drawPlayerNames == 0) {
					var77 = false;
				} else {
					boolean var13;
					if (var93 != class253.localPlayer) {
						var13 = (Client.drawPlayerNames & 4) != 0;
						boolean var14 = var13;
						if (!var13) {
							boolean var15 = (Client.drawPlayerNames & 1) != 0;
							var14 = var15 && var93.isFriend();
						}

						var77 = var14 || AsyncRestClient.method161() && var93.isFriendsChatMember();
					} else {
						var13 = (Client.drawPlayerNames & 8) != 0;
						var77 = var13;
					}
				}

				if (var77) {
					Player var100 = (Player)var1;
					if (var9) {
						class414.method7695(var0, var1, var1.vmethod2812() + 15);
						AbstractFont var103 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						var10 += 4;
						var103.drawCentered(var100.username.getName(), var3 + Client.viewportTempX, var4 + Client.viewportTempY - var10, 16777215, 0);
						var10 += 18;
					}
				}
			}

			if (var9) {
				Player var91 = (Player)var1;
				if (var91.isHidden) {
					return;
				}

				if (var91.headIconPk != -1 || var91.headIconPrayer != -1) {
					class414.method7695(var0, var1, var1.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var91.headIconPk != -1) {
							var10 += 25;
							SecureRandomFuture.headIconPkSprites[var91.headIconPk].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}

						if (var91.headIconPrayer != -1) {
							var10 += 25;
							VertexNormal.headIconPrayerSprites[var91.headIconPrayer].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}
					}
				}

				if (var2 >= 0 && Client.hintArrowType == 10 && var8[var2] == Client.hintArrowPlayerIndex) {
					class414.method7695(var0, var1, var1.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var10 += class218.headIconHintSprites[1].subHeight;
						class218.headIconHintSprites[1].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
					}
				}
			} else {
				NPC var92 = (NPC)var1;
				int[] var94 = var92.method2755();
				short[] var102 = var92.method2757();
				if (var102 != null && var94 != null) {
					for (int var96 = 0; var96 < var102.length; ++var96) {
						if (var102[var96] >= 0 && var94[var96] >= 0) {
							long var80 = (long)var94[var96] << 8 | (long)var102[var96];
							SpritePixels var17 = (SpritePixels)Client.field790.method8501(var80);
							if (var17 == null) {
								SpritePixels[] var18 = Timer.method8427(class59.archive8, var94[var96], 0);
								if (var18 != null && var102[var96] < var18.length) {
									var17 = var18[var102[var96]];
									Client.field790.method8499(var80, var17);
								}
							}

							if (var17 != null) {
								class414.method7695(var0, var1, var1.vmethod2812() + 15);
								if (Client.viewportTempX > -1) {
									var17.drawTransBgAt(var3 + Client.viewportTempX - (var17.subWidth >> 1), (var96 + 1) * (var4 - var17.subHeight - 2) - var17.subHeight + Client.viewportTempY - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && var0.npcIndices[var2 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					class414.method7695(var0, var1, var1.vmethod2812() + 15);
					if (Client.viewportTempX > -1) {
						class218.headIconHintSprites[0].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var101 = 0; var101 < 4; ++var101) {
				int var82 = var1.hitSplatCycles[var101];
				int var95 = var1.hitSplatTypes[var101];
				HitSplatDefinition var104 = null;
				int var97 = 0;
				if (var95 >= 0) {
					if (var82 <= Client.cycle) {
						continue;
					}

					var104 = class499.method8944(var1.hitSplatTypes[var101]);
					var97 = var104.field2708;
					if (var104 != null && var104.transforms != null) {
						var104 = var104.transform();
						if (var104 == null) {
							var1.hitSplatCycles[var101] = -1;
							continue;
						}
					}
				} else if (var82 < 0) {
					continue;
				}

				var16 = var1.hitSplatTypes2[var101];
				HitSplatDefinition var98 = null;
				if (var16 >= 0) {
					var98 = class499.method8944(var16);
					if (var98 != null && var98.transforms != null) {
						var98 = var98.transform();
					}
				}

				if (var82 - var97 <= Client.cycle) {
					if (var104 == null) {
						var1.hitSplatCycles[var101] = -1;
					} else {
						class414.method7695(var0, var1, var1.vmethod2812() / 2);
						if (Client.viewportTempX > -1) {
							boolean var105 = true;
							if (var101 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var101 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var101 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							SpritePixels var19 = null;
							SpritePixels var20 = null;
							SpritePixels var21 = null;
							SpritePixels var22 = null;
							var23 = 0;
							var24 = 0;
							int var25 = 0;
							int var26 = 0;
							int var27 = 0;
							int var28 = 0;
							int var29 = 0;
							int var30 = 0;
							SpritePixels var31 = null;
							SpritePixels var32 = null;
							SpritePixels var33 = null;
							SpritePixels var34 = null;
							int var35 = 0;
							int var36 = 0;
							int var37 = 0;
							int var38 = 0;
							int var39 = 0;
							int var40 = 0;
							int var41 = 0;
							int var42 = 0;
							int var43 = 0;
							var19 = var104.method5076();
							int var44;
							if (var19 != null) {
								var23 = var19.subWidth;
								var44 = var19.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var19.xOffset;
							}

							var20 = var104.method5092();
							if (var20 != null) {
								var24 = var20.subWidth;
								var44 = var20.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var20.xOffset;
							}

							var21 = var104.method5071();
							if (var21 != null) {
								var25 = var21.subWidth;
								var44 = var21.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var21.xOffset;
							}

							var22 = var104.method5079();
							if (var22 != null) {
								var26 = var22.subWidth;
								var44 = var22.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var22.xOffset;
							}

							if (var98 != null) {
								var31 = var98.method5076();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.xOffset;
								}

								var32 = var98.method5092();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.xOffset;
								}

								var33 = var98.method5071();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.xOffset;
								}

								var34 = var98.method5079();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.xOffset;
								}
							}

							Font var84 = var104.getFont();
							if (var84 == null) {
								var84 = Occluder.fontPlain11;
							}

							Font var45;
							if (var98 != null) {
								var45 = var98.getFont();
								if (var45 == null) {
									var45 = Occluder.fontPlain11;
								}
							} else {
								var45 = Occluder.fontPlain11;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var104.getString(var1.hitSplatValues[var101]);
							int var99 = var84.stringWidth(var46);
							if (var98 != null) {
								var47 = var98.getString(var1.hitSplatValues2[var101]);
								var49 = var45.stringWidth(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var21 == null && var22 == null) {
									var50 = 1;
								} else {
									var50 = var99 / var24 + 1;
								}
							}

							if (var98 != null && var36 > 0) {
								if (var33 == null && var34 == null) {
									var51 = 1;
								} else {
									var51 = var49 / var36 + 1;
								}
							}

							int var52 = 0;
							int var53 = var52;
							if (var23 > 0) {
								var52 += var23;
							}

							var52 += 2;
							int var54 = var52;
							if (var25 > 0) {
								var52 += var25;
							}

							int var55 = var52;
							int var56 = var52;
							int var57;
							if (var24 > 0) {
								var57 = var24 * var50;
								var52 += var57;
								var56 += (var57 - var99) / 2;
							} else {
								var52 += var99;
							}

							var57 = var52;
							if (var26 > 0) {
								var52 += var26;
							}

							int var58 = 0;
							int var59 = 0;
							int var60 = 0;
							int var61 = 0;
							int var62 = 0;
							int var63;
							if (var98 != null) {
								var52 += 2;
								var58 = var52;
								if (var35 > 0) {
									var52 += var35;
								}

								var52 += 2;
								var59 = var52;
								if (var37 > 0) {
									var52 += var37;
								}

								var60 = var52;
								var62 = var52;
								if (var36 > 0) {
									var63 = var51 * var36;
									var52 += var63;
									var62 += (var63 - var49) / 2;
								} else {
									var52 += var49;
								}

								var61 = var52;
								if (var38 > 0) {
									var52 += var38;
								}
							}

							var63 = var1.hitSplatCycles[var101] - Client.cycle;
							int var64 = var104.field2714 - var63 * var104.field2714 / var104.field2708;
							int var65 = var63 * var104.field2715 / var104.field2708 + -var104.field2715;
							int var66 = var64 + (var3 + Client.viewportTempX - (var52 >> 1));
							int var67 = var65 + (var4 + Client.viewportTempY - 12);
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var67 + var104.field2719 + 15;
							int var71 = var70 - var84.maxAscent;
							int var72 = var70 + var84.maxDescent;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var98 != null) {
								var73 = var67 + var98.field2719 + 15;
								var74 = var73 - var45.maxAscent;
								var75 = var73 + var45.maxDescent;
								if (var74 < var68) {
									;
								}

								if (var75 > var69) {
									;
								}
							}

							var74 = 255;
							if (var104.field2703 >= 0) {
								var74 = (var63 << 8) / (var104.field2708 - var104.field2703);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var19 != null) {
									var19.drawTransAt(var53 + var66 - var27, var67, var74);
								}

								if (var21 != null) {
									var21.drawTransAt(var54 + var66 - var29, var67, var74);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransAt(var24 * var75 + (var55 + var66 - var28), var67, var74);
									}
								}

								if (var22 != null) {
									var22.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var84.drawAlpha(var46, var66 + var56, var70, var104.textColor, 0, var74);
								if (var98 != null) {
									if (var31 != null) {
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.drawTransAt(var59 + var66 - var41, var67, var74);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransAt(var75 * var36 + (var60 + var66 - var40), var67, var74);
										}
									}

									if (var34 != null) {
										var34.drawTransAt(var61 + var66 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var66 + var62, var73, var98.textColor, 0, var74);
								}
							} else {
								if (var19 != null) {
									var19.drawTransBgAt(var53 + var66 - var27, var67);
								}

								if (var21 != null) {
									var21.drawTransBgAt(var66 + var54 - var29, var67);
								}

								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransBgAt(var24 * var75 + (var55 + var66 - var28), var67);
									}
								}

								if (var22 != null) {
									var22.drawTransBgAt(var57 + var66 - var30, var67);
								}

								var84.draw(var46, var66 + var56, var70, var104.textColor | -16777216, 0);
								if (var98 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}

									if (var33 != null) {
										var33.drawTransBgAt(var66 + var59 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var36 * var75 + (var60 + var66 - var40), var67);
										}
									}

									if (var34 != null) {
										var34.drawTransBgAt(var66 + var61 - var42, var67);
									}

									var45.draw(var47, var66 + var62, var73, var98.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
