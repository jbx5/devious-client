import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dp")
@Implements("LoginScreenAnimation")
public class LoginScreenAnimation {
   @ObfuscatedName("jz")
   @ObfuscatedSignature(
      descriptor = "Ltq;"
   )
   @Export("redHintArrowSprite")
   static SpritePixels redHintArrowSprite;
   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "[Ltc;"
   )
   @Export("sprites")
   IndexedSprite[] sprites;
   @ObfuscatedName("aq")
   int[] field1226 = new int[256];
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 370886257
   )
   int field1227 = 0;
   @ObfuscatedName("at")
   int[] field1228;
   @ObfuscatedName("aa")
   int[] field1242;
   @ObfuscatedName("ay")
   int[] field1230;
   @ObfuscatedName("ao")
   int[] field1221;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1137135943
   )
   int field1245 = 0;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 564904941
   )
   int field1233 = 0;
   @ObfuscatedName("ag")
   int[] field1234;
   @ObfuscatedName("ah")
   int[] field1229;
   @ObfuscatedName("av")
   int[] field1236;
   @ObfuscatedName("ar")
   int[] field1231;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = 1156448081
   )
   int field1240 = 0;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -527574064
   )
   int field1239 = 0;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 72639573
   )
   int field1237 = 0;

   @ObfuscatedSignature(
      descriptor = "([Ltc;)V"
   )
   LoginScreenAnimation(IndexedSprite[] var1) {
      this.sprites = var1;
      this.initColors();
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1937774120"
   )
   @Export("initColors")
   void initColors() {
      this.field1242 = new int[256];

      int var1;
      for(var1 = 0; var1 < 64; ++var1) {
         this.field1242[var1] = var1 * 262144;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1242[var1 + 64] = var1 * 1024 + 16711680;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1242[var1 + 128] = var1 * 4 + 16776960;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1242[var1 + 192] = 16777215;
      }

      this.field1230 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1230[var1] = var1 * 1024;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1230[var1 + 64] = var1 * 4 + '\uff00';
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1230[var1 + 128] = var1 * 262144 + '\uffff';
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1230[var1 + 192] = 16777215;
      }

      this.field1221 = new int[256];

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1221[var1] = var1 * 4;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1221[var1 + 64] = var1 * 262144 + 255;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1221[var1 + 128] = var1 * 1024 + 16711935;
      }

      for(var1 = 0; var1 < 64; ++var1) {
         this.field1221[var1 + 192] = 16777215;
      }

      this.field1228 = new int[256];
      this.field1240 = 0;
      this.field1236 = new int['耀'];
      this.field1231 = new int['耀'];
      this.method2418((IndexedSprite)null);
      this.field1234 = new int['耀'];
      this.field1229 = new int['耀'];
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1639975847"
   )
   void method2442() {
      this.field1242 = null;
      this.field1230 = null;
      this.field1221 = null;
      this.field1228 = null;
      this.field1236 = null;
      this.field1231 = null;
      this.field1234 = null;
      this.field1229 = null;
      this.field1240 = 0;
      this.field1239 = 0;
   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "2057585866"
   )
   @Export("draw")
   void draw(int var1, int var2) {
      if (this.field1234 == null) {
         this.initColors();
      }

      if (this.field1237 == 0) {
         this.field1237 = var2;
      }

      int var3 = var2 - this.field1237;
      if (var3 >= 256) {
         var3 = 0;
      }

      this.field1237 = var2;
      if (var3 > 0) {
         this.method2416(var3);
      }

      this.method2415(var1);
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1116978658"
   )
   final void method2416(int var1) {
      this.field1240 += var1 * 128;
      int var2;
      if (this.field1240 > this.field1236.length) {
         this.field1240 -= this.field1236.length;
         var2 = (int)(Math.random() * 12.0);
         this.method2418(this.sprites[var2]);
      }

      var2 = 0;
      int var3 = var1 * 128;
      int var4 = (256 - var1) * 128;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.field1234[var2 + var3] - this.field1236[var2 + this.field1240 & this.field1236.length - 1] * var1 / 6;
         if (var6 < 0) {
            var6 = 0;
         }

         this.field1234[var2++] = var6;
      }

      byte var15 = 10;
      var6 = 128 - var15;

      int var7;
      int var10;
      for(var7 = 256 - var1; var7 < 256; ++var7) {
         int var8 = var7 * 128;

         for(int var9 = 0; var9 < 128; ++var9) {
            var10 = (int)(Math.random() * 100.0);
            if (var10 < 50 && var9 > var15 && var9 < var6) {
               this.field1234[var9 + var8] = 255;
            } else {
               this.field1234[var8 + var9] = 0;
            }
         }
      }

      if (this.field1245 * 16 > 0) {
         this.field1245 = this.field1245 * 16 - var1 * 4;
      }

      if (this.field1233 * 16 > 0) {
         this.field1233 = this.field1233 * 16 - var1 * 4;
      }

      if (this.field1245 * 16 == 0 && this.field1233 * 16 == 0) {
         var7 = (int)(Math.random() * (double)(2000 / var1));
         if (var7 == 0) {
            this.field1245 = 1024;
         }

         if (var7 == 1) {
            this.field1233 = 1024;
         }
      }

      for(var7 = 0; var7 < 256 - var1; ++var7) {
         this.field1226[var7] = this.field1226[var7 + var1];
      }

      for(var7 = 256 - var1; var7 < 256; ++var7) {
         this.field1226[var7] = (int)(Math.sin((double)this.field1227 / 14.0) * 16.0 + Math.sin((double)this.field1227 / 15.0) * 14.0 + Math.sin((double)this.field1227 / 16.0) * 12.0);
         ++this.field1227;
      }

      this.field1239 = this.field1239 * 10000 + 10000 * var1;
      var7 = ((Client.cycle & 1) + var1) / 2;
      if (var7 > 0) {
         short var16 = 128;
         byte var17 = 2;
         var10 = 128 - var17 - var17;

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < this.field1239 * 100; ++var11) {
            var12 = (int)(Math.random() * (double)var10) + var17;
            var13 = (int)(Math.random() * (double)var16) + var16;
            this.field1234[var12 + (var13 << 7)] = 192;
         }

         this.field1239 = 0;

         int var14;
         for(var11 = 0; var11 < 256; ++var11) {
            var12 = 0;
            var13 = var11 * 128;

            for(var14 = -var7; var14 < 128; ++var14) {
               if (var7 + var14 < 128) {
                  var12 += this.field1234[var13 + var14 + var7];
               }

               if (var14 - (var7 + 1) >= 0) {
                  var12 -= this.field1234[var14 + var13 - (var7 + 1)];
               }

               if (var14 >= 0) {
                  this.field1229[var14 + var13] = var12 / (var7 * 2 + 1);
               }
            }
         }

         for(var11 = 0; var11 < 128; ++var11) {
            var12 = 0;

            for(var13 = -var7; var13 < 256; ++var13) {
               var14 = var13 * 128;
               if (var7 + var13 < 256) {
                  var12 += this.field1229[var14 + var11 + var7 * 128];
               }

               if (var13 - (var7 + 1) >= 0) {
                  var12 -= this.field1229[var14 + var11 - (var7 + 1) * 128];
               }

               if (var13 >= 0) {
                  this.field1234[var11 + var14] = var12 / (var7 * 2 + 1);
               }
            }
         }
      }

   }

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IIII)I",
      garbageValue = "-186966133"
   )
   final int method2410(int var1, int var2, int var3) {
      int var4 = 256 - var3;
      return (var3 * (var2 & '\uff00') + var4 * (var1 & '\uff00') & 16711680) + (var4 * (var1 & 16711935) + var3 * (var2 & 16711935) & -16711936) >> 8;
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "6"
   )
   final void method2415(int var1) {
      int var2 = this.field1228.length;
      if (this.field1245 * 16 > 0) {
         this.method2420(this.field1245 * 16, this.field1230);
      } else if (this.field1233 * 16 > 0) {
         this.method2420(this.field1233 * 16, this.field1221);
      } else {
         for(int var3 = 0; var3 < var2; ++var3) {
            this.field1228[var3] = this.field1242[var3];
         }
      }

      this.method2417(var1);
   }

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(I[II)V",
      garbageValue = "243550148"
   )
   final void method2420(int var1, int[] var2) {
      int var3 = this.field1228.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         if (var1 > 768) {
            this.field1228[var4] = this.method2410(this.field1242[var4], var2[var4], 1024 - var1);
         } else if (var1 > 256) {
            this.field1228[var4] = var2[var4];
         } else {
            this.field1228[var4] = this.method2410(var2[var4], this.field1242[var4], 256 - var1);
         }
      }

   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(IS)V",
      garbageValue = "-15545"
   )
   final void method2417(int var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < 255; ++var3) {
         int var4 = (256 - var3) * this.field1226[var3] / 256;
         int var5 = var4 + var1;
         int var6 = 0;
         int var7 = 128;
         if (var5 < 0) {
            var6 = -var5;
            var5 = 0;
         }

         if (var5 + 128 >= RouteStrategy.rasterProvider.width) {
            var7 = RouteStrategy.rasterProvider.width - var5;
         }

         int var8 = var5 + (var3 + 8) * RouteStrategy.rasterProvider.width;
         var2 += var6;

         for(int var9 = var6; var9 < var7; ++var9) {
            int var10 = this.field1234[var2++];
            int var11 = var8 % Rasterizer2D.Rasterizer2D_width;
            if (var10 != 0 && var11 >= Rasterizer2D.Rasterizer2D_xClipStart && var11 < Rasterizer2D.Rasterizer2D_xClipEnd) {
               int var12 = var10;
               int var13 = 256 - var10;
               var10 = this.field1228[var10];
               int var14 = RouteStrategy.rasterProvider.pixels[var8];
               RouteStrategy.rasterProvider.pixels[var8++] = -16777216 | (var12 * (var10 & '\uff00') + var13 * (var14 & '\uff00') & 16711680) + ((var10 & 16711935) * var12 + (var14 & 16711935) * var13 & -16711936) >> 8;
            } else {
               ++var8;
            }
         }

         var2 += 128 - var7;
      }

   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltc;I)V",
      garbageValue = "-1035268353"
   )
   final void method2418(IndexedSprite var1) {
      int var2;
      for(var2 = 0; var2 < this.field1236.length; ++var2) {
         this.field1236[var2] = 0;
      }

      int var3;
      for(var2 = 0; var2 < 5000; ++var2) {
         var3 = (int)(Math.random() * 128.0 * 256.0);
         this.field1236[var3] = (int)(Math.random() * 256.0);
      }

      int var4;
      int var5;
      for(var2 = 0; var2 < 20; ++var2) {
         for(var3 = 1; var3 < 255; ++var3) {
            for(var4 = 1; var4 < 127; ++var4) {
               var5 = var4 + (var3 << 7);
               this.field1231[var5] = (this.field1236[var5 + 1] + this.field1236[var5 + 128] + this.field1236[var5 - 128] + this.field1236[var5 - 1]) / 4;
            }
         }

         int[] var8 = this.field1236;
         this.field1236 = this.field1231;
         this.field1231 = var8;
      }

      if (var1 != null) {
         var2 = 0;

         for(var3 = 0; var3 < var1.subHeight; ++var3) {
            for(var4 = 0; var4 < var1.subWidth; ++var4) {
               if (var1.pixels[var2++] != 0) {
                  var5 = var4 + var1.xOffset + 16;
                  int var6 = var3 + var1.yOffset + 16;
                  int var7 = var5 + (var6 << 7);
                  this.field1236[var7] = 0;
               }
            }
         }
      }

   }

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lsq;I)I",
      garbageValue = "197503678"
   )
   static int method2422(PacketBuffer var0) {
      int var1 = var0.readBits(2);
      int var2;
      if (var1 == 0) {
         var2 = 0;
      } else if (var1 == 1) {
         var2 = var0.readBits(5);
      } else if (var1 == 2) {
         var2 = var0.readBits(8);
      } else {
         var2 = var0.readBits(11);
      }

      return var2;
   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(ILch;ZI)I",
      garbageValue = "-1983594408"
   )
   static int method2440(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.CC_CREATE) {
         Interpreter.Interpreter_intStackSize -= 3;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
         if (var4 == 0) {
            throw new RuntimeException();
         } else {
            Widget var6 = class165.getWidget(var9);
            if (var6.children == null) {
               var6.children = new Widget[var11 + 1];
            }

            if (var6.children.length <= var11) {
               Widget[] var7 = new Widget[var11 + 1];

               for(int var8 = 0; var8 < var6.children.length; ++var8) {
                  var7[var8] = var6.children[var8];
               }

               var6.children = var7;
            }

            if (var11 > 0 && var6.children[var11 - 1] == null) {
               throw new RuntimeException("" + (var11 - 1));
            } else {
               Widget var12 = new Widget();
               var12.type = var4;
               var12.parentId = var12.id = var6.id;
               var12.childIndex = var11;
               var12.isIf3 = true;
               if (var4 == 12) {
                  var12.method6391();
                  var12.method6392().method6258(new class100(var12));
                  var12.method6392().method6132(new class101(var12));
               }

               var6.children[var11] = var12;
               if (var2) {
                  SoundSystem.scriptDotWidget = var12;
               } else {
                  class1.scriptActiveWidget = var12;
               }

               class144.invalidateWidget(var6);
               return 1;
            }
         }
      } else {
         Widget var3;
         if (var0 == ScriptOpcodes.CC_DELETE) {
            var3 = var2 ? SoundSystem.scriptDotWidget : class1.scriptActiveWidget;
            Widget var10 = class165.getWidget(var3.id);
            var10.children[var3.childIndex] = null;
            class144.invalidateWidget(var10);
            return 1;
         } else if (var0 == ScriptOpcodes.CC_DELETEALL) {
            var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            var3.children = null;
            class144.invalidateWidget(var3);
            return 1;
         } else if (var0 != ScriptOpcodes.CC_FIND) {
            if (var0 == ScriptOpcodes.IF_FIND) {
               var3 = class165.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
               if (var3 != null) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
                  if (var2) {
                     SoundSystem.scriptDotWidget = var3;
                  } else {
                     class1.scriptActiveWidget = var3;
                  }
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               }

               return 1;
            } else {
               return 2;
            }
         } else {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Widget var5 = SoundSystem.getWidgetChild(var9, var4);
            if (var5 != null && var4 != -1) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
               if (var2) {
                  SoundSystem.scriptDotWidget = var5;
               } else {
                  class1.scriptActiveWidget = var5;
               }
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            }

            return 1;
         }
      }
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IB)Lex;",
      garbageValue = "100"
   )
   static class123 method2424(int var0) {
      class123 var1 = (class123)StructComposition.findEnumerated(Messages.method2757(), var0);
      if (var1 == null) {
         var1 = class123.field1496;
      }

      return var1;
   }

   @ObfuscatedName("ar")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;IB)V",
      garbageValue = "-36"
   )
   static final void method2441(String var0, int var1) {
      PacketBufferNode var2 = class330.getPacketBufferNode(ClientPacket.field3151, Client.packetWriter.isaacCipher);
      var2.packetBuffer.writeByte(DynamicObject.stringCp1252NullTerminatedByteSize(var0) + 1);
      var2.packetBuffer.writeStringCp1252NullTerminated(var0);
      var2.packetBuffer.writeByte(var1);
      Client.packetWriter.addNode(var2);
   }
}
