import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lr")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -2021684473
	)
	@Export("x")
	int x;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1683760819
	)
	@Export("y")
	int y;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -423675421
	)
	@Export("z")
	int z;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 1425529543
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		descriptor = "(Llr;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(DDII)[D",
		garbageValue = "-1487725012"
	)
	public static double[] method5839(double var0, double var2, int var4) {
		int var5 = var4 * 2 + 1;
		double[] var6 = new double[var5];
		int var7 = -var4;

		for (int var8 = 0; var7 <= var4; ++var8) {
			var6[var8] = HttpRequest.method84((double)var7, var0, var2);
			++var7;
		}

		return var6;
	}
}
