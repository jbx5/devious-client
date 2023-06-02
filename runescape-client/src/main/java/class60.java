import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cd")
public class class60 {
   @ObfuscatedName("cl")
   @ObfuscatedGetter(
      intValue = 1091339839
   )
   static int field443;
   @ObfuscatedName("nl")
   @ObfuscatedGetter(
      intValue = -1106831405
   )
   @Export("menuHeight")
   static int menuHeight;
   @ObfuscatedName("at")
   byte[] field440 = null;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -726527241
   )
   int field439 = 0;
   @ObfuscatedName("av")
   @ObfuscatedGetter(
      intValue = 174090797
   )
   int field445 = 0;

   class60() {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "790256157"
   )
   int readBits(int var1) {
      int var2 = 0;

      int var3;
      int var4;
      for(var3 = 0; var1 >= 8 - this.field445; var1 -= var4) {
         var4 = 8 - this.field445;
         int var5 = (1 << var4) - 1;
         var2 += (this.field440[this.field439] >> this.field445 & var5) << var3;
         this.field445 = 0;
         ++this.field439;
         var3 += var4;
      }

      if (var1 > 0) {
         var4 = (1 << var1) - 1;
         var2 += (this.field440[this.field439] >> this.field445 & var4) << var3;
         this.field445 += var1;
      }

      return var2;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(I)I",
      garbageValue = "-1551736607"
   )
   int method1117() {
      int var1 = this.field440[this.field439] >> this.field445 & 1;
      ++this.field445;
      this.field439 += this.field445 >> 3;
      this.field445 &= 7;
      return var1;
   }

   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "([BII)V",
      garbageValue = "-2117226834"
   )
   void method1136(byte[] var1, int var2) {
      this.field440 = var1;
      this.field439 = var2;
      this.field445 = 0;
   }

   @ObfuscatedName("at")
   public static final int method1135(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (0.0 != var2) {
         double var12;
         if (var4 < 0.5) {
            var12 = (1.0 + var2) * var4;
         } else {
            var12 = var2 + var4 - var4 * var2;
         }

         double var14 = 2.0 * var4 - var12;
         double var16 = var0 + 0.3333333333333333;
         if (var16 > 1.0) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333;
         if (var20 < 0.0) {
            ++var20;
         }

         if (var16 * 6.0 < 1.0) {
            var6 = var14 + 6.0 * (var12 - var14) * var16;
         } else if (2.0 * var16 < 1.0) {
            var6 = var12;
         } else if (var16 * 3.0 < 2.0) {
            var6 = (var12 - var14) * (0.6666666666666666 - var16) * 6.0 + var14;
         } else {
            var6 = var14;
         }

         if (6.0 * var0 < 1.0) {
            var8 = var14 + var0 * 6.0 * (var12 - var14);
         } else if (var0 * 2.0 < 1.0) {
            var8 = var12;
         } else if (3.0 * var0 < 2.0) {
            var8 = var14 + (0.6666666666666666 - var0) * (var12 - var14) * 6.0;
         } else {
            var8 = var14;
         }

         if (var20 * 6.0 < 1.0) {
            var10 = var20 * (var12 - var14) * 6.0 + var14;
         } else if (var20 * 2.0 < 1.0) {
            var10 = var12;
         } else if (var20 * 3.0 < 2.0) {
            var10 = var14 + 6.0 * (var12 - var14) * (0.6666666666666666 - var20);
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0);
      int var13 = (int)(var8 * 256.0);
      int var23 = (int)(256.0 * var10);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(IIB)Z",
      garbageValue = "68"
   )
   public static boolean method1131(int var0, int var1) {
      return (var0 >> var1 + 1 & 1) != 0;
   }

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;I)[B",
      garbageValue = "-967954610"
   )
   public static byte[] method1132(CharSequence var0) {
      int var1 = var0.length();
      byte[] var2 = new byte[var1];

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if (var4 > 0 && var4 < 128 || var4 >= 160 && var4 <= 255) {
            var2[var3] = (byte)var4;
         } else if (var4 == 8364) {
            var2[var3] = -128;
         } else if (var4 == 8218) {
            var2[var3] = -126;
         } else if (var4 == 402) {
            var2[var3] = -125;
         } else if (var4 == 8222) {
            var2[var3] = -124;
         } else if (var4 == 8230) {
            var2[var3] = -123;
         } else if (var4 == 8224) {
            var2[var3] = -122;
         } else if (var4 == 8225) {
            var2[var3] = -121;
         } else if (var4 == 710) {
            var2[var3] = -120;
         } else if (var4 == 8240) {
            var2[var3] = -119;
         } else if (var4 == 352) {
            var2[var3] = -118;
         } else if (var4 == 8249) {
            var2[var3] = -117;
         } else if (var4 == 338) {
            var2[var3] = -116;
         } else if (var4 == 381) {
            var2[var3] = -114;
         } else if (var4 == 8216) {
            var2[var3] = -111;
         } else if (var4 == 8217) {
            var2[var3] = -110;
         } else if (var4 == 8220) {
            var2[var3] = -109;
         } else if (var4 == 8221) {
            var2[var3] = -108;
         } else if (var4 == 8226) {
            var2[var3] = -107;
         } else if (var4 == 8211) {
            var2[var3] = -106;
         } else if (var4 == 8212) {
            var2[var3] = -105;
         } else if (var4 == 732) {
            var2[var3] = -104;
         } else if (var4 == 8482) {
            var2[var3] = -103;
         } else if (var4 == 353) {
            var2[var3] = -102;
         } else if (var4 == 8250) {
            var2[var3] = -101;
         } else if (var4 == 339) {
            var2[var3] = -100;
         } else if (var4 == 382) {
            var2[var3] = -98;
         } else if (var4 == 376) {
            var2[var3] = -97;
         } else {
            var2[var3] = 63;
         }
      }

      return var2;
   }

   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      descriptor = "(ILdd;ZB)I",
      garbageValue = "76"
   )
   static int method1133(int var0, Script var1, boolean var2) {
      int var3;
      if (var0 == ScriptOpcodes.OC_NAME) {
         var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
         Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = class300.ItemDefinition_get(var3).name;
         return 1;
      } else {
         ItemComposition var5;
         int var6;
         if (var0 == ScriptOpcodes.OC_OP) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = class300.ItemDefinition_get(var3);
            if (var6 >= 1 && var6 <= 5 && var5.groundActions[var6 - 1] != null) {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.groundActions[var6 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.OC_IOP) {
            Interpreter.Interpreter_intStackSize -= 2;
            var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
            var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
            var5 = class300.ItemDefinition_get(var3);
            if (var6 >= 1 && var6 <= 5 && var5.inventoryActions[var6 - 1] != null) {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = var5.inventoryActions[var6 - 1];
            } else {
               Interpreter.Interpreter_stringStack[++class149.Interpreter_stringStackSize - 1] = "";
            }

            return 1;
         } else if (var0 == ScriptOpcodes.OC_COST) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var3).price;
            return 1;
         } else if (var0 == ScriptOpcodes.OC_STACKABLE) {
            var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
            Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var3).isStackable == 1 ? 1 : 0;
            return 1;
         } else {
            ItemComposition var4;
            if (var0 == ScriptOpcodes.OC_CERT) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = class300.ItemDefinition_get(var3);
               if (var4.noteTemplate == -1 && var4.note >= 0) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_UNCERT) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = class300.ItemDefinition_get(var3);
               if (var4.noteTemplate >= 0 && var4.note >= 0) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.note;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_MEMBERS) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var3).isMembersOnly ? 1 : 0;
               return 1;
            } else if (var0 == ScriptOpcodes.OC_PLACEHOLDER) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = class300.ItemDefinition_get(var3);
               if (var4.placeholderTemplate == -1 && var4.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_UNPLACEHOLDER) {
               var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               var4 = class300.ItemDefinition_get(var3);
               if (var4.placeholderTemplate >= 0 && var4.placeholder >= 0) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.placeholder;
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3;
               }

               return 1;
            } else if (var0 == ScriptOpcodes.OC_FIND) {
               String var7 = Interpreter.Interpreter_stringStack[--class149.Interpreter_stringStackSize];
               var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
               LoginScreenAnimation.findItemDefinitions(var7, var6 == 1);
               Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class105.foundItemIdCount;
               return 1;
            } else if (var0 != ScriptOpcodes.OC_FINDNEXT) {
               if (var0 == ScriptOpcodes.OC_FINDRESET) {
                  class13.foundItemIndex = 0;
                  return 1;
               } else if (var0 == 4213) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var6 = class300.ItemDefinition_get(var3).getShiftClickIndex();
                  if (var6 == -1) {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6;
                  } else {
                     Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var6 + 1;
                  }

                  return 1;
               } else if (var0 == 4214) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var3).maleModel;
                  return 1;
               } else if (var0 == 4215) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var3).maleModel1;
                  return 1;
               } else if (var0 == 4216) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class300.ItemDefinition_get(var3).maleModel2;
                  return 1;
               } else if (var0 == 4217) {
                  var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
                  var4 = class300.ItemDefinition_get(var3);
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.field2249;
                  return 1;
               } else {
                  return 2;
               }
            } else {
               if (class18.foundItemIds != null && class13.foundItemIndex < class105.foundItemIdCount) {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class18.foundItemIds[++class13.foundItemIndex - 1] & '\uffff';
               } else {
                  Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
               }

               return 1;
            }
         }
      }
   }

   @ObfuscatedName("mi")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "1"
   )
   static final int method1119() {
      float var0 = 200.0F * ((float)class10.clientPreferences.method2430() - 0.5F);
      return 100 - Math.round(var0);
   }

   @ObfuscatedName("ng")
   @ObfuscatedSignature(
      descriptor = "(Ltz;II)V",
      garbageValue = "1476989367"
   )
   static void method1120(Buffer var0, int var1) {
      byte[] var2 = var0.array;
      if (Client.randomDatData == null) {
         Client.randomDatData = new byte[24];
      }

      class397.writeRandomDat(var2, var1, Client.randomDatData, 0, 24);
      if (JagexCache.JagexCache_randomDat != null) {
         try {
            JagexCache.JagexCache_randomDat.seek(0L);
            JagexCache.JagexCache_randomDat.write(var0.array, var1, 24);
         } catch (Exception var4) {
         }
      }

   }
}
