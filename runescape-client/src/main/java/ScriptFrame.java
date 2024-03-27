import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cc")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("df")
	static boolean field460;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1861957827
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("af")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("at")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "41"
	)
	static int method1147(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class103 var8 = new class103(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field867.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				HttpRequestTask.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class103 var6 = new class103(var5, var3, var4, class243.widgetDefinition.method6281(var3).itemId);
					Interpreter.field867.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field875 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1087 = Interpreter.field875 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
