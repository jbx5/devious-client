import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("ni")
public final class class387 {
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "[Lni;")
	static class387[] field4397 = new class387[0];

	@ObfuscatedName("h")
	@ObfuscatedGetter(intValue = 880421731)
	static int field4391 = 100;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 360696249)
	static int field4392;

	@ObfuscatedName("c")
	float field4393;

	@ObfuscatedName("q")
	float field4395;

	@ObfuscatedName("i")
	float field4394;

	@ObfuscatedName("k")
	float field4396;

	static {
		field4397 = new class387[100];
		field4392 = 0;
		new class387();
	}

	class387() {
		this.method6891();
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "-40")
	public void method6881() {
		synchronized(field4397) {
			if (field4392 < field4391 - 1) {
				field4397[++field4392 - 1] = this;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(FFFFB)V", garbageValue = "52")
	void method6886(float var1, float var2, float var3, float var4) {
		this.field4393 = var1;
		this.field4395 = var2;
		this.field4394 = var3;
		this.field4396 = var4;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(FFFFI)V", garbageValue = "-2087766706")
	public void method6883(float var1, float var2, float var3, float var4) {
		float var5 = ((float) (Math.sin(((double) (0.5F * var4)))));
		float var6 = ((float) (Math.cos(((double) (0.5F * var4)))));
		this.field4393 = var5 * var1;
		this.field4395 = var5 * var2;
		this.field4394 = var3 * var5;
		this.field4396 = var6;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "1536")
	final void method6891() {
		this.field4394 = 0.0F;
		this.field4395 = 0.0F;
		this.field4393 = 0.0F;
		this.field4396 = 1.0F;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(Lni;I)V", garbageValue = "-1080183652")
	public final void method6885(class387 var1) {
		this.method6886(this.field4393 * var1.field4396 + this.field4396 * var1.field4393 + var1.field4395 * this.field4394 - this.field4395 * var1.field4394, var1.field4394 * this.field4393 + var1.field4395 * this.field4396 + (this.field4395 * var1.field4396 - var1.field4393 * this.field4394), var1.field4394 * this.field4396 + (this.field4394 * var1.field4396 + var1.field4393 * this.field4395 - var1.field4395 * this.field4393), var1.field4396 * this.field4396 - this.field4393 * var1.field4393 - var1.field4395 * this.field4395 - var1.field4394 * this.field4394);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4393 + 31.0F * var2;
		var2 = 31.0F * var2 + this.field4395;
		var2 = this.field4394 + 31.0F * var2;
		var2 = this.field4396 + var2 * 31.0F;
		return ((int) (var2));
	}

	public String toString() {
		return this.field4393 + "," + this.field4395 + "," + this.field4394 + "," + this.field4396;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class387)) {
			return false;
		} else {
			class387 var2 = ((class387) (var1));
			return var2.field4393 == this.field4393 && var2.field4395 == this.field4395 && this.field4394 == var2.field4394 && var2.field4396 == this.field4396;
		}
	}
}