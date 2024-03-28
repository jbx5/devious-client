import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kh")
@Implements("WorldMapRenderer")
public final class WorldMapRenderer {
	@ObfuscatedName("bk")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("az")
	@Export("loaded")
	boolean loaded;
	@ObfuscatedName("ah")
	boolean field3018;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("mapAreaData")
	WorldMapAreaData mapAreaData;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("compositeTextureSprite")
	SpritePixels compositeTextureSprite;
	@ObfuscatedName("an")
	@Export("icons")
	HashMap icons;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "[[Lkr;"
	)
	@Export("regions")
	WorldMapRegion[][] regions;
	@ObfuscatedName("ab")
	@Export("scaleHandlers")
	HashMap scaleHandlers;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("geographyArchive")
	final AbstractArchive geographyArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("groundArchive")
	final AbstractArchive groundArchive;
	@ObfuscatedName("as")
	@Export("fonts")
	final HashMap fonts;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1616537803
	)
	@Export("tileX")
	int tileX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 218630049
	)
	@Export("tileY")
	int tileY;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1462745536
	)
	@Export("tileWidth")
	int tileWidth;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 651309355
	)
	@Export("tileHeight")
	int tileHeight;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1424585833
	)
	@Export("pixelsPerTile")
	public int pixelsPerTile;

	@ObfuscatedSignature(
		descriptor = "([Lvl;Ljava/util/HashMap;Loc;Loc;)V"
	)
	public WorldMapRenderer(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
		this.loaded = false;
		this.field3018 = false;
		this.scaleHandlers = new HashMap();
		this.pixelsPerTile = 0;
		this.mapSceneSprites = var1;
		this.fonts = var2;
		this.geographyArchive = var3;
		this.groundArchive = var4;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Ljava/lang/String;ZI)V",
		garbageValue = "1542137265"
	)
	public void method5484(AbstractArchive var1, String var2, boolean var3) {
		if (!this.field3018) {
			this.loaded = false;
			this.field3018 = true;
			System.nanoTime();
			int var4 = var1.getGroupId(WorldMapCacheName.field3154.name);
			int var5 = var1.getFileId(var4, var2);
			Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3154.name, var2));
			Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field3155.name, var2));
			System.nanoTime();
			System.nanoTime();
			this.mapAreaData = new WorldMapAreaData();

			try {
				this.mapAreaData.method5777(var6, var7, var5, var3);
			} catch (IllegalStateException var19) {
				return;
			}

			this.mapAreaData.getOriginX();
			this.mapAreaData.getOriginPlane();
			this.mapAreaData.getOriginY();
			this.tileX = this.mapAreaData.getRegionLowX() * 64;
			this.tileY = this.mapAreaData.getRegionLowY() * 64;
			this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 4096;
			this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 64;
			int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1;
			int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1;
			System.nanoTime();
			System.nanoTime();
			WorldMapRegion.WorldMapRegion_cachedSprites.clear();
			this.regions = new WorldMapRegion[var16][var9];
			Iterator var10 = this.mapAreaData.field3162.iterator();

			while (var10.hasNext()) {
				WorldMapData_0 var11 = (WorldMapData_0)var10.next();
				int var12 = var11.regionX;
				int var13 = var11.regionY;
				int var14 = var12 - this.mapAreaData.getRegionLowX();
				int var15 = var13 - this.mapAreaData.getRegionLowY();
				this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.method5302(), this.fonts);
				this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList);
			}

			for (int var17 = 0; var17 < var16; ++var17) {
				for (int var18 = 0; var18 < var9; ++var18) {
					if (this.regions[var17][var18] == null) {
						this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.method5302(), this.fonts);
						this.regions[var17][var18].initWorldMapData1(this.mapAreaData.field3163, this.mapAreaData.iconList);
					}
				}
			}

			System.nanoTime();
			System.nanoTime();
			if (var1.isValidFileName(WorldMapCacheName.field3156.name, var2)) {
				byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field3156.name, var2);
				this.compositeTextureSprite = GrandExchangeOfferUnitPriceComparator.readSpritePixelsFromBytes(var20);
			}

			System.nanoTime();
			var1.clearGroups();
			var1.clearFiles();
			this.loaded = true;
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "88065186"
	)
	@Export("clearIcons")
	public final void clearIcons() {
		this.icons = null;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "1227005264"
	)
	@Export("drawTiles")
	public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
		int var10 = Rasterizer2D.Rasterizer2D_width;
		int var11 = Rasterizer2D.Rasterizer2D_height;
		float[] var12 = Rasterizer2D.field5304;
		int[] var13 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var13);
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
		int var16 = (int)Math.ceil((double)var15);
		this.pixelsPerTile = var16;
		if (!this.scaleHandlers.containsKey(var16)) {
			WorldMapScaleHandler var17 = new WorldMapScaleHandler(var16);
			var17.init();
			this.scaleHandlers.put(var16, var17);
		}

		int var24 = var14.width + var14.x - 1;
		int var18 = var14.y + var14.height - 1;

		int var19;
		int var20;
		for (var19 = var14.x; var19 <= var24; ++var19) {
			for (var20 = var14.y; var20 <= var18; ++var20) {
				this.regions[var19][var20].drawTile(var16, (WorldMapScaleHandler)this.scaleHandlers.get(var16), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
			}
		}

		Rasterizer3D.method4572(var9, var10, var11, var12);
		Rasterizer2D.Rasterizer2D_setClipArray(var13);
		var19 = (int)(var15 * 64.0F);
		var20 = this.tileX * 4096 + var1;
		int var21 = this.tileY * 4096 + var2;

		for (int var22 = var14.x; var22 < var14.width + var14.x; ++var22) {
			for (int var23 = var14.y; var23 < var14.height + var14.y; ++var23) {
				this.regions[var22][var23].method5372(var5 + var19 * (this.regions[var22][var23].regionX * 64 - var20) / 64, var8 - var19 * (this.regions[var22][var23].regionY * 64 - var21 + 64) / 64, var19);
			}
		}

	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
		garbageValue = "-90119421"
	)
	@Export("drawElements")
	public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
		WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
		float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
		int var16 = (int)(var15 * 64.0F);
		int var17 = this.tileX * 4096 + var1;
		int var18 = this.tileY * 4096 + var2;

		int var19;
		int var20;
		for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
			for (var20 = var14.y; var20 < var14.height + var14.y; ++var20) {
				if (var13) {
					this.regions[var19][var20].initWorldMapIcon1s();
				}

				this.regions[var19][var20].method5419(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9);
			}
		}

		if (var10 != null && var11 > 0) {
			for (var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
				for (var20 = var14.y; var20 < var14.y + var14.height; ++var20) {
					this.regions[var19][var20].flashElements(var10, var11, var12);
				}
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIILjava/util/HashSet;III)V",
		garbageValue = "1958960303"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
		if (this.compositeTextureSprite != null) {
			this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
			if (var6 > 0 && var6 % var7 < var7 / 2) {
				if (this.icons == null) {
					this.buildIcons0();
				}

				Iterator var8 = var5.iterator();

				while (true) {
					List var10;
					do {
						if (!var8.hasNext()) {
							return;
						}

						int var9 = (Integer)var8.next();
						var10 = (List)this.icons.get(var9);
					} while(var10 == null);

					Iterator var11 = var10.iterator();

					while (var11.hasNext()) {
						AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next();
						int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 64);
						int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 4096);
						Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256);
					}
				}
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIII)Ljava/util/List;",
		garbageValue = "-103296801"
	)
	public List method5489(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		LinkedList var11 = new LinkedList();
		if (!this.loaded) {
			return var11;
		} else {
			WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4);
			float var13 = this.getPixelsPerTile(var7, var3 - var1);
			int var14 = (int)(var13 * 64.0F);
			int var15 = this.tileX * 4096 + var1;
			int var16 = this.tileY * 4096 + var2;

			for (int var17 = var12.x; var17 < var12.width + var12.x; ++var17) {
				for (int var18 = var12.y; var18 < var12.y + var12.height; ++var18) {
					List var19 = this.regions[var17][var18].method5403(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10);
					if (!var19.isEmpty()) {
						var11.addAll(var19);
					}
				}
			}

			return var11;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Lkc;",
		garbageValue = "-536140242"
	)
	@Export("createWorldMapRectangle")
	WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
		WorldMapRectangle var5 = new WorldMapRectangle(this);
		int var6 = this.tileX * 4096 + var1;
		int var7 = this.tileY * 4096 + var2;
		int var8 = var3 + this.tileX * 4096;
		int var9 = this.tileY * 4096 + var4;
		int var10 = var6 / 64;
		int var11 = var7 / 64;
		int var12 = var8 / 64;
		int var13 = var9 / 64;
		var5.width = var12 - var10 + 1;
		var5.height = var13 - var11 + 1;
		var5.x = var10 - this.mapAreaData.getRegionLowX();
		var5.y = var11 - this.mapAreaData.getRegionLowY();
		if (var5.x < 0) {
			var5.width += var5.x;
			var5.x = 0;
		}

		if (var5.x > this.regions.length - var5.width) {
			var5.width = this.regions.length - var5.x;
		}

		if (var5.y < 0) {
			var5.height += var5.y;
			var5.y = 0;
		}

		if (var5.y > this.regions[0].length - var5.height) {
			var5.height = this.regions[0].length - var5.y;
		}

		var5.width = Math.min(var5.width, this.regions.length);
		var5.height = Math.min(var5.height, this.regions[0].length);
		return var5;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "1"
	)
	@Export("isLoaded")
	public boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-895025162"
	)
	public int method5492() {
		return this.mapAreaData.method5332();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/util/HashMap;",
		garbageValue = "-1572764365"
	)
	@Export("buildIcons")
	public HashMap buildIcons() {
		this.buildIcons0();
		return this.icons;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "735807728"
	)
	@Export("buildIcons0")
	void buildIcons0() {
		if (this.icons == null) {
			this.icons = new HashMap();
		}

		this.icons.clear();

		for (int var1 = 0; var1 < this.regions.length; ++var1) {
			for (int var2 = 0; var2 < this.regions[var1].length; ++var2) {
				List var3 = this.regions[var1][var2].icons();
				Iterator var4 = var3.iterator();

				while (var4.hasNext()) {
					AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
					if (var5.hasValidElement()) {
						int var6 = var5.getElement();
						if (!this.icons.containsKey(var6)) {
							LinkedList var7 = new LinkedList();
							var7.add(var5);
							this.icons.put(var6, var7);
						} else {
							List var8 = (List)this.icons.get(var6);
							var8.add(var5);
						}
					}
				}
			}
		}

	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIB)F",
		garbageValue = "32"
	)
	@Export("getPixelsPerTile")
	float getPixelsPerTile(int var1, int var2) {
		float var3 = (float)var1 / (float)var2;
		if (var3 > 8.0F) {
			return 8.0F;
		} else if (var3 < 1.0F) {
			return 1.0F;
		} else {
			int var4 = Math.round(var3);
			return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1816171479"
	)
	static void method5528() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromIgnored();
		}

	}
}
