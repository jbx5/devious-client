


import net.runelite.rs.ScriptOpcodes; import net.runelite.mapping.Implements; import net.runelite.mapping.ObfuscatedName; import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("Strings")
public class Strings {
	@ObfuscatedName("bo")
	public static String field3645;
	@ObfuscatedName("cn")
	public static String field3684;
	@ObfuscatedName("ky")
	public static String field3628;
	@ObfuscatedName("kc")
	public static String field3870;
	@ObfuscatedName("kw")
	public static String field3646;
	static 
	{
		field3645 = "Please visit the support page for assistance.";
		field3684 = "Please visit the support page for assistance.";
		field3628 = "";
		field3870 = "Page has opened in a new window.";
		field3646 = "(Please check your popup blocker.)";
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZI)I", garbageValue = 
	"-698381371")

	static int method5790(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == ScriptOpcodes.ADD) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			Interpreter.Interpreter_intStackSize -= 2;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.random() * ((double) (var3))));
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.random() * ((double) (var3 + 1))));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				Interpreter.Interpreter_intStackSize -= 5;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 + (((var4 - var3) * (var7 - var5)) / (var6 - var5));
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 + ((var3 * var4) / 100);
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 | (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 & ((-1) - (1 << var4));
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((var3 & (1 << var4)) != 0) ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.pow(((double) (var3)), ((double) (var4)))));
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				if (var3 == 0) {
					Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = 0;
					return 1;
				} else {
					switch (var4) {
						case 0 :
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = Integer.MAX_VALUE;
							break;
						case 1 :
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
							break;
						case 2 :
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.sqrt(((double) (var3)))));
							break;
						case 3 :
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.cbrt(((double) (var3)))));
							break;
						case 4 :
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.sqrt(Math.sqrt(((double) (var3))))));
							break;
						default :
							Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) (Math.pow(((double) (var3)), 1.0 / ((double) (var4)))));}


					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 | var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				Interpreter.Interpreter_intStackSize -= 3;
				long var9 = ((long) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]));
				long var11 = ((long) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]));
				long var13 = ((long) (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]));
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ((int) ((var13 * var9) / var11));
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var3 = class150.method3150(Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 ^ (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = ModelData0.method5091(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = World.method1679(var3, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				Interpreter.Interpreter_intStackSize -= 3;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = (var3 << var6) >>> (var4 + var6);
				return 1;
			} else if (var0 == 4030) {
				Interpreter.Interpreter_intStackSize -= 4;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3];
				var3 = World.method1679(var3, var5, var6);
				var7 = class54.method1078((var6 - var5) + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var3 | (var4 << var5);
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = HealthBar.method2344(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = class144.method3081(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				Interpreter.Interpreter_intStackSize -= 2;
				var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
				var5 = class194.method3890(var3, var4);
				Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize - 1]);
				return 1;
			} else {
				return 2;
			}
		}
	}
}