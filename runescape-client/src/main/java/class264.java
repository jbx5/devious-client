import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kx")
public class class264 {
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class264 field2891;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class264 field2888;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class264 field2889;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final class264 field2890;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final class264 field2896;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final class264 field2892;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final class264 field2893;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final class264 field2894;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final class264 field2895;
	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final class264 field2897;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final class264 field2902;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	public static final class264 field2898;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class264 field2899;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lkx;"
	)
	static final class264 field2900;
	@ObfuscatedName("dc")
	@ObfuscatedSignature(
		descriptor = "Lvb;"
	)
	@Export("worldSelectRightSprite")
	static IndexedSprite worldSelectRightSprite;
	@ObfuscatedName("kc")
	@ObfuscatedGetter(
		intValue = -543041665
	)
	@Export("cameraYaw")
	static int cameraYaw;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -258844659
	)
	public final int field2901;

	static {
		field2891 = new class264(0);
		field2888 = new class264(1);
		field2889 = new class264(2);
		field2890 = new class264(3);
		field2896 = new class264(4);
		field2892 = new class264(5);
		field2893 = new class264(6);
		field2894 = new class264(7);
		field2895 = new class264(8);
		field2897 = new class264(9);
		field2902 = new class264(10);
		field2898 = new class264(11);
		field2899 = new class264(12);
		field2900 = new class264(13);
	}

	class264(int var1) {
		this.field2901 = var1;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;I)Ljava/lang/String;",
		garbageValue = "1634254525"
	)
	public static String method5316(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}
}
