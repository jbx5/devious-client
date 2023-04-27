import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("qm")
public class class440 {
   @ObfuscatedName("ax")
   static final int[] field4721 = new int[2048];
   @ObfuscatedName("ai")
   static final int[] field4727 = new int[2048];

   static {
      double var0 = 0.0030679615757712823;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field4721[var2] = (int)(65536.0 * Math.sin(var0 * (double)var2));
         field4727[var2] = (int)(65536.0 * Math.cos((double)var2 * var0));
      }

   }
}
