import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
final class class108 implements class337 {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	final Widget val$cc;

	@ObfuscatedSignature(
		descriptor = "(Lnm;)V"
	)
	class108(Widget var1) {
		this.val$cc = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-118"
	)
	public void vmethod6238() {
		if (this.val$cc != null && this.val$cc.method6617().field3607 != null) {
			ScriptEvent var1 = new ScriptEvent();
			var1.method2317(this.val$cc);
			var1.setArgs(this.val$cc.method6617().field3607);
			class7.method58().addFirst(var1);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Luy;B)I",
		garbageValue = "0"
	)
	static int method2739(PacketBuffer var0) {
		int var1 = var0.readBits(2);
		int var2;
		if (var1 == 0) {
			var2 = 0;
		} else if (var1 == 1) {
			var2 = var0.readBits(5);
		} else if (var1 == 2) {
			var2 = var0.readBits(8);
		} else {
			var2 = var0.readBits(11);
		}

		return var2;
	}

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-957149443"
	)
	@Export("addSceneMenuOptions")
	static final void addSceneMenuOptions(int var0, int var1, int var2, int var3) {
		if (Client.isItemSelected == 0 && !Client.isSpellSelected) {
			class153.insertMenuItemNoShift("Walk here", "", 23, 0, var0 - var2, var1 - var3);
		}

		long var4 = -1L;
		long var6 = -1L;
		int var8 = 0;

		while (true) {
			int var10 = ViewportMouse.ViewportMouse_entityCount;
			if (var8 >= var10) {
				if (var4 != -1L) {
					var8 = (int)(var4 >>> 0 & 127L);
					var10 = (int)(var4 >>> 7 & 127L);
					Player var12 = Client.players[Client.combatTargetPlayerIndex];
					DirectByteArrayCopier.addPlayerToMenu(var12, Client.combatTargetPlayerIndex, var8, var10);
				}

				return;
			}

			long var26 = ViewportMouse.ViewportMouse_entityTags[var8];
			if (var6 != var26) {
				label363: {
					var6 = var26;
					int var15 = HealthBar.method2616(var8);
					int var16 = class228.method4335(var8);
					long var19 = ViewportMouse.ViewportMouse_entityTags[var8];
					int var18 = (int)(var19 >>> 14 & 3L);
					int var28 = GrandExchangeOfferOwnWorldComparator.method1242(var8);
					int var23;
					if (var18 == 2 && class10.scene.getObjectFlags(class87.Client_plane, var15, var16, var26) >= 0) {
						ObjectComposition var20 = class91.getObjectDefinition(var28);
						if (var20.transforms != null) {
							var20 = var20.transform();
						}

						if (var20 == null) {
							break label363;
						}

						PendingSpawn var21 = null;

						for (PendingSpawn var22 = (PendingSpawn)Client.pendingSpawns.last(); var22 != null; var22 = (PendingSpawn)Client.pendingSpawns.previous()) {
							if (var22.plane == class87.Client_plane && var15 == var22.x && var16 == var22.y && var28 == var22.field1177) {
								var21 = var22;
								break;
							}
						}

						if (Client.isItemSelected == 1) {
							class153.insertMenuItemNoShift("Use", Client.field772 + " " + "->" + " " + Client.colorStartTag(65535) + var20.name, 1, var28, var15, var16);
						} else if (Client.isSpellSelected) {
							if ((class31.selectedSpellFlags & 4) == 4) {
								class153.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(65535) + var20.name, 2, var28, var15, var16);
							}
						} else {
							String[] var36 = var20.actions;
							if (var36 != null) {
								for (var23 = 4; var23 >= 0; --var23) {
									if ((var21 == null || var21.method2415(var23)) && var36[var23] != null) {
										short var24 = 0;
										if (var23 == 0) {
											var24 = 3;
										}

										if (var23 == 1) {
											var24 = 4;
										}

										if (var23 == 2) {
											var24 = 5;
										}

										if (var23 == 3) {
											var24 = 6;
										}

										if (var23 == 4) {
											var24 = 1001;
										}

										class153.insertMenuItemNoShift(var36[var23], Client.colorStartTag(65535) + var20.name, var24, var28, var15, var16);
									}
								}
							}

							class153.insertMenuItemNoShift("Examine", Client.colorStartTag(65535) + var20.name, 1002, var20.id, var15, var16);
						}
					}

					int var29;
					Player var30;
					NPC var37;
					int[] var38;
					if (var18 == 1) {
						NPC var32 = Client.npcs[var28];
						if (var32 == null) {
							break label363;
						}

						if (var32.definition.size == 1 && (var32.x & 127) == 64 && (var32.y & 127) == 64) {
							for (var29 = 0; var29 < Client.npcCount; ++var29) {
								var37 = Client.npcs[Client.npcIndices[var29]];
								if (var37 != null && var32 != var37 && var37.definition.size == 1 && var37.x == var32.x && var37.y == var32.y) {
									class16.addNpcToMenu(var37, Client.npcIndices[var29], var15, var16);
								}
							}

							var29 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var23 = 0; var23 < var29; ++var23) {
								var30 = Client.players[var38[var23]];
								if (var30 != null && var30.x == var32.x && var32.y == var30.y) {
									DirectByteArrayCopier.addPlayerToMenu(var30, var38[var23], var15, var16);
								}
							}
						}

						class16.addNpcToMenu(var32, var28, var15, var16);
					}

					if (var18 == 0) {
						Player var33 = Client.players[var28];
						if (var33 == null) {
							break label363;
						}

						if ((var33.x & 127) == 64 && (var33.y & 127) == 64) {
							for (var29 = 0; var29 < Client.npcCount; ++var29) {
								var37 = Client.npcs[Client.npcIndices[var29]];
								if (var37 != null && var37.definition.size == 1 && var37.x == var33.x && var33.y == var37.y) {
									class16.addNpcToMenu(var37, Client.npcIndices[var29], var15, var16);
								}
							}

							var29 = Players.Players_count;
							var38 = Players.Players_indices;

							for (var23 = 0; var23 < var29; ++var23) {
								var30 = Client.players[var38[var23]];
								if (var30 != null && var30 != var33 && var30.x == var33.x && var33.y == var30.y) {
									DirectByteArrayCopier.addPlayerToMenu(var30, var38[var23], var15, var16);
								}
							}
						}

						if (var28 != Client.combatTargetPlayerIndex) {
							DirectByteArrayCopier.addPlayerToMenu(var33, var28, var15, var16);
						} else {
							var4 = var26;
						}
					}

					if (var18 == 3) {
						NodeDeque var34 = Client.groundItems[class87.Client_plane][var15][var16];
						if (var34 != null) {
							for (TileItem var35 = (TileItem)var34.first(); var35 != null; var35 = (TileItem)var34.next()) {
								ItemComposition var39 = class214.ItemDefinition_get(var35.id);
								if (Client.isItemSelected == 1) {
									class153.insertMenuItemNoShift("Use", Client.field772 + " " + "->" + " " + Client.colorStartTag(16748608) + var39.name, 16, var35.id, var15, var16);
								} else if (Client.isSpellSelected) {
									if ((class31.selectedSpellFlags & 1) == 1) {
										class153.insertMenuItemNoShift(Client.selectedSpellActionName, Client.selectedSpellName + " " + "->" + " " + Client.colorStartTag(16748608) + var39.name, 17, var35.id, var15, var16);
									}
								} else {
									String[] var31 = var39.groundActions;

									for (int var40 = 4; var40 >= 0; --var40) {
										if (var35.method2726(var40)) {
											if (var31 != null && var31[var40] != null) {
												byte var25 = 0;
												if (var40 == 0) {
													var25 = 18;
												}

												if (var40 == 1) {
													var25 = 19;
												}

												if (var40 == 2) {
													var25 = 20;
												}

												if (var40 == 3) {
													var25 = 21;
												}

												if (var40 == 4) {
													var25 = 22;
												}

												class153.insertMenuItemNoShift(var31[var40], Client.colorStartTag(16748608) + var39.name, var25, var35.id, var15, var16);
											} else if (var40 == 2) {
												class153.insertMenuItemNoShift("Take", Client.colorStartTag(16748608) + var39.name, 20, var35.id, var15, var16);
											}
										}
									}

									class153.insertMenuItemNoShift("Examine", Client.colorStartTag(16748608) + var39.name, 1004, var35.id, var15, var16);
								}
							}
						}
					}
				}
			}

			++var8;
		}
	}

	@ObfuscatedName("mz")
	@ObfuscatedSignature(
		descriptor = "([Lnm;IIIIIIIB)V",
		garbageValue = "13"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method6596() || MouseRecorder.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (CollisionMap.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class64.mousedOverWidgetIf1 && CollisionMap.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method6611(class33.widgetDefinition, AbstractWorldMapIcon.urlRequester)) {
						if (var9.method6604()) {
							ClanChannelMember.invalidateWidget(var9);
							PendingSpawn.revalidateWidgetScroll(var9.children, var9, true);
						}

						if (var9.field3801 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3801;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method6619(class33.widgetDefinition)) {
					ClanChannelMember.invalidateWidget(var9);
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
					Client.field685 = true;
					Client.field554 = var26;
					Client.field711 = var11;
				}

				boolean var34 = false;
				if (var9.field3751) {
					switch(Client.field691) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field692 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field692) {
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
									if (var27.field1077) {
										var27.remove();
										var27.widget.field3815 = false;
									}
								}

								Clock.method3596();
								if (FriendsChat.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									StudioGame.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field1077 && var27.widget.onScroll == var27.args) {
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
							addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class401.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							class434.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								class434.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								FloorDecoration.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3752.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3752[var20] != null) {
									for (var23 = 0; var23 < var9.field3752[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3689 != null) {
											var24 = Client.field755.method4280(var9.field3752[var20][var23]);
										}

										if (class131.method3016(var9.field3752[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3689 != null && var9.field3689[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3779[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field755.method4280(86) && !Client.field755.method4280(82) && !Client.field755.method4280(81)) && ((var33 & 2) == 0 || Client.field755.method4280(86)) && ((var33 & 1) == 0 || Client.field755.method4280(82)) && ((var33 & 4) == 0 || Client.field755.method4280(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										TextureProvider.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										class286.method5663();
										class478.method8514(var9.id, var9.childIndex, KitDefinition.Widget_unpackTargetMask(MouseRecorder.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = class155.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + Client.colorStartTag(16777215);
									}

									var23 = var9.field3770[var20];
									if (var9.field3689 == null) {
										var9.field3689 = new int[var9.field3752.length];
									}

									if (var9.field3800 == null) {
										var9.field3800 = new int[var9.field3752.length];
									}

									if (var23 != 0) {
										if (var9.field3689[var20] == 0) {
											var9.field3689[var20] = var23 + Client.cycle + var9.field3800[var20];
										} else {
											var9.field3689[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3689[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3689 != null) {
									var9.field3689[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !UserComparator8.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								TaskHandler.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method6597()) {
								if (var21) {
									Client.field534.addFirst(new class225(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field534.addFirst(new class225(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								class434.worldMap.method8656(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class517.method9044(MouseRecorder.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field647 = true;
								Client.field750 = var26;
								Client.field748 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.field1077 = true;
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

								if (!var9.field3816 && var21) {
									var9.field3816 = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.field1077 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3816 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1077 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3816 && !var36) {
									var9.field3816 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1077 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.field734.addFirst(var22);
									}
								}

								if (var36 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.field1077 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.field3815 && var35) {
									var9.field3815 = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.field1077 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3815 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1077 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3815 && !var35) {
									var9.field3815 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1077 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.field734.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field542.addFirst(var22);
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3667) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3667 <= 32) {
										label831:
										for (var39 = var9.field3667; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label831;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3667 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field602 > var9.field3819) {
									if (var9.invTransmitTriggers != null && Client.field602 - var9.field3819 <= 32) {
										label807:
										for (var39 = var9.field3819; var39 < Client.field602; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label807;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3819 = Client.field602;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3820) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3820 <= 32) {
										label783:
										for (var39 = var9.field3820; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label783;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3820 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3817 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field723 > var9.field3817 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field710 > var9.field3817 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field642 > var9.field3817 && var9.field3793 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3793;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field517 > var9.field3817 && var9.field3794 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3794;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field727 > var9.field3817 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field744 > var9.field3817 && var9.field3708 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3708;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field729 > var9.field3817 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3817 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field757; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field759[var39];
										var32.keyPressed = Client.field661[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3789 != null) {
									var38 = Client.field755.method4298();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3789;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field3790 != null) {
									var38 = Client.field755.method4292();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3790;
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
									class64.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class64.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								GrandExchangeOfferNameComparator.field4374 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								class305.method5862(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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
										if (var30.field1077) {
											var30.remove();
											var30.widget.field3815 = false;
										}
									}

									if (FriendsChat.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										StudioGame.addCancelMenuEntry();
									}
								}

								class511.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
