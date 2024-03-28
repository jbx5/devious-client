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

@ObfuscatedName("tl")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpx;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("ax")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("aj")
	@Export("details")
	HashMap details;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkf;"
	)
	WorldMapArea field5034;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lkh;"
	)
	@Export("worldMapRenderer")
	WorldMapRenderer worldMapRenderer;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Ltp;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 794279051
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -565689229
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1409230685
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1036497123
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("ak")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("bp")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bz")
	@ObfuscatedGetter(
		intValue = -362082069
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bc")
	@ObfuscatedGetter(
		intValue = 2008830735
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = -886664503
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("be")
	@ObfuscatedGetter(
		intValue = 2100111929
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -1760981221
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = 446632919
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("bo")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bx")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = 1527989167
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = 651183449
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bs")
	@ObfuscatedGetter(
		intValue = 1271546775
	)
	int field5053;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = -562744191
	)
	int field5054;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		intValue = 1829639347
	)
	int field5055;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 56350317
	)
	int field5072;
	@ObfuscatedName("bb")
	@ObfuscatedGetter(
		longValue = -8158950987047012079L
	)
	long field5057;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = 1842932703
	)
	int field5058;
	@ObfuscatedName("bk")
	@ObfuscatedGetter(
		intValue = -103428547
	)
	int field5059;
	@ObfuscatedName("bt")
	boolean field5021;
	@ObfuscatedName("bw")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bm")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("ba")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("bv")
	HashSet field5064;
	@ObfuscatedName("bg")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cb")
	@ObfuscatedGetter(
		intValue = 171232517
	)
	int field5066;
	@ObfuscatedName("cr")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cy")
	List field5068;
	@ObfuscatedName("cg")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("cl")
	HashSet field5070;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ci")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("ct")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cm")
	@ObfuscatedGetter(
		intValue = 295077879
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cd")
	@ObfuscatedGetter(
		intValue = 219967895
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cc")
	@ObfuscatedGetter(
		intValue = 1194137575
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("cn")
	@ObfuscatedGetter(
		intValue = 1815183219
	)
	int field5077;

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
		this.field5053 = -1;
		this.field5054 = -1;
		this.field5055 = -1;
		this.field5072 = -1;
		this.field5021 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field5064 = new HashSet();
		this.elementsDisabled = false;
		this.field5066 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field5070 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field5077 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;Loc;Loc;Lpx;Ljava/util/HashMap;[Lvl;B)V",
		garbageValue = "-58"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3154.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		int var9 = var8 == null ? 0 : var8.length;
		this.details = new HashMap(var9);

		for (int var10 = 0; var10 < var9; ++var10) {
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10]));
			WorldMapArea var12 = new WorldMapArea();
			var12.method5290(var11, var8[var10]);
			this.details.put(var12.getInternalName(), var12);
			if (var12.getIsMain()) {
				this.mainMapArea = var12;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field5034 = null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-18"
	)
	public void method8913() {
		class157.method3326();
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "1150921474"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapRenderer.method5489(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); AbstractWorldMapData.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field5070.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field5070.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						AbstractWorldMapData.runScriptEvent(var14);
					}
				}

				this.field5070 = var11;
			}
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IIZZB)V",
		garbageValue = "93"
	)
	public void method8843(int var1, int var2, boolean var3, boolean var4) {
		long var5;
		label39: {
			var5 = VerticalAlignment.method3924();
			this.method8859(var1, var2, var4, var5);
			if (!this.hasTarget() && (var4 || var3)) {
				boolean var7 = Client.clickedWidget != null;
				if (!var7) {
					if (var4) {
						this.field5055 = var1;
						this.field5072 = var2;
						this.field5053 = this.centerTileX;
						this.field5054 = this.centerTileY;
					}

					if (this.field5053 != -1) {
						int var8 = var1 - this.field5055;
						int var9 = var2 - this.field5072;
						this.setWorldMapPosition(this.field5053 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field5054, false);
					}
					break label39;
				}
			}

			this.method8716();
		}

		if (var4) {
			this.field5057 = var5;
			this.field5058 = var1;
			this.field5059 = var2;
		}

	}

	@ObfuscatedName("an")
	void method8859(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				IndexCheck var8 = class522.method9126();
				if (class347.method6641() && var8.isValidIndexInRange(82) && var8.isValidIndexInRange(81)) {
					HealthBarDefinition.method3818(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
				} else {
					boolean var9 = true;
					if (this.field5021) {
						int var10 = var1 - this.field5058;
						int var11 = var2 - this.field5059;
						if (var4 - this.field5057 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
							var9 = false;
						}
					}

					if (var9) {
						PacketBufferNode var12 = FadeInTask.getPacketBufferNode(ClientPacket.field3216, Client.packetWriter.isaacCipher);
						var12.packetBuffer.writeIntIME(this.mouseCoord.packed());
						Client.packetWriter.addNode(var12);
						this.field5057 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1338389704"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (class135.field1621 != null) {
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

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-37"
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
			if (this.centerTileX == this.worldMapTargetX && this.centerTileY == this.worldMapTargetY) {
				this.worldMapTargetX = -1;
				this.worldMapTargetY = -1;
			}

		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "946707645"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		VerticalAlignment.method3924();
		if (var3) {
			this.method8716();
		}

	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1697597972"
	)
	final void method8716() {
		this.field5072 = -1;
		this.field5055 = -1;
		this.field5054 = -1;
		this.field5053 = -1;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1042578201"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lkf;",
		garbageValue = "-1242100761"
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

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "4"
	)
	public void method8719(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field5034 || var4) {
			this.field5034 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "91"
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
		descriptor = "(B)I",
		garbageValue = "-128"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)Lkf;",
		garbageValue = "968513950"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Lkf;I)V",
		garbageValue = "-1723206488"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMap(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Lkf;B)V",
		garbageValue = "15"
	)
	@Export("initializeWorldMap")
	void initializeWorldMap(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lkf;Lnn;Lnn;ZI)V",
		garbageValue = "-327410404"
	)
	public void method8750(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-256576246"
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
			this.field5068 = null;
			this.iconIterator = null;
			this.worldMapRenderer.clearIcons();
		}
	}

	@ObfuscatedName("av")
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
				this.worldMapRenderer.method5484(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			int var10 = class152.method3210(this.worldMapRenderer.method5492(), var6);
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
			this.worldMapRenderer.drawTiles(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
			if (!this.elementsDisabled) {
				boolean var13 = false;
				if (var5 - this.field5066 > 100) {
					this.field5066 = var5;
					var13 = true;
				}

				this.worldMapRenderer.drawElements(this.centerTileX - var11 / 2, this.centerTileY - var12 / 2, var11 / 2 + this.centerTileX, var12 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field5064, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var13);
			}

			this.method8730(var1, var2, var3, var4, var11, var12);
			if (class347.method6641() && this.showCoord && this.mouseCoord != null) {
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var11;
			this.worldMapDisplayHeight = var12;
			this.worldMapDisplayX = var1;
			this.worldMapDisplayY = var2;
			Rasterizer2D.Rasterizer2D_setClipArray(var8);
		}
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-87"
	)
	public void method8728() {
		WorldMapRegion.WorldMapRegion_cachedSprites.clear();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)Z",
		garbageValue = "-51"
	)
	boolean method8833(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field5077 != Client.field808) {
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

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-664606114"
	)
	void method8730(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class135.field1621 != null) {
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
			if (this.method8833(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
				class135.field1621.method7163(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field5077 = Client.field808;
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
				var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (1.0F == var10) {
				this.sprite.method9795(var13, var14, 192);
			} else {
				this.sprite.method9701(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
			}
		}

	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "-1677156033"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method5484(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			this.worldMapRenderer.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-16711936"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-84902061"
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

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "1373747173"
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

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "33510719"
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

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-34"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "702135416"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(IB)Lkf;",
		garbageValue = "-42"
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

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "534042384"
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
		garbageValue = "1820017280"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "28"
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

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "6"
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

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1650030456"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "306884247"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)Lnn;",
		garbageValue = "-191255511"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-78"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "758163537"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "116300273"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2095216786"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-39076550"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-606239666"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1930099249"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1115639681"
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
		descriptor = "(IB)V",
		garbageValue = "43"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < UserComparator1.WorldMapElement_count; ++var2) {
			if (WidgetDefinition.WorldMapElement_get(var2) != null && WidgetDefinition.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(WidgetDefinition.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1786919552"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("bm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1743867014"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-2006332486"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method8762();
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "219922923"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < UserComparator1.WorldMapElement_count; ++var3) {
			if (WidgetDefinition.WorldMapElement_get(var3) != null && WidgetDefinition.WorldMapElement_get(var3).category == var1) {
				int var4 = WidgetDefinition.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method8762();
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1546918429"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("cb")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "82"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("cj")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1979864599"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1506161499"
	)
	void method8762() {
		this.field5064.clear();
		this.field5064.addAll(this.enabledElements);
		this.field5064.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("cy")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1753284485"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapRenderer.method5489(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = WidgetDefinition.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							Interpreter.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(ILnn;I)Lnn;",
		garbageValue = "1297140528"
	)
	public Coord method8764(int var1, Coord var2) {
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

	@ObfuscatedName("cl")
	@ObfuscatedSignature(
		descriptor = "(IILnn;Lnn;I)V",
		garbageValue = "351358883"
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

		AbstractWorldMapData.runScriptEvent(var5);
	}

	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "(B)Llh;",
		garbageValue = "67"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapRenderer.buildIcons();
			this.field5068 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field5068.addAll(var3);
			}

			this.iconIterator = this.field5068.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Llh;",
		garbageValue = "7"
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

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;I)V",
		garbageValue = "-1312697689"
	)
	public static void method8917(AbstractArchive var0) {
		VarpDefinition.VarpDefinition_archive = var0;
		class183.field1945 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16);
	}
}
