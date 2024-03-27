import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bs")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
	@ObfuscatedName("wh")
	@ObfuscatedGetter(
		intValue = 161780905
	)
	@Export("foundItemIdCount")
	static int foundItemIdCount;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -1102759223
	)
	@Export("loginBoxCenter")
	static int loginBoxCenter;
	@ObfuscatedName("ul")
	@ObfuscatedGetter(
		intValue = -1220442589
	)
	static int field244;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -501813555
	)
	@Export("id")
	int id;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 522886235
	)
	@Export("size")
	int size;
	@ObfuscatedName("af")
	@Export("operations")
	int[] operations;
	@ObfuscatedName("at")
	@Export("creationErrors")
	int[] creationErrors;
	@ObfuscatedName("an")
	@Export("fields")
	Field[] fields;
	@ObfuscatedName("ao")
	@Export("intReplaceValues")
	int[] intReplaceValues;
	@ObfuscatedName("ab")
	@Export("methods")
	Method[] methods;
	@ObfuscatedName("aw")
	@Export("arguments")
	byte[][][] arguments;

	ReflectionCheck() {
	}

	@ObfuscatedName("he")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "570300148"
	)
	static final void method670() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var11 = Client.soundEffects[var0];
				if (var11 == null) {
					Object var10000 = null;
					var11 = SoundEffect.readSoundEffect(class141.field1669, Client.soundEffectIds[var0], 0);
					if (var11 == null) {
						continue;
					}

					int[] var16 = Client.queuedSoundEffectDelays;
					var16[var0] += var11.calculateDelay();
					Client.soundEffects[var0] = var11;
				}

				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = Math.abs(var4 * 128 + 64 - class133.localPlayer.x);
						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = Math.abs(var6 * 128 + 64 - class133.localPlayer.y);
						int var8 = Math.max(var7 + var5 - 128, 0);
						int var9 = Math.max(((Client.field770[var0] & 31) - 1) * 128, 0);
						if (var8 >= var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						float var10 = var9 < var3 ? Math.min(Math.max((float)(var3 - var8) / (float)(var3 - var9), 0.0F), 1.0F) : 1.0F;
						var2 = (int)(var10 * (float)NPC.clientPreferences.getAreaSoundEffectsVolume());
					} else {
						var2 = NPC.clientPreferences.getSoundEffectsVolume();
					}

					if (var2 > 0) {
						RawSound var12 = var11.toRawSound().resample(class86.decimator);
						RawPcmStream var13 = RawPcmStream.createRawPcmStream(var12, 100, var2);
						var13.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						HealthBarUpdate.pcmStreamMixer.addSubStream(var13);
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
					Client.field770[var1] = Client.field770[var1 + 1];
				}

				--var0;
			}
		}

		if (Client.playingJingle) {
			boolean var14;
			if (!class321.field3498.isEmpty()) {
				var14 = true;
			} else if (!class321.musicSongs.isEmpty() && class321.musicSongs.get(0) != null && ((MusicSong)class321.musicSongs.get(0)).midiPcmStream != null) {
				var14 = ((MusicSong)class321.musicSongs.get(0)).midiPcmStream.isReady();
			} else {
				var14 = false;
			}

			if (!var14) {
				if (NPC.clientPreferences.getMusicVolume() != 0) {
					boolean var15 = !class321.field3496.isEmpty();
					if (var15) {
						class190.method3711(UserComparator6.archive6, NPC.clientPreferences.getMusicVolume());
					}
				}

				Client.playingJingle = false;
			}
		}

	}

	@ObfuscatedName("nc")
	static final void method669(double var0) {
		Rasterizer3D.method4564(var0);
		((TextureProvider)Rasterizer3D.clips.Rasterizer3D_textureLoader).setBrightness(var0);
		if (ModeWhere.worldMap != null) {
			ModeWhere.worldMap.method8728();
		}

		ItemComposition.ItemDefinition_cachedSprites.clear();
		NPC.clientPreferences.updateBrightness(var0);
	}
}
