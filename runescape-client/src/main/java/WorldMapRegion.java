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
@ObfuscatedName("hn")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("sa")
	@ObfuscatedSignature(descriptor = "Lbe;")
	@Export("decimator")
	static Decimator decimator;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Lic;")
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;

	@ObfuscatedName("hc")
	@Export("xteaKeys")
	static int[][] xteaKeys;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = 1546454377)
	@Export("regionX")
	int regionX;

	@ObfuscatedName("g")
	@ObfuscatedGetter(intValue = 800960001)
	@Export("regionY")
	int regionY;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Lhh;")
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;

	@ObfuscatedName("y")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = -2806249)
	@Export("backgroundColor")
	int backgroundColor;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1260783779)
	@Export("pixelsPerTile")
	int pixelsPerTile;

	@ObfuscatedName("t")
	@Export("icon0List")
	List icon0List;

	@ObfuscatedName("z")
	@Export("iconMap")
	HashMap iconMap;

	@ObfuscatedName("r")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1;
		this.regionY = var2;
		this.worldMapData1List = new LinkedList();
		this.icon0List = new LinkedList();
		this.iconMap = new HashMap();
		this.backgroundColor = var3 | -16777216;
		this.fonts = var4;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-1988867113")
	void method4694(int var1, int var2, int var3) {
		SpritePixels var4 = class432.method7578(this.regionX, this.regionY, this.pixelsPerTile);
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lhh;Ljava/util/List;S)V", garbageValue = "128")
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V", garbageValue = "1764533382")
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IIIILhd;I)V", garbageValue = "165512816")
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
								var13 = class162.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;
									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = class162.getObjectDefinition(var17);
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(Lgk;IIILhd;B)V", garbageValue = "127")
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, var4 + this.worldMapData_0.regionYLow * 64);
		} else {
			WorldMapData_1 var8 = ((WorldMapData_1) (var5));
			var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 64 + var3 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8);
		}
		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = class432.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}
		var9 = class432.WorldMapElement_get(((AbstractWorldMapIcon) (var10)).getElement());
		if (var9.field1830) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-78")
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

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Ljava/util/List;B)V", garbageValue = "32")
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();
		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = ((WorldMapIcon_0) (var2.next()));
			if (class432.WorldMapElement_get(var3.element).field1830 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4808(var3.element));
				this.icon0List.add(var4);
			}
		} 
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-727804061")
	void method4701() {
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

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Llh;I)Z", garbageValue = "-2071549269")
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(ILif;[Lqu;Llh;Llh;B)V", garbageValue = "94")
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			if (class432.method7578(this.regionX, this.regionY, var1) == null) {
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
					WorldMapSprite var9;
					if (var7 == null) {
						var9 = new WorldMapSprite();
					} else {
						var9 = new WorldMapSprite(ItemLayer.method3920(var7).pixels);
					}
					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var11.setRaster();
					if (this.worldMapData_0 != null) {
						this.method4784(var2, var3, var9);
					} else {
						this.method4788(var2, var3, var9);
					}
					class116.method2699(var11, this.regionX, this.regionY, this.pixelsPerTile);
					this.method4701();
				}
			}
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(IIILjava/util/HashSet;I)V", garbageValue = "1460089775")
	void method4738(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}
		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;III)V", garbageValue = "396083089")
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();
		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = class432.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 
		this.method4715(var1, var2, var3);
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(Lif;[Lqu;Lis;B)V", garbageValue = "36")
	void method4784(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method4782(var4, var5, this.worldMapData_0, var1);
			}
		}
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method4708(var4, var5, this.worldMapData_0, var1, var2);
			}
		}
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lif;[Lqu;Lis;I)V", garbageValue = "-389074070")
	void method4788(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();
		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));
			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method4782(var6, var7, var5, var1);
				}
			}
		} 
		var4 = this.worldMapData1List.iterator();
		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));
			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method4708(var6, var7, var5, var1, var2);
				}
			}
		} 
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IILhd;Lif;[Lqu;B)V", garbageValue = "28")
	void method4708(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4713(var1, var2, var3);
		this.method4706(var1, var2, var3, var5);
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(IILhd;Lif;Lis;I)V", garbageValue = "1839695565")
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if (var6 == -1 && var7 == -1) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}
		int var8 = 16711935;
		int var9;
		if (var7 != -1) {
			int var10 = this.backgroundColor;
			FloorOverlayDefinition var11 = class124.method2814(var7);
			if (var11 == null) {
				var9 = var10;
			} else if (var11.secondaryRgb >= 0) {
				var9 = var11.secondaryRgb | -16777216;
			} else if (var11.texture >= 0) {
				int var12 = class154.method3170(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96);
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
			} else if (var11.primaryRgb == 16711935) {
				var9 = var10;
			} else {
				int var13 = var11.hue;
				int var14 = var11.saturation;
				int var15 = var11.lightness;
				if (var15 > 179) {
					var14 /= 2;
				}
				if (var15 > 192) {
					var14 /= 2;
				}
				if (var15 > 217) {
					var14 /= 2;
				}
				if (var15 > 243) {
					var14 /= 2;
				}
				int var16 = (var14 / 32 << 7) + var15 / 2 + (var13 / 4 << 10);
				int var17 = class154.method3170(var16, 96);
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216;
			}
			var8 = var9;
		}
		if (var7 > -1 && var3.field2796[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			var9 = this.method4711(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method5108(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2796[0][var1][var2], var3.field2795[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(IILhd;Lif;I)V", garbageValue = "-1128004844")
	void method4782(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var8 = this.backgroundColor;
				FloorOverlayDefinition var9 = class124.method2814(var6);
				int var7;
				if (var9 == null) {
					var7 = var8;
				} else if (var9.secondaryRgb >= 0) {
					var7 = var9.secondaryRgb | -16777216;
				} else if (var9.texture >= 0) {
					int var10 = class154.method3170(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96);
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
				} else if (var9.primaryRgb == 16711935) {
					var7 = var8;
				} else {
					int var11 = var9.hue;
					int var12 = var9.saturation;
					int var13 = var9.lightness;
					if (var13 > 179) {
						var12 /= 2;
					}
					if (var13 > 192) {
						var12 /= 2;
					}
					if (var13 > 217) {
						var12 /= 2;
					}
					if (var13 > 243) {
						var12 /= 2;
					}
					int var14 = (var12 / 32 << 7) + var13 / 2 + (var11 / 4 << 10);
					int var15 = class154.method3170(var14, 96);
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216;
				}
				if (var3.field2796[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method5108(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2796[var5][var1][var2], var3.field2795[var5][var1][var2]);
				}
			}
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(IILhd;Lis;I)I", garbageValue = "2000160992")
	int method4711(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(IILhd;[Lqu;I)V", garbageValue = "114482222")
	void method4706(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;
				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					if (Clock.method3331(var9.decoration) || WorldMapLabelSize.method4575(var9.decoration)) {
						ObjectComposition var10 = class162.getObjectDefinition(var9.objectDefinitionId);
						if (var10.mapSceneId != -1) {
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) {
								var4[var10.mapSceneId].method8135(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
							} else {
								var4[var10.mapSceneId].method8135(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
							}
						}
					}
				}
			}
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IILhd;B)V", garbageValue = "16")
	void method4713(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;
				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					int var10 = var8.decoration;
					boolean var9 = var10 >= WorldMapDecorationType.field3549.id && var10 <= WorldMapDecorationType.field3534.id || var10 == WorldMapDecorationType.field3535.id;
					if (var9) {
						ObjectComposition var11 = class162.getObjectDefinition(var8.objectDefinitionId);
						int var12 = (var11.int1 != 0) ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field3549.id) {
							this.method4723(var1, var2, var8.rotation, var12);
						}
						if (var8.decoration == WorldMapDecorationType.field3533.id) {
							this.method4723(var1, var2, var8.rotation, -3355444);
							this.method4723(var1, var2, var8.rotation + 1, var12);
						}
						if (var8.decoration == WorldMapDecorationType.field3534.id) {
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
						if (var8.decoration == WorldMapDecorationType.field3535.id) {
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;IB)V", garbageValue = "8")
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = ((float) (var4)) / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();
		while (var7.hasNext()) {
			Entry var8 = ((Entry) (var7.next()));
			Coord var9 = ((Coord) (var8.getKey()));
			int var10 = ((int) (var5 * ((float) (var9.x)) + ((float) (var1)) - var6));
			int var11 = ((int) (((float) (var2 + var4)) - var5 * ((float) (var9.y)) - var6));
			AbstractWorldMapIcon var12 = ((AbstractWorldMapIcon) (var8.getValue()));
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = class432.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method4771(var12, var10, var11, var5);
				}
			}
		} 
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Ljava/util/HashSet;III)V", garbageValue = "1790127090")
	void method4715(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();
		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				WorldMapElement var6 = class432.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(Lfa;IIIII)V", garbageValue = "797623326")
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(Lim;IIFB)V", garbageValue = "-8")
	void method4771(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class432.WorldMapElement_get(var1.getElement());
		this.method4718(var5, var2, var3);
		this.method4719(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(Lfa;III)V", garbageValue = "-1556950864")
	void method4718(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method4721(var4, var1.horizontalAlignment);
			int var6 = this.method4722(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(Lim;Lfa;IIFI)V", garbageValue = "1703862225")
	void method4719(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method4567(var5)) {
				Font var7 = ((Font) (this.fonts.get(var6.size)));
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1834, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(IILjava/util/HashSet;II)V", garbageValue = "612177592")
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = ((float) (var4)) / 64.0F;
		Iterator var6 = this.icon0List.iterator();
		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = ((AbstractWorldMapIcon) (var6.next()));
			if (var7.hasValidElement()) {
				int var8 = var7.coord2.x % 64;
				int var9 = var7.coord2.y % 64;
				var7.screenX = ((int) (((float) (var1)) + var5 * ((float) (var8))));
				var7.screenY = ((int) (((float) (63 - var9)) * var5 + ((float) (var2))));
				if (!var3.contains(var7.getElement())) {
					this.method4771(var7, var7.screenX, var7.screenY, var5);
				}
			}
		} 
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(Lqe;Lfk;I)I", garbageValue = "-1396908726")
	int method4721(SpritePixels var1, HorizontalAlignment var2) {
		switch (var2.value) {
			case 1 :
				return 0;
			case 2 :
				return -var1.subWidth / 2;
			default :
				return -var1.subWidth;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(Lqe;Lft;I)I", garbageValue = "1287844359")
	int method4722(SpritePixels var1, VerticalAlignment var2) {
		switch (var2.value) {
			case 0 :
				return 0;
			case 2 :
				return -var1.subHeight / 2;
			default :
				return -var1.subHeight;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(IB)Liz;", garbageValue = "-66")
	WorldMapLabel method4808(int var1) {
		WorldMapElement var2 = class432.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(Lfa;I)Liz;", garbageValue = "-927951776")
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			int var3 = var1.textSize;
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method4568();
			int var5 = 0;
			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null;
					break;
				}
				WorldMapLabelSize var6 = var4[var5];
				if (var3 == var6.field2672) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(IIIIIB)Ljava/util/List;", garbageValue = "78")
	List method4802(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(I)Ljava/util/List;", garbageValue = "-74215594")
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "1662314817")
	void method4723(int var1, int var2, int var3, int var4) {
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
}