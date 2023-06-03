import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ko")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
   @ObfuscatedName("cw")
   @ObfuscatedSignature(
      descriptor = "Lsj;"
   )
   @Export("loginType")
   static LoginType loginType;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -552599477
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("an")
   @Export("tileTemplates")
   byte[][][] tileTemplates;

   WorldMapScaleHandler(int var1) {
      this.pixelsPerTile = var1;
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIIB)V",
      garbageValue = "5"
   )
   void method5560(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) {
         var8 = this.method5557(var8, var7);
         var7 = this.method5558(var7);
         Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-837689004"
   )
   int method5557(int var1, int var2) {
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

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-1694223035"
   )
   int method5558(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "-120"
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

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "60"
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

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "4"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "597109789"
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

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2127773930"
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

   @ObfuscatedName("ae")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "676851510"
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

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "112"
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-405495204"
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

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "0"
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

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lsj;I)I",
      garbageValue = "-1609910972"
   )
   static final int method5584(LoginType var0) {
      if (var0 == null) {
         return 12;
      } else {
         switch (var0.field4933) {
            case 6:
               return 20;
            default:
               return 12;
         }
      }
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;III)[Ltm;",
      garbageValue = "151600601"
   )
   public static SpritePixels[] method5597(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         UserComparator2.SpriteBuffer_decode(var4);
         var3 = true;
      }

      return !var3 ? null : WorldMapEvent.method5600();
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Lnq;Lnq;S)I",
      garbageValue = "1834"
   )
   static int method5598(AbstractArchive var0, AbstractArchive var1) {
      int var2 = 0;
      String[] var3 = Login.field952;

      int var4;
      String var5;
      for(var4 = 0; var4 < var3.length; ++var4) {
         var5 = var3[var4];
         if (var0.tryLoadFileByNames(var5, "")) {
            ++var2;
         }
      }

      var3 = Login.field953;

      for(var4 = 0; var4 < var3.length; ++var4) {
         var5 = var3[var4];
         if (var1.tryLoadFileByNames(var5, "")) {
            ++var2;
         }
      }

      var3 = Login.field933;

      for(var4 = 0; var4 < var3.length; ++var4) {
         var5 = var3[var4];
         if (var1.getGroupId(var5) != -1 && var1.tryLoadFileByNames(var5, "")) {
            ++var2;
         }
      }

      return var2;
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "(IZII)V",
      garbageValue = "-2033731154"
   )
   public static final void method5595(int var0, boolean var1, int var2) {
      if (var0 >= 8000 && var0 <= 48000) {
         PcmPlayer.field291 = var0;
         class347.PcmPlayer_stereo = var1;
         class260.field2944 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }
}
