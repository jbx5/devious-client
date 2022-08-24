import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("ku")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("qr")
	@ObfuscatedSignature(descriptor = "Lom;")
	static class392 field3318;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 2112007443)
	@Export("plane")
	public int plane;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -887279971)
	@Export("x")
	public int x;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -325968273)
	@Export("y")
	public int y;

	@ObfuscatedSignature(descriptor = "(Lku;)V")
	public Coord(Coord var1) {
		this.plane = var1.plane;
		this.x = var1.x;
		this.y = var1.y;
	}

	public Coord(int var1, int var2, int var3) {
		this.plane = var1;
		this.x = var2;
		this.y = var3;
	}

	public Coord(int var1) {
		if (var1 == -1) {
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3;
			this.x = var1 >> 14 & 16383;
			this.y = var1 & 16383;
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "90")
	@Export("packed")
	public int packed() {
		int var2 = this.plane;
		int var3 = this.x;
		int var4 = this.y;
		int var1 = var2 << 28 | var3 << 14 | var4;
		return var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lku;I)Z", garbageValue = "143934889")
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) {
			return false;
		} else if (this.x != var1.x) {
			return false;
		} else {
			return this.y == var1.y;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "-1811449401")
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63);
	}

	public int hashCode() {
		return this.packed();
	}

	public boolean equals(Object var1) {
		if (this == var1) {
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord(((Coord) (var1)));
		}
	}

	public String toString() {
		return this.toString(",");
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "561803064")
	static int method5485(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
			var4 = HitSplatDefinition.getWidget(var3);
		} else {
			var4 = (var2) ? SoundSystem.scriptDotWidget : Ignored.scriptActiveWidget;
		}
		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			User.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3];
			class125.invalidateWidget(var4);
			AbstractByteArrayCopier.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var3 >> 16], var4, false);
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			User.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 3];
			class125.invalidateWidget(var4);
			AbstractByteArrayCopier.client.alignWidget(var4);
			if (var3 != -1 && var4.type == 0) {
				class181.revalidateWidgetScroll(class358.Widget_interfaceComponents[var3 >> 16], var4, false);
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class125.invalidateWidget(var4);
			}
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(descriptor = "([Lkn;IIIIIIII)V", garbageValue = "-1296371253")
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method5545() || class193.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (Tiles.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class113.mousedOverWidgetIf1 && Tiles.isComponentHidden(var9)) {
					continue;
				}
				if (var9.type == 11 && var9.method5610(MilliClock.urlRequester)) {
					if (var9.method5562()) {
						class125.invalidateWidget(var9);
						class181.revalidateWidgetScroll(var9.children, var9, true);
					}
					if (var9.field3364 != null) {
						ScriptEvent var10 = new ScriptEvent();
						var10.widget = var9;
						var10.args = var9.field3364;
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
					Client.field494 = true;
					Client.field671 = var26;
					Client.field672 = var11;
				}
				boolean var34 = false;
				if (var9.field3436) {
					switch (Client.field741) {
						case 0 :
							var34 = true;
						case 1 :
						default :
							break;
						case 2 :
							if (Client.field652 == var9.id >>> 16) {
								var34 = true;
							}
							break;
						case 3 :
							if (var9.id == Client.field652) {
								var34 = true;
							}
					}
				}
				if (var34 || !var9.isIf3 || var12 < var14 && var13 < var15) {
					if (var9.isIf3) {
						ScriptEvent var27;
						if (var9.noClickThrough) {
							if (MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								for (var27 = ((ScriptEvent) (Client.scriptEvents.last())); var27 != null; var27 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
									if (var27.isMouseInputEvent) {
										var27.remove();
										var27.widget.containsMouse = false;
									}
								}
								if (NPCComposition.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}
								if (!Client.isMenuOpen) {
									Ignored.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = ((ScriptEvent) (Client.scriptEvents.last())); var27 != null; var27 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
								if (var27.isMouseInputEvent && var27.widget.onScroll == var27.args) {
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
							WorldMapSection1.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class359.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							ClientPacket.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}
						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								ClientPacket.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								AbstractSocket.Widget_addToMenu(var9, var17 - var26, var18 - var11);
							}
						}
						boolean var21;
						int var29;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3349.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3349[var20] != null) {
									for (var29 = 0; var29 < var9.field3349[var20].length; ++var29) {
										boolean var24 = false;
										if (var9.field3506 != null) {
											var24 = KeyHandler.KeyHandler_pressedKeys[var9.field3349[var20][var29]];
										}
										if (class268.method5149(var9.field3349[var20][var29]) || var24) {
											var21 = true;
											if (var9.field3506 != null && var9.field3506[var20] > Client.cycle) {
												break;
											}
											byte var33 = var9.field3497[var20][var29];
											if (var33 == 0 || ((var33 & 8) == 0 || !KeyHandler.KeyHandler_pressedKeys[86] && !KeyHandler.KeyHandler_pressedKeys[82] && !KeyHandler.KeyHandler_pressedKeys[81]) && ((var33 & 2) == 0 || KeyHandler.KeyHandler_pressedKeys[86]) && ((var33 & 1) == 0 || KeyHandler.KeyHandler_pressedKeys[82]) && ((var33 & 4) == 0 || KeyHandler.KeyHandler_pressedKeys[81])) {
												var28 = true;
												break;
											}
										}
									}
								}
								if (var28) {
									if (var20 < 10) {
										ArchiveDiskAction.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										ReflectionCheck.Widget_runOnTargetLeave();
										DynamicObject.selectSpell(var9.id, var9.childIndex, ModeWhere.Widget_unpackTargetMask(class193.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = WorldMapDecoration.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}
										Client.selectedSpellName = var9.dataText + Clock.colorStartTag(16777215);
									}
									var29 = var9.field3439[var20];
									if (var9.field3506 == null) {
										var9.field3506 = new int[var9.field3349.length];
									}
									if (var9.field3410 == null) {
										var9.field3410 = new int[var9.field3349.length];
									}
									if (var29 != 0) {
										if (var9.field3506[var20] == 0) {
											var9.field3506[var20] = var29 + Client.cycle + var9.field3410[var20];
										} else {
											var9.field3506[var20] = var29 + Client.cycle;
										}
									} else {
										var9.field3506[var20] = Integer.MAX_VALUE;
									}
								}
								if (!var21 && var9.field3506 != null) {
									var9.field3506[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}
							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}
							int[] var22;
							if (var21) {
								class229.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
								if (var9.type == 11 && var9.method5550(MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY, var6, var7)) {
									switch (var9.method5554()) {
										case 0 :
											class400.openURL(var9.method5556(), true, false);
											break;
										case 1 :
											if (class439.method7568(class193.getWidgetFlags(var9))) {
												var22 = var9.method5595();
												if (var22 != null) {
													PacketBufferNode var23 = DevicePcmPlayerProvider.getPacketBufferNode(ClientPacket.field2919, Client.packetWriter.isaacCipher);
													var23.packetBuffer.writeIntIME(var9.id);
													var23.packetBuffer.writeIntLE(var22[0]);
													var23.packetBuffer.writeIntME(var22[1]);
													var23.packetBuffer.writeInt(var9.method5555());
													var23.packetBuffer.writeShortLE(var9.childIndex);
													var23.packetBuffer.writeIntIME(var22[2]);
													Client.packetWriter.addNode(var23);
												}
											}
									}
								}
							}
							if (var9.contentType == 1400) {
								ClientPacket.worldMap.method7283(var17, var18, var35 & var36, var35 & var21);
							}
							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && Players.method2383(class193.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}
							if (var9 == Client.clickedWidgetParent) {
								Client.field569 = true;
								Client.field760 = var26;
								Client.field669 = var11;
							}
							if (var9.hasListener) {
								ScriptEvent var37;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseY = Client.mouseWheelRotation;
									var37.args = var9.onScroll;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.clickedWidget != null || class16.dragInventoryWidget != null || Client.isMenuOpen) {
									var21 = false;
									var36 = false;
									var35 = false;
								}
								if (!var9.isClicked && var21) {
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
								if (var9.isClicked && var36 && var9.onClickRepeat != null) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var37);
								}
								if (var9.isClicked && !var36) {
									var9.isClicked = false;
									if (var9.onRelease != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onRelease;
										Client.field528.addFirst(var37);
									}
								}
								if (var36 && var9.onHold != null) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onHold;
									Client.scriptEvents.addFirst(var37);
								}
								if (!var9.containsMouse && var35) {
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
								if (var9.containsMouse && var35 && var9.onMouseRepeat != null) {
									var37 = new ScriptEvent();
									var37.isMouseInputEvent = true;
									var37.widget = var9;
									var37.mouseX = MouseHandler.MouseHandler_x - var26;
									var37.mouseY = MouseHandler.MouseHandler_y - var11;
									var37.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var37);
								}
								if (var9.containsMouse && !var35) {
									var9.containsMouse = false;
									if (var9.onMouseLeave != null) {
										var37 = new ScriptEvent();
										var37.isMouseInputEvent = true;
										var37.widget = var9;
										var37.mouseX = MouseHandler.MouseHandler_x - var26;
										var37.mouseY = MouseHandler.MouseHandler_y - var11;
										var37.args = var9.onMouseLeave;
										Client.field528.addFirst(var37);
									}
								}
								if (var9.onTimer != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onTimer;
									Client.field693.addFirst(var37);
								}
								ScriptEvent var25;
								int var39;
								int var40;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3501) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3501 <= 32) {
										label842 : for (var40 = var9.field3501; var40 < Client.changedVarpCount; ++var40) {
											var29 = Client.changedVarps[var40 & 31];
											for (var39 = 0; var39 < var9.varTransmitTriggers.length; ++var39) {
												if (var29 == var9.varTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label842;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var37);
									}
									var9.field3501 = Client.changedVarpCount;
								}
								if (var9.onInvTransmit != null && Client.field678 > var9.field3502) {
									if (var9.invTransmitTriggers != null && Client.field678 - var9.field3502 <= 32) {
										label818 : for (var40 = var9.field3502; var40 < Client.field678; ++var40) {
											var29 = Client.changedItemContainers[var40 & 31];
											for (var39 = 0; var39 < var9.invTransmitTriggers.length; ++var39) {
												if (var29 == var9.invTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label818;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var37);
									}
									var9.field3502 = Client.field678;
								}
								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3503) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3503 <= 32) {
										label794 : for (var40 = var9.field3503; var40 < Client.changedSkillsCount; ++var40) {
											var29 = Client.changedSkills[var40 & 31];
											for (var39 = 0; var39 < var9.statTransmitTriggers.length; ++var39) {
												if (var29 == var9.statTransmitTriggers[var39]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label794;
												}
											}
										}
									} else {
										var37 = new ScriptEvent();
										var37.widget = var9;
										var37.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var37);
									}
									var9.field3503 = Client.changedSkillsCount;
								}
								if (Client.chatCycle > var9.field3500 && var9.onChatTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field710 > var9.field3500 && var9.onFriendTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field685 > var9.field3500 && var9.onClanTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field477 > var9.field3500 && var9.field3476 != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3476;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field687 > var9.field3500 && var9.field3369 != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3369;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field684 > var9.field3500 && var9.onStockTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field689 > var9.field3500 && var9.field3441 != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.field3441;
									Client.scriptEvents.addFirst(var37);
								}
								if (Client.field690 > var9.field3500 && var9.onMiscTransmit != null) {
									var37 = new ScriptEvent();
									var37.widget = var9;
									var37.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var37);
								}
								var9.field3500 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var40 = 0; var40 < Client.field714; ++var40) {
										ScriptEvent var38 = new ScriptEvent();
										var38.widget = var9;
										var38.keyTyped = Client.field716[var40];
										var38.keyPressed = Client.field577[var40];
										var38.args = var9.onKey;
										Client.scriptEvents.addFirst(var38);
									}
								}
								ScriptEvent var32;
								if (var9.field3472 != null) {
									var22 = class341.method6185();
									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var22[var29];
										var32.args = var9.field3472;
										Client.scriptEvents.addFirst(var32);
									}
								}
								if (var9.field3493 != null) {
									var22 = RouteStrategy.method3814();
									for (var29 = 0; var29 < var22.length; ++var29) {
										var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = var22[var29];
										var32.args = var9.field3493;
										Client.scriptEvents.addFirst(var32);
									}
								}
							}
						}
						if (!var9.isIf3) {
							if (Client.clickedWidget != null || class16.dragInventoryWidget != null || Client.isMenuOpen) {
								continue;
							}
							if ((var9.mouseOverRedirect >= 0 || var9.mouseOverColor != 0) && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								if (var9.mouseOverRedirect >= 0) {
									class113.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class113.mousedOverWidgetIf1 = var9;
								}
							}
							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								EnumComposition.field1890 = var9;
							}
							if (var9.scrollHeight > var9.height) {
								WorldMapRegion.method4607(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
							}
						}
						if (var9.type == 0) {
							updateInterface(var0, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							if (var9.children != null) {
								updateInterface(var9.children, var9.id, var12, var13, var14, var15, var26 - var9.scrollX, var11 - var9.scrollY);
							}
							InterfaceParent var30 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var9.id)))));
							if (var30 != null) {
								if (var30.type == 0 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15 && !Client.isMenuOpen) {
									for (ScriptEvent var31 = ((ScriptEvent) (Client.scriptEvents.last())); var31 != null; var31 = ((ScriptEvent) (Client.scriptEvents.previous()))) {
										if (var31.isMouseInputEvent) {
											var31.remove();
											var31.widget.containsMouse = false;
										}
									}
									if (NPCComposition.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}
									if (!Client.isMenuOpen) {
										Ignored.addCancelMenuEntry();
									}
								}
								GraphicsObject.updateRootInterface(var30.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}
	}
}