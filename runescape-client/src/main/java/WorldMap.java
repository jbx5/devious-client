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
@ObfuscatedName("or")
@Implements("WorldMap")
public class WorldMap {
    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "Lox;")
    @Export("fontNameVerdana11")
    static final FontName fontNameVerdana11;

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "Lox;")
    @Export("fontNameVerdana13")
    static final FontName fontNameVerdana13;

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "Lox;")
    @Export("fontNameVerdana15")
    static final FontName fontNameVerdana15;

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("WorldMap_archive")
    AbstractArchive WorldMap_archive;

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("WorldMap_geographyArchive")
    AbstractArchive WorldMap_geographyArchive;

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "Lkq;")
    @Export("WorldMap_groundArchive")
    AbstractArchive WorldMap_groundArchive;

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "Llv;")
    @Export("font")
    Font font;

    @ObfuscatedName("q")
    @Export("fonts")
    HashMap fonts;

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "[Lpg;")
    @Export("mapSceneSprites")
    IndexedSprite[] mapSceneSprites;

    @ObfuscatedName("p")
    @Export("details")
    HashMap details;

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "Lhm;")
    @Export("mainMapArea")
    WorldMapArea mainMapArea;

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "Lhm;")
    @Export("currentMapArea")
    WorldMapArea currentMapArea;

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "Lhm;")
    WorldMapArea field4370;

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "Lhr;")
    @Export("worldMapManager")
    WorldMapManager worldMapManager;

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "Log;")
    @Export("cacheLoader")
    WorldMapArchiveLoader cacheLoader;

    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 828442357)
    @Export("centerTileX")
    int centerTileX;

    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 276879255)
    @Export("centerTileY")
    int centerTileY;

    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -611114811)
    @Export("worldMapTargetX")
    int worldMapTargetX;

    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = 584594883)
    @Export("worldMapTargetY")
    int worldMapTargetY;

    @ObfuscatedName("z")
    @Export("zoom")
    float zoom;

    @ObfuscatedName("ap")
    @Export("zoomTarget")
    float zoomTarget;

    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = -663140989)
    @Export("worldMapDisplayWidth")
    int worldMapDisplayWidth;

    @ObfuscatedName("ak")
    @ObfuscatedGetter(intValue = 516307323)
    @Export("worldMapDisplayHeight")
    int worldMapDisplayHeight;

    @ObfuscatedName("av")
    @ObfuscatedGetter(intValue = 1351720747)
    @Export("worldMapDisplayX")
    int worldMapDisplayX;

    @ObfuscatedName("ar")
    @ObfuscatedGetter(intValue = 1591613441)
    @Export("worldMapDisplayY")
    int worldMapDisplayY;

    @ObfuscatedName("al")
    @ObfuscatedGetter(intValue = 61796873)
    @Export("maxFlashCount")
    int maxFlashCount;

    @ObfuscatedName("aa")
    @ObfuscatedGetter(intValue = 462292081)
    @Export("cyclesPerFlash")
    int cyclesPerFlash;

    @ObfuscatedName("ao")
    @Export("perpetualFlash")
    boolean perpetualFlash;

    @ObfuscatedName("aq")
    @Export("flashingElements")
    HashSet flashingElements;

    @ObfuscatedName("ay")
    @ObfuscatedGetter(intValue = -1027047633)
    @Export("flashCount")
    int flashCount;

    @ObfuscatedName("ac")
    @ObfuscatedGetter(intValue = -1114852755)
    @Export("flashCycle")
    int flashCycle;

    @ObfuscatedName("ab")
    @ObfuscatedGetter(intValue = 630993585)
    int field4372;

    @ObfuscatedName("as")
    @ObfuscatedGetter(intValue = 1004708149)
    int field4388;

    @ObfuscatedName("ag")
    @ObfuscatedGetter(intValue = 526251255)
    int field4389;

    @ObfuscatedName("az")
    @ObfuscatedGetter(intValue = 961516579)
    int field4390;

    @ObfuscatedName("ad")
    @ObfuscatedGetter(longValue = -6089520608796467439L)
    long field4391;

    @ObfuscatedName("au")
    @ObfuscatedGetter(intValue = 443689527)
    int field4392;

    @ObfuscatedName("at")
    @ObfuscatedGetter(intValue = 1213349115)
    int field4393;

    @ObfuscatedName("ae")
    boolean field4367;

    @ObfuscatedName("aj")
    @Export("enabledElements")
    HashSet enabledElements;

    @ObfuscatedName("ax")
    @Export("enabledCategories")
    HashSet enabledCategories;

    @ObfuscatedName("ah")
    @Export("enabledElementIds")
    HashSet enabledElementIds;

    @ObfuscatedName("ai")
    HashSet field4398;

    @ObfuscatedName("am")
    @Export("elementsDisabled")
    boolean elementsDisabled;

    @ObfuscatedName("be")
    @ObfuscatedGetter(intValue = 619725823)
    int field4396;

    @ObfuscatedName("bn")
    @Export("menuOpcodes")
    final int[] menuOpcodes;

    @ObfuscatedName("bz")
    List field4402;

    @ObfuscatedName("bx")
    @Export("iconIterator")
    Iterator iconIterator;

    @ObfuscatedName("bd")
    HashSet field4404;

    @ObfuscatedName("bg")
    @ObfuscatedSignature(descriptor = "Ljd;")
    @Export("mouseCoord")
    Coord mouseCoord;

    @ObfuscatedName("bm")
    @Export("showCoord")
    public boolean showCoord;

    @ObfuscatedName("bi")
    @ObfuscatedSignature(descriptor = "Lpt;")
    @Export("sprite")
    SpritePixels sprite;

    @ObfuscatedName("bw")
    @ObfuscatedGetter(intValue = -1913692445)
    @Export("cachedPixelsPerTile")
    int cachedPixelsPerTile;

    @ObfuscatedName("bu")
    @ObfuscatedGetter(intValue = -1836719439)
    @Export("minCachedTileX")
    int minCachedTileX;

    @ObfuscatedName("bs")
    @ObfuscatedGetter(intValue = -640589691)
    @Export("minCachedTileY")
    int minCachedTileY;

    @ObfuscatedName("bb")
    @ObfuscatedGetter(intValue = -243604363)
    int field4411;

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
        this.field4372 = -1;
        this.field4388 = -1;
        this.field4389 = -1;
        this.field4390 = -1;
        this.field4367 = true;
        this.enabledElements = new HashSet();
        this.enabledCategories = new HashSet();
        this.enabledElementIds = new HashSet();
        this.field4398 = new HashSet();
        this.elementsDisabled = false;
        this.field4396 = 0;
        this.menuOpcodes = new int[]{ 1008, 1009, 1010, 1011, 1012 };
        this.field4404 = new HashSet();
        this.mouseCoord = null;
        this.showCoord = false;
        this.minCachedTileX = -1;
        this.minCachedTileY = -1;
        this.field4411 = -1;
    }

    @ObfuscatedName("c")
    @ObfuscatedSignature(descriptor = "(Lkq;Lkq;Lkq;Llv;Ljava/util/HashMap;[Lpg;B)V", garbageValue = "19")
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
        int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field2793.name);
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
        this.field4370 = null;
    }

    @ObfuscatedName("l")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1693187068")
    public void method6884() {
        ModelData0.method4272();
    }

    @ObfuscatedName("s")
    @ObfuscatedSignature(descriptor = "(IIZIIIIB)V", garbageValue = "-16")
    @Export("onCycle")
    public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
        if (this.cacheLoader.isLoaded()) {
            this.smoothZoom();
            this.scrollToTarget();
            if (var3) {
                int var8 = ((int) (Math.ceil(((double) (((float) (var6)) / this.zoom)))));
                int var9 = ((int) (Math.ceil(((double) (((float) (var7)) / this.zoom)))));
                List var10 = this.worldMapManager.method4586((this.centerTileX - (var8 / 2)) - 1, (this.centerTileY - (var9 / 2)) - 1, ((var8 / 2) + this.centerTileX) + 1, ((var9 / 2) + this.centerTileY) + 1, var4, var5, var6, var7, var1, var2);
                HashSet var11 = new HashSet();
                Iterator var12;
                AbstractWorldMapIcon var13;
                ScriptEvent var14;
                WorldMapEvent var15;
                for (var12 = var10.iterator(); var12.hasNext(); class92.runScriptEvent(var14)) {
                    var13 = ((AbstractWorldMapIcon) (var12.next()));
                    var11.add(var13);
                    var14 = new ScriptEvent();
                    var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
                    var14.setArgs(new Object[]{ var15, var1, var2 });
                    if (this.field4404.contains(var13)) {
                        var14.setType(17);
                    } else {
                        var14.setType(15);
                    }
                }
                var12 = this.field4404.iterator();
                while (var12.hasNext()) {
                    var13 = ((AbstractWorldMapIcon) (var12.next()));
                    if (!var11.contains(var13)) {
                        var14 = new ScriptEvent();
                        var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
                        var14.setArgs(new Object[]{ var15, var1, var2 });
                        var14.setType(16);
                        class92.runScriptEvent(var14);
                    }
                } 
                this.field4404 = var11;
            }
        }
    }

    @ObfuscatedName("e")
    @ObfuscatedSignature(descriptor = "(IIZZI)V", garbageValue = "-873462170")
    public void method6886(int var1, int var2, boolean var3, boolean var4) {
        long var5 = DirectByteArrayCopier.getServerTime();
        this.method7035(var1, var2, var4, var5);
        if (this.hasTarget() || ((!var4) && (!var3))) {
            this.method7043();
        } else {
            if (var4) {
                this.field4389 = var1;
                this.field4390 = var2;
                this.field4372 = this.centerTileX;
                this.field4388 = this.centerTileY;
            }
            if (this.field4372 != (-1)) {
                int var7 = var1 - this.field4389;
                int var8 = var2 - this.field4390;
                this.setWorldMapPosition(this.field4372 - ((int) (((float) (var7)) / this.zoomTarget)), ((int) (((float) (var8)) / this.zoomTarget)) + this.field4388, false);
            }
        }
        if (var4) {
            this.field4391 = var5;
            this.field4392 = var1;
            this.field4393 = var2;
        }
    }

    @ObfuscatedName("r")
    void method7035(int var1, int var2, boolean var3, long var4) {
        if (this.currentMapArea != null) {
            int var6 = ((int) (((float) (this.centerTileX)) + ((((float) (var1 - this.worldMapDisplayX)) - ((((float) (this.getDisplayWith())) * this.zoom) / 2.0F)) / this.zoom)));
            int var7 = ((int) (((float) (this.centerTileY)) - ((((float) (var2 - this.worldMapDisplayY)) - ((((float) (this.getDisplayHeight())) * this.zoom) / 2.0F)) / this.zoom)));
            this.mouseCoord = this.currentMapArea.coord(var6 + (this.currentMapArea.getRegionLowX() * 64), var7 + (this.currentMapArea.getRegionLowY() * 64));
            if ((this.mouseCoord != null) && var3) {
                if ((class133.method2807() && KeyHandler.KeyHandler_pressedKeys[82]) && KeyHandler.KeyHandler_pressedKeys[81]) {
                    DevicePcmPlayerProvider.method361(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
                } else {
                    boolean var8 = true;
                    if (this.field4367) {
                        int var9 = var1 - this.field4392;
                        int var10 = var2 - this.field4393;
                        if ((((((var4 - this.field4391) > 500L) || (var9 < (-25))) || (var9 > 25)) || (var10 < (-25))) || (var10 > 25)) {
                            var8 = false;
                        }
                    }
                    if (var8) {
                        PacketBufferNode var11 = class135.getPacketBufferNode(ClientPacket.field2846, Client.packetWriter.isaacCipher);
                        var11.packetBuffer.writeIntIME(this.mouseCoord.packed());
                        Client.packetWriter.addNode(var11);
                        this.field4391 = 0L;
                    }
                }
            }
        } else {
            this.mouseCoord = null;
        }
    }

    @ObfuscatedName("o")
    @ObfuscatedSignature(descriptor = "(S)V", garbageValue = "28855")
    @Export("smoothZoom")
    void smoothZoom() {
        if (class9.field58 != null) {
            this.zoom = this.zoomTarget;
        } else {
            if (this.zoom < this.zoomTarget) {
                this.zoom = Math.min(this.zoomTarget, this.zoom + (this.zoom / 30.0F));
            }
            if (this.zoom > this.zoomTarget) {
                this.zoom = Math.max(this.zoomTarget, this.zoom - (this.zoom / 30.0F));
            }
        }
    }

    @ObfuscatedName("i")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1829009098")
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
            if ((this.worldMapTargetX == this.centerTileX) && (this.worldMapTargetY == this.centerTileY)) {
                this.worldMapTargetX = -1;
                this.worldMapTargetY = -1;
            }
        }
    }

    @ObfuscatedName("w")
    @ObfuscatedSignature(descriptor = "(IIZI)V", garbageValue = "1235301857")
    @Export("setWorldMapPosition")
    final void setWorldMapPosition(int var1, int var2, boolean var3) {
        this.centerTileX = var1;
        this.centerTileY = var2;
        DirectByteArrayCopier.getServerTime();
        if (var3) {
            this.method7043();
        }
    }

    @ObfuscatedName("v")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-71008000")
    final void method7043() {
        this.field4390 = -1;
        this.field4389 = -1;
        this.field4388 = -1;
        this.field4372 = -1;
    }

    @ObfuscatedName("a")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "1567829287")
    @Export("hasTarget")
    boolean hasTarget() {
        return (this.worldMapTargetX != (-1)) && (this.worldMapTargetY != (-1));
    }

    @ObfuscatedName("y")
    @ObfuscatedSignature(descriptor = "(IIII)Lhm;", garbageValue = "1984428473")
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

    @ObfuscatedName("u")
    @ObfuscatedSignature(descriptor = "(IIIZI)V", garbageValue = "405963954")
    public void method6894(int var1, int var2, int var3, boolean var4) {
        WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
        if (var5 == null) {
            if (!var4) {
                return;
            }
            var5 = this.mainMapArea;
        }
        boolean var6 = false;
        if ((var5 != this.field4370) || var4) {
            this.field4370 = var5;
            this.setCurrentMapArea(var5);
            var6 = true;
        }
        if (var6 || var4) {
            this.jump(var1, var2, var3);
        }
    }

    @ObfuscatedName("h")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1895553360")
    @Export("setCurrentMapAreaId")
    public void setCurrentMapAreaId(int var1) {
        WorldMapArea var2 = this.getMapArea(var1);
        if (var2 != null) {
            this.setCurrentMapArea(var2);
        }
    }

    @ObfuscatedName("q")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-1947574264")
    @Export("currentMapAreaId")
    public int currentMapAreaId() {
        return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
    }

    @ObfuscatedName("x")
    @ObfuscatedSignature(descriptor = "(B)Lhm;", garbageValue = "101")
    @Export("getCurrentMapArea")
    public WorldMapArea getCurrentMapArea() {
        return this.currentMapArea;
    }

    @ObfuscatedName("p")
    @ObfuscatedSignature(descriptor = "(Lhm;I)V", garbageValue = "586454693")
    @Export("setCurrentMapArea")
    void setCurrentMapArea(WorldMapArea var1) {
        if ((this.currentMapArea == null) || (var1 != this.currentMapArea)) {
            this.initializeWorldMapManager(var1);
            this.jump(-1, -1, -1);
        }
    }

    @ObfuscatedName("n")
    @ObfuscatedSignature(descriptor = "(Lhm;I)V", garbageValue = "-1195294003")
    @Export("initializeWorldMapManager")
    void initializeWorldMapManager(WorldMapArea var1) {
        this.currentMapArea = var1;
        this.worldMapManager = new WorldMapManager(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
        this.cacheLoader.reset(this.currentMapArea.getInternalName());
    }

    @ObfuscatedName("m")
    @ObfuscatedSignature(descriptor = "(Lhm;Ljd;Ljd;ZB)V", garbageValue = "-17")
    public void method7006(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
        if (var1 != null) {
            if ((this.currentMapArea == null) || (var1 != this.currentMapArea)) {
                this.initializeWorldMapManager(var1);
            }
            if ((!var4) && this.currentMapArea.containsCoord(var2.plane, var2.x, var2.y)) {
                this.jump(var2.plane, var2.x, var2.y);
            } else {
                this.jump(var3.plane, var3.x, var3.y);
            }
        }
    }

    @ObfuscatedName("d")
    @ObfuscatedSignature(descriptor = "(IIII)V", garbageValue = "-1267591914")
    @Export("jump")
    void jump(int var1, int var2, int var3) {
        if (this.currentMapArea != null) {
            int[] var4 = this.currentMapArea.position(var1, var2, var3);
            if (var4 == null) {
                var4 = this.currentMapArea.position(this.currentMapArea.getOriginPlane(), this.currentMapArea.getOriginX(), this.currentMapArea.getOriginY());
            }
            this.setWorldMapPosition(var4[0] - (this.currentMapArea.getRegionLowX() * 64), var4[1] - (this.currentMapArea.getRegionLowY() * 64), true);
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
            this.zoom = this.getZoomFromPercentage(this.currentMapArea.getZoom());
            this.zoomTarget = this.zoom;
            this.field4402 = null;
            this.iconIterator = null;
            this.worldMapManager.clearIcons();
        }
    }

    @ObfuscatedName("j")
    @ObfuscatedSignature(descriptor = "(IIIIII)V", garbageValue = "577207508")
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
                if ((this.flashCycle % this.cyclesPerFlash) == 0) {
                    this.flashCycle = 0;
                    ++this.flashCount;
                }
                if ((this.flashCount >= this.maxFlashCount) && (!this.perpetualFlash)) {
                    this.flashingElements = null;
                }
            }
            int var8 = ((int) (Math.ceil(((double) (((float) (var3)) / this.zoom)))));
            int var9 = ((int) (Math.ceil(((double) (((float) (var4)) / this.zoom)))));
            this.worldMapManager.drawTiles(this.centerTileX - (var8 / 2), this.centerTileY - (var9 / 2), (var8 / 2) + this.centerTileX, (var9 / 2) + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
            if (!this.elementsDisabled) {
                boolean var10 = false;
                if ((var5 - this.field4396) > 100) {
                    this.field4396 = var5;
                    var10 = true;
                }
                this.worldMapManager.drawElements(this.centerTileX - (var8 / 2), this.centerTileY - (var9 / 2), (var8 / 2) + this.centerTileX, (var9 / 2) + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4398, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
            }
            this.method6983(var1, var2, var3, var4, var8, var9);
            if ((class133.method2807() && this.showCoord) && (this.mouseCoord != null)) {
                this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
            }
            this.worldMapDisplayWidth = var8;
            this.worldMapDisplayHeight = var9;
            this.worldMapDisplayX = var1;
            this.worldMapDisplayY = var2;
            Rasterizer2D.Rasterizer2D_setClipArray(var6);
        }
    }

    @ObfuscatedName("f")
    @ObfuscatedSignature(descriptor = "(IIIIIII)Z", garbageValue = "-1405594741")
    boolean method6903(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (this.sprite == null) {
            return true;
        } else if ((this.sprite.subWidth == var1) && (this.sprite.subHeight == var2)) {
            if (this.worldMapManager.pixelsPerTile != this.cachedPixelsPerTile) {
                return true;
            } else if (this.field4411 != Client.field777) {
                return true;
            } else if ((var3 <= 0) && (var4 <= 0)) {
                return ((var3 + var1) < var5) || ((var2 + var4) < var6);
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @ObfuscatedName("g")
    @ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "1915821127")
    void method6983(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (class9.field58 != null) {
            int var7 = 512 / (this.worldMapManager.pixelsPerTile * 2);
            int var8 = var3 + 512;
            int var9 = var4 + 512;
            float var10 = 1.0F;
            var8 = ((int) (((float) (var8)) / var10));
            var9 = ((int) (((float) (var9)) / var10));
            int var11 = (this.getDisplayX() - (var5 / 2)) - var7;
            int var12 = (this.getDisplayY() - (var6 / 2)) - var7;
            int var13 = var1 - (((var11 + var7) - this.minCachedTileX) * this.worldMapManager.pixelsPerTile);
            int var14 = var2 - (this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)));
            if (this.method6903(var8, var9, var13, var14, var3, var4)) {
                if (((this.sprite != null) && (this.sprite.subWidth == var8)) && (this.sprite.subHeight == var9)) {
                    Arrays.fill(this.sprite.pixels, 0);
                } else {
                    this.sprite = new SpritePixels(var8, var9);
                }
                this.minCachedTileX = (this.getDisplayX() - (var5 / 2)) - var7;
                this.minCachedTileY = (this.getDisplayY() - (var6 / 2)) - var7;
                this.cachedPixelsPerTile = this.worldMapManager.pixelsPerTile;
                class9.field58.method5766(this.minCachedTileX, this.minCachedTileY, this.sprite, ((float) (this.cachedPixelsPerTile)) / var10);
                this.field4411 = Client.field777;
                var13 = var1 - (((var11 + var7) - this.minCachedTileX) * this.worldMapManager.pixelsPerTile);
                var14 = var2 - (this.worldMapManager.pixelsPerTile * (var7 - (var12 - this.minCachedTileY)));
            }
            Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
            if (1.0F == var10) {
                this.sprite.method7771(var13, var14, 192);
            } else {
                this.sprite.method7796(var13, var14, ((int) (var10 * ((float) (var8)))), ((int) (var10 * ((float) (var9)))), 192);
            }
        }
    }

    @ObfuscatedName("t")
    @ObfuscatedSignature(descriptor = "(IIIIB)V", garbageValue = "23")
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

    @ObfuscatedName("k")
    @ObfuscatedSignature(descriptor = "(IS)V", garbageValue = "128")
    @Export("setZoomPercentage")
    public void setZoomPercentage(int var1) {
        this.zoomTarget = this.getZoomFromPercentage(var1);
    }

    @ObfuscatedName("b")
    @ObfuscatedSignature(descriptor = "(IIIIII)V", garbageValue = "-2109796675")
    @Export("drawLoading")
    void drawLoading(int var1, int var2, int var3, int var4, int var5) {
        byte var6 = 20;
        int var7 = (var3 / 2) + var1;
        int var8 = (((var4 / 2) + var2) - 18) - var6;
        Rasterizer2D.Rasterizer2D_fillRectangle(var1, var2, var3, var4, -16777216);
        Rasterizer2D.Rasterizer2D_drawRectangle(var7 - 152, var8, 304, 34, -65536);
        Rasterizer2D.Rasterizer2D_fillRectangle(var7 - 150, var8 + 2, var5 * 3, 30, -65536);
        this.font.drawCentered("Loading...", var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("z")
    @ObfuscatedSignature(descriptor = "(II)F", garbageValue = "1108378625")
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

    @ObfuscatedName("ap")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "29")
    @Export("getZoomLevel")
    public int getZoomLevel() {
        if (((double) (this.zoomTarget)) == 1.0) {
            return 25;
        } else if (1.5 == ((double) (this.zoomTarget))) {
            return 37;
        } else if (((double) (this.zoomTarget)) == 2.0) {
            return 50;
        } else if (((double) (this.zoomTarget)) == 3.0) {
            return 75;
        } else {
            return ((double) (this.zoomTarget)) == 4.0 ? 100 : 200;
        }
    }

    @ObfuscatedName("af")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-19")
    @Export("loadCache")
    public void loadCache() {
        this.cacheLoader.load();
    }

    @ObfuscatedName("ak")
    @ObfuscatedSignature(descriptor = "(I)Z", garbageValue = "-1609770049")
    @Export("isCacheLoaded")
    public boolean isCacheLoaded() {
        return this.cacheLoader.isLoaded();
    }

    @ObfuscatedName("av")
    @ObfuscatedSignature(descriptor = "(IB)Lhm;", garbageValue = "-97")
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

    @ObfuscatedName("ar")
    @ObfuscatedSignature(descriptor = "(IIB)V", garbageValue = "4")
    @Export("setWorldMapPositionTarget")
    public void setWorldMapPositionTarget(int var1, int var2) {
        if ((this.currentMapArea != null) && this.currentMapArea.containsPosition(var1, var2)) {
            this.worldMapTargetX = var1 - (this.currentMapArea.getRegionLowX() * 64);
            this.worldMapTargetY = var2 - (this.currentMapArea.getRegionLowY() * 64);
        }
    }

    @ObfuscatedName("al")
    @ObfuscatedSignature(descriptor = "(III)V", garbageValue = "-1107981788")
    @Export("setWorldMapPositionTargetInstant")
    public void setWorldMapPositionTargetInstant(int var1, int var2) {
        if (this.currentMapArea != null) {
            this.setWorldMapPosition(var1 - (this.currentMapArea.getRegionLowX() * 64), var2 - (this.currentMapArea.getRegionLowY() * 64), true);
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
        }
    }

    @ObfuscatedName("aa")
    @ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "5")
    @Export("jumpToSourceCoord")
    public void jumpToSourceCoord(int var1, int var2, int var3) {
        if (this.currentMapArea != null) {
            int[] var4 = this.currentMapArea.position(var1, var2, var3);
            if (var4 != null) {
                this.setWorldMapPositionTarget(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ao")
    @ObfuscatedSignature(descriptor = "(IIIB)V", garbageValue = "-45")
    @Export("jumpToSourceCoordInstant")
    public void jumpToSourceCoordInstant(int var1, int var2, int var3) {
        if (this.currentMapArea != null) {
            int[] var4 = this.currentMapArea.position(var1, var2, var3);
            if (var4 != null) {
                this.setWorldMapPositionTargetInstant(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("aq")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "-82")
    @Export("getDisplayX")
    public int getDisplayX() {
        return this.currentMapArea == null ? -1 : this.centerTileX + (this.currentMapArea.getRegionLowX() * 64);
    }

    @ObfuscatedName("ay")
    @ObfuscatedSignature(descriptor = "(B)I", garbageValue = "33")
    @Export("getDisplayY")
    public int getDisplayY() {
        return this.currentMapArea == null ? -1 : this.centerTileY + (this.currentMapArea.getRegionLowY() * 64);
    }

    @ObfuscatedName("ac")
    @ObfuscatedSignature(descriptor = "(I)Ljd;", garbageValue = "-1413641352")
    @Export("getDisplayCoord")
    public Coord getDisplayCoord() {
        return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
    }

    @ObfuscatedName("ab")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-937812411")
    @Export("getDisplayWith")
    public int getDisplayWith() {
        return this.worldMapDisplayWidth;
    }

    @ObfuscatedName("as")
    @ObfuscatedSignature(descriptor = "(I)I", garbageValue = "-439544907")
    @Export("getDisplayHeight")
    public int getDisplayHeight() {
        return this.worldMapDisplayHeight;
    }

    @ObfuscatedName("ag")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1644259642")
    @Export("setMaxFlashCount")
    public void setMaxFlashCount(int var1) {
        if (var1 >= 1) {
            this.maxFlashCount = var1;
        }
    }

    @ObfuscatedName("az")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1364892834")
    @Export("resetMaxFlashCount")
    public void resetMaxFlashCount() {
        this.maxFlashCount = 3;
    }

    @ObfuscatedName("ad")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "1824522129")
    @Export("setCyclesPerFlash")
    public void setCyclesPerFlash(int var1) {
        if (var1 >= 1) {
            this.cyclesPerFlash = var1;
        }
    }

    @ObfuscatedName("au")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-3")
    @Export("resetCyclesPerFlash")
    public void resetCyclesPerFlash() {
        this.cyclesPerFlash = 50;
    }

    @ObfuscatedName("at")
    @ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "1")
    @Export("setPerpetualFlash")
    public void setPerpetualFlash(boolean var1) {
        this.perpetualFlash = var1;
    }

    @ObfuscatedName("ae")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "-1967172727")
    @Export("flashElement")
    public void flashElement(int var1) {
        this.flashingElements = new HashSet();
        this.flashingElements.add(var1);
        this.flashCount = 0;
        this.flashCycle = 0;
    }

    @ObfuscatedName("an")
    @ObfuscatedSignature(descriptor = "(II)V", garbageValue = "917592006")
    @Export("flashCategory")
    public void flashCategory(int var1) {
        this.flashingElements = new HashSet();
        this.flashCount = 0;
        this.flashCycle = 0;
        for (int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
            if ((class126.WorldMapElement_get(var2) != null) && (class126.WorldMapElement_get(var2).category == var1)) {
                this.flashingElements.add(class126.WorldMapElement_get(var2).objectId);
            }
        }
    }

    @ObfuscatedName("aw")
    @ObfuscatedSignature(descriptor = "(B)V", garbageValue = "14")
    @Export("stopCurrentFlashes")
    public void stopCurrentFlashes() {
        this.flashingElements = null;
    }

    @ObfuscatedName("aj")
    @ObfuscatedSignature(descriptor = "(ZB)V", garbageValue = "2")
    @Export("setElementsDisabled")
    public void setElementsDisabled(boolean var1) {
        this.elementsDisabled = !var1;
    }

    @ObfuscatedName("ax")
    @ObfuscatedSignature(descriptor = "(IZI)V", garbageValue = "-23253719")
    @Export("disableElement")
    public void disableElement(int var1, boolean var2) {
        if (!var2) {
            this.enabledElements.add(var1);
        } else {
            this.enabledElements.remove(var1);
        }
        this.method6963();
    }

    @ObfuscatedName("ah")
    @ObfuscatedSignature(descriptor = "(IZB)V", garbageValue = "62")
    @Export("setCategoryDisabled")
    public void setCategoryDisabled(int var1, boolean var2) {
        if (!var2) {
            this.enabledCategories.add(var1);
        } else {
            this.enabledCategories.remove(var1);
        }
        for (int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
            if ((class126.WorldMapElement_get(var3) != null) && (class126.WorldMapElement_get(var3).category == var1)) {
                int var4 = class126.WorldMapElement_get(var3).objectId;
                if (!var2) {
                    this.enabledElementIds.add(var4);
                } else {
                    this.enabledElementIds.remove(var4);
                }
            }
        }
        this.method6963();
    }

    @ObfuscatedName("ai")
    @ObfuscatedSignature(descriptor = "(B)Z", garbageValue = "50")
    @Export("getElementsDisabled")
    public boolean getElementsDisabled() {
        return !this.elementsDisabled;
    }

    @ObfuscatedName("am")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1912556750")
    @Export("isElementDisabled")
    public boolean isElementDisabled(int var1) {
        return !this.enabledElements.contains(var1);
    }

    @ObfuscatedName("bt")
    @ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "-384797196")
    @Export("isCategoryDisabled")
    public boolean isCategoryDisabled(int var1) {
        return !this.enabledCategories.contains(var1);
    }

    @ObfuscatedName("bn")
    @ObfuscatedSignature(descriptor = "(I)V", garbageValue = "667355836")
    void method6963() {
        this.field4398.clear();
        this.field4398.addAll(this.enabledElements);
        this.field4398.addAll(this.enabledElementIds);
    }

    @ObfuscatedName("bz")
    @ObfuscatedSignature(descriptor = "(IIIIIII)V", garbageValue = "183417655")
    @Export("addElementMenuOptions")
    public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
        if (this.cacheLoader.isLoaded()) {
            int var7 = ((int) (Math.ceil(((double) (((float) (var3)) / this.zoom)))));
            int var8 = ((int) (Math.ceil(((double) (((float) (var4)) / this.zoom)))));
            List var9 = this.worldMapManager.method4586((this.centerTileX - (var7 / 2)) - 1, (this.centerTileY - (var8 / 2)) - 1, ((var7 / 2) + this.centerTileX) + 1, ((var8 / 2) + this.centerTileY) + 1, var1, var2, var3, var4, var5, var6);
            if (!var9.isEmpty()) {
                Iterator var10 = var9.iterator();
                boolean var13;
                do {
                    if (!var10.hasNext()) {
                        return;
                    }
                    AbstractWorldMapIcon var11 = ((AbstractWorldMapIcon) (var10.next()));
                    WorldMapElement var12 = class126.WorldMapElement_get(var11.getElement());
                    var13 = false;
                    for (int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
                        if (var12.menuActions[var14] != null) {
                            class11.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
                            var13 = true;
                        }
                    }
                } while (!var13 );
            }
        }
    }

    @ObfuscatedName("bx")
    @ObfuscatedSignature(descriptor = "(ILjd;I)Ljd;", garbageValue = "1029185121")
    public Coord method6897(int var1, Coord var2) {
        if (!this.cacheLoader.isLoaded()) {
            return null;
        } else if (!this.worldMapManager.isLoaded()) {
            return null;
        } else if (!this.currentMapArea.containsPosition(var2.x, var2.y)) {
            return null;
        } else {
            HashMap var3 = this.worldMapManager.buildIcons();
            List var4 = ((List) (var3.get(var1)));
            if ((var4 != null) && (!var4.isEmpty())) {
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
                        var11 = (var9 * var9) + (var10 * var10);
                        if (var11 == 0) {
                            return var8.coord2;
                        }
                    } while ((var11 >= var6) && (var5 != null) );
                    var5 = var8;
                    var6 = var11;
                } 
            } else {
                return null;
            }
        }
    }

    @ObfuscatedName("bd")
    @ObfuscatedSignature(descriptor = "(IILjd;Ljd;I)V", garbageValue = "2072083321")
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
        class92.runScriptEvent(var5);
    }

    @ObfuscatedName("bg")
    @ObfuscatedSignature(descriptor = "(I)Lix;", garbageValue = "-1771099551")
    @Export("iconStart")
    public AbstractWorldMapIcon iconStart() {
        if (!this.cacheLoader.isLoaded()) {
            return null;
        } else if (!this.worldMapManager.isLoaded()) {
            return null;
        } else {
            HashMap var1 = this.worldMapManager.buildIcons();
            this.field4402 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = ((List) (var2.next()));
                this.field4402.addAll(var3);
            } 
            this.iconIterator = this.field4402.iterator();
            return this.iconNext();
        }
    }

    @ObfuscatedName("bm")
    @ObfuscatedSignature(descriptor = "(B)Lix;", garbageValue = "-33")
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
            } while (var1.getElement() == (-1) );
            return var1;
        }
    }
}