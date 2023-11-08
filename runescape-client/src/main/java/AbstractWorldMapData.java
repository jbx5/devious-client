import java.util.LinkedList;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jm")
@Implements("AbstractWorldMapData")
public abstract class AbstractWorldMapData {
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -1924120576
	)
	static int field2575;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -779595776
	)
	@Export("regionXLow")
	int regionXLow;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1345736704
	)
	@Export("regionYLow")
	int regionYLow;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1733375591
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1535123345
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1960357167
	)
	@Export("minPlane")
	int minPlane;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -459409055
	)
	@Export("planes")
	int planes;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1748298895
	)
	@Export("groupId")
	int groupId;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 611955849
	)
	@Export("fileId")
	int fileId;
	@ObfuscatedName("ax")
	@Export("floorUnderlayIds")
	short[][][] floorUnderlayIds;
	@ObfuscatedName("as")
	@Export("floorOverlayIds")
	short[][][] floorOverlayIds;
	@ObfuscatedName("ay")
	byte[][][] field2560;
	@ObfuscatedName("ak")
	byte[][][] field2571;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "[[[[Ljs;"
	)
	@Export("decorations")
	WorldMapDecoration[][][][] decorations;
	@ObfuscatedName("am")
	boolean field2573;
	@ObfuscatedName("aq")
	boolean field2565;

	AbstractWorldMapData() {
		this.groupId = -1;
		this.fileId = -1;
		new LinkedList();
		this.field2573 = false;
		this.field2565 = false;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Luj;B)V",
		garbageValue = "7"
	)
	@Export("readGeography")
	abstract void readGeography(Buffer var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "153115175"
	)
	@Export("isFullyLoaded")
	boolean isFullyLoaded() {
		return this.field2573 && this.field2565;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lol;I)V",
		garbageValue = "816077843"
	)
	@Export("loadGeography")
	void loadGeography(AbstractArchive var1) {
		if (!this.isFullyLoaded()) {
			byte[] var2 = var1.takeFile(this.groupId, this.fileId);
			if (var2 != null) {
				this.readGeography(new Buffer(var2));
				this.field2573 = true;
				this.field2565 = true;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1929265244"
	)
	@Export("reset")
	void reset() {
		this.floorUnderlayIds = null;
		this.floorOverlayIds = null;
		this.field2560 = null;
		this.field2571 = null;
		this.decorations = null;
		this.field2573 = false;
		this.field2565 = false;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IILuj;I)V",
		garbageValue = "-2036497889"
	)
	@Export("readTile")
	void readTile(int var1, int var2, Buffer var3) {
		int var4 = var3.readUnsignedByte();
		if (var4 != 0) {
			if ((var4 & 1) != 0) {
				this.method4897(var1, var2, var3, var4);
			} else {
				this.method4898(var1, var2, var3, var4);
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IILuj;II)V",
		garbageValue = "-388208328"
	)
	void method4897(int var1, int var2, Buffer var3, int var4) {
		boolean var5 = (var4 & 2) != 0;
		if (var5) {
			this.floorOverlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		}

		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IILuj;II)V",
		garbageValue = "1227555705"
	)
	void method4898(int var1, int var2, Buffer var3, int var4) {
		int var5 = ((var4 & 24) >> 3) + 1;
		boolean var6 = (var4 & 2) != 0;
		boolean var7 = (var4 & 4) != 0;
		this.floorUnderlayIds[0][var1][var2] = (short)var3.readUnsignedShort();
		int var8;
		int var9;
		int var11;
		if (var6) {
			var8 = var3.readUnsignedByte();

			for (var9 = 0; var9 < var8; ++var9) {
				int var14 = var3.readUnsignedShort();
				if (var14 != 0) {
					this.floorOverlayIds[var9][var1][var2] = (short)var14;
					var11 = var3.readUnsignedByte();
					this.field2560[var9][var1][var2] = (byte)(var11 >> 2);
					this.field2571[var9][var1][var2] = (byte)(var11 & 3);
				}
			}
		}

		if (var7) {
			for (var8 = 0; var8 < var5; ++var8) {
				var9 = var3.readUnsignedByte();
				if (var9 != 0) {
					WorldMapDecoration[] var10 = this.decorations[var8][var1][var2] = new WorldMapDecoration[var9];

					for (var11 = 0; var11 < var9; ++var11) {
						int var12 = var3.readNullableLargeSmart();
						int var13 = var3.readUnsignedByte();
						var10[var11] = new WorldMapDecoration(var12, var13 >> 2, var13 & 3);
					}
				}
			}
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "908938497"
	)
	@Export("getRegionX")
	int getRegionX() {
		return this.regionX;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "16"
	)
	@Export("getRegionY")
	int getRegionY() {
		return this.regionY;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(Lnn;II)V",
		garbageValue = "1102490716"
	)
	public static void method4899(Widget var0, int var1) {
		ItemComposition var2 = class214.ItemDefinition_get(var1);
		var0.field3717.equipment[var2.maleModel] = var1 + 512;
		if (var2.maleModel1 != -1) {
			var0.field3717.equipment[var2.maleModel1] = 0;
		}

		if (var2.maleModel2 != -1) {
			var0.field3717.equipment[var2.maleModel2] = 0;
		}

		var0.field3717.method6323();
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "([Lnn;IIIIIIIB)V",
		garbageValue = "-49"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method6708() || class361.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (class11.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != Interpreter.mousedOverWidgetIf1 && class11.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method6675(HealthBarDefinition.widgetDefinition, class60.urlRequester)) {
						if (var9.method6682()) {
							class159.invalidateWidget(var9);
							class132.revalidateWidgetScroll(var9.children, var9, true);
						}

						if (var9.field3783 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3783;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method6693(HealthBarDefinition.widgetDefinition)) {
					class159.invalidateWidget(var9);
				}

				int var26 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var16;
				int var17;
				int var18;
				if (var9.type == 9) {
					var16 = var26;
					var17 = var11;
					var18 = var26 + var9.width;
					int var19 = var11 + var9.height;
					if (var18 < var26) {
						var16 = var18;
						var18 = var26;
					}

					if (var19 < var11) {
						var17 = var19;
						var19 = var11;
					}

					++var18;
					++var19;
					var12 = var16 > var2 ? var16 : var2;
					var13 = var17 > var3 ? var17 : var3;
					var14 = var18 < var4 ? var18 : var4;
					var15 = var19 < var5 ? var19 : var5;
				} else {
					var16 = var26 + var9.width;
					var17 = var11 + var9.height;
					var12 = var26 > var2 ? var26 : var2;
					var13 = var11 > var3 ? var11 : var3;
					var14 = var16 < var4 ? var16 : var4;
					var15 = var17 < var5 ? var17 : var5;
				}

				if (var9 == Client.clickedWidget) {
					Client.field516 = true;
					Client.field533 = var26;
					Client.field679 = var11;
				}

				boolean var34 = false;
				if (var9.field3734) {
					switch(Client.field659) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field660 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field660) {
							var34 = true;
						}
					}
				}

				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
									if (var27.field1054) {
										var27.remove();
										var27.widget.field3797 = false;
									}
								}

								Tile.method5187();
								if (class148.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									UserComparator10.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field1054 && var27.widget.onScroll == var27.args) {
									var27.remove();
								}
							}
						}
					}

					var17 = MouseHandler.MouseHandler_x;
					var18 = MouseHandler.MouseHandler_y;
					if (MouseHandler.MouseHandler_lastButton != 0) {
						var17 = MouseHandler.MouseHandler_lastPressedX;
						var18 = MouseHandler.MouseHandler_lastPressedY;
					}

					boolean var35 = var17 >= var12 && var18 >= var13 && var17 < var14 && var18 < var15;
					if (var9.contentType == 1337) {
						if (!Client.isLoading && !Client.isMenuOpen && var35) {
							PacketBufferNode.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class18.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							NpcOverrides.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								NpcOverrides.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								class93.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3735.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3735[var20] != null) {
									for (var23 = 0; var23 < var9.field3735[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3805 != null) {
											var24 = Client.field724.method4316(var9.field3735[var20][var23]);
										}

										if (class163.method3462(var9.field3735[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3805 != null && var9.field3805[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3704[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field724.method4316(86) && !Client.field724.method4316(82) && !Client.field724.method4316(81)) && ((var33 & 2) == 0 || Client.field724.method4316(86)) && ((var33 & 1) == 0 || Client.field724.method4316(82)) && ((var33 & 4) == 0 || Client.field724.method4316(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										FloorOverlayDefinition.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class53.method1111();
										FadeOutTask.method7830(var9.id, var9.childIndex, WorldMapData_0.Widget_unpackTargetMask(class361.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = class89.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class167.colorStartTag(16777215);
									}

									var23 = var9.field3672[var20];
									if (var9.field3805 == null) {
										var9.field3805 = new int[var9.field3735.length];
									}

									if (var9.field3756 == null) {
										var9.field3756 = new int[var9.field3735.length];
									}

									if (var23 != 0) {
										if (var9.field3805[var20] == 0) {
											var9.field3805[var20] = var23 + Client.cycle + var9.field3756[var20];
										} else {
											var9.field3805[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3805[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3805 != null) {
									var9.field3805[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class19.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								HorizontalAlignment.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method6771()) {
								if (var21) {
									Client.field682.addFirst(new class222(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field682.addFirst(new class222(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								NpcOverrides.worldMap.method8715(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class12.method169(class361.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field674 = true;
								Client.field554 = var26;
								Client.field676 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.field1054 = true;
									var22.widget = var9;
									var22.mouseY = Client.mouseWheelRotation;
									var22.args = var9.onScroll;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.clickedWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if (!var9.field3798 && var21) {
									var9.field3798 = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.field1054 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3798 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1054 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3798 && !var36) {
									var9.field3798 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1054 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var36 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.field1054 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.field3797 && var35) {
									var9.field3797 = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.field1054 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3797 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1054 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3797 && !var35) {
									var9.field3797 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1054 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.scriptEvents2.addFirst(var22);
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3800) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3800 <= 32) {
										label829:
										for (var39 = var9.field3800; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label829;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3800 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field685 > var9.field3801) {
									if (var9.invTransmitTriggers != null && Client.field685 - var9.field3801 <= 32) {
										label805:
										for (var39 = var9.field3801; var39 < Client.field685; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label805;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3801 = Client.field685;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3763) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3763 <= 32) {
										label781:
										for (var39 = var9.field3763; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label781;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3763 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3799 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field747 > var9.field3799 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field692 > var9.field3799 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field693 > var9.field3799 && var9.field3676 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3676;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field588 > var9.field3799 && var9.field3776 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3776;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field551 > var9.field3799 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field782 > var9.field3799 && var9.field3782 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3782;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field697 > var9.field3799 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3799 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field726; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field518[var39];
										var32.keyPressed = Client.field586[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3771 != null) {
									var38 = Client.field724.method4318();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3771;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field3772 != null) {
									var38 = Client.field724.method4319();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3772;
										Client.scriptEvents.addFirst(var31);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (Client.clickedWidget != null || Client.isMenuOpen) {
								continue;
							}

							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									Interpreter.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									Interpreter.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								SwapSongTask.field4539 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								class17.method245(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var29 = (InterfaceParent)Client.interfaceParents.get((long)var9.id);
							if (var29 != null) {
								if (var29.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var30 = (ScriptEvent)Client.scriptEvents.last(); var30 != null; var30 = (ScriptEvent)Client.scriptEvents.previous()) {
										if (var30.field1054) {
											var30.remove();
											var30.widget.field3797 = false;
										}
									}

									if (class148.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										UserComparator10.addCancelMenuEntry();
									}
								}

								class406.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
