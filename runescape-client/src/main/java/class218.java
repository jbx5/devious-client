import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ih")
public class class218 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lij;"
	)
	public static class216[] field2412;

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1881729951"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return WorldMapData_1.method5345(var0, 10, true);
	}

	@ObfuscatedName("cm")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-7050902"
	)
	static int method4244(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--SoundCache.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			class477.method8446(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			SoundCache.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class409.method7633(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}

	@ObfuscatedName("iq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-864232113"
	)
	@Export("getWindowedMode")
	static int getWindowedMode() {
		return Client.isResizable ? 2 : 1;
	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(Lmi;I)V",
		garbageValue = "634496397"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field747) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
