import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("js")
public class class284 {
   @ObfuscatedName("h")
   static int[] field3329;

   static {
      new Object();
      field3329 = new int[33];
      field3329[0] = 0;
      int var0 = 2;

      for(int var1 = 1; var1 < 33; ++var1) {
         field3329[var1] = var0 - 1;
         var0 += var0;
      }

   }
}
