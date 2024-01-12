import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mg")
public class class317 {
	@ObfuscatedName("wc")
	@Export("foundItemIds")
	static short[] foundItemIds;
	@ObfuscatedName("am")
	static int[] field3440;
	@ObfuscatedName("aj")
	static File field3441;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1906192385
	)
	public static int field3442;

	static {
		new Object();
		field3440 = new int[33];
		field3440[0] = 0;
		int var0 = 2;

		for (int var1 = 1; var1 < 33; ++var1) {
			field3440[var1] = var0 - 1;
			var0 += var0;
		}

	}

	@ObfuscatedName("iu")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-20"
	)
	static final void method6035() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var9 = Client.soundEffects[var0];
				if (var9 == null) {
					Object var10000 = null;
					var9 = SoundEffect.readSoundEffect(HttpContentType.field4844, Client.soundEffectIds[var0], 0);
					if (var9 == null) {
						continue;
					}

					int[] var14 = Client.queuedSoundEffectDelays;
					var14[var0] += var9.calculateDelay();
					Client.soundEffects[var0] = var9;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - KeyHandler.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - KeyHandler.localPlayer.y;
						if (var7 < 0) {
							var7 = -var7;
						}

						int var8 = var5 + var7 - 128;
						if (var8 > var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						if (var8 < 0) {
							var8 = 0;
						}

						var2 = (var3 - var8) * class93.clientPreferences.getAreaSoundEffectsVolume() / var3;
					} else {
						var2 = class93.clientPreferences.getSoundEffectsVolume();
					}

					if (var2 > 0) {
						RawSound var10 = var9.toRawSound().resample(UrlRequest.decimator);
						RawPcmStream var11 = RawPcmStream.createRawPcmStream(var10, 100, var2);
						var11.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						ClanSettings.pcmStreamMixer.addSubStream(var11);
					}

					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;

				for (int var1 = var0; var1 < Client.soundEffectCount; ++var1) {
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1];
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1];
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1];
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1];
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1];
				}

				--var0;
			}
		}

		if (Client.playingJingle) {
			boolean var12;
			if (!class319.field3462.isEmpty()) {
				var12 = true;
			} else if (!class319.musicSongs.isEmpty() && class319.musicSongs.get(0) != null && ((MusicSong)class319.musicSongs.get(0)).midiPcmStream != null) {
				var12 = ((MusicSong)class319.musicSongs.get(0)).midiPcmStream.isReady();
			} else {
				var12 = false;
			}

			if (!var12) {
				if (class93.clientPreferences.getMusicVolume() != 0) {
					boolean var13 = !class319.field3466.isEmpty();
					if (var13) {
						class221.method4364(WorldMapSection0.archive6, class93.clientPreferences.getMusicVolume());
					}
				}

				Client.playingJingle = false;
			}
		}

	}
}
