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

@ObfuscatedName("pb")
@Implements("WorldMap")
public class WorldMap {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("fontNameVerdana11")
   static final FontName fontNameVerdana11;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("fontNameVerdana13")
   static final FontName fontNameVerdana13;
   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "Lpt;"
   )
   @Export("fontNameVerdana15")
   static final FontName fontNameVerdana15;
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("WorldMap_archive")
   AbstractArchive WorldMap_archive;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("WorldMap_geographyArchive")
   AbstractArchive WorldMap_geographyArchive;
   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "Lly;"
   )
   @Export("WorldMap_groundArchive")
   AbstractArchive WorldMap_groundArchive;
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lnv;"
   )
   @Export("font")
   Font font;
   @ObfuscatedName("o")
   @Export("fonts")
   HashMap fonts;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "[Lra;"
   )
   @Export("mapSceneSprites")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("k")
   @Export("details")
   HashMap details;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Lit;"
   )
   @Export("mainMapArea")
   WorldMapArea mainMapArea;
   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "Lit;"
   )
   @Export("currentMapArea")
   WorldMapArea currentMapArea;
   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "Lit;"
   )
   WorldMapArea field4751;
   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "Lie;"
   )
   @Export("worldMapRenderer")
   WorldMapRenderer worldMapRenderer;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Lpc;"
   )
   @Export("cacheLoader")
   WorldMapArchiveLoader cacheLoader;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1773386225
   )
   @Export("centerTileX")
   int centerTileX;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 748703383
   )
   @Export("centerTileY")
   int centerTileY;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -1619468445
   )
   @Export("worldMapTargetX")
   int worldMapTargetX = -1;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -501054007
   )
   @Export("worldMapTargetY")
   int worldMapTargetY = -1;
   @ObfuscatedName("w")
   @Export("zoom")
   float zoom;
   @ObfuscatedName("as")
   @Export("zoomTarget")
   float zoomTarget;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -1355078825
   )
   @Export("worldMapDisplayWidth")
   int worldMapDisplayWidth = -1;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -755638967
   )
   @Export("worldMapDisplayHeight")
   int worldMapDisplayHeight = -1;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1296170399
   )
   @Export("worldMapDisplayX")
   int worldMapDisplayX = -1;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = -726353325
   )
   @Export("worldMapDisplayY")
   int worldMapDisplayY = -1;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1724975033
   )
   @Export("maxFlashCount")
   int maxFlashCount = 3;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = 1777796537
   )
   @Export("cyclesPerFlash")
   int cyclesPerFlash = 50;
   @ObfuscatedName("at")
   @Export("perpetualFlash")
   boolean perpetualFlash = false;
   @ObfuscatedName("ay")
   @Export("flashingElements")
   HashSet flashingElements = null;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -573659203
   )
   @Export("flashCount")
   int flashCount = -1;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = 1835981575
   )
   @Export("flashCycle")
   int flashCycle = -1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -92688065
   )
   int field4772 = -1;
   @ObfuscatedName("ag")
   @ObfuscatedGetter(
      intValue = -201245539
   )
   int field4771 = -1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -1222606143
   )
   int field4793 = -1;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 1330753451
   )
   int field4773 = -1;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = 1000609109570499235L
   )
   long field4774;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 2020869527
   )
   int field4788;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1001833691
   )
   int field4776;
   @ObfuscatedName("ah")
   boolean field4777 = true;
   @ObfuscatedName("aq")
   @Export("enabledElements")
   HashSet enabledElements = new HashSet();
   @ObfuscatedName("ap")
   @Export("enabledCategories")
   HashSet enabledCategories = new HashSet();
   @ObfuscatedName("aa")
   @Export("enabledElementIds")
   HashSet enabledElementIds = new HashSet();
   @ObfuscatedName("ae")
   HashSet field4782 = new HashSet();
   @ObfuscatedName("ac")
   @Export("elementsDisabled")
   boolean elementsDisabled = false;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = -1283663091
   )
   int field4784 = 0;
   @ObfuscatedName("bf")
   @Export("menuOpcodes")
   final int[] menuOpcodes = new int[]{1008, 1009, 1010, 1011, 1012};
   @ObfuscatedName("bo")
   List field4786;
   @ObfuscatedName("by")
   @Export("iconIterator")
   Iterator iconIterator;
   @ObfuscatedName("bw")
   HashSet field4780 = new HashSet();
   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   @Export("mouseCoord")
   Coord mouseCoord = null;
   @ObfuscatedName("bc")
   @Export("showCoord")
   public boolean showCoord = false;
   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "Lrx;"
   )
   @Export("sprite")
   SpritePixels sprite;
   @ObfuscatedName("bv")
   @ObfuscatedGetter(
      intValue = 157893557
   )
   @Export("cachedPixelsPerTile")
   int cachedPixelsPerTile;
   @ObfuscatedName("bx")
   @ObfuscatedGetter(
      intValue = -957451687
   )
   @Export("minCachedTileX")
   int minCachedTileX = -1;
   @ObfuscatedName("bg")
   @ObfuscatedGetter(
      intValue = 1345620925
   )
   @Export("minCachedTileY")
   int minCachedTileY = -1;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = -1786908065
   )
   int field4779 = -1;

   static {
      fontNameVerdana11 = FontName.FontName_verdana11;
      fontNameVerdana13 = FontName.FontName_verdana13;
      fontNameVerdana15 = FontName.FontName_verdana15;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;Lly;Lly;Lnv;Ljava/util/HashMap;[Lra;I)V",
      garbageValue = "1665959363"
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
      int var7 = this.WorldMap_archive.getGroupId(WorldMapCacheName.field3010.name);
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
      this.field4751 = null;
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "65"
   )
   public void method7989() {
      WorldMapRegion.WorldMapRegion_cachedSprites.demote(5);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIZIIIIB)V",
      garbageValue = "-80"
   )
   @Export("onCycle")
   public void onCycle(int var1, int var2, boolean var3, int var4, int var5, int var6, int var7) {
      if (this.cacheLoader.isLoaded()) {
         this.smoothZoom();
         this.scrollToTarget();
         if (var3) {
            int var8 = (int)Math.ceil((double)((float)var6 / this.zoom));
            int var9 = (int)Math.ceil((double)((float)var7 / this.zoom));
            List var10 = this.worldMapRenderer.method5108(this.centerTileX - var8 / 2 - 1, this.centerTileY - var9 / 2 - 1, var8 / 2 + this.centerTileX + 1, var9 / 2 + this.centerTileY + 1, var4, var5, var6, var7, var1, var2);
            HashSet var11 = new HashSet();

            Iterator var12;
            AbstractWorldMapIcon var13;
            ScriptEvent var14;
            WorldMapEvent var15;
            for(var12 = var10.iterator(); var12.hasNext(); WorldMapElement.runScriptEvent(var14)) {
               var13 = (AbstractWorldMapIcon)var12.next();
               var11.add(var13);
               var14 = new ScriptEvent();
               var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
               var14.setArgs(new Object[]{var15, var1, var2});
               if (this.field4780.contains(var13)) {
                  var14.setType(17);
               } else {
                  var14.setType(15);
               }
            }

            var12 = this.field4780.iterator();

            while(var12.hasNext()) {
               var13 = (AbstractWorldMapIcon)var12.next();
               if (!var11.contains(var13)) {
                  var14 = new ScriptEvent();
                  var15 = new WorldMapEvent(var13.getElement(), var13.coord1, var13.coord2);
                  var14.setArgs(new Object[]{var15, var1, var2});
                  var14.setType(16);
                  WorldMapElement.runScriptEvent(var14);
               }
            }

            this.field4780 = var11;
         }
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIZZI)V",
      garbageValue = "2093168395"
   )
   public void method7991(int var1, int var2, boolean var3, boolean var4) {
      long var5 = Message.method1197();
      this.method7992(var1, var2, var4, var5);
      if (!this.hasTarget() && (var4 || var3) && !class213.method4420()) {
         if (var4) {
            this.field4793 = var1;
            this.field4773 = var2;
            this.field4772 = this.centerTileX;
            this.field4771 = this.centerTileY;
         }

         if (this.field4772 != -1) {
            int var7 = var1 - this.field4793;
            int var8 = var2 - this.field4773;
            this.setWorldMapPosition(this.field4772 - (int)((float)var7 / this.zoomTarget), (int)((float)var8 / this.zoomTarget) + this.field4771, false);
         }
      } else {
         this.method7996();
      }

      if (var4) {
         this.field4774 = var5;
         this.field4788 = var1;
         this.field4776 = var2;
      }

   }

   @ObfuscatedName("m")
   void method7992(int var1, int var2, boolean var3, long var4) {
      if (this.currentMapArea != null) {
         int var6 = (int)((float)this.centerTileX + ((float)(var1 - this.worldMapDisplayX) - (float)this.getDisplayWith() * this.zoom / 2.0F) / this.zoom);
         int var7 = (int)((float)this.centerTileY - ((float)(var2 - this.worldMapDisplayY) - (float)this.getDisplayHeight() * this.zoom / 2.0F) / this.zoom);
         this.mouseCoord = this.currentMapArea.coord(var6 + this.currentMapArea.getRegionLowX() * 64, var7 + this.currentMapArea.getRegionLowY() * 64);
         if (this.mouseCoord != null && var3) {
            class201 var8 = Client.field747;
            int var11;
            int var12;
            if (TaskHandler.method3443() && var8.method4106(82) && var8.method4106(81)) {
               int var15 = this.mouseCoord.x;
               var11 = this.mouseCoord.y;
               var12 = this.mouseCoord.plane;
               PacketBufferNode var13 = class136.getPacketBufferNode(ClientPacket.field3120, Client.packetWriter.isaacCipher);
               var13.packetBuffer.writeShortLE(var11);
               var13.packetBuffer.writeByteAdd(var12);
               var13.packetBuffer.writeShortAdd(var15);
               var13.packetBuffer.writeIntME(0);
               Client.packetWriter.addNode(var13);
            } else {
               boolean var10 = true;
               if (this.field4777) {
                  var11 = var1 - this.field4788;
                  var12 = var2 - this.field4776;
                  if (var4 - this.field4774 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                     var10 = false;
                  }
               }

               if (var10) {
                  PacketBufferNode var14 = class136.getPacketBufferNode(ClientPacket.field3108, Client.packetWriter.isaacCipher);
                  var14.packetBuffer.writeInt(this.mouseCoord.packed());
                  Client.packetWriter.addNode(var14);
                  this.field4774 = 0L;
               }
            }
         }
      } else {
         this.mouseCoord = null;
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2010500013"
   )
   @Export("smoothZoom")
   void smoothZoom() {
      if (GameEngine.field241 != null) {
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

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "90"
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

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(IIZB)V",
      garbageValue = "-91"
   )
   @Export("setWorldMapPosition")
   final void setWorldMapPosition(int var1, int var2, boolean var3) {
      this.centerTileX = var1;
      this.centerTileY = var2;
      Message.method1197();
      if (var3) {
         this.method7996();
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-29"
   )
   final void method7996() {
      this.field4773 = -1;
      this.field4793 = -1;
      this.field4771 = -1;
      this.field4772 = -1;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "-1536679262"
   )
   @Export("hasTarget")
   boolean hasTarget() {
      return this.worldMapTargetX != -1 && this.worldMapTargetY != -1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IIII)Lit;",
      garbageValue = "-1244310700"
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

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IIIZB)V",
      garbageValue = "-45"
   )
   public void method7999(int var1, int var2, int var3, boolean var4) {
      WorldMapArea var5 = this.mapAreaAtCoord(var1, var2, var3);
      if (var5 == null) {
         if (!var4) {
            return;
         }

         var5 = this.mainMapArea;
      }

      boolean var6 = false;
      if (var5 != this.field4751 || var4) {
         this.field4751 = var5;
         this.setCurrentMapArea(var5);
         var6 = true;
      }

      if (var6 || var4) {
         this.jump(var1, var2, var3);
      }

   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-507902482"
   )
   @Export("setCurrentMapAreaId")
   public void setCurrentMapAreaId(int var1) {
      WorldMapArea var2 = this.getMapArea(var1);
      if (var2 != null) {
         this.setCurrentMapArea(var2);
      }

   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "721663049"
   )
   @Export("currentMapAreaId")
   public int currentMapAreaId() {
      return this.currentMapArea == null ? -1 : this.currentMapArea.getId();
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Lit;",
      garbageValue = "-1298329417"
   )
   @Export("getCurrentMapArea")
   public WorldMapArea getCurrentMapArea() {
      return this.currentMapArea;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Lit;I)V",
      garbageValue = "182380675"
   )
   @Export("setCurrentMapArea")
   void setCurrentMapArea(WorldMapArea var1) {
      if (this.currentMapArea == null || var1 != this.currentMapArea) {
         this.initializeWorldMap(var1);
         this.jump(-1, -1, -1);
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Lit;I)V",
      garbageValue = "-728911285"
   )
   @Export("initializeWorldMap")
   void initializeWorldMap(WorldMapArea var1) {
      this.currentMapArea = var1;
      this.worldMapRenderer = new WorldMapRenderer(this.mapSceneSprites, this.fonts, this.WorldMap_geographyArchive, this.WorldMap_groundArchive);
      this.cacheLoader.reset(this.currentMapArea.getInternalName());
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Lit;Lky;Lky;ZB)V",
      garbageValue = "-23"
   )
   public void method8046(WorldMapArea var1, Coord var2, Coord var3, boolean var4) {
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

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-27723907"
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
         this.field4786 = null;
         this.iconIterator = null;
         this.worldMapRenderer.clearIcons();
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)V",
      garbageValue = "12"
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
         AbstractWorldMapData.field2953 = Client.field515 >= 209;
         this.worldMapRenderer.drawTiles(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4);
         if (!this.elementsDisabled) {
            boolean var10 = false;
            if (var5 - this.field4784 > 100) {
               this.field4784 = var5;
               var10 = true;
            }

            this.worldMapRenderer.drawElements(this.centerTileX - var8 / 2, this.centerTileY - var9 / 2, var8 / 2 + this.centerTileX, var9 / 2 + this.centerTileY, var1, var2, var3 + var1, var2 + var4, this.field4782, this.flashingElements, this.flashCycle, this.cyclesPerFlash, var10);
         }

         this.method8033(var1, var2, var3, var4, var8, var9);
         if (TaskHandler.method3443() && this.showCoord && this.mouseCoord != null) {
            this.font.draw("Coord: " + this.mouseCoord, Rasterizer2D.Rasterizer2D_xClipStart + 10, Rasterizer2D.Rasterizer2D_yClipStart + 20, 16776960, -1);
         }

         this.worldMapDisplayWidth = var8;
         this.worldMapDisplayHeight = var9;
         this.worldMapDisplayX = var1;
         this.worldMapDisplayY = var2;
         Rasterizer2D.Rasterizer2D_setClipArray(var6);
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)Z",
      garbageValue = "433512855"
   )
   boolean method8072(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.sprite == null) {
         return true;
      } else if (this.sprite.subWidth == var1 && this.sprite.subHeight == var2) {
         if (this.worldMapRenderer.pixelsPerTile != this.cachedPixelsPerTile) {
            return true;
         } else if (this.field4779 != Client.field801) {
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

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIB)V",
      garbageValue = "48"
   )
   void method8033(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (GameEngine.field241 != null) {
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
         if (this.method8072(var8, var9, var13, var14, var3, var4)) {
            if (this.sprite != null && this.sprite.subWidth == var8 && this.sprite.subHeight == var9) {
               Arrays.fill(this.sprite.pixels, 0);
            } else {
               this.sprite = new SpritePixels(var8, var9);
            }

            this.minCachedTileX = this.getDisplayX() - var5 / 2 - var7;
            this.minCachedTileY = this.getDisplayY() - var6 / 2 - var7;
            this.cachedPixelsPerTile = this.worldMapRenderer.pixelsPerTile;
            GameEngine.field241.method6668(this.minCachedTileX, this.minCachedTileY, this.sprite, (float)this.cachedPixelsPerTile / var10);
            this.field4779 = Client.field801;
            var13 = var1 - (var7 + var11 - this.minCachedTileX) * this.worldMapRenderer.pixelsPerTile;
            var14 = var2 - this.worldMapRenderer.pixelsPerTile * (var7 - (var12 - this.minCachedTileY));
         }

         Rasterizer2D.Rasterizer2D_fillRectangleAlpha(var1, var2, var3, var4, 0, 128);
         if (var10 == 1.0F) {
            this.sprite.method9022(var13, var14, 192);
         } else {
            this.sprite.method9024(var13, var14, (int)(var10 * (float)var8), (int)((float)var9 * var10), 192);
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IIIIS)V",
      garbageValue = "6700"
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

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "300290373"
   )
   @Export("setZoomPercentage")
   public void setZoomPercentage(int var1) {
      this.zoomTarget = this.getZoomFromPercentage(var1);
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "1152100668"
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

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(II)F",
      garbageValue = "-637752024"
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

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   @Export("getZoomLevel")
   public int getZoomLevel() {
      if ((double)this.zoomTarget == 1.0) {
         return 25;
      } else if (1.5 == (double)this.zoomTarget) {
         return 37;
      } else if ((double)this.zoomTarget == 2.0) {
         return 50;
      } else if ((double)this.zoomTarget == 3.0) {
         return 75;
      } else {
         return (double)this.zoomTarget == 4.0 ? 100 : 200;
      }
   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "147"
   )
   @Export("loadCache")
   public void loadCache() {
      this.cacheLoader.load();
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "116"
   )
   @Export("isCacheLoaded")
   public boolean isCacheLoaded() {
      return this.cacheLoader.isLoaded();
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(II)Lit;",
      garbageValue = "-57693524"
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1268402708"
   )
   @Export("setWorldMapPositionTarget")
   public void setWorldMapPositionTarget(int var1, int var2) {
      if (this.currentMapArea != null && this.currentMapArea.containsPosition(var1, var2)) {
         this.worldMapTargetX = var1 - this.currentMapArea.getRegionLowX() * 64;
         this.worldMapTargetY = var2 - this.currentMapArea.getRegionLowY() * 64;
      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIS)V",
      garbageValue = "8633"
   )
   @Export("setWorldMapPositionTargetInstant")
   public void setWorldMapPositionTargetInstant(int var1, int var2) {
      if (this.currentMapArea != null) {
         this.setWorldMapPosition(var1 - this.currentMapArea.getRegionLowX() * 64, var2 - this.currentMapArea.getRegionLowY() * 64, true);
         this.worldMapTargetX = -1;
         this.worldMapTargetY = -1;
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-117"
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
      garbageValue = "-806221160"
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

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1261069561"
   )
   @Export("getDisplayX")
   public int getDisplayX() {
      return this.currentMapArea == null ? -1 : this.centerTileX + this.currentMapArea.getRegionLowX() * 64;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1276143435"
   )
   @Export("getDisplayY")
   public int getDisplayY() {
      return this.currentMapArea == null ? -1 : this.centerTileY + this.currentMapArea.getRegionLowY() * 64;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)Lky;",
      garbageValue = "-2028629896"
   )
   @Export("getDisplayCoord")
   public Coord getDisplayCoord() {
      return this.currentMapArea == null ? null : this.currentMapArea.coord(this.getDisplayX(), this.getDisplayY());
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "32"
   )
   @Export("getDisplayWith")
   public int getDisplayWith() {
      return this.worldMapDisplayWidth;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1743365451"
   )
   @Export("getDisplayHeight")
   public int getDisplayHeight() {
      return this.worldMapDisplayHeight;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "223954080"
   )
   @Export("setMaxFlashCount")
   public void setMaxFlashCount(int var1) {
      if (var1 >= 1) {
         this.maxFlashCount = var1;
      }

   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2095954039"
   )
   @Export("resetMaxFlashCount")
   public void resetMaxFlashCount() {
      this.maxFlashCount = 3;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1433856444"
   )
   @Export("setCyclesPerFlash")
   public void setCyclesPerFlash(int var1) {
      if (var1 >= 1) {
         this.cyclesPerFlash = var1;
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "123012858"
   )
   @Export("resetCyclesPerFlash")
   public void resetCyclesPerFlash() {
      this.cyclesPerFlash = 50;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(ZB)V",
      garbageValue = "73"
   )
   @Export("setPerpetualFlash")
   public void setPerpetualFlash(boolean var1) {
      this.perpetualFlash = var1;
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "51"
   )
   @Export("flashElement")
   public void flashElement(int var1) {
      this.flashingElements = new HashSet();
      this.flashingElements.add(var1);
      this.flashCount = 0;
      this.flashCycle = 0;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-22102173"
   )
   @Export("flashCategory")
   public void flashCategory(int var1) {
      this.flashingElements = new HashSet();
      this.flashCount = 0;
      this.flashCycle = 0;

      for(int var2 = 0; var2 < WorldMapElement.WorldMapElement_count; ++var2) {
         if (JagexCache.WorldMapElement_get(var2) != null && JagexCache.WorldMapElement_get(var2).category == var1) {
            this.flashingElements.add(JagexCache.WorldMapElement_get(var2).objectId);
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "684707173"
   )
   @Export("stopCurrentFlashes")
   public void stopCurrentFlashes() {
      this.flashingElements = null;
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "532970017"
   )
   @Export("setElementsDisabled")
   public void setElementsDisabled(boolean var1) {
      this.elementsDisabled = !var1;
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IZB)V",
      garbageValue = "96"
   )
   @Export("disableElement")
   public void disableElement(int var1, boolean var2) {
      if (!var2) {
         this.enabledElements.add(var1);
      } else {
         this.enabledElements.remove(var1);
      }

      this.method8039();
   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IZI)V",
      garbageValue = "-1240383001"
   )
   @Export("setCategoryDisabled")
   public void setCategoryDisabled(int var1, boolean var2) {
      if (!var2) {
         this.enabledCategories.add(var1);
      } else {
         this.enabledCategories.remove(var1);
      }

      for(int var3 = 0; var3 < WorldMapElement.WorldMapElement_count; ++var3) {
         if (JagexCache.WorldMapElement_get(var3) != null && JagexCache.WorldMapElement_get(var3).category == var1) {
            int var4 = JagexCache.WorldMapElement_get(var3).objectId;
            if (!var2) {
               this.enabledElementIds.add(var4);
            } else {
               this.enabledElementIds.remove(var4);
            }
         }
      }

      this.method8039();
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(S)Z",
      garbageValue = "31025"
   )
   @Export("getElementsDisabled")
   public boolean getElementsDisabled() {
      return !this.elementsDisabled;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "741756632"
   )
   @Export("isElementDisabled")
   public boolean isElementDisabled(int var1) {
      return !this.enabledElements.contains(var1);
   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "16"
   )
   @Export("isCategoryDisabled")
   public boolean isCategoryDisabled(int var1) {
      return !this.enabledCategories.contains(var1);
   }

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1750164070"
   )
   void method8039() {
      this.field4782.clear();
      this.field4782.addAll(this.enabledElements);
      this.field4782.addAll(this.enabledElementIds);
   }

   @ObfuscatedName("bw")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)V",
      garbageValue = "345816891"
   )
   @Export("addElementMenuOptions")
   public void addElementMenuOptions(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (this.cacheLoader.isLoaded()) {
         int var7 = (int)Math.ceil((double)((float)var3 / this.zoom));
         int var8 = (int)Math.ceil((double)((float)var4 / this.zoom));
         List var9 = this.worldMapRenderer.method5108(this.centerTileX - var7 / 2 - 1, this.centerTileY - var8 / 2 - 1, var7 / 2 + this.centerTileX + 1, var8 / 2 + this.centerTileY + 1, var1, var2, var3, var4, var5, var6);
         if (!var9.isEmpty()) {
            Iterator var10 = var9.iterator();

            boolean var13;
            do {
               if (!var10.hasNext()) {
                  return;
               }

               AbstractWorldMapIcon var11 = (AbstractWorldMapIcon)var10.next();
               WorldMapElement var12 = JagexCache.WorldMapElement_get(var11.getElement());
               var13 = false;

               for(int var14 = this.menuOpcodes.length - 1; var14 >= 0; --var14) {
                  if (var12.menuActions[var14] != null) {
                     ObjectSound.insertMenuItemNoShift(var12.menuActions[var14], var12.menuTargetName, this.menuOpcodes[var14], var11.getElement(), var11.coord1.packed(), var11.coord2.packed());
                     var13 = true;
                  }
               }
            } while(!var13);

         }
      }
   }

   @ObfuscatedName("bp")
   @ObfuscatedSignature(
      descriptor = "(ILky;I)Lky;",
      garbageValue = "1663996992"
   )
   public Coord method8041(int var1, Coord var2) {
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

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(IILky;Lky;I)V",
      garbageValue = "334077152"
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

      WorldMapElement.runScriptEvent(var5);
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(I)Lix;",
      garbageValue = "1603094093"
   )
   @Export("iconStart")
   public AbstractWorldMapIcon iconStart() {
      if (!this.cacheLoader.isLoaded()) {
         return null;
      } else if (!this.worldMapRenderer.isLoaded()) {
         return null;
      } else {
         HashMap var1 = this.worldMapRenderer.buildIcons();
         this.field4786 = new LinkedList();
         Iterator var2 = var1.values().iterator();

         while(var2.hasNext()) {
            List var3 = (List)var2.next();
            this.field4786.addAll(var3);
         }

         this.iconIterator = this.field4786.iterator();
         return this.iconNext();
      }
   }

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(I)Lix;",
      garbageValue = "1101774550"
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
