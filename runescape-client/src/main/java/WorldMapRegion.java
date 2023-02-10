import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("id")
@Implements("WorldMapRegion")
public class WorldMapRegion {
   @ObfuscatedName("ux")
   @ObfuscatedGetter(
      intValue = -848371501
   )
   static int field2874;
   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "Ljp;"
   )
   @Export("WorldMapRegion_cachedSprites")
   static DemotingHashTable WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -53448603
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1663409815
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lih;"
   )
   @Export("worldMapData_0")
   WorldMapData_0 worldMapData_0;
   @ObfuscatedName("l")
   @Export("worldMapData1List")
   LinkedList worldMapData1List;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -390684495
   )
   @Export("backgroundColor")
   int backgroundColor;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -1403435535
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("r")
   @Export("icon0List")
   List icon0List;
   @ObfuscatedName("b")
   @Export("iconMap")
   HashMap iconMap;
   @ObfuscatedName("m")
   @Export("fonts")
   final HashMap fonts;

   WorldMapRegion(int var1, int var2, int var3, HashMap var4) {
      this.regionX = var1;
      this.regionY = var2;
      this.worldMapData1List = new LinkedList();
      this.icon0List = new LinkedList();
      this.iconMap = new HashMap();
      this.backgroundColor = var3 | -16777216;
      this.fonts = var4;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-583808564"
   )
   void method5145(int var1, int var2, int var3) {
      SpritePixels var4 = class70.method2088(this.regionX, this.regionY, this.pixelsPerTile);
      if (var4 != null) {
         if (var3 == this.pixelsPerTile * 64) {
            var4.drawAt(var1, var2);
         } else {
            var4.drawScaledWorldmap(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(Lih;Ljava/util/List;I)V",
      garbageValue = "1952397338"
   )
   @Export("initWorldMapData0")
   void initWorldMapData0(WorldMapData_0 var1, List var2) {
      this.iconMap.clear();
      this.worldMapData_0 = var1;
      this.addAllToIconList(var2);
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
      garbageValue = "-1854355709"
   )
   @Export("initWorldMapData1")
   void initWorldMapData1(HashSet var1, List var2) {
      this.iconMap.clear();
      Iterator var3 = var1.iterator();

      while(var3.hasNext()) {
         WorldMapData_1 var4 = (WorldMapData_1)var3.next();
         if (var4.getRegionX() == this.regionX && var4.getRegionY() == this.regionY) {
            this.worldMapData1List.add(var4);
         }
      }

      this.addAllToIconList(var2);
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIIILia;B)V",
      garbageValue = "29"
   )
   @Export("getIconsForTiles")
   void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label51:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < var5.planes; ++var8) {
               WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  WorldMapDecoration[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     WorldMapDecoration var12 = var10[var11];
                     ObjectComposition var13 = class463.getObjectDefinition(var12.objectDefinitionId);
                     if (class10.method113(var13)) {
                        this.getIcon(var13, var8, var6, var7, var5);
                        continue label51;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Lgp;IIILia;I)V",
      garbageValue = "-2086101831"
   )
   @Export("getIcon")
   void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
      Coord var7 = null;
      if (this.worldMapData_0 != null) {
         var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, var4 + this.worldMapData_0.regionYLow * 64);
      } else {
         WorldMapData_1 var8 = (WorldMapData_1)var5;
         var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 4096 + var8.getChunkXLow() * 8, var8.regionYLow * 64 + var4 + var8.getChunkYLow() * 8);
      }

      WorldMapElement var9;
      Object var10;
      if (var1.transforms != null) {
         var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
      } else {
         var9 = class4.WorldMapElement_get(var1.mapIconId);
         var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
      }

      var9 = class4.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
      if (var9.field1942) {
         this.iconMap.put(new Coord(0, var3, var4), var10);
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1064632767"
   )
   @Export("initWorldMapIcon1s")
   void initWorldMapIcon1s() {
      Iterator var1 = this.iconMap.values().iterator();

      while(var1.hasNext()) {
         AbstractWorldMapIcon var2 = (AbstractWorldMapIcon)var1.next();
         if (var2 instanceof WorldMapIcon_1) {
            ((WorldMapIcon_1)var2).init();
         }
      }

   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/List;I)V",
      garbageValue = "1281796744"
   )
   @Export("addAllToIconList")
   void addAllToIconList(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
         if (class4.WorldMapElement_get(var3.element).field1942 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
            WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5131(var3.element));
            this.icon0List.add(var4);
         }
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "19"
   )
   void method5023() {
      if (this.worldMapData_0 != null) {
         this.worldMapData_0.reset();
      } else {
         Iterator var1 = this.worldMapData1List.iterator();

         while(var1.hasNext()) {
            WorldMapData_1 var2 = (WorldMapData_1)var1.next();
            var2.reset();
         }
      }

   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(Lln;I)Z",
      garbageValue = "2127797424"
   )
   @Export("loadGeography")
   boolean loadGeography(AbstractArchive var1) {
      this.iconMap.clear();
      if (this.worldMapData_0 != null) {
         this.worldMapData_0.loadGeography(var1);
         if (this.worldMapData_0.isFullyLoaded()) {
            this.getIconsForTiles(0, 0, 64, 64, this.worldMapData_0);
            return true;
         } else {
            return false;
         }
      } else {
         boolean var2 = true;

         Iterator var3;
         WorldMapData_1 var4;
         for(var3 = this.worldMapData1List.iterator(); var3.hasNext(); var2 &= var4.isFullyLoaded()) {
            var4 = (WorldMapData_1)var3.next();
            var4.loadGeography(var1);
         }

         if (var2) {
            var3 = this.worldMapData1List.iterator();

            while(var3.hasNext()) {
               var4 = (WorldMapData_1)var3.next();
               this.getIconsForTiles(var4.getChunkX() * 8, var4.getChunkY() * 8, 8, 8, var4);
            }
         }

         return var2;
      }
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(ILjl;[Lrg;Lln;Lln;B)V",
      garbageValue = "-120"
   )
   @Export("drawTile")
   void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
      this.pixelsPerTile = var1;
      if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
         if (class70.method2088(this.regionX, this.regionY, var1) == null) {
            boolean var6 = true;
            var6 &= this.loadGeography(var4);
            int var8;
            if (this.worldMapData_0 != null) {
               var8 = this.worldMapData_0.groupId;
            } else {
               var8 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
            }

            var6 &= var5.tryLoadGroup(var8);
            if (var6) {
               byte[] var7 = var5.takeFileFlat(var8);
               WorldMapSprite var9 = Player.method2353(var7);
               SpritePixels var10 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
               var10.setRaster();
               if (this.worldMapData_0 != null) {
                  this.method5019(var2, var3, var9);
               } else {
                  this.method5029(var2, var3, var9);
               }

               class7.method65(var10, this.regionX, this.regionY, this.pixelsPerTile);
               this.method5023();
            }
         }
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/util/HashSet;I)V",
      garbageValue = "376150308"
   )
   void method5026(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.drawNonLinkMapIcons(var1, var2, var4, var3);
      this.drawMapLinks(var1, var2, var4, var3);
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;III)V",
      garbageValue = "-108746469"
   )
   @Export("flashElements")
   void flashElements(HashSet var1, int var2, int var3) {
      Iterator var4 = this.iconMap.values().iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            int var6 = var5.getElement();
            if (var1.contains(var6)) {
               WorldMapElement var7 = class4.WorldMapElement_get(var6);
               this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

      this.method5141(var1, var2, var3);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljl;[Lrg;Liy;I)V",
      garbageValue = "488380802"
   )
   void method5019(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
            this.method5042(var4, var5, this.worldMapData_0, var1);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method5030(var4, var5, this.worldMapData_0, var1, var2);
         }
      }

   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Ljl;[Lrg;Liy;B)V",
      garbageValue = "-62"
   )
   void method5029(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      Iterator var4 = this.worldMapData1List.iterator();

      WorldMapData_1 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.drawTileGround(var6, var7, var5, var1, var3);
               this.method5042(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.worldMapData1List.iterator();

      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.method5030(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IILia;Ljl;[Lrg;B)V",
      garbageValue = "0"
   )
   void method5030(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
      this.method5035(var1, var2, var3);
      this.method5063(var1, var2, var3, var5);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(IILia;Ljl;Liy;I)V",
      garbageValue = "-400072655"
   )
   @Export("drawTileGround")
   void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
      int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
      int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
      }

      int var8 = 16711935;
      if (var7 != -1) {
         var8 = class153.method3316(var7, this.backgroundColor);
      }

      if (var7 > -1 && var3.field2960[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
      } else {
         int var9 = this.method5033(var1, var2, var3, var5);
         if (var7 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
         } else {
            var4.method5429(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2960[0][var1][var2], var3.field2956[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IILia;Ljl;I)V",
      garbageValue = "1788876197"
   )
   void method5042(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
      for(int var5 = 1; var5 < var3.planes; ++var5) {
         int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var7 = class153.method3316(var6, this.backgroundColor);
            if (var3.field2960[var5][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
            } else {
               var4.method5429(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2960[var5][var1][var2], var3.field2956[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(IILia;Liy;B)I",
      garbageValue = "-102"
   )
   int method5033(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
      return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IILia;[Lrg;B)V",
      garbageValue = "5"
   )
   void method5063(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
      for(int var5 = 0; var5 < var3.planes; ++var5) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            WorldMapDecoration[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               WorldMapDecoration var9 = var7[var8];
               if (class327.method6445(var9.decoration) || HealthBar.method2609(var9.decoration)) {
                  ObjectComposition var10 = class463.getObjectDefinition(var9.objectDefinitionId);
                  if (var10.mapSceneId != -1) {
                     if (var10.mapSceneId != 46 && var10.mapSceneId != 52) {
                        var4[var10.mapSceneId].method9071(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                     } else {
                        var4[var10.mapSceneId].method9071(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IILia;B)V",
      garbageValue = "1"
   )
   void method5035(int var1, int var2, AbstractWorldMapData var3) {
      for(int var4 = 0; var4 < var3.planes; ++var4) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               WorldMapDecoration var8 = var6[var7];
               if (WallDecoration.method4865(var8.decoration)) {
                  ObjectComposition var9 = class463.getObjectDefinition(var8.objectDefinitionId);
                  int var10 = var9.int1 != 0 ? -3407872 : -3355444;
                  if (var8.decoration == WorldMapDecorationType.field3752.id) {
                     this.method5086(var1, var2, var8.rotation, var10);
                  }

                  if (var8.decoration == WorldMapDecorationType.field3745.id) {
                     this.method5086(var1, var2, var8.rotation, -3355444);
                     this.method5086(var1, var2, var8.rotation + 1, var10);
                  }

                  if (var8.decoration == WorldMapDecorationType.field3746.id) {
                     if (var8.rotation == 0) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if (var8.rotation == 1) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if (var8.rotation == 2) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }

                     if (var8.rotation == 3) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }
                  }

                  if (var8.decoration == WorldMapDecorationType.field3751.id) {
                     int var11 = var8.rotation % 2;
                     int var12;
                     if (var11 == 0) {
                        for(var12 = 0; var12 < this.pixelsPerTile; ++var12) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var12, 1, var10);
                        }
                     } else {
                        for(var12 = 0; var12 < this.pixelsPerTile; ++var12) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(var12 + this.pixelsPerTile * var1, var12 + this.pixelsPerTile * (63 - var2), 1, var10);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "1278749111"
   )
   @Export("drawNonLinkMapIcons")
   void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.iconMap.entrySet().iterator();

      while(var7.hasNext()) {
         Map.Entry var8 = (Map.Entry)var7.next();
         Coord var9 = (Coord)var8.getKey();
         int var10 = (int)(var5 * (float)var9.x + (float)var1 - var6);
         int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && var12.hasValidElement()) {
            var12.screenX = var10;
            var12.screenY = var11;
            WorldMapElement var13 = class4.WorldMapElement_get(var12.getElement());
            if (!var3.contains(var13.getObjectId())) {
               this.method5055(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;III)V",
      garbageValue = "-2127236588"
   )
   void method5141(HashSet var1, int var2, int var3) {
      Iterator var4 = this.icon0List.iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            WorldMapElement var6 = class4.WorldMapElement_get(var5.getElement());
            if (var6 != null && var1.contains(var6.getObjectId())) {
               this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Lgk;IIIII)V",
      garbageValue = "14671839"
   )
   @Export("drawBackgroundCircle")
   void drawBackgroundCircle(WorldMapElement var1, int var2, int var3, int var4, int var5) {
      SpritePixels var6 = var1.getSpriteBool(false);
      if (var6 != null) {
         var6.drawTransBgAt(var2 - var6.subWidth / 2, var3 - var6.subHeight / 2);
         if (var4 % var5 < var5 / 2) {
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 15, 16776960, 128);
            Rasterizer2D.Rasterizer2D_drawCircleAlpha(var2, var3, 7, 16777215, 256);
         }

      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(Lio;IIFI)V",
      garbageValue = "-1488187190"
   )
   void method5055(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      WorldMapElement var5 = class4.WorldMapElement_get(var1.getElement());
      this.method5092(var5, var2, var3);
      this.method5041(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Lgk;III)V",
      garbageValue = "-979030841"
   )
   void method5092(WorldMapElement var1, int var2, int var3) {
      SpritePixels var4 = var1.getSpriteBool(false);
      if (var4 != null) {
         int var5 = this.method5043(var4, var1.horizontalAlignment);
         int var6 = this.method5044(var4, var1.verticalAlignment);
         var4.drawTransBgAt(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lio;Lgk;IIFI)V",
      garbageValue = "-1699691180"
   )
   void method5041(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      WorldMapLabel var6 = var1.getLabel();
      if (var6 != null) {
         if (var6.size.method4887(var5)) {
            Font var7 = (Font)this.fonts.get(var6.size);
            var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1940, 0, 1, 0, var7.ascent / 2);
         }
      }
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "1723252228"
   )
   @Export("drawMapLinks")
   void drawMapLinks(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      Iterator var6 = this.icon0List.iterator();

      while(var6.hasNext()) {
         AbstractWorldMapIcon var7 = (AbstractWorldMapIcon)var6.next();
         if (var7.hasValidElement()) {
            int var8 = var7.coord2.x % 64;
            int var9 = var7.coord2.y % 64;
            var7.screenX = (int)((float)var1 + var5 * (float)var8);
            var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2);
            if (!var3.contains(var7.getElement())) {
               this.method5055(var7, var7.screenX, var7.screenY, var5);
            }
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lrs;Lgw;B)I",
      garbageValue = "-18"
   )
   int method5043(SpritePixels var1, HorizontalAlignment var2) {
      switch (var2.value) {
         case 0:
            return 0;
         case 2:
            return -var1.subWidth / 2;
         default:
            return -var1.subWidth;
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lrs;Lgd;B)I",
      garbageValue = "3"
   )
   int method5044(SpritePixels var1, VerticalAlignment var2) {
      switch (var2.value) {
         case 1:
            return 0;
         case 2:
            return -var1.subHeight / 2;
         default:
            return -var1.subHeight;
      }
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(II)Lil;",
      garbageValue = "-2062233698"
   )
   WorldMapLabel method5131(int var1) {
      WorldMapElement var2 = class4.WorldMapElement_get(var1);
      return this.createMapLabel(var2);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Lgk;S)Lil;",
      garbageValue = "153"
   )
   @Export("createMapLabel")
   WorldMapLabel createMapLabel(WorldMapElement var1) {
      if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
         int var3 = var1.textSize;
         WorldMapLabelSize[] var4 = new WorldMapLabelSize[]{WorldMapLabelSize.WorldMapLabelSize_small, WorldMapLabelSize.WorldMapLabelSize_medium, WorldMapLabelSize.WorldMapLabelSize_large};
         WorldMapLabelSize[] var5 = var4;
         int var6 = 0;

         WorldMapLabelSize var2;
         while(true) {
            if (var6 >= var5.length) {
               var2 = null;
               break;
            }

            WorldMapLabelSize var7 = var5[var6];
            if (var3 == var7.field2823) {
               var2 = var7;
               break;
            }

            ++var6;
         }

         if (var2 == null) {
            return null;
         } else {
            Font var14 = (Font)this.fonts.get(var2);
            if (var14 == null) {
               return null;
            } else {
               var6 = var14.lineCount(var1.name, 1000000);
               String[] var15 = new String[var6];
               var14.breakLines(var1.name, (int[])null, var15);
               int var8 = var15.length * var14.ascent / 2;
               int var9 = 0;
               String[] var10 = var15;

               for(int var11 = 0; var11 < var10.length; ++var11) {
                  String var12 = var10[var11];
                  int var13 = var14.stringWidth(var12);
                  if (var13 > var9) {
                     var9 = var13;
                  }
               }

               return new WorldMapLabel(var1.name, var9, var8, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)Ljava/util/List;",
      garbageValue = "461574791"
   )
   List method5047(int var1, int var2, int var3, int var4, int var5) {
      LinkedList var6 = new LinkedList();
      if (var4 >= var1 && var5 >= var2) {
         if (var4 < var3 + var1 && var5 < var3 + var2) {
            Iterator var7 = this.iconMap.values().iterator();

            AbstractWorldMapIcon var8;
            while(var7.hasNext()) {
               var8 = (AbstractWorldMapIcon)var7.next();
               if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
                  var6.add(var8);
               }
            }

            var7 = this.icon0List.iterator();

            while(var7.hasNext()) {
               var8 = (AbstractWorldMapIcon)var7.next();
               if (var8.hasValidElement() && var8.fitsScreen(var4, var5)) {
                  var6.add(var8);
               }
            }

            return var6;
         } else {
            return var6;
         }
      } else {
         return var6;
      }
   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(S)Ljava/util/List;",
      garbageValue = "128"
   )
   @Export("icons")
   List icons() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.icon0List);
      var1.addAll(this.iconMap.values());
      return var1;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "6"
   )
   void method5086(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 1) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 2) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 3) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIIIII)I",
      garbageValue = "1582773873"
   )
   public static int method5148(int var0, int var1, int var2, int var3, int var4, int var5) {
      if ((var5 & 1) == 1) {
         int var6 = var3;
         var3 = var4;
         var4 = var6;
      }

      var2 &= 3;
      if (var2 == 0) {
         return var0;
      } else if (var2 == 1) {
         return var1;
      } else {
         return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1);
      }
   }

   @ObfuscatedName("ku")
   @ObfuscatedSignature(
      descriptor = "(Lkz;Lgr;IIZI)V",
      garbageValue = "612286939"
   )
   @Export("addWidgetItemMenuItem")
   static final void addWidgetItemMenuItem(Widget var0, ItemComposition var1, int var2, int var3, boolean var4) {
      String[] var5 = var1.inventoryActions;
      byte var6 = -1;
      String var7 = null;
      if (var5 != null && var5[var3] != null) {
         if (var3 == 0) {
            var6 = 33;
         } else if (var3 == 1) {
            var6 = 34;
         } else if (var3 == 2) {
            var6 = 35;
         } else if (var3 == 3) {
            var6 = 36;
         } else {
            var6 = 37;
         }

         var7 = var5[var3];
      } else if (var3 == 4) {
         var6 = 37;
         var7 = "Drop";
      }

      if (var6 != -1 && var7 != null) {
         class290.insertMenuItem(var7, class149.colorStartTag(16748608) + var1.name, var6, 0, var2, var0.id, var1.id, var4);
      }

   }
}
