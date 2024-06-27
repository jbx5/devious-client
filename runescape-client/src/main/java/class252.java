import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
public class class252 {
	@ObfuscatedName("we")
	@ObfuscatedSignature(
		descriptor = "Loj;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;

	@ObfuscatedName("ip")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "10"
	)
	static final void method4911(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (Language.cameraPitch < var0) {
			Language.cameraPitch = (var0 - Language.cameraPitch) * class104.field1354 / 1000 + Language.cameraPitch + class133.field1560;
			if (Language.cameraPitch > var0) {
				Language.cameraPitch = var0;
			}
		} else if (Language.cameraPitch > var0) {
			Language.cameraPitch -= (Language.cameraPitch - var0) * class104.field1354 / 1000 + class133.field1560;
			if (Language.cameraPitch < var0) {
				Language.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - class337.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class337.cameraYaw = class337.cameraYaw + class133.field1560 + var2 * class104.field1354 / 1000;
			class337.cameraYaw &= 2047;
		} else if (var2 < 0) {
			class337.cameraYaw -= class133.field1560 + -var2 * class104.field1354 / 1000;
			class337.cameraYaw &= 2047;
		}

		int var3 = var1 - class337.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class337.cameraYaw = var1;
		}

	}
}
