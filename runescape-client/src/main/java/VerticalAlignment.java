import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("he")
@Implements("VerticalAlignment")
public enum VerticalAlignment implements Enum {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	field2004(0, 0),
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	@Export("VerticalAlignment_centered")
	VerticalAlignment_centered(1, 1),
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lhe;"
	)
	field2006(2, 2);

	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 371572089
	)
	@Export("value")
	public final int value;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 2107776905
	)
	@Export("id")
	final int id;

	VerticalAlignment(int var3, int var4) {
		this.value = var3;
		this.id = var4;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.id;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "946766288"
	)
	static int method3786(int var0, Script var1, boolean var2) {
		Widget var3 = class380.widgetDefinition.method6348(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class155.Widget_unpackTargetMask(class405.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
