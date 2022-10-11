import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ig")
@Implements("WorldMapSprite")
public final class WorldMapSprite {
   @ObfuscatedName("f")
   @Export("tileColors")
   final int[] tileColors;

   WorldMapSprite() {
      this.tileColors = new int[4096];
   }

   WorldMapSprite(int[] var1) {
      this.tileColors = var1;
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "-22574883"
   )
   @Export("getTileColor")
   final int getTileColor(int var1, int var2) {
      return this.tileColors[var1 + var2 * 64];
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      descriptor = "(III)I",
      garbageValue = "997193825"
   )
   static final int method5154(int var0, int var1) {
      int var2 = var1 * 57 + var0;
      var2 ^= var2 << 13;
      int var3 = var2 * (var2 * var2 * 15731 + 789221) + 1376312589 & Integer.MAX_VALUE;
      return var3 >> 19 & 255;
   }

   @ObfuscatedName("ag")
   @ObfuscatedSignature(
      descriptor = "([BIIB)I",
      garbageValue = "0"
   )
   public static int method5156(byte[] var0, int var1, int var2) {
      int var3 = -1;

      for(int var4 = var1; var4 < var2; ++var4) {
         var3 = var3 >>> 8 ^ Buffer.field4868[(var3 ^ var0[var4]) & 255];
      }

      var3 = ~var3;
      return var3;
   }

   @ObfuscatedName("bx")
   @ObfuscatedSignature(
      descriptor = "(ILbz;ZB)I",
      garbageValue = "-89"
   )
   static int method5155(int var0, Script var1, boolean var2) {
      return 2;
   }
}
