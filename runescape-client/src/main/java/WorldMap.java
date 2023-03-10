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

@ObfuscatedName("rc")
@Implements("WorldMap")
public class WorldMap {
   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   @Export("fontNameVerdana11")
   static final FontName fontNameVerdana11;
   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   @Export("fontNameVerdana13")
   static final FontName fontNameVerdana13;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   @Export("fontNameVerdana15")
   static final FontName fontNameVerdana15;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("WorldMap_archive")
   AbstractArchive WorldMap_archive;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("WorldMap_geographyArchive")
   AbstractArchive WorldMap_geographyArchive;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lne;"
   )
   @Export("WorldMap_groundArchive")
   AbstractArchive WorldMap_groundArchive;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Loe;"
   )
   @Export("font")
   Font font;
   @ObfuscatedName("ay")
   @Export("fonts")
   HashMap fonts;
   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "[Lsp;"
   )
   @Export("mapSceneSprites")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("az")
   @Export("details")
   HashMap details;
   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   @Export("mainMapArea")
   WorldMapArea mainMapArea;
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   @Export("currentMapArea")
   WorldMapArea currentMapArea;
   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "Ljw;"
   )
   WorldMapArea field4752;
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Ljt;"
   )
   @Export("worldMapRenderer")
   WorldMapRenderer worldMapRenderer;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "Lrk;"
   )
   @Export("cacheLoader")
   WorldMapArchiveLoader cacheLoader;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -1890928691
   )
   @Export("centerTileX")
   int centerTileX;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = -723620891
   )
   @Export("centerTileY")
   int centerTileY;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -1073276225
   )
   @Export("worldMapTargetX")
   int worldMapTargetX = -1;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 350701357
   )
   @Export("worldMapTargetY")
   int worldMapTargetY = -1;
   @ObfuscatedName("ad")
   @Export("zoom")
   float zoom;
   @ObfuscatedName("bm")
   @Export("zoomTarget")
   float zoomTarget;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = -1615461511
   )
   @Export("worldMapDisplayWidth")
   int worldMapDisplayWidth = -1;
   @ObfuscatedName("bo")
   @ObfuscatedGetter(
      intValue = -1700293249
   )
   @Export("worldMapDisplayHeight")
   int worldMapDisplayHeight = -1;
   @ObfuscatedName("bs")
   @ObfuscatedGetter(
      intValue = -1448281075
   )
   @Export("worldMapDisplayX")
   int worldMapDisplayX = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = -461897603
   )
   @Export("worldMapDisplayY")
   int worldMapDisplayY = -1;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 1962939739
   )
   @Export("maxFlashCount")
   int maxFlashCount = 3;
   @ObfuscatedName("bl")
   @ObfuscatedGetter(
      intValue = 1903955743
   )
   @Export("cyclesPerFlash")
   int cyclesPerFlash = 50;
   @ObfuscatedName("bk")
   @Export("perpetualFlash")
   boolean perpetualFlash = false;
   @ObfuscatedName("br")
   @Export("flashingElements")
   HashSet flashingElements = null;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -734728097
   )
   @Export("flashCount")
   int flashCount = -1;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -534081063
   )
   @Export("flashCycle")
   int flashCycle = -1;
   @ObfuscatedName("bq")
   @ObfuscatedGetter(
      intValue = -1680827583
   )
   int field4759 = -1;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = -1916876809
   )
   int field4760 = -1;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = 729845005
   )
   int field4737 = -1;
   @ObfuscatedName("be")
   @ObfuscatedGetter(
      intValue = -1212138547
   )
   int field4762 = -1;
   @ObfuscatedName("bu")
   @ObfuscatedGetter(
      longValue = 4491937650923887927L
   )
   long field4763;
   @ObfuscatedName("bd")
   @ObfuscatedGetter(
      intValue = -195209311
   )
   int field4764;
   @ObfuscatedName("by")
   @ObfuscatedGetter(
      intValue = -1292488725
   )
   int field4765;
   @ObfuscatedName("bp")
   boolean field4766 = true;
   @ObfuscatedName("bn")
   @Export("enabledElements")
   HashSet enabledElements = new HashSet();
   @ObfuscatedName("bj")
   @Export("enabledCategories")
   HashSet enabledCategories = new HashSet();
   @ObfuscatedName("bf")
   @Export("enabledElementIds")
   HashSet enabledElementIds = new HashSet();
   @ObfuscatedName("bw")
   HashSet field4785 = new HashSet();
   @ObfuscatedName("bi")
   @Export("elementsDisabled")
   boolean elementsDisabled = false;
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = -2054537387
   )
   int field4773 = 0;
   @ObfuscatedName("cb")
   @Export("menuOpcodes")
   final int[] menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
   @ObfuscatedName("co")
   List field4775;
   @ObfuscatedName("cj")
   @Export("iconIterator")
   Iterator iconIterator;
   @ObfuscatedName("cn")
   HashSet field4778 = new HashSet();
   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "Llt;"
   )
   @Export("mouseCoord")
   Coord mouseCoord = null;
   @ObfuscatedName("cd")
   @Export("showCoord")
   public boolean showCoord = false;
   @ObfuscatedName("cc")
   @ObfuscatedSignature(
      descriptor = "Lsn;"
   )
   @Export("sprite")
   SpritePixels sprite;
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 497448165
   )
   @Export("cachedPixelsPerTile")
   int cachedPixelsPerTile;
   @ObfuscatedName("cy")
   @ObfuscatedGetter(
      intValue = 1427999279
   )
   @Export("minCachedTileX")
   int minCachedTileX = -1;
   @ObfuscatedName("ck")
   @ObfuscatedGetter(
      intValue = 1906090943
   )
   @Export("minCachedTileY")
   int minCachedTileY = -1;
   @ObfuscatedName("cz")
   @ObfuscatedGetter(
      intValue = -175903371
   )
   int field4781 = -1;

   static {
      fontNameVerdana11 = FontName.FontName_verdana11;
      fontNameVerdana13 = FontName.FontName_verdana13;
      fontNameVerdana15 = FontName.FontName_verdana15;
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lne;Lne;Lne;Loe;Ljava/util/HashMap;[Lsp;B)V",
      garbageValue = "10"
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
      int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3019.name);
      int[] var8 = this.WorldMap_archive.getGroupFileIds(var7);
      this.details = new HashMap(var8.length);

      for(int var9 = 0; var9 < var8.length; ++var9) {
         Buffer var10 = new Buffer(this.WorldMap_archive.takeFile(var7, var8[var9]));
         WorldMapArea var11 = new WorldMapArea();
         var11.read(var10, var8[var9]);
         this.details.put(var11.getInternalName(), var11);
         if (var11.getIsMain()) {
            this.mainMapArea = var11;
         }
      }

      this.setCurrentMapArea(this.mainMapArea);
      this.field4752 = null;
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-36"
   )
   public void method8068() {
      class163.method3357();
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIZIIIII)V",
      garbageValue = "531085844"
   )
   @Export("onCycle")
   public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded()) {
         this.smoothZoom();
         this.scrollToTarget();
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
            int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
            List var10 = this.worldMapRenderer.method5059(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            AbstractWorldMapIcon var13;
            ScriptEvent var14;
            WorldMapEvent var15;
            for(var12 = var10.iterator(); var12.hasNext(); class9.runScriptEvent(var14)) {
               var13 = (AbstractWorldMapIcon)var12.next();
               var11.add(var13);
               var14 = new ScriptEvent();
               var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
               var14.setArgs(new Object[]{var15, var1, var2});
               if (this.field4778.contains(var13)) {
                  var14.setType(17);
               } else {
                  var14.setType(15);
               }
            }

            var12 = this.field4778.iterator();

            while(var12.hasNext()) {
               var13 = (AbstractWorldMapIcon)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new ScriptEvent();
                  var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
                  var14.setArgs(new Object[]{var15, var1, var2});
                  var14.setType(16);
                  class9.runScriptEvent(var14);
               }
            }

            this.field4778 = var11;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IIZZB)V",
      garbageValue = "0"
   )
   public void method8070(int var1, int var2, boolean var3, boolean var4) {
      long var5 = WorldMapSection2.method4844();
      this.method8223(var1, var2, var4, var5);
      if (!this.hasTarget() && (var4 || var3) && !class83.method2254()) {
         if (var4) {
            this.field4737 = var1;
            this.field4762 = var2;
            this.field4759 = this.centerTileX;
            this.field4760 = this.centerTileY;
         }

         if (this.field4759 != -1) {
            int var7 = var1 - this.field4737;
            int var8 = var2 - this.field4762;
            this.setWorldMapPosition(this.field4759 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4760, false);
         }
      } else {
         this.method8247();
      }

      if (var4) {
         this.field4763 = var5;
         this.field4764 = var1;
         this.field4765 = var2;
      }

   }

   @ObfuscatedName("an")
   void method8223(int var1, int var2, boolean var3, long var4) {
      if (this.currentMapArea != null) {
         int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
         int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
         this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
         if (this.mouseCoord != null && var3) {
            class208 var8 = Calendar.method6292();
            if (class72.method2055() && var8.method4074(82) && var8.method4074(81)) {
               class163.method3359(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
            } else {
               boolean var9 = true;
               if (this.field4766) {
                  int var10 = var1 - this.field4764;
                  int var11 = var2 - this.field4765;
                  if (var4 - this.field4763 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                     var9 = false;
                  }
               }

               if (var9) {
                  PacketBufferNode var12 = UserComparator9.getPacketBufferNode(ClientPacket.field3115, Client.packetWriter.isaacCipher);
                  var12.packetBuffer.writeIntLE(this.mouseCoord.packed());
                  Client.packetWriter.addNode(var12);
                  this.field4763 = 0L;
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
      garbageValue = "1031118679"
   )
   @Export("smoothZoom")
   void smoothZoom() {
      if (Language.field4294 != null) {
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1947907315"
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
         if (this.centerTileX == this.worldMapTargetX && this.worldMapTargetY == this.centerTileY) {
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
         }

      }
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "175406529"
   )
   @Export("setWorldMapPosition")
   final void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.centerTileX = var1;
      this.centerTileY = var2;
      WorldMapSection2.method4844();
      if (var3) {
         this.method8247();
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "46"
   )
   final void method8247() {
      this.field4762 = -1;
      this.field4737 = -1;
      this.field4760 = -1;
      this.field4759 = -1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-17"
   )
   @Export("hasTarget")
   boolean hasTarget() {
      return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IIII)Ljw;",
      garbageValue = "412214375"
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

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IIIZB)V",
      garbageValue = "64"
   )
   public void method8078(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.mainMapArea;
      }

      boolean var6 = false;
      if (var5 != this.field4752 || var4) {
         this.field4752 = var5;
         this.setCurrentMapArea(var5);
         var6 = true;
      }

      if (var6 || var4) {
         this.jump(var1, var2, var3);
      }

   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "969718402"
   )
   @Export("setCurrentMapAreaId")
   public void setCurrentMapAreaId(int var1) {
      WorldMapArea var2 = this.getMapArea(var1);
      if (var2 != null) {
         this.setCurrentMapArea(var2);
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "590617753"
   )
   @Export("currentMapAreaId")
   public int currentMapAreaId() {
      return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(I)Ljw;",
      garbageValue = "2112417348"
   )
   @Export("getCurrentMapArea")
   public WorldMapArea getCurrentMapArea() {
      return this.currentMapArea;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Ljw;I)V",
      garbageValue = "988679631"
   )
   @Export("setCurrentMapArea")
   void setCurrentMapArea(WorldMapArea var1) {
      if (this.currentMapArea == null || var1 != this.currentMapArea) {
         this.initializeWorldMap(var1);
         this.jump(-1, -1, -1);
      }
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljw;I)V",
      garbageValue = "791227663"
   )
   @Export("initializeWorldMap")
   void initializeWorldMap(WorldMapArea var1) {
      this.currentMapArea = var1;
      this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
      this.cacheLoader.reset(this.currentMapArea.getInternalName());
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljw;Llt;Llt;ZI)V",
      garbageValue = "-1039977514"
   )
   public void method8155(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-53"
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
         this.field4775 = null;
         this.iconIterator = null;
         this.worldMapRenderer.clearIcons();
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "72"
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
            if (var5 - this.field4773 > 100) {
               this.field4773 = var5;
               var10 = true;
            }

            this.worldMapRenderer.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4785, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
         }

         this.method8179(var1, var2, var3, var4, var8, var9);
         if (class72.method2055() && this.showCoord && this.mouseCoord != null) {
            this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
         }

         this.worldMapDisplayWidth = var8;
         this.worldMapDisplayHeight = var9;
         this.worldMapDisplayX = var1;
         this.worldMapDisplayY = var2;
         Rasterizer2D.Rasterizer2D_setClipArray(var6);
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)Z",
      garbageValue = "10"
   )
   boolean method8229(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.sprite == null) {
         return true;
      } else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
         if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
            return true;
         } else if (this.field4781 != Client.field574) {
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

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "2"
   )
   void method8179(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (Language.field4294 != null) {
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
         if (this.method8229(var8, var9, var13, var14, var3, var4)) {
            if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new SpritePixels(var8, var9);
            }

            this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
            this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
            this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
            Language.field4294.method6617(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
            this.field4781 = Client.field574;
            var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
            var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (var10 == 1.0F) {
            this.sprite.method9070(var13, var14, 192);
         } else {
            this.sprite.method9073(var13, var14, (int)((float)var8 * var10), (int)(var10 * (float)var9), 192);
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "121"
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

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-18934"
   )
   @Export("setZoomPercentage")
   public void setZoomPercentage(int var1) {
      this.zoomTarget = this.getZoomFromPercentage(var1);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "-1655837820"
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

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IB)F",
      garbageValue = "-123"
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

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "660432324"
   )
   @Export("getZoomLevel")
   public int getZoomLevel() {
      if ((double)this.zoomTarget == 1.0) {
         return 25;
      } else if ((double)this.zoomTarget == 1.5) {
         return 37;
      } else if ((double)this.zoomTarget == 2.0) {
         return 50;
      } else if (3.0 == (double)this.zoomTarget) {
         return 75;
      } else {
         return (double)this.zoomTarget == 4.0 ? 100 : 200;
      }
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "6"
   )
   @Export("loadCache")
   public void loadCache() {
      this.cacheLoader.load();
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1466638525"
   )
   @Export("isCacheLoaded")
   public boolean isCacheLoaded() {
      return this.cacheLoader.isLoaded();
   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(II)Ljw;",
      garbageValue = "-204024045"
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

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "244348496"
   )
   @Export("setWorldMapPositionTarget")
   public void setWorldMapPositionTarget(int var1, int var2) {
      if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
         this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
         this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
      }
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "985727239"
   )
   @Export("setWorldMapPositionTargetInstant")
   public void setWorldMapPositionTargetInstant(int var1, int var2) {
      if (this.currentMapArea != null) {
         this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "2121651269"
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

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-431369707"
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

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1446100785"
   )
   @Export("getDisplayX")
   public int getDisplayX() {
      return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-969457815"
   )
   @Export("getDisplayY")
   public int getDisplayY() {
      return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(I)Llt;",
      garbageValue = "-1982025531"
   )
   @Export("getDisplayCoord")
   public Coord getDisplayCoord() {
      return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
   }

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-692366939"
   )
   @Export("getDisplayWith")
   public int getDisplayWith() {
      return this.worldMapDisplayWidth;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1419463451"
   )
   @Export("getDisplayHeight")
   public int getDisplayHeight() {
      return this.worldMapDisplayHeight;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1678365351"
   )
   @Export("setMaxFlashCount")
   public void setMaxFlashCount(int var1) {
      if (var1 >= 1) {
         this.maxFlashCount = var1;
      }

   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-75484254"
   )
   @Export("resetMaxFlashCount")
   public void resetMaxFlashCount() {
      this.maxFlashCount = 3;
   }

   @ObfuscatedName("bu")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-418277678"
   )
   @Export("setCyclesPerFlash")
   public void setCyclesPerFlash(int var1) {
      if (var1 >= 1) {
         this.cyclesPerFlash = var1;
      }

   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "120"
   )
   @Export("resetCyclesPerFlash")
   public void resetCyclesPerFlash() {
      this.cyclesPerFlash = 50;
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1477201699"
   )
   @Export("setPerpetualFlash")
   public void setPerpetualFlash(boolean var1) {
      this.perpetualFlash = var1;
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1374482001"
   )
   @Export("flashElement")
   public void flashElement(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.flashCount = 0;
      this.flashCycle = 0;
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "2021613429"
   )
   @Export("flashCategory")
   public void flashCategory(int var1) {
      this.flashingElements = new HashSet();
      this.flashCount = 0;
      this.flashCycle = 0;

      for(int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
         if (class123.WorldMapElement_get(var2) != null && class123.WorldMapElement_get(var2).category == var1) {
            this.flashingElements.add(class123.WorldMapElement_get(var2).objectId);
         }
      }

   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "750185507"
   )
   @Export("stopCurrentFlashes")
   public void stopCurrentFlashes() {
      this.flashingElements = null;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-903357043"
   )
   @Export("setElementsDisabled")
   public void setElementsDisabled(boolean var1) {
      this.elementsDisabled = !var1;
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-1962477797"
   )
   @Export("disableElement")
   public void disableElement(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.method8119();
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-1219667447"
   )
   @Export("setCategoryDisabled")
   public void setCategoryDisabled(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for(int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
         if (class123.WorldMapElement_get(var3) != null && class123.WorldMapElement_get(var3).category == var1) {
            int var4 = class123.WorldMapElement_get(var3).objectId;
            if (!var2) {
               this.enabledElementIds.add(var4);
            } else {
               this.enabledElementIds.remove(var4);
            }
         }
      }

      this.method8119();
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-591484785"
   )
   @Export("getElementsDisabled")
   public boolean getElementsDisabled() {
      return !this.elementsDisabled;
   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "174661445"
   )
   @Export("isElementDisabled")
   public boolean isElementDisabled(int var1) {
      return !this.enabledElements.contains(var1);
   }

   @ObfuscatedName("cl")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1849490038"
   )
   @Export("isCategoryDisabled")
   public boolean isCategoryDisabled(int var1) {
      return !this.enabledCategories.contains(var1);
   }

   @ObfuscatedName("ca")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "14"
   )
   void method8119() {
      this.field4785.clear();
      this.field4785.addAll(this.enabledElements);
      this.field4785.addAll(this.enabledElementIds);
   }

   @ObfuscatedName("cb")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "110"
   )
   @Export("addElementMenuOptions")
   public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cacheLoader.isLoaded()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
         int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
         List var9 = this.worldMapRenderer.method5059(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
               WorldMapElement var12 = class123.WorldMapElement_get(var11.getElement());
               var13 = false;

               for(int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
                  if (var12.menuActions[var14] != null) {
                     class110.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("co")
   @ObfuscatedSignature(
      descriptor = "(ILlt;B)Llt;",
      garbageValue = "38"
   )
   public Coord method8121(int var1, Coord var2) {
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
      descriptor = "(IILlt;Llt;I)V",
      garbageValue = "1820281134"
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

      class9.runScriptEvent(var5);
   }

   @ObfuscatedName("cn")
   @ObfuscatedSignature(
      descriptor = "(I)Lku;",
      garbageValue = "-288373742"
   )
   @Export("iconStart")
   public AbstractWorldMapIcon iconStart() {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded()) {
         return null;
      } else {
         HashMap var1 = this.worldMapRenderer.buildIcons();
         this.field4775 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field4775.addAll(var3);
         }

         this.iconIterator = this.field4775.iterator();
         return this.iconNext();
      }
   }

   @ObfuscatedName("ce")
   @ObfuscatedSignature(
      descriptor = "(B)Lku;",
      garbageValue = "1"
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
