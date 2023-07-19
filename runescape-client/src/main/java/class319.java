import java.util.BitSet;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mx")
public class class319 extends Node {
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 269673261
	)
	int field3519;
	@ObfuscatedName("ay")
	BitSet field3520;

	class319(int var1) {
		this.field3519 = var1;
		this.field3520 = new BitSet(128);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-2041814477"
	)
	public static boolean method6069(int var0) {
		return (var0 >> 20 & 1) != 0;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "1437385247"
	)
	static int method6071(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? class36.scriptDotWidget : class351.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class102 var8 = new class102(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field880.add(var8);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else if (var0 == ScriptOpcodes.IF_TRIGGEROP) {
				Interpreter.Interpreter_intStackSize -= 3;
				int var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				if (var5 >= 1 && var5 <= 10) {
					class102 var6 = new class102(var5, var3, var4, VarbitComposition.getWidget(var3).itemId);
					Interpreter.field880.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field881 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? class36.scriptDotWidget : class351.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1074 = Interpreter.field881 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}

	@ObfuscatedName("mh")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "1"
	)
	static boolean method6070(int var0) {
		for (int var1 = 0; var1 < Client.field752; ++var1) {
			if (Client.field754[var1] == var0) {
				return true;
			}
		}

		return false;
	}
}
