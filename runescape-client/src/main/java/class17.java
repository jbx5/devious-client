import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("au")
class class17 implements SSLSession {
	@ObfuscatedName("at")
	static int[][] field84;
	@ObfuscatedName("jp")
	@Export("xteaKeys")
	static int[][] xteaKeys;
	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "Lvc;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ms")
	@ObfuscatedSignature(
		descriptor = "Lde;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 926924483
	)
	static int field86;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Laq;"
	)
	final SecureRandomSSLSocket this$1;

	@ObfuscatedSignature(
		descriptor = "(Laq;)V"
	)
	class17(SecureRandomSSLSocket var1) {
		this.this$1 = var1;
	}

	public byte[] getId() {
		throw new UnsupportedOperationException();
	}

	public String getCipherSuite() {
		throw new UnsupportedOperationException();
	}

	public long getLastAccessedTime() {
		throw new UnsupportedOperationException();
	}

	public Certificate[] getLocalCertificates() {
		throw new UnsupportedOperationException();
	}

	public Principal getLocalPrincipal() {
		throw new UnsupportedOperationException();
	}

	public int getPacketBufferSize() {
		throw new UnsupportedOperationException();
	}

	public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException {
		return null;
	}

	public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException {
		return this.this$1.field61;
	}

	public String getPeerHost() {
		throw new UnsupportedOperationException();
	}

	public int getPeerPort() {
		return 0;
	}

	public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
		return null;
	}

	public int getApplicationBufferSize() {
		return 0;
	}

	public SSLSessionContext getSessionContext() {
		throw new UnsupportedOperationException();
	}

	public Object getValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public String[] getValueNames() {
		throw new UnsupportedOperationException();
	}

	public String getProtocol() {
		throw new UnsupportedOperationException();
	}

	public void putValue(String var1, Object var2) {
		throw new UnsupportedOperationException();
	}

	public boolean isValid() {
		throw new UnsupportedOperationException();
	}

	public void invalidate() {
		throw new UnsupportedOperationException();
	}

	public void removeValue(String var1) {
		throw new UnsupportedOperationException();
	}

	public long getCreationTime() {
		throw new UnsupportedOperationException();
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "125"
	)
	static int method235(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class358.topLevelWorldView.plane;
			int var15 = (localPlayer.x >> 7) + class358.topLevelWorldView.baseX;
			int var8 = (localPlayer.y >> 7) + class358.topLevelWorldView.baseY;
			class142.getWorldMap().method9095(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				String var16 = "";
				var9 = class142.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}

				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				class142.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				class142.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().isCacheLoaded() ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
					class142.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
					class142.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
					class142.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
					class142.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var11 = class142.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var11 = class142.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var11 = class142.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						var11 = class142.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var11.getZoom();
						}

						return 1;
					} else if (var0 == 6615) {
						var14 = class142.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var14.y;
						}

						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
						var11 = class142.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var12[1];
							}

							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
							var11 = class142.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5.packed();
								}

								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class13.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
								class262.method5172(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class13.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
								class262.method5172(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class13.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
								var9 = class142.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var9.containsCoord(var10.plane, var10.x, var10.y) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
								var11 = class142.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var11.getId();
								}

								return 1;
							} else if (var0 == 6624) {
								class142.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class142.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class142.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class142.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
									class142.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
									class142.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
									class142.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									class142.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1;
									class142.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class13.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1] == 1;
										class142.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class13.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1] == 1;
										class142.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().getElementsDisabled() ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().isElementDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class142.getWorldMap().isCategoryDisabled(var3) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class13.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1]);
										var5 = class142.getWorldMap().method9083(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var5.packed();
										}

										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = class142.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = class142.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}

											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
												var4 = WorldMapElement.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4.name;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
												var4 = WorldMapElement.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
												var4 = WorldMapElement.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.category;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
												var4 = WorldMapElement.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4.sprite1;
												}

												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = SecureUrlRequester.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = SecureUrlRequester.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = SecureUrlRequester.worldMapEvent.coord2.packed();
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
