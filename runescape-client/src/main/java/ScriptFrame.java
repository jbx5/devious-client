import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("ba")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("tp")
	@ObfuscatedGetter(intValue = -2138418185)
	static int field459;

	@ObfuscatedName("tu")
	@ObfuscatedGetter(intValue = 658947165)
	static int field461;

	@ObfuscatedName("di")
	static boolean field462;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Lbc;")
	@Export("script")
	Script script;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 390457225)
	@Export("pc")
	int pc = -1;

	@ObfuscatedName("f")
	@Export("intLocals")
	int[] intLocals;

	@ObfuscatedName("u")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1620928609")
	static final void method1057() {
		LoginScreenAnimation.method2279("You can't add yourself to your own friend list");
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = "(ILbc;ZB)I", garbageValue = "114")
	static int method1056(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.VIEWPORT_SETFOV) {
			TaskHandler.Interpreter_intStackSize -= 2;
			Client.field644 = ((short) (class1.method7(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize])));
			if (Client.field644 <= 0) {
				Client.field644 = 256;
			}
			Client.field695 = ((short) (class1.method7(Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1])));
			if (Client.field695 <= 0) {
				Client.field695 = 256;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_SETZOOM) {
			TaskHandler.Interpreter_intStackSize -= 2;
			Client.zoomHeight = ((short) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]));
			if (Client.zoomHeight <= 0) {
				Client.zoomHeight = 256;
			}
			Client.zoomWidth = ((short) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]));
			if (Client.zoomWidth <= 0) {
				Client.zoomWidth = 320;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_CLAMPFOV) {
			TaskHandler.Interpreter_intStackSize -= 4;
			Client.field677 = ((short) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize]));
			if (Client.field677 <= 0) {
				Client.field677 = 1;
			}
			Client.field756 = ((short) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 1]));
			if (Client.field756 <= 0) {
				Client.field756 = 32767;
			} else if (Client.field756 < Client.field677) {
				Client.field756 = Client.field677;
			}
			Client.field757 = ((short) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 2]));
			if (Client.field757 <= 0) {
				Client.field757 = 1;
			}
			Client.field567 = ((short) (Interpreter.Interpreter_intStack[TaskHandler.Interpreter_intStackSize + 3]));
			if (Client.field567 <= 0) {
				Client.field567 = 32767;
			} else if (Client.field567 < Client.field757) {
				Client.field567 = Client.field757;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETEFFECTIVESIZE) {
			if (Client.viewportWidget != null) {
				class115.setViewportShape(0, 0, Client.viewportWidget.width, Client.viewportWidget.height, false);
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.viewportWidth;
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.viewportHeight;
			} else {
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
				Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = -1;
			}
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETZOOM) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.zoomHeight;
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = Client.zoomWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.VIEWPORT_GETFOV) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapCacheName.method5048(Client.field644);
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = WorldMapCacheName.method5048(Client.field695);
			return 1;
		} else if (var0 == 6220) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6221) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = 0;
			return 1;
		} else if (var0 == 6222) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class352.canvasWidth;
			return 1;
		} else if (var0 == 6223) {
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = class228.canvasHeight;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("lm")
	@ObfuscatedSignature(descriptor = "(Ljava/lang/String;ZB)Ljava/lang/String;", garbageValue = "67")
	static String method1055(String var0, boolean var1) {
		String var2 = (var1) ? "https://" : "http://";
		if (Client.gameBuild == 1) {
			var0 = var0 + "-wtrc";
		} else if (Client.gameBuild == 2) {
			var0 = var0 + "-wtqa";
		} else if (Client.gameBuild == 3) {
			var0 = var0 + "-wtwip";
		} else if (Client.gameBuild == 5) {
			var0 = var0 + "-wti";
		} else if (Client.gameBuild == 4) {
			var0 = "local";
		}
		String var3 = "";
		if (Script.field975 != null) {
			var3 = "/p=" + Script.field975;
		}
		String var4 = "runescape.com";
		return var2 + var0 + "." + var4 + "/l=" + class21.clientLanguage + "/a=" + Decimator.field402 + var3 + "/";
	}
}