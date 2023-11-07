import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("cw")
public class class60 {
	@ObfuscatedName("ws")
	@ObfuscatedSignature(
		descriptor = "Lsb;"
	)
	@Export("platformInfo")
	static PlatformInfo platformInfo;
	@ObfuscatedName("ab")
	@Export("Interpreter_stringLocals")
	static String[] Interpreter_stringLocals;
	@ObfuscatedName("io")
	@ObfuscatedSignature(
		descriptor = "Lel;"
	)
	@Export("urlRequester")
	static UrlRequester urlRequester;
	@ObfuscatedName("kd")
	@ObfuscatedSignature(
		descriptor = "[Luz;"
	)
	@Export("headIconHintSprites")
	static SpritePixels[] headIconHintSprites;
	@ObfuscatedName("oc")
	@ObfuscatedGetter(
		intValue = 1679036351
	)
	@Export("menuY")
	static int menuY;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 648627473
	)
	static int field421;
	@ObfuscatedName("at")
	byte[] field415;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 443246467
	)
	int field416;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 99305115
	)
	int field417;

	class60() {
		this.field415 = null;
		this.field416 = 0;
		this.field417 = 0;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "1826933410"
	)
	int method1187(int var1) {
		int var2 = 0;

		int var3;
		int var4;
		for (var3 = 0; var1 >= 8 - this.field417; var1 -= var4) {
			var4 = 8 - this.field417;
			int var5 = (1 << var4) - 1;
			var2 += (this.field415[this.field416] >> this.field417 & var5) << var3;
			this.field417 = 0;
			++this.field416;
			var3 += var4;
		}

		if (var1 > 0) {
			var4 = (1 << var1) - 1;
			var2 += (this.field415[this.field416] >> this.field417 & var4) << var3;
			this.field417 += var1;
		}

		return var2;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "100"
	)
	int method1188() {
		int var1 = this.field415[this.field416] >> this.field417 & 1;
		++this.field417;
		this.field416 += this.field417 >> 3;
		this.field417 &= 7;
		return var1;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BIB)V",
		garbageValue = "-31"
	)
	void method1189(byte[] var1, int var2) {
		this.field415 = var1;
		this.field416 = var2;
		this.field417 = 0;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "3"
	)
	static int method1190(int var0, Script var1, boolean var2) {
		Widget var3 = HealthBarDefinition.widgetDefinition.method6285(Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) {
			Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var3.text;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.scrollWidth;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.scrollHeight;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelZoom;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelAngleX;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelAngleZ;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelAngleY;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.transparencyTop;
			return 1;
		} else if (var0 == 2610) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.transparencyBot;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.color;
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.color2;
			return 1;
		} else if (var0 == 2613) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
			return 1;
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) {
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
			return 1;
		} else {
			class336 var4;
			if (var0 == 2617) {
				var4 = var3.method6724();
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4 != null ? var4.field3580 : 0;
			}

			if (var0 == 2618) {
				var4 = var3.method6724();
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4 != null ? var4.field3578 : 0;
				return 1;
			} else {
				class341 var7;
				if (var0 == 2619) {
					var7 = var3.method6688();
					Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6644().method7523() : "";
					return 1;
				} else if (var0 == 2620) {
					var4 = var3.method6724();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4 != null ? var4.field3579 : 0;
					return 1;
				} else if (var0 == 2621) {
					var7 = var3.method6688();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6420() : 0;
					return 1;
				} else if (var0 == 2622) {
					var7 = var3.method6688();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6628() : 0;
					return 1;
				} else if (var0 == 2623) {
					var7 = var3.method6688();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6630() : 0;
					return 1;
				} else if (var0 == 2624) {
					var7 = var3.method6688();
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null && var7.method6640() ? 1 : 0;
					return 1;
				} else if (var0 != 2625) {
					if (var0 == 2626) {
						var7 = var3.method6688();
						Interpreter.Interpreter_stringStack[++class127.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6609().method7775() : "";
						return 1;
					} else if (var0 == 2627) {
						var7 = var3.method6688();
						int var5 = var7 != null ? var7.method6416() : 0;
						int var6 = var7 != null ? var7.method6415() : 0;
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 2628) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6415() : 0;
						return 1;
					} else if (var0 == 2629) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6424() : 0;
						return 1;
					} else if (var0 == 2630) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6423() : 0;
						return 1;
					} else if (var0 == 2631) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6425() : 0;
						return 1;
					} else if (var0 == 2632) {
						var7 = var3.method6688();
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var7 != null ? var7.method6550() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 2633) {
							var8 = var3.method6690();
							Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1] = var8 != null ? var8.method407(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 2634) {
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

	@ObfuscatedName("kw")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "-128"
	)
	static final boolean method1186() {
		return Client.isMenuOpen;
	}
}
