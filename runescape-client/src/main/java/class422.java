import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qz")
public final class class422 {
	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "[Lqz;"
	)
	static class422[] field4690;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1358396733
	)
	static int field4688;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		intValue = 1803012423
	)
	static int field4686;
	@ObfuscatedName("az")
	float field4687;
	@ObfuscatedName("af")
	float field4684;
	@ObfuscatedName("aa")
	float field4689;
	@ObfuscatedName("at")
	float field4685;

	static {
		field4690 = new class422[0];
		class319.method6173(100);
		new class422();
	}

	class422() {
		this.method7815();
	}

	public class422(float var1, float var2, float var3) {
		this.method7812(var1, var2, var3);
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "4187"
	)
	public void method7834() {
		synchronized(field4690) {
			if (field4686 < field4688 - 1) {
				field4690[++field4686 - 1] = this;
			}

		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(FFFFS)V",
		garbageValue = "-9625"
	)
	void method7814(float var1, float var2, float var3, float var4) {
		this.field4687 = var1;
		this.field4684 = var2;
		this.field4689 = var3;
		this.field4685 = var4;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "13"
	)
	public void method7813(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field4687 = var1 * var5;
		this.field4684 = var2 * var5;
		this.field4689 = var3 * var5;
		this.field4685 = var6;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1985189752"
	)
	void method7812(float var1, float var2, float var3) {
		this.method7813(0.0F, 1.0F, 0.0F, var1);
		class422 var4 = UrlRequester.method2921();
		var4.method7813(1.0F, 0.0F, 0.0F, var2);
		this.method7816(var4);
		var4.method7813(0.0F, 0.0F, 1.0F, var3);
		this.method7816(var4);
		var4.method7834();
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "821585892"
	)
	final void method7815() {
		this.field4689 = 0.0F;
		this.field4684 = 0.0F;
		this.field4687 = 0.0F;
		this.field4685 = 1.0F;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lqz;B)V",
		garbageValue = "-6"
	)
	public final void method7816(class422 var1) {
		this.method7814(this.field4685 * var1.field4687 + this.field4687 * var1.field4685 + var1.field4684 * this.field4689 - var1.field4689 * this.field4684, this.field4685 * var1.field4684 + (this.field4684 * var1.field4685 - var1.field4687 * this.field4689) + this.field4687 * var1.field4689, this.field4685 * var1.field4689 + (var1.field4687 * this.field4684 + this.field4689 * var1.field4685 - var1.field4684 * this.field4687), var1.field4685 * this.field4685 - var1.field4687 * this.field4687 - this.field4684 * var1.field4684 - this.field4689 * var1.field4689);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field4687;
		var2 = this.field4684 + var2 * 31.0F;
		var2 = this.field4689 + var2 * 31.0F;
		var2 = this.field4685 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4687 + "," + this.field4684 + "," + this.field4689 + "," + this.field4685;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class422)) {
			return false;
		} else {
			class422 var2 = (class422)var1;
			return this.field4687 == var2.field4687 && this.field4684 == var2.field4684 && this.field4689 == var2.field4689 && this.field4685 == var2.field4685;
		}
	}
}
