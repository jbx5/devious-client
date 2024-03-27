import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("fo")
public class class154 extends class144 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1037066445
	)
	public static int field1730;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1835507121
	)
	int field1729;
	@ObfuscatedName("ah")
	String field1728;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class147 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;)V"
	)
	class154(class147 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lur;I)V",
		garbageValue = "1253598633"
	)
	void vmethod3420(Buffer var1) {
		this.field1729 = var1.readInt();
		this.field1728 = var1.readStringCp1252NullTerminated();
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lfp;B)V",
		garbageValue = "-123"
	)
	void vmethod3419(ClanSettings var1) {
		var1.method3258(this.field1729, this.field1728);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIIZII)J",
		garbageValue = "1505272716"
	)
	@Export("calculateTag")
	public static long calculateTag(int var0, int var1, int var2, boolean var3, int var4) {
		long var5 = (long)((var0 & 127) << 0 | (var1 & 127) << 7 | (var2 & 3) << 14) | ((long)var4 & 4294967295L) << 17;
		if (var3) {
			var5 |= 65536L;
		}

		return var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "1841659614"
	)
	static int method3238(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
		if (var0 == ScriptOpcodes.CC_GETSCROLLX) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.scrollX;
			return 1;
		} else if (var0 == ScriptOpcodes.CC_GETSCROLLY) {
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.scrollY;
			return 1;
		} else {
			class347 var7;
			if (var0 == ScriptOpcodes.CC_GETTEXT) {
				if (var3.type == 12) {
					var7 = var3.method6667();
					if (var7 != null) {
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7.method6412().method7539();
						return 1;
					}
				}

				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.text;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLWIDTH) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.scrollWidth;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETSCROLLHEIGHT) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.scrollHeight;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELZOOM) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelZoom;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_X) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelAngleX;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Z) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelAngleZ;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELANGLE_Y) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelAngleY;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETTRANS) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.transparencyTop;
				return 1;
			} else if (var0 == 1610) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.transparencyBot;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETCOLOUR) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.color;
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETFILLCOLOUR) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.color2;
				return 1;
			} else if (var0 == 1613) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal();
				return 1;
			} else if (var0 == ScriptOpcodes.CC_GETMODELTRANSPARENT) {
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0;
				return 1;
			} else {
				class341 var4;
				if (var0 == 1617) {
					var4 = var3.method6699();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4 != null ? var4.field3655 : 0;
				}

				if (var0 == 1618) {
					var4 = var3.method6699();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4 != null ? var4.field3656 : 0;
					return 1;
				} else if (var0 == 1619) {
					var7 = var3.method6667();
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6413().method7539() : "";
					return 1;
				} else if (var0 == 1620) {
					var4 = var3.method6699();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4 != null ? var4.field3657 : 0;
					return 1;
				} else if (var0 == 1621) {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6423() : 0;
					return 1;
				} else if (var0 == 1622) {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6424() : 0;
					return 1;
				} else if (var0 == 1623) {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6425() : 0;
					return 1;
				} else if (var0 == 1624) {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null && var7.method6459() ? 1 : 0;
					return 1;
				} else if (var0 != 1625) {
					if (var0 == 1626) {
						var7 = var3.method6667();
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var7 != null ? var7.method6431().method7763() : "";
						return 1;
					} else if (var0 == 1627) {
						var7 = var3.method6667();
						int var5 = var7 != null ? var7.method6559() : 0;
						int var6 = var7 != null ? var7.method6510() : 0;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Math.min(var5, var6);
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Math.max(var5, var6);
						return 1;
					} else if (var0 == 1628) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6510() : 0;
						return 1;
					} else if (var0 == 1629) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6427() : 0;
						return 1;
					} else if (var0 == 1630) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6574() : 0;
						return 1;
					} else if (var0 == 1631) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6428() : 0;
						return 1;
					} else if (var0 == 1632) {
						var7 = var3.method6667();
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null ? var7.method6429() : 0;
						return 1;
					} else {
						class27 var8;
						if (var0 == 1633) {
							var8 = var3.method6682();
							Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1] = var8 != null ? var8.method364(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else if (var0 == 1634) {
							var8 = var3.method6682();
							Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1] = var8 != null ? var8.method379((char)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1]) : 0;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					var7 = var3.method6667();
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var7 != null && var7.method6416() ? 1 : 0;
					return 1;
				}
			}
		}
	}
}
