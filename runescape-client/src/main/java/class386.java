import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nq")
public final class class386 {
	@ObfuscatedName("su")
	@ObfuscatedGetter(intValue = 
	513737707)

	static int field4337;
	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"[Lnq;")

	static class386[] field4344;
	@ObfuscatedName("c")
	@ObfuscatedGetter(intValue = 
	829267689)

	static int field4338;
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 
	6322965)

	static int field4339;
	@ObfuscatedName("f")
	float field4340;
	@ObfuscatedName("b")
	float field4341;
	@ObfuscatedName("n")
	float field4342;
	@ObfuscatedName("s")
	float field4343;
	static 
	{
		field4344 = new class386[0];
		field4338 = 100;
		field4344 = new class386[100];
		field4339 = 0;
		new class386();
	}

	class386() {
		this.method6985();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"18")

	public void method6988() {
		synchronized(field4344) {
			if (field4339 < (field4338 - 1)) {
				field4344[(++field4339) - 1] = this;
			}

		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(FFFFI)V", garbageValue = 
	"-1694420315")

	void method6983(float var1, float var2, float var3, float var4) {
		this.field4340 = var1;
		this.field4341 = var2;
		this.field4342 = var3;
		this.field4343 = var4;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(FFFFI)V", garbageValue = 
	"-1973173355")

	public void method6984(float var1, float var2, float var3, float var4) {
		float var5 = ((float) (Math.sin(((double) (0.5F * var4)))));
		float var6 = ((float) (Math.cos(((double) (0.5F * var4)))));
		this.field4340 = var1 * var5;
		this.field4341 = var5 * var2;
		this.field4342 = var5 * var3;
		this.field4343 = var6;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"480633161")

	final void method6985() {
		this.field4342 = 0.0F;
		this.field4341 = 0.0F;
		this.field4340 = 0.0F;
		this.field4343 = 1.0F;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(Lnq;I)V", garbageValue = 
	"1069726937")

	public final void method6986(class386 var1) {
		this.method6983((((var1.field4341 * this.field4342) + (this.field4340 * var1.field4343)) + (this.field4343 * var1.field4340)) - (var1.field4342 * this.field4341), (((this.field4340 * var1.field4342) + (var1.field4343 * this.field4341)) - (this.field4342 * var1.field4340)) + (var1.field4341 * this.field4343), (this.field4343 * var1.field4342) + (((this.field4341 * var1.field4340) + (this.field4342 * var1.field4343)) - (var1.field4341 * this.field4340)), (((var1.field4343 * this.field4343) - (var1.field4340 * this.field4340)) - (var1.field4341 * this.field4341)) - (var1.field4342 * this.field4342));
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class386)) {
			return false;
		} else {
			class386 var2 = ((class386) (var1));
			return (((var2.field4340 == this.field4340) && (this.field4341 == var2.field4341)) && (var2.field4342 == this.field4342)) && (this.field4343 == var2.field4343);
		}
	}

	public int hashCode() {
		float var2 = 1.0F;
		var2 = this.field4340 + (var2 * 31.0F);
		var2 = this.field4341 + (var2 * 31.0F);
		var2 = this.field4342 + (var2 * 31.0F);
		var2 = this.field4343 + (31.0F * var2);
		return ((int) (var2));
	}

	public String toString() {
		return (((((this.field4340 + ",") + this.field4341) + ",") + this.field4342) + ",") + this.field4343;
	}
}