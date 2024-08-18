import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ee")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -877755979
	)
	static int field1471;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 504797483
	)
	static int field1472;
	@ObfuscatedName("ab")
	final URL field1473;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1700599309
	)
	volatile int field1470;
	@ObfuscatedName("ax")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1471 = -1;
		field1472 = -2;
	}

	UrlRequest(URL var1) {
		this.field1470 = field1471;
		this.field1473 = var1;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2125066530"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1470 != field1471;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "127"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "-13254595"
	)
	public String method3022() {
		return this.field1473.toString();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "331745613"
	)
	public static void method3034(int var0, int var1) {
		VarbitComposition var2 = class218.method4618(var0);
		int var3 = var2.baseVar;
		int var4 = var2.startBit;
		int var5 = var2.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		if (var1 < 0 || var1 > var6) {
			var1 = 0;
		}

		var6 <<= var4;
		Varps.Varps_main[var3] = Varps.Varps_main[var3] & ~var6 | var1 << var4 & var6;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1127829511"
	)
	public static void method3023() {
		synchronized(MouseHandler.MouseHandler_instance) {
			MouseHandler.MouseHandler_currentButton = MouseHandler.MouseHandler_currentButtonVolatile;
			MouseHandler.MouseHandler_x = MouseHandler.MouseHandler_xVolatile;
			MouseHandler.MouseHandler_y = MouseHandler.MouseHandler_yVolatile;
			MouseHandler.MouseHandler_millis = MouseHandler.MouseHandler_lastMovedVolatile;
			MouseHandler.MouseHandler_lastButton = MouseHandler.MouseHandler_lastButtonVolatile;
			MouseHandler.MouseHandler_lastPressedX = MouseHandler.MouseHandler_lastPressedXVolatile;
			MouseHandler.MouseHandler_lastPressedY = MouseHandler.MouseHandler_lastPressedYVolatile;
			MouseHandler.MouseHandler_lastPressedTimeMillis = MouseHandler.MouseHandler_lastPressedTimeMillisVolatile;
			MouseHandler.MouseHandler_lastButtonVolatile = 0;
		}
	}

	@ObfuscatedName("mb")
	@ObfuscatedSignature(
		descriptor = "([Lnq;IIIIIIIIB)V",
		garbageValue = "0"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
		Rasterizer3D.resetRasterClipping();

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
				if (!var10.isIf3 || !class238.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						ArchiveLoader.method2375(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							class335.field3622 = var0;
							ClanChannelMember.field1685 = var6;
							class161.field1769 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field683) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field661) {
								var15 = Client.field661;
							}

							if (var15 + var10.width > Client.field661 + Client.clickedWidgetParent.width) {
								var15 = Client.field661 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field766) {
								var16 = Client.field766;
							}

							if (var16 + var10.height > Client.field766 + Client.clickedWidgetParent.height) {
								var16 = Client.field766 + Client.clickedWidgetParent.height - var10.height;
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
					if (var10.type == 9) {
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
						var15 = var19 > var2 ? var19 : var2;
						var16 = var20 > var3 ? var20 : var3;
						var17 = var21 < var4 ? var21 : var4;
						var18 = var22 < var5 ? var22 : var5;
					} else {
						var19 = var12 + var10.width;
						var20 = var13 + var10.height;
						var15 = var12 > var2 ? var12 : var2;
						var16 = var13 > var3 ? var13 : var3;
						var17 = var19 < var4 ? var19 : var4;
						var18 = var20 < var5 ? var20 : var5;
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) {
						if (var10.contentType != 0) {
							if (var10.contentType == 1336) {
								if (TileItem.clientPreferences.isDisplayingFps()) {
									var13 += 15;
									GrandExchangeOfferUnitPriceComparator.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var40 = Runtime.getRuntime();
									var20 = (int)((var40.totalMemory() - var40.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									GrandExchangeOfferUnitPriceComparator.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								class166.drawEntities(var12, var13, var10.width, var10.height);
								Client.validRootWidgets[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								class265.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								Login.method2252(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								class219.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle, TileItem.clientPreferences.getBrightness());
							}

							if (var10.contentType == 1401) {
								class219.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								class27.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && class238.isComponentHidden(var10) && var10 != HttpMethod.mousedOverWidgetIf1) {
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

							InterfaceParent var28 = (InterfaceParent)Client.interfaceParents.get((long)var10.id);
							if (var28 != null) {
								class76.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						} else if (var10.type == 11) {
							if (class238.isComponentHidden(var10) && var10 != HttpMethod.mousedOverWidgetIf1) {
								continue;
							}

							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field763[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								class249.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								if (var10.type == 3) {
									if (HealthBarConfig.runCs1(var10)) {
										var19 = var10.color2;
										if (var10 == HttpMethod.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if (var10 == HttpMethod.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field5463) {
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2);
											break;
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255));
											break;
										default:
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
								} else if (var10.type == 4) {
									Font var39 = var10.getFont(FloorUnderlayDefinition.widgetDefinition);
									if (var39 == null) {
										if (Widget.field3896) {
											class416.invalidateWidget(var10);
										}
									} else {
										String var41 = var10.text;
										if (HealthBarConfig.runCs1(var10)) {
											var20 = var10.color2;
											if (var10 == HttpMethod.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
												var20 = var10.mouseOverColor2;
											}

											if (var10.text2.length() > 0) {
												var41 = var10.text2;
											}
										} else {
											var20 = var10.color;
											if (var10 == HttpMethod.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
												var20 = var10.mouseOverColor;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) {
											ItemComposition var42 = Player.ItemDefinition_get(var10.itemId);
											var41 = var42.name;
											if (var41 == null) {
												var41 = "null";
											}

											if ((var42.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
												var41 = TransformationMatrix.colorStartTag(16748608) + var41 + "</col>" + " " + 'x' + AABB.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) {
											var41 = "Please wait...";
											var20 = var10.color;
										}

										if (!var10.isIf3) {
											var41 = WorldMapSection0.method5891(var41, var10);
										}

										var39.drawWidgetText(var41, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class499.method8946(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) {
										SpritePixels var37;
										if (!var10.isIf3) {
											var37 = var10.getSprite(FloorUnderlayDefinition.widgetDefinition, HealthBarConfig.runCs1(var10), Canvas.urlRequester);
											if (var37 != null) {
												var37.drawTransBgAt(var12, var13);
											} else if (Widget.field3896) {
												class416.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var37 = AbstractByteArrayCopier.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var37 = var10.getSprite(FloorUnderlayDefinition.widgetDefinition, false, Canvas.urlRequester);
											}

											if (var37 == null) {
												if (Widget.field3896) {
													class416.invalidateWidget(var10);
												}
											} else {
												var20 = var37.width;
												var21 = var37.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var37.method10119(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var37.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) {
														var37.drawTransBgAt(var12, var13);
													} else {
														var37.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = (var20 - 1 + var10.width) / var20;
													var23 = (var21 - 1 + var10.height) / var21;

													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var37.method10119(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var25 * var21, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var37.drawTransAt(var12 + var20 * var24, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var37.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25);
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
												}
											}
										}
									} else {
										int var26;
										if (var10.type == 6) {
											boolean var35 = HealthBarConfig.runCs1(var10);
											if (var35) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var38 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												ItemComposition var43 = Player.ItemDefinition_get(var10.itemId);
												if (var43 != null) {
													var43 = var43.getCountObj(var10.itemQuantity);
													var38 = var43.getModel(1);
													if (var38 != null) {
														var38.calculateBoundsCylinder();
														var22 = var38.height / 2;
													} else {
														class416.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var38 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var38 = class253.localPlayer.getModel();
												}
											} else if (var10.modelType == 7) {
												var38 = var10.field3861.getModel((SequenceDefinition)null, -1, class182.SequenceDefinition_get(class253.localPlayer.idleSequence), class253.localPlayer.movementFrame);
											} else {
												NpcOverrides var44 = null;
												if (var10.modelType == 6) {
													var24 = var10.modelId;
													if (var24 >= 0 && var24 < ConcurrentMidiTask.topLevelWorldView.npcs.length) {
														NPC var33 = ConcurrentMidiTask.topLevelWorldView.npcs[var24];
														if (var33 != null && var33.definition != null) {
															var26 = var33.definition.method4955();
															if (var26 != -1) {
																var10.modelId = var26;
															}

															var44 = var33.method2783();
														}
													}
												} else if (var10.modelType == 2) {
													var24 = var10.modelId;
													var25 = UserComparator8.getNpcDefinition(var24).method4955();
													if (var25 != -1) {
														var10.modelId = var25;
													}
												}

												SequenceDefinition var34 = null;
												var25 = -1;
												if (var20 != -1) {
													var34 = class182.SequenceDefinition_get(var20);
													var25 = var10.modelFrame;
												}

												var38 = var10.getModel(FloorUnderlayDefinition.widgetDefinition, var34, var25, var35, class253.localPlayer.appearance, var44);
												if (var38 == null && Widget.field3896) {
													class416.invalidateWidget(var10);
												}
											}

											Rasterizer3D.setCustomClipBounds(var10.width / 2 + var12, var10.height / 2 + var13);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var38 != null) {
												if (!var10.isIf3) {
													var38.drawFrustum(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var38.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var38.drawOrtho(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var38.drawFrustum(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.setClipBounds();
										} else {
											Font var29;
											if (var10.type == 8 && var10 == class273.field2978 && Client.field657 == Client.field656) {
												var19 = 0;
												var20 = 0;
												var29 = GrandExchangeOfferUnitPriceComparator.fontPlain12;
												String var30 = var10.text;

												String var31;
												for (var30 = WorldMapSection0.method5891(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) {
													var24 = var30.indexOf("<br>");
													if (var24 != -1) {
														var31 = var30.substring(0, var24);
														var30 = var30.substring(var24 + 4);
													} else {
														var31 = var30;
														var30 = "";
													}

													var25 = var29.stringWidth(var31);
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

												if (var20 + var25 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
												var30 = var10.text;
												var26 = var25 + var29.ascent + 2;

												for (var30 = WorldMapSection0.method5891(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) {
													int var27 = var30.indexOf("<br>");
													if (var27 != -1) {
														var31 = var30.substring(0, var27);
														var30 = var30.substring(var27 + 4);
													} else {
														var31 = var30;
														var30 = "";
													}

													var29.draw(var31, var24 + 3, var26, 0, -1);
												}
											}

											if (var10.type == 9) {
												if (var10.field3837) {
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
													class149.method3361(var19, var20, var21, var22, var10.color, var10.lineWid);
												}
											} else if (var10.type == 12) {
												class358 var36 = var10.method6971();
												class352 var32 = var10.method6972();
												if (var36 != null && var32 != null && var36.method6843()) {
													var29 = var10.getFont(FloorUnderlayDefinition.widgetDefinition);
													if (var29 != null) {
														Client.field708.method10240(var12, var13, var10.width, var10.height, var36.method6697(), var36.method6698(), var36.method6694(), var36.method6695(), var36.method6862());
														var22 = var10.textShadowed ? var10.spriteShadow : -1;
														if (!var36.method6691() && var36.method6712().method8019()) {
															Client.field708.method10241(var32.field3722, var22, var32.field3721, var32.field3720);
															Client.field708.method10245(var36.method6824(), var29);
														} else {
															Client.field708.method10241(var10.color, var22, var32.field3721, var32.field3720);
															Client.field708.method10245(var36.method6712(), var29);
														}

														Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
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

	@ObfuscatedName("og")
	@ObfuscatedSignature(
		descriptor = "(IIIILvc;Lnm;I)V",
		garbageValue = "1917865679"
	)
	@Export("drawSpriteOnMinimap")
	static final void drawSpriteOnMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		if (var4 != null) {
			int var6 = Client.camAngleY & 2047;
			int var7 = var3 * var3 + var2 * var2;
			if (var7 <= 6400) {
				int var8 = Rasterizer3D.Rasterizer3D_sine[var6];
				int var9 = Rasterizer3D.Rasterizer3D_cosine[var6];
				int var10 = var9 * var2 + var3 * var8 >> 16;
				int var11 = var3 * var9 - var8 * var2 >> 16;
				if (var7 > 2500) {
					var4.method10159(var10 + var5.width / 2 - var4.width / 2, var5.height / 2 - var11 - var4.height / 2, var0, var1, var5.width, var5.height, var5.xStarts, var5.xWidths);
				} else {
					var4.drawTransBgAt(var0 + var10 + var5.width / 2 - var4.width / 2, var5.height / 2 + var1 - var11 - var4.height / 2);
				}

			}
		}
	}
}
