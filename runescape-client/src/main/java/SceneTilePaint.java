import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("hc")
@Implements("SceneTilePaint")
public final class SceneTilePaint {
   @ObfuscatedName("m")
   static int[] field2764;
   @ObfuscatedName("f")
   @ObfuscatedGetter(
      intValue = 1905065961
   )
   @Export("swColor")
   int swColor;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 395510695
   )
   @Export("seColor")
   int seColor;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1229882029
   )
   @Export("neColor")
   int neColor;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -1388285787
   )
   @Export("nwColor")
   int nwColor;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = -1517279351
   )
   @Export("texture")
   int texture;
   @ObfuscatedName("j")
   @Export("isFlat")
   boolean isFlat = true;
   @ObfuscatedName("i")
   @ObfuscatedGetter(
      intValue = 1002272025
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
}
