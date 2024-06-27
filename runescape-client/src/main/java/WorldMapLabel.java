import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("km")
@Implements("WorldMapLabel")
public class WorldMapLabel {
	@ObfuscatedName("aq")
	@Export("text")
	String text;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 265924559
	)
	@Export("width")
	int width;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2136908715
	)
	@Export("height")
	int height;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Ljx;"
	)
	@Export("size")
	WorldMapLabelSize size;

	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;IILjx;)V"
	)
	WorldMapLabel(String var1, int var2, int var3, WorldMapLabelSize var4) {
		this.text = var1;
		this.width = var2;
		this.height = var3;
		this.size = var4;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "784704657"
	)
	static float method5003(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var3 * var2 + var0[var4];
		}

		return var3;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(ILdg;ZI)I",
		garbageValue = "-14417832"
	)
	static int method5004(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.indexCheck.method4383(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--class130.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++class130.Interpreter_intStackSize - 1] = Client.indexCheck.method4385(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
