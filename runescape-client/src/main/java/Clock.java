import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ht")
@Implements("Clock")
public abstract class Clock {
	Clock() {
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1021685028"
	)
	@Export("mark")
	public abstract void mark();

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "20"
	)
	@Export("wait")
	public abstract int wait(int var1, int var2);

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "1988860737"
	)
	public static double[] method3544(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			double var15 = ((double)var7 - var0) / var2;
			double var13 = Math.exp(-var15 * var15 / 2.0D) / Math.sqrt(6.283185307179586D);
			double var11 = var13 / var2;
			var6[var8] = var11;
			++var7;
		}

		return var6;
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-322311297"
	)
	static final void method3543() {
		UserComparator8.method2870("You can't add yourself to your own friend list");
	}
}
