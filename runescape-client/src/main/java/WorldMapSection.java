import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lv")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lkp;I)V",
		garbageValue = "-1801855578"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-1302944886"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "-75"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "114"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(III)Lnn;",
		garbageValue = "-246633808"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lvl;I)V",
		garbageValue = "2108862730"
	)
	@Export("read")
	void read(Buffer var1);
}
