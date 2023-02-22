import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("li")
@Implements("Varps")
public class Varps {
   @ObfuscatedName("aj")
   @Export("Varps_masks")
   static int[] Varps_masks = new int[32];
   @ObfuscatedName("al")
   @Export("Varps_temp")
   public static int[] Varps_temp;
   @ObfuscatedName("ac")
   @Export("Varps_main")
   public static int[] Varps_main;
   @ObfuscatedName("bd")
   @Export("hasFocus")
   protected static boolean hasFocus;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         Varps_masks[var1] = var0 - 1;
         var0 += var0;
      }

      Varps_temp = new int[4000];
      Varps_main = new int[4000];
   }
}
