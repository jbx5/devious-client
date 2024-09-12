import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("jn")
@Implements("AABB")
public class AABB {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 1368567893
	)
	@Export("xMid")
	int xMid;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1461851909
	)
	@Export("yMid")
	int yMid;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2145173519
	)
	@Export("zMid")
	int zMid;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 1947043695
	)
	@Export("xMidOffset")
	int xMidOffset;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 247717375
	)
	@Export("yMidOffset")
	int yMidOffset;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 931924417
	)
	@Export("zMidOffset")
	int zMidOffset;

	AABB(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.xMid = var1;
		this.yMid = var2;
		this.zMid = var3;
		this.xMidOffset = var4;
		this.yMidOffset = var5;
		this.zMidOffset = var6;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "-1789708720"
	)
	static int method5140(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class464.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) {
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = FontName.Widget_unpackTargetMask(class310.getWidgetFlags(var3));
			return 1;
		} else if (var0 != ScriptOpcodes.CC_GETOP) {
			if (var0 == ScriptOpcodes.CC_GETOPBASE) {
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
}
