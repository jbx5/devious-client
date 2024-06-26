import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kb")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 845387785
	)
	@Export("z")
	int z;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 2112959527
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -2058003033
	)
	@Export("y")
	int y;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 3447870506361825999L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("av")
	@ObfuscatedGetter(
		intValue = -1485755687
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
