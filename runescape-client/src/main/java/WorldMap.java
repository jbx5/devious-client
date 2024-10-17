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

@ObfuscatedName("uc")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lus;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("af")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lvc;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ab")
	@Export("details")
	HashMap details;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	WorldMapArea field5259;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("worldMapRenderer")
	WorldMapRenderer worldMapRenderer;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lub;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -300773559
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -506005999
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 749522271
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -1241278151
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ah")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bh")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1606362793
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = 89536797
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = -1603925909
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -1906865929
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = 74850835
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bq")
	@ObfuscatedGetter(
		intValue = -488849437
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bp")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bz")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 507857975
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 464312387
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = -1436970191
	)
	int field5278;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = 1762340763
	)
	int field5279;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -89355889
	)
	int field5248;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 162178535
	)
	int field5281;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		longValue = 8565669029377014713L
	)
	long field5282;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1548454979
	)
	int field5275;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = 1410514837
	)
	int field5286;
	@ObfuscatedName("bd")
	boolean field5265;
	@ObfuscatedName("bi")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bf")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bg")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bl")
	HashSet field5289;
	@ObfuscatedName("be")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 33633383
	)
	int field5291;
	@ObfuscatedName("cd")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("ci")
	List field5293;
	@ObfuscatedName("cn")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("co")
	HashSet field5255;
	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("cl")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -2137785581
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cy")
	@ObfuscatedGetter(
		intValue = -190559309
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cu")
	@ObfuscatedGetter(
		intValue = 418000605
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("ce")
	@ObfuscatedGetter(
		intValue = -1556032997
	)
	int field5302;

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
		this.field5278 = -1;
		this.field5279 = -1;
		this.field5248 = -1;
		this.field5281 = -1;
		this.field5265 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field5289 = new HashSet();
		this.elementsDisabled = false;
		this.field5291 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field5255 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field5302 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpe;Lpe;Lpe;Lqi;Ljava/util/HashMap;[Lvc;I)V",
		garbageValue = "459258047"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3263.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		int var9 = var8 == null ? 0 : var8.length;
		this.details = new HashMap(var9);

		for (int var10 = 0; var10 < var9; ++var10) {
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10]));
			WorldMapArea var12 = new WorldMapArea();
			var12.method5924(var11, var8[var10]);
			this.details.put(var12.getInternalName(), var12);
			if (var12.getIsMain()) {
				this.mainMapArea = var12;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field5259 = null;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1776973794"
	)
	public void method9528() {
		UserComparator7.method3291();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "718368227"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapRenderer.method6116(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); Ignored.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field5255.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field5255.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						Ignored.runScriptEvent(var14);
					}
				}

				this.field5255 = var11;
			}
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "-1971373809"
	)
	public void method9530(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label41: {
			var5 = class77.method2338();
			this.method9531(var1, var2, var4, var5);
			if (!this.hasTarget() && (var4 || var3)) {
				boolean var7 = Client.clickedWidget != null;
				if (!var7) {
					if (var4) {
						this.field5248 = var1;
						this.field5281 = var2;
						this.field5278 = this.centerTileX;
						this.field5279 = this.centerTileY;
					}

					if (this.field5278 != -1) {
						int var8 = var1 - this.field5248;
						int var9 = var2 - this.field5281;
						this.setWorldMapPosition(this.field5278 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field5279, false);
					}
					break label41;
				}
			}

			this.method9535();
		}

		if (var4) {
			this.field5282 = var5;
			this.field5275 = var1;
			this.field5286 = var2;
		}

	}

	@ObfuscatedName("ai")
	void method9531(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				IndexCheck var8 = Client.indexCheck;
				int var11;
				int var12;
				if (class135.method3431() && var8.isValidIndexInRange(82) && var8.isValidIndexInRange(81)) {
					int var15 = this.mouseCoord.x;
					var11 = this.mouseCoord.y;
					var12 = this.mouseCoord.plane;
					PacketBufferNode var13 = class113.getPacketBufferNode(ClientPacket.field3402, Client.packetWriter.isaacCipher);
					var13.packetBuffer.writeByteNeg(var12);
					var13.packetBuffer.writeIntME(0);
					var13.packetBuffer.writeShortLE(var11);
					var13.packetBuffer.writeShortLE(var15);
					Client.packetWriter.addNode(var13);
				} else {
					boolean var10 = true;
					if (this.field5265) {
						var11 = var1 - this.field5275;
						var12 = var2 - this.field5286;
						if (var4 - this.field5282 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						PacketBufferNode var14 = class113.getPacketBufferNode(ClientPacket.field3359, Client.packetWriter.isaacCipher);
						var14.packetBuffer.writeIntIME(this.mouseCoord.packed());
						Client.packetWriter.addNode(var14);
						this.field5282 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1073103093"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class77.field922 != null) {
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

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "7"
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2119562774"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		class77.method2338();
		if (var3) {
			this.method9535();
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2122351263"
	)
	final void method9535() {
		this.field5281 = -1;
		this.field5248 = -1;
		this.field5279 = -1;
		this.field5278 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1317141855"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lkp;",
		garbageValue = "98"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-1080856428"
	)
	public void method9721(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field5259 || var4) {
			this.field5259 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-614732909"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1368340212"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lkp;",
		garbageValue = "-1598904803"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lkp;B)V",
		garbageValue = "61"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMap(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lkp;B)V",
		garbageValue = "14"
	)
	@Export("initializeWorldMap")
	void initializeWorldMap(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Lkp;Lnn;Lnn;ZB)V",
		garbageValue = "-11"
	)
	public void method9544(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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
		garbageValue = "-1318586537"
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
			this.field5293 = null;
			this.iconIterator = null;
			this.worldMapRenderer.clearIcons();
		}
	}

	@ObfuscatedName("ac")
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5, double var6) {
		int[] var8 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var8);
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
		int var9 = this.cacheLoader.getPercentLoaded();
		if (var9 < 100) {
			this.drawLoading(var1, var2, var3, var4, var9);
		} else {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method6111(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			int var10 = class191.method3984(this.worldMapRenderer.method6119(), var6);
			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, var10);
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

			int var11 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var12 = (int)Math.ceil((double)((float)var4 / this.zoom));
			double var13 = Rasterizer3D.method4800();
			this.worldMapRenderer.drawTiles(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			if (!this.elementsDisabled) {
				boolean var15 = false;
				if (var5 - this.field5291 > 100) {
					this.field5291 = var5;
					var15 = true;
				}

				this.worldMapRenderer.drawElements(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5289, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var15);
			}

			this.method9549(var1, var2, var3, var4, var11, var12);
			if (class135.method3431() && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var11;
			this.worldMapDisplayHeight = var12;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var8);
			if (var13 != Rasterizer3D.method4800()) {
				Rasterizer3D.buildPalette(var13);
			}

		}
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "8"
	)
	public void method9711() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "9"
	)
	boolean method9548(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field5302 != Client.field800) {
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-51593668"
	)
	void method9549(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class77.field922 != null) {
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
			if (this.method9548(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
				class77.field922.method7819(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field5302 = Client.field800;
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
				var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (1.0F == var10) {
				this.sprite.method10595(var13, var14, 192);
			} else {
				this.sprite.method10598(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
			}
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-612557559"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method6111(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			this.worldMapRenderer.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "44"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "7"
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

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1306083425"
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "12421"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) {
			return 25;
		} else if (1.5D == (double)this.zoomTarget) {
			return 37;
		} else if ((double)this.zoomTarget == 2.0D) {
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75;
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200;
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-673141652"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1815887937"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(II)Lkp;",
		garbageValue = "-408749054"
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

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1105203222"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-104"
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
		garbageValue = "-23"
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "721260708"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-840982359"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2107622542"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "669935203"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-700346661"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1570471484"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "65535"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "2"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1553939840"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "984489697"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1097482415"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "54"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1962755357"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < class346.WorldMapElement_count; ++var2) {
			if (AsyncRestClient.WorldMapElement_get(var2) != null && AsyncRestClient.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(AsyncRestClient.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1252228096"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "2"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-534123312"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method9581();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2051740819"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < class346.WorldMapElement_count; ++var3) {
			if (AsyncRestClient.WorldMapElement_get(var3) != null && AsyncRestClient.WorldMapElement_get(var3).category == var1) {
				int var4 = AsyncRestClient.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method9581();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-478642259"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1729498292"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2044954957"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "500907335"
	)
	void method9581() {
		this.field5289.clear();
		this.field5289.addAll(this.enabledElements);
		this.field5289.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-482686616"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapRenderer.method6116(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = AsyncRestClient.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							class368.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(ILnn;I)Lnn;",
		garbageValue = "-764454433"
	)
	public Coord method9684(int var1, Coord var2) {
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

	@ObfuscatedName("co")
	@ObfuscatedSignature(
		descriptor = "(IILnn;Lnn;I)V",
		garbageValue = "1934777915"
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

		Ignored.runScriptEvent(var5);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)Llx;",
		garbageValue = "-715956731"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapRenderer.buildIcons();
			this.field5293 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field5293.addAll(var3);
			}

			this.iconIterator = this.field5293.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(I)Llx;",
		garbageValue = "-2054361493"
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)[Lvp;",
		garbageValue = "17"
	)
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{FillMode.SOLID, FillMode.field5544, FillMode.field5543};
	}
}
