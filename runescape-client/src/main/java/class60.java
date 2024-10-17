import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cp")
public class class60 {
	@ObfuscatedName("ap")
	byte[] field411;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1635093337
	)
	int field409;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1830272323
	)
	int field413;

	class60() {
		this.field411 = null;
		this.field409 = 0;
		this.field413 = 0;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "15"
	)
	int method1206(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field413; var1 -= var4) {
			var4 = 8 - this.field413;
			int var5 = (1 << var4) - 1;
			var2 += (this.field411[this.field409] >> this.field413 & var5) << var3;
			this.field413 = 0;
			++this.field409;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field411[this.field409] >> this.field413 & var4) << var3;
			this.field413 += var1;
		}

		return var2;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-257091693"
	)
	int method1196() {
		int var1 = this.field411[this.field409] >> this.field413 & 1;
		++this.field413;
		this.field409 += this.field413 >> 3;
		this.field413 &= 7;
		return var1;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([BII)V",
		garbageValue = "191564857"
	)
	void method1208(byte[] var1, int var2) {
		this.field411 = var1;
		this.field409 = var2;
		this.field413 = 0;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZS)I",
		garbageValue = "-9067"
	)
	static int method1198(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? UserComparator2.scriptDotWidget : HttpRequestTask.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class93.Widget_unpackTargetMask(class171.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
				if (var3.dataText == null) {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3.dataText;
				}

				return 1;
			} else {
				return 2;
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			--var4;
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) {
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3.actions[var4];
			} else {
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = "";
			}

			return 1;
		}
	}
}
