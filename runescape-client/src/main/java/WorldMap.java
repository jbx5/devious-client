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

@ObfuscatedName("tn")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lth;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lol;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("as")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "[Lup;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("ak")
	@Export("details")
	HashMap details;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	WorldMapArea field4981;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ljf;"
	)
	@Export("worldMapRenderer")
	WorldMapRenderer worldMapRenderer;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lsl;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 989599695
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -1842715425
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 1462214999
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1451739569
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("af")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("be")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1409287467
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -814173773
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("bi")
	@ObfuscatedGetter(
		intValue = 1673613801
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("bv")
	@ObfuscatedGetter(
		intValue = -1846910385
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("bf")
	@ObfuscatedGetter(
		intValue = 228098407
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = 1322618821
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("ba")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("bm")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 229151135
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("bw")
	@ObfuscatedGetter(
		intValue = 2141545241
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("bj")
	@ObfuscatedGetter(
		intValue = 1677377671
	)
	int field4944;
	@ObfuscatedName("bn")
	@ObfuscatedGetter(
		intValue = -806246395
	)
	int field4959;
	@ObfuscatedName("bo")
	@ObfuscatedGetter(
		intValue = -430517989
	)
	int field4979;
	@ObfuscatedName("bt")
	@ObfuscatedGetter(
		intValue = 268881779
	)
	int field4962;
	@ObfuscatedName("bu")
	@ObfuscatedGetter(
		longValue = 4050134236144253029L
	)
	long field4963;
	@ObfuscatedName("by")
	@ObfuscatedGetter(
		intValue = -876124577
	)
	int field4939;
	@ObfuscatedName("bh")
	@ObfuscatedGetter(
		intValue = -2072001517
	)
	int field4965;
	@ObfuscatedName("bz")
	boolean field4968;
	@ObfuscatedName("bx")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("bb")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("bk")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("br")
	HashSet field4943;
	@ObfuscatedName("bq")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("cf")
	@ObfuscatedGetter(
		intValue = 469849587
	)
	int field4972;
	@ObfuscatedName("cv")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("cx")
	List field4974;
	@ObfuscatedName("cp")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("ce")
	HashSet field4976;
	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "Lmh;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("ct")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("cw")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("cq")
	@ObfuscatedGetter(
		intValue = 17964725
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("cl")
	@ObfuscatedGetter(
		intValue = 521051339
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("cs")
	@ObfuscatedGetter(
		intValue = -1143944953
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("co")
	@ObfuscatedGetter(
		intValue = -893341489
	)
	int field4983;

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
		this.field4944 = -1;
		this.field4959 = -1;
		this.field4979 = -1;
		this.field4962 = -1;
		this.field4968 = true;
		this.enabledElements = new HashSet();
		this.enabledCategories = new HashSet();
		this.enabledElementIds = new HashSet();
		this.field4943 = new HashSet();
		this.elementsDisabled = false;
		this.field4972 = 0;
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
		this.field4976 = new HashSet();
		this.mouseCoord = null;
		this.showCoord = false;
		this.minCachedTileX = -1;
		this.minCachedTileY = -1;
		this.field4983 = -1;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;Lol;Lpf;Ljava/util/HashMap;[Lup;I)V",
		garbageValue = "-686529494"
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
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2633.name);
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
		int var9 = var8 == null ? 0 : var8.length;
		this.details = new HashMap(var9);

		for (int var10 = 0; var10 < var9; ++var10) {
			Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10]));
			WorldMapArea var12 = new WorldMapArea();
			var12.method4547(var11, var8[var10], Client.revision >= 217);
			this.details.put(var12.getInternalName(), var12);
			if (var12.getIsMain()) {
				this.mainMapArea = var12;
			}
		}

		this.setCurrentMapArea(this.mainMapArea);
		this.field4981 = null;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1839563363"
	)
	public void method8713() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIII)V",
		garbageValue = "-1895076651"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) {
			this.smoothZoom();
			this.scrollToTarget();
			if (var3) {
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
				List var10 = this.worldMapRenderer.method4764(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
				HashSet var11 = new HashSet();

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class157.runScriptEvent(var14)) {
					var13 = (AbstractWorldMapIcon)var12.next();
					var11.add(var13);
					var14 = new ScriptEvent();
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
					var14.setArgs(new Object[]{var15, var1, var2});
					if (this.field4976.contains(var13)) {
						var14.setType(17);
					} else {
						var14.setType(15);
					}
				}

				var12 = this.field4976.iterator();

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next();
					if (!var11.contains(var13)) {
						var14 = new ScriptEvent();
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
						var14.setArgs(new Object[]{var15, var1, var2});
						var14.setType(16);
						class157.runScriptEvent(var14);
					}
				}

				this.field4976 = var11;
			}
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIZZS)V",
		garbageValue = "4180"
	)
	public void method8715(int var1, int var2, boolean var3, boolean var4) {
		long var5 = SpotAnimationDefinition.method3775();
		this.method8716(var1, var2, var4, var5);
		if (!this.hasTarget() && (var4 || var3) && !PacketBufferNode.method5925()) {
			if (var4) {
				this.field4979 = var1;
				this.field4962 = var2;
				this.field4944 = this.centerTileX;
				this.field4959 = this.centerTileY;
			}

			if (this.field4944 != -1) {
				int var7 = var1 - this.field4979;
				int var8 = var2 - this.field4962;
				this.setWorldMapPosition(this.field4944 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4959, false);
			}
		} else {
			this.method8834();
		}

		if (var4) {
			this.field4963 = var5;
			this.field4939 = var1;
			this.field4965 = var2;
		}

	}

	@ObfuscatedName("ab")
	void method8716(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) {
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
			if (this.mouseCoord != null && var3) {
				class223 var8 = Client.field724;
				boolean var10 = Client.staffModLevel >= 2;
				int var12;
				int var13;
				if (var10 && var8.method4316(82) && var8.method4316(81)) {
					int var16 = this.mouseCoord.x;
					var12 = this.mouseCoord.y;
					var13 = this.mouseCoord.plane;
					PacketBufferNode var14 = class113.getPacketBufferNode(ClientPacket.field3223, Client.packetWriter.isaacCipher);
					var14.packetBuffer.writeInt(0);
					var14.packetBuffer.writeShortAddLE(var16);
					var14.packetBuffer.writeShortAddLE(var12);
					var14.packetBuffer.writeByte(var13);
					Client.packetWriter.addNode(var14);
				} else {
					boolean var11 = true;
					if (this.field4968) {
						var12 = var1 - this.field4939;
						var13 = var2 - this.field4965;
						if (var4 - this.field4963 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
							var11 = false;
						}
					}

					if (var11) {
						PacketBufferNode var15 = class113.getPacketBufferNode(ClientPacket.field3138, Client.packetWriter.isaacCipher);
						var15.packetBuffer.writeIntLE(this.mouseCoord.packed());
						Client.packetWriter.addNode(var15);
						this.field4963 = 0L;
					}
				}
			}
		} else {
			this.mouseCoord = null;
		}

	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "217198758"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (MidiPcmStream.field3456 != null) {
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

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "84"
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

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "3"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1;
		this.centerTileY = var2;
		SpotAnimationDefinition.method3775();
		if (var3) {
			this.method8834();
		}

	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1741658330"
	)
	final void method8834() {
		this.field4962 = -1;
		this.field4979 = -1;
		this.field4959 = -1;
		this.field4944 = -1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-357792182"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIII)Ljv;",
		garbageValue = "-472972186"
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

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "-68"
	)
	public void method8723(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
		if (var5 == null) {
			if (!var4) {
				return;
			}

			var5 = this.mainMapArea;
		}

		boolean var6 = false;
		if (var5 != this.field4981 || var4) {
			this.field4981 = var5;
			this.setCurrentMapArea(var5);
			var6 = true;
		}

		if (var6 || var4) {
			this.jump(var1, var2, var3);
		}

	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "-16384"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1);
		if (var2 != null) {
			this.setCurrentMapArea(var2);
		}

	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-370898847"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)Ljv;",
		garbageValue = "2772"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Ljv;I)V",
		garbageValue = "724172563"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) {
			this.initializeWorldMap(var1);
			this.jump(-1, -1, -1);
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljv;B)V",
		garbageValue = "6"
	)
	@Export("initializeWorldMap")
	void initializeWorldMap(WorldMapArea var1) {
		this.currentMapArea = var1;
		this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
		this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Ljv;Lmh;Lmh;ZB)V",
		garbageValue = "62"
	)
	public void method8794(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "0"
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
			this.field4974 = null;
			this.iconIterator = null;
			this.worldMapRenderer.clearIcons();
		}
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "24"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4];
		Rasterizer2D.Rasterizer2D_getClipArray(var6);
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4);
		int var7 = this.cacheLoader.getPercentLoaded();
		if (var7 < 100) {
			this.drawLoading(var1, var2, var3, var4, var7);
		} else {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method4733(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld, Client.revision >= 217);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, this.worldMapRenderer.method4741());
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
				if (var5 - this.field4972 > 100) {
					this.field4972 = var5;
					var10 = true;
				}

				this.worldMapRenderer.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4943, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
			}

			this.method8733(var1, var2, var3, var4, var8, var9);
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "-2129366613"
	)
	boolean method8750(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) {
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
			if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
				return true;
			} else if (this.field4983 != Client.field783) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "1396727376"
	)
	void method8733(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (MidiPcmStream.field3456 != null) {
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
			if (this.method8750(var8, var9, var13, var14, var3, var4)) {
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
					Arrays.fill(this.sprite.pixels, 0);
				} else {
					this.sprite = new SpritePixels(var8, var9);
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
				this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
				MidiPcmStream.field3456.method7160(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
				this.field4983 = Client.field783;
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
				var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
			if (1.0F == var10) {
				this.sprite.method9850(var13, var14, 192);
			} else {
				this.sprite.method9761(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "51"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) {
			if (!this.worldMapRenderer.isLoaded()) {
				this.worldMapRenderer.method4733(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld, Client.revision >= 217);
				if (!this.worldMapRenderer.isLoaded()) {
					return;
				}
			}

			this.worldMapRenderer.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash);
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "0"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1);
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-699862709"
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

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IB)F",
		garbageValue = "31"
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

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1066219424"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if ((double)this.zoomTarget == 1.0D) {
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) {
			return 37;
		} else if (2.0D == (double)this.zoomTarget) {
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75;
		} else {
			return 4.0D == (double)this.zoomTarget ? 100 : 200;
		}
	}

	@ObfuscatedName("bd")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "123"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load();
	}

	@ObfuscatedName("bl")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "369984889"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded();
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(II)Ljv;",
		garbageValue = "1808256615"
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

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-678637606"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
		}
	}

	@ObfuscatedName("bf")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1573739056"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) {
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
			this.worldMapTargetX = -1;
			this.worldMapTargetY = -1;
		}
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-13928817"
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
		descriptor = "(IIII)V",
		garbageValue = "996468240"
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
		descriptor = "(B)I",
		garbageValue = "-43"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-853833323"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(B)Lmh;",
		garbageValue = "0"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "537116922"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1296388714"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight;
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-857515700"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) {
			this.maxFlashCount = var1;
		}

	}

	@ObfuscatedName("bt")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1866064784"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3;
	}

	@ObfuscatedName("bu")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "-90"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) {
			this.cyclesPerFlash = var1;
		}

	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1119701020"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50;
	}

	@ObfuscatedName("bh")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1336488312"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "41"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet();
		this.flashingElements.add(var1);
		this.flashCount = 0;
		this.flashCycle = 0;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1850840845"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet();
		this.flashCount = 0;
		this.flashCycle = 0;

		for (int var2 = 0; var2 < class137.WorldMapElement_count; ++var2) {
			if (class141.WorldMapElement_get(var2) != null && class141.WorldMapElement_get(var2).category == var1) {
				this.flashingElements.add(class141.WorldMapElement_get(var2).objectId);
			}
		}

	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1649001731"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "0"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "125"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) {
			this.enabledElements.add(var1);
		} else {
			this.enabledElements.remove(var1);
		}

		this.method8900();
	}

	@ObfuscatedName("bk")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "1569784149"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) {
			this.enabledCategories.add(var1);
		} else {
			this.enabledCategories.remove(var1);
		}

		for (int var3 = 0; var3 < class137.WorldMapElement_count; ++var3) {
			if (class141.WorldMapElement_get(var3) != null && class141.WorldMapElement_get(var3).category == var1) {
				int var4 = class141.WorldMapElement_get(var3).objectId;
				if (!var2) {
					this.enabledElementIds.add(var4);
				} else {
					this.enabledElementIds.remove(var4);
				}
			}
		}

		this.method8900();
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "41"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "2012466674"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1);
	}

	@ObfuscatedName("cf")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1791520679"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1);
	}

	@ObfuscatedName("cg")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "96"
	)
	void method8900() {
		this.field4943.clear();
		this.field4943.addAll(this.enabledElements);
		this.field4943.addAll(this.enabledElementIds);
	}

	@ObfuscatedName("cv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "-1420454539"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) {
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
			List var9 = this.worldMapRenderer.method4764(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
			if (!var9.isEmpty()) {
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) {
						return;
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
					WorldMapElement var12 = class141.WorldMapElement_get(var11.getElement());
					var13 = false;

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
						if (var12.menuActions[var14] != null) {
							WorldMapSectionType.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
							var13 = true;
						}
					}
				} while(!var13);

			}
		}
	}

	@ObfuscatedName("cx")
	@ObfuscatedSignature(
		descriptor = "(ILmh;I)Lmh;",
		garbageValue = "1628169243"
	)
	public Coord method8766(int var1, Coord var2) {
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

	@ObfuscatedName("cp")
	@ObfuscatedSignature(
		descriptor = "(IILmh;Lmh;B)V",
		garbageValue = "84"
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

		class157.runScriptEvent(var5);
	}

	@ObfuscatedName("ce")
	@ObfuscatedSignature(
		descriptor = "(B)Ljc;",
		garbageValue = "-80"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) {
			return null;
		} else if (!this.worldMapRenderer.isLoaded()) {
			return null;
		} else {
			HashMap var1 = this.worldMapRenderer.buildIcons();
			this.field4974 = new LinkedList();
			Iterator var2 = var1.values().iterator();

			while (var2.hasNext()) {
				List var3 = (List)var2.next();
				this.field4974.addAll(var3);
			}

			this.iconIterator = this.field4974.iterator();
			return this.iconNext();
		}
	}

	@ObfuscatedName("ci")
	@ObfuscatedSignature(
		descriptor = "(B)Ljc;",
		garbageValue = "94"
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

	@ObfuscatedName("it")
	@ObfuscatedSignature(
		descriptor = "(Ldf;I)V",
		garbageValue = "-921124497"
	)
	static final void method8922(Actor var0) {
		int var2;
		int var3;
		int var4;
		if (var0.targetIndex != -1) {
			Object var1 = null;
			var2 = 65536;
			if (var0.targetIndex < var2) {
				var1 = Client.npcs[var0.targetIndex];
			} else {
				var1 = Client.players[var0.targetIndex - var2];
			}

			if (var1 != null) {
				var3 = var0.x - ((Actor)var1).x;
				var4 = var0.y - ((Actor)var1).y;
				if (var3 != 0 || var4 != 0) {
					var0.orientation = SequenceDefinition.method4094(var3, var4);
				}
			} else if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}
		}

		int var7;
		if (var0.pathLength == 0 || var0.field1245 > 0) {
			var7 = -1;
			if (var0.field1178 != -1 && var0.field1210 != -1) {
				var2 = var0.field1178 * 128 - NpcOverrides.baseX * 8192 + 64;
				var3 = var0.field1210 * 128 - class101.baseY * 8192 + 64;
				var4 = var0.x - var2;
				int var5 = var0.y - var3;
				if (var4 != 0 || var5 != 0) {
					var7 = SequenceDefinition.method4094(var4, var5);
				}
			} else if (var0.field1208 != -1) {
				var7 = var0.field1208;
			}

			if (var7 != -1) {
				var0.orientation = var7;
				if (var0.field1211) {
					var0.rotation = var0.orientation;
				}
			}

			var0.method2480();
		}

		var7 = var0.orientation - var0.rotation & 2047;
		if (var7 != 0) {
			boolean var8 = true;
			boolean var9 = true;
			++var0.field1192;
			var4 = var7 > 1024 ? -1 : 1;
			var0.rotation += var0.field1240 * var4;
			boolean var10 = true;
			if (var7 < var0.field1240 || var7 > 2048 - var0.field1240) {
				var0.rotation = var0.orientation;
				var10 = false;
			}

			if (var0.field1240 > 0 && var0.movementSequence == var0.idleSequence && (var0.field1192 > 25 || var10)) {
				if (var4 == -1 && var0.turnLeftSequence != -1) {
					var0.movementSequence = var0.turnLeftSequence;
				} else if (var4 == 1 && var0.turnRightSequence != -1) {
					var0.movementSequence = var0.turnRightSequence;
				} else {
					var0.movementSequence = var0.walkSequence;
				}
			}

			var0.rotation &= 2047;
		} else {
			if (var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			var0.field1192 = 0;
		}

	}
}
