import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jb")
@Implements("TextureLoader")
public interface TextureLoader {
   @ObfuscatedName("av")
   @ObfuscatedSignature(
      descriptor = "(II)[I",
      garbageValue = "1457358156"
   )
   @Export("getTexturePixels")
   int[] getTexturePixels(int var1);

   @ObfuscatedName("as")
   @ObfuscatedSignature(
      descriptor = "(IB)I",
      garbageValue = "0"
   )
   @Export("getAverageTextureRGB")
   int getAverageTextureRGB(int var1);

   @ObfuscatedName("ax")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "1"
   )
   boolean vmethod5030(int var1);

   @ObfuscatedName("ap")
   @ObfuscatedSignature(
      descriptor = "(IB)Z",
      garbageValue = "28"
   )
   @Export("isLowDetail")
   boolean isLowDetail(int var1);
}
