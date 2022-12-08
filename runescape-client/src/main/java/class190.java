import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
public class class190 extends DualNode {
   @ObfuscatedName("n")
   @ObfuscatedSignature(
      descriptor = "Lkd;"
   )
   @Export("scriptDotWidget")
   static Widget scriptDotWidget;

   static {
      new EvictingDualNodeHashTable(64);
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;IZI)Z",
      garbageValue = "-1246263736"
   )
   static boolean method3772(CharSequence var0, int var1, boolean var2) {
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
                  return false;
               }

               var8 -= 87;
            }

            if (var8 >= var1) {
               return false;
            }

            if (var3) {
               var8 = -var8;
            }

            int var9 = var5 * var1 + var8;
            if (var9 / var1 != var5) {
               return false;
            }

            var5 = var9;
            var4 = true;
         }

         return var4;
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
