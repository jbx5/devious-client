import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;I)I",
		garbageValue = "206382241"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName()); // L: 56
	}

	public boolean equals(Object var1) {
		return super.equals(var1); // L: 64
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2); // L: 60
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "-3"
	)
	public static int method6147(int var0) {
		if (var0 > 0) { // L: 184
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 185 186
		}
	}
}
