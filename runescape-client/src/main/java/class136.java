import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ep")
public class class136 extends class144 {
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-855933295)

	int field1571;

	@ObfuscatedSignature(descriptor = 
	"Ler;")

	final class145 this$0;

	@ObfuscatedSignature(descriptor = 
	"(Ler;)V")

	class136(class145 var1) {
		this.this$0 = var1;
		this.field1571 = -1;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Lpi;B)V", garbageValue = 
	"23")

	void vmethod3152(Buffer var1) {
		this.field1571 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lea;I)V", garbageValue = 
	"1764669808")

	void vmethod3153(ClanChannel var1) {
		var1.removeMember(this.field1571);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)J", garbageValue = 
	"1053003515")

	public static synchronized final long method2931() {
		long var0 = System.currentTimeMillis();
		if (var0 < class269.field3149) {
			class269.field3147 += class269.field3149 - var0;
		}

		class269.field3149 = var0;
		return class269.field3147 + var0;
	}

	@ObfuscatedName("fs")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"885015273")

	static final void method2923() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= (-10)) {
				SoundEffect var1 = Client.soundEffects[var0];
				if (var1 == null) {
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(class182.archive4, Client.soundEffectIds[var0], 0);
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
						int var4 = (Client.soundLocations[var0] >> 16) & 255;
						int var5 = ((var4 * 128) + 64) - GrandExchangeEvents.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = (Client.soundLocations[var0] >> 8) & 255;
						int var7 = ((var6 * 128) + 64) - GrandExchangeEvents.localPlayer.y;
						if (var7 < 0) {
							var7 = -var7;
						}

						int var8 = (var5 + var7) - 128;
						if (var8 > var3) {
							Client.queuedSoundEffectDelays[var0] = -100;
							continue;
						}

						if (var8 < 0) {
							var8 = 0;
						}

						var2 = ((var3 - var8) * class131.clientPreferences.method2270()) / var3;
					} else {
						var2 = class131.clientPreferences.method2243();
					}

					if (var2 > 0) {
						RawSound var9 = var1.toRawSound().resample(WorldMapRectangle.decimator);
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						StructComposition.pcmStreamMixer.addSubStream(var10);
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

		if (Client.field746 && (!class307.method5789())) {
			if ((class131.clientPreferences.method2321() != 0) && (Client.currentTrackGroupId != (-1))) {
				class18.method266(class16.archive6, Client.currentTrackGroupId, 0, class131.clientPreferences.method2321(), false);
			}

			Client.field746 = false;
		}

	}
}