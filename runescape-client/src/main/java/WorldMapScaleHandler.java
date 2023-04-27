import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("WorldMapScaleHandler")
public class WorldMapScaleHandler {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -28927295
   )
   @Export("pixelsPerTile")
   int pixelsPerTile;
   @ObfuscatedName("an")
   @Export("tileTemplates")
   byte[][][] tileTemplates;

   WorldMapScaleHandler(int var1) {
      this.pixelsPerTile = var1;
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(IIIIIIIII)V",
      garbageValue = "1823196120"
   )
   void method5568(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      if (var7 != 0 && this.pixelsPerTile != 0 && this.tileTemplates != null) {
         var8 = this.method5569(var8, var7);
         var7 = this.method5570(var7);
         Rasterizer2D.Rasterizer2D_drawGradientPixels(var1, var2, var5, var6, var3, var4, this.tileTemplates[var7 - 1][var8], this.pixelsPerTile);
      }
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-1761247305"
   )
   int method5569(int var1, int var2) {
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

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-835650006"
   )
   int method5570(int var1) {
      if (var1 != 9 && var1 != 10) {
         return var1 == 11 ? 8 : var1;
      } else {
         return 1;
      }
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-246959980"
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

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2077047150"
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

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-1636061073"
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

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "7"
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

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)V",
      garbageValue = "79"
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

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "2056454004"
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

   @ObfuscatedName("aa")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-392774296"
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

   @ObfuscatedName("ay")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "710623043"
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

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1893432725"
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

   @ObfuscatedName("na")
   @ObfuscatedSignature(
      descriptor = "(IIB)V",
      garbageValue = "46"
   )
   static final void method5589(int var0, int var1) {
      if (Client.currentClanChannels[var0] != null) {
         if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3416()) {
            ClanChannelMember var2 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1);
            if (var2.rank == -1) {
               PacketBufferNode var3 = class330.getPacketBufferNode(ClientPacket.field3148, Client.packetWriter.isaacCipher);
               var3.packetBuffer.writeByte(3 + DynamicObject.stringCp1252NullTerminatedByteSize(var2.username.getName()));
               var3.packetBuffer.writeByte(var0);
               var3.packetBuffer.writeShort(var1);
               var3.packetBuffer.writeStringCp1252NullTerminated(var2.username.getName());
               Client.packetWriter.addNode(var3);
            }
         }
      }
   }
}
