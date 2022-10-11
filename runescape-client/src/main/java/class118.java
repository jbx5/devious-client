import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("di")
public class class118 {
	@ObfuscatedName("c")
	boolean field1456;
	@ObfuscatedName("p")
	boolean field1453;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	class117 field1454;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldk;"
	)
	class117 field1455;
	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "[Ldz;"
	)
	class114[] field1467;
	@ObfuscatedName("w")
	boolean field1457;
	@ObfuscatedName("s")
	float field1458;
	@ObfuscatedName("q")
	float field1459;
	@ObfuscatedName("m")
	float[] field1460;
	@ObfuscatedName("x")
	float[] field1462;
	@ObfuscatedName("j")
	boolean field1452;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 463695583
	)
	int field1461;
	@ObfuscatedName("h")
	float[] field1464;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1510701429
	)
	int field1465;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 115743815
	)
	int field1463;
	@ObfuscatedName("d")
	float field1466;
	@ObfuscatedName("b")
	float field1468;

	class118() {
		this.field1460 = new float[4]; // L: 16
		this.field1462 = new float[4]; // L: 17
		this.field1452 = true; // L: 18
		this.field1461 = 0; // L: 19
	} // L: 26

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lqq;II)I",
		garbageValue = "675038512"
	)
	int method2868(Buffer var1, int var2) {
		int var3 = var1.readUnsignedShort(); // L: 29
		class310.method5941(var1.readUnsignedByte()); // L: 30
		this.field1454 = class92.method2537(var1.readUnsignedByte()); // L: 31
		this.field1455 = class92.method2537(var1.readUnsignedByte()); // L: 32
		this.field1456 = var1.readUnsignedByte() != 0; // L: 33
		this.field1467 = new class114[var3]; // L: 34
		class114 var4 = null; // L: 35

		int var5;
		for (var5 = 0; var5 < var3; ++var5) { // L: 36
			class114 var6 = new class114(); // L: 37
			var6.method2807(var1, var2); // L: 38
			this.field1467[var5] = var6; // L: 39
			if (var4 != null) { // L: 40
				var4.field1414 = var6; // L: 41
			}

			var4 = var6; // L: 43
		}

		this.field1465 = this.field1467[0].field1407; // L: 45
		this.field1463 = this.field1467[this.method2876() - 1].field1407; // L: 46
		this.field1464 = new float[this.method2873() + 1]; // L: 48

		for (var5 = this.method2871(); var5 <= this.method2872(); ++var5) { // L: 49
			this.field1464[var5 - this.method2871()] = class33.method636(this, (float)var5); // L: 50
		}

		this.field1467 = null; // L: 52
		this.field1466 = class33.method636(this, (float)(this.method2871() - 1)); // L: 54
		this.field1468 = class33.method636(this, (float)(this.method2872() + 1)); // L: 55
		return var3; // L: 56
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IS)F",
		garbageValue = "11837"
	)
	public float method2870(int var1) {
		if (var1 < this.method2871()) { // L: 61
			return this.field1466; // L: 62
		} else {
			return var1 > this.method2872() ? this.field1468 : this.field1464[var1 - this.method2871()]; // L: 64 65 67
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2048444589"
	)
	int method2871() {
		return this.field1465; // L: 72
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-869344736"
	)
	int method2872() {
		return this.field1463; // L: 76
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "1991"
	)
	int method2873() {
		return this.method2872() - this.method2871(); // L: 80
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(FI)I",
		garbageValue = "-178449805"
	)
	int method2874(float var1) {
		if (this.field1461 < 0 || (float)this.field1467[this.field1461].field1407 > var1 || this.field1467[this.field1461].field1414 != null && (float)this.field1467[this.field1461].field1414.field1407 <= var1) { // L: 84
			if (var1 >= (float)this.method2871() && var1 <= (float)this.method2872()) { // L: 87
				int var2 = this.method2876(); // L: 90
				int var3 = this.field1461; // L: 91
				if (var2 > 0) { // L: 92
					int var4 = 0; // L: 93
					int var5 = var2 - 1; // L: 94

					do {
						int var6 = var5 + var4 >> 1; // L: 96
						if (var1 < (float)this.field1467[var6].field1407) { // L: 97
							if (var1 > (float)this.field1467[var6 - 1].field1407) { // L: 98
								var3 = var6 - 1; // L: 99
								break;
							}

							var5 = var6 - 1; // L: 103
						} else {
							if (var1 <= (float)this.field1467[var6].field1407) { // L: 106
								var3 = var6; // L: 116
								break; // L: 117
							}

							if (var1 < (float)this.field1467[var6 + 1].field1407) { // L: 107
								var3 = var6; // L: 108
								break; // L: 109
							}

							var4 = var6 + 1; // L: 112
						}
					} while(var4 <= var5); // L: 119
				}

				if (var3 != this.field1461) { // L: 121
					this.field1461 = var3; // L: 122
					this.field1452 = true; // L: 123
				}

				return this.field1461; // L: 125
			} else {
				return -1; // L: 88
			}
		} else {
			return this.field1461; // L: 85
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(FI)Ldz;",
		garbageValue = "1048576"
	)
	class114 method2892(float var1) {
		int var2 = this.method2874(var1); // L: 129
		return var2 >= 0 && var2 < this.field1467.length ? this.field1467[var2] : null; // L: 130 131 134
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "14"
	)
	int method2876() {
		return this.field1467 == null ? 0 : this.field1467.length; // L: 139 140
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1376653370"
	)
	static boolean method2893(char var0) {
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"ï¿½$%^&*()-_=+[{]};:'@#~,<.>/?\\| ".indexOf(var0) != -1; // L: 1113
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(Lkw;B)I",
		garbageValue = "-31"
	)
	static int method2875(Widget var0) {
		if (var0.type != 11) { // L: 1215
			--VarbitComposition.Interpreter_stringStackSize; // L: 1216
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1; // L: 1217
			return 1; // L: 1218
		} else {
			String var1 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 1220
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = var0.method5866(var1); // L: 1221
			return 1; // L: 1222
		}
	}
}
