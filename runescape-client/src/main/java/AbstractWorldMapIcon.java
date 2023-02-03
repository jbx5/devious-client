import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("io")
@Implements("AbstractWorldMapIcon")
public abstract class AbstractWorldMapIcon {
   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "Lko;"
   )
   @Export("coord2")
   public final Coord coord2;
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lko;"
   )
   @Export("coord1")
   public final Coord coord1;
   @ObfuscatedName("l")
   @ObfuscatedGetter(
      intValue = 2126070551
   )
   @Export("screenX")
   int screenX;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1014530325
   )
   @Export("screenY")
   int screenY;

   @ObfuscatedSignature(
      descriptor = "(Lko;Lko;)V"
   )
   AbstractWorldMapIcon(Coord var1, Coord var2) {
      this.coord1 = var1;
      this.coord2 = var2;
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1964880024"
   )
   @Export("getElement")
   public abstract int getElement();

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(I)Lil;",
      garbageValue = "-1317041670"
   )
   @Export("getLabel")
   abstract WorldMapLabel getLabel();

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "7"
   )
   @Export("getSubWidth")
   abstract int getSubWidth();

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "1769700454"
   )
   @Export("getSubHeight")
   abstract int getSubHeight();

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "-932852742"
   )
   @Export("fitsScreen")
   boolean fitsScreen(int var1, int var2) {
      if (this.elementFitsScreen(var1, var2)) {
         return true;
      } else {
         return this.labelFitsScreen(var1, var2);
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "126"
   )
   @Export("hasValidElement")
   boolean hasValidElement() {
      return this.getElement() >= 0;
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      descriptor = "(III)Z",
      garbageValue = "1650119608"
   )
   @Export("elementFitsScreen")
   boolean elementFitsScreen(int var1, int var2) {
      if (!this.hasValidElement()) {
         return false;
      } else {
         WorldMapElement var3 = class4.WorldMapElement_get(this.getElement());
         int var4 = this.getSubWidth();
         int var5 = this.getSubHeight();
         switch (var3.horizontalAlignment.value) {
            case 0:
               if (var1 > this.screenX - var4 && var1 <= this.screenX) {
                  break;
               }

               return false;
            case 1:
               if (var1 >= this.screenX && var1 < var4 + this.screenX) {
                  break;
               }

               return false;
            case 2:
               if (var1 < this.screenX - var4 / 2 || var1 > var4 / 2 + this.screenX) {
                  return false;
               }
         }

         switch (var3.verticalAlignment.value) {
            case 0:
               if (var2 >= this.screenY && var2 < var5 + this.screenY) {
                  break;
               }

               return false;
            case 1:
               if (var2 > this.screenY - var5 && var2 <= this.screenY) {
                  break;
               }

               return false;
            case 2:
               if (var2 < this.screenY - var5 / 2 || var2 > var5 / 2 + this.screenY) {
                  return false;
               }
         }

         return true;
      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "38"
   )
   @Export("labelFitsScreen")
   boolean labelFitsScreen(int var1, int var2) {
      WorldMapLabel var3 = this.getLabel();
      if (var3 == null) {
         return false;
      } else if (var1 >= this.screenX - var3.width / 2 && var1 <= var3.width / 2 + this.screenX) {
         return var2 >= this.screenY && var2 <= var3.height + this.screenY;
      } else {
         return false;
      }
   }

   @ObfuscatedName("hp")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "-574378563"
   )
   @Export("drawObject")
   static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
      long var5 = WorldMapAreaData.scene.getBoundaryObjectTag(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var14;
      int var26;
      if (var5 != 0L) {
         var7 = WorldMapAreaData.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         boolean var12 = 0L != var5;
         if (var12) {
            boolean var13 = (int)(var5 >>> 16 & 1L) == 1;
            var12 = !var13;
         }

         if (var12) {
            var10 = var4;
         }

         int[] var19 = class31.sceneMinimapSprite.pixels;
         var26 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var14 = class124.Entity_unpackID(var5);
         ObjectComposition var15 = class463.getObjectDefinition(var14);
         if (var15.mapSceneId != -1) {
            IndexedSprite var16 = VarpDefinition.mapSceneSprites[var15.mapSceneId];
            if (var16 != null) {
               int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
               int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
               var16.drawAt(var1 * 4 + var17 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48);
            }
         } else {
            if (var9 == 0 || var9 == 2) {
               if (var8 == 0) {
                  var19[var26] = var10;
                  var19[var26 + 512] = var10;
                  var19[var26 + 1024] = var10;
                  var19[var26 + 1536] = var10;
               } else if (var8 == 1) {
                  var19[var26] = var10;
                  var19[var26 + 1] = var10;
                  var19[var26 + 2] = var10;
                  var19[var26 + 3] = var10;
               } else if (var8 == 2) {
                  var19[var26 + 3] = var10;
                  var19[var26 + 512 + 3] = var10;
                  var19[var26 + 1024 + 3] = var10;
                  var19[var26 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var19[var26 + 1536] = var10;
                  var19[var26 + 1536 + 1] = var10;
                  var19[var26 + 1536 + 2] = var10;
                  var19[var26 + 1536 + 3] = var10;
               }
            }

            if (var9 == 3) {
               if (var8 == 0) {
                  var19[var26] = var10;
               } else if (var8 == 1) {
                  var19[var26 + 3] = var10;
               } else if (var8 == 2) {
                  var19[var26 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var19[var26 + 1536] = var10;
               }
            }

            if (var9 == 2) {
               if (var8 == 3) {
                  var19[var26] = var10;
                  var19[var26 + 512] = var10;
                  var19[var26 + 1024] = var10;
                  var19[var26 + 1536] = var10;
               } else if (var8 == 0) {
                  var19[var26] = var10;
                  var19[var26 + 1] = var10;
                  var19[var26 + 2] = var10;
                  var19[var26 + 3] = var10;
               } else if (var8 == 1) {
                  var19[var26 + 3] = var10;
                  var19[var26 + 512 + 3] = var10;
                  var19[var26 + 1024 + 3] = var10;
                  var19[var26 + 1536 + 3] = var10;
               } else if (var8 == 2) {
                  var19[var26 + 1536] = var10;
                  var19[var26 + 1536 + 1] = var10;
                  var19[var26 + 1536 + 2] = var10;
                  var19[var26 + 1536 + 3] = var10;
               }
            }
         }
      }

      var5 = WorldMapAreaData.scene.getGameObjectTag(var0, var1, var2);
      if (var5 != 0L) {
         var7 = WorldMapAreaData.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = class124.Entity_unpackID(var5);
         ObjectComposition var20 = class463.getObjectDefinition(var10);
         if (var20.mapSceneId != -1) {
            IndexedSprite var28 = VarpDefinition.mapSceneSprites[var20.mapSceneId];
            if (var28 != null) {
               var26 = (var20.sizeX * 4 - var28.subWidth) / 2;
               var14 = (var20.sizeY * 4 - var28.subHeight) / 2;
               var28.drawAt(var26 + var1 * 4 + 48, (104 - var2 - var20.sizeY) * 4 + var14 + 48);
            }
         } else if (var9 == 9) {
            int var25 = 15658734;
            boolean var27 = var5 != 0L;
            if (var27) {
               boolean var21 = (int)(var5 >>> 16 & 1L) == 1;
               var27 = !var21;
            }

            if (var27) {
               var25 = 15597568;
            }

            int[] var22 = class31.sceneMinimapSprite.pixels;
            int var29 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if (var8 != 0 && var8 != 2) {
               var22[var29] = var25;
               var22[var29 + 1 + 512] = var25;
               var22[var29 + 1024 + 2] = var25;
               var22[var29 + 1536 + 3] = var25;
            } else {
               var22[var29 + 1536] = var25;
               var22[var29 + 1 + 1024] = var25;
               var22[var29 + 512 + 2] = var25;
               var22[var29 + 3] = var25;
            }
         }
      }

      var5 = WorldMapAreaData.scene.getFloorDecorationTag(var0, var1, var2);
      if (0L != var5) {
         var7 = class124.Entity_unpackID(var5);
         ObjectComposition var23 = class463.getObjectDefinition(var7);
         if (var23.mapSceneId != -1) {
            IndexedSprite var24 = VarpDefinition.mapSceneSprites[var23.mapSceneId];
            if (var24 != null) {
               var10 = (var23.sizeX * 4 - var24.subWidth) / 2;
               int var11 = (var23.sizeY * 4 - var24.subHeight) / 2;
               var24.drawAt(var10 + var1 * 4 + 48, (104 - var2 - var23.sizeY) * 4 + var11 + 48);
            }
         }
      }

   }
}
