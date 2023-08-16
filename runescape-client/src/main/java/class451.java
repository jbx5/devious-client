import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("rm")
public class class451 {
	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "[Luk;"
	)
	static IndexedSprite[] field4755;
	@ObfuscatedName("au")
	float field4749;
	@ObfuscatedName("ae")
	float field4744;
	@ObfuscatedName("ao")
	float field4745;
	@ObfuscatedName("at")
	float field4746;
	@ObfuscatedName("ac")
	float field4748;
	@ObfuscatedName("ai")
	float field4743;
	@ObfuscatedName("az")
	float field4753;
	@ObfuscatedName("ap")
	float field4750;
	@ObfuscatedName("aa")
	float field4747;
	@ObfuscatedName("af")
	float field4752;
	@ObfuscatedName("ad")
	float field4751;
	@ObfuscatedName("aq")
	float field4754;

	static {
		new class451();
	}

	class451() {
		this.method8255();
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1136613952"
	)
	void method8255() {
		this.field4754 = 0.0F;
		this.field4751 = 0.0F;
		this.field4752 = 0.0F;
		this.field4750 = 0.0F;
		this.field4753 = 0.0F;
		this.field4743 = 0.0F;
		this.field4746 = 0.0F;
		this.field4745 = 0.0F;
		this.field4744 = 0.0F;
		this.field4747 = 1.0F;
		this.field4748 = 1.0F;
		this.field4749 = 1.0F;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-67"
	)
	void method8257(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4744;
		float var5 = this.field4748;
		float var6 = this.field4750;
		float var7 = this.field4751;
		this.field4744 = var4 * var2 - var3 * this.field4745;
		this.field4745 = var2 * this.field4745 + var4 * var3;
		this.field4748 = var5 * var2 - this.field4743 * var3;
		this.field4743 = var5 * var3 + this.field4743 * var2;
		this.field4750 = var2 * var6 - var3 * this.field4747;
		this.field4747 = var6 * var3 + this.field4747 * var2;
		this.field4751 = var2 * var7 - var3 * this.field4754;
		this.field4754 = var7 * var3 + this.field4754 * var2;
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "0"
	)
	void method8261(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4749;
		float var5 = this.field4746;
		float var6 = this.field4753;
		float var7 = this.field4752;
		this.field4749 = var3 * this.field4745 + var2 * var4;
		this.field4745 = this.field4745 * var2 - var4 * var3;
		this.field4746 = var3 * this.field4743 + var2 * var5;
		this.field4743 = this.field4743 * var2 - var3 * var5;
		this.field4753 = var6 * var2 + this.field4747 * var3;
		this.field4747 = this.field4747 * var2 - var3 * var6;
		this.field4752 = var2 * var7 + this.field4754 * var3;
		this.field4754 = this.field4754 * var2 - var7 * var3;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-2078210991"
	)
	void method8258(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4749;
		float var5 = this.field4746;
		float var6 = this.field4753;
		float var7 = this.field4752;
		this.field4749 = var2 * var4 - var3 * this.field4744;
		this.field4744 = var2 * this.field4744 + var3 * var4;
		this.field4746 = var5 * var2 - var3 * this.field4748;
		this.field4748 = var3 * var5 + var2 * this.field4748;
		this.field4753 = var2 * var6 - var3 * this.field4750;
		this.field4750 = this.field4750 * var2 + var3 * var6;
		this.field4752 = var2 * var7 - this.field4751 * var3;
		this.field4751 = this.field4751 * var2 + var7 * var3;
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-586193895"
	)
	void method8259(float var1, float var2, float var3) {
		this.field4752 += var1;
		this.field4751 += var2;
		this.field4754 += var3;
	}

	public String toString() {
		return this.field4749 + "," + this.field4746 + "," + this.field4753 + "," + this.field4752 + "\n" + this.field4744 + "," + this.field4748 + "," + this.field4750 + "," + this.field4751 + "\n" + this.field4745 + "," + this.field4743 + "," + this.field4747 + "," + this.field4754;
	}
}
