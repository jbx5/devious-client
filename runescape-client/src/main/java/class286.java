import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("kt")
public class class286 {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IIII)I", garbageValue = "-1025755779")
	public static int method5524(int var0, int var1, int var2) {
		var2 &= 3;
		if (var2 == 0) {
			return var0;
		} else if (var2 == 1) {
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 : 7 - var1;
		}
	}
}