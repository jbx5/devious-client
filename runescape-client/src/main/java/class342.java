import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nd")
public class class342 {
	@ObfuscatedName("gk")
	@ObfuscatedGetter(
		intValue = 988916283
	)
	static int field3862;

	@ObfuscatedName("lo")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1771943161"
	)
	static void method6603(int var0, int var1) {
		int var2 = class59.fontBold12.stringWidth("Choose Option");

		int var3;
		int var4;
		for (var3 = 0; var3 < Client.menuOptionsCount; ++var3) {
			var4 = class59.fontBold12.stringWidth(class181.method3532(var3));
			if (var4 > var2) {
				var2 = var4;
			}
		}

		var2 += 8;
		var3 = Client.menuOptionsCount * 15 + 22;
		var4 = var0 - var2 / 2;
		if (var4 + var2 > class113.canvasWidth) {
			var4 = class113.canvasWidth - var2;
		}

		if (var4 < 0) {
			var4 = 0;
		}

		int var5 = var1;
		if (var1 + var3 > class177.canvasHeight) {
			var5 = class177.canvasHeight - var3;
		}

		if (var5 < 0) {
			var5 = 0;
		}

		class12.menuX = var4;
		class419.menuY = var5;
		class316.menuWidth = var2;
		Occluder.menuHeight = Client.menuOptionsCount * 15 + 22;
	}
}
