import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hw")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)[I",
		garbageValue = "1752527334"
	)
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1868916204"
	)
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "805664548"
	)
	boolean vmethod4479(int var1);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2033952891"
	)
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}
