import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import net.runelite.mapping.Export;
@ObfuscatedName("hp")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lid;")
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);

	@ObfuscatedName("er")
	@ObfuscatedSignature(descriptor = "Llu;")
	static Archive field2708;

	@ObfuscatedName("ey")
	@ObfuscatedSignature(descriptor = "Llu;")
	@Export("archive15")
	static Archive archive15;

	@ObfuscatedName("w")
	@ObfuscatedGetter(intValue = -295948569)
	@Export("regionX")
	int regionX;

	@ObfuscatedName("z")
	@ObfuscatedGetter(intValue = 20438857)
	@Export("regionY")
	int regionY;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lhb;")
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;

	@ObfuscatedName("h")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;

	@ObfuscatedName("a")
	@ObfuscatedGetter(intValue = 1250201981)
	@Export("backgroundColor")
	int backgroundColor;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 112229007)
	@Export("pixelsPerTile")
	int pixelsPerTile;

	@ObfuscatedName("n")
	@Export("icon0List")
	List icon0List;

	@ObfuscatedName("x")
	@Export("iconMap")
	HashMap iconMap;

	@ObfuscatedName("g")
	@Export("fonts")
	final HashMap fonts;

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1;
		this.regionY = var2;
		this.worldMapData1List = new LinkedList();
		this.icon0List = new LinkedList();
		this.iconMap = new HashMap();
		this.backgroundColor = var3 | -16777216;
		this.fonts = var4;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "-25")
	void method4658(int var1, int var2, int var3) {
		SpritePixels var4 = Language.method6088(this.regionX, this.regionY, this.pixelsPerTile);
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Lhb;Ljava/util/List;I)V", garbageValue = "-1317342986")
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V", garbageValue = "2077127138")
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear();
		Iterator var3 = var1.iterator();
		while (var3.hasNext()) {
			WorldMapData_1 var4 = ((WorldMapData_1) (var3.next()));
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) {
				this.worldMapData1List.add(var4);
			}
		} 
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IIIILht;I)V", garbageValue = "1264264345")
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label75 : for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;
						for (int var11 = 0; var11 < var10.length; ++var11) {
							ObjectComposition var13;
							boolean var14;
							label66 : {
								WorldMapDecoration var12 = var10[var11];
								var13 = WorldMapDecoration.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;
									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = WorldMapDecoration.getObjectDefinition(var17);
										if (var18.mapIconId != -1) {
											var14 = true;
											break label66;
										}
									}
								} else if (var13.mapIconId != -1) {
									var14 = true;
									break label66;
								}
								var14 = false;
							}
							if (var14) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label75;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lgx;IIILht;I)V", garbageValue = "1287274151")
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, this.worldMapData_0.regionYLow * 4096 + var4);
		} else {
			WorldMapData_1 var8 = ((WorldMapData_1) (var5));
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var8.regionYLow * 4096 + var4 + var8.getChunkYLow() * 8);
		}
		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = TileItem.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}
		var9 = TileItem.WorldMapElement_get(((AbstractWorldMapIcon) (var10)).getElement());
		if (var9.field1828) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1833965606")
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator();
		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = ((AbstractWorldMapIcon) (var1.next()));
			if (var2 instanceof WorldMapIcon_1) {
				((WorldMapIcon_1) (var2)).init();
			}
		} 
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(Ljava/util/List;I)V", garbageValue = "2006591851")
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();
		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = ((WorldMapIcon_0) (var2.next()));
			if (TileItem.WorldMapElement_get(var3.element).field1828 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4687(var3.element));
				this.icon0List.add(var4);
			}
		} 
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1101661346")
	void method4657() {
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.reset();
		} else {
			Iterator var1 = this.worldMapData1List.iterator();
			while (var1.hasNext()) {
				WorldMapData_1 var2 = ((WorldMapData_1) (var1.next()));
				var2.reset();
			} 
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(Llc;I)Z", garbageValue = "-1367339058")
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear();
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.loadGeography(var1);
			if (this.worldMapData_0.isFullyLoaded()) {
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var2 = true;
			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) {
				var4 = ((WorldMapData_1) (var3.next()));
				var4.loadGeography(var1);
			}
			if (var2) {
				var3 = this.worldMapData1List.iterator();
				while (var3.hasNext()) {
					var4 = ((WorldMapData_1) (var3.next()));
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
				} 
			}
			return var2;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(ILib;[Lql;Llc;Llc;I)V", garbageValue = "366112318")
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			if (Language.method6088(this.regionX, this.regionY, var1) == null) {
				boolean var6 = true;
				var6 &= this.loadGeography(var4);
				int var8;
				if (this.worldMapData_0 != null) {
					var8 = this.worldMapData_0.groupId;
				} else {
					var8 = ((AbstractWorldMapData) (this.worldMapData1List.getFirst())).groupId;
				}
				var6 &= var5.tryLoadGroup(var8);
				if (var6) {
					byte[] var7 = var5.takeFileFlat(var8);
					WorldMapSprite var9 = Messages.method2574(var7);
					SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var10.setRaster();
					if (this.worldMapData_0 != null) {
						this.method4718(var2, var3, var9);
					} else {
						this.method4671(var2, var3, var9);
					}
					int var11 = this.regionX;
					int var12 = this.regionY;
					int var13 = this.pixelsPerTile;
					DemotingHashTable var14 = WorldMapRegion_cachedSprites;
					long var16 = ((long) (var13 << 16 | var11 << 8 | var12));
					var14.put(var10, var16, var10.pixels.length * 4);
					this.method4657();
				}
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(IIILjava/util/HashSet;I)V", garbageValue = "-205516615")
	void method4668(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}
		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;III)V", garbageValue = "2089735233")
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();
		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = TileItem.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 
		this.method4725(var1, var2, var3);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(Lib;[Lql;Lic;I)V", garbageValue = "1211128484")
	void method4718(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method4747(var4, var5, this.worldMapData_0, var1);
			}
		}
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method4672(var4, var5, this.worldMapData_0, var1, var2);
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Lib;[Lql;Lic;B)V", garbageValue = "8")
	void method4671(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();
		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));
			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method4747(var6, var7, var5, var1);
				}
			}
		} 
		var4 = this.worldMapData1List.iterator();
		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));
			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method4672(var6, var7, var5, var1, var2);
				}
			}
		} 
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(IILht;Lib;[Lql;B)V", garbageValue = "3")
	void method4672(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4677(var1, var2, var3);
		this.method4670(var1, var2, var3, var5);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(IILht;Lib;Lic;I)V", garbageValue = "909687502")
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if (var6 == -1 && var7 == -1) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}
		int var8 = 16711935;
		if (var7 != -1) {
			var8 = class270.method5223(var7, this.backgroundColor);
		}
		if (var7 > -1 && var3.field2796[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			int var9 = this.method4674(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method5092(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2796[0][var1][var2], var3.field2793[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IILht;Lib;I)V", garbageValue = "-1394777620")
	void method4747(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var7 = class270.method5223(var6, this.backgroundColor);
				if (var3.field2796[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method5092(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2796[var5][var1][var2], var3.field2793[var5][var1][var2]);
				}
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(IILht;Lic;B)I", garbageValue = "1")
	int method4674(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IILht;[Lql;I)V", garbageValue = "-1260699356")
	void method4670(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;
				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field3558.id && var11 <= WorldMapDecorationType.field3546.id;
					if (!var10) {
						int var13 = var9.decoration;
						boolean var12 = var13 == WorldMapDecorationType.field3560.id;
						if (!var12) {
							continue;
						}
					}
					ObjectComposition var14 = WorldMapDecoration.getObjectDefinition(var9.objectDefinitionId);
					if (var14.mapSceneId != -1) {
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) {
							var4[var14.mapSceneId].method8148(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
						} else {
							var4[var14.mapSceneId].method8148(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IILht;B)V", garbageValue = "-34")
	void method4677(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;
				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					int var10 = var8.decoration;
					boolean var9 = var10 >= WorldMapDecorationType.field3541.id && var10 <= WorldMapDecorationType.field3559.id || var10 == WorldMapDecorationType.field3542.id;
					if (var9) {
						ObjectComposition var11 = WorldMapDecoration.getObjectDefinition(var8.objectDefinitionId);
						int var12 = (var11.int1 != 0) ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field3541.id) {
							this.method4691(var1, var2, var8.rotation, var12);
						}
						if (var8.decoration == WorldMapDecorationType.field3540.id) {
							this.method4691(var1, var2, var8.rotation, -3355444);
							this.method4691(var1, var2, var8.rotation + 1, var12);
						}
						if (var8.decoration == WorldMapDecorationType.field3559.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}
							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}
							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}
						if (var8.decoration == WorldMapDecorationType.field3542.id) {
							int var13 = var8.rotation % 2;
							int var14;
							if (var13 == 0) {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12);
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12);
								}
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;II)V", garbageValue = "2016206561")
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = ((float) (var4)) / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();
		while (var7.hasNext()) {
			Map.Entry var8 = ((Map.Entry) (var7.next()));
			Coord var9 = ((Coord) (var8.getKey()));
			int var10 = ((int) (((float) (var1)) + var5 * ((float) (var9.x)) - var6));
			int var11 = ((int) (((float) (var2 + var4)) - ((float) (var9.y)) * var5 - var6));
			AbstractWorldMapIcon var12 = ((AbstractWorldMapIcon) (var8.getValue()));
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = TileItem.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method4724(var12, var10, var11, var5);
				}
			}
		} 
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;III)V", garbageValue = "1842261388")
	void method4725(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();
		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				WorldMapElement var6 = TileItem.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(Lfe;IIIIB)V", garbageValue = "40")
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false);
		if (var6 != null) {
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2);
			if (var4 % var5 < var5 / 2) {
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(Lir;IIFI)V", garbageValue = "-1971059873")
	void method4724(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = TileItem.WorldMapElement_get(var1.getElement());
		this.method4682(var5, var2, var3);
		this.method4683(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(Lfe;IIB)V", garbageValue = "-51")
	void method4682(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method4685(var4, var1.horizontalAlignment);
			int var6 = this.method4666(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(Lir;Lfe;IIFI)V", garbageValue = "-1263116902")
	void method4683(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method4533(var5)) {
				Font var7 = ((Font) (this.fonts.get(var6.size)));
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1825, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;IB)V", garbageValue = "-91")
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = ((float) (var4)) / 64.0F;
		Iterator var6 = this.icon0List.iterator();
		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = ((AbstractWorldMapIcon) (var6.next()));
			if (var7.hasValidElement()) {
				int var8 = var7.coord2.x % 64;
				int var9 = var7.coord2.y % 64;
				var7.screenX = ((int) (((float) (var1)) + ((float) (var8)) * var5));
				var7.screenY = ((int) (((float) (63 - var9)) * var5 + ((float) (var2))));
				if (!var3.contains(var7.getElement())) {
					this.method4724(var7, var7.screenX, var7.screenY, var5);
				}
			}
		} 
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(Lqj;Lfq;I)I", garbageValue = "264539152")
	int method4685(SpritePixels var1, HorizontalAlignment var2) {
		switch (var2.value) {
			case 1 :
				return -var1.subWidth / 2;
			case 2 :
				return 0;
			default :
				return -var1.subWidth;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(Lqj;Lfd;I)I", garbageValue = "-1006100043")
	int method4666(SpritePixels var1, VerticalAlignment var2) {
		switch (var2.value) {
			case 0 :
				return 0;
			case 1 :
				return -var1.subHeight / 2;
			default :
				return -var1.subHeight;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(II)Liy;", garbageValue = "712675174")
	WorldMapLabel method4687(int var1) {
		WorldMapElement var2 = TileItem.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(Lfe;I)Liy;", garbageValue = "2068502670")
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			WorldMapLabelSize var2 = WorldMapLabelSize.method4534(var1.textSize);
			if (var2 == null) {
				return null;
			} else {
				Font var3 = ((Font) (this.fonts.get(var2)));
				if (var3 == null) {
					return null;
				} else {
					int var4 = var3.lineCount(var1.name, 1000000);
					String[] var5 = new String[var4];
					var3.breakLines(var1.name, ((int[]) (null)), var5);
					int var6 = var5.length * var3.ascent / 2;
					int var7 = 0;
					String[] var8 = var5;
					for (int var9 = 0; var9 < var8.length; ++var9) {
						String var10 = var8[var9];
						int var11 = var3.stringWidth(var10);
						if (var11 > var7) {
							var7 = var11;
						}
					}
					return new WorldMapLabel(var1.name, var7, var6, var2);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(IIIIIB)Ljava/util/List;", garbageValue = "29")
	List method4689(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var3 + var2) {
				Iterator var7 = this.iconMap.values().iterator();
				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = ((AbstractWorldMapIcon) (var7.next()));
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
						var6.add(var8);
					}
				} 
				var7 = this.icon0List.iterator();
				while (var7.hasNext()) {
					var8 = ((AbstractWorldMapIcon) (var7.next()));
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
						var6.add(var8);
					}
				} 
				return var6;
			} else {
				return var6;
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(B)Ljava/util/List;", garbageValue = "1")
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "1509302758")
	void method4691(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}
		if (var3 == 1) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}
		if (var3 == 2) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}
		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)Ljava/lang/String;", garbageValue = "1")
	static String method4785() {
		StringBuilder var0 = new StringBuilder();
		Message var2;
		for (Iterator var1 = Messages.Messages_hashTable.iterator(); var1.hasNext(); var0.append(var2.text).append('\n')) {
			var2 = ((Message) (var1.next()));
			if (var2.sender != null && !var2.sender.isEmpty()) {
				var0.append(var2.sender).append(':');
			}
		}
		return var0.toString();
	}
}