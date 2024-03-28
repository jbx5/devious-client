import java.util.Date;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("dq")
public class class93 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1164;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1152;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1156;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1155;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1168;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1161;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1158;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1159;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1160;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1153;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1162;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1163;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1157;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1165;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1166;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1167;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1154;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class93 field1169;
	@ObfuscatedName("ba")
	static String field1171;
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field1170;

	static {
		field1164 = new class93();
		field1152 = new class93();
		field1156 = new class93();
		field1155 = new class93();
		field1168 = new class93();
		field1161 = new class93();
		field1158 = new class93();
		field1159 = new class93();
		field1160 = new class93();
		field1153 = new class93();
		field1162 = new class93();
		field1163 = new class93();
		field1157 = new class93();
		field1165 = new class93();
		field1166 = new class93();
		field1167 = new class93();
		field1154 = new class93();
		field1169 = new class93();
	}

	class93() {
	}

	@ObfuscatedName("at")
	static int method2381(long var0) {
		return (int)(var0 >>> 14 & 3L);
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZB)I",
		garbageValue = "-31"
	)
	static int method2380(int var0, Script var1, boolean var2) {
		return 2;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-2120069693"
	)
	static int method2382(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				AbstractWorldMapIcon.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3 + UrlRequest.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
					long var14 = ((long)var11 + 11745L) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						AbstractWorldMapIcon.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = HealthBar.method2577(class53.compareStrings(Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1], GraphicsObject.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							HttpRequestTask.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
							var12 = LoginState.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							HttpRequestTask.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
							var12 = LoginState.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							AbstractWorldMapIcon.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = ArchiveDiskAction.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class210.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = UserComparator10.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class384.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							HttpRequestTask.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							StringBuilder var16 = new StringBuilder(var3.length());
							boolean var18 = false;

							for (var6 = 0; var6 < var3.length(); ++var6) {
								char var7 = var3.charAt(var6);
								if (var7 == '<') {
									var18 = true;
								} else if (var7 == '>') {
									var18 = false;
								} else if (!var18) {
									var16.append(var7);
								}
							}

							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							AbstractWorldMapIcon.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							AbstractWorldMapIcon.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 2];
							if (class133.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(class133.localPlayer.appearance.field3685) {
								case 0:
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class133.localPlayer.appearance != null ? class133.localPlayer.appearance.field3685 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					AbstractWorldMapIcon.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[AbstractWorldMapIcon.Interpreter_stringStackSize + 1];
					if (class133.localPlayer.appearance != null && class133.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IIIZI)V",
		garbageValue = "324556399"
	)
	static final void method2383(int var0, int var1, int var2, boolean var3) {
		if (class243.widgetDefinition.loadInterface(var0)) {
			class522.resizeInterface(class243.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
