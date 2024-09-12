import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sh")
@Implements("ClanMate")
public class ClanMate extends Buddy {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("friend")
	TriBool friend;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lsy;"
	)
	@Export("ignored")
	TriBool ignored;

	ClanMate() {
		this.friend = TriBool.TriBool_unknown;
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2129568026"
	)
	@Export("clearIsFriend")
	void clearIsFriend() {
		this.friend = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "102"
	)
	@Export("isFriend")
	public final boolean isFriend() {
		if (this.friend == TriBool.TriBool_unknown) {
			this.fillIsFriend();
		}

		return this.friend == TriBool.TriBool_true;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "758029972"
	)
	@Export("fillIsFriend")
	void fillIsFriend() {
		this.friend = class425.friendSystem.friendsList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("clearIsIgnored")
	void clearIsIgnored() {
		this.ignored = TriBool.TriBool_unknown;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-138616888"
	)
	@Export("isIgnored")
	public final boolean isIgnored() {
		if (this.ignored == TriBool.TriBool_unknown) {
			this.fillIsIgnored();
		}

		return this.ignored == TriBool.TriBool_true;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1535506755"
	)
	@Export("fillIsIgnored")
	void fillIsIgnored() {
		this.ignored = class425.friendSystem.ignoreList.contains(super.username) ? TriBool.TriBool_true : TriBool.TriBool_false;
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Ldd;Ldy;IIIIIB)V",
		garbageValue = "116"
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

			int var76 = Client.playerUpdateManager.playerCount;
			int[] var8 = Client.playerUpdateManager.playerIndices;
			boolean var9 = var2 < var76;
			int var10 = -2;
			if (var1.overheadText != null && (!var9 || !var1.field1275 && (Client.publicChatMode == 4 || !var1.field1279 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var1).isFriend())))) {
				class179.method3799(var0, var1, var1.vmethod2891());
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class33.fontBold12.stringWidth(var1.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class33.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var10;
					Client.overheadTextColors[Client.overheadTextCount] = var1.field1297;
					Client.overheadTextEffects[Client.overheadTextCount] = var1.field1223;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var1.overheadTextCyclesRemaining;
					Client.field645[Client.overheadTextCount] = var1.field1250;
					Client.overheadText[Client.overheadTextCount] = var1.overheadText;
					++Client.overheadTextCount;
					var10 += 12;
				}
			}

			int var23;
			int var24;
			int var82;
			int var83;
			if (!var1.healthBars.method7843()) {
				class179.method3799(var0, var1, var1.vmethod2891() + 15);

				for (HealthBarConfig var11 = (HealthBarConfig)var1.healthBars.last(); var11 != null; var11 = (HealthBarConfig)var1.healthBars.previous()) {
					HealthBarUpdate var12 = var11.get(Client.cycle);
					if (var12 == null) {
						if (var11.isEmpty()) {
							var11.remove();
						}
					} else {
						HealthBarDefinition var13 = var11.definition;
						SpritePixels var80 = var13.getBackSprite();
						SpritePixels var86 = var13.getFrontSprite();
						var82 = 0;
						if (var80 != null && var86 != null) {
							if (var13.widthPadding * 2 < var86.subWidth) {
								var82 = var13.widthPadding;
							}

							var83 = var86.subWidth - var82 * 2;
						} else {
							var83 = var13.width;
						}

						int var84 = 255;
						boolean var87 = true;
						int var88 = Client.cycle - var12.cycle;
						int var89 = var83 * var12.health2 / var13.width;
						int var90;
						int var104;
						if (var12.cycleOffset > var88) {
							var90 = var13.field1950 == 0 ? 0 : var13.field1950 * (var88 / var13.field1950);
							var23 = var83 * var12.health / var13.width;
							var104 = var90 * (var89 - var23) / var12.cycleOffset + var23;
						} else {
							var104 = var89;
							var90 = var12.cycleOffset + var13.int5 - var88;
							if (var13.int3 >= 0) {
								var84 = (var90 << 8) / (var13.int5 - var13.int3);
							}
						}

						if (var12.health2 > 0 && var104 < 1) {
							var104 = 1;
						}

						if (var80 != null && var86 != null) {
							if (var104 == var83) {
								var104 += var82 * 2;
							} else {
								var104 += var82;
							}

							var90 = var80.subHeight;
							var10 += var90;
							var23 = var3 + Client.viewportTempX - (var83 >> 1);
							var24 = var4 + Client.viewportTempY - var10;
							var23 -= var82;
							if (var84 >= 0 && var84 < 255) {
								var80.drawTransAt(var23, var24, var84);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var104, var24 + var90);
								var86.drawTransAt(var23, var24, var84);
							} else {
								var80.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var23 + var104, var24 + var90);
								var86.drawTransBgAt(var23, var24);
							}

							Rasterizer2D.Rasterizer2D_setClip(var3, var4, var3 + var5, var4 + var6);
							var10 += 2;
						} else {
							var10 += 5;
							if (Client.viewportTempX > -1) {
								var90 = var3 + Client.viewportTempX - (var83 >> 1);
								var23 = var4 + Client.viewportTempY - var10;
								Rasterizer2D.Rasterizer2D_fillRectangle(var90, var23, var104, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var90 + var104, var23, var83 - var104, 5, 16711680);
							}

							var10 += 2;
						}
					}
				}
			}

			if (var10 == -2) {
				var10 += 7;
			}

			Player var91;
			if (var9 && Client.cycle == var1.playerCycle && class169.method3719((Player)var1)) {
				var91 = (Player)var1;
				if (var9) {
					class179.method3799(var0, var1, var1.vmethod2891() + 15);
					AbstractFont var92 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
					var10 += 4;
					var92.drawCentered(var91.username.getName(), var3 + Client.viewportTempX, var4 + Client.viewportTempY - var10, 16777215, 0);
					var10 += 18;
				}
			}

			if (var9) {
				var91 = (Player)var1;
				if (var91.isHidden) {
					return;
				}

				if (var91.headIconPk != -1 || var91.headIconPrayer != -1) {
					class179.method3799(var0, var1, var1.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var91.headIconPk != -1) {
							var10 += 25;
							class531.headIconPkSprites[var91.headIconPk].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}

						if (var91.headIconPrayer != -1) {
							var10 += 25;
							UserComparator3.headIconPrayerSprites[var91.headIconPrayer].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
						}
					}
				}

				if (var2 >= 0 && Client.hintArrowType == 10 && var8[var2] == Client.hintArrowPlayerIndex) {
					class179.method3799(var0, var1, var1.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var10 += class301.headIconHintSprites[1].subHeight;
						class301.headIconHintSprites[1].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - var10);
					}
				}
			} else {
				NPC var93 = (NPC)var1;
				int[] var94 = var93.method2946();
				short[] var95 = var93.method2882();
				if (var95 != null && var94 != null) {
					for (int var14 = 0; var14 < var95.length; ++var14) {
						if (var95[var14] >= 0 && var94[var14] >= 0) {
							long var15 = (long)var94[var14] << 8 | (long)var95[var14];
							SpritePixels var17 = (SpritePixels)Client.field804.method8754(var15);
							if (var17 == null) {
								SpritePixels[] var18 = BuddyRankComparator.method3234(ApproximateRouteStrategy.archive8, var94[var14], 0);
								if (var18 != null && var95[var14] < var18.length) {
									var17 = var18[var95[var14]];
									Client.field804.method8755(var15, var17);
								}
							}

							if (var17 != null) {
								class179.method3799(var0, var1, var1.vmethod2891() + 15);
								if (Client.viewportTempX > -1) {
									var17.drawTransBgAt(var3 + Client.viewportTempX - (var17.subWidth >> 1), (var4 - var17.subHeight - 2) * (var14 + 1) - var17.subHeight + Client.viewportTempY - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && var0.npcIndices[var2 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					class179.method3799(var0, var1, var1.vmethod2891() + 15);
					if (Client.viewportTempX > -1) {
						class301.headIconHintSprites[0].drawTransBgAt(var3 + Client.viewportTempX - 12, var4 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var77 = 0; var77 < 4; ++var77) {
				int var78 = var1.hitSplatCycles[var77];
				int var79 = var1.hitSplatTypes[var77];
				HitSplatDefinition var102 = null;
				int var81 = 0;
				HitSplatDefinition var97;
				if (var79 >= 0) {
					if (var78 <= Client.cycle) {
						continue;
					}

					var82 = var1.hitSplatTypes[var77];
					var97 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var82);
					HitSplatDefinition var16;
					if (var97 != null) {
						var16 = var97;
					} else {
						byte[] var19 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var82);
						var97 = new HitSplatDefinition();
						if (var19 != null) {
							var97.decode(new Buffer(var19));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var97, (long)var82);
						var16 = var97;
					}

					var102 = var16;
					var81 = var16.field2147;
					if (var16 != null && var16.transforms != null) {
						var102 = var16.transform();
						if (var102 == null) {
							var1.hitSplatCycles[var77] = -1;
							continue;
						}
					}
				} else if (var78 < 0) {
					continue;
				}

				var83 = var1.hitSplatTypes2[var77];
				HitSplatDefinition var96 = null;
				HitSplatDefinition var98;
				if (var83 >= 0) {
					var98 = (HitSplatDefinition)HitSplatDefinition.HitSplatDefinition_cached.get((long)var83);
					if (var98 != null) {
						var97 = var98;
					} else {
						byte[] var20 = HitSplatDefinition.HitSplatDefinition_archive.takeFile(32, var83);
						var98 = new HitSplatDefinition();
						if (var20 != null) {
							var98.decode(new Buffer(var20));
						}

						HitSplatDefinition.HitSplatDefinition_cached.put(var98, (long)var83);
						var97 = var98;
					}

					var96 = var97;
					if (var97 != null && var97.transforms != null) {
						var96 = var97.transform();
					}
				}

				if (var78 - var81 <= Client.cycle) {
					if (var102 == null) {
						var1.hitSplatCycles[var77] = -1;
					} else {
						class179.method3799(var0, var1, var1.vmethod2891() / 2);
						if (Client.viewportTempX > -1) {
							boolean var103 = true;
							if (var77 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var77 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var77 == 3) {
								Client.viewportTempX += 15;
								Client.viewportTempY -= 10;
							}

							var98 = null;
							SpritePixels var99 = null;
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
							SpritePixels var100 = var102.method4134();
							int var44;
							if (var100 != null) {
								var23 = var100.subWidth;
								var44 = var100.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var27 = var100.xOffset;
							}

							var99 = var102.method4150();
							if (var99 != null) {
								var24 = var99.subWidth;
								var44 = var99.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var28 = var99.xOffset;
							}

							var21 = var102.method4156();
							if (var21 != null) {
								var25 = var21.subWidth;
								var44 = var21.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var29 = var21.xOffset;
							}

							var22 = var102.method4135();
							if (var22 != null) {
								var26 = var22.subWidth;
								var44 = var22.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}

								var30 = var22.xOffset;
							}

							if (var96 != null) {
								var31 = var96.method4134();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var39 = var31.xOffset;
								}

								var32 = var96.method4150();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var40 = var32.xOffset;
								}

								var33 = var96.method4156();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var41 = var33.xOffset;
								}

								var34 = var96.method4135();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}

									var42 = var34.xOffset;
								}
							}

							Font var85 = var102.getFont();
							if (var85 == null) {
								var85 = class169.fontPlain11;
							}

							Font var45;
							if (var96 != null) {
								var45 = var96.getFont();
								if (var45 == null) {
									var45 = class169.fontPlain11;
								}
							} else {
								var45 = class169.fontPlain11;
							}

							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var102.getString(var1.hitSplatValues[var77]);
							int var101 = var85.stringWidth(var46);
							if (var96 != null) {
								var47 = var96.getString(var1.hitSplatValues2[var77]);
								var49 = var45.stringWidth(var47);
							}

							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var21 == null && var22 == null) {
									var50 = 1;
								} else {
									var50 = var101 / var24 + 1;
								}
							}

							if (var96 != null && var36 > 0) {
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
								var57 = var50 * var24;
								var52 += var57;
								var56 += (var57 - var101) / 2;
							} else {
								var52 += var101;
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
							if (var96 != null) {
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
									var63 = var36 * var51;
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

							var63 = var1.hitSplatCycles[var77] - Client.cycle;
							int var64 = var102.field2152 - var63 * var102.field2152 / var102.field2147;
							int var65 = var63 * var102.field2153 / var102.field2147 + -var102.field2153;
							int var66 = var64 + (var3 + Client.viewportTempX - (var52 >> 1));
							int var67 = var65 + (var4 + Client.viewportTempY - 12);
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var67 + var102.field2157 + 15;
							int var71 = var70 - var85.maxAscent;
							int var72 = var70 + var85.maxDescent;
							if (var71 < var67) {
								var68 = var71;
							}

							if (var72 > var69) {
								var69 = var72;
							}

							int var73 = 0;
							int var74;
							int var75;
							if (var96 != null) {
								var73 = var67 + var96.field2157 + 15;
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
							if (var102.field2154 >= 0) {
								var74 = (var63 << 8) / (var102.field2147 - var102.field2154);
							}

							if (var74 >= 0 && var74 < 255) {
								if (var100 != null) {
									var100.drawTransAt(var66 + var53 - var27, var67, var74);
								}

								if (var21 != null) {
									var21.drawTransAt(var66 + var54 - var29, var67, var74);
								}

								if (var99 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var99.drawTransAt(var75 * var24 + (var55 + var66 - var28), var67, var74);
									}
								}

								if (var22 != null) {
									var22.drawTransAt(var66 + var57 - var30, var67, var74);
								}

								var85.drawAlpha(var46, var66 + var56, var70, var102.textColor, 0, var74);
								if (var96 != null) {
									if (var31 != null) {
										var31.drawTransAt(var58 + var66 - var39, var67, var74);
									}

									if (var33 != null) {
										var33.drawTransAt(var59 + var66 - var41, var67, var74);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransAt(var36 * var75 + (var66 + var60 - var40), var67, var74);
										}
									}

									if (var34 != null) {
										var34.drawTransAt(var66 + var61 - var42, var67, var74);
									}

									var45.drawAlpha(var47, var66 + var62, var73, var96.textColor, 0, var74);
								}
							} else {
								if (var100 != null) {
									var100.drawTransBgAt(var66 + var53 - var27, var67);
								}

								if (var21 != null) {
									var21.drawTransBgAt(var54 + var66 - var29, var67);
								}

								if (var99 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var99.drawTransBgAt(var75 * var24 + (var66 + var55 - var28), var67);
									}
								}

								if (var22 != null) {
									var22.drawTransBgAt(var57 + var66 - var30, var67);
								}

								var85.draw(var46, var66 + var56, var70, var102.textColor | -16777216, 0);
								if (var96 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var66 + var58 - var39, var67);
									}

									if (var33 != null) {
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}

									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var75 * var36 + (var66 + var60 - var40), var67);
										}
									}

									if (var34 != null) {
										var34.drawTransBgAt(var66 + var61 - var42, var67);
									}

									var45.draw(var47, var66 + var62, var73, var96.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
