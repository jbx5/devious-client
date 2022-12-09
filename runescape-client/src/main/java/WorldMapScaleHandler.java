import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
   @ObfuscatedName("nt")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("mousedOverWidgetIf1")
   static Widget mousedOverWidgetIf1;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1077689315
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("e")
   @Export("tileTemplates")
   byte[][][] tileTemplates;

   WorldMapScaleHandler(int var1) {
      this.pixelsPerTile = var1;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "744717933"
   )
   void method5368(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) {
         var8 = this.method5369(var8, var7);
         var7 = this.method5395(var7);
         Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile);
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1830475597"
   )
   int method5369(int var1, int var2) {
      if (var2 == 9) {
         var1 = var1 + 1 & 3;
      }

      if (var2 == 10) {
         var1 = var1 + 3 & 3;
      }

      if (var2 == 11) {
         var1 = var1 + 3 & 3;
      }

      return var1;
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1701036761"
   )
   int method5395(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1640833319"
   )
   @Export("init")
   void init() {
      if (this.tileTemplates == null) {
         this.tileTemplates = new byte[8][4][];
         this.init0();
         this.init1();
         this.init2();
         this.init3();
         this.init4();
         this.init5();
         this.init6();
         this.init7();
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "408672170"
   )
   @Export("init0")
   void init0() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[0][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[0][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[0][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[0][3] = var1;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-763406203"
   )
   @Export("init1")
   void init1() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[1][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var2 >= 0 && var2 < var1.length) {
               if (var4 >= var3 << 1) {
                  var1[var2] = -1;
               }

               ++var2;
            } else {
               ++var2;
            }
         }
      }

      this.tileTemplates[1][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[1][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[1][3] = var1;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2025599610"
   )
   @Export("init2")
   void init2() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[2][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[2][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[2][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[2][3] = var1;
   }

   @ObfuscatedName("r")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2134142049"
   )
   @Export("init3")
   void init3() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[3][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[3][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[3][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[3][3] = var1;
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "16"
   )
   @Export("init4")
   void init4() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[4][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[4][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 >> 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[4][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var2 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 << 1) {
               var1[var2] = -1;
            }

            ++var2;
         }
      }

      this.tileTemplates[4][3] = var1;
   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1618697148"
   )
   @Export("init5")
   void init5() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      boolean var2 = false;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[5][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var3 <= this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[5][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[5][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var3 >= this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[5][3] = var1;
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1697937567"
   )
   @Export("init6")
   void init6() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      boolean var2 = false;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[6][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 <= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[6][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[6][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 <= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[6][3] = var1;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1123547765"
   )
   @Export("init7")
   void init7() {
      byte[] var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      boolean var2 = false;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      int var5 = 0;

      int var3;
      int var4;
      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[7][0] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = 0; var4 < this.pixelsPerTile; ++var4) {
            if (var4 >= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[7][1] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = this.pixelsPerTile - 1; var3 >= 0; --var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[7][2] = var1;
      var1 = new byte[this.pixelsPerTile * this.pixelsPerTile];
      var5 = 0;

      for(var3 = 0; var3 < this.pixelsPerTile; ++var3) {
         for(var4 = this.pixelsPerTile - 1; var4 >= 0; --var4) {
            if (var4 >= var3 - this.pixelsPerTile / 2) {
               var1[var5] = -1;
            }

            ++var5;
         }
      }

      this.tileTemplates[7][3] = var1;
   }
}
