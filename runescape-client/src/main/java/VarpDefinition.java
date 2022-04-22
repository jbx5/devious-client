import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
@Implements("VarpDefinition")
public class VarpDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("VarpDefinition_archive")
	public static AbstractArchive VarpDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	-18460315)

	@Export("VarpDefinition_fileCount")
	public static int VarpDefinition_fileCount;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lig;")

	@Export("VarpDefinition_cached")
	public static EvictingDualNodeHashTable VarpDefinition_cached;
	@ObfuscatedName("hx")
	@Export("regionMapArchiveIds")
	static int[] regionMapArchiveIds;
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	-2056271889)

	@Export("type")
	public int type;
	static 
	{
		VarpDefinition_cached = new EvictingDualNodeHashTable(64);
	}

	VarpDefinition() {
		this.type = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;I)V", garbageValue = 
	"856991189")

	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;II)V", garbageValue = 
	"2104717847")

	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 5) {
			this.type = var1.readUnsignedShort();
		}

	}

	@ObfuscatedName("je")
	@ObfuscatedSignature(descriptor = 
	"([Lky;IIIIIIII)V", garbageValue = 
	"2009471440")

	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (((var9 != null) && (var9.parentId == var1)) && ((var9.method5617() || (class326.getWidgetFlags(var9) != 0)) || (var9 == Client.clickedWidgetParent))) {
				if (var9.isIf3) {
					if (class1.isComponentHidden(var9)) {
						continue;
					}
				} else if (((var9.type == 0) && (var9 != DevicePcmPlayerProvider.mousedOverWidgetIf1)) && class1.isComponentHidden(var9)) {
					continue;
				}

				if ((var9.type == 11) && var9.method5629(VerticalAlignment.urlRequester)) {
					class346.invalidateWidget(var9);
					AbstractByteArrayCopier.revalidateWidgetScroll(var9.children, var9, true);
					if (var9.field3462 != null) {
						ScriptEvent var10 = new ScriptEvent();
						var10.widget = var9;
						var10.args = var9.field3462;
						Client.scriptEvents.addFirst(var10);
					}
				}

				int var26 = var9.x + var6;
				int var11 = var7 + var9.y;
				int var12;
				int var13;
				int var14;
				int var15;
				int var17;
				int var18;
				if (var9.type == 2) {
					var12 = var2;
					var13 = var3;
					var14 = var4;
					var15 = var5;
				} else {
					int var16;
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
						var12 = (var16 > var2) ? var16 : var2;
						var13 = (var17 > var3) ? var17 : var3;
						var14 = (var18 < var4) ? var18 : var4;
						var15 = (var19 < var5) ? var19 : var5;
					} else {
						var16 = var26 + var9.width;
						var17 = var11 + var9.height;
						var12 = (var26 > var2) ? var26 : var2;
						var13 = (var11 > var3) ? var11 : var3;
						var14 = (var16 < var4) ? var16 : var4;
						var15 = (var17 < var5) ? var17 : var5;
					}
				}

				if (var9 == Client.clickedWidget) {
					Client.field687 = true;
					Client.field688 = var26;
					Client.field757 = var11;
				}

				boolean var34 = false;
				if (var9.field3414) {
					switch (Client.field668) {
						case 0 :
							var34 = true;
						case 1 :
						default :
							break;
						case 2 :
							if (Client.field628 == (var9.id >>> 16)) {
								var34 = true;
							}
							break;
						case 3 :
							if (var9.id == Client.field628) {
								var34 = true;
							}}

				}

				if ((var34 || (!var9.isIf3)) || ((var12 < var14) && (var13 < var15))) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if ((((MouseHandler.MouseHandler_x >= var12) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
								for (var27 = ((ScriptEvent) (Client.scriptEvents.last())); var27 != null; var27 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
									if (var27.isMouseInputEvent) {
										var27.remove();
										var27.widget.containsMouse = false;
									}
								}

								if (class124.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									ByteArrayPool.addCancelMenuEntry();
								}
							}
						} else if ((((var9.noScrollThrough && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
							for (var27 = ((ScriptEvent) (Client.scriptEvents.last())); var27 != null; var27 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
								if (var27.isMouseInputEvent && (var27.widget.onScroll == var27.args)) {
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

					boolean var35 = (((var17 >= var12) && (var18 >= var13)) && (var17 < var14)) && (var18 < var15);
					if (var9.contentType == 1337) {
						if (((!Client.isLoading) && (!Client.isMenuOpen)) && var35) {
							ClanMate.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class14.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							ScriptFrame.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if ((!Client.isMenuOpen) && var35) {
							if (var9.contentType == 1400) {
								ScriptFrame.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								class138.Widget_addToMenu(var9, var17 - var26, var18 - var11);
							}
						}

						boolean var21;
						int var29;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3415.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if ((!var21) && (var9.field3415[var20] != null)) {
									for (var29 = 0; var29 < var9.field3415[var20].length; ++var29) {
										boolean var24 = false;
										if (var9.field3484 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3415[var20][var29]];
										}

										if (ArchiveLoader.method2062(var9.field3415[var20][var29]) || var24) {
											var21 = true;
											if ((var9.field3484 != null) && (var9.field3484[var20] > Client.cycle)) {
												break;
											}

											byte var33 = var9.field3485[var20][var29];
											if ((var33 == 0) || ((((((var33 & 8) == 0) || (((!KeyHandler.KeyHandler_pressedKeys[86]) && (!KeyHandler.KeyHandler_pressedKeys[82])) && (!KeyHandler.KeyHandler_pressedKeys[81]))) && (((var33 & 2) == 0) || KeyHandler.KeyHandler_pressedKeys[86])) && (((var33 & 1) == 0) || KeyHandler.KeyHandler_pressedKeys[82])) && (((var33 & 4) == 0) || KeyHandler.KeyHandler_pressedKeys[81]))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										WorldMapLabelSize.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										FriendSystem.Widget_runOnTargetLeave();
										Renderable.selectSpell(var9.id, var9.childIndex, WorldMapID.Widget_unpackTargetMask(class326.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = class152.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + UserComparator9.colorStartTag(16777215);
									}

									var29 = var9.field3417[var20];
									if (var9.field3484 == null) {
										var9.field3484 = new int[var9.field3415.length];
									}

									if (var9.field3418 == null) {
										var9.field3418 = new int[var9.field3415.length];
									}

									if (var29 != 0) {
										if (var9.field3484[var20] == 0) {
											var9.field3484[var20] = (var29 + Client.cycle) + var9.field3418[var20];
										} else {
											var9.field3484[var20] = var29 + Client.cycle;
										}
									} else {
										var9.field3484[var20] = Integer.MAX_VALUE;
									}
								}

								if ((!var21) && (var9.field3484 != null)) {
									var9.field3484[var20] = 0;
								}
							}
						}

						if (var9.isIf3) {
							if ((((MouseHandler.MouseHandler_x >= var12) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
								var35 = true;
							} else {
								var35 = false;
							}

							boolean var36 = false;
							if (((MouseHandler.MouseHandler_currentButton == 1) || ((!GameBuild.mouseCam) && (MouseHandler.MouseHandler_currentButton == 4))) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((((((MouseHandler.MouseHandler_lastButton == 1) || ((!GameBuild.mouseCam) && (MouseHandler.MouseHandler_lastButton == 4))) && (MouseHandler.MouseHandler_lastPressedX >= var12)) && (MouseHandler.MouseHandler_lastPressedY >= var13)) && (MouseHandler.MouseHandler_lastPressedX < var14)) && (MouseHandler.MouseHandler_lastPressedY < var15)) {
								var21 = true;
							}

							int[] var22;
							if (var21) {
								ParamComposition.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
								if ((var9.type == 11) && var9.method5721(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY)) {
									switch (var9.method5625()) {
										case 0 :
											class391.openURL(var9.method5627(), true, false);
											break;
										case 1 :
											if (ParamComposition.method3596(class326.getWidgetFlags(var9))) {
												var22 = var9.method5628();
												if (var22 != null) {
													PacketBufferNode var23 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher);
													var23.packetBuffer.writeIntIME(var22[0]);
													var23.packetBuffer.writeShortLE(var9.childIndex);
													var23.packetBuffer.writeIntLE(var22[1]);
													var23.packetBuffer.writeIntME(var9.method5647());
													var23.packetBuffer.writeIntLE(var22[2]);
													var23.packetBuffer.writeInt(var9.id);
													Client.packetWriter.addNode(var23);
												}
											}}

								}
							}

							if (var9.contentType == 1400) {
								ScriptFrame.worldMap.method7217(var17, var18, var35 & var36, var35 & var21);
							}

							if ((((Client.clickedWidget != null) && (var9 != Client.clickedWidget)) && var35) && DirectByteArrayCopier.method5516(class326.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field696 = true;
								Client.field773 = var26;
								Client.field686 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var37;
								if ((var35 && (Client.mouseWheelRotation != 0)) && (var9.onScroll != null)) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseY = Client.mouseWheelRotation;
									var37.args = var9.onScroll;
									Client.scriptEvents.addFirst(var37);
								}

								if (((Client.clickedWidget != null) || (class142.dragInventoryWidget != null)) || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}

								if ((!var9.isClicked) && var21) {
									var9.isClicked = true;
									if (var9.onClick != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var37.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var37.args = var9.onClick;
										Client.scriptEvents.addFirst(var37);
									}
								}

								if ((var9.isClicked && var36) && (var9.onClickRepeat != null)) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var37);
								}

								if (var9.isClicked && (!var36)) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onRelease;
										Client.field711.addFirst(var37);
									}
								}

								if (var36 && (var9.onHold != null)) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onHold;
									Client.scriptEvents.addFirst(var37);
								}

								if ((!var9.containsMouse) && var35) {
									var9.containsMouse = true;
									if (var9.onMouseOver != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var37);
									}
								}

								if ((var9.containsMouse && var35) && (var9.onMouseRepeat != null)) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var37);
								}

								if (var9.containsMouse && (!var35)) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onMouseLeave;
										Client.field711.addFirst(var37);
									}
								}

								if (var9.onTimer != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onTimer;
									Client.field710.addFirst(var37);
								}

								ScriptEvent var25;
								int var39;
								int var40;
								if ((var9.onVarTransmit != null) && (Client.changedVarpCount > var9.field3479)) {
									if ((var9.varTransmitTriggers != null) && ((Client.changedVarpCount - var9.field3479) <= 32)) {
										label825 : for (
										var40 = var9.field3479; var40 < Client.changedVarpCount; ++var40) {
											var29 = Client.changedVarps[var40 & 31];

											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) {
												if (var29 == var9.varTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label825;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var37);
									}

									var9.field3479 = Client.changedVarpCount;
								}

								if ((var9.onInvTransmit != null) && (Client.field695 > var9.field3480)) {
									if ((var9.invTransmitTriggers != null) && ((Client.field695 - var9.field3480) <= 32)) {
										label801 : for (
										var40 = var9.field3480; var40 < Client.field695; ++var40) {
											var29 = Client.changedItemContainers[var40 & 31];

											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) {
												if (var29 == var9.invTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label801;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var37);
									}

									var9.field3480 = Client.field695;
								}

								if ((var9.onStatTransmit != null) && (Client.changedSkillsCount > var9.field3433)) {
									if ((var9.statTransmitTriggers != null) && ((Client.changedSkillsCount - var9.field3433) <= 32)) {
										label777 : for (
										var40 = var9.field3433; var40 < Client.changedSkillsCount; ++var40) {
											var29 = Client.changedSkills[var40 & 31];

											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) {
												if (var29 == var9.statTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label777;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var37);
									}

									var9.field3433 = Client.changedSkillsCount;
								}

								if ((Client.chatCycle > var9.field3478) && (var9.onChatTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field701 > var9.field3478) && (var9.onFriendTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field702 > var9.field3478) && (var9.onClanTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field703 > var9.field3478) && (var9.field3454 != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3454;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field755 > var9.field3478) && (var9.field3455 != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3455;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field705 > var9.field3478) && (var9.onStockTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field706 > var9.field3478) && (var9.field3432 != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3432;
									Client.scriptEvents.addFirst(var37);
								}

								if ((Client.field707 > var9.field3478) && (var9.onMiscTransmit != null)) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var37);
								}

								var9.field3478 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var40 = 0; var40 < Client.field731; ++var40) {
										ScriptEvent var38 = new ScriptEvent();
										var38.widget = var9;
										var38.keyTyped = Client.field733[var40];
										var38.keyPressed = Client.field732[var40];
										var38.args = var9.onKey;
										Client.scriptEvents.addFirst(var38);
									}
								}

								ScriptEvent var32;
								if (var9.field3416 != null) {
									var22 = FontName.method7414();

									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var22[var29];
										var32.args = var9.field3416;
										Client.scriptEvents.addFirst(var32);
									}
								}

								if (var9.field3451 != null) {
									var22 = class118.method2748();

									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var22[var29];
										var32.args = var9.field3451;
										Client.scriptEvents.addFirst(var32);
									}
								}
							}
						}

						if (!var9.isIf3) {
							if (((Client.clickedWidget != null) || (class142.dragInventoryWidget != null)) || Client.isMenuOpen) {
								continue;
							}

							if ((((((var9.mouseOverRedirect >= 0) || (var9.mouseOverColor != 0)) && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
								if (var9.mouseOverRedirect >= 0) {
									DevicePcmPlayerProvider.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									DevicePcmPlayerProvider.mousedOverWidgetIf1 = var9;
								}
							}

							if (((((var9.type == 8) && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) {
								GrandExchangeOfferOwnWorldComparator.field486 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								class129.method2861(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}

						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}

							InterfaceParent var30 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var9.id)))));
							if (var30 != null) {
								if ((((((var30.type == 0) && (MouseHandler.MouseHandler_x >= var12)) && (MouseHandler.MouseHandler_y >= var13)) && (MouseHandler.MouseHandler_x < var14)) && (MouseHandler.MouseHandler_y < var15)) && (!Client.isMenuOpen)) {
									for (ScriptEvent var31 = ((ScriptEvent) (Client.scriptEvents.last())); var31 != null; var31 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
										if (var31.isMouseInputEvent) {
											var31.remove();
											var31.widget.containsMouse = false;
										}
									}

									if (class124.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										ByteArrayPool.addCancelMenuEntry();
									}
								}

								Language.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}