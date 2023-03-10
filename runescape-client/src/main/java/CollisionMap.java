import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iz")
@Implements("CollisionMap")
public class CollisionMap {
   @ObfuscatedName("ak")
   public static short[][] field2315;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -19289501
   )
   @Export("xInset")
   int xInset = 0;
   @ObfuscatedName("br")
   @ObfuscatedGetter(
      intValue = 1760891395
   )
   @Export("yInset")
   int yInset = 0;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -1745624937
   )
   @Export("xSize")
   int xSize;
   @ObfuscatedName("bz")
   @ObfuscatedGetter(
      intValue = 1825387011
   )
   @Export("ySize")
   int ySize;
   @ObfuscatedName("bq")
   @Export("flags")
   public int[][] flags;

   public CollisionMap(int var1, int var2) {
      this.xSize = var1;
      this.ySize = var2;
      this.flags = new int[this.xSize][this.ySize];
      this.clear();
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "755620870"
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IIIIZB)V",
      garbageValue = "3"
   )
   public void method4114(int var1, int var2, int var3, int var4, boolean var5) {
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

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "1944088761"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "190737298"
   )
   @Export("setBlockedByFloor")
   public void setBlockedByFloor(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] |= 2097152;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "96"
   )
   @Export("setBlockedByFloorDec")
   public void setBlockedByFloorDec(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] |= 262144;
   }

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(IIIB)V",
      garbageValue = "-21"
   )
   @Export("setFlag")
   void setFlag(int var1, int var2, int var3) {
      int[] var10000 = this.flags[var1];
      var10000[var2] |= var3;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(IIIIZI)V",
      garbageValue = "-1194067709"
   )
   public void method4136(int var1, int var2, int var3, int var4, boolean var5) {
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIIIIZI)V",
      garbageValue = "-264491909"
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IIII)V",
      garbageValue = "-2143569365"
   )
   @Export("setFlagOff")
   void setFlagOff(int var1, int var2, int var3) {
      int[] var10000 = this.flags[var1];
      var10000[var2] &= ~var3;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "59"
   )
   public void method4120(int var1, int var2) {
      var1 -= this.xInset;
      var2 -= this.yInset;
      int[] var10000 = this.flags[var1];
      var10000[var2] &= -262145;
   }
}
