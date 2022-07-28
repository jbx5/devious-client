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
@ObfuscatedName("ot")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lpz;")
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "Lpz;")
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "Lpz;")
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "Lmx;")
	@Export("font")
	Font font;

	@ObfuscatedName("g")
	@Export("fonts")
	HashMap fonts;

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "[Lql;")
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;

	@ObfuscatedName("b")
	@Export("details")
	HashMap details;

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "Lhw;")
	@Export("mainMapArea")
	WorldMapArea mainMapArea;

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "Lhw;")
	@Export("currentMapArea")
	WorldMapArea currentMapArea;

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "Lhw;")
	WorldMapArea field4531;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lha;")
	@Export("worldMapManager")
	WorldMapManager worldMapManager;

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "Los;")
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;

	@ObfuscatedName("e")
	@ObfuscatedGetter(intValue = -1694384091)
	@Export("centerTileX")
	int centerTileX;

	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = 1229026359)
	@Export("centerTileY")
	int centerTileY;

	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 898724743)
	@Export("worldMapTargetX")
	int worldMapTargetX = -1;

	@ObfuscatedName("r")
	@ObfuscatedGetter(intValue = -584578117)
	@Export("worldMapTargetY")
	int worldMapTargetY = -1;

	@ObfuscatedName("m")
	@Export("zoom")
	float zoom;

	@ObfuscatedName("ag")
	@Export("zoomTarget")
	float zoomTarget;

	@ObfuscatedName("ar")
	@ObfuscatedGetter(intValue = 359704523)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth = -1;

	@ObfuscatedName("aj")
	@ObfuscatedGetter(intValue = -571346471)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight = -1;

	@ObfuscatedName("au")
	@ObfuscatedGetter(intValue = 510585019)
	@Export("worldMapDisplayX")
	int worldMapDisplayX = -1;

	@ObfuscatedName("af")
	@ObfuscatedGetter(intValue = -1760632627)
	@Export("worldMapDisplayY")
	int worldMapDisplayY = -1;

	@ObfuscatedName("as")
	@ObfuscatedGetter(intValue = 1434795047)
	@Export("maxFlashCount")
	int maxFlashCount = 3;

	@ObfuscatedName("ab")
	@ObfuscatedGetter(intValue = 1463646883)
	@Export("cyclesPerFlash")
	int cyclesPerFlash = 50;

	@ObfuscatedName("al")
	@Export("perpetualFlash")
	boolean perpetualFlash = false;

	@ObfuscatedName("ah")
	@Export("flashingElements")
	HashSet flashingElements = null;

	@ObfuscatedName("ai")
	@ObfuscatedGetter(intValue = -1061769207)
	@Export("flashCount")
	int flashCount = -1;

	@ObfuscatedName("ac")
	@ObfuscatedGetter(intValue = -1540168415)
	@Export("flashCycle")
	int flashCycle = -1;

	@ObfuscatedName("ap")
	@ObfuscatedGetter(intValue = 552419099)
	int field4565 = -1;

	@ObfuscatedName("aw")
	@ObfuscatedGetter(intValue = 1985016597)
	int field4566 = -1;

	@ObfuscatedName("at")
	@ObfuscatedGetter(intValue = -1685784499)
	int field4534 = -1;

	@ObfuscatedName("aq")
	@ObfuscatedGetter(intValue = -590461729)
	int field4568 = -1;

	@ObfuscatedName("ax")
	@ObfuscatedGetter(longValue = -6310489792825093595L)
	long field4554;

	@ObfuscatedName("an")
	@ObfuscatedGetter(intValue = -1115693569)
	int field4570;

	@ObfuscatedName("aa")
	@ObfuscatedGetter(intValue = -1844903131)
	int field4539;

	@ObfuscatedName("av")
	boolean field4572 = true;

	@ObfuscatedName("ak")
	@Export("enabledElements")
	HashSet enabledElements = new HashSet();

	@ObfuscatedName("ao")
	@Export("enabledCategories")
	HashSet enabledCategories = new HashSet();

	@ObfuscatedName("am")
	@Export("enabledElementIds")
	HashSet enabledElementIds = new HashSet();

	@ObfuscatedName("ad")
	HashSet field4586 = new HashSet();

	@ObfuscatedName("az")
	@Export("elementsDisabled")
	boolean elementsDisabled = false;

	@ObfuscatedName("bz")
	@ObfuscatedGetter(intValue = -1844713117)
	int field4578 = 0;

	@ObfuscatedName("bg")
	@Export("menuOpcodes")
	final int[] menuOpcodes = new int[]{ 1008, 1009, 1010, 1011, 1012 };

	@ObfuscatedName("bv")
	List field4579;

	@ObfuscatedName("ba")
	@Export("iconIterator")
	Iterator iconIterator;

	@ObfuscatedName("bd")
	HashSet field4582 = new HashSet();

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "Lkp;")
	@Export("mouseCoord")
	Coord mouseCoord = null;

	@ObfuscatedName("bu")
	@Export("showCoord")
	public boolean showCoord = false;

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "Lqj;")
	@Export("sprite")
	SpritePixels sprite;

	@ObfuscatedName("bq")
	@ObfuscatedGetter(intValue = -1874279973)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;

	@ObfuscatedName("bj")
	@ObfuscatedGetter(intValue = 1416349091)
	@Export("minCachedTileX")
	int minCachedTileX = -1;

	@ObfuscatedName("bt")
	@ObfuscatedGetter(intValue = 1490585961)
	@Export("minCachedTileY")
	int minCachedTileY = -1;

	@ObfuscatedName("bp")
	@ObfuscatedGetter(intValue = -992280851)
	int field4580 = -1;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11;
		fontNameVerdana13 = FontName.FontName_verdana13;
		fontNameVerdana15 = FontName.FontName_verdana15;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llc;Llc;Llc;Lmx;Ljava/util/HashMap;[Lql;I)V", garbageValue = "-87405813")
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
		this.field4531 = null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1264546325")
	public void method7224() {
		class220.method4530();
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(IIZIIIII)V", garbageValue = "-1001565013")
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = ((int) (Math.ceil(((double) (((float) (var6)) / this.zoom)))));
				int var9 = ((int) (Math.ceil(((double) (((float) (var7)) / this.zoom)))));
				List var10 = this.worldMapManager.method4792(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();
				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class17.runScriptEvent(var14)) {
					var13 = ((AbstractWorldMapIcon) (var12.next()));
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{ var15, var1, var2 });
					if (this.field4582.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}
				var12 = this.field4582.iterator();
				while (var12.hasNext()) {
					var13 = ((AbstractWorldMapIcon) (var12.next()));
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{ var15, var1, var2 });
						var14.setType(16);
						class17.runScriptEvent(var14);
					}
				} 
				this.field4582 = var11;
			}
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIZZI)V", garbageValue = "-1479777365")
	public void method7226(int var1, int var2, boolean var3, boolean var4) {
		long var5 = class131.method2916();
		this.method7370(var1, var2, var4, var5);
		if (!this.hasTarget() && (var4 || var3) && !class12.method161()) {
			if (var4) {
				this.field4534 = var1;
				this.field4568 = var2;
				this.field4565 = this.centerTileX;
				this.field4566 = this.centerTileY;
			}
			if (this.field4565 != -1) {
				int var7 = var1 - this.field4534;
				int var8 = var2 - this.field4568;
				this.setWorldMapPosition(this.field4565 - ((int) (((float) (var7)) / this.zoomTarget)), ((int) (((float) (var8)) / this.zoomTarget)) + this.field4566, false);
			}
		} else {
			this.method7234();
		}
		if (var4) {
			this.field4554 = var5;
			this.field4570 = var1;
			this.field4539 = var2;
		}
	}

	@ObfuscatedName("c")
	void method7370(int var1, int var2, boolean var3, long var4) {
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
					PacketBufferNode var12 = class433.getPacketBufferNode(ClientPacket.CLICKWORLDMAP_TELEPORT, Client.packetWriter.isaacCipher);
					var12.packetBuffer.writeByteAdd(var11);
					var12.packetBuffer.writeIntIME(0);
					var12.packetBuffer.writeShortAddLE(var10);
					var12.packetBuffer.writeShortAddLE(var14);
					Client.packetWriter.addNode(var12);
				} else {
					boolean var9 = true;
					if (this.field4572) {
						var10 = var1 - this.field4570;
						var11 = var2 - this.field4539;
						if (var4 - this.field4554 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
							var9 = false;
						}
					}
					if (var9) {
						PacketBufferNode var13 = class433.getPacketBufferNode(ClientPacket.field2975, Client.packetWriter.isaacCipher);
						var13.packetBuffer.writeIntIME(this.mouseCoord.packed());
						Client.packetWriter.addNode(var13);
						this.field4554 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
	@Export("smoothZoom")
	void smoothZoom() {
		if (class302.field3596 != null) {
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-8335304")
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
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) {
				this.worldMapTargetX = -1;
				this.worldMapTargetY = -1;
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(IIZB)V", garbageValue = "1")
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		class131.method2916();
		if (var3) {
			this.method7234();
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1328264783")
	final void method7234() {
		this.field4568 = -1;
		this.field4534 = -1;
		this.field4566 = -1;
		this.field4565 = -1;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "18")
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = "(IIIB)Lhw;", garbageValue = "29")
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

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(IIIZI)V", garbageValue = "484185553")
	public void method7249(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}
			var5 = this.mainMapArea;
		}
		boolean var6 = false;
		if (var5 != this.field4531 || var4) {
			this.field4531 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}
		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-648424484")
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "28337312")
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "(I)Lhw;", garbageValue = "1919783972")
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(Lhw;I)V", garbageValue = "1491091934")
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMapManager(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = "(Lhw;S)V", garbageValue = "-5527")
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(descriptor = "(Lhw;Lkp;Lkp;ZI)V", garbageValue = "161039961")
	public void method7240(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = "(IIIS)V", garbageValue = "-5765")
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
			this.field4579 = null;
			this.iconIterator = null;
			this.worldMapManager.clearIcons();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIIIIB)V", garbageValue = "-14")
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
				if (var5 - this.field4578 > 100) {
					this.field4578 = var5;
					var10 = true;
				}
				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4586, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
			}
			this.method7244(var1, var2, var3, var4, var8, var9);
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

	@ObfuscatedName("t")
	@ObfuscatedSignature(descriptor = "(IIIIIII)Z", garbageValue = "-1748947282")
	boolean method7272(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field4580 != Client.field773) {
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

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "-449769333")
	void method7244(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class302.field3596 != null) {
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
			if (this.method7272(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}
				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile;
				class302.field3596.method6060(this.minCachedTileX, this.minCachedTileY, this.sprite, ((float) (this.cachedPixelsPerTile)) / var10);
				this.field4580 = Client.field773;
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile;
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}
			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (1.0F == var10) {
				this.sprite.method8190(var13, var14, 192);
			} else {
				this.sprite.method8186(var13, var14, ((int) (var10 * ((float) (var8)))), ((int) (var10 * ((float) (var9)))), 192);
			}
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "1227453797")
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

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1833668268")
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = "(IIIIII)V", garbageValue = "-1372588137")
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

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = "(IB)F", garbageValue = "22")
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "1030134106")
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (((double) (this.zoomTarget)) == 1.0) {
			return 25;
		} else if (((double) (this.zoomTarget)) == 1.5) {
			return 37;
		} else if (2.0 == ((double) (this.zoomTarget))) {
			return 50;
		} else if (3.0 == ((double) (this.zoomTarget))) {
			return 75;
		} else {
			return 4.0 == ((double) (this.zoomTarget)) ? 100 : 200;
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1932355157")
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1823664508")
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(IB)Lhw;", garbageValue = "7")
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1119306986")
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(descriptor = "(III)V", garbageValue = "1657580962")
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-180026302")
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTarget(var4[0], var4[1]);
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "1596595994")
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) {
			int[] var4 = this.currentMapArea.position(var1, var2, var3);
			if (var4 != null) {
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
			}
		}
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1960141359")
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "32")
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(I)Lkp;", garbageValue = "-1788194441")
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1219695958")
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(descriptor = "(B)I", garbageValue = "126")
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1223854841")
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1976490769")
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1175720419")
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "627725443")
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "0")
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(descriptor = "(IB)V", garbageValue = "35")
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "499170237")
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;
		for (int var2 = 0; var2 < class432.WorldMapElement_count; ++var2) {
			if (TileItem.WorldMapElement_get(var2) != null && TileItem.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(TileItem.WorldMapElement_get(var2).objectId);
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1524902142")
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(descriptor = "(ZI)V", garbageValue = "-2103791969")
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "1551269934")
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}
		this.method7276();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "-886954783")
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}
		for (int var3 = 0; var3 < class432.WorldMapElement_count; ++var3) {
			if (TileItem.WorldMapElement_get(var3) != null && TileItem.WorldMapElement_get(var3).category == var1) {
				int var4 = TileItem.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}
		this.method7276();
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1991582401")
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "1")
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "414249162")
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2082028521")
	void method7276() {
		this.field4586.clear();
		this.field4586.addAll(this.enabledElements);
		this.field4586.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "739278024")
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = ((int) (Math.ceil(((double) (((float) (var3)) / this.zoom)))));
			int var8 = ((int) (Math.ceil(((double) (((float) (var4)) / this.zoom)))));
			List var9 = this.worldMapManager.method4792(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();
				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}
					AbstractWorldMapIcon var11 = ((AbstractWorldMapIcon) (var10.next()));
					WorldMapElement var12 = TileItem.WorldMapElement_get(var11.getElement());
					var13 = false;
					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							StructComposition.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while (!var13 );
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(descriptor = "(ILkp;I)Lkp;", garbageValue = "359130043")
	public Coord method7278(int var1, Coord var2) {
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
						var11 = var10 * var10 + var9 * var9;
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

	@ObfuscatedName("bf")
	@ObfuscatedSignature(descriptor = "(IILkp;Lkp;I)V", garbageValue = "1555999811")
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
		class17.runScriptEvent(var5);
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(descriptor = "(B)Lir;", garbageValue = "-5")
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapManager.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapManager.buildIcons();
			this.field4579 = new LinkedList();
			Iterator var2 = var1.values().iterator();
			while (var2.hasNext()) {
				List var3 = ((List) (var2.next()));
				this.field4579.addAll(var3);
			} 
			this.iconIterator = this.field4579.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(descriptor = "(B)Lir;", garbageValue = "-108")
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
}