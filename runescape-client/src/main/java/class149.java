


import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Export; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("es")
public class class149 {
	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-2047833702")

	static int method3081(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class160.Client_plane;
			int var15 = (class19.localPlayer.x >> 7) + ApproximateRouteStrategy.baseX;
			int var8 = (class19.localPlayer.y >> 7) + class250.baseY;
			StudioGame.getWorldMap().method7313(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				String var16 = "";
				var9 = StudioGame.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				StudioGame.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = StudioGame.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
				StudioGame.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (StudioGame.getWorldMap().isCacheLoaded()) ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
					StudioGame.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
					StudioGame.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
					StudioGame.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
					StudioGame.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = StudioGame.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = StudioGame.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var11 = StudioGame.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var11 = StudioGame.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((var11.getRegionHighX() - var11.getRegionLowX()) + 1) * 64;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((var11.getRegionHighY() - var11.getRegionLowY()) + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var11 = StudioGame.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((var11.getRegionHighX() * 64) + 64) - 1;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = ((var11.getRegionHighY() * 64) + 64) - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
						var11 = StudioGame.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = StudioGame.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var14.x;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = StudioGame.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
						var11 = StudioGame.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
							Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var12[0];
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
							var11 = StudioGame.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class295.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]);
								class263.method5204(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class295.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]);
								class263.method5204(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class295.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]);
								var9 = StudioGame.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (var9.containsCoord(var10.plane, var10.x, var10.y)) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = StudioGame.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = StudioGame.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
								var11 = StudioGame.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								StudioGame.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								StudioGame.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								StudioGame.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								StudioGame.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
									StudioGame.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
									StudioGame.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
									StudioGame.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									StudioGame.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
									StudioGame.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class295.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1;
										StudioGame.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class295.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1] == 1;
										StudioGame.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (StudioGame.getWorldMap().getElementsDisabled()) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (StudioGame.getWorldMap().isElementDisabled(var3)) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = (StudioGame.getWorldMap().isCategoryDisabled(var3)) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class295.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1]);
										var5 = StudioGame.getWorldMap().method7342(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = StudioGame.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = StudioGame.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
												var4 = class19.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
												var4 = class19.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
												var4 = class19.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
												var4 = class19.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class293.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class293.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = class293.worldMapEvent.coord2.packed();
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

	@ObfuscatedName("bw")
	@ObfuscatedSignature(descriptor = 
	"([BB)[B", garbageValue = 
	"47")

	@Export("decompressBytes")
	static final byte[] decompressBytes(byte[] var0) {
		Buffer var1 = new Buffer(var0);
		int var2 = var1.readUnsignedByte();
		int var3 = var1.readInt();
		if ((var3 < 0) || ((AbstractArchive.field3960 != 0) && (var3 > AbstractArchive.field3960))) {
			throw new RuntimeException();
		} else if (var2 == 0) {
			byte[] var6 = new byte[var3];
			var1.readBytes(var6, 0, var3);
			return var6;
		} else {
			int var4 = var1.readInt();
			if ((var4 >= 0) && ((AbstractArchive.field3960 == 0) || (var4 <= AbstractArchive.field3960))) {
				byte[] var5 = new byte[var4];
				if (var2 == 1) {
					BZip2Decompressor.BZip2Decompressor_decompress(var5, var4, var0, var3, 9);
				} else {
					AbstractArchive.gzipDecompressor.decompress(var1, var5);
				}

				return var5;
			} else {
				throw new RuntimeException();
			}
		}
	}

	@ObfuscatedName("ef")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"369546615")

	static boolean method3079() {
		if ((Client.archiveLoaders != null) && (Client.archiveLoadersDone < Client.archiveLoaders.size())) {
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) {
				ArchiveLoader var0 = ((ArchiveLoader) (Client.archiveLoaders.get(Client.archiveLoadersDone)));
				if (!var0.isLoaded()) {
					return false;
				}

				++Client.archiveLoadersDone;
			} 

			return true;
		} else {
			return true;
		}
	}
}