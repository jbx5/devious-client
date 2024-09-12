import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ic")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 514500651
	)
	@Export("z")
	int z;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -606604329
	)
	@Export("x")
	int x;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -661088295
	)
	@Export("y")
	int y;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lju;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		longValue = -1090932977685382519L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -297921825
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
