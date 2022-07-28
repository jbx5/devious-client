import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("il")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(Lhw;B)V", garbageValue = "11")
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIII)Z", garbageValue = "-1974716574")
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "819062651")
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(IIIB)[I", garbageValue = "24")
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(III)Lkp;", garbageValue = "-711503187")
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Lqw;B)V", garbageValue = "84")
	@Export("read")
	void read(Buffer var1);
}