import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ro")
public class class455 {
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1298032495"
	)
	static int method8693(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			class320.Interpreter_intStackSize -= 2;
			Client.field785 = (short)class190.method3944(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize]);
			if (Client.field785 <= 0) {
				Client.field785 = 256;
			}

			Client.field786 = (short)class190.method3944(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1]);
			if (Client.field786 <= 0) {
				Client.field786 = 256;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			class320.Interpreter_intStackSize -= 2;
			Client.zoomHeight = (short)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}

			Client.zoomWidth = (short)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			class320.Interpreter_intStackSize -= 4;
			Client.field727 = (short)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			if (Client.field727 <= 0) {
				Client.field727 = 1;
			}

			Client.field790 = (short)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			if (Client.field790 <= 0) {
				Client.field790 = 32767;
			} else if (Client.field790 < Client.field727) {
				Client.field790 = Client.field727;
			}

			Client.field791 = (short)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
			if (Client.field791 <= 0) {
				Client.field791 = 1;
			}

			Client.field792 = (short)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
			if (Client.field792 <= 0) {
				Client.field792 = 32767;
			} else if (Client.field792 < Client.field791) {
				Client.field792 = Client.field791;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class191.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = -1;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Tiles.method2458(Client.field785);
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Tiles.method2458(Client.field786);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class154.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = UrlRequester.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}
}
