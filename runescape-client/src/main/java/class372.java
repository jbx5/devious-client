import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
public class class372 {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lct;I)V",
		garbageValue = "2101841349"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != HttpAuthenticationHeader.ItemDefinition_inMembersWorld) {
				ItemComposition.ItemDefinition_cached.clear();
				ItemComposition.ItemDefinition_cachedModels.clear();
				ItemComposition.ItemDefinition_cachedSprites.clear();
				HttpAuthenticationHeader.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			UrlRequest.method3258(class450.archive8, var0.properties);
		}

		class156.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class147.field1688 = var0.field821;
		GameEngine.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		SwapSongTask.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		HorizontalAlignment.currentPort = GameEngine.worldPort;
	}
}
