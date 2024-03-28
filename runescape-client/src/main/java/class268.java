import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
public class class268 {
	@ObfuscatedName("aa")
	@Export("osNameLowercase")
	public static String osNameLowercase;

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "77"
	)
	static void method5236() {
		for (int var0 = 0; var0 < Client.field533.size(); ++var0) {
			if (class192.method3717((Integer)Client.field533.get(var0)) != 2) {
				Client.field533.remove(var0);
				--var0;
			}
		}

	}
}
