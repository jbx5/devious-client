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

@ObfuscatedName("rb")
@Implements("WorldMap")
public class WorldMap {
   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("fontNameVerdana11")
   static final FontName fontNameVerdana11;
   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("fontNameVerdana13")
   static final FontName fontNameVerdana13;
   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("fontNameVerdana15")
   static final FontName fontNameVerdana15;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("WorldMap_archive")
   AbstractArchive WorldMap_archive;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("WorldMap_geographyArchive")
   AbstractArchive WorldMap_geographyArchive;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lnm;"
   )
   @Export("WorldMap_groundArchive")
   AbstractArchive WorldMap_groundArchive;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lon;"
   )
   @Export("font")
   Font font;
   @ObfuscatedName("ai")
   @Export("fonts")
   HashMap fonts;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "[Ltc;"
   )
   @Export("mapSceneSprites")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("ah")
   @Export("details")
   HashMap details;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   @Export("mainMapArea")
   WorldMapArea mainMapArea;
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   @Export("currentMapArea")
   WorldMapArea currentMapArea;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "Ljs;"
   )
   WorldMapArea field4845;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Ljv;"
   )
   @Export("worldMapRenderer")
   WorldMapRenderer worldMapRenderer;
   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "Lrh;"
   )
   @Export("cacheLoader")
   WorldMapArchiveLoader cacheLoader;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -84102297
   )
   @Export("centerTileX")
   int centerTileX;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -632186207
   )
   @Export("centerTileY")
   int centerTileY;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = 506744801
   )
   @Export("worldMapTargetX")
   int worldMapTargetX = -1;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = 1744520039
   )
   @Export("worldMapTargetY")
   int worldMapTargetY = -1;
   @ObfuscatedName("ap")
   @Export("zoom")
   float zoom;
   @ObfuscatedName("by")
   @Export("zoomTarget")
   float zoomTarget;
   @ObfuscatedName("bb")
   @ObfuscatedGetter(
      intValue = -1222006759
   )
   @Export("worldMapDisplayWidth")
   int worldMapDisplayWidth = -1;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 1077411767
   )
   @Export("worldMapDisplayHeight")
   int worldMapDisplayHeight = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = 817997135
   )
   @Export("worldMapDisplayX")
   int worldMapDisplayX = -1;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -1710969485
   )
   @Export("worldMapDisplayY")
   int worldMapDisplayY = -1;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -1444238761
   )
   @Export("maxFlashCount")
   int maxFlashCount = 3;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = 1369293643
   )
   @Export("cyclesPerFlash")
   int cyclesPerFlash = 50;
   @ObfuscatedName("bz")
   @Export("perpetualFlash")
   boolean perpetualFlash = false;
   @ObfuscatedName("bm")
   @Export("flashingElements")
   HashSet flashingElements = null;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = 676356035
   )
   @Export("flashCount")
   int flashCount = -1;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 1104873149
   )
   @Export("flashCycle")
   int flashCycle = -1;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -1960645157
   )
   int field4847 = -1;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1246558373
   )
   int field4856 = -1;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -642077217
   )
   int field4813 = -1;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = -2058412227
   )
   int field4850 = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      longValue = 492133368256496125L
   )
   long field4851;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      intValue = -1959248683
   )
   int field4852;
   @ObfuscatedName("bf")
   @ObfuscatedGetter(
      intValue = -1379608603
   )
   int field4853;
   @ObfuscatedName("bq")
   boolean field4819 = true;
   @ObfuscatedName("bl")
   @Export("enabledElements")
   HashSet enabledElements = new HashSet();
   @ObfuscatedName("bp")
   @Export("enabledCategories")
   HashSet enabledCategories = new HashSet();
   @ObfuscatedName("bc")
   @Export("enabledElementIds")
   HashSet enabledElementIds = new HashSet();
   @ObfuscatedName("bh")
   HashSet field4858 = new HashSet();
   @ObfuscatedName("bw")
   @Export("elementsDisabled")
   boolean elementsDisabled = false;
   @ObfuscatedName("ce")
   @ObfuscatedGetter(
      intValue = 460446351
   )
   int field4860 = 0;
   @ObfuscatedName("cs")
   @Export("menuOpcodes")
   final int[] menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
   @ObfuscatedName("cc")
   List field4862;
   @ObfuscatedName("cn")
   @Export("iconIterator")
   Iterator iconIterator;
   @ObfuscatedName("ca")
   HashSet field4837 = new HashSet();
   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "Llb;"
   )
   @Export("mouseCoord")
   Coord mouseCoord = null;
   @ObfuscatedName("ck")
   @Export("showCoord")
   public boolean showCoord = false;
   @ObfuscatedName("cq")
   @ObfuscatedSignature(
      descriptor = "Ltq;"
   )
   @Export("sprite")
   SpritePixels sprite;
   @ObfuscatedName("cm")
   @ObfuscatedGetter(
      intValue = 1547438523
   )
   @Export("cachedPixelsPerTile")
   int cachedPixelsPerTile;
   @ObfuscatedName("cf")
   @ObfuscatedGetter(
      intValue = 334129421
   )
   @Export("minCachedTileX")
   int minCachedTileX = -1;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 627335149
   )
   @Export("minCachedTileY")
   int minCachedTileY = -1;
   @ObfuscatedName("cg")
   @ObfuscatedGetter(
      intValue = 2016965279
   )
   int field4871 = -1;

   static {
      fontNameVerdana11 = FontName.FontName_verdana11;
      fontNameVerdana13 = FontName.FontName_verdana13;
      fontNameVerdana15 = FontName.FontName_verdana15;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lnm;Lnm;Lnm;Lon;Ljava/util/HashMap;[Ltc;I)V",
      garbageValue = "87285163"
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
      int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3054.name);
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
      this.field4845 = null;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1355740161"
   )
   public void method8471() {
      WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIZIIIII)V",
      garbageValue = "-529416730"
   )
   @Export("onCycle")
   public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded()) {
         this.smoothZoom();
         this.scrollToTarget();
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
            int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
            List var10 = this.worldMapRenderer.method5307(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            AbstractWorldMapIcon var13;
            ScriptEvent var14;
            WorldMapEvent var15;
            for(var12 = var10.iterator(); var12.hasNext(); HealthBarUpdate.runScriptEvent(var14)) {
               var13 = (AbstractWorldMapIcon)var12.next();
               var11.add(var13);
               var14 = new ScriptEvent();
               var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
               var14.setArgs(new Object[]{var15, var1, var2});
               if (this.field4837.contains(var13)) {
                  var14.setType(17);
               } else {
                  var14.setType(15);
               }
            }

            var12 = this.field4837.iterator();

            while(var12.hasNext()) {
               var13 = (AbstractWorldMapIcon)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new ScriptEvent();
                  var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
                  var14.setArgs(new Object[]{var15, var1, var2});
                  var14.setType(16);
                  HealthBarUpdate.runScriptEvent(var14);
               }
            }

            this.field4837 = var11;
         }
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIZZI)V",
      garbageValue = "-591700137"
   )
   public void method8473(int var1, int var2, boolean var3, boolean var4) {
      long var5 = class96.method2634();
      this.method8474(var1, var2, var4, var5);
      if (!this.hasTarget() && (var4 || var3) && !InvDefinition.method3646()) {
         if (var4) {
            this.field4813 = var1;
            this.field4850 = var2;
            this.field4847 = this.centerTileX;
            this.field4856 = this.centerTileY;
         }

         if (this.field4847 != -1) {
            int var7 = var1 - this.field4813;
            int var8 = var2 - this.field4850;
            this.setWorldMapPosition(this.field4847 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4856, false);
         }
      } else {
         this.method8478();
      }

      if (var4) {
         this.field4851 = var5;
         this.field4852 = var1;
         this.field4853 = var2;
      }

   }

   @ObfuscatedName("au")
   void method8474(int var1, int var2, boolean var3, long var4) {
      if (this.currentMapArea != null) {
         int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
         int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
         this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
         if (this.mouseCoord != null && var3) {
            class207 var8 = Client.field721;
            boolean var10 = Client.staffModLevel >= 2;
            int var12;
            int var13;
            if (var10 && var8.method4229(82) && var8.method4229(81)) {
               int var16 = this.mouseCoord.x;
               var12 = this.mouseCoord.y;
               var13 = this.mouseCoord.plane;
               PacketBufferNode var14 = class330.getPacketBufferNode(ClientPacket.field3179, Client.packetWriter.isaacCipher);
               var14.packetBuffer.writeIntIME(0);
               var14.packetBuffer.writeShortAdd(var16);
               var14.packetBuffer.writeByteAdd(var13);
               var14.packetBuffer.writeShortAddLE(var12);
               Client.packetWriter.addNode(var14);
            } else {
               boolean var11 = true;
               if (this.field4819) {
                  var12 = var1 - this.field4852;
                  var13 = var2 - this.field4853;
                  if (var4 - this.field4851 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
                     var11 = false;
                  }
               }

               if (var11) {
                  PacketBufferNode var15 = class330.getPacketBufferNode(ClientPacket.field3144, Client.packetWriter.isaacCipher);
                  var15.packetBuffer.writeIntME(this.mouseCoord.packed());
                  Client.packetWriter.addNode(var15);
                  this.field4851 = 0L;
               }
            }
         }
      } else {
         this.mouseCoord = null;
      }

   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "796336724"
   )
   @Export("smoothZoom")
   void smoothZoom() {
      if (class132.field1585 != null) {
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1737092003"
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIZS)V",
      garbageValue = "254"
   )
   @Export("setWorldMapPosition")
   final void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.centerTileX = var1;
      this.centerTileY = var2;
      class96.method2634();
      if (var3) {
         this.method8478();
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1514974800"
   )
   final void method8478() {
      this.field4850 = -1;
      this.field4813 = -1;
      this.field4856 = -1;
      this.field4847 = -1;
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1874644883"
   )
   @Export("hasTarget")
   boolean hasTarget() {
      return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(IIIB)Ljs;",
      garbageValue = "2"
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIIZB)V",
      garbageValue = "15"
   )
   public void method8628(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.mainMapArea;
      }

      boolean var6 = false;
      if (var5 != this.field4845 || var4) {
         this.field4845 = var5;
         this.setCurrentMapArea(var5);
         var6 = true;
      }

      if (var6 || var4) {
         this.jump(var1, var2, var3);
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-230803045"
   )
   @Export("setCurrentMapAreaId")
   public void setCurrentMapAreaId(int var1) {
      WorldMapArea var2 = this.getMapArea(var1);
      if (var2 != null) {
         this.setCurrentMapArea(var2);
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "307100006"
   )
   @Export("currentMapAreaId")
   public int currentMapAreaId() {
      return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(B)Ljs;",
      garbageValue = "76"
   )
   @Export("getCurrentMapArea")
   public WorldMapArea getCurrentMapArea() {
      return this.currentMapArea;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Ljs;I)V",
      garbageValue = "-1483320853"
   )
   @Export("setCurrentMapArea")
   void setCurrentMapArea(WorldMapArea var1) {
      if (this.currentMapArea == null || var1 != this.currentMapArea) {
         this.initializeWorldMap(var1);
         this.jump(-1, -1, -1);
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljs;I)V",
      garbageValue = "1081617147"
   )
   @Export("initializeWorldMap")
   void initializeWorldMap(WorldMapArea var1) {
      this.currentMapArea = var1;
      this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
      this.cacheLoader.reset(this.currentMapArea == null ? null : this.currentMapArea.getInternalName());
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ljs;Llb;Llb;ZI)V",
      garbageValue = "2112134948"
   )
   public void method8508(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-1605938577"
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
         this.field4862 = null;
         this.iconIterator = null;
         this.worldMapRenderer.clearIcons();
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "-2111380198"
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
         boolean var10;
         if (!this.elementsDisabled) {
            var10 = false;
            if (var5 - this.field4860 > 100) {
               this.field4860 = var5;
               var10 = true;
            }

            this.worldMapRenderer.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4858, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
         }

         this.method8491(var1, var2, var3, var4, var8, var9);
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

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)Z",
      garbageValue = "-879179620"
   )
   boolean method8528(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.sprite == null) {
         return true;
      } else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
         if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
            return true;
         } else if (this.field4871 != Client.field781) {
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
      garbageValue = "1052800047"
   )
   void method8491(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class132.field1585 != null) {
         int var7 = 512 / (this.worldMapRenderer.pixelsPerTile * 2);
         int var8 = var3 + 512;
         int var9 = var4 + 512;
         float var10 = 1.0F;
         var8 = (int)((float)var8 / var10);
         var9 = (int)((float)var9 / var10);
         int var11 = this.getDisplayX() - var5 / 2 - var7;
         int var12 = this.getDisplayY() - var6 / 2 - var7;
         int var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
         int var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         if (this.method8528(var8, var9, var13, var14, var3, var4)) {
            if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new SpritePixels(var8, var9);
            }

            this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
            this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
            this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
            class132.field1585.method6902(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
            this.field4871 = Client.field781;
            var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
            var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (1.0F == var10) {
            this.sprite.method9576(var13, var14, 192);
         } else {
            this.sprite.method9509(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192);
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "19"
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

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-326136881"
   )
   @Export("setZoomPercentage")
   public void setZoomPercentage(int var1) {
      this.zoomTarget = this.getZoomFromPercentage(var1);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "-2130359390"
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "271609225"
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

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
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
         return (double)this.zoomTarget == 4.0 ? 100 : 200;
      }
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "216165054"
   )
   @Export("loadCache")
   public void loadCache() {
      this.cacheLoader.load();
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "142682982"
   )
   @Export("isCacheLoaded")
   public boolean isCacheLoaded() {
      return this.cacheLoader.isLoaded();
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(II)Ljs;",
      garbageValue = "-1827173071"
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

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-80"
   )
   @Export("setWorldMapPositionTarget")
   public void setWorldMapPositionTarget(int var1, int var2) {
      if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
         this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
         this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "210272527"
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
      garbageValue = "103"
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
      garbageValue = "-319768384"
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
      descriptor = "(I)I",
      garbageValue = "-1755924564"
   )
   @Export("getDisplayX")
   public int getDisplayX() {
      return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "0"
   )
   @Export("getDisplayY")
   public int getDisplayY() {
      return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(I)Llb;",
      garbageValue = "1721001715"
   )
   @Export("getDisplayCoord")
   public Coord getDisplayCoord() {
      return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "103"
   )
   @Export("getDisplayWith")
   public int getDisplayWith() {
      return this.worldMapDisplayWidth;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-947809621"
   )
   @Export("getDisplayHeight")
   public int getDisplayHeight() {
      return this.worldMapDisplayHeight;
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "88"
   )
   @Export("setMaxFlashCount")
   public void setMaxFlashCount(int var1) {
      if (var1 >= 1) {
         this.maxFlashCount = var1;
      }

   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "5"
   )
   @Export("resetMaxFlashCount")
   public void resetMaxFlashCount() {
      this.maxFlashCount = 3;
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "31"
   )
   @Export("setCyclesPerFlash")
   public void setCyclesPerFlash(int var1) {
      if (var1 >= 1) {
         this.cyclesPerFlash = var1;
      }

   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1035925725"
   )
   @Export("resetCyclesPerFlash")
   public void resetCyclesPerFlash() {
      this.cyclesPerFlash = 50;
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1485750131"
   )
   @Export("setPerpetualFlash")
   public void setPerpetualFlash(boolean var1) {
      this.perpetualFlash = var1;
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "185156955"
   )
   @Export("flashElement")
   public void flashElement(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.flashCount = 0;
      this.flashCycle = 0;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "679532809"
   )
   @Export("flashCategory")
   public void flashCategory(int var1) {
      this.flashingElements = new HashSet();
      this.flashCount = 0;
      this.flashCycle = 0;

      for(int var2 = 0; var2 < class328.WorldMapElement_count; ++var2) {
         if (class354.WorldMapElement_get(var2) != null && class354.WorldMapElement_get(var2).category == var1) {
            this.flashingElements.add(class354.WorldMapElement_get(var2).objectId);
         }
      }

   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "530218621"
   )
   @Export("stopCurrentFlashes")
   public void stopCurrentFlashes() {
      this.flashingElements = null;
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "606617490"
   )
   @Export("setElementsDisabled")
   public void setElementsDisabled(boolean var1) {
      this.elementsDisabled = !var1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "1622935645"
   )
   @Export("disableElement")
   public void disableElement(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.method8589();
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "21329646"
   )
   @Export("setCategoryDisabled")
   public void setCategoryDisabled(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for(int var3 = 0; var3 < class328.WorldMapElement_count; ++var3) {
         if (class354.WorldMapElement_get(var3) != null && class354.WorldMapElement_get(var3).category == var1) {
            int var4 = class354.WorldMapElement_get(var3).objectId;
            if (!var2) {
               this.enabledElementIds.add(var4);
            } else {
               this.enabledElementIds.remove(var4);
            }
         }
      }

      this.method8589();
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "480"
   )
   @Export("getElementsDisabled")
   public boolean getElementsDisabled() {
      return !this.elementsDisabled;
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-939989355"
   )
   @Export("isElementDisabled")
   public boolean isElementDisabled(int var1) {
      return !this.enabledElements.contains(var1);
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-101"
   )
   @Export("isCategoryDisabled")
   public boolean isCategoryDisabled(int var1) {
      return !this.enabledCategories.contains(var1);
   }

   @ObfuscatedName("ci")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-91"
   )
   void method8589() {
      this.field4858.clear();
      this.field4858.addAll(this.enabledElements);
      this.field4858.addAll(this.enabledElementIds);
   }

   @ObfuscatedName("cs")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-746729453"
   )
   @Export("addElementMenuOptions")
   public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cacheLoader.isLoaded()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
         int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
         List var9 = this.worldMapRenderer.method5307(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
               WorldMapElement var12 = class354.WorldMapElement_get(var11.getElement());
               var13 = false;

               for(int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
                  if (var12.menuActions[var14] != null) {
                     MenuAction.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "(ILlb;I)Llb;",
      garbageValue = "-809326825"
   )
   public Coord method8660(int var1, Coord var2) {
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

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(IILlb;Llb;I)V",
      garbageValue = "-1912180740"
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

      HealthBarUpdate.runScriptEvent(var5);
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(I)Lkg;",
      garbageValue = "-156037818"
   )
   @Export("iconStart")
   public AbstractWorldMapIcon iconStart() {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded()) {
         return null;
      } else {
         HashMap var1 = this.worldMapRenderer.buildIcons();
         this.field4862 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field4862.addAll(var3);
         }

         this.iconIterator = this.field4862.iterator();
         return this.iconNext();
      }
   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      descriptor = "(B)Lkg;",
      garbageValue = "-14"
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
