import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("np")
public enum class352 implements MouseWheel {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field4228(-1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field4226(0),
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field4225(1),
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	field4224(2);

	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1651266547
	)
	final int field4227;

	class352(int var3) {
		this.field4227 = var3;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "41"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4227;
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZB)I",
		garbageValue = "1"
	)
	static int method6623(int var0, Script var1, boolean var2) {
		int var4;
		int var9;
		if (var0 == ScriptOpcodes.ADD) {
			SoundCache.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 + var4;
			return 1;
		} else if (var0 == ScriptOpcodes.SUB) {
			SoundCache.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 - var4;
			return 1;
		} else if (var0 == ScriptOpcodes.MULTIPLY) {
			SoundCache.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 * var4;
			return 1;
		} else if (var0 == ScriptOpcodes.DIV) {
			SoundCache.Interpreter_intStackSize -= 2;
			var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 / var4;
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOM) {
			var9 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)var9);
			return 1;
		} else if (var0 == ScriptOpcodes.RANDOMINC) {
			var9 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)(Math.random() * (double)(var9 + 1));
			return 1;
		} else {
			int var5;
			int var6;
			int var7;
			if (var0 == ScriptOpcodes.INTERPOLATE) {
				SoundCache.Interpreter_intStackSize -= 5;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3];
				var7 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 4];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 + (var7 - var5) * (var4 - var9) / (var6 - var5);
				return 1;
			} else if (var0 == ScriptOpcodes.ADDPERCENT) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 + var4 * var9 / 100;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 | 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 & -1 - (1 << var4);
				return 1;
			} else if (var0 == ScriptOpcodes.TESTBIT) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (var9 & 1 << var4) != 0 ? 1 : 0;
				return 1;
			} else if (var0 == ScriptOpcodes.MOD) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 % var4;
				return 1;
			} else if (var0 == ScriptOpcodes.POW) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
				} else {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, (double)var4);
				}

				return 1;
			} else if (var0 == ScriptOpcodes.INVPOW) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				if (var9 == 0) {
					Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = 0;
					return 1;
				} else {
					switch(var4) {
					case 0:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Integer.MAX_VALUE;
						break;
					case 1:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9;
						break;
					case 2:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.sqrt((double)var9);
						break;
					case 3:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.cbrt((double)var9);
						break;
					case 4:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.sqrt(Math.sqrt((double)var9));
						break;
					default:
						Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)Math.pow((double)var9, 1.0D / (double)var4);
					}

					return 1;
				}
			} else if (var0 == ScriptOpcodes.AND) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 & var4;
				return 1;
			} else if (var0 == ScriptOpcodes.OR) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 | var4;
				return 1;
			} else if (var0 == 4016) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 < var4 ? var9 : var4;
				return 1;
			} else if (var0 == 4017) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 > var4 ? var9 : var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SCALE) {
				SoundCache.Interpreter_intStackSize -= 3;
				long var10 = (long)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				long var12 = (long)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				long var14 = (long)Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = (int)(var10 * var14 / var12);
				return 1;
			} else if (var0 == ScriptOpcodes.BITCOUNT) {
				var9 = PacketBufferNode.method5706(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9;
				return 1;
			} else if (var0 == ScriptOpcodes.TOGGLEBIT) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 ^ 1 << var4;
				return 1;
			} else if (var0 == ScriptOpcodes.SETBIT_RANGE) {
				SoundCache.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = Widget.method6533(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.CLEARBIT_RANGE) {
				SoundCache.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = InvDefinition.method3563(var9, var4, var5);
				return 1;
			} else if (var0 == ScriptOpcodes.GETBIT_RANGE) {
				SoundCache.Interpreter_intStackSize -= 3;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
				var6 = 31 - var5;
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 << var6 >>> var6 + var4;
				return 1;
			} else if (var0 == 4030) {
				SoundCache.Interpreter_intStackSize -= 4;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
				var6 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 3];
				var9 = InvDefinition.method3563(var9, var5, var6);
				var7 = Projectile.method2147(var6 - var5 + 1);
				if (var4 > var7) {
					var4 = var7;
				}

				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var9 | var4 << var5;
				return 1;
			} else if (var0 == 4032) {
				Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = Frames.method4722(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4033) {
				Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = SongTask.method7613(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4034) {
				SoundCache.Interpreter_intStackSize -= 2;
				var9 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
				var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				var5 = class350.method6620(var9, var4);
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var5;
				return 1;
			} else if (var0 == 4035) {
				Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1] = Math.abs(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize - 1]);
				return 1;
			} else if (var0 == 4036) {
				String var3 = Interpreter.Interpreter_stringStack[--class137.Interpreter_stringStackSize];
				var4 = -1;
				if (class218.isNumber(var3)) {
					var4 = HealthBarUpdate.method2412(var3);
				}

				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var4;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
