import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("it")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("g")
	@ObfuscatedSignature(descriptor = 
	"Lje;")

	@Export("midiPcmStream")
	public static MidiPcmStream midiPcmStream;
	@ObfuscatedName("gt")
	@ObfuscatedSignature(descriptor = 
	"Lfn;")

	@Export("socketTask")
	static Task socketTask;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	814110167)

	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"Lko;")

	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"Lko;")

	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(descriptor = 
	"(ILko;Lko;)V")

	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = 
	"(IIIIS)V", garbageValue = 
	"1302")

	static final void method5136(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= (var3 + var1); ++var4) {
			for (int var5 = var0; var5 <= (var0 + var2); ++var5) {
				if ((((var5 >= 0) && (var5 < 104)) && (var4 >= 0)) && (var4 < 104)) {
					GrandExchangeOfferNameComparator.field4010[0][var5][var4] = 127;
					if ((var0 == var5) && (var5 > 0)) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}

					if ((var5 == (var0 + var2)) && (var5 < 103)) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}

					if ((var4 == var1) && (var4 > 0)) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}

					if (((var3 + var1) == var4) && (var4 < 103)) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}

	}
}