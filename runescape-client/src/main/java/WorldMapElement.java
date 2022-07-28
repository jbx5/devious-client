import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("fe")
@Implements("WorldMapElement")
public class WorldMapElement extends DualNode {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("WorldMapElement_archive")
	static AbstractArchive WorldMapElement_archive;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "[Lfe;")
	@Export("WorldMapElement_cached")
	static WorldMapElement[] WorldMapElement_cached;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lia;")
	@Export("WorldMapElement_cachedSprites")
	public static EvictingDualNodeHashTable WorldMapElement_cachedSprites = new EvictingDualNodeHashTable(256);

	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = -1379795179)
	@Export("objectId")
	public final int objectId;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = 2113232637)
	@Export("sprite1")
	public int sprite1 = -1;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 2125463965)
	@Export("sprite2")
	int sprite2 = -1;

	@ObfuscatedName("j")
	@Export("name")
	public String name;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 959892129)
	public int field1825;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1991096547)
	@Export("textSize")
	public int textSize = 0;

	@ObfuscatedName("n")
	public boolean field1828 = true;

	@ObfuscatedName("x")
	public boolean field1836 = false;

	@ObfuscatedName("g")
	@Export("menuActions")
	public String[] menuActions = new String[5];

	@ObfuscatedName("p")
	@Export("menuTargetName")
	public String menuTargetName;

	@ObfuscatedName("b")
	int[] field1832;

	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = -305443147)
	int field1833 = Integer.MAX_VALUE;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = 363163641)
	int field1822 = Integer.MAX_VALUE;

	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = -1592769705)
	int field1834 = Integer.MIN_VALUE;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -429130067)
	int field1835 = Integer.MIN_VALUE;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Lfq;")
	@Export("horizontalAlignment")
	public HorizontalAlignment horizontalAlignment;

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "Lfd;")
	@Export("verticalAlignment")
	public VerticalAlignment verticalAlignment;

	@ObfuscatedName("s")
	int[] field1839;

	@ObfuscatedName("i")
	byte[] field1820;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -1303466775)
	@Export("category")
	public int category;

	WorldMapElement(int var1) {
		this.horizontalAlignment = HorizontalAlignment.HorizontalAlignment_centered;
		this.verticalAlignment = VerticalAlignment.VerticalAlignment_centered;
		this.category = -1;
		this.objectId = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lqw;I)V", garbageValue = "-1745475712")
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}
			this.decodeNext(var1, var2);
		} 
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lqw;II)V", garbageValue = "-1121502166")
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.sprite1 = var1.readNullableLargeSmart();
		} else if (var2 == 2) {
			this.sprite2 = var1.readNullableLargeSmart();
		} else if (var2 == 3) {
			this.name = var1.readStringCp1252NullTerminated();
		} else if (var2 == 4) {
			this.field1825 = var1.readMedium();
		} else if (var2 == 5) {
			var1.readMedium();
		} else if (var2 == 6) {
			this.textSize = var1.readUnsignedByte();
		} else {
			int var6;
			if (var2 == 7) {
				var6 = var1.readUnsignedByte();
				if ((var6 & 1) == 0) {
					this.field1828 = false;
				}
				if ((var6 & 2) == 2) {
					this.field1836 = true;
				}
			} else if (var2 == 8) {
				var1.readUnsignedByte();
			} else if (var2 >= 10 && var2 <= 14) {
				this.menuActions[var2 - 10] = var1.readStringCp1252NullTerminated();
			} else if (var2 == 15) {
				var6 = var1.readUnsignedByte();
				this.field1832 = new int[var6 * 2];
				int var4;
				for (var4 = 0; var4 < var6 * 2; ++var4) {
					this.field1832[var4] = var1.readShort();
				}
				var1.readInt();
				var4 = var1.readUnsignedByte();
				this.field1839 = new int[var4];
				int var5;
				for (var5 = 0; var5 < this.field1839.length; ++var5) {
					this.field1839[var5] = var1.readInt();
				}
				this.field1820 = new byte[var6];
				for (var5 = 0; var5 < var6; ++var5) {
					this.field1820[var5] = var1.readByte();
				}
			} else if (var2 != 16) {
				if (var2 == 17) {
					this.menuTargetName = var1.readStringCp1252NullTerminated();
				} else if (var2 == 18) {
					var1.readNullableLargeSmart();
				} else if (var2 == 19) {
					this.category = var1.readUnsignedShort();
				} else if (var2 == 21) {
					var1.readInt();
				} else if (var2 == 22) {
					var1.readInt();
				} else if (var2 == 23) {
					var1.readUnsignedByte();
					var1.readUnsignedByte();
					var1.readUnsignedByte();
				} else if (var2 == 24) {
					var1.readShort();
					var1.readShort();
				} else if (var2 == 25) {
					var1.readNullableLargeSmart();
				} else if (var2 == 28) {
					var1.readUnsignedByte();
				} else if (var2 == 29) {
					HorizontalAlignment[] var3 = new HorizontalAlignment[]{ HorizontalAlignment.field1903, HorizontalAlignment.HorizontalAlignment_centered, HorizontalAlignment.field1902 };
					this.horizontalAlignment = ((HorizontalAlignment) (class271.findEnumerated(var3, var1.readUnsignedByte())));
				} else if (var2 == 30) {
					VerticalAlignment[] var7 = new VerticalAlignment[]{ VerticalAlignment.field1952, VerticalAlignment.VerticalAlignment_centered, VerticalAlignment.field1953 };
					this.verticalAlignment = ((VerticalAlignment) (class271.findEnumerated(var7, var1.readUnsignedByte())));
				}
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "664605468")
	void method3380() {
		if (this.field1832 != null) {
			for (int var1 = 0; var1 < this.field1832.length; var1 += 2) {
				if (this.field1832[var1] < this.field1833) {
					this.field1833 = this.field1832[var1];
				} else if (this.field1832[var1] > this.field1834) {
					this.field1834 = this.field1832[var1];
				}
				if (this.field1832[var1 + 1] < this.field1822) {
					this.field1822 = this.field1832[var1 + 1];
				} else if (this.field1832[var1 + 1] > this.field1835) {
					this.field1835 = this.field1832[var1 + 1];
				}
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(ZI)Lqj;", garbageValue = "-2042273416")
	@Export("getSpriteBool")
	public SpritePixels getSpriteBool(boolean var1) {
		int var2 = this.sprite1;
		return this.getSprite(var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IS)Lqj;", garbageValue = "12042")
	@Export("getSprite")
	SpritePixels getSprite(int var1) {
		if (var1 < 0) {
			return null;
		} else {
			SpritePixels var2 = ((SpritePixels) (WorldMapElement_cachedSprites.get(((long) (var1)))));
			if (var2 != null) {
				return var2;
			} else {
				var2 = SoundSystem.SpriteBuffer_getSprite(WorldMapElement_archive, var1, 0);
				if (var2 != null) {
					WorldMapElement_cachedSprites.put(var2, ((long) (var1)));
				}
				return var2;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "22")
	@Export("getObjectId")
	public int getObjectId() {
		return this.objectId;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIB)I", garbageValue = "1")
	@Export("ItemContainer_getCount")
	static int ItemContainer_getCount(int var0, int var1) {
		ItemContainer var2 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var2 == null) {
			return 0;
		} else {
			return var1 >= 0 && var1 < var2.quantities.length ? var2.quantities[var1] : 0;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "(ILbc;ZI)I", garbageValue = "1220578687")
	static int method3356(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = FriendSystem.Client_plane;
			int var15 = class300.baseX * 8 + (class28.localPlayer.x >> 7);
			int var8 = Message.baseY * 64 + (class28.localPlayer.y >> 7);
			class273.getWorldMap().method7249(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				String var16 = "";
				var9 = class273.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}
				Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				class273.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
				class273.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class273.getWorldMap().isCacheLoaded()) ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
					class273.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
					class273.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
					class273.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
					class273.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var11 = class273.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var11 = class273.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var11 = class273.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
						var11 = class273.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getZoom();
						}
						return 1;
					} else if (var0 == 6615) {
						var14 = class273.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var14.y;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
						var11 = class273.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var12[1];
							}
							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
							var11 = class273.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.packed();
								}
								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								TaskHandler.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]);
								AttackOption.method2465(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								TaskHandler.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]);
								AttackOption.method2465(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								TaskHandler.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]);
								var9 = class273.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (var9.containsCoord(var10.plane, var10.x, var10.y)) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class273.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
								var11 = class273.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var11.getId();
								}
								return 1;
							} else if (var0 == 6624) {
								class273.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								class273.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								class273.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								class273.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
									class273.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
									class273.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
									class273.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									class273.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize] == 1;
									class273.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										TaskHandler.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1;
										class273.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										TaskHandler.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1] == 1;
										class273.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class273.getWorldMap().getElementsDisabled()) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class273.getWorldMap().isElementDisabled(var3)) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = (class273.getWorldMap().isCategoryDisabled(var3)) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										TaskHandler.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]);
										var5 = class273.getWorldMap().method7278(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var5.packed();
										}
										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = class273.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}
											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = class273.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}
											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
												var4 = TileItem.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var4.name;
												}
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
												var4 = TileItem.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
												var4 = TileItem.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.category;
												}
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize];
												var4 = TileItem.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var4.sprite1;
												}
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class83.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class83.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class83.worldMapEvent.coord2.packed();
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