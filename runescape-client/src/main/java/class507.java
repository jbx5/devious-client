import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tg")
public class class507 extends class510 {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 306022681
	)
	int field5094;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1961828697
	)
	int field5090;
	@ObfuscatedName("aj")
	double field5091;
	@ObfuscatedName("az")
	double field5089;
	@ObfuscatedName("af")
	double field5093;
	@ObfuscatedName("aa")
	double field5095;
	@ObfuscatedName("at")
	double field5092;

	public class507(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5094 = 0;
		this.field5090 = 0;
		this.field5091 = 0.0D;
		this.field5089 = 0.0D;
		this.field5093 = 0.0D;
		this.field5095 = 0.0D;
		this.field5092 = 0.0D;
		this.field5094 = var3;
		this.field5090 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5091 = (double)var4;
			this.field5089 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5091 = (var17 + (var19 * var11 - var21 * var15) - var13) / (var19 - var21);
			this.field5089 = var19 * (this.field5091 - var11) + var13;
			this.field5093 = Math.sqrt(Math.pow(this.field5091 - (double)var1, 2.0D) + Math.pow(this.field5089 - (double)var2, 2.0D));
			this.field5095 = Math.atan2((double)var2 - this.field5089, (double)var1 - this.field5091);
			double var23 = Math.atan2((double)var8 - this.field5089, (double)var7 - this.field5091);
			this.field5092 = Math.atan2((double)var5 - this.field5089, (double)var4 - this.field5091);
			boolean var25 = this.field5095 <= var23 && var23 <= this.field5092 || this.field5092 <= var23 && var23 <= this.field5095;
			if (!var25) {
				this.field5092 += (double)(this.field5095 - this.field5092 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "-31"
	)
	public int vmethod9046() {
		double var1 = this.method9058();
		double var3 = this.field5095 + var1 * (this.field5092 - this.field5095);
		return (int)Math.round(this.field5091 + this.field5093 * Math.cos(var3));
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-915809137"
	)
	public int vmethod9049() {
		double var1 = this.method9058();
		double var3 = var1 * (this.field5092 - this.field5095) + this.field5095;
		return (int)Math.round(this.field5089 + this.field5093 * Math.sin(var3));
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "119291980"
	)
	public int vmethod9047() {
		double var1 = this.method9058();
		return (int)Math.round(var1 * (double)(this.field5090 - this.field5094) + (double)this.field5094);
	}
}
