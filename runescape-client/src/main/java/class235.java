import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class235 {
	@ObfuscatedName("kq")
	@ObfuscatedGetter(
		intValue = 1345393189
	)
	static int field2478;

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1253949569"
	)
	public static void method4603() {
		FileSystem.FileSystem_cacheFiles.clear();
	}

	@ObfuscatedName("bo")
	@ObfuscatedSignature(
		descriptor = "(ILdd;ZI)I",
		garbageValue = "492007439"
	)
	static int method4604(int var0, Script var1, boolean var2) {
		if (var0 == 7463) {
			boolean var3 = Interpreter.Interpreter_intStack[--UserComparator6.Interpreter_intStackSize] == 1;
			AddRequestTask.method7922(var3);
			return 1;
		} else {
			return 2;
		}
	}
}
