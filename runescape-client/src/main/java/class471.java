import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sy")
public class class471 {
	@ObfuscatedName("az")
	float field4884;
	@ObfuscatedName("ah")
	float field4879;
	@ObfuscatedName("af")
	float field4878;
	@ObfuscatedName("at")
	float field4883;
	@ObfuscatedName("an")
	float field4880;
	@ObfuscatedName("ao")
	float field4881;
	@ObfuscatedName("ab")
	float field4882;
	@ObfuscatedName("aw")
	float field4876;
	@ObfuscatedName("ad")
	float field4877;
	@ObfuscatedName("al")
	float field4885;
	@ObfuscatedName("as")
	float field4886;
	@ObfuscatedName("ag")
	float field4887;

	static {
		new class471();
	}

	class471() {
		this.method8480();
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "369151116"
	)
	void method8480() {
		this.field4887 = 0.0F;
		this.field4886 = 0.0F;
		this.field4885 = 0.0F;
		this.field4876 = 0.0F;
		this.field4882 = 0.0F;
		this.field4881 = 0.0F;
		this.field4883 = 0.0F;
		this.field4878 = 0.0F;
		this.field4879 = 0.0F;
		this.field4877 = 1.0F;
		this.field4880 = 1.0F;
		this.field4884 = 1.0F;
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1288099025"
	)
	void method8469(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4879;
		float var5 = this.field4880;
		float var6 = this.field4876;
		float var7 = this.field4886;
		this.field4879 = var4 * var2 - this.field4878 * var3;
		this.field4878 = var3 * var4 + var2 * this.field4878;
		this.field4880 = var2 * var5 - this.field4881 * var3;
		this.field4881 = var3 * var5 + var2 * this.field4881;
		this.field4876 = var6 * var2 - var3 * this.field4877;
		this.field4877 = this.field4877 * var2 + var3 * var6;
		this.field4886 = var7 * var2 - this.field4887 * var3;
		this.field4887 = var3 * var7 + this.field4887 * var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-1448273474"
	)
	void method8479(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4884;
		float var5 = this.field4883;
		float var6 = this.field4882;
		float var7 = this.field4885;
		this.field4884 = var2 * var4 + this.field4878 * var3;
		this.field4878 = var2 * this.field4878 - var4 * var3;
		this.field4883 = var3 * this.field4881 + var5 * var2;
		this.field4881 = var2 * this.field4881 - var3 * var5;
		this.field4882 = this.field4877 * var3 + var6 * var2;
		this.field4877 = this.field4877 * var2 - var3 * var6;
		this.field4885 = this.field4887 * var3 + var2 * var7;
		this.field4887 = var2 * this.field4887 - var3 * var7;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "1"
	)
	void method8471(float var1) {
		float var2 = (float)Math.cos((double)var1);
		float var3 = (float)Math.sin((double)var1);
		float var4 = this.field4884;
		float var5 = this.field4883;
		float var6 = this.field4882;
		float var7 = this.field4885;
		this.field4884 = var2 * var4 - this.field4879 * var3;
		this.field4879 = var4 * var3 + var2 * this.field4879;
		this.field4883 = var2 * var5 - this.field4880 * var3;
		this.field4880 = var2 * this.field4880 + var5 * var3;
		this.field4882 = var6 * var2 - this.field4876 * var3;
		this.field4876 = var3 * var6 + this.field4876 * var2;
		this.field4885 = var2 * var7 - this.field4886 * var3;
		this.field4886 = this.field4886 * var2 + var7 * var3;
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-1695720125"
	)
	void method8472(float var1, float var2, float var3) {
		this.field4885 += var1;
		this.field4886 += var2;
		this.field4887 += var3;
	}

	public String toString() {
		return this.field4884 + "," + this.field4883 + "," + this.field4882 + "," + this.field4885 + "\n" + this.field4879 + "," + this.field4880 + "," + this.field4876 + "," + this.field4886 + "\n" + this.field4878 + "," + this.field4881 + "," + this.field4877 + "," + this.field4887;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1336372967"
	)
	public static int method8475(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383;
	}
}
