import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
public class class296 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Lfr;",
		garbageValue = "2144618916"
	)
	static class134 method5945(int var0) {
		class134[] var1 = new class134[]{class134.field1608, class134.field1604, class134.field1605, class134.field1606, class134.field1614, class134.field1615};
		class134 var2 = (class134)MenuAction.findEnumerated(var1, var0);
		if (var2 == null) {
			var2 = class134.field1608;
		}

		return var2;
	}
}
