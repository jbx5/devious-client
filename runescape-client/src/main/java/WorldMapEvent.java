import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("la")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = 2032352393
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lnn;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILnn;Lnn;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "27188790"
	)
	static void method5834() {
		Iterator var0 = class321.musicSongs.iterator();

		while (true) {
			MusicSong var1;
			do {
				if (!var0.hasNext()) {
					class321.musicSongs.clear();
					return;
				}

				var1 = (MusicSong)var0.next();
			} while(var1 == null);

			var1.midiPcmStream.clear();
			var1.midiPcmStream.method6004();
			var1.midiPcmStream.setPcmStreamVolume(0);
			var1.midiPcmStream.field3534 = 0;
			int var2 = var1.musicTrackGroupId;
			int var3 = var1.musicTrackFileId;
			Iterator var4 = class321.field3499.iterator();

			while (var4.hasNext()) {
				class327 var5 = (class327)var4.next();
				var5.vmethod6187(var2, var3);
			}
		}
	}
}
