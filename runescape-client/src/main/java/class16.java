import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("b")
public class class16 implements ThreadFactory {
	@ObfuscatedName("su")
	@ObfuscatedSignature(
		descriptor = "Lam;"
	)
	@Export("pcmStreamMixer")
	static PcmStreamMixer pcmStreamMixer;
	@ObfuscatedName("c")
	final ThreadGroup field89;
	@ObfuscatedName("p")
	final AtomicInteger field87;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lu;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lu;)V"
	)
	class16(class14 var1) {
		this.this$0 = var1; // L: 68
		this.field87 = new AtomicInteger(1); // L: 66
		SecurityManager var2 = System.getSecurityManager(); // L: 69
		this.field89 = var2 != null ? var2.getThreadGroup() : Thread.currentThread().getThreadGroup(); // L: 70
	} // L: 71

	public Thread newThread(Runnable var1) {
		Thread var2 = new Thread(this.field89, var1, this.this$0.field78 + "-rest-request-" + this.field87.getAndIncrement(), 0L); // L: 75
		var2.setDaemon(true); // L: 76
		var2.setPriority(5); // L: 77
		return var2; // L: 78
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1453675384"
	)
	static int method217(int var0, int var1) {
		long var2 = (long)((var0 << 16) + var1); // L: 186
		return class135.NetCache_currentResponse != null && class135.NetCache_currentResponse.key == var2 ? class20.NetCache_responseArchiveBuffer.offset * 99 / (class20.NetCache_responseArchiveBuffer.array.length - class135.NetCache_currentResponse.padding) + 1 : 0; // L: 187 188
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1688709395"
	)
	static final int method216(int var0, int var1) {
		if (var0 == -2) { // L: 986
			return 12345678;
		} else if (var0 == -1) { // L: 987
			if (var1 < 2) {
				var1 = 2; // L: 988
			} else if (var1 > 126) { // L: 989
				var1 = 126;
			}

			return var1; // L: 990
		} else {
			var1 = (var0 & 127) * var1 / 128; // L: 992
			if (var1 < 2) { // L: 993
				var1 = 2;
			} else if (var1 > 126) { // L: 994
				var1 = 126;
			}

			return (var0 & 65408) + var1; // L: 995
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "-78"
	)
	static int method215(int var0, Script var1, boolean var2) {
		int var3;
		int var6;
		int var9;
		if (var0 == ScriptOpcodes.ENUM_STRING) { // L: 2251
			Interpreter.Interpreter_intStackSize -= 2; // L: 2252
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2253
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2254
			EnumComposition var10 = PlayerComposition.getEnum(var3); // L: 2255
			if (var10.outputType != 's') { // L: 2256
			}

			for (var6 = 0; var6 < var10.outputCount; ++var6) { // L: 2257
				if (var9 == var10.keys[var6]) { // L: 2258
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var10.strVals[var6]; // L: 2259
					var10 = null; // L: 2260
					break;
				}
			}

			if (var10 != null) { // L: 2264
				Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var10.defaultStr;
			}

			return 1; // L: 2265
		} else if (var0 != ScriptOpcodes.ENUM) { // L: 2267
			if (var0 == ScriptOpcodes.ENUM_GETOUTPUTCOUNT) { // L: 2293
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2294
				EnumComposition var4 = PlayerComposition.getEnum(var3); // L: 2295
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var4.size(); // L: 2296
				return 1; // L: 2297
			} else {
				return 2; // L: 2299
			}
		} else {
			Interpreter.Interpreter_intStackSize -= 4; // L: 2268
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize]; // L: 2269
			var9 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1]; // L: 2270
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2]; // L: 2271
			var6 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 3]; // L: 2272
			EnumComposition var7 = PlayerComposition.getEnum(var5); // L: 2273
			if (var3 == var7.inputType && var9 == var7.outputType) { // L: 2274
				for (int var8 = 0; var8 < var7.outputCount; ++var8) { // L: 2279
					if (var6 == var7.keys[var8]) { // L: 2280
						if (var9 == 115) { // L: 2281
							Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var7.strVals[var8];
						} else {
							Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.intVals[var8]; // L: 2282
						}

						var7 = null; // L: 2283
						break;
					}
				}

				if (var7 != null) { // L: 2287
					if (var9 == 115) { // L: 2288
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var7.defaultStr;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var7.defaultInt; // L: 2289
					}
				}

				return 1; // L: 2291
			} else {
				if (var9 == 115) { // L: 2275
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = "null";
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2276
				}

				return 1; // L: 2277
			}
		}
	}
}
