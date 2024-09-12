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

@ObfuscatedName("ld")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("WorldMapRegion_cachedSprites")
	static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1303077359
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 628336181
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lkv;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("au")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 2033490009
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1179871107
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("ad")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("ah")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("ap")
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1284912551"
	)
	void method5973(int var1, int var2, int var3) {
		int var5 = this.regionX;
		int var6 = this.regionY;
		int var7 = this.pixelsPerTile;
		DemotingHashTable var8 = WorldMapRegion_cachedSprites;
		long var9 = (long)(var7 << 16 | var5 << 8 | var6);
		SpritePixels var4 = (SpritePixels)var8.get(var9);
		if (var4 != null) {
			if (var3 == this.pixelsPerTile * 64) {
				var4.drawAt(var1, var2);
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3);
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lkv;Ljava/util/List;B)V",
		garbageValue = "117"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear();
		this.worldMapData_0 = var1;
		this.addAllToIconList(var2);
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "-321671293"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next();
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) {
				this.worldMapData1List.add(var4);
			}
		}

		this.addAllToIconList(var2);
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIILla;B)V",
		garbageValue = "-125"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label50:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							WorldMapDecoration var12 = var10[var11];
							ObjectComposition var13 = class273.getObjectDefinition(var12.objectDefinitionId);
							if (class402.method7747(var13)) {
								this.getIcon(var13, var8, var6, var7, var5);
								continue label50;
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lid;IIILla;I)V",
		garbageValue = "-2083809634"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
		Coord var7 = null;
		if (this.worldMapData_0 != null) {
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, var4 + this.worldMapData_0.regionYLow * 64);
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5;
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8);
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) {
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
		} else {
			var9 = class142.WorldMapElement_get(var1.mapIconId);
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
		}

		var9 = class142.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
		if (var9.field1906) {
			this.iconMap.put(new Coord(0, var3, var4), var10);
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2142816089"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator();

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next();
			if (var2 instanceof WorldMapIcon_1) {
				((WorldMapIcon_1)var2).init();
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "1140645796"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator();

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
			if (class142.WorldMapElement_get(var3.element).field1906 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5885(var3.element));
				this.icon0List.add(var4);
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1193256134"
	)
	void method5913() {
		if (this.worldMapData_0 != null) {
			this.worldMapData_0.reset();
		} else {
			Iterator var1 = this.worldMapData1List.iterator();

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next();
				var2.reset();
			}
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Lpo;I)Z",
		garbageValue = "-2032861805"
	)
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
				var4 = (WorldMapData_1)var3.next();
				var4.loadGeography(var1);
			}

			if (var2) {
				var3 = this.worldMapData1List.iterator();

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next();
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
				}
			}

			return var2;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILlo;[Lvt;Lpo;Lpo;D)V"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5, double var6) {
		this.pixelsPerTile = var1;
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
			int var9 = this.regionX;
			int var10 = this.regionY;
			DemotingHashTable var11 = WorldMapRegion_cachedSprites;
			long var12 = (long)(var1 << 16 | var9 << 8 | var10);
			SpritePixels var8 = (SpritePixels)var11.get(var12);
			if (var8 == null) {
				if (Rasterizer3D.method4728() != var6) {
					Rasterizer3D.buildPalette(var6);
				}

				boolean var16 = true;
				var16 &= this.loadGeography(var4);
				int var13;
				if (this.worldMapData_0 != null) {
					var13 = this.worldMapData_0.groupId;
				} else {
					var13 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
				}

				var16 &= var5.tryLoadGroup(var13);
				if (var16) {
					byte[] var17 = var5.takeFileFlat(var13);
					WorldMapSprite var14 = class53.method1112(var17);
					SpritePixels var15 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
					var15.setRaster();
					if (this.worldMapData_0 != null) {
						this.method5890(var2, var3, var14);
					} else {
						this.method5918(var2, var3, var14);
					}

					class277.method5709(var15, this.regionX, this.regionY, this.pixelsPerTile);
					this.method5913();
				}
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "803315325"
	)
	void method5888(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3);
		this.drawMapLinks(var1, var2, var4, var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "107"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				int var6 = var5.getElement();
				if (var1.contains(var6)) {
					WorldMapElement var7 = class142.WorldMapElement_get(var6);
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

		this.method5899(var1, var2, var3);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Llo;[Lvt;Llc;I)V",
		garbageValue = "-1646001847"
	)
	void method5890(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
				this.method5894(var4, var5, this.worldMapData_0, var1);
			}
		}

		for (var4 = 0; var4 < 64; ++var4) {
			for (var5 = 0; var5 < 64; ++var5) {
				this.method5892(var4, var5, this.worldMapData_0, var1, var2);
			}
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Llo;[Lvt;Llc;B)V",
		garbageValue = "18"
	)
	void method5918(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator();

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.drawTileGround(var6, var7, var5, var1, var3);
					this.method5894(var6, var7, var5, var1);
				}
			}
		}

		var4 = this.worldMapData1List.iterator();

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next();

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
					this.method5892(var6, var7, var5, var1, var2);
				}
			}
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IILla;Llo;[Lvt;I)V",
		garbageValue = "-565831480"
	)
	void method5892(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method5897(var1, var2, var3);
		this.method5942(var1, var2, var3, var5);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IILla;Llo;Llc;I)V",
		garbageValue = "-1494869343"
	)
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
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7);
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
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7);
				var11 = var12;
			}

			if (var11 == null) {
				var9 = var10;
			} else {
				int var14;
				byte var15;
				int var17;
				int var18;
				if (var11.secondaryRgb >= 0) {
					var17 = UserComparator9.method3219(var11.secondaryHue, var11.secondarySaturation, var11.secondaryLightness);
					var15 = 96;
					if (var17 == -2) {
						var14 = 12345678;
					} else if (var17 == -1) {
						if (var15 < 0) {
							var15 = 0;
						} else if (var15 > 127) {
							var15 = 127;
						}

						var18 = 127 - var15;
						var14 = var18;
					} else {
						var18 = var15 * (var17 & 127) / 128;
						if (var18 < 2) {
							var18 = 2;
						} else if (var18 > 126) {
							var18 = 126;
						}

						var14 = var18 + (var17 & 65408);
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var14] | -16777216;
				} else if (var11.texture >= 0) {
					var14 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture);
					var15 = 96;
					if (var14 == -2) {
						var17 = 12345678;
					} else if (var14 == -1) {
						if (var15 < 0) {
							var15 = 0;
						} else if (var15 > 127) {
							var15 = 127;
						}

						var18 = 127 - var15;
						var17 = var18;
					} else {
						var18 = var15 * (var14 & 127) / 128;
						if (var18 < 2) {
							var18 = 2;
						} else if (var18 > 126) {
							var18 = 126;
						}

						var17 = var18 + (var14 & 65408);
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216;
				} else if (var11.primaryRgb == 16711935) {
					var9 = var10;
				} else {
					var17 = UserComparator9.method3219(var11.hue, var11.saturation, var11.lightness);
					var15 = 96;
					if (var17 == -2) {
						var14 = 12345678;
					} else if (var17 == -1) {
						if (var15 < 0) {
							var15 = 0;
						} else if (var15 > 127) {
							var15 = 127;
						}

						var18 = 127 - var15;
						var14 = var18;
					} else {
						var18 = var15 * (var17 & 127) / 128;
						if (var18 < 2) {
							var18 = 2;
						} else if (var18 > 126) {
							var18 = 126;
						}

						var14 = var18 + (var17 & 65408);
					}

					var9 = Rasterizer3D.Rasterizer3D_colorPalette[var14] | -16777216;
				}
			}

			var8 = var9;
		}

		if (var7 > -1 && var3.field3197[0][var1][var2] == 0) {
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
		} else {
			var9 = this.method5895(var1, var2, var3, var5);
			if (var7 == -1) {
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
			} else {
				var4.method6330(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field3197[0][var1][var2], var3.field3200[0][var1][var2]);
			}
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IILla;Llo;B)V",
		garbageValue = "3"
	)
	void method5894(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) {
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
			if (var6 > -1) {
				int var8 = this.backgroundColor;
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6);
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
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6);
					var9 = var10;
				}

				int var7;
				if (var9 == null) {
					var7 = var8;
				} else {
					int var12;
					byte var13;
					int var15;
					int var17;
					if (var9.secondaryRgb >= 0) {
						var15 = UserComparator9.method3219(var9.secondaryHue, var9.secondarySaturation, var9.secondaryLightness);
						var13 = 96;
						if (var15 == -2) {
							var12 = 12345678;
						} else if (var15 == -1) {
							if (var13 < 0) {
								var13 = 0;
							} else if (var13 > 127) {
								var13 = 127;
							}

							var17 = 127 - var13;
							var12 = var17;
						} else {
							var17 = var13 * (var15 & 127) / 128;
							if (var17 < 2) {
								var17 = 2;
							} else if (var17 > 126) {
								var17 = 126;
							}

							var12 = var17 + (var15 & 65408);
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
					} else if (var9.texture >= 0) {
						var12 = Rasterizer3D.clips.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture);
						var13 = 96;
						if (var12 == -2) {
							var15 = 12345678;
						} else if (var12 == -1) {
							if (var13 < 0) {
								var13 = 0;
							} else if (var13 > 127) {
								var13 = 127;
							}

							var17 = 127 - var13;
							var15 = var17;
						} else {
							var17 = var13 * (var12 & 127) / 128;
							if (var17 < 2) {
								var17 = 2;
							} else if (var17 > 126) {
								var17 = 126;
							}

							var15 = var17 + (var12 & 65408);
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var15] | -16777216;
					} else if (var9.primaryRgb == 16711935) {
						var7 = var8;
					} else {
						var15 = UserComparator9.method3219(var9.hue, var9.saturation, var9.lightness);
						var13 = 96;
						if (var15 == -2) {
							var12 = 12345678;
						} else if (var15 == -1) {
							if (var13 < 0) {
								var13 = 0;
							} else if (var13 > 127) {
								var13 = 127;
							}

							var17 = 127 - var13;
							var12 = var17;
						} else {
							var17 = var13 * (var15 & 127) / 128;
							if (var17 < 2) {
								var17 = 2;
							} else if (var17 > 126) {
								var17 = 126;
							}

							var12 = var17 + (var15 & 65408);
						}

						var7 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
					}
				}

				if (var3.field3197[var5][var1][var2] == 0) {
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
				} else {
					var4.method6330(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field3197[var5][var1][var2], var3.field3200[var5][var1][var2]);
				}
			}
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IILla;Llc;I)I",
		garbageValue = "2116059415"
	)
	int method5895(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IILla;[Lvt;I)V",
		garbageValue = "-1730188085"
	)
	void method5942(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) {
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				WorldMapDecoration[] var7 = var6;

				for (int var8 = 0; var8 < var7.length; ++var8) {
					WorldMapDecoration var9 = var7[var8];
					int var11 = var9.decoration;
					boolean var10 = var11 >= WorldMapDecorationType.field4059.id && var11 <= WorldMapDecorationType.field4060.id;
					if (var10 || class202.method4067(var9.decoration)) {
						ObjectComposition var12 = class273.getObjectDefinition(var9.objectDefinitionId);
						if (var12.mapSceneId != -1) {
							if (var12.mapSceneId != 46 && var12.mapSceneId != 52) {
								var4[var12.mapSceneId].method10359(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
							} else {
								var4[var12.mapSceneId].method10359(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IILla;B)V",
		garbageValue = "-88"
	)
	void method5897(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) {
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
			if (var5 != null && var5.length != 0) {
				WorldMapDecoration[] var6 = var5;

				for (int var7 = 0; var7 < var6.length; ++var7) {
					WorldMapDecoration var8 = var6[var7];
					if (LoginScreenAnimation.method2727(var8.decoration)) {
						ObjectComposition var9 = class273.getObjectDefinition(var8.objectDefinitionId);
						int var10 = var9.int1 != 0 ? -3407872 : -3355444;
						if (var8.decoration == WorldMapDecorationType.field4050.id) {
							this.method5949(var1, var2, var8.rotation, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field4061.id) {
							this.method5949(var1, var2, var8.rotation, -3355444);
							this.method5949(var1, var2, var8.rotation + 1, var10);
						}

						if (var8.decoration == WorldMapDecorationType.field4042.id) {
							if (var8.rotation == 0) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 2) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field4043.id) {
							int var11 = var8.rotation % 2;
							int var12;
							if (var11 == 0) {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10);
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) {
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "69"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		float var6 = var5 / 2.0F;
		Iterator var7 = this.iconMap.entrySet().iterator();

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next();
			Coord var9 = (Coord)var8.getKey();
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6);
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
			if (var12 != null && var12.hasValidElement()) {
				var12.screenX = var10;
				var12.screenY = var11;
				WorldMapElement var13 = class142.WorldMapElement_get(var12.getElement());
				if (!var3.contains(var13.getObjectId())) {
					this.method5901(var12, var10, var11, var5);
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "-998595859"
	)
	void method5899(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator();

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
			if (var5.hasValidElement()) {
				WorldMapElement var6 = class142.WorldMapElement_get(var5.getElement());
				if (var6 != null && var1.contains(var6.getObjectId())) {
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
				}
			}
		}

	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lhf;IIIIB)V",
		garbageValue = "-84"
	)
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(Lly;IIFI)V",
		garbageValue = "-1421588499"
	)
	void method5901(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class142.WorldMapElement_get(var1.getElement());
		this.method5966(var5, var2, var3);
		this.method5903(var1, var5, var2, var3, var4);
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(Lhf;III)V",
		garbageValue = "1571344644"
	)
	void method5966(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false);
		if (var4 != null) {
			int var5 = this.method5905(var4, var1.horizontalAlignment);
			int var6 = this.method5907(var4, var1.verticalAlignment);
			var4.drawTransBgAt(var5 + var2, var3 + var6);
		}

	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(Lly;Lhf;IIFI)V",
		garbageValue = "1804421718"
	)
	void method5903(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel();
		if (var6 != null) {
			if (var6.size.method5750(var5)) {
				Font var7 = (Font)this.fonts.get(var6.size);
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1904, 0, 1, 0, var7.ascent / 2);
			}
		}
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "112"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F;
		Iterator var6 = this.icon0List.iterator();

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next();
			if (var7.hasValidElement()) {
				int var8 = var7.coord2.x % 64;
				int var9 = var7.coord2.y % 64;
				var7.screenX = (int)((float)var1 + (float)var8 * var5);
				var7.screenY = (int)((float)var2 + var5 * (float)(63 - var9));
				if (!var3.contains(var7.getElement())) {
					this.method5901(var7, var7.screenX, var7.screenY, var5);
				}
			}
		}

	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(Lvv;Lhg;I)I",
		garbageValue = "1646952437"
	)
	int method5905(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) {
		case 1:
			return 0;
		case 2:
			return -var1.subWidth / 2;
		default:
			return -var1.subWidth;
		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(Lvv;Lhq;I)I",
		garbageValue = "-248686533"
	)
	int method5907(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) {
		case 0:
			return -var1.subHeight / 2;
		case 1:
			return 0;
		default:
			return -var1.subHeight;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IB)Lls;",
		garbageValue = "0"
	)
	WorldMapLabel method5885(int var1) {
		WorldMapElement var2 = class142.WorldMapElement_get(var1);
		return this.createMapLabel(var2);
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(Lhf;I)Lls;",
		garbageValue = "1088602339"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
			int var3 = var1.textSize;
			WorldMapLabelSize[] var4 = WorldMapLabelSize.method5755();
			int var5 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var5 >= var4.length) {
					var2 = null;
					break;
				}

				WorldMapLabelSize var6 = var4[var5];
				if (var3 == var6.field3079) {
					var2 = var6;
					break;
				}

				++var5;
			}

			if (var2 == null) {
				return null;
			} else {
				Font var14 = (Font)this.fonts.get(var2);
				if (var14 == null) {
					return null;
				} else {
					int var15 = var14.lineCount(var1.name, 1000000);
					String[] var7 = new String[var15];
					var14.breakLines(var1.name, (int[])null, var7);
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)Ljava/util/List;",
		garbageValue = "1"
	)
	List method5909(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var3 + var2) {
				Iterator var7 = this.iconMap.values().iterator();

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next();
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
						var6.add(var8);
					}
				}

				var7 = this.icon0List.iterator();

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next();
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/List;",
		garbageValue = "-2005009941"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList();
		var1.addAll(this.icon0List);
		var1.addAll(this.iconMap.values());
		return var1;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-74"
	)
	void method5949(int var1, int var2, int var3, int var4) {
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
}
