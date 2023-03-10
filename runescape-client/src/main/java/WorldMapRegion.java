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

@ObfuscatedName("ja")
@Implements("WorldMapRegion")
public class WorldMapRegion {
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lky;"
   )
   @Export("WorldMapRegion_cachedSprites")
   static DemotingHashTable WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = -1463280083
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 204426275
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ljo;"
   )
   @Export("worldMapData_0")
   WorldMapData_0 worldMapData_0;
   @ObfuscatedName("ap")
   @Export("worldMapData1List")
   LinkedList worldMapData1List;
   @ObfuscatedName("ar")
   @ObfuscatedGetter(
      intValue = -611124617
   )
   @Export("backgroundColor")
   int backgroundColor;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = 868662197
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("ax")
   @Export("icon0List")
   List icon0List;
   @ObfuscatedName("as")
   @Export("iconMap")
   HashMap iconMap;
   @ObfuscatedName("ay")
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

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-1982933335"
   )
   void method4922(int var1, int var2, int var3) {
      int var5 = this.regionX;
      int var6 = this.regionY;
      int var7 = this.pixelsPerTile;
      SpritePixels var4 = (SpritePixels)WorldMapRegion_cachedSprites.get(class122.method2891(var5, var6, var7));
      if (var4 != null) {
         if (var3 == this.pixelsPerTile * 64) {
            var4.drawAt(var1, var2);
         } else {
            var4.drawScaledWorldmap(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Ljo;Ljava/util/List;I)V",
      garbageValue = "2014323824"
   )
   @Export("initWorldMapData0")
   void initWorldMapData0(WorldMapData_0 var1, List var2) {
      this.iconMap.clear();
      this.worldMapData_0 = var1;
      this.addAllToIconList(var2);
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
      garbageValue = "-1424204075"
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIIILjs;I)V",
      garbageValue = "2043757237"
   )
   @Export("getIconsForTiles")
   void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label50:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < var5.planes; ++var8) {
               WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  WorldMapDecoration[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     WorldMapDecoration var12 = var10[var11];
                     ObjectComposition var13 = WallDecoration.getObjectDefinition(var12.objectDefinitionId);
                     if (class212.method4157(var13)) {
                        this.getIcon(var13, var8, var6, var7, var5);
                        continue label50;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lhu;IIILjs;I)V",
      garbageValue = "1654853505"
   )
   @Export("getIcon")
   void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
      Coord var7 = null;
      if (this.worldMapData_0 != null) {
         var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 64, this.worldMapData_0.regionYLow * 4096 + var4);
      } else {
         WorldMapData_1 var8 = (WorldMapData_1)var5;
         var7 = new Coord(var2 + var8.minPlane, var3 + var8.regionXLow * 64 + var8.getChunkXLow() * 8, var8.regionYLow * 4096 + var4 + var8.getChunkYLow() * 8);
      }

      WorldMapElement var9;
      Object var10;
      if (var1.transforms != null) {
         var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
      } else {
         var9 = class123.WorldMapElement_get(var1.mapIconId);
         var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
      }

      var9 = class123.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
      if (var9.field1909) {
         this.iconMap.put(new Coord(0, var3, var4), var10);
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1425541360"
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/List;I)V",
      garbageValue = "-1119956143"
   )
   @Export("addAllToIconList")
   void addAllToIconList(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
         if (class123.WorldMapElement_get(var3.element).field1909 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
            WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4987(var3.element));
            this.icon0List.add(var4);
         }
      }

   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-404163221"
   )
   void method4929() {
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

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Lne;I)Z",
      garbageValue = "-1458813821"
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

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(ILkn;[Lsp;Lne;Lne;I)V",
      garbageValue = "88986449"
   )
   @Export("drawTile")
   void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
      this.pixelsPerTile = var1;
      if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
         int var7 = this.regionX;
         int var8 = this.regionY;
         SpritePixels var6 = (SpritePixels)WorldMapRegion_cachedSprites.get(class122.method2891(var7, var8, var1));
         if (var6 == null) {
            boolean var9 = true;
            var9 &= this.loadGeography(var4);
            int var11;
            if (this.worldMapData_0 != null) {
               var11 = this.worldMapData_0.groupId;
            } else {
               var11 = ((AbstractWorldMapData)this.worldMapData1List.getFirst()).groupId;
            }

            var9 &= var5.tryLoadGroup(var11);
            if (var9) {
               byte[] var10 = var5.takeFileFlat(var11);
               WorldMapSprite var12 = WorldMapLabelSize.method4796(var10);
               SpritePixels var13 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
               var13.setRaster();
               if (this.worldMapData_0 != null) {
                  this.method4934(var2, var3, var12);
               } else {
                  this.method4935(var2, var3, var12);
               }

               WorldMapArea.method4918(var13, this.regionX, this.regionY, this.pixelsPerTile);
               this.method4929();
            }
         }
      }
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/util/HashSet;I)V",
      garbageValue = "-1086147415"
   )
   void method4932(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.drawNonLinkMapIcons(var1, var2, var4, var3);
      this.drawMapLinks(var1, var2, var4, var3);
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;IIB)V",
      garbageValue = "-86"
   )
   @Export("flashElements")
   void flashElements(HashSet var1, int var2, int var3) {
      Iterator var4 = this.iconMap.values().iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            int var6 = var5.getElement();
            if (var1.contains(var6)) {
               WorldMapElement var7 = class123.WorldMapElement_get(var6);
               this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

      this.method4943(var1, var2, var3);
   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Lkn;[Lsp;Ljn;I)V",
      garbageValue = "1204033665"
   )
   void method4934(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
            this.method4938(var4, var5, this.worldMapData_0, var1);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method4986(var4, var5, this.worldMapData_0, var1, var2);
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Lkn;[Lsp;Ljn;B)V",
      garbageValue = "-108"
   )
   void method4935(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      Iterator var4 = this.worldMapData1List.iterator();

      WorldMapData_1 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.drawTileGround(var6, var7, var5, var1, var3);
               this.method4938(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.worldMapData1List.iterator();

      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.method4986(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(IILjs;Lkn;[Lsp;B)V",
      garbageValue = "-79"
   )
   void method4986(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
      this.method4941(var1, var2, var3);
      this.method4940(var1, var2, var3, var5);
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IILjs;Lkn;Ljn;I)V",
      garbageValue = "1894929838"
   )
   @Export("drawTileGround")
   void drawTileGround(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, WorldMapSprite var5) {
      int var6 = var3.floorUnderlayIds[0][var1][var2] - 1;
      int var7 = var3.floorOverlayIds[0][var1][var2] - 1;
      if (var6 == -1 && var7 == -1) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, this.backgroundColor);
      }

      int var8 = 16711935;
      int var9;
      if (var7 != -1) {
         int var10 = this.backgroundColor;
         FloorOverlayDefinition var11 = class13.method160(var7);
         if (var11 == null) {
            var9 = var10;
         } else {
            int var12;
            int var13;
            if (var11.secondaryRgb >= 0) {
               var12 = class156.method3300(var11.secondaryHue, var11.secondarySaturation, var11.secondaryLightness);
               var13 = WorldMapLabelSize.method4800(var12, 96);
               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216;
            } else if (var11.texture >= 0) {
               var12 = WorldMapLabelSize.method4800(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96);
               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var12] | -16777216;
            } else if (var11.primaryRgb == 16711935) {
               var9 = var10;
            } else {
               var12 = class156.method3300(var11.hue, var11.saturation, var11.lightness);
               var13 = WorldMapLabelSize.method4800(var12, 96);
               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var13] | -16777216;
            }
         }

         var8 = var9;
      }

      if (var7 > -1 && var3.field2949[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
      } else {
         var9 = this.method5051(var1, var2, var3, var5);
         if (var7 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
         } else {
            var4.method5368(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2949[0][var1][var2], var3.field2952[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IILjs;Lkn;I)V",
      garbageValue = "-1652835948"
   )
   void method4938(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
      for(int var5 = 1; var5 < var3.planes; ++var5) {
         int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var8 = this.backgroundColor;
            FloorOverlayDefinition var9 = class13.method160(var6);
            int var7;
            if (var9 == null) {
               var7 = var8;
            } else {
               int var10;
               int var11;
               if (var9.secondaryRgb >= 0) {
                  var10 = class156.method3300(var9.secondaryHue, var9.secondarySaturation, var9.secondaryLightness);
                  var11 = WorldMapLabelSize.method4800(var10, 96);
                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216;
               } else if (var9.texture >= 0) {
                  var10 = WorldMapLabelSize.method4800(Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96);
                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var10] | -16777216;
               } else if (var9.primaryRgb == 16711935) {
                  var7 = var8;
               } else {
                  var10 = class156.method3300(var9.hue, var9.saturation, var9.lightness);
                  var11 = WorldMapLabelSize.method4800(var10, 96);
                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var11] | -16777216;
               }
            }

            if (var3.field2949[var5][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
            } else {
               var4.method5368(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2949[var5][var1][var2], var3.field2952[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IILjs;Ljn;S)I",
      garbageValue = "-5063"
   )
   int method5051(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
      return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(IILjs;[Lsp;B)V",
      garbageValue = "94"
   )
   void method4940(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
      for(int var5 = 0; var5 < var3.planes; ++var5) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            WorldMapDecoration[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               WorldMapDecoration var9 = var7[var8];
               if (!class258.method5230(var9.decoration)) {
                  int var11 = var9.decoration;
                  boolean var10 = var11 == WorldMapDecorationType.field3731.id;
                  if (!var10) {
                     continue;
                  }
               }

               ObjectComposition var12 = WallDecoration.getObjectDefinition(var9.objectDefinitionId);
               if (var12.mapSceneId != -1) {
                  if (var12.mapSceneId != 46 && var12.mapSceneId != 52) {
                     var4[var12.mapSceneId].method9034(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                  } else {
                     var4[var12.mapSceneId].method9034(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(IILjs;I)V",
      garbageValue = "-1248991266"
   )
   void method4941(int var1, int var2, AbstractWorldMapData var3) {
      for(int var4 = 0; var4 < var3.planes; ++var4) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               WorldMapDecoration var8 = var6[var7];
               if (Username.method9220(var8.decoration)) {
                  ObjectComposition var9 = WallDecoration.getObjectDefinition(var8.objectDefinitionId);
                  int var10 = var9.int1 != 0 ? -3407872 : -3355444;
                  if (var8.decoration == WorldMapDecorationType.field3721.id) {
                     this.method5001(var1, var2, var8.rotation, var10);
                  }

                  if (var8.decoration == WorldMapDecorationType.field3711.id) {
                     this.method5001(var1, var2, var8.rotation, -3355444);
                     this.method5001(var1, var2, var8.rotation + 1, var10);
                  }

                  if (var8.decoration == WorldMapDecorationType.field3729.id) {
                     if (var8.rotation == 0) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if (var8.rotation == 1) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if (var8.rotation == 2) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }

                     if (var8.rotation == 3) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }
                  }

                  if (var8.decoration == WorldMapDecorationType.field3713.id) {
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

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "1908412017"
   )
   @Export("drawNonLinkMapIcons")
   void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.iconMap.entrySet().iterator();

      while(var7.hasNext()) {
         Map.Entry var8 = (Map.Entry)var7.next();
         Coord var9 = (Coord)var8.getKey();
         int var10 = (int)((float)var1 + (float)var9.x * var5 - var6);
         int var11 = (int)((float)(var2 + var4) - var5 * (float)var9.y - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && var12.hasValidElement()) {
            var12.screenX = var10;
            var12.screenY = var11;
            WorldMapElement var13 = class123.WorldMapElement_get(var12.getElement());
            if (!var3.contains(var13.getObjectId())) {
               this.method4946(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;III)V",
      garbageValue = "1342298392"
   )
   void method4943(HashSet var1, int var2, int var3) {
      Iterator var4 = this.icon0List.iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            WorldMapElement var6 = class123.WorldMapElement_get(var5.getElement());
            if (var6 != null && var1.contains(var6.getObjectId())) {
               this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(Lhd;IIIII)V",
      garbageValue = "1553688829"
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

   @ObfuscatedName("bv")
   @ObfuscatedSignature(
      descriptor = "(Lku;IIFI)V",
      garbageValue = "-558166368"
   )
   void method4946(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      WorldMapElement var5 = class123.WorldMapElement_get(var1.getElement());
      this.method4977(var5, var2, var3);
      this.method4947(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(Lhd;III)V",
      garbageValue = "-338716339"
   )
   void method4977(WorldMapElement var1, int var2, int var3) {
      SpritePixels var4 = var1.getSpriteBool(false);
      if (var4 != null) {
         int var5 = this.method5040(var4, var1.horizontalAlignment);
         int var6 = this.method4975(var4, var1.verticalAlignment);
         var4.drawTransBgAt(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("bs")
   @ObfuscatedSignature(
      descriptor = "(Lku;Lhd;IIFB)V",
      garbageValue = "113"
   )
   void method4947(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      WorldMapLabel var6 = var1.getLabel();
      if (var6 != null) {
         if (var6.size.method4794(var5)) {
            Font var7 = (Font)this.fonts.get(var6.size);
            var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1899, 0, 1, 0, var7.ascent / 2);
         }
      }
   }

   @ObfuscatedName("bg")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "1359594444"
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
            var7.screenX = (int)((float)var8 * var5 + (float)var1);
            var7.screenY = (int)(var5 * (float)(63 - var9) + (float)var2);
            if (!var3.contains(var7.getElement())) {
               this.method4946(var7, var7.screenX, var7.screenY, var5);
            }
         }
      }

   }

   @ObfuscatedName("bh")
   @ObfuscatedSignature(
      descriptor = "(Lsn;Lho;B)I",
      garbageValue = "-46"
   )
   int method5040(SpritePixels var1, HorizontalAlignment var2) {
      switch (var2.value) {
         case 0:
            return 0;
         case 2:
            return -var1.subWidth / 2;
         default:
            return -var1.subWidth;
      }
   }

   @ObfuscatedName("bl")
   @ObfuscatedSignature(
      descriptor = "(Lsn;Lhe;B)I",
      garbageValue = "112"
   )
   int method4975(SpritePixels var1, VerticalAlignment var2) {
      switch (var2.value) {
         case 1:
            return 0;
         case 2:
            return -var1.subHeight / 2;
         default:
            return -var1.subHeight;
      }
   }

   @ObfuscatedName("br")
   @ObfuscatedSignature(
      descriptor = "(II)Ljb;",
      garbageValue = "-1422221190"
   )
   WorldMapLabel method4987(int var1) {
      WorldMapElement var2 = class123.WorldMapElement_get(var1);
      return this.createMapLabel(var2);
   }

   @ObfuscatedName("ba")
   @ObfuscatedSignature(
      descriptor = "(Lhd;B)Ljb;",
      garbageValue = "6"
   )
   @Export("createMapLabel")
   WorldMapLabel createMapLabel(WorldMapElement var1) {
      if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
         int var3 = var1.textSize;
         WorldMapLabelSize[] var4 = WorldMapLabelSize.method4795();
         int var5 = 0;

         WorldMapLabelSize var2;
         while(true) {
            if (var5 >= var4.length) {
               var2 = null;
               break;
            }

            WorldMapLabelSize var6 = var4[var5];
            if (var3 == var6.field2817) {
               var2 = var6;
               break;
            }

            ++var5;
         }

         if (var2 == null) {
            return null;
         } else {
            Font var14 = (Font)this.fonts.get(var2);
            if (var14 == null) {
               return null;
            } else {
               int var15 = var14.lineCount(var1.name, 1000000);
               String[] var7 = new String[var15];
               var14.breakLines(var1.name, (int[])null, var7);
               int var8 = var7.length * var14.ascent / 2;
               int var9 = 0;
               String[] var10 = var7;

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

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)Ljava/util/List;",
      garbageValue = "2030974632"
   )
   List method4971(int var1, int var2, int var3, int var4, int var5) {
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

   @ObfuscatedName("bq")
   @ObfuscatedSignature(
      descriptor = "(I)Ljava/util/List;",
      garbageValue = "-1110781266"
   )
   @Export("icons")
   List icons() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.icon0List);
      var1.addAll(this.iconMap.values());
      return var1;
   }

   @ObfuscatedName("bc")
   @ObfuscatedSignature(
      descriptor = "(IIIII)V",
      garbageValue = "412302795"
   )
   void method5001(int var1, int var2, int var3, int var4) {
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

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "([BZI)Ljava/lang/Object;",
      garbageValue = "-1864704515"
   )
   public static Object method5050(byte[] var0, boolean var1) {
      if (var0 == null) {
         return null;
      } else if (var0.length > 136) {
         DirectByteArrayCopier var2 = new DirectByteArrayCopier();
         var2.set(var0);
         return var2;
      } else {
         return var0;
      }
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "36"
   )
   public static int method4951(int var0, int var1) {
      return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133) & 16383;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(BI)C",
      garbageValue = "-999291246"
   )
   public static char method5007(byte var0) {
      int var1 = var0 & 255;
      if (var1 == 0) {
         throw new IllegalArgumentException("" + Integer.toString(var1, 16));
      } else {
         if (var1 >= 128 && var1 < 160) {
            char var2 = class365.cp1252AsciiExtension[var1 - 128];
            if (var2 == 0) {
               var2 = '?';
            }

            var1 = var2;
         }

         return (char)var1;
      }
   }
}
