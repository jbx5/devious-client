import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("of")
public class class386 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static final class386 field4440;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static final class386 field4439;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static final class386 field4438;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static final class386 field4441;

	static {
		field4440 = new class386();
		field4439 = new class386();
		field4438 = new class386();
		field4441 = new class386();
	}

	class386() {
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "10"
	)
	static int method7275(int var0, Script var1, boolean var2) {
		Widget var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class339 var4;
			if (var0 == 2617) {
				var4 = var3.method6729();
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3623 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method6729();
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3619 : 0;
				return 1;
			} else {
				class344 var7;
				if (var0 == 2619) {
					var7 = var3.method6700();
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6564().method7608() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method6729();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3620 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6452() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6476() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6477() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null && var7.method6468() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method6700();
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6467().method7883() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method6700();
						int var5 = var7 != null ? var7.method6531() : 0;
						int var6 = var7 != null ? var7.method6471() : 0;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6471() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6479() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6663() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6480() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6593() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method6724();
							Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = var8 != null ? var8.method394(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method6724();
							Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null && var7.method6672() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ka")
	@ObfuscatedSignature(
		descriptor = "(Ldf;IIIIIB)V",
		garbageValue = "-18"
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
			if (var0.overheadText != null && (!var8 || !var0.field1194 && (Client.publicChatMode == 4 || !var0.field1202 && (Client.publicChatMode == 0 || Client.publicChatMode == 3 || Client.publicChatMode == 1 && ((Player)var0).isFriend())))) {
				class165.method3517(var0, var0.defaultHeight);
				if (Client.viewportTempX > -1 && Client.overheadTextCount < Client.overheadTextLimit) {
					Client.overheadTextXOffsets[Client.overheadTextCount] = class90.fontBold12.stringWidth(var0.overheadText) / 2;
					Client.overheadTextAscents[Client.overheadTextCount] = class90.fontBold12.ascent;
					Client.overheadTextXs[Client.overheadTextCount] = Client.viewportTempX;
					Client.overheadTextYs[Client.overheadTextCount] = Client.viewportTempY - var9;
					Client.overheadTextColors[Client.overheadTextCount] = var0.field1185;
					Client.overheadTextEffects[Client.overheadTextCount] = var0.field1197;
					Client.overheadTextCyclesRemaining[Client.overheadTextCount] = var0.overheadTextCyclesRemaining;
					Client.field609[Client.overheadTextCount] = var0.field1198;
					Client.overheadText[Client.overheadTextCount] = var0.overheadText;
					++Client.overheadTextCount;
					var9 += 12;
				}
			}

			int var15;
			int var22;
			int var23;
			if (!var0.healthBars.method7364()) {
				class165.method3517(var0, var0.defaultHeight + 15);

				for (HealthBar var10 = (HealthBar)var0.healthBars.last(); var10 != null; var10 = (HealthBar)var0.healthBars.previous()) {
					HealthBarUpdate var11 = var10.get(Client.cycle);
					if (var11 == null) {
						if (var10.isEmpty()) {
							var10.remove();
						}
					} else {
						HealthBarDefinition var77 = var10.definition;
						SpritePixels var13 = var77.getBackSprite();
						SpritePixels var83 = var77.getFrontSprite();
						int var84 = 0;
						if (var13 != null && var83 != null) {
							if (var77.widthPadding * 2 < var83.subWidth) {
								var84 = var77.widthPadding;
							}

							var15 = var83.subWidth - var84 * 2;
						} else {
							var15 = var77.width;
						}

						int var81 = 255;
						boolean var85 = true;
						int var86 = Client.cycle - var11.cycle;
						int var87 = var15 * var11.health2 / var77.width;
						int var88;
						int var102;
						if (var11.cycleOffset > var86) {
							var88 = var77.field1885 == 0 ? 0 : var77.field1885 * (var86 / var77.field1885);
							var22 = var15 * var11.health / var77.width;
							var102 = var88 * (var87 - var22) / var11.cycleOffset + var22;
						} else {
							var102 = var87;
							var88 = var77.int5 + var11.cycleOffset - var86;
							if (var77.int3 >= 0) {
								var81 = (var88 << 8) / (var77.int5 - var77.int3);
							}
						}

						if (var11.health2 > 0 && var102 < 1) {
							var102 = 1;
						}

						if (var13 != null && var83 != null) {
							if (var15 == var102) {
								var102 += var84 * 2;
							} else {
								var102 += var84;
							}

							var88 = var13.subHeight;
							var9 += var88;
							var22 = var2 + Client.viewportTempX - (var15 >> 1);
							var23 = var3 + Client.viewportTempY - var9;
							var22 -= var84;
							if (var81 >= 0 && var81 < 255) {
								var13.drawTransAt(var22, var23, var81);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var102 + var22, var23 + var88);
								var83.drawTransAt(var22, var23, var81);
							} else {
								var13.drawTransBgAt(var22, var23);
								Rasterizer2D.Rasterizer2D_expandClip(var22, var23, var22 + var102, var88 + var23);
								var83.drawTransBgAt(var22, var23);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var2 + var4, var3 + var5);
							var9 += 2;
						} else {
							var9 += 5;
							if (Client.viewportTempX > -1) {
								var88 = var2 + Client.viewportTempX - (var15 >> 1);
								var22 = var3 + Client.viewportTempY - var9;
								Rasterizer2D.Rasterizer2D_fillRectangle(var88, var22, var102, 5, 65280);
								Rasterizer2D.Rasterizer2D_fillRectangle(var102 + var88, var22, var15 - var102, 5, 16711680);
							}

							var9 += 2;
						}
					}
				}
			}

			if (var9 == -2) {
				var9 += 7;
			}

			if (var8 && var0.playerCycle == Client.cycle) {
				Player var91 = (Player)var0;
				boolean var76;
				if (Client.drawPlayerNames == 0) {
					var76 = false;
				} else if (var91 == KeyHandler.localPlayer) {
					boolean var12 = (Client.drawPlayerNames & 8) != 0;
					var76 = var12;
				} else {
					var76 = class197.method3854() || SecureUrlRequester.method2915() && var91.isFriend() || RestClientThreadFactory.method220() && var91.isFriendsChatMember();
				}

				if (var76) {
					Player var98 = (Player)var0;
					if (var8) {
						class165.method3517(var0, var0.defaultHeight + 15);
						AbstractFont var94 = (AbstractFont)Client.fontsMap.get(FontName.FontName_plain12);
						var9 += 4;
						var94.drawCentered(var98.username.getName(), var2 + Client.viewportTempX, var3 + Client.viewportTempY - var9, 16777215, 0);
						var9 += 18;
					}
				}
			}

			if (var8) {
				Player var89 = (Player)var0;
				if (var89.isHidden) {
					return;
				}

				if (var89.headIconPk != -1 || var89.headIconPrayer != -1) {
					class165.method3517(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						if (var89.headIconPk != -1) {
							var9 += 25;
							Actor.headIconPkSprites[var89.headIconPk].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}

						if (var89.headIconPrayer != -1) {
							var9 += 25;
							class13.headIconPrayerSprites[var89.headIconPrayer].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
						}
					}
				}

				if (var1 >= 0 && Client.hintArrowType == 10 && var7[var1] == Client.hintArrowPlayerIndex) {
					class165.method3517(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						var9 += GrandExchangeOfferOwnWorldComparator.headIconHintSprites[1].subHeight;
						GrandExchangeOfferOwnWorldComparator.headIconHintSprites[1].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - var9);
					}
				}
			} else {
				NPC var90 = (NPC)var0;
				int[] var92 = var90.method2665();
				short[] var100 = var90.method2686();
				if (var100 != null && var92 != null) {
					for (int var78 = 0; var78 < var100.length; ++var78) {
						if (var100[var78] >= 0 && var92[var78] >= 0) {
							long var14 = (long)var92[var78] << 8 | (long)var100[var78];
							SpritePixels var16 = (SpritePixels)Client.field791.method8139(var14);
							if (var16 == null) {
								SpritePixels[] var17 = class217.method4289(HttpRequestTask.archive8, var92[var78], 0);
								if (var17 != null && var100[var78] < var17.length) {
									var16 = var17[var100[var78]];
									Client.field791.method8146(var14, var16);
								}
							}

							if (var16 != null) {
								class165.method3517(var0, var0.defaultHeight + 15);
								if (Client.viewportTempX > -1) {
									var16.drawTransBgAt(var2 + Client.viewportTempX - (var16.subWidth >> 1), Client.viewportTempY + (var3 - var16.subHeight) - 4);
								}
							}
						}
					}
				}

				if (Client.hintArrowType == 1 && Client.npcIndices[var1 - var75] == Client.hintArrowNpcIndex && Client.cycle % 20 < 10) {
					class165.method3517(var0, var0.defaultHeight + 15);
					if (Client.viewportTempX > -1) {
						GrandExchangeOfferOwnWorldComparator.headIconHintSprites[0].drawTransBgAt(var2 + Client.viewportTempX - 12, var3 + Client.viewportTempY - 28);
					}
				}
			}

			for (int var99 = 0; var99 < 4; ++var99) {
				int var79 = var0.hitSplatCycles[var99];
				int var93 = var0.hitSplatTypes[var99];
				HitSplatDefinition var95 = null;
				int var80 = 0;
				if (var93 >= 0) {
					if (var79 <= Client.cycle) {
						continue;
					}

					var95 = class192.method3790(var0.hitSplatTypes[var99]);
					var80 = var95.field2069;
					if (var95 != null && var95.transforms != null) {
						var95 = var95.transform();
						if (var95 == null) {
							var0.hitSplatCycles[var99] = -1;
							continue;
						}
					}
				} else if (var79 < 0) {
					continue;
				}

				var15 = var0.hitSplatTypes2[var99];
				HitSplatDefinition var96 = null;
				if (var15 >= 0) {
					var96 = class192.method3790(var15);
					if (var96 != null && var96.transforms != null) {
						var96 = var96.transform();
					}
				}

				if (var79 - var80 <= Client.cycle) {
					if (var95 == null) {
						var0.hitSplatCycles[var99] = -1;
					} else {
						class165.method3517(var0, var0.defaultHeight / 2);
						if (Client.viewportTempX > -1) {
							boolean var101 = true;
							if (var99 == 1) {
								Client.viewportTempY -= 20;
							}

							if (var99 == 2) {
								Client.viewportTempX -= 15;
								Client.viewportTempY -= 10;
							}

							if (var99 == 3) {
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
							var18 = var95.method3927();
							int var43;
							if (var18 != null) {
								var22 = var18.subWidth;
								var43 = var18.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var26 = var18.xOffset;
							}

							var19 = var95.method3902();
							if (var19 != null) {
								var23 = var19.subWidth;
								var43 = var19.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var27 = var19.xOffset;
							}

							var20 = var95.method3903();
							if (var20 != null) {
								var24 = var20.subWidth;
								var43 = var20.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var28 = var20.xOffset;
							}

							var21 = var95.method3904();
							if (var21 != null) {
								var25 = var21.subWidth;
								var43 = var21.subHeight;
								if (var43 > var42) {
									var42 = var43;
								}

								var29 = var21.xOffset;
							}

							if (var96 != null) {
								var30 = var96.method3927();
								if (var30 != null) {
									var34 = var30.subWidth;
									var43 = var30.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var38 = var30.xOffset;
								}

								var31 = var96.method3902();
								if (var31 != null) {
									var35 = var31.subWidth;
									var43 = var31.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var39 = var31.xOffset;
								}

								var32 = var96.method3903();
								if (var32 != null) {
									var36 = var32.subWidth;
									var43 = var32.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var40 = var32.xOffset;
								}

								var33 = var96.method3904();
								if (var33 != null) {
									var37 = var33.subWidth;
									var43 = var33.subHeight;
									if (var43 > var42) {
										var42 = var43;
									}

									var41 = var33.xOffset;
								}
							}

							Font var82 = var95.getFont();
							if (var82 == null) {
								var82 = UserComparator5.fontPlain11;
							}

							Font var44;
							if (var96 != null) {
								var44 = var96.getFont();
								if (var44 == null) {
									var44 = UserComparator5.fontPlain11;
								}
							} else {
								var44 = UserComparator5.fontPlain11;
							}

							String var45 = null;
							String var46 = null;
							boolean var47 = false;
							int var48 = 0;
							var45 = var95.getString(var0.hitSplatValues[var99]);
							int var97 = var82.stringWidth(var45);
							if (var96 != null) {
								var46 = var96.getString(var0.hitSplatValues2[var99]);
								var48 = var44.stringWidth(var46);
							}

							int var49 = 0;
							int var50 = 0;
							if (var23 > 0) {
								if (var20 == null && var21 == null) {
									var49 = 1;
								} else {
									var49 = var97 / var23 + 1;
								}
							}

							if (var96 != null && var35 > 0) {
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
								var55 += (var56 - var97) / 2;
							} else {
								var51 += var97;
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
							if (var96 != null) {
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

							var62 = var0.hitSplatCycles[var99] - Client.cycle;
							int var63 = var95.field2081 - var62 * var95.field2081 / var95.field2069;
							int var64 = var62 * var95.field2089 / var95.field2069 + -var95.field2089;
							int var65 = var63 + (var2 + Client.viewportTempX - (var51 >> 1));
							int var66 = var3 + Client.viewportTempY - 12 + var64;
							int var67 = var66;
							int var68 = var66 + var42;
							int var69 = var66 + var95.field2086 + 15;
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
							if (var96 != null) {
								var72 = var66 + var96.field2086 + 15;
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
							if (var95.field2083 >= 0) {
								var73 = (var62 << 8) / (var95.field2069 - var95.field2083);
							}

							if (var73 >= 0 && var73 < 255) {
								if (var18 != null) {
									var18.drawTransAt(var52 + var65 - var26, var66, var73);
								}

								if (var20 != null) {
									var20.drawTransAt(var65 + var53 - var28, var66, var73);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransAt(var74 * var23 + (var65 + var54 - var27), var66, var73);
									}
								}

								if (var21 != null) {
									var21.drawTransAt(var65 + var56 - var29, var66, var73);
								}

								var82.drawAlpha(var45, var55 + var65, var69, var95.textColor, 0, var73);
								if (var96 != null) {
									if (var30 != null) {
										var30.drawTransAt(var57 + var65 - var38, var66, var73);
									}

									if (var32 != null) {
										var32.drawTransAt(var58 + var65 - var40, var66, var73);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransAt(var74 * var35 + (var65 + var59 - var39), var66, var73);
										}
									}

									if (var33 != null) {
										var33.drawTransAt(var65 + var60 - var41, var66, var73);
									}

									var44.drawAlpha(var46, var61 + var65, var72, var96.textColor, 0, var73);
								}
							} else {
								if (var18 != null) {
									var18.drawTransBgAt(var52 + var65 - var26, var66);
								}

								if (var20 != null) {
									var20.drawTransBgAt(var53 + var65 - var28, var66);
								}

								if (var19 != null) {
									for (var74 = 0; var74 < var49; ++var74) {
										var19.drawTransBgAt(var23 * var74 + (var65 + var54 - var27), var66);
									}
								}

								if (var21 != null) {
									var21.drawTransBgAt(var56 + var65 - var29, var66);
								}

								var82.draw(var45, var55 + var65, var69, var95.textColor | -16777216, 0);
								if (var96 != null) {
									if (var30 != null) {
										var30.drawTransBgAt(var65 + var57 - var38, var66);
									}

									if (var32 != null) {
										var32.drawTransBgAt(var58 + var65 - var40, var66);
									}

									if (var31 != null) {
										for (var74 = 0; var74 < var50; ++var74) {
											var31.drawTransBgAt(var74 * var35 + (var65 + var59 - var39), var66);
										}
									}

									if (var33 != null) {
										var33.drawTransBgAt(var65 + var60 - var41, var66);
									}

									var44.draw(var46, var65 + var61, var72, var96.textColor | -16777216, 0);
								}
							}
						}
					}
				}
			}

		}
	}
}
