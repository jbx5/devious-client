import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qh")
public class class441 {
   @ObfuscatedName("af")
   static int[] field4730 = new int['耀'];
   @ObfuscatedName("an")
   static int[] field4729;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 1574980473
   )
   public static int field4731;

   static {
      for(int var0 = 0; var0 < 32768; ++var0) {
         int[] var1 = field4730;
         double var4 = (double)(var0 >> 10 & 31) / 31.0;
         double var6 = (double)(var0 >> 5 & 31) / 31.0;
         double var8 = (double)(var0 & 31) / 31.0;
         double var10 = var4;
         if (var6 < var4) {
            var10 = var6;
         }

         if (var8 < var10) {
            var10 = var8;
         }

         double var12 = var4;
         if (var6 > var4) {
            var12 = var6;
         }

         if (var8 > var12) {
            var12 = var8;
         }

         double var14 = 0.0;
         double var16 = 0.0;
         double var18 = (var10 + var12) / 2.0;
         if (var10 != var12) {
            if (var18 < 0.5) {
               var16 = (var12 - var10) / (var10 + var12);
            }

            if (var18 >= 0.5) {
               var16 = (var12 - var10) / (2.0 - var12 - var10);
            }

            if (var4 == var12) {
               var14 = (var6 - var8) / (var12 - var10);
            } else if (var6 == var12) {
               var14 = 2.0 + (var8 - var4) / (var12 - var10);
            } else if (var12 == var8) {
               var14 = (var4 - var6) / (var12 - var10) + 4.0;
            }
         }

         int var20 = (int)(var14 * 256.0 / 6.0);
         var20 &= 255;
         double var21 = var16 * 256.0;
         if (var21 < 0.0) {
            var21 = 0.0;
         } else if (var21 > 255.0) {
            var21 = 255.0;
         }

         if (var18 > 0.7) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.75) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.85) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.95) {
            var21 /= 2.0;
            var21 = Math.floor(var21);
         }

         if (var18 > 0.995) {
            var18 = 0.995;
         }

         int var23 = (int)(var21 / 32.0 + (double)(var20 / 4 * 8));
         int var3 = (var23 << 7) + (int)(var18 * 128.0);
         var1[var0] = var3;
      }

      UserComparator9.method2933();
   }
}
