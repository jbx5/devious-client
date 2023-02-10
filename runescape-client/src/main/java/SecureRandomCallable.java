import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cu")
@Implements("SecureRandomCallable")
public class SecureRandomCallable implements Callable {
   SecureRandomCallable() {
   }

   public Object call() {
      return class143.method3179();
   }

   @ObfuscatedName("f")
   public static final int method2282(double var0, double var2, double var4) {
      double var6 = var4;
      double var8 = var4;
      double var10 = var4;
      if (var2 != 0.0) {
         double var12;
         if (var4 < 0.5) {
            var12 = var4 * (var2 + 1.0);
         } else {
            var12 = var2 + var4 - var2 * var4;
         }

         double var14 = var4 * 2.0 - var12;
         double var16 = var0 + 0.3333333333333333;
         if (var16 > 1.0) {
            --var16;
         }

         double var20 = var0 - 0.3333333333333333;
         if (var20 < 0.0) {
            ++var20;
         }

         if (6.0 * var16 < 1.0) {
            var6 = 6.0 * (var12 - var14) * var16 + var14;
         } else if (2.0 * var16 < 1.0) {
            var6 = var12;
         } else if (var16 * 3.0 < 2.0) {
            var6 = 6.0 * (0.6666666666666666 - var16) * (var12 - var14) + var14;
         } else {
            var6 = var14;
         }

         if (var0 * 6.0 < 1.0) {
            var8 = var0 * 6.0 * (var12 - var14) + var14;
         } else if (2.0 * var0 < 1.0) {
            var8 = var12;
         } else if (var0 * 3.0 < 2.0) {
            var8 = (0.6666666666666666 - var0) * (var12 - var14) * 6.0 + var14;
         } else {
            var8 = var14;
         }

         if (6.0 * var20 < 1.0) {
            var10 = var14 + var20 * 6.0 * (var12 - var14);
         } else if (2.0 * var20 < 1.0) {
            var10 = var12;
         } else if (var20 * 3.0 < 2.0) {
            var10 = 6.0 * (0.6666666666666666 - var20) * (var12 - var14) + var14;
         } else {
            var10 = var14;
         }
      }

      int var22 = (int)(var6 * 256.0);
      int var13 = (int)(256.0 * var8);
      int var23 = (int)(var10 * 256.0);
      int var15 = var23 + (var13 << 8) + (var22 << 16);
      return var15;
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(IZIZI)V",
      garbageValue = "1603025083"
   )
   @Export("sortWorldList")
   static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
      if (class88.World_worlds != null) {
         ClanChannelMember.doWorldSorting(0, class88.World_worlds.length - 1, var0, var1, var2, var3);
      }

   }
}
