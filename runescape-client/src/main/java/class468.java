import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sf")
public final class class468 {
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lsf;"
	)
	static class468[] field4833;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -239332155
	)
	static int field4838;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1473148381
	)
	static int field4834;
	@ObfuscatedName("ai")
	float field4835;
	@ObfuscatedName("ar")
	float field4836;
	@ObfuscatedName("as")
	float field4837;
	@ObfuscatedName("aa")
	float field4832;

	static {
		field4833 = new class468[0];
		field4838 = 100;
		field4833 = new class468[100];
		field4834 = 0;
		new class468();
	}

	class468() {
		this.method8593();
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	public void method8597() {
		synchronized(field4833) {
			if (field4834 < field4838 - 1) {
				field4833[++field4834 - 1] = this;
			}

		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FFFFB)V",
		garbageValue = "-101"
	)
	void method8596(float var1, float var2, float var3, float var4) {
		this.field4835 = var1;
		this.field4836 = var2;
		this.field4837 = var3;
		this.field4832 = var4;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FFFFI)V",
		garbageValue = "-1089175706"
	)
	public void method8592(float var1, float var2, float var3, float var4) {
		float var5 = (float)Math.sin((double)(0.5F * var4));
		float var6 = (float)Math.cos((double)(0.5F * var4));
		this.field4835 = var1 * var5;
		this.field4836 = var2 * var5;
		this.field4837 = var3 * var5;
		this.field4832 = var6;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "752088087"
	)
	final void method8593() {
		this.field4837 = 0.0F;
		this.field4836 = 0.0F;
		this.field4835 = 0.0F;
		this.field4832 = 1.0F;
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(Lsf;I)V",
		garbageValue = "1990416396"
	)
	public final void method8594(class468 var1) {
		this.method8596(var1.field4835 * this.field4832 + this.field4835 * var1.field4832 + var1.field4836 * this.field4837 - var1.field4837 * this.field4836, var1.field4836 * this.field4832 + (var1.field4832 * this.field4836 - this.field4837 * var1.field4835) + this.field4835 * var1.field4837, var1.field4832 * this.field4837 + this.field4836 * var1.field4835 - this.field4835 * var1.field4836 + this.field4832 * var1.field4837, var1.field4832 * this.field4832 - this.field4835 * var1.field4835 - var1.field4836 * this.field4836 - var1.field4837 * this.field4837);
	}

	public String toString() {
		return this.field4835 + "," + this.field4836 + "," + this.field4837 + "," + this.field4832;
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class468)) {
			return false;
		} else {
			class468 var2 = (class468)var1;
			return this.field4835 == var2.field4835 && var2.field4836 == this.field4836 && var2.field4837 == this.field4837 && var2.field4832 == this.field4832;
		}
	}

	public int hashCode() {
		boolean var1 = true;
		float var2 = 1.0F;
		var2 = var2 * 31.0F + this.field4835;
		var2 = var2 * 31.0F + this.field4836;
		var2 = var2 * 31.0F + this.field4837;
		var2 = var2 * 31.0F + this.field4832;
		return (int)var2;
	}
}
