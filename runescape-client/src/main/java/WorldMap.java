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

@ObfuscatedName("se")
@Implements("WorldMap")
public class WorldMap {
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lsb;"
   )
   @Export("fontNameVerdana11")
   static final FontName fontNameVerdana11;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lsb;"
   )
   @Export("fontNameVerdana13")
   static final FontName fontNameVerdana13;
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lsb;"
   )
   @Export("fontNameVerdana15")
   static final FontName fontNameVerdana15;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("WorldMap_archive")
   AbstractArchive WorldMap_archive;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("WorldMap_geographyArchive")
   AbstractArchive WorldMap_geographyArchive;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Lnq;"
   )
   @Export("WorldMap_groundArchive")
   AbstractArchive WorldMap_groundArchive;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lph;"
   )
   @Export("font")
   Font font;
   @ObfuscatedName("ad")
   @Export("fonts")
   HashMap fonts;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "[Ltj;"
   )
   @Export("mapSceneSprites")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("ag")
   @Export("details")
   HashMap details;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("mainMapArea")
   WorldMapArea mainMapArea;
   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   @Export("currentMapArea")
   WorldMapArea currentMapArea;
   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "Lji;"
   )
   WorldMapArea field4844;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lje;"
   )
   @Export("worldMapRenderer")
   WorldMapRenderer worldMapRenderer;
   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "Lsg;"
   )
   @Export("cacheLoader")
   WorldMapArchiveLoader cacheLoader;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 127861683
   )
   @Export("centerTileX")
   int centerTileX;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -331825895
   )
   @Export("centerTileY")
   int centerTileY;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -2051653693
   )
   @Export("worldMapTargetX")
   int worldMapTargetX = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -120232219
   )
   @Export("worldMapTargetY")
   int worldMapTargetY = -1;
   @ObfuscatedName("am")
   @Export("zoom")
   float zoom;
   @ObfuscatedName("bs")
   @Export("zoomTarget")
   float zoomTarget;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -1317453623
   )
   @Export("worldMapDisplayWidth")
   int worldMapDisplayWidth = -1;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = 747213467
   )
   @Export("worldMapDisplayHeight")
   int worldMapDisplayHeight = -1;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -725787273
   )
   @Export("worldMapDisplayX")
   int worldMapDisplayX = -1;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = 1294185675
   )
   @Export("worldMapDisplayY")
   int worldMapDisplayY = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 2003852113
   )
   @Export("maxFlashCount")
   int maxFlashCount = 3;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = 1314537779
   )
   @Export("cyclesPerFlash")
   int cyclesPerFlash = 50;
   @ObfuscatedName("bd")
   @Export("perpetualFlash")
   boolean perpetualFlash = false;
   @ObfuscatedName("ba")
   @Export("flashingElements")
   HashSet flashingElements = null;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = 2042824295
   )
   @Export("flashCount")
   int flashCount = -1;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -1640145223
   )
   @Export("flashCycle")
   int flashCycle = -1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = 1226553301
   )
   int field4837 = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1968983929
   )
   int field4864 = -1;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -1319218533
   )
   int field4871 = -1;
   @ObfuscatedName("bp")
   @ObfuscatedGetter(
      intValue = 2080086433
   )
   int field4866 = -1;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      longValue = 7216005611336148721L
   )
   long field4867;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -1932800827
   )
   int field4868;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = 485700395
   )
   int field4869;
   @ObfuscatedName("bv")
   boolean field4870 = true;
   @ObfuscatedName("br")
   @Export("enabledElements")
   HashSet enabledElements = new HashSet();
   @ObfuscatedName("bu")
   @Export("enabledCategories")
   HashSet enabledCategories = new HashSet();
   @ObfuscatedName("by")
   @Export("enabledElementIds")
   HashSet enabledElementIds = new HashSet();
   @ObfuscatedName("bt")
   HashSet field4874 = new HashSet();
   @ObfuscatedName("bl")
   @Export("elementsDisabled")
   boolean elementsDisabled = false;
   @ObfuscatedName("cs")
   @ObfuscatedGetter(
      intValue = 605264915
   )
   int field4876 = 0;
   @ObfuscatedName("ca")
   @Export("menuOpcodes")
   final int[] menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
   @ObfuscatedName("cf")
   List field4878;
   @ObfuscatedName("cw")
   @Export("iconIterator")
   Iterator iconIterator;
   @ObfuscatedName("ch")
   HashSet field4880 = new HashSet();
   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "Lmg;"
   )
   @Export("mouseCoord")
   Coord mouseCoord = null;
   @ObfuscatedName("cy")
   @Export("showCoord")
   public boolean showCoord = false;
   @ObfuscatedName("cd")
   @ObfuscatedSignature(
      descriptor = "Ltm;"
   )
   @Export("sprite")
   SpritePixels sprite;
   @ObfuscatedName("cv")
   @ObfuscatedGetter(
      intValue = -1854385725
   )
   @Export("cachedPixelsPerTile")
   int cachedPixelsPerTile;
   @ObfuscatedName("cr")
   @ObfuscatedGetter(
      intValue = 1128528755
   )
   @Export("minCachedTileX")
   int minCachedTileX = -1;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = -165942153
   )
   @Export("minCachedTileY")
   int minCachedTileY = -1;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 650775775
   )
   int field4887 = -1;

   static {
      fontNameVerdana11 = FontName.FontName_verdana11;
      fontNameVerdana13 = FontName.FontName_verdana13;
      fontNameVerdana15 = FontName.FontName_verdana15;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;Lnq;Lnq;Lph;Ljava/util/HashMap;[Ltj;S)V",
      garbageValue = "20012"
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
      int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3049.name);
      int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
      int var9 = var8 == null ? 0 : var8.length;
      this.details = new HashMap(var9);

      for(int var10 = 0; var10 < var9; ++var10) {
         Buffer var11 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var10]));
         WorldMapArea var12 = new WorldMapArea();
         var12.read(var11, var8[var10]);
         this.details.put(var12.getInternalName(), var12);
         if (var12.getIsMain()) {
            this.mainMapArea = var12;
         }
      }

      this.setCurrentMapArea(this.mainMapArea);
      this.field4844 = null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "16256"
   )
   public void method8387() {
      WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIZIIIIS)V",
      garbageValue = "1313"
   )
   @Export("onCycle")
   public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded()) {
         this.smoothZoom();
         this.scrollToTarget();
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
            int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
            List var10 = this.worldMapRenderer.method5319(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            AbstractWorldMapIcon var13;
            ScriptEvent var14;
            WorldMapEvent var15;
            for(var12 = var10.iterator(); var12.hasNext(); Clock.runScriptEvent(var14)) {
               var13 = (AbstractWorldMapIcon)var12.next();
               var11.add(var13);
               var14 = new ScriptEvent();
               var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
               var14.setArgs(new Object[]{var15, var1, var2});
               if (this.field4880.contains(var13)) {
                  var14.setType(17);
               } else {
                  var14.setType(15);
               }
            }

            var12 = this.field4880.iterator();

            while(var12.hasNext()) {
               var13 = (AbstractWorldMapIcon)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new ScriptEvent();
                  var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
                  var14.setArgs(new Object[]{var15, var1, var2});
                  var14.setType(16);
                  Clock.runScriptEvent(var14);
               }
            }

            this.field4880 = var11;
         }
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIZZI)V",
      garbageValue = "1824442037"
   )
   public void method8389(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label40: {
         var5 = BoundaryObject.method5027();
         this.method8434(var1, var2, var4, var5);
         if (!this.hasTarget() && (var4 || var3)) {
            boolean var7 = Client.clickedWidget != null;
            if (!var7) {
               if (var4) {
                  this.field4871 = var1;
                  this.field4866 = var2;
                  this.field4837 = this.centerTileX;
                  this.field4864 = this.centerTileY;
               }

               if (this.field4837 != -1) {
                  int var8 = var1 - this.field4871;
                  int var9 = var2 - this.field4866;
                  this.setWorldMapPosition(this.field4837 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4864, false);
               }
               break label40;
            }
         }

         this.method8394();
      }

      if (var4) {
         this.field4867 = var5;
         this.field4868 = var1;
         this.field4869 = var2;
      }

   }

   @ObfuscatedName("ax")
   void method8434(int var1, int var2, boolean var3, long var4) {
      if (this.currentMapArea != null) {
         int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
         int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
         this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
         if (this.mouseCoord != null && var3) {
            class211 var8 = class350.method6624();
            int var10;
            int var11;
            if (RouteStrategy.method4214() && var8.method4134(82) && var8.method4134(81)) {
               int var14 = this.mouseCoord.x;
               var10 = this.mouseCoord.y;
               var11 = this.mouseCoord.plane;
               PacketBufferNode var12 = ObjectComposition.getPacketBufferNode(ClientPacket.field3182, Client.packetWriter.isaacCipher);
               var12.packetBuffer.writeShortLE(var10);
               var12.packetBuffer.writeByte(var11);
               var12.packetBuffer.writeShortAddLE(var14);
               var12.packetBuffer.writeIntIME(0);
               Client.packetWriter.addNode(var12);
            } else {
               boolean var9 = true;
               if (this.field4870) {
                  var10 = var1 - this.field4868;
                  var11 = var2 - this.field4869;
                  if (var4 - this.field4867 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                     var9 = false;
                  }
               }

               if (var9) {
                  PacketBufferNode var13 = ObjectComposition.getPacketBufferNode(ClientPacket.field3106, Client.packetWriter.isaacCipher);
                  var13.packetBuffer.method8919(this.mouseCoord.packed());
                  Client.packetWriter.addNode(var13);
                  this.field4867 = 0L;
               }
            }
         }
      } else {
         this.mouseCoord = null;
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2138942689"
   )
   @Export("smoothZoom")
   void smoothZoom() {
      if (class30.field152 != null) {
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "914496127"
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "-2044537364"
   )
   @Export("setWorldMapPosition")
   final void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.centerTileX = var1;
      this.centerTileY = var2;
      BoundaryObject.method5027();
      if (var3) {
         this.method8394();
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "70"
   )
   final void method8394() {
      this.field4866 = -1;
      this.field4871 = -1;
      this.field4864 = -1;
      this.field4837 = -1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1843648730"
   )
   @Export("hasTarget")
   boolean hasTarget() {
      return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lji;",
      garbageValue = "-1016318302"
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

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IIIZB)V",
      garbageValue = "-21"
   )
   public void method8401(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.mainMapArea;
      }

      boolean var6 = false;
      if (var5 != this.field4844 || var4) {
         this.field4844 = var5;
         this.setCurrentMapArea(var5);
         var6 = true;
      }

      if (var6 || var4) {
         this.jump(var1, var2, var3);
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-7953"
   )
   @Export("setCurrentMapAreaId")
   public void setCurrentMapAreaId(int var1) {
      WorldMapArea var2 = this.getMapArea(var1);
      if (var2 != null) {
         this.setCurrentMapArea(var2);
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-441254740"
   )
   @Export("currentMapAreaId")
   public int currentMapAreaId() {
      return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)Lji;",
      garbageValue = "130708246"
   )
   @Export("getCurrentMapArea")
   public WorldMapArea getCurrentMapArea() {
      return this.currentMapArea;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lji;B)V",
      garbageValue = "22"
   )
   @Export("setCurrentMapArea")
   void setCurrentMapArea(WorldMapArea var1) {
      if (this.currentMapArea == null || var1 != this.currentMapArea) {
         this.initializeWorldMap(var1);
         this.jump(-1, -1, -1);
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Lji;B)V",
      garbageValue = "115"
   )
   @Export("initializeWorldMap")
   void initializeWorldMap(WorldMapArea var1) {
      this.currentMapArea = var1;
      this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
      this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lji;Lmg;Lmg;ZI)V",
      garbageValue = "-165030305"
   )
   public void method8402(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1264408755"
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
         this.field4878 = null;
         this.iconIterator = null;
         this.worldMapRenderer.clearIcons();
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "-106"
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
            if (var5 - this.field4876 > 100) {
               this.field4876 = var5;
               var10 = true;
            }

            this.worldMapRenderer.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4874, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
         }

         this.method8406(var1, var2, var3, var4, var8, var9);
         if (RouteStrategy.method4214() && this.showCoord && this.mouseCoord != null) {
            this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
         }

         this.worldMapDisplayWidth = var8;
         this.worldMapDisplayHeight = var9;
         this.worldMapDisplayX = var1;
         this.worldMapDisplayY = var2;
         Rasterizer2D.Rasterizer2D_setClipArray(var6);
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)Z",
      garbageValue = "-267348322"
   )
   boolean method8500(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.sprite == null) {
         return true;
      } else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
         if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
            return true;
         } else if (this.field4887 != Client.field698) {
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
      garbageValue = "1478618503"
   )
   void method8406(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class30.field152 != null) {
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
         if (this.method8500(var8, var9, var13, var14, var3, var4)) {
            if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new SpritePixels(var8, var9);
            }

            this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
            this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
            this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
            class30.field152.method6878(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
            this.field4887 = Client.field698;
            var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
            var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.sprite.method9417(var13, var14, 192);
         } else {
            this.sprite.method9398(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192);
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "-624892397"
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

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1741725612"
   )
   @Export("setZoomPercentage")
   public void setZoomPercentage(int var1) {
      this.zoomTarget = this.getZoomFromPercentage(var1);
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "50443951"
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

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "1112990661"
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

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1233999665"
   )
   @Export("getZoomLevel")
   public int getZoomLevel() {
      if (1.0 == (double)this.zoomTarget) {
         return 25;
      } else if (1.5 == (double)this.zoomTarget) {
         return 37;
      } else if (2.0 == (double)this.zoomTarget) {
         return 50;
      } else if ((double)this.zoomTarget == 3.0) {
         return 75;
      } else {
         return 4.0 == (double)this.zoomTarget ? 100 : 200;
      }
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "21"
   )
   @Export("loadCache")
   public void loadCache() {
      this.cacheLoader.load();
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1887987239"
   )
   @Export("isCacheLoaded")
   public boolean isCacheLoaded() {
      return this.cacheLoader.isLoaded();
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(II)Lji;",
      garbageValue = "282847048"
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

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-97384190"
   )
   @Export("setWorldMapPositionTarget")
   public void setWorldMapPositionTarget(int var1, int var2) {
      if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
         this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
         this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
      }
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "24143"
   )
   @Export("setWorldMapPositionTargetInstant")
   public void setWorldMapPositionTargetInstant(int var1, int var2) {
      if (this.currentMapArea != null) {
         this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
      }
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1042163304"
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

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1635859011"
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

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1169974762"
   )
   @Export("getDisplayX")
   public int getDisplayX() {
      return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "34492353"
   )
   @Export("getDisplayY")
   public int getDisplayY() {
      return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(I)Lmg;",
      garbageValue = "-806750269"
   )
   @Export("getDisplayCoord")
   public Coord getDisplayCoord() {
      return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1100829247"
   )
   @Export("getDisplayWith")
   public int getDisplayWith() {
      return this.worldMapDisplayWidth;
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "2021775431"
   )
   @Export("getDisplayHeight")
   public int getDisplayHeight() {
      return this.worldMapDisplayHeight;
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "18"
   )
   @Export("setMaxFlashCount")
   public void setMaxFlashCount(int var1) {
      if (var1 >= 1) {
         this.maxFlashCount = var1;
      }

   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-97"
   )
   @Export("resetMaxFlashCount")
   public void resetMaxFlashCount() {
      this.maxFlashCount = 3;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "578421631"
   )
   @Export("setCyclesPerFlash")
   public void setCyclesPerFlash(int var1) {
      if (var1 >= 1) {
         this.cyclesPerFlash = var1;
      }

   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-227374627"
   )
   @Export("resetCyclesPerFlash")
   public void resetCyclesPerFlash() {
      this.cyclesPerFlash = 50;
   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "-30"
   )
   @Export("setPerpetualFlash")
   public void setPerpetualFlash(boolean var1) {
      this.perpetualFlash = var1;
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-1"
   )
   @Export("flashElement")
   public void flashElement(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.flashCount = 0;
      this.flashCycle = 0;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "5"
   )
   @Export("flashCategory")
   public void flashCategory(int var1) {
      this.flashingElements = new HashSet();
      this.flashCount = 0;
      this.flashCycle = 0;

      for(int var2 = 0; var2 < class11.WorldMapElement_count; ++var2) {
         if (class147.WorldMapElement_get(var2) != null && class147.WorldMapElement_get(var2).category == var1) {
            this.flashingElements.add(class147.WorldMapElement_get(var2).objectId);
         }
      }

   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1916678444"
   )
   @Export("stopCurrentFlashes")
   public void stopCurrentFlashes() {
      this.flashingElements = null;
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1835869684"
   )
   @Export("setElementsDisabled")
   public void setElementsDisabled(boolean var1) {
      this.elementsDisabled = !var1;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-1415281772"
   )
   @Export("disableElement")
   public void disableElement(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.method8438();
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-374152297"
   )
   @Export("setCategoryDisabled")
   public void setCategoryDisabled(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for(int var3 = 0; var3 < class11.WorldMapElement_count; ++var3) {
         if (class147.WorldMapElement_get(var3) != null && class147.WorldMapElement_get(var3).category == var1) {
            int var4 = class147.WorldMapElement_get(var3).objectId;
            if (!var2) {
               this.enabledElementIds.add(var4);
            } else {
               this.enabledElementIds.remove(var4);
            }
         }
      }

      this.method8438();
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "111"
   )
   @Export("getElementsDisabled")
   public boolean getElementsDisabled() {
      return !this.elementsDisabled;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "197298993"
   )
   @Export("isElementDisabled")
   public boolean isElementDisabled(int var1) {
      return !this.enabledElements.contains(var1);
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1309916801"
   )
   @Export("isCategoryDisabled")
   public boolean isCategoryDisabled(int var1) {
      return !this.enabledCategories.contains(var1);
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1155820221"
   )
   void method8438() {
      this.field4874.clear();
      this.field4874.addAll(this.enabledElements);
      this.field4874.addAll(this.enabledElementIds);
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "-14"
   )
   @Export("addElementMenuOptions")
   public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cacheLoader.isLoaded()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
         int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
         List var9 = this.worldMapRenderer.method5319(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
               WorldMapElement var12 = class147.WorldMapElement_get(var11.getElement());
               var13 = false;

               for(int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
                  if (var12.menuActions[var14] != null) {
                     class138.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "(ILmg;B)Lmg;",
      garbageValue = "20"
   )
   public Coord method8440(int var1, Coord var2) {
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

            while(true) {
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

   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "(IILmg;Lmg;B)V",
      garbageValue = "-17"
   )
   @Export("worldMapMenuAction")
   public void worldMapMenuAction(int var1, int var2, Coord var3, Coord var4) {
      ScriptEvent var5 = new ScriptEvent();
      WorldMapEvent var6 = new WorldMapEvent(var2, var3, var4);
      var5.setArgs(new Object[]{var6});
      switch (var1) {
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

      Clock.runScriptEvent(var5);
   }

   @ObfuscatedName("ch")
   @ObfuscatedSignature(
      descriptor = "(B)Lkb;",
      garbageValue = "0"
   )
   @Export("iconStart")
   public AbstractWorldMapIcon iconStart() {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded()) {
         return null;
      } else {
         HashMap var1 = this.worldMapRenderer.buildIcons();
         this.field4878 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field4878.addAll(var3);
         }

         this.iconIterator = this.field4878.iterator();
         return this.iconNext();
      }
   }

   @ObfuscatedName("cp")
   @ObfuscatedSignature(
      descriptor = "(I)Lkb;",
      garbageValue = "343963621"
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
