import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sp")
public class class488 extends class491 {
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -239181665
	)
	int field4902;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -1035546963
	)
	int field4897;
	@ObfuscatedName("ar")
	double field4898;
	@ObfuscatedName("ao")
	double field4899;
	@ObfuscatedName("ab")
	double field4900;
	@ObfuscatedName("au")
	double field4901;
	@ObfuscatedName("aa")
	double field4896;

	public class488(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field4902 = 0;
		this.field4897 = 0;
		this.field4898 = 0.0D;
		this.field4899 = 0.0D;
		this.field4900 = 0.0D;
		this.field4901 = 0.0D;
		this.field4896 = 0.0D;
		this.field4902 = var3;
		this.field4897 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field4898 = (double)var4;
			this.field4899 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = (double)(var7 - var1) * -1.0D / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field4898 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
			this.field4899 = var13 + var19 * (this.field4898 - var11);
			this.field4900 = Math.sqrt(Math.pow(this.field4898 - (double)var1, 2.0D) + Math.pow(this.field4899 - (double)var2, 2.0D));
			this.field4901 = Math.atan2((double)var2 - this.field4899, (double)var1 - this.field4898);
			double var23 = Math.atan2((double)var8 - this.field4899, (double)var7 - this.field4898);
			this.field4896 = Math.atan2((double)var5 - this.field4899, (double)var4 - this.field4898);
			boolean var25 = this.field4901 <= var23 && var23 <= this.field4896 || this.field4896 <= var23 && var23 <= this.field4901;
			if (!var25) {
				this.field4896 += (double)(this.field4901 - this.field4896 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "2"
	)
	public int vmethod8673() {
		double var1 = this.method8685();
		double var3 = this.field4901 + var1 * (this.field4896 - this.field4901);
		return (int)Math.round(this.field4898 + this.field4900 * Math.cos(var3));
	}

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "124"
	)
	public int vmethod8674() {
		double var1 = this.method8685();
		double var3 = var1 * (this.field4896 - this.field4901) + this.field4901;
		return (int)Math.round(this.field4899 + this.field4900 * Math.sin(var3));
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1254922863"
	)
	public int vmethod8675() {
		double var1 = this.method8685();
		return (int)Math.round((double)this.field4902 + var1 * (double)(this.field4897 - this.field4902));
	}
}
