import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kl")
public class class271 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3026;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3025;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3017;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3015;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3016;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3020;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkl;"
	)
	static final class271 field3019;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "[Lkl;"
	)
	static final class271[] field3021;
	@ObfuscatedName("bn")
	protected static String field3018;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -334090563
	)
	final int field3022;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 17621929
	)
	final int field3023;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1855241859
	)
	final int field3024;

	static {
		field3026 = new class271(1, 8, 8);
		field3025 = new class271(4, 16, 16);
		field3017 = new class271(2, 32, 32);
		field3015 = new class271(0, 48, 48);
		field3016 = new class271(5, 64, 64);
		field3020 = new class271(3, 96, 96);
		field3019 = new class271(6, 128, 128);
		class271[] var0 = new class271[]{field3015, field3026, field3017, field3020, field3025, field3016, field3019};
		field3021 = var0;
		Arrays.sort(field3021, new class278());
	}

	class271(int var1, int var2, int var3) {
		this.field3022 = var1;
		this.field3023 = var2;
		this.field3024 = var3;
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "81"
	)
	int method5720() {
		return this.field3023 * this.field3024;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "([I[IIII)V",
		garbageValue = "1924027216"
	)
	public static void method5722(int[] var0, int[] var1, int var2, int var3) {
		if (var2 < var3) {
			int var4 = (var3 + var2) / 2;
			int var5 = var2;
			int var6 = var0[var4];
			var0[var4] = var0[var3];
			var0[var3] = var6;
			int var7 = var1[var4];
			var1[var4] = var1[var3];
			var1[var3] = var7;
			int var8 = var6 == Integer.MAX_VALUE ? 0 : 1;

			for (int var9 = var2; var9 < var3; ++var9) {
				if (var0[var9] < (var9 & var8) + var6) {
					int var10 = var0[var9];
					var0[var9] = var0[var5];
					var0[var5] = var10;
					int var11 = var1[var9];
					var1[var9] = var1[var5];
					var1[var5++] = var11;
				}
			}

			var0[var3] = var0[var5];
			var0[var5] = var6;
			var1[var3] = var1[var5];
			var1[var5] = var7;
			method5722(var0, var1, var2, var5 - 1);
			method5722(var0, var1, var5 + 1, var3);
		}

	}

	@ObfuscatedName("mi")
	@ObfuscatedSignature(
		descriptor = "(IIIZB)V",
		garbageValue = "66"
	)
	static final void method5725(int var0, int var1, int var2, boolean var3) {
		if (class416.widgetDefinition.loadInterface(var0)) {
			class163.resizeInterface(class416.widgetDefinition.Widget_interfaceComponents[var0], -1, var1, var2, var3);
		}
	}
}
