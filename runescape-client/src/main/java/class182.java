import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gf")
public class class182 {
   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(B)[Ldz;",
      garbageValue = "2"
   )
   static class127[] method3636() {
      return new class127[]{class127.field1589, class127.field1592, class127.field1577, class127.field1581, class127.field1579, class127.field1580, class127.field1576, class127.field1582, class127.field1583, class127.field1584, class127.field1585, class127.field1586, class127.field1587, class127.field1578, class127.field1588, class127.field1590, class127.field1591};
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Lly;I)V",
      garbageValue = "1199371061"
   )
   public static void method3627(AbstractArchive var0) {
      VarbitComposition.VarbitDefinition_archive = var0;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "44"
   )
   public static void method3634() {
      synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) {
         if (ArchiveDiskActionHandler.field4173 != 0) {
            ArchiveDiskActionHandler.field4173 = 1;

            try {
               ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock.wait();
            } catch (InterruptedException var3) {
            }
         }

      }
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIB)I",
      garbageValue = "-48"
   )
   static final int method3635(int var0, int var1) {
      if (var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 / 128;
         if (var1 < 2) {
            var1 = 2;
         } else if (var1 > 126) {
            var1 = 126;
         }

         return (var0 & 'ﾀ') + var1;
      }
   }

   @ObfuscatedName("ix")
   @ObfuscatedSignature(
      descriptor = "(IIIIII)V",
      garbageValue = "-1549035405"
   )
   @Export("drawObject")
   static final void drawObject(int var0, int var1, int var2, int var3, int var4) {
      long var5 = ReflectionCheck.scene.getBoundaryObjectTag(var0, var1, var2);
      int var7;
      int var8;
      int var9;
      int var10;
      int var13;
      int var14;
      if (var5 != 0L) {
         var7 = ReflectionCheck.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = var3;
         boolean var11 = 0L != var5 && !class272.method5474(var5);
         if (var11) {
            var10 = var4;
         }

         int[] var12 = GameObject.sceneMinimapSprite.pixels;
         var13 = var1 * 4 + (103 - var2) * 2048 + 24624;
         var14 = Occluder.Entity_unpackID(var5);
         ObjectComposition var15 = VarpDefinition.getObjectDefinition(var14);
         if (var15.mapSceneId != -1) {
            IndexedSprite var16 = class32.mapSceneSprites[var15.mapSceneId];
            if (var16 != null) {
               int var17 = (var15.sizeX * 4 - var16.subWidth) / 2;
               int var18 = (var15.sizeY * 4 - var16.subHeight) / 2;
               var16.drawAt(var17 + var1 * 4 + 48, (104 - var2 - var15.sizeY) * 4 + var18 + 48);
            }
         } else {
            if (var9 == 0 || var9 == 2) {
               if (var8 == 0) {
                  var12[var13] = var10;
                  var12[var13 + 512] = var10;
                  var12[var13 + 1024] = var10;
                  var12[var13 + 1536] = var10;
               } else if (var8 == 1) {
                  var12[var13] = var10;
                  var12[var13 + 1] = var10;
                  var12[var13 + 2] = var10;
                  var12[var13 + 3] = var10;
               } else if (var8 == 2) {
                  var12[var13 + 3] = var10;
                  var12[var13 + 512 + 3] = var10;
                  var12[var13 + 1024 + 3] = var10;
                  var12[var13 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var12[var13 + 1536] = var10;
                  var12[var13 + 1536 + 1] = var10;
                  var12[var13 + 1536 + 2] = var10;
                  var12[var13 + 1536 + 3] = var10;
               }
            }

            if (var9 == 3) {
               if (var8 == 0) {
                  var12[var13] = var10;
               } else if (var8 == 1) {
                  var12[var13 + 3] = var10;
               } else if (var8 == 2) {
                  var12[var13 + 1536 + 3] = var10;
               } else if (var8 == 3) {
                  var12[var13 + 1536] = var10;
               }
            }

            if (var9 == 2) {
               if (var8 == 3) {
                  var12[var13] = var10;
                  var12[var13 + 512] = var10;
                  var12[var13 + 1024] = var10;
                  var12[var13 + 1536] = var10;
               } else if (var8 == 0) {
                  var12[var13] = var10;
                  var12[var13 + 1] = var10;
                  var12[var13 + 2] = var10;
                  var12[var13 + 3] = var10;
               } else if (var8 == 1) {
                  var12[var13 + 3] = var10;
                  var12[var13 + 512 + 3] = var10;
                  var12[var13 + 1024 + 3] = var10;
                  var12[var13 + 1536 + 3] = var10;
               } else if (var8 == 2) {
                  var12[var13 + 1536] = var10;
                  var12[var13 + 1536 + 1] = var10;
                  var12[var13 + 1536 + 2] = var10;
                  var12[var13 + 1536 + 3] = var10;
               }
            }
         }
      }

      var5 = ReflectionCheck.scene.getGameObjectTag(var0, var1, var2);
      if (var5 != 0L) {
         var7 = ReflectionCheck.scene.getObjectFlags(var0, var1, var2, var5);
         var8 = var7 >> 6 & 3;
         var9 = var7 & 31;
         var10 = Occluder.Entity_unpackID(var5);
         ObjectComposition var19 = VarpDefinition.getObjectDefinition(var10);
         if (var19.mapSceneId != -1) {
            IndexedSprite var26 = class32.mapSceneSprites[var19.mapSceneId];
            if (var26 != null) {
               var13 = (var19.sizeX * 4 - var26.subWidth) / 2;
               var14 = (var19.sizeY * 4 - var26.subHeight) / 2;
               var26.drawAt(var1 * 4 + var13 + 48, (104 - var2 - var19.sizeY) * 4 + var14 + 48);
            }
         } else if (var9 == 9) {
            int var20 = 15658734;
            boolean var27 = var5 != 0L && !class272.method5474(var5);
            if (var27) {
               var20 = 15597568;
            }

            int[] var21 = GameObject.sceneMinimapSprite.pixels;
            int var22 = var1 * 4 + (103 - var2) * 2048 + 24624;
            if (var8 != 0 && var8 != 2) {
               var21[var22] = var20;
               var21[var22 + 1 + 512] = var20;
               var21[var22 + 1024 + 2] = var20;
               var21[var22 + 1536 + 3] = var20;
            } else {
               var21[var22 + 1536] = var20;
               var21[var22 + 1 + 1024] = var20;
               var21[var22 + 512 + 2] = var20;
               var21[var22 + 3] = var20;
            }
         }
      }

      var5 = ReflectionCheck.scene.getFloorDecorationTag(var0, var1, var2);
      if (0L != var5) {
         var7 = Occluder.Entity_unpackID(var5);
         ObjectComposition var23 = VarpDefinition.getObjectDefinition(var7);
         if (var23.mapSceneId != -1) {
            IndexedSprite var24 = class32.mapSceneSprites[var23.mapSceneId];
            if (var24 != null) {
               var10 = (var23.sizeX * 4 - var24.subWidth) / 2;
               int var25 = (var23.sizeY * 4 - var24.subHeight) / 2;
               var24.drawAt(var10 + var1 * 4 + 48, var25 + (104 - var2 - var23.sizeY) * 4 + 48);
            }
         }
      }

   }
}
