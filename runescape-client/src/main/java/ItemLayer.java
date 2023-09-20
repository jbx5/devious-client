import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jc")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1568150949
	)
	@Export("z")
	int z;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 175147715
	)
	@Export("x")
	int x;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1790540369
	)
	@Export("y")
	int y;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Ljy;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 5336565767752743133L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 2111189233
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
