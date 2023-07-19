import java.math.BigInteger;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cg")
public class class74 {
	@ObfuscatedName("aw")
	static final BigInteger field918;
	@ObfuscatedName("ay")
	static final BigInteger field915;

	static {
		field918 = new BigInteger("10001", 16);
		field915 = new BigInteger("837aa9f02cc04c9b343d5266504f7fb5b16a966ed0c040361d86894e88a6f50d1fd0f1e7d8ab3c0d44eff369029a1e6e13a1f0890ba4ac0dc315e76e6f8c38fb9df4c6d04831f525e1dd4b7e1c38cc3c44888a7e9d3ae2120f12877bdd671dffcb137690ab80971e9af17d19644615b37eebd59b204317b2445bcebe6b66949d", 16);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Leu;",
		garbageValue = "1051457224"
	)
	static class128 method2086(int var0) {
		class128[] var1 = new class128[]{class128.field1524, class128.field1516, class128.field1517, class128.field1518, class128.field1521};
		class128 var2 = (class128)ClientPreferences.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class128.field1524;
		}

		return var2;
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)V",
		garbageValue = "127"
	)
	static final void method2087(int var0, int var1, int var2) {
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

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lmt;I)I",
		garbageValue = "-1427529511"
	)
	static int method2089(Widget var0) {
		if (var0.type != 11) {
			--Interpreter.Interpreter_stringStackSize;
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			return 1;
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--Interpreter.Interpreter_stringStackSize];
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method6460(var1);
			return 1;
		}
	}

	@ObfuscatedName("ir")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "36"
	)
	static final int method2088(int var0) {
		return Math.min(Math.max(var0, 128), 383);
	}
}
