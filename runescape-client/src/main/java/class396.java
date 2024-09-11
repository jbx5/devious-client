import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pb")
public class class396 {
	@ObfuscatedName("pm")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "840838986"
	)
	static void method7680() {
		if (class389.field4542 != null) {
			Client.field808 = Client.cycle;
			class389.field4542.method7728();

			for (int var0 = 0; var0 < ClientPreferences.topLevelWorldView.players.length; ++var0) {
				if (ClientPreferences.topLevelWorldView.players[var0] != null) {
					class389.field4542.method7727((ClientPreferences.topLevelWorldView.players[var0].x >> 7) + ClientPreferences.topLevelWorldView.baseX, (ClientPreferences.topLevelWorldView.players[var0].y >> 7) + ClientPreferences.topLevelWorldView.baseY);
				}
			}
		}

	}
}
