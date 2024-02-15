import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nl")
public class class360 {
	@ObfuscatedName("kv")
	@ObfuscatedSignature(
		descriptor = "(IIIIIB)V",
		garbageValue = "0"
	)
	static void method6993(int var0, int var1, int var2, int var3, int var4) {
		NodeDeque var5 = Client.groundItems[var0][var1][var2];
		if (var5 != null) {
			for (TileItem var6 = (TileItem)var5.last(); var6 != null; var6 = (TileItem)var5.previous()) {
				if ((var3 & 32767) == var6.id && var4 == var6.quantity) {
					var6.remove();
					break;
				}
			}

			if (var5.last() == null) {
				Client.groundItems[var0][var1][var2] = null;
			}

			class73.updateItemPile(var0, var1, var2);
		}

	}
}
