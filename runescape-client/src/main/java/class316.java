import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mf")
public class class316 {
	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "-71"
	)
	static final void method6165(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (Actor.cameraPitch < var0) {
			Actor.cameraPitch = (var0 - Actor.cameraPitch) * GameObject.field3031 / 1000 + Actor.cameraPitch + Varcs.field1450;
			if (Actor.cameraPitch > var0) {
				Actor.cameraPitch = var0;
			}
		} else if (Actor.cameraPitch > var0) {
			Actor.cameraPitch -= (Actor.cameraPitch - var0) * GameObject.field3031 / 1000 + Varcs.field1450;
			if (Actor.cameraPitch < var0) {
				Actor.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - class206.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class206.cameraYaw = class206.cameraYaw + Varcs.field1450 + var2 * GameObject.field3031 / 1000;
			class206.cameraYaw &= 2047;
		} else if (var2 < 0) {
			class206.cameraYaw -= -var2 * GameObject.field3031 / 1000 + Varcs.field1450;
			class206.cameraYaw &= 2047;
		}

		int var3 = var1 - class206.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class206.cameraYaw = var1;
		}

	}
}
