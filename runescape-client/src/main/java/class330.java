import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mp")
public class class330 {
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = -1788887653
   )
   @Export("SpriteBuffer_spriteWidth")
   public static int SpriteBuffer_spriteWidth;

   @ObfuscatedName("ky")
   @ObfuscatedSignature(
      descriptor = "(IIIIB)V",
      garbageValue = "29"
   )
   static final void method6526(int var0, int var1, int var2, int var3) {
      for(int var4 = 0; var4 < Client.rootWidgetCount; ++var4) {
         if (Client.rootWidgetXs[var4] + Client.rootWidgetWidths[var4] > var0 && Client.rootWidgetXs[var4] < var0 + var2 && Client.rootWidgetHeights[var4] + Client.rootWidgetYs[var4] > var1 && Client.rootWidgetYs[var4] < var3 + var1) {
            Client.field724[var4] = true;
         }
      }

   }
}
