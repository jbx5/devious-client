import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mv")
public class class325 implements class320 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class325 field3522;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class325 field3530;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class325 field3521;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class325 field3523;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class325 field3520;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class325 field3524;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	public static final class325 field3519;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmv;"
	)
	static final class325 field3526;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lmv;"
	)
	static final class325[] field3529;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1324091635
	)
	public final int field3525;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -1387850691
	)
	public final int field3528;

	static {
		field3522 = new class325(14, 0);
		field3530 = new class325(15, 20);
		field3521 = new class325(16, -2);
		field3523 = new class325(18, -2);
		field3520 = new class325(19, -2);
		field3524 = new class325(20, 58);
		field3519 = new class325(21, 37);
		field3526 = new class325(27, 0);
		field3529 = new class325[32];
		class325[] var0 = ReflectionCheck.method678();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3529[var0[var1].field3525] = var0[var1];
		}

	}

	class325(int var1, int var2) {
		this.field3525 = var1;
		this.field3528 = var2;
	}
}
