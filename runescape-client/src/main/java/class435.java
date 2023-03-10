import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qr")
public class class435 {
   @ObfuscatedName("an")
   static final int[] field4650 = new int[16384];
   @ObfuscatedName("ao")
   static final int[] field4651 = new int[16384];

   static {
      double var0 = 3.834951969714103E-4;

      for(int var2 = 0; var2 < 16384; ++var2) {
         field4650[var2] = (int)(16384.0 * Math.sin(var0 * (double)var2));
         field4651[var2] = (int)(16384.0 * Math.cos(var0 * (double)var2));
      }

   }

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "-2131868008"
   )
   static void method8008() {
      WorldMapRegion.WorldMapRegion_cachedSprites.clear();
   }
}
