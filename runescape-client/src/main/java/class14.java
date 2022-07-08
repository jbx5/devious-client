import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import java.util.concurrent.ArrayBlockingQueue;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.runelite.mapping.Export;
@ObfuscatedName("u")
public class class14 {
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -2053769865)
	final int field81;

	@ObfuscatedName("v")
	final String field77;

	@ObfuscatedName("q")
	final ThreadFactory field78;

	@ObfuscatedName("f")
	final ThreadPoolExecutor field84;

	public class14(String var1, int var2, int var3) {
		this.field77 = var1;
		this.field81 = var2;
		this.field78 = new class16(this);
		this.field84 = this.method149(var3);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IS)Ljava/util/concurrent/ThreadPoolExecutor;", garbageValue = "8960")
	final ThreadPoolExecutor method149(int var1) {
		return new ThreadPoolExecutor(var1, var1, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(this.field81), this.field78);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ls;I)La;", garbageValue = "-1856685329")
	public class19 method150(class10 var1) {
		if (this.field84.getQueue().remainingCapacity() <= 0) {
			System.err.println("REST thread pool queue is empty\r\nThread pool size " + this.field84.getCorePoolSize() + " Queue capacity " + this.field81);
			return new class19("Queue full");
		} else {
			class19 var2 = new class19(this.field84.submit(new class20(this, var1)));
			return var2;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "93427456")
	public final void method151() {
		try {
			this.field84.shutdown();
		} catch (Exception var2) {
			System.err.println("Error shutting down RestRequestService\r\n" + var2);
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lpq;II)V", garbageValue = "-80281997")
	@Export("readPlayerUpdate")
	static void readPlayerUpdate(PacketBuffer var0, int var1) {
		boolean var2 = var0.readBits(1) == 1;
		if (var2) {
			Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
		}
		int var3 = var0.readBits(2);
		Player var4 = Client.players[var1];
		if (var3 == 0) {
			if (var2) {
				var4.field1088 = false;
			} else if (Client.localPlayerIndex == var1) {
				throw new RuntimeException();
			} else {
				Players.Players_regions[var1] = (var4.plane << 28) + (class28.baseX + var4.pathX[0] >> 13 << 14) + (WorldMapLabelSize.baseY + var4.pathY[0] >> 13);
				if (var4.field1165 != -1) {
					Players.Players_orientations[var1] = var4.field1165;
				} else {
					Players.Players_orientations[var1] = var4.orientation;
				}
				Players.Players_targetIndices[var1] = var4.targetIndex;
				Client.players[var1] = null;
				if (var0.readBits(1) != 0) {
					ModelData0.updateExternalPlayer(var0, var1);
				}
			}
		} else {
			int var5;
			int var6;
			int var7;
			if (var3 == 1) {
				var5 = var0.readBits(3);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					--var6;
					--var7;
				} else if (var5 == 1) {
					--var7;
				} else if (var5 == 2) {
					++var6;
					--var7;
				} else if (var5 == 3) {
					--var6;
				} else if (var5 == 4) {
					++var6;
				} else if (var5 == 5) {
					--var6;
					++var7;
				} else if (var5 == 6) {
					++var7;
				} else if (var5 == 7) {
					++var6;
					++var7;
				}
				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1088 = false;
				} else if (var2) {
					var4.field1088 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1088 = false;
					var4.method2139(var6, var7, Players.field1304[var1]);
				}
			} else if (var3 == 2) {
				var5 = var0.readBits(4);
				var6 = var4.pathX[0];
				var7 = var4.pathY[0];
				if (var5 == 0) {
					var6 -= 2;
					var7 -= 2;
				} else if (var5 == 1) {
					--var6;
					var7 -= 2;
				} else if (var5 == 2) {
					var7 -= 2;
				} else if (var5 == 3) {
					++var6;
					var7 -= 2;
				} else if (var5 == 4) {
					var6 += 2;
					var7 -= 2;
				} else if (var5 == 5) {
					var6 -= 2;
					--var7;
				} else if (var5 == 6) {
					var6 += 2;
					--var7;
				} else if (var5 == 7) {
					var6 -= 2;
				} else if (var5 == 8) {
					var6 += 2;
				} else if (var5 == 9) {
					var6 -= 2;
					++var7;
				} else if (var5 == 10) {
					var6 += 2;
					++var7;
				} else if (var5 == 11) {
					var6 -= 2;
					var7 += 2;
				} else if (var5 == 12) {
					--var6;
					var7 += 2;
				} else if (var5 == 13) {
					var7 += 2;
				} else if (var5 == 14) {
					++var6;
					var7 += 2;
				} else if (var5 == 15) {
					var6 += 2;
					var7 += 2;
				}
				if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
					var4.resetPath(var6, var7);
					var4.field1088 = false;
				} else if (var2) {
					var4.field1088 = true;
					var4.tileX = var6;
					var4.tileY = var7;
				} else {
					var4.field1088 = false;
					var4.method2139(var6, var7, Players.field1304[var1]);
				}
			} else {
				var5 = var0.readBits(1);
				int var8;
				int var9;
				int var10;
				int var11;
				if (var5 == 0) {
					var6 = var0.readBits(12);
					var7 = var6 >> 10;
					var8 = var6 >> 5 & 31;
					if (var8 > 15) {
						var8 -= 32;
					}
					var9 = var6 & 31;
					if (var9 > 15) {
						var9 -= 32;
					}
					var10 = var8 + var4.pathX[0];
					var11 = var9 + var4.pathY[0];
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1088 = false;
					} else if (var2) {
						var4.field1088 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1088 = false;
						var4.method2139(var10, var11, Players.field1304[var1]);
					}
					var4.plane = ((byte) (var7 + var4.plane & 3));
					if (Client.localPlayerIndex == var1) {
						PacketWriter.Client_plane = var4.plane;
					}
				} else {
					var6 = var0.readBits(30);
					var7 = var6 >> 28;
					var8 = var6 >> 14 & 16383;
					var9 = var6 & 16383;
					var10 = (var8 + class28.baseX + var4.pathX[0] & 16383) - class28.baseX;
					var11 = (var9 + WorldMapLabelSize.baseY + var4.pathY[0] & 16383) - WorldMapLabelSize.baseY;
					if (Client.localPlayerIndex == var1 && (var4.x < 1536 || var4.y < 1536 || var4.x >= 11776 || var4.y >= 11776)) {
						var4.resetPath(var10, var11);
						var4.field1088 = false;
					} else if (var2) {
						var4.field1088 = true;
						var4.tileX = var10;
						var4.tileY = var11;
					} else {
						var4.field1088 = false;
						var4.method2139(var10, var11, Players.field1304[var1]);
					}
					var4.plane = ((byte) (var7 + var4.plane & 3));
					if (Client.localPlayerIndex == var1) {
						PacketWriter.Client_plane = var4.plane;
					}
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-46")
	public static void method148() {
		PlayerComposition.PlayerAppearance_cachedModels.clear();
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(III)I", garbageValue = "-1085625206")
	static final int method156(int var0, int var1) {
		int var2 = class154.method3169(45365 + var0, 91923 + var1, 4) - 128 + (class154.method3169(10294 + var0, 37821 + var1, 2) - 128 >> 1) + (class154.method3169(var0, var1, 1) - 128 >> 2);
		var2 = ((int) (0.3 * ((double) (var2)))) + 35;
		if (var2 < 10) {
			var2 = 10;
		} else if (var2 > 60) {
			var2 = 60;
		}
		return var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-455048359")
	static int method155(int var0, Script var1, boolean var2) {
		if (var0 != 6700 && var0 != 6702 && var0 != 6704 && var0 != 6706 && var0 != 6708) {
			if (var0 != 6701 && var0 != 6703 && var0 != 6705 && var0 != 6707 && var0 != 6709) {
				if (var0 == 6750) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
					return 1;
				} else if (var0 != 6751 && var0 != 6752 && var0 != 6753) {
					if (var0 == 6754) {
						int var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						NPCComposition var4 = BuddyRankComparator.getNpcDefinition(var3);
						Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = (var4 != null) ? var4.name : "";
						return 1;
					} else {
						return 2;
					}
				} else {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
					return 1;
				}
			} else {
				--class446.Interpreter_intStackSize;
				return 1;
			}
		} else {
			class446.Interpreter_intStackSize -= 2;
			--Interpreter.Interpreter_stringStackSize;
			return 1;
		}
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(descriptor = "([Lkb;IIIIIIIII)V", garbageValue = "-2125768585")
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
		for (int var9 = 0; var9 < var0.length; ++var9) {
			Widget var10 = var0[var9];
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) {
				int var11;
				if (var8 == -1) {
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6;
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y;
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width;
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height;
					var11 = ++Client.rootWidgetCount - 1;
				} else {
					var11 = var8;
				}
				var10.rootIndex = var11;
				var10.cycle = Client.cycle;
				if (!var10.isIf3 || !Frames.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						WorldMapData_1.method4874(var10);
					}
					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							class12.field62 = var0;
							UserComparator5.field1389 = var6;
							SecureRandomFuture.field960 = var7;
							continue;
						}
						if (Client.isDraggingWidget && Client.field767) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field664) {
								var15 = Client.field664;
							}
							if (var15 + var10.width > Client.field664 + Client.clickedWidgetParent.width) {
								var15 = Client.field664 + Client.clickedWidgetParent.width - var10.width;
							}
							if (var16 < Client.field550) {
								var16 = Client.field550;
							}
							if (var16 + var10.height > Client.field550 + Client.clickedWidgetParent.height) {
								var16 = Client.field550 + Client.clickedWidgetParent.height - var10.height;
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
					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (class19.clientPreferences.method2252()) {
									var13 += 15;
									DevicePcmPlayerProvider.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var42 = Runtime.getRuntime();
									var20 = ((int) ((var42.totalMemory() - var42.freeMemory()) / 1024L));
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}
									DevicePcmPlayerProvider.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}
							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								ServerPacket.drawEntities(var12, var13, var10.width, var10.height);
								Client.field703[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}
							if (var10.contentType == 1338) {
								class120.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}
							if (var10.contentType == 1339) {
								NPC.drawCompass(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}
							if (var10.contentType == 1400) {
								class121.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle);
							}
							if (var10.contentType == 1401) {
								class121.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}
							if (var10.contentType == 1402) {
								Login.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}
						if (var10.type == 0) {
							if (!var10.isIf3 && Frames.isComponentHidden(var10) && var10 != Language.mousedOverWidgetIf1) {
								continue;
							}
							if (!var10.isIf3) {
								if (var10.scrollY > var10.scrollHeight - var10.height) {
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
								class193.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11);
							}
							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						} else if (var10.type == 11) {
							if (Frames.isComponentHidden(var10) && var10 != Language.mousedOverWidgetIf1) {
								continue;
							}
							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}
							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D();
						}
						if (Client.isResizable || Client.field751[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								class201.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
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
											var22 = var12 + var21 * (var10.paddingX + 32);
											var23 = var13 + var20 * (var10.paddingY + 32);
											if (var19 < 20) {
												var22 += var10.inventoryXOffsets[var19];
												var23 += var10.inventoryYOffsets[var19];
											}
											if (var10.itemIds[var19] <= 0) {
												if (var10.inventorySprites != null && var19 < 20) {
													SpritePixels var46 = var10.getInventorySprite(var19);
													if (var46 != null) {
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3366) {
														ChatChannel.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false;
												boolean var38 = false;
												var26 = var10.itemIds[var19] - 1;
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == Interpreter.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == EnumComposition.selectedItemSlot && var10.id == ModeWhere.selectedItemWidget) {
														var35 = class346.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = class346.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false);
													}
													if (var35 != null) {
														if (var10 == Interpreter.dragInventoryWidget && var19 == Client.dragItemSlotSource) {
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX;
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY;
															if (var24 < 5 && var24 > -5) {
																var24 = 0;
															}
															if (var25 < 5 && var25 > -5) {
																var25 = 0;
															}
															if (Client.itemDragDuration < 5) {
																var24 = 0;
																var25 = 0;
															}
															var35.drawTransAt(var22 + var24, var25 + var23, 128);
															if (var1 != -1) {
																Widget var28 = var0[var1 & 65535];
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) {
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field555 / 3;
																	if (var29 > Client.field555 * 10) {
																		var29 = Client.field555 * 10;
																	}
																	if (var29 > var28.scrollY) {
																		var29 = var28.scrollY;
																	}
																	var28.scrollY -= var29;
																	Client.draggedWidgetY += var29;
																	ChatChannel.invalidateWidget(var28);
																}
																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) {
																	var29 = (var25 + var23 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field555 / 3;
																	if (var29 > Client.field555 * 10) {
																		var29 = Client.field555 * 10;
																	}
																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) {
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}
																	var28.scrollY += var29;
																	Client.draggedWidgetY -= var29;
																	ChatChannel.invalidateWidget(var28);
																}
															}
														} else if (var10 == class1.field4 && var19 == Client.field600) {
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23);
														}
													} else {
														ChatChannel.invalidateWidget(var10);
													}
												}
											}
											++var19;
										}
									}
								} else if (var10.type == 3) {
									if (ObjectSound.runCs1(var10)) {
										var19 = var10.color2;
										if (var10 == Language.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if (var10 == Language.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var19 = var10.mouseOverColor;
										}
									}
									if (var10.fill) {
										switch (var10.fillMode.field4781) {
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
												}
										}
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
											if (Widget.field3366) {
												ChatChannel.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text;
											if (ObjectSound.runCs1(var10)) {
												var20 = var10.color2;
												if (var10 == Language.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
													var20 = var10.mouseOverColor2;
												}
												if (var10.text2.length() > 0) {
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color;
												if (var10 == Language.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
													var20 = var10.mouseOverColor;
												}
											}
											if (var10.isIf3 && var10.itemId != -1) {
												ItemComposition var45 = EnumComposition.ItemDefinition_get(var10.itemId);
												var44 = var45.name;
												if (var44 == null) {
													var44 = "null";
												}
												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
													var44 = class122.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + WorldMapSprite.formatItemStacks(var10.itemQuantity);
												}
											}
											if (var10 == Client.meslayerContinueWidget) {
												var44 = "Please wait...";
												var20 = var10.color;
											}
											if (!var10.isIf3) {
												var44 = class10.method74(var44, var10);
											}
											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
										}
									} else if (var10.type == 5) {
										SpritePixels var40;
										if (!var10.isIf3) {
											var40 = var10.getSprite(ObjectSound.runCs1(var10), class138.urlRequester);
											if (var40 != null) {
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3366) {
												ChatChannel.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var40 = class346.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false, class138.urlRequester);
											}
											if (var40 == null) {
												if (Widget.field3366) {
													ChatChannel.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width;
												var21 = var40.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var40.method8180(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) {
														var40.drawTransBgAt(var12, var13);
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = (var20 - 1 + var10.width) / var20;
													var23 = (var21 - 1 + var10.height) / var21;
													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var40.method8180(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var40.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21);
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
											boolean var36 = ObjectSound.runCs1(var10);
											if (var36) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}
											Model var41 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												var33 = EnumComposition.ItemDefinition_get(var10.itemId);
												if (var33 != null) {
													var33 = var33.getCountObj(var10.itemQuantity);
													var41 = var33.getModel(1);
													if (var41 != null) {
														var41.calculateBoundsCylinder();
														var22 = var41.height / 2;
													} else {
														ChatChannel.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var41 = Client.playerAppearance.getModel(((SequenceDefinition) (null)), -1, ((SequenceDefinition) (null)), -1);
												} else {
													var41 = class101.localPlayer.getModel();
												}
											} else if (var20 == -1) {
												var41 = var10.getModel(((SequenceDefinition) (null)), -1, var36, class101.localPlayer.appearance);
												if (var41 == null && Widget.field3366) {
													ChatChannel.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = ScriptFrame.SequenceDefinition_get(var20);
												var41 = var10.getModel(var47, var10.modelFrame, var36, class101.localPlayer.appearance);
												if (var41 == null && Widget.field3366) {
													ChatChannel.invalidateWidget(var10);
												}
											}
											Rasterizer3D.method4021(var10.width / 2 + var12, var10.height / 2 + var13);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var41 != null) {
												if (!var10.isIf3) {
													var41.method4442(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var41.method4462(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4442(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY);
													}
												}
											}
											Rasterizer3D.Rasterizer3D_method3();
										} else {
											if (var10.type == 7) {
												var39 = var10.getFont();
												if (var39 == null) {
													if (Widget.field3366) {
														ChatChannel.invalidateWidget(var10);
													}
													continue;
												}
												var20 = 0;
												for (var21 = 0; var21 < var10.rawHeight; ++var21) {
													for (var22 = 0; var22 < var10.rawWidth; ++var22) {
														if (var10.itemIds[var20] > 0) {
															var33 = EnumComposition.ItemDefinition_get(var10.itemIds[var20] - 1);
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) {
																var34 = class122.colorStartTag(16748608) + var33.name + "</col>";
															} else {
																var34 = class122.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + WorldMapSprite.formatItemStacks(var10.itemQuantities[var20]);
															}
															var25 = var22 * (var10.paddingX + 115) + var12;
															var26 = var13 + (var10.paddingY + 12) * var21;
															if (var10.textXAlignment == 0) {
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) {
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1);
															}
														}
														++var20;
													}
												}
											}
											if (var10.type == 8 && var10 == SoundSystem.field313 && Client.field646 == Client.field638) {
												var19 = 0;
												var20 = 0;
												Font var31 = DevicePcmPlayerProvider.fontPlain12;
												String var32 = var10.text;
												String var43;
												for (var32 = class10.method74(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) {
													var24 = var32.indexOf("<br>");
													if (var24 != -1) {
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
												var24 = var12 + var10.width - 5 - var19;
												var25 = var13 + var10.height + 5;
												if (var24 < var12 + 5) {
													var24 = var12 + 5;
												}
												if (var24 + var19 > var4) {
													var24 = var4 - var19;
												}
												if (var25 + var20 > var5) {
													var25 = var5 - var20;
												}
												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
												var32 = var10.text;
												var26 = var25 + var31.ascent + 2;
												for (var32 = class10.method74(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) {
													int var27 = var32.indexOf("<br>");
													if (var27 != -1) {
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
												if (var10.field3402) {
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
													JagexCache.method3262(var19, var20, var21, var22, var10.color, var10.lineWid);
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

	@ObfuscatedName("lm")
	@ObfuscatedSignature(descriptor = "(Lkb;II)Ljava/lang/String;", garbageValue = "-1990972086")
	static String method157(Widget var0, int var1) {
		int var3 = class124.getWidgetFlags(var0);
		boolean var2 = (var3 >> var1 + 1 & 1) != 0;
		if (!var2 && var0.onOp == null) {
			return null;
		} else {
			return var0.actions != null && var0.actions.length > var1 && var0.actions[var1] != null && var0.actions[var1].trim().length() != 0 ? var0.actions[var1] : null;
		}
	}
}