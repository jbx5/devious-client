import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ec")
@Implements("BuddyRankComparator")
public class BuddyRankComparator extends AbstractUserComparator {
	@ObfuscatedName("fu")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive13")
	static Archive archive13;
	@ObfuscatedName("gb")
	@ObfuscatedGetter(
		intValue = -598722495
	)
	@Export("currentPort")
	static int currentPort;
	@ObfuscatedName("ac")
	@Export("reversed")
	final boolean reversed;

	public BuddyRankComparator(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lsq;Lsq;I)I",
		garbageValue = "-1850862971"
	)
	@Export("compareBuddy")
	int compareBuddy(Buddy var1, Buddy var2) {
		if (var2.rank != var1.rank) {
			return this.reversed ? var1.rank - var2.rank : var2.rank - var1.rank;
		} else {
			return this.compareUser(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.compareBuddy((Buddy)var1, (Buddy)var2);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lpo;III)[Lvv;",
		garbageValue = "-558925023"
	)
	public static SpritePixels[] method3234(AbstractArchive var0, int var1, int var2) {
		return !HttpJsonRequestBody.method9207(var0, var1, var2) ? null : class543.method9848();
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "57"
	)
	public static void method3233() {
		try {
			JagexCache.JagexCache_dat2File.close();

			for (int var0 = 0; var0 < class179.field1883; ++var0) {
				class215.JagexCache_idxFiles[var0].close();
			}

			JagexCache.JagexCache_idx255File.close();
			JagexCache.JagexCache_randomDat.close();
		} catch (Exception var2) {
		}

	}
}
