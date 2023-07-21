import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
final class class184 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "1"
	)
	static final void method3581(int var0, int var1) {
		if (var0 < 128) {
			var0 = 128;
		} else if (var0 > 383) {
			var0 = 383;
		}

		if (class19.cameraPitch < var0) {
			class19.cameraPitch = (var0 - class19.cameraPitch) * class157.field1743 / 1000 + class19.cameraPitch + class18.field95;
			if (class19.cameraPitch > var0) {
				class19.cameraPitch = var0;
			}
		} else if (class19.cameraPitch > var0) {
			class19.cameraPitch -= (class19.cameraPitch - var0) * class157.field1743 / 1000 + class18.field95;
			if (class19.cameraPitch < var0) {
				class19.cameraPitch = var0;
			}
		}

		var1 &= 2047;
		int var2 = var1 - class456.cameraYaw;
		if (var2 > 1024) {
			var2 -= 2048;
		} else if (var2 < -1024) {
			var2 += 2048;
		}

		if (var2 > 0) {
			class456.cameraYaw = class456.cameraYaw + class18.field95 + var2 * class157.field1743 / 1000;
			class456.cameraYaw &= 2047;
		} else if (var2 < 0) {
			class456.cameraYaw -= -var2 * class157.field1743 / 1000 + class18.field95;
			class456.cameraYaw &= 2047;
		}

		int var3 = var1 - class456.cameraYaw;
		if (var3 > 1024) {
			var3 -= 2048;
		} else if (var3 < -1024) {
			var3 += 2048;
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) {
			class456.cameraYaw = var1;
		}

	}
}
