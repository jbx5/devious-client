import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kk")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -199471253
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lns;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILns;Lns;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}
}
