import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bl")
@Implements("GraphicsObject")
public class GraphicsObject extends Renderable {
	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -1396295767
	)
	@Export("id")
	int id;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -174921571
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1981332617
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1355055153
	)
	@Export("x")
	int x;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 796463135
	)
	@Export("y")
	int y;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 544777389
	)
	@Export("z")
	int z;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lgd;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -632364321
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -1477863113
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("x")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0; // L: 16
		this.frameCycle = 0; // L: 17
		this.isFinished = false; // L: 18
		this.id = var1; // L: 21
		this.plane = var2; // L: 22
		this.x = var3; // L: 23
		this.y = var4; // L: 24
		this.z = var5; // L: 25
		this.cycleStart = var7 + var6; // L: 26
		int var8 = class308.SpotAnimationDefinition_get(this.id).sequence; // L: 27
		if (var8 != -1) { // L: 28
			this.isFinished = false; // L: 29
			this.sequenceDefinition = class4.SequenceDefinition_get(var8); // L: 30
		} else {
			this.isFinished = true; // L: 32
		}

	} // L: 33

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1650809364"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) { // L: 36
			this.frameCycle += var1; // L: 37
			if (!this.sequenceDefinition.isCachedModelIdSet()) { // L: 38
				while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) { // L: 39
					this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame]; // L: 40
					++this.frame; // L: 41
					if (this.frame >= this.sequenceDefinition.frameIds.length) { // L: 42
						this.isFinished = true; // L: 43
						break;
					}
				}
			} else {
				this.frame += var1; // L: 49
				if (this.frame >= this.sequenceDefinition.method3950()) { // L: 50
					this.isFinished = true;
				}
			}

		}
	} // L: 52

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(B)Lha;",
		garbageValue = "13"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = class308.SpotAnimationDefinition_get(this.id); // L: 55
		Model var2;
		if (!this.isFinished) { // L: 57
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1); // L: 58
		}

		return var2 == null ? null : var2; // L: 59
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(I)[Lqu;",
		garbageValue = "-1998762111"
	)
	static IndexedSprite[] method2018() {
		IndexedSprite[] var0 = new IndexedSprite[class458.SpriteBuffer_spriteCount]; // L: 107

		for (int var1 = 0; var1 < class458.SpriteBuffer_spriteCount; ++var1) { // L: 108
			IndexedSprite var2 = var0[var1] = new IndexedSprite(); // L: 109
			var2.width = SecureRandomCallable.SpriteBuffer_spriteWidth; // L: 110
			var2.height = class402.SpriteBuffer_spriteHeight; // L: 111
			var2.xOffset = class458.SpriteBuffer_xOffsets[var1]; // L: 112
			var2.yOffset = class458.SpriteBuffer_yOffsets[var1]; // L: 113
			var2.subWidth = ApproximateRouteStrategy.SpriteBuffer_spriteWidths[var1]; // L: 114
			var2.subHeight = UserComparator9.SpriteBuffer_spriteHeights[var1]; // L: 115
			var2.palette = class458.SpriteBuffer_spritePalette; // L: 116
			var2.pixels = FileSystem.SpriteBuffer_pixels[var1]; // L: 117
		}

		class458.SpriteBuffer_xOffsets = null; // L: 120
		class458.SpriteBuffer_yOffsets = null; // L: 121
		ApproximateRouteStrategy.SpriteBuffer_spriteWidths = null; // L: 122
		UserComparator9.SpriteBuffer_spriteHeights = null; // L: 123
		class458.SpriteBuffer_spritePalette = null; // L: 124
		FileSystem.SpriteBuffer_pixels = null; // L: 125
		return var0; // L: 127
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "([Lkw;IIIIIIIII)V",
		garbageValue = "1037960286"
	)
	@Export("drawInterface")
	static final void drawInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9781
		Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9782

		for (int var9 = 0; var9 < var0.length; ++var9) { // L: 9783
			Widget var10 = var0[var9]; // L: 9784
			if (var10 != null && (var10.parentId == var1 || var1 == -1412584499 && var10 == Client.clickedWidget)) { // L: 9785 9786
				int var11;
				if (var8 == -1) { // L: 9788
					Client.rootWidgetXs[Client.rootWidgetCount] = var10.x + var6; // L: 9789
					Client.rootWidgetYs[Client.rootWidgetCount] = var7 + var10.y; // L: 9790
					Client.rootWidgetWidths[Client.rootWidgetCount] = var10.width; // L: 9791
					Client.rootWidgetHeights[Client.rootWidgetCount] = var10.height; // L: 9792
					var11 = ++Client.rootWidgetCount - 1; // L: 9793
				} else {
					var11 = var8; // L: 9795
				}

				var10.rootIndex = var11; // L: 9796
				var10.cycle = Client.cycle; // L: 9797
				if (!var10.isIf3 || !class11.isComponentHidden(var10)) { // L: 9798
					if (var10.contentType > 0) { // L: 9799
						ScriptFrame.method1134(var10);
					}

					int var12 = var10.x + var6; // L: 9800
					int var13 = var7 + var10.y; // L: 9801
					int var14 = var10.transparencyTop; // L: 9802
					int var15;
					int var16;
					if (var10 == Client.clickedWidget) { // L: 9803
						if (var1 != -1412584499 && !var10.isScrollBar) { // L: 9804
							BoundaryObject.field2663 = var0; // L: 9805
							MouseHandler.field240 = var6; // L: 9806
							Tile.field2344 = var7; // L: 9807
							continue; // L: 9808
						}

						if (Client.isDraggingWidget && Client.field683) { // L: 9810
							var15 = MouseHandler.MouseHandler_x; // L: 9811
							var16 = MouseHandler.MouseHandler_y; // L: 9812
							var15 -= Client.widgetClickX; // L: 9813
							var16 -= Client.widgetClickY; // L: 9814
							if (var15 < Client.field783) { // L: 9815
								var15 = Client.field783;
							}

							if (var15 + var10.width > Client.field783 + Client.clickedWidgetParent.width) { // L: 9816
								var15 = Client.field783 + Client.clickedWidgetParent.width - var10.width;
							}

							if (var16 < Client.field744) { // L: 9817
								var16 = Client.field744;
							}

							if (var16 + var10.height > Client.field744 + Client.clickedWidgetParent.height) { // L: 9818
								var16 = Client.field744 + Client.clickedWidgetParent.height - var10.height;
							}

							var12 = var15; // L: 9819
							var13 = var16; // L: 9820
						}

						if (!var10.isScrollBar) { // L: 9822
							var14 = 128;
						}
					}

					int var17;
					int var18;
					int var19;
					int var20;
					int var21;
					int var22;
					if (var10.type == 2) { // L: 9828
						var15 = var2; // L: 9829
						var16 = var3; // L: 9830
						var17 = var4; // L: 9831
						var18 = var5; // L: 9832
					} else if (var10.type == 9) { // L: 9834
						var19 = var12; // L: 9835
						var20 = var13; // L: 9836
						var21 = var12 + var10.width; // L: 9837
						var22 = var13 + var10.height; // L: 9838
						if (var21 < var12) { // L: 9839
							var19 = var21; // L: 9841
							var21 = var12; // L: 9842
						}

						if (var22 < var13) { // L: 9844
							var20 = var22; // L: 9846
							var22 = var13; // L: 9847
						}

						++var21; // L: 9849
						++var22; // L: 9850
						var15 = var19 > var2 ? var19 : var2; // L: 9851
						var16 = var20 > var3 ? var20 : var3; // L: 9852
						var17 = var21 < var4 ? var21 : var4; // L: 9853
						var18 = var22 < var5 ? var22 : var5; // L: 9854
					} else {
						var19 = var12 + var10.width; // L: 9857
						var20 = var13 + var10.height; // L: 9858
						var15 = var12 > var2 ? var12 : var2; // L: 9859
						var16 = var13 > var3 ? var13 : var3; // L: 9860
						var17 = var19 < var4 ? var19 : var4; // L: 9861
						var18 = var20 < var5 ? var20 : var5; // L: 9862
					}

					if (!var10.isIf3 || var15 < var17 && var16 < var18) { // L: 9864
						if (var10.contentType != 0) { // L: 9865
							if (var10.contentType == 1336) { // L: 9866
								if (Player.clientPreferences.method2396()) { // L: 9867
									var13 += 15; // L: 9868
									class1.fontPlain12.drawRightAligned("Fps:" + GameEngine.fps, var12 + var10.width, var13, 16776960, -1); // L: 9869
									var13 += 15; // L: 9870
									Runtime var42 = Runtime.getRuntime(); // L: 9871
									var20 = (int)((var42.totalMemory() - var42.freeMemory()) / 1024L); // L: 9872
									var21 = 16776960; // L: 9873
									if (var20 > 327680 && !Client.isLowDetail) { // L: 9874
										var21 = 16711680;
									}

									class1.fontPlain12.drawRightAligned("Mem:" + var20 + "k", var12 + var10.width, var13, var21, -1); // L: 9875
									var13 += 15; // L: 9876
								}
								continue;
							}

							if (var10.contentType == 1337) { // L: 9880
								Client.viewportX = var12; // L: 9881
								Client.viewportY = var13; // L: 9882
								ClientPreferences.drawEntities(var12, var13, var10.width, var10.height); // L: 9883
								Client.field714[var10.rootIndex] = true; // L: 9884
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9885
								continue; // L: 9886
							}

							if (var10.contentType == 1338) { // L: 9888
								class21.drawMinimap(var10, var12, var13, var11); // L: 9889
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9890
								continue; // L: 9891
							}

							if (var10.contentType == 1339) { // L: 9893
								class21.drawCompass(var10, var12, var13, var11); // L: 9894
								Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9895
								continue; // L: 9896
							}

							if (var10.contentType == 1400) { // L: 9898
								Decimator.worldMap.draw(var12, var13, var10.width, var10.height, Client.cycle); // L: 9899
							}

							if (var10.contentType == 1401) { // L: 9901
								Decimator.worldMap.drawOverview(var12, var13, var10.width, var10.height); // L: 9902
							}

							if (var10.contentType == 1402) { // L: 9904
								VertexNormal.loginScreenRunesAnimation.draw(var12, Client.cycle); // L: 9905
							}
						}

						if (var10.type == 0) { // L: 9908
							if (!var10.isIf3 && class11.isComponentHidden(var10) && var10 != class148.mousedOverWidgetIf1) { // L: 9909
								continue;
							}

							if (!var10.isIf3) { // L: 9910
								if (var10.scrollY > var10.scrollHeight - var10.height) { // L: 9911
									var10.scrollY = var10.scrollHeight - var10.height;
								}

								if (var10.scrollY < 0) { // L: 9912
									var10.scrollY = 0;
								}
							}

							drawInterface(var0, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11); // L: 9914
							if (var10.children != null) { // L: 9915
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							InterfaceParent var30 = (InterfaceParent)Client.interfaceParents.get((long)var10.id); // L: 9916
							if (var30 != null) { // L: 9917
								class193.drawWidgets(var30.group, var15, var16, var17, var18, var12, var13, var11); // L: 9918
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9920
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9921
						} else if (var10.type == 11) { // L: 9923
							if (class11.isComponentHidden(var10) && var10 != class148.mousedOverWidgetIf1) { // L: 9924
								continue;
							}

							if (var10.children != null) { // L: 9925
								drawInterface(var10.children, var10.id, var15, var16, var17, var18, var12 - var10.scrollX, var13 - var10.scrollY, var11);
							}

							Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 9926
							Rasterizer3D.Rasterizer3D_setClipFromRasterizer2D(); // L: 9927
						}

						if (Client.isResizable || Client.field671[var11] || Client.gameDrawingMode > 1) { // L: 9929
							if (var10.type == 0 && !var10.isIf3 && var10.scrollHeight > var10.height) { // L: 9930 9931
								class272.drawScrollBar(var12 + var10.width, var13, var10.scrollY, var10.height, var10.scrollHeight);
							}

							if (var10.type != 1) { // L: 9933
								int var23;
								int var24;
								int var25;
								int var26;
								if (var10.type == 2) { // L: 9936
									var19 = 0; // L: 9937

									for (var20 = 0; var20 < var10.rawHeight; ++var20) { // L: 9938
										for (var21 = 0; var21 < var10.rawWidth; ++var21) { // L: 9939
											var22 = var21 * (var10.paddingX + 32) + var12; // L: 9940
											var23 = var20 * (var10.paddingY + 32) + var13; // L: 9941
											if (var19 < 20) { // L: 9942
												var22 += var10.inventoryXOffsets[var19]; // L: 9943
												var23 += var10.inventoryYOffsets[var19]; // L: 9944
											}

											if (var10.itemIds[var19] <= 0) { // L: 9946
												if (var10.inventorySprites != null && var19 < 20) { // L: 9991
													SpritePixels var46 = var10.getInventorySprite(var19); // L: 9992
													if (var46 != null) { // L: 9993
														var46.drawTransBgAt(var22, var23);
													} else if (Widget.field3392) { // L: 9994
														class403.invalidateWidget(var10);
													}
												}
											} else {
												boolean var37 = false; // L: 9947
												boolean var38 = false; // L: 9948
												var26 = var10.itemIds[var19] - 1; // L: 9949
												if (var22 + 32 > var2 && var22 < var4 && var23 + 32 > var3 && var23 < var5 || var10 == User.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9950
													SpritePixels var35;
													if (Client.isItemSelected == 1 && var19 == ApproximateRouteStrategy.selectedItemSlot && var10.id == GameObject.selectedItemWidget) { // L: 9952
														var35 = class28.getItemSprite(var26, var10.itemQuantities[var19], 2, 0, 2, false);
													} else {
														var35 = class28.getItemSprite(var26, var10.itemQuantities[var19], 1, 3153952, 2, false); // L: 9953
													}

													if (var35 != null) { // L: 9954
														if (var10 == User.dragInventoryWidget && var19 == Client.dragItemSlotSource) { // L: 9955
															var24 = MouseHandler.MouseHandler_x - Client.draggedWidgetX; // L: 9956
															var25 = MouseHandler.MouseHandler_y - Client.draggedWidgetY; // L: 9957
															if (var24 < 5 && var24 > -5) { // L: 9958
																var24 = 0;
															}

															if (var25 < 5 && var25 > -5) { // L: 9959
																var25 = 0;
															}

															if (Client.itemDragDuration < 5) { // L: 9960
																var24 = 0; // L: 9961
																var25 = 0; // L: 9962
															}

															var35.drawTransAt(var22 + var24, var23 + var25, 128); // L: 9964
															if (var1 != -1) { // L: 9965
																Widget var28 = var0[var1 & 65535]; // L: 9966
																int var29;
																if (var23 + var25 < Rasterizer2D.Rasterizer2D_yClipStart && var28.scrollY > 0) { // L: 9967
																	var29 = (Rasterizer2D.Rasterizer2D_yClipStart - var23 - var25) * Client.field743 / 3; // L: 9968
																	if (var29 > Client.field743 * 10) { // L: 9969
																		var29 = Client.field743 * 10;
																	}

																	if (var29 > var28.scrollY) { // L: 9970
																		var29 = var28.scrollY;
																	}

																	var28.scrollY -= var29; // L: 9971
																	Client.draggedWidgetY += var29; // L: 9972
																	class403.invalidateWidget(var28); // L: 9973
																}

																if (var25 + var23 + 32 > Rasterizer2D.Rasterizer2D_yClipEnd && var28.scrollY < var28.scrollHeight - var28.height) { // L: 9975
																	var29 = (var23 + var25 + 32 - Rasterizer2D.Rasterizer2D_yClipEnd) * Client.field743 / 3; // L: 9976
																	if (var29 > Client.field743 * 10) { // L: 9977
																		var29 = Client.field743 * 10;
																	}

																	if (var29 > var28.scrollHeight - var28.height - var28.scrollY) { // L: 9978
																		var29 = var28.scrollHeight - var28.height - var28.scrollY;
																	}

																	var28.scrollY += var29; // L: 9979
																	Client.draggedWidgetY -= var29; // L: 9980
																	class403.invalidateWidget(var28); // L: 9981
																}
															}
														} else if (var10 == DevicePcmPlayerProvider.field153 && var19 == Client.field635) { // L: 9985
															var35.drawTransAt(var22, var23, 128);
														} else {
															var35.drawTransBgAt(var22, var23); // L: 9986
														}
													} else {
														class403.invalidateWidget(var10); // L: 9988
													}
												}
											}

											++var19; // L: 9996
										}
									}
								} else if (var10.type == 3) { // L: 10001
									if (class264.runCs1(var10)) { // L: 10003
										var19 = var10.color2; // L: 10004
										if (var10 == class148.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10005
											var19 = var10.mouseOverColor2;
										}
									} else {
										var19 = var10.color; // L: 10008
										if (var10 == class148.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10009
											var19 = var10.mouseOverColor;
										}
									}

									if (var10.fill) { // L: 10011
										switch(var10.fillMode.field4812) { // L: 10012
										case 1:
											Rasterizer2D.Rasterizer2D_fillRectangleGradient(var12, var13, var10.width, var10.height, var10.color, var10.color2); // L: 10014
											break; // L: 10015
										case 2:
											Rasterizer2D.Rasterizer2D_fillRectangleGradientAlpha(var12, var13, var10.width, var10.height, var10.color, var10.color2, 255 - (var10.transparencyTop & 255), 255 - (var10.transparencyBot & 255)); // L: 10017
											break; // L: 10018
										default:
											if (var14 == 0) { // L: 10020
												Rasterizer2D.Rasterizer2D_fillRectangle(var12, var13, var10.width, var10.height, var19);
											} else {
												Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10021
											}
										}
									} else if (var14 == 0) { // L: 10026
										Rasterizer2D.Rasterizer2D_drawRectangle(var12, var13, var10.width, var10.height, var19);
									} else {
										Rasterizer2D.Rasterizer2D_drawRectangleAlpha(var12, var13, var10.width, var10.height, var19, 256 - (var14 & 255)); // L: 10027
									}
								} else {
									Font var39;
									if (var10.type == 4) { // L: 10031
										var39 = var10.getFont(); // L: 10032
										if (var39 == null) { // L: 10033
											if (Widget.field3392) { // L: 10034
												class403.invalidateWidget(var10);
											}
										} else {
											String var44 = var10.text; // L: 10038
											if (class264.runCs1(var10)) { // L: 10039
												var20 = var10.color2; // L: 10040
												if (var10 == class148.mousedOverWidgetIf1 && var10.mouseOverColor2 != 0) { // L: 10041
													var20 = var10.mouseOverColor2;
												}

												if (var10.text2.length() > 0) { // L: 10042
													var44 = var10.text2;
												}
											} else {
												var20 = var10.color; // L: 10045
												if (var10 == class148.mousedOverWidgetIf1 && var10.mouseOverColor != 0) { // L: 10046
													var20 = var10.mouseOverColor;
												}
											}

											if (var10.isIf3 && var10.itemId != -1) { // L: 10048
												ItemComposition var45 = UserComparator3.ItemDefinition_get(var10.itemId); // L: 10049
												var44 = var45.name; // L: 10050
												if (var44 == null) { // L: 10051
													var44 = "null";
												}

												if ((var45.isStackable == 1 || var10.itemQuantity != 1) && var10.itemQuantity != -1) { // L: 10052
													var44 = SoundCache.colorStartTag(16748608) + var44 + "</col>" + " " + 'x' + ArchiveDiskAction.formatItemStacks(var10.itemQuantity);
												}
											}

											if (var10 == Client.meslayerContinueWidget) { // L: 10054
												var44 = "Please wait..."; // L: 10055
												var20 = var10.color; // L: 10056
											}

											if (!var10.isIf3) { // L: 10058
												var44 = class11.method112(var44, var10);
											}

											var39.drawLines(var44, var12, var13, var10.width, var10.height, var20, var10.textShadowed ? 0 : -1, var10.textXAlignment, var10.textYAlignment, var10.textLineHeight); // L: 10059
										}
									} else if (var10.type == 5) { // L: 10062
										SpritePixels var40;
										if (!var10.isIf3) { // L: 10063
											var40 = var10.getSprite(class264.runCs1(var10), Messages.urlRequester); // L: 10064
											if (var40 != null) { // L: 10065
												var40.drawTransBgAt(var12, var13);
											} else if (Widget.field3392) { // L: 10066
												class403.invalidateWidget(var10);
											}
										} else {
											if (var10.itemId != -1) { // L: 10070
												var40 = class28.getItemSprite(var10.itemId, var10.itemQuantity, var10.outline, var10.spriteShadow, var10.itemQuantityMode, false);
											} else {
												var40 = var10.getSprite(false, Messages.urlRequester); // L: 10071
											}

											if (var40 == null) { // L: 10072
												if (Widget.field3392) { // L: 10096
													class403.invalidateWidget(var10);
												}
											} else {
												var20 = var40.width; // L: 10073
												var21 = var40.height; // L: 10074
												if (!var10.spriteTiling) { // L: 10075
													var22 = var10.width * 4096 / var20; // L: 10089
													if (var10.spriteAngle != 0) { // L: 10090
														var40.method8450(var10.width / 2 + var12, var10.height / 2 + var13, var10.spriteAngle, var22);
													} else if (var14 != 0) { // L: 10091
														var40.drawTransScaledAt(var12, var13, var10.width, var10.height, 256 - (var14 & 255));
													} else if (var20 == var10.width && var21 == var10.height) { // L: 10092
														var40.drawTransBgAt(var12, var13); // L: 10093
													} else {
														var40.drawScaledAt(var12, var13, var10.width, var10.height);
													}
												} else {
													Rasterizer2D.Rasterizer2D_expandClip(var12, var13, var12 + var10.width, var13 + var10.height); // L: 10076
													var22 = (var20 - 1 + var10.width) / var20; // L: 10077
													var23 = (var21 - 1 + var10.height) / var21; // L: 10078

													for (var24 = 0; var24 < var22; ++var24) { // L: 10079
														for (var25 = 0; var25 < var23; ++var25) { // L: 10080
															if (var10.spriteAngle != 0) { // L: 10081
																var40.method8450(var20 / 2 + var12 + var24 * var20, var21 / 2 + var13 + var21 * var25, var10.spriteAngle, 4096);
															} else if (var14 != 0) { // L: 10082
																var40.drawTransAt(var12 + var20 * var24, var13 + var25 * var21, 256 - (var14 & 255));
															} else {
																var40.drawTransBgAt(var12 + var20 * var24, var13 + var21 * var25); // L: 10083
															}
														}
													}

													Rasterizer2D.Rasterizer2D_setClip(var2, var3, var4, var5); // L: 10086
												}
											}
										}
									} else {
										ItemComposition var33;
										if (var10.type == 6) { // L: 10100
											boolean var36 = class264.runCs1(var10); // L: 10101
											if (var36) { // L: 10103
												var20 = var10.sequenceId2;
											} else {
												var20 = var10.sequenceId; // L: 10104
											}

											Model var41 = null; // L: 10105
											var22 = 0; // L: 10106
											if (var10.itemId != -1) { // L: 10107
												var33 = UserComparator3.ItemDefinition_get(var10.itemId); // L: 10108
												if (var33 != null) { // L: 10109
													var33 = var33.getCountObj(var10.itemQuantity); // L: 10110
													var41 = var33.getModel(1); // L: 10111
													if (var41 != null) { // L: 10112
														var41.calculateBoundsCylinder(); // L: 10113
														var22 = var41.height / 2; // L: 10114
													} else {
														class403.invalidateWidget(var10); // L: 10116
													}
												}
											} else if (var10.modelType == 5) { // L: 10119
												if (var10.modelId == 0) { // L: 10120
													var41 = Client.playerAppearance.getModel((SequenceDefinition)null, -1, (SequenceDefinition)null, -1);
												} else {
													var41 = class67.localPlayer.getModel(); // L: 10121
												}
											} else if (var20 == -1) { // L: 10123
												var41 = var10.getModel((SequenceDefinition)null, -1, var36, class67.localPlayer.appearance); // L: 10124
												if (var41 == null && Widget.field3392) { // L: 10125
													class403.invalidateWidget(var10);
												}
											} else {
												SequenceDefinition var47 = class4.SequenceDefinition_get(var20); // L: 10128
												var41 = var10.getModel(var47, var10.modelFrame, var36, class67.localPlayer.appearance); // L: 10129
												if (var41 == null && Widget.field3392) { // L: 10130
													class403.invalidateWidget(var10);
												}
											}

											Rasterizer3D.method4198(var10.width / 2 + var12, var10.height / 2 + var13); // L: 10132
											var23 = Rasterizer3D.Rasterizer3D_sine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10133
											var24 = Rasterizer3D.Rasterizer3D_cosine[var10.modelAngleX] * var10.modelZoom >> 16; // L: 10134
											if (var41 != null) { // L: 10135
												if (!var10.isIf3) { // L: 10136
													var41.method4530(0, var10.modelAngleY, 0, var10.modelAngleX, 0, var23, var24);
												} else {
													var41.calculateBoundsCylinder(); // L: 10138
													if (var10.modelOrthog) { // L: 10139
														var41.method4600(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY, var10.modelZoom);
													} else {
														var41.method4530(0, var10.modelAngleY, var10.modelAngleZ, var10.modelAngleX, var10.modelOffsetX, var23 + var22 + var10.modelOffsetY, var24 + var10.modelOffsetY); // L: 10140
													}
												}
											}

											Rasterizer3D.Rasterizer3D_method3(); // L: 10143
										} else {
											if (var10.type == 7) { // L: 10146
												var39 = var10.getFont(); // L: 10147
												if (var39 == null) { // L: 10148
													if (Widget.field3392) { // L: 10149
														class403.invalidateWidget(var10);
													}
													continue;
												}

												var20 = 0; // L: 10152

												for (var21 = 0; var21 < var10.rawHeight; ++var21) { // L: 10153
													for (var22 = 0; var22 < var10.rawWidth; ++var22) { // L: 10154
														if (var10.itemIds[var20] > 0) { // L: 10155
															var33 = UserComparator3.ItemDefinition_get(var10.itemIds[var20] - 1); // L: 10156
															String var34;
															if (var33.isStackable != 1 && var10.itemQuantities[var20] == 1) { // L: 10158
																var34 = SoundCache.colorStartTag(16748608) + var33.name + "</col>"; // L: 10159
															} else {
																var34 = SoundCache.colorStartTag(16748608) + var33.name + "</col>" + " " + 'x' + ArchiveDiskAction.formatItemStacks(var10.itemQuantities[var20]);
															}

															var25 = var12 + var22 * (var10.paddingX + 115); // L: 10160
															var26 = (var10.paddingY + 12) * var21 + var13; // L: 10161
															if (var10.textXAlignment == 0) { // L: 10162
																var39.draw(var34, var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else if (var10.textXAlignment == 1) { // L: 10163
																var39.drawCentered(var34, var10.width / 2 + var25, var26, var10.color, var10.textShadowed ? 0 : -1);
															} else {
																var39.drawRightAligned(var34, var25 + var10.width - 1, var26, var10.color, var10.textShadowed ? 0 : -1); // L: 10164
															}
														}

														++var20; // L: 10166
													}
												}
											}

											if (var10.type == 8 && var10 == GrandExchangeEvent.field4105 && Client.field560 == Client.field657) { // L: 10170 10171
												var19 = 0; // L: 10172
												var20 = 0; // L: 10173
												Font var31 = class1.fontPlain12; // L: 10174
												String var32 = var10.text; // L: 10175

												String var43;
												for (var32 = class11.method112(var32, var10); var32.length() > 0; var20 = var20 + var31.ascent + 1) { // L: 10177 10178 10190
													var24 = var32.indexOf("<br>"); // L: 10179
													if (var24 != -1) { // L: 10180
														var43 = var32.substring(0, var24); // L: 10181
														var32 = var32.substring(var24 + 4); // L: 10182
													} else {
														var43 = var32; // L: 10185
														var32 = ""; // L: 10186
													}

													var25 = var31.stringWidth(var43); // L: 10188
													if (var25 > var19) { // L: 10189
														var19 = var25;
													}
												}

												var19 += 6; // L: 10192
												var20 += 7; // L: 10193
												var24 = var12 + var10.width - 5 - var19; // L: 10194
												var25 = var13 + var10.height + 5; // L: 10195
												if (var24 < var12 + 5) { // L: 10196
													var24 = var12 + 5;
												}

												if (var24 + var19 > var4) { // L: 10197
													var24 = var4 - var19;
												}

												if (var20 + var25 > var5) { // L: 10198
													var25 = var5 - var20;
												}

												Rasterizer2D.Rasterizer2D_fillRectangle(var24, var25, var19, var20, 16777120); // L: 10199
												Rasterizer2D.Rasterizer2D_drawRectangle(var24, var25, var19, var20, 0); // L: 10200
												var32 = var10.text; // L: 10201
												var26 = var25 + var31.ascent + 2; // L: 10202

												for (var32 = class11.method112(var32, var10); var32.length() > 0; var26 = var26 + var31.ascent + 1) { // L: 10203 10204 10215
													int var27 = var32.indexOf("<br>"); // L: 10205
													if (var27 != -1) { // L: 10206
														var43 = var32.substring(0, var27); // L: 10207
														var32 = var32.substring(var27 + 4); // L: 10208
													} else {
														var43 = var32; // L: 10211
														var32 = ""; // L: 10212
													}

													var31.draw(var43, var24 + 3, var26, 0, -1); // L: 10214
												}
											}

											if (var10.type == 9) { // L: 10219
												if (var10.field3434) { // L: 10224
													var19 = var12; // L: 10225
													var20 = var13 + var10.height; // L: 10226
													var21 = var12 + var10.width; // L: 10227
													var22 = var13; // L: 10228
												} else {
													var19 = var12; // L: 10231
													var20 = var13; // L: 10232
													var21 = var12 + var10.width; // L: 10233
													var22 = var13 + var10.height; // L: 10234
												}

												if (var10.lineWid == 1) { // L: 10236
													Rasterizer2D.Rasterizer2D_drawLine(var19, var20, var21, var22, var10.color); // L: 10237
												} else {
													class21.method321(var19, var20, var21, var22, var10.color, var10.lineWid); // L: 10240
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

	} // L: 10245

	public GraphicsObject() {
	}
}
