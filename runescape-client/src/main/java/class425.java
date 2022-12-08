import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("py")
public class class425 {
   @ObfuscatedName("b")
   static final int[] field4672 = new int[2048];
   @ObfuscatedName("j")
   static final int[] field4673 = new int[2048];

   static {
      double var0 = 0.0030679615757712823;

      for(int var2 = 0; var2 < 2048; ++var2) {
         field4672[var2] = (int)(65536.0 * Math.sin(var0 * (double)var2));
         field4673[var2] = (int)(65536.0 * Math.cos((double)var2 * var0));
      }

   }
}
