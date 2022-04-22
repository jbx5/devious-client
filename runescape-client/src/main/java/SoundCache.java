import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ac")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("ItemDefinition_archive")
	static AbstractArchive ItemDefinition_archive;
	@ObfuscatedName("u")
	@ObfuscatedGetter(intValue = 
	-1560740679)

	static int field311;
	@ObfuscatedName("e")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("Widget_spritesArchive")
	static AbstractArchive Widget_spritesArchive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lln;")

	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("musicSamples")
	NodeHashTable musicSamples;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"Lpo;")

	@Export("rawSounds")
	NodeHashTable rawSounds;

	@ObfuscatedSignature(descriptor = 
	"(Lln;Lln;)V")

	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.musicSamples = new NodeHashTable(256);
		this.rawSounds = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(II[II)Lat;", garbageValue = 
	"-1555701815")

	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & 65535) | (var1 >>> 12));
		var4 |= var1 << 16;
		long var5 = ((long) (var4));
		RawSound var7 = ((RawSound) (this.rawSounds.get(var5)));
		if (var7 != null) {
			return var7;
		} else if ((var3 != null) && (var3[0] <= 0)) {
			return null;
		} else {
			SoundEffect var8 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var8 == null) {
				return null;
			} else {
				var7 = var8.toRawSound();
				this.rawSounds.put(var7, var5);
				if (var3 != null) {
					var3[0] -= var7.samples.length;
				}

				return var7;
			}
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II[II)Lat;", garbageValue = 
	"-1329492986")

	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (((var1 << 4) & 65535) | (var1 >>> 12));
		var4 |= var1 << 16;
		long var5 = ((long) (var4)) ^ 4294967296L;
		RawSound var7 = ((RawSound) (this.rawSounds.get(var5)));
		if (var7 != null) {
			return var7;
		} else if ((var3 != null) && (var3[0] <= 0)) {
			return null;
		} else {
			VorbisSample var8 = ((VorbisSample) (this.musicSamples.get(var5)));
			if (var8 == null) {
				var8 = VorbisSample.readMusicSample(this.musicSampleIndex, var1, var2);
				if (var8 == null) {
					return null;
				}

				this.musicSamples.put(var8, var5);
			}

			var7 = var8.toRawSound(var3);
			if (var7 == null) {
				return null;
			} else {
				var8.remove();
				this.rawSounds.put(var7, var5);
				return var7;
			}
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I[II)Lat;", garbageValue = 
	"-1579364603")

	@Export("getSoundEffect")
	public RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) {
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I[IB)Lat;", garbageValue = 
	"74")

	@Export("getMusicSample")
	public RawSound getMusicSample(int var1, int[] var2) {
		if (this.musicSampleIndex.getGroupCount() == 1) {
			return this.getMusicSample0(0, var1, var2);
		} else if (this.musicSampleIndex.getGroupFileCount(var1) == 1) {
			return this.getMusicSample0(var1, 0, var2);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(II)I", garbageValue = 
	"662567928")

	static int method779(int var0) {
		Message var1 = ((Message) (Messages.Messages_hashTable.get(((long) (var0)))));
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message) (var1.nextDual)).count;
		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1695145836")

	static void method768() {
		if (TileItem.loadWorlds()) {
			Login.worldSelectOpen = true;
			Login.worldSelectPage = 0;
			Login.worldSelectPagesCount = 0;
		}

	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(III)I", garbageValue = 
	"-2116988411")

	static final int method772(int var0, int var1) {
		if (var0 == (-1)) {
			return 12345678;
		} else {
			var1 = ((var0 & 127) * var1) / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 65408) + var1;
		}
	}

	@ObfuscatedName("fh")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"2105059803")

	@Export("playSong")
	static void playSong(int var0) {
		if ((var0 == (-1)) && (!Client.field746)) {
			class273.midiPcmStream.clear();
			class273.musicPlayerStatus = 1;
			class273.musicTrackArchive = null;
		} else if ((((var0 != (-1)) && (var0 != Client.currentTrackGroupId)) && (class131.clientPreferences.method2321() != 0)) && (!Client.field746)) {
			NPCComposition.method3530(2, class16.archive6, var0, 0, class131.clientPreferences.method2321(), false);
		}

		Client.currentTrackGroupId = var0;
	}

	@ObfuscatedName("io")
	@ObfuscatedSignature(descriptor = 
	"(II)Z", garbageValue = 
	"1445752455")

	static final boolean method781(int var0) {
		if (var0 < 0) {
			return false;
		} else {
			int var1 = Client.menuOpcodes[var0];
			if (var1 >= 2000) {
				var1 -= 2000;
			}

			return var1 == 1007;
		}
	}
}