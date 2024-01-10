import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oe")
public class class380 {
	@ObfuscatedName("wi")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("grandExchangeEvents")
	static GrandExchangeEvents grandExchangeEvents;
	@ObfuscatedName("ea")
	@ObfuscatedSignature(
		descriptor = "Lnp;"
	)
	@Export("widgetDefinition")
	static WidgetDefinition widgetDefinition;
	@ObfuscatedName("uz")
	@ObfuscatedGetter(
		intValue = 1957100689
	)
	static int field4416;

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1975063163"
	)
	public static int method7195(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}
}
