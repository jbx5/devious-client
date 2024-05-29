import java.util.Date;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qo")
public class class433 {
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "[Lvl;"
	)
	@Export("title_muteSprite")
	static IndexedSprite[] title_muteSprite;
	@ObfuscatedName("ak")
	public char field4749;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -904289963
	)
	public int field4750;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1903280397
	)
	public int field4751;

	class433() {
		this.field4750 = 0;
		this.field4751 = 0;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "-1592511891"
	)
	static int method8129(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class166.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3 + UserComparator10.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
					long var14 = ((long)var11 + 11745L) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class166.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = PlayerComposition.method6565(WorldMapLabelSize.compareStrings(Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 1], class188.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							class13.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
							var12 = class104.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							class13.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
							var12 = class104.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class166.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = AsyncHttpResponse.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = ScriptEvent.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class323.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class6.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							class13.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class13.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
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

							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class166.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--class13.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class166.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class166.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 2];
							if (class17.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(class17.localPlayer.appearance.field3757) {
								case 0:
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class17.localPlayer.appearance != null ? class17.localPlayer.appearance.field3757 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					class166.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class166.Interpreter_stringStackSize + 1];
					if (class17.localPlayer.appearance != null && class17.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class166.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}
}
