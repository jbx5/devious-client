import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public final class class427 {
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "[Lqp;"
	)
	static class427[] field4776;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -858242687
	)
	static int field4775;
	@ObfuscatedName("aj")
	float field4778;
	@ObfuscatedName("ai")
	float field4774;
	@ObfuscatedName("ay")
	float field4777;
	@ObfuscatedName("as")
	float field4779;

	static {
		field4776 = new class427[0];
		GrandExchangeOffer.method7798(100);
		new class427();
	}

	class427() {
		this.method8223();
	}

	public class427(float var1, float var2, float var3) {
		this.method8234(var1, var2, var3);
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1716326497"
	)
	public void method8227() {
		synchronized(field4776) {
			if (field4775 < class484.field5048 - 1) {
				field4776[++field4775 - 1] = this;
			}

		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "962218821"
	)
	void method8221(float var1, float var2, float var3, float var4) {
		this.field4778 = var1;
		this.field4774 = var2;
		this.field4777 = var3;
		this.field4779 = var4;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "-89"
	)
	public void method8229(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4778 = var5 * var1;
		this.field4774 = var5 * var2;
		this.field4777 = var3 * var5;
		this.field4779 = var6;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-103363340"
	)
	public void method8234(float var1, float var2, float var3) {
		this.method8229(0.0F, 1.0F, 0.0F, var1);
		class427 var4 = AABB.method5244();
		var4.method8229(1.0F, 0.0F, 0.0F, var2);
		this.method8225(var4);
		var4.method8229(0.0F, 0.0F, 1.0F, var3);
		this.method8225(var4);
		var4.method8227();
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-13"
	)
	final void method8223() {
		this.field4777 = 0.0F;
		this.field4774 = 0.0F;
		this.field4778 = 0.0F;
		this.field4779 = 1.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lqp;B)V",
		garbageValue = "44"
	)
	public final void method8225(class427 var1) {
		this.method8221(this.field4778 * var1.field4779 + var1.field4778 * this.field4779 + var1.field4774 * this.field4777 - this.field4774 * var1.field4777, this.field4779 * var1.field4774 + (this.field4774 * var1.field4779 - this.field4777 * var1.field4778) + this.field4778 * var1.field4777, this.field4777 * var1.field4779 + this.field4774 * var1.field4778 - var1.field4774 * this.field4778 + var1.field4777 * this.field4779, this.field4779 * var1.field4779 - this.field4778 * var1.field4778 - this.field4774 * var1.field4774 - this.field4777 * var1.field4777);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4778 + var2 * 31.0F;
		var2 = var2 * 31.0F + this.field4774;
		var2 = 31.0F * var2 + this.field4777;
		var2 = this.field4779 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4778 + "," + this.field4774 + "," + this.field4777 + "," + this.field4779;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class427)) {
			return false;
		} else {
			class427 var2 = (class427)var1;
			return this.field4778 == var2.field4778 && this.field4774 == var2.field4774 && this.field4777 == var2.field4777 && this.field4779 == var2.field4779;
		}
	}
}
