import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hr")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
   @ObfuscatedName("tf")
   @ObfuscatedGetter(
      intValue = 94016771
   )
   static int field2696;
   @ObfuscatedName("a")
   @ObfuscatedGetter(
      intValue = 1318717117
   )
   @Export("swColor")
   int swColor;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = -728008907
   )
   @Export("seColor")
   int seColor;
   @ObfuscatedName("c")
   @ObfuscatedGetter(
      intValue = 1966625665
   )
   @Export("neColor")
   int neColor;
   @ObfuscatedName("x")
   @ObfuscatedGetter(
      intValue = 1337809153
   )
   @Export("nwColor")
   int nwColor;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      intValue = 1188236213
   )
   @Export("texture")
   int texture;
   @ObfuscatedName("j")
   @Export("isFlat")
   boolean isFlat = true;
   @ObfuscatedName("y")
   @ObfuscatedGetter(
      intValue = 1702994913
   )
   @Export("rgb")
   int rgb;

   SceneTilePaint(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      this.swColor = var1;
      this.seColor = var2;
      this.neColor = var3;
      this.nwColor = var4;
      this.texture = var5;
      this.rgb = var6;
      this.isFlat = var7;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(B)[Ldn;",
      garbageValue = "35"
   )
   static class123[] method4639() {
      return new class123[]{class123.field1470, class123.field1471, class123.field1474, class123.field1473, class123.field1472};
   }
}
