import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kd")
@Implements("WorldMapSection")
public interface WorldMapSection {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(Ljm;I)V",
		garbageValue = "1568670940"
	)
	@Export("expandBounds")
	void expandBounds(WorldMapArea var1);

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Z",
		garbageValue = "115"
	)
	@Export("containsCoord")
	boolean containsCoord(int var1, int var2, int var3);

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-898385408"
	)
	@Export("containsPosition")
	boolean containsPosition(int var1, int var2);

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IIIB)[I",
		garbageValue = "-35"
	)
	@Export("getBorderTileLengths")
	int[] getBorderTileLengths(int var1, int var2, int var3);

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)Lnl;",
		garbageValue = "-55064754"
	)
	@Export("coord")
	Coord coord(int var1, int var2);

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lvp;I)V",
		garbageValue = "301668137"
	)
	@Export("read")
	void read(Buffer var1);
}
