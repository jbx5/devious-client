import java.util.ArrayList;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import netscape.javascript.JSObject;

@ObfuscatedName("cb")
@Implements("Interpreter")
public class Interpreter {
	@ObfuscatedName("ac")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("ai")
	@Export("Interpreter_arrayLengths")
	static int[] Interpreter_arrayLengths;
	@ObfuscatedName("az")
	@Export("Interpreter_arrays")
	static int[][] Interpreter_arrays;
	@ObfuscatedName("ap")
	@Export("Interpreter_intStack")
	static int[] Interpreter_intStack;
	@ObfuscatedName("af")
	@Export("Interpreter_stringStack")
	static String[] Interpreter_stringStack;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -808541663
	)
	@Export("Interpreter_frameDepth")
	static int Interpreter_frameDepth;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lcv;"
	)
	@Export("Interpreter_frames")
	static ScriptFrame[] Interpreter_frames;
	@ObfuscatedName("an")
	static int[] field888;
	@ObfuscatedName("ax")
	@Export("Interpreter_calendar")
	static java.util.Calendar Interpreter_calendar;
	@ObfuscatedName("ah")
	@Export("Interpreter_MONTHS")
	static final String[] Interpreter_MONTHS;
	@ObfuscatedName("ay")
	static boolean field893;
	@ObfuscatedName("aj")
	static boolean field887;
	@ObfuscatedName("av")
	static ArrayList field889;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -567436227
	)
	static int field890;
	@ObfuscatedName("bk")
	static final double field891;

	static {
		Interpreter_arrayLengths = new int[5];
		Interpreter_arrays = new int[5][5000];
		Interpreter_intStack = new int[1000];
		Interpreter_stringStack = new String[1000];
		Interpreter_frameDepth = 0;
		Interpreter_frames = new ScriptFrame[50];
		Interpreter_calendar = java.util.Calendar.getInstance();
		Interpreter_MONTHS = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		field893 = false;
		field887 = false;
		field889 = new ArrayList();
		field890 = 0;
		field891 = Math.log(2.0D);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-4"
	)
	public static int method2069(int var0) {
		long var2 = ViewportMouse.ViewportMouse_entityTags[var0];
		int var1 = (int)(var2 >>> 0 & 127L);
		return var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)[B",
		garbageValue = "-1581379999"
	)
	static byte[] method2049(String var0) {
		boolean var1 = true;
		boolean var2 = true;
		int var3 = "pattern".length();
		int var4 = 0;
		byte[] var5 = new byte[8];

		while (true) {
			int var6 = var4 + var3;
			if (var6 >= var0.length()) {
				return null;
			}

			char var7 = var0.charAt(var6);
			if (var7 == ':') {
				if (var4 == 0) {
					return null;
				}

				byte[] var8 = new byte[var4];
				System.arraycopy(var5, 0, var8, 0, var4);
				return var8;
			}

			if (var5.length == var4) {
				return null;
			}

			if (var7 >= '0' && var7 <= '9') {
				var7 = (char)(var7 - '0');
			} else {
				if (var7 < 'a' || var7 > 'z') {
					return null;
				}

				var7 = (char)(var7 - 'W');
			}

			var5[var4++] = (byte)var7;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-86107696"
	)
	static int method2067(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.LOGOUT) {
			Client.logoutTimer = 250;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-752327040"
	)
	static int method2068(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = HealthBar.Client_plane;
			int var15 = UrlRequester.baseX * 64 + (VarbitComposition.localPlayer.x >> 7);
			int var8 = class47.baseY * 64 + (VarbitComposition.localPlayer.y >> 7);
			class227.getWorldMap().method8505(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				String var16 = "";
				var9 = class227.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				class227.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
				class227.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
					class227.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
					class227.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
					class227.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
					class227.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getDisplayX();
					Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						var11 = class227.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						var11 = class227.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						var11 = class227.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
						var11 = class227.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = class227.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var14.x;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
						var11 = class227.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
							Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var12[0];
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
							var11 = class227.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								SoundCache.Interpreter_intStackSize -= 2;
								var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize];
								var10 = new Coord(Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
								class162.method3296(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								SoundCache.Interpreter_intStackSize -= 2;
								var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize];
								var10 = new Coord(Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
								class162.method3296(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								SoundCache.Interpreter_intStackSize -= 2;
								var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize];
								var10 = new Coord(Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
								var9 = class227.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getDisplayWith();
								Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
								var11 = class227.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								class227.getWorldMap().setMaxFlashCount(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class227.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class227.getWorldMap().setCyclesPerFlash(Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class227.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
									class227.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
									class227.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
									class227.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									class227.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize] == 1;
									class227.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										SoundCache.Interpreter_intStackSize -= 2;
										var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize];
										var7 = Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1] == 1;
										class227.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										SoundCache.Interpreter_intStackSize -= 2;
										var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize];
										var7 = Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1] == 1;
										class227.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
										Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
										Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = class227.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										SoundCache.Interpreter_intStackSize -= 2;
										var3 = Interpreter_intStack[SoundCache.Interpreter_intStackSize];
										var10 = new Coord(Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1]);
										var5 = class227.getWorldMap().method8552(var3, var10);
										if (var5 == null) {
											Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = class227.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = class227.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
												var4 = class138.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
												var4 = class138.WorldMapElement_get(var3);
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
												var4 = class138.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
												var4 = class138.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = GrandExchangeOfferOwnWorldComparator.worldMapEvent.coord2.packed();
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

	@ObfuscatedName("oy")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1076140788"
	)
	static void method2070(String var0) {
		MusicPatchPcmStream.field3478 = var0;

		try {
			String var1 = class219.client.getParameter(Integer.toString(18));
			String var2 = class219.client.getParameter(Integer.toString(13));
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2;
			String var5;
			if (var0.length() == 0) {
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				String var4 = var3 + "; Expires=";
				long var6 = GameEngine.method661() + 94608000000L;
				Calendar.Calendar_calendar.setTime(new Date(var6));
				int var8 = Calendar.Calendar_calendar.get(7);
				int var9 = Calendar.Calendar_calendar.get(5);
				int var10 = Calendar.Calendar_calendar.get(2);
				int var11 = Calendar.Calendar_calendar.get(1);
				int var12 = Calendar.Calendar_calendar.get(11);
				int var13 = Calendar.Calendar_calendar.get(12);
				int var14 = Calendar.Calendar_calendar.get(13);
				var5 = Calendar.DAYS_OF_THE_WEEK[var8 - 1] + ", " + var9 / 10 + var9 % 10 + "-" + Calendar.MONTH_NAMES_ENGLISH_GERMAN[0][var10] + "-" + var11 + " " + var12 / 10 + var12 % 10 + ":" + var13 / 10 + var13 % 10 + ":" + var14 / 10 + var14 % 10 + " GMT";
				var3 = var4 + var5 + "; Max-Age=" + 94608000L;
			}

			Client var16 = class219.client;
			var5 = "document.cookie=\"" + var3 + "\"";
			JSObject.getWindow(var16).eval(var5);
		} catch (Throwable var15) {
		}

	}
}
