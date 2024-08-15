import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("my")
public class class322 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3367;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3364;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3363;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3361;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3365;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3362;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3368;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3371;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3369;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3370;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	public static final class322 field3366;
	@ObfuscatedName("qe")
	@ObfuscatedSignature(
		descriptor = "Lip;"
	)
	@Export("mouseWheel")
	static MouseWheel mouseWheel;

	static {
		field3367 = new class322(5);
		field3364 = new class322(11);
		field3363 = new class322(4);
		field3361 = new class322(6);
		field3365 = new class322(7);
		field3362 = new class322(14);
		field3368 = new class322(14);
		field3371 = new class322(4);
		field3369 = new class322(20);
		field3370 = new class322(2);
		field3366 = new class322(7);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "5"
	)
	class322(int var1) {
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "0"
	)
	static final int method6155(int var0, int var1) {
		int var2 = BuddyRankComparator.method3089(var0 - 1, var1 - 1) + BuddyRankComparator.method3089(1 + var0, var1 - 1) + BuddyRankComparator.method3089(var0 - 1, var1 + 1) + BuddyRankComparator.method3089(var0 + 1, var1 + 1);
		int var3 = BuddyRankComparator.method3089(var0 - 1, var1) + BuddyRankComparator.method3089(var0 + 1, var1) + BuddyRankComparator.method3089(var0, var1 - 1) + BuddyRankComparator.method3089(var0, 1 + var1);
		int var4 = BuddyRankComparator.method3089(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}
}
