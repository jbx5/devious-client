import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class94 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1153;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1142;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1143;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1144;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1145;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1146;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1147;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1148;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1149;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1150;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1151;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1152;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1156;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1157;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1154;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1141;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1155;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class94 field1158;

	static {
		field1153 = new class94();
		field1142 = new class94();
		field1143 = new class94();
		field1144 = new class94();
		field1145 = new class94();
		field1146 = new class94();
		field1147 = new class94();
		field1148 = new class94();
		field1149 = new class94();
		field1150 = new class94();
		field1151 = new class94();
		field1152 = new class94();
		field1156 = new class94();
		field1157 = new class94();
		field1154 = new class94();
		field1141 = new class94();
		field1155 = new class94();
		field1158 = new class94();
	}

	class94() {
	}

	@ObfuscatedName("nr")
	@ObfuscatedSignature(
		descriptor = "([Lnq;IIIIIIIB)V",
		garbageValue = "11"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method6951() || SpriteMask.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (class238.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != HttpMethod.mousedOverWidgetIf1 && class238.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method6968(FloorUnderlayDefinition.widgetDefinition, Canvas.urlRequester)) {
						if (var9.method6960()) {
							class416.invalidateWidget(var9);
							class165.revalidateWidgetScroll(var9.children, var9, true);
							var9.method7043().method4551().method4622(3, var9.method7043().method4521());
						}

						if (var9.field3929 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3929;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method6976(FloorUnderlayDefinition.widgetDefinition)) {
					class416.invalidateWidget(var9);
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
					Client.field604 = true;
					Client.field635 = var26;
					Client.field688 = var11;
				}

				boolean var34 = false;
				if (var9.field3878) {
					switch(Client.field668) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field669 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field669) {
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
									if (var27.field1063) {
										var27.remove();
										var27.widget.field3942 = false;
									}
								}

								EnumComposition.method4884();
								if (class535.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									DefaultsGroup.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field1063 && var27.widget.onScroll == var27.args) {
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
							class7.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class140.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							class219.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								class219.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								FaceNormal.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3879.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3879[var20] != null) {
									for (var23 = 0; var23 < var9.field3879[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3951 != null) {
											var24 = Client.indexCheck.isValidIndexInRange(var9.field3879[var20][var23]);
										}

										if (class53.method1050(var9.field3879[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3951 != null && var9.field3951[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3880[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.indexCheck.isValidIndexInRange(86) && !Client.indexCheck.isValidIndexInRange(82) && !Client.indexCheck.isValidIndexInRange(81)) && ((var33 & 2) == 0 || Client.indexCheck.isValidIndexInRange(86)) && ((var33 & 1) == 0 || Client.indexCheck.isValidIndexInRange(82)) && ((var33 & 4) == 0 || Client.indexCheck.isValidIndexInRange(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										HttpRequestTask.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class141.method3259();
										class151.method3371(var9.id, var9.childIndex, InvDefinition.Widget_unpackTargetMask(SpriteMask.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = RestClientThreadFactory.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + TransformationMatrix.colorStartTag(16777215);
									}

									var23 = var9.field3881[var20];
									if (var9.field3951 == null) {
										var9.field3951 = new int[var9.field3879.length];
									}

									if (var9.field3832 == null) {
										var9.field3832 = new int[var9.field3879.length];
									}

									if (var23 != 0) {
										if (var9.field3951[var20] == 0) {
											var9.field3951[var20] = var23 + Client.cycle + var9.field3832[var20];
										} else {
											var9.field3951[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3951[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3951 != null) {
									var9.field3951[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class429.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class429.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class270.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method6952()) {
								if (var21) {
									Client.field712.addFirst(new class266(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field712.addFirst(new class266(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								class219.worldMap.method9253(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class151.method3375(SpriteMask.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field683 = true;
								Client.field661 = var26;
								Client.field766 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.field1063 = true;
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

								if (!var9.field3944 && var21) {
									var9.field3944 = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.field1063 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3944 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1063 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3944 && !var36) {
									var9.field3944 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1063 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.scriptEvents3.addFirst(var22);
									}
								}

								if (var36 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.field1063 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.field3942 && var35) {
									var9.field3942 = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.field1063 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3942 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1063 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3942 && !var35) {
									var9.field3942 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1063 = true;
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
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3946) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3946 <= 32) {
										label823:
										for (var39 = var9.field3946; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label823;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3946 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field572 > var9.field3947) {
									if (var9.invTransmitTriggers != null && Client.field572 - var9.field3947 <= 32) {
										label799:
										for (var39 = var9.field3947; var39 < Client.field572; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label799;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3947 = Client.field572;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3948) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3948 <= 32) {
										label775:
										for (var39 = var9.field3948; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label775;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3948 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3859 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field503 > var9.field3859 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field701 > var9.field3859 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field803 > var9.field3859 && var9.field3921 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3921;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field562 > var9.field3859 && var9.field3922 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3922;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field751 > var9.field3859 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field705 > var9.field3859 && var9.field3928 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3928;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field706 > var9.field3859 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3859 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field736; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field651[var39];
										var32.keyPressed = Client.field737[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3917 != null) {
									var38 = Client.indexCheck.method5349();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3917;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field3838 != null) {
									var38 = Client.indexCheck.method5367();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3838;
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
									HttpMethod.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									HttpMethod.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								class273.field2978 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								class429.method7971(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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
										if (var30.field1063) {
											var30.remove();
											var30.widget.field3942 = false;
										}
									}

									if (class535.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										DefaultsGroup.addCancelMenuEntry();
									}
								}

								Actor.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
