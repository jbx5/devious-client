import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("TextureLoader")
public interface TextureLoader {
   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "-1617640500"
   )
   @Export("getTexturePixels")
   int[] getTexturePixels(int var1);

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "56"
   )
   @Export("getAverageTextureRGB")
   int getAverageTextureRGB(int var1);

   @ObfuscatedName("m")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1786884574"
   )
   boolean vmethod4813(int var1);

   @ObfuscatedName("q")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1897971532"
   )
   @Export("isLowDetail")
   boolean isLowDetail(int var1);
}
