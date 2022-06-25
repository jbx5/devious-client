import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("et")
public class class154 extends class165 {
	@ObfuscatedName("c")
	String field1720;

	@ObfuscatedSignature(descriptor = "Les;")
	final class155 this$0;

	@ObfuscatedSignature(descriptor = "(Les;Ljava/lang/String;Ljava/lang/String;)V")
	class154(class155 var1, String var2, String var3) {
		super(var1, var2);
		this.this$0 = var1;
		this.field1720 = var3;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-118")
	public int vmethod3314() {
		return 1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "11")
	public String vmethod3320() {
		return this.field1720;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(CI)Z", garbageValue = "-431729145")
	static final boolean method3163(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-';
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "678269677")
	static int method3170(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}
			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}
			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIIB)I", garbageValue = "-54")
	static final int method3169(int var0, int var1, int var2) {
		int var3 = var0 / var2;
		int var4 = var0 & var2 - 1;
		int var5 = var1 / var2;
		int var6 = var1 & var2 - 1;
		int var7 = SoundSystem.method740(var3, var5);
		int var8 = SoundSystem.method740(var3 + 1, var5);
		int var9 = SoundSystem.method740(var3, var5 + 1);
		int var10 = SoundSystem.method740(var3 + 1, var5 + 1);
		int var11 = SequenceDefinition.method3827(var7, var8, var4, var2);
		int var12 = SequenceDefinition.method3827(var9, var10, var4, var2);
		int var14 = 65536 - Rasterizer3D.Rasterizer3D_cosine[var6 * 1024 / var2] >> 1;
		int var13 = ((65536 - var14) * var11 >> 16) + (var12 * var14 >> 16);
		return var13;
	}

