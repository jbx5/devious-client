import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cz")
@Implements("MenuAction")
public class MenuAction {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 1513396029
	)
	@Export("param0")
	int param0;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -76660391
	)
	@Export("param1")
	int param1;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 362704459
	)
	@Export("opcode")
	int opcode;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -1921854171
	)
	@Export("identifier")
	int identifier;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 306205453
	)
	@Export("itemId")
	int itemId;
	@ObfuscatedName("ai")
	@Export("action")
	String action;
	@ObfuscatedName("az")
	@Export("target")
	String target;

	MenuAction() {
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "1991089185"
	)
	public static final void method2083(int var0, int var1) {
		ViewportMouse.ViewportMouse_x = var0;
		ViewportMouse.ViewportMouse_y = var1;
		ViewportMouse.ViewportMouse_isInViewport = true;
		ViewportMouse.ViewportMouse_entityCount = 0;
		ViewportMouse.ViewportMouse_false0 = false;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "64"
	)
	static int method2084(int var0, Script var1, boolean var2) {
		Widget var3 = class92.getWidget(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETX) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.x;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETY) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.y;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETWIDTH) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.width;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHEIGHT) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.height;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETHIDE) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.isHidden ? 1 : 0;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETLAYER) {
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.parentId;
			return 1;
		} else {
			return 2;
		}
	}
}
