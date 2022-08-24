import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import java.util.Map.Entry;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import net.runelite.mapping.Export;
@ObfuscatedName("hq")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lip;")
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 1762838535)
	@Export("regionX")
	int regionX;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 848398355)
	@Export("regionY")
	int regionY;

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lhu;")
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;

	@ObfuscatedName("o")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -634393379)
	@Export("backgroundColor")
	int backgroundColor;

	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 159236289)
	@Export("pixelsPerTile")
	int pixelsPerTile;

	@ObfuscatedName("a")
	@Export("icon0List")
	List icon0List;

	@ObfuscatedName("m")
	@Export("iconMap")
	HashMap iconMap;

	@ObfuscatedName("u")
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

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "2")
	void method4587(int var1, int var2, int var3) {
		int var5 = this.regionX;
		int var6 = this.regionY;
		int var7 = this.pixelsPerTile;
		SpritePixels var4 = ((SpritePixels) (WorldMapRegion_cachedSprites.get(WorldMapIcon_0.method4840(var5, var6, var7))));
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Lhu;Ljava/util/List;I)V", garbageValue = "-802355833")
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V", garbageValue = "-2119563453")
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIIILhc;I)V", garbageValue = "1355885748")
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label76 : for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;
						for (int var11 = 0; var11 < var10.length; ++var11) {
							ObjectComposition var13;
							boolean var14;
							label67 : {
								WorldMapDecoration var12 = var10[var11];
								var13 = FileSystem.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;
									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = FileSystem.getObjectDefinition(var17);
										if (var18.mapIconId != -1) {
											var14 = true;
											break label67;
										}
									}
								} else if (var13.mapIconId != -1) {
									var14 = true;
									break label67;
								}
								var14 = false;
							}
							if (var14) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label76;
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(Lgc;IIILhc;I)V", garbageValue = "-1167572618")
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
			var9 = EnumComposition.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}
		var9 = EnumComposition.WorldMapElement_get(((AbstractWorldMapIcon) (var10)).getElement());
		if (var9.field1820) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2022561952")
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

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/util/List;B)V", garbageValue = "48")
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();
		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = ((WorldMapIcon_0) (var2.next()));
			if (EnumComposition.WorldMapElement_get(var3.element).field1820 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4602(var3.element));
				this.icon0List.add(var4);
			}
		} 
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "84")
	void method4703() {
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Lls;I)Z", garbageValue = "-2124708956")
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

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(ILih;[Lqe;Lls;Lls;B)V", garbageValue = "17")
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			int var7 = this.regionX;
			int var8 = this.regionY;
			SpritePixels var6 = ((SpritePixels) (WorldMapRegion_cachedSprites.get(WorldMapIcon_0.method4840(var7, var8, var1))));
			if (var6 == null) {
				boolean var9 = true;
				var9 &= this.loadGeography(var4);
				int var11;
				if (this.worldMapData_0 != null) {
					var11 = this.worldMapData_0.groupId;
				} else {
					var11 = ((AbstractWorldMapData) (this.worldMapData1List.getFirst())).groupId;
				}
				var9 &= var5.tryLoadGroup(var11);
				if (var9) {
					byte[] var10 = var5.takeFileFlat(var11);
					WorldMapSprite var12 = ScriptEvent.method2063(var10);
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var13.setRaster();
					if (this.worldMapData_0 != null) {
						this.method4586(var2, var3, var12);
					} else {
						this.method4611(var2, var3, var12);
					}
					int var14 = this.regionX;
					int var15 = this.regionY;
					int var16 = this.pixelsPerTile;
					WorldMapRegion_cachedSprites.put(var13, WorldMapIcon_0.method4840(var14, var15, var16), var13.pixels.length * 4);
					this.method4703();
				}
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(IIILjava/util/HashSet;I)V", garbageValue = "-1599311865")
	void method4597(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}
		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;IIB)V", garbageValue = "46")
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();
		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = EnumComposition.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 
		this.method4704(var1, var2, var3);
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Lih;[Lqe;Lii;I)V", garbageValue = "2062922494")
	void method4586(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method4603(var4, var5, this.worldMapData_0, var1);
			}
		}
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method4664(var4, var5, this.worldMapData_0, var1, var2);
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(Lih;[Lqe;Lii;I)V", garbageValue = "-1735070362")
	void method4611(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();
		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));
			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method4603(var6, var7, var5, var1);
				}
			}
		} 
		var4 = this.worldMapData1List.iterator();
		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));
			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method4664(var6, var7, var5, var1, var2);
				}
			}
		} 
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IILhc;Lih;[Lqe;I)V", garbageValue = "1285903936")
	void method4664(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4689(var1, var2, var3);
		this.method4605(var1, var2, var3, var5);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(IILhc;Lih;Lii;I)V", garbageValue = "831500559")
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if (var6 == -1 && var7 == -1) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}
		int var8 = 16711935;
		if (var7 != -1) {
			var8 = GameEngine.method428(var7, this.backgroundColor);
		}
		if (var7 > -1 && var3.field2814[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			int var9 = this.method4604(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method5037(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2814[0][var1][var2], var3.field2808[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(IILhc;Lih;I)V", garbageValue = "-1273458561")
	void method4603(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var7 = GameEngine.method428(var6, this.backgroundColor);
				if (var3.field2814[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method5037(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2814[var5][var1][var2], var3.field2808[var5][var1][var2]);
				}
			}
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IILhc;Lii;I)I", garbageValue = "-1846005797")
	int method4604(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IILhc;[Lqe;I)V", garbageValue = "1879739800")
	void method4605(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;
				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field3538.id && var11 <= WorldMapDecorationType.field3539.id;
					if (!var10) {
						int var13 = var9.decoration;
						boolean var12 = var13 == WorldMapDecorationType.field3526.id;
						if (!var12) {
							continue;
						}
					}
					ObjectComposition var14 = FileSystem.getObjectDefinition(var9.objectDefinitionId);
					if (var14.mapSceneId != -1) {
						if (var14.mapSceneId != 46 && var14.mapSceneId != 52) {
							var4[var14.mapSceneId].method8048(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
						} else {
							var4[var14.mapSceneId].method8048(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(IILhc;B)V", garbageValue = "105")
	void method4689(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;
				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					int var10 = var8.decoration;
					boolean var9 = var10 >= WorldMapDecorationType.field3532.id && var10 <= WorldMapDecorationType.field3531.id || var10 == WorldMapDecorationType.field3520.id;
					if (var9) {
						ObjectComposition var11 = FileSystem.getObjectDefinition(var8.objectDefinitionId);
						int var12 = (var11.int1 != 0) ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field3532.id) {
							this.method4694(var1, var2, var8.rotation, var12);
						}
						if (var8.decoration == WorldMapDecorationType.field3523.id) {
							this.method4694(var1, var2, var8.rotation, -3355444);
							this.method4694(var1, var2, var8.rotation + 1, var12);
						}
						if (var8.decoration == WorldMapDecorationType.field3531.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}
							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}
							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
							}
						}
						if (var8.decoration == WorldMapDecorationType.field3520.id) {
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;II)V", garbageValue = "1994701313")
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = ((float) (var4)) / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();
		while (var7.hasNext()) {
			Entry var8 = ((Entry) (var7.next()));
			Coord var9 = ((Coord) (var8.getKey()));
			int var10 = ((int) (((float) (var9.x)) * var5 + ((float) (var1)) - var6));
			int var11 = ((int) (((float) (var2 + var4)) - var5 * ((float) (var9.y)) - var6));
			AbstractWorldMapIcon var12 = ((AbstractWorldMapIcon) (var8.getValue()));
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = EnumComposition.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method4688(var12, var10, var11, var5);
				}
			}
		} 
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;IIB)V", garbageValue = "-125")
	void method4704(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();
		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				WorldMapElement var6 = EnumComposition.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lfy;IIIIB)V", garbageValue = "8")
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lil;IIFI)V", garbageValue = "-861515573")
	void method4688(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = EnumComposition.WorldMapElement_get(var1.getElement());
		this.method4637(var5, var2, var3);
		this.method4612(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(Lfy;III)V", garbageValue = "659058237")
	void method4637(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method4627(var4, var1.horizontalAlignment);
			int var6 = this.method4615(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(Lil;Lfy;IIFB)V", garbageValue = "27")
	void method4612(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method4450(var5)) {
				Font var7 = ((Font) (this.fonts.get(var6.size)));
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1817, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;IB)V", garbageValue = "-75")
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
					this.method4688(var7, var7.screenX, var7.screenY, var5);
				}
			}
		} 
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(Lqn;Lfo;I)I", garbageValue = "245044303")
	int method4627(SpritePixels var1, HorizontalAlignment var2) {
		switch (var2.value) {
			case 0 :
				return -var1.subWidth / 2;
			case 1 :
				return 0;
			default :
				return -var1.subWidth;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(Lqn;Lfl;I)I", garbageValue = "-816706088")
	int method4615(SpritePixels var1, VerticalAlignment var2) {
		switch (var2.value) {
			case 0 :
				return -var1.subHeight / 2;
			case 2 :
				return 0;
			default :
				return -var1.subHeight;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(IS)Liw;", garbageValue = "16474")
	WorldMapLabel method4602(int var1) {
		WorldMapElement var2 = EnumComposition.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(Lfy;I)Liw;", garbageValue = "-752095543")
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			int var3 = var1.textSize;
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method4455();
			int var5 = 0;
			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null;
					break;
				}
				WorldMapLabelSize var6 = var4[var5];
				if (var3 == var6.field2680) {
					var2 = var6;
					break;
				}
				++var5;
			} 
			if (var2 == null) {
				return null;
			} else {
				Font var14 = ((Font) (this.fonts.get(var2)));
				if (var14 == null) {
					return null;
				} else {
					int var15 = var14.lineCount(var1.name, 1000000);
					String[] var7 = new String[var15];
					var14.breakLines(var1.name, ((int[]) (null)), var7);
					int var8 = var7.length * var14.ascent / 2;
					int var9 = 0;
					String[] var10 = var7;
					for (int var11 = 0; var11 < var10.length; ++var11) {
						String var12 = var10[var11];
						int var13 = var14.stringWidth(var12);
						if (var13 > var9) {
							var9 = var13;
						}
					}
					return new WorldMapLabel(var1.name, var9, var8, var2);
				}
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(IIIIII)Ljava/util/List;", garbageValue = "1426425280")
	List method4618(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(I)Ljava/util/List;", garbageValue = "1796664376")
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "-661543454")
	void method4694(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}
		if (var3 == 1) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}
		if (var3 == 2) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}
		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(CII)Ljava/lang/String;", garbageValue = "1846438611")
	public static String method4713(char var0, int var1) {
		char[] var2 = new char[var1];
		for (int var3 = 0; var3 < var1; ++var3) {
			var2[var3] = var0;
		}
		return new String(var2);
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(descriptor = "(Lkn;IIIIIII)V", garbageValue = "2063217212")
	static final void method4607(Widget var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Client.field554) {
			Client.alternativeScrollbarWidth = 32;
		} else {
			Client.alternativeScrollbarWidth = 0;
		}
		Client.field554 = false;
		int var7;
		if (MouseHandler.MouseHandler_currentButton == 1 || !Bounds.mouseCam && MouseHandler.MouseHandler_currentButton == 4) {
			if (var5 >= var1 && var5 < var1 + 16 && var6 >= var2 && var6 < var2 + 16) {
				var0.scrollY -= 4;
				class125.invalidateWidget(var0);
			} else if (var5 >= var1 && var5 < var1 + 16 && var6 >= var3 + var2 - 16 && var6 < var3 + var2) {
				var0.scrollY += 4;
				class125.invalidateWidget(var0);
			} else if (var5 >= var1 - Client.alternativeScrollbarWidth && var5 < Client.alternativeScrollbarWidth + var1 + 16 && var6 >= var2 + 16 && var6 < var3 + var2 - 16) {
				var7 = var3 * (var3 - 32) / var4;
				if (var7 < 8) {
					var7 = 8;
				}
				int var8 = var6 - var2 - 16 - var7 / 2;
				int var9 = var3 - 32 - var7;
				var0.scrollY = var8 * (var4 - var3) / var9;
				class125.invalidateWidget(var0);
				Client.field554 = true;
			}
		}
		if (Client.mouseWheelRotation != 0) {
			var7 = var0.width;
			if (var5 >= var1 - var7 && var6 >= var2 && var5 < var1 + 16 && var6 <= var3 + var2) {
				var0.scrollY += Client.mouseWheelRotation * 45;
				class125.invalidateWidget(var0);
			}
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(descriptor = "(Lkn;I)Z", garbageValue = "1488409927")
	@Export("runCs1")
	static final boolean runCs1(Widget var0) {
		if (var0.cs1Comparisons == null) {
			return false;
		} else {
			for (int var1 = 0; var1 < var0.cs1Comparisons.length; ++var1) {
				int var2 = GrandExchangeEvents.method5876(var0, var1);
				int var3 = var0.cs1ComparisonValues[var1];
				if (var0.cs1Comparisons[var1] == 2) {
					if (var2 >= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 3) {
					if (var2 <= var3) {
						return false;
					}
				} else if (var0.cs1Comparisons[var1] == 4) {
					if (var3 == var2) {
						return false;
					}
				} else if (var3 != var2) {
					return false;
				}
			}
			return true;
		}
	}
}