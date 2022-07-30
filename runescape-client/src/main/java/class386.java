import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.Export;
@ObfuscatedName("ny")
public class class386 {
	@ObfuscatedName("o")
	float field4400;

	@ObfuscatedName("q")
	float field4396;

	@ObfuscatedName("f")
	float field4398;

	static {
		new class386(0.0F, 0.0F, 0.0F);
		new class386(1.0F, 1.0F, 1.0F);
		new class386(1.0F, 0.0F, 0.0F);
		new class386(0.0F, 1.0F, 0.0F);
		new class386(0.0F, 0.0F, 1.0F);
	}

	class386(float var1, float var2, float var3) {
		this.field4400 = var1;
		this.field4396 = var2;
		this.field4398 = var3;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = "(I)F", garbageValue = "1827518031")
	final float method6962() {
		return ((float) (Math.sqrt(((double) (this.field4398 * this.field4398 + this.field4400 * this.field4400 + this.field4396 * this.field4396)))));
	}

	public String toString() {
		return this.field4400 + ", " + this.field4396 + ", " + this.field4398;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = "(S)[Lqe;", garbageValue = "-3146")
	@Export("FillMode_values")
	public static FillMode[] FillMode_values() {
		return new FillMode[]{ FillMode.field4783, FillMode.SOLID, FillMode.field4785 };
	}
}