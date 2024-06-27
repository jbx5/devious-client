import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mm")
public class class315 {
	@ObfuscatedName("aj")
	@Export("SpriteBuffer_spriteHeights")
	public static int[] SpriteBuffer_spriteHeights;

	@ObfuscatedName("jg")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "696205402"
	)
	static final void method6088(int var0, int var1, int var2, int var3) {
		Client.field625 = 0;
		int var4 = (SoundCache.localPlayer.x >> 7) + class511.topLevelWorldView.baseX;
		int var5 = (SoundCache.localPlayer.y >> 7) + class511.topLevelWorldView.baseY;
		if (var4 >= 3053 && var4 <= 3156 && var5 >= 3056 && var5 <= 3136) {
			Client.field625 = 1;
		}

		if (var4 >= 3072 && var4 <= 3118 && var5 >= 9492 && var5 <= 9535) {
			Client.field625 = 1;
		}

		if (Client.field625 == 1 && var4 >= 3139 && var4 <= 3199 && var5 >= 3008 && var5 <= 3062) {
			Client.field625 = 0;
		}

	}
}
