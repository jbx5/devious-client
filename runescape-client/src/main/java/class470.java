import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ss")
public class class470 {
	@ObfuscatedName("aq")
	float field4849;
	@ObfuscatedName("aw")
	float field4848;
	@ObfuscatedName("al")
	float field4856;
	@ObfuscatedName("ai")
	float field4850;
	@ObfuscatedName("ar")
	float field4851;
	@ObfuscatedName("as")
	float field4847;
	@ObfuscatedName("aa")
	float field4853;
	@ObfuscatedName("az")
	float field4854;
	@ObfuscatedName("ao")
	float field4859;
	@ObfuscatedName("au")
	float field4855;
	@ObfuscatedName("ak")
	float field4857;
	@ObfuscatedName("ah")
	float field4858;

	static {
		new class470();
	}

	class470() {
		this.method8691();
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-320720084"
	)
	void method8691() {
		this.field4858 = 0.0F;
		this.field4857 = 0.0F;
		this.field4855 = 0.0F;
		this.field4854 = 0.0F;
		this.field4853 = 0.0F;
		this.field4847 = 0.0F;
		this.field4850 = 0.0F;
		this.field4856 = 0.0F;
		this.field4848 = 0.0F;
		this.field4859 = 1.0F;
		this.field4851 = 1.0F;
		this.field4849 = 1.0F;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "46"
	)
	void method8687(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4848;
		float var5 = this.field4851;
		float var6 = this.field4854;
		float var7 = this.field4857;
		this.field4848 = var4 * var2 - var3 * this.field4856;
		this.field4856 = var4 * var3 + var2 * this.field4856;
		this.field4851 = var5 * var2 - this.field4847 * var3;
		this.field4847 = var3 * var5 + this.field4847 * var2;
		this.field4854 = var2 * var6 - this.field4859 * var3;
		this.field4859 = var2 * this.field4859 + var3 * var6;
		this.field4857 = var2 * var7 - var3 * this.field4858;
		this.field4858 = var2 * this.field4858 + var7 * var3;
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-22"
	)
	void method8692(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4849;
		float var5 = this.field4850;
		float var6 = this.field4853;
		float var7 = this.field4855;
		this.field4849 = var4 * var2 + var3 * this.field4856;
		this.field4856 = this.field4856 * var2 - var3 * var4;
		this.field4850 = this.field4847 * var3 + var5 * var2;
		this.field4847 = var2 * this.field4847 - var5 * var3;
		this.field4853 = this.field4859 * var3 + var2 * var6;
		this.field4859 = var2 * this.field4859 - var3 * var6;
		this.field4855 = var7 * var2 + this.field4858 * var3;
		this.field4858 = var2 * this.field4858 - var3 * var7;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "1616340143"
	)
	void method8689(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4849;
		float var5 = this.field4850;
		float var6 = this.field4853;
		float var7 = this.field4855;
		this.field4849 = var2 * var4 - var3 * this.field4848;
		this.field4848 = this.field4848 * var2 + var3 * var4;
		this.field4850 = var5 * var2 - var3 * this.field4851;
		this.field4851 = this.field4851 * var2 + var3 * var5;
		this.field4853 = var2 * var6 - var3 * this.field4854;
		this.field4854 = var3 * var6 + var2 * this.field4854;
		this.field4855 = var2 * var7 - this.field4857 * var3;
		this.field4857 = this.field4857 * var2 + var3 * var7;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "1732882038"
	)
	void method8688(float var1, float var2, float var3) {
		this.field4855 += var1;
		this.field4857 += var2;
		this.field4858 += var3;
	}

	public String toString() {
		return this.field4849 + "," + this.field4850 + "," + this.field4853 + "," + this.field4855 + "\n" + this.field4848 + "," + this.field4851 + "," + this.field4854 + "," + this.field4857 + "\n" + this.field4856 + "," + this.field4847 + "," + this.field4859 + "," + this.field4858;
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1484781205"
	)
	static final boolean method8697() {
		return Client.isMenuOpen;
	}
}
