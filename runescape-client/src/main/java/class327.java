import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mk")
public class class327 implements class322 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final class327 field3585;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final class327 field3581;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final class327 field3574;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final class327 field3573;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final class327 field3572;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final class327 field3577;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	public static final class327 field3578;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lmk;"
	)
	static final class327 field3579;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "[Lmk;"
	)
	static final class327[] field3582;
	@ObfuscatedName("et")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 959878177
	)
	public final int field3575;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -1090980179
	)
	public final int field3576;

	static {
		field3585 = new class327(14, 0);
		field3581 = new class327(15, 20);
		field3574 = new class327(16, -2);
		field3573 = new class327(18, -2);
		field3572 = new class327(19, -2);
		field3577 = new class327(20, 58);
		field3578 = new class327(21, 37);
		field3579 = new class327(27, 0);
		field3582 = new class327[32];
		class327[] var0 = new class327[]{field3572, field3573, field3585, field3574, field3579, field3581, field3578, field3577};
		class327[] var1 = var0;

		for (int var2 = 0; var2 < var1.length; ++var2) {
			field3582[var1[var2].field3575] = var1[var2];
		}

	}

	class327(int var1, int var2) {
		this.field3575 = var1;
		this.field3576 = var2;
	}
}
