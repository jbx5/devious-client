import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
public class class322 implements class317 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class322 field3535;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class322 field3533;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class322 field3540;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class322 field3534;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class322 field3532;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class322 field3537;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	public static final class322 field3541;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmj;"
	)
	static final class322 field3539;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "[Lmj;"
	)
	static final class322[] field3542;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 717417699
	)
	public final int field3538;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1371261987
	)
	public final int field3536;

	static {
		field3535 = new class322(14, 0);
		field3533 = new class322(15, 4);
		field3540 = new class322(16, -2);
		field3534 = new class322(18, -2);
		field3532 = new class322(19, -2);
		field3537 = new class322(20, 58);
		field3541 = new class322(21, 37);
		field3539 = new class322(27, 0);
		field3542 = new class322[32];
		class322[] var0 = LoginPacket.method3218();

		for (int var1 = 0; var1 < var0.length; ++var1) {
			field3542[var0[var1].field3538] = var0[var1];
		}

	}

	class322(int var1, int var2) {
		this.field3538 = var1;
		this.field3536 = var2;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1886324712"
	)
	static String method6186(int var0) {
		return "<img=" + var0 + ">";
	}
}
