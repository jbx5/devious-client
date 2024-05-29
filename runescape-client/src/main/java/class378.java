import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ow")
public enum class378 implements Enum {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4403(-1),
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4404(0),
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4402(1),
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	field4405(2);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1328107157
	)
	final int field4406;

	class378(int var3) {
		this.field4406 = var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-311400525"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field4406;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lat;S)Laz;",
		garbageValue = "439"
	)
	public static class3 method7154(class6 var0) {
		switch(var0.field12) {
		case 0:
			return new class0();
		default:
			throw new IllegalArgumentException();
		}
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(ILdm;ZI)I",
		garbageValue = "113823719"
	)
	static int method7153(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++class13.Interpreter_intStackSize - 1] = class150.method3254() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
