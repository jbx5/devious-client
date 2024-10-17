import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pw")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	@Export("KitDefinition_modelsArchive")
	public static AbstractArchive KitDefinition_modelsArchive;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lpe;"
	)
	public static AbstractArchive field4643;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpv;B)I",
		garbageValue = "-48"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : (var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(Ldn;IIB)V",
		garbageValue = "-114"
	)
	@Export("updateItemPile3")
	static final void updateItemPile3(WorldView var0, int var1, int var2) {
		class224.updateItemPile2(var0, var0.plane, var1, var2);
	}
}
