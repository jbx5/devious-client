import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hr")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = "Lku;")
	@Export("scriptDotWidget")
	static Widget scriptDotWidget;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = -163617677)
	@Export("x")
	int x;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 22061403)
	@Export("y")
	int y;

	@ObfuscatedName("f")
	@ObfuscatedGetter(intValue = 1595377211)
	@Export("z")
	int z;

	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 1156289521)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(descriptor = "(Lhr;)V")
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("jm")
	@ObfuscatedSignature(descriptor = "(Lku;IIB)V", garbageValue = "-5")
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
			var0.y = (var2 - var0.height) / 2 + var0.rawY;
		} else if (var0.yAlignment == 2) {
			var0.y = var2 - var0.height - var0.rawY;
		} else if (var0.yAlignment == 3) {
			var0.y = var2 * var0.rawY >> 14;
		} else if (var0.yAlignment == 4) {
			var0.y = (var2 - var0.height) / 2 + (var2 * var0.rawY >> 14);
		} else {
			var0.y = var2 - var0.height - (var2 * var0.rawY >> 14);
		}
	}
}