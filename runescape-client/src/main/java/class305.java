

import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ki")
public class class305 {
	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-2007325270")

	static int method5787(int var0, Script var1, boolean var2) {
		int var3 = -1;
		Widget var4;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			var4 = HorizontalAlignment.getWidget(var3);
		} else {
			var4 = (var2) ? class432.scriptDotWidget : class341.scriptActiveWidget;
		}

		if (var0 == ScriptOpcodes.CC_SETPOSITION) {
			class295.Interpreter_intStackSize -= 4;
			var4.rawX = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			var4.rawY = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			var4.xAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
			var4.yAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3];
			class290.invalidateWidget(var4);
			UserComparator10.client.alignWidget(var4);
			if ((var3 != (-1)) && (var4.type == 0)) {
				GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETSIZE) {
			class295.Interpreter_intStackSize -= 4;
			var4.rawWidth = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize];
			var4.rawHeight = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 1];
			var4.widthAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 2];
			var4.heightAlignment = Interpreter.Interpreter_intStack[class295.Interpreter_intStackSize + 3];
			class290.invalidateWidget(var4);
			UserComparator10.client.alignWidget(var4);
			if ((var3 != (-1)) && (var4.type == 0)) {
				GrandExchangeEvents.revalidateWidgetScroll(EnumComposition.Widget_interfaceComponents[var3 >> 16], var4, false);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETHIDE) {
			boolean var5 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
			if (var5 != var4.isHidden) {
				var4.isHidden = var5;
				class290.invalidateWidget(var4);
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOCLICKTHROUGH) {
			var4.noClickThrough = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_SETNOSCROLLTHROUGH) {
			var4.noScrollThrough = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize] == 1;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = 
	"(ILbo;ZI)I", garbageValue = 
	"-177083421")

	static int method5786(int var0, Script var1, boolean var2) {
		Widget var3 = HorizontalAlignment.getWidget(Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[(++class295.Interpreter_intStackSize) - 1] = WorldMapSection2.Widget_unpackTargetMask(WorldMapSection2.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.IF_GETOP) {
			if (var0 == ScriptOpcodes.IF_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class295.Interpreter_intStackSize];
			--var4;
			if (((var3.actions != null) && (var4 < var3.actions.length)) && (var3.actions[var4] != null)) {
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[(++ChatChannel.Interpreter_stringStackSize) - 1] = "";
			}

			return 1;
		}
	}
}