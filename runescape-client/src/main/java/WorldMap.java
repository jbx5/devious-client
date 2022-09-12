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

@ObfuscatedName("pi")
@Implements("WorldMap")
public class WorldMap {
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("fontNameVerdana11")
	static final FontName fontNameVerdana11;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("fontNameVerdana13")
	static final FontName fontNameVerdana13;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lpc;"
	)
	@Export("fontNameVerdana15")
	static final FontName fontNameVerdana15;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("WorldMap_archive")
	AbstractArchive WorldMap_archive;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("WorldMap_geographyArchive")
	AbstractArchive WorldMap_geographyArchive;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Llv;"
	)
	@Export("WorldMap_groundArchive")
	AbstractArchive WorldMap_groundArchive;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	@Export("font")
	Font font;
	@ObfuscatedName("t")
	@Export("fonts")
	HashMap fonts;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "[Lqu;"
	)
	@Export("mapSceneSprites")
	IndexedSprite[] mapSceneSprites;
	@ObfuscatedName("d")
	@Export("details")
	HashMap details;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("mainMapArea")
	WorldMapArea mainMapArea;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	@Export("currentMapArea")
	WorldMapArea currentMapArea;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Lht;"
	)
	WorldMapArea field4580;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	@Export("worldMapManager")
	WorldMapManager worldMapManager;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("cacheLoader")
	WorldMapArchiveLoader cacheLoader;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 68694239
	)
	@Export("centerTileX")
	int centerTileX;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1419165157
	)
	@Export("centerTileY")
	int centerTileY;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -410210429
	)
	@Export("worldMapTargetX")
	int worldMapTargetX;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 369389635
	)
	@Export("worldMapTargetY")
	int worldMapTargetY;
	@ObfuscatedName("o")
	@Export("zoom")
	float zoom;
	@ObfuscatedName("as")
	@Export("zoomTarget")
	float zoomTarget;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 568989327
	)
	@Export("worldMapDisplayWidth")
	int worldMapDisplayWidth;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1531043597
	)
	@Export("worldMapDisplayHeight")
	int worldMapDisplayHeight;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1106560051
	)
	@Export("worldMapDisplayX")
	int worldMapDisplayX;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -359643491
	)
	@Export("worldMapDisplayY")
	int worldMapDisplayY;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -76032329
	)
	@Export("maxFlashCount")
	int maxFlashCount;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1612951865
	)
	@Export("cyclesPerFlash")
	int cyclesPerFlash;
	@ObfuscatedName("aa")
	@Export("perpetualFlash")
	boolean perpetualFlash;
	@ObfuscatedName("ak")
	@Export("flashingElements")
	HashSet flashingElements;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 781322351
	)
	@Export("flashCount")
	int flashCount;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -518679631
	)
	@Export("flashCycle")
	int flashCycle;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1707004961
	)
	int field4573;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -2037421265
	)
	int field4588;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1864789445
	)
	int field4589;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1811554311
	)
	int field4590;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -4479011461305463701L
	)
	long field4591;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -221329751
	)
	int field4592;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -64132303
	)
	int field4593;
	@ObfuscatedName("ae")
	boolean field4554;
	@ObfuscatedName("aw")
	@Export("enabledElements")
	HashSet enabledElements;
	@ObfuscatedName("ah")
	@Export("enabledCategories")
	HashSet enabledCategories;
	@ObfuscatedName("at")
	@Export("enabledElementIds")
	HashSet enabledElementIds;
	@ObfuscatedName("al")
	HashSet field4598;
	@ObfuscatedName("au")
	@Export("elementsDisabled")
	boolean elementsDisabled;
	@ObfuscatedName("bg")
	@ObfuscatedGetter(
		intValue = -696359513
	)
	int field4600;
	@ObfuscatedName("bc")
	@Export("menuOpcodes")
	final int[] menuOpcodes;
	@ObfuscatedName("bv")
	List field4602;
	@ObfuscatedName("bi")
	@Export("iconIterator")
	Iterator iconIterator;
	@ObfuscatedName("bj")
	HashSet field4562;
	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "Lkz;"
	)
	@Export("mouseCoord")
	Coord mouseCoord;
	@ObfuscatedName("bz")
	@Export("showCoord")
	public boolean showCoord;
	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "Lqi;"
	)
	@Export("sprite")
	SpritePixels sprite;
	@ObfuscatedName("br")
	@ObfuscatedGetter(
		intValue = 1586956591
	)
	@Export("cachedPixelsPerTile")
	int cachedPixelsPerTile;
	@ObfuscatedName("bp")
	@ObfuscatedGetter(
		intValue = 760582175
	)
	@Export("minCachedTileX")
	int minCachedTileX;
	@ObfuscatedName("bd")
	@ObfuscatedGetter(
		intValue = -1824736821
	)
	@Export("minCachedTileY")
	int minCachedTileY;
	@ObfuscatedName("bl")
	@ObfuscatedGetter(
		intValue = -143281829
	)
	int field4611;

	static {
		fontNameVerdana11 = FontName.FontName_verdana11; // L: 46
		fontNameVerdana13 = FontName.FontName_verdana13; // L: 47
		fontNameVerdana15 = FontName.FontName_verdana15; // L: 48
	}

	public WorldMap() {
		this.worldMapTargetX = -1; // L: 60
		this.worldMapTargetY = -1; // L: 61
		this.worldMapDisplayWidth = -1; // L: 64
		this.worldMapDisplayHeight = -1; // L: 65
		this.worldMapDisplayX = -1; // L: 66
		this.worldMapDisplayY = -1; // L: 67
		this.maxFlashCount = 3; // L: 68
		this.cyclesPerFlash = 50; // L: 69
		this.perpetualFlash = false; // L: 70
		this.flashingElements = null; // L: 71
		this.flashCount = -1; // L: 72
		this.flashCycle = -1; // L: 73
		this.field4573 = -1; // L: 74
		this.field4588 = -1; // L: 75
		this.field4589 = -1; // L: 76
		this.field4590 = -1; // L: 77
		this.field4554 = true; // L: 81
		this.enabledElements = new HashSet(); // L: 84
		this.enabledCategories = new HashSet(); // L: 85
		this.enabledElementIds = new HashSet(); // L: 86
		this.field4598 = new HashSet(); // L: 87
		this.elementsDisabled = false; // L: 88
		this.field4600 = 0; // L: 89
		this.menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012}; // L: 91
		this.field4562 = new HashSet(); // L: 94
		this.mouseCoord = null; // L: 95
		this.showCoord = false; // L: 96
		this.minCachedTileX = -1; // L: 99
		this.minCachedTileY = -1; // L: 100
		this.field4611 = -1; // L: 101
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Llv;Llv;Llv;Lmv;Ljava/util/HashMap;[Lqu;S)V",
		garbageValue = "24253"
	)
	@Export("init")
	public void init(AbstractArchive var1, AbstractArchive var2, AbstractArchive var3, Font var4, HashMap var5, IndexedSprite[] var6) {
		this.mapSceneSprites = var6; // L: 105
		this.WorldMap_archive = var1; // L: 106
		this.WorldMap_geographyArchive = var2; // L: 107
		this.WorldMap_groundArchive = var3; // L: 108
		this.font = var4; // L: 109
		this.fonts = new HashMap(); // L: 110
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_small, var5.get(fontNameVerdana11)); // L: 111
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_medium, var5.get(fontNameVerdana13)); // L: 112
		this.fonts.put(WorldMapLabelSize.WorldMapLabelSize_large, var5.get(fontNameVerdana15)); // L: 113
		this.cacheLoader = new WorldMapArchiveLoader(var1); // L: 114
		int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2896.name); // L: 115
		int[] var8 = this.WorldMap_archive.getGroupFileIds(var7); // L: 116
		this.details = new HashMap(var8.length); // L: 117

		for (int var9 = 0; var9 < var8.length; ++var9) { // L: 118
			Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9])); // L: 119
			WorldMapArea var11 = new WorldMapArea(); // L: 120
			var11.read(var10, var8[var9]); // L: 121
			this.details.put(var11.getInternalName(), var11); // L: 122
			if (var11.getIsMain()) { // L: 123
				this.mainMapArea = var11; // L: 124
			}
		}

		this.setCurrentMapArea(this.mainMapArea); // L: 127
		this.field4580 = null; // L: 128
	} // L: 129

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "21920242"
	)
	public void method7397() {
		WorldMapRegion.WorldMapRegion_cachedSprites.demote(5); // L: 133
	} // L: 135

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(IIZIIIIB)V",
		garbageValue = "-59"
	)
	@Export("onCycle")
	public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
		if (this.cacheLoader.isLoaded()) { // L: 138
			this.smoothZoom(); // L: 141
			this.scrollToTarget(); // L: 142
			if (var3) { // L: 143
				int var8 = (int)Math.ceil((double)((float)var6 / this.zoom)); // L: 146
				int var9 = (int)Math.ceil((double)((float)var7 / this.zoom)); // L: 147
				List var10 = this.worldMapManager.method4939(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2); // L: 148
				HashSet var11 = new HashSet(); // L: 149

				Iterator var12;
				AbstractWorldMapIcon var13;
				ScriptEvent var14;
				WorldMapEvent var15;
				for (var12 = var10.iterator(); var12.hasNext(); class348.runScriptEvent(var14)) { // L: 150 163
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 151
					var11.add(var13); // L: 153
					var14 = new ScriptEvent(); // L: 154
					var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 155
					var14.setArgs(new Object[]{var15, var1, var2}); // L: 156
					if (this.field4562.contains(var13)) { // L: 157
						var14.setType(17); // L: 158
					} else {
						var14.setType(15); // L: 161
					}
				}

				var12 = this.field4562.iterator(); // L: 166

				while (var12.hasNext()) {
					var13 = (AbstractWorldMapIcon)var12.next(); // L: 167
					if (!var11.contains(var13)) { // L: 169
						var14 = new ScriptEvent(); // L: 170
						var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2); // L: 171
						var14.setArgs(new Object[]{var15, var1, var2}); // L: 172
						var14.setType(16); // L: 173
						class348.runScriptEvent(var14); // L: 174
					}
				}

				this.field4562 = var11; // L: 178
			}
		}
	} // L: 139 144 179

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIZZI)V",
		garbageValue = "142385066"
	)
	public void method7391(int var1, int var2, boolean var3, boolean var4) {
		long var5 = Language.method6232(); // L: 182
		this.method7581(var1, var2, var4, var5); // L: 183
		if (!this.hasTarget() && (var4 || var3) && !ObjectComposition.method3812()) { // L: 184
			if (var4) { // L: 185
				this.field4589 = var1; // L: 186
				this.field4590 = var2; // L: 187
				this.field4573 = this.centerTileX; // L: 188
				this.field4588 = this.centerTileY; // L: 189
			}

			if (this.field4573 != -1) { // L: 191
				int var7 = var1 - this.field4589; // L: 192
				int var8 = var2 - this.field4590; // L: 193
				this.setWorldMapPosition(this.field4573 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4588, false); // L: 194
			}
		} else {
			this.method7396(); // L: 198
		}

		if (var4) { // L: 200
			this.field4591 = var5; // L: 201
			this.field4592 = var1; // L: 202
			this.field4593 = var2; // L: 203
		}

	} // L: 205

	@ObfuscatedName("k")
	void method7581(int var1, int var2, boolean var3, long var4) {
		if (this.currentMapArea != null) { // L: 208
			int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom); // L: 209
			int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom); // L: 210
			this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64); // L: 211
			if (this.mouseCoord != null && var3) { // L: 212
				if (Decimator.method1091() && KeyHandler.KeyHandler_pressedKeys[82] && KeyHandler.KeyHandler_pressedKeys[81]) { // L: 213
					AbstractWorldMapData.method5107(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false); // L: 214
				} else {
					boolean var8 = true; // L: 217
					if (this.field4554) { // L: 218
						int var9 = var1 - this.field4592; // L: 219
						int var10 = var2 - this.field4593; // L: 220
						if (var4 - this.field4591 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) { // L: 221
							var8 = false; // L: 222
						}
					}

					if (var8) { // L: 225
						PacketBufferNode var11 = class120.getPacketBufferNode(ClientPacket.field3014, Client.packetWriter.isaacCipher); // L: 226
						var11.packetBuffer.writeIntLE(this.mouseCoord.packed()); // L: 227
						Client.packetWriter.addNode(var11); // L: 228
						this.field4591 = 0L; // L: 229
					}
				}
			}
		} else {
			this.mouseCoord = null; // L: 234
		}

	} // L: 235

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "498507945"
	)
	@Export("smoothZoom")
	void smoothZoom() {
		if (Varcs.field1323 != null) { // L: 238
			this.zoom = this.zoomTarget; // L: 239
		} else {
			if (this.zoom < this.zoomTarget) { // L: 242
				this.zoom = Math.min(this.zoomTarget, this.zoom / 30.0F + this.zoom); // L: 243
			}

			if (this.zoom > this.zoomTarget) { // L: 245
				this.zoom = Math.max(this.zoomTarget, this.zoom - this.zoom / 30.0F); // L: 246
			}

		}
	} // L: 240 248

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "54"
	)
	@Export("scrollToTarget")
	void scrollToTarget() {
		if (this.hasTarget()) { // L: 251
			int var1 = this.worldMapTargetX - this.centerTileX; // L: 254
			int var2 = this.worldMapTargetY - this.centerTileY; // L: 255
			if (var1 != 0) { // L: 256
				var1 /= Math.min(8, Math.abs(var1)); // L: 257
			}

			if (var2 != 0) { // L: 259
				var2 /= Math.min(8, Math.abs(var2)); // L: 260
			}

			this.setWorldMapPosition(var1 + this.centerTileX, var2 + this.centerTileY, true); // L: 262
			if (this.worldMapTargetX == this.centerTileX && this.worldMapTargetY == this.centerTileY) { // L: 263
				this.worldMapTargetX = -1; // L: 264
				this.worldMapTargetY = -1; // L: 265
			}

		}
	} // L: 252 267

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1443810852"
	)
	@Export("setWorldMapPosition")
	final void setWorldMapPosition(int var1, int var2, boolean var3) {
		this.centerTileX = var1; // L: 270
		this.centerTileY = var2; // L: 271
		Language.method6232(); // L: 272
		if (var3) {
			this.method7396(); // L: 273
		}

	} // L: 274

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-31120"
	)
	final void method7396() {
		this.field4590 = -1; // L: 277
		this.field4589 = -1; // L: 278
		this.field4588 = -1; // L: 279
		this.field4573 = -1; // L: 280
	} // L: 281

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1542122376"
	)
	@Export("hasTarget")
	boolean hasTarget() {
		return this.worldMapTargetX != -1 && this.worldMapTargetY != -1; // L: 284
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Lht;",
		garbageValue = "19"
	)
	@Export("mapAreaAtCoord")
	public WorldMapArea mapAreaAtCoord(int var1, int var2, int var3) {
		Iterator var4 = this.details.values().iterator(); // L: 288

		WorldMapArea var5;
		do {
			if (!var4.hasNext()) { // L: 295
				return null; // L: 296
			}

			var5 = (WorldMapArea)var4.next(); // L: 289
		} while(!var5.containsCoord(var1, var2, var3)); // L: 291

		return var5; // L: 292
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "63"
	)
	public void method7508(int var1, int var2, int var3, boolean var4) {
		WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3); // L: 300
		if (var5 == null) { // L: 301
			if (!var4) { // L: 302
				return; // L: 305
			}

			var5 = this.mainMapArea; // L: 303
		}

		boolean var6 = false; // L: 307
		if (var5 != this.field4580 || var4) { // L: 308
			this.field4580 = var5; // L: 309
			this.setCurrentMapArea(var5); // L: 310
			var6 = true; // L: 311
		}

		if (var6 || var4) { // L: 313
			this.jump(var1, var2, var3); // L: 314
		}

	} // L: 316

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "623273749"
	)
	@Export("setCurrentMapAreaId")
	public void setCurrentMapAreaId(int var1) {
		WorldMapArea var2 = this.getMapArea(var1); // L: 319
		if (var2 != null) { // L: 320
			this.setCurrentMapArea(var2); // L: 321
		}

	} // L: 323

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1931414531"
	)
	@Export("currentMapAreaId")
	public int currentMapAreaId() {
		return this.currentMapArea == null ? -1 : this.currentMapArea.getId(); // L: 326 327 329
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(B)Lht;",
		garbageValue = "-92"
	)
	@Export("getCurrentMapArea")
	public WorldMapArea getCurrentMapArea() {
		return this.currentMapArea; // L: 333
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "-389451956"
	)
	@Export("setCurrentMapArea")
	void setCurrentMapArea(WorldMapArea var1) {
		if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 337
			this.initializeWorldMapManager(var1); // L: 340
			this.jump(-1, -1, -1); // L: 341
		}
	} // L: 338 342

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "-1693930875"
	)
	@Export("initializeWorldMapManager")
	void initializeWorldMapManager(WorldMapArea var1) {
		this.currentMapArea = var1; // L: 345
		this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive); // L: 346
		this.cacheLoader.reset(this.currentMapArea.getInternalName()); // L: 347
	} // L: 348

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Lht;Lkz;Lkz;ZI)V",
		garbageValue = "1385455626"
	)
	public void method7430(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
		if (var1 != null) { // L: 351
			if (this.currentMapArea == null || var1 != this.currentMapArea) { // L: 354
				this.initializeWorldMapManager(var1); // L: 355
			}

			if (!var4 && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) { // L: 357
				this.jump(var2.plane, var2.x, var2.y); // L: 361
			} else {
				this.jump(var3.plane, var3.x, var3.y); // L: 358
			}

		}
	} // L: 352 363

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "841147880"
	)
	@Export("jump")
	void jump(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 366
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 369
			if (var4 == null) { // L: 370
				var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY()); // L: 371
			}

			this.setWorldMapPosition(var4[0] - this.currentMapArea.getRegionLowX() * 64, var4[1] - this.currentMapArea.getRegionLowY() * 64, true); // L: 373
			this.worldMapTargetX = -1; // L: 374
			this.worldMapTargetY = -1; // L: 375
			this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom()); // L: 376
			this.zoomTarget = this.zoom; // L: 377
			this.field4602 = null; // L: 378
			this.iconIterator = null; // L: 379
			this.worldMapManager.clearIcons(); // L: 380
		}
	} // L: 367 381

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "378489984"
	)
	@Export("draw")
	public void draw(int var1, int var2, int var3, int var4, int var5) {
		int[] var6 = new int[4]; // L: 384
		Rasterizer2D.Rasterizer2D_getClipArray(var6); // L: 385
		Rasterizer2D.Rasterizer2D_setClip(var1, var2, var3 + var1, var2 + var4); // L: 386
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 387
		int var7 = this.cacheLoader.getPercentLoaded(); // L: 388
		if (var7 < 100) { // L: 389
			this.drawLoading(var1, var2, var3, var4, var7); // L: 390
		} else {
			if (!this.worldMapManager.isLoaded()) { // L: 393
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 394
				if (!this.worldMapManager.isLoaded()) { // L: 395
					return; // L: 396
				}
			}

			if (this.flashingElements != null) { // L: 399
				++this.flashCycle; // L: 400
				if (this.flashCycle % this.cyclesPerFlash == 0) { // L: 401
					this.flashCycle = 0; // L: 402
					++this.flashCount; // L: 403
				}

				if (this.flashCount >= this.maxFlashCount && !this.perpetualFlash) { // L: 405
					this.flashingElements = null; // L: 406
				}
			}

			int var8 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 409
			int var9 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 410
			this.worldMapManager.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4); // L: 411
			boolean var10;
			if (!this.elementsDisabled) { // L: 412
				var10 = false; // L: 413
				if (var5 - this.field4600 > 100) { // L: 414
					this.field4600 = var5; // L: 415
					var10 = true; // L: 416
				}

				this.worldMapManager.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4598, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10); // L: 418
			}

			this.method7409(var1, var2, var3, var4, var8, var9); // L: 420
			var10 = Client.staffModLevel >= 2; // L: 423
			if (var10 && this.showCoord && this.mouseCoord != null) { // L: 425
				this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
			}

			this.worldMapDisplayWidth = var8; // L: 426
			this.worldMapDisplayHeight = var9; // L: 427
			this.worldMapDisplayX = var1; // L: 428
			this.worldMapDisplayY = var2; // L: 429
			Rasterizer2D.Rasterizer2D_setClipArray(var6); // L: 430
		}
	} // L: 391 431

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)Z",
		garbageValue = "1080729700"
	)
	boolean method7416(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.sprite == null) { // L: 434
			return true;
		} else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) { // L: 435
			if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) { // L: 436
				return true;
			} else if (this.field4611 != Client.field782) { // L: 437
				return true;
			} else if (var3 <= 0 && var4 <= 0) { // L: 438
				return var3 + var1 < var5 || var2 + var4 < var6; // L: 439
			} else {
				return true; // L: 440
			}
		} else {
			return true;
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIB)V",
		garbageValue = "14"
	)
	void method7409(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (Varcs.field1323 != null) { // L: 444
			int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2); // L: 445
			int var8 = var3 + 512; // L: 446
			int var9 = var4 + 512; // L: 447
			float var10 = 1.0F; // L: 448
			var8 = (int)((float)var8 / var10); // L: 449
			var9 = (int)((float)var9 / var10); // L: 450
			int var11 = this.getDisplayX() - var5 / 2 - var7; // L: 451
			int var12 = this.getDisplayY() - var6 / 2 - var7; // L: 452
			int var13 = var1 - (var11 + var7 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 453
			int var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 454
			if (this.method7416(var8, var9, var13, var14, var3, var4)) { // L: 455
				if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) { // L: 456
					Arrays.fill(this.sprite.pixels, 0); // L: 459
				} else {
					this.sprite = new SpritePixels(var8, var9); // L: 457
				}

				this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7; // L: 460
				this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7; // L: 461
				this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile; // L: 462
				Varcs.field1323.method6203(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10); // L: 463
				this.field4611 = Client.field782; // L: 464
				var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapManager.pixelsPerTile; // L: 465
				var14 = var2 - this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)); // L: 466
			}

			Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128); // L: 468
			if (1.0F == var10) { // L: 469
				this.sprite.method8355(var13, var14, 192); // L: 470
			} else {
				this.sprite.method8358(var13, var14, (int)(var10 * (float)var8), (int)(var10 * (float)var9), 192); // L: 473
			}
		}

	} // L: 476

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "217440735"
	)
	@Export("drawOverview")
	public void drawOverview(int var1, int var2, int var3, int var4) {
		if (this.cacheLoader.isLoaded()) { // L: 479
			if (!this.worldMapManager.isLoaded()) { // L: 482
				this.worldMapManager.load(this.WorldMap_archive, this.currentMapArea.getInternalName(), Client.isMembersWorld); // L: 483
				if (!this.worldMapManager.isLoaded()) { // L: 484
					return; // L: 485
				}
			}

			this.worldMapManager.drawOverview(var1, var2, var3, var4, this.flashingElements, this.flashCycle, this.cyclesPerFlash); // L: 488
		}
	} // L: 480 489

	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1133620904"
	)
	@Export("setZoomPercentage")
	public void setZoomPercentage(int var1) {
		this.zoomTarget = this.getZoomFromPercentage(var1); // L: 492
	} // L: 493

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "-13"
	)
	@Export("drawLoading")
	void drawLoading(int var1, int var2, int var3, int var4, int var5) {
		byte var6 = 20; // L: 496
		int var7 = var3 / 2 + var1; // L: 497
		int var8 = var4 / 2 + var2 - 18 - var6; // L: 498
		Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216); // L: 499
		Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536); // L: 500
		Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536); // L: 501
		this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1); // L: 502
	} // L: 503

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "-2045800230"
	)
	@Export("getZoomFromPercentage")
	float getZoomFromPercentage(int var1) {
		if (var1 == 25) { // L: 506
			return 1.0F;
		} else if (var1 == 37) { // L: 507
			return 1.5F;
		} else if (var1 == 50) {
			return 2.0F; // L: 508
		} else if (var1 == 75) { // L: 509
			return 3.0F;
		} else {
			return var1 == 100 ? 4.0F : 8.0F; // L: 510 511
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1810656906"
	)
	@Export("getZoomLevel")
	public int getZoomLevel() {
		if (1.0D == (double)this.zoomTarget) { // L: 515
			return 25;
		} else if ((double)this.zoomTarget == 1.5D) { // L: 516
			return 37;
		} else if (2.0D == (double)this.zoomTarget) { // L: 517
			return 50;
		} else if ((double)this.zoomTarget == 3.0D) {
			return 75; // L: 518
		} else {
			return (double)this.zoomTarget == 4.0D ? 100 : 200; // L: 519 520
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-61"
	)
	@Export("loadCache")
	public void loadCache() {
		this.cacheLoader.load(); // L: 524
	} // L: 525

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "0"
	)
	@Export("isCacheLoaded")
	public boolean isCacheLoaded() {
		return this.cacheLoader.isLoaded(); // L: 528
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "-1930157510"
	)
	@Export("getMapArea")
	public WorldMapArea getMapArea(int var1) {
		Iterator var2 = this.details.values().iterator(); // L: 532

		WorldMapArea var3;
		do {
			if (!var2.hasNext()) {
				return null; // L: 540
			}

			var3 = (WorldMapArea)var2.next(); // L: 533
		} while(var3.getId() != var1); // L: 535

		return var3; // L: 536
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1911586846"
	)
	@Export("setWorldMapPositionTarget")
	public void setWorldMapPositionTarget(int var1, int var2) {
		if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) { // L: 544
			this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64; // L: 547
			this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64; // L: 548
		}
	} // L: 545 549

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-1882078618"
	)
	@Export("setWorldMapPositionTargetInstant")
	public void setWorldMapPositionTargetInstant(int var1, int var2) {
		if (this.currentMapArea != null) { // L: 552
			this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true); // L: 555
			this.worldMapTargetX = -1; // L: 556
			this.worldMapTargetY = -1; // L: 557
		}
	} // L: 553 558

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "760781012"
	)
	@Export("jumpToSourceCoord")
	public void jumpToSourceCoord(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 561
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 564
			if (var4 != null) { // L: 565
				this.setWorldMapPositionTarget(var4[0], var4[1]); // L: 566
			}

		}
	} // L: 562 568

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "187707388"
	)
	@Export("jumpToSourceCoordInstant")
	public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
		if (this.currentMapArea != null) { // L: 571
			int[] var4 = this.currentMapArea.position(var1, var2, var3); // L: 574
			if (var4 != null) { // L: 575
				this.setWorldMapPositionTargetInstant(var4[0], var4[1]); // L: 576
			}

		}
	} // L: 572 578

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2124107118"
	)
	@Export("getDisplayX")
	public int getDisplayX() {
		return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64; // L: 581 582 584
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1992503517"
	)
	@Export("getDisplayY")
	public int getDisplayY() {
		return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64; // L: 588 589 591
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)Lkz;",
		garbageValue = "-1219252778"
	)
	@Export("getDisplayCoord")
	public Coord getDisplayCoord() {
		return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY()); // L: 595 596 598
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1760851775"
	)
	@Export("getDisplayWith")
	public int getDisplayWith() {
		return this.worldMapDisplayWidth; // L: 602
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "123"
	)
	@Export("getDisplayHeight")
	public int getDisplayHeight() {
		return this.worldMapDisplayHeight; // L: 606
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "18"
	)
	@Export("setMaxFlashCount")
	public void setMaxFlashCount(int var1) {
		if (var1 >= 1) { // L: 610
			this.maxFlashCount = var1; // L: 611
		}

	} // L: 613

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "1"
	)
	@Export("resetMaxFlashCount")
	public void resetMaxFlashCount() {
		this.maxFlashCount = 3; // L: 616
	} // L: 617

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1625371301"
	)
	@Export("setCyclesPerFlash")
	public void setCyclesPerFlash(int var1) {
		if (var1 >= 1) { // L: 620
			this.cyclesPerFlash = var1; // L: 621
		}

	} // L: 623

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2142811412"
	)
	@Export("resetCyclesPerFlash")
	public void resetCyclesPerFlash() {
		this.cyclesPerFlash = 50; // L: 626
	} // L: 627

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-279245319"
	)
	@Export("setPerpetualFlash")
	public void setPerpetualFlash(boolean var1) {
		this.perpetualFlash = var1; // L: 630
	} // L: 631

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-225482768"
	)
	@Export("flashElement")
	public void flashElement(int var1) {
		this.flashingElements = new HashSet(); // L: 634
		this.flashingElements.add(var1); // L: 635
		this.flashCount = 0; // L: 636
		this.flashCycle = 0; // L: 637
	} // L: 638

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1178311727"
	)
	@Export("flashCategory")
	public void flashCategory(int var1) {
		this.flashingElements = new HashSet(); // L: 641
		this.flashCount = 0; // L: 642
		this.flashCycle = 0; // L: 643

		for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) { // L: 644
			if (class139.WorldMapElement_get(var2) != null && class139.WorldMapElement_get(var2).category == var1) { // L: 645 648
				this.flashingElements.add(class139.WorldMapElement_get(var2).objectId); // L: 649
			}
		}

	} // L: 652

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-10"
	)
	@Export("stopCurrentFlashes")
	public void stopCurrentFlashes() {
		this.flashingElements = null; // L: 655
	} // L: 656

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1570728051"
	)
	@Export("setElementsDisabled")
	public void setElementsDisabled(boolean var1) {
		this.elementsDisabled = !var1; // L: 659
	} // L: 660

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(IZI)V",
		garbageValue = "-471709044"
	)
	@Export("disableElement")
	public void disableElement(int var1, boolean var2) {
		if (!var2) { // L: 663
			this.enabledElements.add(var1); // L: 664
		} else {
			this.enabledElements.remove(var1); // L: 667
		}

		this.method7387(); // L: 669
	} // L: 670

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IZB)V",
		garbageValue = "90"
	)
	@Export("setCategoryDisabled")
	public void setCategoryDisabled(int var1, boolean var2) {
		if (!var2) { // L: 673
			this.enabledCategories.add(var1); // L: 674
		} else {
			this.enabledCategories.remove(var1); // L: 677
		}

		for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) { // L: 679
			if (class139.WorldMapElement_get(var3) != null && class139.WorldMapElement_get(var3).category == var1) { // L: 680 683
				int var4 = class139.WorldMapElement_get(var3).objectId; // L: 684
				if (!var2) { // L: 685
					this.enabledElementIds.add(var4); // L: 686
				} else {
					this.enabledElementIds.remove(var4); // L: 689
				}
			}
		}

		this.method7387(); // L: 693
	} // L: 694

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "326"
	)
	@Export("getElementsDisabled")
	public boolean getElementsDisabled() {
		return !this.elementsDisabled; // L: 697
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "38"
	)
	@Export("isElementDisabled")
	public boolean isElementDisabled(int var1) {
		return !this.enabledElements.contains(var1); // L: 701
	}

	@ObfuscatedName("bg")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1066756974"
	)
	@Export("isCategoryDisabled")
	public boolean isCategoryDisabled(int var1) {
		return !this.enabledCategories.contains(var1); // L: 705
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1126191304"
	)
	void method7387() {
		this.field4598.clear(); // L: 709
		this.field4598.addAll(this.enabledElements); // L: 710
		this.field4598.addAll(this.enabledElementIds); // L: 711
	} // L: 712

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)V",
		garbageValue = "958867388"
	)
	@Export("addElementMenuOptions")
	public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
		if (this.cacheLoader.isLoaded()) { // L: 715
			int var7 = (int)Math.ceil((double)((float)var3 / this.zoom)); // L: 718
			int var8 = (int)Math.ceil((double)((float)var4 / this.zoom)); // L: 719
			List var9 = this.worldMapManager.method4939(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6); // L: 720
			if (!var9.isEmpty()) { // L: 721
				Iterator var10 = var9.iterator();

				boolean var13;
				do {
					if (!var10.hasNext()) { // L: 724
						return; // L: 740
					}

					AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next(); // L: 725
					WorldMapElement var12 = class139.WorldMapElement_get(var11.getElement()); // L: 727
					var13 = false; // L: 728

					for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) { // L: 729
						if (var12.menuActions[var14] != null) { // L: 730
							class135.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed()); // L: 731
							var13 = true; // L: 732
						}
					}
				} while(!var13); // L: 735

			}
		}
	} // L: 716 722 736

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILkz;B)Lkz;",
		garbageValue = "20"
	)
	public Coord method7443(int var1, Coord var2) {
		if (!this.cacheLoader.isLoaded()) { // L: 743
			return null; // L: 744
		} else if (!this.worldMapManager.isLoaded()) { // L: 746
			return null; // L: 747
		} else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) { // L: 749
			return null; // L: 750
		} else {
			HashMap var3 = this.worldMapManager.buildIcons(); // L: 752
			List var4 = (List)var3.get(var1); // L: 753
			if (var4 != null && !var4.isEmpty()) { // L: 754
				AbstractWorldMapIcon var5 = null; // L: 757
				int var6 = -1; // L: 758
				Iterator var7 = var4.iterator(); // L: 759

				while (true) {
					AbstractWorldMapIcon var8;
					int var11;
					do {
						if (!var7.hasNext()) {
							return var5.coord2; // L: 774
						}

						var8 = (AbstractWorldMapIcon)var7.next(); // L: 760
						int var9 = var8.coord2.x - var2.x; // L: 762
						int var10 = var8.coord2.y - var2.y; // L: 763
						var11 = var9 * var9 + var10 * var10; // L: 764
						if (var11 == 0) { // L: 765
							return var8.coord2; // L: 766
						}
					} while(var11 >= var6 && var5 != null); // L: 768

					var5 = var8; // L: 769
					var6 = var11; // L: 770
				}
			} else {
				return null; // L: 755
			}
		}
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(IILkz;Lkz;B)V",
		garbageValue = "-52"
	)
	@Export("worldMapMenuAction")
	public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
		ScriptEvent var5 = new ScriptEvent(); // L: 778
		WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4); // L: 779
		var5.setArgs(new Object[]{var6}); // L: 780
		switch(var1) { // L: 781
		case 1008:
			var5.setType(10); // L: 794
			break; // L: 795
		case 1009:
			var5.setType(11); // L: 784
			break;
		case 1010:
			var5.setType(12); // L: 789
			break; // L: 790
		case 1011:
			var5.setType(13); // L: 804
			break;
		case 1012:
			var5.setType(14); // L: 799
		}

		class348.runScriptEvent(var5); // L: 808
	} // L: 809

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(I)Lib;",
		garbageValue = "-873579200"
	)
	@Export("iconStart")
	public AbstractWorldMapIcon iconStart() {
		if (!this.cacheLoader.isLoaded()) { // L: 812
			return null; // L: 813
		} else if (!this.worldMapManager.isLoaded()) { // L: 815
			return null; // L: 816
		} else {
			HashMap var1 = this.worldMapManager.buildIcons(); // L: 818
			this.field4602 = new LinkedList(); // L: 819
			Iterator var2 = var1.values().iterator(); // L: 820

			while (var2.hasNext()) {
				List var3 = (List)var2.next(); // L: 821
				this.field4602.addAll(var3); // L: 823
			}

			this.iconIterator = this.field4602.iterator(); // L: 826
			return this.iconNext(); // L: 827
		}
	}

	@ObfuscatedName("br")
	@ObfuscatedSignature(
		descriptor = "(I)Lib;",
		garbageValue = "1547095074"
	)
	@Export("iconNext")
	public AbstractWorldMapIcon iconNext() {
		if (this.iconIterator == null) { // L: 831
			return null; // L: 832
		} else {
			AbstractWorldMapIcon var1;
			do {
				if (!this.iconIterator.hasNext()) { // L: 834
					return null; // L: 840
				}

				var1 = (AbstractWorldMapIcon)this.iconIterator.next(); // L: 835
			} while(var1.getElement() == -1); // L: 836

			return var1; // L: 837
		}
	}
}
