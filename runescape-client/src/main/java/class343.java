import java.util.HashMap;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ms")
public class class343 {
   @ObfuscatedName("h")
   @Export("spriteMap")
   final HashMap spriteMap = new HashMap();
   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "Lok;"
   )
   @Export("bounds")
   Bounds bounds = new Bounds(0, 0);
   @ObfuscatedName("v")
   int[] field4280 = new int[2048];
   @ObfuscatedName("x")
   int[] field4281 = new int[2048];
   @ObfuscatedName("m")
   @ObfuscatedGetter(
      intValue = -400630067
   )
   int field4282 = 0;

   public class343() {
      SpotAnimationDefinition.method3743();
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "39"
   )
   void method6650(int var1) {
      int var2 = var1 * 2 + 1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = var1 * 2 + 1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         var7[var9] = class318.method6372((double)var8, 0.0, var4);
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var17 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var17[var12 + var2 * var11] = (int)(var14[var12] * var14[var11] / var15 * 256.0);
            if (!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      SpritePixels var18 = new SpritePixels(var17, var2, var2);
      this.spriteMap.put(var1, var18);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)Lrx;",
      garbageValue = "2123615497"
   )
   SpritePixels method6651(int var1) {
      if (!this.spriteMap.containsKey(var1)) {
         this.method6650(var1);
      }

      return (SpritePixels)this.spriteMap.get(var1);
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(III)V",
      garbageValue = "1766411929"
   )
   public final void method6652(int var1, int var2) {
      if (this.field4282 < this.field4280.length) {
         this.field4280[this.field4282] = var1;
         this.field4281[this.field4282] = var2;
         ++this.field4282;
      }
   }

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "210500293"
   )
   public final void method6663() {
      this.field4282 = 0;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(IILrx;FI)V",
      garbageValue = "-1098117017"
   )
   public final void method6668(int var1, int var2, SpritePixels var3, float var4) {
      int var5 = (int)(var4 * 18.0F);
      SpritePixels var6 = this.method6651(var5);
      int var7 = var5 * 2 + 1;
      Bounds var8 = new Bounds(0, 0, var3.subWidth, var3.subHeight);
      Bounds var9 = new Bounds(0, 0);
      this.bounds.setHigh(var7, var7);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < this.field4282; ++var10) {
         var11 = this.field4280[var10];
         var12 = this.field4281[var10];
         int var13 = (int)(var4 * (float)(var11 - var1)) - var5;
         int var14 = (int)((float)var3.subHeight - var4 * (float)(var12 - var2)) - var5;
         this.bounds.setLow(var13, var14);
         this.bounds.method7736(var8, var9);
         this.method6655(var6, var3, var9);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.pixels.length; ++var10) {
         if (var3.pixels[var10] == 0) {
            var3.pixels[var10] = -16777216;
         } else {
            var11 = (var3.pixels[var10] + 64 - 1) / 256;
            if (var11 <= 0) {
               var3.pixels[var10] = -16777216;
            } else {
               if (var11 > StructComposition.field2122.length) {
                  var11 = StructComposition.field2122.length;
               }

               var12 = StructComposition.field2122[var11 - 1];
               var3.pixels[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lrx;Lrx;Lok;I)V",
      garbageValue = "-533727054"
   )
   void method6655(SpritePixels var1, SpritePixels var2, Bounds var3) {
      if (var3.highX != 0 && var3.highY != 0) {
         int var4 = 0;
         int var5 = 0;
         if (var3.lowX == 0) {
            var4 = var1.subWidth - var3.highX;
         }

         if (var3.lowY == 0) {
            var5 = var1.subHeight - var3.highY;
         }

         int var6 = var4 + var5 * var1.subWidth;
         int var7 = var3.lowX + var2.subWidth * var3.lowY;

         for(int var8 = 0; var8 < var3.highY; ++var8) {
            for(int var9 = 0; var9 < var3.highX; ++var9) {
               int[] var10000 = var2.pixels;
               int var10001 = var7++;
               var10000[var10001] += var1.pixels[var6++];
            }

            var6 += var1.subWidth - var3.highX;
            var7 += var2.subWidth - var3.highX;
         }

      }
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Ldj;",
      garbageValue = "-1969198767"
   )
   static class126 method6662(int var0) {
      class126[] var1 = new class126[]{class126.field1565, class126.field1563, class126.field1567, class126.field1564, class126.field1566, class126.field1562};
      class126 var2 = (class126)World.findEnumerated(var1, var0);
      if (var2 == null) {
         var2 = class126.field1565;
      }

      return var2;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(ZI)V",
      garbageValue = "979622241"
   )
   @Export("Login_promptCredentials")
   static void Login_promptCredentials(boolean var0) {
      if (!BuddyRankComparator.client.method1230() && !BuddyRankComparator.client.method1231()) {
         Login.Login_response1 = "";
         Login.Login_response2 = "Enter your username/email & password.";
         Login.Login_response3 = "";
         class12.method155(2);
         if (var0) {
            Login.Login_password = "";
         }

         GameObject.method4831();
         SoundSystem.method873();
      } else {
         class12.method155(10);
      }
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      descriptor = "(ILbm;ZI)I",
      garbageValue = "-66353745"
   )
   static int method6671(int var0, Script var1, boolean var2) {
      Widget var3 = var2 ? class190.scriptDotWidget : class360.scriptActiveWidget;
      if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollX;
         return 1;
      } else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
         Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollY;
         return 1;
      } else {
         class303 var7;
         if (var0 == ScriptOpcodes.CC_GETTEXT) {
            if (var3.type == 12) {
               var7 = var3.method6167();
               if (var7 != null) {
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7.method6004().method7091();
                  return 1;
               }
            }

            Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.text;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollWidth;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.scrollHeight;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelZoom;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleX;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleZ;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelAngleY;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETTRANS) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.transparencyTop;
            return 1;
         } else if (var0 == 1610) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.transparencyBot;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.color;
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.color2;
            return 1;
         } else if (var0 == 1613) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
            return 1;
         } else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
            Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
            return 1;
         } else {
            class298 var4;
            if (var0 == 1617) {
               var4 = var3.method6293();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3454 : 0;
            }

            if (var0 == 1618) {
               var4 = var3.method6293();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3456 : 0;
               return 1;
            } else if (var0 == 1619) {
               var7 = var3.method6167();
               Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5893().method7091() : "";
               return 1;
            } else if (var0 == 1620) {
               var4 = var3.method6293();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var4 != null ? var4.field3455 : 0;
               return 1;
            } else if (var0 == 1621) {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5939() : 0;
               return 1;
            } else if (var0 == 1622) {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5940() : 0;
               return 1;
            } else if (var0 == 1623) {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6111() : 0;
               return 1;
            } else if (var0 == 1624) {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null && var7.method5963() ? 1 : 0;
               return 1;
            } else if (var0 != 1625) {
               if (var0 == 1626) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var7 != null ? var7.method5930().method7272() : "";
                  return 1;
               } else if (var0 == 1627) {
                  var7 = var3.method6167();
                  int var5 = var7 != null ? var7.method5913() : 0;
                  int var6 = var7 != null ? var7.method5934() : 0;
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Math.min(var5, var6);
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = Math.max(var5, var6);
                  return 1;
               } else if (var0 == 1628) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5934() : 0;
                  return 1;
               } else if (var0 == 1629) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6054() : 0;
                  return 1;
               } else if (var0 == 1630) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5942() : 0;
                  return 1;
               } else if (var0 == 1631) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method5944() : 0;
                  return 1;
               } else if (var0 == 1632) {
                  var7 = var3.method6167();
                  Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null ? var7.method6024() : 0;
                  return 1;
               } else {
                  class28 var8;
                  if (var0 == 1633) {
                     var8 = var3.method6187();
                     Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = var8 != null ? var8.method393(Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else if (var0 == 1634) {
                     var8 = var3.method6187();
                     Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1] = var8 != null ? var8.method396((char)Interpreter.Interpreter_intStack[class87.Interpreter_intStackSize - 1]) : 0;
                     return 1;
                  } else {
                     return 2;
                  }
               }
            } else {
               var7 = var3.method6167();
               Interpreter.Interpreter_intStack[++class87.Interpreter_intStackSize - 1] = var7 != null && var7.method5878() ? 1 : 0;
               return 1;
            }
         }
      }
   }

   @ObfuscatedName("az")
   @ObfuscatedSignature(
      descriptor = "([BII)I",
      garbageValue = "-791901458"
   )
   public static int method6673(byte[] var0, int var1) {
      int var3 = -1;

      for(int var4 = 0; var4 < var1; ++var4) {
         var3 = var3 >>> 8 ^ Buffer.field4915[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }
}
