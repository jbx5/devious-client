import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tl")
public class class508 extends class511 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1651361859
	)
	int field5121;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = 773906829
	)
	int field5127;
	@ObfuscatedName("ag")
	double field5123;
	@ObfuscatedName("ak")
	double field5124;
	@ObfuscatedName("ap")
	double field5125;
	@ObfuscatedName("an")
	double field5126;
	@ObfuscatedName("aj")
	double field5122;

	public class508(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5121 = 0;
		this.field5127 = 0;
		this.field5123 = 0.0D;
		this.field5124 = 0.0D;
		this.field5125 = 0.0D;
		this.field5126 = 0.0D;
		this.field5122 = 0.0D;
		this.field5121 = var3;
		this.field5127 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5123 = (double)var4;
			this.field5124 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = (double)(var4 - var7) * -1.0D / (double)(var5 - var8);
			this.field5123 = (var17 + (var19 * var11 - var21 * var15) - var13) / (var19 - var21);
			this.field5124 = (this.field5123 - var11) * var19 + var13;
			this.field5125 = Math.sqrt(Math.pow(this.field5123 - (double)var1, 2.0D) + Math.pow(this.field5124 - (double)var2, 2.0D));
			this.field5126 = Math.atan2((double)var2 - this.field5124, (double)var1 - this.field5123);
			double var23 = Math.atan2((double)var8 - this.field5124, (double)var7 - this.field5123);
			this.field5122 = Math.atan2((double)var5 - this.field5124, (double)var4 - this.field5123);
			boolean var25 = this.field5126 <= var23 && var23 <= this.field5122 || this.field5122 <= var23 && var23 <= this.field5126;
			if (!var25) {
				this.field5122 += 3.141592653589793D * (double)(this.field5126 - this.field5122 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2083196394"
	)
	public int vmethod8962() {
		double var1 = this.method8971();
		double var3 = var1 * (this.field5122 - this.field5126) + this.field5126;
		return (int)Math.round(this.field5123 + this.field5125 * Math.cos(var3));
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "599491827"
	)
	public int vmethod8963() {
		double var1 = this.method8971();
		double var3 = this.field5126 + var1 * (this.field5122 - this.field5126);
		return (int)Math.round(this.field5124 + this.field5125 * Math.sin(var3));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1194956978"
	)
	public int vmethod8964() {
		double var1 = this.method8971();
		return (int)Math.round((double)this.field5121 + (double)(this.field5127 - this.field5121) * var1);
	}
}
