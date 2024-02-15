import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ob")
public class class367 {
	static {
		int var0 = 0;
		int var1 = 0;
		class363[] var2 = class272.method5371();

		for (int var3 = 0; var3 < var2.length; ++var3) {
			class363 var4 = var2[var3];
			if (var4.field3965 > var0) {
				var0 = var4.field3965;
			}

			if (var4.field3966 > var1) {
				var1 = var4.field3966;
			}
		}

	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1747506572"
	)
	public static int method7009(int var0) {
		return SoundSystem.method809(ViewportMouse.ViewportMouse_entityTags[var0]);
	}
}
