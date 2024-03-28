import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jo")
@Implements("Occluder")
public final class Occluder {
	@ObfuscatedName("bq")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 1792594373
	)
	@Export("minTileX")
	int minTileX;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1966375909
	)
	@Export("maxTileX")
	int maxTileX;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 335146951
	)
	@Export("minTileY")
	int minTileY;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -524388883
	)
	@Export("maxTileY")
	int maxTileY;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 879712363
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -541373797
	)
	@Export("minX")
	int minX;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1903069961
	)
	@Export("maxX")
	int maxX;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -619378321
	)
	@Export("minZ")
	int minZ;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 1348505357
	)
	@Export("maxZ")
	int maxZ;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1085992831
	)
	@Export("minY")
	int minY;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 1767305469
	)
	@Export("maxY")
	int maxY;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1472768343
	)
	int field2735;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 495265463
	)
	int field2740;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 1600859245
	)
	int field2737;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -642164565
	)
	int field2738;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1984607757
	)
	int field2739;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -572021331
	)
	int field2724;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -351512567
	)
	int field2731;

	Occluder() {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lfm;FI)F",
		garbageValue = "1485039685"
	)
	static float method4897(class131 var0, float var1) {
		if (var0 == null) {
			return 0.0F;
		} else {
			float var2 = var1 - var0.field1560;
			return var0.field1569 + ((var0.field1580 + var0.field1581 * var2) * var2 + var0.field1564) * var2;
		}
	}
}
