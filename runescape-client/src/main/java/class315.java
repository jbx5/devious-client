import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mo")
public class class315 {
	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "Lvg;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -560775168
	)
	static int field3463;

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "345211328"
	)
	public static boolean method5940(int var0) {
		return var0 >= WorldMapDecorationType.field3927.id && var0 <= WorldMapDecorationType.field3939.id || var0 == WorldMapDecorationType.field3942.id;
	}
}
