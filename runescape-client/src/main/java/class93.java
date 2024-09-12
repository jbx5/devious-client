import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public enum class93 implements Enum {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1137(0, -1),
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1133(1, 2),
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1134(2, 3),
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1132(3, 4),
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1136(4, 5),
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	field1135(5, 6);

	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -1971848801
	)
	final int field1138;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 868356877
	)
	final int field1139;

	class93(int var3, int var4) {
		this.field1138 = var3;
		this.field1139 = var4;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-350930589"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1139;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "-1688652712"
	)
	@Export("ByteArrayPool_release")
	public static void ByteArrayPool_release(byte[] var0) {
		synchronized(ByteArrayPool.field4860) {
			if (var0.length == 100 && ByteArrayPool.ByteArrayPool_smallCount < ByteArrayPool.field4865) {
				ByteArrayPool.ByteArrayPool_small[++ByteArrayPool.ByteArrayPool_smallCount - 1] = var0;
			} else if (var0.length == 5000 && ByteArrayPool.ByteArrayPool_mediumCount < ByteArrayPool.field4864) {
				ByteArrayPool.ByteArrayPool_medium[++ByteArrayPool.ByteArrayPool_mediumCount - 1] = var0;
			} else if (var0.length == 10000 && ByteArrayPool.ByteArrayPool_largeCount < ByteArrayPool.field4866) {
				ByteArrayPool.ByteArrayPool_large[++ByteArrayPool.ByteArrayPool_largeCount - 1] = var0;
			} else if (var0.length == 30000 && ByteArrayPool.field4863 < ByteArrayPool.field4868) {
				ByteArrayPool.field4872[++ByteArrayPool.field4863 - 1] = var0;
			} else {
				if (class416.ByteArrayPool_arrays != null) {
					for (int var2 = 0; var2 < MusicSong.ByteArrayPool_alternativeSizes.length; ++var2) {
						if (var0.length == MusicSong.ByteArrayPool_alternativeSizes[var2] && class159.ByteArrayPool_altSizeArrayCounts[var2] < class416.ByteArrayPool_arrays[var2].length) {
							class416.ByteArrayPool_arrays[var2][class159.ByteArrayPool_altSizeArrayCounts[var2]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Lif;IIIZI)V",
		garbageValue = "-1643070544"
	)
	static void method2538(SequenceDefinition var0, int var1, int var2, int var3, boolean var4) {
		if (Client.soundEffectCount < 50) {
			if (var0.soundEffects != null && var1 < var0.soundEffects.length && var0.soundEffects[var1] != null) {
				int var5 = var0.soundEffects[var1].field2166 & 31;
				if ((var5 <= 0 || class461.clientPreferences.getAreaSoundEffectsVolume() != 0) && (var5 != 0 || class461.clientPreferences.getSoundEffectsVolume() != 0)) {
					Sound var6 = var0.soundEffects[var1];
					if (var6 != null) {
						if (var6.field2166 == 0) {
							if (!var4) {
								return;
							}

							Client.soundLocations[Client.soundEffectCount] = 0;
						} else {
							int var10 = (var2 - 64) / 128;
							int var11 = (var3 - 64) / 128;
							Client.soundLocations[Client.soundEffectCount] = (var11 << 8) + (var10 << 16) + var6.field2166;
						}

						Client.soundEffectIds[Client.soundEffectCount] = var6.field2168;
						Client.queuedSoundEffectLoops[Client.soundEffectCount] = var6.field2164;
						Client.queuedSoundEffectDelays[Client.soundEffectCount] = 0;
						Client.soundEffects[Client.soundEffectCount] = null;
						Client.field627[Client.soundEffectCount] = var6.field2167;
						++Client.soundEffectCount;
					}

				}
			}
		}
	}
}
