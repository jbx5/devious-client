import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("iw")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("h")
	public static short[] field2881;

	@ObfuscatedName("o")
	@ObfuscatedGetter(intValue = 1503062755)
	@Export("mapElement")
	public int mapElement;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Lkp;")
	@Export("coord1")
	public Coord coord1;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lkp;")
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(descriptor = "(ILkp;Lkp;)V")
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}
}