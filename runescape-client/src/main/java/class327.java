import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mx")
public class class327 {
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = 2065572541
	)
	static int field3558;

	@ObfuscatedName("ik")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-62"
	)
	static final void method6128() {
		int var1;
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var12 = Client.soundEffects[var0];
				if (var12 == null) {
					Object var10000 = null;
					var12 = SoundEffect.readSoundEffect(class424.field4703, Client.soundEffectIds[var0], 0);
					if (var12 == null) {
						continue;
					}

					int[] var18 = Client.queuedSoundEffectDelays;
					var18[var0] += var12.calculateDelay();
					Client.soundEffects[var0] = var12;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var13;
					if (Client.soundLocations[var0] != 0) {
						int var14 = (Client.soundLocations[var0] & 255) * 128;
						int var15 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = Math.abs(class376.method7084(var15) - SoundCache.localPlayer.x);
						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = Math.abs(class376.method7084(var6) - SoundCache.localPlayer.y);
						int var8 = Math.max(var5 + var7 - 128, 0);
						int var9 = Math.max(((Client.field668[var0] & 31) - 1) * 128, 0);
						if (var8 >= var14) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						float var10 = var9 < var14 ? Math.min(Math.max((float)(var14 - var8) / (float)(var14 - var9), 0.0F), 1.0F) : 1.0F;
						var13 = (int)(var10 * (float)class105.clientPreferences.getAreaSoundEffectsVolume());
					} else {
						var13 = class105.clientPreferences.getSoundEffectsVolume();
					}

					if (var13 > 0) {
						RawSound var3 = var12.toRawSound().resample(class177.decimator);
						RawPcmStream var4 = RawPcmStream.createRawPcmStream(var3, 100, var13);
						var4.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						class238.pcmStreamMixer.addSubStream(var4);
					}

					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;

				for (var1 = var0; var1 < Client.soundEffectCount; ++var1) {
					Client.soundEffectIds[var1] = Client.soundEffectIds[var1 + 1];
					Client.soundEffects[var1] = Client.soundEffects[var1 + 1];
					Client.queuedSoundEffectLoops[var1] = Client.queuedSoundEffectLoops[var1 + 1];
					Client.queuedSoundEffectDelays[var1] = Client.queuedSoundEffectDelays[var1 + 1];
					Client.soundLocations[var1] = Client.soundLocations[var1 + 1];
					Client.field668[var1] = Client.field668[var1 + 1];
				}

				--var0;
			}
		}

		if (Client.playingJingle && !ClanChannel.method3506()) {
			if (class105.clientPreferences.getMusicVolume() != 0 && class243.method4563()) {
				Archive var11 = class199.archive6;
				var1 = class105.clientPreferences.getMusicVolume();
				if (!class330.field3585.isEmpty()) {
					ArrayList var2 = new ArrayList();
					Iterator var16 = class330.field3585.iterator();

					while (var16.hasNext()) {
						MusicSong var17 = (MusicSong)var16.next();
						var17.field3710 = false;
						var17.field3709 = false;
						var17.field3715 = false;
						var17.field3712 = false;
						var17.musicTrackArchive = var11;
						var17.musicTrackVolume = var1;
						var17.field3704 = 0.0F;
						var2.add(var17);
					}

					FontName.method9220(var2, class330.musicPlayerStatus, class330.field3589, class330.field3590, class330.field3586, false);
				}
			}

			Client.playingJingle = false;
		}

	}
}
