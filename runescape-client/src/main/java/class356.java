import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("mc")
public class class356 {
	@ObfuscatedName("u")
	@Export("Tiles_underlays")
	static byte[][][] Tiles_underlays;

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "Lqj;")
	@Export("rightTitleSprite")
	static SpritePixels rightTitleSprite;

	@ObfuscatedName("jo")
	@ObfuscatedSignature(descriptor = "(Lku;IIZI)V", garbageValue = "-1619800354")
	@Export("alignWidgetSize")
	static void alignWidgetSize(Widget var0, int var1, int var2, boolean var3) {
		int var4 = var0.width;
		int var5 = var0.height;
		if (var0.widthAlignment == 0) {
			var0.width = var0.rawWidth;
		} else if (var0.widthAlignment == 1) {
			var0.width = var1 - var0.rawWidth;
		} else if (var0.widthAlignment == 2) {
			var0.width = var0.rawWidth * var1 >> 14;
		}
		if (var0.heightAlignment == 0) {
			var0.height = var0.rawHeight;
		} else if (var0.heightAlignment == 1) {
			var0.height = var2 - var0.rawHeight;
		} else if (var0.heightAlignment == 2) {
			var0.height = var2 * var0.rawHeight >> 14;
		}
		if (var0.widthAlignment == 4) {
			var0.width = var0.field3382 * var0.height / var0.field3383;
		}
		if (var0.heightAlignment == 4) {
			var0.height = var0.field3383 * var0.width / var0.field3382;
		}
		if (var0.contentType == 1337) {
			Client.viewportWidget = var0;
		}
		if (var3 && var0.onResize != null && (var4 != var0.width || var5 != var0.height)) {
			ScriptEvent var6 = new ScriptEvent();
			var6.widget = var0;
			var6.args = var0.onResize;
			Client.scriptEvents.addFirst(var6);
		}
	}
}