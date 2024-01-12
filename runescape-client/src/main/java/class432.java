import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qf")
public class class432 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Luc;IIIB)V",
		garbageValue = "-1"
	)
	static void method8066(SpritePixels var0, int var1, int var2, int var3) {
		WorldMapRegion.WorldMapRegion_cachedSprites.put(var0, SoundSystem.method870(var1, var2, var3), var0.pixels.length * 4);
	}
}
