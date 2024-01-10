import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("nf")
public final class class358 {
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "10"
	)
	public static int method6929(int var0, int var1, int var2) {
		int var3 = SpotAnimationDefinition.method3814(var2 - var1 + 1);
		var3 <<= var1;
		var0 |= var3;
		return var0;
	}

	@ObfuscatedName("bn")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZB)I",
		garbageValue = "-40"
	)
	static int method6930(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			UserComparator6.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 + var9;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			UserComparator6.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			UserComparator6.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			UserComparator6.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				UserComparator6.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				UserComparator6.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = class295.method5903(Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				UserComparator6.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = method6929(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				UserComparator6.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = class169.method3550(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				UserComparator6.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				UserComparator6.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 3];
				var9 = class169.method3550(var9, var5, var6);
				var7 = SpotAnimationDefinition.method3814(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = class172.method3570(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = class316.method6013(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				UserComparator6.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize + 1];
				var5 = Widget.method6843(var9, var4);
				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[UserComparator6.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--class211.Interpreter_stringStackSize];
				var4 = -1;
				if (Login.isNumber(var3)) {
					var4 = HealthBar.method2644(var3);
				}

				Interpreter.Interpreter_intStack[++UserComparator6.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}

	@ObfuscatedName("jp")
	@ObfuscatedSignature(
		descriptor = "(Ldn;III)V",
		garbageValue = "-1743578094"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = HttpMethod.SequenceDefinition_get(var1).restartMode;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1220 = 0;
			}

			if (var3 == 2) {
				var0.field1220 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || HttpMethod.SequenceDefinition_get(var1).field2220 >= HttpMethod.SequenceDefinition_get(var0.sequence).field2220) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1220 = 0;
			var0.field1215 = var0.pathLength;
		}

	}
}
