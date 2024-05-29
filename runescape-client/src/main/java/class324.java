import java.util.HashMap;
import java.util.TimeZone;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("me")
public final class class324 {
	@ObfuscatedName("aj")
	static final HashMap field3550;
	@ObfuscatedName("eg")
	@ObfuscatedSignature(
		descriptor = "Lot;"
	)
	static Archive field3552;

	static {
		field3550 = new HashMap();
		TimeZone var0;
		synchronized(field3550) {
			TimeZone var2 = (TimeZone)field3550.get("Europe/London");
			if (var2 == null) {
				var2 = TimeZone.getTimeZone("Europe/London");
				field3550.put("Europe/London", var2);
			}

			var0 = var2;
		}

		java.util.Calendar.getInstance(var0);
	}

	@ObfuscatedName("nt")
	@ObfuscatedSignature(
		descriptor = "(Lnb;I)V",
		garbageValue = "9637510"
	)
	@Export("invalidateWidget")
	public static void invalidateWidget(Widget var0) {
		if (var0 != null && var0.cycle == Client.field600) {
			Client.validRootWidgets[var0.rootIndex] = true;
		}

	}
}
