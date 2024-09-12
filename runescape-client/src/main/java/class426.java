import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qd")
public final class class426 {
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "[Lqd;"
	)
	static class426[] field4727;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1930938489
	)
	static int field4729;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -1298270997
	)
	static int field4725;
	@ObfuscatedName("am")
	float field4728;
	@ObfuscatedName("ax")
	float field4732;
	@ObfuscatedName("aq")
	float field4730;
	@ObfuscatedName("af")
	float field4731;

	static {
		field4727 = new class426[0];
		field4729 = 100;
		field4727 = new class426[100];
		field4725 = 0;
		new class426();
	}

	class426() {
		this.method8100();
	}

	public class426(float var1, float var2, float var3) {
		this.method8118(var1, var2, var3);
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1056974395"
	)
	public void method8098() {
		synchronized(field4727) {
			if (field4725 < field4729 - 1) {
				field4727[++field4725 - 1] = this;
			}

		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "332808820"
	)
	void method8099(float var1, float var2, float var3, float var4) {
		this.field4728 = var1;
		this.field4732 = var2;
		this.field4730 = var3;
		this.field4731 = var4;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "544928109"
	)
	public void method8107(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(var4 * 0.5F));
		float var6 = (float)Math.cos((double)(var4 * 0.5F));
		this.field4728 = var5 * var1;
		this.field4732 = var2 * var5;
		this.field4730 = var5 * var3;
		this.field4731 = var6;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFB)V",
		garbageValue = "2"
	)
	public void method8118(float var1, float var2, float var3) {
		this.method8107(0.0F, 1.0F, 0.0F, var1);
		class426 var4 = class157.method3544();
		var4.method8107(1.0F, 0.0F, 0.0F, var2);
		this.method8103(var4);
		var4.method8107(0.0F, 0.0F, 1.0F, var3);
		this.method8103(var4);
		var4.method8098();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "783933342"
	)
	final void method8100() {
		this.field4730 = 0.0F;
		this.field4732 = 0.0F;
		this.field4728 = 0.0F;
		this.field4731 = 1.0F;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lqd;B)V",
		garbageValue = "34"
	)
	public final void method8103(class426 var1) {
		this.method8099(this.field4731 * var1.field4728 + this.field4728 * var1.field4731 + this.field4730 * var1.field4732 - var1.field4730 * this.field4732, this.field4728 * var1.field4730 + this.field4732 * var1.field4731 - var1.field4728 * this.field4730 + var1.field4732 * this.field4731, this.field4731 * var1.field4730 + (this.field4732 * var1.field4728 + this.field4730 * var1.field4731 - this.field4728 * var1.field4732), this.field4731 * var1.field4731 - this.field4728 * var1.field4728 - this.field4732 * var1.field4732 - var1.field4730 * this.field4730);
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = 31.0F * var2 + this.field4728;
		var2 = this.field4732 + 31.0F * var2;
		var2 = this.field4730 + 31.0F * var2;
		var2 = this.field4731 + var2 * 31.0F;
		return (int)var2;
	}

	public String toString() {
		return this.field4728 + "," + this.field4732 + "," + this.field4730 + "," + this.field4731;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class426)) {
			return false;
		} else {
			class426 var2 = (class426)var1;
			return this.field4728 == var2.field4728 && var2.field4732 == this.field4732 && this.field4730 == var2.field4730 && this.field4731 == var2.field4731;
		}
	}
}
