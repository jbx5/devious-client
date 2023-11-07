import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("bj")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 612606403
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -2014052025
	)
	@Export("size")
	int size;
	@ObfuscatedName("ar")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("ao")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("ab")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("au")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("aa")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("ac")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "1"
	)
	static int method710(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : HealthBar.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class341 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method6688();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7.method6616().method7523();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class336 var4;
				if (var0 == 1617) {
					var4 = var3.method6724();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4 != null ? var4.field3580 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method6724();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4 != null ? var4.field3578 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method6688();
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6644().method7523() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method6724();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4 != null ? var4.field3579 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method6688();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6420() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method6688();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6628() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method6688();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6630() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method6688();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null && var7.method6640() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method6688();
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6609().method7775() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method6688();
						int var5 = var7 != null ? var7.method6416() : 0;
						int var6 = var7 != null ? var7.method6415() : 0;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6415() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6424() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6423() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6425() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6550() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method6690();
							Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1] = var8 != null ? var8.method407(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method6690();
							Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1] = var8 != null ? var8.method414((char)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6688();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null && var7.method6409() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("lz")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "674487818"
	)
	static String method711(int var0) {
		if (var0 < 0) {
			return "";
		} else {
			return Client.menuTargets[var0].length() > 0 ? Client.menuActions[var0] + " " + Client.menuTargets[var0] : Client.menuActions[var0];
		}
	}
}
