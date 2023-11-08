import java.util.Arrays;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ir")
public class class225 {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class225 field2381;
	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class225 field2382;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class225 field2383;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class225 field2384;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class225 field2385;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class225 field2386;
	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "Lir;"
	)
	static final class225 field2387;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lir;"
	)
	static final class225[] field2389;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 686261539
	)
	final int field2388;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1958478905
	)
	final int field2390;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -1581595035
	)
	final int field2391;

	static {
		field2381 = new class225(0, 8, 8);
		field2382 = new class225(1, 16, 16);
		field2383 = new class225(3, 32, 32);
		field2384 = new class225(5, 48, 48);
		field2385 = new class225(6, 64, 64);
		field2386 = new class225(4, 96, 96);
		field2387 = new class225(2, 128, 128);
		field2389 = RouteStrategy.method4394();
		Arrays.sort(field2389, new class230());
	}

	class225(int var1, int var2, int var3) {
		this.field2388 = var1;
		this.field2390 = var2;
		this.field2391 = var3;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-524801234"
	)
	int method4387() {
		return this.field2391 * this.field2390;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(IIIIIIII)Z",
		garbageValue = "-1539205894"
	)
	static final boolean method4388(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = ViewportMouse.ViewportMouse_y + var6;
		if (var7 < var0 && var7 < var1 && var7 < var2) {
			return false;
		} else {
			var7 = ViewportMouse.ViewportMouse_y - var6;
			if (var7 > var0 && var7 > var1 && var7 > var2) {
				return false;
			} else {
				var7 = ViewportMouse.ViewportMouse_x + var6;
				if (var7 < var3 && var7 < var4 && var7 < var5) {
					return false;
				} else {
					var7 = ViewportMouse.ViewportMouse_x - var6;
					return var7 <= var3 || var7 <= var4 || var7 <= var5;
				}
			}
		}
	}
}
