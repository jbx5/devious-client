import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lw")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "2146690386"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-799593144"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-293103198"
	)
	boolean vmethod5823(int var1);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "32621"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
