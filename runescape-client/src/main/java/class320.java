import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("md")
public class class320 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3378;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3379;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3380;
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3386;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3382;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3384;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3381;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3385;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3383;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3387;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmd;"
	)
	public static final class320 field3388;

	static {
		field3378 = new class320(2);
		field3379 = new class320(7);
		field3380 = new class320(14);
		field3386 = new class320(14);
		field3382 = new class320(4);
		field3384 = new class320(4);
		field3381 = new class320(5);
		field3385 = new class320(6);
		field3383 = new class320(11);
		field3387 = new class320(20);
		field3388 = new class320(7);
	}

	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2"
	)
	class320(int var1) {
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lnx;IIII)V",
		garbageValue = "1815594213"
	)
	@Export("Widget_setKeyRate")
	static final void Widget_setKeyRate(Widget var0, int var1, int var2, int var3) {
		if (var0.field3966 == null) {
			throw new RuntimeException();
		} else {
			var0.field3966[var1] = var2;
			var0.field3910[var1] = var3;
		}
	}
}
