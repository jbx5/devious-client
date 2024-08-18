import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tk")
public class class509 extends class512 {
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 1223778797
	)
	int field5121;
	@ObfuscatedName("ay")
	@ObfuscatedGetter(
		intValue = -556328297
	)
	int field5119;
	@ObfuscatedName("an")
	double field5120;
	@ObfuscatedName("au")
	double field5118;
	@ObfuscatedName("ax")
	double field5122;
	@ObfuscatedName("ao")
	double field5123;
	@ObfuscatedName("am")
	double field5124;

	public class509(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5121 = 0;
		this.field5119 = 0;
		this.field5120 = 0.0D;
		this.field5118 = 0.0D;
		this.field5122 = 0.0D;
		this.field5123 = 0.0D;
		this.field5124 = 0.0D;
		this.field5121 = var3;
		this.field5119 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5120 = (double)var4;
			this.field5118 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5120 = (var19 * var11 - var15 * var21 + var17 - var13) / (var19 - var21);
			this.field5118 = var13 + var19 * (this.field5120 - var11);
			this.field5122 = Math.sqrt(Math.pow(this.field5120 - (double)var1, 2.0D) + Math.pow(this.field5118 - (double)var2, 2.0D));
			this.field5123 = Math.atan2((double)var2 - this.field5118, (double)var1 - this.field5120);
			double var23 = Math.atan2((double)var8 - this.field5118, (double)var7 - this.field5120);
			this.field5124 = Math.atan2((double)var5 - this.field5118, (double)var4 - this.field5120);
			boolean var25 = this.field5123 <= var23 && var23 <= this.field5124 || this.field5124 <= var23 && var23 <= this.field5123;
			if (!var25) {
				this.field5124 += 3.141592653589793D * (double)(this.field5123 - this.field5124 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "232112566"
	)
	public int vmethod9031() {
		double var1 = this.method9044();
		double var3 = var1 * (this.field5124 - this.field5123) + this.field5123;
		return (int)Math.round(this.field5120 + this.field5122 * Math.cos(var3));
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "78"
	)
	public int vmethod9035() {
		double var1 = this.method9044();
		double var3 = this.field5123 + var1 * (this.field5124 - this.field5123);
		return (int)Math.round(this.field5118 + this.field5122 * Math.sin(var3));
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2134013300"
	)
	public int vmethod9033() {
		double var1 = this.method9044();
		return (int)Math.round((double)this.field5121 + (double)(this.field5119 - this.field5121) * var1);
	}
}
