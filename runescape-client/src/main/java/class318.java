import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lg")
public class class318 {
   static {
      Math.sqrt(8192.0);
   }

   @ObfuscatedName("h")
   public static double method6372(double var0, double var2, double var4) {
      double var8 = (var0 - var2) / var4;
      double var6 = Math.exp(-var8 * var8 / 2.0) / Math.sqrt(6.283185307179586);
      return var6 / var4;
   }

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;IZB)I",
      garbageValue = "30"
   )
   static int method6373(CharSequence var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         boolean var3 = false;
         boolean var4 = false;
         int var5 = 0;
         int var6 = var0.length();

         for(int var7 = 0; var7 < var6; ++var7) {
            int var8 = var0.charAt(var7);
            if (var7 == 0) {
               if (var8 == 45) {
                  var3 = true;
                  continue;
               }

               if (var8 == 43) {
                  continue;
               }
            }

            if (var8 >= 48 && var8 <= 57) {
               var8 -= 48;
            } else if (var8 >= 65 && var8 <= 90) {
               var8 -= 55;
            } else {
               if (var8 < 97 || var8 > 122) {
                  throw new NumberFormatException();
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               throw new NumberFormatException();
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var5 * var1 + var8;
            if (var9 / var1 != var5) {
               throw new NumberFormatException();
            }

            var5 = var9;
            var4 = true;
         }

         if (!var4) {
            throw new NumberFormatException();
         } else {
            return var5;
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
