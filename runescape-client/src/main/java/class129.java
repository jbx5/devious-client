import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ez")
public class class129 {
	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static GameBuild field1536;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 335239889
	)
	public final int field1528;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lez;"
	)
	public class129 field1522;
	@ObfuscatedName("al")
	float[][] field1523;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "[Lsr;"
	)
	final class469[] field1524;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lsr;"
	)
	class469[] field1525;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "[Lsr;"
	)
	class469[] field1526;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class469 field1527;
	@ObfuscatedName("az")
	boolean field1533;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class469 field1529;
	@ObfuscatedName("au")
	boolean field1530;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lsr;"
	)
	class469 field1531;
	@ObfuscatedName("ah")
	float[][] field1535;
	@ObfuscatedName("aj")
	float[][] field1521;
	@ObfuscatedName("af")
	float[][] field1534;

	@ObfuscatedSignature(
		descriptor = "(ILuq;Z)V"
	)
	public class129(int var1, Buffer var2, boolean var3) {
		this.field1527 = new class469();
		this.field1533 = true;
		this.field1529 = new class469();
		this.field1530 = true;
		this.field1531 = new class469();
		this.field1528 = var2.readShort();
		this.field1524 = new class469[var1];
		this.field1525 = new class469[this.field1524.length];
		this.field1526 = new class469[this.field1524.length];
		this.field1523 = new float[this.field1524.length][3];

		for (int var4 = 0; var4 < this.field1524.length; ++var4) {
			this.field1524[var4] = new class469(var2, var3);
			this.field1523[var4][0] = var2.method9481();
			this.field1523[var4][1] = var2.method9481();
			this.field1523[var4][2] = var2.method9481();
		}

		this.method3023();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-3568"
	)
	void method3023() {
		this.field1535 = new float[this.field1524.length][3];
		this.field1521 = new float[this.field1524.length][3];
		this.field1534 = new float[this.field1524.length][3];
		class469 var1 = UserComparator9.method2965();

		for (int var2 = 0; var2 < this.field1524.length; ++var2) {
			class469 var3 = this.method3046(var2);
			var1.method8629(var3);
			var1.method8685();
			this.field1535[var2] = var1.method8634();
			this.field1521[var2][0] = var3.field4843[12];
			this.field1521[var2][1] = var3.field4843[13];
			this.field1521[var2][2] = var3.field4843[14];
			this.field1534[var2] = var3.method8623();
		}

		var1.method8648();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lsr;",
		garbageValue = "2146006295"
	)
	class469 method3046(int var1) {
		return this.field1524[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lsr;",
		garbageValue = "1910783398"
	)
	class469 method3024(int var1) {
		if (this.field1525[var1] == null) {
			this.field1525[var1] = new class469(this.method3046(var1));
			if (this.field1522 != null) {
				this.field1525[var1].method8633(this.field1522.method3024(var1));
			} else {
				this.field1525[var1].method8633(class469.field4844);
			}
		}

		return this.field1525[var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lsr;",
		garbageValue = "953941007"
	)
	class469 method3052(int var1) {
		if (this.field1526[var1] == null) {
			this.field1526[var1] = new class469(this.method3024(var1));
			this.field1526[var1].method8685();
		}

		return this.field1526[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lsr;I)V",
		garbageValue = "-618236681"
	)
	void method3027(class469 var1) {
		this.field1527.method8629(var1);
		this.field1533 = true;
		this.field1530 = true;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)Lsr;",
		garbageValue = "-107"
	)
	class469 method3056() {
		return this.field1527;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Lsr;",
		garbageValue = "-986807821"
	)
	class469 method3028() {
		if (this.field1533) {
			this.field1529.method8629(this.method3056());
			if (this.field1522 != null) {
				this.field1529.method8633(this.field1522.method3028());
			}

			this.field1533 = false;
		}

		return this.field1529;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IB)Lsr;",
		garbageValue = "-105"
	)
	public class469 method3060(int var1) {
		if (this.field1530) {
			this.field1531.method8629(this.method3052(var1));
			this.field1531.method8633(this.method3028());
			this.field1530 = false;
		}

		return this.field1531;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "-20472245"
	)
	float[] method3061(int var1) {
		return this.field1535[var1];
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "2027097190"
	)
	float[] method3031(int var1) {
		return this.field1521[var1];
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "-29"
	)
	float[] method3063(int var1) {
		return this.field1534[var1];
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)I",
		garbageValue = "-1081828510"
	)
	public static int method3066(CharSequence var0) {
		return Script.method2242(var0, 10, true);
	}

	@ObfuscatedName("kz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1910155406"
	)
	static final void method3067(int var0) {
		if (var0 >= 0) {
			int var1 = Client.menuArguments1[var0];
			int var2 = Client.menuArguments2[var0];
			int var3 = Client.menuOpcodes[var0];
			int var4 = Client.menuIdentifiers[var0];
			int var5 = Client.menuItemIds[var0];
			String var6 = Client.menuActions[var0];
			String var7 = Client.menuTargets[var0];
			ReflectionCheck.menuAction(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY);
		}
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(
		descriptor = "([Lng;IIIIIIIII)V",
		garbageValue = "-411156538"
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
				if (!var10.isIf3 || !PcmPlayer.isComponentHidden(var10)) {
					if (var10.contentType > 0) {
						GrandExchangeOfferOwnWorldComparator.method1202(var10);
					}

					int var12 = var10.x + var6;
					int var13 = var7 + var10.y;
					int var14 = var10.transparencyTop;
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) {
						if (var1 != -1412584499 && !var10.isScrollBar) {
							ModelData0.field3105 = var0;
							class103.field1354 = var6;
							BoundaryObject.field3111 = var7;
							continue;
						}

						if (Client.isDraggingWidget && Client.field746) {
							var15 = MouseHandler.MouseHandler_x;
							var16 = MouseHandler.MouseHandler_y;
							var15 -= Client.widgetClickX;
							var16 -= Client.widgetClickY;
							if (var15 < Client.field765) {
								var15 = Client.field765;
							}

							if (var15 + var10.width > Client.field765 + Client.clickedWidgetParent.width) {
								var15 = Client.field765 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field774) {
								var16 = Client.field774;
							}

							if (var16 + var10.height > Client.field774 + Client.clickedWidgetParent.height) {
								var16 = Client.field774 + Client.clickedWidgetParent.height - var10.height;
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
								if (class30.clientPreferences.isDisplayingFps()) {
									var13 += 15;
									class141.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1);
									var13 += 15;
									Runtime var41 = Runtime.getRuntime();
									var20 = (int)((var41.totalMemory() - var41.freeMemory()) / 1024L);
									var21 = 16776960;
									if (var20 > 327680 && !Client.isLowDetail) {
										var21 = 16711680;
									}

									class141.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1);
									var13 += 15;
								}
								continue;
							}

							if (var10.contentType == 1337) {
								Client.viewportX = var12;
								Client.viewportY = var13;
								class366.drawEntities(var12, var13, var10.width, var10.height);
								Client.validRootWidgets[var10.rootIndex] = true;
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1338) {
								MouseRecorder.drawMinimap(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1339) {
								GrandExchangeOfferNameComparator.method7261(var10, var12, var13, var11);
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
								continue;
							}

							if (var10.contentType == 1400) {
								Tiles.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle, class30.clientPreferences.getBrightness());
							}

							if (var10.contentType == 1401) {
								Tiles.worldMap.drawOverview(var12, var13, var10.width, var10.height);
							}

							if (var10.contentType == 1402) {
								class325.loginScreenRunesAnimation.draw(var12, Client.cycle);
							}
						}

						if (var10.type == 0) {
							if (!var10.isIf3 && PcmPlayer.isComponentHidden(var10) && var10 != class134.mousedOverWidgetIf1) {
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
								class228.drawWidgets(var28.group, var15, var16, var17, var18, var12, var13, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						} else if (var10.type == 11) {
							if (PcmPlayer.isComponentHidden(var10) && var10 != class134.mousedOverWidgetIf1) {
								continue;
							}

							if (var10.children != null) {
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5);
							Rasterizer3D.resetRasterClipping();
						}

						if (Client.isResizable || Client.field570[var11] || Client.gameDrawingMode > 1) {
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) {
								PlayerCompositionColorTextureOverride.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) {
								if (var10.type == 3) {
									if (class341.runCs1(var10)) {
										var19 = var10.color2;
										if (var10 == class134.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color;
										if (var10 == class134.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) {
										switch(var10.fillMode.field5286) {
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
									Font var40 = var10.getFont(ArchiveLoader.widgetDefinition);
									if (var40 == null) {
										if (Widget.field3722) {
											UserComparator5.invalidateWidget(var10);
										}
									} else {
										String var42 = var10.text;
										if (class341.runCs1(var10)) {
											var20 = var10.color2;
											if (var10 == class134.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) {
												var20 = var10.mouseOverColor2;
											}

											if (var10.text2.length() > 0) {
												var42 = var10.text2;
											}
										} else {
											var20 = var10.color;
											if (var10 == class134.mousedOverWidgetIf1 && var10.mouseOverColor != 0) {
												var20 = var10.mouseOverColor;
											}
										}

										if (var10.isIf3 && var10.itemId != -1) {
											ItemComposition var43 = ArchiveDiskActionHandler.ItemDefinition_get(var10.itemId);
											var42 = var43.name;
											if (var42 == null) {
												var42 = "null";
											}

											if ((var43.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) {
												var42 = class370.colorStartTag(16748608) + var42 + "</col>" + " " + 'x' + UserComparator6.formatItemStacks(var10.itemQuantity);
											}
										}

										if (var10 == Client.meslayerContinueWidget) {
											var42 = "Please wait...";
											var20 = var10.color;
										}

										if (!var10.isIf3) {
											var42 = class13.method155(var42, var10);
										}

										var40.drawWidgetText(var42, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, class485.method8809(var10.transparencyTop), var10.textXAlignment, var10.textYAlignment, var10.textLineHeight);
									}
								} else {
									int var23;
									int var24;
									int var25;
									if (var10.type == 5) {
										SpritePixels var38;
										if (!var10.isIf3) {
											var38 = var10.getSprite(ArchiveLoader.widgetDefinition, class341.runCs1(var10), InvDefinition.urlRequester);
											if (var38 != null) {
												var38.drawTransBgAt(var12, var13);
											} else if (Widget.field3722) {
												UserComparator5.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) {
												var38 = class102.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var38 = var10.getSprite(ArchiveLoader.widgetDefinition, false, InvDefinition.urlRequester);
											}

											if (var38 == null) {
												if (Widget.field3722) {
													UserComparator5.invalidateWidget(var10);
												}
											} else {
												var20 = var38.width;
												var21 = var38.height;
												if (!var10.spriteTiling) {
													var22 = var10.width * 4096 / var20;
													if (var10.spriteAngle != 0) {
														var38.method9929(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) {
														var38.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) {
														var38.drawTransBgAt(var12, var13);
													} else {
														var38.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height);
													var22 = (var20 - 1 + var10.width) / var20;
													var23 = (var21 - 1 + var10.height) / var21;

													for (var24 = 0; var24 < var22; ++var24) {
														for (var25 = 0; var25 < var23; ++var25) {
															if (var10.spriteAngle != 0) {
																var38.method9929(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) {
																var38.drawTransAt(var12 + var24 * var20, var13 + var21 * var25, 256 - (var14 & 255));
															} else {
																var38.drawTransBgAt(var12 + var24 * var20, var13 + var25 * var21);
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
											boolean var36 = class341.runCs1(var10);
											if (var36) {
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId;
											}

											Model var39 = null;
											var22 = 0;
											if (var10.itemId != -1) {
												ItemComposition var44 = ArchiveDiskActionHandler.ItemDefinition_get(var10.itemId);
												if (var44 != null) {
													var44 = var44.getCountObj(var10.itemQuantity);
													var39 = var44.getModel(1);
													if (var39 != null) {
														var39.calculateBoundsCylinder();
														var22 = var39.height / 2;
													} else {
														UserComparator5.invalidateWidget(var10);
													}
												}
											} else if (var10.modelType == 5) {
												if (var10.modelId == 0) {
													var39 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var39 = VarpDefinition.localPlayer.getModel();
												}
											} else if (var10.modelType == 7) {
												var39 = var10.field3774.getModel((SequenceDefinition)null, -1, MilliClock.SequenceDefinition_get(VarpDefinition.localPlayer.idleSequence), VarpDefinition.localPlayer.movementFrame);
											} else {
												NPCComposition var45 = null;
												NpcOverrides var33 = null;
												if (var10.modelType == 6) {
													var25 = var10.modelId;
													if (var25 >= 0 && var25 < Client.npcs.length) {
														NPC var34 = Client.npcs[var25];
														if (var34 != null) {
															var45 = var34.definition;
															var33 = var34.method2669();
														}
													}
												}

												SequenceDefinition var35 = null;
												var26 = -1;
												if (var20 != -1) {
													var35 = MilliClock.SequenceDefinition_get(var20);
													var26 = var10.modelFrame;
												}

												var39 = var10.getModel(ArchiveLoader.widgetDefinition, var35, var26, var36, VarpDefinition.localPlayer.appearance, var45, var33);
												if (var39 == null && Widget.field3722) {
													UserComparator5.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method5277(var10.width / 2 + var12, var10.height / 2 + var13);
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16;
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16;
											if (var39 != null) {
												if (!var10.isIf3) {
													var39.drawFrustum(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var39.calculateBoundsCylinder();
													if (var10.modelOrthog) {
														var39.method5708(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var39.drawFrustum(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var22 + var23 + var10.modelOffsetY, var24 + var10.modelOffsetY);
													}
												}
											}

											Rasterizer3D.method5294();
										} else {
											Font var29;
											if (var10.type == 8 && var10 == FontName.field5062 && Client.field690 == Client.field689) {
												var19 = 0;
												var20 = 0;
												var29 = class141.fontPlain12;
												String var30 = var10.text;

												String var31;
												for (var30 = class13.method155(var30, var10); var30.length() > 0; var20 = var20 + var29.ascent + 1) {
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

												for (var30 = class13.method155(var30, var10); var30.length() > 0; var26 = var26 + var29.ascent + 1) {
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
												if (var10.field3759) {
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
													MusicPatchNode.method6381(var19, var20, var21, var22, var10.color, var10.lineWid);
												}
											} else if (var10.type == 12) {
												class347 var37 = var10.method6806();
												class341 var32 = var10.method6823();
												if (var37 != null && var32 != null && var37.method6562()) {
													var29 = var10.getFont(ArchiveLoader.widgetDefinition);
													if (var29 != null) {
														Client.field740.method10058(var12, var13, var10.width, var10.height, var37.method6507(), var37.method6564(), var37.method6560(), var37.method6561(), var37.method6559());
														var22 = var10.textShadowed ? var10.spriteShadow : -1;
														if (!var37.method6557() && var37.method6515().method7778()) {
															Client.field740.method10059(var32.field3640, var22, var32.field3643, var32.field3639);
															Client.field740.method10060(var37.method6711(), var29);
														} else {
															Client.field740.method10059(var10.color, var22, var32.field3643, var32.field3639);
															Client.field740.method10060(var37.method6515(), var29);
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
