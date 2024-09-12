import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("oy")
public class class388 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	static final class388 field4535;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4522;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4520;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4521;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4523;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4531;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4524;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4533;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4526;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4527;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4528;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4529;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4540;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4518;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4532;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4519;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4525;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4534;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4536;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4537;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4538;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4539;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Loy;"
	)
	public static final class388 field4530;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = 1664878975
	)
	public final int field4541;

	static {
		field4535 = new class388(255);
		field4522 = new class388(0);
		field4520 = new class388(1);
		field4521 = new class388(2);
		field4523 = new class388(3);
		field4531 = new class388(4);
		field4524 = new class388(5);
		field4533 = new class388(6);
		field4526 = new class388(7);
		field4527 = new class388(8);
		field4528 = new class388(9);
		field4529 = new class388(10);
		field4540 = new class388(11);
		field4518 = new class388(12);
		field4532 = new class388(13);
		field4519 = new class388(14);
		field4525 = new class388(15);
		field4534 = new class388(17);
		field4536 = new class388(18);
		field4537 = new class388(19);
		field4538 = new class388(20);
		field4539 = new class388(21);
		field4530 = new class388(22);
	}

	class388(int var1) {
		this.field4541 = var1;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "([FIFB)F",
		garbageValue = "-75"
	)
	static float method7523(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var0[var4] + var2 * var3;
		}

		return var3;
	}

	@ObfuscatedName("pu")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1499896585"
	)
	static void method7521(boolean var0) {
		Client.leftClickOpensMenu = var0;
	}

	@ObfuscatedName("pc")
	@ObfuscatedSignature(
		descriptor = "(IB)Luv;",
		garbageValue = "88"
	)
	static DbTable method7522(int var0) {
		DbTable var1 = (DbTable)Client.archive11.get((long)var0);
		if (var1 == null) {
			var1 = new DbTable(class156.field1738, var0);
		}

		return var1;
	}
}
