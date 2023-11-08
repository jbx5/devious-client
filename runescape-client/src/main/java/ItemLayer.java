import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kj")
@Implements("ItemLayer")
public final class ItemLayer {
	@ObfuscatedName("ht")
	static String field2655;
	@ObfuscatedName("jv")
	@ObfuscatedSignature(
		descriptor = "Lpf;"
	)
	@Export("fontPlain12")
	static Font fontPlain12;
	@ObfuscatedName("kr")
	@ObfuscatedSignature(
		descriptor = "Luz;"
	)
	@Export("compass")
	static SpritePixels compass;
	@ObfuscatedName("mr")
	@ObfuscatedGetter(
		intValue = -825074063
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -162293575
	)
	@Export("z")
	int z;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 195005795
	)
	@Export("x")
	int x;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 185597952
	)
	@Export("y")
	int y;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("first")
	Renderable first;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("second")
	Renderable second;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkt;"
	)
	@Export("third")
	Renderable third;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		longValue = -3344454084756600557L
	)
	@Export("tag")
	long tag;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1481862157
	)
	@Export("height")
	int height;

	ItemLayer() {
	}
}
