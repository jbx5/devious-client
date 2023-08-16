import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
@Implements("WorldMapEvent")
public class WorldMapEvent {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 397416983
	)
	@Export("mapElement")
	public int mapElement;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("coord1")
	public Coord coord1;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmc;"
	)
	@Export("coord2")
	public Coord coord2;

	@ObfuscatedSignature(
		descriptor = "(ILmc;Lmc;)V"
	)
	public WorldMapEvent(int var1, Coord var2, Coord var3) {
		this.mapElement = var1;
		this.coord1 = var2;
		this.coord2 = var3;
	}

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "307364041"
	)
	@Export("setMusicVolume")
	static final void setMusicVolume(int var0) {
		var0 = Math.min(Math.max(var0, 0), 255);
		if (var0 != class449.clientPreferences.method2451()) {
			label42: {
				if (class449.clientPreferences.method2451() == 0) {
					boolean var1 = !class305.field3405.isEmpty();
					if (var1) {
						Archive var2 = class385.archive6;
						if (!class305.field3405.isEmpty()) {
							ArrayList var3 = new ArrayList();
							Iterator var4 = class305.field3405.iterator();

							while (var4.hasNext()) {
								MusicSong var5 = (MusicSong)var4.next();
								var5.field3518 = false;
								var5.field3516 = false;
								var5.field3524 = false;
								var5.field3519 = false;
								var5.musicTrackArchive = var2;
								var5.musicTrackVolume = var0;
								var5.field3510 = 0.0F;
								var3.add(var5);
							}

							class53.method1097(var3, class305.musicPlayerStatus, class305.field3409, class305.field3410, class305.field3401, false);
						}

						Client.playingJingle = false;
						break label42;
					}
				}

				if (var0 == 0) {
					Script.method2180(0, 0);
					Client.playingJingle = false;
				} else {
					class300.method5718(var0);
				}
			}

			class449.clientPreferences.method2458(var0);
		}

	}
}
