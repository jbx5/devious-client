import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("eo")
public class class128 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1221342131
	)
	int field1534;
	@ObfuscatedName("al")
	float field1531;
	@ObfuscatedName("aj")
	float field1533;
	@ObfuscatedName("az")
	float field1532;
	@ObfuscatedName("af")
	float field1535;
	@ObfuscatedName("aa")
	float field1536;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Leo;"
	)
	class128 field1537;

	class128() {
		this.field1533 = Float.MAX_VALUE;
		this.field1532 = Float.MAX_VALUE;
		this.field1535 = Float.MAX_VALUE;
		this.field1536 = Float.MAX_VALUE;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lua;II)V",
		garbageValue = "-625271242"
	)
	void method3023(Buffer var1, int var2) {
		this.field1534 = var1.readShort();
		this.field1531 = var1.method9665();
		this.field1533 = var1.method9665();
		this.field1532 = var1.method9665();
		this.field1535 = var1.method9665();
		this.field1536 = var1.method9665();
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "286833018"
	)
	static int method3026(int var0, Script var1, boolean var2) {
		Widget var3 = AsyncRestClient.widgetDefinition.method6536(Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class349 var4;
			if (var0 == 2617) {
				var4 = var3.method6943();
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4 != null ? var4.field3731 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method6943();
				Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4 != null ? var4.field3732 : 0;
				return 1;
			} else {
				class355 var7;
				if (var0 == 2619) {
					var7 = var3.method6942();
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6666().method8000() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method6943();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var4 != null ? var4.field3733 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6676() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6677() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6678() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null && var7.method6793() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method6942();
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6667().method8254() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method6942();
						int var5 = var7 != null ? var7.method6822() : 0;
						int var6 = var7 != null ? var7.method6671() : 0;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6671() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6680() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6679() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6681() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method6942();
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null ? var7.method6798() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method7041();
							Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1] = var8 != null ? var8.method400(Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
							var8 = var3.method7041();
							Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1] = var8 != null ? var8.method386((char)Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6942();
					Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var7 != null && var7.method6731() ? 1 : 0;
					return 1;
				}
			}
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZB)I",
		garbageValue = "65"
	)
	static int method3024(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("gp")
	@ObfuscatedSignature(
		descriptor = "(B)Ltf;",
		garbageValue = "114"
	)
	@Export("getPlatformInfo")
	static PlatformInfo getPlatformInfo() {
		return class350.platformInfo;
	}
}
