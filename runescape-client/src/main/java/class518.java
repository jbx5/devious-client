import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tr")
public class class518 extends class521 {
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 1179025705
	)
	int field5212;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -98146715
	)
	int field5211;
	@ObfuscatedName("ak")
	double field5213;
	@ObfuscatedName("aj")
	double field5214;
	@ObfuscatedName("ai")
	double field5215;
	@ObfuscatedName("ay")
	double field5216;
	@ObfuscatedName("as")
	double field5217;

	public class518(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		super(var9, var10);
		this.field5212 = 0;
		this.field5211 = 0;
		this.field5213 = 0.0D;
		this.field5214 = 0.0D;
		this.field5215 = 0.0D;
		this.field5216 = 0.0D;
		this.field5217 = 0.0D;
		this.field5212 = var3;
		this.field5211 = var6;
		if ((var5 - var8) * (var7 - var1) == (var4 - var7) * (var8 - var2)) {
			this.field5213 = (double)var4;
			this.field5214 = (double)var5;
		} else {
			double var11 = (double)((float)(var7 + var1)) / 2.0D;
			double var13 = (double)((float)(var8 + var2)) / 2.0D;
			double var15 = (double)((float)(var4 + var7)) / 2.0D;
			double var17 = (double)((float)(var5 + var8)) / 2.0D;
			double var19 = -1.0D * (double)(var7 - var1) / (double)(var8 - var2);
			double var21 = -1.0D * (double)(var4 - var7) / (double)(var5 - var8);
			this.field5213 = (var17 + (var11 * var19 - var21 * var15) - var13) / (var19 - var21);
			this.field5214 = var19 * (this.field5213 - var11) + var13;
			this.field5215 = Math.sqrt(Math.pow(this.field5213 - (double)var1, 2.0D) + Math.pow(this.field5214 - (double)var2, 2.0D));
			this.field5216 = Math.atan2((double)var2 - this.field5214, (double)var1 - this.field5213);
			double var23 = Math.atan2((double)var8 - this.field5214, (double)var7 - this.field5213);
			this.field5217 = Math.atan2((double)var5 - this.field5214, (double)var4 - this.field5213);
			boolean var25 = this.field5216 <= var23 && var23 <= this.field5217 || this.field5217 <= var23 && var23 <= this.field5216;
			if (!var25) {
				this.field5217 += 3.141592653589793D * (double)(this.field5216 - this.field5217 > 0.0D ? 2 : -2);
			}

		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1457830566"
	)
	public int vmethod9495() {
		double var1 = this.method9504();
		double var3 = (this.field5217 - this.field5216) * var1 + this.field5216;
		return (int)Math.round(this.field5213 + this.field5215 * Math.cos(var3));
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "72"
	)
	public int vmethod9498() {
		double var1 = this.method9504();
		double var3 = this.field5216 + var1 * (this.field5217 - this.field5216);
		return (int)Math.round(this.field5214 + this.field5215 * Math.sin(var3));
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2006354984"
	)
	public int vmethod9496() {
		double var1 = this.method9504();
		return (int)Math.round(var1 * (double)(this.field5211 - this.field5212) + (double)this.field5212);
	}
}
