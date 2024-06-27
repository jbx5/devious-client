import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jy")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1849692139
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -606265631
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 334735629
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "([Lnx;IIIIIIIIB)V",
		garbageValue = "44"
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
				if (!var10.isIf3 || !class175.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						class30.method451(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							class433.field4761 = var0;
							FloorDecoration.field2819 = var6;
							class143.field1673 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field688) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field689) {
								var15 = Client.field689;
							}

							if (var15 + var10.width > Client.field689 + Client.clickedWidgetParent.width) {
								var15 = Client.field689 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field505) {
								var16 = Client.field505;
							}

							if (var16 + var10.height > Client.field505 + Client.clickedWidgetParent.height) {
								var16 = Client.field505 + Client.clickedWidgetParent.height - var10.height;
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
								if (class105.clientPreferences.isDisplayingFps()) {
									var13 += 15;
									FloorUnderlayDefinition.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var40 = Runtime.getRuntime();
									var20 = (int)((var40.totalMemory() - var40.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									FloorUnderlayDefinition.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								class169.drawEntities(var12, var13, var10.width, var10.height);
								Client.validRootWidgets[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								class454.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								TaskHandler.method4179(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								VertexNormal.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle, class105.clientPreferences.getBrightness());
							}

							if (var10.contentType == 1401) {
								VertexNormal.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								class91.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && class175.isComponentHidden(var10) && var10 != class180.mousedOverWidgetIf1) {
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
								PendingSpawn.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						} else if (var10.type == 11) {
							if (class175.isComponentHidden(var10) && var10 != class180.mousedOverWidgetIf1) {
								continue;
							}

							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field723[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								class30.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								if (var10.type == 3) {
									if (class534.runCs1(var10)) {
										var19 = var10.color2;
										if (var10 == class180.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if (var10 == class180.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field5443) {
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
									Font var39 = var10.getFont(ModeWhere.widgetDefinition);
									if (var39 == null) {
										if (Widget.field3828) {
											TriBool.invalidateWidget(var10);
										}
									} else {
										String var41 = var10.text;
										if (class534.runCs1(var10)) {
											var20 = var10.color2;
											if (var10 == class180.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
												var20 = var10.mouseOverColor2;
											}

											if (var10.text2.length() > 0) {
												var41 = var10.text2;
											}
										} else {
											var20 = var10.color;
											if (var10 == class180.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
												var20 = var10.mouseOverColor;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) {
											ItemComposition var42 = class164.ItemDefinition_get(var10.itemId);
											var41 = var42.name;
											if (var41 == null) {
												var41 = "null";
											}

											if ((var42.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
												var41 = NpcOverrides.colorStartTag(16748608) + var41 + "</col>" + " " + 'x' + class238.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) {
											var41 = "Please wait...";
											var20 = var10.color;
										}

										if (!var10.isIf3) {
											var41 = Widget.method7006(var41, var10);
										}

										var39.drawWidgetText(var41, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class498.method8893(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) {
										SpritePixels var37;
										if (!var10.isIf3) {
											var37 = var10.getSprite(ModeWhere.widgetDefinition, class534.runCs1(var10), ByteArrayPool.urlRequester);
											if (var37 != null) {
												var37.drawTransBgAt(var12, var13);
											} else if (Widget.field3828) {
												TriBool.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var37 = HitSplatDefinition.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var37 = var10.getSprite(ModeWhere.widgetDefinition, false, ByteArrayPool.urlRequester);
											}

											if (var37 == null) {
												if (Widget.field3828) {
													TriBool.invalidateWidget(var10);
												}
											} else {
												var20 = var37.width;
												var21 = var37.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var37.method10024(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
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
																var37.method10024(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var37.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var37.drawTransBgAt(var12 + var20 * var24, var13 + var25 * var21);
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
											boolean var35 = class534.runCs1(var10);
											if (var35) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var38 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												ItemComposition var43 = class164.ItemDefinition_get(var10.itemId);
												if (var43 != null) {
													var43 = var43.getCountObj(var10.itemQuantity);
													var38 = var43.getModel(1);
													if (var38 != null) {
														var38.calculateBoundsCylinder();
														var22 = var38.height / 2;
													} else {
														TriBool.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var38 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var38 = SoundCache.localPlayer.getModel();
												}
											} else if (var10.modelType == 7) {
												var38 = var10.field3838.getModel((SequenceDefinition)null, -1, class353.SequenceDefinition_get(SoundCache.localPlayer.idleSequence), SoundCache.localPlayer.movementFrame);
											} else {
												NpcOverrides var44 = null;
												if (var10.modelType == 6) {
													var24 = var10.modelId;
													if (var24 >= 0 && var24 < class511.topLevelWorldView.npcs.length) {
														NPC var33 = class511.topLevelWorldView.npcs[var24];
														if (var33 != null && var33.definition != null) {
															var26 = var33.definition.method3731();
															if (var26 != -1) {
																var10.modelId = var26;
															}

															var44 = var33.method2762();
														}
													}
												} else if (var10.modelType == 2) {
													var24 = var10.modelId;
													var25 = class76.getNpcDefinition(var24).method3731();
													if (var25 != -1) {
														var10.modelId = var25;
													}
												}

												SequenceDefinition var34 = null;
												var25 = -1;
												if (var20 != -1) {
													var34 = class353.SequenceDefinition_get(var20);
													var25 = var10.modelFrame;
												}

												var38 = var10.getModel(ModeWhere.widgetDefinition, var34, var25, var35, SoundCache.localPlayer.appearance, var44);
												if (var38 == null && Widget.field3828) {
													TriBool.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method5307(var10.width / 2 + var12, var10.height / 2 + var13);
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

											Rasterizer3D.method5262();
										} else {
											Font var29;
											if (var10.type == 8 && var10 == GrandExchangeOfferOwnWorldComparator.field466 && Client.field500 == Client.field662) {
												var19 = 0;
												var20 = 0;
												var29 = FloorUnderlayDefinition.fontPlain12;
												String var30 = var10.text;

												String var31;
												for (var30 = Widget.method7006(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) {
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

												if (var19 + var24 > var4) {
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) {
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120);
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0);
												var30 = var10.text;
												var26 = var25 + var29.ascent + 2;

												for (var30 = Widget.method7006(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) {
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
												if (var10.field3880) {
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
													class241.method4542(var19, var20, var21, var22, var10.color, var10.lineWid);
												}
											} else if (var10.type == 12) {
												class356 var36 = var10.method6991();
												class350 var32 = var10.method6890();
												if (var36 != null && var32 != null && var36.method6640()) {
													var29 = var10.getFont(ModeWhere.widgetDefinition);
													if (var29 != null) {
														Client.field713.method10163(var12, var13, var10.width, var10.height, var36.method6641(), var36.method6642(), var36.method6779(), var36.method6639(), var36.method6838());
														var22 = var10.textShadowed ? var10.spriteShadow : -1;
														if (!var36.method6635() && var36.method6632().method7936()) {
															Client.field713.method10174(var32.field3750, var22, var32.field3752, var32.field3751);
															Client.field713.method10165(var36.method6675(), var29);
														} else {
															Client.field713.method10174(var10.color, var22, var32.field3752, var32.field3751);
															Client.field713.method10165(var36.method6632(), var29);
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
}
