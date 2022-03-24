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

@ObfuscatedName("hc")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ti")
	@ObfuscatedGetter(intValue = 
	1321531033)

	static int field2706;
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"Lii;")

	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = 
	1652001983)

	@Export("regionX")
	int regionX;
	@ObfuscatedName("d")
	@ObfuscatedGetter(intValue = 
	175632235)

	@Export("regionY")
	int regionY;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lhn;")

	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("u")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = 
	-862418989)

	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("k")
	@ObfuscatedGetter(intValue = 
	-1514122443)

	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("x")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("c")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("j")
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"(IIII)V", garbageValue = 
	"1350544983")

	void method4677(int var1, int var2, int var3) {
		SpritePixels var4 = class28.method423(this.regionX, this.regionY, this.pixelsPerTile);
		if (var4 != null) {
			if (var3 == (this.pixelsPerTile * 64)) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(Lhn;Ljava/util/List;B)V", garbageValue = 
	"0")

	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/HashSet;Ljava/util/List;I)V", garbageValue = 
	"-691680416")

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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(IIIILiu;I)V", garbageValue = 
	"554525387")

	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < (var3 + var1); ++var6) {
			label75 : for (
			int var7 = var2; var7 < (var2 + var4); ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if ((var9 != null) && (var9.length != 0)) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							ObjectComposition var13;
							boolean var14;
							label66 : {
								WorldMapDecoration var12 = var10[var11];
								var13 = class116.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) {
									int[] var15 = var13.transforms;

									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = class116.getObjectDefinition(var17);
										if (var18.mapIconId != (-1)) {
											var14 = true;
											break label66;
										}
									}
								} else if (var13.mapIconId != (-1)) {
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Lgx;IIILiu;B)V", garbageValue = 
	"3")

	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + (this.regionX * 64), (this.regionY * 64) + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + (this.worldMapData_0.regionXLow * 64), var4 + (this.worldMapData_0.regionYLow * 64));
		} else {
			WorldMapData_1 var8 = ((WorldMapData_1) (var5));
			var7 = new Coord(var2 + var8.minPlane, (var3 + (var8.regionXLow * 64)) + (var8.getChunkXLow() * 8), ((var8.regionYLow * 64) + var4) + (var8.getChunkYLow() * 8));
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = class19.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = class19.WorldMapElement_get(((AbstractWorldMapIcon) (var10)).getElement());
		if (var9.field1835) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1628100931")

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

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/List;I)V", garbageValue = 
	"-883306894")

	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = ((WorldMapIcon_0) (var2.next()));
			if ((class19.WorldMapElement_get(var3.element).field1835 && ((var3.coord2.x >> 6) == this.regionX)) && ((var3.coord2.y >> 6) == this.regionY)) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4675(var3.element));
				this.icon0List.add(var4);
			}
		} 

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-2141874289")

	void method4679() {
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

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = 
	"(Llq;I)Z", garbageValue = 
	"-1638134467")

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

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(ILie;[Lqx;Llq;Llq;I)V", garbageValue = 
	"-1187149260")

	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1;
		if ((this.worldMapData_0 != null) || (!this.worldMapData1List.isEmpty())) {
			if (class28.method423(this.regionX, this.regionY, var1) == null) {
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
						var9 = new WorldMapSprite(class29.method433(var7).pixels);
					}

					SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var11.setRaster();
					if (this.worldMapData_0 != null) {
						this.method4684(var2, var3, var9);
					} else {
						this.method4714(var2, var3, var9);
					}

					int var12 = this.regionX;
					int var13 = this.regionY;
					int var14 = this.pixelsPerTile;
					WorldMapRegion_cachedSprites.put(var11, class65.method1867(var12, var13, var14), var11.pixels.length * 4);
					this.method4679();
				}
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = 
	"(IIILjava/util/HashSet;I)V", garbageValue = 
	"-268050800")

	void method4682(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/HashSet;III)V", garbageValue = 
	"1089200955")

	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = class19.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 

		this.method4693(var1, var2, var3);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(Lie;[Lqx;Lis;I)V", garbageValue = 
	"954232927")

	void method4684(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method4688(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method4687(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Lie;[Lqx;Lis;I)V", garbageValue = 
	"1932235022")

	void method4714(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));

			for (var6 = var5.getChunkX() * 8; var6 < ((var5.getChunkX() * 8) + 8); ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < ((var5.getChunkY() * 8) + 8); ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method4688(var6, var7, var5, var1);
				}
			}
		} 

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = ((WorldMapData_1) (var4.next()));

			for (var6 = var5.getChunkX() * 8; var6 < ((var5.getChunkX() * 8) + 8); ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < ((var5.getChunkY() * 8) + 8); ++var7) {
					this.method4687(var6, var7, var5, var1, var2);
				}
			}
		} 

	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(IILiu;Lie;[Lqx;S)V", garbageValue = 
	"-17045")

	void method4687(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4706(var1, var2, var3);
		this.method4690(var1, var2, var3, var5);
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = 
	"(IILiu;Lie;Lis;I)V", garbageValue = 
	"-845219169")

	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
		if ((var6 == (-1)) && (var7 == (-1))) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
		}

		int var8 = 16711935;
		int var9;
		if (var7 != (-1)) {
			int var10 = this.backgroundColor;
			FloorOverlayDefinition var12 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var7)))));
			FloorOverlayDefinition var11;
			if (var12 != null) {
				var11 = var12;
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7);
				var12 = new FloorOverlayDefinition();
				if (var13 != null) {
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode();
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, ((long) (var7)));
				var11 = var12;
			}

			if (var11 == null) {
				var9 = var10;
			} else if (var11.secondaryRgb >= 0) {
				var9 = var11.secondaryRgb | (-16777216);
			} else {
				int var14;
				int var22;
				if (var11.texture >= 0) {
					var14 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture);
					byte var15 = 96;
					int var21;
					if (var14 == (-2)) {
						var21 = 12345678;
					} else if (var14 == (-1)) {
						if (var15 < 0) {
							var15 = 0;
						} else if (var15 > 127) {
							var15 = 127;
						}

						var22 = 127 - var15;
						var21 = var22;
					} else {
						var22 = (var15 * (var14 & 127)) / 128;
						if (var22 < 2) {
							var22 = 2;
						} else if (var22 > 126) {
							var22 = 126;
						}

						var21 = var22 + (var14 & 65408);
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var21] | (-16777216);
				} else if (var11.primaryRgb == 16711935) {
					var9 = var10;
				} else {
					var14 = var11.hue;
					var22 = var11.saturation;
					int var16 = var11.lightness;
					if (var16 > 179) {
						var22 /= 2;
					}

					if (var16 > 192) {
						var22 /= 2;
					}

					if (var16 > 217) {
						var22 /= 2;
					}

					if (var16 > 243) {
						var22 /= 2;
					}

					int var17 = (((var22 / 32) << 7) + (var16 / 2)) + ((var14 / 4) << 10);
					byte var19 = 96;
					int var18;
					if (var17 == (-2)) {
						var18 = 12345678;
					} else {
						int var23;
						if (var17 == (-1)) {
							if (var19 < 0) {
								var19 = 0;
							} else if (var19 > 127) {
								var19 = 127;
							}

							var23 = 127 - var19;
							var18 = var23;
						} else {
							var23 = (var19 * (var17 & 127)) / 128;
							if (var23 < 2) {
								var23 = 2;
							} else if (var23 > 126) {
								var23 = 126;
							}

							var18 = var23 + (var17 & 65408);
						}
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | (-16777216);
				}
			}

			var8 = var9;
		}

		if ((var7 > (-1)) && (var3.field2793[0][var1][var2] == 0)) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			var9 = this.method4671(var1, var2, var3, var5);
			if (var7 == (-1)) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method5091(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2793[0][var1][var2], var3.field2792[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(IILiu;Lie;I)V", garbageValue = 
	"1864797508")

	void method4688(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > (-1)) {
				int var8 = this.backgroundColor;
				FloorOverlayDefinition var10 = ((FloorOverlayDefinition) (FloorOverlayDefinition.FloorOverlayDefinition_cached.get(((long) (var6)))));
				FloorOverlayDefinition var9;
				if (var10 != null) {
					var9 = var10;
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6);
					var10 = new FloorOverlayDefinition();
					if (var11 != null) {
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode();
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, ((long) (var6)));
					var9 = var10;
				}

				int var7;
				if (var9 == null) {
					var7 = var8;
				} else if (var9.secondaryRgb >= 0) {
					var7 = var9.secondaryRgb | (-16777216);
				} else {
					int var12;
					int var21;
					if (var9.texture >= 0) {
						var12 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture);
						byte var13 = 96;
						int var19;
						if (var12 == (-2)) {
							var19 = 12345678;
						} else if (var12 == (-1)) {
							if (var13 < 0) {
								var13 = 0;
							} else if (var13 > 127) {
								var13 = 127;
							}

							var21 = 127 - var13;
							var19 = var21;
						} else {
							var21 = (var13 * (var12 & 127)) / 128;
							if (var21 < 2) {
								var21 = 2;
							} else if (var21 > 126) {
								var21 = 126;
							}

							var19 = var21 + (var12 & 65408);
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | (-16777216);
					} else if (var9.primaryRgb == 16711935) {
						var7 = var8;
					} else {
						var12 = var9.hue;
						var21 = var9.saturation;
						int var14 = var9.lightness;
						if (var14 > 179) {
							var21 /= 2;
						}

						if (var14 > 192) {
							var21 /= 2;
						}

						if (var14 > 217) {
							var21 /= 2;
						}

						if (var14 > 243) {
							var21 /= 2;
						}

						int var15 = (((var21 / 32) << 7) + (var14 / 2)) + ((var12 / 4) << 10);
						byte var17 = 96;
						int var16;
						if (var15 == (-2)) {
							var16 = 12345678;
						} else {
							int var22;
							if (var15 == (-1)) {
								if (var17 < 0) {
									var17 = 0;
								} else if (var17 > 127) {
									var17 = 127;
								}

								var22 = 127 - var17;
								var16 = var22;
							} else {
								var22 = (var17 * (var15 & 127)) / 128;
								if (var22 < 2) {
									var22 = 2;
								} else if (var22 > 126) {
									var22 = 126;
								}

								var16 = var22 + (var15 & 65408);
							}
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | (-16777216);
					}
				}

				if (var3.field2793[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method5091(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2793[var5][var1][var2], var3.field2792[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(IILiu;Lis;I)I", garbageValue = 
	"-1949774050")

	int method4671(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = 
	"(IILiu;[Lqx;B)V", garbageValue = 
	"94")

	void method4690(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if ((var6 != null) && (var6.length != 0)) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = (var11 >= WorldMapDecorationType.field3513.id) && (var11 <= WorldMapDecorationType.field3532.id);
					if (!var10) {
						int var13 = var9.decoration;
						boolean var12 = var13 == WorldMapDecorationType.field3520.id;
						if (!var12) {
							continue;
						}
					}

					ObjectComposition var14 = class116.getObjectDefinition(var9.objectDefinitionId);
					if (var14.mapSceneId != (-1)) {
						if ((var14.mapSceneId != 46) && (var14.mapSceneId != 52)) {
							var4[var14.mapSceneId].method8161(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
						} else {
							var4[var14.mapSceneId].method8161(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), (this.pixelsPerTile * 2) + 1, (this.pixelsPerTile * 2) + 1);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(IILiu;B)V", garbageValue = 
	"-88")

	void method4706(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if ((var5 != null) && (var5.length != 0)) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					if (class14.method175(var8.decoration)) {
						ObjectComposition var9 = class116.getObjectDefinition(var8.objectDefinitionId);
						int var10 = (var9.int1 != 0) ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field3519.id) {
							this.method4739(var1, var2, var8.rotation, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field3512.id) {
							this.method4739(var1, var2, var8.rotation, -3355444);
							this.method4739(var1, var2, var8.rotation + 1, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field3511.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(((this.pixelsPerTile * var1) + this.pixelsPerTile) - 1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(((this.pixelsPerTile * var1) + this.pixelsPerTile) - 1, ((this.pixelsPerTile * (63 - var2)) + this.pixelsPerTile) - 1, 1, var10);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, ((this.pixelsPerTile * (63 - var2)) + this.pixelsPerTile) - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3514.id) {
							int var11 = var8.rotation % 2;
							int var12;
							if (var11 == 0) {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + (this.pixelsPerTile * var1), (((64 - var2) * this.pixelsPerTile) - 1) - var12, 1, var10);
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + (this.pixelsPerTile * var1), var12 + (this.pixelsPerTile * (63 - var2)), 1, var10);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"(IILjava/util/HashSet;II)V", garbageValue = 
	"-162919389")

	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = ((float) (var4)) / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();

		while (var7.hasNext()) {
			Entry var8 = ((Entry) (var7.next()));
			Coord var9 = ((Coord) (var8.getKey()));
			int var10 = ((int) ((((float) (var1)) + (var5 * ((float) (var9.x)))) - var6));
			int var11 = ((int) ((((float) (var2 + var4)) - (var5 * ((float) (var9.y)))) - var6));
			AbstractWorldMapIcon var12 = ((AbstractWorldMapIcon) (var8.getValue()));
			if ((var12 != null) && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = class19.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method4695(var12, var10, var11, var5);
				}
			}
		} 

	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/util/HashSet;IIB)V", garbageValue = 
	"-127")

	void method4693(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = ((AbstractWorldMapIcon) (var4.next()));
			if (var5.hasValidElement()) {
				WorldMapElement var6 = class19.WorldMapElement_get(var5.getElement());
				if ((var6 != null) && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		} 

	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(Lfs;IIIIB)V", garbageValue = 
	"-10")

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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = 
	"(Lic;IIFI)V", garbageValue = 
	"1970229100")

	void method4695(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class19.WorldMapElement_get(var1.getElement());
		this.method4696(var5, var2, var3);
		this.method4789(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = 
	"(Lfs;IIB)V", garbageValue = 
	"44")

	void method4696(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method4710(var4, var1.horizontalAlignment);
			int var6 = this.method4700(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = 
	"(Lic;Lfs;IIFS)V", garbageValue = 
	"-3122")

	void method4789(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method4532(var5)) {
				Font var7 = ((Font) (this.fonts.get(var6.size)));
				var7.drawLines(var6.text, var3 - (var6.width / 2), var4, var6.width, var6.height, (-16777216) | var2.field1833, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = 
	"(IILjava/util/HashSet;IS)V", garbageValue = 
	"16351")

	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = ((float) (var4)) / 64.0F;
		Iterator var6 = this.icon0List.iterator();

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = ((AbstractWorldMapIcon) (var6.next()));
			if (var7.hasValidElement()) {
				int var8 = var7.coord2.x % 64;
				int var9 = var7.coord2.y % 64;
				var7.screenX = ((int) ((var5 * ((float) (var8))) + ((float) (var1))));
				var7.screenY = ((int) ((((float) (63 - var9)) * var5) + ((float) (var2))));
				if (!var3.contains(var7.getElement())) {
					this.method4695(var7, var7.screenX, var7.screenY, var5);
				}
			}
		} 

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = 
	"(Lql;Lfg;I)I", garbageValue = 
	"1542273594")

	int method4710(SpritePixels var1, HorizontalAlignment var2) {
		switch (var2.value) {
			case 0 :
				return 0;
			case 1 :
				return (-var1.subWidth) / 2;
			default :
				return -var1.subWidth;}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = 
	"(Lql;Lfm;I)I", garbageValue = 
	"-646566813")

	int method4700(SpritePixels var1, VerticalAlignment var2) {
		switch (var2.value) {
			case 0 :
				return (-var1.subHeight) / 2;
			case 2 :
				return 0;
			default :
				return -var1.subHeight;}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = 
	"(II)Liw;", garbageValue = 
	"836188853")

	WorldMapLabel method4675(int var1) {
		WorldMapElement var2 = class19.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = 
	"(Lfs;I)Liw;", garbageValue = 
	"-2050165109")

	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (((var1.name != null) && (this.fonts != null)) && (this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null)) {
			WorldMapLabelSize var2 = WorldMapLabelSize.method4536(var1.textSize);
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
					int var6 = (var5.length * var3.ascent) / 2;
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = 
	"(IIIIIB)Ljava/util/List;", garbageValue = 
	"123")

	List method4703(int var1, int var2, int var3, int var4, int var5) {
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/util/List;", garbageValue = 
	"32")

	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = 
	"(IIIII)V", garbageValue = 
	"-1810808163")

	void method4739(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) {
			Rasterizer2D.Rasterizer2D_drawVerticalLine((this.pixelsPerTile + (this.pixelsPerTile * var1)) - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, ((this.pixelsPerTile * (63 - var2)) + this.pixelsPerTile) - 1, this.pixelsPerTile, var4);
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"2014559127")

	@Export("getVarbit")
	public static int getVarbit(int var0) {
		VarbitComposition var2 = ((VarbitComposition) (VarbitComposition.VarbitDefinition_cached.get(((long) (var0)))));
		VarbitComposition var1;
		if (var2 != null) {
			var1 = var2;
		} else {
			byte[] var3 = VarbitComposition.VarbitDefinition_archive.takeFile(14, var0);
			var2 = new VarbitComposition();
			if (var3 != null) {
				var2.decode(new Buffer(var3));
			}

			VarbitComposition.VarbitDefinition_cached.put(var2, ((long) (var0)));
			var1 = var2;
		}

		int var7 = var1.baseVar;
		int var4 = var1.startBit;
		int var5 = var1.endBit;
		int var6 = Varps.Varps_masks[var5 - var4];
		return (Varps.Varps_main[var7] >> var4) & var6;
	}

	@ObfuscatedName("hc")
	@ObfuscatedSignature(descriptor = 
	"(Lck;B)V", garbageValue = 
	"3")

	static final void method4795(PendingSpawn var0) {
		long var1 = 0L;
		int var3 = -1;
		int var4 = 0;
		int var5 = 0;
		if (var0.type == 0) {
			var1 = FriendSystem.scene.getBoundaryObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 1) {
			var1 = FriendSystem.scene.getWallDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 2) {
			var1 = FriendSystem.scene.getGameObjectTag(var0.plane, var0.x, var0.y);
		}

		if (var0.type == 3) {
			var1 = FriendSystem.scene.getFloorDecorationTag(var0.plane, var0.x, var0.y);
		}

		if (0L != var1) {
			int var6 = FriendSystem.scene.getObjectFlags(var0.plane, var0.x, var0.y, var1);
			var3 = class121.Entity_unpackID(var1);
			var4 = var6 & 31;
			var5 = (var6 >> 6) & 3;
		}

		var0.objectId = var3;
		var0.field1119 = var4;
		var0.field1117 = var5;
	}

	@ObfuscatedName("ls")
	@ObfuscatedSignature(descriptor = 
	"(Lpd;II)V", garbageValue = 
	"56012862")

	static void method4798(Buffer var0, int var1) {
		FontName.method7510(var0.array, var1);
		if (JagexCache.JagexCache_randomDat != null) {
			try {
				JagexCache.JagexCache_randomDat.seek(0L);
				JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
			} catch (Exception var3) {
			}
		}

	}
}