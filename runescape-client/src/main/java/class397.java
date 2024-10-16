import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pl")
public class class397 {
	@ObfuscatedName("aw")
	public static boolean method7768(long var0) {
		return 0L != var0 && !class197.method4056(var0);
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "402983014"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1, int var2) {
		class224.updateItemPile2(class344.worldView, var0, var1, var2);
	}
}
