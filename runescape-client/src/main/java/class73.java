import java.util.concurrent.ThreadFactory;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cd")
final class class73 implements ThreadFactory {
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lhz;",
		garbageValue = "1119787820"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = KitDefinition.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)Lht;",
		garbageValue = "-1308783411"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0);
			var1 = new EnumComposition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("hr")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2027765065"
	)
	static final void method2110() {
		for (int var0 = 0; var0 < Client.soundEffectCount; ++var0) {
			int var10002 = Client.queuedSoundEffectDelays[var0]--;
			if (Client.queuedSoundEffectDelays[var0] >= -10) {
				SoundEffect var1 = Client.soundEffects[var0];
				if (var1 == null) {
					Object var10000 = null;
					var1 = SoundEffect.readSoundEffect(class469.field4812, Client.soundEffectIds[var0], 0);
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
						int var5 = var4 * 128 + 64 - TextureProvider.localPlayer.x;
						if (var5 < 0) {
							var5 = -var5;
						}

						int var6 = Client.soundLocations[var0] >> 8 & 255;
						int var7 = var6 * 128 + 64 - TextureProvider.localPlayer.y;
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

						var2 = (var3 - var8) * class91.clientPreferences.method2589() / var3;
					} else {
						var2 = class91.clientPreferences.method2517();
					}

					if (var2 > 0) {
						RawSound var9 = var1.toRawSound().resample(class136.decimator);
						RawPcmStream var10 = RawPcmStream.createRawPcmStream(var9, 100, var2);
						var10.setNumLoops(Client.queuedSoundEffectLoops[var0] - 1);
						class140.pcmStreamMixer.addSubStream(var10);
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

		if (Client.playingJingle && !Strings.method6819()) {
			if (class91.clientPreferences.method2515() != 0 && ScriptFrame.method1194()) {
				VarcInt.method3677(CollisionMap.archive6, class91.clientPreferences.method2515());
			}

			Client.playingJingle = false;
		}

	}
}
