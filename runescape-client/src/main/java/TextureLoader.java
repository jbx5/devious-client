import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lo")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-56"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1375979638"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "995906382"
	)
	boolean vmethod5948(int var1);

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "62"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
