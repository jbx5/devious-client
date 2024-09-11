import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qx")
public class class428 {
	@ObfuscatedName("ac")
	float field4750;
	@ObfuscatedName("ae")
	float field4752;
	@ObfuscatedName("ag")
	float field4743;
	@ObfuscatedName("am")
	float field4744;
	@ObfuscatedName("ax")
	float field4745;
	@ObfuscatedName("aq")
	float field4746;
	@ObfuscatedName("af")
	float field4747;
	@ObfuscatedName("at")
	float field4742;
	@ObfuscatedName("au")
	float field4749;
	@ObfuscatedName("ar")
	float field4748;
	@ObfuscatedName("al")
	float field4751;
	@ObfuscatedName("ad")
	float field4741;

	static {
		new class428();
	}

	public class428() {
		this.method8213();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2031995469"
	)
	void method8213() {
		this.field4741 = 0.0F;
		this.field4751 = 0.0F;
		this.field4748 = 0.0F;
		this.field4742 = 0.0F;
		this.field4747 = 0.0F;
		this.field4746 = 0.0F;
		this.field4744 = 0.0F;
		this.field4743 = 0.0F;
		this.field4752 = 0.0F;
		this.field4749 = 1.0F;
		this.field4745 = 1.0F;
		this.field4750 = 1.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-124"
	)
	public void method8210(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4752;
		float var5 = this.field4745;
		float var6 = this.field4742;
		float var7 = this.field4751;
		this.field4752 = var2 * var4 - this.field4743 * var3;
		this.field4743 = var3 * var4 + this.field4743 * var2;
		this.field4745 = var5 * var2 - var3 * this.field4746;
		this.field4746 = var2 * this.field4746 + var5 * var3;
		this.field4742 = var6 * var2 - this.field4749 * var3;
		this.field4749 = var2 * this.field4749 + var3 * var6;
		this.field4751 = var7 * var2 - var3 * this.field4741;
		this.field4741 = this.field4741 * var2 + var7 * var3;
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-679832232"
	)
	public void method8211(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4750;
		float var5 = this.field4744;
		float var6 = this.field4747;
		float var7 = this.field4748;
		this.field4750 = var2 * var4 + var3 * this.field4743;
		this.field4743 = this.field4743 * var2 - var4 * var3;
		this.field4744 = var3 * this.field4746 + var2 * var5;
		this.field4746 = this.field4746 * var2 - var3 * var5;
		this.field4747 = this.field4749 * var3 + var6 * var2;
		this.field4749 = var2 * this.field4749 - var6 * var3;
		this.field4748 = this.field4741 * var3 + var7 * var2;
		this.field4741 = var2 * this.field4741 - var7 * var3;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-1"
	)
	void method8212(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4750;
		float var5 = this.field4744;
		float var6 = this.field4747;
		float var7 = this.field4748;
		this.field4750 = var2 * var4 - this.field4752 * var3;
		this.field4752 = this.field4752 * var2 + var3 * var4;
		this.field4744 = var2 * var5 - this.field4745 * var3;
		this.field4745 = var3 * var5 + this.field4745 * var2;
		this.field4747 = var2 * var6 - this.field4742 * var3;
		this.field4742 = var3 * var6 + this.field4742 * var2;
		this.field4748 = var2 * var7 - var3 * this.field4751;
		this.field4751 = this.field4751 * var2 + var7 * var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-192405633"
	)
	public void method8217(float var1, float var2, float var3) {
		this.field4748 += var1;
		this.field4751 += var2;
		this.field4741 += var3;
	}

	public String toString() {
		return this.field4750 + "," + this.field4744 + "," + this.field4747 + "," + this.field4748 + "\n" + this.field4752 + "," + this.field4745 + "," + this.field4742 + "," + this.field4751 + "\n" + this.field4743 + "," + this.field4746 + "," + this.field4749 + "," + this.field4741;
	}
}
