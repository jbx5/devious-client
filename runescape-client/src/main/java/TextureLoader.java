import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kn")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)[I",
		garbageValue = "-22"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-75"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "33"
	)
	boolean vmethod5599(int var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "23"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
