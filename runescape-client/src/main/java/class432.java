import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("ph")
public class class432 {
   @ObfuscatedName("k")
   static final int[] field4697 = new int[2048];
   @ObfuscatedName("c")
   static final int[] field4698 = new int[2048];

   static {
      double var0 = 0.0030679615757712823;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field4697[var2] = (int)(65536.0 * Math.sin((double)var2 * var0));
         field4698[var2] = (int)(65536.0 * Math.cos(var0 * (double)var2));
      }

   }
}
