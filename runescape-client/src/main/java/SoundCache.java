import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bc")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	AbstractArchive field313;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Ltl;"
	)
	NodeHashTable field315;

	@ObfuscatedSignature(
		descriptor = "(Lof;Lof;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256);
		this.field315 = new NodeHashTable(256);
		this.soundEffectIndex = var1;
		this.field313 = var2;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbr;",
		garbageValue = "1714505709"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method816(var1, var2, false);
		class53 var6 = (class53)this.field315.get(var4);
		if (var6 != null) {
			return var6.method1067();
		} else if (var3 != null && var3[0] <= 0) {
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2);
			if (var7 == null) {
				return null;
			} else {
				RawSound var8 = var7.toRawSound();
				this.field315.put(new class53(var8), var4);
				if (var3 != null) {
					var3[0] -= var8.samples.length;
				}

				return var8;
			}
		}
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(III)Lch;",
		garbageValue = "-171105070"
	)
	class53 method833(int var1, int var2) {
		long var3 = this.method816(var1, var2, true);
		class53 var5 = (class53)this.field315.get(var3);
		if (var5 != null) {
			return var5;
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field313, var1, var2);
			if (var6 == null) {
				return new class53();
			} else {
				class53 var7 = new class53(var6);
				this.field315.put(var7, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbr;",
		garbageValue = "910014038"
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

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(II)Lch;",
		garbageValue = "319483265"
	)
	public class53 method811(int var1) {
		if (this.field313.getGroupCount() == 1) {
			return this.method833(0, var1);
		} else if (this.field313.getGroupFileCount(var1) == 1) {
			return this.method833(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)Lbr;",
		garbageValue = "-603395092"
	)
	public RawSound method815(int var1) {
		return this.getSoundEffect(var1, (int[])null);
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "-150175168"
	)
	long method816(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12);
		var4 |= var1 << 16;
		return var3 ? (long)var4 ^ 4294967296L : (long)var4;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "36"
	)
	public static int method830(int var0) {
		return class483.field4887[var0 & 16383];
	}

	@ObfuscatedName("kl")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIIIIIIIIII)V",
		garbageValue = "821258949"
	)
	static void method832(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
		var1 = var1 * 128 + 64;
		var2 = var2 * 128 + 64;
		var3 = var3 * 128 + 64;
		var4 = var4 * 128 + 64;
		Projectile var14 = new Projectile(var6, var0, var1, var2, class272.getTileHeight(var1, var2, var0) - var7, var9 + Client.cycle, var10 + Client.cycle, var11, var12, var13, var5, var8);
		var14.setDestination(var3, var4, class272.getTileHeight(var3, var4, var0) - var8, var9 + Client.cycle);
		Client.projectiles.addFirst(var14);
	}

	@ObfuscatedName("mc")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1520853752"
	)
	static final void method831(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127);
		class30.clientPreferences.updateSoundEffectVolume(var0);
	}
}
