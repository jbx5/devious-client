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

@ObfuscatedName("ii")
@Implements("WorldMapRegion")
public class WorldMapRegion {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "Lje;"
   )
   @Export("WorldMapRegion_cachedSprites")
   public static DemotingHashTable WorldMapRegion_cachedSprites = new DemotingHashTable(37748736, 256);
   @ObfuscatedName("eg")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive10")
   static Archive archive10;
   @ObfuscatedName("j")
   @ObfuscatedGetter(
      intValue = -1505137813
   )
   @Export("regionX")
   int regionX;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = -113933645
   )
   @Export("regionY")
   int regionY;
   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "Lht;"
   )
   @Export("worldMapData_0")
   WorldMapData_0 worldMapData_0;
   @ObfuscatedName("n")
   @Export("worldMapData1List")
   LinkedList worldMapData1List;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -508576805
   )
   @Export("backgroundColor")
   int backgroundColor;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 170570097
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("s")
   @Export("icon0List")
   List icon0List;
   @ObfuscatedName("p")
   @Export("iconMap")
   HashMap iconMap;
   @ObfuscatedName("b")
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

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IIIS)V",
      garbageValue = "514"
   )
   void method4829(int var1, int var2, int var3) {
      SpritePixels var4 = HealthBarDefinition.method3494(this.regionX, this.regionY, this.pixelsPerTile);
      if (var4 != null) {
         if (var3 == this.pixelsPerTile * 64) {
            var4.drawAt(var1, var2);
         } else {
            var4.drawScaledWorldmap(var1, var2, var3, var3);
         }

      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lht;Ljava/util/List;I)V",
      garbageValue = "1714994286"
   )
   @Export("initWorldMapData0")
   void initWorldMapData0(WorldMapData_0 var1, List var2) {
      this.iconMap.clear();
      this.worldMapData_0 = var1;
      this.addAllToIconList(var2);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;Ljava/util/List;I)V",
      garbageValue = "-34628115"
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

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(IIIILie;I)V",
      garbageValue = "-508709856"
   )
   @Export("getIconsForTiles")
   void getIconsForTiles(int var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      for(int var6 = var1; var6 < var3 + var1; ++var6) {
         label49:
         for(int var7 = var2; var7 < var2 + var4; ++var7) {
            for(int var8 = 0; var8 < var5.planes; ++var8) {
               WorldMapDecoration[] var9 = var5.decorations[var8][var6][var7];
               if (var9 != null && var9.length != 0) {
                  WorldMapDecoration[] var10 = var9;

                  for(int var11 = 0; var11 < var10.length; ++var11) {
                     WorldMapDecoration var12 = var10[var11];
                     ObjectComposition var13 = InterfaceParent.getObjectDefinition(var12.objectDefinitionId);
                     if (class152.method3186(var13)) {
                        this.getIcon(var13, var8, var6, var7, var5);
                        continue label49;
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lgm;IIILie;I)V",
      garbageValue = "-35500709"
   )
   @Export("getIcon")
   void getIcon(ObjectComposition var1, int var2, int var3, int var4, AbstractWorldMapData var5) {
      Coord var6 = new Coord(var2, var3 + this.regionX * 64, this.regionY * 64 + var4);
      Coord var7 = null;
      if (this.worldMapData_0 != null) {
         var7 = new Coord(this.worldMapData_0.minPlane + var2, var3 + this.worldMapData_0.regionXLow * 4096, this.worldMapData_0.regionYLow * 4096 + var4);
      } else {
         WorldMapData_1 var8 = (WorldMapData_1)var5;
         var7 = new Coord(var2 + var8.minPlane, var8.regionXLow * 4096 + var3 + var8.getChunkXLow() * 8, var4 + var8.regionYLow * 4096 + var8.getChunkYLow() * 8);
      }

      WorldMapElement var9;
      Object var10;
      if (var1.transforms != null) {
         var10 = new WorldMapIcon_1(var7, var6, var1.id, this);
      } else {
         var9 = Actor.WorldMapElement_get(var1.mapIconId);
         var10 = new WorldMapIcon_0(var7, var6, var9.objectId, this.createMapLabel(var9));
      }

      var9 = Actor.WorldMapElement_get(((AbstractWorldMapIcon)var10).getElement());
      if (var9.field1879) {
         this.iconMap.put(new Coord(0, var3, var4), var10);
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-187541676"
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
      descriptor = "(Ljava/util/List;B)V",
      garbageValue = "1"
   )
   @Export("addAllToIconList")
   void addAllToIconList(List var1) {
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         WorldMapIcon_0 var3 = (WorldMapIcon_0)var2.next();
         if (Actor.WorldMapElement_get(var3.element).field1879 && var3.coord2.x >> 6 == this.regionX && var3.coord2.y >> 6 == this.regionY) {
            WorldMapIcon_0 var4 = new WorldMapIcon_0(var3.coord2, var3.coord2, var3.element, this.method4916(var3.element));
            this.icon0List.add(var4);
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-9"
   )
   void method4836() {
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

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Llg;B)Z",
      garbageValue = "-66"
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

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      descriptor = "(ILif;[Lry;Llg;Llg;I)V",
      garbageValue = "-1727272163"
   )
   @Export("drawTile")
   void drawTile(int var1, WorldMapScaleHandler var2, IndexedSprite[] var3, AbstractArchive var4, AbstractArchive var5) {
      this.pixelsPerTile = var1;
      if (this.worldMapData_0 != null || !this.worldMapData1List.isEmpty()) {
         if (HealthBarDefinition.method3494(this.regionX, this.regionY, var1) == null) {
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
                  var9 = new WorldMapSprite(KeyHandler.method394(var7).pixels);
               }

               SpritePixels var11 = new SpritePixels(this.pixelsPerTile * 64, this.pixelsPerTile * 64);
               var11.setRaster();
               if (this.worldMapData_0 != null) {
                  this.method4938(var2, var3, var9);
               } else {
                  this.method4841(var2, var3, var9);
               }

               int var12 = this.regionX;
               int var13 = this.regionY;
               int var14 = this.pixelsPerTile;
               WorldMapRegion_cachedSprites.put(var11, SpotAnimationDefinition.method3591(var12, var13, var14), var11.pixels.length * 4);
               this.method4836();
            }
         }
      }
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(IIILjava/util/HashSet;B)V",
      garbageValue = "8"
   )
   void method4914(int var1, int var2, int var3, HashSet var4) {
      if (var4 == null) {
         var4 = new HashSet();
      }

      this.drawNonLinkMapIcons(var1, var2, var4, var3);
      this.drawMapLinks(var1, var2, var4, var3);
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;III)V",
      garbageValue = "1136019254"
   )
   @Export("flashElements")
   void flashElements(HashSet var1, int var2, int var3) {
      Iterator var4 = this.iconMap.values().iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            int var6 = var5.getElement();
            if (var1.contains(var6)) {
               WorldMapElement var7 = Actor.WorldMapElement_get(var6);
               this.drawBackgroundCircle(var7, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

      this.method4849(var1, var2, var3);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(Lif;[Lry;Lig;B)V",
      garbageValue = "5"
   )
   void method4938(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      int var4;
      int var5;
      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.drawTileGround(var4, var5, this.worldMapData_0, var1, var3);
            this.method4922(var4, var5, this.worldMapData_0, var1);
         }
      }

      for(var4 = 0; var4 < 64; ++var4) {
         for(var5 = 0; var5 < 64; ++var5) {
            this.method4842(var4, var5, this.worldMapData_0, var1, var2);
         }
      }

   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(Lif;[Lry;Lig;I)V",
      garbageValue = "1271958949"
   )
   void method4841(WorldMapScaleHandler var1, IndexedSprite[] var2, WorldMapSprite var3) {
      Iterator var4 = this.worldMapData1List.iterator();

      WorldMapData_1 var5;
      int var6;
      int var7;
      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.drawTileGround(var6, var7, var5, var1, var3);
               this.method4922(var6, var7, var5, var1);
            }
         }
      }

      var4 = this.worldMapData1List.iterator();

      while(var4.hasNext()) {
         var5 = (WorldMapData_1)var4.next();

         for(var6 = var5.getChunkX() * 8; var6 < var5.getChunkX() * 8 + 8; ++var6) {
            for(var7 = var5.getChunkY() * 8; var7 < var5.getChunkY() * 8 + 8; ++var7) {
               this.method4842(var6, var7, var5, var1, var2);
            }
         }
      }

   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(IILie;Lif;[Lry;I)V",
      garbageValue = "2137387765"
   )
   void method4842(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4, IndexedSprite[] var5) {
      this.method4847(var1, var2, var3);
      this.method4839(var1, var2, var3, var5);
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IILie;Lif;Lig;I)V",
      garbageValue = "-382747084"
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
         } else if (var11.secondaryRgb >= 0) {
            var9 = var11.secondaryRgb | -16777216;
         } else {
            int var14;
            int var15;
            if (var11.texture >= 0) {
               var14 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var11.texture);
               var15 = 96;
               int var21;
               if (var14 == -2) {
                  var21 = 12345678;
               } else if (var14 == -1) {
                  if (var15 < 0) {
                     var15 = 0;
                  } else if (var15 > 127) {
                     var15 = 127;
                  }

                  var15 = 127 - var15;
                  var21 = var15;
               } else {
                  var15 = var15 * (var14 & 127) / 128;
                  if (var15 < 2) {
                     var15 = 2;
                  } else if (var15 > 126) {
                     var15 = 126;
                  }

                  var21 = var15 + (var14 & 'ﾀ');
               }

               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var21] | -16777216;
            } else if (var11.primaryRgb == 16711935) {
               var9 = var10;
            } else {
               var14 = var11.hue;
               var15 = var11.saturation;
               int var16 = var11.lightness;
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

               int var17 = (var15 / 32 << 7) + var16 / 2 + (var14 / 4 << 10);
               int var19 = 96;
               int var18;
               if (var17 == -2) {
                  var18 = 12345678;
               } else if (var17 == -1) {
                  if (var19 < 0) {
                     var19 = 0;
                  } else if (var19 > 127) {
                     var19 = 127;
                  }

                  var19 = 127 - var19;
                  var18 = var19;
               } else {
                  var19 = var19 * (var17 & 127) / 128;
                  if (var19 < 2) {
                     var19 = 2;
                  } else if (var19 > 126) {
                     var19 = 126;
                  }

                  var18 = var19 + (var17 & 'ﾀ');
               }

               var9 = Rasterizer3D.Rasterizer3D_colorPalette[var18] | -16777216;
            }
         }

         var8 = var9;
      }

      if (var7 > -1 && var3.field2886[0][var1][var2] == 0) {
         Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var8);
      } else {
         var9 = this.method4845(var1, var2, var3, var5);
         if (var7 == -1) {
            Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var9);
         } else {
            var4.method5286(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), var9, var8, this.pixelsPerTile, this.pixelsPerTile, var3.field2886[0][var1][var2], var3.field2887[0][var1][var2]);
         }
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(IILie;Lif;I)V",
      garbageValue = "-2013884571"
   )
   void method4922(int var1, int var2, AbstractWorldMapData var3, WorldMapScaleHandler var4) {
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
            } else if (var9.secondaryRgb >= 0) {
               var7 = var9.secondaryRgb | -16777216;
            } else {
               int var12;
               int var13;
               if (var9.texture >= 0) {
                  var12 = Rasterizer3D.Rasterizer3D_textureLoader.getAverageTextureRGB(var9.texture);
                  var13 = 96;
                  int var19;
                  if (var12 == -2) {
                     var19 = 12345678;
                  } else if (var12 == -1) {
                     if (var13 < 0) {
                        var13 = 0;
                     } else if (var13 > 127) {
                        var13 = 127;
                     }

                     var13 = 127 - var13;
                     var19 = var13;
                  } else {
                     var13 = var13 * (var12 & 127) / 128;
                     if (var13 < 2) {
                        var13 = 2;
                     } else if (var13 > 126) {
                        var13 = 126;
                     }

                     var19 = var13 + (var12 & 'ﾀ');
                  }

                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var19] | -16777216;
               } else if (var9.primaryRgb == 16711935) {
                  var7 = var8;
               } else {
                  var12 = var9.hue;
                  var13 = var9.saturation;
                  int var14 = var9.lightness;
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

                  int var15 = (var13 / 32 << 7) + var14 / 2 + (var12 / 4 << 10);
                  int var17 = 96;
                  int var16;
                  if (var15 == -2) {
                     var16 = 12345678;
                  } else if (var15 == -1) {
                     if (var17 < 0) {
                        var17 = 0;
                     } else if (var17 > 127) {
                        var17 = 127;
                     }

                     var17 = 127 - var17;
                     var16 = var17;
                  } else {
                     var17 = var17 * (var15 & 127) / 128;
                     if (var17 < 2) {
                        var17 = 2;
                     } else if (var17 > 126) {
                        var17 = 126;
                     }

                     var16 = var17 + (var15 & 'ﾀ');
                  }

                  var7 = Rasterizer3D.Rasterizer3D_colorPalette[var16] | -16777216;
               }
            }

            if (var3.field2886[var5][var1][var2] == 0) {
               Rasterizer2D.Rasterizer2D_fillRectangle(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile, this.pixelsPerTile, var7);
            } else {
               var4.method5286(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 0, var7, this.pixelsPerTile, this.pixelsPerTile, var3.field2886[var5][var1][var2], var3.field2887[var5][var1][var2]);
            }
         }
      }

   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IILie;Lig;S)I",
      garbageValue = "22414"
   )
   int method4845(int var1, int var2, AbstractWorldMapData var3, WorldMapSprite var4) {
      return var3.floorUnderlayIds[0][var1][var2] == 0 ? this.backgroundColor : var4.getTileColor(var1, var2);
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IILie;[Lry;B)V",
      garbageValue = "1"
   )
   void method4839(int var1, int var2, AbstractWorldMapData var3, IndexedSprite[] var4) {
      for(int var5 = 0; var5 < var3.planes; ++var5) {
         WorldMapDecoration[] var6 = var3.decorations[var5][var1][var2];
         if (var6 != null && var6.length != 0) {
            WorldMapDecoration[] var7 = var6;

            for(int var8 = 0; var8 < var7.length; ++var8) {
               WorldMapDecoration var9 = var7[var8];
               int var11 = var9.decoration;
               boolean var10 = var11 >= WorldMapDecorationType.field3692.id && var11 <= WorldMapDecorationType.field3682.id;
               if (var10 || ItemContainer.method2221(var9.decoration)) {
                  ObjectComposition var12 = InterfaceParent.getObjectDefinition(var9.objectDefinitionId);
                  if (var12.mapSceneId != -1) {
                     if (var12.mapSceneId != 46 && var12.mapSceneId != 52) {
                        var4[var12.mapSceneId].method8806(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2, this.pixelsPerTile * 2);
                     } else {
                        var4[var12.mapSceneId].method8806(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), this.pixelsPerTile * 2 + 1, this.pixelsPerTile * 2 + 1);
                     }
                  }
               }
            }
         }
      }

   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IILie;I)V",
      garbageValue = "1702557254"
   )
   void method4847(int var1, int var2, AbstractWorldMapData var3) {
      for(int var4 = 0; var4 < var3.planes; ++var4) {
         WorldMapDecoration[] var5 = var3.decorations[var4][var1][var2];
         if (var5 != null && var5.length != 0) {
            WorldMapDecoration[] var6 = var5;

            for(int var7 = 0; var7 < var6.length; ++var7) {
               WorldMapDecoration var8 = var6[var7];
               if (AbstractWorldMapData.method5144(var8.decoration)) {
                  ObjectComposition var9 = InterfaceParent.getObjectDefinition(var8.objectDefinitionId);
                  int var10 = var9.int1 != 0 ? -3407872 : -3355444;
                  if (var8.decoration == WorldMapDecorationType.field3685.id) {
                     this.method4861(var1, var2, var8.rotation, var10);
                  }

                  if (var8.decoration == WorldMapDecorationType.field3684.id) {
                     this.method4861(var1, var2, var8.rotation, -3355444);
                     this.method4861(var1, var2, var8.rotation + 1, var10);
                  }

                  if (var8.decoration == WorldMapDecorationType.field3688.id) {
                     if (var8.rotation == 0) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if (var8.rotation == 1) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile + this.pixelsPerTile * var1 - 1, this.pixelsPerTile * (63 - var2), 1, var10);
                     }

                     if (var8.rotation == 2) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1 + this.pixelsPerTile - 1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }

                     if (var8.rotation == 3) {
                        Rasterizer2D.Rasterizer2D_drawHorizontalLine(this.pixelsPerTile * var1, this.pixelsPerTile * (63 - var2) + this.pixelsPerTile - 1, 1, var10);
                     }
                  }

                  if (var8.decoration == WorldMapDecorationType.field3676.id) {
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

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;II)V",
      garbageValue = "2008207626"
   )
   @Export("drawNonLinkMapIcons")
   void drawNonLinkMapIcons(int var1, int var2, HashSet var3, int var4) {
      float var5 = (float)var4 / 64.0F;
      float var6 = var5 / 2.0F;
      Iterator var7 = this.iconMap.entrySet().iterator();

      while(var7.hasNext()) {
         Map.Entry var8 = (Map.Entry)var7.next();
         Coord var9 = (Coord)var8.getKey();
         int var10 = (int)((float)var1 + var5 * (float)var9.x - var6);
         int var11 = (int)((float)(var2 + var4) - (float)var9.y * var5 - var6);
         AbstractWorldMapIcon var12 = (AbstractWorldMapIcon)var8.getValue();
         if (var12 != null && var12.hasValidElement()) {
            var12.screenX = var10;
            var12.screenY = var11;
            WorldMapElement var13 = Actor.WorldMapElement_get(var12.getElement());
            if (!var3.contains(var13.getObjectId())) {
               this.method4851(var12, var10, var11, var5);
            }
         }
      }

   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(Ljava/util/HashSet;III)V",
      garbageValue = "-1125443658"
   )
   void method4849(HashSet var1, int var2, int var3) {
      Iterator var4 = this.icon0List.iterator();

      while(var4.hasNext()) {
         AbstractWorldMapIcon var5 = (AbstractWorldMapIcon)var4.next();
         if (var5.hasValidElement()) {
            WorldMapElement var6 = Actor.WorldMapElement_get(var5.getElement());
            if (var6 != null && var1.contains(var6.getObjectId())) {
               this.drawBackgroundCircle(var6, var5.screenX, var5.screenY, var2, var3);
            }
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Lfd;IIIIB)V",
      garbageValue = "-78"
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

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Liq;IIFI)V",
      garbageValue = "1755619389"
   )
   void method4851(AbstractWorldMapIcon var1, int var2, int var3, float var4) {
      WorldMapElement var5 = Actor.WorldMapElement_get(var1.getElement());
      this.method4852(var5, var2, var3);
      this.method4857(var1, var5, var2, var3, var4);
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfd;III)V",
      garbageValue = "-1395404143"
   )
   void method4852(WorldMapElement var1, int var2, int var3) {
      SpritePixels var4 = var1.getSpriteBool(false);
      if (var4 != null) {
         int var5 = this.method4890(var4, var1.horizontalAlignment);
         int var6 = this.method4856(var4, var1.verticalAlignment);
         var4.drawTransBgAt(var5 + var2, var3 + var6);
      }

   }

   @ObfuscatedName("ah")
   @ObfuscatedSignature(
      descriptor = "(Liq;Lfd;IIFI)V",
      garbageValue = "-1112729221"
   )
   void method4857(AbstractWorldMapIcon var1, WorldMapElement var2, int var3, int var4, float var5) {
      WorldMapLabel var6 = var1.getLabel();
      if (var6 != null) {
         if (var6.size.method4685(var5)) {
            Font var7 = (Font)this.fonts.get(var6.size);
            var7.drawLines(var6.text, var3 - var6.width / 2, var4, var6.width, var6.height, -16777216 | var2.field1883, 0, 1, 0, var7.ascent / 2);
         }
      }
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IILjava/util/HashSet;IB)V",
      garbageValue = "-83"
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
               this.method4851(var7, var7.screenX, var7.screenY, var5);
            }
         }
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(Lri;Lgl;B)I",
      garbageValue = "-16"
   )
   int method4890(SpritePixels var1, HorizontalAlignment var2) {
      switch (var2.value) {
         case 0:
            return -var1.subWidth / 2;
         case 1:
            return 0;
         default:
            return -var1.subWidth;
      }
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lri;Lga;B)I",
      garbageValue = "-56"
   )
   int method4856(SpritePixels var1, VerticalAlignment var2) {
      switch (var2.value) {
         case 0:
            return 0;
         case 1:
            return -var1.subHeight / 2;
         default:
            return -var1.subHeight;
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)Liz;",
      garbageValue = "1929154767"
   )
   WorldMapLabel method4916(int var1) {
      WorldMapElement var2 = Actor.WorldMapElement_get(var1);
      return this.createMapLabel(var2);
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lfd;B)Liz;",
      garbageValue = "6"
   )
   @Export("createMapLabel")
   WorldMapLabel createMapLabel(WorldMapElement var1) {
      if (var1.name != null && this.fonts != null && this.fonts.get(WorldMapLabelSize.WorldMapLabelSize_small) != null) {
         WorldMapLabelSize var2 = WorldMapLabelSize.method4686(var1.textSize);
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

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)Ljava/util/List;",
      garbageValue = "203643147"
   )
   List method4859(int var1, int var2, int var3, int var4, int var5) {
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)Ljava/util/List;",
      garbageValue = "-19"
   )
   @Export("icons")
   List icons() {
      LinkedList var1 = new LinkedList();
      var1.addAll(this.icon0List);
      var1.addAll(this.iconMap.values());
      return var1;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "1"
   )
   void method4861(int var1, int var2, int var3, int var4) {
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

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      descriptor = "(Lqr;IIIIIII)V",
      garbageValue = "-970443379"
   )
   @Export("loadTerrain")
   static final void loadTerrain(Buffer var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      if (var2 >= 0 && var2 < 104 && var3 >= 0 && var3 < 104) {
         Tiles.Tiles_renderFlags[var1][var2][var3] = 0;

         while(true) {
            var7 = Client.field789 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort();
            if (var7 == 0) {
               if (var1 == 0) {
                  Tiles.Tiles_heights[0][var2][var3] = -class4.method15(932731 + var2 + var4, var5 + 556238 + var3) * 8;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - 240;
               }
               break;
            }

            if (var7 == 1) {
               int var8 = var0.readUnsignedByte();
               if (var8 == 1) {
                  var8 = 0;
               }

               if (var1 == 0) {
                  Tiles.Tiles_heights[0][var2][var3] = -var8 * 8;
               } else {
                  Tiles.Tiles_heights[var1][var2][var3] = Tiles.Tiles_heights[var1 - 1][var2][var3] - var8 * 8;
               }
               break;
            }

            if (var7 <= 49) {
               Tiles.Tiles_overlays[var1][var2][var3] = Client.field789 < 209 ? (short)var0.readByte() : (short)var0.readShort();
               Tiles.Tiles_shapes[var1][var2][var3] = (byte)((var7 - 2) / 4);
               PlayerCompositionColorTextureOverride.field1852[var1][var2][var3] = (byte)(var7 - 2 + var6 & 3);
            } else if (var7 <= 81) {
               Tiles.Tiles_renderFlags[var1][var2][var3] = (byte)(var7 - 49);
            } else {
               Tiles.Tiles_underlays[var1][var2][var3] = (short)(var7 - 81);
            }
         }
      } else {
         while(true) {
            var7 = Client.field789 < 209 ? var0.readUnsignedByte() : var0.readUnsignedShort();
            if (var7 == 0) {
               break;
            }

            if (var7 == 1) {
               var0.readUnsignedByte();
               break;
            }

            if (var7 <= 49) {
               if (Client.field789 < 209) {
                  var0.readByte();
               } else {
                  var0.readShort();
               }
            }
         }
      }

   }

   @ObfuscatedName("d")
   @ObfuscatedSignature(
      descriptor = "(Lqr;J)V"
   )
   static void method4963(Buffer var0, long var1) {
      var1 /= 10L;
      if (var1 < 0L) {
         var1 = 0L;
      } else if (var1 > 65535L) {
         var1 = 65535L;
      }

      var0.writeShort((int)var1);
   }
}
