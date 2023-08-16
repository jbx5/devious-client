import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("av")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("wb")
	@ObfuscatedSignature(
		descriptor = "Lsi;"
	)
	@Export("worldMap")
	static WorldMap worldMap;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		longValue = 6865685735894550463L
	)
	static long field114;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lbe;"
	)
	@Export("soundSystem")
	static SoundSystem soundSystem;
	@ObfuscatedName("pr")
	@ObfuscatedGetter(
		intValue = -395313837
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("au")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1;
	}

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	public final void update(Graphics var1) {
		this.component.update(var1);
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1772266899"
	)
	static final void method324() {
		int var3;
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var9 = Client.soundEffects[var0];
				if (var9 == null) {
					Object var10000 = null;
					var9 = SoundEffect.readSoundEffect(class28.field161, Client.soundEffectIds[var0], 0);
					if (var9 == null) {
						continue;
					}

					int[] var18 = Client.queuedSoundEffectDelays;
					var18[var0] += var9.calculateDelay();
					Client.soundEffects[var0] = var9;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var10;
					if (Client.soundLocations[var0] != 0) {
						var3 = (Client.soundLocations[var0] & 255) * 128;
						int var11 = Client.soundLocations[var0] >> 16 & 255;
						int var12 = var11 * 128 + 64 - VarbitComposition.localPlayer.x;
						if (var12 < 0) {
							var12 = -var12;
						}

						int var13 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var13 * 128 + 64 - VarbitComposition.localPlayer.y;
						if (var7 < 0) {
							var7 = -var7;
						}

						int var8 = var7 + var12 - 128;
						if (var8 > var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						if (var8 < 0) {
							var8 = 0;
						}

						var10 = (var3 - var8) * class449.clientPreferences.method2554() / var3;
					} else {
						var10 = class449.clientPreferences.method2462();
					}

					if (var10 > 0) {
						RawSound var14 = var9.toRawSound().resample(class330.decimator);
						RawPcmStream var4 = RawPcmStream.createRawPcmStream(var14, 100, var10);
						var4.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						class162.pcmStreamMixer.addSubStream(var4);
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
			boolean var15;
			if (!class305.field3406.isEmpty()) {
				var15 = true;
			} else if (!class305.musicSongs.isEmpty() && class305.musicSongs.get(0) != null && ((MusicSong)class305.musicSongs.get(0)).midiPcmStream != null) {
				var15 = ((MusicSong)class305.musicSongs.get(0)).midiPcmStream.isReady();
			} else {
				var15 = false;
			}

			if (!var15) {
				if (class449.clientPreferences.method2451() != 0) {
					boolean var16 = !class305.field3405.isEmpty();
					if (var16) {
						Archive var2 = class385.archive6;
						var3 = class449.clientPreferences.method2451();
						if (!class305.field3405.isEmpty()) {
							ArrayList var17 = new ArrayList();
							Iterator var5 = class305.field3405.iterator();

							while (var5.hasNext()) {
								MusicSong var6 = (MusicSong)var5.next();
								var6.field3518 = false;
								var6.field3516 = false;
								var6.field3524 = false;
								var6.field3519 = false;
								var6.musicTrackArchive = var2;
								var6.musicTrackVolume = var3;
								var6.field3510 = 0.0F;
								var17.add(var6);
							}

							class53.method1097(var17, class305.musicPlayerStatus, class305.field3409, class305.field3410, class305.field3401, false);
						}
					}
				}

				Client.playingJingle = false;
			}
		}

	}
}
