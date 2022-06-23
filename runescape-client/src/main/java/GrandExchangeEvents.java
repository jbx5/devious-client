import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.ArrayList;
import net.runelite.mapping.Implements;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import net.runelite.mapping.Export;
@ObfuscatedName("ls")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("v")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;

	@ObfuscatedName("q")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;

	@ObfuscatedName("f")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;

	@ObfuscatedName("j")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;

	@ObfuscatedName("c")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(descriptor = "(Lqt;Z)V", garbageValue = "1")
	public GrandExchangeEvents(Buffer var1, boolean var2) {
		int var3 = var1.readUnsignedShort();
		boolean var4 = var1.readUnsignedByte() == 1;
		byte var5;
		if (var4) {
			var5 = 1;
		} else {
			var5 = 0;
		}
		int var6 = var1.readUnsignedShort();
		this.events = new ArrayList(var6);
		for (int var7 = 0; var7 < var6; ++var7) {
			this.events.add(new GrandExchangeEvent(var1, var5, var3));
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(Ljava/util/Comparator;ZS)V", garbageValue = "-32109")
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.events, var1);
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1));
		}
	}
}