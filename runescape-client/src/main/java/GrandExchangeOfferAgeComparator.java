import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.net.URI;
import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pc")
@Implements("GrandExchangeOfferAgeComparator")
final class GrandExchangeOfferAgeComparator implements Comparator {
	@ObfuscatedName("un")
	@ObfuscatedGetter(
		intValue = -1987291449
	)
	static int field4651;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lpv;Lpv;I)I",
		garbageValue = "-410808225"
	)
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.age < var2.age ? -1 : (var2.age == var1.age ? 0 : 1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((GrandExchangeEvent)var1, (GrandExchangeEvent)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZB)V",
		garbageValue = "126"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) {
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) {
				try {
					Desktop.getDesktop().browse(new URI(var0));
					return;
				} catch (Exception var4) {
				}
			}

			if (class31.field134.startsWith("win")) {
				class92.method2584(var0, 0);
			} else if (class31.field134.startsWith("mac")) {
				AsyncHttpResponse.method277(var0, 1, "openjs");
			} else {
				class92.method2584(var0, 2);
			}
		} else {
			class92.method2584(var0, 3);
		}

	}
}
