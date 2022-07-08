import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("lv")
@Implements("GrandExchangeOfferTotalQuantityComparator")
final class GrandExchangeOfferTotalQuantityComparator implements Comparator {
	@ObfuscatedName("bv")
	static String field4045;

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Llj;Llj;I)I", garbageValue = "1878854014")
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.totalQuantity < var2.grandExchangeOffer.totalQuantity ? -1 : var2.grandExchangeOffer.totalQuantity == var1.grandExchangeOffer.totalQuantity ? 0 : 1;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = "(II)V", garbageValue = "285627704")
	static void method5969(int var0) {
		ItemContainer var1 = ((ItemContainer) (ItemContainer.itemContainers.get(((long) (var0)))));
		if (var1 != null) {
			var1.remove();
		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(descriptor = "(Lcj;I)V", garbageValue = "-1624008508")
	static final void method5970(Actor var0) {
		int var1 = Math.max(1, var0.field1184 - Client.cycle);
		int var2 = var0.field1205 * 64 + var0.field1140 * 128;
		int var3 = var0.field1205 * 64 + var0.field1182 * 128;
		var0.x += (var2 - var0.x) / var1;
		var0.y += (var3 - var0.y) / var1;
		var0.field1202 = 0;
		var0.orientation = var0.field1186;
	}
}