import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ip")
public class class227 extends Node {
	@ObfuscatedName("cz")
	@ObfuscatedGetter(
		intValue = 2074625389
	)
	static int field2427;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1742528803
	)
	public int field2422;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1673564965
	)
	public int field2425;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1527486311
	)
	public int field2424;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lnt;"
	)
	public Widget field2426;

	@ObfuscatedSignature(
		descriptor = "(IIILnt;)V"
	)
	public class227(int var1, int var2, int var3, Widget var4) {
		this.field2424 = var1;
		this.field2422 = var2;
		this.field2425 = var3;
		this.field2426 = var4;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lvg;IIII)V",
		garbageValue = "2001173472"
	)
	static void method4308(SpritePixels var0, int var1, int var2, int var3) {
		DemotingHashTable var4 = WorldMapRegion.WorldMapRegion_cachedSprites;
		long var6 = (long)(var3 << 16 | var1 << 8 | var2);
		var4.put(var0, var6, var0.pixels.length * 4);
	}

	@ObfuscatedName("cr")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1659141564"
	)
	static int method4309(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--HttpRequestTask.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			class130.method3015(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			HttpRequestTask.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class429.method7866(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
