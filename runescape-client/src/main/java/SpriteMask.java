import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("kl")
@Implements("SpriteMask")
public class SpriteMask extends DualNode {
	@ObfuscatedName("s")
	@ObfuscatedGetter(intValue = -1491857767)
	@Export("width")
	public final int width;

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = -260397409)
	@Export("height")
	public final int height;

	@ObfuscatedName("w")
	@Export("xWidths")
	public final int[] xWidths;

	@ObfuscatedName("v")
	@Export("xStarts")
	public final int[] xStarts;

	SpriteMask(int var1, int var2, int[] var3, int[] var4, int var5) {
		this.width = var1;
		this.height = var2;
		this.xWidths = var3;
		this.xStarts = var4;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(III)Z", garbageValue = "130254113")
	@Export("contains")
	public boolean contains(int var1, int var2) {
		if (var2 >= 0 && var2 < this.xStarts.length) {
			int var3 = this.xStarts[var2];
			if (var1 >= var3 && var1 <= var3 + this.xWidths[var2]) {
				return true;
			}
		}
		return false;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(S)Lni;", garbageValue = "3189")
	public static class387 method5460() {
		synchronized(class387.field4397) {
			if (class387.field4392 == 0) {
				return new class387();
			} else {
				class387.field4397[--class387.field4392].method6891();
				return class387.field4397[class387.field4392];
			}
		}
	}

	@ObfuscatedName("ec")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "1670242040")
	static final void method5457() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var1 = Client.soundEffects[var0];
				if (var1 == null) {
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(class271.archive4, Client.soundEffectIds[var0], 0);
					if (var1 == null) {
						continue;
					}
					int[] var12 = Client.queuedSoundEffectDelays;
					var12[var0] += var1.calculateDelay();
					Client.soundEffects[var0] = var1;
				}
				if (Client.queuedSoundEffectDelays[var0] < 0) {
					int var2;
					if (Client.soundLocations[var0] != 0) {
						int var3 = (Client.soundLocations[var0] & 255) * 128;
						int var4 = Client.soundLocations[var0] >> 16 & 255;
						int var5 = var4 * 128 + 64 - ScriptFrame.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}
						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - ScriptFrame.localPlayer.y;
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
						var2 = (var3 - var8) * ClanMate.clientPreferences.method2226() / var3;
					} else {
						var2 = ClanMate.clientPreferences.method2204();
					}
					if (var2 > 0) {
						RawSound var9 = var1.toRawSound().resample(ScriptEvent.decimator);
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						ModeWhere.pcmStreamMixer.addSubStream(var10);
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
		if (Client.playingJingle && !class260.method5128()) {
			if (ClanMate.clientPreferences.method2222() != 0 && Client.currentTrackGroupId != -1) {
				class118.method2713(PacketBuffer.archive6, Client.currentTrackGroupId, 0, ClanMate.clientPreferences.method2222(), false);
			}
			Client.playingJingle = false;
		}
	}
}