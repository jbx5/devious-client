import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qo")
public class class439 {
   @ObfuscatedName("au")
   static final int[] field4718 = new int[16384];
   @ObfuscatedName("ab")
   static final int[] field4719 = new int[16384];
   @ObfuscatedName("aq")
   @ObfuscatedSignature(
      descriptor = "Ltc;"
   )
   static IndexedSprite field4717;

   static {
      double var0 = 3.834951969714103E-4;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field4718[var2] = (int)(16384.0 * Math.sin(var0 * (double)var2));
         field4719[var2] = (int)(16384.0 * Math.cos(var0 * (double)var2));
      }

   }
}
