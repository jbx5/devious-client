import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mz")
public class class328 {
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lmo;"
	)
	public class330 field3552;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	class325 field3555;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lbb;"
	)
	class27 field3551;
	@ObfuscatedName("am")
	public Object[] field3553;
	@ObfuscatedName("as")
	public Object[] field3557;
	@ObfuscatedName("aj")
	public Object[] field3556;
	@ObfuscatedName("ag")
	public Object[] field3554;

	class328() {
		this.field3552 = new class330();
		this.field3555 = new class325();
		this.field3551 = new class27();
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "([FIFI)F",
		garbageValue = "39231924"
	)
	static float method6114(float[] var0, int var1, float var2) {
		float var3 = var0[var1];

		for (int var4 = var1 - 1; var4 >= 0; --var4) {
			var3 = var2 * var3 + var0[var4];
		}

		return var3;
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-2079868844"
	)
	static void method6115(int var0) {
		if (var0 != Login.loginIndex) {
			Login.loginIndex = var0;
		}
	}
}
