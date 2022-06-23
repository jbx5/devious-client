import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
@ObfuscatedName("ni")
public final class class386 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "[Lni;")
	public static class386[] field4389;

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 1938256603)
	static int field4386;

	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 585469667)
	public static int field4385;

	@ObfuscatedName("f")
	float field4388;

	@ObfuscatedName("j")
	float field4387;

	@ObfuscatedName("e")
	float field4390;

	@ObfuscatedName("g")
	float field4391;

	static {
		field4389 = new class386[0];
		field4386 = 100;
		field4389 = new class386[100];
		field4385 = 0;
		new class386();
	}

	public class386() {
		this.method6951();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(I)V", garbageValue = "-1892686311")
	public void method6936() {
		synchronized(field4389) {
			if (field4385 < field4386 - 1) {
				field4389[++field4385 - 1] = this;
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(FFFFI)V", garbageValue = "365980617")
	void method6942(float var1, float var2, float var3, float var4) {
		this.field4388 = var1;
		this.field4387 = var2;
		this.field4390 = var3;
		this.field4391 = var4;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(FFFFI)V", garbageValue = "1728138085")
	public void method6945(float var1, float var2, float var3, float var4) {
		float var5 = ((float) (Math.sin(((double) (var4 * 0.5F)))));
		float var6 = ((float) (Math.cos(((double) (var4 * 0.5F)))));
		this.field4388 = var5 * var1;
		this.field4387 = var2 * var5;
		this.field4390 = var3 * var5;
		this.field4391 = var6;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = "(B)V", garbageValue = "112")
	public final void method6951() {
		this.field4390 = 0.0F;
		this.field4387 = 0.0F;
		this.field4388 = 0.0F;
		this.field4391 = 1.0F;
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(descriptor = "(Lni;I)V", garbageValue = "-1489073832")
	public final void method6938(class386 var1) {
		this.method6942(var1.field4388 * this.field4391 + this.field4388 * var1.field4391 + this.field4390 * var1.field4387 - var1.field4390 * this.field4387, this.field4388 * var1.field4390 + var1.field4391 * this.field4387 - this.field4390 * var1.field4388 + var1.field4387 * this.field4391, this.field4391 * var1.field4390 + (this.field4387 * var1.field4388 + var1.field4391 * this.field4390 - var1.field4387 * this.field4388), var1.field4391 * this.field4391 - this.field4388 * var1.field4388 - this.field4387 * var1.field4387 - this.field4390 * var1.field4390);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = this.field4388 + var2 * 31.0F;
		var2 = 31.0F * var2 + this.field4387;
		var2 = this.field4390 + var2 * 31.0F;
		var2 = 31.0F * var2 + this.field4391;
		return ((int) (var2));
	}

	public String toString() {
		return this.field4388 + "," + this.field4387 + "," + this.field4390 + "," + this.field4391;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class386)) {
			return false;
		} else {
			class386 var2 = ((class386) (var1));
			return var2.field4388 == this.field4388 && this.field4387 == var2.field4387 && var2.field4390 == this.field4390 && var2.field4391 == this.field4391;
		}
	}
}