import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("do")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("ix")
	@ObfuscatedGetter(
		intValue = 1471485861
	)
	static int field1113;
	@ObfuscatedName("ac")
	@Export("args")
	Object[] args;
	@ObfuscatedName("ae")
	boolean field1098;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -626806317
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1773728275
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 434880321
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1119692151
	)
	int field1103;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lny;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1780301913
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -2119636903
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("al")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1731275839
	)
	int field1099;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1136293661
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "1412454261"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "390142797"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lny;I)V",
		garbageValue = "-1090191987"
	)
	public void method2511(Widget var1) {
		this.widget = var1;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "2132193276"
	)
	static int method2520(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = ClientPreferences.topLevelWorldView.plane;
			int var15 = (AddRequestTask.localPlayer.x >> 7) + ClientPreferences.topLevelWorldView.baseX;
			int var8 = (AddRequestTask.localPlayer.y >> 7) + ClientPreferences.topLevelWorldView.baseY;
			class147.getWorldMap().method9342(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				String var16 = "";
				var9 = class147.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				class147.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
				class147.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
					class147.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
					class147.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
					class147.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
					class147.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var11 = class147.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var11 = class147.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var11 = class147.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
						var11 = class147.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = class147.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
						var11 = class147.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
							var11 = class147.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class320.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
								class7.method56(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class320.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
								class7.method56(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class320.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
								var9 = class147.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
								var11 = class147.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								class147.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class147.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class147.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class147.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
									class147.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
									class147.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
									class147.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									class147.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize] == 1;
									class147.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class320.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1] == 1;
										class147.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class320.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1] == 1;
										class147.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class147.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class320.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
										var5 = class147.getWorldMap().method9395(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = class147.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = class147.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
												var4 = class142.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
												var4 = class142.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
												var4 = class142.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
												var4 = class142.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class162.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class162.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class162.worldMapEvent.coord2.packed();
												return 1;
											} else {
												return 2;
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
