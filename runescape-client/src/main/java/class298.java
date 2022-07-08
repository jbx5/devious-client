import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("kw")
public class class298 {
	@ObfuscatedName("ir")
	@ObfuscatedGetter(intValue = -672435189)
	static int field3558;

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "1392015477")
	static final boolean method5753(int var0, int var1) {
		ObjectComposition var2 = class162.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}
		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}
		return var2.method3658(var1);
	}
}