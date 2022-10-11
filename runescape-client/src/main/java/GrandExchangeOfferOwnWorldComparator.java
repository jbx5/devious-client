import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bz")
@Implements("GrandExchangeOfferOwnWorldComparator")
public class GrandExchangeOfferOwnWorldComparator implements Comparator {
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1181098217
	)
	static int field487;
	@ObfuscatedName("c")
	@Export("filterWorlds")
	boolean filterWorlds;

	GrandExchangeOfferOwnWorldComparator() {
	} // L: 12256

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;S)I",
		garbageValue = "-28600"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		if (var2.world == var1.world) { // L: 12259
			return 0;
		} else {
			if (this.filterWorlds) { // L: 12260
				if (Client.worldId == var1.world) { // L: 12261
					return -1;
				}

				if (var2.world == Client.worldId) { // L: 12262
					return 1;
				}
			}

			return var1.world < var2.world ? -1 : 1; // L: 12264
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 12268
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 12272
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "-1739337975"
	)
	public static void method1185(boolean var0) {
		if (var0 != class17.ItemDefinition_inMembersWorld) { // L: 567
			ItemComposition.ItemDefinition_cached.clear(); // L: 569
			ItemComposition.ItemDefinition_cachedModels.clear(); // L: 570
			ItemComposition.ItemDefinition_cachedSprites.clear(); // L: 571
			class17.ItemDefinition_inMembersWorld = var0; // L: 573
		}

	} // L: 575

	@ObfuscatedName("kg")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "24"
	)
	static final void method1174(int var0) {
		var0 = Math.max(Math.min(var0, 100), 0); // L: 11574
		var0 = 100 - var0; // L: 11575
		float var1 = (float)var0 / 200.0F + 0.5F; // L: 11576
		class124.method2965((double)var1); // L: 11577
	} // L: 11578
}
