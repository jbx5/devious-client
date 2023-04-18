import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public class class484 {
   @ObfuscatedName("aw")
   @ObfuscatedGetter(
      intValue = 265217111
   )
   static final int field4973 = (int)(Math.pow(2.0, 4.0) - 1.0);
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = -858518957
   )
   static final int field4974 = (int)(Math.pow(2.0, 8.0) - 1.0);

   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(Lnm;III)Ltq;",
      garbageValue = "-1572989467"
   )
   @Export("SpriteBuffer_getSprite")
   public static SpritePixels SpriteBuffer_getSprite(AbstractArchive var0, int var1, int var2) {
      byte[] var4 = var0.takeFile(var1, var2);
      boolean var3;
      if (var4 == null) {
         var3 = false;
      } else {
         class485.SpriteBuffer_decode(var4);
         var3 = true;
      }

      return !var3 ? null : PlayerCompositionColorTextureOverride.method3633();
   }
}
