import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oj")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Log;Log;I)I",
		garbageValue = "-602639414"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(II)Luw;",
		garbageValue = "1457262054"
	)
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = (DbRowType)DbRowType.DBRowType_cache.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field5175.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method9168(new Buffer(var2));
			}

			var1.method9170();
			DbRowType.DBRowType_cache.put(var1, (long)var0);
			return var1;
		}
	}
}
