import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oi")
public final class class383 {
	@ObfuscatedName("oc")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1663230842"
	)
	static void method7144() {
		if (class390.field4441 != null) {
			Client.field649 = Client.cycle;
			class390.field4441.method6899();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					class390.field4441.method6898(UrlRequester.baseX * 64 + (Client.players[var0].x >> 7), class47.baseY * 64 + (Client.players[var0].y >> 7));
				}
			}
		}

	}
}
