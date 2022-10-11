import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ca")
public class class92 {
	@ObfuscatedName("ay")
	@Export("hasFocus")
	protected static boolean hasFocus;

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ldk;",
		garbageValue = "759353843"
	)
	static class117 method2537(int var0) {
		class117[] var1 = new class117[]{class117.field1451, class117.field1444, class117.field1445, class117.field1443, class117.field1446}; // L: 154
		class117 var2 = (class117)Varps.findEnumerated(var1, var0); // L: 156
		if (var2 == null) { // L: 157
			var2 = class117.field1451;
		}

		return var2; // L: 158
	}
}
