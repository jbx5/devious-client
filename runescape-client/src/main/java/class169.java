import java.util.Date;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("gx")
public class class169 extends class150 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1705241893
	)
	int field1834;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfz;"
	)
	final class153 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfz;)V"
	)
	class169(class153 var1) {
		this.this$0 = var1;
		this.field1834 = -1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "-1813719027"
	)
	void vmethod3822(Buffer var1) {
		this.field1834 = var1.readUnsignedShort();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lgy;I)V",
		garbageValue = "-2079483058"
	)
	void vmethod3821(ClanSettings var1) {
		var1.method3696(this.field1834);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "10"
	)
	public static int method3785(int var0, int var1, int var2) {
		int var3 = MenuAction.method2336(var2 - var1 + 1);
		var3 <<= var1;
		return var0 & ~var3;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(ILda;ZI)I",
		garbageValue = "-566430210"
	)
	static int method3784(int var0, Script var1, boolean var2) {
		String var3;
		int var10;
		if (var0 == ScriptOpcodes.APPEND_NUM) {
			var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
			var10 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
			Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3 + var10;
			return 1;
		} else {
			String var4;
			if (var0 == ScriptOpcodes.APPEND) {
				class208.Interpreter_stringStackSize -= 2;
				var3 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize];
				var4 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 1];
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3 + var4;
				return 1;
			} else if (var0 == ScriptOpcodes.APPEND_SIGNNUM) {
				var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
				var10 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3 + Messages.intToString(var10, true);
				return 1;
			} else if (var0 == ScriptOpcodes.LOWERCASE) {
				var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
				Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3.toLowerCase();
				return 1;
			} else {
				int var6;
				int var11;
				if (var0 == ScriptOpcodes.FROMDATE) {
					var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
					long var14 = ((long)var11 + 11745L) * 86400000L;
					Interpreter.Interpreter_calendar.setTime(new Date(var14));
					var6 = Interpreter.Interpreter_calendar.get(5);
					int var17 = Interpreter.Interpreter_calendar.get(2);
					int var8 = Interpreter.Interpreter_calendar.get(1);
					Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var6 + "-" + Interpreter.Interpreter_MONTHS[var17] + "-" + var8;
					return 1;
				} else if (var0 != ScriptOpcodes.TEXT_GENDER) {
					if (var0 == ScriptOpcodes.TOSTRING) {
						var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = Integer.toString(var11);
						return 1;
					} else if (var0 == ScriptOpcodes.COMPARE) {
						class208.Interpreter_stringStackSize -= 2;
						Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = NpcOverrides.method3989(BoundaryObject.compareStrings(Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize], Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 1], WorldMapCacheName.clientLanguage));
						return 1;
					} else {
						int var9;
						byte[] var12;
						Font var13;
						if (var0 == ScriptOpcodes.PARAHEIGHT) {
							var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							class96.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
							var12 = Login.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var13.lineCount(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.PARAWIDTH) {
							var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							class96.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
							var12 = Login.archive13.takeFile(var9, 0);
							var13 = new Font(var12);
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var13.lineWidth(var3, var10);
							return 1;
						} else if (var0 == ScriptOpcodes.TEXT_SWITCH) {
							class208.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 1];
							if (Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize] == 1) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3;
							} else {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.ESCAPE) {
							var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = AbstractFont.escapeBrackets(var3);
							return 1;
						} else if (var0 == ScriptOpcodes.APPEND_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3 + (char)var10;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISPRINTABLE) {
							var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = UserComparator8.isCharPrintable((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHANUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = GrandExchangeEvent.isAlphaNumeric((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISALPHA) {
							var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = class288.isCharAlphabetic((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.CHAR_ISNUMERIC) {
							var11 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = SpotAnimationDefinition.isDigit((char)var11) ? 1 : 0;
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_LENGTH) {
							var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							if (var3 != null) {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.length();
							} else {
								Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = 0;
							}

							return 1;
						} else if (var0 == ScriptOpcodes.SUBSTRING) {
							var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							class96.Interpreter_intStackSize -= 2;
							var10 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize];
							var9 = Interpreter.Interpreter_intStack[class96.Interpreter_intStackSize + 1];
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3.substring(var10, var9);
							return 1;
						} else if (var0 == ScriptOpcodes.REMOVETAGS) {
							var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
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

							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var16.toString();
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_CHAR) {
							var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							var10 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.indexOf(var10);
							return 1;
						} else if (var0 == ScriptOpcodes.STRING_INDEXOF_STRING) {
							class208.Interpreter_stringStackSize -= 2;
							var3 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 1];
							var9 = Interpreter.Interpreter_intStack[--class96.Interpreter_intStackSize];
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = var3.indexOf(var4, var9);
							return 1;
						} else if (var0 == 4122) {
							var3 = Interpreter.Interpreter_stringStack[--class208.Interpreter_stringStackSize];
							Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3.toUpperCase();
							return 1;
						} else if (var0 == 4123) {
							class208.Interpreter_stringStackSize -= 3;
							var3 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize];
							var4 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 1];
							String var5 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 2];
							if (SpriteMask.localPlayer.appearance == null) {
								Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var5;
								return 1;
							} else {
								switch(SpriteMask.localPlayer.appearance.field3819) {
								case 0:
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3;
									break;
								case 1:
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4;
									break;
								case 2:
								default:
									Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var5;
								}

								return 1;
							}
						} else if (var0 == 4124) {
							Interpreter.Interpreter_intStack[++class96.Interpreter_intStackSize - 1] = SpriteMask.localPlayer.appearance != null ? SpriteMask.localPlayer.appearance.field3819 : -1;
							return 1;
						} else {
							return 2;
						}
					}
				} else {
					class208.Interpreter_stringStackSize -= 2;
					var3 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize];
					var4 = Interpreter.Interpreter_stringStack[class208.Interpreter_stringStackSize + 1];
					if (SpriteMask.localPlayer.appearance != null && SpriteMask.localPlayer.appearance.gender != 0) {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var4;
					} else {
						Interpreter.Interpreter_stringStack[++class208.Interpreter_stringStackSize - 1] = var3;
					}

					return 1;
				}
			}
		}
	}
}
