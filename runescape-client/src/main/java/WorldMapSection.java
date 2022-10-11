import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lht;I)V",
		garbageValue = "1697283195"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "-24"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-428509434"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-81"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(III)Lkz;",
		garbageValue = "244140613"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Lqq;I)V",
		garbageValue = "53690591"
	)
	@Export("read")
	void read(Buffer var1);
}
