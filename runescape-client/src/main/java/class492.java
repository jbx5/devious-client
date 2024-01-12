import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sl")
public class class492 extends class495 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = 465008033
	)
	int field4931;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2022697449
	)
	int field4935;
	@ObfuscatedName("af")
	double field4933;
	@ObfuscatedName("aj")
	double field4934;
	@ObfuscatedName("aq")
	double field4932;
	@ObfuscatedName("ar")
	double field4936;
	@ObfuscatedName("ag")
	double field4937;

	public class492(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field4931 = 0;
		this.field4935 = 0;
		this.field4933 = 0.0D;
		this.field4934 = 0.0D;
		this.field4932 = 0.0D;
		this.field4936 = 0.0D;
		this.field4937 = 0.0D;
		this.field4931 = var3;
		this.field4935 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field4933 = (double)var4;
			this.field4934 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field4933 = (var17 + (var19 * var11 - var15 * var21) - var13) / (var19 - var21);
			this.field4934 = var19 * (this.field4933 - var11) + var13;
			this.field4932 = Math.sqrt(Math.pow(this.field4933 - (double)var1, 2.0D) + Math.pow(this.field4934 - (double)var2, 2.0D));
			this.field4936 = Math.atan2((double)var2 - this.field4934, (double)var1 - this.field4933);
			double var23 = Math.atan2((double)var8 - this.field4934, (double)var7 - this.field4933);
			this.field4937 = Math.atan2((double)var5 - this.field4934, (double)var4 - this.field4933);
			boolean var25 = this.field4936 <= var23 && var23 <= this.field4937 || this.field4937 <= var23 && var23 <= this.field4936;
			if (!var25) {
				this.field4937 += 3.141592653589793D * (double)(this.field4936 - this.field4937 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1318162338"
	)
	public int vmethod8819() {
		double var1 = this.method8828();
		double var3 = (this.field4937 - this.field4936) * var1 + this.field4936;
		return (int)Math.round(this.field4933 + this.field4932 * Math.cos(var3));
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-19"
	)
	public int vmethod8820() {
		double var1 = this.method8828();
		double var3 = (this.field4937 - this.field4936) * var1 + this.field4936;
		return (int)Math.round(this.field4934 + this.field4932 * Math.sin(var3));
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-12"
	)
	public int vmethod8814() {
		double var1 = this.method8828();
		return (int)Math.round((double)this.field4931 + var1 * (double)(this.field4935 - this.field4931));
	}
}
