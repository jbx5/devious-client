import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ta")
public class class511 extends class514 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -1476622105
	)
	int field5166;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1102342207
	)
	int field5167;
	@ObfuscatedName("ag")
	double field5162;
	@ObfuscatedName("am")
	double field5160;
	@ObfuscatedName("ax")
	double field5164;
	@ObfuscatedName("aq")
	double field5165;
	@ObfuscatedName("af")
	double field5163;

	public class511(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5166 = 0;
		this.field5167 = 0;
		this.field5162 = 0.0D;
		this.field5160 = 0.0D;
		this.field5164 = 0.0D;
		this.field5165 = 0.0D;
		this.field5163 = 0.0D;
		this.field5166 = var3;
		this.field5167 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5162 = (double)var4;
			this.field5160 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = -1.0D * (double)(var4 - var7) / (double)(var5 - var8);
			this.field5162 = (var17 + (var11 * var19 - var15 * var21) - var13) / (var19 - var21);
			this.field5160 = (this.field5162 - var11) * var19 + var13;
			this.field5164 = Math.sqrt(Math.pow(this.field5162 - (double)var1, 2.0D) + Math.pow(this.field5160 - (double)var2, 2.0D));
			this.field5165 = Math.atan2((double)var2 - this.field5160, (double)var1 - this.field5162);
			double var23 = Math.atan2((double)var8 - this.field5160, (double)var7 - this.field5162);
			this.field5163 = Math.atan2((double)var5 - this.field5160, (double)var4 - this.field5162);
			boolean var25 = this.field5165 <= var23 && var23 <= this.field5163 || this.field5163 <= var23 && var23 <= this.field5165;
			if (!var25) {
				this.field5163 += (double)(this.field5165 - this.field5163 > 0.0D ? 2 : -2) * 3.141592653589793D;
			}

		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "220008079"
	)
	public int vmethod9311() {
		double var1 = this.method9323();
		double var3 = var1 * (this.field5163 - this.field5165) + this.field5165;
		return (int)Math.round(this.field5162 + this.field5164 * Math.cos(var3));
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "77"
	)
	public int vmethod9314() {
		double var1 = this.method9323();
		double var3 = this.field5165 + (this.field5163 - this.field5165) * var1;
		return (int)Math.round(this.field5160 + this.field5164 * Math.sin(var3));
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "33"
	)
	public int vmethod9313() {
		double var1 = this.method9323();
		return (int)Math.round((double)this.field5166 + var1 * (double)(this.field5167 - this.field5166));
	}
}
