import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fq")
public class class133 implements class124 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -896189893
	)
	static int field1593;

	@ObfuscatedName("aw")
	static double method3042(double var0) {
		return Math.exp(-var0 * var0 / 2.0D) / Math.sqrt(6.283185307179586D);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2100564809"
	)
	static void method3041() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) {
			if (var0.stream1 != null) {
				SecureRandomCallable.pcmStreamMixer.removeSubStream(var0.stream1);
				var0.stream1 = null;
			}

			if (var0.stream2 != null) {
				SecureRandomCallable.pcmStreamMixer.removeSubStream(var0.stream2);
				var0.stream2 = null;
			}
		}

		ObjectSound.objectSounds.clear();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)I",
		garbageValue = "-1372153517"
	)
	static int method3040(Widget var0) {
		if (var0.type != 11) {
			Interpreter.Interpreter_stringStack[Interpreter.Interpreter_stringStackSize - 1] = "";
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var0.method6461(var1);
			return 1;
		}
	}

	@ObfuscatedName("ju")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	static final void method3043() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) {
			if (var0.plane == class36.Client_plane && !var0.isFinished) {
				if (Client.cycle >= var0.cycleStart) {
					var0.advance(Client.graphicsCycle);
					if (var0.isFinished) {
						var0.remove();
					} else {
						UserComparator5.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false);
					}
				}
			} else {
				var0.remove();
			}
		}

	}
}
