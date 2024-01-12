import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bi")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("eu")
	@Export("mouseCam")
	static boolean mouseCam;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Low;"
	)
	AbstractArchive field316;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lts;"
	)
	NodeHashTable field318;

	@ObfuscatedSignature(
		descriptor = "(Low;Low;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field318 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field316 = var2;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbm;",
		garbageValue = "-2077776795"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method885(var1, var2, false);
		class53 var6 = (class53)this.field318.get(var4);
		if (var6 != null) {
			return var6.method1099();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field318.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IIS)Lcb;",
		garbageValue = "3208"
	)
	class53 method882(int var1, int var2) {
		long var3 = this.method885(var1, var2, true);
		class53 var5 = (class53)this.field318.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field316, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field318.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbm;",
		garbageValue = "1281898806"
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

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(II)Lcb;",
		garbageValue = "255418893"
	)
	public class53 method883(int var1) {
		if (this.field316.getGroupCount() == 1) {
			return this.method882(0, var1);
		} else if (this.field316.getGroupFileCount(var1) == 1) {
			return this.method882(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II)Lbm;",
		garbageValue = "-1627468116"
	)
	public RawSound method881(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "1944510305"
	)
	long method885(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}
}
