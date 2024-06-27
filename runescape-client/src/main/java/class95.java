import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dc")
public class class95 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "23"
	)
	static int method2466(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class30.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETINVOBJECT) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.itemId;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETINVCOUNT) {
			if (var3.itemId != -1) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.itemQuantity;
			} else {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = 0;
			}

			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETID) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.childIndex;
			return 1;
		} else if (var0 == 1707) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.method6949() ? 1 : 0;
			return 1;
		} else if (var0 == 1708) {
			return class324.method6115(var3);
		} else {
			return var0 == 1709 ? AbstractByteArrayCopier.method7026(var3) : 2;
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZB)I",
		garbageValue = "0"
	)
	static int method2465(int var0, Script var1, boolean var2) {
		Widget var3 = ModeWhere.widgetDefinition.method6519(Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class350 var4;
			if (var0 == 2617) {
				var4 = var3.method6890();
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3752 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method6890();
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3751 : 0;
				return 1;
			} else {
				class356 var7;
				if (var0 == 2619) {
					var7 = var3.method6991();
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6675().method7924() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method6890();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3750 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method6991();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6643() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method6991();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6644() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method6991();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6645() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method6991();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null && var7.method6635() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method6991();
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6797().method8195() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method6991();
						int var5 = var7 != null ? var7.method6639() : 0;
						int var6 = var7 != null ? var7.method6779() : 0;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6779() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6647() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6784() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6648() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6830() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method6940();
							Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = var8 != null ? var8.method404(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method6940();
							Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = var8 != null ? var8.method395((char)Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6991();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null && var7.method6636() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(Lnx;III)V",
		garbageValue = "1105580112"
	)
	public static void method2467(Widget var0, int var1, int var2) {
		var0.field3838.bodyColors[var1] = var2;
		var0.field3838.method6538();
	}
}
