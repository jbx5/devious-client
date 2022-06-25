import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.rs.ScriptOpcodes;
import net.runelite.mapping.Export;
@ObfuscatedName("ie")
public class class238 {
	@ObfuscatedName("sz")
	@ObfuscatedSignature(descriptor = "Lar;")
	@Export("pcmPlayer1")
	static PcmPlayer pcmPlayer1;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "Lie;")
	static final class238 field2837;

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "Lie;")
	static final class238 field2836;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 406167623)
	@Export("value")
	final int value;

	static {
		field2837 = new class238(0);
		field2836 = new class238(1);
	}

	class238(int var1) {
		this.value = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "-43")
	static int method5001(int var0, Script var1, boolean var2) {
		Widget var3 = class140.getWidget(Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = WorldMapID.Widget_unpackTargetMask(class124.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.dataText;
				}
				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class446.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++Interpreter.Interpreter_stringStackSize - 1] = "";
			}
			return 1;
		}
	}
}