import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qi")
public class class426 {
	@ObfuscatedName("uf")
	@ObfuscatedGetter(
		intValue = 562496781
	)
	static int field4703;
	@ObfuscatedName("ab")
	float field4701;
	@ObfuscatedName("ay")
	float field4694;
	@ObfuscatedName("an")
	float field4692;
	@ObfuscatedName("au")
	float field4693;
	@ObfuscatedName("ax")
	float field4702;
	@ObfuscatedName("ao")
	float field4695;
	@ObfuscatedName("am")
	float field4698;
	@ObfuscatedName("ac")
	float field4696;
	@ObfuscatedName("ae")
	float field4690;
	@ObfuscatedName("ad")
	float field4691;
	@ObfuscatedName("aq")
	float field4700;
	@ObfuscatedName("al")
	float field4699;

	static {
		new class426();
	}

	public class426() {
		this.method7958();
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-88"
	)
	void method7958() {
		this.field4699 = 0.0F;
		this.field4700 = 0.0F;
		this.field4691 = 0.0F;
		this.field4696 = 0.0F;
		this.field4698 = 0.0F;
		this.field4695 = 0.0F;
		this.field4693 = 0.0F;
		this.field4692 = 0.0F;
		this.field4694 = 0.0F;
		this.field4690 = 1.0F;
		this.field4702 = 1.0F;
		this.field4701 = 1.0F;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-1"
	)
	public void method7946(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4694;
		float var5 = this.field4702;
		float var6 = this.field4696;
		float var7 = this.field4700;
		this.field4694 = var4 * var2 - var3 * this.field4692;
		this.field4692 = var3 * var4 + this.field4692 * var2;
		this.field4702 = var5 * var2 - this.field4695 * var3;
		this.field4695 = this.field4695 * var2 + var3 * var5;
		this.field4696 = var6 * var2 - var3 * this.field4690;
		this.field4690 = this.field4690 * var2 + var6 * var3;
		this.field4700 = var2 * var7 - var3 * this.field4699;
		this.field4699 = this.field4699 * var2 + var7 * var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "1"
	)
	public void method7952(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4701;
		float var5 = this.field4693;
		float var6 = this.field4698;
		float var7 = this.field4691;
		this.field4701 = this.field4692 * var3 + var2 * var4;
		this.field4692 = var2 * this.field4692 - var3 * var4;
		this.field4693 = var2 * var5 + var3 * this.field4695;
		this.field4695 = var2 * this.field4695 - var5 * var3;
		this.field4698 = var3 * this.field4690 + var2 * var6;
		this.field4690 = var2 * this.field4690 - var6 * var3;
		this.field4691 = var3 * this.field4699 + var2 * var7;
		this.field4699 = var2 * this.field4699 - var7 * var3;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-492982304"
	)
	void method7948(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4701;
		float var5 = this.field4693;
		float var6 = this.field4698;
		float var7 = this.field4691;
		this.field4701 = var4 * var2 - this.field4694 * var3;
		this.field4694 = var4 * var3 + var2 * this.field4694;
		this.field4693 = var2 * var5 - this.field4702 * var3;
		this.field4702 = var2 * this.field4702 + var5 * var3;
		this.field4698 = var2 * var6 - var3 * this.field4696;
		this.field4696 = var6 * var3 + this.field4696 * var2;
		this.field4691 = var7 * var2 - var3 * this.field4700;
		this.field4700 = var2 * this.field4700 + var7 * var3;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-554755239"
	)
	public void method7955(float var1, float var2, float var3) {
		this.field4691 += var1;
		this.field4700 += var2;
		this.field4699 += var3;
	}

	public String toString() {
		return this.field4701 + "," + this.field4693 + "," + this.field4698 + "," + this.field4691 + "\n" + this.field4694 + "," + this.field4702 + "," + this.field4696 + "," + this.field4700 + "\n" + this.field4692 + "," + this.field4695 + "," + this.field4690 + "," + this.field4699;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(IIB)I",
		garbageValue = "1"
	)
	public static int method7963(int var0, int var1) {
		return (-3 - var0 << 8) + var1;
	}
}
