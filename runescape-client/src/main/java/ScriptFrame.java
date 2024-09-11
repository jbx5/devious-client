import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
@Implements("ScriptFrame")
public class ScriptFrame {
	@ObfuscatedName("fo")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field460;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldt;"
	)
	@Export("script")
	Script script;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2038646995
	)
	@Export("pc")
	int pc;
	@ObfuscatedName("ag")
	@Export("intLocals")
	int[] intLocals;
	@ObfuscatedName("am")
	@Export("stringLocals")
	String[] stringLocals;

	ScriptFrame() {
		this.pc = -1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-42"
	)
	static int method1215(int var0, Script var1, boolean var2) {
		if (var0 == 6809) {
			int var3 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			ObjectComposition var4 = class273.getObjectDefinition(var3);
			Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var4 != null ? var4.name : "";
			return 1;
		} else {
			return 2;
		}
	}
}
