import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lr")
public class class292 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("InvDefinition_archive")
	static AbstractArchive InvDefinition_archive;

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "0"
	)
	static int method5753(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? Interpreter.scriptDotWidget : class30.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class105 var8 = new class105(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field860.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				class130.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class105 var6 = new class105(var5, var3, var4, ModeWhere.widgetDefinition.method6519(var3).itemId);
					Interpreter.field860.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field872 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = ModeWhere.widgetDefinition.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : class30.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1090 = Interpreter.field872 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
