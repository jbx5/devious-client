import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ll")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lkz;I)V",
		garbageValue = "45239804"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1685132689"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "1460062086"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIII)[I",
		garbageValue = "-1177670631"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(III)Lnj;",
		garbageValue = "-2141859493"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(Lua;B)V",
		garbageValue = "-78"
	)
	@Export("read")
	void read(Buffer var1);
}
