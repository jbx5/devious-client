import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "-1101959318"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-2073193625"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "38"
	)
	boolean vmethod5205(int var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1647932846"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
