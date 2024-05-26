import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("pu")
@Implements("GrandExchangeOfferNameComparator")
final class GrandExchangeOfferNameComparator implements Comparator {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lpm;Lpm;I)I",
		garbageValue = "-1795325400"
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

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2010055297"
	)
	static void method7382() {
		Tiles.Tiles_minPlane = 99;
		class197.Tiles_underlays = new short[4][104][104];
		Tiles.Tiles_overlays = new short[4][104][104];
		class253.Tiles_shapes = new byte[4][104][104];
		AbstractByteArrayCopier.field3975 = new byte[4][104][104];
		SongTask.field4795 = new int[4][105][105];
		class202.Tiles_underlays2 = new byte[4][105][105];
		class17.field84 = new int[105][105];
		ParamComposition.Tiles_hue = new int[104];
		class194.Tiles_saturation = new int[104];
		Tiles.Tiles_lightness = new int[104];
		class131.Tiles_hueMultiplier = new int[104];
		Tiles.field1050 = new int[104];
	}
}
