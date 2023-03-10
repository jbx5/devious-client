import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jp")
@Implements("TextureLoader")
public interface TextureLoader {
   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "599010973"
   )
   @Export("getTexturePixels")
   int[] getTexturePixels(int var1);

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(IS)I",
      garbageValue = "-1822"
   )
   @Export("getAverageTextureRGB")
   int getAverageTextureRGB(int var1);

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "2046582382"
   )
   boolean vmethod4757(int var1);

   @ObfuscatedName("ao")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1479518028"
   )
   @Export("isLowDetail")
   boolean isLowDetail(int var1);
}
