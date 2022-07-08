import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import java.util.HashMap;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import net.runelite.mapping.Export;
@ObfuscatedName("oe")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "Lpd;")
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "Lpd;")
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Lpd;")
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Llh;")
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Lmt;")
	@Export("font")
	Font font;

	@ObfuscatedName("r")
	@Export("fonts")
	HashMap fonts;

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "[Lqu;")
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("k")
	@Export("details")
	HashMap details;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Lhg;")
	@Export("mainMapArea")
	WorldMapArea mainMapArea;

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Lhg;")
	@Export("currentMapArea")
	WorldMapArea currentMapArea;

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Lhg;")
	WorldMapArea field4550;

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lhm;")
	@Export("worldMapManager")
	WorldMapManager worldMapManager;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lox;")
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;

	@ObfuscatedName("b")
	@ObfuscatedGetter(intValue = 1280824469)
	@Export("centerTileX")
	int centerTileX;

	@ObfuscatedName("n")
	@ObfuscatedGetter(intValue = -310067487)
	@Export("centerTileY")
	int centerTileY;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -1880779153)
	@Export("worldMapTargetX")
	int worldMapTargetX;

	@ObfuscatedName("m")
	@ObfuscatedGetter(intValue = -723853881)
	@Export("worldMapTargetY")
	int worldMapTargetY;

	@ObfuscatedName("d")
	@Export("zoom")
	float zoom;

	@ObfuscatedName("ad")
	@Export("zoomTarget")
	float zoomTarget;

	@ObfuscatedName("ak")
	@ObfuscatedGetter(intValue = -562089369)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;

	@ObfuscatedName("al")
	@ObfuscatedGetter(intValue = -1885245943)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;

	@ObfuscatedName("ao")
	@ObfuscatedGetter(intValue = 1139632457)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;

	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = -1859750739)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 847440549)
	@Export("maxFlashCount")
	int maxFlashCount;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = 415648465)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;

	@ObfuscatedName("ae")
	@Export("perpetualFlash")
	boolean perpetualFlash;

	@ObfuscatedName("aj")
	@Export("flashingElements")
	HashSet flashingElements;

	@ObfuscatedName("am")
	@ObfuscatedGetter(intValue = 1913006969)
	@Export("flashCount")
	int flashCount;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = -998053929)
	@Export("flashCycle")
	int flashCycle;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = -1595444339)
	int field4546;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(intValue = 1517937465)
	int field4547;

	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = -510236727)
	int field4539;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = 376848179)
	int field4567;

	@ObfuscatedName("ag")
	@ObfuscatedGetter(longValue = -999650809358427355L)
	long field4534;

	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = -410641503)
	int field4551;

	@ObfuscatedName("ah")
	@ObfuscatedGetter(intValue = 597430499)
	int field4552;

	@ObfuscatedName("ai")
	boolean field4514;

	@ObfuscatedName("aw")
	@Export("enabledElements")
	HashSet enabledElements;

	@ObfuscatedName("au")
	@Export("enabledCategories")
	HashSet enabledCategories;

	@ObfuscatedName("aa")
	@Export("enabledElementIds")
	HashSet enabledElementIds;

	@ObfuscatedName("ay")
	HashSet field4561;

	@ObfuscatedName("as")
	@Export("elementsDisabled")
	boolean elementsDisabled;

	@ObfuscatedName("be")
	@ObfuscatedGetter(intValue = -1332813641)
	int field4559;

	@ObfuscatedName("bp")
	@Export("menuOpcodes")
	final int[] menuOpcodes;

	@ObfuscatedName("bf")
	List field4548;

	@ObfuscatedName("bg")
	@Export("iconIterator")
	Iterator iconIterator;

	@ObfuscatedName("br")
	HashSet field4531;

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "Lkd;")
	@Export("mouseCoord")
	Coord mouseCoord;

	@ObfuscatedName("bq")
	@Export("showCoord")
	public boolean showCoord;

	@ObfuscatedName("bc")
	@ObfuscatedSignature(descriptor = "Lqe;")
	@Export("sprite")
	SpritePixels sprite;

	@ObfuscatedName("bl")
	@ObfuscatedGetter(intValue = 781783389)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;

	@ObfuscatedName("bv")
	@ObfuscatedGetter(intValue = 1609384449)
	@Export("minCachedTileX")
	int minCachedTileX;

	@ObfuscatedName("bt")
	@ObfuscatedGetter(intValue = -15655745)
	@Export("minCachedTileY")
	int minCachedTileY;

	@ObfuscatedName("bh")
	@ObfuscatedGetter(intValue = -772484837)
	int field4560;

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
		this.field4546 = -1;
		this.field4547 = -1;
		this.field4539 = -1;
		this.field4567 = -1;
		this.field4514 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field4561 = new HashSet();
		this.elementsDisabled = false;
		this.field4559 = 0;
		this.menuOpcodes = new int[]{ 1008, 1009, 1010, 1011, 1012 };
		this.field4531 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field4560 = -1;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llh;Llh;Llh;Lmt;Ljava/util/HashMap;[Lqu;B)V", garbageValue = "35")
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2867.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		this.details = new HashMap(var8.length);
		for (int var9 = 0; var9 < var8.length; ++var9) {
			Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9]));
			WorldMapArea var11 = new WorldMapArea();
			var11.read(var10, var8[var9]);
			this.details.put(var11.getInternalName(), var11);
			if (var11.getIsMain()) {
				this.mainMapArea = var11;
			}
		}
		this.setCurrentMapArea(this.mainMapArea);
		this.field4550 = null;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "2022922542")
	public void method7182() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIZIIIII)V", garbageValue = "885172006")
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = ((int) (Math.ceil(((double) (((float) (var6)) / this.zoom)))));
				int var9 = ((int) (Math.ceil(((double) (((float) (var7)) / this.zoom)))));
				List var10 = this.worldMapManager.method4819(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();
				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); BoundaryObject.runScriptEvent(var14)) {
					var13 = ((AbstractWorldMapIcon) (var12.next()));
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{ var15, var1, var2 });
					if (this.field4531.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}
				var12 = this.field4531.iterator();
				while (var12.hasNext()) {
					var13 = ((AbstractWorldMapIcon) (var12.next()));
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{ var15, var1, var2 });
						var14.setType(16);
						BoundaryObject.runScriptEvent(var14);
					}
				} 
				this.field4531 = var11;
			}
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIZZS)V", garbageValue = "13586")
	public void method7307(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label40 : {
			var5 = class115.method2692();
			this.method7217(var1, var2, var4, var5);
			if (!this.hasTarget() && (var4 || var3)) {
				boolean var7 = Client.clickedWidget != null;
				if (!var7) {
					if (var4) {
						this.field4539 = var1;
						this.field4567 = var2;
						this.field4546 = this.centerTileX;
						this.field4547 = this.centerTileY;
					}
					if (this.field4546 != -1) {
						int var8 = var1 - this.field4539;
						int var9 = var2 - this.field4567;
						this.setWorldMapPosition(this.field4546 - ((int) (((float) (var8)) / this.zoomTarget)), ((int) (((float) (var9)) / this.zoomTarget)) + this.field4547, false);
					}
					break label40;
				}
			}
			this.method7189();
		}
		if (var4) {
			this.field4534 = var5;
			this.field4551 = var1;
			this.field4552 = var2;
		}
	}

	@ObfuscatedName("j")
	void method7217(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = ((int) (((float) (this.centerTileX)) + (((float) (var1 - this.worldMapDisplayX)) - ((float) (this.getDisplayWith())) * this.zoom / 2.0F) / this.zoom));
			int var7 = ((int) (((float) (this.centerTileY)) - (((float) (var2 - this.worldMapDisplayY)) - ((float) (this.getDisplayHeight())) * this.zoom / 2.0F) / this.zoom));
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				boolean var8 = Client.staffModLevel >= 2;
				int var10;
				int var11;
				if (var8 && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) {
					int var14 = this.mouseCoord.x;
					var10 = this.mouseCoord.y;
					var11 = this.mouseCoord.plane;
					PacketBufferNode var12 = EnumComposition.getPacketBufferNode(ClientPacket.CLICKWORLDMAP_TELEPORT, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByteNeg(var11);
					var12.packetBuffer.writeShortLE(var10);
					var12.packetBuffer.writeIntLE(0);
					var12.packetBuffer.writeShortLE(var14);
					Client.packetWriter.addNode(var12);
				} else {
					boolean var9 = true;
					if (this.field4514) {
						var10 = var1 - this.field4551;
						var11 = var2 - this.field4552;
						if (var4 - this.field4534 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
							var9 = false;
						}
					}
					if (var9) {
						PacketBufferNode var13 = EnumComposition.getPacketBufferNode(ClientPacket.field2990, Client.packetWriter.isaacCipher);
						var13.packetBuffer.writeIntIME(this.mouseCoord.packed());
						Client.packetWriter.addNode(var13);
						this.field4534 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-454245958")
	@Export("smoothZoom")
	void smoothZoom() {
		if (UrlRequester.field1362 != null) {
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

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1467959919")
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
			if (this.centerTileX == this.worldMapTargetX && this.worldMapTargetY == this.centerTileY) {
				this.worldMapTargetX = -1;
				this.worldMapTargetY = -1;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "715686977")
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		class115.method2692();
		if (var3) {
			this.method7189();
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "119146039")
	final void method7189() {
		this.field4567 = -1;
		this.field4539 = -1;
		this.field4547 = -1;
		this.field4546 = -1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-352879133")
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IIIB)Lhg;", garbageValue = "-123")
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator();
		WorldMapArea var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}
			var5 = ((WorldMapArea) (var4.next()));
		} while (!var5.containsCoord(var1, var2, var3) );
		return var5;
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(IIIZI)V", garbageValue = "-1521542752")
	public void method7192(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}
			var5 = this.mainMapArea;
		}
		boolean var6 = false;
		if (var5 != this.field4550 || var4) {
			this.field4550 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}
		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1883142675")
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-126")
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)Lhg;", garbageValue = "2042436529")
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(Lhg;I)V", garbageValue = "-1953611759")
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMapManager(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Lhg;I)V", garbageValue = "254842140")
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(Lhg;Lkd;Lkd;ZI)V", garbageValue = "812023779")
	public void method7292(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) {
			if (this.currentMapArea == null || var1 != this.currentMapArea) {
				this.initializeWorldMapManager(var1);
			}
			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) {
				this.jump(var2.plane, var2.x, var2.y);
			} else {
				this.jump(var3.plane, var3.x, var3.y);
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-462860729")
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
			this.field4548 = null;
			this.iconIterator = null;
			this.worldMapManager.clearIcons();
		}
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(IIIIIB)V", garbageValue = "0")
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
			if (!this.worldMapManager.isLoaded()) {
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapManager.isLoaded()) {
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
			int var8 = ((int) (Math.ceil(((double) (((float) (var3)) / this.zoom)))));
			int var9 = ((int) (Math.ceil(((double) (((float) (var4)) / this.zoom)))));
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			boolean var10;
			if (!this.elementsDisabled) {
				var10 = false;
				if (var5 - this.field4559 > 100) {
					this.field4559 = var5;
					var10 = true;
				}
				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4561, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
			}
			this.method7202(var1, var2, var3, var4, var8, var9);
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

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(IIIIIIB)Z", garbageValue = "39")
	boolean method7201(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field4560 != Client.field770) {
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

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "273043499")
	void method7202(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (UrlRequester.field1362 != null) {
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2);
			int var8 = var3 + 512;
			int var9 = var4 + 512;
			float var10 = 1.0F;
			var8 = ((int) (((float) (var8)) / var10));
			var9 = ((int) (((float) (var9)) / var10));
			int var11 = this.getDisplayX() - var5 / 2 - var7;
			int var12 = this.getDisplayY() - var6 / 2 - var7;
			int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			if (this.method7201(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}
				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile;
				UrlRequester.field1362.method6046(this.minCachedTileX, this.minCachedTileY, this.sprite, ((float) (this.cachedPixelsPerTile)) / var10);
				this.field4560 = Client.field770;
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}
			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (1.0F == var10) {
				this.sprite.method8171(var13, var14, 192);
			} else {
				this.sprite.method8155(var13, var14, ((int) (((float) (var8)) * var10)), ((int) (var10 * ((float) (var9)))), 192);
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "-9")
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapManager.isLoaded()) {
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapManager.isLoaded()) {
					return;
				}
			}
			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1059944700")
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(IIIIII)V", garbageValue = "-884095682")
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

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(II)F", garbageValue = "-1978346324")
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1581963366")
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (((double) (this.zoomTarget)) == 1.0) {
			return 25;
		} else if (1.5 == ((double) (this.zoomTarget))) {
			return 37;
		} else if (2.0 == ((double) (this.zoomTarget))) {
			return 50;
		} else if (((double) (this.zoomTarget)) == 3.0) {
			return 75;
		} else {
			return 4.0 == ((double) (this.zoomTarget)) ? 100 : 200;
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "31")
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1992211650")
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(II)Lhg;", garbageValue = "488070761")
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator();
		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null;
			}
			var3 = ((WorldMapArea) (var2.next()));
		} while (var3.getId() != var1 );
		return var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-2000292746")
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1697646850")
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "49")
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTarget(var4[0], var4[1]);
			}
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "16")
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1624577008")
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1104957899")
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(B)Lkd;", garbageValue = "-42")
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1921682831")
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1280379372")
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "-43")
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "753498595")
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "2030876969")
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-563581056")
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "1949039555")
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1359240412")
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1059835143")
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;
		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
			if (class432.WorldMapElement_get(var2) != null && class432.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(class432.WorldMapElement_get(var2).objectId);
			}
		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1504784158")
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(ZS)V", garbageValue = "6222")
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "230935257")
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}
		this.method7233();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "-1347113189")
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}
		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
			if (class432.WorldMapElement_get(var3) != null && class432.WorldMapElement_get(var3).category == var1) {
				int var4 = class432.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}
		this.method7233();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "51")
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "74")
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-104")
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "493716456")
	void method7233() {
		this.field4561.clear();
		this.field4561.addAll(this.enabledElements);
		this.field4561.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "1554810691")
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = ((int) (Math.ceil(((double) (((float) (var3)) / this.zoom)))));
			int var8 = ((int) (Math.ceil(((double) (((float) (var4)) / this.zoom)))));
			List var9 = this.worldMapManager.method4819(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();
				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}
					AbstractWorldMapIcon var11 = ((AbstractWorldMapIcon) (var10.next()));
					WorldMapElement var12 = class432.WorldMapElement_get(var11.getElement());
					var13 = false;
					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							class4.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while (!var13 );
			}
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(ILkd;S)Lkd;", garbageValue = "-7526")
	public Coord method7235(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapManager.isLoaded()) {
			return null;
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) {
			return null;
		} else {
			HashMap var3 = this.worldMapManager.buildIcons();
			List var4 = ((List) (var3.get(var1)));
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
						var8 = ((AbstractWorldMapIcon) (var7.next()));
						int var9 = var8.coord2.x - var2.x;
						int var10 = var8.coord2.y - var2.y;
						var11 = var9 * var9 + var10 * var10;
						if (var11 == 0) {
							return var8.coord2;
						}
					} while (var11 >= var6 && var5 != null );
					var5 = var8;
					var6 = var11;
				} 
			} else {
				return null;
			}
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(descriptor = "(IILkd;Lkd;I)V", garbageValue = "-880651836")
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent();
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
		var5.setArgs(new Object[]{ var6 });
		switch (var1) {
			case 1008 :
				var5.setType(10);
				break;
			case 1009 :
				var5.setType(11);
				break;
			case 1010 :
				var5.setType(12);
				break;
			case 1011 :
				var5.setType(13);
				break;
			case 1012 :
				var5.setType(14);
		}
		BoundaryObject.runScriptEvent(var5);
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(descriptor = "(I)Lim;", garbageValue = "-1835543472")
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapManager.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapManager.buildIcons();
			this.field4548 = new LinkedList();
			Iterator var2 = var1.values().iterator();
			while (var2.hasNext()) {
				List var3 = ((List) (var2.next()));
				this.field4548.addAll(var3);
			} 
			this.iconIterator = this.field4548.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(descriptor = "(B)Lim;", garbageValue = "-29")
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
				var1 = ((AbstractWorldMapIcon) (this.iconIterator.next()));
			} while (var1.getElement() == -1 );
			return var1;
		}
	}

	@ObfuscatedName("hx")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-110608054")
	static final void method7376() {
		Client.field607 = 0;
		int var0 = (class101.localPlayer.x >> 7) + class28.baseX;
		int var1 = (class101.localPlayer.y >> 7) + WorldMapLabelSize.baseY;
		if (var0 >= 3053 && var0 <= 3156 && var1 >= 3056 && var1 <= 3136) {
			Client.field607 = 1;
		}
		if (var0 >= 3072 && var0 <= 3118 && var1 >= 9492 && var1 <= 9535) {
			Client.field607 = 1;
		}
		if (Client.field607 == 1 && var0 >= 3139 && var0 <= 3199 && var1 >= 3008 && var1 <= 3062) {
			Client.field607 = 0;
		}
	}

	@ObfuscatedName("ha")
	@ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "-976677354")
	static final void method7377(int var0, int var1, boolean var2) {
		if (!var2 || var0 != GrandExchangeOffer.field4070 || ApproximateRouteStrategy.field466 != var1) {
			GrandExchangeOffer.field4070 = var0;
			ApproximateRouteStrategy.field466 = var1;
			HealthBarUpdate.updateGameState(25);
			SequenceDefinition.drawLoadingMessage("Loading - please wait.", true);
			int var3 = class28.baseX;
			int var4 = WorldMapLabelSize.baseY;
			class28.baseX = (var0 - 6) * 8;
			WorldMapLabelSize.baseY = (var1 - 6) * 8;
			int var5 = class28.baseX - var3;
			int var6 = WorldMapLabelSize.baseY - var4;
			var3 = class28.baseX;
			var4 = WorldMapLabelSize.baseY;
			int var7;
			int var9;
			int[] var10000;
			for (var7 = 0; var7 < 32768; ++var7) {
				NPC var19 = Client.npcs[var7];
				if (var19 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var19.pathX;
						var10000[var9] -= var5;
						var10000 = var19.pathY;
						var10000[var9] -= var6;
					}
					var19.x -= var5 * 128;
					var19.y -= var6 * 128;
				}
			}
			for (var7 = 0; var7 < 2048; ++var7) {
				Player var22 = Client.players[var7];
				if (var22 != null) {
					for (var9 = 0; var9 < 10; ++var9) {
						var10000 = var22.pathX;
						var10000[var9] -= var5;
						var10000 = var22.pathY;
						var10000[var9] -= var6;
					}
					var22.x -= var5 * 128;
					var22.y -= var6 * 128;
				}
			}
			byte var20 = 0;
			byte var8 = 104;
			byte var21 = 1;
			if (var5 < 0) {
				var20 = 103;
				var8 = -1;
				var21 = -1;
			}
			byte var10 = 0;
			byte var11 = 104;
			byte var12 = 1;
			if (var6 < 0) {
				var10 = 103;
				var11 = -1;
				var12 = -1;
			}
			int var14;
			for (int var13 = var20; var8 != var13; var13 += var21) {
				for (var14 = var10; var11 != var14; var14 += var12) {
					int var15 = var5 + var13;
					int var16 = var14 + var6;
					for (int var17 = 0; var17 < 4; ++var17) {
						if (var15 >= 0 && var16 >= 0 && var15 < 104 && var16 < 104) {
							Client.groundItems[var17][var13][var14] = Client.groundItems[var17][var15][var16];
						} else {
							Client.groundItems[var17][var13][var14] = null;
						}
					}
				}
			}
			for (PendingSpawn var18 = ((PendingSpawn) (Client.pendingSpawns.last())); var18 != null; var18 = ((PendingSpawn) (Client.pendingSpawns.previous()))) {
				var18.x -= var5;
				var18.y -= var6;
				if (var18.x < 0 || var18.y < 0 || var18.x >= 104 || var18.y >= 104) {
					var18.remove();
				}
			}
			if (Client.destinationX != 0) {
				Client.destinationX -= var5;
				Client.destinationY -= var6;
			}
			Client.soundEffectCount = 0;
			Client.isCameraLocked = false;
			class18.cameraX -= var5 << 7;
			class228.cameraZ -= var6 << 7;
			InterfaceParent.oculusOrbFocalPointX -= var5 << 7;
			class141.oculusOrbFocalPointY -= var6 << 7;
			Client.field725 = -1;
			Client.graphicsObjects.clear();
			Client.projectiles.clear();
			for (var14 = 0; var14 < 4; ++var14) {
				Client.collisionMaps[var14].clear();
			}
		}
	}
}