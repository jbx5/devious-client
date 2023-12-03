import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pp")
public class class396 {
	@ObfuscatedName("at")
	@Export("cp1252AsciiExtension")
	static final char[] cp1252AsciiExtension;
	@ObfuscatedName("al")
	@Export("SpriteBuffer_pixels")
	public static byte[][] SpriteBuffer_pixels;
	@ObfuscatedName("rs")
	@ObfuscatedSignature(
		descriptor = "Lis;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;

	static {
		cp1252AsciiExtension = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
	}

	@ObfuscatedName("mw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1031282913"
	)
	static void method7403() {
		for (InterfaceParent var0 = (InterfaceParent)Client.interfaceParents.first(); var0 != null; var0 = (InterfaceParent)Client.interfaceParents.next()) {
			int var1 = var0.group;
			if (HealthBarDefinition.widgetDefinition.loadInterface(var1)) {
				boolean var2 = true;
				Widget[] var3 = HealthBarDefinition.widgetDefinition.Widget_interfaceComponents[var1];

				int var4;
				for (var4 = 0; var4 < var3.length; ++var4) {
					if (var3[var4] != null) {
						var2 = var3[var4].isIf3;
						break;
					}
				}

				if (!var2) {
					var4 = (int)var0.key;
					Widget var5 = HealthBarDefinition.widgetDefinition.method6285(var4);
					if (var5 != null) {
						class159.invalidateWidget(var5);
					}
				}
			}
		}

	}
}
