import javax.imageio.ImageIO;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("br")
public class class30 {
	@ObfuscatedName("fk")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive9")
	static Archive archive9;

	static {
		ImageIO.setUseCache(false);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2073332753"
	)
	public static void method453() {
		class197.archive4.clear();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIIII[Lii;I)V",
		garbageValue = "717762756"
	)
	static final void method456(byte[] var0, int var1, int var2, int var3, int var4, CollisionMap[] var5) {
		int var7;
		int var8;
		for (int var6 = 0; var6 < 4; ++var6) {
			for (var7 = 0; var7 < 64; ++var7) {
				for (var8 = 0; var8 < 64; ++var8) {
					if (var7 + var1 > 0 && var7 + var1 < 103 && var8 + var2 > 0 && var8 + var2 < 103) {
						int[] var10000 = var5[var6].flags[var7 + var1];
						var10000[var2 + var8] &= -16777217;
					}
				}
			}
		}

		Buffer var12 = new Buffer(var0);

		for (var7 = 0; var7 < 4; ++var7) {
			for (var8 = 0; var8 < 64; ++var8) {
				for (int var9 = 0; var9 < 64; ++var9) {
					int var10 = var8 + var1;
					int var11 = var9 + var2;
					class136.loadTerrain(var12, var7, var10, var11, var3 + var10, var11 + var4, 0);
				}
			}
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "-1390389151"
	)
	static int method455(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = SecureUrlRequester.Client_plane;
			int var15 = HealthBarDefinition.baseX * 64 + (KeyHandler.localPlayer.x >> 7);
			int var8 = WorldMapScaleHandler.baseY * 64 + (KeyHandler.localPlayer.y >> 7);
			class132.getWorldMap().method9017(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				String var16 = "";
				var9 = class132.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				class132.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				class132.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
					class132.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
					class132.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
					class132.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
					class132.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var11 = class132.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var11 = class132.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var11 = class132.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						var11 = class132.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = class132.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
						var11 = class132.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
							var11 = class132.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								UserComparator6.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
								class36.method731(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								UserComparator6.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
								class36.method731(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								UserComparator6.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
								var9 = class132.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
								var11 = class132.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								class132.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class132.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class132.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class132.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
									class132.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
									class132.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
									class132.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									class132.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
									class132.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										UserComparator6.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1;
										class132.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										UserComparator6.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1] == 1;
										class132.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class132.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										UserComparator6.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1]);
										var5 = class132.getWorldMap().method9025(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = class132.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = class132.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
												var4 = ConcurrentMidiTask.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
												var4 = ConcurrentMidiTask.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
												var4 = ConcurrentMidiTask.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
												var4 = ConcurrentMidiTask.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Interpreter.worldMapEvent.coord2.packed();
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
