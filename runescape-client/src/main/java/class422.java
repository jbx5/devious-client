import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("qy")
public class class422 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1931631729
	)
	static int field4568;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1115750469
	)
	int field4572;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -435074305
	)
	int field4569;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1589929039
	)
	int field4570;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1861640221
	)
	int field4571;

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field4572).length();
		int var3 = 10 - Integer.toString(this.field4570).length();
		int var4 = 10 - Integer.toString(this.field4569).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field4572 + var5 + "Created: " + this.field4569 + var7 + "Total used: " + this.field4570 + var6 + "Max-In-Use: " + this.field4571;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "-2144991667"
	)
	public static void method7907(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method7907(var0, var1, var2, var5 - 1);
			method7907(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdt;ZI)I",
		garbageValue = "1334389960"
	)
	static int method7905(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			DbTableType.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			DbTableType.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			DbTableType.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4 * var9;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			DbTableType.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				DbTableType.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 + var9 * var4 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				DbTableType.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = UserComparator4.method2943(Interpreter.Interpreter_intStack[--DbTableType.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				DbTableType.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class197.method3811(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				DbTableType.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = class93.method2451(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				DbTableType.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				DbTableType.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 3];
				var9 = class93.method2451(var9, var5, var6);
				var7 = class214.method4227(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1] = class174.method3539(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1] = class195.method3800(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				DbTableType.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize + 1];
				var5 = PacketBufferNode.method5929(var9, var4);
				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[DbTableType.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--class127.Interpreter_stringStackSize];
				var4 = -1;
				if (ClientPacket.isNumber(var3)) {
					var4 = Huffman.method6840(var3);
				}

				Interpreter.Interpreter_intStack[++DbTableType.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
