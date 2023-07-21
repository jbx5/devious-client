import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ib")
public class class219 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "[Liq;"
	)
	public static class217[] field2388;

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IB)Lht;",
		garbageValue = "-74"
	)
	@Export("StructDefinition_getStructDefinition")
	public static StructComposition StructDefinition_getStructDefinition(int var0) {
		StructComposition var1 = (StructComposition)StructComposition.StructDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = StructComposition.StructDefinition_archive.takeFile(34, var0);
			var1 = new StructComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			var1.postDecode();
			StructComposition.StructDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("by")
	@ObfuscatedSignature(
		descriptor = "(ILdc;ZB)I",
		garbageValue = "61"
	)
	static int method4284(int var0, Script var1, boolean var2) {
		if (var0 == 7108) {
			Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = AttackOption.method2660() ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}
}
