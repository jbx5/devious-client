import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rd")
public final class class464 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lrd;"
	)
	static class464[] field4775;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1797064149
	)
	static int field4776;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 322921749
	)
	static int field4774;
	@ObfuscatedName("ax")
	float field4777;
	@ObfuscatedName("ao")
	float field4778;
	@ObfuscatedName("ah")
	float field4779;
	@ObfuscatedName("ar")
	float field4780;

	static {
		field4775 = new class464[0];
		class146.method3162(100);
		new class464();
	}

	class464() {
		this.method8321();
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1744815510"
	)
	public void method8338() {
		synchronized(field4775) {
			if (field4774 < field4776 - 1) {
				field4775[++field4774 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "1915313855"
	)
	void method8322(float var1, float var2, float var3, float var4) {
		this.field4777 = var1;
		this.field4778 = var2;
		this.field4779 = var3;
		this.field4780 = var4;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1238110919"
	)
	public void method8318(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field4777 = var1 * var5;
		this.field4778 = var5 * var2;
		this.field4779 = var5 * var3;
		this.field4780 = var6;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "33554432"
	)
	final void method8321() {
		this.field4779 = 0.0F;
		this.field4778 = 0.0F;
		this.field4777 = 0.0F;
		this.field4780 = 1.0F;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "255330704"
	)
	public final void method8326(class464 var1) {
		this.method8322(this.field4780 * var1.field4777 + this.field4777 * var1.field4780 + var1.field4778 * this.field4779 - var1.field4779 * this.field4778, this.field4777 * var1.field4779 + this.field4780 * var1.field4778 + (this.field4778 * var1.field4780 - this.field4779 * var1.field4777), var1.field4779 * this.field4780 + (var1.field4780 * this.field4779 + this.field4778 * var1.field4777 - this.field4777 * var1.field4778), var1.field4780 * this.field4780 - this.field4777 * var1.field4777 - var1.field4778 * this.field4778 - var1.field4779 * this.field4779);
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class464)) {
			return false;
		} else {
			class464 var2 = (class464)var1;
			return this.field4777 == var2.field4777 && var2.field4778 == this.field4778 && this.field4779 == var2.field4779 && this.field4780 == var2.field4780;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4777 + var2 * 31.0F;
		var2 = this.field4778 + var2 * 31.0F;
		var2 = 31.0F * var2 + this.field4779;
		var2 = this.field4780 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4777 + "," + this.field4778 + "," + this.field4779 + "," + this.field4780;
	}
}
