import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hp")
public class class206 extends DualNode {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Llm;"
	)
	@Export("field2026")
	static EvictingDualNodeHashTable field2026;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lvl;"
	)
	@Export("options_buttons_2Sprite")
	static IndexedSprite options_buttons_2Sprite;
	@ObfuscatedName("kw")
	@ObfuscatedGetter(
		intValue = 1143781377
	)
	@Export("cameraYaw")
	static int cameraYaw;

	static {
		field2026 = new EvictingDualNodeHashTable(64);
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Z",
		garbageValue = "-1562092460"
	)
	@Export("isNumber")
	public static boolean isNumber(CharSequence var0) {
		return GrandExchangeOfferUnitPriceComparator.method7427(var0, 10, true);
	}
}
