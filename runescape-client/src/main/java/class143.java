import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fo")
public class class143 {
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = -578963151
   )
   @Export("canvasHeight")
   public static int canvasHeight;
   @ObfuscatedName("fk")
   @ObfuscatedSignature(
      descriptor = "Lmx;"
   )
   @Export("archive8")
   static Archive archive8;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      longValue = -6594735903680955441L
   )
   long field1630;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -946279033
   )
   int field1628 = -1;
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "Lni;"
   )
   IterableNodeDeque field1629 = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lsy;)V"
   )
   public class143(Buffer var1) {
      this.method3125(var1);
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(Lsy;I)V",
      garbageValue = "-914710127"
   )
   void method3125(Buffer var1) {
      this.field1630 = var1.readLong();
      this.field1628 = var1.readInt();

      for(int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
         Object var3;
         if (var2 == 3) {
            var3 = new class162(this);
         } else if (var2 == 1) {
            var3 = new class138(this);
         } else if (var2 == 13) {
            var3 = new class155(this);
         } else if (var2 == 4) {
            var3 = new class147(this);
         } else if (var2 == 6) {
            var3 = new class154(this);
         } else if (var2 == 5) {
            var3 = new class139(this);
         } else if (var2 == 2) {
            var3 = new class144(this);
         } else if (var2 == 7) {
            var3 = new class137(this);
         } else if (var2 == 14) {
            var3 = new class141(this);
         } else if (var2 == 8) {
            var3 = new class158(this);
         } else if (var2 == 9) {
            var3 = new class164(this);
         } else if (var2 == 10) {
            var3 = new class150(this);
         } else if (var2 == 11) {
            var3 = new class145(this);
         } else if (var2 == 12) {
            var3 = new class149(this);
         } else {
            if (var2 != 15) {
               throw new RuntimeException("");
            }

            var3 = new class159(this);
         }

         ((class140)var3).vmethod3361(var1);
         this.field1629.addFirst((Node)var3);
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(Lfi;I)V",
      garbageValue = "-535629079"
   )
   public void method3126(ClanSettings var1) {
      if (var1.field1687 == this.field1630 && this.field1628 == var1.field1709) {
         for(class140 var2 = (class140)this.field1629.last(); var2 != null; var2 = (class140)this.field1629.previous()) {
            var2.vmethod3362(var1);
         }

         ++var1.field1709;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("iu")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1440075578"
   )
   static final int method3131() {
      if (WorldMapSectionType.clientPreferences.method2458()) {
         return TaskHandler.Client_plane;
      } else {
         int var0 = 3;
         if (class311.cameraPitch < 310) {
            int var1;
            int var2;
            if (Client.oculusOrbState == 1) {
               var1 = GrandExchangeOfferOwnWorldComparator.oculusOrbFocalPointX >> 7;
               var2 = ReflectionCheck.oculusOrbFocalPointY >> 7;
            } else {
               var1 = BuddyRankComparator.localPlayer.x >> 7;
               var2 = BuddyRankComparator.localPlayer.y >> 7;
            }

            int var3 = class381.cameraX >> 7;
            int var4 = class471.cameraZ >> 7;
            if (var3 < 0 || var4 < 0 || var3 >= 104 || var4 >= 104) {
               return TaskHandler.Client_plane;
            }

            if (var1 < 0 || var2 < 0 || var1 >= 104 || var2 >= 104) {
               return TaskHandler.Client_plane;
            }

            if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) {
               var0 = TaskHandler.Client_plane;
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

               while(var1 != var3) {
                  if (var3 < var1) {
                     ++var3;
                  } else if (var3 > var1) {
                     --var3;
                  }

                  if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) {
                     var0 = TaskHandler.Client_plane;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var4 < var2) {
                        ++var4;
                     } else if (var4 > var2) {
                        --var4;
                     }

                     if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) {
                        var0 = TaskHandler.Client_plane;
                     }
                  }
               }
            } else if (var6 > 0) {
               var7 = var5 * 65536 / var6;
               var8 = 32768;

               while(var4 != var2) {
                  if (var4 < var2) {
                     ++var4;
                  } else if (var4 > var2) {
                     --var4;
                  }

                  if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) {
                     var0 = TaskHandler.Client_plane;
                  }

                  var8 += var7;
                  if (var8 >= 65536) {
                     var8 -= 65536;
                     if (var3 < var1) {
                        ++var3;
                     } else if (var3 > var1) {
                        --var3;
                     }

                     if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][var3][var4] & 4) != 0) {
                        var0 = TaskHandler.Client_plane;
                     }
                  }
               }
            }
         }

         if (BuddyRankComparator.localPlayer.x >= 0 && BuddyRankComparator.localPlayer.y >= 0 && BuddyRankComparator.localPlayer.x < 13312 && BuddyRankComparator.localPlayer.y < 13312) {
            if ((Tiles.Tiles_renderFlags[TaskHandler.Client_plane][BuddyRankComparator.localPlayer.x >> 7][BuddyRankComparator.localPlayer.y >> 7] & 4) != 0) {
               var0 = TaskHandler.Client_plane;
            }

            return var0;
         } else {
            return TaskHandler.Client_plane;
         }
      }
   }
}
