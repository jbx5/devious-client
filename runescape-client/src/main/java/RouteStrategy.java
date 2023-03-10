import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
@Implements("RouteStrategy")
public abstract class RouteStrategy {
   @ObfuscatedName("ct")
   @ObfuscatedGetter(
      intValue = 662591573
   )
   static int field2330;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1075309893
   )
   @Export("approxDestinationX")
   public int approxDestinationX;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = 579867739
   )
   @Export("approxDestinationY")
   public int approxDestinationY;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -1252836685
   )
   @Export("approxDestinationSizeX")
   public int approxDestinationSizeX;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -2146683721
   )
   @Export("approxDestinationSizeY")
   public int approxDestinationSizeY;

   protected RouteStrategy() {
   }

   @ObfuscatedName("aj")
   @ObfuscatedSignature(
      descriptor = "(IIILiz;B)Z",
      garbageValue = "1"
   )
   @Export("hasArrived")
   protected abstract boolean hasArrived(int var1, int var2, int var3, CollisionMap var4);

   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "(IIZI)Ljava/lang/String;",
      garbageValue = "-1339770799"
   )
   static String method4142(int var0, int var1, boolean var2) {
      if (var1 >= 2 && var1 <= 36) {
         if (var2 && var0 >= 0) {
            int var3 = 2;

            for(int var4 = var0 / var1; var4 != 0; ++var3) {
               var4 /= var1;
            }

            char[] var5 = new char[var3];
            var5[0] = '+';

            for(int var6 = var3 - 1; var6 > 0; --var6) {
               int var7 = var0;
               var0 /= var1;
               int var8 = var7 - var0 * var1;
               if (var8 >= 10) {
                  var5[var6] = (char)(var8 + 87);
               } else {
                  var5[var6] = (char)(var8 + 48);
               }
            }

            return new String(var5);
         } else {
            return Integer.toString(var0, var1);
         }
      } else {
         throw new IllegalArgumentException("" + var1);
      }
   }
}
