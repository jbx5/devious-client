import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hs")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(II)[I", garbageValue = "-747714761")
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "-2057356400")
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IS)Z", garbageValue = "25521")
	boolean vmethod4498(int var1);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-30")
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}