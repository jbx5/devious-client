import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("lr")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llf;Llf;I)I", garbageValue = "1428796133")
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1;
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(IB)I", garbageValue = "-127")
	public static int method6053(int var0) {
		return var0 != 0 && var0 != 1 ? -1 : 0;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I)[Lok;", garbageValue = "-735776287")
	static class391[] method6054() {
		return new class391[]{ class391.field4431, class391.field4433, class391.field4430, class391.field4428 };
	}
}