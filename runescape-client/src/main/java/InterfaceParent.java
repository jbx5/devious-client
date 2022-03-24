import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cy")
@Implements("InterfaceParent")
public class InterfaceParent extends Node {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	1008979943)

	@Export("group")
	int group;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	-1548121)

	@Export("type")
	int type;
	@ObfuscatedName("h")
	boolean field1039;

	InterfaceParent() {
		this.field1039 = false;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(Llq;III)Lql;", garbageValue = 
	"-1036793338")

	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		return !GrandExchangeEvent.method6045(var0, var1, var2) ? null : ScriptFrame.method1084();
	}

	@ObfuscatedName("ej")
	@ObfuscatedSignature(descriptor = 
	"(IB)V", garbageValue = 
	"1")

	@Export("updateGameState")
	static void updateGameState(int var0) {
		if (var0 != Client.gameState) {
			if (Client.gameState == 0) {
				UserComparator10.client.method481();
			}

			if ((((var0 == 20) || (var0 == 40)) || (var0 == 45)) || (var0 == 50)) {
				UrlRequester.method2533(0);
				Client.field513 = 0;
				Client.field742 = 0;
				Client.timer.method6596(var0);
				if (var0 != 20) {
					Varcs.method2462(false);
				}
			}

			if (((var0 != 20) && (var0 != 40)) && (BuddyRankComparator.field1378 != null)) {
				BuddyRankComparator.field1378.close();
				BuddyRankComparator.field1378 = null;
			}

			if (Client.gameState == 25) {
				Client.field545 = 0;
				Client.field541 = 0;
				Client.field558 = 1;
				Client.field543 = 0;
				Client.field679 = 1;
			}

			if ((var0 != 5) && (var0 != 10)) {
				if (var0 == 20) {
					int var3 = (Client.gameState == 11) ? 4 : 0;
					class321.method6031(World.archive10, WorldMapData_1.archive8, false, var3);
				} else if (var0 == 11) {
					class321.method6031(World.archive10, WorldMapData_1.archive8, false, 4);
				} else if (var0 == 50) {
					GrandExchangeEvent.setLoginResponseString("", "Updating date of birth...", "");
					class321.method6031(World.archive10, WorldMapData_1.archive8, false, 7);
				} else {
					class20.method327();
				}
			} else {
				boolean var1 = Interpreter.clientPreferences.method2268() >= Client.field484;
				int var2 = (var1) ? 0 : 12;
				class321.method6031(World.archive10, WorldMapData_1.archive8, true, var2);
			}

			Client.gameState = var0;
		}
	}

	@ObfuscatedName("fw")
	@ObfuscatedSignature(descriptor = 
	"(B)I", garbageValue = 
	"1")

	static int method2103() {
		if ((Client.archiveLoaders != null) && (Client.archiveLoadersDone < Client.archiveLoaders.size())) {
			int var0 = 0;

			for (int var1 = 0; var1 <= Client.archiveLoadersDone; ++var1) {
				var0 += ((ArchiveLoader) (Client.archiveLoaders.get(var1))).loadedCount;
			}

			return (var0 * 10000) / Client.field767;
		} else {
			return 10000;
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"1236451858")

	static final void method2100(int var0, int var1, int var2, int var3) {
		Client.overheadTextCount = 0;
		boolean var4 = false;
		int var5 = -1;
		int var6 = -1;
		int var7 = Players.Players_count;
		int[] var8 = Players.Players_indices;

		int var9;
		for (var9 = 0; var9 < (var7 + Client.npcCount); ++var9) {
			Object var20;
			if (var9 < var7) {
				var20 = Client.players[var8[var9]];
				if (var8[var9] == Client.combatTargetPlayerIndex) {
					var4 = true;
					var5 = var9;
					continue;
				}

				if (var20 == class19.localPlayer) {
					var6 = var9;
					continue;
				}
			} else {
				var20 = Client.npcs[Client.npcIndices[var9 - var7]];
			}

			class116.drawActor2d(((Actor) (var20)), var9, var0, var1, var2, var3);
		}

		if (Client.renderSelf && (var6 != (-1))) {
			class116.drawActor2d(class19.localPlayer, var6, var0, var1, var2, var3);
		}

		if (var4) {
			class116.drawActor2d(Client.players[Client.combatTargetPlayerIndex], var5, var0, var1, var2, var3);
		}

		for (var9 = 0; var9 < Client.overheadTextCount; ++var9) {
			int var10 = Client.overheadTextXs[var9];
			int var11 = Client.overheadTextYs[var9];
			int var12 = Client.overheadTextXOffsets[var9];
			int var13 = Client.overheadTextAscents[var9];
			boolean var14 = true;

			while (var14) {
				var14 = false;

				for (int var19 = 0; var19 < var9; ++var19) {
					if ((((((var11 + 2) > (Client.overheadTextYs[var19] - Client.overheadTextAscents[var19])) && ((var11 - var13) < (Client.overheadTextYs[var19] + 2))) && ((var10 - var12) < (Client.overheadTextXOffsets[var19] + Client.overheadTextXs[var19]))) && ((var10 + var12) > (Client.overheadTextXs[var19] - Client.overheadTextXOffsets[var19]))) && ((Client.overheadTextYs[var19] - Client.overheadTextAscents[var19]) < var11)) {
						var11 = Client.overheadTextYs[var19] - Client.overheadTextAscents[var19];
						var14 = true;
					}
				}
			} 

			Client.viewportTempX = Client.overheadTextXs[var9];
			Client.viewportTempY = Client.overheadTextYs[var9] = var11;
			String var15 = Client.overheadText[var9];
			if (Client.chatEffects == 0) {
				int var16 = 16776960;
				if (Client.overheadTextColors[var9] < 6) {
					var16 = Client.field709[Client.overheadTextColors[var9]];
				}

				if (Client.overheadTextColors[var9] == 6) {
					var16 = ((Client.viewportDrawCount % 20) < 10) ? 16711680 : 16776960;
				}

				if (Client.overheadTextColors[var9] == 7) {
					var16 = ((Client.viewportDrawCount % 20) < 10) ? 255 : '￿';
				}

				if (Client.overheadTextColors[var9] == 8) {
					var16 = ((Client.viewportDrawCount % 20) < 10) ? '뀀' : 8454016;
				}

				int var17;
				if (Client.overheadTextColors[var9] == 9) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = (var17 * 1280) + 16711680;
					} else if (var17 < 100) {
						var16 = 16776960 - ((var17 - 50) * 327680);
					} else if (var17 < 150) {
						var16 = ((var17 - 100) * 5) + 65280;
					}
				}

				if (Client.overheadTextColors[var9] == 10) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = (var17 * 5) + 16711680;
					} else if (var17 < 100) {
						var16 = 16711935 - ((var17 - 50) * 327680);
					} else if (var17 < 150) {
						var16 = (((var17 - 100) * 327680) + 255) - ((var17 - 100) * 5);
					}
				}

				if (Client.overheadTextColors[var9] == 11) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					if (var17 < 50) {
						var16 = 16777215 - (var17 * 327685);
					} else if (var17 < 100) {
						var16 = ((var17 - 50) * 327685) + 65280;
					} else if (var17 < 150) {
						var16 = 16777215 - ((var17 - 100) * 327680);
					}
				}

				if (Client.overheadTextEffects[var9] == 0) {
					FloorOverlayDefinition.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0);
				}

				if (Client.overheadTextEffects[var9] == 1) {
					FloorOverlayDefinition.fontBold12.drawCenteredWave(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 2) {
					FloorOverlayDefinition.fontBold12.drawCenteredWave2(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount);
				}

				if (Client.overheadTextEffects[var9] == 3) {
					FloorOverlayDefinition.fontBold12.drawCenteredShake(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, var16, 0, Client.viewportDrawCount, 150 - Client.overheadTextCyclesRemaining[var9]);
				}

				if (Client.overheadTextEffects[var9] == 4) {
					var17 = ((150 - Client.overheadTextCyclesRemaining[var9]) * (FloorOverlayDefinition.fontBold12.stringWidth(var15) + 100)) / 150;
					Rasterizer2D.Rasterizer2D_expandClip((var0 + Client.viewportTempX) - 50, var1, (var0 + Client.viewportTempX) + 50, var3 + var1);
					FloorOverlayDefinition.fontBold12.draw(var15, ((var0 + Client.viewportTempX) + 50) - var17, Client.viewportTempY + var1, var16, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}

				if (Client.overheadTextEffects[var9] == 5) {
					var17 = 150 - Client.overheadTextCyclesRemaining[var9];
					int var18 = 0;
					if (var17 < 25) {
						var18 = var17 - 25;
					} else if (var17 > 125) {
						var18 = var17 - 125;
					}

					Rasterizer2D.Rasterizer2D_expandClip(var0, ((Client.viewportTempY + var1) - FloorOverlayDefinition.fontBold12.ascent) - 1, var0 + var2, (Client.viewportTempY + var1) + 5);
					FloorOverlayDefinition.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, (var18 + Client.viewportTempY) + var1, var16, 0);
					Rasterizer2D.Rasterizer2D_setClip(var0, var1, var0 + var2, var3 + var1);
				}
			} else {
				FloorOverlayDefinition.fontBold12.drawCentered(var15, var0 + Client.viewportTempX, Client.viewportTempY + var1, 16776960, 0);
			}
		}

	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(descriptor = 
	"([Lkn;IIIIIIIII)V", garbageValue = 
	"210982413")

	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();

		for (int var9 = 0; var9 < var0.length; ++var9) {
			Widget var10 = var0[var9];
			if ((var10 != null) && ((var10.parentId == var1) || ((var1 == (-1412584499)) && (var10 == Client.clickedWidget)))) {
				int var11;
				if (var8 == (-1)) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
					var11 = (++Client.rootWidgetCount) - 1;
				} else {
					var11 = var8;
				}

				var10.rootIndex = var11;
				var10.cycle = Client.cycle;
				if ((!var10.isIf3) || (!class263.isComponentHidden(var10))) {
					if (var10.contentType > 0) {
						class120.method2755(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if ((var1 != (-1412584499)) && (!var10.isScrollBar)) {
							ClanSettings.field1622 = var0;
							NPC.field1253 = var6;
							Projectile.field944 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field668) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field669) {
								var15 = Client.field669;
							}

							if ((var15 + var10.width) > (Client.field669 + Client.clickedWidgetParent.width)) {
								var15 = (Client.field669 + Client.clickedWidgetParent.width) - var10.width;
							}

							if (var16 < Client.field628) {
								var16 = Client.field628;
							}

							if ((var16 + var10.height) > (Client.field628 + Client.clickedWidgetParent.height)) {
								var16 = (Client.field628 + Client.clickedWidgetParent.height) - var10.height;
							}

							var12 = var15;
							var13 = var16;
						}

						if (!var10.isScrollBar) {
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) {
						var15 = var2;
						var16 = var3;
						var17 = var4;
						var18 = var5;
					} else if (var10.type == 9) {
						var19 = var12;
						var20 = var13;
						var21 = var12 + var10.width;
						var22 = var13 + var10.height;
						if (var21 < var12) {
							var19 = var21;
							var21 = var12;
						}

						if (var22 < var13) {
							var20 = var22;
							var22 = var13;
						}

						++var21;
						++var22;
						var15 = (var19 > var2) ? var19 : var2;
						var16 = (var20 > var3) ? var20 : var3;
						var17 = (var21 < var4) ? var21 : var4;
						var18 = (var22 < var5) ? var22 : var5;
					} else {
						var19 = var12 + var10.width;
						var20 = var13 + var10.height;
						var15 = (var12 > var2) ? var12 : var2;
						var16 = (var13 > var3) ? var13 : var3;
						var17 = (var19 < var4) ? var19 : var4;
						var18 = (var20 < var5) ? var20 : var5;
					}

					if ((!var10.isIf3) || ((var15 < var17) && (var16 < var18))) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (Interpreter.clientPreferences.method2251()) {
									var13 += 15;
									ViewportMouse.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var42 = Runtime.getRuntime();
									var20 = ((int) ((var42.totalMemory() - var42.freeMemory()) / 1024L));
									var21 = 16776960;
									if ((var20 > 327680) && (!Client.isLowDetail)) {
										var21 = 16711680;
									}

									ViewportMouse.fontPlain12.drawRightAligned(("Mem:" + var20) + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								NPC.drawEntities(var12, var13, var10.width, var10.height);
								Client.field564[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								WorldMapLabelSize.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								CollisionMap.drawCompass(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								ClanChannel.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
							}

							if (var10.contentType == 1401) {
								ClanChannel.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (((!var10.isIf3) && class263.isComponentHidden(var10)) && (var10 != Player.mousedOverWidgetIf1)) {
								continue;
							}

							if (!var10.isIf3) {
								if (var10.scrollY > (var10.scrollHeight - var10.height)) {
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) {
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var10.id)))));
							if (var30 != null) {
								class11.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						} else if (var10.type == 11) {
							if (class263.isComponentHidden(var10) && (var10 != Player.mousedOverWidgetIf1)) {
								continue;
							}

							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						}

						if ((Client.isResizable || Client.field576[var11]) || (Client.gameDrawingMode > 1)) {
							if (((var10.type == 0) && (!var10.isIf3)) && (var10.scrollHeight > var10.height)) {
								class193.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) {
									var19 = 0;

									for (var20 = 0; var20 < var10.rawHeight; ++var20) {
										for (var21 = 0; var21 < var10.rawWidth; ++var21) {
											var22 = var12 + (var21 * (var10.paddingX + 32));
											var23 = (var20 * (var10.paddingY + 32)) + var13;
											if (var19 < 20) {
												var22 += var10.inventoryXOffsets[var19];
												var23 += var10.inventoryYOffsets[var19];
											}

											if (var10.itemIds[var19] <= 0) {
												if ((var10.inventorySprites != null) && (var19 < 20)) {
													SpritePixels var46 = var10.getInventorySprite(var19);
													if (var46 != null) {
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3368) {
														class290.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false;
												boolean var38 = false;
												var26 = var10.itemIds[var19] - 1;
												if ((((((var22 + 32) > var2) && (var22 < var4)) && ((var23 + 32) > var3)) && (var23 < var5)) || ((var10 == FloorDecoration.dragInventoryWidget) && (var19 == Client.dragItemSlotSource))) {
													SpritePixels var35;
													if (((Client.isItemSelected == 1) && (var19 == class19.selectedItemSlot)) && (var10.id == PendingSpawn.selectedItemWidget)) {
														var35 = WorldMapCacheName.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = WorldMapCacheName.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
													}

													if (var35 != null) {
														if ((var10 == FloorDecoration.dragInventoryWidget) && (var19 == Client.dragItemSlotSource)) {
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX;
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY;
															if ((var24 < 5) && (var24 > (-5))) {
																var24 = 0;
															}

															if ((var25 < 5) && (var25 > (-5))) {
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) {
																var24 = 0;
																var25 = 0;
															}

															var35.drawTransAt(var24 + var22, var25 + var23, 128);
															if (var1 != (-1)) {
																Widget var28 = var0[var1 & 65535];
																int var29;
																if (((var25 + var23) < Rasterizer2D.Rasterizer2D_yClipStart) && (var28.scrollY > 0)) {
																	var29 = (((Rasterizer2D.Rasterizer2D_yClipStart - var23) - var25) * Client.field550) / 3;
																	if (var29 > (Client.field550 * 10)) {
																		var29 = Client.field550 * 10;
																	}

																	if (var29 > var28.scrollY) {
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29;
																	Client.draggedWidgetY += var29;
																	class290.invalidateWidget(var28);
																}

																if ((((var25 + var23) + 32) > Rasterizer2D.Rasterizer2D_yClipEnd) && (var28.scrollY < (var28.scrollHeight - var28.height))) {
																	var29 = ((((var25 + var23) + 32) - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field550) / 3;
																	if (var29 > (Client.field550 * 10)) {
																		var29 = Client.field550 * 10;
																	}

																	if (var29 > ((var28.scrollHeight - var28.height) - var28.scrollY)) {
																		var29 = (var28.scrollHeight - var28.height) - var28.scrollY;
																	}

																	var28.scrollY += var29;
																	Client.draggedWidgetY -= var29;
																	class290.invalidateWidget(var28);
																}
															}
														} else if ((var10 == class12.field64) && (var19 == Client.field741)) {
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23);
														}
													} else {
														class290.invalidateWidget(var10);
													}
												}
											}

											++var19;
										}
									}
								} else if (var10.type == 3) {
									if (PacketWriter.runCs1(var10)) {
										var19 = var10.color2;
										if ((var10 == Player.mousedOverWidgetIf1) && (var10.mouseOverColor2 != 0)) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if ((var10 == Player.mousedOverWidgetIf1) && (var10.mouseOverColor != 0)) {
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch (var10.fillMode.field4696) {
											case 1 :
												Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
												break;
											case 2 :
												Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
												break;
											default :
												if (var14 == 0) {
													Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
												} else {
													Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
												}}

									} else if (var14 == 0) {
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255));
									}
								} else {
									Font var39;
									if (var10.type == 4) {
										var39 = var10.getFont();
										if (var39 == null) {
											if (Widget.field3368) {
												class290.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text;
											if (PacketWriter.runCs1(var10)) {
												var20 = var10.color2;
												if ((var10 == Player.mousedOverWidgetIf1) && (var10.mouseOverColor2 != 0)) {
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) {
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color;
												if ((var10 == Player.mousedOverWidgetIf1) && (var10.mouseOverColor != 0)) {
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && (var10.itemId != (-1))) {
												ItemComposition var45 = class67.ItemDefinition_get(var10.itemId);
												var44 = var45.name;
												if (var44 == null) {
													var44 = "null";
												}

												if (((var45.isStackable == 1) || (var10.itemQuantity != 1)) && (var10.itemQuantity != (-1))) {
													var44 = ((((ChatChannel.colorStartTag(16748608) + var44) + "</col>") + " ") + 'x') + GrandExchangeOfferTotalQuantityComparator.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) {
												var44 = "Please wait...";
												var20 = var10.color;
											}

											if (!var10.isIf3) {
												var44 = class11.method114(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
										}
									} else if (var10.type == 5) {
										SpritePixels var40;
										if (!var10.isIf3) {
											var40 = var10.getSprite(PacketWriter.runCs1(var10), UserComparator9.urlRequester);
											if (var40 != null) {
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3368) {
												class290.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != (-1)) {
												var40 = WorldMapCacheName.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false, UserComparator9.urlRequester);
											}

											if (var40 == null) {
												if (Widget.field3368) {
													class290.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width;
												var21 = var40.height;
												if (!var10.spriteTiling) {
													var22 = (var10.width * 4096) / var20;
													if (var10.spriteAngle != 0) {
														var40.method8207((var10.width / 2) + var12, (var10.height / 2) + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if ((var20 == var10.width) && (var21 == var10.height)) {
														var40.drawTransBgAt(var12, var13);
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = ((var20 - 1) + var10.width) / var20;
													var23 = ((var21 - 1) + var10.height) / var21;

													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var40.method8207(((var20 / 2) + var12) + (var24 * var20), ((var21 / 2) + var13) + (var25 * var21), var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var40.drawTransAt(var12 + (var24 * var20), var13 + (var21 * var25), 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + (var24 * var20), var13 + (var25 * var21));
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) {
											boolean var36 = PacketWriter.runCs1(var10);
											if (var36) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var41 = null;
											var22 = 0;
											if (var10.itemId != (-1)) {
												var33 = class67.ItemDefinition_get(var10.itemId);
												if (var33 != null) {
													var33 = var33.getCountObj(var10.itemQuantity);
													var41 = var33.getModel(1);
													if (var41 != null) {
														var41.calculateBoundsCylinder();
														var22 = var41.height / 2;
													} else {
														class290.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var41 = Client.playerAppearance.getModel(((SequenceDefinition) (null)), -1, ((SequenceDefinition) (null)), -1);
												} else {
													var41 = class19.localPlayer.getModel();
												}
											} else if (var20 == (-1)) {
												var41 = var10.getModel(((SequenceDefinition) (null)), -1, var36, class19.localPlayer.appearance);
												if ((var41 == null) && Widget.field3368) {
													class290.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = ItemContainer.SequenceDefinition_get(var20);
												var41 = var10.getModel(var47, var10.modelFrame, var36, class19.localPlayer.appearance);
												if ((var41 == null) && Widget.field3368) {
													class290.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method3997((var10.width / 2) + var12, (var10.height / 2) + var13);
											var23 = (Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom) >> 16;
											var24 = (Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom) >> 16;
											if (var41 != null) {
												if (!var10.isIf3) {
													var41.method4376(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var41.method4366(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, (var22 + var23) + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4376(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, (var23 + var22) + var10.modelOffsetY, var24 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3();
										} else {
											if (var10.type == 7) {
												var39 = var10.getFont();
												if (var39 == null) {
													if (Widget.field3368) {
														class290.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0;

												for (var21 = 0; var21 < var10.rawHeight; ++var21) {
													for (var22 = 0; var22 < var10.rawWidth; ++var22) {
														if (var10.itemIds[var20] > 0) {
															var33 = class67.ItemDefinition_get(var10.itemIds[var20] - 1);
															String var34;
															if ((var33.isStackable != 1) && (var10.itemQuantities[var20] == 1)) {
																var34 = (ChatChannel.colorStartTag(16748608) + var33.name) + "</col>";
															} else {
																var34 = ((((ChatChannel.colorStartTag(16748608) + var33.name) + "</col>") + " ") + 'x') + GrandExchangeOfferTotalQuantityComparator.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = (var22 * (var10.paddingX + 115)) + var12;
															var26 = ((var10.paddingY + 12) * var21) + var13;
															if (var10.textXAlignment == 0) {
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) {
																var39.drawCentered(var34, (var10.width / 2) + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, (var25 + var10.width) - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
															}
														}

														++var20;
													}
												}
											}

											if (((var10.type == 8) && (var10 == class160.field1750)) && (Client.field641 == Client.field642)) {
												var19 = 0;
												var20 = 0;
												Font var31 = ViewportMouse.fontPlain12;
												String var32 = var10.text;

												String var43;
												for (var32 = class11.method114(var32, var10); var32.length() > 0; var20 = (var20 + var31.ascent) + 1) {
													var24 = var32.indexOf("<br>");
													if (var24 != (-1)) {
														var43 = var32.substring(0, var24);
														var32 = var32.substring(var24 + 4);
													} else {
														var43 = var32;
														var32 = "";
													}

													var25 = var31.stringWidth(var43);
													if (var25 > var19) {
														var19 = var25;
													}
												}

												var19 += 6;
												var20 += 7;
												var24 = ((var12 + var10.width) - 5) - var19;
												var25 = (var13 + var10.height) + 5;
												if (var24 < (var12 + 5)) {
													var24 = var12 + 5;
												}

												if ((var19 + var24) > var4) {
													var24 = var4 - var19;
												}

												if ((var25 + var20) > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
												var32 = var10.text;
												var26 = (var25 + var31.ascent) + 2;

												for (var32 = class11.method114(var32, var10); var32.length() > 0; var26 = (var26 + var31.ascent) + 1) {
													int var27 = var32.indexOf("<br>");
													if (var27 != (-1)) {
														var43 = var32.substring(0, var27);
														var32 = var32.substring(var27 + 4);
													} else {
														var43 = var32;
														var32 = "";
													}

													var31.draw(var43, var24 + 3, var26, 0, -1);
												}
											}

											if (var10.type == 9) {
												if (var10.field3491) {
													var19 = var12;
													var20 = var13 + var10.height;
													var21 = var12 + var10.width;
													var22 = var13;
												} else {
													var19 = var12;
													var20 = var13;
													var21 = var12 + var10.width;
													var22 = var13 + var10.height;
												}

												if (var10.lineWid == 1) {
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color);
												} else {
													class127.method2827(var19, var20, var21, var22, var10.color, var10.lineWid);
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
		}

	}
}