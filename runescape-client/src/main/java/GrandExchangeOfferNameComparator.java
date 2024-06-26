import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pv")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;I)I",
		garbageValue = "-1760951308"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.getOfferName().compareTo(var2.getOfferName());
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/String;",
		garbageValue = "1502544286"
	)
	public static String method7325(String var0) {
		StringBuilder var1 = new StringBuilder(var0.length());
		int var2 = 0;
		int var3 = -1;

		for (int var4 = 0; var4 < var0.length(); ++var4) {
			char var5 = var0.charAt(var4);
			if (var5 == '<') {
				var1.append(var0.substring(var2, var4));
				var3 = var4;
			} else if (var5 == '>' && var3 != -1) {
				String var6 = var0.substring(var3 + 1, var4);
				var3 = -1;
				if (var6.equals("lt")) {
					var1.append("<");
				} else if (var6.equals("gt")) {
					var1.append(">");
				} else if (var6.equals("br")) {
					var1.append("\n");
				}

				var2 = var4 + 1;
			}
		}

		if (var2 < var0.length()) {
			var1.append(var0.substring(var2, var0.length()));
		}

		return var1.toString();
	}

	@ObfuscatedName("km")
	@ObfuscatedSignature(
		descriptor = "(Lde;Ldw;IB)V",
		garbageValue = "98"
	)
	static void method7320(WorldView var0, Actor var1, int var2) {
		Coord var3 = var1.method2488(var0);
		class426.worldToScreen(var0, var3.x, var3.y, var1.x, var1.y, var2);
	}
}
