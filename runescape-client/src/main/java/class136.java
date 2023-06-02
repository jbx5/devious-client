import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fz")
public class class136 extends DualNode {
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = 1048712745
   )
   static int field1585;
   @ObfuscatedName("bx")
   protected static String field1591;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = -937938317
   )
   int field1588;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "[[Leq;"
   )
   public class129[][] field1583 = null;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "[[Leq;"
   )
   class129[][] field1584 = null;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lir;"
   )
   public Skeleton field1587;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -1017129951
   )
   int field1586 = 0;
   @ObfuscatedName("ap")
   boolean field1582;
   @ObfuscatedName("ae")
   Future field1590;
   @ObfuscatedName("af")
   List field1589;

   @ObfuscatedSignature(
      descriptor = "(Lnq;Lnq;IZ)V",
      garbageValue = "0"
   )
   public class136(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
      this.field1588 = var3;
      byte[] var5 = var1.takeFile(this.field1588 >> 16 & '\uffff', this.field1588 & '\uffff');
      Buffer var6 = new Buffer(var5);
      int var7 = var6.readUnsignedByte();
      int var8 = var6.readUnsignedShort();
      byte[] var9 = var2.getFile(var8, 0);
      this.field1587 = new Skeleton(var8, var9);
      this.field1589 = new ArrayList();
      this.field1590 = class125.field1468.submit(new class133(this, var6, var7));
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ltz;IB)V",
      garbageValue = "4"
   )
   void method3069(Buffer var1, int var2) {
      var1.readUnsignedShort();
      var1.readUnsignedShort();
      this.field1586 = var1.readUnsignedByte();
      int var3 = var1.readUnsignedShort();
      this.field1584 = new class129[this.field1587.method4507().method4451()][];
      this.field1583 = new class129[this.field1587.method4509()][];
      class128[] var4 = new class128[var3];

      int var5;
      int var7;
      for(var5 = 0; var5 < var3; ++var5) {
         class130 var12 = Varps.method5963(var1.readUnsignedByte());
         var7 = var1.readShortSmart();
         class131 var13 = class177.method3518(var1.readUnsignedByte());
         class129 var14 = new class129();
         var14.method2976(var1, var2);
         var4[var5] = new class128(this, var14, var12, var13, var7);
         int var10 = var12.method3003();
         class129[][] var15;
         if (var12 == class130.field1529) {
            var15 = this.field1584;
         } else {
            var15 = this.field1583;
         }

         if (var15[var7] == null) {
            var15[var7] = new class129[var10];
         }

         if (var12 == class130.field1532) {
            this.field1582 = true;
         }
      }

      var5 = var3 / AccessFile.field4940;
      int var6 = var3 % AccessFile.field4940;
      int var8 = 0;

      for(int var9 = 0; var9 < AccessFile.field4940; ++var9) {
         var7 = var8;
         var8 += var5;
         if (var6 > 0) {
            ++var8;
            --var6;
         }

         if (var7 == var8) {
            break;
         }

         this.field1589.add(class125.field1468.submit(new class135(this, var7, var8, var4)));
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "-5"
   )
   public boolean method3051() {
      if (this.field1590 == null && this.field1589 == null) {
         return true;
      } else {
         if (this.field1590 != null) {
            if (!this.field1590.isDone()) {
               return false;
            }

            this.field1590 = null;
         }

         boolean var1 = true;

         for(int var2 = 0; var2 < this.field1589.size(); ++var2) {
            if (!((Future)this.field1589.get(var2)).isDone()) {
               var1 = false;
            } else {
               this.field1589.remove(var2);
               --var2;
            }
         }

         if (!var1) {
            return false;
         } else {
            this.field1589 = null;
            return true;
         }
      }
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "619897416"
   )
   public int method3052() {
      return this.field1586;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(B)Z",
      garbageValue = "6"
   )
   public boolean method3053() {
      return this.field1582;
   }

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(ILej;III)V",
      garbageValue = "-666610798"
   )
   public void method3054(int var1, class126 var2, int var3, int var4) {
      class438 var5 = class396.method7554();
      this.method3055(var5, var3, var2, var1);
      this.method3057(var5, var3, var2, var1);
      this.method3056(var5, var3, var2, var1);
      var2.method2939(var5);
      var5.method8119();
   }

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(Lqp;ILej;II)V",
      garbageValue = "1698958692"
   )
   void method3055(class438 var1, int var2, class126 var3, int var4) {
      float[] var5 = var3.method2929(this.field1586);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1584[var2] != null) {
         class129 var9 = this.field1584[var2][0];
         class129 var10 = this.field1584[var2][1];
         class129 var11 = this.field1584[var2][2];
         if (var9 != null) {
            var6 = var9.method2975(var4);
         }

         if (var10 != null) {
            var7 = var10.method2975(var4);
         }

         if (var11 != null) {
            var8 = var11.method2975(var4);
         }
      }

      class437 var22;
      synchronized(class437.field4677) {
         if (class437.field4676 == 0) {
            var22 = new class437();
         } else {
            class437.field4677[--class437.field4676].method8070();
            var22 = class437.field4677[class437.field4676];
         }
      }

      var22.method8069(1.0F, 0.0F, 0.0F, var6);
      class437 var23;
      synchronized(class437.field4677) {
         if (class437.field4676 == 0) {
            var23 = new class437();
         } else {
            class437.field4677[--class437.field4676].method8070();
            var23 = class437.field4677[class437.field4676];
         }
      }

      var23.method8069(0.0F, 1.0F, 0.0F, var7);
      class437 var13;
      synchronized(class437.field4677) {
         if (class437.field4676 == 0) {
            var13 = new class437();
         } else {
            class437.field4677[--class437.field4676].method8070();
            var13 = class437.field4677[class437.field4676];
         }
      }

      var13.method8069(0.0F, 0.0F, 1.0F, var8);
      class437 var15;
      synchronized(class437.field4677) {
         if (class437.field4676 == 0) {
            var15 = new class437();
         } else {
            class437.field4677[--class437.field4676].method8070();
            var15 = class437.field4677[class437.field4676];
         }
      }

      var15.method8071(var13);
      var15.method8071(var22);
      var15.method8071(var23);
      class438 var17 = class396.method7554();
      var17.method8105(var15);
      var1.method8104(var17);
      var22.method8076();
      var23.method8076();
      var13.method8076();
      var15.method8076();
      var17.method8119();
   }

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(Lqp;ILej;II)V",
      garbageValue = "1814069017"
   )
   void method3056(class438 var1, int var2, class126 var3, int var4) {
      float[] var5 = var3.method2930(this.field1586);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1584[var2] != null) {
         class129 var9 = this.field1584[var2][3];
         class129 var10 = this.field1584[var2][4];
         class129 var11 = this.field1584[var2][5];
         if (var9 != null) {
            var6 = var9.method2975(var4);
         }

         if (var10 != null) {
            var7 = var10.method2975(var4);
         }

         if (var11 != null) {
            var8 = var11.method2975(var4);
         }
      }

      var1.field4685[12] = var6;
      var1.field4685[13] = var7;
      var1.field4685[14] = var8;
   }

   @ObfuscatedName("ak")
   @ObfuscatedSignature(
      descriptor = "(Lqp;ILej;IS)V",
      garbageValue = "16384"
   )
   void method3057(class438 var1, int var2, class126 var3, int var4) {
      float[] var5 = var3.method2931(this.field1586);
      float var6 = var5[0];
      float var7 = var5[1];
      float var8 = var5[2];
      if (this.field1584[var2] != null) {
         class129 var9 = this.field1584[var2][6];
         class129 var10 = this.field1584[var2][7];
         class129 var11 = this.field1584[var2][8];
         if (var9 != null) {
            var6 = var9.method2975(var4);
         }

         if (var10 != null) {
            var7 = var10.method2975(var4);
         }

         if (var11 != null) {
            var8 = var11.method2975(var4);
         }
      }

      class438 var12 = class396.method7554();
      var12.method8102(var6, var7, var8);
      var1.method8104(var12);
      var12.method8119();
   }

   @ObfuscatedName("bd")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZI)I",
      garbageValue = "1970905733"
   )
   static int method3075(int var0, Script var1, boolean var2) {
      int var4;
      int var9;
      if (var0 == ScriptOpcodes.ADD) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 + var9;
         return 1;
      } else if (var0 == ScriptOpcodes.SUB) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 - var4;
         return 1;
      } else if (var0 == ScriptOpcodes.MULTIPLY) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 * var9;
         return 1;
      } else if (var0 == ScriptOpcodes.DIV) {
         Interpreter.Interpreter_intStackSize -= 2;
         var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
         var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 / var4;
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOM) {
         var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
         return 1;
      } else if (var0 == ScriptOpcodes.RANDOMINC) {
         var9 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
         return 1;
      } else {
         int var5;
         int var6;
         int var7;
         if (var0 == ScriptOpcodes.INTERPOLATE) {
            Interpreter.Interpreter_intStackSize -= 5;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
            var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
            return 1;
         } else if (var0 == ScriptOpcodes.ADDPERCENT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
            return 1;
         } else if (var0 == ScriptOpcodes.TESTBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
            return 1;
         } else if (var0 == ScriptOpcodes.MOD) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 % var4;
            return 1;
         } else if (var0 == ScriptOpcodes.POW) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            if (var9 == 0) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
            } else {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
            }

            return 1;
         } else if (var0 == ScriptOpcodes.INVPOW) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            if (var9 == 0) {
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
               return 1;
            } else {
               switch (var4) {
                  case 0:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
                     break;
                  case 1:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
                     break;
                  case 2:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
                     break;
                  case 3:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
                     break;
                  case 4:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
                     break;
                  default:
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0 / (double)var4);
               }

               return 1;
            }
         } else if (var0 == ScriptOpcodes.AND) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 & var4;
            return 1;
         } else if (var0 == ScriptOpcodes.OR) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4;
            return 1;
         } else if (var0 == 4016) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
            return 1;
         } else if (var0 == 4017) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SCALE) {
            Interpreter.Interpreter_intStackSize -= 3;
            long var10 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            long var12 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            long var14 = (long)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
            return 1;
         } else if (var0 == ScriptOpcodes.BITCOUNT) {
            var9 = FloorOverlayDefinition.method4023(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9;
            return 1;
         } else if (var0 == ScriptOpcodes.TOGGLEBIT) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
            return 1;
         } else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = MouseHandler.method642(var9, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = PlayerComposition.method6052(var9, var4, var5);
            return 1;
         } else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
            Interpreter.Interpreter_intStackSize -= 3;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = 31 - var5;
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
            return 1;
         } else if (var0 == 4030) {
            Interpreter.Interpreter_intStackSize -= 4;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
            var9 = PlayerComposition.method6052(var9, var5, var6);
            var7 = class155.method3288(var6 - var5 + 1);
            if (var4 > var7) {
               var4 = var7;
            }

            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var9 | var4 << var5;
            return 1;
         } else if (var0 == 4032) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = MouseHandler.method655(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4033) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = GrandExchangeOfferWorldComparator.method6833(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4034) {
            Interpreter.Interpreter_intStackSize -= 2;
            var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = UserComparator7.method2860(var9, var4);
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var5;
            return 1;
         } else if (var0 == 4035) {
            Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
            return 1;
         } else if (var0 == 4036) {
            String var3 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
            var4 = -1;
            if (class146.isNumber(var3)) {
               var4 = TextureProvider.method4744(var3);
            }

            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4;
            return 1;
         } else {
            return 2;
         }
      }
   }

   @ObfuscatedName("gn")
   @ObfuscatedSignature(
      descriptor = "(Lny;Ljava/lang/String;I)V",
      garbageValue = "2030574471"
   )
   static void method3070(Archive var0, String var1) {
      ArchiveLoader var2 = new ArchiveLoader(var0, var1);
      Client.archiveLoaders.add(var2);
      Client.field767 += var2.groupCount;
   }

   @ObfuscatedName("gl")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-860479964"
   )
   @Export("load")
   static void load() {
      int var18;
      if (Client.titleLoadingStage == 0) {
         class36.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);

         for(var18 = 0; var18 < 4; ++var18) {
            Client.collisionMaps[var18] = new CollisionMap(104, 104);
         }

         class33.sceneMinimapSprite = new SpritePixels(512, 512);
         Login.Login_loadingText = "Starting game engine...";
         Login.Login_loadingPercent = 5;
         Client.titleLoadingStage = 20;
      } else if (Client.titleLoadingStage == 20) {
         Login.Login_loadingText = "Prepared visibility map";
         Login.Login_loadingPercent = 10;
         Client.titleLoadingStage = 30;
      } else if (Client.titleLoadingStage == 30) {
         class466.field4812 = FriendSystem.newArchive(0, false, true, true, false);
         Actor.archive7 = FriendSystem.newArchive(1, false, true, true, false);
         MouseRecorder.archive2 = FriendSystem.newArchive(2, true, false, true, false);
         BuddyRankComparator.archive4 = FriendSystem.newArchive(3, false, true, true, false);
         LoginScreenAnimation.field1244 = FriendSystem.newArchive(4, false, true, true, false);
         class305.archive9 = FriendSystem.newArchive(5, true, true, true, false);
         ReflectionCheck.archive6 = FriendSystem.newArchive(6, true, true, true, false);
         FontName.archive11 = FriendSystem.newArchive(7, false, true, true, false);
         class180.archive8 = FriendSystem.newArchive(8, false, true, true, false);
         Language.field4347 = FriendSystem.newArchive(9, false, true, true, false);
         class53.archive10 = FriendSystem.newArchive(10, false, true, true, false);
         ViewportMouse.field2770 = FriendSystem.newArchive(11, false, true, true, false);
         class33.archive12 = FriendSystem.newArchive(12, false, true, true, false);
         class310.archive13 = FriendSystem.newArchive(13, true, false, true, false);
         GrandExchangeOffer.archive14 = FriendSystem.newArchive(14, false, true, true, false);
         class17.archive15 = FriendSystem.newArchive(15, false, true, true, false);
         Language.archive17 = FriendSystem.newArchive(17, true, true, true, false);
         class350.archive18 = FriendSystem.newArchive(18, false, true, true, false);
         ChatChannel.archive19 = FriendSystem.newArchive(19, false, true, true, false);
         class291.archive20 = FriendSystem.newArchive(20, false, true, true, false);
         Messages.field1377 = FriendSystem.newArchive(21, false, true, true, true);
         Login.Login_loadingText = "Connecting to update server";
         Login.Login_loadingPercent = 20;
         Client.titleLoadingStage = 40;
      } else if (Client.titleLoadingStage == 40) {
         byte var41 = 0;
         var18 = var41 + class466.field4812.percentage() * 4 / 100;
         var18 += Actor.archive7.percentage() * 4 / 100;
         var18 += MouseRecorder.archive2.percentage() * 2 / 100;
         var18 += BuddyRankComparator.archive4.percentage() * 2 / 100;
         var18 += LoginScreenAnimation.field1244.percentage() * 6 / 100;
         var18 += class305.archive9.percentage() * 4 / 100;
         var18 += ReflectionCheck.archive6.percentage() * 2 / 100;
         var18 += FontName.archive11.percentage() * 55 / 100;
         var18 += class180.archive8.percentage() * 2 / 100;
         var18 += Language.field4347.percentage() * 2 / 100;
         var18 += class53.archive10.percentage() * 2 / 100;
         var18 += ViewportMouse.field2770.percentage() * 2 / 100;
         var18 += class33.archive12.percentage() * 2 / 100;
         var18 += class310.archive13.percentage() * 2 / 100;
         var18 += GrandExchangeOffer.archive14.percentage() * 2 / 100;
         var18 += class17.archive15.percentage() * 2 / 100;
         var18 += ChatChannel.archive19.percentage() / 100;
         var18 += class350.archive18.percentage() / 100;
         var18 += class291.archive20.percentage() / 100;
         var18 += Messages.field1377.percentage() / 100;
         var18 += Language.archive17.method6647() && Language.archive17.isFullyLoaded() ? 1 : 0;
         if (var18 != 100) {
            if (var18 != 0) {
               Login.Login_loadingText = "Checking for updates - " + var18 + "%";
            }

            Login.Login_loadingPercent = 30;
         } else {
            method3070(class466.field4812, "Animations");
            method3070(Actor.archive7, "Skeletons");
            method3070(LoginScreenAnimation.field1244, "Sound FX");
            method3070(class305.archive9, "Maps");
            method3070(ReflectionCheck.archive6, "Music Tracks");
            method3070(FontName.archive11, "Models");
            method3070(class180.archive8, "Sprites");
            method3070(ViewportMouse.field2770, "Music Jingles");
            method3070(GrandExchangeOffer.archive14, "Music Samples");
            method3070(class17.archive15, "Music Patches");
            method3070(ChatChannel.archive19, "World Map");
            method3070(class350.archive18, "World Map Geography");
            method3070(class291.archive20, "World Map Ground");
            FontName.spriteIds = new GraphicsDefaults();
            FontName.spriteIds.decode(Language.archive17);
            Login.Login_loadingText = "Loaded update list";
            Login.Login_loadingPercent = 30;
            Client.titleLoadingStage = 45;
         }
      } else {
         Archive var2;
         Archive var31;
         if (Client.titleLoadingStage == 45) {
            WorldMapScaleHandler.method5595(22050, !Client.isLowDetail, 2);
            MidiPcmStream var29 = new MidiPcmStream();
            var29.method5769(9, 128);
            MouseRecorder.pcmPlayer0 = ObjectComposition.method3907(GameEngine.taskHandler, 0, 22050);
            MouseRecorder.pcmPlayer0.setStream(var29);
            var31 = class17.archive15;
            var2 = GrandExchangeOffer.archive14;
            Archive var39 = LoginScreenAnimation.field1244;
            class304.field3396 = var31;
            class304.musicSamplesArchive = var2;
            class304.soundEffectsArchive = var39;
            class304.midiPcmStream = var29;
            class290.pcmPlayer1 = ObjectComposition.method3907(GameEngine.taskHandler, 1, 2048);
            KitDefinition.pcmStreamMixer = new PcmStreamMixer();
            class290.pcmPlayer1.setStream(KitDefinition.pcmStreamMixer);
            FloorOverlayDefinition.decimator = new Decimator(22050, PcmPlayer.field291);
            Login.Login_loadingText = "Prepared sound engine";
            Login.Login_loadingPercent = 35;
            Client.titleLoadingStage = 50;
            class490.WorldMapElement_fonts = new Fonts(class180.archive8, class310.archive13);
         } else {
            int var19;
            if (Client.titleLoadingStage == 50) {
               FontName[] var28 = new FontName[]{FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain11};
               var19 = var28.length;
               Fonts var30 = class490.WorldMapElement_fonts;
               FontName[] var38 = new FontName[]{FontName.FontName_plain12, FontName.FontName_bold12, FontName.FontName_verdana13, FontName.FontName_verdana11, FontName.FontName_verdana15, FontName.FontName_plain11};
               Client.fontsMap = var30.createMap(var38);
               if (Client.fontsMap.size() < var19) {
                  Login.Login_loadingText = "Loading fonts - " + Client.fontsMap.size() * 100 / var19 + "%";
                  Login.Login_loadingPercent = 40;
               } else {
                  MouseHandler.fontPlain11 = (Font)Client.fontsMap.get(FontName.FontName_plain11);
                  class404.fontPlain12 = (Font)Client.fontsMap.get(FontName.FontName_plain12);
                  class166.fontBold12 = (Font)Client.fontsMap.get(FontName.FontName_bold12);
                  ChatChannel.platformInfo = Client.platformInfoProvider.get();
                  Login.Login_loadingText = "Loaded fonts";
                  Login.Login_loadingPercent = 40;
                  Client.titleLoadingStage = 60;
               }
            } else {
               int var3;
               if (Client.titleLoadingStage == 60) {
                  var18 = WorldMapScaleHandler.method5598(class53.archive10, class180.archive8);
                  var2 = class180.archive8;
                  var3 = Login.field953.length + Login.field952.length;
                  String[] var40 = Login.field933;

                  for(int var25 = 0; var25 < var40.length; ++var25) {
                     String var35 = var40[var25];
                     if (var2.getGroupId(var35) != -1) {
                        ++var3;
                     }
                  }

                  if (var18 < var3) {
                     Login.Login_loadingText = "Loading title screen - " + var18 * 100 / var3 + "%";
                     Login.Login_loadingPercent = 50;
                  } else {
                     Login.Login_loadingText = "Loaded title screen";
                     Login.Login_loadingPercent = 50;
                     UserComparator8.updateGameState(5);
                     Client.titleLoadingStage = 70;
                  }
               } else if (Client.titleLoadingStage == 70) {
                  if (!MouseRecorder.archive2.isFullyLoaded()) {
                     Login.Login_loadingText = "Loading config - " + MouseRecorder.archive2.loadPercent() + "%";
                     Login.Login_loadingPercent = 60;
                  } else if (!Messages.field1377.isFullyLoaded()) {
                     Login.Login_loadingText = "Loading config - " + (80 + class33.archive12.loadPercent() / 6) + "%";
                     Login.Login_loadingPercent = 60;
                  } else {
                     class164.method3365(MouseRecorder.archive2);
                     class323.method6002(MouseRecorder.archive2);
                     UserComparator9.method2876(MouseRecorder.archive2, FontName.archive11);
                     ScriptFrame.method1148(MouseRecorder.archive2, FontName.archive11, Client.isLowDetail);
                     UserComparator4.method2847(MouseRecorder.archive2, FontName.archive11);
                     class17.method244(MouseRecorder.archive2);
                     Archive var27 = MouseRecorder.archive2;
                     var31 = FontName.archive11;
                     boolean var37 = Client.isMembersWorld;
                     Font var21 = MouseHandler.fontPlain11;
                     ItemComposition.ItemDefinition_archive = var27;
                     ItemComposition.ItemDefinition_modelArchive = var31;
                     ItemComposition.ItemDefinition_inMembersWorld = var37;
                     class435.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
                     class259.ItemDefinition_fontPlain11 = var21;
                     FriendLoginUpdate.method7785(MouseRecorder.archive2, class466.field4812, Actor.archive7);
                     ObjectSound.method1883(MouseRecorder.archive2, FontName.archive11);
                     Archive var22 = MouseRecorder.archive2;
                     VarbitComposition.VarbitDefinition_archive = var22;
                     Archive var32 = MouseRecorder.archive2;
                     class305.VarpDefinition_archive = var32;
                     VarpDefinition.field1903 = class305.VarpDefinition_archive.getGroupFileCount(16);
                     Archive var33 = BuddyRankComparator.archive4;
                     Archive var23 = FontName.archive11;
                     Archive var36 = class180.archive8;
                     Archive var9 = class310.archive13;
                     int var10 = 0;
                     if (var33 != null) {
                        Widget.Widget_archive = var33;
                        class309.field3453 = var23;
                        MenuAction.Widget_spritesArchive = var36;
                        class13.Widget_fontsArchive = var9;
                        var10 = Widget.Widget_archive.getGroupCount();
                     }

                     class16.Widget_interfaceComponents = new Widget[var10][];
                     class143.Widget_loadedInterfaces = new boolean[var10];
                     WorldMapSection1.method5501(MouseRecorder.archive2);
                     class140.method3112(MouseRecorder.archive2);
                     Archive var24 = MouseRecorder.archive2;
                     VarcInt.VarcInt_archive = var24;
                     class133.method3038(MouseRecorder.archive2);
                     Archive var11 = MouseRecorder.archive2;
                     ParamComposition.ParamDefinition_archive = var11;
                     class386.method7207(MouseRecorder.archive2);
                     Archive var12 = MouseRecorder.archive2;
                     DbRowType.field4997 = var12;
                     GraphicsObject.HitSplatDefinition_cachedSprites = new class485(GameBuild.field3841, 54, TriBool.clientLanguage, MouseRecorder.archive2);
                     HealthBar.HitSplatDefinition_cached = new class485(GameBuild.field3841, 47, TriBool.clientLanguage, MouseRecorder.archive2);
                     MouseHandler.varcs = new Varcs();
                     Archive var13 = MouseRecorder.archive2;
                     Archive var14 = class180.archive8;
                     Archive var15 = class310.archive13;
                     HitSplatDefinition.HitSplatDefinition_archive = var13;
                     HitSplatDefinition.field2118 = var14;
                     HitSplatDefinition.HitSplatDefinition_fontsArchive = var15;
                     Archive var16 = MouseRecorder.archive2;
                     Archive var17 = class180.archive8;
                     HealthBarDefinition.HealthBarDefinition_archive = var16;
                     HealthBarDefinition.field1952 = var17;
                     World.method1798(MouseRecorder.archive2, class180.archive8);
                     Login.Login_loadingText = "Loaded config";
                     Login.Login_loadingPercent = 60;
                     Client.titleLoadingStage = 80;
                  }
               } else if (Client.titleLoadingStage == 80) {
                  var18 = 0;
                  if (class304.compass == null) {
                     class304.compass = class107.SpriteBuffer_getSprite(class180.archive8, FontName.spriteIds.compass, 0);
                  } else {
                     ++var18;
                  }

                  if (class404.redHintArrowSprite == null) {
                     class404.redHintArrowSprite = class107.SpriteBuffer_getSprite(class180.archive8, FontName.spriteIds.field4654, 0);
                  } else {
                     ++var18;
                  }

                  IndexedSprite[] var1;
                  boolean var4;
                  byte[] var5;
                  IndexedSprite[] var6;
                  int var7;
                  IndexedSprite var8;
                  if (class47.mapSceneSprites == null) {
                     var2 = class180.archive8;
                     var3 = FontName.spriteIds.mapScenes;
                     var5 = var2.takeFile(var3, 0);
                     if (var5 == null) {
                        var4 = false;
                     } else {
                        UserComparator2.SpriteBuffer_decode(var5);
                        var4 = true;
                     }

                     if (!var4) {
                        var1 = null;
                     } else {
                        var6 = new IndexedSprite[class515.SpriteBuffer_spriteCount];

                        for(var7 = 0; var7 < class515.SpriteBuffer_spriteCount; ++var7) {
                           var8 = var6[var7] = new IndexedSprite();
                           var8.width = class330.SpriteBuffer_spriteWidth;
                           var8.height = class489.SpriteBuffer_spriteHeight;
                           var8.xOffset = class515.SpriteBuffer_xOffsets[var7];
                           var8.yOffset = class402.SpriteBuffer_yOffsets[var7];
                           var8.subWidth = class515.SpriteBuffer_spriteWidths[var7];
                           var8.subHeight = class515.SpriteBuffer_spriteHeights[var7];
                           var8.palette = class515.SpriteBuffer_spritePalette;
                           var8.pixels = class515.SpriteBuffer_pixels[var7];
                        }

                        TextureProvider.method4758();
                        var1 = var6;
                     }

                     class47.mapSceneSprites = var1;
                  } else {
                     ++var18;
                  }

                  if (NPCComposition.headIconPkSprites == null) {
                     NPCComposition.headIconPkSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.headIconsPk, 0);
                  } else {
                     ++var18;
                  }

                  if (class157.headIconPrayerSprites == null) {
                     class157.headIconPrayerSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4657, 0);
                  } else {
                     ++var18;
                  }

                  if (ReflectionCheck.headIconHintSprites == null) {
                     ReflectionCheck.headIconHintSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4658, 0);
                  } else {
                     ++var18;
                  }

                  if (LoginScreenAnimation.mapMarkerSprites == null) {
                     LoginScreenAnimation.mapMarkerSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4655, 0);
                  } else {
                     ++var18;
                  }

                  if (class12.crossSprites == null) {
                     class12.crossSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4660, 0);
                  } else {
                     ++var18;
                  }

                  if (class19.mapDotSprites == null) {
                     class19.mapDotSprites = WorldMapScaleHandler.method5597(class180.archive8, FontName.spriteIds.field4661, 0);
                  } else {
                     ++var18;
                  }

                  if (class411.scrollBarSprites == null) {
                     var2 = class180.archive8;
                     var3 = FontName.spriteIds.field4662;
                     var5 = var2.takeFile(var3, 0);
                     if (var5 == null) {
                        var4 = false;
                     } else {
                        UserComparator2.SpriteBuffer_decode(var5);
                        var4 = true;
                     }

                     if (!var4) {
                        var1 = null;
                     } else {
                        var6 = new IndexedSprite[class515.SpriteBuffer_spriteCount];

                        for(var7 = 0; var7 < class515.SpriteBuffer_spriteCount; ++var7) {
                           var8 = var6[var7] = new IndexedSprite();
                           var8.width = class330.SpriteBuffer_spriteWidth;
                           var8.height = class489.SpriteBuffer_spriteHeight;
                           var8.xOffset = class515.SpriteBuffer_xOffsets[var7];
                           var8.yOffset = class402.SpriteBuffer_yOffsets[var7];
                           var8.subWidth = class515.SpriteBuffer_spriteWidths[var7];
                           var8.subHeight = class515.SpriteBuffer_spriteHeights[var7];
                           var8.palette = class515.SpriteBuffer_spritePalette;
                           var8.pixels = class515.SpriteBuffer_pixels[var7];
                        }

                        TextureProvider.method4758();
                        var1 = var6;
                     }

                     class411.scrollBarSprites = var1;
                  } else {
                     ++var18;
                  }

                  if (VerticalAlignment.modIconSprites == null) {
                     var2 = class180.archive8;
                     var3 = FontName.spriteIds.field4659;
                     var5 = var2.takeFile(var3, 0);
                     if (var5 == null) {
                        var4 = false;
                     } else {
                        UserComparator2.SpriteBuffer_decode(var5);
                        var4 = true;
                     }

                     if (!var4) {
                        var1 = null;
                     } else {
                        var6 = new IndexedSprite[class515.SpriteBuffer_spriteCount];

                        for(var7 = 0; var7 < class515.SpriteBuffer_spriteCount; ++var7) {
                           var8 = var6[var7] = new IndexedSprite();
                           var8.width = class330.SpriteBuffer_spriteWidth;
                           var8.height = class489.SpriteBuffer_spriteHeight;
                           var8.xOffset = class515.SpriteBuffer_xOffsets[var7];
                           var8.yOffset = class402.SpriteBuffer_yOffsets[var7];
                           var8.subWidth = class515.SpriteBuffer_spriteWidths[var7];
                           var8.subHeight = class515.SpriteBuffer_spriteHeights[var7];
                           var8.palette = class515.SpriteBuffer_spritePalette;
                           var8.pixels = class515.SpriteBuffer_pixels[var7];
                        }

                        TextureProvider.method4758();
                        var1 = var6;
                     }

                     VerticalAlignment.modIconSprites = var1;
                  } else {
                     ++var18;
                  }

                  if (var18 < 11) {
                     Login.Login_loadingText = "Loading sprites - " + var18 * 100 / 12 + "%";
                     Login.Login_loadingPercent = 70;
                  } else {
                     AbstractFont.AbstractFont_modIconSprites = VerticalAlignment.modIconSprites;
                     class404.redHintArrowSprite.normalize();
                     var19 = (int)(Math.random() * 21.0) - 10;
                     int var20 = (int)(Math.random() * 21.0) - 10;
                     var3 = (int)(Math.random() * 21.0) - 10;
                     int var34 = (int)(Math.random() * 41.0) - 20;
                     class47.mapSceneSprites[0].shiftColors(var34 + var19, var34 + var20, var3 + var34);
                     Login.Login_loadingText = "Loaded sprites";
                     Login.Login_loadingPercent = 70;
                     Client.titleLoadingStage = 90;
                  }
               } else if (Client.titleLoadingStage == 90) {
                  if (!Language.field4347.isFullyLoaded()) {
                     Login.Login_loadingText = "Loading textures - " + "0%";
                     Login.Login_loadingPercent = 90;
                  } else {
                     Messages.textureProvider = new TextureProvider(Language.field4347, class180.archive8, 20, class10.clientPreferences.method2430(), Client.isLowDetail ? 64 : 128);
                     Rasterizer3D.method4371(Messages.textureProvider);
                     Rasterizer3D.method4372(class10.clientPreferences.method2430());
                     Client.titleLoadingStage = 100;
                  }
               } else if (Client.titleLoadingStage == 100) {
                  var18 = Messages.textureProvider.getLoadedPercentage();
                  if (var18 < 100) {
                     Login.Login_loadingText = "Loading textures - " + var18 + "%";
                     Login.Login_loadingPercent = 90;
                  } else {
                     Login.Login_loadingText = "Loaded textures";
                     Login.Login_loadingPercent = 90;
                     Client.titleLoadingStage = 110;
                  }
               } else if (Client.titleLoadingStage == 110) {
                  class85.mouseRecorder = new MouseRecorder();
                  GameEngine.taskHandler.newThreadTask(class85.mouseRecorder, 10);
                  Login.Login_loadingText = "Loaded input handler";
                  Login.Login_loadingPercent = 92;
                  Client.titleLoadingStage = 120;
               } else if (Client.titleLoadingStage == 120) {
                  if (!class53.archive10.tryLoadFileByNames("huffman", "")) {
                     Login.Login_loadingText = "Loading wordpack - " + 0 + "%";
                     Login.Login_loadingPercent = 94;
                  } else {
                     Huffman var26 = new Huffman(class53.archive10.takeFileByNames("huffman", ""));
                     class332.huffman = var26;
                     Login.Login_loadingText = "Loaded wordpack";
                     Login.Login_loadingPercent = 94;
                     Client.titleLoadingStage = 130;
                  }
               } else if (Client.titleLoadingStage == 130) {
                  if (!BuddyRankComparator.archive4.isFullyLoaded()) {
                     Login.Login_loadingText = "Loading interfaces - " + BuddyRankComparator.archive4.loadPercent() * 4 / 5 + "%";
                     Login.Login_loadingPercent = 96;
                  } else if (!class33.archive12.isFullyLoaded()) {
                     Login.Login_loadingText = "Loading interfaces - " + (80 + class33.archive12.loadPercent() / 6) + "%";
                     Login.Login_loadingPercent = 96;
                  } else if (!class310.archive13.isFullyLoaded()) {
                     Login.Login_loadingText = "Loading interfaces - " + (96 + class310.archive13.loadPercent() / 50) + "%";
                     Login.Login_loadingPercent = 96;
                  } else {
                     Login.Login_loadingText = "Loaded interfaces";
                     Login.Login_loadingPercent = 98;
                     if (class33.archive12.isValidFileName("version.dat", "")) {
                        Buffer var0 = new Buffer(class33.archive12.takeFileByNames("version.dat", ""));
                        var0.readUnsignedShort();
                     }

                     Client.titleLoadingStage = 140;
                  }
               } else if (Client.titleLoadingStage == 140) {
                  Login.Login_loadingPercent = 100;
                  if (ChatChannel.archive19.getGroupCount() > 0 && !ChatChannel.archive19.tryLoadGroupByName(WorldMapCacheName.field3049.name)) {
                     Login.Login_loadingText = "Loading world map - " + ChatChannel.archive19.groupLoadPercentByName(WorldMapCacheName.field3049.name) / 10 + "%";
                  } else {
                     if (ScriptFrame.worldMap == null) {
                        ScriptFrame.worldMap = new WorldMap();
                        ScriptFrame.worldMap.init(ChatChannel.archive19, class350.archive18, class291.archive20, class166.fontBold12, Client.fontsMap, class47.mapSceneSprites);
                     }

                     Login.Login_loadingText = "Loaded world map";
                     Client.titleLoadingStage = 150;
                  }
               } else if (Client.titleLoadingStage == 150) {
                  UserComparator8.updateGameState(10);
               }
            }
         }
      }
   }

   @ObfuscatedName("lc")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "31"
   )
   @Export("Widget_resetModelFrames")
   static final void Widget_resetModelFrames(int var0) {
      if (Client.loadInterface(var0)) {
         Widget[] var1 = class16.Widget_interfaceComponents[var0];

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Widget var3 = var1[var2];
            if (var3 != null) {
               var3.modelFrame = 0;
               var3.modelFrameCycle = 0;
            }
         }

      }
   }

   @ObfuscatedName("mk")
   @ObfuscatedSignature(
      descriptor = "(IIIILtm;Lmc;B)V",
      garbageValue = "-72"
   )
   @Export("worldToMinimap")
   static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
      int var6 = var3 * var3 + var2 * var2;
      if (var6 > 4225 && var6 < 90000) {
         int var7 = Client.camAngleY & 2047;
         int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
         int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
         int var10 = var9 * var2 + var3 * var8 >> 16;
         int var11 = var3 * var9 - var8 * var2 >> 16;
         double var12 = Math.atan2((double)var10, (double)var11);
         int var14 = var5.width / 2 - 25;
         int var15 = (int)(Math.sin(var12) * (double)var14);
         int var16 = (int)(Math.cos(var12) * (double)var14);
         byte var17 = 20;
         class404.redHintArrowSprite.method9412(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
      } else {
         class59.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
      }

   }
}
