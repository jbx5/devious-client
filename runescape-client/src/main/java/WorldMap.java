import java.util.Arrays;
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

@ObfuscatedName("si")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsp;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lnu;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lpi;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("an")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ab")
	@Export("details")
	HashMap details;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	WorldMapArea field4905;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljd;"
	)
	@Export("worldMapRenderer")
	WorldMapRenderer worldMapRenderer;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1993834971
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -439956157
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1466565
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1024952423
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ak")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bh")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 595176605
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1908673183
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 533347459
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 608469061
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -157660715
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1078038505
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bs")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bm")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -507731773
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = 1509565263
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = -505190469
	)
	int field4924;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -1285196347
	)
	int field4925;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1888322425
	)
	int field4926;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -54159521
	)
	int field4927;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		longValue = -3279279265360802961L
	)
	long field4928;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -112274759
	)
	int field4941;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -478994675
	)
	int field4904;
	@ObfuscatedName("be")
	boolean field4931;
	@ObfuscatedName("bx")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bn")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bw")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bc")
	HashSet field4889;
	@ObfuscatedName("bg")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cw")
	@ObfuscatedGetter(
		intValue = 1663148075
	)
	int field4894;
	@ObfuscatedName("cm")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cn")
	List field4939;
	@ObfuscatedName("cs")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cx")
	HashSet field4937;
	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cd")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lui;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 128640385
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cp")
	@ObfuscatedGetter(
		intValue = -635961085
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -1030913965
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1737387481
	)
	int field4948;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11;
		fontNameVerdana13 = FontName.FontName_verdana13;
		fontNameVerdana15 = FontName.FontName_verdana15;
	}

	public WorldMap() {
		this.worldMapTargetX = -1;
		this.worldMapTargetY = -1;
		this.worldMapDisplayWidth = -1;
		this.worldMapDisplayHeight = -1;
		this.worldMapDisplayX = -1;
		this.worldMapDisplayY = -1;
		this.maxFlashCount = 3;
		this.cyclesPerFlash = 50;
		this.perpetualFlash = false;
		this.flashingElements = null;
		this.flashCount = -1;
		this.flashCycle = -1;
		this.field4924 = -1;
		this.field4925 = -1;
		this.field4926 = -1;
		this.field4927 = -1;
		this.field4931 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field4889 = new HashSet();
		this.elementsDisabled = false;
		this.field4894 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field4937 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field4948 = -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lnu;Lnu;Lnu;Lpi;Ljava/util/HashMap;[Luk;I)V",
		garbageValue = "98819926"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6;
		this.WorldMap_archive = var1;
		this.WorldMap_geographyArchive = var2;
		this.WorldMap_groundArchive = var3;
		this.font = var4;
		this.fonts = new HashMap();
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13));
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15));
		this.cacheLoader = new WorldMapArchiveLoader(var1);
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3068.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		int var9 = var8 == null ? 0 : var8.length;
		this.details = new HashMap(var9);

		for (int var10 = 0; var10 < var9; ++var10) {
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10]));
			WorldMapArea var12 = new WorldMapArea();
			var12.read(var11, var8[var10]);
			this.details.put(var12.getInternalName(), var12);
			if (var12.getIsMain()) {
				this.mainMapArea = var12;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field4905 = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "58"
	)
	public void method8498() {
		class18.method291();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "10"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapRenderer.method5310(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); WorldMapSection1.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field4937.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field4937.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						WorldMapSection1.runScriptEvent(var14);
					}
				}

				this.field4937 = var11;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1934928050"
	)
	public void method8500(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label41: {
			var5 = GameEngine.method661();
			this.method8663(var1, var2, var4, var5);
			if (!this.hasTarget() && (var4 || var3)) {
				boolean var7 = Client.clickedWidget != null;
				if (!var7) {
					if (var4) {
						this.field4926 = var1;
						this.field4927 = var2;
						this.field4924 = this.centerTileX;
						this.field4925 = this.centerTileY;
					}

					if (this.field4924 != -1) {
						int var8 = var1 - this.field4926;
						int var9 = var2 - this.field4927;
						this.setWorldMapPosition(this.field4924 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4925, false);
					}
					break label41;
				}
			}

			this.method8631();
		}

		if (var4) {
			this.field4928 = var5;
			this.field4941 = var1;
			this.field4904 = var2;
		}

	}

	@ObfuscatedName("ac")
	void method8663(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				class212 var8 = AbstractWorldMapData.method5477();
				boolean var9 = Client.staffModLevel >= 2;
				if (var9 && var8.method4120(82) && var8.method4120(81)) {
					NPC.method2637(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
				} else {
					boolean var10 = true;
					if (this.field4931) {
						int var11 = var1 - this.field4941;
						int var12 = var2 - this.field4904;
						if (var4 - this.field4928 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						PacketBufferNode var13 = ApproximateRouteStrategy.getPacketBufferNode(ClientPacket.field3184, Client.packetWriter.isaacCipher);
						var13.packetBuffer.writeInt(this.mouseCoord.packed());
						Client.packetWriter.addNode(var13);
						this.field4928 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-12314"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class390.field4441 != null) {
			this.zoom = this.zoomTarget;
		} else {
			if (this.zoom < this.zoomTarget) {
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom);
			}

			if (this.zoom > this.zoomTarget) {
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "55"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) {
			int var1 = this.worldMapTargetX - this.centerTileX;
			int var2 = this.worldMapTargetY - this.centerTileY;
			if (var1 != 0) {
				var1 /= Math.min(8, Math.abs(var1));
			}

			if (var2 != 0) {
				var2 /= Math.min(8, Math.abs(var2));
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true);
			if (this.worldMapTargetX == this.centerTileX && this.worldMapTargetY == this.centerTileY) {
				this.worldMapTargetX = -1;
				this.worldMapTargetY = -1;
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "0"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		GameEngine.method661();
		if (var3) {
			this.method8631();
		}

	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "828394242"
	)
	final void method8631() {
		this.field4927 = -1;
		this.field4926 = -1;
		this.field4925 = -1;
		this.field4924 = -1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-778313072"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ljf;",
		garbageValue = "442093441"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator();

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (WorldMapArea)var4.next();
		} while(!var5.containsCoord(var1, var2, var3));

		return var5;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "88"
	)
	public void method8505(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field4905 || var4) {
			this.field4905 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "114"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2135473352"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Ljf;",
		garbageValue = "122"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "-824827052"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMap(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Ljf;I)V",
		garbageValue = "1970114808"
	)
	@Export("initializeWorldMap")
	void initializeWorldMap(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljf;Lmc;Lmc;ZI)V",
		garbageValue = "137024863"
	)
	public void method8514(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) {
			if (this.currentMapArea == null || var1 != this.currentMapArea) {
				this.initializeWorldMap(var1);
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) {
				this.jump(var2.plane, var2.x, var2.y);
			} else {
				this.jump(var3.plane, var3.x, var3.y);
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "1"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 == null) {
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
			this.zoomTarget = this.zoom;
			this.field4939 = null;
			this.iconIterator = null;
			this.worldMapRenderer.clearIcons();
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-27"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var6);
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		int var7 = this.cacheLoader.getPercentLoaded();
		if (var7 < 100) {
			this.drawLoading(var1, var2, var3, var4, var7);
		} else {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			if (this.flashingElements != null) {
				++this.flashCycle;
				if (this.flashCycle % this.cyclesPerFlash == 0) {
					this.flashCycle = 0;
					++this.flashCount;
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) {
					this.flashingElements = null;
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom));
			this.worldMapRenderer.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			boolean var10;
			if (!this.elementsDisabled) {
				var10 = false;
				if (var5 - this.field4894 > 100) {
					this.field4894 = var5;
					var10 = true;
				}

				this.worldMapRenderer.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4889, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
			}

			this.method8518(var1, var2, var3, var4, var8, var9);
			var10 = Client.staffModLevel >= 2;
			if (var10 && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8;
			this.worldMapDisplayHeight = var9;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var6);
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "1770915871"
	)
	boolean method8654(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field4948 != Client.field649) {
				return true;
			} else if (var3 <= 0 && var4 <= 0) {
				return var3 + var1 < var5 || var2 + var4 < var6;
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIS)V",
		garbageValue = "512"
	)
	void method8518(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class390.field4441 != null) {
			int var7 = 512 / (this.worldMapRenderer.pixelsPerTile * 2);
			int var8 = var3 + 512;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = (int)((float)var8 / var10);
			var9 = (int)((float)var9 / var10);
			int var11 = this.getDisplayX() - var5 / 2 - var7;
			int var12 = this.getDisplayY() - var6 / 2 - var7;
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
			int var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			if (this.method8654(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
				class390.field4441.method6903(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field4948 = Client.field649;
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
				var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (var10 == 1.0F) {
				this.sprite.method9610(var13, var14, 192);
			} else {
				this.sprite.method9515(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192);
			}
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1287385022"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			this.worldMapRenderer.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2033911390"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "4"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20;
		int var7 = var3 / 2 + var1;
		int var8 = var4 / 2 + var2 - 18 - var6;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "818777880"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) {
			return 1.0F;
		} else if (var1 == 37) {
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F;
		} else if (var1 == 75) {
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F;
		}
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2077099147"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) {
			return 25;
		} else if (1.5D == (double)this.zoomTarget) {
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) {
			return 50;
		} else if (3.0D == (double)this.zoomTarget) {
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200;
		}
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "25"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-9"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IB)Ljf;",
		garbageValue = "-2"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator();

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}

			var3 = (WorldMapArea)var2.next();
		} while(var3.getId() != var1);

		return var3;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-48"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2049902032"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-2060098285"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTarget(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-843499026"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
			}

		}
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "825863248"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "388146570"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)Lmc;",
		garbageValue = "1721090019"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-866759946"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1144156363"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "368918336"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "74"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-30765"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1849662360"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "21297146"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1601393714"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1527059240"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			if (class138.WorldMapElement_get(var2) != null && class138.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(class138.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2116976270"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1671616581"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "123"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method8550();
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-9"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
			if (class138.WorldMapElement_get(var3) != null && class138.WorldMapElement_get(var3).category == var1) {
				int var4 = class138.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method8550();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-441970496"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "115"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-638712237"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-444126949"
	)
	void method8550() {
		this.field4889.clear();
		this.field4889.addAll(this.enabledElements);
		this.field4889.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "2039788697"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapRenderer.method5310(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = class138.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							class385.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILmc;I)Lmc;",
		garbageValue = "501302871"
	)
	public Coord method8552(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) {
			return null;
		} else {
			HashMap var3 = this.worldMapRenderer.buildIcons();
			List var4 = (List)var3.get(var1);
			if (var4 != null && !var4.isEmpty()) {
				AbstractWorldMapIcon var5 = null;
				int var6 = -1;
				Iterator var7 = var4.iterator();

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2;
						}

						var8 = (AbstractWorldMapIcon)var7.next();
						int var9 = var8.coord2.x - var2.x;
						int var10 = var8.coord2.y - var2.y;
						var11 = var9 * var9 + var10 * var10;
						if (var11 == 0) {
							return var8.coord2;
						}
					} while(var11 >= var6 && var5 != null);

					var5 = var8;
					var6 = var11;
				}
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("cs")
	@ObfuscatedSignature(
		descriptor = "(IILmc;Lmc;I)V",
		garbageValue = "-634310433"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent();
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
		var5.setArgs(new Object[]{var6});
		switch(var1) {
		case 1008:
			var5.setType(10);
			break;
		case 1009:
			var5.setType(11);
			break;
		case 1010:
			var5.setType(12);
			break;
		case 1011:
			var5.setType(13);
			break;
		case 1012:
			var5.setType(14);
		}

		WorldMapSection1.runScriptEvent(var5);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(I)Lkp;",
		garbageValue = "1868927893"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapRenderer.buildIcons();
			this.field4939 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field4939.addAll(var3);
			}

			this.iconIterator = this.field4939.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)Lkp;",
		garbageValue = "-4783763"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) {
			return null;
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) {
					return null;
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next();
			} while(var1.getElement() == -1);

			return var1;
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I[B[BI)V",
		garbageValue = "359324490"
	)
	@Export("Widget_setKey")
	static final void Widget_setKey(Widget var0, int var1, byte[] var2, byte[] var3) {
		if (var0.field3697 == null) {
			if (var2 == null) {
				return;
			}

			var0.field3697 = new byte[11][];
			var0.field3796 = new byte[11][];
			var0.field3724 = new int[11];
			var0.field3725 = new int[11];
		}

		var0.field3697[var1] = var2;
		if (var2 != null) {
			var0.field3721 = true;
		} else {
			var0.field3721 = false;

			for (int var4 = 0; var4 < var0.field3697.length; ++var4) {
				if (var0.field3697[var4] != null) {
					var0.field3721 = true;
					break;
				}
			}
		}

		var0.field3796[var1] = var3;
	}

	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIII)V",
		garbageValue = "-1305820605"
	)
	@Export("addPendingSpawnToScene")
	static final void addPendingSpawnToScene(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		if (var2 >= 1 && var3 >= 1 && var2 <= 102 && var3 <= 102) {
			if (Client.isLowDetail && var0 != HealthBar.Client_plane) {
				return;
			}

			long var8 = 0L;
			boolean var10 = true;
			boolean var11 = false;
			boolean var12 = false;
			if (var1 == 0) {
				var8 = class130.scene.getBoundaryObjectTag(var0, var2, var3);
			}

			if (var1 == 1) {
				var8 = class130.scene.getWallDecorationTag(var0, var2, var3);
			}

			if (var1 == 2) {
				var8 = class130.scene.getGameObjectTag(var0, var2, var3);
			}

			if (var1 == 3) {
				var8 = class130.scene.getFloorDecorationTag(var0, var2, var3);
			}

			int var13;
			if (var8 != 0L) {
				var13 = class130.scene.getObjectFlags(var0, var2, var3, var8);
				int var40 = InvDefinition.Entity_unpackID(var8);
				int var41 = var13 & 31;
				int var42 = var13 >> 6 & 3;
				ObjectComposition var14;
				if (var1 == 0) {
					class130.scene.removeBoundaryObject(var0, var2, var3);
					var14 = WorldMapElement.getObjectDefinition(var40);
					if (var14.interactType != 0) {
						Client.collisionMaps[var0].method4153(var2, var3, var41, var42, var14.boolean1);
					}
				}

				if (var1 == 1) {
					class130.scene.removeWallDecoration(var0, var2, var3);
				}

				if (var1 == 2) {
					class130.scene.removeGameObject(var0, var2, var3);
					var14 = WorldMapElement.getObjectDefinition(var40);
					if (var2 + var14.sizeX > 103 || var3 + var14.sizeX > 103 || var2 + var14.sizeY > 103 || var3 + var14.sizeY > 103) {
						return;
					}

					if (var14.interactType != 0) {
						Client.collisionMaps[var0].setFlagOffNonSquare(var2, var3, var14.sizeX, var14.sizeY, var42, var14.boolean1);
					}
				}

				if (var1 == 3) {
					class130.scene.removeFloorDecoration(var0, var2, var3);
					var14 = WorldMapElement.getObjectDefinition(var40);
					if (var14.interactType == 1) {
						Client.collisionMaps[var0].method4155(var2, var3);
					}
				}
			}

			if (var4 >= 0) {
				var13 = var0;
				if (var0 < 3 && (Tiles.Tiles_renderFlags[1][var2][var3] & 2) == 2) {
					var13 = var0 + 1;
				}

				Scene var43 = class130.scene;
				CollisionMap var15 = Client.collisionMaps[var0];
				ObjectComposition var16 = WorldMapElement.getObjectDefinition(var4);
				int var17 = var7 >= 0 ? var7 : var16.animationId;
				int var18;
				int var19;
				if (var5 != 1 && var5 != 3) {
					var18 = var16.sizeX;
					var19 = var16.sizeY;
				} else {
					var18 = var16.sizeY;
					var19 = var16.sizeX;
				}

				int var20;
				int var21;
				if (var18 + var2 <= 104) {
					var20 = (var18 >> 1) + var2;
					var21 = var2 + (var18 + 1 >> 1);
				} else {
					var20 = var2;
					var21 = var2 + 1;
				}

				int var22;
				int var23;
				if (var3 + var19 <= 104) {
					var22 = var3 + (var19 >> 1);
					var23 = var3 + (var19 + 1 >> 1);
				} else {
					var22 = var3;
					var23 = var3 + 1;
				}

				int[][] var24 = Tiles.Tiles_heights[var13];
				int var25 = var24[var21][var22] + var24[var20][var22] + var24[var20][var23] + var24[var21][var23] >> 2;
				int var26 = (var2 << 7) + (var18 << 6);
				int var27 = (var3 << 7) + (var19 << 6);
				long var28 = FontName.calculateTag(var2, var3, 2, var16.int1 == 0, var4);
				int var30 = (var5 << 6) + var6;
				if (var16.int3 == 1) {
					var30 += 256;
				}

				Object var38;
				if (var6 == 22) {
					if (var17 == -1 && var16.transforms == null) {
						var38 = var16.getModel(22, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 22, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
					}

					var43.newFloorDecoration(var0, var2, var3, var25, (Renderable)var38, var28, var30);
					if (var16.interactType == 1) {
						var15.setBlockedByFloorDec(var2, var3);
					}
				} else if (var6 != 10 && var6 != 11) {
					if (var6 >= 12) {
						if (var17 == -1 && var16.transforms == null) {
							var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
						}

						var43.method4535(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30);
						if (var16.interactType != 0) {
							var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
						}
					} else if (var6 == 0) {
						if (var17 == -1 && var16.transforms == null) {
							var38 = var16.getModel(0, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 0, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
						}

						var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1042[var5], 0, var28, var30);
						if (var16.interactType != 0) {
							var15.method4148(var2, var3, var6, var5, var16.boolean1);
						}
					} else if (var6 == 1) {
						if (var17 == -1 && var16.transforms == null) {
							var38 = var16.getModel(1, var5, var24, var26, var25, var27);
						} else {
							var38 = new DynamicObject(var4, 1, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
						}

						var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1043[var5], 0, var28, var30);
						if (var16.interactType != 0) {
							var15.method4148(var2, var3, var6, var5, var16.boolean1);
						}
					} else {
						int var31;
						if (var6 == 2) {
							var31 = var5 + 1 & 3;
							Object var33;
							Object var39;
							if (var17 == -1 && var16.transforms == null) {
								var39 = var16.getModel(2, var5 + 4, var24, var26, var25, var27);
								var33 = var16.getModel(2, var31, var24, var26, var25, var27);
							} else {
								var39 = new DynamicObject(var4, 2, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								var33 = new DynamicObject(var4, 2, var31, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
							}

							var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var39, (Renderable)var33, Tiles.field1042[var5], Tiles.field1042[var31], var28, var30);
							if (var16.interactType != 0) {
								var15.method4148(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 3) {
							if (var17 == -1 && var16.transforms == null) {
								var38 = var16.getModel(3, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 3, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
							}

							var43.newBoundaryObject(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1043[var5], 0, var28, var30);
							if (var16.interactType != 0) {
								var15.method4148(var2, var3, var6, var5, var16.boolean1);
							}
						} else if (var6 == 9) {
							if (var17 == -1 && var16.transforms == null) {
								var38 = var16.getModel(var6, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, var6, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
							}

							var43.method4535(var0, var2, var3, var25, 1, 1, (Renderable)var38, 0, var28, var30);
							if (var16.interactType != 0) {
								var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
							}
						} else if (var6 == 4) {
							if (var17 == -1 && var16.transforms == null) {
								var38 = var16.getModel(4, var5, var24, var26, var25, var27);
							} else {
								var38 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
							}

							var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, Tiles.field1042[var5], 0, 0, 0, var28, var30);
						} else {
							long var32;
							Object var34;
							if (var6 == 5) {
								var31 = 16;
								var32 = var43.getBoundaryObjectTag(var0, var2, var3);
								if (var32 != 0L) {
									var31 = WorldMapElement.getObjectDefinition(InvDefinition.Entity_unpackID(var32)).int2;
								}

								if (var17 == -1 && var16.transforms == null) {
									var34 = var16.getModel(4, var5, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								}

								var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, Tiles.field1042[var5], 0, var31 * Tiles.field1044[var5], var31 * Tiles.field1045[var5], var28, var30);
							} else if (var6 == 6) {
								var31 = 8;
								var32 = var43.getBoundaryObjectTag(var0, var2, var3);
								if (var32 != 0L) {
									var31 = WorldMapElement.getObjectDefinition(InvDefinition.Entity_unpackID(var32)).int2 / 2;
								}

								if (var17 == -1 && var16.transforms == null) {
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								}

								var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)null, 256, var5, var31 * Tiles.field1051[var5], var31 * Tiles.field1048[var5], var28, var30);
							} else if (var6 == 7) {
								int var37 = var5 + 2 & 3;
								if (var17 == -1 && var16.transforms == null) {
									var38 = var16.getModel(4, var37 + 4, var24, var26, var25, var27);
								} else {
									var38 = new DynamicObject(var4, 4, var37 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								}

								var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var38, (Renderable)null, 256, var37, 0, 0, var28, var30);
							} else if (var6 == 8) {
								var31 = 8;
								var32 = var43.getBoundaryObjectTag(var0, var2, var3);
								if (0L != var32) {
									var31 = WorldMapElement.getObjectDefinition(InvDefinition.Entity_unpackID(var32)).int2 / 2;
								}

								int var36 = var5 + 2 & 3;
								Object var35;
								if (var17 == -1 && var16.transforms == null) {
									var34 = var16.getModel(4, var5 + 4, var24, var26, var25, var27);
									var35 = var16.getModel(4, var36 + 4, var24, var26, var25, var27);
								} else {
									var34 = new DynamicObject(var4, 4, var5 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
									var35 = new DynamicObject(var4, 4, var36 + 4, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
								}

								var43.newWallDecoration(var0, var2, var3, var25, (Renderable)var34, (Renderable)var35, 256, var5, var31 * Tiles.field1051[var5], var31 * Tiles.field1048[var5], var28, var30);
							}
						}
					}
				} else {
					if (var17 == -1 && var16.transforms == null) {
						var38 = var16.getModel(10, var5, var24, var26, var25, var27);
					} else {
						var38 = new DynamicObject(var4, 10, var5, var13, var2, var3, var17, var16.boolean3, (Renderable)null);
					}

					if (var38 != null) {
						var43.method4535(var0, var2, var3, var25, var18, var19, (Renderable)var38, var6 == 11 ? 256 : 0, var28, var30);
					}

					if (var16.interactType != 0) {
						var15.addGameObject(var2, var3, var18, var19, var16.boolean1);
					}
				}
			}
		}

	}
}
