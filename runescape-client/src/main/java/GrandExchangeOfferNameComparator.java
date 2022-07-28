import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("lo")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llf;Llf;I)I", garbageValue = "-1021245934")
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II)Lpr;", garbageValue = "459953830")
	@Export("getDbRowType")
	public static DbRowType getDbRowType(int var0) {
		DbRowType var1 = ((DbRowType) (DbRowType.DBRowType_cache.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = DbRowType.field4691.takeFile(38, var0);
			var1 = new DbRowType();
			if (var2 != null) {
				var1.method7648(new Buffer(var2));
			}
			var1.method7637();
			DbRowType.DBRowType_cache.put(var1, ((long) (var0)));
			return var1;
		}
	}
}