	@ObfuscatedName("hu")
	@ObfuscatedSignature(descriptor = "(Lcj;IIIIII)V", garbageValue = "678056346")
	@Export("drawActor2d")
	static final void drawActor2d(Actor var0, int var1, int var2, int var3, int var4, int var5) {
		if (var0 != null && var0.isVisible()) {
			if (var0 instanceof NPC) {
				NPCComposition var6 = ((NPC) (var0)).definition;
				if (var6.transforms != null) {
					var6 = var6.transform();
				}
				if (var6 == null) {
					return;
				}
			}
			int var76 = Players.Players_count;
			int[] var7 = Players.Players_indices;
			byte var8 = 0;
			Player var10;
			int var92;
			if (var1 < var76 && var0.playerCycle == Client.cycle) {
				var10 = ((Player) (var0));
				boolean var9;
				if (Client.drawPlayerNames == 0) {
					var9 = false;
				} else if (var10 != class101.localPlayer) {
					boolean var11 = (Client.drawPlayerNames & 4) != 0;
					boolean var12 = var11;
					if (!var11) {
						boolean var13 = (Client.drawPlayerNames & 1) != 0;
						var12 = var13 && var10.isFriend();
					}
					var9 = var12 || Language.method6070() && var10.isFriendsChatMember();
				} else {
					var9 = class138.method2944();
				}
				if (var9) {
					Player var77 = ((Player) (var0));
					if (var1 < var76) {
						var92 = var0.defaultHeight + 15;
						class220.worldToScreen(var0.x, var0.y, var92);
						AbstractFont var78 = ((AbstractFont) (Client.fontsMap.get(FontName.FontName_plain12)));
						byte var14 = 9;
						var78.drawCentered(var77.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var14, 16777215, 0);
						var8 = 18;
					}
				}
			}
			int var89 = -2;
			int var17;
			int var23;
			int var24;
			int var79;
			if (!var0.healthBars.method6147()) {
				var79 = var0.defaultHeight + 15;
				class220.worldToScreen(var0.x, var0.y, var79);
				for (HealthBar var96 = ((HealthBar) (var0.healthBars.last())); var96 != null; var96 = ((HealthBar) (var0.healthBars.previous()))) {
					HealthBarUpdate var81 = var96.get(Client.cycle);
					if (var81 == null) {
						if (var96.isEmpty()) {
							var96.remove();
						}
					} else {
						HealthBarDefinition var97 = var96.definition;
						SpritePixels var82 = var97.getBackSprite();
						SpritePixels var83 = var97.getFrontSprite();
						var17 = 0;
						int var84;
						if (var82 != null && var83 != null) {
							if (var97.widthPadding * 2 < var83.subWidth) {
								var17 = var97.widthPadding;
							}
							var84 = var83.subWidth - var17 * 2;
						} else {
							var84 = var97.width;
						}
						int var18 = 255;
						boolean var85 = true;
						int var86 = Client.cycle - var81.cycle;
						int var87 = var84 * var81.health2 / var97.width;
						int var88;
						int var99;
						if (var81.cycleOffset > var86) {
							var88 = (var97.field1881 == 0) ? 0 : var97.field1881 * (var86 / var97.field1881);
							var23 = var84 * var81.health / var97.width;
							var99 = var88 * (var87 - var23) / var81.cycleOffset + var23;
						} else {
							var99 = var87;
							var88 = var97.int5 + var81.cycleOffset - var86;
							if (var97.int3 >= 0) {
								var18 = (var88 << 8) / (var97.int5 - var97.int3);
							}
						}
						if (var81.health2 > 0 && var99 < 1) {
							var99 = 1;
						}
						if (var82 != null && var83 != null) {
							if (var84 == var99) {
								var99 += var17 * 2;
							} else {
								var99 += var17;
							}
							var88 = var82.subHeight;
							var89 += var88;
							var23 = var2 + Client.viewportTempX - (var84 >> 1);
							var24 = var3 + Client.viewportTempY - var89;
							var23 -= var17;
							if (var18 >= 0 && var18 < 255) {
								var82.drawTransAt(var23, var24, var18);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var99 + var23, var24 + var88);
								var83.drawTransAt(var23, var24, var18);
							} else {
								var82.drawTransBgAt(var23, var24);
								Rasterizer2D.Rasterizer2D_expandClip(var23, var24, var99 + var23, var88 + var24);
								var83.drawTransBgAt(var23, var24);
							}
							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var89 += 2;
						} else {
							var89 += 5;
							if (Client.viewportTempX > -1) {
								var88 = var2 + Client.viewportTempX - (var84 >> 1);
								var23 = var3 + Client.viewportTempY - var89;
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var23, var99, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var88 + var99, var23, var84 - var99, 5, 16711680);
							}
							var89 += 2;
						}
					}
				}
			}
			if (var89 == -2) {
				var89 += 7;
			}
			var89 += var8;
			int var91;
			if (var1 < var76) {
				var10 = ((Player) (var0));
				if (var10.isHidden) {
					return;
				}
				if (var10.headIconPk != -1 || var10.headIconPrayer != -1) {
					var91 = var0.defaultHeight + 15;
					class220.worldToScreen(var0.x, var0.y, var91);
					if (Client.viewportTempX > -1) {
						if (var10.headIconPk != -1) {
							var89 += 25;
							Message.headIconPkSprites[var10.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
						}
						if (var10.headIconPrayer != -1) {
							var89 += 25;
							class28.headIconPrayerSprites[var10.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
						}
					}
				}
				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					var91 = var0.defaultHeight + 15;
					class220.worldToScreen(var0.x, var0.y, var91);
					if (Client.viewportTempX > -1) {
						var89 += UserComparator4.headIconHintSprites[1].subHeight;
						UserComparator4.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var89);
					}
				}
			} else {
				NPCComposition var90 = ((NPC) (var0)).definition;
				if (var90.transforms != null) {
					var90 = var90.transform();
				}
				if (var90.headIconPrayer >= 0 && var90.headIconPrayer < class28.headIconPrayerSprites.length) {
					var91 = var0.defaultHeight + 15;
					class220.worldToScreen(var0.x, var0.y, var91);
					if (Client.viewportTempX > -1) {
						class28.headIconPrayerSprites[var90.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 30);
					}
				}
				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var76] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					var91 = var0.defaultHeight + 15;
					class220.worldToScreen(var0.x, var0.y, var91);
					if (Client.viewportTempX > -1) {
						UserComparator4.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}
			if (var0.overheadText != null && (var1 >= var76 || !var0.field1152 && (Client.publicChatMode == 4 || !var0.isAutoChatting && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player) (var0)).isFriend())))) {
				var79 = var0.defaultHeight;
				class220.worldToScreen(var0.x, var0.y, var79);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = TileItem.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = TileItem.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY;
					Client.overheadTextColors[Client.overheadTextCount] = var0.overheadTextColor;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.overheadTextEffect;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
				}
			}
			for (var79 = 0; var79 < 4; ++var79) {
				var91 = var0.hitSplatCycles[var79];
				var92 = var0.hitSplatTypes[var79];
				HitSplatDefinition var98 = null;
				int var93 = 0;
				if (var92 >= 0) {
					if (var91 <= Client.cycle) {
						continue;
					}
					var98 = class122.method2800(var0.hitSplatTypes[var79]);
					var93 = var98.field2026;
					if (var98 != null && var98.transforms != null) {
						var98 = var98.transform();
						if (var98 == null) {
							var0.hitSplatCycles[var79] = -1;
							continue;
						}
					}
				} else if (var91 < 0) {
					continue;
				}
				int var15 = var0.hitSplatTypes2[var79];
				HitSplatDefinition var16 = null;
				if (var15 >= 0) {
					var16 = class122.method2800(var15);
					if (var16 != null && var16.transforms != null) {
						var16 = var16.transform();
					}
				}
				if (var91 - var93 <= Client.cycle) {
					if (var98 == null) {
						var0.hitSplatCycles[var79] = -1;
					} else {
						var17 = var0.defaultHeight / 2;
						class220.worldToScreen(var0.x, var0.y, var17);
						if (Client.viewportTempX > -1) {
							boolean var94 = true;
							if (var79 == 1) {
								Client.viewportTempY -= 20;
							}
							if (var79 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}
							if (var79 == 3) {
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
							var19 = var98.method3623();
							int var44;
							if (var19 != null) {
								var23 = var19.subWidth;
								var44 = var19.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}
								var27 = var19.xOffset;
							}
							var20 = var98.method3643();
							if (var20 != null) {
								var24 = var20.subWidth;
								var44 = var20.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}
								var28 = var20.xOffset;
							}
							var21 = var98.method3625();
							if (var21 != null) {
								var25 = var21.subWidth;
								var44 = var21.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}
								var29 = var21.xOffset;
							}
							var22 = var98.method3626();
							if (var22 != null) {
								var26 = var22.subWidth;
								var44 = var22.subHeight;
								if (var44 > var43) {
									var43 = var44;
								}
								var30 = var22.xOffset;
							}
							if (var16 != null) {
								var31 = var16.method3623();
								if (var31 != null) {
									var35 = var31.subWidth;
									var44 = var31.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}
									var39 = var31.xOffset;
								}
								var32 = var16.method3643();
								if (var32 != null) {
									var36 = var32.subWidth;
									var44 = var32.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}
									var40 = var32.xOffset;
								}
								var33 = var16.method3625();
								if (var33 != null) {
									var37 = var33.subWidth;
									var44 = var33.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}
									var41 = var33.xOffset;
								}
								var34 = var16.method3626();
								if (var34 != null) {
									var38 = var34.subWidth;
									var44 = var34.subHeight;
									if (var44 > var43) {
										var43 = var44;
									}
									var42 = var34.xOffset;
								}
							}
							Font var80 = var98.getFont();
							if (var80 == null) {
								var80 = MouseHandler.fontPlain11;
							}
							Font var45;
							if (var16 != null) {
								var45 = var16.getFont();
								if (var45 == null) {
									var45 = MouseHandler.fontPlain11;
								}
							} else {
								var45 = MouseHandler.fontPlain11;
							}
							String var46 = null;
							String var47 = null;
							boolean var48 = false;
							int var49 = 0;
							var46 = var98.getString(var0.hitSplatValues[var79]);
							int var95 = var80.stringWidth(var46);
							if (var16 != null) {
								var47 = var16.getString(var0.hitSplatValues2[var79]);
								var49 = var45.stringWidth(var47);
							}
							int var50 = 0;
							int var51 = 0;
							if (var24 > 0) {
								if (var21 == null && var22 == null) {
									var50 = 1;
								} else {
									var50 = var95 / var24 + 1;
								}
							}
							if (var16 != null && var36 > 0) {
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
								var56 += (var57 - var95) / 2;
							} else {
								var52 += var95;
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
							if (var16 != null) {
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
							var63 = var0.hitSplatCycles[var79] - Client.cycle;
							int var64 = var98.field2031 - var63 * var98.field2031 / var98.field2026;
							int var65 = var63 * var98.field2032 / var98.field2026 + -var98.field2032;
							int var66 = var64 + (var2 + Client.viewportTempX - (var52 >> 1));
							int var67 = var3 + Client.viewportTempY - 12 + var65;
							int var68 = var67;
							int var69 = var43 + var67;
							int var70 = var67 + var98.field2019 + 15;
							int var71 = var70 - var80.maxAscent;
							int var72 = var70 + var80.maxDescent;
							if (var71 < var67) {
								var68 = var71;
							}
							if (var72 > var69) {
								var69 = var72;
							}
							int var73 = 0;
							int var74;
							int var75;
							if (var16 != null) {
								var73 = var67 + var16.field2019 + 15;
								var74 = var73 - var45.maxAscent;
								var75 = var73 + var45.maxDescent;
								if (var74 < var68) {
								}
								if (var75 > var69) {
								}
							}
							var74 = 255;
							if (var98.field2030 >= 0) {
								var74 = (var63 << 8) / (var98.field2026 - var98.field2030);
							}
							if (var74 >= 0 && var74 < 255) {
								if (var19 != null) {
									var19.drawTransAt(var66 + var53 - var27, var67, var74);
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
									var22.drawTransAt(var57 + var66 - var30, var67, var74);
								}
								var80.drawAlpha(var46, var66 + var56, var70, var98.textColor, 0, var74);
								if (var16 != null) {
									if (var31 != null) {
										var31.drawTransAt(var66 + var58 - var39, var67, var74);
									}
									if (var33 != null) {
										var33.drawTransAt(var66 + var59 - var41, var67, var74);
									}
									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransAt(var75 * var36 + (var66 + var60 - var40), var67, var74);
										}
									}
									if (var34 != null) {
										var34.drawTransAt(var66 + var61 - var42, var67, var74);
									}
									var45.drawAlpha(var47, var62 + var66, var73, var16.textColor, 0, var74);
								}
							} else {
								if (var19 != null) {
									var19.drawTransBgAt(var53 + var66 - var27, var67);
								}
								if (var21 != null) {
									var21.drawTransBgAt(var54 + var66 - var29, var67);
								}
								if (var20 != null) {
									for (var75 = 0; var75 < var50; ++var75) {
										var20.drawTransBgAt(var24 * var75 + (var55 + var66 - var28), var67);
									}
								}
								if (var22 != null) {
									var22.drawTransBgAt(var57 + var66 - var30, var67);
								}
								var80.draw(var46, var56 + var66, var70, var98.textColor | -16777216, 0);
								if (var16 != null) {
									if (var31 != null) {
										var31.drawTransBgAt(var58 + var66 - var39, var67);
									}
									if (var33 != null) {
										var33.drawTransBgAt(var59 + var66 - var41, var67);
									}
									if (var32 != null) {
										for (var75 = 0; var75 < var51; ++var75) {
											var32.drawTransBgAt(var36 * var75 + (var60 + var66 - var40), var67);
										}
									}
									if (var34 != null) {
										var34.drawTransBgAt(var61 + var66 - var42, var67);
									}
									var45.draw(var47, var62 + var66, var73, var16.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}
		}
	}
}