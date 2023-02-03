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

@ObfuscatedName("qf")
@Implements("WorldMap")
public class WorldMap {
   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   @Export("fontNameVerdana11")
   static final FontName fontNameVerdana11;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   @Export("fontNameVerdana13")
   static final FontName fontNameVerdana13;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lqy;"
   )
   @Export("fontNameVerdana15")
   static final FontName fontNameVerdana15;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("WorldMap_archive")
   AbstractArchive WorldMap_archive;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("WorldMap_geographyArchive")
   AbstractArchive WorldMap_geographyArchive;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lln;"
   )
   @Export("WorldMap_groundArchive")
   AbstractArchive WorldMap_groundArchive;
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lnv;"
   )
   @Export("font")
   Font font;
   @ObfuscatedName("m")
   @Export("fonts")
   HashMap fonts;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "[Lrg;"
   )
   @Export("mapSceneSprites")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("h")
   @Export("details")
   HashMap details;
   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   @Export("mainMapArea")
   WorldMapArea mainMapArea;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   @Export("currentMapArea")
   WorldMapArea currentMapArea;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lii;"
   )
   WorldMapArea field4775;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lic;"
   )
   @Export("worldMapRenderer")
   WorldMapRenderer worldMapRenderer;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lqz;"
   )
   @Export("cacheLoader")
   WorldMapArchiveLoader cacheLoader;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = -1537061305
   )
   @Export("centerTileX")
   int centerTileX;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = -1170014177
   )
   @Export("centerTileY")
   int centerTileY;
   @ObfuscatedName("e")
   @ObfuscatedGetter(
      intValue = -707664571
   )
   @Export("worldMapTargetX")
   int worldMapTargetX = -1;
   @ObfuscatedName("g")
   @ObfuscatedGetter(
      intValue = 574119903
   )
   @Export("worldMapTargetY")
   int worldMapTargetY = -1;
   @ObfuscatedName("y")
   @Export("zoom")
   float zoom;
   @ObfuscatedName("af")
   @Export("zoomTarget")
   float zoomTarget;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = -54302221
   )
   @Export("worldMapDisplayWidth")
   int worldMapDisplayWidth = -1;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 893627559
   )
   @Export("worldMapDisplayHeight")
   int worldMapDisplayHeight = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -1042774927
   )
   @Export("worldMapDisplayX")
   int worldMapDisplayX = -1;
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 213551861
   )
   @Export("worldMapDisplayY")
   int worldMapDisplayY = -1;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -2126009923
   )
   @Export("maxFlashCount")
   int maxFlashCount = 3;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 1428282463
   )
   @Export("cyclesPerFlash")
   int cyclesPerFlash = 50;
   @ObfuscatedName("at")
   @Export("perpetualFlash")
   boolean perpetualFlash = false;
   @ObfuscatedName("aj")
   @Export("flashingElements")
   HashSet flashingElements = null;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -588816537
   )
   @Export("flashCount")
   int flashCount = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1812932443
   )
   @Export("flashCycle")
   int flashCycle = -1;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = -364678207
   )
   int field4794 = -1;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = 24997925
   )
   int field4795 = -1;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1092313519
   )
   int field4796 = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -1057320749
   )
   int field4801 = -1;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      longValue = 5072112181657406691L
   )
   long field4797;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1078577369
   )
   int field4799;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = -1803960029
   )
   int field4800;
   @ObfuscatedName("ae")
   boolean field4787 = true;
   @ObfuscatedName("ab")
   @Export("enabledElements")
   HashSet enabledElements = new HashSet();
   @ObfuscatedName("an")
   @Export("enabledCategories")
   HashSet enabledCategories = new HashSet();
   @ObfuscatedName("am")
   @Export("enabledElementIds")
   HashSet enabledElementIds = new HashSet();
   @ObfuscatedName("as")
   HashSet field4805 = new HashSet();
   @ObfuscatedName("ao")
   @Export("elementsDisabled")
   boolean elementsDisabled = false;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -35562695
   )
   int field4798 = 0;
   @ObfuscatedName("bz")
   @Export("menuOpcodes")
   final int[] menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
   @ObfuscatedName("br")
   List field4809;
   @ObfuscatedName("bm")
   @Export("iconIterator")
   Iterator iconIterator;
   @ObfuscatedName("be")
   HashSet field4818 = new HashSet();
   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "Lko;"
   )
   @Export("mouseCoord")
   Coord mouseCoord = null;
   @ObfuscatedName("bl")
   @Export("showCoord")
   public boolean showCoord = false;
   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "Lrs;"
   )
   @Export("sprite")
   SpritePixels sprite;
   @ObfuscatedName("bn")
   @ObfuscatedGetter(
      intValue = -1567657197
   )
   @Export("cachedPixelsPerTile")
   int cachedPixelsPerTile;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = -443062895
   )
   @Export("minCachedTileX")
   int minCachedTileX = -1;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 198888267
   )
   @Export("minCachedTileY")
   int minCachedTileY = -1;
   @ObfuscatedName("bt")
   @ObfuscatedGetter(
      intValue = -1484417525
   )
   int field4816 = -1;

   static {
      fontNameVerdana11 = FontName.FontName_verdana11;
      fontNameVerdana13 = FontName.FontName_verdana13;
      fontNameVerdana15 = FontName.FontName_verdana15;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lln;Lln;Lln;Lnv;Ljava/util/HashMap;[Lrg;B)V",
      garbageValue = "34"
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
      int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3013.name);
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
      this.field4775 = null;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-48"
   )
   public void method8113() {
      World.method1830();
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIZIIIIB)V",
      garbageValue = "25"
   )
   @Export("onCycle")
   public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded()) {
         this.smoothZoom();
         this.scrollToTarget();
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
            int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
            List var10 = this.worldMapRenderer.method5156(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            AbstractWorldMapIcon var13;
            ScriptEvent var14;
            WorldMapEvent var15;
            for(var12 = var10.iterator(); var12.hasNext(); WorldMapAreaData.runScriptEvent(var14)) {
               var13 = (AbstractWorldMapIcon)var12.next();
               var11.add(var13);
               var14 = new ScriptEvent();
               var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
               var14.setArgs(new Object[]{var15, var1, var2});
               if (this.field4818.contains(var13)) {
                  var14.setType(17);
               } else {
                  var14.setType(15);
               }
            }

            var12 = this.field4818.iterator();

            while(var12.hasNext()) {
               var13 = (AbstractWorldMapIcon)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new ScriptEvent();
                  var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
                  var14.setArgs(new Object[]{var15, var1, var2});
                  var14.setType(16);
                  WorldMapAreaData.runScriptEvent(var14);
               }
            }

            this.field4818 = var11;
         }
      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIZZB)V",
      garbageValue = "-126"
   )
   public void method8115(int var1, int var2, boolean var3, boolean var4) {
      long var5;
      label41: {
         var5 = class153.method3317();
         this.method8149(var1, var2, var4, var5);
         if (!this.hasTarget() && (var4 || var3)) {
            boolean var7 = Client.clickedWidget != null;
            if (!var7) {
               if (var4) {
                  this.field4796 = var1;
                  this.field4801 = var2;
                  this.field4794 = this.centerTileX;
                  this.field4795 = this.centerTileY;
               }

               if (this.field4794 != -1) {
                  int var8 = var1 - this.field4796;
                  int var9 = var2 - this.field4801;
                  this.setWorldMapPosition(this.field4794 - (int)((float)var8 / this.zoomTarget), (int)((float)var9 / this.zoomTarget) + this.field4795, false);
               }
               break label41;
            }
         }

         this.method8120();
      }

      if (var4) {
         this.field4797 = var5;
         this.field4799 = var1;
         this.field4800 = var2;
      }

   }

   @ObfuscatedName("z")
   void method8149(int var1, int var2, boolean var3, long var4) {
      if (this.currentMapArea != null) {
         int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
         int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
         this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
         if (this.mouseCoord != null && var3) {
            class205 var8 = Client.field702;
            boolean var10 = Client.staffModLevel >= 2;
            if (var10 && var8.method4143(82) && var8.method4143(81)) {
               class168.method3487(this.mouseCoord.x, this.mouseCoord.y, this.mouseCoord.plane, false);
            } else {
               boolean var11 = true;
               if (this.field4787) {
                  int var12 = var1 - this.field4799;
                  int var13 = var2 - this.field4800;
                  if (var4 - this.field4797 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
                     var11 = false;
                  }
               }

               if (var11) {
                  PacketBufferNode var14 = Renderable.getPacketBufferNode(ClientPacket.field3073, Client.packetWriter.isaacCipher);
                  var14.packetBuffer.writeIntIME(this.mouseCoord.packed());
                  Client.packetWriter.addNode(var14);
                  this.field4797 = 0L;
               }
            }
         }
      } else {
         this.mouseCoord = null;
      }

   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-93072878"
   )
   @Export("smoothZoom")
   void smoothZoom() {
      if (class136.field1633 != null) {
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

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "14"
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
         if (this.worldMapTargetX == this.centerTileX && this.centerTileY == this.worldMapTargetY) {
            this.worldMapTargetX = -1;
            this.worldMapTargetY = -1;
         }

      }
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIZI)V",
      garbageValue = "16777215"
   )
   @Export("setWorldMapPosition")
   final void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.centerTileX = var1;
      this.centerTileY = var2;
      class153.method3317();
      if (var3) {
         this.method8120();
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-551839852"
   )
   final void method8120() {
      this.field4801 = -1;
      this.field4796 = -1;
      this.field4795 = -1;
      this.field4794 = -1;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-927578331"
   )
   @Export("hasTarget")
   boolean hasTarget() {
      return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lii;",
      garbageValue = "1229700088"
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

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IIIZB)V",
      garbageValue = "60"
   )
   public void method8306(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.mainMapArea;
      }

      boolean var6 = false;
      if (var5 != this.field4775 || var4) {
         this.field4775 = var5;
         this.setCurrentMapArea(var5);
         var6 = true;
      }

      if (var6 || var4) {
         this.jump(var1, var2, var3);
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "457504951"
   )
   @Export("setCurrentMapAreaId")
   public void setCurrentMapAreaId(int var1) {
      WorldMapArea var2 = this.getMapArea(var1);
      if (var2 != null) {
         this.setCurrentMapArea(var2);
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1557630063"
   )
   @Export("currentMapAreaId")
   public int currentMapAreaId() {
      return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(I)Lii;",
      garbageValue = "-1507356521"
   )
   @Export("getCurrentMapArea")
   public WorldMapArea getCurrentMapArea() {
      return this.currentMapArea;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lii;B)V",
      garbageValue = "-52"
   )
   @Export("setCurrentMapArea")
   void setCurrentMapArea(WorldMapArea var1) {
      if (this.currentMapArea == null || var1 != this.currentMapArea) {
         this.initializeWorldMap(var1);
         this.jump(-1, -1, -1);
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Lii;I)V",
      garbageValue = "-1465346013"
   )
   @Export("initializeWorldMap")
   void initializeWorldMap(WorldMapArea var1) {
      this.currentMapArea = var1;
      this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
      this.cacheLoader.reset(this.currentMapArea.getInternalName());
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Lii;Lko;Lko;ZI)V",
      garbageValue = "-1866070089"
   )
   public void method8298(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "919622634"
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
         this.field4809 = null;
         this.iconIterator = null;
         this.worldMapRenderer.clearIcons();
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "-93"
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
         AbstractWorldMapData.field2951 = Client.field505 >= 209;
         this.worldMapRenderer.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
         boolean var10;
         if (!this.elementsDisabled) {
            var10 = false;
            if (var5 - this.field4798 > 100) {
               this.field4798 = var5;
               var10 = true;
            }

            this.worldMapRenderer.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4805, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
         }

         this.method8133(var1, var2, var3, var4, var8, var9);
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

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)Z",
      garbageValue = "2017068327"
   )
   boolean method8132(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.sprite == null) {
         return true;
      } else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
         if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
            return true;
         } else if (this.field4816 != Client.field796) {
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

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "-1125583707"
   )
   void method8133(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (class136.field1633 != null) {
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
         if (this.method8132(var8, var9, var13, var14, var3, var4)) {
            if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new SpritePixels(var8, var9);
            }

            this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
            this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
            this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
            class136.field1633.method6760(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
            this.field4816 = Client.field796;
            var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
            var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (var10 == 1.0F) {
            this.sprite.method9149(var13, var14, 192);
         } else {
            this.sprite.method9112(var13, var14, (int)((float)var8 * var10), (int)((float)var9 * var10), 192);
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "47"
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

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "-15"
   )
   @Export("setZoomPercentage")
   public void setZoomPercentage(int var1) {
      this.zoomTarget = this.getZoomFromPercentage(var1);
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "-649934539"
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

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "-961955181"
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

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1942588571"
   )
   @Export("getZoomLevel")
   public int getZoomLevel() {
      if (1.0 == (double)this.zoomTarget) {
         return 25;
      } else if ((double)this.zoomTarget == 1.5) {
         return 37;
      } else if (2.0 == (double)this.zoomTarget) {
         return 50;
      } else if (3.0 == (double)this.zoomTarget) {
         return 75;
      } else {
         return 4.0 == (double)this.zoomTarget ? 100 : 200;
      }
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2119000297"
   )
   @Export("loadCache")
   public void loadCache() {
      this.cacheLoader.load();
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "7"
   )
   @Export("isCacheLoaded")
   public boolean isCacheLoaded() {
      return this.cacheLoader.isLoaded();
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(II)Lii;",
      garbageValue = "-146016730"
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

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "-68"
   )
   @Export("setWorldMapPositionTarget")
   public void setWorldMapPositionTarget(int var1, int var2) {
      if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
         this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
         this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "2031555898"
   )
   @Export("setWorldMapPositionTargetInstant")
   public void setWorldMapPositionTargetInstant(int var1, int var2) {
      if (this.currentMapArea != null) {
         this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIIS)V",
      garbageValue = "-6727"
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

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "1578409200"
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

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1087726374"
   )
   @Export("getDisplayX")
   public int getDisplayX() {
      return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-114"
   )
   @Export("getDisplayY")
   public int getDisplayY() {
      return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(B)Lko;",
      garbageValue = "0"
   )
   @Export("getDisplayCoord")
   public Coord getDisplayCoord() {
      return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1696300360"
   )
   @Export("getDisplayWith")
   public int getDisplayWith() {
      return this.worldMapDisplayWidth;
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "-12"
   )
   @Export("getDisplayHeight")
   public int getDisplayHeight() {
      return this.worldMapDisplayHeight;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1687867671"
   )
   @Export("setMaxFlashCount")
   public void setMaxFlashCount(int var1) {
      if (var1 >= 1) {
         this.maxFlashCount = var1;
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-269686963"
   )
   @Export("resetMaxFlashCount")
   public void resetMaxFlashCount() {
      this.maxFlashCount = 3;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "468851874"
   )
   @Export("setCyclesPerFlash")
   public void setCyclesPerFlash(int var1) {
      if (var1 >= 1) {
         this.cyclesPerFlash = var1;
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-118"
   )
   @Export("resetCyclesPerFlash")
   public void resetCyclesPerFlash() {
      this.cyclesPerFlash = 50;
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "1156633968"
   )
   @Export("setPerpetualFlash")
   public void setPerpetualFlash(boolean var1) {
      this.perpetualFlash = var1;
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "11"
   )
   @Export("flashElement")
   public void flashElement(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.flashCount = 0;
      this.flashCycle = 0;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1867265492"
   )
   @Export("flashCategory")
   public void flashCategory(int var1) {
      this.flashingElements = new HashSet();
      this.flashCount = 0;
      this.flashCycle = 0;

      for(int var2 = 0; var2 < class361.WorldMapElement_count; ++var2) {
         if (class4.WorldMapElement_get(var2) != null && class4.WorldMapElement_get(var2).category == var1) {
            this.flashingElements.add(class4.WorldMapElement_get(var2).objectId);
         }
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-998180334"
   )
   @Export("stopCurrentFlashes")
   public void stopCurrentFlashes() {
      this.flashingElements = null;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "-1449129322"
   )
   @Export("setElementsDisabled")
   public void setElementsDisabled(boolean var1) {
      this.elementsDisabled = !var1;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "1064049912"
   )
   @Export("disableElement")
   public void disableElement(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.method8165();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IZS)V",
      garbageValue = "26480"
   )
   @Export("setCategoryDisabled")
   public void setCategoryDisabled(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for(int var3 = 0; var3 < class361.WorldMapElement_count; ++var3) {
         if (class4.WorldMapElement_get(var3) != null && class4.WorldMapElement_get(var3).category == var1) {
            int var4 = class4.WorldMapElement_get(var3).objectId;
            if (!var2) {
               this.enabledElementIds.add(var4);
            } else {
               this.enabledElementIds.remove(var4);
            }
         }
      }

      this.method8165();
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "2073114555"
   )
   @Export("getElementsDisabled")
   public boolean getElementsDisabled() {
      return !this.elementsDisabled;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1249266830"
   )
   @Export("isElementDisabled")
   public boolean isElementDisabled(int var1) {
      return !this.enabledElements.contains(var1);
   }

   @ObfuscatedName("bj")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1383476360"
   )
   @Export("isCategoryDisabled")
   public boolean isCategoryDisabled(int var1) {
      return !this.enabledCategories.contains(var1);
   }

   @ObfuscatedName("bf")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "31"
   )
   void method8165() {
      this.field4805.clear();
      this.field4805.addAll(this.enabledElements);
      this.field4805.addAll(this.enabledElementIds);
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "51725757"
   )
   @Export("addElementMenuOptions")
   public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cacheLoader.isLoaded()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
         int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
         List var9 = this.worldMapRenderer.method5156(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
               WorldMapElement var12 = class4.WorldMapElement_get(var11.getElement());
               var13 = false;

               for(int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
                  if (var12.menuActions[var14] != null) {
                     WorldMapRenderer.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(ILko;B)Lko;",
      garbageValue = "91"
   )
   public Coord method8114(int var1, Coord var2) {
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

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(IILko;Lko;I)V",
      garbageValue = "-1523313738"
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

      WorldMapAreaData.runScriptEvent(var5);
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(I)Lio;",
      garbageValue = "1232678817"
   )
   @Export("iconStart")
   public AbstractWorldMapIcon iconStart() {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded()) {
         return null;
      } else {
         HashMap var1 = this.worldMapRenderer.buildIcons();
         this.field4809 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field4809.addAll(var3);
         }

         this.iconIterator = this.field4809.iterator();
         return this.iconNext();
      }
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(I)Lio;",
      garbageValue = "-444518880"
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
