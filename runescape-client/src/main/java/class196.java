import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hb")
public class class196 {
   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   static final class196 field2056;
   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   static final class196 field2052;
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   static final class196 field2053;
   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   static final class196 field2054;
   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   static final class196 field2051;
   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   static final class196 field2055;
   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "Lhb;"
   )
   static final class196 field2057;

   static {
      field2056 = new class196(0, class208.field2304);
      field2052 = new class196(1, class208.field2312);
      field2053 = new class196(2, class208.field2301);
      field2054 = new class196(3, class208.field2307);
      field2051 = new class196(4, class208.field2309);
      field2055 = new class196(5, class208.field2308);
      field2057 = new class196(6, class208.field2311);
   }

   @ObfuscatedSignature(
      descriptor = "(ILin;)V"
   )
   class196(int var1, class208 var2) {
   }

   @ObfuscatedName("at")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Loj;B)I",
      garbageValue = "100"
   )
   @Export("compareStrings")
   public static int compareStrings(CharSequence var0, CharSequence var1, Language var2) {
      int var3 = var0.length();
      int var4 = var1.length();
      int var5 = 0;
      int var6 = 0;
      char var7 = 0;
      char var8 = 0;

      int var9;
      int var10;
      while(var5 - var7 < var3 || var6 - var8 < var4) {
         if (var5 - var7 >= var3) {
            return -1;
         }

         if (var6 - var8 >= var4) {
            return 1;
         }

         if (var7 != 0) {
            var9 = var7;
            boolean var14 = false;
         } else {
            var9 = var0.charAt(var5++);
         }

         if (var8 != 0) {
            var10 = var8;
            boolean var15 = false;
         } else {
            var10 = var1.charAt(var6++);
         }

         var7 = class210.method4124((char)var9);
         var8 = class210.method4124((char)var10);
         var9 = Varps.standardizeChar((char)var9, var2);
         var10 = Varps.standardizeChar((char)var10, var2);
         if (var9 != var10 && Character.toUpperCase((char)var9) != Character.toUpperCase((char)var10)) {
            var9 = Character.toLowerCase((char)var9);
            var10 = Character.toLowerCase((char)var10);
            if (var9 != var10) {
               return JagexCache.lowercaseChar((char)var9, var2) - JagexCache.lowercaseChar((char)var10, var2);
            }
         }
      }

      var9 = Math.min(var3, var4);

      int var11;
      char var12;
      for(var10 = 0; var10 < var9; ++var10) {
         if (var2 == Language.Language_FR) {
            var5 = var3 - 1 - var10;
            var6 = var4 - 1 - var10;
         } else {
            var6 = var10;
            var5 = var10;
         }

         var11 = var0.charAt(var5);
         var12 = var1.charAt(var6);
         if (var11 != var12 && Character.toUpperCase((char)var11) != Character.toUpperCase(var12)) {
            var11 = Character.toLowerCase((char)var11);
            var12 = Character.toLowerCase(var12);
            if (var12 != var11) {
               return JagexCache.lowercaseChar((char)var11, var2) - JagexCache.lowercaseChar(var12, var2);
            }
         }
      }

      var10 = var3 - var4;
      if (var10 != 0) {
         return var10;
      } else {
         for(var11 = 0; var11 < var9; ++var11) {
            var12 = var0.charAt(var11);
            char var13 = var1.charAt(var11);
            if (var13 != var12) {
               return JagexCache.lowercaseChar(var12, var2) - JagexCache.lowercaseChar(var13, var2);
            }
         }

         return 0;
      }
   }

   @ObfuscatedName("bb")
   @ObfuscatedSignature(
      descriptor = "([BIS)I",
      garbageValue = "-30000"
   )
   public static int method3756(byte[] var0, int var1) {
      int var3 = -1;

      for(int var4 = 0; var4 < var1; ++var4) {
         var3 = var3 >>> 8 ^ Buffer.field5019[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }
}
