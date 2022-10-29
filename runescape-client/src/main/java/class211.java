import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hh")
public class class211 {
   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "[Ldi;"
   )
   class122[] field2439;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = -2054841693
   )
   int field2438;

   @ObfuscatedSignature(
      descriptor = "(Lqr;I)V"
   )
   class211(Buffer var1, int var2) {
      this.field2439 = new class122[var2];
      this.field2438 = var1.readUnsignedByte();

      for(int var3 = 0; var3 < this.field2439.length; ++var3) {
         class122 var4 = new class122(this.field2438, var1, false);
         this.field2439[var3] = var4;
      }

      this.method4237();
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "505065843"
   )
   void method4237() {
      class122[] var1 = this.field2439;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         class122 var3 = var1[var2];
         if (var3.field1456 >= 0) {
            var3.field1457 = this.field2439[var3.field1456];
         }
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(S)I",
      garbageValue = "31386"
   )
   public int method4246() {
      return this.field2439.length;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)Ldi;",
      garbageValue = "1973675924"
   )
   class122 method4244(int var1) {
      return var1 >= this.method4246() ? null : this.field2439[var1];
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(I)[Ldi;",
      garbageValue = "-2063563387"
   )
   class122[] method4252() {
      return this.field2439;
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ldh;IB)V",
      garbageValue = "-29"
   )
   void method4241(class129 var1, int var2) {
      this.method4242(var1, var2, (boolean[])null, false);
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Ldh;I[ZZI)V",
      garbageValue = "-1278403491"
   )
   void method4242(class129 var1, int var2, boolean[] var3, boolean var4) {
      int var5 = var1.method2923();
      int var6 = 0;
      class122[] var7 = this.method4252();

      for(int var8 = 0; var8 < var7.length; ++var8) {
         class122 var9 = var7[var8];
         if (var3 == null || var4 == var3[var6]) {
            var1.method2940(var2, var9, var6, var5);
         }

         ++var6;
      }

   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(CLmo;S)C",
      garbageValue = "8635"
   )
   @Export("standardizeChar")
   static char standardizeChar(char var0, Language var1) {
      if (var0 >= 192 && var0 <= 255) {
         if (var0 >= 192 && var0 <= 198) {
            return 'A';
         }

         if (var0 == 199) {
            return 'C';
         }

         if (var0 >= 200 && var0 <= 203) {
            return 'E';
         }

         if (var0 >= 204 && var0 <= 207) {
            return 'I';
         }

         if (var0 == 209 && var1 != Language.Language_ES) {
            return 'N';
         }

         if (var0 >= 210 && var0 <= 214) {
            return 'O';
         }

         if (var0 >= 217 && var0 <= 220) {
            return 'U';
         }

         if (var0 == 221) {
            return 'Y';
         }

         if (var0 == 223) {
            return 's';
         }

         if (var0 >= 224 && var0 <= 230) {
            return 'a';
         }

         if (var0 == 231) {
            return 'c';
         }

         if (var0 >= 232 && var0 <= 235) {
            return 'e';
         }

         if (var0 >= 236 && var0 <= 239) {
            return 'i';
         }

         if (var0 == 241 && var1 != Language.Language_ES) {
            return 'n';
         }

         if (var0 >= 242 && var0 <= 246) {
            return 'o';
         }

         if (var0 >= 249 && var0 <= 252) {
            return 'u';
         }

         if (var0 == 253 || var0 == 255) {
            return 'y';
         }
      }

      if (var0 == 338) {
         return 'O';
      } else if (var0 == 339) {
         return 'o';
      } else if (var0 == 376) {
         return 'Y';
      } else {
         return var0;
      }
   }
}
