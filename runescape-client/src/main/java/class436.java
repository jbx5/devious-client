import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qz")
public class class436 {
   @ObfuscatedName("as")
   static final int[] field4660 = new int[2048];
   @ObfuscatedName("ay")
   static final int[] field4661 = new int[2048];

   static {
      double var0 = 0.0030679615757712823;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field4660[var2] = (int)(65536.0 * Math.sin(var0 * (double)var2));
         field4661[var2] = (int)(65536.0 * Math.cos((double)var2 * var0));
      }

   }
}
