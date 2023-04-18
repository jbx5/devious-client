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

@ObfuscatedName("jr")
@Implements("WorldMapRegion")
public class WorldMapRegion {
   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "Lke;"
   )
   @Export("WorldMapRegion_cachedSprites")
   public static DemotingHashTable WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -2122501643
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 1858063995
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "Ljm;"
   )
   @Export("worldMapData_0")
   WorldMapData_0 worldMapData_0;
   @ObfuscatedName("at")
   @Export("worldMapData1List")
   LinkedList worldMapData1List;
   @ObfuscatedName("aa")
   @ObfuscatedGetter(
      intValue = 973203971
   )
   @Export("backgroundColor")
   int backgroundColor;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1897887643
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("ao")
   @Export("icon0List")
   List icon0List;
   @ObfuscatedName("ax")
   @Export("iconMap")
   HashMap iconMap;
   @ObfuscatedName("ai")
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "6"
   )
   void method5165(int var1, int var2, int var3) {
      SpritePixels var4 = VarpDefinition.method3654(this.regionX, this.regionY, this.pixelsPerTile);
      if (var4 != null) {
         if (var3 == this.pixelsPerTile * 64) {
            var4.drawAt(var1, var2);
         } else {
            var4.drawScaledWorldmap(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(Ljm;Ljava/util/List;I)V",
      garbageValue = "1780260388"
   )
   @Export("initWorldMapData0")
   void initWorldMapData0(WorldMapData_0 var1, List var2) {
      this.iconMap.clear();
      this.worldMapData_0 = var1;
      this.addAllToIconList(var2);
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
      garbageValue = "1961953252"
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
      descriptor = "(IIIILjz;I)V",
      garbageValue = "791967957"
   )
   @Export("getIconsForTiles")
   void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label76:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < var5.planes; ++var8) {
               WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  WorldMapDecoration[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     ObjectComposition var13;
                     boolean var14;
                     label67: {
                        WorldMapDecoration var12 = var10[var11];
                        var13 = class144.getObjectDefinition(var12.objectDefinitionId);
                        if (var13.transforms != null) {
                           int[] var15 = var13.transforms;

                           for(int var16 = 0; var16 < var15.length; ++var16) {
                              int var17 = var15[var16];
                              ObjectComposition var18 = class144.getObjectDefinition(var17);
                              if (var18.mapIconId != -1) {
                                 var14 = true;
                                 break label67;
                              }
                           }
                        } else if (var13.mapIconId != -1) {
                           var14 = true;
                           break label67;
                        }

                        var14 = false;
                     }

                     if (var14) {
                        this.getIcon(var13, var8, var6, var7, var5);
                        continue label76;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lhq;IIILjz;I)V",
      garbageValue = "881675685"
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
         var9 = class354.WorldMapElement_get(var1.mapIconId);
         var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
      }

      var9 = class354.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
      if (var9.field1923) {
         this.iconMap.put(new Coord(0, var3, var4), var10);
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1575710248"
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

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/List;S)V",
      garbageValue = "10781"
   )
   @Export("addAllToIconList")
   void addAllToIconList(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
         if (class354.WorldMapElement_get(var3.element).field1923 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
            WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method5193(var3.element));
            this.icon0List.add(var4);
         }
      }

   }

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1615699563"
   )
   void method5172() {
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(Lnm;S)Z",
      garbageValue = "8372"
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

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(ILkj;[Ltc;Lnm;Lnm;I)V",
      garbageValue = "-818426546"
   )
   @Export("drawTile")
   void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
      this.pixelsPerTile = var1;
      if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
         if (VarpDefinition.method3654(this.regionX, this.regionY, var1) == null) {
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
               WorldMapSprite var9;
               if (var7 == null) {
                  var9 = new WorldMapSprite();
               } else {
                  var9 = new WorldMapSprite(Strings.method6601(var7).pixels);
               }

               SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
               var11.setRaster();
               if (this.worldMapData_0 != null) {
                  this.method5177(var2, var3, var9);
               } else {
                  this.method5202(var2, var3, var9);
               }

               int var12 = this.regionX;
               int var13 = this.regionY;
               int var14 = this.pixelsPerTile;
               WorldMapRegion_cachedSprites.put(var11, BuddyRankComparator.method2959(var12, var13, var14), var11.pixels.length * 4);
               this.method5172();
            }
         }
      }
   }

   @ObfuscatedName("ai")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/util/HashSet;B)V",
      garbageValue = "-48"
   )
   void method5175(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.drawNonLinkMapIcons(var1, var2, var4, var3);
      this.drawMapLinks(var1, var2, var4, var3);
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;III)V",
      garbageValue = "-1521624109"
   )
   @Export("flashElements")
   void flashElements(HashSet var1, int var2, int var3) {
      Iterator var4 = this.iconMap.values().iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            int var6 = var5.getElement();
            if (var1.contains(var6)) {
               WorldMapElement var7 = class354.WorldMapElement_get(var6);
               this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

      this.method5164(var1, var2, var3);
   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Lkj;[Ltc;Lkc;B)V",
      garbageValue = "84"
   )
   void method5177(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
            this.method5262(var4, var5, this.worldMapData_0, var1);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method5179(var4, var5, this.worldMapData_0, var1, var2);
         }
      }

   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(Lkj;[Ltc;Lkc;I)V",
      garbageValue = "390308152"
   )
   void method5202(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      Iterator var4 = this.worldMapData1List.iterator();

      WorldMapData_1 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.drawTileGround(var6, var7, var5, var1, var3);
               this.method5262(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.worldMapData1List.iterator();

      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.method5179(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IILjz;Lkj;[Ltc;I)V",
      garbageValue = "-711908357"
   )
   void method5179(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
      this.method5184(var1, var2, var3);
      this.method5233(var1, var2, var3, var5);
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(IILjz;Lkj;Lkc;I)V",
      garbageValue = "-2045075746"
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
         FloorOverlayDefinition var12 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var7);
         FloorOverlayDefinition var11;
         if (var12 != null) {
            var11 = var12;
         } else {
            byte[] var13 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var7);
            var12 = new FloorOverlayDefinition();
            if (var13 != null) {
               var12.decode(new Buffer(var13), var7);
            }

            var12.postDecode();
            FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var12, (long)var7);
            var11 = var12;
         }

         if (var11 == null) {
            var9 = var10;
         } else {
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            if (var11.secondaryRgb >= 0) {
               var14 = var11.secondaryHue;
               var15 = var11.secondarySaturation;
               var16 = var11.secondaryLightness;
               if (var16 > 179) {
                  var15 /= 2;
               }

               if (var16 > 192) {
                  var15 /= 2;
               }

               if (var16 > 217) {
                  var15 /= 2;
               }

               if (var16 > 243) {
                  var15 /= 2;
               }

               var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10);
               var18 = class97.method2652(var17, 96);
               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216;
            } else if (var11.texture >= 0) {
               int var19 = class97.method2652(Rasterizer3D.field2514.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture), 96);
               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | -16777216;
            } else if (var11.primaryRgb == 16711935) {
               var9 = var10;
            } else {
               var14 = var11.hue;
               var15 = var11.saturation;
               var16 = var11.lightness;
               if (var16 > 179) {
                  var15 /= 2;
               }

               if (var16 > 192) {
                  var15 /= 2;
               }

               if (var16 > 217) {
                  var15 /= 2;
               }

               if (var16 > 243) {
                  var15 /= 2;
               }

               var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10);
               var18 = class97.method2652(var17, 96);
               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216;
            }
         }

         var8 = var9;
      }

      if (var7 > -1 && var3.field2990[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
      } else {
         var9 = this.method5182(var1, var2, var3, var5);
         if (var7 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
         } else {
            var4.method5568(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2990[0][var1][var2], var3.field2996[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IILjz;Lkj;I)V",
      garbageValue = "1395300206"
   )
   void method5262(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
      for(int var5 = 1; var5 < var3.planes; ++var5) {
         int var6 = var3.floorOverlayIds[var5][var1][var2] - 1;
         if (var6 > -1) {
            int var8 = this.backgroundColor;
            FloorOverlayDefinition var10 = (FloorOverlayDefinition)FloorOverlayDefinition.FloorOverlayDefinition_cached.get((long)var6);
            FloorOverlayDefinition var9;
            if (var10 != null) {
               var9 = var10;
            } else {
               byte[] var11 = FloorOverlayDefinition.FloorOverlayDefinition_archive.takeFile(4, var6);
               var10 = new FloorOverlayDefinition();
               if (var11 != null) {
                  var10.decode(new Buffer(var11), var6);
               }

               var10.postDecode();
               FloorOverlayDefinition.FloorOverlayDefinition_cached.put(var10, (long)var6);
               var9 = var10;
            }

            int var7;
            if (var9 == null) {
               var7 = var8;
            } else {
               int var12;
               int var13;
               int var14;
               int var15;
               int var16;
               if (var9.secondaryRgb >= 0) {
                  var12 = var9.secondaryHue;
                  var13 = var9.secondarySaturation;
                  var14 = var9.secondaryLightness;
                  if (var14 > 179) {
                     var13 /= 2;
                  }

                  if (var14 > 192) {
                     var13 /= 2;
                  }

                  if (var14 > 217) {
                     var13 /= 2;
                  }

                  if (var14 > 243) {
                     var13 /= 2;
                  }

                  var15 = (var13 / 32 << 7) + var14 / 2 + (var12 / 4 << 10);
                  var16 = class97.method2652(var15, 96);
                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216;
               } else if (var9.texture >= 0) {
                  int var17 = class97.method2652(Rasterizer3D.field2514.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture), 96);
                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var17] | -16777216;
               } else if (var9.primaryRgb == 16711935) {
                  var7 = var8;
               } else {
                  var12 = var9.hue;
                  var13 = var9.saturation;
                  var14 = var9.lightness;
                  if (var14 > 179) {
                     var13 /= 2;
                  }

                  if (var14 > 192) {
                     var13 /= 2;
                  }

                  if (var14 > 217) {
                     var13 /= 2;
                  }

                  if (var14 > 243) {
                     var13 /= 2;
                  }

                  var15 = (var13 / 32 << 7) + var14 / 2 + (var12 / 4 << 10);
                  var16 = class97.method2652(var15, 96);
                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216;
               }
            }

            if (var3.field2990[var5][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
            } else {
               var4.method5568(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2990[var5][var1][var2], var3.field2996[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IILjz;Lkc;I)I",
      garbageValue = "390149173"
   )
   int method5182(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
      return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(IILjz;[Ltc;I)V",
      garbageValue = "-926949025"
   )
   void method5233(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
      for(int var5 = 0; var5 < var3.planes; ++var5) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            WorldMapDecoration[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               WorldMapDecoration var9 = var7[var8];
               if (!ItemLayer.method4307(var9.decoration)) {
                  int var11 = var9.decoration;
                  boolean var10 = var11 == WorldMapDecorationType.field3770.id;
                  if (!var10) {
                     continue;
                  }
               }

               ObjectComposition var12 = class144.getObjectDefinition(var9.objectDefinitionId);
               if (var12.mapSceneId != -1) {
                  if (var12.mapSceneId != 46 && var12.mapSceneId != 52) {
                     var4[var12.mapSceneId].method9492(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                  } else {
                     var4[var12.mapSceneId].method9492(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IILjz;I)V",
      garbageValue = "-1855512856"
   )
   void method5184(int var1, int var2, AbstractWorldMapData var3) {
      for(int var4 = 0; var4 < var3.planes; ++var4) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               WorldMapDecoration var8 = var6[var7];
               int var10 = var8.decoration;
               boolean var9 = var10 >= WorldMapDecorationType.field3751.id && var10 <= WorldMapDecorationType.field3754.id || var10 == WorldMapDecorationType.field3752.id;
               if (var9) {
                  ObjectComposition var11 = class144.getObjectDefinition(var8.objectDefinitionId);
                  int var12 = var11.int1 != 0 ? -3407872 : -3355444;
                  if (var8.decoration == WorldMapDecorationType.field3751.id) {
                     this.method5188(var1, var2, var8.rotation, var12);
                  }

                  if (var8.decoration == WorldMapDecorationType.field3750.id) {
                     this.method5188(var1, var2, var8.rotation, -3355444);
                     this.method5188(var1, var2, var8.rotation + 1, var12);
                  }

                  if (var8.decoration == WorldMapDecorationType.field3754.id) {
                     if (var8.rotation == 0) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var12);
                     }

                     if (var8.rotation == 1) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var12);
                     }

                     if (var8.rotation == 2) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
                     }

                     if (var8.rotation == 3) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var12);
                     }
                  }

                  if (var8.decoration == WorldMapDecorationType.field3752.id) {
                     int var13 = var8.rotation % 2;
                     int var14;
                     if (var13 == 0) {
                        for(var14 = 0; var14 < this.pixelsPerTile; ++var14) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, (64 - var2) * this.pixelsPerTile - 1 - var14, 1, var12);
                        }
                     } else {
                        for(var14 = 0; var14 < this.pixelsPerTile; ++var14) {
                           Rasterizer2D.Rasterizer2D_drawHorizontalLine(var14 + this.pixelsPerTile * var1, var14 + this.pixelsPerTile * (63 - var2), 1, var12);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("ad")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "-1769642683"
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
         int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && var12.hasValidElement()) {
            var12.screenX = var10;
            var12.screenY = var11;
            WorldMapElement var13 = class354.WorldMapElement_get(var12.getElement());
            if (!var3.contains(var13.getObjectId())) {
               this.method5187(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;IIS)V",
      garbageValue = "20836"
   )
   void method5164(HashSet var1, int var2, int var3) {
      Iterator var4 = this.icon0List.iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            WorldMapElement var6 = class354.WorldMapElement_get(var5.getElement());
            if (var6 != null && var1.contains(var6.getObjectId())) {
               this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lhw;IIIII)V",
      garbageValue = "-1649381751"
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

   @ObfuscatedName("by")
   @ObfuscatedSignature(
      descriptor = "(Lkg;IIFB)V",
      garbageValue = "62"
   )
   void method5187(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      WorldMapElement var5 = class354.WorldMapElement_get(var1.getElement());
      this.method5221(var5, var2, var3);
      this.method5192(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "(Lhw;IIB)V",
      garbageValue = "0"
   )
   void method5221(WorldMapElement var1, int var2, int var3) {
      SpritePixels var4 = var1.getSpriteBool(false);
      if (var4 != null) {
         int var5 = this.method5205(var4, var1.horizontalAlignment);
         int var6 = this.method5181(var4, var1.verticalAlignment);
         var4.drawTransBgAt(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("bi")
   @ObfuscatedSignature(
      descriptor = "(Lkg;Lhw;IIFB)V",
      garbageValue = "8"
   )
   void method5192(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      WorldMapLabel var6 = var1.getLabel();
      if (var6 != null) {
         if (var6.size.method5046(var5)) {
            Font var7 = (Font)this.fonts.get(var6.size);
            var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1917, 0, 1, 0, var7.ascent / 2);
         }
      }
   }

   @ObfuscatedName("be")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "-2097457957"
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
            var7.screenX = (int)(var5 * (float)var8 + (float)var1);
            var7.screenY = (int)((float)(63 - var9) * var5 + (float)var2);
            if (!var3.contains(var7.getElement())) {
               this.method5187(var7, var7.screenX, var7.screenY, var5);
            }
         }
      }

   }

   @ObfuscatedName("bk")
   @ObfuscatedSignature(
      descriptor = "(Ltq;Lhd;B)I",
      garbageValue = "30"
   )
   int method5205(SpritePixels var1, HorizontalAlignment var2) {
      switch (var2.value) {
         case 0:
            return 0;
         case 2:
            return -var1.subWidth / 2;
         default:
            return -var1.subWidth;
      }
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(Ltq;Lhn;I)I",
      garbageValue = "-1956047929"
   )
   int method5181(SpritePixels var1, VerticalAlignment var2) {
      switch (var2.value) {
         case 1:
            return -var1.subHeight / 2;
         case 2:
            return 0;
         default:
            return -var1.subHeight;
      }
   }

   @ObfuscatedName("bo")
   @ObfuscatedSignature(
      descriptor = "(II)Lku;",
      garbageValue = "-1151256626"
   )
   WorldMapLabel method5193(int var1) {
      WorldMapElement var2 = class354.WorldMapElement_get(var1);
      return this.createMapLabel(var2);
   }

   @ObfuscatedName("bz")
   @ObfuscatedSignature(
      descriptor = "(Lhw;I)Lku;",
      garbageValue = "433294126"
   )
   @Export("createMapLabel")
   WorldMapLabel createMapLabel(WorldMapElement var1) {
      if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
         WorldMapLabelSize var2 = WorldMapLabelSize.method5047(var1.textSize);
         if (var2 == null) {
            return null;
         } else {
            Font var3 = (Font)this.fonts.get(var2);
            if (var3 == null) {
               return null;
            } else {
               int var4 = var3.lineCount(var1.name, 1000000);
               String[] var5 = new String[var4];
               var3.breakLines(var1.name, (int[])null, var5);
               int var6 = var5.length * var3.ascent / 2;
               int var7 = 0;
               String[] var8 = var5;

               for(int var9 = 0; var9 < var8.length; ++var9) {
                  String var10 = var8[var9];
                  int var11 = var3.stringWidth(var10);
                  if (var11 > var7) {
                     var7 = var11;
                  }
               }

               return new WorldMapLabel(var1.name, var7, var6, var2);
            }
         }
      } else {
         return null;
      }
   }

   @ObfuscatedName("bm")
   @ObfuscatedSignature(
      descriptor = "(IIIIIB)Ljava/util/List;",
      garbageValue = "-100"
   )
   List method5264(int var1, int var2, int var3, int var4, int var5) {
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

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/List;",
      garbageValue = "26"
   )
   @Export("icons")
   List icons() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.icon0List);
      var1.addAll(this.iconMap.values());
      return var1;
   }

   @ObfuscatedName("bt")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "0"
   )
   void method5188(int var1, int var2, int var3, int var4) {
      var3 %= 4;
      if (var3 == 0) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 1) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 2) {
         Rasterizer2D.Rasterizer2D_drawVerticalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, var4);
      }

      if (var3 == 3) {
         Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, this.pixelsPerTile, var4);
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-28927295"
   )
   @Export("clearItemContainer")
   static void clearItemContainer(int var0) {
      ItemContainer var1 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var1 != null) {
         for(int var2 = 0; var2 < var1.ids.length; ++var2) {
            var1.ids[var2] = -1;
            var1.quantities[var2] = 0;
         }

      }
   }
}
