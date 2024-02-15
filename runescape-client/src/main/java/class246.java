import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jl")
public class class246 {
	@ObfuscatedName("ja")
	@ObfuscatedSignature(
		descriptor = "[Lvd;"
	)
	static SpritePixels[] field2581;

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "992572456"
	)
	@Export("changeWorld")
	static void changeWorld(World var0) {
		if (var0.isMembersOnly() != Client.isMembersWorld) {
			Client.isMembersWorld = var0.isMembersOnly();
			boolean var1 = var0.isMembersOnly();
			if (var1 != HealthBarUpdate.ItemDefinition_inMembersWorld) {
				class190.method3773();
				HealthBarUpdate.ItemDefinition_inMembersWorld = var1;
			}
		}

		if (var0.properties != Client.worldProperties) {
			class213.method4205(class311.archive8, var0.properties);
		}

		class183.worldHost = var0.host;
		Client.worldId = var0.id;
		Client.worldProperties = var0.properties;
		class28.field152 = var0.field850;
		class211.worldPort = Client.gameBuild == 0 ? 43594 : var0.id + 40000;
		class150.js5Port = Client.gameBuild == 0 ? 443 : var0.id + 50000;
		class316.currentPort = class211.worldPort;
	}

	@ObfuscatedName("lc")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIIZI)V",
		garbageValue = "264064121"
	)
	@Export("insertMenuItem")
	static final void insertMenuItem(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
		if (!Client.isMenuOpen) {
			if (Client.menuOptionsCount < 500) {
				Client.menuActions[Client.menuOptionsCount] = var0;
				Client.menuTargets[Client.menuOptionsCount] = var1;
				Client.menuOpcodes[Client.menuOptionsCount] = var2;
				Client.menuIdentifiers[Client.menuOptionsCount] = var3;
				Client.menuArguments1[Client.menuOptionsCount] = var4;
				Client.menuArguments2[Client.menuOptionsCount] = var5;
				Client.menuItemIds[Client.menuOptionsCount] = var6;
				Client.menuShiftClick[Client.menuOptionsCount] = var7;
				++Client.menuOptionsCount;
			}

		}
	}
}
