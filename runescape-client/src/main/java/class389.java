import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
@ObfuscatedName("nq")
public class class389 {
	@ObfuscatedName("s")
	float field4404;

	@ObfuscatedName("h")
	float field4405;

	@ObfuscatedName("w")
	float field4406;

	@ObfuscatedName("v")
	float field4407;

	@ObfuscatedName("c")
	float field4413;

	@ObfuscatedName("q")
	float field4409;

	@ObfuscatedName("i")
	float field4410;

	@ObfuscatedName("k")
	float field4411;

	@ObfuscatedName("o")
	float field4416;

	@ObfuscatedName("n")
	float field4412;

	@ObfuscatedName("d")
	float field4414;

	@ObfuscatedName("a")
	float field4415;

	static {
		new class389();
	}

	class389() {
		this.method6980();
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-2002114783")
	void method6980() {
		this.field4415 = 0.0F;
		this.field4414 = 0.0F;
		this.field4412 = 0.0F;
		this.field4411 = 0.0F;
		this.field4410 = 0.0F;
		this.field4409 = 0.0F;
		this.field4407 = 0.0F;
		this.field4406 = 0.0F;
		this.field4405 = 0.0F;
		this.field4416 = 1.0F;
		this.field4413 = 1.0F;
		this.field4404 = 1.0F;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(FB)V", garbageValue = "24")
	void method6989(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4405;
		float var5 = this.field4413;
		float var6 = this.field4411;
		float var7 = this.field4414;
		this.field4405 = var2 * var4 - var3 * this.field4406;
		this.field4406 = var2 * this.field4406 + var3 * var4;
		this.field4413 = var2 * var5 - this.field4409 * var3;
		this.field4409 = var5 * var3 + this.field4409 * var2;
		this.field4411 = var6 * var2 - this.field4416 * var3;
		this.field4416 = var3 * var6 + this.field4416 * var2;
		this.field4414 = var2 * var7 - var3 * this.field4415;
		this.field4415 = var2 * this.field4415 + var7 * var3;
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "-1288376233")
	void method6982(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4404;
		float var5 = this.field4407;
		float var6 = this.field4410;
		float var7 = this.field4412;
		this.field4404 = var3 * this.field4406 + var4 * var2;
		this.field4406 = this.field4406 * var2 - var3 * var4;
		this.field4407 = this.field4409 * var3 + var2 * var5;
		this.field4409 = var2 * this.field4409 - var3 * var5;
		this.field4410 = this.field4416 * var3 + var6 * var2;
		this.field4416 = this.field4416 * var2 - var3 * var6;
		this.field4412 = var7 * var2 + this.field4415 * var3;
		this.field4415 = this.field4415 * var2 - var3 * var7;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(FI)V", garbageValue = "-1978648332")
	void method6983(float var1) {
		float var2 = ((float) (Math.cos(((double) (var1)))));
		float var3 = ((float) (Math.sin(((double) (var1)))));
		float var4 = this.field4404;
		float var5 = this.field4407;
		float var6 = this.field4410;
		float var7 = this.field4412;
		this.field4404 = var2 * var4 - this.field4405 * var3;
		this.field4405 = this.field4405 * var2 + var3 * var4;
		this.field4407 = var5 * var2 - this.field4413 * var3;
		this.field4413 = var2 * this.field4413 + var5 * var3;
		this.field4410 = var2 * var6 - this.field4411 * var3;
		this.field4411 = var6 * var3 + this.field4411 * var2;
		this.field4412 = var2 * var7 - var3 * this.field4414;
		this.field4414 = var3 * var7 + this.field4414 * var2;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(FFFI)V", garbageValue = "1253181465")
	void method6998(float var1, float var2, float var3) {
		this.field4412 += var1;
		this.field4414 += var2;
		this.field4415 += var3;
	}

	public String toString() {
		return this.field4404 + "," + this.field4407 + "," + this.field4410 + "," + this.field4412 + "\n" + this.field4405 + "," + this.field4413 + "," + this.field4411 + "," + this.field4414 + "\n" + this.field4406 + "," + this.field4409 + "," + this.field4416 + "," + this.field4415;
	}
}