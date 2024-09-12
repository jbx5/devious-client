import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qq")
public final class class431 {
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1067237483
	)
	static int field4760;
	@ObfuscatedName("ac")
	final Object field4758;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -2143630103
	)
	int field4759;

	class431(Object var1, int var2) {
		this.field4758 = var1;
		this.field4759 = var2;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(Lcr;I)V",
		garbageValue = "1991341961"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			ParamComposition.method4098(var0.isMembersOnly());
		}

		if (var0.properties != Client.worldProperties) {
			HorizontalAlignment.method3960(ApproximateRouteStrategy.archive8, var0.properties);
		}

		class324.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		JagexCache.field2382 = var0.field834;
		class30.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		WorldMapRenderer.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		BuddyRankComparator.currentPort = class30.worldPort;
	}
}
