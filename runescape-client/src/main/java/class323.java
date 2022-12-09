import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lh")
public class class323 {
   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(Lqx;I)I",
      garbageValue = "-853854318"
   )
   static int method6389(PacketBuffer var0) {
      int var1 = var0.readBits(2);
      int var2;
      if (var1 == 0) {
         var2 = 0;
      } else if (var1 == 1) {
         var2 = var0.readBits(5);
      } else if (var1 == 2) {
         var2 = var0.readBits(8);
      } else {
         var2 = var0.readBits(11);
      }

      return var2;
   }
}
