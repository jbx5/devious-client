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

@ObfuscatedName("hy")
@Implements("WorldMapRegion")
public class WorldMapRegion {
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "Lit;"
	)
	@Export("WorldMapRegion_cachedSprites")
	public static DemotingHashTable WorldMapRegion_cachedSprites;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1309075089
	)
	@Export("regionX")
	int regionX;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1933017987
	)
	@Export("regionY")
	int regionY;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lhr;"
	)
	@Export("worldMapData_0")
	WorldMapData_0 worldMapData_0;
	@ObfuscatedName("m")
	@Export("worldMapData1List")
	LinkedList worldMapData1List;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 2127216701
	)
	@Export("backgroundColor")
	int backgroundColor;
	@ObfuscatedName("j")
	@ObfuscatedGetter(
		intValue = 2056192141
	)
	@Export("pixelsPerTile")
	int pixelsPerTile;
	@ObfuscatedName("v")
	@Export("icon0List")
	List icon0List;
	@ObfuscatedName("h")
	@Export("iconMap")
	HashMap iconMap;
	@ObfuscatedName("t")
	@Export("fonts")
	final HashMap fonts;

	static {
		WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256); // L: 26
	}

	WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
		this.regionX = var1; // L: 42
		this.regionY = var2; // L: 43
		this.worldMapData1List = new LinkedList(); // L: 44
		this.icon0List = new LinkedList(); // L: 45
		this.iconMap = new HashMap(); // L: 46
		this.backgroundColor = var3 | -16777216; // L: 47
		this.fonts = var4; // L: 48
	} // L: 49

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-656854124"
	)
	void method4886(int var1, int var2, int var3) {
		int var5 = this.regionX; // L: 53
		int var6 = this.regionY; // L: 54
		int var7 = this.pixelsPerTile; // L: 55
		SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(SecureRandomFuture.method2111(var5, var6, var7)); // L: 57
		if (var4 != null) { // L: 60
			if (var3 == this.pixelsPerTile * 64) { // L: 61
				var4.drawAt(var1, var2); // L: 62
			} else {
				var4.drawScaledWorldmap(var1, var2, var3, var3); // L: 65
			}

		}
	} // L: 67

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lhr;Ljava/util/List;B)V",
		garbageValue = "-72"
	)
	@Export("initWorldMapData0")
	void initWorldMapData0(WorldMapData_0 var1, List var2) {
		this.iconMap.clear(); // L: 70
		this.worldMapData_0 = var1; // L: 71
		this.addAllToIconList(var2); // L: 72
	} // L: 73

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
		garbageValue = "1388171253"
	)
	@Export("initWorldMapData1")
	void initWorldMapData1(HashSet var1, List var2) {
		this.iconMap.clear(); // L: 76
		Iterator var3 = var1.iterator(); // L: 77

		while (var3.hasNext()) {
			WorldMapData_1 var4 = (WorldMapData_1)var3.next(); // L: 78
			if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) {
				this.worldMapData1List.add(var4);
			}
		}

		this.addAllToIconList(var2);
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(IIIILig;I)V",
		garbageValue = "-1436152386"
	)
	@Export("getIconsForTiles")
	void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		for (int var6 = var1; var6 < var3 + var1; ++var6) {
			label76:
			for (int var7 = var2; var7 < var2 + var4; ++var7) {
				for (int var8 = 0; var8 < var5.planes; ++var8) {
					WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
					if (var9 != null && var9.length != 0) {
						WorldMapDecoration[] var10 = var9;

						for (int var11 = 0; var11 < var10.length; ++var11) {
							ObjectComposition var13;
							boolean var14;
							label67: {
								WorldMapDecoration var12 = var10[var11];
								var13 = PlayerComposition.getObjectDefinition(var12.objectDefinitionId);
								if (var13.transforms != null) { // L: 104
									int[] var15 = var13.transforms;

									for (int var16 = 0; var16 < var15.length; ++var16) {
										int var17 = var15[var16];
										ObjectComposition var18 = PlayerComposition.getObjectDefinition(var17);
										if (var18.mapIconId != -1) {
											var14 = true;
											break label67;
										}
									}
								} else if (var13.mapIconId != -1) { // L: 119
									var14 = true; // L: 120
									break label67; // L: 121
								}

								var14 = false; // L: 123
							}

							if (var14) { // L: 125
								this.getIcon(var13, var8, var6, var7, var5); // L: 128
								continue label76; // L: 129
							}
						}
					}
				}
			}
		}

	} // L: 136

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lgz;IIILig;I)V",
		garbageValue = "90132748"
	)
	@Export("getIcon")
	void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
		Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4); // L: 139
		Coord var7 = null; // L: 140
		if (this.worldMapData_0 != null) { // L: 141
			var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, var4 + this.worldMapData_0.regionYLow * 64); // L: 142
		} else {
			WorldMapData_1 var8 = (WorldMapData_1)var5; // L: 145
			var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 64 + var8.getChunkYLow() * 8); // L: 146
		}

		WorldMapElement var9;
		Object var10;
		if (var1.transforms != null) { // L: 149
			var10 = new WorldMapIcon_1(var7, var6, var1.id, this); // L: 150
		} else {
			var9 = class139.WorldMapElement_get(var1.mapIconId); // L: 153
			var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9)); // L: 154
		}

		var9 = class139.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement()); // L: 156
		if (var9.field1855) { // L: 157
			this.iconMap.put(new Coord(0, var3, var4), var10); // L: 158
		}

	} // L: 160

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "643501315"
	)
	@Export("initWorldMapIcon1s")
	void initWorldMapIcon1s() {
		Iterator var1 = this.iconMap.values().iterator(); // L: 163

		while (var1.hasNext()) {
			AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next(); // L: 164
			if (var2 instanceof WorldMapIcon_1) { // L: 166
				((WorldMapIcon_1)var2).init(); // L: 167
			}
		}

	} // L: 171

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/List;I)V",
		garbageValue = "279288883"
	)
	@Export("addAllToIconList")
	void addAllToIconList(List var1) {
		Iterator var2 = var1.iterator(); // L: 174

		while (var2.hasNext()) {
			WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next(); // L: 175
			if (class139.WorldMapElement_get(var3.element).field1855 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) { // L: 177 180
				WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4839(var3.element)); // L: 181
				this.icon0List.add(var4); // L: 182
			}
		}

	} // L: 186

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-80"
	)
	void method4878() {
		if (this.worldMapData_0 != null) { // L: 189
			this.worldMapData_0.reset(); // L: 190
		} else {
			Iterator var1 = this.worldMapData1List.iterator(); // L: 193

			while (var1.hasNext()) {
				WorldMapData_1 var2 = (WorldMapData_1)var1.next(); // L: 194
				var2.reset(); // L: 196
			}
		}

	} // L: 200

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Llv;I)Z",
		garbageValue = "1684690917"
	)
	@Export("loadGeography")
	boolean loadGeography(AbstractArchive var1) {
		this.iconMap.clear(); // L: 203
		if (this.worldMapData_0 != null) { // L: 204
			this.worldMapData_0.loadGeography(var1); // L: 205
			if (this.worldMapData_0.isFullyLoaded()) { // L: 206
				this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0); // L: 207
				return true; // L: 208
			} else {
				return false; // L: 210
			}
		} else {
			boolean var2 = true; // L: 213

			Iterator var3;
			WorldMapData_1 var4;
			for (var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) { // L: 214 218
				var4 = (WorldMapData_1)var3.next(); // L: 215
				var4.loadGeography(var1); // L: 217
			}

			if (var2) { // L: 221
				var3 = this.worldMapData1List.iterator(); // L: 222

				while (var3.hasNext()) {
					var4 = (WorldMapData_1)var3.next(); // L: 223
					this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4); // L: 225
				}
			}

			return var2; // L: 229
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(ILiw;[Lqu;Llv;Llv;B)V",
		garbageValue = "50"
	)
	@Export("drawTile")
	void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
		this.pixelsPerTile = var1; // L: 234
		if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) { // L: 235
			int var7 = this.regionX; // L: 239
			int var8 = this.regionY; // L: 240
			SpritePixels var6 = (SpritePixels)WorldMapRegion_cachedSprites.get(SecureRandomFuture.method2111(var7, var8, var1)); // L: 242
			if (var6 == null) { // L: 244
				boolean var9 = true; // L: 247
				var9 &= this.loadGeography(var4); // L: 248
				int var11;
				if (this.worldMapData_0 != null) { // L: 251
					var11 = this.worldMapData_0.groupId; // L: 252
				} else {
					var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId; // L: 255
				}

				var9 &= var5.tryLoadGroup(var11); // L: 257
				if (var9) { // L: 258
					byte[] var10 = var5.takeFileFlat(var11); // L: 259
					WorldMapSprite var12;
					if (var10 == null) { // L: 262
						var12 = new WorldMapSprite(); // L: 263
					} else {
						var12 = new WorldMapSprite(class21.method322(var10).pixels); // L: 266
					}

					SpritePixels var14 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64); // L: 269
					var14.setRaster(); // L: 270
					if (this.worldMapData_0 != null) { // L: 271
						this.method4822(var2, var3, var12); // L: 272
					} else {
						this.method4823(var2, var3, var12); // L: 275
					}

					int var15 = this.regionX; // L: 277
					int var16 = this.regionY; // L: 278
					int var17 = this.pixelsPerTile; // L: 279
					WorldMapRegion_cachedSprites.put(var14, SecureRandomFuture.method2111(var15, var16, var17), var14.pixels.length * 4); // L: 281
					this.method4878(); // L: 283
				}
			}
		}
	} // L: 236 245 284

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIILjava/util/HashSet;I)V",
		garbageValue = "-249205297"
	)
	void method4820(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) { // L: 287
			var4 = new HashSet(); // L: 288
		}

		this.drawNonLinkMapIcons(var1, var2, var4, var3); // L: 290
		this.drawMapLinks(var1, var2, var4, var3); // L: 291
	} // L: 292

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;III)V",
		garbageValue = "1701800674"
	)
	@Export("flashElements")
	void flashElements(HashSet var1, int var2, int var3) {
		Iterator var4 = this.iconMap.values().iterator(); // L: 295

		while (var4.hasNext()) {
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 296
			if (var5.hasValidElement()) { // L: 298
				int var6 = var5.getElement(); // L: 299
				if (var1.contains(var6)) { // L: 300
					WorldMapElement var7 = class139.WorldMapElement_get(var6); // L: 301
					this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3); // L: 302
				}
			}
		}

		this.method4831(var1, var2, var3); // L: 306
	} // L: 307

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(Liw;[Lqu;Lir;I)V",
		garbageValue = "-246091167"
	)
	void method4822(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		int var4;
		int var5;
		for (var4 = 0; var4 < 64; ++var4) { // L: 310
			for (var5 = 0; var5 < 64; ++var5) { // L: 311
				this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3); // L: 312
				this.method4915(var4, var5, this.worldMapData_0, var1); // L: 313
			}
		}

		for (var4 = 0; var4 < 64; ++var4) { // L: 316
			for (var5 = 0; var5 < 64; ++var5) { // L: 317
				this.method4843(var4, var5, this.worldMapData_0, var1, var2); // L: 318
			}
		}

	} // L: 321

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Liw;[Lqu;Lir;B)V",
		garbageValue = "-15"
	)
	void method4823(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
		Iterator var4 = this.worldMapData1List.iterator(); // L: 324

		WorldMapData_1 var5;
		int var6;
		int var7;
		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 325

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 327
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 328
					this.drawTileGround(var6, var7, var5, var1, var3); // L: 329
					this.method4915(var6, var7, var5, var1); // L: 330
				}
			}
		}

		var4 = this.worldMapData1List.iterator(); // L: 335

		while (var4.hasNext()) {
			var5 = (WorldMapData_1)var4.next(); // L: 336

			for (var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) { // L: 338
				for (var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) { // L: 339
					this.method4843(var6, var7, var5, var1, var2); // L: 340
				}
			}
		}

	} // L: 345

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IILig;Liw;[Lqu;I)V",
		garbageValue = "-1762209577"
	)
	void method4843(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
		this.method4829(var1, var2, var3); // L: 348
		this.method4858(var1, var2, var3, var5); // L: 349
	} // L: 350

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(IILig;Liw;Lir;S)V",
		garbageValue = "27779"
	)
	@Export("drawTileGround")
	void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
		int var6 = var3.floorUnderlayIds[0][var1][var2] - 1; // L: 353
		int var7 = var3.floorOverlayIds[0][var1][var2] - 1; // L: 354
		if (var6 == -1 && var7 == -1) { // L: 355
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor); // L: 356
		}

		int var8 = 16711935; // L: 358
		int var9;
		if (var7 != -1) { // L: 359
			int var10 = this.backgroundColor; // L: 361
			FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7); // L: 365
			FloorOverlayDefinition var11;
			if (var12 != null) { // L: 366
				var11 = var12; // L: 367
			} else {
				byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7); // L: 370
				var12 = new FloorOverlayDefinition(); // L: 371
				if (var13 != null) { // L: 372
					var12.decode(new Buffer(var13), var7);
				}

				var12.postDecode(); // L: 373
				FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7); // L: 374
				var11 = var12; // L: 375
			}

			if (var11 == null) { // L: 378
				var9 = var10; // L: 379
			} else if (var11.secondaryRgb >= 0) { // L: 382
				var9 = var11.secondaryRgb | -16777216; // L: 383
			} else if (var11.texture >= 0) { // L: 385
				int var19 = class21.method319(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96); // L: 386
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | -16777216; // L: 387
			} else if (var11.primaryRgb == 16711935) { // L: 389
				var9 = var10; // L: 390
			} else {
				int var14 = var11.hue; // L: 394
				int var15 = var11.saturation; // L: 395
				int var16 = var11.lightness; // L: 396
				if (var16 > 179) { // L: 398
					var15 /= 2;
				}

				if (var16 > 192) { // L: 399
					var15 /= 2;
				}

				if (var16 > 217) { // L: 400
					var15 /= 2;
				}

				if (var16 > 243) { // L: 401
					var15 /= 2;
				}

				int var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10); // L: 402
				int var18 = class21.method319(var17, 96); // L: 406
				var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216; // L: 407
			}

			var8 = var9; // L: 410
		}

		if (var7 > -1 && var3.field2839[0][var1][var2] == 0) { // L: 412
			Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8); // L: 413
		} else {
			var9 = this.method4827(var1, var2, var3, var5); // L: 416
			if (var7 == -1) { // L: 417
				Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9); // L: 418
			} else {
				var4.method5237(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2839[0][var1][var2], var3.field2834[0][var1][var2]); // L: 421
			}
		}
	} // L: 414 419 422

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(IILig;Liw;B)V",
		garbageValue = "-8"
	)
	void method4915(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
		for (int var5 = 1; var5 < var3.planes; ++var5) { // L: 425
			int var6 = var3.floorOverlayIds[var5][var1][var2] - 1; // L: 426
			if (var6 > -1) { // L: 427
				int var8 = this.backgroundColor; // L: 429
				FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6); // L: 433
				FloorOverlayDefinition var9;
				if (var10 != null) { // L: 434
					var9 = var10; // L: 435
				} else {
					byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6); // L: 438
					var10 = new FloorOverlayDefinition(); // L: 439
					if (var11 != null) { // L: 440
						var10.decode(new Buffer(var11), var6);
					}

					var10.postDecode(); // L: 441
					FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6); // L: 442
					var9 = var10; // L: 443
				}

				int var7;
				if (var9 == null) { // L: 446
					var7 = var8; // L: 447
				} else if (var9.secondaryRgb >= 0) { // L: 450
					var7 = var9.secondaryRgb | -16777216; // L: 451
				} else if (var9.texture >= 0) { // L: 453
					int var17 = class21.method319(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96); // L: 454
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216; // L: 455
				} else if (var9.primaryRgb == 16711935) { // L: 457
					var7 = var8; // L: 458
				} else {
					int var12 = var9.hue; // L: 462
					int var13 = var9.saturation; // L: 463
					int var14 = var9.lightness; // L: 464
					if (var14 > 179) { // L: 466
						var13 /= 2;
					}

					if (var14 > 192) { // L: 467
						var13 /= 2;
					}

					if (var14 > 217) { // L: 468
						var13 /= 2;
					}

					if (var14 > 243) { // L: 469
						var13 /= 2;
					}

					int var15 = (var13 / 32 << 7) + var14 / 2 + (var12 / 4 << 10); // L: 470
					int var16 = class21.method319(var15, 96); // L: 474
					var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216; // L: 475
				}

				if (var3.field2839[var5][var1][var2] == 0) { // L: 479
					Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7); // L: 480
				} else {
					var4.method5237(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2839[var5][var1][var2], var3.field2834[var5][var1][var2]); // L: 483
				}
			}
		}

	} // L: 487

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IILig;Lir;I)I",
		garbageValue = "-1587474059"
	)
	int method4827(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
		return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2); // L: 490 491 493
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IILig;[Lqu;I)V",
		garbageValue = "235002508"
	)
	void method4858(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
		for (int var5 = 0; var5 < var3.planes; ++var5) { // L: 497
			WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2]; // L: 498
			if (var6 != null && var6.length != 0) { // L: 499
				WorldMapDecoration[] var7 = var6; // L: 503

				for (int var8 = 0; var8 < var7.length; ++var8) { // L: 504
					WorldMapDecoration var9 = var7[var8]; // L: 505
					if (BuddyRankComparator.method2791(var9.decoration) || class65.method2028(var9.decoration)) { // L: 507
						ObjectComposition var10 = PlayerComposition.getObjectDefinition(var9.objectDefinitionId); // L: 508
						if (var10.mapSceneId != -1) { // L: 509
							if (var10.mapSceneId != 46 && var10.mapSceneId != 52) { // L: 510
								var4[var10.mapSceneId].method8316(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2); // L: 514
							} else {
								var4[var10.mapSceneId].method8316(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1); // L: 511
							}
						}
					}
				}
			}
		}

	} // L: 522

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IILig;I)V",
		garbageValue = "-1175543420"
	)
	void method4829(int var1, int var2, AbstractWorldMapData var3) {
		for (int var4 = 0; var4 < var3.planes; ++var4) { // L: 525
			WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2]; // L: 526
			if (var5 != null && var5.length != 0) { // L: 527
				WorldMapDecoration[] var6 = var5; // L: 531

				for (int var7 = 0; var7 < var6.length; ++var7) { // L: 532
					WorldMapDecoration var8 = var6[var7]; // L: 533
					if (MilliClock.method3478(var8.decoration)) { // L: 535
						ObjectComposition var9 = PlayerComposition.getObjectDefinition(var8.objectDefinitionId); // L: 536
						int var10 = var9.int1 != 0 ? -3407872 : -3355444; // L: 537
						if (var8.decoration == WorldMapDecorationType.field3572.id) { // L: 538
							this.method4907(var1, var2, var8.rotation, var10); // L: 539
						}

						if (var8.decoration == WorldMapDecorationType.field3561.id) { // L: 541
							this.method4907(var1, var2, var8.rotation, -3355444); // L: 542
							this.method4907(var1, var2, var8.rotation + 1, var10); // L: 543
						}

						if (var8.decoration == WorldMapDecorationType.field3563.id) { // L: 545
							if (var8.rotation == 0) { // L: 546
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
							}

							if (var8.rotation == 1) {
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10); // L: 547
							}

							if (var8.rotation == 2) { // L: 548
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}

							if (var8.rotation == 3) { // L: 549
								Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
							}
						}

						if (var8.decoration == WorldMapDecorationType.field3583.id) { // L: 551
							int var11 = var8.rotation % 2; // L: 552
							int var12;
							if (var11 == 0) { // L: 553
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 554
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10); // L: 555
								}
							} else {
								for (var12 = 0; var12 < this.pixelsPerTile; ++var12) { // L: 559
									Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10); // L: 560
								}
							}
						}
					}
				}
			}
		}

	} // L: 569

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;IB)V",
		garbageValue = "-12"
	)
	@Export("drawNonLinkMapIcons")
	void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 572
		float var6 = var5 / 2.0F; // L: 573
		Iterator var7 = this.iconMap.entrySet().iterator(); // L: 574

		while (var7.hasNext()) {
			Entry var8 = (Entry)var7.next(); // L: 575
			Coord var9 = (Coord)var8.getKey(); // L: 577
			int var10 = (int)((float)var9.x * var5 + (float)var1 - var6); // L: 578
			int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6); // L: 579
			AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue(); // L: 580
			if (var12 != null && var12.hasValidElement()) { // L: 581
				var12.screenX = var10; // L: 582
				var12.screenY = var11; // L: 583
				WorldMapElement var13 = class139.WorldMapElement_get(var12.getElement()); // L: 584
				if (!var3.contains(var13.getObjectId())) { // L: 585
					this.method4833(var12, var10, var11, var5); // L: 586
				}
			}
		}

	} // L: 591

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/HashSet;IIB)V",
		garbageValue = "8"
	)
	void method4831(HashSet var1, int var2, int var3) {
		Iterator var4 = this.icon0List.iterator(); // L: 594

		while (var4.hasNext()) { // L: 603
			AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next(); // L: 595
			if (var5.hasValidElement()) { // L: 597
				WorldMapElement var6 = class139.WorldMapElement_get(var5.getElement()); // L: 598
				if (var6 != null && var1.contains(var6.getObjectId())) { // L: 599
					this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3); // L: 600
				}
			}
		}

	} // L: 604

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(Lfh;IIIIB)V",
		garbageValue = "0"
	)
	@Export("drawBackgroundCircle")
	void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
		SpritePixels var6 = var1.getSpriteBool(false); // L: 607
		if (var6 != null) { // L: 608
			var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2); // L: 611
			if (var4 % var5 < var5 / 2) { // L: 612
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128); // L: 613
				Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256); // L: 614
			}

		}
	} // L: 609 616

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(Lib;IIFI)V",
		garbageValue = "-1033175598"
	)
	void method4833(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
		WorldMapElement var5 = class139.WorldMapElement_get(var1.getElement()); // L: 619
		this.method4925(var5, var2, var3); // L: 620
		this.method4832(var1, var5, var2, var3, var4); // L: 621
	} // L: 622

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Lfh;III)V",
		garbageValue = "-1467551164"
	)
	void method4925(WorldMapElement var1, int var2, int var3) {
		SpritePixels var4 = var1.getSpriteBool(false); // L: 625
		if (var4 != null) { // L: 626
			int var5 = this.method4837(var4, var1.horizontalAlignment); // L: 627
			int var6 = this.method4838(var4, var1.verticalAlignment); // L: 628
			var4.drawTransBgAt(var5 + var2, var3 + var6); // L: 629
		}

	} // L: 631

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lib;Lfh;IIFB)V",
		garbageValue = "-19"
	)
	void method4832(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
		WorldMapLabel var6 = var1.getLabel(); // L: 634
		if (var6 != null) { // L: 635
			if (var6.size.method4687(var5)) { // L: 638
				Font var7 = (Font)this.fonts.get(var6.size); // L: 641
				var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1845, 0, 1, 0, var7.ascent / 2); // L: 642
			}
		}
	} // L: 636 639 643

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IILjava/util/HashSet;II)V",
		garbageValue = "155436674"
	)
	@Export("drawMapLinks")
	void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
		float var5 = (float)var4 / 64.0F; // L: 646
		Iterator var6 = this.icon0List.iterator(); // L: 647

		while (var6.hasNext()) {
			AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next(); // L: 648
			if (var7.hasValidElement()) { // L: 650
				int var8 = var7.coord2.x % 64; // L: 651
				int var9 = var7.coord2.y % 64; // L: 652
				var7.screenX = (int)((float)var1 + (float)var8 * var5); // L: 653
				var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2); // L: 654
				if (!var3.contains(var7.getElement())) { // L: 655
					this.method4833(var7, var7.screenX, var7.screenY, var5); // L: 658
				}
			}
		}

	} // L: 661

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lfy;I)I",
		garbageValue = "-400904120"
	)
	int method4837(SpritePixels var1, HorizontalAlignment var2) {
		switch(var2.value) { // L: 664
		case 1:
			return 0; // L: 667
		case 2:
			return -var1.subWidth / 2; // L: 675
		default:
			return -var1.subWidth; // L: 671
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lqi;Lfw;B)I",
		garbageValue = "-93"
	)
	int method4838(SpritePixels var1, VerticalAlignment var2) {
		switch(var2.value) { // L: 681
		case 0:
			return -var1.subHeight / 2; // L: 688
		case 1:
			return 0; // L: 692
		default:
			return -var1.subHeight; // L: 684
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IB)Lik;",
		garbageValue = "119"
	)
	WorldMapLabel method4839(int var1) {
		WorldMapElement var2 = class139.WorldMapElement_get(var1); // L: 698
		return this.createMapLabel(var2); // L: 699
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lfh;I)Lik;",
		garbageValue = "612289440"
	)
	@Export("createMapLabel")
	WorldMapLabel createMapLabel(WorldMapElement var1) {
		if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) { // L: 703
			int var3 = var1.textSize; // L: 707
			WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_large, WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium}; // L: 712
			WorldMapLabelSize[] var5 = var4; // L: 714
			int var6 = 0;

			WorldMapLabelSize var2;
			while (true) {
				if (var6 >= var5.length) {
					var2 = null; // L: 725
					break;
				}

				WorldMapLabelSize var7 = var5[var6]; // L: 716
				if (var3 == var7.field2704) { // L: 718
					var2 = var7; // L: 719
					break;
				}

				++var6; // L: 715
			}

			if (var2 == null) { // L: 728
				return null; // L: 729
			} else {
				Font var14 = (Font)this.fonts.get(var2); // L: 731
				if (var14 == null) { // L: 732
					return null; // L: 733
				} else {
					var6 = var14.lineCount(var1.name, 1000000); // L: 735
					String[] var15 = new String[var6]; // L: 736
					var14.breakLines(var1.name, (int[])null, var15); // L: 737
					int var8 = var15.length * var14.ascent / 2; // L: 738
					int var9 = 0; // L: 739
					String[] var10 = var15; // L: 741

					for (int var11 = 0; var11 < var10.length; ++var11) { // L: 742
						String var12 = var10[var11]; // L: 743
						int var13 = var14.stringWidth(var12); // L: 745
						if (var13 > var9) { // L: 746
							var9 = var13; // L: 747
						}
					}

					return new WorldMapLabel(var1.name, var9, var8, var2); // L: 752
				}
			}
		} else {
			return null; // L: 704
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)Ljava/util/List;",
		garbageValue = "-1372516958"
	)
	List method4908(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var6 = new LinkedList(); // L: 756
		if (var4 >= var1 && var5 >= var2) { // L: 757
			if (var4 < var3 + var1 && var5 < var3 + var2) { // L: 758
				Iterator var7 = this.iconMap.values().iterator(); // L: 759

				AbstractWorldMapIcon var8;
				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 760
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 762
						var6.add(var8); // L: 763
					}
				}

				var7 = this.icon0List.iterator(); // L: 767

				while (var7.hasNext()) {
					var8 = (AbstractWorldMapIcon)var7.next(); // L: 768
					if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) { // L: 770
						var6.add(var8); // L: 771
					}
				}

				return var6; // L: 775
			} else {
				return var6; // L: 766
			}
		} else {
			return var6;
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/util/List;",
		garbageValue = "-124"
	)
	@Export("icons")
	List icons() {
		LinkedList var1 = new LinkedList(); // L: 779
		var1.addAll(this.icon0List); // L: 780
		var1.addAll(this.iconMap.values()); // L: 781
		return var1; // L: 782
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)V",
		garbageValue = "-20737"
	)
	void method4907(int var1, int var2, int var3, int var4) {
		var3 %= 4; // L: 786
		if (var3 == 0) { // L: 787
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 1) { // L: 788
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 2) { // L: 789
			Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
		}

		if (var3 == 3) {
			Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4); // L: 790
		}

	} // L: 791

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "([BB)Lbt;",
		garbageValue = "-74"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 80
		Buffer var2 = new Buffer(var0); // L: 81
		var2.offset = var2.array.length - 2; // L: 82
		int var3 = var2.readUnsignedShort(); // L: 83
		int var4 = var2.array.length - 2 - var3 - 12; // L: 84
		var2.offset = var4; // L: 85
		int var5 = var2.readInt(); // L: 86
		var1.localIntCount = var2.readUnsignedShort(); // L: 87
		var1.localStringCount = var2.readUnsignedShort(); // L: 88
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 89
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 90
		int var6 = var2.readUnsignedByte(); // L: 91
		int var7;
		int var8;
		if (var6 > 0) { // L: 92
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 93

			for (var7 = 0; var7 < var6; ++var7) { // L: 94
				var8 = var2.readUnsignedShort(); // L: 95
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? ClanChannel.method3285(var8) : 1); // L: 96
				var1.switches[var7] = var9; // L: 97

				while (var8-- > 0) { // L: 98
					int var10 = var2.readInt(); // L: 99
					int var11 = var2.readInt(); // L: 100
					var9.put(new IntegerNode(var11), (long)var10); // L: 101
				}
			}
		}

		var2.offset = 0; // L: 105
		var1.field967 = var2.readStringCp1252NullTerminatedOrNull(); // L: 106
		var1.opcodes = new int[var5]; // L: 107
		var1.intOperands = new int[var5]; // L: 108
		var1.stringOperands = new String[var5]; // L: 109

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 110 111 116
			var8 = var2.readUnsignedShort(); // L: 112
			if (var8 == 3) { // L: 113
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) { // L: 114
				var1.intOperands[var7] = var2.readInt();
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 115
			}
		}

		return var1; // L: 118
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(Lkw;IIII)V",
		garbageValue = "-1557332309"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3417 == null) { // L: 1003
			throw new RuntimeException(); // L: 1004
		} else {
			var0.field3417[var1] = var2; // L: 1006
			var0.field3477[var1] = var3; // L: 1007
		}
	} // L: 1008
}
