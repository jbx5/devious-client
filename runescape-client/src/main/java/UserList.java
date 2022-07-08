import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import java.util.Arrays;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("nq")
@Implements("UserList")
public abstract class UserList {
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 909905761)
	static int field4319;

	@ObfuscatedName("gj")
	@ObfuscatedGetter(longValue = 4805265675401059469L)
	static long field4320;

	@ObfuscatedName("y")
	@ObfuscatedGetter(intValue = -7454885)
	@Export("capacity")
	final int capacity;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 790121473)
	@Export("size")
	int size;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "[Lne;")
	@Export("array")
	User[] array;

	@ObfuscatedName("t")
	@Export("usernamesMap")
	HashMap usernamesMap;

	@ObfuscatedName("z")
	@Export("previousUsernamesMap")
	HashMap previousUsernamesMap;

	@ObfuscatedName("r")
	@Export("comparator")
	Comparator comparator;

	UserList(int var1) {
		this.size = 0;
		this.comparator = null;
		this.capacity = var1;
		this.array = this.newTypedArray(var1);
		this.usernamesMap = new HashMap(var1 / 8);
		this.previousUsernamesMap = new HashMap(var1 / 8);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(S)Lne;", garbageValue = "-7122")
	@Export("newInstance")
	abstract User newInstance();

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)[Lne;", garbageValue = "77510907")
	@Export("newTypedArray")
	abstract User[] newTypedArray(int var1);

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1093942076")
	@Export("clear")
	public void clear() {
		this.size = 0;
		Arrays.fill(this.array, ((Object) (null)));
		this.usernamesMap.clear();
		this.previousUsernamesMap.clear();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1536599093")
	@Export("getSize")
	public int getSize() {
		return this.size;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "-84")
	@Export("isFull")
	public boolean isFull() {
		return this.capacity == this.size;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(Lqa;I)Z", garbageValue = "158740231")
	@Export("contains")
	public boolean contains(Username var1) {
		if (!var1.hasCleanName()) {
			return false;
		} else {
			return this.usernamesMap.containsKey(var1) ? true : this.previousUsernamesMap.containsKey(var1);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(Lqa;I)Lne;", garbageValue = "-1825895379")
	@Export("getByUsername")
	public User getByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		return var2 != null ? var2 : this.getByPreviousUsername(var1);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(Lqa;I)Lne;", garbageValue = "-1911478952")
	@Export("getByCurrentUsername")
	User getByCurrentUsername(Username var1) {
		return !var1.hasCleanName() ? null : ((User) (this.usernamesMap.get(var1)));
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(Lqa;I)Lne;", garbageValue = "-1437986613")
	@Export("getByPreviousUsername")
	User getByPreviousUsername(Username var1) {
		return !var1.hasCleanName() ? null : ((User) (this.previousUsernamesMap.get(var1)));
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(Lqa;I)Z", garbageValue = "1135653093")
	@Export("removeByUsername")
	public final boolean removeByUsername(Username var1) {
		User var2 = this.getByCurrentUsername(var1);
		if (var2 == null) {
			return false;
		} else {
			this.remove(var2);
			return true;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(Lne;B)V", garbageValue = "6")
	@Export("remove")
	final void remove(User var1) {
		int var2 = this.indexOf(var1);
		if (var2 != -1) {
			this.arrayRemove(var2);
			this.mapRemove(var1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(Lqa;I)Lne;", garbageValue = "-54334639")
	@Export("addLastNoPreviousUsername")
	User addLastNoPreviousUsername(Username var1) {
		return this.addLast(var1, ((Username) (null)));
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(Lqa;Lqa;I)Lne;", garbageValue = "1549647050")
	@Export("addLast")
	User addLast(Username var1, Username var2) {
		if (this.getByCurrentUsername(var1) != null) {
			throw new IllegalStateException();
		} else {
			User var3 = this.newInstance();
			var3.set(var1, var2);
			this.arrayAddLast(var3);
			this.mapPut(var3);
			return var3;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(II)Lne;", garbageValue = "487901750")
	@Export("get")
	public final User get(int var1) {
		if (var1 >= 0 && var1 < this.size) {
			return this.array[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1528140588")
	@Export("sort")
	public final void sort() {
		if (this.comparator == null) {
			Arrays.sort(this.array, 0, this.size);
		} else {
			Arrays.sort(this.array, 0, this.size, this.comparator);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(Lne;Lqa;Lqa;I)V", garbageValue = "1207607045")
	@Export("changeName")
	final void changeName(User var1, Username var2, Username var3) {
		this.mapRemove(var1);
		var1.set(var2, var3);
		this.mapPut(var1);
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(Lne;I)I", garbageValue = "-125620587")
	@Export("indexOf")
	final int indexOf(User var1) {
		for (int var2 = 0; var2 < this.size; ++var2) {
			if (this.array[var2] == var1) {
				return var2;
			}
		}
		return -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(Lne;S)V", garbageValue = "-8938")
	@Export("mapRemove")
	final void mapRemove(User var1) {
		if (var1.previousUsername != null) {
			this.previousUsernamesMap.remove(var1.previousUsername);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(Lne;I)V", garbageValue = "-133766134")
	@Export("arrayAddLast")
	final void arrayAddLast(User var1) {
		this.array[++this.size - 1] = var1;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(Lne;I)V", garbageValue = "-657827654")
	@Export("mapPut")
	final void mapPut(User var1) {
		this.usernamesMap.put(var1.username, var1);
		if (var1.previousUsername != null) {
			User var2 = ((User) (this.previousUsernamesMap.put(var1.previousUsername, var1)));
			if (var2 != null && var2 != var1) {
				var2.previousUsername = null;
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1804205416")
	@Export("arrayRemove")
	final void arrayRemove(int var1) {
		--this.size;
		if (var1 < this.size) {
			System.arraycopy(this.array, var1 + 1, this.array, var1, this.size - var1);
		}
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "8")
	@Export("removeComparator")
	public final void removeComparator() {
		this.comparator = null;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;B)V", garbageValue = "8")
	@Export("addComparator")
	public final void addComparator(Comparator var1) {
		if (this.comparator == null) {
			this.comparator = var1;
		} else if (this.comparator instanceof AbstractUserComparator) {
			((AbstractUserComparator) (this.comparator)).addComparator(var1);
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(ILbi;ZI)I", garbageValue = "-1639564322")
	static int method6754(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 6600) {
			var3 = PacketWriter.Client_plane;
			int var15 = (class101.localPlayer.x >> 7) + class28.baseX;
			int var8 = (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY;
			GrandExchangeOfferAgeComparator.getWorldMap().method7192(var3, var15, var8, true);
			return 1;
		} else {
			WorldMapArea var9;
			if (var0 == ScriptOpcodes.WORLDMAP_GETMAPNAME) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				String var16 = "";
				var9 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3);
				if (var9 != null) {
					var16 = var9.getExternalName();
				}
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var16;
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETMAP) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				GrandExchangeOfferAgeComparator.getWorldMap().setCurrentMapAreaId(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_GETZOOM) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getZoomLevel();
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_SETZOOM) {
				var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
				GrandExchangeOfferAgeComparator.getWorldMap().setZoomPercentage(var3);
				return 1;
			} else if (var0 == ScriptOpcodes.WORLDMAP_ISLOADED) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (GrandExchangeOfferAgeComparator.getWorldMap().isCacheLoaded()) ? 1 : 0;
				return 1;
			} else {
				Coord var14;
				if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
					GrandExchangeOfferAgeComparator.getWorldMap().setWorldMapPositionTarget(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTODISPLAYCOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
					GrandExchangeOfferAgeComparator.getWorldMap().setWorldMapPositionTargetInstant(var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
					GrandExchangeOfferAgeComparator.getWorldMap().jumpToSourceCoord(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_JUMPTOSOURCECOORD_INSTANT) {
					var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
					GrandExchangeOfferAgeComparator.getWorldMap().jumpToSourceCoordInstant(var14.plane, var14.x, var14.y);
					return 1;
				} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYPOSITION) {
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayX();
					Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayY();
					return 1;
				} else {
					WorldMapArea var11;
					if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGORIGIN) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getOrigin().packed();
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGSIZE) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var11.getRegionHighX() - var11.getRegionLowX() + 1) * 64;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var11.getRegionHighY() - var11.getRegionLowY() + 1) * 64;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGBOUNDS) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getRegionLowX() * 64;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getRegionLowY() * 64;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getRegionHighX() * 64 + 64 - 1;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getRegionHighY() * 64 + 64 - 1;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCONFIGZOOM) {
						var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3);
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getZoom();
						}
						return 1;
					} else if (var0 == 6615) {
						var14 = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayCoord();
						if (var14 == null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
						} else {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var14.x;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var14.y;
						}
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETCURRENTMAP) {
						Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().currentMapAreaId();
						return 1;
					} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISPLAYCOORD) {
						var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
						var11 = GrandExchangeOfferAgeComparator.getWorldMap().getCurrentMapArea();
						if (var11 == null) {
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
							Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
							return 1;
						} else {
							int[] var12 = var11.position(var14.plane, var14.x, var14.y);
							if (var12 == null) {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
							} else {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var12[0];
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var12[1];
							}
							return 1;
						}
					} else {
						Coord var5;
						if (var0 == 6618) {
							var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
							var11 = GrandExchangeOfferAgeComparator.getWorldMap().getCurrentMapArea();
							if (var11 == null) {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
								return 1;
							} else {
								var5 = var11.coord(var14.x, var14.y);
								if (var5 == null) {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.packed();
								}
								return 1;
							}
						} else {
							Coord var10;
							if (var0 == 6619) {
								class446.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]);
								ServerPacket.method5210(var3, var10, false);
								return 1;
							} else if (var0 == 6620) {
								class446.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]);
								ServerPacket.method5210(var3, var10, true);
								return 1;
							} else if (var0 == ScriptOpcodes.WORLDMAP_COORDINMAP) {
								class446.Interpreter_intStackSize -= 2;
								var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
								var10 = new Coord(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]);
								var9 = GrandExchangeOfferAgeComparator.getWorldMap().getMapArea(var3);
								if (var9 == null) {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
									return 1;
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (var9.containsCoord(var10.plane, var10.x, var10.y)) ? 1 : 0;
									return 1;
								}
							} else if (var0 == ScriptOpcodes.WORLDMAP_GETSIZE) {
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayWith();
								Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = GrandExchangeOfferAgeComparator.getWorldMap().getDisplayHeight();
								return 1;
							} else if (var0 == 6623) {
								var14 = new Coord(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
								var11 = GrandExchangeOfferAgeComparator.getWorldMap().mapAreaAtCoord(var14.plane, var14.x, var14.y);
								if (var11 == null) {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
								} else {
									Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var11.getId();
								}
								return 1;
							} else if (var0 == 6624) {
								GrandExchangeOfferAgeComparator.getWorldMap().setMaxFlashCount(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6625) {
								GrandExchangeOfferAgeComparator.getWorldMap().resetMaxFlashCount();
								return 1;
							} else if (var0 == 6626) {
								GrandExchangeOfferAgeComparator.getWorldMap().setCyclesPerFlash(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
								return 1;
							} else if (var0 == 6627) {
								GrandExchangeOfferAgeComparator.getWorldMap().resetCyclesPerFlash();
								return 1;
							} else {
								boolean var13;
								if (var0 == ScriptOpcodes.WORLDMAP_PERPETUALFLASH) {
									var13 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
									GrandExchangeOfferAgeComparator.getWorldMap().setPerpetualFlash(var13);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENT) {
									var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
									GrandExchangeOfferAgeComparator.getWorldMap().flashElement(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_FLASHELEMENTCATEGORY) {
									var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
									GrandExchangeOfferAgeComparator.getWorldMap().flashCategory(var3);
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_STOPCURRENTFLASHES) {
									GrandExchangeOfferAgeComparator.getWorldMap().stopCurrentFlashes();
									return 1;
								} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTS) {
									var13 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize] == 1;
									GrandExchangeOfferAgeComparator.getWorldMap().setElementsDisabled(var13);
									return 1;
								} else {
									boolean var7;
									if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENT) {
										class446.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1;
										GrandExchangeOfferAgeComparator.getWorldMap().disableElement(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_DISABLEELEMENTCATEGORY) {
										class446.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
										var7 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1] == 1;
										GrandExchangeOfferAgeComparator.getWorldMap().setCategoryDisabled(var3, var7);
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTS) {
										Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (GrandExchangeOfferAgeComparator.getWorldMap().getElementsDisabled()) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENT) {
										var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (GrandExchangeOfferAgeComparator.getWorldMap().isElementDisabled(var3)) ? 1 : 0;
										return 1;
									} else if (var0 == ScriptOpcodes.WORLDMAP_GETDISABLEELEMENTCATEGORY) {
										var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
										Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (GrandExchangeOfferAgeComparator.getWorldMap().isCategoryDisabled(var3)) ? 1 : 0;
										return 1;
									} else if (var0 == 6638) {
										class446.Interpreter_intStackSize -= 2;
										var3 = Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize];
										var10 = new Coord(Interpreter.Interpreter_intStack[class446.Interpreter_intStackSize + 1]);
										var5 = GrandExchangeOfferAgeComparator.getWorldMap().method7235(var3, var10);
										if (var5 == null) {
											Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
										} else {
											Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var5.packed();
										}
										return 1;
									} else {
										AbstractWorldMapIcon var6;
										if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_START) {
											var6 = GrandExchangeOfferAgeComparator.getWorldMap().iconStart();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}
											return 1;
										} else if (var0 == ScriptOpcodes.WORLDMAP_LISTELEMENT_NEXT) {
											var6 = GrandExchangeOfferAgeComparator.getWorldMap().iconNext();
											if (var6 == null) {
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
											} else {
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var6.getElement();
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var6.coord2.packed();
											}
											return 1;
										} else {
											WorldMapElement var4;
											if (var0 == ScriptOpcodes.MEC_TEXT) {
												var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
												var4 = class432.WorldMapElement_get(var3);
												if (var4.name == null) {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
												} else {
													Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var4.name;
												}
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_TEXTSIZE) {
												var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
												var4 = class432.WorldMapElement_get(var3);
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.textSize;
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_CATEGORY) {
												var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
												var4 = class432.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.category;
												}
												return 1;
											} else if (var0 == ScriptOpcodes.MEC_SPRITE) {
												var3 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
												var4 = class432.WorldMapElement_get(var3);
												if (var4 == null) {
													Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
												} else {
													Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = var4.sprite1;
												}
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENT) {
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class21.worldMapEvent.mapElement;
												return 1;
											} else if (var0 == 6698) {
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class21.worldMapEvent.coord1.packed();
												return 1;
											} else if (var0 == ScriptOpcodes.WORLDMAP_ELEMENTCOORD) {
												Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = class21.worldMapEvent.coord2.packed();
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