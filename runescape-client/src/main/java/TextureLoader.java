import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hr")
@Implements("TextureLoader")
public interface TextureLoader {
	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(II)[I", garbageValue = "897870696")
	@Export("getTexturePixels")
	int[] getTexturePixels(int var1);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(II)I", garbageValue = "1656237054")
	@Export("getAverageTextureRGB")
	int getAverageTextureRGB(int var1);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(IB)Z", garbageValue = "-73")
	boolean vmethod4431(int var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Z", garbageValue = "1049958917")
	@Export("isLowDetail")
	boolean isLowDetail(int var1);
}