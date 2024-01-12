import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
public class class189 extends DualNode {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Llq;"
	)
	@Export("Widget_cachedSpriteMasks")
	public static EvictingDualNodeHashTable Widget_cachedSpriteMasks;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1954197098
	)
	public static int field1993;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1843088055
	)
	@Export("cacheGamebuild")
	static int cacheGamebuild;
	@ObfuscatedName("fg")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	@Export("archive10")
	static Archive archive10;
	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "Loz;"
	)
	static Archive field1999;

	static {
		Widget_cachedSpriteMasks = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1866297780"
	)
	public static int method3782(int var0, int var1) {
		return (int)(Math.atan2((double)var0, (double)var1) * 325.94932345220167D) & 2047;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIIB)I",
		garbageValue = "-63"
	)
	static int method3781(int var0, int var1, int var2) {
		if (var2 > 179) {
			var1 /= 2;
		}

		if (var2 > 192) {
			var1 /= 2;
		}

		if (var2 > 217) {
			var1 /= 2;
		}

		if (var2 > 243) {
			var1 /= 2;
		}

		int var3 = (var1 / 32 << 7) + (var0 / 4 << 10) + var2 / 2;
		return var3;
	}

	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1281145259"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close();
		LoginPacket.clear();
		GrandExchangeOfferOwnWorldComparator.scene.clear();

		for (int var0 = 0; var0 < 4; ++var0) {
			Client.collisionMaps[var0].clear();
		}

		Client.field608.method4407();
		System.gc();
		Actor.method2488(0, 0);
		FontName.method9049();
		Client.playingJingle = false;
		WorldMapSection1.method5058();
		class131.updateGameState(10);
		KitDefinition.method3664().method4283();
		KitDefinition.method3664().method4284();
	}
}
