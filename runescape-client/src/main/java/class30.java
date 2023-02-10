import javax.imageio.ImageIO;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aw")
public class class30 {
   static {
      ImageIO.setUseCache(false);
   }

   @ObfuscatedName("s")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/CharSequence;II)I",
      garbageValue = "1387844569"
   )
   public static int method458(CharSequence var0, int var1) {
      return GrandExchangeOfferUnitPriceComparator.method6737(var0, var1, true);
   }
}
