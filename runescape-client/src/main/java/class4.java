import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ar")
public final class class4 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("KitDefinition_modelsArchive")
	static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("jn")
	@ObfuscatedGetter(
		intValue = 404669667
	)
	static int field3;

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)[Lfm;",
		garbageValue = "1472575201"
	)
	static class141[] method20() {
		return new class141[]{class141.field1642, class141.field1653, class141.field1641, class141.field1652, class141.field1645, class141.field1646, class141.field1647, class141.field1648, class141.field1649};
	}

	@ObfuscatedName("bj")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZI)I",
		garbageValue = "2032896608"
	)
	static int method19(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class470.method8697() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
