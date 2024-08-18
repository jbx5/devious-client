import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ls")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lku;I)V",
		garbageValue = "1421552299"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "1107005253"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIB)Z",
		garbageValue = "34"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "63"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Lnv;",
		garbageValue = "-554690101"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Lvg;I)V",
		garbageValue = "-597206269"
	)
	@Export("read")
	void read(Buffer var1);
}
