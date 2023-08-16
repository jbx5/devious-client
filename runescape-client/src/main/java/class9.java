import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class9 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	public static final class9 field32;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	public static final class9 field31;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field35;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field33;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Laf;"
	)
	static final class9 field34;
	@ObfuscatedName("gq")
	static String field40;
	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "Lcz;"
	)
	@Export("tempMenuAction")
	static MenuAction tempMenuAction;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1495438921
	)
	int field30;
	@ObfuscatedName("az")
	String field36;
	@ObfuscatedName("ap")
	boolean field45;
	@ObfuscatedName("aa")
	boolean field38;

	static {
		field32 = new class9(0, "POST", true, true);
		field31 = new class9(1, "GET", true, false);
		field35 = new class9(2, "PUT", false, true);
		field33 = new class9(3, "PATCH", false, true);
		field34 = new class9(4, "DELETE", false, true);
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field30 = var1;
		this.field36 = var2;
		this.field45 = var3;
		this.field38 = var4;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2119966021"
	)
	boolean method65() {
		return this.field45;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field30;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/lang/String;",
		garbageValue = "1243672924"
	)
	public String method62() {
		return this.field36;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "861678070"
	)
	boolean method63() {
		return this.field38;
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "([Lmi;IIIIIIIB)V",
		garbageValue = "-33"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method6397() || NpcOverrides.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (class143.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class146.mousedOverWidgetIf1 && class143.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method6454(FriendsChat.urlRequester)) {
						if (var9.method6474()) {
							class218.invalidateWidget(var9);
							Login.revalidateWidgetScroll(var9.children, var9, true);
						}

						if (var9.field3714 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3714;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method6420()) {
					class218.invalidateWidget(var9);
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
					Client.field762 = true;
					Client.field564 = var26;
					Client.field636 = var11;
				}

				boolean var34 = false;
				if (var9.field3721) {
					switch(Client.field540) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field701 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field701) {
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
									if (var27.field1095) {
										var27.remove();
										var27.widget.field3668 = false;
									}
								}

								class500.method8904();
								if (class159.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									class349.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field1095 && var27.widget.onScroll == var27.args) {
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
							class134.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class348.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							Canvas.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								Canvas.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								ClanChannelMember.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3697.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3697[var20] != null) {
									for (var23 = 0; var23 < var9.field3697[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3792 != null) {
											var24 = Client.field674.method4120(var9.field3697[var20][var23]);
										}

										if (class398.method7558(var9.field3697[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3792 != null && var9.field3792[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3796[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field674.method4120(86) && !Client.field674.method4120(82) && !Client.field674.method4120(81)) && ((var33 & 2) == 0 || Client.field674.method4120(86)) && ((var33 & 1) == 0 || Client.field674.method4120(82)) && ((var33 & 4) == 0 || Client.field674.method4120(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										class47.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										InvDefinition.Widget_runOnTargetLeave();
										DirectByteArrayCopier.selectSpell(var9.id, var9.childIndex, HealthBarDefinition.Widget_unpackTargetMask(NpcOverrides.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = class300.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class217.colorStartTag(16777215);
									}

									var23 = var9.field3724[var20];
									if (var9.field3792 == null) {
										var9.field3792 = new int[var9.field3697.length];
									}

									if (var9.field3725 == null) {
										var9.field3725 = new int[var9.field3697.length];
									}

									if (var23 != 0) {
										if (var9.field3792[var20] == 0) {
											var9.field3792[var20] = var23 + Client.cycle + var9.field3725[var20];
										} else {
											var9.field3792[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3792[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3792 != null) {
									var9.field3792[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !PlayerCompositionColorTextureOverride.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !PlayerCompositionColorTextureOverride.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class227.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method6398()) {
								if (var21) {
									Client.field780.addFirst(new class211(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field780.addFirst(new class211(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								Canvas.worldMap.method8500(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class238.method4765(NpcOverrides.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field715 = true;
								Client.field716 = var26;
								Client.field717 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.field1095 = true;
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

								if (!var9.field3785 && var21) {
									var9.field3785 = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.field1095 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3785 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1095 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3785 && !var36) {
									var9.field3785 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1095 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.field743.addFirst(var22);
									}
								}

								if (var36 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.field1095 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.field3668 && var35) {
									var9.field3668 = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.field1095 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3668 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1095 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3668 && !var35) {
									var9.field3668 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1095 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.field743.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field727.addFirst(var22);
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3787) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3787 <= 32) {
										label830:
										for (var39 = var9.field3787; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label830;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3787 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field726 > var9.field3788) {
									if (var9.invTransmitTriggers != null && Client.field726 - var9.field3788 <= 32) {
										label806:
										for (var39 = var9.field3788; var39 < Client.field726; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label806;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3788 = Client.field726;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3789) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3789 <= 32) {
										label782:
										for (var39 = var9.field3789; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label782;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3789 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3718 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field732 > var9.field3718 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field733 > var9.field3718 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field734 > var9.field3718 && var9.field3762 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3762;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field735 > var9.field3718 && var9.field3763 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3763;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field736 > var9.field3718 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field597 > var9.field3718 && var9.field3784 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3784;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field578 > var9.field3718 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3718 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field766; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field768[var39];
										var32.keyPressed = Client.field767[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3767 != null) {
									var38 = Client.field674.method4113();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3767;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field3723 != null) {
									var38 = Client.field674.method4114();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3723;
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
									class146.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class146.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								class343.field3868 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								SongTask.method7612(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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
										if (var30.field1095) {
											var30.remove();
											var30.widget.field3668 = false;
										}
									}

									if (class159.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										class349.addCancelMenuEntry();
									}
								}

								LoginScreenAnimation.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ox")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1162"
	)
	static void method75() {
		class449.clientPreferences.method2547(Client.field531);
	}
}
