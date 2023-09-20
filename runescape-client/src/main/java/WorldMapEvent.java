import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("li")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 941661619
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmo;Lmo;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(Ldj;IIB)V",
		garbageValue = "124"
	)
	@Export("performPlayerAnimation")
	static void performPlayerAnimation(Player var0, int var1, int var2) {
		if (var0.sequence == var1 && var1 != -1) {
			int var3 = class36.SequenceDefinition_get(var1).field2340;
			if (var3 == 1) {
				var0.sequenceFrame = 0;
				var0.sequenceFrameCycle = 0;
				var0.sequenceDelay = var2;
				var0.field1235 = 0;
			}

			if (var3 == 2) {
				var0.field1235 = 0;
			}
		} else if (var1 == -1 || var0.sequence == -1 || class36.SequenceDefinition_get(var1).field2333 >= class36.SequenceDefinition_get(var0.sequence).field2333) {
			var0.sequence = var1;
			var0.sequenceFrame = 0;
			var0.sequenceFrameCycle = 0;
			var0.sequenceDelay = var2;
			var0.field1235 = 0;
			var0.field1261 = var0.pathLength;
		}

	}
}
