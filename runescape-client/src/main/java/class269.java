import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Export;
@ObfuscatedName("jx")
public final class class269 {
	@ObfuscatedName("s")
	@ObfuscatedGetter(longValue = 2046915735369799591L)
	static long field3178;

	@ObfuscatedName("h")
	@ObfuscatedGetter(longValue = 30154383254694639L)
	static long field3180;

	@ObfuscatedName("jy")
	@ObfuscatedGetter(intValue = -675391155)
	@Export("cameraZ")
	static int cameraZ;

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1899336284")
	public static void method5150() {
		ItemComposition.ItemDefinition_cachedSprites.clear();
	}
}