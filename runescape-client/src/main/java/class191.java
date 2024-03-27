import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("hm")
public class class191 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	@Export("field1913")
	static EvictingDualNodeHashTable field1913;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("NpcDefinition_archive")
	public static AbstractArchive NpcDefinition_archive;

	static {
		field1913 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "-236515639"
	)
	static final void method3716(int var0, int var1, int var2) {
		int var3;
		for (var3 = 0; var3 < 8; ++var3) {
			for (int var4 = 0; var4 < 8; ++var4) {
				Tiles.Tiles_heights[var0][var3 + var1][var4 + var2] = 0;
			}
		}

		if (var1 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var1][var3 + var2] = Tiles.Tiles_heights[var0][var1 - 1][var3 + var2];
			}
		}

		if (var2 > 0) {
			for (var3 = 1; var3 < 8; ++var3) {
				Tiles.Tiles_heights[var0][var3 + var1][var2] = Tiles.Tiles_heights[var0][var3 + var1][var2 - 1];
			}
		}

		if (var1 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2];
		} else if (var2 > 0 && Tiles.Tiles_heights[var0][var1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1][var2 - 1];
		} else if (var1 > 0 && var2 > 0 && Tiles.Tiles_heights[var0][var1 - 1][var2 - 1] != 0) {
			Tiles.Tiles_heights[var0][var1][var2] = Tiles.Tiles_heights[var0][var1 - 1][var2 - 1];
		}

	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "555486507"
	)
	static int method3713(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			HttpRequestTask.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			HttpRequestTask.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			HttpRequestTask.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			HttpRequestTask.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				HttpRequestTask.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 + (var4 - var9) * (var7 - var5) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				HttpRequestTask.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = (int)(var14 * var10 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = class90.method2322(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				HttpRequestTask.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class106.method2696(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				HttpRequestTask.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = class73.method2084(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				HttpRequestTask.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				HttpRequestTask.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 3];
				var9 = class73.method2084(var9, var5, var6);
				var7 = class75.method2089(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1] = BuddyRankComparator.method2933(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1] = class243.method4661(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				var5 = class471.method8475(var9, var4);
				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--AbstractWorldMapIcon.Interpreter_stringStackSize];
				var4 = -1;
				if (CollisionMap.isNumber(var3)) {
					var4 = KitDefinition.method3778(var3);
				}

				Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
