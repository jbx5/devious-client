import java.awt.datatransfer.Clipboard;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fv")
@Implements("ClanChannelMember")
public class ClanChannelMember {
	@ObfuscatedName("aw")
	@Export("rank")
	public byte rank;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 581659887
	)
	@Export("world")
	public int world;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("username")
	public Username username;

	ClanChannelMember() {
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "([BB)Lud;",
		garbageValue = "-39"
	)
	public static final SpritePixels method3152(byte[] var0) {
		BufferedImage var1 = null;

		try {
			Class var2 = ImageIO.class;
			synchronized(ImageIO.class) {
				var1 = ImageIO.read(new ByteArrayInputStream(var0));
			}

			int var6 = var1.getWidth();
			int var7 = var1.getHeight();
			int[] var4 = new int[var7 * var6];
			PixelGrabber var5 = new PixelGrabber(var1, 0, 0, var6, var7, var4, 0, var6);
			var5.grabPixels();
			return new SpritePixels(var4, var6, var7);
		} catch (IOException var9) {
		} catch (InterruptedException var10) {
		}

		return new SpritePixels(0, 0);
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-729456803"
	)
	static int method3150(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 0) {
				var1 = 0;
			} else if (var1 > 127) {
				var1 = 127;
			}

			var1 = 127 - var1;
			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "([Lmt;IIIIIIIB)V",
		garbageValue = "14"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method6505() || UserComparator8.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (WorldMapDecorationType.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != WorldMapScaleHandler.mousedOverWidgetIf1 && WorldMapDecorationType.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method6466(WorldMapLabel.urlRequester)) {
						if (var9.method6459()) {
							class200.invalidateWidget(var9);
							SoundCache.revalidateWidgetScroll(var9.children, var9, true);
						}

						if (var9.field3747 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3747;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method6473()) {
					class200.invalidateWidget(var9);
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
					Client.field809 = true;
					Client.field705 = var26;
					Client.field706 = var11;
				}

				boolean var34 = false;
				if (var9.field3698) {
					switch(Client.field617) {
					case 0:
						var34 = true;
					case 1:
					default:
						break;
					case 2:
						if (Client.field687 == var9.id >>> 16) {
							var34 = true;
						}
						break;
					case 3:
						if (var9.id == Client.field687) {
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
									if (var27.field1070) {
										var27.remove();
										var27.widget.field3761 = false;
									}
								}

								class417.method7750();
								if (class130.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									class89.addCancelMenuEntry();
								}
							}
						} else if (var9.noScrollThrough && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
							for (var27 = (ScriptEvent)Client.scriptEvents.last(); var27 != null; var27 = (ScriptEvent)Client.scriptEvents.previous()) {
								if (var27.field1070 && var27.widget.onScroll == var27.args) {
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
							class59.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						class166.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							class127.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								class127.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								class317.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3711.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3711[var20] != null) {
									for (var23 = 0; var23 < var9.field3711[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3769 != null) {
											var24 = Client.field750.method4151(var9.field3711[var20][var23]);
										}

										if (class319.method6070(var9.field3711[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3769 != null && var9.field3769[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3700[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field750.method4151(86) && !Client.field750.method4151(82) && !Client.field750.method4151(81)) && ((var33 & 2) == 0 || Client.field750.method4151(86)) && ((var33 & 1) == 0 || Client.field750.method4151(82)) && ((var33 & 4) == 0 || Client.field750.method4151(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										BufferedSource.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										SoundCache.Widget_runOnTargetLeave();
										ArchiveDiskAction.selectSpell(var9.id, var9.childIndex, class273.Widget_unpackTargetMask(UserComparator8.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = class13.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + MusicPatchPcmStream.colorStartTag(16777215);
									}

									var23 = var9.field3657[var20];
									if (var9.field3769 == null) {
										var9.field3769 = new int[var9.field3711.length];
									}

									if (var9.field3630 == null) {
										var9.field3630 = new int[var9.field3711.length];
									}

									if (var23 != 0) {
										if (var9.field3769[var20] == 0) {
											var9.field3769[var20] = var23 + Client.cycle + var9.field3630[var20];
										} else {
											var9.field3769[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3769[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3769 != null) {
									var9.field3769[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !class28.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !class28.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class353.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method6452()) {
								if (var21) {
									Client.field810.addFirst(new class212(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field810.addFirst(new class212(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								class127.worldMap.method8533(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && class319.method6069(UserComparator8.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field761 = true;
								Client.field648 = var26;
								Client.field703 = var11;
							}

							if (var9.hasListener) {
								ScriptEvent var22;
								if (var35 && Client.mouseWheelRotation != 0 && var9.onScroll != null) {
									var22 = new ScriptEvent();
									var22.field1070 = true;
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

								if (!var9.field3762 && var21) {
									var9.field3762 = true;
									if (var9.onClick != null) {
										var22 = new ScriptEvent();
										var22.field1070 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_lastPressedX - var26;
										var22.mouseY = MouseHandler.MouseHandler_lastPressedY - var11;
										var22.args = var9.onClick;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3762 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1070 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3762 && !var36) {
									var9.field3762 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1070 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.field729.addFirst(var22);
									}
								}

								if (var36 && var9.onHold != null) {
									var22 = new ScriptEvent();
									var22.field1070 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onHold;
									Client.scriptEvents.addFirst(var22);
								}

								if (!var9.field3761 && var35) {
									var9.field3761 = true;
									if (var9.onMouseOver != null) {
										var22 = new ScriptEvent();
										var22.field1070 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseOver;
										Client.scriptEvents.addFirst(var22);
									}
								}

								if (var9.field3761 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1070 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3761 && !var35) {
									var9.field3761 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1070 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onMouseLeave;
										Client.field729.addFirst(var22);
									}
								}

								if (var9.onTimer != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onTimer;
									Client.field728.addFirst(var22);
								}

								ScriptEvent var25;
								int var37;
								int var39;
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3748) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3748 <= 32) {
										label826:
										for (var39 = var9.field3748; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label826;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3748 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field686 > var9.field3675) {
									if (var9.invTransmitTriggers != null && Client.field686 - var9.field3675 <= 32) {
										label802:
										for (var39 = var9.field3675; var39 < Client.field686; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label802;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3675 = Client.field686;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3766) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3766 <= 32) {
										label778:
										for (var39 = var9.field3766; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label778;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3766 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3763 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field763 > var9.field3763 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field719 > var9.field3763 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field553 > var9.field3763 && var9.field3739 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3739;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field622 > var9.field3763 && var9.field3740 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3740;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field721 > var9.field3763 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field723 > var9.field3763 && var9.field3746 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3746;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field724 > var9.field3763 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3763 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field752; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field754[var39];
										var32.keyPressed = Client.field753[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3618 != null) {
									var38 = Client.field750.method4177();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3618;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field3635 != null) {
									var38 = Client.field750.method4154();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3635;
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
									WorldMapScaleHandler.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									WorldMapScaleHandler.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								DelayFadeTask.field4519 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								class143.method3138(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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
										if (var30.field1070) {
											var30.remove();
											var30.widget.field3761 = false;
										}
									}

									if (class130.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										class89.addCancelMenuEntry();
									}
								}

								class10.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("oi")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/awt/datatransfer/Clipboard;",
		garbageValue = "-2056572724"
	)
	public static Clipboard method3153() {
		return TileItem.client.method478();
	}
}
