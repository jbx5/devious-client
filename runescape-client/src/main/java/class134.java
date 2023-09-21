import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fl")
public class class134 implements MouseWheel {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1591;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1573;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1574;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1575;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1576;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1577;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1578;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1587;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1580;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1581;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1583;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1589;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1584;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1585;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1586;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1582;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lfl;"
	)
	static final class134 field1579;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 779601295
	)
	final int field1572;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = -1270845997
	)
	final int field1588;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -311137263
	)
	final int field1590;

	static {
		field1591 = new class134(0, 0, (String)null, -1, -1);
		field1573 = new class134(1, 1, (String)null, 0, 2);
		field1574 = new class134(2, 2, (String)null, 1, 2);
		field1575 = new class134(3, 3, (String)null, 2, 2);
		field1576 = new class134(4, 4, (String)null, 3, 1);
		field1577 = new class134(5, 5, (String)null, 4, 1);
		field1578 = new class134(6, 6, (String)null, 5, 1);
		field1587 = new class134(7, 7, (String)null, 6, 3);
		field1580 = new class134(8, 8, (String)null, 7, 3);
		field1581 = new class134(9, 9, (String)null, 8, 3);
		field1583 = new class134(10, 10, (String)null, 0, 7);
		field1589 = new class134(11, 11, (String)null, 1, 7);
		field1584 = new class134(12, 12, (String)null, 2, 7);
		field1585 = new class134(13, 13, (String)null, 3, 7);
		field1586 = new class134(14, 14, (String)null, 4, 7);
		field1582 = new class134(15, 15, (String)null, 5, 7);
		field1579 = new class134(16, 16, (String)null, 0, 5);
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class134(int var1, int var2, String var3, int var4, int var5) {
		this.field1572 = var1;
		this.field1588 = var2;
		this.field1590 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1243971674"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1588;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-232140937"
	)
	int method3067() {
		return this.field1590;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILds;ZI)I",
		garbageValue = "385720754"
	)
	static int method3070(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class416.scriptDotWidget : class306.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class344 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method6614();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7.method6532().method7468();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class339 var4;
				if (var0 == 1617) {
					var4 = var3.method6615();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3591 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method6615();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3592 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method6614();
					Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6353().method7468() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method6615();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4 != null ? var4.field3593 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method6614();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6523() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method6614();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6364() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method6614();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6365() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method6614();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6355() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method6614();
						Interpreter.Interpreter_stringStack[++class180.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6354().method7720() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method6614();
						int var5 = var7 != null ? var7.method6359() : 0;
						int var6 = var7 != null ? var7.method6358() : 0;
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method6614();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6358() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method6614();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6367() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method6614();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6302() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method6614();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6368() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method6614();
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null ? var7.method6372() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method6591();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method374(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method6591();
							Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = var8 != null ? var8.method411((char)Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6614();
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7 != null && var7.method6356() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
