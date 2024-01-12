import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nk")
public class class360 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static final class360 field3939;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnk;"
	)
	static final class360 field3937;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1984923029
	)
	final int field3938;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = -1060291329
	)
	final int field3940;

	static {
		field3939 = new class360(51, 27, 800, 0, 16, 16);
		field3937 = new class360(25, 28, 800, 656, 40, 40);
	}

	class360(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3938 = var5;
		this.field3940 = var6;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)F",
		garbageValue = "107623799"
	)
	public static float method6933(int var0) {
		var0 &= 16383;
		return (float)((double)((float)var0 / 16384.0F) * 6.283185307179586D);
	}
}
