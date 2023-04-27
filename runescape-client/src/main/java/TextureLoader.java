import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jq")
@Implements("TextureLoader")
public interface TextureLoader {
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "-1596513386"
   )
   @Export("getTexturePixels")
   int[] getTexturePixels(int var1);

   @ObfuscatedName("ac")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "-570572153"
   )
   @Export("getAverageTextureRGB")
   int getAverageTextureRGB(int var1);

   @ObfuscatedName("au")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "-101"
   )
   boolean vmethod5013(int var1);

   @ObfuscatedName("ab")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-407888071"
   )
   @Export("isLowDetail")
   boolean isLowDetail(int var1);
}
