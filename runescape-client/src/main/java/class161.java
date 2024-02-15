import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gn")
public abstract class class161 extends Node {
	@ObfuscatedName("by")
	protected static String field1781;

	class161() {
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Luq;I)V",
		garbageValue = "1174207862"
	)
	abstract void vmethod3504(Buffer var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgg;I)V",
		garbageValue = "378355771"
	)
	abstract void vmethod3509(ClanChannel var1);

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "85"
	)
	static int method3440(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class60.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + WorldMapData_1.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
					long var14 = (11745L + (long)var11) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class60.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ServerPacket.method6054(PlayerType.compareStrings(Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1], WorldMapCacheName.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var12 = KeyHandler.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							var12 = KeyHandler.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class60.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BoundaryObject.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = BoundaryObject.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class154.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class237.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							StringBuilder var16 = new StringBuilder(var3.length());
							boolean var18 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var18 = true;
								} else if (var7 == '>') {
									var18 = false;
								} else if (!var18) {
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class60.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class60.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class60.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 2];
							if (VarpDefinition.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(VarpDefinition.localPlayer.appearance.field3664) {
								case 0:
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class60.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class60.Interpreter_stringStackSize + 1];
					if (VarpDefinition.localPlayer.appearance != null && VarpDefinition.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class60.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(Lmn;B)V",
		garbageValue = "-42"
	)
	static void method3436(PacketBufferNode var0) {
		var0.packetBuffer.writeIntME(Client.field556.hash);
		var0.packetBuffer.writeIntME(HttpRequestTask.archive2.hash);
		var0.packetBuffer.writeIntLE(class154.field1724.hash);
		var0.packetBuffer.writeIntLE(PlayerCompositionColorTextureOverride.field1832.hash);
		var0.packetBuffer.writeIntME(class362.field3958.hash);
		var0.packetBuffer.writeIntIME(WorldMapSectionType.archive12.hash);
		var0.packetBuffer.writeIntLE(ScriptFrame.archive4.hash);
		var0.packetBuffer.writeInt(0);
		var0.packetBuffer.writeIntLE(WorldMapSectionType.field2612.hash);
		var0.packetBuffer.writeInt(Varcs.field1417.hash);
		var0.packetBuffer.writeIntIME(SpotAnimationDefinition.field2045.hash);
		var0.packetBuffer.writeIntIME(SecureRandomSSLSocket.field52.hash);
		var0.packetBuffer.writeInt(class198.field2070.hash);
		var0.packetBuffer.writeIntIME(JagexCache.archive9.hash);
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "([Lng;IIIIIIIB)V",
		garbageValue = "-27"
	)
	@Export("updateInterface")
	static final void updateInterface(Widget[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		for (int var8 = 0; var8 < var0.length; ++var8) {
			Widget var9 = var0[var8];
			if (var9 != null && var9.parentId == var1 && (var9.method6803() || class429.getWidgetFlags(var9) != 0 || var9 == Client.clickedWidgetParent)) {
				if (var9.isIf3) {
					if (PcmPlayer.isComponentHidden(var9)) {
						continue;
					}
				} else if (var9.type == 0 && var9 != class134.mousedOverWidgetIf1 && PcmPlayer.isComponentHidden(var9)) {
					continue;
				}

				if (var9.type == 11) {
					if (var9.method6820(ArchiveLoader.widgetDefinition, InvDefinition.urlRequester)) {
						if (var9.method6895()) {
							UserComparator5.invalidateWidget(var9);
							class167.revalidateWidgetScroll(var9.children, var9, true);
							var9.method6819().method4161().method4262(3, var9.method6819().method4141());
						}

						if (var9.field3737 != null) {
							ScriptEvent var10 = new ScriptEvent();
							var10.widget = var9;
							var10.args = var9.field3737;
							Client.scriptEvents.addFirst(var10);
						}
					}
				} else if (var9.type == 12 && var9.method6828(ArchiveLoader.widgetDefinition)) {
					UserComparator5.invalidateWidget(var9);
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
					Client.field810 = true;
					Client.field640 = var26;
					Client.field720 = var11;
				}

				boolean var34 = false;
				if (var9.field3808) {
					switch(Client.field575) {
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
										var27.widget.field3863 = false;
									}
								}

								class325.method6326();
								if (WorldMapLabelSize.widgetDragDuration == 0) {
									Client.clickedWidget = null;
									Client.clickedWidgetParent = null;
								}

								if (!Client.isMenuOpen) {
									class255.addCancelMenuEntry();
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
							class223.addSceneMenuOptions(var17, var18, var12, var13);
						}
					} else if (var9.contentType == 1338) {
						GrandExchangeEvent.checkIfMinimapClicked(var9, var26, var11);
					} else {
						if (var9.contentType == 1400) {
							Tiles.worldMap.onCycle(MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y, var35, var26, var11, var9.width, var9.height);
						}

						if (!Client.isMenuOpen && var35) {
							if (var9.contentType == 1400) {
								Tiles.worldMap.addElementMenuOptions(var26, var11, var9.width, var9.height, var17, var18);
							} else {
								NpcOverrides.Widget_addToMenu(var9);
							}
						}

						boolean var21;
						int var23;
						if (var34) {
							for (int var20 = 0; var20 < var9.field3739.length; ++var20) {
								var21 = false;
								boolean var28 = false;
								if (!var21 && var9.field3739[var20] != null) {
									for (var23 = 0; var23 < var9.field3739[var20].length; ++var23) {
										boolean var24 = false;
										if (var9.field3871 != null) {
											var24 = Client.field792.method4466(var9.field3739[var20][var23]);
										}

										if (Login.method2193(var9.field3739[var20][var23]) || var24) {
											var21 = true;
											if (var9.field3871 != null && var9.field3871[var20] > Client.cycle) {
												break;
											}

											byte var33 = var9.field3806[var20][var23];
											if (var33 == 0 || ((var33 & 8) == 0 || !Client.field792.method4466(86) && !Client.field792.method4466(82) && !Client.field792.method4466(81)) && ((var33 & 2) == 0 || Client.field792.method4466(86)) && ((var33 & 1) == 0 || Client.field792.method4466(82)) && ((var33 & 4) == 0 || Client.field792.method4466(81))) {
												var28 = true;
												break;
											}
										}
									}
								}

								if (var28) {
									if (var20 < 10) {
										class185.widgetDefaultMenuAction(var20 + 1, var9.id, var9.childIndex, var9.itemId, "");
									} else if (var20 == 10) {
										GameObject.method5963();
										VarbitComposition.method3820(var9.id, var9.childIndex, TextureProvider.Widget_unpackTargetMask(class429.getWidgetFlags(var9)), var9.itemId);
										Client.selectedSpellActionName = UserComparator9.Widget_getSpellActionName(var9);
										if (Client.selectedSpellActionName == null) {
											Client.selectedSpellActionName = "null";
										}

										Client.selectedSpellName = var9.dataText + class370.colorStartTag(16777215);
									}

									var23 = var9.field3820[var20];
									if (var9.field3871 == null) {
										var9.field3871 = new int[var9.field3739.length];
									}

									if (var9.field3804 == null) {
										var9.field3804 = new int[var9.field3739.length];
									}

									if (var23 != 0) {
										if (var9.field3871[var20] == 0) {
											var9.field3871[var20] = var23 + Client.cycle + var9.field3804[var20];
										} else {
											var9.field3871[var20] = var23 + Client.cycle;
										}
									} else {
										var9.field3871[var20] = Integer.MAX_VALUE;
									}
								}

								if (!var21 && var9.field3871 != null) {
									var9.field3871[var20] = 0;
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
							if ((MouseHandler.MouseHandler_currentButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_currentButton == 4) && var35) {
								var36 = true;
							}

							var21 = false;
							if ((MouseHandler.MouseHandler_lastButton == 1 || !DbTableType.mouseCam && MouseHandler.MouseHandler_lastButton == 4) && MouseHandler.MouseHandler_lastPressedX >= var12 && MouseHandler.MouseHandler_lastPressedY >= var13 && MouseHandler.MouseHandler_lastPressedX < var14 && MouseHandler.MouseHandler_lastPressedY < var15) {
								var21 = true;
							}

							if (var21) {
								class27.clickWidget(var9, MouseHandler.MouseHandler_lastPressedX - var26, MouseHandler.MouseHandler_lastPressedY - var11);
							}

							if (var9.method6831()) {
								if (var21) {
									Client.field744.addFirst(new class227(0, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}

								if (var36) {
									Client.field744.addFirst(new class227(1, MouseHandler.MouseHandler_x - var26, MouseHandler.MouseHandler_y - var11, var9));
								}
							}

							if (var9.contentType == 1400) {
								Tiles.worldMap.method8903(var17, var18, var35 & var36, var35 & var21);
							}

							if (Client.clickedWidget != null && var9 != Client.clickedWidget && var35 && Decimator.method1103(class429.getWidgetFlags(var9))) {
								Client.draggedOnWidget = var9;
							}

							if (var9 == Client.clickedWidgetParent) {
								Client.field746 = true;
								Client.field765 = var26;
								Client.field774 = var11;
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

								if (!var9.field3864 && var21) {
									var9.field3864 = true;
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

								if (var9.field3864 && var36 && var9.onClickRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1095 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onClickRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3864 && !var36) {
									var9.field3864 = false;
									if (var9.onRelease != null) {
										var22 = new ScriptEvent();
										var22.field1095 = true;
										var22.widget = var9;
										var22.mouseX = MouseHandler.MouseHandler_x - var26;
										var22.mouseY = MouseHandler.MouseHandler_y - var11;
										var22.args = var9.onRelease;
										Client.scriptEvents3.addFirst(var22);
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

								if (!var9.field3863 && var35) {
									var9.field3863 = true;
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

								if (var9.field3863 && var35 && var9.onMouseRepeat != null) {
									var22 = new ScriptEvent();
									var22.field1095 = true;
									var22.widget = var9;
									var22.mouseX = MouseHandler.MouseHandler_x - var26;
									var22.mouseY = MouseHandler.MouseHandler_y - var11;
									var22.args = var9.onMouseRepeat;
									Client.scriptEvents.addFirst(var22);
								}

								if (var9.field3863 && !var35) {
									var9.field3863 = false;
									if (var9.onMouseLeave != null) {
										var22 = new ScriptEvent();
										var22.field1095 = true;
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
								if (var9.onVarTransmit != null && Client.changedVarpCount > var9.field3866) {
									if (var9.varTransmitTriggers != null && Client.changedVarpCount - var9.field3866 <= 32) {
										label835:
										for (var39 = var9.field3866; var39 < Client.changedVarpCount; ++var39) {
											var23 = Client.changedVarps[var39 & 31];

											for (var37 = 0; var37 < var9.varTransmitTriggers.length; ++var37) {
												if (var23 == var9.varTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onVarTransmit;
													Client.scriptEvents.addFirst(var25);
													break label835;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onVarTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3866 = Client.changedVarpCount;
								}

								if (var9.onInvTransmit != null && Client.field608 > var9.field3867) {
									if (var9.invTransmitTriggers != null && Client.field608 - var9.field3867 <= 32) {
										label811:
										for (var39 = var9.field3867; var39 < Client.field608; ++var39) {
											var23 = Client.changedItemContainers[var39 & 31];

											for (var37 = 0; var37 < var9.invTransmitTriggers.length; ++var37) {
												if (var23 == var9.invTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onInvTransmit;
													Client.scriptEvents.addFirst(var25);
													break label811;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onInvTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3867 = Client.field608;
								}

								if (var9.onStatTransmit != null && Client.changedSkillsCount > var9.field3831) {
									if (var9.statTransmitTriggers != null && Client.changedSkillsCount - var9.field3831 <= 32) {
										label787:
										for (var39 = var9.field3831; var39 < Client.changedSkillsCount; ++var39) {
											var23 = Client.changedSkills[var39 & 31];

											for (var37 = 0; var37 < var9.statTransmitTriggers.length; ++var37) {
												if (var23 == var9.statTransmitTriggers[var37]) {
													var25 = new ScriptEvent();
													var25.widget = var9;
													var25.args = var9.onStatTransmit;
													Client.scriptEvents.addFirst(var25);
													break label787;
												}
											}
										}
									} else {
										var22 = new ScriptEvent();
										var22.widget = var9;
										var22.args = var9.onStatTransmit;
										Client.scriptEvents.addFirst(var22);
									}

									var9.field3831 = Client.changedSkillsCount;
								}

								if (Client.chatCycle > var9.field3865 && var9.onChatTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onChatTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field732 > var9.field3865 && var9.onFriendTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onFriendTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field733 > var9.field3865 && var9.onClanTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onClanTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field734 > var9.field3865 && var9.field3841 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3841;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field735 > var9.field3865 && var9.field3730 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3730;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field736 > var9.field3865 && var9.onStockTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onStockTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field537 > var9.field3865 && var9.field3848 != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.field3848;
									Client.scriptEvents.addFirst(var22);
								}

								if (Client.field738 > var9.field3865 && var9.onMiscTransmit != null) {
									var22 = new ScriptEvent();
									var22.widget = var9;
									var22.args = var9.onMiscTransmit;
									Client.scriptEvents.addFirst(var22);
								}

								var9.field3865 = Client.cycleCntr;
								if (var9.onKey != null) {
									for (var39 = 0; var39 < Client.field706; ++var39) {
										ScriptEvent var32 = new ScriptEvent();
										var32.widget = var9;
										var32.keyTyped = Client.field768[var39];
										var32.keyPressed = Client.field660[var39];
										var32.args = var9.onKey;
										Client.scriptEvents.addFirst(var32);
									}
								}

								ScriptEvent var31;
								int[] var38;
								if (var9.field3837 != null) {
									var38 = Client.field792.method4434();

									for (var23 = 0; var23 < var38.length; ++var23) {
										var31 = new ScriptEvent();
										var31.widget = var9;
										var31.keyTyped = var38[var23];
										var31.args = var9.field3837;
										Client.scriptEvents.addFirst(var31);
									}
								}

								if (var9.field3838 != null) {
									var38 = Client.field792.method4435();

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
									class134.mousedOverWidgetIf1 = var0[var9.mouseOverRedirect];
								} else {
									class134.mousedOverWidgetIf1 = var9;
								}
							}

							if (var9.type == 8 && MouseHandler.MouseHandler_x >= var12 && MouseHandler.MouseHandler_y >= var13 && MouseHandler.MouseHandler_x < var14 && MouseHandler.MouseHandler_y < var15) {
								FontName.field5062 = var9;
							}

							if (var9.scrollHeight > var9.height) {
								Login.method2201(var9, var26 + var9.width, var11, var9.height, var9.scrollHeight, MouseHandler.MouseHandler_x, MouseHandler.MouseHandler_y);
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
											var30.widget.field3863 = false;
										}
									}

									if (WorldMapLabelSize.widgetDragDuration == 0) {
										Client.clickedWidget = null;
										Client.clickedWidgetParent = null;
									}

									if (!Client.isMenuOpen) {
										class255.addCancelMenuEntry();
									}
								}

								ClanSettings.updateRootInterface(var29.group, var12, var13, var14, var15, var26, var11);
							}
						}
					}
				}
			}
		}

	}
}
