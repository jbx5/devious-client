import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ev")
@Implements("UserComparator4")
public class UserComparator4 implements Comparator {
	@ObfuscatedName("aq")
	@Export("reversed")
	final boolean reversed;

	public UserComparator4(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lry;Lry;S)I",
		garbageValue = "-17937"
	)
	@Export("compare_bridged")
	int compare_bridged(Buddy var1, Buddy var2) {
		return this.reversed ? var1.int2 - var2.int2 : var2.int2 - var1.int2;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Buddy)var1, (Buddy)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Lhp;",
		garbageValue = "1460065169"
	)
	@Export("getParamDefinition")
	public static ParamComposition getParamDefinition(int var0) {
		ParamComposition var1 = (ParamComposition)ParamComposition.ParamDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = ParamComposition.ParamDefinition_archive.takeFile(11, var0);
			var1 = new ParamComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			ParamComposition.ParamDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "23"
	)
	static int method2936(int var0, Script var1, boolean var2) {
		Widget var7;
		if (var0 != ScriptOpcodes.CC_CALLONRESIZE && var0 != ScriptOpcodes.IF_CALLONRESIZE) {
			int var4;
			if (var0 == ScriptOpcodes.CC_TRIGGEROP) {
				var7 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
				var4 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
				if (var4 >= 1 && var4 <= 10) {
					class103 var8 = new class103(var4, var7.id, var7.childIndex, var7.itemId);
					Interpreter.field895.add(var8);
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
					class103 var6 = new class103(var5, var3, var4, ArchiveLoader.widgetDefinition.method6431(var3).itemId);
					Interpreter.field895.add(var6);
					return 1;
				} else {
					throw new RuntimeException();
				}
			} else {
				return 2;
			}
		} else if (Interpreter.field896 >= 10) {
			throw new RuntimeException();
		} else {
			if (var0 >= 2000) {
				var7 = ArchiveLoader.widgetDefinition.method6431(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
			} else {
				var7 = var2 ? Interpreter.scriptDotWidget : class141.scriptActiveWidget;
			}

			if (var7.onResize == null) {
				return 0;
			} else {
				ScriptEvent var9 = new ScriptEvent();
				var9.widget = var7;
				var9.args = var7.onResize;
				var9.field1102 = Interpreter.field896 + 1;
				Client.scriptEvents.addFirst(var9);
				return 1;
			}
		}
	}
}
