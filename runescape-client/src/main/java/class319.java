import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mb")
public class class319 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	static AbstractArchive field3303;
	@ObfuscatedName("fm")
	@ObfuscatedSignature(
		descriptor = "Lor;"
	)
	static Archive field3306;
	@ObfuscatedName("gc")
	@ObfuscatedGetter(
		intValue = -882140109
	)
	static int field3304;
	@ObfuscatedName("tr")
	@ObfuscatedGetter(
		intValue = -816529695
	)
	static int field3307;

	@ObfuscatedName("mr")
	@ObfuscatedSignature(
		descriptor = "(Lng;IIB)V",
		garbageValue = "0"
	)
	@Export("alignWidgetPosition")
	static void alignWidgetPosition(Widget var0, int var1, int var2) {
		if (var0.xAlignment == 0) {
			var0.x = var0.rawX;
		} else if (var0.xAlignment == 1) {
			var0.x = var0.rawX + (var1 - var0.width) / 2;
		} else if (var0.xAlignment == 2) {
			var0.x = var1 - var0.width - var0.rawX;
		} else if (var0.xAlignment == 3) {
			var0.x = var0.rawX * var1 >> 14;
		} else if (var0.xAlignment == 4) {
			var0.x = (var0.rawX * var1 >> 14) + (var1 - var0.width) / 2;
		} else {
			var0.x = var1 - var0.width - (var0.rawX * var1 >> 14);
		}

		if (var0.yAlignment == 0) {
			var0.y = var0.rawY;
		} else if (var0.yAlignment == 1) {
			var0.y = var0.rawY + (var2 - var0.height * -1662542495) / 2;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height * -1662542495 - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height * -1662542495) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height * -1662542495 - (var2 * var0.rawY >> 14);
		}

	}
}
