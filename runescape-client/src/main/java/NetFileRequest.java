import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
   @ObfuscatedName("vc")
   @ObfuscatedSignature(
      descriptor = "Lmj;"
   )
   public static class340 field4144;
   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive")
   public Archive archive;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 623270301
   )
   @Export("crc")
   public int crc;
   @ObfuscatedName("c")
   @Export("padding")
   public byte padding;

   NetFileRequest() {
   }

   @ObfuscatedName("hk")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-330790031"
   )
   static final int method6341() {
      if (BufferedSink.clientPreferences.method2452()) {
         return ApproximateRouteStrategy.Client_plane;
      } else {
         int var0 = 3;
         if (class408.cameraPitch < 310) {
            label166: {
               int var1;
               int var2;
               if (Client.oculusOrbState == 1) {
                  var1 = class31.oculusOrbFocalPointX >> 7;
                  var2 = PendingSpawn.oculusOrbFocalPointY >> 7;
               } else {
                  var1 = class296.localPlayer.x >> 7;
                  var2 = class296.localPlayer.y >> 7;
               }

               int var3 = TextureProvider.cameraX >> 7;
               int var4 = class313.cameraZ >> 7;
               if (var3 >= 0 && var4 >= 0 && var3 < 104 && var4 < 104) {
                  if (var1 >= 0 && var2 >= 0 && var1 < 104 && var2 < 104) {
                     if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) {
                        var0 = ApproximateRouteStrategy.Client_plane;
                     }

                     int var5;
                     if (var1 > var3) {
                        var5 = var1 - var3;
                     } else {
                        var5 = var3 - var1;
                     }

                     int var6;
                     if (var2 > var4) {
                        var6 = var2 - var4;
                     } else {
                        var6 = var4 - var2;
                     }

                     int var7;
                     int var8;
                     if (var5 > var6) {
                        var7 = var6 * 65536 / var5;
                        var8 = 32768;

                        while(true) {
                           if (var1 == var3) {
                              break label166;
                           }

                           if (var3 < var1) {
                              ++var3;
                           } else if (var3 > var1) {
                              --var3;
                           }

                           if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) {
                              var0 = ApproximateRouteStrategy.Client_plane;
                           }

                           var8 += var7;
                           if (var8 >= 65536) {
                              var8 -= 65536;
                              if (var4 < var2) {
                                 ++var4;
                              } else if (var4 > var2) {
                                 --var4;
                              }

                              if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) {
                                 var0 = ApproximateRouteStrategy.Client_plane;
                              }
                           }
                        }
                     } else {
                        if (var6 > 0) {
                           var7 = var5 * 65536 / var6;
                           var8 = 32768;

                           while(var2 != var4) {
                              if (var4 < var2) {
                                 ++var4;
                              } else if (var4 > var2) {
                                 --var4;
                              }

                              if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) {
                                 var0 = ApproximateRouteStrategy.Client_plane;
                              }

                              var8 += var7;
                              if (var8 >= 65536) {
                                 var8 -= 65536;
                                 if (var3 < var1) {
                                    ++var3;
                                 } else if (var3 > var1) {
                                    --var3;
                                 }

                                 if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][var3][var4] & 4) != 0) {
                                    var0 = ApproximateRouteStrategy.Client_plane;
                                 }
                              }
                           }
                        }
                        break label166;
                     }
                  }

                  return ApproximateRouteStrategy.Client_plane;
               }

               return ApproximateRouteStrategy.Client_plane;
            }
         }

         if (class296.localPlayer.x >= 0 && class296.localPlayer.y >= 0 && class296.localPlayer.x < 13312 && class296.localPlayer.y < 13312) {
            if ((Tiles.Tiles_renderFlags[ApproximateRouteStrategy.Client_plane][class296.localPlayer.x >> 7][class296.localPlayer.y >> 7] & 4) != 0) {
               var0 = ApproximateRouteStrategy.Client_plane;
            }

            return var0;
         } else {
            return ApproximateRouteStrategy.Client_plane;
         }
      }
   }

   @ObfuscatedName("ir")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIIIB)V",
      garbageValue = "6"
   )
   static final void method6340(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      PendingSpawn var10 = null;

      for(PendingSpawn var11 = (PendingSpawn)Client.pendingSpawns.last(); var11 != null; var11 = (PendingSpawn)Client.pendingSpawns.previous()) {
         if (var0 == var11.plane && var11.x == var1 && var2 == var11.y && var3 == var11.type) {
            var10 = var11;
            break;
         }
      }

      if (var10 == null) {
         var10 = new PendingSpawn();
         var10.plane = var0;
         var10.type = var3;
         var10.x = var1;
         var10.y = var2;
         EnumComposition.method3528(var10);
         Client.pendingSpawns.addFirst(var10);
      }

      var10.field1127 = var4;
      var10.field1129 = var5;
      var10.field1120 = var6;
      var10.delay = var8;
      var10.hitpoints = var9;
      var10.method2310(var7);
   }
}
