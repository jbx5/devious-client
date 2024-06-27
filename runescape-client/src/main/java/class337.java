import java.util.PriorityQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mf")
class class337 implements Callable {
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1132619759
	)
	@Export("Interpreter_stringStackSize")
	static int Interpreter_stringStackSize;
	@ObfuscatedName("ks")
	@ObfuscatedSignature(
		descriptor = "[Lvg;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("ko")
	@ObfuscatedGetter(
		intValue = 1819061313
	)
	@Export("cameraYaw")
	static int cameraYaw;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	final MidiPcmStream this$0;
	// $FF: synthetic field
	final AtomicBoolean val$cancelled;

	@ObfuscatedSignature(
		descriptor = "(Lmc;Ljava/util/concurrent/atomic/AtomicBoolean;)V"
	)
	class337(MidiPcmStream var1, AtomicBoolean var2) {
		this.this$0 = var1;
		this.val$cancelled = var2;
	}

	public Object call() {
		PriorityQueue var1 = this.this$0.priorityQueue;

		while (true) {
			class334 var2 = null;
			synchronized(var1) {
				if (var1.isEmpty() || this.val$cancelled.get()) {
					return null;
				}

				var2 = (class334)var1.remove();
			}

			var2.field3648.method1103();
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "1471667085"
	)
	static int method6384(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class130.Interpreter_intStackSize -= 2;
			Client.field776 = (short)class155.method3324(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize]);
			if (Client.field776 <= 0) {
				Client.field776 = 256;
			}

			Client.field777 = (short)class155.method3324(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1]);
			if (Client.field777 <= 0) {
				Client.field777 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class130.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class130.Interpreter_intStackSize -= 4;
			Client.field751 = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
			if (Client.field751 <= 0) {
				Client.field751 = 1;
			}

			Client.field781 = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
			if (Client.field781 <= 0) {
				Client.field781 = 32767;
			} else if (Client.field781 < Client.field751) {
				Client.field781 = Client.field751;
			}

			Client.field782 = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
			if (Client.field782 <= 0) {
				Client.field782 = 1;
			}

			Client.field783 = (short)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 3];
			if (Client.field783 <= 0) {
				Client.field783 = 32767;
			} else if (Client.field783 < Client.field782) {
				Client.field783 = Client.field782;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				PacketWriter.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class87.method2373(Client.field776);
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class87.method2373(Client.field777);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class74.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = class1.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
