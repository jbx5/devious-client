import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hx")
public class class198 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class198 field2074;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class198 field2068;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class198 field2069;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class198 field2073;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class198 field2077;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class198 field2072;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lhx;"
	)
	static final class198 field2071;
	@ObfuscatedName("at")
	static int[] field2076;
	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		descriptor = "Ldn;"
	)
	@Export("topLevelWorldView")
	static WorldView topLevelWorldView;
	@ObfuscatedName("wq")
	@ObfuscatedGetter(
		intValue = -1040550201
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2144378181
	)
	final int field2075;

	static {
		field2074 = new class198(0);
		field2068 = new class198(1);
		field2069 = new class198(2);
		field2073 = new class198(3);
		field2077 = new class198(4);
		field2072 = new class198(5);
		field2071 = new class198(6);
		field2076 = null;
	}

	class198(int var1) {
		this.field2075 = var1;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2033089210"
	)
	public static int method4060(int var0) {
		if (field2076 == null) {
			field2076 = new int[7];
			field2076[field2074.field2075] = class213.field2336.field2332;
			field2076[field2068.field2075] = class213.field2330.field2332;
			field2076[field2069.field2075] = class213.field2331.field2332;
			field2076[field2073.field2075] = class213.field2328.field2332;
			field2076[field2077.field2075] = class213.field2334.field2332;
			field2076[field2072.field2075] = class213.field2337.field2332;
			field2076[field2071.field2075] = class213.field2339.field2332;
		}

		return field2076[var0];
	}

	@ObfuscatedName("bs")
	@ObfuscatedSignature(
		descriptor = "([BIII)I",
		garbageValue = "1490279327"
	)
	public static int method4063(byte[] var0, int var1, int var2) {
		int var3 = -1;

		for (int var4 = var1; var4 < var2; ++var4) {
			var3 = var3 >>> 8 ^ Buffer.field5463[(var3 ^ var0[var4]) & 255];
		}

		var3 = ~var3;
		return var3;
	}
}
