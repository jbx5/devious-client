import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
@Implements("CollisionMap")
public class CollisionMap {
   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      descriptor = "Llm;"
   )
   @Export("archive17")
   static Archive archive17;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -1430868227
   )
   @Export("xInset")
   public int xInset = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1439144823
   )
   @Export("yInset")
   public int yInset = 0;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1332223607
   )
   @Export("xSize")
   int xSize;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = 1657414401
   )
   @Export("ySize")
   int ySize;
   @ObfuscatedName("ap")
   @Export("flags")
   public int[][] flags;

   public CollisionMap(int var1, int var2) {
      this.xSize = var1;
      this.ySize = var2;
      this.flags = new int[this.xSize][this.ySize];
      this.clear();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-965310063"
   )
   @Export("clear")
   public void clear() {
      for(int var1 = 0; var1 < this.xSize; ++var1) {
         for(int var2 = 0; var2 < this.ySize; ++var2) {
            if (var1 != 0 && var2 != 0 && var1 < this.xSize - 5 && var2 < this.ySize - 5) {
               this.flags[var1][var2] = 16777216;
            } else {
               this.flags[var1][var2] = 16777215;
            }
         }
      }

   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "-1323698352"
   )
   public void method4184(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      if (var3 == 0) {
         if (var4 == 0) {
            this.setFlag(var1, var2, 128);
            this.setFlag(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.setFlag(var1, var2, 2);
            this.setFlag(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.setFlag(var1, var2, 8);
            this.setFlag(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.setFlag(var1, var2, 32);
            this.setFlag(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.setFlag(var1, var2, 1);
            this.setFlag(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.setFlag(var1, var2, 4);
            this.setFlag(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.setFlag(var1, var2, 16);
            this.setFlag(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.setFlag(var1, var2, 64);
            this.setFlag(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.setFlag(var1, var2, 130);
            this.setFlag(var1 - 1, var2, 8);
            this.setFlag(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.setFlag(var1, var2, 10);
            this.setFlag(var1, var2 + 1, 32);
            this.setFlag(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.setFlag(var1, var2, 40);
            this.setFlag(var1 + 1, var2, 128);
            this.setFlag(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.setFlag(var1, var2, 160);
            this.setFlag(var1, var2 - 1, 2);
            this.setFlag(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.setFlag(var1, var2, 65536);
               this.setFlag(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.setFlag(var1, var2, 1024);
               this.setFlag(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.setFlag(var1, var2, 4096);
               this.setFlag(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.setFlag(var1, var2, 16384);
               this.setFlag(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.setFlag(var1, var2, 512);
               this.setFlag(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.setFlag(var1, var2, 2048);
               this.setFlag(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.setFlag(var1, var2, 8192);
               this.setFlag(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.setFlag(var1, var2, 32768);
               this.setFlag(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.setFlag(var1, var2, 66560);
               this.setFlag(var1 - 1, var2, 4096);
               this.setFlag(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.setFlag(var1, var2, 5120);
               this.setFlag(var1, var2 + 1, 16384);
               this.setFlag(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.setFlag(var1, var2, 20480);
               this.setFlag(var1 + 1, var2, 65536);
               this.setFlag(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.setFlag(var1, var2, 81920);
               this.setFlag(var1, var2 - 1, 1024);
               this.setFlag(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "-525339514"
   )
   @Export("addGameObject")
   public void addGameObject(int var1, int var2, int var3, int var4, boolean var5) {
      int var6 = 256;
      if (var5) {
         var6 += 131072;
      }

      var1 -= this.xInset;
      var2 -= this.yInset;

      for(int var7 = var1; var7 < var3 + var1; ++var7) {
         if (var7 >= 0 && var7 < this.xSize) {
            for(int var8 = var2; var8 < var2 + var4; ++var8) {
               if (var8 >= 0 && var8 < this.ySize) {
                  this.setFlag(var7, var8, var6);
               }
            }
         }
      }

   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-77979262"
   )
   @Export("setBlockedByFloor")
   public void setBlockedByFloor(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] |= 2097152;
   }

   @ObfuscatedName("z")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-1845865380"
   )
   @Export("setBlockedByFloorDec")
   public void setBlockedByFloorDec(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] |= 262144;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-5"
   )
   @Export("setFlag")
   void setFlag(int var1, int var2, int var3) {
      int[] var10000 = this.flags[var1];
      var10000[var2] |= var3;
   }

   @ObfuscatedName("i")
   @ObfuscatedSignature(
      descriptor = "(IIIIZB)V",
      garbageValue = "103"
   )
   public void method4200(int var1, int var2, int var3, int var4, boolean var5) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      if (var3 == 0) {
         if (var4 == 0) {
            this.setFlagOff(var1, var2, 128);
            this.setFlagOff(var1 - 1, var2, 8);
         }

         if (var4 == 1) {
            this.setFlagOff(var1, var2, 2);
            this.setFlagOff(var1, var2 + 1, 32);
         }

         if (var4 == 2) {
            this.setFlagOff(var1, var2, 8);
            this.setFlagOff(var1 + 1, var2, 128);
         }

         if (var4 == 3) {
            this.setFlagOff(var1, var2, 32);
            this.setFlagOff(var1, var2 - 1, 2);
         }
      }

      if (var3 == 1 || var3 == 3) {
         if (var4 == 0) {
            this.setFlagOff(var1, var2, 1);
            this.setFlagOff(var1 - 1, var2 + 1, 16);
         }

         if (var4 == 1) {
            this.setFlagOff(var1, var2, 4);
            this.setFlagOff(var1 + 1, var2 + 1, 64);
         }

         if (var4 == 2) {
            this.setFlagOff(var1, var2, 16);
            this.setFlagOff(var1 + 1, var2 - 1, 1);
         }

         if (var4 == 3) {
            this.setFlagOff(var1, var2, 64);
            this.setFlagOff(var1 - 1, var2 - 1, 4);
         }
      }

      if (var3 == 2) {
         if (var4 == 0) {
            this.setFlagOff(var1, var2, 130);
            this.setFlagOff(var1 - 1, var2, 8);
            this.setFlagOff(var1, var2 + 1, 32);
         }

         if (var4 == 1) {
            this.setFlagOff(var1, var2, 10);
            this.setFlagOff(var1, var2 + 1, 32);
            this.setFlagOff(var1 + 1, var2, 128);
         }

         if (var4 == 2) {
            this.setFlagOff(var1, var2, 40);
            this.setFlagOff(var1 + 1, var2, 128);
            this.setFlagOff(var1, var2 - 1, 2);
         }

         if (var4 == 3) {
            this.setFlagOff(var1, var2, 160);
            this.setFlagOff(var1, var2 - 1, 2);
            this.setFlagOff(var1 - 1, var2, 8);
         }
      }

      if (var5) {
         if (var3 == 0) {
            if (var4 == 0) {
               this.setFlagOff(var1, var2, 65536);
               this.setFlagOff(var1 - 1, var2, 4096);
            }

            if (var4 == 1) {
               this.setFlagOff(var1, var2, 1024);
               this.setFlagOff(var1, var2 + 1, 16384);
            }

            if (var4 == 2) {
               this.setFlagOff(var1, var2, 4096);
               this.setFlagOff(var1 + 1, var2, 65536);
            }

            if (var4 == 3) {
               this.setFlagOff(var1, var2, 16384);
               this.setFlagOff(var1, var2 - 1, 1024);
            }
         }

         if (var3 == 1 || var3 == 3) {
            if (var4 == 0) {
               this.setFlagOff(var1, var2, 512);
               this.setFlagOff(var1 - 1, var2 + 1, 8192);
            }

            if (var4 == 1) {
               this.setFlagOff(var1, var2, 2048);
               this.setFlagOff(var1 + 1, var2 + 1, 32768);
            }

            if (var4 == 2) {
               this.setFlagOff(var1, var2, 8192);
               this.setFlagOff(var1 + 1, var2 - 1, 512);
            }

            if (var4 == 3) {
               this.setFlagOff(var1, var2, 32768);
               this.setFlagOff(var1 - 1, var2 - 1, 2048);
            }
         }

         if (var3 == 2) {
            if (var4 == 0) {
               this.setFlagOff(var1, var2, 66560);
               this.setFlagOff(var1 - 1, var2, 4096);
               this.setFlagOff(var1, var2 + 1, 16384);
            }

            if (var4 == 1) {
               this.setFlagOff(var1, var2, 5120);
               this.setFlagOff(var1, var2 + 1, 16384);
               this.setFlagOff(var1 + 1, var2, 65536);
            }

            if (var4 == 2) {
               this.setFlagOff(var1, var2, 20480);
               this.setFlagOff(var1 + 1, var2, 65536);
               this.setFlagOff(var1, var2 - 1, 1024);
            }

            if (var4 == 3) {
               this.setFlagOff(var1, var2, 81920);
               this.setFlagOff(var1, var2 - 1, 1024);
               this.setFlagOff(var1 - 1, var2, 4096);
            }
         }
      }

   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "(IIIIIZI)V",
      garbageValue = "-2126189491"
   )
   @Export("setFlagOffNonSquare")
   public void setFlagOffNonSquare(int var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var7 = 256;
      if (var6) {
         var7 += 131072;
      }

      var1 -= this.xInset;
      var2 -= this.yInset;
      int var8;
      if (var5 == 1 || var5 == 3) {
         var8 = var3;
         var3 = var4;
         var4 = var8;
      }

      for(var8 = var1; var8 < var3 + var1; ++var8) {
         if (var8 >= 0 && var8 < this.xSize) {
            for(int var9 = var2; var9 < var2 + var4; ++var9) {
               if (var9 >= 0 && var9 < this.ySize) {
                  this.setFlagOff(var8, var9, var7);
               }
            }
         }
      }

   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "689502231"
   )
   @Export("setFlagOff")
   void setFlagOff(int var1, int var2, int var3) {
      int[] var10000 = this.flags[var1];
      var10000[var2] &= ~var3;
   }

   @ObfuscatedName("k")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "-865883096"
   )
   public void method4192(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] &= -262145;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "57"
   )
   @Export("itemContainerSetItem")
   static void itemContainerSetItem(int var0, int var1, int var2, int var3) {
      ItemContainer var4 = (ItemContainer)ItemContainer.itemContainers.get((long)var0);
      if (var4 == null) {
         var4 = new ItemContainer();
         ItemContainer.itemContainers.put(var4, (long)var0);
      }

      if (var4.ids.length <= var1) {
         int[] var5 = new int[var1 + 1];
         int[] var6 = new int[var1 + 1];

         int var7;
         for(var7 = 0; var7 < var4.ids.length; ++var7) {
            var5[var7] = var4.ids[var7];
            var6[var7] = var4.quantities[var7];
         }

         for(var7 = var4.ids.length; var7 < var1; ++var7) {
            var5[var7] = -1;
            var6[var7] = 0;
         }

         var4.ids = var5;
         var4.quantities = var6;
      }

      var4.ids[var1] = var2;
      var4.quantities[var1] = var3;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-933803817"
   )
   public static void method4208() {
      if (NetCache.NetCache_socket != null) {
         NetCache.NetCache_socket.close();
      }

   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(CS)Z",
      garbageValue = "18719"
   )
   @Export("isDigit")
   public static boolean isDigit(char var0) {
      return var0 >= '0' && var0 <= '9';
   }

   @ObfuscatedName("am")
   @ObfuscatedSignature(
      descriptor = "(ILba;ZI)I",
      garbageValue = "379941192"
   )
   static int method4213(int var0, Script var1, boolean var2) {
      return 2;
   }

   @ObfuscatedName("lf")
   @ObfuscatedSignature(
      descriptor = "(Lkz;IIII)V",
      garbageValue = "1926559804"
   )
   @Export("drawCompass")
   static final void drawCompass(Widget var0, int var1, int var2, int var3) {
      SpriteMask var4 = var0.getSpriteMask(false);
      if (var4 != null) {
         if (Client.minimapState < 3) {
            SoundSystem.compass.drawRotatedMaskedCenteredAround(var1, var2, var4.width, var4.height, 25, 25, Client.camAngleY, 256, var4.xStarts, var4.xWidths);
         } else {
            Rasterizer2D.Rasterizer2D_fillMaskedRectangle(var1, var2, 0, var4.xStarts, var4.xWidths);
         }

      }
   }
}
