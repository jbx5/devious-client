import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ng")
@Implements("GrandExchangeEvents")
public class GrandExchangeEvents {
	@ObfuscatedName("ay")
	@Export("GrandExchangeEvents_ageComparator")
	public static Comparator GrandExchangeEvents_ageComparator;
	@ObfuscatedName("ar")
	@Export("GrandExchangeEvents_priceComparator")
	public static Comparator GrandExchangeEvents_priceComparator;
	@ObfuscatedName("am")
	@Export("GrandExchangeEvents_nameComparator")
	public static Comparator GrandExchangeEvents_nameComparator;
	@ObfuscatedName("as")
	@Export("GrandExchangeEvents_quantityComparator")
	public static Comparator GrandExchangeEvents_quantityComparator;
	@ObfuscatedName("aw")
	@Export("events")
	public final List events;

	static {
		GrandExchangeEvents_ageComparator = new GrandExchangeOfferAgeComparator();
		new GrandExchangeOfferWorldComparator();
		GrandExchangeEvents_priceComparator = new GrandExchangeOfferUnitPriceComparator();
		GrandExchangeEvents_nameComparator = new GrandExchangeOfferNameComparator();
		GrandExchangeEvents_quantityComparator = new GrandExchangeOfferTotalQuantityComparator();
	}

	@ObfuscatedSignature(
		descriptor = "(Lty;Z)V",
		garbageValue = "1"
	)
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

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/util/Comparator;ZI)V",
		garbageValue = "97179778"
	)
	@Export("sort")
	public void sort(Comparator var1, boolean var2) {
		if (var2) {
			Collections.sort(this.events, var1);
		} else {
			Collections.sort(this.events, Collections.reverseOrder(var1));
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-93"
	)
	@Export("savePreferences")
	static void savePreferences() {
		AccessFile var0 = null;

		try {
			var0 = Decimator.getPreferencesFile("", KeyHandler.field138.name, true);
			Buffer var1 = class150.clientPreferences.toBuffer();
			var0.write(var1.array, 0, var1.offset);
		} catch (Exception var3) {
		}

		try {
			if (var0 != null) {
				var0.closeSync(true);
			}
		} catch (Exception var2) {
		}

	}

	@ObfuscatedName("hw")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "40"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		WorldMapScaleHandler.logOut();
		switch(var0) {
		case 1:
			class328.method6115(24);
			Actor.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			class328.method6115(24);
			Actor.setLoginResponseString("The game servers are currently being updated.", "Please wait a few minutes and try again.", "");
		}

	}
}
