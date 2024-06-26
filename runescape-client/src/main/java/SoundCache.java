import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("ab")
	static int[] field302;
	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "Ldb;"
	)
	@Export("localPlayer")
	static Player localPlayer;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lok;"
	)
	AbstractArchive field301;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lup;"
	)
	NodeHashTable field297;

	@ObfuscatedSignature(
		descriptor = "(Lok;Lok;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field297 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field301 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II[IB)Lbl;",
		garbageValue = "-116"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method882(var1, var2, false);
		class53 var6 = (class53)this.field297.get(var4);
		if (var6 != null) {
			return var6.method1100();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field297.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(III)Lcv;",
		garbageValue = "2138675976"
	)
	class53 method878(int var1, int var2) {
		long var3 = this.method882(var1, var2, true);
		class53 var5 = (class53)this.field297.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field301, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field297.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbl;",
		garbageValue = "-37192180"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(IB)Lcv;",
		garbageValue = "17"
	)
	public class53 method880(int var1) {
		if (this.field301.getGroupCount() == 1) {
			return this.method878(0, var1);
		} else if (this.field301.getGroupFileCount(var1) == 1) {
			return this.method878(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lbl;",
		garbageValue = "1"
	)
	public RawSound method876(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIZB)J",
		garbageValue = "-12"
	)
	long method882(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Lfh;",
		garbageValue = "1671204860"
	)
	static class133 method887(int var0) {
		class133 var1 = (class133)class210.findEnumerated(FloorUnderlayDefinition.method3808(), var0);
		if (var1 == null) {
			var1 = class133.field1565;
		}

		return var1;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIILho;IB)V",
		garbageValue = "-77"
	)
	static void method894(int var0, int var1, int var2, ObjectComposition var3, int var4) {
		if (var3 != null && var3.hasSound()) {
			int var5 = var3.sizeX;
			int var6 = var3.sizeY;
			if (var4 == 1 || var4 == 3) {
				var5 = var3.sizeY;
				var6 = var3.sizeX;
			}

			int var7 = (var5 + var1) * 128;
			int var8 = (var6 + var2) * 128;
			var1 *= 128;
			var2 *= 128;
			int var9 = var3.ambientSoundId;
			int var10 = var3.int7 * 128;
			int var11 = var3.int8 * 16384;
			if (var3.transforms != null) {
				ObjectComposition var12 = var3.transform();
				if (var12 != null) {
					var9 = var12.ambientSoundId;
					var10 = var12.int7 * 128;
					var11 = var12.int8 * 16384;
				}
			}

			for (ObjectSound var13 = (ObjectSound)ObjectSound.objectSounds.last(); var13 != null; var13 = (ObjectSound)ObjectSound.objectSounds.previous()) {
				if (var0 == var13.plane && var13.x * 16384 == var1 && var2 == var13.y * 128 && var7 == var13.maxX * 16384 && var8 == var13.maxY * 16384 && var9 == var13.soundEffectId && var10 == var13.field845 && var11 == var13.field846) {
					if (var13.stream1 != null) {
						class238.pcmStreamMixer.removeSubStream(var13.stream1);
						var13.stream1 = null;
					}

					if (var13.stream2 != null) {
						class238.pcmStreamMixer.removeSubStream(var13.stream2);
						var13.stream2 = null;
					}

					var13.remove();
					break;
				}
			}
		}

	}

	@ObfuscatedName("ih")
	@ObfuscatedSignature(
		descriptor = "(IIII)V",
		garbageValue = "7460317"
	)
	@Export("queueSoundEffect")
	static void queueSoundEffect(int var0, int var1, int var2) {
		if (class105.clientPreferences.getSoundEffectsVolume() != 0 && var1 != 0 && Client.soundEffectCount < 50) {
			Client.soundEffectIds[Client.soundEffectCount] = var0;
			Client.queuedSoundEffectLoops[Client.soundEffectCount] = var1;
			Client.queuedSoundEffectDelays[Client.soundEffectCount] = var2;
			Client.soundEffects[Client.soundEffectCount] = null;
			Client.soundLocations[Client.soundEffectCount] = 0;
			Client.field668[Client.soundEffectCount] = 0;
			++Client.soundEffectCount;
		}

	}

	@ObfuscatedName("iz")
	@ObfuscatedSignature(
		descriptor = "(Lde;I)V",
		garbageValue = "1218672038"
	)
	static final void method895(WorldView var0) {
		int var1 = var0.playerUpdateManager.playerCount;
		int[] var2 = var0.playerUpdateManager.playerIndices;

		for (int var3 = 0; var3 < var1; ++var3) {
			Player var4 = var0.players[var2[var3]];
			if (var4 != null) {
				class230.updateActorSequence(var0, var4, 1);
			}
		}

	}
}
