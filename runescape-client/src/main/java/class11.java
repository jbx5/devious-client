import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
@ObfuscatedName("a")
class class11 implements TlsAuthentication {
	@ObfuscatedName("uc")
	@ObfuscatedSignature(descriptor = "Lnk;")
	@Export("masterDisk")
	static ArchiveDisk masterDisk;

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "Lnh;")
	static Bounds field60;

	@ObfuscatedSignature(descriptor = "Lu;")
	final class13 this$2;

	@ObfuscatedSignature(descriptor = "(Lu;)V")
	class11(class13 var1) {
		this.this$2 = var1;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();
			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}
			this.this$2.this$1.field70 = ((java.security.cert.Certificate[]) ((java.security.cert.Certificate[]) (var3.toArray(new java.security.cert.Certificate[0]))));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;", garbageValue = "-2079417313")
	public static String method108(CharSequence var0) {
		int var1 = var0.length();
		StringBuilder var2 = new StringBuilder(var1);
		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if ((var4 < 'a' || var4 > 'z') && (var4 < 'A' || var4 > 'Z') && (var4 < '0' || var4 > '9') && var4 != '.' && var4 != '-' && var4 != '*' && var4 != '_') {
				if (var4 == ' ') {
					var2.append('+');
				} else {
					byte var5 = class300.charToByteCp1252(var4);
					var2.append('%');
					int var6 = var5 >> 4 & 15;
					if (var6 >= 10) {
						var2.append(((char) (var6 + 55)));
					} else {
						var2.append(((char) (var6 + 48)));
					}
					var6 = var5 & 15;
					if (var6 >= 10) {
						var2.append(((char) (var6 + 55)));
					} else {
						var2.append(((char) (var6 + 48)));
					}
				}
			} else {
				var2.append(var4);
			}
		}
		return var2.toString();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(ILbz;ZI)I", garbageValue = "-778238321")
	static int method104(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = class268.Client_plane;
			int var15 = Decimator.baseX * 8 + (ScriptFrame.localPlayer.x >> 7);
			int var8 = class7.baseY * 64 + (ScriptFrame.localPlayer.y >> 7);
			class65.getWorldMap().method7130(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				String var16 = "";
				var9 = class65.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}
				Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class65.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
				class65.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class65.getWorldMap().isCacheLoaded()) ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					class65.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					class65.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					class65.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
					class65.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var11 = class65.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var11 = class65.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var11 = class65.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
						var11 = class65.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var11.getZoom();
						}
						return 1;
					} else if (var0 == 6615) {
						var14 = class65.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var14.y;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
						var11 = class65.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var12[1];
							}
							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
							var11 = class65.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var5.packed();
								}
								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								User.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
								class18.method264(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								User.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
								class18.method264(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								User.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
								var9 = class65.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (var9.containsCoord(var10.plane, var10.x, var10.y)) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class65.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
								var11 = class65.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var11.getId();
								}
								return 1;
							} else if (var0 == 6624) {
								class65.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class65.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class65.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class65.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
									class65.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
									class65.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
									class65.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									class65.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize] == 1;
									class65.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										User.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1] == 1;
										class65.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										User.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1] == 1;
										class65.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class65.getWorldMap().getElementsDisabled()) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class65.getWorldMap().isElementDisabled(var3)) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = (class65.getWorldMap().isCategoryDisabled(var3)) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										User.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[User.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[User.Interpreter_intStackSize + 1]);
										var5 = class65.getWorldMap().method7174(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var5.packed();
										}
										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = class65.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}
											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = class65.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}
											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
												var4 = EnumComposition.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++UserComparator8.Interpreter_stringStackSize - 1] = var4.name;
												}
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
												var4 = EnumComposition.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
												var4 = EnumComposition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.category;
												}
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--User.Interpreter_intStackSize];
												var4 = EnumComposition.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = var4.sprite1;
												}
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class160.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class160.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++User.Interpreter_intStackSize - 1] = class160.worldMapEvent.coord2.packed();
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