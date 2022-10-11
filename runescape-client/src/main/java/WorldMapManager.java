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

@ObfuscatedName("il")
@Implements("WorldMapManager")
public final class WorldMapManager {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("Widget_fontsArchive")
   public static AbstractArchive Widget_fontsArchive;
   @ObfuscatedName("cf")
   @ObfuscatedSignature(
      descriptor = "Lry;"
   )
   static IndexedSprite field2822;
   @ObfuscatedName("a")
   @Export("loaded")
   boolean loaded = false;
   @ObfuscatedName("f")
   @Export("loadStarted")
   boolean loadStarted = false;
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "Liw;"
   )
   @Export("mapAreaData")
   WorldMapAreaData mapAreaData;
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "Lri;"
   )
   @Export("compositeTextureSprite")
   SpritePixels compositeTextureSprite;
   @ObfuscatedName("h")
   @Export("icons")
   HashMap icons;
   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "[[Lii;"
   )
   @Export("regions")
   WorldMapRegion[][] regions;
   @ObfuscatedName("y")
   @Export("scaleHandlers")
   HashMap scaleHandlers = new HashMap();
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "[Lry;"
   )
   @Export("mapSceneSprites")
   IndexedSprite[] mapSceneSprites;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("geographyArchive")
   final AbstractArchive geographyArchive;
   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "Llg;"
   )
   @Export("groundArchive")
   final AbstractArchive groundArchive;
   @ObfuscatedName("l")
   @Export("fonts")
   final HashMap fonts;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1031172703
   )
   @Export("tileX")
   int tileX;
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 1379913753
   )
   @Export("tileY")
   int tileY;
   @ObfuscatedName("b")
   @ObfuscatedGetter(
      intValue = 1632379840
   )
   @Export("tileWidth")
   int tileWidth;
   @ObfuscatedName("o")
   @ObfuscatedGetter(
      intValue = 1836857792
   )
   @Export("tileHeight")
   int tileHeight;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = -1879985849
   )
   @Export("pixelsPerTile")
   public int pixelsPerTile = 0;

   @ObfuscatedSignature(
      descriptor = "([Lry;Ljava/util/HashMap;Llg;Llg;)V"
   )
   public WorldMapManager(IndexedSprite[] var1, HashMap var2, AbstractArchive var3, AbstractArchive var4) {
      this.mapSceneSprites = var1;
      this.fonts = var2;
      this.geographyArchive = var3;
      this.groundArchive = var4;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(Llg;Ljava/lang/String;ZI)V",
      garbageValue = "-1883090511"
   )
   @Export("load")
   public void load(AbstractArchive var1, String var2, boolean var3) {
      if (!this.loadStarted) {
         this.loaded = false;
         this.loadStarted = true;
         System.nanoTime();
         int var4 = var1.getGroupId(WorldMapCacheName.field2954.name);
         int var5 = var1.getFileId(var4, var2);
         Buffer var6 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2954.name, var2));
         Buffer var7 = new Buffer(var1.takeFileByNames(WorldMapCacheName.field2949.name, var2));
         System.nanoTime();
         System.nanoTime();
         this.mapAreaData = new WorldMapAreaData();

         try {
            this.mapAreaData.init(var6, var7, var5, var3);
         } catch (IllegalStateException var19) {
            return;
         }

         this.mapAreaData.getOriginX();
         this.mapAreaData.getOriginPlane();
         this.mapAreaData.getOriginY();
         this.tileX = this.mapAreaData.getRegionLowX() * 64;
         this.tileY = this.mapAreaData.getRegionLowY() * 64;
         this.tileWidth = (this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1) * 4096;
         this.tileHeight = (this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1) * 4096;
         int var16 = this.mapAreaData.getRegionHighX() - this.mapAreaData.getRegionLowX() + 1;
         int var9 = this.mapAreaData.getRegionHighY() - this.mapAreaData.getRegionLowY() + 1;
         System.nanoTime();
         System.nanoTime();
         VarbitComposition.method3635();
         this.regions = new WorldMapRegion[var16][var9];
         Iterator var10 = this.mapAreaData.worldMapData0Set.iterator();

         while(var10.hasNext()) {
            WorldMapData_0 var11 = (WorldMapData_0)var10.next();
            int var12 = var11.regionX;
            int var13 = var11.regionY;
            int var14 = var12 - this.mapAreaData.getRegionLowX();
            int var15 = var13 - this.mapAreaData.getRegionLowY();
            this.regions[var14][var15] = new WorldMapRegion(var12, var13, this.mapAreaData.getBackGroundColor(), this.fonts);
            this.regions[var14][var15].initWorldMapData0(var11, this.mapAreaData.iconList);
         }

         for(int var17 = 0; var17 < var16; ++var17) {
            for(int var18 = 0; var18 < var9; ++var18) {
               if (this.regions[var17][var18] == null) {
                  this.regions[var17][var18] = new WorldMapRegion(this.mapAreaData.getRegionLowX() + var17, this.mapAreaData.getRegionLowY() + var18, this.mapAreaData.getBackGroundColor(), this.fonts);
                  this.regions[var17][var18].initWorldMapData1(this.mapAreaData.worldMapData1Set, this.mapAreaData.iconList);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if (var1.isValidFileName(WorldMapCacheName.field2948.name, var2)) {
            byte[] var20 = var1.takeFileByNames(WorldMapCacheName.field2948.name, var2);
            this.compositeTextureSprite = KeyHandler.method394(var20);
         }

         System.nanoTime();
         var1.clearGroups();
         var1.clearFiles();
         this.loaded = true;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(S)V",
      garbageValue = "128"
   )
   @Export("clearIcons")
   public final void clearIcons() {
      this.icons = null;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIB)V",
      garbageValue = "-40"
   )
   @Export("drawTiles")
   public final void drawTiles(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = Rasterizer2D.Rasterizer2D_pixels;
      int var10 = Rasterizer2D.Rasterizer2D_width;
      int var11 = Rasterizer2D.Rasterizer2D_height;
      int[] var12 = new int[4];
      Rasterizer2D.Rasterizer2D_getClipArray(var12);
      WorldMapRectangle var13 = this.createWorldMapRectangle(var1, var2, var3, var4);
      float var14 = this.getPixelsPerTile(var7 - var5, var3 - var1);
      int var15 = (int)Math.ceil((double)var14);
      this.pixelsPerTile = var15;
      if (!this.scaleHandlers.containsKey(var15)) {
         WorldMapScaleHandler var16 = new WorldMapScaleHandler(var15);
         var16.init();
         this.scaleHandlers.put(var15, var16);
      }

      int var23 = var13.x + var13.width - 1;
      int var17 = var13.height + var13.y - 1;

      int var18;
      int var19;
      for(var18 = var13.x; var18 <= var23; ++var18) {
         for(var19 = var13.y; var19 <= var17; ++var19) {
            this.regions[var18][var19].drawTile(var15, (WorldMapScaleHandler)this.scaleHandlers.get(var15), this.mapSceneSprites, this.geographyArchive, this.groundArchive);
         }
      }

      Rasterizer2D.Rasterizer2D_replace(var9, var10, var11);
      Rasterizer2D.Rasterizer2D_setClipArray(var12);
      var18 = (int)(var14 * 64.0F);
      var19 = this.tileX * 4096 + var1;
      int var20 = this.tileY * 4096 + var2;

      for(int var21 = var13.x; var21 < var13.width + var13.x; ++var21) {
         for(int var22 = var13.y; var22 < var13.height + var13.y; ++var22) {
            this.regions[var21][var22].method4829(var5 + var18 * (this.regions[var21][var22].regionX * 64 - var19) / 64, var8 - var18 * (this.regions[var21][var22].regionY * 64 - var20 + 64) / 64, var18);
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIILjava/util/HashSet;Ljava/util/HashSet;IIZI)V",
      garbageValue = "862637478"
   )
   @Export("drawElements")
   public final void drawElements(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      WorldMapRectangle var14 = this.createWorldMapRectangle(var1, var2, var3, var4);
      float var15 = this.getPixelsPerTile(var7 - var5, var3 - var1);
      int var16 = (int)(var15 * 64.0F);
      int var17 = this.tileX * 4096 + var1;
      int var18 = this.tileY * 4096 + var2;

      int var19;
      int var20;
      for(var19 = var14.x; var19 < var14.width + var14.x; ++var19) {
         for(var20 = var14.y; var20 < var14.height + var14.y; ++var20) {
            if (var13) {
               this.regions[var19][var20].initWorldMapIcon1s();
            }

            this.regions[var19][var20].method4914(var5 + var16 * (this.regions[var19][var20].regionX * 64 - var17) / 64, var8 - var16 * (this.regions[var19][var20].regionY * 64 - var18 + 64) / 64, var16, var9);
         }
      }

      if (var10 != null && var11 > 0) {
         for(var19 = var14.x; var19 < var14.x + var14.width; ++var19) {
            for(var20 = var14.y; var20 < var14.y + var14.height; ++var20) {
               this.regions[var19][var20].flashElements(var10, var11, var12);
            }
         }
      }

   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIIILjava/util/HashSet;IIB)V",
      garbageValue = "67"
   )
   @Export("drawOverview")
   public void drawOverview(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if (this.compositeTextureSprite != null) {
         this.compositeTextureSprite.drawScaledAt(var1, var2, var3, var4);
         if (var6 > 0 && var6 % var7 < var7 / 2) {
            if (this.icons == null) {
               this.buildIcons0();
            }

            Iterator var8 = var5.iterator();

            while(true) {
               List var10;
               do {
                  if (!var8.hasNext()) {
                     return;
                  }

                  int var9 = (Integer)var8.next();
                  var10 = (List)this.icons.get(var9);
               } while(var10 == null);

               Iterator var11 = var10.iterator();

               while(var11.hasNext()) {
                  AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var11.next();
                  int var13 = var3 * (var12.coord2.x - this.tileX * 4096) / (this.tileWidth * 64);
                  int var14 = var4 - (var12.coord2.y - this.tileY * 4096) * var4 / (this.tileHeight * 64);
                  Rasterizer2D.Rasterizer2D_drawCircleAlpha(var13 + var1, var14 + var2, 2, 16776960, 256);
               }
            }
         }
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIII)Ljava/util/List;",
      garbageValue = "-2075141790"
   )
   public List method4996(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if (!this.loaded) {
         return var11;
      } else {
         WorldMapRectangle var12 = this.createWorldMapRectangle(var1, var2, var3, var4);
         float var13 = this.getPixelsPerTile(var7, var3 - var1);
         int var14 = (int)(64.0F * var13);
         int var15 = this.tileX * 4096 + var1;
         int var16 = this.tileY * 4096 + var2;

         for(int var17 = var12.x; var17 < var12.width + var12.x; ++var17) {
            for(int var18 = var12.y; var18 < var12.y + var12.height; ++var18) {
               List var19 = this.regions[var17][var18].method4859(var5 + var14 * (this.regions[var17][var18].regionX * 64 - var15) / 64, var8 + var6 - var14 * (this.regions[var17][var18].regionY * 64 - var16 + 64) / 64, var14, var9, var10);
               if (!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)Lia;",
      garbageValue = "38"
   )
   @Export("createWorldMapRectangle")
   WorldMapRectangle createWorldMapRectangle(int var1, int var2, int var3, int var4) {
      WorldMapRectangle var5 = new WorldMapRectangle(this);
      int var6 = this.tileX * 4096 + var1;
      int var7 = this.tileY * 4096 + var2;
      int var8 = var3 + this.tileX * 4096;
      int var9 = this.tileY * 4096 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / 64;
      int var13 = var9 / 64;
      var5.width = var12 - var10 + 1;
      var5.height = var13 - var11 + 1;
      var5.x = var10 - this.mapAreaData.getRegionLowX();
      var5.y = var11 - this.mapAreaData.getRegionLowY();
      if (var5.x < 0) {
         var5.width += var5.x;
         var5.x = 0;
      }

      if (var5.x > this.regions.length - var5.width) {
         var5.width = this.regions.length - var5.x;
      }

      if (var5.y < 0) {
         var5.height += var5.y;
         var5.y = 0;
      }

      if (var5.y > this.regions[0].length - var5.height) {
         var5.height = this.regions[0].length - var5.y;
      }

      var5.width = Math.min(var5.width, this.regions.length);
      var5.height = Math.min(var5.height, this.regions[0].length);
      return var5;
   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(I)Z",
      garbageValue = "1792137646"
   )
   @Export("isLoaded")
   public boolean isLoaded() {
      return this.loaded;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/HashMap;",
      garbageValue = "-1493251756"
   )
   @Export("buildIcons")
   public HashMap buildIcons() {
      this.buildIcons0();
      return this.icons;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-180931645"
   )
   @Export("buildIcons0")
   void buildIcons0() {
      if (this.icons == null) {
         this.icons = new HashMap();
      }

      this.icons.clear();

      for(int var1 = 0; var1 < this.regions.length; ++var1) {
         for(int var2 = 0; var2 < this.regions[var1].length; ++var2) {
            List var3 = this.regions[var1][var2].icons();
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
               if (var5.hasValidElement()) {
                  int var6 = var5.getElement();
                  if (!this.icons.containsKey(var6)) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.icons.put(var6, var7);
                  } else {
                     List var8 = (List)this.icons.get(var6);
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(III)F",
      garbageValue = "-1475383808"
   )
   @Export("getPixelsPerTile")
   float getPixelsPerTile(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if (var3 > 8.0F) {
         return 8.0F;
      } else if (var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F ? (float)var4 : var3;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)Z",
      garbageValue = "-1467572913"
   )
   @Export("isNumber")
   public static boolean isNumber(CharSequence var0) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = 0;
      int var5 = var0.length();
      int var6 = 0;

      boolean var1;
      while(true) {
         if (var6 >= var5) {
            var1 = var3;
            break;
         }

         label85: {
            int var7 = var0.charAt(var6);
            if (var6 == 0) {
               if (var7 == 45) {
                  var2 = true;
                  break label85;
               }

               if (var7 == 43) {
                  break label85;
               }
            }

            if (var7 >= 48 && var7 <= 57) {
               var7 -= 48;
            } else if (var7 >= 65 && var7 <= 90) {
               var7 -= 55;
            } else {
               if (var7 < 97 || var7 > 122) {
                  var1 = false;
                  break;
               }

               var7 -= 87;
            }

            if (var7 >= 10) {
               var1 = false;
               break;
            }

            if (var2) {
               var7 = -var7;
            }

            int var8 = var7 + var4 * 10;
            if (var4 != var8 / 10) {
               var1 = false;
               break;
            }

            var4 = var8;
            var3 = true;
         }

         ++var6;
      }

      return var1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1179945808"
   )
   @Export("loadInterface")
   public static boolean loadInterface(int var0) {
      if (MusicPatchPcmStream.Widget_loadedInterfaces[var0]) {
         return true;
      } else if (!UserComparator8.Widget_archive.tryLoadGroup(var0)) {
         return false;
      } else {
         int var1 = UserComparator8.Widget_archive.getGroupFileCount(var0);
         if (var1 == 0) {
            MusicPatchPcmStream.Widget_loadedInterfaces[var0] = true;
            return true;
         } else {
            if (Widget.Widget_interfaceComponents[var0] == null) {
               Widget.Widget_interfaceComponents[var0] = new Widget[var1];
            }

            for(int var2 = 0; var2 < var1; ++var2) {
               if (Widget.Widget_interfaceComponents[var0][var2] == null) {
                  byte[] var3 = UserComparator8.Widget_archive.takeFile(var0, var2);
                  if (var3 != null) {
                     Widget.Widget_interfaceComponents[var0][var2] = new Widget();
                     Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
                     if (var3[0] == -1) {
                        Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
                     } else {
                        Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
                     }
                  }
               }
            }

            MusicPatchPcmStream.Widget_loadedInterfaces[var0] = true;
            return true;
         }
      }
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1081253217"
   )
   public static void method4967() {
      while(true) {
         ArchiveDiskAction var0;
         synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
            var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast();
         }

         if (var0 == null) {
            return;
         }

         var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false);
      }
   }
}
