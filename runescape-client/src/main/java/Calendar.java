import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("os")
@Implements("Calendar")
public class Calendar {
	@ObfuscatedName("ac")
	@Export("MONTH_NAMES_ENGLISH_GERMAN")
	public static final String[][] MONTH_NAMES_ENGLISH_GERMAN;
	@ObfuscatedName("ae")
	@Export("DAYS_OF_THE_WEEK")
	public static final String[] DAYS_OF_THE_WEEK;
	@ObfuscatedName("ag")
	@Export("Calendar_calendar")
	public static java.util.Calendar Calendar_calendar;

	static {
		MONTH_NAMES_ENGLISH_GERMAN = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}, {"jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc"}, {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"}, {"jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec"}, {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"}};
		DAYS_OF_THE_WEEK = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		java.util.Calendar.getInstance();
		Calendar_calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	}

	@ObfuscatedName("bw")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZB)I",
		garbageValue = "22"
	)
	static int method7404(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			class320.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			class320.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			class320.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			class320.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				class320.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				class320.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = class36.method700(Interpreter.Interpreter_intStack[--class320.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				class320.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class6.method36(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				class320.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = class197.method4024(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				class320.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				class320.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 3];
				var9 = class197.method4024(var9, var5, var6);
				var7 = class354.method6857(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1] = ModeWhere.method7778(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1] = class36.method709(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				class320.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize + 1];
				var5 = HttpQueryParams.method9219(var9, var4);
				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[class320.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--class465.Interpreter_stringStackSize];
				var4 = -1;
				if (class213.isNumber(var3)) {
					var4 = TaskHandler.method4455(var3);
				}

				Interpreter.Interpreter_intStack[++class320.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
