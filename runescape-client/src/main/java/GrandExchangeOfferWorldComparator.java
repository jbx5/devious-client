import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import java.util.Comparator;
import net.runelite.mapping.Export;
@ObfuscatedName("lg")
@Implements("GrandExchangeOfferWorldComparator")
final class GrandExchangeOfferWorldComparator implements Comparator {
	@ObfuscatedName("j")
	@Export("SpriteBuffer_spritePalette")
	static int[] SpriteBuffer_spritePalette;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Llf;Llf;I)I", garbageValue = "1269512647")
	@Export("compare_bridged")
	int compare_bridged(GrandExchangeEvent var1, GrandExchangeEvent var2) {
		return var1.world < var2.world ? -1 : var2.world == var1.world ? 0 : 1;
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged(((GrandExchangeEvent) (var1)), ((GrandExchangeEvent) (var2)));
	}
}