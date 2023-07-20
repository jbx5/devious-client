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

@ObfuscatedName("sq")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lsg;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ax")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "[Luu;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("au")
	@Export("details")
	HashMap details;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ljs;"
	)
	WorldMapArea field4887;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("worldMapRenderer")
	WorldMapRenderer worldMapRenderer;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lst;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -644616583
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1760412517
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1191756433
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -2090273235
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("al")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bd")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -370033655
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 661123875
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ba")
	@ObfuscatedGetter(
		intValue = 1151782823
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -1041995183
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1954177893
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = -1198442767
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bv")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bq")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1042774107
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1603375427
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 1066812839
	)
	int field4899;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 112051835
	)
	int field4901;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = -1656218439
	)
	int field4922;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -257574923
	)
	int field4923;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = -8299193308012412741L
	)
	long field4924;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = 1875380277
	)
	int field4925;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -526708521
	)
	int field4915;
	@ObfuscatedName("bx")
	boolean field4937;
	@ObfuscatedName("bl")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bt")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("by")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bg")
	HashSet field4931;
	@ObfuscatedName("bj")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = 281599667
	)
	int field4933;
	@ObfuscatedName("cz")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cb")
	List field4935;
	@ObfuscatedName("cs")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cj")
	HashSet field4907;
	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cw")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = -979786125
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 1311334497
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("ca")
	@ObfuscatedGetter(
		intValue = -608769943
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("cx")
	@ObfuscatedGetter(
		intValue = -1070722367
	)
	int field4944;

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
		this.field4899 = -1;
		this.field4901 = -1;
		this.field4922 = -1;
		this.field4923 = -1;
		this.field4937 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field4931 = new HashSet();
		this.elementsDisabled = false;
		this.field4933 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field4907 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field4944 = -1;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;Lnd;Lpc;Ljava/util/HashMap;[Luu;I)V",
		garbageValue = "-1050451125"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3050.name);
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
		this.field4887 = null;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-65"
	)
	public void method8531() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-452264165"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapRenderer.method5369(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); GrandExchangeOfferOwnWorldComparator.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field4907.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field4907.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						GrandExchangeOfferOwnWorldComparator.runScriptEvent(var14);
					}
				}

				this.field4907 = var11;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIZZS)V",
		garbageValue = "10233"
	)
	public void method8533(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label41: {
			var5 = class113.method2835();
			this.method8534(var1, var2, var4, var5);
			if (!this.hasTarget() && (var4 || var3)) {
				boolean var7 = Client.clickedWidget != null;
				if (!var7) {
					if (var4) {
						this.field4922 = var1;
						this.field4923 = var2;
						this.field4899 = this.centerTileX;
						this.field4901 = this.centerTileY;
					}

					if (this.field4899 != -1) {
						int var8 = var1 - this.field4922;
						int var9 = var2 - this.field4923;
						this.setWorldMapPosition(this.field4899 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4901, false);
					}
					break label41;
				}
			}

			this.method8538();
		}

		if (var4) {
			this.field4924 = var5;
			this.field4925 = var1;
			this.field4915 = var2;
		}

	}

	@ObfuscatedName("as")
	void method8534(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				class213 var8 = SceneTilePaint.method4952();
				int var10;
				int var11;
				if (class158.method3322() && var8.method4151(82) && var8.method4151(81)) {
					int var14 = this.mouseCoord.x;
					var10 = this.mouseCoord.y;
					var11 = this.mouseCoord.plane;
					PacketBufferNode var12 = class503.getPacketBufferNode(ClientPacket.field3165, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeIntIME(0);
					var12.packetBuffer.writeShortAddLE(var14);
					var12.packetBuffer.writeByteAdd(var11);
					var12.packetBuffer.writeShortAdd(var10);
					Client.packetWriter.addNode(var12);
				} else {
					boolean var9 = true;
					if (this.field4937) {
						var10 = var1 - this.field4925;
						var11 = var2 - this.field4915;
						if (var4 - this.field4924 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
							var9 = false;
						}
					}

					if (var9) {
						PacketBufferNode var13 = class503.getPacketBufferNode(ClientPacket.field3142, Client.packetWriter.isaacCipher);
						var13.packetBuffer.writeIntME(this.mouseCoord.packed());
						Client.packetWriter.addNode(var13);
						this.field4924 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "636317718"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (UserComparator7.field1455 != null) {
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-2527"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "-1787840553"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		class113.method2835();
		if (var3) {
			this.method8538();
		}

	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "101"
	)
	final void method8538() {
		this.field4923 = -1;
		this.field4922 = -1;
		this.field4901 = -1;
		this.field4899 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-11"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ljs;",
		garbageValue = "8"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "1991480722"
	)
	public void method8541(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field4887 || var4) {
			this.field4887 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "795116875"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1338800765"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I)Ljs;",
		garbageValue = "-9922858"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "1656071073"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMap(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljs;I)V",
		garbageValue = "1127606129"
	)
	@Export("initializeWorldMap")
	void initializeWorldMap(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Ljs;Lmr;Lmr;ZB)V",
		garbageValue = "-74"
	)
	public void method8658(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-1717944144"
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
			this.field4935 = null;
			this.iconIterator = null;
			this.worldMapRenderer.clearIcons();
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1021505883"
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
			if (!this.elementsDisabled) {
				boolean var10 = false;
				if (var5 - this.field4933 > 100) {
					this.field4933 = var5;
					var10 = true;
				}

				this.worldMapRenderer.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4931, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
			}

			this.method8606(var1, var2, var3, var4, var8, var9);
			if (class158.method3322() && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8;
			this.worldMapDisplayHeight = var9;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var6);
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-2144848523"
	)
	boolean method8550(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field4944 != Client.field792) {
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1743359113"
	)
	void method8606(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (UserComparator7.field1455 != null) {
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
			if (this.method8550(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
				UserComparator7.field1455.method6967(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field4944 = Client.field792;
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
				var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (var10 == 1.0F) {
				this.sprite.method9553(var13, var14, 192);
			} else {
				this.sprite.method9672(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "1644929634"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1428442334"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-13"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20;
		int var7 = var3 / 2 + var1;
		int var8 = var4 / 2 + var2 - 18 - var6;
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
		this.font.drawCentered("Loading...", var7, var8 + var6, -1, -1);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "235261607"
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

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1760344192"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) {
			return 25;
		} else if (1.5D == (double)this.zoomTarget) {
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) {
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200;
		}
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4429"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "39"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II)Ljs;",
		garbageValue = "-677998757"
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "8"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-2050238957"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "113"
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-149555116"
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

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1246259080"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1454089016"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lmr;",
		garbageValue = "1323166356"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2052030046"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-640816926"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-1"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-714878739"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1573369033"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-23"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "32"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1425125593"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "80"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < Decimator.WorldMapElement_count; ++var2) {
			if (SequenceDefinition.WorldMapElement_get(var2) != null && SequenceDefinition.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(SequenceDefinition.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1166571432"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-164706283"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "4"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method8583();
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-1"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < Decimator.WorldMapElement_count; ++var3) {
			if (SequenceDefinition.WorldMapElement_get(var3) != null && SequenceDefinition.WorldMapElement_get(var3).category == var1) {
				int var4 = SequenceDefinition.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method8583();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2113017491"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1784383589"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1533983317"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	void method8583() {
		this.field4931.clear();
		this.field4931.addAll(this.enabledElements);
		this.field4931.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("cz")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1942190894"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapRenderer.method5369(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = SequenceDefinition.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							JagexCache.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(ILmr;B)Lmr;",
		garbageValue = "1"
	)
	public Coord method8585(int var1, Coord var2) {
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
						var11 = var10 * var10 + var9 * var9;
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
		descriptor = "(IILmr;Lmr;B)V",
		garbageValue = "123"
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

		GrandExchangeOfferOwnWorldComparator.runScriptEvent(var5);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(S)Lkv;",
		garbageValue = "-27920"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapRenderer.buildIcons();
			this.field4935 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field4935.addAll(var3);
			}

			this.iconIterator = this.field4935.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(I)Lkv;",
		garbageValue = "1531693993"
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

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IIB)Lud;",
		garbageValue = "0"
	)
	@Export("SpriteBuffer_getSprite")
	public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			VarbitComposition.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : FileSystem.method3536();
	}
}
