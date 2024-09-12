import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lf")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lky;I)V",
		garbageValue = "-1991951399"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)Z",
		garbageValue = "-644828112"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "2038421096"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "1"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(III)Lnm;",
		garbageValue = "1877296615"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Lvf;I)V",
		garbageValue = "814828591"
	)
	@Export("read")
	void read(Buffer var1);
}
