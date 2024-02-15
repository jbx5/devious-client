import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ka")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1645759743
	)
	@Export("z")
	int z;
	@ObfuscatedName("aw")
	@Export("x")
	int x;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -425014597
	)
	@Export("y")
	int y;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lky;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = 6282540839477725861L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 116812191
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
