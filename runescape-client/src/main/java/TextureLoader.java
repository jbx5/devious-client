import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hl")
@Implements("TextureLoader")
public interface TextureLoader {
   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(IB)[I",
      garbageValue = "-47"
   )
   @Export("getTexturePixels")
   int[] getTexturePixels(int var1);

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(II)I",
      garbageValue = "1674485627"
   )
   @Export("getAverageTextureRGB")
   int getAverageTextureRGB(int var1);

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "1297302867"
   )
   boolean vmethod4645(int var1);

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(II)Z",
      garbageValue = "-1896318118"
   )
   @Export("isLowDetail")
   boolean isLowDetail(int var1);
}
