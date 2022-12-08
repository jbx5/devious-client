import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ks")
@Implements("Varps")
public class Varps {
   @ObfuscatedName("h")
   @Export("Varps_masks")
   static int[] Varps_masks = new int[32];
   @ObfuscatedName("e")
   @Export("Varps_temp")
   public static int[] Varps_temp;
   @ObfuscatedName("v")
   @Export("Varps_main")
   public static int[] Varps_main;
   @ObfuscatedName("i")
   public static short[][] field3445;

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         Varps_masks[var1] = var0 - 1;
         var0 += var0;
      }

      Varps_temp = new int[4000];
      Varps_main = new int[4000];
   }

   @ObfuscatedName("x")
   static int method5806(long var0) {
      return (int)(var0 >>> 14 & 3L);
   }
}
