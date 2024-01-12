import java.net.URL;
import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ee")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -752777603
	)
	static int field1434;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1873857457
	)
	static int field1435;
	@ObfuscatedName("uo")
	@ObfuscatedSignature(
		descriptor = "Lcp;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("am")
	final URL field1440;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 983679983
	)
	volatile int field1436;
	@ObfuscatedName("aq")
	@Export("response0")
	volatile byte[] response0;

	static {
		field1434 = -1;
		field1435 = -2;
	}

	UrlRequest(URL var1) {
		this.field1436 = field1434;
		this.field1440 = var1;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "66"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.field1436 != field1434;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)[B",
		garbageValue = "375506917"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "16"
	)
	public String method2920() {
		return this.field1440.toString();
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([BIII)Ljava/lang/String;",
		garbageValue = "1230611922"
	)
	@Export("decodeStringCp1252")
	public static String decodeStringCp1252(byte[] var0, int var1, int var2) {
		char[] var3 = new char[var2];
		int var4 = 0;

		for (int var5 = 0; var5 < var2; ++var5) {
			int var6 = var0[var5 + var1] & 255;
			if (var6 != 0) {
				if (var6 >= 128 && var6 < 160) {
					char var7 = class400.cp1252AsciiExtension[var6 - 128];
					if (var7 == 0) {
						var7 = '?';
					}

					var6 = var7;
				}

				var3[var4++] = (char)var6;
			}
		}

		return new String(var3, 0, var4);
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "1029576904"
	)
	static int method2929(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class211.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3 + GrandExchangeOfferAgeComparator.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
					long var14 = 86400000L * (11745L + (long)var11);
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class211.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class17.method271(ObjectComposition.compareStrings(Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1], class92.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							UserComparator6.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
							var12 = HitSplatDefinition.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							UserComparator6.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
							var12 = HitSplatDefinition.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class211.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = WorldMapData_1.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = WorldMapIcon_0.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = PlayerType.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = ScriptFrame.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							UserComparator6.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
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

							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class211.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class211.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 2];
							if (KeyHandler.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(KeyHandler.localPlayer.appearance.field3639) {
								case 0:
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else {
							return 2;
						}
					}
				} else {
					class211.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class211.Interpreter_stringStackSize + 1];
					if (KeyHandler.localPlayer.appearance != null && KeyHandler.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class211.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}

	@ObfuscatedName("ps")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "50"
	)
	@Export("updateLoginState")
	static void updateLoginState(int var0) {
		if (var0 != Client.loginState) {
			Client.loginState = var0;
		}
	}
}
