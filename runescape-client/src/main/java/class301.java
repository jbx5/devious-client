import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("lt")
public final class class301 {
	@ObfuscatedName("ar")
	static final HashMap field3362;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = 1053823081
	)
	static int field3359;

	static {
		field3362 = new HashMap();
		java.util.Calendar.getInstance(method5742("Europe/London"));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;S)Ljava/util/TimeZone;",
		garbageValue = "13393"
	)
	static TimeZone method5742(String var0) {
		synchronized(field3362) {
			TimeZone var2 = (TimeZone)field3362.get(var0);
			if (var2 == null) {
				var2 = TimeZone.getTimeZone(var0);
				field3362.put(var0, var2);
			}

			return var2;
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "-2109434245"
	)
	static int method5746(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.CC_CREATE) {
			Interpreter.Interpreter_intStackSize -= 3;
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var11 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			if (var4 == 0) {
				throw new RuntimeException();
			} else {
				Widget var6 = VarbitComposition.getWidget(var9);
				if (var6.children == null) {
					var6.children = new Widget[var11 + 1];
				}

				if (var6.children.length <= var11) {
					Widget[] var7 = new Widget[var11 + 1];

					for (int var8 = 0; var8 < var6.children.length; ++var8) {
						var7[var8] = var6.children[var8];
					}

					var6.children = var7;
				}

				if (var11 > 0 && var6.children[var11 - 1] == null) {
					throw new RuntimeException("" + (var11 - 1));
				} else {
					Widget var12 = new Widget();
					var12.type = var4;
					var12.parentId = var12.id = var6.id;
					var12.childIndex = var11;
					var12.isIf3 = true;
					if (var4 == 12) {
						var12.method6455();
						var12.method6504().method6207(new class105(var12));
						var12.method6504().method6227(new class106(var12));
					}

					var6.children[var11] = var12;
					if (var2) {
						class36.scriptDotWidget = var12;
					} else {
						class351.scriptActiveWidget = var12;
					}

					class200.invalidateWidget(var6);
					return 1;
				}
			}
		} else {
			Widget var3;
			if (var0 == ScriptOpcodes.CC_DELETE) {
				var3 = var2 ? class36.scriptDotWidget : class351.scriptActiveWidget;
				Widget var10 = VarbitComposition.getWidget(var3.id);
				var10.children[var3.childIndex] = null;
				class200.invalidateWidget(var10);
				return 1;
			} else if (var0 == ScriptOpcodes.CC_DELETEALL) {
				var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				var3.children = null;
				class200.invalidateWidget(var3);
				return 1;
			} else if (var0 != ScriptOpcodes.CC_FIND) {
				if (var0 == ScriptOpcodes.IF_FIND) {
					var3 = VarbitComposition.getWidget(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
					if (var3 != null) {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
						if (var2) {
							class36.scriptDotWidget = var3;
						} else {
							class351.scriptActiveWidget = var3;
						}
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
					}

					return 1;
				} else {
					return 2;
				}
			} else {
				Interpreter.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Widget var5 = MouseRecorder.getWidgetChild(var9, var4);
				if (var5 != null && var4 != -1) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1;
					if (var2) {
						class36.scriptDotWidget = var5;
					} else {
						class351.scriptActiveWidget = var5;
					}
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0;
				}

				return 1;
			}
		}
	}
}
