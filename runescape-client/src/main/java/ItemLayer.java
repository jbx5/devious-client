import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kz")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -612752779
	)
	@Export("z")
	int z;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -235929600
	)
	@Export("x")
	int x;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1448069827
	)
	@Export("y")
	int y;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lkp;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		longValue = -5128273485840900591L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 1921801005
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
