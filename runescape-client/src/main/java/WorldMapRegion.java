import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gd")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 
	1770017441)

	@Export("clientType")
	public static int clientType;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lie;")

	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	2095222453)

	@Export("regionX")
	int regionX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 
	2124136901)

	@Export("regionY")
	int regionY;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lge;")

	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("q")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 
	827222531)

	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	465516293)

	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("p")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("w")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("k")
	@Export("fonts")
	final HashMap fonts;
	static 
	{
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1;
		this.regionY = var2;
		this.worldMapData1List = new LinkedList();
		this.icon0List = new LinkedList();
		this.iconMap = new HashMap();
		this.backgroundColor = var3 | (-16777216);
		this.fonts = var4;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IIIB)V", garbageValue = 
	"-32")

	void method4039(int var1, int var2, int var3) {
		SpritePixels var4 = UserComparator5.method2599(this.regionX, this.regionY, this.pixelsPerTile);
		if (var4 != null) {
			if (var3 == (this.pixelsPerTile * 64)) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lge;Ljava/util/List;B)V", garbageValue = 
	"25")

	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/HashSet;Ljava/util/List;I)V", garbageValue = 
	"674550029")

	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			WorldMapData_1 var4 = ((WorldMapData_1) (var3.next()));
			if ((var4.getRegionX() == this.regionX) && (var4.getRegionY() == this.regionY)) {
				this.worldMapData1List.add(var4);
			}
		} 

		this.addAllToIconList(var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(IIIILhz;S)V", garbageValue = 
	"8217")

	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < (var3 + var1); ++var6) {
			label50 : for (
			int var7 = var2; var7 < (var2 + var4); ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if ((var9 != null) && (var9.length != 0)) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							WorldMapDecoration var12 = var10[var11];
							ObjectComposition var13 = class146.getObjectDefinition(var12.objectDefinitionId);
							if (VerticalAlignment.method3539(var13)) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label50;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lgj;IIILhz;I)V", garbageValue = 
	"-1962947985")

	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + (this.regionX * 64), (this.regionY * 64) + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + (this.worldMapData_0.regionXLow * 64), var4 + (this.worldMapData_0.regionYLow * 64));
		} else {
			WorldMapData_1 var8 = ((WorldMapData_1) (var5));
			var7 = new Coord(var2 + var8.minPlane, ((var8.regionXLow * 64) + var3) + (var8.getChunkXLow() * 8), (var4 + (var8.regionYLow * 64)) + (var8.getChunkYLow() * 8));
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = UserComparator7.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = UserComparator7.WorldMapElement_get(((AbstractWorldMapIcon) (var10)).getElement());
		if (var9.field1822) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-86")

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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/List;I)V", garbageValue = 
	"-867806211")

	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = ((WorldMapIcon_0) (var2.next()));
			if ((UserComparator7.WorldMapElement_get(var3.element).field1822 && ((var3.coord2.x >> 6) == this.regionX)) && ((var3.coord2.y >> 6) == this.regionY)) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4082(var3.element));
				this.icon0List.add(var4);
			}
		} 

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-84")

	void method4046() {
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

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Lln;I)Z", garbageValue = 
	"1708143981")

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

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(ILhx;[Lqq;Lln;Lln;I)V", garbageValue = 
	"-350994346")

	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if ((this.worldMapData_0 != null) || (!this.worldMapData1List.isEmpty())) {
			int var7 = this.regionX;
			int var8 = this.regionY;
			DemotingHashTable var9 = WorldMapRegion_cachedSprites;
			long var10 = ((long) (((var1 << 16) | (var7 << 8)) | var8));
			SpritePixels var6 = ((SpritePixels) (var9.get(var10)));
			if (var6 == null) {
				boolean var21 = true;
				var21 &= this.loadGeography(var4);
				int var11;
				if (this.worldMapData_0 != null) {
					var11 = this.worldMapData_0.groupId;
				} else {
					var11 = ((AbstractWorldMapData) (this.worldMapData1List.getFirst())).groupId;
				}

				var21 &= var5.tryLoadGroup(var11);
				if (var21) {
					byte[] var22 = var5.takeFileFlat(var11);
					WorldMapSprite var12 = Interpreter.method1798(var22);
					SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var13.setRaster();
					if (this.worldMapData_0 != null) {
						this.method4124(var2, var3, var12);
					} else {
						this.method4144(var2, var3, var12);
					}

					int var14 = this.regionX;
					int var15 = this.regionY;
					int var16 = this.pixelsPerTile;
					DemotingHashTable var17 = WorldMapRegion_cachedSprites;
					long var19 = ((long) (((var16 << 16) | (var14 << 8)) | var15));
					var17.put(var13, var19, var13.pixels.length * 4);
					this.method4046();
				}
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(IIILjava/util/HashSet;B)V", garbageValue = 
	"13")

	void method4097(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/HashSet;III)V", garbageValue = 
	"463084567")

	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = UserComparator7.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 

		this.method4059(var1, var2, var3);
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lhx;[Lqq;Lhn;S)V", garbageValue = 
	"-30301")

	void method4124(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method4055(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method4053(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(Lhx;[Lqq;Lhn;I)V", garbageValue = 
	"-1984333842")

	void method4144(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));

			for (var6 = var5.getChunkX() * 8; var6 < ((var5.getChunkX() * 8) + 8); ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < ((var5.getChunkY() * 8) + 8); ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method4055(var6, var7, var5, var1);
				}
			}
		} 

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));

			for (var6 = var5.getChunkX() * 8; var6 < ((var5.getChunkX() * 8) + 8); ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < ((var5.getChunkY() * 8) + 8); ++var7) {
					this.method4053(var6, var7, var5, var1, var2);
				}
			}
		} 

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(IILhz;Lhx;[Lqq;B)V", garbageValue = 
	"-27")

	void method4053(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4098(var1, var2, var3);
		this.method4057(var1, var2, var3, var5);
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(IILhz;Lhx;Lhn;I)V", garbageValue = 
	"-1568059728")

	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if ((var6 == (-1)) && (var7 == (-1))) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}

		int var8 = 16711935;
		if (var7 != (-1)) {
			var8 = class7.method53(var7, this.backgroundColor);
		}

		if ((var7 > (-1)) && (var3.field2334[0][var1][var2] == 0)) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			int var9 = this.method4056(var1, var2, var3, var5);
			if (var7 == (-1)) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method4461(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2334[0][var1][var2], var3.field2342[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IILhz;Lhx;B)V", garbageValue = 
	"0")

	void method4055(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > (-1)) {
				int var7 = class7.method53(var6, this.backgroundColor);
				if (var3.field2334[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method4461(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2334[var5][var1][var2], var3.field2342[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(IILhz;Lhn;I)I", garbageValue = 
	"-952737975")

	int method4056(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(IILhz;[Lqq;I)V", garbageValue = 
	"-902447610")

	void method4057(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if ((var6 != null) && (var6.length != 0)) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					if (class137.method2938(var9.decoration) || WorldMapEvent.method4505(var9.decoration)) {
						ObjectComposition var10 = class146.getObjectDefinition(var9.objectDefinitionId);
						if (var10.mapSceneId != (-1)) {
							if ((var10.mapSceneId != 46) && (var10.mapSceneId != 52)) {
								var4[var10.mapSceneId].method8054(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
							} else {
								var4[var10.mapSceneId].method8054(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), (this.pixelsPerTile * 2) + 1, (this.pixelsPerTile * 2) + 1);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(IILhz;B)V", garbageValue = 
	"-2")

	void method4098(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if ((var5 != null) && (var5.length != 0)) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					int var10 = var8.decoration;
					boolean var9 = ((var10 >= WorldMapDecorationType.field3517.id) && (var10 <= WorldMapDecorationType.field3500.id)) || (var10 == WorldMapDecorationType.field3501.id);
					if (var9) {
						ObjectComposition var11 = class146.getObjectDefinition(var8.objectDefinitionId);
						int var12 = (var11.int1 != 0) ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field3517.id) {
							this.method4071(var1, var2, var8.rotation, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field3509.id) {
							this.method4071(var1, var2, var8.rotation, -3355444);
							this.method4071(var1, var2, var8.rotation + 1, var12);
						}

						if (var8.decoration == WorldMapDecorationType.field3500.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(((this.pixelsPerTile * var1) + this.pixelsPerTile) - 1, this.pixelsPerTile * (63 - var2), 1, var12);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(((this.pixelsPerTile * var1) + this.pixelsPerTile) - 1, ((this.pixelsPerTile * (63 - var2)) + this.pixelsPerTile) - 1, 1, var12);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, ((this.pixelsPerTile * (63 - var2)) + this.pixelsPerTile) - 1, 1, var12);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3501.id) {
							int var13 = var8.rotation % 2;
							int var14;
							if (var13 == 0) {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + (this.pixelsPerTile * var1), (((64 - var2) * this.pixelsPerTile) - 1) - var14, 1, var12);
								}
							} else {
								for (var14 = 0; var14 < this.pixelsPerTile; ++var14) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + (this.pixelsPerTile * var1), var14 + (this.pixelsPerTile * (63 - var2)), 1, var12);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(IILjava/util/HashSet;II)V", garbageValue = 
	"1736856412")

	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = ((float) (var4)) / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();

		while (var7.hasNext()) {
			Entry var8 = ((Entry) (var7.next()));
			Coord var9 = ((Coord) (var8.getKey()));
			int var10 = ((int) ((((float) (var1)) + (((float) (var9.x)) * var5)) - var6));
			int var11 = ((int) ((((float) (var2 + var4)) - (((float) (var9.y)) * var5)) - var6));
			AbstractWorldMapIcon var12 = ((AbstractWorldMapIcon) (var8.getValue()));
			if ((var12 != null) && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = UserComparator7.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method4064(var12, var10, var11, var5);
				}
			}
		} 

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/HashSet;IIB)V", garbageValue = 
	"-7")

	void method4059(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				WorldMapElement var6 = UserComparator7.WorldMapElement_get(var5.getElement());
				if ((var6 != null) && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(Lfe;IIIIB)V", garbageValue = 
	"-104")

	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false);
		if (var6 != null) {
			var6.drawTransBgAt(var2 - (var6.subWidth / 2), var3 - (var6.subHeight / 2));
			if ((var4 % var5) < (var5 / 2)) {
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
			}

		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(Lhq;IIFI)V", garbageValue = 
	"-19271127")

	void method4064(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = UserComparator7.WorldMapElement_get(var1.getElement());
		this.method4062(var5, var2, var3);
		this.method4063(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(Lfe;III)V", garbageValue = 
	"-714774385")

	void method4062(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method4161(var4, var1.horizontalAlignment);
			int var6 = this.method4123(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = 
	"(Lhq;Lfe;IIFI)V", garbageValue = 
	"1984252761")

	void method4063(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method3902(var5)) {
				Font var7 = ((Font) (this.fonts.get(var6.size)));
				var7.drawLines(var6.text, var3 - (var6.width / 2), var4, var6.width, var6.height, (-16777216) | var2.field1819, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"(IILjava/util/HashSet;II)V", garbageValue = 
	"1065289794")

	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = ((float) (var4)) / 64.0F;
		Iterator var6 = this.icon0List.iterator();

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = ((AbstractWorldMapIcon) (var6.next()));
			if (var7.hasValidElement()) {
				int var8 = var7.coord2.x % 64;
				int var9 = var7.coord2.y % 64;
				var7.screenX = ((int) (((float) (var1)) + (var5 * ((float) (var8)))));
				var7.screenY = ((int) ((var5 * ((float) (63 - var9))) + ((float) (var2))));
				if (!var3.contains(var7.getElement())) {
					this.method4064(var7, var7.screenX, var7.screenY, var5);
				}
			}
		} 

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = 
	"(Lqi;Lfw;I)I", garbageValue = 
	"1167261995")

	int method4161(SpritePixels var1, HorizontalAlignment var2) {
		switch (var2.value) {
			case 1 :
				return (-var1.subWidth) / 2;
			case 2 :
				return 0;
			default :
				return -var1.subWidth;}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = 
	"(Lqi;Lfg;I)I", garbageValue = 
	"1110187464")

	int method4123(SpritePixels var1, VerticalAlignment var2) {
		switch (var2.value) {
			case 1 :
				return (-var1.subHeight) / 2;
			case 2 :
				return 0;
			default :
				return -var1.subHeight;}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lho;", garbageValue = 
	"-108")

	WorldMapLabel method4082(int var1) {
		WorldMapElement var2 = UserComparator7.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = 
	"(Lfe;I)Lho;", garbageValue = 
	"2017474757")

	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (((var1.name != null) && (this.fonts != null)) && (this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null)) {
			int var3 = var1.textSize;
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method3901();
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null;
					break;
				}

				WorldMapLabelSize var6 = var4[var5];
				if (var3 == var6.field2215) {
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
					int var8 = (var7.length * var14.ascent) / 2;
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = 
	"(IIIIII)Ljava/util/List;", garbageValue = 
	"-1950583236")

	List method4069(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList();
		if ((var4 >= var1) && (var5 >= var2)) {
			if ((var4 < (var3 + var1)) && (var5 < (var3 + var2))) {
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/util/List;", garbageValue = 
	"1649195814")

	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"2107740024")

	void method4071(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(((this.pixelsPerTile * var1) + this.pixelsPerTile) - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, ((this.pixelsPerTile * (63 - var2)) + this.pixelsPerTile) - 1, this.pixelsPerTile, var4);
		}

	}
}