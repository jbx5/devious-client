import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ov")
@Implements("GrandExchangeOfferUnitPriceComparator")
final class GrandExchangeOfferUnitPriceComparator implements Comparator {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lol;Lol;I)I",
		garbageValue = "693078358"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.grandExchangeOffer.unitPrice < var2.grandExchangeOffer.unitPrice ? -1 : (var2.grandExchangeOffer.unitPrice == var1.grandExchangeOffer.unitPrice ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "17"
	)
	public static int method6962(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-890105680"
	)
	@Export("ByteArrayPool_release")
	public static synchronized void ByteArrayPool_release(byte[] var0) {
		if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4548) {
			ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
		} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4549) {
			ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
		} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4544) {
			ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
		} else if (var0.length == 30000 && ByteArrayPool.field4547 < ByteArrayPool.field4555) {
			ByteArrayPool.field4551[++ByteArrayPool.field4547 - 1] = var0;
		} else {
			if (class152.ByteArrayPool_arrays != null) {
				for (int var1 = 0; var1 < ByteArrayPool.ByteArrayPool_alternativeSizes.length; ++var1) {
					if (var0.length == ByteArrayPool.ByteArrayPool_alternativeSizes[var1] && class125.ByteArrayPool_altSizeArrayCounts[var1] < class152.ByteArrayPool_arrays[var1].length) {
						class152.ByteArrayPool_arrays[var1][class125.ByteArrayPool_altSizeArrayCounts[var1]++] = var0;
						return;
					}
				}
			}

		}
	}
}
