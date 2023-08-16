import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class101 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1873768041"
	)
	public static boolean method2640(int var0) {
		return var0 >= WorldMapDecorationType.field3828.id && var0 <= WorldMapDecorationType.field3826.id || var0 == WorldMapDecorationType.field3844.id;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2030205668"
	)
	static void method2641() {
		ByteArrayPool.field4550.clear();
		ByteArrayPool.field4550.add(100);
		ByteArrayPool.field4550.add(5000);
		ByteArrayPool.field4550.add(10000);
		ByteArrayPool.field4550.add(30000);
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(ILdh;ZI)I",
		garbageValue = "-1662859603"
	)
	static int method2642(int var0, Script var1, boolean var2) {
		if (var0 == 6754) {
			int var5 = Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize];
			NPCComposition var6 = class90.getNpcDefinition(var5);
			Interpreter.Interpreter_stringStack[++class137.Interpreter_stringStackSize - 1] = var6 != null ? var6.name : "";
			return 1;
		} else {
			NPCComposition var3;
			if (var0 == 6764) {
				SoundCache.Interpreter_intStackSize -= 2;
				var3 = class90.getNpcDefinition(Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize]);
				int var4 = Interpreter.Interpreter_intStack[SoundCache.Interpreter_intStackSize + 1];
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.method3695(var4);
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3.method3715(var4);
				return 1;
			} else if (var0 == 6765) {
				var3 = class90.getNpcDefinition(Interpreter.Interpreter_intStack[--SoundCache.Interpreter_intStackSize]);
				Interpreter.Interpreter_intStack[++SoundCache.Interpreter_intStackSize - 1] = var3 != null ? var3.combatLevel : 0;
				return 1;
			} else {
				return 2;
			}
		}
	}
}
