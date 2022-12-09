import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("px")
public class class424 {
   @ObfuscatedName("m")
   static final int[] field4664 = new int[16384];
   @ObfuscatedName("q")
   static final int[] field4665 = new int[16384];

   static {
      double var0 = 3.834951969714103E-4;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field4664[var2] = (int)(16384.0 * Math.sin(var0 * (double)var2));
         field4665[var2] = (int)(16384.0 * Math.cos((double)var2 * var0));
      }

   }
}
