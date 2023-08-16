import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("se")
public class class476 extends class479 {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = 545069597
	)
	int field4856;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 70390181
	)
	int field4857;
	@ObfuscatedName("ao")
	double field4858;
	@ObfuscatedName("at")
	double field4859;
	@ObfuscatedName("ac")
	double field4860;
	@ObfuscatedName("ai")
	double field4862;
	@ObfuscatedName("az")
	double field4861;

	public class476(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field4856 = 0;
		this.field4857 = 0;
		this.field4858 = 0.0D;
		this.field4859 = 0.0D;
		this.field4860 = 0.0D;
		this.field4862 = 0.0D;
		this.field4861 = 0.0D;
		this.field4856 = var3;
		this.field4857 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field4858 = (double)var4;
			this.field4859 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field4858 = (var19 * var11 - var21 * var15 + var17 - var13) / (var19 - var21);
			this.field4859 = var13 + var19 * (this.field4858 - var11);
			this.field4860 = Math.sqrt(Math.pow(this.field4858 - (double)var1, 2.0D) + Math.pow(this.field4859 - (double)var2, 2.0D));
			this.field4862 = Math.atan2((double)var2 - this.field4859, (double)var1 - this.field4858);
			double var23 = Math.atan2((double)var8 - this.field4859, (double)var7 - this.field4858);
			this.field4861 = Math.atan2((double)var5 - this.field4859, (double)var4 - this.field4858);
			boolean var25 = this.field4862 <= var23 && var23 <= this.field4861 || this.field4861 <= var23 && var23 <= this.field4862;
			if (!var25) {
				this.field4861 += (double)(this.field4862 - this.field4861 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "818000115"
	)
	public int vmethod8458() {
		double var1 = this.method8473();
		double var3 = this.field4862 + (this.field4861 - this.field4862) * var1;
		return (int)Math.round(this.field4858 + this.field4860 * Math.cos(var3));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "363084355"
	)
	public int vmethod8459() {
		double var1 = this.method8473();
		double var3 = this.field4862 + var1 * (this.field4861 - this.field4862);
		return (int)Math.round(this.field4859 + this.field4860 * Math.sin(var3));
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1706544959"
	)
	public int vmethod8460() {
		double var1 = this.method8473();
		return (int)Math.round((double)this.field4856 + var1 * (double)(this.field4857 - this.field4856));
	}
}
