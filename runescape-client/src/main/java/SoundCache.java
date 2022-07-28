import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.Implements;
import net.runelite.mapping.Export;
@ObfuscatedName("an")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("tf")
	@ObfuscatedGetter(intValue = -1221572665)
	static int field325;

	@ObfuscatedName("qw")
	@ObfuscatedSignature(descriptor = "Loy;")
	static class392 field327;

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "Llc;")
	@Export("musicSampleIndex")
	AbstractArchive musicSampleIndex;

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("musicSamples")
	NodeHashTable musicSamples = new NodeHashTable(256);

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "Lpf;")
	@Export("rawSounds")
	NodeHashTable rawSounds = new NodeHashTable(256);

	@ObfuscatedSignature(descriptor = "(Llc;Llc;)V")
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		this.soundEffectIndex = var1;
		this.musicSampleIndex = var2;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(II[II)Lap;", garbageValue = "-1611301672")
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & '￿' | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = ((long) (var4));
		RawSound var7 = ((RawSound) (this.rawSounds.get(var5)));
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
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

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(II[II)Lap;", garbageValue = "-944189598")
	@Export("getMusicSample0")
	RawSound getMusicSample0(int var1, int var2, int[] var3) {
		int var4 = var2 ^ (var1 << 4 & '￿' | var1 >>> 12);
		var4 |= var1 << 16;
		long var5 = ((long) (var4)) ^ 4294967296L;
		RawSound var7 = ((RawSound) (this.rawSounds.get(var5)));
		if (var7 != null) {
			return var7;
		} else if (var3 != null && var3[0] <= 0) {
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(I[IB)Lap;", garbageValue = "42")
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

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(I[II)Lap;", garbageValue = "2028227037")
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

	@ObfuscatedName("z")
	@ObfuscatedSignature(descriptor = "(I)Lql;", garbageValue = "-300808616")
	public static IndexedSprite method777() {
		IndexedSprite var0 = new IndexedSprite();
		var0.width = class457.SpriteBuffer_spriteWidth;
		var0.height = class457.SpriteBuffer_spriteHeight;
		var0.xOffset = class267.SpriteBuffer_xOffsets[0];
		var0.yOffset = class457.SpriteBuffer_yOffsets[0];
		var0.subWidth = class457.SpriteBuffer_spriteWidths[0];
		var0.subHeight = Decimator.SpriteBuffer_spriteHeights[0];
		var0.palette = GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette;
		var0.pixels = DbTableType.SpriteBuffer_pixels[0];
		class267.SpriteBuffer_xOffsets = null;
		class457.SpriteBuffer_yOffsets = null;
		class457.SpriteBuffer_spriteWidths = null;
		Decimator.SpriteBuffer_spriteHeights = null;
		GrandExchangeOfferWorldComparator.SpriteBuffer_spritePalette = null;
		DbTableType.SpriteBuffer_pixels = null;
		return var0;
	}
}