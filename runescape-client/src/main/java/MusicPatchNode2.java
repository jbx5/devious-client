import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ml")
@Implements("MusicPatchNode2")
public class MusicPatchNode2 {
	@ObfuscatedName("aq")
	byte[] field3578;
	@ObfuscatedName("ad")
	byte[] field3574;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 566895777
	)
	int field3568;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 308977211
	)
	int field3572;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 49725013
	)
	int field3570;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 897378551
	)
	int field3571;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1492885785
	)
	int field3567;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -601731333
	)
	int field3573;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 705420839
	)
	int field3569;

	MusicPatchNode2() {
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "386952517"
	)
	static int method6152(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? Interpreter.scriptDotWidget : class30.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class356 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method6991();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7.method6632().method7924();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class350 var4;
				if (var0 == 1617) {
					var4 = var3.method6890();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3752 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method6890();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3751 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method6991();
					Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6675().method7924() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method6890();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var4 != null ? var4.field3750 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method6991();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6643() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method6991();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6644() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method6991();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6645() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method6991();
					Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null && var7.method6635() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method6991();
						Interpreter.Interpreter_stringStack[++class337.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6797().method8195() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method6991();
						int var5 = var7 != null ? var7.method6639() : 0;
						int var6 = var7 != null ? var7.method6779() : 0;
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6779() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6647() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6784() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6648() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method6991();
						Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = var7 != null ? var7.method6830() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method6940();
							Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1] = var8 != null ? var8.method404(Interpreter.Interpreter_intStack[class130.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
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
}
