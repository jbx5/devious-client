import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("hx")
@Implements("ModelData0")
public class ModelData0 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -2071887987)
	@Export("SpriteBuffer_spriteWidth")
	static int SpriteBuffer_spriteWidth;

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "Law;")
	@Export("pcmPlayerProvider")
	static class47 pcmPlayerProvider;

	@ObfuscatedName("az")
	@Export("hasFocus")
	protected static boolean hasFocus;

	ModelData0() {
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(Lpq;II)Z", garbageValue = "215126751")
	@Export("updateExternalPlayer")
	static boolean updateExternalPlayer(PacketBuffer var0, int var1) {
		int var2 = var0.readBits(2);
		int var3;
		int var4;
		int var7;
		int var8;
		int var9;
		int var10;
		if (var2 == 0) {
			if (var0.readBits(1) != 0) {
				updateExternalPlayer(var0, var1);
			}
			var3 = var0.readBits(13);
			var4 = var0.readBits(13);
			boolean var12 = var0.readBits(1) == 1;
			if (var12) {
				Players.Players_pendingUpdateIndices[++Players.Players_pendingUpdateCount - 1] = var1;
			}
			if (Client.players[var1] != null) {
				throw new RuntimeException();
			} else {
				Player var11 = Client.players[var1] = new Player();
				var11.index = var1;
				if (Players.field1307[var1] != null) {
					var11.read(Players.field1307[var1]);
				}
				var11.orientation = Players.Players_orientations[var1];
				var11.targetIndex = Players.Players_targetIndices[var1];
				var7 = Players.Players_regions[var1];
				var8 = var7 >> 28;
				var9 = var7 >> 14 & 255;
				var10 = var7 & 255;
				var11.pathTraversed[0] = Players.field1304[var1];
				var11.plane = ((byte) (var8));
				var11.resetPath((var9 << 13) + var3 - class28.baseX, (var10 << 13) + var4 - WorldMapLabelSize.baseY);
				var11.field1088 = false;
				return true;
			}
		} else if (var2 == 1) {
			var3 = var0.readBits(2);
			var4 = Players.Players_regions[var1];
			Players.Players_regions[var1] = (((var4 >> 28) + var3 & 3) << 28) + (var4 & 268435455);
			return false;
		} else {
			int var5;
			int var6;
			if (var2 == 2) {
				var3 = var0.readBits(5);
				var4 = var3 >> 3;
				var5 = var3 & 7;
				var6 = Players.Players_regions[var1];
				var7 = (var6 >> 28) + var4 & 3;
				var8 = var6 >> 14 & 255;
				var9 = var6 & 255;
				if (var5 == 0) {
					--var8;
					--var9;
				}
				if (var5 == 1) {
					--var9;
				}
				if (var5 == 2) {
					++var8;
					--var9;
				}
				if (var5 == 3) {
					--var8;
				}
				if (var5 == 4) {
					++var8;
				}
				if (var5 == 5) {
					--var8;
					++var9;
				}
				if (var5 == 6) {
					++var9;
				}
				if (var5 == 7) {
					++var8;
					++var9;
				}
				Players.Players_regions[var1] = (var8 << 14) + var9 + (var7 << 28);
				return false;
			} else {
				var3 = var0.readBits(18);
				var4 = var3 >> 16;
				var5 = var3 >> 8 & 255;
				var6 = var3 & 255;
				var7 = Players.Players_regions[var1];
				var8 = (var7 >> 28) + var4 & 3;
				var9 = var5 + (var7 >> 14) & 255;
				var10 = var6 + var7 & 255;
				Players.Players_regions[var1] = (var9 << 14) + var10 + (var8 << 28);
				return false;
			}
		}
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "1")
	static final void method4532() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var1 = Client.soundEffects[var0];
				if (var1 == null) {
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(Client.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) {
						continue;
					}
					int[] var13 = Client.queuedSoundEffectDelays;
					var13[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1;
				}
				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - class101.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}
						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - class101.localPlayer.y;
						if (var7 < 0) {
							var7 = -var7;
						}
						int var8 = var7 + var5 - 128;
						if (var8 > var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}
						if (var8 < 0) {
							var8 = 0;
						}
						var2 = (var3 - var8) * class19.clientPreferences.method2262() / var3;
					} else {
						var2 = class19.clientPreferences.method2241();
					}
					if (var2 > 0) {
						RawSound var9 = var1.toRawSound().resample(WorldMapRegion.decimator);
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						class21.pcmStreamMixer.addSubStream(var10);
					}
					Client.queuedSoundEffectDelays[var0] = -100;
				}
			} else {
				--Client.soundEffectCount;
				for (int var11 = var0; var11 < Client.soundEffectCount; ++var11) {
					Client.soundEffectIds[var11] = Client.soundEffectIds[var11 + 1];
					Client.soundEffects[var11] = Client.soundEffects[var11 + 1];
					Client.queuedSoundEffectLoops[var11] = Client.queuedSoundEffectLoops[var11 + 1];
					Client.queuedSoundEffectDelays[var11] = Client.queuedSoundEffectDelays[var11 + 1];
					Client.soundLocations[var11] = Client.soundLocations[var11 + 1];
				}
				--var0;
			}
		}
		if (Client.playingJingle) {
			boolean var12;
			if (class272.musicPlayerStatus != 0) {
				var12 = true;
			} else {
				var12 = class272.midiPcmStream.isReady();
			}
			if (!var12) {
				if (class19.clientPreferences.method2258() != 0 && Client.currentTrackGroupId != -1) {
					AttackOption.method2410(class121.archive6, Client.currentTrackGroupId, 0, class19.clientPreferences.method2258(), false);
				}
				Client.playingJingle = false;
			}
		}
	}
}