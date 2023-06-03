import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lg")
public class class302 {
   @ObfuscatedName("at")
   static int[] field3370;

   static {
      new Object();
      field3370 = new int[33];
      field3370[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field3370[var1] = var0 - 1;
         var0 += var0;
      }

   }
}
