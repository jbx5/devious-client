import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("im")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lht;I)V", garbageValue = "362337348")
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(IIIS)Z", garbageValue = "-6948")
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "-1464078865")
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(IIII)[I", garbageValue = "2119764221")
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)Lku;", garbageValue = "-1688632698")
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lqr;B)V", garbageValue = "-89")
	@Export("read")
	void read(Buffer var1);
}