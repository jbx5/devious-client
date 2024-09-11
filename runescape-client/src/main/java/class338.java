import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nt")
public class class338 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lqu;"
	)
	@Export("ItemDefinition_fontPlain11")
	public static Font ItemDefinition_fontPlain11;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1277456597
	)
	int field3680;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lch;"
	)
	class53 field3678;

	@ObfuscatedSignature(
		descriptor = "(ILch;)V"
	)
	class338(int var1, class53 var2) {
		this.field3680 = var1;
		this.field3678 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "125"
	)
	static void method6700() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "-55"
	)
	static int method6702(int var0, Script var1, boolean var2) {
		Widget var3 = TaskHandler.widgetDefinition.method6841(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = FontName.Widget_unpackTargetMask(class310.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class465.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIB)V",
		garbageValue = "-81"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (TaskHandler.widgetDefinition.loadInterface(var0)) {
			class355.updateInterface(TaskHandler.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
