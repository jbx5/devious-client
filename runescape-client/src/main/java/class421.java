import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qe")
public class class421 {
	@ObfuscatedName("ak")
	float field4683;
	@ObfuscatedName("al")
	float field4680;
	@ObfuscatedName("aj")
	float field4681;

	static {
		new class421(0.0F, 0.0F, 0.0F);
		new class421(1.0F, 1.0F, 1.0F);
		new class421(1.0F, 0.0F, 0.0F);
		new class421(0.0F, 1.0F, 0.0F);
		new class421(0.0F, 0.0F, 1.0F);
	}

	public class421(float var1, float var2, float var3) {
		this.field4683 = var1;
		this.field4680 = var2;
		this.field4681 = var3;
	}

	class421() {
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(Lqe;I)Z",
		garbageValue = "-1603438622"
	)
	boolean method7798(class421 var1) {
		return var1.field4683 == this.field4683 && var1.field4680 == this.field4680 && this.field4681 == var1.field4681;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)F",
		garbageValue = "1133551478"
	)
	final float method7799() {
		return (float)Math.sqrt((double)(this.field4681 * this.field4681 + this.field4683 * this.field4683 + this.field4680 * this.field4680));
	}

	public String toString() {
		return this.field4683 + ", " + this.field4680 + ", " + this.field4681;
	}
}
