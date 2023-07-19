import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ri")
public class class449 {
	@ObfuscatedName("aw")
	float field4731;
	@ObfuscatedName("ay")
	float field4730;
	@ObfuscatedName("ar")
	float field4729;

	static {
		new class449(0.0F, 0.0F, 0.0F);
		new class449(1.0F, 1.0F, 1.0F);
		new class449(1.0F, 0.0F, 0.0F);
		new class449(0.0F, 1.0F, 0.0F);
		new class449(0.0F, 0.0F, 1.0F);
	}

	class449(float var1, float var2, float var3) {
		this.field4731 = var1;
		this.field4730 = var2;
		this.field4729 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)F",
		garbageValue = "-57"
	)
	final float method8214() {
		return (float)Math.sqrt((double)(this.field4731 * this.field4731 + this.field4730 * this.field4730 + this.field4729 * this.field4729));
	}

	public String toString() {
		return this.field4731 + ", " + this.field4730 + ", " + this.field4729;
	}
}
