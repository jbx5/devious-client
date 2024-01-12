import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("mt")
public class class313 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "-833421432"
	)
	public static String method5999(CharSequence var0) {
		return class167.method3532('*', var0.length());
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1557324762"
	)
	static int method5998(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class31.scriptDotWidget : class185.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class344 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method6700();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7.method6442().method7608();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class339 var4;
				if (var0 == 1617) {
					var4 = var3.method6729();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3623 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method6729();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3619 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method6700();
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6564().method7608() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method6729();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 != null ? var4.field3620 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6452() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6476() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6477() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null && var7.method6468() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method6700();
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6467().method7883() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method6700();
						int var5 = var7 != null ? var7.method6531() : 0;
						int var6 = var7 != null ? var7.method6471() : 0;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6471() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6479() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6663() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6480() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method6700();
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null ? var7.method6593() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method6724();
							Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = var8 != null ? var8.method394(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method6724();
							Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6700();
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var7 != null && var7.method6672() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
