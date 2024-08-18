import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lk")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("ab")
	@Export("text")
	String text;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = 1236599607
	)
	@Export("width")
	int width;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1970746255
	)
	@Export("height")
	int height;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkc;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILkc;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(ILdp;ZI)I",
		garbageValue = "1163149745"
	)
	static int method5961(int var0, Script var1, boolean var2) {
		int var3;
		int var4;
		if (var0 == 8000) {
			--Interpreter.Interpreter_intStackSize;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_arrayLengths[var3];
			AttackOption.method2842(Interpreter.Interpreter_arrays[var3], new int[var4], 0, var4 - 1);
			return 1;
		} else if (var0 == 8001) {
			Interpreter.Interpreter_intStackSize -= 3;
			var3 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize];
			var4 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 1];
			int var5 = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize + 2];
			int var6 = Interpreter.Interpreter_arrayLengths[var3];
			if (var6 <= 1) {
				return 1;
			} else {
				class448.method8355(Interpreter.Interpreter_arrays[var3], var6, var4, var5);
				return 1;
			}
		} else {
			return 2;
		}
	}
}
