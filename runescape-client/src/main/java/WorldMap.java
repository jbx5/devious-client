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

@ObfuscatedName("tu")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ltw;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ap")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "[Lvt;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("az")
	@Export("details")
	HashMap details;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	WorldMapArea field5203;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Llb;"
	)
	@Export("worldMapRenderer")
	WorldMapRenderer worldMapRenderer;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1861568259
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = 187491643
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -202213425
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1593267677
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ak")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bn")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 96966995
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1393186257
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bx")
	@ObfuscatedGetter(
		intValue = 669451105
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -48182701
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bm")
	@ObfuscatedGetter(
		intValue = -1478184095
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = -1155622761
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bw")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ba")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 436928427
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 1583107929
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 548784823
	)
	int field5222;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		intValue = -683963953
	)
	int field5223;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = -1040953133
	)
	int field5193;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1178606035
	)
	int field5235;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		longValue = 2331784597243095077L
	)
	long field5226;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -914390011
	)
	int field5227;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = -1108352897
	)
	int field5228;
	@ObfuscatedName("br")
	boolean field5242;
	@ObfuscatedName("bt")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bq")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bk")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("be")
	HashSet field5233;
	@ObfuscatedName("bc")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = -1226341343
	)
	int field5224;
	@ObfuscatedName("cf")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cu")
	List field5238;
	@ObfuscatedName("cm")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cj")
	HashSet field5240;
	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "Lnm;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ci")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "Lvv;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -1600026175
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cv")
	@ObfuscatedGetter(
		intValue = -941597677
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cg")
	@ObfuscatedGetter(
		intValue = -1400798829
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("ct")
	@ObfuscatedGetter(
		intValue = -796369057
	)
	int field5247;

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
		this.field5222 = -1;
		this.field5223 = -1;
		this.field5193 = -1;
		this.field5235 = -1;
		this.field5242 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field5233 = new HashSet();
		this.elementsDisabled = false;
		this.field5224 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field5240 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field5247 = -1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lpo;Lpo;Lpo;Lqu;Ljava/util/HashMap;[Lvt;B)V",
		garbageValue = "-12"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3261.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		int var9 = var8 == null ? 0 : var8.length;
		this.details = new HashMap(var9);

		for (int var10 = 0; var10 < var9; ++var10) {
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10]));
			WorldMapArea var12 = new WorldMapArea();
			var12.method5805(var11, var8[var10]);
			this.details.put(var12.getInternalName(), var12);
			if (var12.getIsMain()) {
				this.mainMapArea = var12;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field5203 = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1509363224"
	)
	public void method9344() {
		class4.method13();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-484071672"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapRenderer.method6036(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class215.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field5240.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field5240.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						class215.runScriptEvent(var14);
					}
				}

				this.field5240 = var11;
			}
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "1244914165"
	)
	public void method9346(int var1, int var2, boolean var3, boolean var4) {
		long var5 = WorldMapElement.method3843();
		this.method9403(var1, var2, var4, var5);
		if (!this.hasTarget() && (var4 || var3) && !PendingSpawn.method2633()) {
			if (var4) {
				this.field5193 = var1;
				this.field5235 = var2;
				this.field5222 = this.centerTileX;
				this.field5223 = this.centerTileY;
			}

			if (this.field5222 != -1) {
				int var7 = var1 - this.field5193;
				int var8 = var2 - this.field5235;
				this.setWorldMapPosition(this.field5222 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field5223, false);
			}
		} else {
			this.method9351();
		}

		if (var4) {
			this.field5226 = var5;
			this.field5227 = var1;
			this.field5228 = var2;
		}

	}

	@ObfuscatedName("ax")
	void method9403(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				IndexCheck var8 = Client.indexCheck;
				if (InterfaceParent.method2509() && var8.isValidIndexInRange(82) && var8.isValidIndexInRange(81)) {
					class537.method9777(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
				} else {
					boolean var10 = true;
					if (this.field5242) {
						int var11 = var1 - this.field5227;
						int var12 = var2 - this.field5228;
						if (var4 - this.field5226 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
							var10 = false;
						}
					}

					if (var10) {
						PacketBufferNode var13 = class141.getPacketBufferNode(ClientPacket.field3401, Client.packetWriter.isaacCipher);
						var13.packetBuffer.writeInt(this.mouseCoord.packed());
						Client.packetWriter.addNode(var13);
						this.field5226 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class389.field4542 != null) {
			this.zoom = this.zoomTarget;
		} else {
			if (this.zoom < this.zoomTarget) {
				this.zoom = Math.min(this.zoomTarget, this.zoom + this.zoom / 30.0F);
			}

			if (this.zoom > this.zoomTarget) {
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F);
			}

		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-126131204"
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

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-45"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		WorldMapElement.method3843();
		if (var3) {
			this.method9351();
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-50"
	)
	final void method9351() {
		this.field5235 = -1;
		this.field5193 = -1;
		this.field5223 = -1;
		this.field5222 = -1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "330108021"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lky;",
		garbageValue = "1189546801"
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

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "-881657651"
	)
	public void method9342(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field5203 || var4) {
			this.field5203 = var5;
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
		garbageValue = "1031020551"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "571108452"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lky;",
		garbageValue = "-348245398"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "983058506"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMap(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "1455133267"
	)
	@Export("initializeWorldMap")
	void initializeWorldMap(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lky;Lnm;Lnm;ZB)V",
		garbageValue = "7"
	)
	public void method9400(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "1513546936"
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
			this.field5238 = null;
			this.iconIterator = null;
			this.worldMapRenderer.clearIcons();
		}
	}

	@ObfuscatedName("as")
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
				this.worldMapRenderer.method5998(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			int var11 = this.worldMapRenderer.method6005();
			double var12 = (double)(var11 >> 16 & 255) / 256.0D;
			double var14 = (double)(var11 >> 8 & 255) / 256.0D;
			double var16 = (double)(var11 & 255) / 256.0D;
			var12 = Math.pow(var12, var6);
			var14 = Math.pow(var14, var6);
			var16 = Math.pow(var16, var6);
			int var18 = (int)(var12 * 256.0D);
			int var19 = (int)(256.0D * var14);
			int var20 = (int)(256.0D * var16);
			int var10 = var20 + (var19 << 8) + (var18 << 16) + -16777216;
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

			int var13 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var22 = (int)Math.ceil((double)((float)var4 / this.zoom));
			double var15 = Rasterizer3D.method4728();
			this.worldMapRenderer.drawTiles(this.centerTileX - var13 / 2, this.centerTileY - var22 / 2, var13 / 2 + this.centerTileX, var22 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			if (!this.elementsDisabled) {
				boolean var17 = false;
				if (var5 - this.field5224 > 100) {
					this.field5224 = var5;
					var17 = true;
				}

				this.worldMapRenderer.drawElements(this.centerTileX - var13 / 2, this.centerTileY - var22 / 2, var13 / 2 + this.centerTileX, var22 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5233, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var17);
			}

			this.method9464(var1, var2, var3, var4, var13, var22);
			if (InterfaceParent.method2509() && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var13;
			this.worldMapDisplayHeight = var22;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var8);
			if (var15 != Rasterizer3D.method4728()) {
				Rasterizer3D.buildPalette(var15);
			}

		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1725102701"
	)
	public void method9363() {
		HttpRequestTask.method287();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "-43"
	)
	boolean method9364(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field5247 != Client.field808) {
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "119"
	)
	void method9464(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class389.field4542 != null) {
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
			if (this.method9364(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
				class389.field4542.method7739(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field5247 = Client.field808;
				var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
				var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (1.0F == var10) {
				this.sprite.method10378(var13, var14, 192);
			} else {
				this.sprite.method10405(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "2019084842"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method5998(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			this.worldMapRenderer.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-84"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-249064015"
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "27"
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
		garbageValue = "1753166261"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) {
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) {
			return 37;
		} else if (2.0D == (double)this.zoomTarget) {
			return 50;
		} else if (3.0D == (double)this.zoomTarget) {
			return 75;
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "732305140"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1386864460"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(II)Lky;",
		garbageValue = "-344738516"
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

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "421697312"
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
		garbageValue = "-52871423"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "14"
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

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "2"
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

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "625144728"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1392968795"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)Lnm;",
		garbageValue = "242500852"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "12"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "-18226"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-568422722"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-1550"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1980809295"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-30"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1985719342"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-25314"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "6848"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < class463.WorldMapElement_count; ++var2) {
			if (class142.WorldMapElement_get(var2) != null && class142.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(class142.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1705849669"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "26"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "461679961"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method9397();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "-82"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < class463.WorldMapElement_count; ++var3) {
			if (class142.WorldMapElement_get(var3) != null && class142.WorldMapElement_get(var3).category == var1) {
				int var4 = class142.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method9397();
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1163082995"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("cn")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1420005247"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "260969437"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2013730532"
	)
	void method9397() {
		this.field5233.clear();
		this.field5233.addAll(this.enabledElements);
		this.field5233.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "30"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapRenderer.method6036(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = class142.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							Projection.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(ILnm;I)Lnm;",
		garbageValue = "2105917750"
	)
	public Coord method9395(int var1, Coord var2) {
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

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(IILnm;Lnm;I)V",
		garbageValue = "1541591836"
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

		class215.runScriptEvent(var5);
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(B)Lly;",
		garbageValue = "14"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapRenderer.buildIcons();
			this.field5238 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field5238.addAll(var3);
			}

			this.iconIterator = this.field5238.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(I)Lly;",
		garbageValue = "1945530495"
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
}
