import java.util.concurrent.locks.ReentrantLock;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bi")
public class class47 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lcd;"
	)
	VorbisSample field309;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lbt;"
	)
	RawSound field303;
	@ObfuscatedName("ak")
	ReentrantLock field304;

	@ObfuscatedSignature(
		descriptor = "(Lcd;Lbt;)V"
	)
	class47(VorbisSample var1, RawSound var2) {
		this.field309 = var1;
		this.field303 = var2;
		this.field304 = new ReentrantLock();
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZB)I",
		garbageValue = "43"
	)
	static int method896(int var0, Script var1, boolean var2) {
		Widget var3 = class416.widgetDefinition.method6911(Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class353 var4;
			if (var0 == 2617) {
				var4 = var3.method7325();
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4 != null ? var4.field3794 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method7325();
				Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4 != null ? var4.field3793 : 0;
				return 1;
			} else {
				class359 var7;
				if (var0 == 2619) {
					var7 = var3.method7304();
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7111().method8415() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method7325();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var4 != null ? var4.field3795 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7069() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7167() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7070() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null && var7.method7060() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method7304();
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var7 != null ? var7.method7054().method8665() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method7304();
						int var5 = var7 != null ? var7.method7064() : 0;
						int var6 = var7 != null ? var7.method7063() : 0;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7063() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7072() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7071() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7077() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method7304();
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null ? var7.method7170() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method7326();
							Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1] = var8 != null ? var8.method395(Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7326();
							Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1] = var8 != null ? var8.method433((char)Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method7304();
					Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var7 != null && var7.method7061() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
